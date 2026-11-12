package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class j0 implements Transition.TransitionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f7277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f7278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f7280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f7282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i0 f7283g;

    public j0(i0 i0Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.f7283g = i0Var;
        this.f7277a = obj;
        this.f7278b = arrayList;
        this.f7279c = obj2;
        this.f7280d = arrayList2;
        this.f7281e = obj3;
        this.f7282f = arrayList3;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        i0 i0Var = this.f7283g;
        Object obj = this.f7277a;
        if (obj != null) {
            i0Var.A(obj, this.f7278b, null);
        }
        Object obj2 = this.f7279c;
        if (obj2 != null) {
            i0Var.A(obj2, this.f7280d, null);
        }
        Object obj3 = this.f7281e;
        if (obj3 != null) {
            i0Var.A(obj3, this.f7282f, null);
        }
    }
}
