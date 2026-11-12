package ki2;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lki2/b;", "Lki2/e;", "<init>", "()V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hi2.d f104919a;

    static {
        new a(null);
        f104919a = new hi2.d("DSL-ControlsMenuResetDataTransform", null, 2, null);
    }

    @Override // ki2.e
    public final String decode(String str) {
        return str;
    }

    @Override // ki2.e
    public final String encode(String str) {
        hi2.d dVar = f104919a;
        try {
            JSONArray jSONArray = new JSONArray(str);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("controlsMenuReset", jSONArray);
            dVar.getClass();
            String string = jSONObject.toString();
            string.getClass();
            return string;
        } catch (JSONException e4) {
            dVar.b("encode failed with " + e4 + ".");
            return "";
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lki2/b$a;", "", "<init>", "()V", "", "CONTROLS_MENU_RESET", "Ljava/lang/String;", "Lhi2/d;", "logger", "Lhi2/d;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
