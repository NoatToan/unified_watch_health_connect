package com.huawei.openalliance.ad.inter.data;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.metadata.ApkInfo;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.beans.metadata.Monitor;
import com.huawei.openalliance.ad.beans.metadata.TextState;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.db.bean.EncryptionField;
import com.huawei.openalliance.ad.utils.cw;
import com.huawei.openalliance.ad.utils.dj;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes12.dex */
public class AdLandingPageData implements Serializable {
    private String A;
    private int C;
    private int D;
    private String E;
    private String F;
    private String G;
    private String H;
    private String I;
    private String J;
    private List<Integer> K;
    private String M;
    private String N;
    private String O;
    private long P;
    private boolean Q;
    private String R;
    private int S;
    private int T;
    private String U;
    private String V;
    private int W;
    private String X;
    private int Y;
    private String Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private EncryptionField<String> f19159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f19160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19161c;
    private String d;
    private String e;
    private String f;
    private ShareInfo g;
    private AppInfo h;
    private EncryptionField<List<Monitor>> i;
    private boolean j;
    private byte[] k;
    private String l;
    private String m;
    private List<TextState> n;
    private List<String> o;
    private String p;
    private String q;
    private String r;
    private String s;
    private EncryptionField<String> t;
    private String x;
    private String y;
    private String z;
    private boolean u = false;
    private boolean v = false;
    private boolean w = true;
    private int B = 0;
    private boolean L = true;
    private long aa = 500;
    private int ab = 50;

    public boolean l() {
        return true;
    }

    public void z(String str) {
        this.R = str;
    }

    public ContentRecord z() {
        ContentRecord contentRecord = new ContentRecord();
        contentRecord.d(getSlotId());
        contentRecord.f(i());
        contentRecord.L(K());
        contentRecord.t(j());
        contentRecord.e(getContentId());
        contentRecord.ag(L());
        contentRecord.b(getAdType());
        contentRecord.a(a());
        contentRecord.k(getLandingUrl());
        contentRecord.c(c());
        contentRecord.b(d());
        contentRecord.s(f());
        contentRecord.g(h());
        contentRecord.c(k());
        contentRecord.a(l());
        contentRecord.x(n());
        contentRecord.y(p());
        contentRecord.ad(q());
        contentRecord.b(u());
        contentRecord.o(v());
        contentRecord.e(A());
        contentRecord.G(C());
        contentRecord.H(D());
        contentRecord.J(E());
        contentRecord.h(F());
        contentRecord.d(G());
        contentRecord.m(H());
        contentRecord.t(I());
        contentRecord.s(J());
        contentRecord.R(b());
        contentRecord.i(s());
        contentRecord.e(x());
        contentRecord.T(w());
        contentRecord.N(y());
        if (getAppInfo() != null && !TextUtils.isEmpty(getAppInfo().getUniqueId())) {
            contentRecord.v(getAppInfo().getUniqueId());
        }
        contentRecord.a(Integer.valueOf(o()));
        return contentRecord;
    }

    public void y(String str) {
        this.O = str;
    }

    public String y() {
        return this.X;
    }

    public boolean x() {
        return this.W == 1;
    }

    public void x(String str) {
        this.N = str;
    }

    public void w(String str) {
        this.M = str;
    }

    public String w() {
        return this.V;
    }

    public void v(String str) {
        this.X = str;
    }

    public int v() {
        return this.B;
    }

    public void u(String str) {
        this.V = str;
    }

    public String u() {
        return this.J;
    }

    public void t(String str) {
        this.J = str;
    }

    public int t() {
        return this.D;
    }

    public void s(String str) {
        this.H = str;
    }

    public int s() {
        return this.C;
    }

    public void r(String str) {
        this.I = str;
    }

    public String r() {
        return this.y;
    }

    public void q(String str) {
        this.G = str;
    }

    public String q() {
        return this.A;
    }

    public void p(String str) {
        this.F = str;
    }

    public String p() {
        return this.z;
    }

    public void o(String str) {
        this.E = str;
    }

    public int o() {
        return this.Y;
    }

    public void n(String str) {
        this.y = str;
    }

    public String n() {
        return this.x;
    }

    public boolean m() {
        return this.w;
    }

    public void m(String str) {
        this.A = str;
    }

    public void l(String str) {
        this.z = str;
    }

    public void k(String str) {
        this.x = str;
    }

    public EncryptionField<String> k() {
        return this.t;
    }

    public void j(String str) {
        this.s = str;
    }

    public String j() {
        return this.r;
    }

    public boolean isShowPageTitle() {
        return this.j;
    }

    public void i(String str) {
        this.r = str;
    }

    public String i() {
        return this.q;
    }

    public void h(String str) {
        this.q = str;
    }

    public List<String> h() {
        return this.o;
    }

    public String getUniqueId() {
        return this.s;
    }

    public String getSlotId() {
        return this.p;
    }

    public ShareInfo getShareInfo() {
        return this.g;
    }

    public String getLandingUrl() {
        return this.f19160b;
    }

    public String getContentId() {
        return this.e;
    }

    public AppInfo getAppInfo() {
        return this.h;
    }

    public int getAdType() {
        return this.f19161c;
    }

    public void g(String str) {
        this.p = str;
    }

    public List<TextState> g() {
        return this.n;
    }

    public void f(boolean z) {
        this.Q = z;
    }

    public void f(String str) {
        this.e = str;
    }

    public String f() {
        return this.m;
    }

    public void e(boolean z) {
        this.L = z;
    }

