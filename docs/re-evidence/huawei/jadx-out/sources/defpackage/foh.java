package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.health.knit.bff.BFFApi;
import com.huawei.health.knit.bff.impl.IResourceRequestCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import health.compact.a.GRSManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class foh implements BFFApi {
    private JSONObject d;
    private String e;

    @Override // com.huawei.health.knit.bff.BFFApi
    public void getPageResource(List<Integer> list, boolean z, IResourceRequestCallback iResourceRequestCallback) {
        if (njy.e(list)) {
            LogUtil.j("BFFImpl", "resPosIdList is null.");
            return;
        }
        if (iResourceRequestCallback == null) {
            LogUtil.j("BFFImpl", "param is invalid.");
            return;
        }
        JSONObject jSONObjectD = fof.d();
        JSONObject jSONObject = this.d;
        if (jSONObject != null) {
            try {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObjectD.put(next, this.d.get(next));
                }
            } catch (JSONException unused) {
                LogUtil.e("BFFImpl", "JSONException");
            }
        }
        if (this.e == null) {
            this.e = b();
        }
        LogUtil.a("BFFImpl", "mUrl: " + this.e + ", requestBody: " + jSONObjectD.toString());
        d(jSONObjectD, z, iResourceRequestCallback);
    }

    private String b() {
        return GRSManager.c(BaseApplication.getContext()).getUrl("knitRequest") + "/functions/2PioDjylqtMakeB6DPy3Ij/yogarequest";
    }

    @Override // com.huawei.health.knit.bff.BFFApi
    public void setExtraRequestArgs(JSONObject jSONObject) {
        this.d = jSONObject;
    }

    private void d(JSONObject jSONObject, boolean z, final IResourceRequestCallback iResourceRequestCallback) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        Map<String, String> mapA = fof.a();
        LogUtil.a("BFFImpl", "headers: ", mapA.toString());
        String string = jSONObject.toString();
        if (!z) {
            LogUtil.a("BFFImpl", "not use cache");
            oet.d().c(this.e, mapA, string, String.class, new ResultCallback<String>() { // from class: foh.4
                @Override // com.huawei.networkclient.ResultCallback
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void onSuccess(String str) {
                    LogUtil.a("BFFImpl", "post request onSuccess, bff post time: ", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                    try {
                        if (str == null) {
                            iResourceRequestCallback.onFailure(5001, "data is null");
                        } else {
                            iResourceRequestCallback.onSuccess(new JSONObject(str));
                        }
                    } catch (JSONException unused) {
                        iResourceRequestCallback.onFailure(5002, "JSONException");
                    }
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    LogUtil.a("BFFImpl", "post request onFail, bff post time: ", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                    iResourceRequestCallback.onFailure(5003, th.getMessage());
                }
            });
            return;
        }
        LogUtil.a("BFFImpl", "use cache");
        String strB = lsp.b(com.huawei.haf.application.BaseApplication.b(), this.e + string);
        LogUtil.a("BFFImpl", this.e, ", md5 = ", strB);
        oet.d().b(this.e, mapA, jSONObject.toString(), String.class, new ResultCallback<ofg<String>>() { // from class: foh.5
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(ofg<String> ofgVar) {
                LogUtil.a("BFFImpl", "post request onSuccess, bff post time: ", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                LogUtil.d("BFFImpl", "source from = ", Integer.valueOf(ofgVar.d()));
                try {
                    String strC = ofgVar.c();
                    if (TextUtils.isEmpty(strC)) {
                        iResourceRequestCallback.onFailure(5001, "data is null");
                    } else {
                        iResourceRequestCallback.onSuccess(new JSONObject(strC));
                    }
                } catch (JSONException unused) {
                    iResourceRequestCallback.onFailure(5002, "JSONException");
                }
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.a("BFFImpl", "post request onFailure, bff post time: ", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                iResourceRequestCallback.onFailure(5003, th.getMessage());
            }
        }, new foe().d(strB));
    }
}
