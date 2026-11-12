package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.miui.tsmclient.entity.VersionControlInfo;
import com.miui.tsmclient.net.AuthApiException;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.net.TSMAuthManager;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.PrefUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class fns {
    public static volatile fns f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public koo f17973b;
    public koo c;
    public VersionControlInfo e;
    public Map<String, Boolean> d = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TSMAuthManager f17972a = new TSMAuthManager();

    public class a implements zta<VersionControlInfo, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f17974a;

        public a(String str) {
            this.f17974a = str;
        }

        @Override // defpackage.zta
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(VersionControlInfo versionControlInfo) {
            return Boolean.valueOf(versionControlInfo != null && TextUtils.equals(this.f17974a, versionControlInfo.mServiceName));
        }
    }

    public class b implements zta<JSONObject, p4h<VersionControlInfo>> {

        public class a extends TypeToken<ArrayList<VersionControlInfo>> {
            public a() {
            }
        }

        public b() {
        }

        @Override // defpackage.zta
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p4h<VersionControlInfo> call(JSONObject jSONObject) {
            LogUtils.d("queryAllServiceProtocol api response: " + jSONObject);
            if (jSONObject == null || !jSONObject.has("protocols")) {
                return p4h.c();
            }
            try {
                return p4h.f((List) new Gson().fromJson(jSONObject.getJSONArray("protocols").toString(), new a().getType()));
            } catch (Exception e) {
                LogUtils.e("queryAllServiceProtocol response parse failed!", e);
                return p4h.c();
            }
        }
    }

    public class c implements Callable<JSONObject> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f17978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f17979b;
        public final /* synthetic */ TSMAuthContants.ActionType c;

        public c(Context context, String str, TSMAuthContants.ActionType actionType) {
            this.f17978a = context;
            this.f17979b = str;
            this.c = actionType;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public JSONObject call() throws Exception {
            return fns.this.f17972a.queryAllServiceProtocol(this.f17978a, this.f17979b, this.c);
        }
    }

    public class d implements a6h<VersionControlInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f17980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f17981b;

        public d(String str, h hVar) {
            this.f17980a = str;
            this.f17981b = hVar;
        }

        @Override // defpackage.a6h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(VersionControlInfo versionControlInfo) {
            LogUtils.d("queryAllServiceProtocol onNext called!");
            if (this.f17981b != null) {
                fns.this.i(versionControlInfo);
                this.f17981b.onSuccess(versionControlInfo);
                fns.this.k(this.f17980a, true);
            }
        }

        @Override // defpackage.a6h
        public void onCompleted() {
            LogUtils.d("queryAllServiceProtocol onCompleted called!");
            if (fns.this.m(this.f17980a)) {
                return;
            }
            this.f17981b.onFailure(-2);
            fns.this.d.clear();
        }

        @Override // defpackage.a6h
        public void onError(Throwable th) {
            LogUtils.e("queryAllServiceProtocol onError called! throwable:" + th);
            fns.this.k(this.f17980a, true);
            h hVar = this.f17981b;
            if (hVar != null) {
                hVar.onFailure(Integer.valueOf(th instanceof AuthApiException ? ((AuthApiException) th).mErrorCode : -1));
            }
        }
    }

    public class e implements zta<JSONObject, Boolean> {
        public e() {
        }

        @Override // defpackage.zta
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(JSONObject jSONObject) {
            return Boolean.TRUE;
        }
    }

    public class f implements Callable<JSONObject> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f17983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f17984b;
        public final /* synthetic */ String c;

        public f(Context context, long j, String str) {
            this.f17983a = context;
            this.f17984b = j;
            this.c = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public JSONObject call() throws Exception {
            return fns.this.f17972a.confirmProtocolVersion(this.f17983a, this.f17984b, this.c);
        }
    }

    public class g implements a6h<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f17985a;

        public g(h hVar) {
            this.f17985a = hVar;
        }

        @Override // defpackage.a6h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(Boolean bool) {
            h hVar;
            LogUtils.d("confirmProtocolVersion onNext called!");
            if (!bool.booleanValue() || (hVar = this.f17985a) == null) {
                return;
            }
            hVar.onSuccess(null);
        }

        @Override // defpackage.a6h
        public void onCompleted() {
            LogUtils.d("confirmProtocolVersion onCompleted called!");
        }

        @Override // defpackage.a6h
        public void onError(Throwable th) {
            LogUtils.e("confirmProtocolVersion onError called! throwable:" + th);
            if (th instanceof AuthApiException) {
                AuthApiException authApiException = (AuthApiException) th;
                h hVar = this.f17985a;
                if (hVar != null) {
                    hVar.onFailure(Integer.valueOf(authApiException.mErrorCode));
                }
            }
        }
    }

    public interface h {
        void onFailure(Integer num);

        void onSuccess(VersionControlInfo versionControlInfo);
    }

    public static long a(Context context, String str) {
        return PrefUtils.getLong(context, PrefUtils.PREF_KEY_VERSION_CONTROL_ID + str, 0L);
    }

    public static fns c() {
        if (f == null) {
            synchronized (fns.class) {
                try {
                    if (f == null) {
                        f = new fns();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    public static String d(long j) {
        if (j <= 0) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("user_protocol_id", j);
            return jSONObject.toString();
        } catch (JSONException e2) {
            LogUtils.e("upload phone number failed with an JSONException", e2);
            return "";
        }
    }

    public static void o(Context context, String str, long j) {
        PrefUtils.putLong(context, PrefUtils.PREF_KEY_VERSION_CONTROL_ID + str, j);
    }

    public void e(Context context, long j, h hVar) {
        f(context, j, hVar, "");
    }

    public void f(Context context, long j, h hVar, String str) {
        this.c = p4h.g(new f(context, j, str)).j(new e()).y(pfl.c()).l(va1.b()).v(new g(hVar));
    }

    public void g(Context context, String str, long j) {
        e(context, j, null);
    }

    public void h(Context context, String str, TSMAuthContants.ActionType actionType, h hVar) {
        this.f17973b = p4h.g(new c(context, str, actionType)).e(new b()).d(new a(str)).y(pfl.c()).l(va1.b()).v(new d("key_match_" + str, hVar));
    }

    public void i(VersionControlInfo versionControlInfo) {
        this.e = versionControlInfo;
    }

    public final void k(String str, boolean z) {
        if (this.d == null) {
            this.d = new HashMap();
        }
        this.d.put(str, Boolean.valueOf(z));
    }

    public final boolean m(String str) {
        Boolean bool;
        Map<String, Boolean> map = this.d;
        if (map == null || (bool = map.get(str)) == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
