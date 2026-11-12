package com.xiaomi.hm.health.bodyfat.utils;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes19.dex */
@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.LOCAL_VARIABLE})
@Documented
@Retention(RetentionPolicy.SOURCE)
public @interface GuestItemType {
    public static final int TYPE_BIRTH = 3;
    public static final int TYPE_GENDER = 1;
    public static final int TYPE_HEIGHT = 2;
    public static final int TYPE_MEASURE_MODE = 4;
}
