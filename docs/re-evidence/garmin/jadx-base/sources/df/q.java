package df;

import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final class q {
    static {
        ue.u.b("ProcessUtils");
    }

    public static final boolean a(Context context, androidx.work.a aVar) {
        context.getClass();
        aVar.getClass();
        a.f59390a.getClass();
        String processName = Application.getProcessName();
        processName.getClass();
        return processName.equals(context.getApplicationInfo().processName);
    }
}
