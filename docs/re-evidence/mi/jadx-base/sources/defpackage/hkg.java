package defpackage;

import android.text.TextUtils;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.smarthome.device.api.Callback;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnPluginLog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class hkg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile hkg f20166a;

    public class a implements Callback<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f20167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.facebook.react.bridge.Callback f20168b;
        public final /* synthetic */ String c;

        public a(long j, com.facebook.react.bridge.Callback callback, String str) {
            this.f20167a = j;
            this.f20168b = callback;
            this.c = str;
        }

        @Override // com.xiaomi.smarthome.device.api.Callback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            JSONObject jSONObjectD = hkg.this.d(str, this.f20167a);
            com.facebook.react.bridge.Callback callback = this.f20168b;
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.TRUE;
            if (jSONObjectD != null) {
                str = jSONObjectD.toString();
            }
            objArr[1] = str;
            callback.invoke(objArr);
        }

        @Override // com.xiaomi.smarthome.device.api.Callback
        public void onFailure(int i, String str) {
            RnPluginLog.w("request : " + this.c + " error " + str);
            JSONObject jSONObjectD = hkg.this.d(null, this.f20167a);
            com.facebook.react.bridge.Callback callback = this.f20168b;
            Object[] objArr = new Object[4];
            objArr[0] = Boolean.FALSE;
            objArr[1] = Integer.valueOf(i);
            objArr[2] = str;
            objArr[3] = jSONObjectD != null ? jSONObjectD.toString() : null;
            callback.invoke(objArr);
        }
    }

    public static hkg c() {
        if (f20166a == null) {
            synchronized (hkg.class) {
                try {
                    if (f20166a == null) {
                        f20166a = new hkg();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f20166a;
    }

    public void b(String str, String str2, String str3, com.facebook.react.bridge.Callback callback) {
        ujg.e().c(str, str2, str3, new a(System.currentTimeMillis(), callback, str2), yuk.f40583a);
    }

    public final JSONObject d(String str, long j) {
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StatConstants.PARAM_START, j);
            jSONObject.put("duration", jCurrentTimeMillis);
            JSONObject jSONObject2 = !TextUtils.isEmpty(str) ? new JSONObject(str) : new JSONObject();
            jSONObject2.put("__api_info", jSONObject);
            return jSONObject2;
        } catch (JSONException unused) {
            return null;
        }
    }
}
