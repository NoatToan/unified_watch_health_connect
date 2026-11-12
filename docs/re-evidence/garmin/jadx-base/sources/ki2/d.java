package ki2;

import com.google.firebase.perf.util.Constants;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lki2/d;", "Lki2/e;", "<init>", "()V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hi2.d f104921a;

    static {
        new a(null);
        f104921a = new hi2.d("DSL-CustomStrideLengthDataTransform", null, 2, null);
    }

    public static JSONObject a() throws JSONException {
        f104921a.getClass();
        JSONObject jSONObject = new JSONObject();
        Object obj = JSONObject.NULL;
        jSONObject.put("unitKey", obj);
        jSONObject.put("userID", obj);
        jSONObject.put("distance", obj);
        jSONObject.put("steps", obj);
        jSONObject.put("stepLength", obj);
        return jSONObject;
    }

    @Override // ki2.e
    public final String decode(String str) {
        JSONObject jSONObject;
        hi2.d dVar = f104921a;
        try {
            Object obj = new JSONObject(str).get("walking");
            try {
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) obj;
                if (jSONObject != null) {
                    if (!jSONObject.optBoolean(Constants.ENABLE_DISABLE, false)) {
                        String string = a().toString();
                        string.getClass();
                        return string;
                    }
                    double dOptDouble = jSONObject.optDouble("distance", -1.0d);
                    double dOptDouble2 = jSONObject.optDouble("steps", -1.0d);
                    if (dOptDouble <= 0.0d || dOptDouble2 <= 0.0d) {
                        String string2 = a().toString();
                        string2.getClass();
                        return string2;
                    }
                    jSONObject.put("stepLength", dOptDouble / dOptDouble2);
                }
                if (jSONObject != null) {
                    jSONObject.remove(Constants.ENABLE_DISABLE);
                }
                dVar.getClass();
                return String.valueOf(jSONObject);
            } catch (ClassCastException unused) {
                jSONObject = null;
            }
        } catch (ConcurrentModificationException e4) {
            e4.toString();
            dVar.getClass();
            return str;
        } catch (JSONException e14) {
            e14.toString();
            dVar.getClass();
            return str;
        }
    }

    @Override // ki2.e
    public final String encode(String str) {
        hi2.d dVar = f104921a;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject(str);
            Iterator<String> itKeys = jSONObject2.keys();
            itKeys.getClass();
            while (itKeys.hasNext()) {
                if (jSONObject2.isNull(itKeys.next())) {
                    jSONObject2.put(Constants.ENABLE_DISABLE, false);
                    if (jSONObject2.isNull("unitKey")) {
                        jSONObject2.put("unitKey", "meter");
                    }
                    jSONObject.put("walking", jSONObject2);
                    String string = jSONObject.toString();
                    string.getClass();
                    return string;
                }
            }
            jSONObject2.put(Constants.ENABLE_DISABLE, true);
            jSONObject.put("walking", jSONObject2);
            dVar.getClass();
            String string2 = jSONObject.toString();
            string2.getClass();
            return string2;
        } catch (ConcurrentModificationException e4) {
            e4.toString();
            dVar.getClass();
            return str;
        } catch (JSONException e14) {
            e14.toString();
            dVar.getClass();
            return str;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lki2/d$a;", "", "<init>", "()V", "", "DEFAULT_UNIT_KEY_VALUE", "Ljava/lang/String;", "DISTANCE_KEY", "IS_ENABLED_KEY", "RUNNING_KEY", "STEPS_KEY", "STEP_LENGTH_KEY", "UNIT_KEY", "USER_ID", "WALKING_KEY", "Lhi2/d;", "logger", "Lhi2/d;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
