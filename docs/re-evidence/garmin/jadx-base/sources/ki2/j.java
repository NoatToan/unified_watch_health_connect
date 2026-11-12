package ki2;

import java.util.ConcurrentModificationException;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lki2/j;", "Lki2/e;", "<init>", "()V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hi2.d f104928a;

    static {
        new a(null);
        f104928a = new hi2.d("DSL-StepsDataTransform", null, 2, null);
    }

    @Override // ki2.e
    public final String decode(String str) {
        hi2.d dVar = f104928a;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optBoolean("isAutoGoalEnabled")) {
                jSONObject.put("userGoal", 0);
            }
            jSONObject.remove("isAutoGoalEnabled");
            dVar.getClass();
            String string = jSONObject.toString();
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
        hi2.d dVar = f104928a;
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.put("isAutoGoalEnabled", jSONObject.optInt("userGoal") == 0);
            dVar.getClass();
            String string = jSONObject.toString();
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

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lki2/j$a;", "", "<init>", "()V", "", "AUTO_ENABLED_KEY", "Ljava/lang/String;", "DEVICE_GOAL", "STEPS", "USER_GOAL", "Lhi2/d;", "logger", "Lhi2/d;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
