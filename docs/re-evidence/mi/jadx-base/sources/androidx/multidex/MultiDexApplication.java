package androidx.multidex;

import android.app.Application;
import android.content.Context;
import defpackage.z9g;

/* JADX INFO: loaded from: classes.dex */
public class MultiDexApplication extends Application {
    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        z9g.l(this);
    }
}
