package com.xiaomi.xms.wearable.utils;

import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.xms.wearable.ui.appshop.model.GetWeichatLicense;
import com.xiaomi.xms.wearable.ui.appshop.model.WeichatLicense;
import defpackage.h4b;
import defpackage.jcp;
import defpackage.lcp;
import defpackage.m5f;
import defpackage.n5f;
import defpackage.s7r;
import defpackage.xg1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0005\u0010\t\u001a\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "sendWeicharLicenseError2Device", "()V", "Lcom/xiaomi/xms/wearable/ui/appshop/model/GetWeichatLicense;", "getWeichatLicense", "sendWeicharLicense2Device", "(Lcom/xiaomi/xms/wearable/ui/appshop/model/GetWeichatLicense;)V", "Ljcp;", "thirdpartyApp", "(Ljcp;)V", "", "json", "marketSend", "(Ljava/lang/String;)V", "xmswearable_release"}, k = 2, mv = {2, 0, 0})
public final class DeviceContactUtilsKt {
    public static final void marketSend(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        s7r s7rVar = new s7r();
        s7rVar.e = 15;
        s7rVar.f = 8;
        m5f m5fVar = new m5f();
        m5fVar.s(new n5f());
        s7rVar.W(m5fVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, null, 0, 14, null);
    }

    public static final void sendWeicharLicense2Device(@NotNull GetWeichatLicense getWeichatLicense) {
        Intrinsics.checkNotNullParameter(getWeichatLicense, "getWeichatLicense");
        jcp jcpVar = new jcp();
        jcpVar.J(new lcp());
        lcp lcpVarX = jcpVar.x();
        lcpVarX.c = getWeichatLicense.getCode();
        WeichatLicense result = getWeichatLicense.getResult();
        lcpVarX.f = result.getSignature();
        lcpVarX.e = result.getProduct_id();
        lcpVarX.d = result.getKey_version();
        xg1.d("getWeichatLicense:" + h4b.c(getWeichatLicense) + "  signature:" + jcpVar.x().f);
        sendWeicharLicense2Device(jcpVar);
    }

    public static final void sendWeicharLicenseError2Device() {
        jcp jcpVar = new jcp();
        jcpVar.J(new lcp());
        jcpVar.x().c = -1;
        sendWeicharLicense2Device(jcpVar);
    }

    private static final void sendWeicharLicense2Device(jcp jcpVar) {
        s7r s7rVar = new s7r();
        s7rVar.e = 20;
        s7rVar.f = 11;
        s7rVar.d0(jcpVar);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, null, 0, 14, null);
    }
}
