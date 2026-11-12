package com.huawei.watchface;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes3.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface d0 {
    String name();

    boolean needAnony() default false;
}
