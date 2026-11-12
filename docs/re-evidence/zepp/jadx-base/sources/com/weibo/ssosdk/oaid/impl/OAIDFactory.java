package com.weibo.ssosdk.oaid.impl;

import android.app.Application;
import android.content.Context;
import com.weibo.ssosdk.oaid.IOAID;
import com.weibo.ssosdk.oaid.OAIDRom;

/* JADX INFO: loaded from: classes18.dex */
public final class OAIDFactory {
    private static volatile IOAID a;

    private OAIDFactory() {
    }

    private static IOAID a(Context context) {
        if (OAIDRom.isLenovo() || OAIDRom.isMotolora()) {
            return new c(context);
        }
        if (OAIDRom.isMeizu()) {
            return new d(context);
        }
        if (OAIDRom.isNubia()) {
            return new e(context);
        }
        if (OAIDRom.isXiaomi() || OAIDRom.isMiui() || OAIDRom.isBlackShark()) {
            return new i(context);
        }
        if (OAIDRom.isSamsung()) {
            return new g(context);
        }
        if (OAIDRom.isVivo()) {
            return new h(context);
        }
        if (OAIDRom.isASUS()) {
            return new a(context);
        }
        if (OAIDRom.isHuawei() || OAIDRom.isEmui()) {
            return new b(context);
        }
        if (OAIDRom.isOppo() || OAIDRom.isOnePlus()) {
            return new f(context);
        }
        return null;
    }

    public static synchronized IOAID create(Context context) {
        if (!(context instanceof Application)) {
            context = context.getApplicationContext();
        }
        if (a != null) {
            return a;
        }
        IOAID ioaidA = a(context);
        a = ioaidA;
        if (ioaidA == null || !a.supported()) {
            return null;
        }
        return a;
    }

    public static synchronized boolean isSupported() {
        try {
            return a != null && a.supported();
        } catch (Exception unused) {
            return false;
        }
    }
}
