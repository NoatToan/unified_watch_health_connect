package com.xiaomi.fit.data.common.data.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes7.dex */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.SOURCE)
public @interface SportState {
    public static final int finish = 4;
    public static final int idle = 0;
    public static final int pause = 2;
    public static final int restart = 3;
    public static final int start = 1;
}
