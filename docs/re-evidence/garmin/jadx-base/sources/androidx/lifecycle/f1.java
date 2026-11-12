package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/lifecycle/f1;", "Landroidx/lifecycle/s;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityPreCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityCreated", "onActivityPaused", "(Landroid/app/Activity;)V", "onActivityStopped", "lifecycle-process"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f1 extends s {
    final /* synthetic */ e1 this$0;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/lifecycle/f1$a", "Landroidx/lifecycle/s;", "Landroid/app/Activity;", "activity", "", "onActivityPostStarted", "(Landroid/app/Activity;)V", "onActivityPostResumed", "lifecycle-process"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends s {
        final /* synthetic */ e1 this$0;

        public a(e1 e1Var) {
            this.this$0 = e1Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            e1 e1Var = this.this$0;
            int i14 = e1Var.f7876a + 1;
            e1Var.f7876a = i14;
            if (i14 == 1 && e1Var.f7879d) {
                e1Var.f7881f.g(b0.a.ON_START);
                e1Var.f7879d = false;
            }
        }
    }

    public f1(e1 e1Var) {
        this.this$0 = e1Var;
    }

    @Override // androidx.lifecycle.s, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            i1.f7938b.getClass();
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            fragmentFindFragmentByTag.getClass();
            ((i1) fragmentFindFragmentByTag).f7939a = this.this$0.f7883h;
        }
    }

    @Override // androidx.lifecycle.s, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        e1 e1Var = this.this$0;
        int i14 = e1Var.f7877b - 1;
        e1Var.f7877b = i14;
        if (i14 == 0) {
            Handler handler = e1Var.f7880e;
            handler.getClass();
            handler.postDelayed(e1Var.f7882g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle savedInstanceState) {
        activity.getClass();
        e1.a.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.s, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        e1 e1Var = this.this$0;
        int i14 = e1Var.f7876a - 1;
        e1Var.f7876a = i14;
        if (i14 == 0 && e1Var.f7878c) {
            e1Var.f7881f.g(b0.a.ON_STOP);
            e1Var.f7879d = true;
        }
    }
}
