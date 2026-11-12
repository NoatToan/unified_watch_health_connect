package defpackage;

import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.xiaomi.yrn.env.entity.YRNBundleInfo;
import com.xiaomi.yrn.env.entity.bundleload.YRNBundleRequestBean;
import com.xiaomi.yrn.env.entity.bundleload.YRNBundleResponseBean;
import com.xiaomi.yrn.env.entity.bundleload.load.YRNNetworkLoadRequest;
import com.xiaomi.yrn.env.trace.YRNTraceEvent;
import com.xiaomi.yrn.net.impl.YRNNetDefaultBeanImpl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class dyr implements s1d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public gyr f16077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16078b = "YRN_YRNV3_SDK";

    public class a implements f1d<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ YRNBundleRequestBean f16079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q1d f16080b;
        public final /* synthetic */ f1d c;

        public a(YRNBundleRequestBean yRNBundleRequestBean, q1d q1dVar, f1d f1dVar) {
            this.f16079a = yRNBundleRequestBean;
            this.f16080b = q1dVar;
            this.c = f1dVar;
        }

        @Override // defpackage.f1d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            ezr.c().f(YRNTraceEvent.newEvent(this.f16079a.getAppName(), 912, "getNetBundleInfo", null, str));
            YRNBundleResponseBean beanFromNetResponseStr = this.f16080b.getBeanFromNetResponseStr(str);
            ezr ezrVarC = ezr.c();
            String appName = this.f16079a.getAppName();
            if (beanFromNetResponseStr != null && !TextUtils.isEmpty(beanFromNetResponseStr.getTraceId())) {
                str = beanFromNetResponseStr.getTraceId();
            }
            ezrVarC.f(YRNTraceEvent.newEvent(appName, 1100, "getNetBundleInfo_TraceId", null, str));
            f1d f1dVar = this.c;
            if (f1dVar != null) {
                f1dVar.onSuccess(beanFromNetResponseStr);
            }
        }

        @Override // defpackage.f1d
        public void onFailure(int i, String str) {
            ezr.c().f(YRNTraceEvent.newEvent(this.f16079a.getAppName(), 913, "getNetBundleInfo", null, "onFailure,code is " + i + ",message is " + str));
            f1d f1dVar = this.c;
            if (f1dVar != null) {
                f1dVar.onFailure(i, str);
            }
        }
    }

    public class b implements f1d<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ YRNNetworkLoadRequest f16081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f1d f16082b;

        public b(YRNNetworkLoadRequest yRNNetworkLoadRequest, f1d f1dVar) {
            this.f16081a = yRNNetworkLoadRequest;
            this.f16082b = f1dVar;
        }

        @Override // defpackage.f1d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            ezr.c().f(YRNTraceEvent.newEvent(this.f16081a.getAppName(), 1100, "downloadBundle success", null, "request is " + this.f16081a));
            f1d f1dVar = this.f16082b;
            if (f1dVar != null) {
                f1dVar.onSuccess(null);
            }
        }

        @Override // defpackage.f1d
        public void onFailure(int i, String str) {
            ezr.c().f(YRNTraceEvent.newEvent(this.f16081a.getAppName(), 1100, "downloadBundle fail", null, "onFailure,code is " + i + ",message is " + str));
            f1d f1dVar = this.f16082b;
            if (f1dVar != null) {
                f1dVar.onFailure(i, str);
            }
        }
    }

    public dyr(String str) {
        this.f16077a = new gyr(str);
    }

    public final q1d a(r1d r1dVar) {
        q1d netBeanProvider = r1dVar.getNetBeanProvider();
        return netBeanProvider == null ? new YRNNetDefaultBeanImpl() : netBeanProvider;
    }

    public final r1d b(String str) {
        if (TextUtils.isEmpty(str) || vwr.g().d(str) == null || vwr.g().d(str).n() == null) {
            return null;
        }
        return vwr.g().d(str).n();
    }

    @Override // defpackage.s1d
    public boolean downloadBundle(YRNNetworkLoadRequest yRNNetworkLoadRequest, f1d<sur> f1dVar) {
        if (yRNNetworkLoadRequest != null && !TextUtils.isEmpty(yRNNetworkLoadRequest.getUrl()) && !TextUtils.isEmpty(yRNNetworkLoadRequest.getZipCachePath())) {
            zxr.a("YRN_YRNV3_SDK", "YRNNetDefaultOkhttpImpl.downloadBundle: url is " + yRNNetworkLoadRequest.getUrl() + ",and download Path is " + yRNNetworkLoadRequest.getZipCachePath());
            return this.f16077a.e(yRNNetworkLoadRequest.getUrl(), new JsonObject(), yRNNetworkLoadRequest.getZipCachePath(), new b(yRNNetworkLoadRequest, f1dVar));
        }
        String string = yRNNetworkLoadRequest != null ? yRNNetworkLoadRequest.toString() : "request is Empty";
        zxr.b("YRN_YRNV3_SDK", "YRNNetDefaultOkhttpImpl.downloadBundle:request is " + string);
        if (f1dVar != null) {
            f1dVar.onFailure(-1, "YRNNetDefaultOkhttpImpl.downloadBundle:request is " + string);
        }
        if (yRNNetworkLoadRequest == null) {
            return false;
        }
        ezr.c().f(YRNTraceEvent.newEvent(yRNNetworkLoadRequest.getAppName(), 1100, "downloadBundle fail", null, "onFailure,request  is " + string));
        return false;
    }

    @Override // defpackage.s1d
    public void getNetBundleInfo(YRNBundleRequestBean yRNBundleRequestBean, f1d<YRNBundleResponseBean> f1dVar) {
        if (yRNBundleRequestBean == null) {
            zxr.b("YRN_YRNV3_SDK", "YRNNetDefaultOkhttpImpl.getNetBundleInfo:YRNBundleRequestBean request is null,pls check");
            if (f1dVar != null) {
                f1dVar.onFailure(-1, "YRNNetDefaultOkhttpImpl.getNetBundleInfo:request is null ");
                return;
            }
            return;
        }
        r1d r1dVarB = b(yRNBundleRequestBean.getAppName());
        if (r1dVarB == null) {
            zxr.b("YRN_YRNV3_SDK", "YRNNetDefaultOkhttpImpl.getNetBundleInfo:IYRNNetDefaultFrameInfoProvider is null,pls check");
            if (f1dVar != null) {
                f1dVar.onFailure(-1, "YRNNetDefaultOkhttpImpl.getNetBundleInfo:provider is null ");
                return;
            }
            return;
        }
        String bundleNetUrl = r1dVarB.getBundleNetUrl(vwr.g().f(yRNBundleRequestBean.getAppName()));
        if (TextUtils.isEmpty(bundleNetUrl)) {
            if (f1dVar != null) {
                f1dVar.onFailure(-1, "YRNNetDefaultOkhttpImpl.getNetBundleInfo:url is Empty ");
            }
            zxr.b("YRN_YRNV3_SDK", "YRNNetDefaultOkhttpImpl.getNetBundleInfo: url is Empty!");
        } else {
            q1d q1dVarA = a(r1dVarB);
            this.f16077a.d(bundleNetUrl, q1dVarA.getRequestStrFromBean(yRNBundleRequestBean), new a(yRNBundleRequestBean, q1dVarA, f1dVar));
        }
    }

    @Override // defpackage.s1d
    public List<YRNBundleInfo> parseBuiltinBundleInfoJson(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            zxr.b("YRN_YRNV3_SDK", "YRNNetDefaultOkhttpImpl.parseBuiltinBundleInfoJson:assetsJsonFile is Empty");
            return null;
        }
        try {
            long jNanoTime = System.nanoTime();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(vwr.g().a().getAssets().open(str2)));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
            zxr.a("YRN_YRNV3_SDK", "YRNNetDefaultOkhttpImpl.parseBuiltinBundleInfoJson:spend:" + (System.nanoTime() - jNanoTime) + " ns");
            ezr.c().f(YRNTraceEvent.newEvent(str, 1100, "parseBuiltinBundleInfoJson", null, sb.toString()));
            r1d r1dVarB = b(str);
            if (r1dVarB != null) {
                return a(r1dVarB).getAssetsBuiltinBundle(sb.toString());
            }
        } catch (IOException e) {
            ezr.c().f(YRNTraceEvent.newEvent(str, 1100, "parseBuiltinBundleInfoJson", null, "exception is " + e));
            e.printStackTrace();
        }
        return null;
    }
}
