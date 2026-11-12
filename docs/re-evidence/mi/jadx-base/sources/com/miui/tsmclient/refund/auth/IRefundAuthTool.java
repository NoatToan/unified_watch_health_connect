package com.miui.tsmclient.refund.auth;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public interface IRefundAuthTool {
    void auth(Activity activity, String str, Bundle bundle);

    Bundle parseAuthResult(Context context, Bundle bundle);

    void release();
}
