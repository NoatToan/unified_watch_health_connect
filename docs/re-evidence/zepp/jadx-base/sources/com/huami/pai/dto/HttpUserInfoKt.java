package com.huami.pai.dto;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u001a\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\"\u0016\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"\u0016\u0010\u0006\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0016\u0010\b\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007\"\u0016\u0010\t\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"", "age", "getDefaultMaxHr", "", "DEFAULT_CREATED_TIME", "J", "DEFAULT_USER_GENDER", LogUtil.I, "DEFAULT_USER_AGE", "DEFAULT_REST_HR", "lib_release"}, k = 2, mv = {1, 5, 1})
public final class HttpUserInfoKt {
    public static final long DEFAULT_CREATED_TIME = 946656000000L;
    public static final int DEFAULT_REST_HR = 80;
    public static final int DEFAULT_USER_AGE = 30;
    public static final int DEFAULT_USER_GENDER = 0;

    public static final int getDefaultMaxHr(int i) {
        return (int) (((double) 211) - (((double) i) * 0.64d));
    }
}