    public void e(String str) {
        this.m = str;
    }

    public void e(int i) {
        this.T = i;
    }

    public String e() {
        return this.l;
    }

    public void d(boolean z) {
        this.W = z ? 1 : 0;
    }

    public void d(String str) {
        this.l = str;
    }

    public void d(int i) {
        this.S = i;
    }

    public EncryptionField<List<Monitor>> d() {
        return this.i;
    }

    public void c(boolean z) {
        this.v = z;
    }

    public void c(List<Integer> list) {
        this.K = list;
    }

    public void c(String str) {
        this.d = str;
    }

    public void c(EncryptionField<String> encryptionField) {
        this.t = encryptionField;
    }

    public void c(int i) {
        this.B = i;
    }

    public String c() {
        return this.d;
    }

    public void b(boolean z) {
        this.u = z;
    }

    public void b(List<String> list) {
        this.o = list;
    }

    public void b(String str) {
        this.f19160b = str;
    }

    public void b(EncryptionField<List<Monitor>> encryptionField) {
        this.i = encryptionField;
    }

    public void b(int i) {
        this.Y = i;
    }

    public String b() {
        return this.U;
    }

    public void a(boolean z) {
        this.j = z;
    }

    public void a(List<TextState> list) {
        this.n = list;
    }

    public void a(String str) {
        this.U = str;
    }

    public void a(ShareInfo shareInfo) {
        this.g = shareInfo;
    }

    public void a(AppInfo appInfo) {
        this.h = appInfo;
    }

    public void a(EncryptionField<String> encryptionField) {
        this.f19159a = encryptionField;
    }

    public void a(long j) {
        this.P = j;
    }

    public void a(int i) {
        this.f19161c = i;
    }

    public EncryptionField<String> a() {
        return this.f19159a;
    }

    public String L() {
        return this.f;
    }

    public String K() {
        return this.Z;
    }

    public int J() {
        return this.T;
    }

    public int I() {
        return this.S;
    }

    public String H() {
        return this.R;
    }

    public boolean G() {
        return this.Q;
    }

    public long F() {
        return this.P;
    }

    public String E() {
        return this.O;
    }

    public String D() {
        return this.N;
    }

    public String C() {
        return this.M;
    }

    public boolean B() {
        return this.L;
    }

    public void B(String str) {
        this.f = str;
    }

    public void A(String str) {
        this.Z = str;
    }

    public List<Integer> A() {
        return this.K;
    }

    static class a implements Callable<byte[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f19162a;

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public byte[] call() {
            return cw.b(this.f19162a);
        }

        a(Context context) {
            this.f19162a = context.getApplicationContext();
        }
    }

    private EncryptionField a(EncryptionField encryptionField, Context context) {
        if (encryptionField == null) {
            return null;
        }
        if (!encryptionField.d() && encryptionField.c()) {
            if (this.k == null) {
                this.k = (byte[]) dj.b(new a(context));
            }
            encryptionField.a(encryptionField.b(this.k));
        }
        encryptionField.a((Object) null);
        return encryptionField;
    }

    public AdLandingPageData(ContentRecord contentRecord, Context context, boolean z) {
        ApkInfo apkInfoS;
        f(contentRecord.o());
        B(contentRecord.bv());
        a(contentRecord.f());
        a((EncryptionField<String>) a(contentRecord.H(), context));
        b(contentRecord.C());
        c(contentRecord.l());
        b(contentRecord.Z());
        this.C = contentRecord.D();
        this.D = contentRecord.F();
        MetaData metaDataJ = contentRecord.j();
        if (metaDataJ != null) {
            com.huawei.openalliance.ad.beans.metadata.ShareInfo shareInfoR = metaDataJ.r();
            if (shareInfoR != null) {
                a(new ShareInfo(shareInfoR));
            }
            if (z && (apkInfoS = metaDataJ.s()) != null) {
                AppInfo appInfo = new AppInfo(apkInfoS);
                appInfo.m(metaDataJ.o());
                appInfo.v(contentRecord.ac());
                appInfo.F(contentRecord.as());
                appInfo.G(contentRecord.at());
                appInfo.h(metaDataJ.C());
                this.h = appInfo;
            }
            a(metaDataJ.w());
            n(metaDataJ.C());
            o(metaDataJ.m());
            p(metaDataJ.u());
            q(metaDataJ.n());
            s(metaDataJ.o());
            r(metaDataJ.A());
        }
        b((EncryptionField<List<Monitor>>) a(contentRecord.M(), context));
        a(contentRecord.Q() == 1);
        d(contentRecord.W());
        e(contentRecord.X());
        g(contentRecord.n());
        h(contentRecord.p());
        i(contentRecord.aa());
        j(contentRecord.ac());
        c((EncryptionField<String>) a(contentRecord.ad(), context));
        b(contentRecord.ae());
        k(contentRecord.af());
        l(contentRecord.ai());
        m(contentRecord.bs());
        c(contentRecord.ao());
        t(contentRecord.h());
        c(contentRecord.O());
        w(contentRecord.aC());
        x(contentRecord.aD());
        y(contentRecord.aI());
        f(contentRecord.aO());
        z(contentRecord.I());
        d(contentRecord.aZ());
        e(contentRecord.aQ());
        A(contentRecord.aP());
        a(contentRecord.bb());
        d(contentRecord.bf());
        u(contentRecord.be());
        v(contentRecord.aS());
        b(contentRecord.b());
    }

    public AdLandingPageData() {
    }
}
