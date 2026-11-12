package com.weibo.ssosdk.oaid;

import android.app.Application;
import android.content.Context;
import com.weibo.ssosdk.oaid.impl.OAIDFactory;

/* JADX INFO: loaded from: classes18.dex */
public final class DeviceOAID implements IGetter {
    public static IOAID c;
    private Application a;
    private String b;

    public static class b {
        public static final DeviceOAID a = new DeviceOAID();

        private b() {
        }
    }

    public static synchronized boolean IsSupportedOAID() {
        return c != null;
    }

    public static String getOAID() {
        String str = b.a.b;
        return str == null ? "" : str;
    }

    @Override // com.weibo.ssosdk.oaid.IGetter
    public final void onOAIDGetComplete(String str) {
        this.b = str;
    }

    @Override // com.weibo.ssosdk.oaid.IGetter
    public final void onOAIDGetError(Exception exc) {
    }

    private DeviceOAID() {
    }

    public static void getOAID(Context context, IGetter iGetter) {
        try {
            IOAID ioaidCreate = OAIDFactory.create(context);
            c = ioaidCreate;
            if (ioaidCreate == null) {
                return;
            }
            ioaidCreate.doGet(iGetter);
        } catch (Exception unused) {
        }
    }
}
