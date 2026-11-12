package dm2;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public class a extends com.garmin.android.library.backgroundtaskmanagement.b {
    public a(com.garmin.android.library.backgroundtaskmanagement.b.a aVar, Context context, long j8, String str) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.HIGH_PRIORITY, aVar);
        Context applicationContext = context.getApplicationContext();
        b(new b(this, j8, str));
        b(new d(this, j8));
        b(new c(this, applicationContext, false, null));
    }
}
