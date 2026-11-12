package yr2;

import android.app.Activity;
import android.content.Intent;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public static void a(Activity activity, k23.d dVar, Map map) {
        dVar.getClass();
        Intent intent = new Intent(activity, (Class<?>) dh.b.u(dVar));
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Long) {
                intent.putExtra(str, ((Number) value).longValue());
            } else if (value instanceof String) {
                intent.putExtra(str, (String) value);
            } else if (value instanceof Boolean) {
                intent.putExtra(str, ((Boolean) value).booleanValue());
            } else if (value instanceof Integer) {
                intent.putExtra(str, ((Number) value).intValue());
            }
        }
        activity.startActivity(intent);
    }
}
