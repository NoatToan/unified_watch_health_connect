package ki2;

import ch.qos.logback.classic.Logger;
import java.util.ConcurrentModificationException;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lki2/c;", "Lki2/e;", "<init>", "()V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hi2.d f104920a = new hi2.d("DSL-CriticalSwimSpeedDataTransform", hi2.e.CSS.f83902a);

    static {
        new a(null);
    }

    @Override // ki2.e
    public final String decode(String str) {
        hi2.d dVar = this.f104920a;
        if (str.length() != 0) {
            DateTime dateTimeNow = DateTime.now();
            hi2.b.f83885a.getClass();
            String strA = hi2.b.a.a(dateTimeNow, null);
            String strA2 = hi2.b.a.a(dateTimeNow, DateTimeZone.UTC);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("version", (Object) null);
                hi2.a.f83879a.getClass();
                Double dG = hi2.a.C1658a.g(str);
                jSONObject.put("criticalSwimSpeed", dG != null ? dG.doubleValue() : 0.0d);
                jSONObject.put("measurementTimestampLocal", strA);
                jSONObject.put("measurementTimestampGMT", strA2);
                jSONObject.put("biometricSourceType", "MANUAL");
                dVar.getClass();
                String string = jSONObject.toString();
                string.getClass();
                return string;
            } catch (ConcurrentModificationException e4) {
                e4.toString();
                dVar.getClass();
            } catch (JSONException e14) {
                e14.toString();
                dVar.getClass();
            }
        }
        return str;
    }

    @Override // ki2.e
    public final String encode(String str) {
        hi2.d dVar = this.f104920a;
        try {
            JSONObject jSONObject = new JSONObject(str);
            dVar.getClass();
            return String.valueOf(jSONObject.optDouble("criticalSwimSpeed"));
        } catch (ConcurrentModificationException e4) {
            e4.toString();
            Logger logger = hi2.d.f83889c;
            dVar.getClass();
            return str;
        } catch (JSONException e14) {
            e14.toString();
            Logger logger2 = hi2.d.f83889c;
            dVar.getClass();
            return str;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lki2/c$a;", "", "<init>", "()V", "", "CRITICAL_SWIM_SPEED", "Ljava/lang/String;", "DATE_TIME_PATTERN", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
