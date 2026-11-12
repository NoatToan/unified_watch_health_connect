package eg2;

import android.app.Notification;
import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public interface a {
    Notification a(Context context, b bVar);

    default Notification b(Context context, b bVar) {
        context.getClass();
        bVar.getClass();
        return null;
    }
}
