package com.weibo.ssosdk.oaid.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import com.weibo.ssosdk.oaid.IGetter;
import com.weibo.ssosdk.oaid.IOAID;
import com.weibo.ssosdk.oaid.OAIDException;

/* JADX INFO: loaded from: classes18.dex */
class i implements IOAID {
    private final Context a;
    private Class<?> b;
    private Object c;

    @SuppressLint({"PrivateApi"})
    public i(Context context) {
        this.a = context;
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            this.b = cls;
            this.c = cls.newInstance();
        } catch (Exception unused) {
        }
    }

    private String a() {
        return (String) this.b.getMethod("getOAID", Context.class).invoke(this.c, this.a);
    }

    @Override // com.weibo.ssosdk.oaid.IOAID
    public void doGet(IGetter iGetter) {
        if (this.b == null || this.c == null) {
            iGetter.onOAIDGetError(new OAIDException("Xiaomi IdProvider not exists"));
            return;
        }
        try {
            String strA = a();
            if (strA == null || strA.length() == 0) {
                throw new OAIDException("OAID query failed");
            }
            iGetter.onOAIDGetComplete(strA);
        } catch (Exception e) {
            iGetter.onOAIDGetError(e);
        }
    }

    @Override // com.weibo.ssosdk.oaid.IOAID
    public boolean supported() {
        return this.c != null;
    }
}
