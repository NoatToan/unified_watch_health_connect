package defpackage;

import android.text.TextUtils;
import com.xiaomi.yrn.env.entity.bundleload.load.YRNNetworkLoadRequest;

/* JADX INFO: loaded from: classes2.dex */
public class eyr implements n1d<YRNNetworkLoadRequest> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1d f17202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17203b = "YRN_YRNV3_SDK";

    public class a implements f1d<sur> {
        public a() {
        }

        @Override // defpackage.f1d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(sur surVar) {
            zxr.a("YRN_YRNV3_SDK", "YRNNetworkLoader.load:download success");
        }

        @Override // defpackage.f1d
        public void onFailure(int i, String str) {
            zxr.b("YRN_YRNV3_SDK", "YRNNetworkLoader.load:download fail,code is " + i + ",message is " + str);
        }
    }

    public eyr(s1d s1dVar) {
        this.f17202a = s1dVar;
    }

    public boolean b(YRNNetworkLoadRequest yRNNetworkLoadRequest) throws Exception {
        zxr.a("YRN_YRNV3_SDK", "YRNNetworkLoader.load: " + yRNNetworkLoadRequest);
        String module = yRNNetworkLoadRequest.getModule();
        if (TextUtils.isEmpty(module)) {
            throw new Exception("YRNNetworkLoader.load:request.getModule() == null");
        }
        if (yxr.d(yRNNetworkLoadRequest.getAppName(), module)) {
            boolean zDownloadBundle = this.f17202a.downloadBundle(yRNNetworkLoadRequest, new a());
            yxr.f(yRNNetworkLoadRequest.getAppName(), module);
            return zDownloadBundle;
        }
        throw new Exception("YRNNetworkLoader.load:LockHelper.lockModule: " + module + " failed");
    }
}
