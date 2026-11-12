package defpackage;

import android.text.TextUtils;
import com.xiaomi.yrn.bundle.config.YRNBundleError;
import com.xiaomi.yrn.env.entity.YRNBundleInfo;
import com.xiaomi.yrn.env.entity.bundleload.YRNBundleRequestBean;
import com.xiaomi.yrn.env.trace.YRNTraceEvent;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class uur {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gur f36164b;
    public final mur c;
    public final List<YRNBundleInfo> e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36163a = "YRN_YRNV3_SDK";
    public final HashMap<String, Long> d = new HashMap<>();

    public class a implements f1d<YRNBundleInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ YRNBundleRequestBean f36165a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ YRNBundleInfo f36166b;
        public final /* synthetic */ long c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ f1d f;

        public a(YRNBundleRequestBean yRNBundleRequestBean, YRNBundleInfo yRNBundleInfo, long j, String str, String str2, f1d f1dVar) {
            this.f36165a = yRNBundleRequestBean;
            this.f36166b = yRNBundleInfo;
            this.c = j;
            this.d = str;
            this.e = str2;
            this.f = f1dVar;
        }

        @Override // defpackage.f1d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(YRNBundleInfo yRNBundleInfo) {
            StringBuilder sb = new StringBuilder();
            sb.append("YRNBundleRequestHelper.requestCommonBundleInfo:onSuccess: \nBundleRequest:");
            sb.append(this.f36165a);
            sb.append("\nresponse:");
            sb.append(yRNBundleInfo != null ? yRNBundleInfo : this.f36166b);
            zxr.a("YRN_YRNV3_SDK", sb.toString());
            uur.this.n(910, "请求 Common bundle 成功", this.f36166b, this.f36165a, System.currentTimeMillis() - this.c);
            if (yRNBundleInfo == null) {
                uur.this.m(-21, "common bundle already latest", this.f36166b, null);
            } else {
                String strE = qur.j().e(yRNBundleInfo, this.d);
                yRNBundleInfo.setBundlePath(strE);
                yRNBundleInfo.setBundlePathFileName(yur.d(strE, yRNBundleInfo.getModule(), uur.this.f36164b));
                qur.j().m(yRNBundleInfo, !TextUtils.isEmpty(this.e));
            }
            f1d f1dVar = this.f;
            if (f1dVar != null) {
                f1dVar.onSuccess(yRNBundleInfo);
            }
        }

        @Override // defpackage.f1d
        public void onFailure(int i, String str) {
            zxr.b("YRN_YRNV3_SDK", yur.a(YRNBundleError.API_DATA_ERROR, "YRNBundleRequestHelper.requestCommonBundleInfo:onFailure:\nBundleRequest:" + this.f36165a + "\ncode:" + i + "\nerrorMessage:" + str));
            uur.this.n(911, str, this.f36166b, this.f36165a, System.currentTimeMillis() - this.c);
            f1d f1dVar = this.f;
            if (f1dVar != null) {
                f1dVar.onFailure(i, str);
            }
        }
    }

    public class b implements f1d<YRNBundleInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ YRNBundleRequestBean f36167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ YRNBundleInfo f36168b;
        public final /* synthetic */ YRNBundleInfo c;
        public final /* synthetic */ long d;
        public final /* synthetic */ String e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ String g;
        public final /* synthetic */ f1d h;

        public b(YRNBundleRequestBean yRNBundleRequestBean, YRNBundleInfo yRNBundleInfo, YRNBundleInfo yRNBundleInfo2, long j, String str, boolean z, String str2, f1d f1dVar) {
            this.f36167a = yRNBundleRequestBean;
            this.f36168b = yRNBundleInfo;
            this.c = yRNBundleInfo2;
            this.d = j;
            this.e = str;
            this.f = z;
            this.g = str2;
            this.h = f1dVar;
        }

        @Override // defpackage.f1d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(YRNBundleInfo yRNBundleInfo) {
            StringBuilder sb = new StringBuilder();
            sb.append("YRNBundleRequestHelper.requestBusinessBundleInfo:onSuccess: \nBundleRequest:");
            sb.append(this.f36167a);
            sb.append("\nresponse:");
            sb.append(yRNBundleInfo != null ? yRNBundleInfo : this.f36168b);
            zxr.a("YRN_YRNV3_SDK", sb.toString());
            uur.this.n(910, "请求业务bundle成功", this.c, yRNBundleInfo, System.currentTimeMillis() - this.d);
            if (yRNBundleInfo == null) {
                uur.this.m(-21, "biz bundle already latest", this.c, this.f36168b);
            } else {
                String strE = qur.j().e(yRNBundleInfo, this.e);
                yRNBundleInfo.setBundlePath(strE);
                yRNBundleInfo.setBundlePathFileName(yur.d(strE, yRNBundleInfo.getModule(), uur.this.f36164b));
                qur.j().m(yRNBundleInfo, this.f);
            }
            uur.this.d.put(this.g, Long.valueOf(System.currentTimeMillis()));
            f1d f1dVar = this.h;
            if (f1dVar != null) {
                f1dVar.onSuccess(yRNBundleInfo);
            }
        }

        @Override // defpackage.f1d
        public void onFailure(int i, String str) {
            zxr.b("YRN_YRNV3_SDK", yur.a(YRNBundleError.API_DATA_ERROR, "YRNBundleRequestHelper.requestBusinessBundleInfo:onFailure:\nBundleRequest:" + this.f36167a + "\nerrorMessage:" + str));
            uur.this.n(911, str, this.c, this.f36167a, System.currentTimeMillis() - this.d);
            f1d f1dVar = this.h;
            if (f1dVar != null) {
                f1dVar.onFailure(i, str);
            }
        }
    }

    public class c implements f1d<YRNBundleInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ YRNBundleInfo f36169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f1d f36170b;

        public c(YRNBundleInfo yRNBundleInfo, f1d f1dVar) {
            this.f36169a = yRNBundleInfo;
            this.f36170b = f1dVar;
        }

        @Override // defpackage.f1d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(YRNBundleInfo yRNBundleInfo) {
            String str;
            if (yRNBundleInfo == null) {
                str = "内置包为空";
            } else {
                YRNBundleInfo yRNBundleInfo2 = this.f36169a;
                str = (yRNBundleInfo2 == null || yRNBundleInfo2.getMaxCommonJSApiLevel() >= yRNBundleInfo.getMaxCommonJSApiLevel()) ? "" : "加载的common bundle maxCommonJSApiLevel过小";
                YRNBundleInfo yRNBundleInfo3 = this.f36169a;
                if (yRNBundleInfo3 != null && !TextUtils.equals(yRNBundleInfo3.getModuleIdMapVersion(), yRNBundleInfo.getModuleIdMapVersion())) {
                    str = "moduleIdMapVersion不一致";
                }
            }
            if (this.f36170b != null) {
                if (TextUtils.isEmpty(str)) {
                    this.f36170b.onSuccess(yRNBundleInfo);
                } else {
                    this.f36170b.onFailure(-1, str);
                }
            }
        }

        @Override // defpackage.f1d
        public void onFailure(int i, String str) {
            f1d f1dVar = this.f36170b;
            if (f1dVar != null) {
                f1dVar.onFailure(i, str);
            }
        }
    }

    public uur(gur gurVar) {
        sk1.c(gurVar);
        this.f36164b = gurVar;
        mur murVar = new mur(gurVar, gurVar.m() != null ? gurVar.m() : new dyr(gurVar.j()));
        this.c = murVar;
        this.e = murVar.j();
    }

    public final YRNBundleInfo e(String str) {
        return yur.g(this.e, str);
    }

    public YRNBundleInfo f(String str) {
        YRNBundleInfo yRNBundleInfoE = e(str);
        if (yRNBundleInfoE == null) {
            m(1100, str + " 内置包为null", null, str);
            return null;
        }
        YRNBundleInfo yRNBundleInfoM873clone = yRNBundleInfoE.m873clone();
        YRNBundleInfo yRNBundleInfoD = qur.j().d(this.f36164b.j(), str);
        if (yRNBundleInfoD == null) {
            return yRNBundleInfoM873clone.m873clone();
        }
        if (yRNBundleInfoM873clone.compareTo(yRNBundleInfoD) <= 0 || yRNBundleInfoM873clone.compareTo(qur.j().g(this.f36164b.j(), str, false)) <= 0) {
            return null;
        }
        return yRNBundleInfoM873clone.m873clone();
    }

    public void g(YRNBundleInfo yRNBundleInfo, String str, YRNBundleInfo yRNBundleInfo2, f1d<YRNBundleInfo> f1dVar) {
        zxr.a("YRN_YRNV3_SDK", "YRNBundleRequestHelper.loadBusinessBuiltInBundle: " + yRNBundleInfo);
        this.c.l(yRNBundleInfo, str, new c(yRNBundleInfo2, f1dVar));
    }

    public void h(YRNBundleInfo yRNBundleInfo, String str, f1d<YRNBundleInfo> f1dVar) {
        zxr.a("YRN_YRNV3_SDK", "YRNBundleRequestHelper.loadCommonBuiltInBundle: " + yRNBundleInfo);
        this.c.l(yRNBundleInfo, str, f1dVar);
    }

    public void i(YRNBundleInfo yRNBundleInfo, YRNBundleInfo yRNBundleInfo2, String str, f1d<YRNBundleInfo> f1dVar) {
        YRNBundleInfo yRNBundleInfoG = yRNBundleInfo;
        zxr.a("YRN_YRNV3_SDK", "YRNBundleRequestHelper.requestBusinessBundleInfo: " + yRNBundleInfoG);
        if (yRNBundleInfoG == null) {
            zxr.b("YRN_YRNV3_SDK", "YRNBundleRequestHelper.requestBusinessBundleInfo: preBizBundleInfo is null,appName and module are Empty");
            if (f1dVar != null) {
                f1dVar.onFailure(-1, "preBizBundleInfo is null,appName and module are Empty");
                return;
            }
            return;
        }
        String module = yRNBundleInfo.getModule();
        String branch = yRNBundleInfo.getBranch();
        boolean z = !TextUtils.isEmpty(branch);
        if (z) {
            yRNBundleInfoG = qur.j().g(this.f36164b.j(), module, true);
            zxr.a("YRN_YRNV3_SDK", "YRNBundleRequestHelper.requestBusinessBundleInfo:module:" + module + " branch:" + branch + " 正在下载");
        } else if (!yur.b(this.d.get(module), 300000L)) {
            m(-23, "bundle cool down", yRNBundleInfo2, module);
            zxr.a("YRN_YRNV3_SDK", "YRNBundleRequestHelper.requestBusinessBundleInfo:module:" + module + ",正在请求冷却中...");
            return;
        }
        YRNBundleInfo yRNBundleInfo3 = yRNBundleInfoG;
        YRNBundleInfo yRNBundleInfoM873clone = yRNBundleInfo2 != null ? yRNBundleInfo2.m873clone() : yRNBundleInfo2;
        m(91, "请求业务bundle", yRNBundleInfoM873clone, yRNBundleInfo3);
        long jCurrentTimeMillis = System.currentTimeMillis();
        YRNBundleRequestBean yRNBundleRequestBeanF = this.c.f(module, branch);
        this.c.n(yRNBundleInfo3, yRNBundleRequestBeanF, str, new b(yRNBundleRequestBeanF, yRNBundleInfo3, yRNBundleInfoM873clone, jCurrentTimeMillis, str, z, module, f1dVar));
    }

    public void j(String str, String str2, YRNBundleInfo yRNBundleInfo, String str3, f1d<YRNBundleInfo> f1dVar) {
        YRNBundleRequestBean yRNBundleRequestBeanF = this.c.f(str, str2);
        zxr.a("YRN_YRNV3_SDK", "YRNBundleRequestHelper.requestCommonBundleInfo: " + yRNBundleRequestBeanF);
        YRNBundleInfo yRNBundleInfoC = yur.c(this.f36164b.j(), str, yRNBundleInfo, TextUtils.isEmpty(str2) ^ true);
        m(91, "请求 Common bundle", yRNBundleInfoC, yRNBundleRequestBeanF);
        this.c.n(yRNBundleInfoC, yRNBundleRequestBeanF, str3, new a(yRNBundleRequestBeanF, yRNBundleInfoC, System.currentTimeMillis(), str3, str2, f1dVar));
    }

    public void k() {
        this.d.clear();
    }

    public void l(String str) {
        this.d.put(str, 0L);
    }

    public final void m(int i, String str, YRNBundleInfo yRNBundleInfo, Object obj) {
        ezr.c().f(YRNTraceEvent.newEvent(this.f36164b.j(), i, str, yRNBundleInfo, obj));
    }

    public final void n(int i, String str, YRNBundleInfo yRNBundleInfo, Object obj, long j) {
        ezr.c().f(YRNTraceEvent.newEvent(this.f36164b.j(), i, str, yRNBundleInfo, obj, j));
    }
}
