package com.huawei.wisesecurity.ucs_credential;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hidatamanager.util.Const;
import com.huawei.wisesecurity.ucs.credential.Credential;
import defpackage.yqj;
import defpackage.yqp;
import defpackage.yqx;
import defpackage.yra;
import defpackage.yrq;
import defpackage.yrv;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes20.dex */
public abstract class k {
    public static byte[] a(Credential credential) throws yqj {
        String kekString = credential.getKekString();
        Map<String, byte[]> map = yrq.d;
        if (TextUtils.isEmpty(kekString)) {
            throw yra.e("KekStore", "getKek param is null.", new Object[0], Const.RawDataType.HEALTH_EVENT_RECORD, "getKek param is null.");
        }
        if (((ConcurrentHashMap) yrq.d).containsKey(kekString)) {
            return (byte[]) ((ConcurrentHashMap) yrq.d).get(kekString);
        }
        throw new yqj(2001L, "kek is empty");
    }

    public abstract byte[] a(Credential credential, Context context) throws yqj;

    public void b(Credential credential, Context context) throws yqj {
        String kekString = credential.getKekString();
        if (((ConcurrentHashMap) yrq.d).containsKey(kekString)) {
            return;
        }
        byte[] bArrA = a(credential, context);
        if (TextUtils.isEmpty(kekString) || bArrA == null) {
            throw yra.e("KekStore", "putKek param is null.", new Object[0], Const.RawDataType.HEALTH_EVENT_RECORD, "putKek param is null.");
        }
        ((ConcurrentHashMap) yrq.d).put(kekString, bArrA);
    }

    public static k b(Credential credential) throws yqj {
        int kekVersion = credential.getKekVersion();
        if (kekVersion == 3) {
            return new yqp();
        }
        return (kekVersion == 6 || kekVersion == 7) ? new yrv() : new yqx();
    }
}
