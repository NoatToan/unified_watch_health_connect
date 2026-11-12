package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import defpackage.yj4;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes.dex */
public class AtomicLongArrayConverter extends AbstractConverter<AtomicLongArray> {
    private static final long serialVersionUID = 1;

    @Override // cn.hutool.core.convert.AbstractConverter
    public AtomicLongArray convertInternal(Object obj) {
        return new AtomicLongArray((long[]) yj4.a(long[].class, obj));
    }
}
