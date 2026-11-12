package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.react.bridge.ReactContext;
import com.facebook.yrn.manager.YRNBizInstance;
import com.xiaomi.yrn.env.entity.YRNBundleInfo;
import com.xiaomi.yrn.env.entity.YRNDevModeInfo;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class dwr extends lur {
    public Handler i;
    public final uur j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f16000k;
    public final uwr l;
    public final izr m;
    public final ixr n;

    public class a implements m1d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f16001a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ YRNBundleInfo f16002b;

        public a(String str, YRNBundleInfo yRNBundleInfo) {
            this.f16001a = str;
            this.f16002b = yRNBundleInfo;
        }

        @Override // defpackage.m1d
        public void onLoadFailure(String str) {
            zxr.a("YRN_YRNV3_SDK", "YRNChannel.loadBundle: load common bundle onLoadFailure:" + str);
            dwr.this.l(101, str, this.f16002b, this.f16001a);
            dwr.this.i(this.f16001a, false, null, "load common bundle:onLoadFailure:" + str);
        }

        @Override // defpackage.m1d
        public void onLoadStart() {
        }

        @Override // defpackage.m1d
        public void onLoadSuccess(String str) {
            dwr.this.N(this.f16001a, this.f16002b);
        }
    }

    public class b implements f1d<YRNBundleInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f16003a;

        public b(boolean z) {
            this.f16003a = z;
        }

        @Override // defpackage.f1d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(YRNBundleInfo yRNBundleInfo) {
            if (yRNBundleInfo == null) {
                zxr.a("YRN_YRNV3_SDK", "YRNChannel.requestCommonBundleInfo(),bundleInfo is new");
            } else if (this.f16003a) {
                dwr.this.v(yRNBundleInfo);
            } else {
                dwr.this.m.f(dwr.this.A(), yRNBundleInfo);
            }
        }

        @Override // defpackage.f1d
        public void onFailure(int i, String str) {
            dwr dwrVar = dwr.this;
            dwrVar.l(101, str, null, dwrVar.g);
            dwr dwrVar2 = dwr.this;
            dwrVar2.i(dwrVar2.g, false, null, str);
        }
    }

    public class c implements f1d<YRNBundleInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f16005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ YRNBundleInfo f16006b;
        public final /* synthetic */ YRNBundleInfo c;

        public c(boolean z, YRNBundleInfo yRNBundleInfo, YRNBundleInfo yRNBundleInfo2) {
            this.f16005a = z;
            this.f16006b = yRNBundleInfo;
            this.c = yRNBundleInfo2;
        }

        @Override // defpackage.f1d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(YRNBundleInfo yRNBundleInfo) {
            if (yRNBundleInfo == null) {
                zxr.a("YRN_YRNV3_SDK", "YRNChannel.requestBusinessBundleInfo(),bundleInfo is new");
            } else if (!this.f16005a) {
                dwr.this.m.f(dwr.this.e(yRNBundleInfo.getModule()), yRNBundleInfo);
            } else {
                dwr.this.t(yRNBundleInfo);
                dwr.this.l(100, "加载bundle成功", this.f16006b, yRNBundleInfo);
            }
        }

        @Override // defpackage.f1d
        public void onFailure(int i, String str) {
            YRNBundleInfo yRNBundleInfo;
            dwr.this.l(101, str, this.f16006b, this.c);
            if (!this.f16005a || (yRNBundleInfo = this.c) == null) {
                return;
            }
            dwr.this.i(yRNBundleInfo.getModule(), false, null, "requestBusinessBundleInfo:onFailure:\npreBizBundleInfo:" + this.c + "\nerrorMessage:" + str);
        }
    }

    public class d implements f1d<YRNBundleInfo> {
        public d() {
        }

        @Override // defpackage.f1d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(YRNBundleInfo yRNBundleInfo) {
            dwr.this.z(null);
        }

        @Override // defpackage.f1d
        public void onFailure(int i, String str) {
            dwr.this.z(null);
        }
    }

    public class e implements f1d<YRNBundleInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f16008a;

        public e(String str) {
            this.f16008a = str;
        }

        @Override // defpackage.f1d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(YRNBundleInfo yRNBundleInfo) {
            dwr.this.y(this.f16008a, null);
        }

        @Override // defpackage.f1d
        public void onFailure(int i, String str) {
            dwr.this.y(this.f16008a, null);
        }
    }

    public class f implements f1d<our> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f16010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f16011b;
        public final /* synthetic */ u1d c;

        public f(String str, String str2, u1d u1dVar) {
            this.f16010a = str;
            this.f16011b = str2;
            this.c = u1dVar;
        }

        @Override // defpackage.f1d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(our ourVar) {
            if (ourVar != null) {
                fwr fwrVar = dwr.this.d;
                if (fwrVar != null) {
                    fwrVar.h(this.f16010a, ourVar);
                }
                dwr.this.a(this.f16010a);
                dwr.this.i(this.f16010a, true, this.f16011b, null);
            } else {
                dwr.this.i(this.f16010a, false, this.f16011b, "create module " + this.f16010a + " instance error");
            }
            u1d u1dVar = this.c;
            if (u1dVar != null) {
                u1dVar.onResult(ourVar);
            }
        }

        @Override // defpackage.f1d
        public void onFailure(int i, String str) {
            dwr.this.i(this.f16010a, false, this.f16011b, str);
            u1d u1dVar = this.c;
            if (u1dVar != null) {
                u1dVar.onResult(null);
            }
        }
    }

    public class g implements f1d<fwr> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f16012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f16013b;
        public final /* synthetic */ YRNBundleInfo c;
        public final /* synthetic */ u1d d;

        public g(String str, String str2, YRNBundleInfo yRNBundleInfo, u1d u1dVar) {
            this.f16012a = str;
            this.f16013b = str2;
            this.c = yRNBundleInfo;
            this.d = u1dVar;
        }

        @Override // defpackage.f1d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(fwr fwrVar) {
            if (fwrVar != null) {
                dwr dwrVar = dwr.this;
                dwrVar.d = fwrVar;
                dwrVar.a(this.f16012a);
                dwr.this.i(this.f16012a, true, this.f16013b, null);
                dwr.this.l(100, "加载bundle成功", null, this.c);
            } else {
                dwr.this.i(this.f16012a, false, this.f16013b, "create createCommonInstance error");
            }
            u1d u1dVar = this.d;
            if (u1dVar != null) {
                u1dVar.onResult(fwrVar);
            }
        }

        @Override // defpackage.f1d
        public void onFailure(int i, String str) {
            dwr.this.i(this.f16012a, false, this.f16013b, str);
            u1d u1dVar = this.d;
            if (u1dVar != null) {
                u1dVar.onResult(null);
            }
        }
    }

    public class h implements m1d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f16014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f16015b;

        public h(String str, String str2) {
            this.f16014a = str;
            this.f16015b = str2;
        }

        @Override // defpackage.m1d
        public void onLoadFailure(String str) {
        }

        @Override // defpackage.m1d
        public void onLoadStart() {
        }

        @Override // defpackage.m1d
        public void onLoadSuccess(String str) {
            dwr.this.y(this.f16014a, this.f16015b);
        }
    }

    public dwr(gur gurVar, lyr lyrVar) {
        this.e = gurVar;
        sk1.c(gurVar);
        this.i = new Handler(Looper.getMainLooper());
        this.f = gurVar.j();
        this.j = new uur(gurVar);
        this.f16000k = yur.e(gurVar);
        this.f = gurVar.j();
        this.g = gurVar.p().getCommonModuleName();
        this.m = new izr(this, lyrVar);
        ixr ixrVar = new ixr(gurVar, new cyr(this));
        this.n = ixrVar;
        this.l = new uwr(gurVar, ixrVar);
    }

    public fwr A() {
        return this.d;
    }

    public fwr B(String str) {
        fwr fwrVarD;
        return (TextUtils.isEmpty(str) || (fwrVarD = this.l.d(str)) == null) ? this.d : fwrVarD;
    }

    public gur C() {
        return this.e;
    }

    public HashMap<String, YRNBundleInfo> D() {
        fwr fwrVar = this.d;
        if (fwrVar != null) {
            return fwrVar.l();
        }
        return null;
    }

    public ReactContext E(String str) {
        com.facebook.react.a aVarG = G(str);
        if (aVarG != null) {
            return aVarG.C();
        }
        return null;
    }

    public com.facebook.react.a F() {
        fwr fwrVar = this.d;
        if (fwrVar != null) {
            return fwrVar.o();
        }
        return null;
    }

    public com.facebook.react.a G(String str) {
        com.facebook.react.a aVarE;
        return (TextUtils.isEmpty(str) || (aVarE = this.l.e(str)) == null) ? F() : aVarE;
    }

    public void H(jxr jxrVar) {
        zxr.a("YRN_YRNV3_SDK", "YRNChannel.incrementModuleCount:");
        izr izrVar = this.m;
        if (izrVar != null) {
            izrVar.j(jxrVar);
        }
    }

    public final boolean I() {
        gur gurVar = this.e;
        return gurVar != null && gurVar.t();
    }

    public final /* synthetic */ void K(String str, fwr fwrVar) {
        i(str, true, null, null);
    }

    public void L(final String str, final m1d m1dVar) {
        this.i.post(new Runnable() { // from class: cwr
            @Override // java.lang.Runnable
            public final void run() {
                this.f14811a.J(str, m1dVar);
            }
        });
    }

    public final void M(String str, YRNBundleInfo yRNBundleInfo, YRNBundleInfo yRNBundleInfo2) {
        zxr.a("YRN_YRNV3_SDK", "YRNChannel.loadBusinessBuiltInBundle:bundleInfo is " + yRNBundleInfo);
        this.j.g(yRNBundleInfo, this.f16000k, yRNBundleInfo2, new e(str));
    }

    public final void N(String str, YRNBundleInfo yRNBundleInfo) {
        zxr.a("YRN_YRNV3_SDK", "YRNChannel.loadBusinessBundleAfterLoadedCommonBundle:module:" + str);
        YRNBundleInfo yRNBundleInfoF = this.j.f(str);
        if (yRNBundleInfoF != null) {
            M(str, yRNBundleInfoF, yRNBundleInfo);
        } else {
            y(str, null);
        }
    }

    public final void O(YRNBundleInfo yRNBundleInfo) {
        zxr.a("YRN_YRNV3_SDK", "YRNChannel.loadCommonBuiltInBundle:bundleInfo is " + yRNBundleInfo);
        this.j.h(yRNBundleInfo, this.f16000k, new d());
    }

    public final void P(m1d m1dVar) {
        zxr.a("YRN_YRNV3_SDK", "YRNChannel.loadCommonBundle");
        if (m1dVar != null) {
            m1dVar.onLoadStart();
        }
        if ((I() || !b(this.g, m1dVar)) && !Q(this.g, true)) {
            this.f16000k = yur.e(this.e);
            fwr fwrVar = this.d;
            if (fwrVar != null && !fwrVar.q()) {
                YRNBundleInfo yRNBundleInfoF = f(this.g);
                i(this.g, true, yRNBundleInfoF != null ? yRNBundleInfoF.getBundlePath() : null, null);
                return;
            }
            l(10, "加载bundle", null, this.g);
            YRNBundleInfo yRNBundleInfoF2 = this.j.f(this.g);
            if (yRNBundleInfoF2 != null) {
                O(yRNBundleInfoF2);
            } else {
                z(null);
            }
        }
    }

    public final boolean Q(String str, boolean z) {
        return R(str) || S(str, z);
    }

    public boolean R(final String str) {
        zxr.a("YRN_YRNV3_SDK", "YRNChannel.loadDevModeIPBundle:module:" + str);
        return this.l.f(str, new u1d() { // from class: bwr
            @Override // defpackage.u1d
            public final void onResult(Object obj) {
                this.f4680a.K(str, (fwr) obj);
            }
        });
    }

    public final boolean S(String str, boolean z) {
        fwr fwrVar;
        zxr.a("YRN_YRNV3_SDK", "YRNChannel.loadReleaseBundleByDevBranch:module:" + str + ",isCommon:" + z);
        YRNDevModeInfo yRNDevModeInfoA = swr.e().a(this.f, str);
        if (yRNDevModeInfoA == null || TextUtils.isEmpty(yRNDevModeInfoA.c())) {
            return false;
        }
        if (h(str)) {
            i(str, true, null, null);
            return true;
        }
        this.f16000k = yur.f(this.e, "dev_branch");
        String strC = yRNDevModeInfoA.c();
        if (I()) {
            fwr fwrVar2 = this.d;
            if (fwrVar2 == null || fwrVar2.q()) {
                z(strC);
            } else {
                i(str, true, null, null);
            }
            return true;
        }
        if (!z && ((fwrVar = this.d) == null || fwrVar.q())) {
            P(new h(str, strC));
        } else if (z) {
            z(strC);
        } else {
            y(str, strC);
        }
        return true;
    }

    public void T(Exception exc) {
        zxr.a("YRN_YRNV3_SDK", "YRNChannel.meetInstanceErrorNeedReload:");
        izr izrVar = this.m;
        if (izrVar != null) {
            izrVar.n(exc);
        }
    }

    public void U(String str) {
        zxr.a("YRN_YRNV3_SDK", "YRNChannel.removeDevModeReactInstanceManager:module:" + str);
        this.l.h(str);
    }

    public final void V(YRNBundleInfo yRNBundleInfo, boolean z) {
        zxr.a("YRN_YRNV3_SDK", "YRNChannel.requestBusinessBundleInfo:preBizBundleInfo is " + yRNBundleInfo);
        YRNBundleInfo yRNBundleInfoF = f(this.g);
        this.j.i(yRNBundleInfo, yRNBundleInfoF, this.f16000k, new c(z, yRNBundleInfoF, yRNBundleInfo));
    }

    public final void W(String str, boolean z) {
        zxr.a("YRN_YRNV3_SDK", "YRNChannel.requestCommonBundleInfo:branch:" + str + ",needCreateInstanceAfterRequest:" + z);
        fwr fwrVar = this.d;
        this.j.j(this.g, str, fwrVar != null ? fwrVar.b() : null, this.f16000k, new b(z));
    }

    public void X() {
        zxr.a("YRN_YRNV3_SDK", "YRNChannel.reset");
        synchronized (lur.h) {
            try {
                this.l.b();
                Y();
                fwr fwrVar = this.d;
                if (fwrVar != null) {
                    fwrVar.i();
                    this.d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void Y() {
        zxr.a("YRN_YRNV3_SDK", "YRNChannel.resetButRetainInstance");
        c();
        this.f25450b.clear();
        this.j.k();
        this.i.removeCallbacksAndMessages(null);
        uxr.c().b();
        yxr.e();
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void J(String str, m1d m1dVar) {
        zxr.a("YRN_YRNV3_SDK", "YRNChannel.loadBundle: " + str);
        if (TextUtils.isEmpty(str)) {
            P(m1dVar);
            return;
        }
        if (m1dVar != null) {
            m1dVar.onLoadStart();
        }
        if (b(str, m1dVar) || Q(str, false)) {
            return;
        }
        this.f16000k = yur.e(this.e);
        fwr fwrVar = this.d;
        YRNBundleInfo yRNBundleInfoF = f(this.g);
        if (I()) {
            if (fwrVar == null || fwrVar.q()) {
                P(m1dVar);
                return;
            } else {
                i(str, true, null, null);
                return;
            }
        }
        our ourVarD = d(str);
        if (ourVarD != null) {
            YRNBizInstance yRNBizInstanceI = ourVarD.i();
            YRNBundleInfo yRNBundleInfoB = ourVarD.b();
            if (yRNBizInstanceI != null && yRNBizInstanceI.hasInstanceCreated()) {
                l(1100, "业务通道已经存在", yRNBundleInfoF, yRNBundleInfoB);
                i(str, true, ourVarD.b() != null ? ourVarD.b().getBundlePath() : null, null);
                V(yRNBundleInfoB, false);
                return;
            }
        }
        if (fwrVar != null && !fwrVar.q()) {
            N(str, yRNBundleInfoF);
        } else {
            l(1100, "开始加载common包", null, yRNBundleInfoF);
            P(new a(str, yRNBundleInfoF));
        }
    }

    public void t(YRNBundleInfo yRNBundleInfo) {
        u(yRNBundleInfo, null);
    }

    public void u(YRNBundleInfo yRNBundleInfo, u1d<our> u1dVar) {
        zxr.a("YRN_YRNV3_SDK", "YRNChannel.createBusinessInstanceForReleaseMode");
        if (yRNBundleInfo != null) {
            this.n.d(this.d, yRNBundleInfo, new f(yRNBundleInfo.getModule(), yRNBundleInfo.getBundlePathFileName(), u1dVar));
        } else {
            zxr.b("YRN_YRNV3_SDK", "YRNChannel.createBusinessInstanceForReleaseMode,bundleInfo is null,Pls Check!");
            if (u1dVar != null) {
                u1dVar.onResult(null);
            }
        }
    }

    public void v(YRNBundleInfo yRNBundleInfo) {
        w(yRNBundleInfo, null);
    }

    public void w(YRNBundleInfo yRNBundleInfo, u1d<fwr> u1dVar) {
        zxr.a("YRN_YRNV3_SDK", "YRNChannel.createCommonInstanceForReleaseMode");
        if (yRNBundleInfo != null) {
            this.n.f(yRNBundleInfo, new g(yRNBundleInfo.getModule(), yRNBundleInfo.getBundlePathFileName(), yRNBundleInfo, u1dVar));
        } else {
            zxr.b("YRN_YRNV3_SDK", "YRNChannel.createCommonInstanceForReleaseMode,bundleInfo is null,Pls Check!");
            if (u1dVar != null) {
                u1dVar.onResult(null);
            }
        }
    }

    public void x(fwr fwrVar, our ourVar) {
        zxr.a("YRN_YRNV3_SDK", "YRNChannel.decrementModuleCount:");
        izr izrVar = this.m;
        if (izrVar != null) {
            izrVar.e(fwrVar, ourVar);
        }
    }

    public final void y(String str, String str2) {
        zxr.a("YRN_YRNV3_SDK", "YRNChannel.doLoadBusinessBundleByCache:module:" + str + ",branch:" + str2);
        boolean z = true;
        YRNBundleInfo yRNBundleInfoG = qur.j().g(this.f, str, TextUtils.isEmpty(str2) ^ true);
        YRNBundleInfo yRNBundleInfoF = f(this.g);
        if (yRNBundleInfoG == null || yRNBundleInfoF == null || yRNBundleInfoF.getMaxCommonJSApiLevel() < yRNBundleInfoG.getMaxCommonJSApiLevel() || !TextUtils.equals(yRNBundleInfoF.getModuleIdMapVersion(), yRNBundleInfoG.getModuleIdMapVersion()) || !wwr.h(yRNBundleInfoG.getBundlePathFileName())) {
            l(-22, "业务包无缓存", yRNBundleInfoF, str);
            yRNBundleInfoG = new YRNBundleInfo();
            yRNBundleInfoG.setModule(str);
            this.j.l(str);
        } else {
            t(yRNBundleInfoG);
            l(100, "加载业务包缓存", yRNBundleInfoF, yRNBundleInfoG);
            z = false;
        }
        yRNBundleInfoG.setBranch(str2);
        V(yRNBundleInfoG, z);
    }

    public final void z(String str) {
        zxr.a("YRN_YRNV3_SDK", "YRNChannel.doLoadCommonBundleByCache: branch:" + str);
        boolean z = true;
        YRNBundleInfo yRNBundleInfoG = qur.j().g(this.f, this.g, TextUtils.isEmpty(str) ^ true);
        if (yRNBundleInfoG == null || !wwr.h(yRNBundleInfoG.getBundlePathFileName())) {
            l(-22, "基础包无缓存", null, null);
        } else {
            v(yRNBundleInfoG);
            z = false;
        }
        W(str, z);
    }
}
