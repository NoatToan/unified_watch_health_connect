package com.xiaomi.push;

import android.text.TextUtils;
import com.xiaomi.passport.utils.LoginPreferenceConfig;
import defpackage.mss;

/* JADX INFO: loaded from: classes11.dex */
public enum fm {
    COMMAND_REGISTER(LoginPreferenceConfig.TYPE_REGISTER),
    COMMAND_UNREGISTER("unregister"),
    COMMAND_SET_ALIAS("set-alias"),
    COMMAND_UNSET_ALIAS("unset-alias"),
    COMMAND_SET_ACCOUNT("set-account"),
    COMMAND_UNSET_ACCOUNT("unset-account"),
    COMMAND_SUBSCRIBE_TOPIC("subscribe-topic"),
    COMMAND_UNSUBSCRIBE_TOPIC("unsubscibe-topic"),
    COMMAND_SET_ACCEPT_TIME("accept-time"),
    COMMAND_CHK_VDEVID("check-vdeviceid");


    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public final String f62a;

    fm(String str) {
        this.f62a = str;
    }

    public static int a(String str) {
        int iB = -1;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        for (fm fmVar : values()) {
            if (fmVar.f62a.equals(str)) {
                iB = mss.b(fmVar);
            }
        }
        return iB;
    }
}
