package cn.hutool.core.lang;

import cn.hutool.core.lang.mutable.MutableObj;

/* JADX INFO: loaded from: classes.dex */
public final class Holder<T> extends MutableObj<T> {
    private static final long serialVersionUID = -3119568580130118011L;

    public Holder() {
    }

    public static <T> Holder<T> of(T t) throws NullPointerException {
        if (t != null) {
            return new Holder<>(t);
        }
        throw new NullPointerException("Holder can not hold a null value!");
    }

    public Holder(T t) {
        super(t);
    }
}
