package com.xiaomi.hm.health.training.utils;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.api.entity.ErrorCode;

/* JADX INFO: loaded from: classes22.dex */
public class UiErrorMsgParser {
    @NonNull
    public static String parseMessage(@Nullable Context context, @Nullable String str, @Nullable String str2) {
        if (context == null || str == null || !str.equals(ErrorCode.NETWORK_NOT_CONNECTED)) {
            return str2 != null ? str2 : "";
        }
        return context.getString(R.string.net_not_work);
    }
}
