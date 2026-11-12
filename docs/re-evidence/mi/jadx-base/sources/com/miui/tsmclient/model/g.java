package com.miui.tsmclient.model;

import android.text.TextUtils;
import com.miui.tsmclient.entity.CardInfo;
import defpackage.a1t;
import defpackage.has;
import defpackage.hns;
import defpackage.ies;
import defpackage.jas;
import defpackage.kas;
import defpackage.las;
import defpackage.s3s;
import defpackage.xus;

/* JADX INFO: loaded from: classes6.dex */
public class g {
    public static j a(String str) {
        if (CardInfo.SPTC_TYPE_SET.contains(str)) {
            return new jas(str);
        }
        if (TextUtils.equals(str, CardInfo.CARD_TYPE_BANKCARD)) {
            return new ies();
        }
        if (TextUtils.equals(str, CardInfo.CARD_TYPE_VSIM)) {
            return new com.miui.tsmclient.model.mitsm.b();
        }
        if (TextUtils.equals(str, CardInfo.CARD_TYPE_MIFARE)) {
            return new las();
        }
        if (TextUtils.equals(str, CardInfo.CARD_TYPE_EID)) {
            return new kas();
        }
        if (TextUtils.equals(str, CardInfo.CARD_TYPE_QRBANKCARD)) {
            return new hns();
        }
        if (TextUtils.equals(str, "DCEPCARD")) {
            return new has();
        }
        if (TextUtils.equals(str, CardInfo.CARD_TYPE_DIGITAL_KEY)) {
            return new xus();
        }
        if (TextUtils.equals(str, CardInfo.CARD_TYPE_TRADITIONALCARKEYCARD)) {
            return new p();
        }
        if (TextUtils.equals(str, CardInfo.CARD_TYPE_BLE_CAR)) {
            return new s3s();
        }
        return TextUtils.equals(str, CardInfo.CARD_TYPE_ICCOA_DIGITAL_KEY) ? new a1t() : new n(str);
    }
}
