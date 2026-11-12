package com.huami.phone_call.sms;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H&¨\u0006\n"}, d2 = {"Lcom/huami/phone_call/sms/PhoneCallSmsReplyFeature;", "", "Landroid/content/Context;", "getContext", "", "isFeatureEnable", "isEnable", "enable", "", "saveEnable", "phone_call_sms_release"}, k = 1, mv = {1, 5, 1})
public interface PhoneCallSmsReplyFeature {
    @NotNull
    Context getContext();

    boolean isEnable();

    boolean isFeatureEnable();

    void saveEnable(boolean enable);
}
