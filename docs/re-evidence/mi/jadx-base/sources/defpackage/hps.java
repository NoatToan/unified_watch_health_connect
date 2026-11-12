package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.xiaomi.push.id;
import com.xiaomi.push.ij;

/* JADX INFO: loaded from: classes11.dex */
public class hps implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f20326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f20327b;
    public Context c;

    public hps(Context context, String str) {
        this.c = context;
        this.f20326a = str;
    }

    public final void a(String str) {
        ij ijVar = new ij();
        ijVar.a(str);
        ijVar.a(System.currentTimeMillis());
        ijVar.a(id.ActivityActiveTimeStamp);
        yps.c(this.c, ijVar);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (TextUtils.isEmpty(this.f20326a) || TextUtils.isEmpty(localClassName)) {
            return;
        }
        this.f20327b = "";
        if (!TextUtils.isEmpty("") && !TextUtils.equals(this.f20327b, localClassName)) {
            this.f20326a = "";
            return;
        }
        a(this.c.getPackageName() + "|" + localClassName + ":" + this.f20326a + "," + String.valueOf(System.currentTimeMillis() / 1000));
        this.f20326a = "";
        this.f20327b = "";
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (TextUtils.isEmpty(this.f20327b)) {
            this.f20327b = activity.getLocalClassName();
        }
        this.f20326a = String.valueOf(System.currentTimeMillis() / 1000);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
