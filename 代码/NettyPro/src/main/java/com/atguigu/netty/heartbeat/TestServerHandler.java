package com.atguigu.netty.heartbeat;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.timeout.IdleStateEvent;

/**
 * @author ming
 * @version 1.0
 * @date 2019/12/4 3:58 下午
 */
public class TestServerHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if(evt instanceof IdleStateEvent){
            IdleStateEvent idleStateEvent= (IdleStateEvent) evt;
            String event=null;
            switch (idleStateEvent.state()) {
                case READER_IDLE:
                    event="读空";
                    break;
                case WRITER_IDLE:
                    event="写空";
                    break;
                case ALL_IDLE:
                    event="读写空";
                    break;
            }
            System.out.println(ctx.channel().remoteAddress()+"超时了"+event);
        }
    }
}
