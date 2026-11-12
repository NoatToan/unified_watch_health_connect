package com.huawei.watchface.utils.analytice.interf;

import com.huawei.watchface.d0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@Inherited
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ReportPolicy {
    boolean collectResponse() default false;

    d0[] collectedFields() default {};

    d0[] collectedHeaders() default {};

    d0[] collectedParams() default {};

    String[] excludedCollectedHeaders() default {"userToken", "usertoken", "reservedInfor", "licenseReq", "authCode", "deviceId", "userRefreshToken", "access_token", "sign", "x-sign", "deviceid", "phoneId", "publicKey", "x-usertoken"};

    String[] excludedParams() default {"userToken", "reservedInfor", "licenseReq", "authCode", "deviceId", "userRefreshToken", "access_token", "sign", "phoneId", "publicKey", "watchDeviceInfo-deviceId", "signature", "accessKey"};

    String[] resultCodeKeys() default {"resultCode", "resultcode", "retCode", "errorCode"};

    String[] resultInfoKeys() default {"resultInfo", "resultinfo", "retDesc"};
}
