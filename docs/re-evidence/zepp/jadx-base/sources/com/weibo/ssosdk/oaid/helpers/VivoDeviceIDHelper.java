package com.weibo.ssosdk.oaid.helpers;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.alipay.sdk.m.p0.c;
import com.weibo.ssosdk.AppUtils;

/* JADX INFO: loaded from: classes18.dex */
public class VivoDeviceIDHelper {
    private Context a;
    private HandlerThread b;
    private Handler c;
    private boolean d = false;
    public String e = null;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 11) {
                VivoDeviceIDHelper.this.c(message.getData().getInt("type"), message.getData().getString("appid"));
            }
        }
    }

    public VivoDeviceIDHelper(Context context) {
        this.a = context;
    }

    private void b() {
        HandlerThread handlerThread = new HandlerThread("SqlWorkThread");
        this.b = handlerThread;
        handlerThread.start();
        this.c = new a(this.b.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    public String c(int i, String str) {
        Uri uri;
        Uri uri2;
        Cursor cursorQuery;
        String string = null;
        if (i == 0) {
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID");
        } else {
            if (i != 1) {
                if (i != 2) {
                    uri2 = null;
                } else {
                    uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/AAID_".concat(String.valueOf(str)));
                }
                cursorQuery = this.a.getContentResolver().query(uri2, null, null, null, null);
                if (cursorQuery != null) {
                    string = cursorQuery.moveToNext() ? cursorQuery.getString(cursorQuery.getColumnIndex("value")) : null;
                    cursorQuery.close();
                }
                return string;
            }
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/VAID_".concat(String.valueOf(str)));
        }
        uri2 = uri;
        cursorQuery = this.a.getContentResolver().query(uri2, null, null, null, null);
        if (cursorQuery != null) {
            if (cursorQuery.moveToNext()) {
            }
            cursorQuery.close();
        }
        return string;
    }

    private boolean d() {
        boolean zEquals = e(c.c, "0").equals("1");
        this.d = zEquals;
        return zEquals;
    }

    private String e(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "unknown");
        } catch (Exception e) {
            e.printStackTrace();
            return str2;
        }
    }

    private void f(int i, String str) {
        Message messageObtainMessage = this.c.obtainMessage();
        messageObtainMessage.what = 11;
        Bundle bundle = new Bundle();
        bundle.putInt("type", 0);
        if (i == 1 || i == 2) {
            bundle.putString("appid", str);
        }
        messageObtainMessage.setData(bundle);
        this.c.sendMessage(messageObtainMessage);
    }

    public String getOaid() {
        Cursor cursorQuery = this.a.getContentResolver().query(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), null, null, null, null);
        String string = "";
        if (cursorQuery != null) {
            if (cursorQuery.moveToNext()) {
                string = cursorQuery.getString(cursorQuery.getColumnIndex("value"));
                AppUtils.saveOadi(this.a, "VIVO", "oaid", string);
            }
            cursorQuery.close();
        }
        return string;
    }
}
