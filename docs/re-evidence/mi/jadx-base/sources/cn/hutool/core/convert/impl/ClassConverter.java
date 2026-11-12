package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import defpackage.yz3;

/* JADX INFO: loaded from: classes.dex */
public class ClassConverter extends AbstractConverter<Class<?>> {
    private static final long serialVersionUID = 1;
    private final boolean isInitialized;

    public ClassConverter() {
        this(true);
    }

    public ClassConverter(boolean z) {
        this.isInitialized = z;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // cn.hutool.core.convert.AbstractConverter
    public Class<?> convertInternal(Object obj) {
        return yz3.g(convertToStr(obj), this.isInitialized);
    }
}
