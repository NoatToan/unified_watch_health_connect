package com.huawei.hms.hatool;

import com.huawei.openalliance.ad.constant.Constants;
import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: loaded from: classes34.dex */
public class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f13438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f13439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f13440c;
    private String d;
    private long e;

    public void a() {
        v.c("StreamEventHandler", "Begin to handle stream events...");
        b1 b1Var = new b1();
        b1Var.b(this.f13440c);
        b1Var.d(this.f13439b);
        b1Var.a(this.d);
        b1Var.c(String.valueOf(this.e));
        if ("oper".equals(this.f13439b) && z.i(this.f13438a, "oper")) {
            p0 p0VarA = y.a().a(this.f13438a, this.e);
            String strA = p0VarA.a();
            boolean zB = p0VarA.b();
            b1Var.f(strA);
            b1Var.e(String.valueOf(Boolean.valueOf(zB)));
        }
        String strReplace = UUID.randomUUID().toString().replace(Constants.LINK, "");
        ArrayList arrayList = new ArrayList();
        arrayList.add(b1Var);
        new l0(this.f13438a, this.f13439b, q0.g(), arrayList, strReplace).a();
    }

    public i1(String str, String str2, String str3, String str4, long j) {
        this.f13438a = str;
        this.f13439b = str2;
        this.f13440c = str3;
        this.d = str4;
        this.e = j;
    }
}
