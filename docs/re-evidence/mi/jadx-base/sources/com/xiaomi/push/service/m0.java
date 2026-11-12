package com.xiaomi.push.service;

import android.text.TextUtils;
import com.xiaomi.push.ib;
import com.xiaomi.push.io;
import com.xiaomi.push.ix;
import com.xiaomi.push.ja;
import defpackage.jfs;
import defpackage.x9s;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class m0 extends XMPushService.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14244b;
    public final /* synthetic */ List c;
    public final /* synthetic */ String d;
    public final /* synthetic */ l0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(l0 l0Var, int i, String str, List list, String str2) {
        super(i);
        this.e = l0Var;
        this.f14244b = str;
        this.c = list;
        this.d = str2;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "Send tiny data.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public void b() {
        String strD = this.e.d(this.f14244b);
        ArrayList<ja> arrayListC = jfs.c(this.c, this.f14244b, strD, 32768);
        if (arrayListC == null) {
            x9s.D("TinyData LongConnUploader.upload Get a null XmPushActionNotification list when TinyDataHelper.pack() in XMPushService.");
            return;
        }
        for (ja jaVar : arrayListC) {
            jaVar.a("uploadWay", "longXMPushService");
            ix ixVarB = i.b(this.f14244b, strD, jaVar, ib.Notification);
            if (!TextUtils.isEmpty(this.d) && !TextUtils.equals(this.f14244b, this.d)) {
                if (ixVarB.m747a() == null) {
                    io ioVar = new io();
                    ioVar.a("-1");
                    ixVarB.a(ioVar);
                }
                ixVarB.m747a().b("ext_traffic_source_pkg", this.d);
            }
            this.e.f14238a.a(this.f14244b, com.xiaomi.push.i.e(ixVarB), true);
        }
    }
}
