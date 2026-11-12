package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import defpackage.yj4;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes.dex */
public class AtomicIntegerArrayConverter extends AbstractConverter<AtomicIntegerArray> {
    private static final long serialVersionUID = 1;

    @Override // cn.hutool.core.convert.AbstractConverter
    public AtomicIntegerArray convertInternal(Object obj) {
        return new AtomicIntegerArray((int[]) yj4.a(int[].class, obj));
    }
}
