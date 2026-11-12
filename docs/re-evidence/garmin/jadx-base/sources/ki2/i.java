package ki2;

import java.util.ConcurrentModificationException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lki2/i;", "Lki2/e;", "<init>", "()V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hi2.d f104927a;

    static {
        new a(null);
        f104927a = new hi2.d("DSL-GoalsDataTransform", null, 2, null);
    }

    @Override // ki2.e
    public final String decode(String str) {
        hi2.d dVar = f104927a;
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = new JSONArray();
            if (jSONObject.has("intensityMinutes")) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("goalType", "INTENSITY_MINUTES");
                jSONObject2.put("goalValue", jSONObject.getDouble("intensityMinutes"));
                jSONArray.put(jSONObject2);
            }
            if (jSONObject.has("floorsClimbed")) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("goalType", "FLOORS_CLIMBED");
                jSONObject3.put("goalValue", jSONObject.getDouble("floorsClimbed"));
                jSONArray.put(jSONObject3);
            }
            if (jSONObject.has("hydration")) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("goalType", "HYDRATION");
                jSONObject4.put("goalValue", jSONObject.getDouble("hydration"));
                jSONArray.put(jSONObject4);
            }
            dVar.getClass();
            String string = jSONArray.toString();
            string.getClass();
            return string;
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
        hi2.d dVar = f104927a;
        try {
            JSONArray jSONArray = new JSONArray(str);
            JSONObject jSONObject = new JSONObject();
            int length = jSONArray.length();
            for (int i14 = 0; i14 < length; i14++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i14);
                String string = jSONObject2.getString("goalType");
                double d14 = jSONObject2.getDouble("goalValue");
                if (string != null) {
                    int iHashCode = string.hashCode();
                    if (iHashCode != 542156700) {
                        if (iHashCode != 1645982867) {
                            if (iHashCode == 1834497238 && string.equals("HYDRATION")) {
                                jSONObject.put("hydration", d14);
                            }
                        } else if (string.equals("INTENSITY_MINUTES")) {
                            jSONObject.put("intensityMinutes", d14);
                        }
                    } else if (string.equals("FLOORS_CLIMBED")) {
                        jSONObject.put("floorsClimbed", d14);
                    }
                }
            }
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

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lki2/i$a;", "", "<init>", "()V", "", "FLOORS_CLIMBED", "Ljava/lang/String;", "FLOORS_CLIMBED_SRVR", "GOALS", "GOAL_TYPE", "GOAL_VALUE", "HYDRATION", "HYDRATION_SRVR", "INTENSITY_MINUTES", "INTENSITY_MINUTES_SRVR", "Lhi2/d;", "logger", "Lhi2/d;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
