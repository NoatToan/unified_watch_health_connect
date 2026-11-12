package miuix.appcompat.app.floatingactivity;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.c;
import defpackage.nfe;
import miuix.appcompat.app.AppCompatActivity;

/* JADX INFO: loaded from: classes3.dex */
public class FloatingLifecycleObserver implements nfe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f26340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26341b;

    public FloatingLifecycleObserver(AppCompatActivity appCompatActivity) {
        this.f26340a = appCompatActivity.getActivityIdentity();
        this.f26341b = appCompatActivity.getTaskId();
    }

    public String a() {
        return this.f26340a;
    }

    public int b() {
        return this.f26341b;
    }

    @c(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
    }

    @c(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
    }

    @c(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
    }

    @c(Lifecycle.Event.ON_RESUME)
    public void onResume() {
    }
}
