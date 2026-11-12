package defpackage;

import android.content.res.AssetManager;
import android.text.TextUtils;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import com.xiaomi.yrn.env.entity.YRNBundleInfo;
import com.xiaomi.yrn.env.entity.bundleload.YRNBundleRequestBean;
import com.xiaomi.yrn.env.entity.bundleload.YRNBundleResponseBean;
import com.xiaomi.yrn.env.entity.bundleload.YRNBundleResponseInfoBean;
import com.xiaomi.yrn.env.entity.bundleload.load.YRNAssetsLoadRequest;
import com.xiaomi.yrn.env.entity.bundleload.load.YRNNetworkLoadRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class mur {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27229a = "YRN_YRNV3_SDK";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gur f27230b;
    public final s1d c;
    public final vxr d;
    public final uxr e;

    public class a implements f1d<YRNAssetsLoadRequest> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ YRNAssetsLoadRequest f27231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ YRNBundleInfo f27232b;
        public final /* synthetic */ String c;
        public final /* synthetic */ f1d d;

        public a(YRNAssetsLoadRequest yRNAssetsLoadRequest, YRNBundleInfo yRNBundleInfo, String str, f1d f1dVar) {
            this.f27231a = yRNAssetsLoadRequest;
            this.f27232b = yRNBundleInfo;
            this.c = str;
            this.d = f1dVar;
        }

        @Override // defpackage.f1d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(YRNAssetsLoadRequest yRNAssetsLoadRequest) {
            mur.this.e.e(this.f27231a);
            String strE = qur.j().e(this.f27232b, this.c);
            this.f27232b.setBundlePath(strE);
            this.f27232b.setBundlePathFileName(yur.d(strE, this.f27232b.getModule(), mur.this.f27230b));
            qur.j().k(this.f27232b);
            qur.j().m(this.f27232b, false);
            f1d f1dVar = this.d;
            if (f1dVar != null) {
                f1dVar.onSuccess(this.f27232b);
            }
        }

        @Override // defpackage.f1d
        public void onFailure(int i, String str) {
            mur.this.e.e(this.f27231a);
            f1d f1dVar = this.d;
            if (f1dVar != null) {
                f1dVar.onFailure(i, "load failed，" + str);
            }
        }
    }

    public class b implements f1d<YRNBundleResponseBean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f1d f27233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ YRNBundleRequestBean f27234b;
        public final /* synthetic */ YRNBundleInfo c;
        public final /* synthetic */ String d;

        public class a implements f1d<YRNNetworkLoadRequest> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ YRNNetworkLoadRequest f27235a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ YRNBundleInfo f27236b;

            public a(YRNNetworkLoadRequest yRNNetworkLoadRequest, YRNBundleInfo yRNBundleInfo) {
                this.f27235a = yRNNetworkLoadRequest;
                this.f27236b = yRNBundleInfo;
            }

            @Override // defpackage.f1d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(YRNNetworkLoadRequest yRNNetworkLoadRequest) {
                mur.this.e.e(this.f27235a);
                f1d f1dVar = b.this.f27233a;
                if (f1dVar != null) {
                    f1dVar.onSuccess(this.f27236b);
                }
            }

            @Override // defpackage.f1d
            public void onFailure(int i, String str) {
                mur.this.e.e(this.f27235a);
                f1d f1dVar = b.this.f27233a;
                if (f1dVar != null) {
                    f1dVar.onFailure(i, "loadBundle failed");
                }
            }
        }

        public b(f1d f1dVar, YRNBundleRequestBean yRNBundleRequestBean, YRNBundleInfo yRNBundleInfo, String str) {
            this.f27233a = f1dVar;
            this.f27234b = yRNBundleRequestBean;
            this.c = yRNBundleInfo;
            this.d = str;
        }

        @Override // defpackage.f1d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(YRNBundleResponseBean yRNBundleResponseBean) {
            YRNBundleResponseInfoBean data = yRNBundleResponseBean.getData();
            if (data == null) {
                f1d f1dVar = this.f27233a;
                if (f1dVar != null) {
                    f1dVar.onFailure(-1, "bundleResponseInfo == null");
                    return;
                }
                return;
            }
            YRNBundleResponseInfoBean.updateModules(this.f27234b.getAppName(), data);
            List<YRNBundleInfo> modules = data.getModules();
            if (modules == null || modules.size() == 0) {
                f1d f1dVar2 = this.f27233a;
                if (f1dVar2 != null) {
                    f1dVar2.onFailure(-1, "BundleInfo list == null");
                    return;
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            YRNBundleInfo yRNBundleInfo = this.c;
            if (yRNBundleInfo != null) {
                arrayList.add(yRNBundleInfo);
            }
            YRNBundleInfo yRNBundleInfo2 = zur.b(arrayList, modules).get(0);
            YRNBundleInfo yRNBundleInfo3 = null;
            if (!yRNBundleInfo2.isNeedUpdate()) {
                if (this.f27233a != null) {
                    zxr.a("YRN_YRNV3_SDK", "YRNBaseRequest.requestBundleInfo: bundleInfo is New,Do Not Need Update~");
                    this.f27233a.onSuccess(null);
                    return;
                }
                return;
            }
            YRNNetworkLoadRequest yRNNetworkLoadRequestI = mur.this.i(yRNBundleInfo2, this.d);
            if (!mur.this.e.a(yRNNetworkLoadRequestI)) {
                zxr.g("YRN_YRNV3_SDK", "YRNBaseRequest.requestBundleInfo:addNetworkLoadRequest fail");
                f1d f1dVar3 = this.f27233a;
                if (f1dVar3 != null) {
                    f1dVar3.onFailure(-1, "YRNBaseRequest.requestBundleInfo:loadTaskManager.addRequest failed");
                    return;
                }
                return;
            }
            if (mur.this.f27230b == null || TextUtils.isEmpty(mur.this.f27230b.j())) {
                f1d f1dVar4 = this.f27233a;
                if (f1dVar4 != null) {
                    f1dVar4.onFailure(-1, "YRNBaseRequest.requestBundleInfo: config or appName is Empty");
                    return;
                }
                return;
            }
            String strJ = mur.this.f27230b.j();
            HashMap<String, YRNBundleInfo> mapB = tur.a().b(strJ);
            if (mapB != null) {
                YRNBundleInfo yRNBundleInfo4 = mapB.get(yRNBundleInfo2.getModule());
                YRNBundleInfo yRNBundleInfo5 = mapB.get(vwr.g().c(strJ));
                if (yRNBundleInfo4 != null) {
                    String bundlePath = yRNBundleInfo4.getBundlePath();
                    zxr.a("YRN_YRNV3_SDK", "YRNBaseRequest.requestBundleInfo: usingBundlePath:" + bundlePath);
                    if (!TextUtils.isEmpty(bundlePath)) {
                        yRNNetworkLoadRequestI.setUsingBundlePath(bundlePath);
                    }
                }
                yRNBundleInfo3 = yRNBundleInfo5;
            }
            YRNBundleInfo yRNBundleInfoM873clone = yRNBundleInfo3 != null ? yRNBundleInfo3.m873clone() : yRNBundleInfo3;
            YRNBundleInfo yRNBundleInfoM873clone2 = yRNBundleInfo2.m873clone();
            mur.this.d.a(new wur(yRNNetworkLoadRequestI, new fyr(mur.this.c, yRNBundleInfoM873clone, yRNBundleInfoM873clone2), mur.this.d, new pur(), new a(yRNNetworkLoadRequestI, yRNBundleInfo2), yRNBundleInfoM873clone, yRNBundleInfoM873clone2));
        }

        @Override // defpackage.f1d
        public void onFailure(int i, String str) {
            f1d f1dVar = this.f27233a;
            if (f1dVar != null) {
                f1dVar.onFailure(i, str);
            }
        }
    }

    public mur(gur gurVar, s1d s1dVar) {
        sk1.c(gurVar);
        this.f27230b = gurVar;
        this.c = s1dVar;
        this.d = new vxr(new xur(gurVar.j()));
        this.e = uxr.c();
    }

    public YRNAssetsLoadRequest e(YRNBundleInfo yRNBundleInfo, String str) {
        YRNAssetsLoadRequest yRNAssetsLoadRequest = new YRNAssetsLoadRequest();
        yRNAssetsLoadRequest.setAppName(yRNBundleInfo.getAppName());
        yRNAssetsLoadRequest.setModule(yRNBundleInfo.getModule());
        yRNAssetsLoadRequest.setVersion(yRNBundleInfo.getVersion());
        yRNAssetsLoadRequest.setMd5(yRNBundleInfo.getMd5());
        yRNAssetsLoadRequest.setBuiltInPath(yRNBundleInfo.getBundlePath());
        String strE = qur.j().e(yRNBundleInfo, str);
        yRNAssetsLoadRequest.setCacheDirPath(strE);
        yRNAssetsLoadRequest.setZipCachePath(strE + "zip");
        return yRNAssetsLoadRequest;
    }

    public YRNBundleRequestBean f(String str, String str2) {
        if (k(str)) {
            return h(str2);
        }
        return g(qur.j().g(this.f27230b.j(), vwr.g().c(this.f27230b.j()), false), str, str2);
    }

    public final YRNBundleRequestBean g(YRNBundleInfo yRNBundleInfo, String str, String str2) {
        YRNBundleRequestBean yRNBundleRequestBean = new YRNBundleRequestBean();
        yRNBundleRequestBean.setAppName(this.f27230b.j());
        yRNBundleRequestBean.setPlatform(PluginPackageConstant.RN_DIR_A);
        yRNBundleRequestBean.setRnEngineVersion(this.f27230b.r());
        yRNBundleRequestBean.setMaxNativeApiLevel(this.f27230b.q());
        if (yRNBundleInfo != null) {
            yRNBundleRequestBean.setMaxCommonJSApiLevel(yRNBundleInfo.getMaxCommonJSApiLevel());
            yRNBundleRequestBean.setModuleIdMapVersion(yRNBundleInfo.getModuleIdMapVersion());
        }
        if (!TextUtils.isEmpty(str2)) {
            yRNBundleRequestBean.setBranch(str2);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        yRNBundleRequestBean.setModule(arrayList);
        return yRNBundleRequestBean;
    }

    public final YRNBundleRequestBean h(String str) {
        YRNBundleRequestBean yRNBundleRequestBean = new YRNBundleRequestBean();
        yRNBundleRequestBean.setAppName(this.f27230b.j());
        yRNBundleRequestBean.setPlatform(PluginPackageConstant.RN_DIR_A);
        yRNBundleRequestBean.setMaxNativeApiLevel(this.f27230b.q());
        yRNBundleRequestBean.setRnEngineVersion(this.f27230b.r());
        if (!TextUtils.isEmpty(str)) {
            yRNBundleRequestBean.setBranch(str);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(vwr.g().c(this.f27230b.j()));
        yRNBundleRequestBean.setModule(arrayList);
        return yRNBundleRequestBean;
    }

    public YRNNetworkLoadRequest i(YRNBundleInfo yRNBundleInfo, String str) {
        YRNNetworkLoadRequest yRNNetworkLoadRequest = new YRNNetworkLoadRequest();
        yRNNetworkLoadRequest.setAppName(yRNBundleInfo.getAppName());
        yRNNetworkLoadRequest.setModule(yRNBundleInfo.getModule());
        yRNNetworkLoadRequest.setVersion(yRNBundleInfo.getVersion());
        yRNNetworkLoadRequest.setMd5(yRNBundleInfo.getMd5());
        yRNNetworkLoadRequest.setUrl(yRNBundleInfo.getUrl());
        String strE = qur.j().e(yRNBundleInfo, str);
        yRNNetworkLoadRequest.setCacheDirPath(strE);
        yRNNetworkLoadRequest.setZipCachePath(strE + "zip");
        return yRNNetworkLoadRequest;
    }

    public List<YRNBundleInfo> j() {
        ArrayList<YRNBundleInfo> arrayList = new ArrayList();
        gur gurVar = this.f27230b;
        if (gurVar != null && gurVar.p() != null && !TextUtils.isEmpty(this.f27230b.p().getAssetsBuiltInBundleJsonPath())) {
            List<YRNBundleInfo> listM = m(this.f27230b.p().getAssetsBuiltInBundleJsonPath());
            if (listM != null && listM.size() > 0) {
                arrayList.addAll(listM);
            }
            for (YRNBundleInfo yRNBundleInfo : arrayList) {
                if (yRNBundleInfo != null && TextUtils.isEmpty(yRNBundleInfo.getAppName())) {
                    yRNBundleInfo.setAppName(this.f27230b.j());
                }
            }
        }
        return arrayList;
    }

    public final boolean k(String str) {
        gur gurVar = this.f27230b;
        return (gurVar == null || TextUtils.isEmpty(gurVar.j()) || TextUtils.isEmpty(str) || !str.equals(vwr.g().c(this.f27230b.j()))) ? false : true;
    }

    public void l(YRNBundleInfo yRNBundleInfo, String str, f1d<YRNBundleInfo> f1dVar) {
        YRNBundleInfo yRNBundleInfo2;
        YRNAssetsLoadRequest yRNAssetsLoadRequestE = e(yRNBundleInfo, str);
        yRNAssetsLoadRequestE.setNeedVerify(false);
        if (!this.e.a(yRNAssetsLoadRequestE)) {
            zxr.g("YRN_YRNV3_SDK", "YRNBaseRequest.requestBundleInfo:addAssetsLoadRequest fail");
            return;
        }
        gur gurVar = this.f27230b;
        if (gurVar == null || TextUtils.isEmpty(gurVar.j())) {
            zxr.b("YRN_YRNV3_SDK", "YRNBaseRequest.requestBundleInfo:config or appName is Empty");
            return;
        }
        String strJ = this.f27230b.j();
        HashMap<String, YRNBundleInfo> mapB = tur.a().b(strJ);
        if (mapB != null && (yRNBundleInfo2 = mapB.get(yRNBundleInfo.getModule())) != null) {
            String bundlePath = yRNBundleInfo2.getBundlePath();
            if (!TextUtils.isEmpty(bundlePath)) {
                yRNAssetsLoadRequestE.setUsingBundlePath(bundlePath);
            }
        }
        sk1.d(yRNAssetsLoadRequestE.getBuiltInPath(), "getBuiltInPath can not be empty!");
        sk1.d(yRNAssetsLoadRequestE.getZipCachePath(), "getZipCachePath can not be empty!");
        AssetManager assets = vwr.g().a().getAssets();
        YRNBundleInfo yRNBundleInfoM873clone = mapB != null ? mapB.get(vwr.g().c(strJ)) : null;
        if (yRNBundleInfoM873clone != null) {
            yRNBundleInfoM873clone = yRNBundleInfoM873clone.m873clone();
        }
        YRNBundleInfo yRNBundleInfo3 = yRNBundleInfoM873clone;
        YRNBundleInfo yRNBundleInfoM873clone2 = yRNBundleInfo.m873clone();
        this.d.a(new wur(yRNAssetsLoadRequestE, new kur(assets, yRNBundleInfo3, yRNBundleInfoM873clone2), this.d, new pur(), new a(yRNAssetsLoadRequestE, yRNBundleInfo, str, f1dVar), yRNBundleInfo3, yRNBundleInfoM873clone2));
    }

    public final List<YRNBundleInfo> m(String str) {
        return this.c.parseBuiltinBundleInfoJson(this.f27230b.j(), str);
    }

    public void n(YRNBundleInfo yRNBundleInfo, YRNBundleRequestBean yRNBundleRequestBean, String str, f1d<YRNBundleInfo> f1dVar) {
        this.c.getNetBundleInfo(yRNBundleRequestBean, new b(f1dVar, yRNBundleRequestBean, yRNBundleInfo, str));
    }
}
