package defpackage;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.miui.tsmclient.model.ErrorCode;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
@TargetApi(14)
public class k3s implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set<String> f23403a = new HashSet();

    public static void a(Application application) {
        application.registerActivityLifecycleCallbacks(new k3s());
    }

    public static void b(Context context) {
        a((Application) context.getApplicationContext());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("messageId");
        int intExtra = intent.getIntExtra("eventMessageType", -1);
        if (TextUtils.isEmpty(stringExtra) || intExtra <= 0 || this.f23403a.contains(stringExtra)) {
            return;
        }
        this.f23403a.add(stringExtra);
        if (intExtra == 3000) {
            oss.a(activity.getApplicationContext()).g(activity.getPackageName(), mss.j(intExtra), stringExtra, ErrorCode.APPLY_TIMES_EXCEED_LIMIT, null);
        } else if (intExtra == 1000) {
            oss.a(activity.getApplicationContext()).g(activity.getPackageName(), mss.j(intExtra), stringExtra, 1008, null);
        }
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
