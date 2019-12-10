package com.atguigu.netty.codec2;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author ming
 * @version 1.0
 * @date 2019/12/6 2:46 下午
 */
@Getter
@AllArgsConstructor
public enum PersonType {
    Student(0),
    Worker(1);
    private int date;

}
