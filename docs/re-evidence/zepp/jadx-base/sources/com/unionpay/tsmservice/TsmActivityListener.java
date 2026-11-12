package com.unionpay.tsmservice;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes18.dex */
public class TsmActivityListener extends ITsmActivityCallback.Stub {
    private Context c;

    public TsmActivityListener(Context context) {
        this.c = context;
    }

    @Override // com.unionpay.tsmservice.ITsmActivityCallback
    public void StartActivity(String str, String str2, Bundle bundle) throws RemoteException {
        ComponentName componentName = new ComponentName(str, str2);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        intent.setComponent(componentName);
        this.c.startActivity(intent);
    }
}
