package com.miui.tsmclient.pay;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.miui.tsmclient.entity.CardInfo;

/* JADX INFO: loaded from: classes6.dex */
public interface IPayTool {
    int getPayRequestCode();

    boolean isSupport(Context context);

    int parsePayResult(Context context, CardInfo cardInfo, Bundle bundle);

    int pay(Activity activity, String str, Bundle bundle);
}
