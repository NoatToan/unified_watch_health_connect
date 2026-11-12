package com.sensetime.senseid.sdk.liveness.silent.type;

import androidx.annotation.Keep;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes18.dex */
@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.LOCAL_VARIABLE})
@Keep
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface FaceDistance {
    public static final int NORMAL = 0;
    public static final int TOO_CLOSE = -1;
    public static final int TOO_FAR = 1;
}
