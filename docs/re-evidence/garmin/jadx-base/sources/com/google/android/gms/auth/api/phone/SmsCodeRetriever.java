package com.google.android.gms.auth.api.phone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.p001authapiphone.zzl;
import com.google.android.gms.internal.p001authapiphone.zzt;

/* JADX INFO: loaded from: classes14.dex */
public final class SmsCodeRetriever {
    public static final String EXTRA_SMS_CODE = "com.google.android.gms.auth.api.phone.EXTRA_SMS_CODE";
    public static final String EXTRA_SMS_CODE_LINE = "com.google.android.gms.auth.api.phone.EXTRA_SMS_CODE_LINE";
    public static final String EXTRA_STATUS = "com.google.android.gms.auth.api.phone.EXTRA_STATUS";
    public static final String SMS_CODE_RETRIEVED_ACTION = "com.google.android.gms.auth.api.phone.SMS_CODE_RETRIEVED";

    private SmsCodeRetriever() {
    }

    public static SmsCodeAutofillClient getAutofillClient(Context context) {
        return new zzl(context);
    }

    public static SmsCodeBrowserClient getBrowserClient(Context context) {
        return new zzt(context);
    }

    public static SmsCodeAutofillClient getAutofillClient(Activity activity) {
        return new zzl(activity);
    }

    public static SmsCodeBrowserClient getBrowserClient(Activity activity) {
        return new zzt(activity);
    }
}
