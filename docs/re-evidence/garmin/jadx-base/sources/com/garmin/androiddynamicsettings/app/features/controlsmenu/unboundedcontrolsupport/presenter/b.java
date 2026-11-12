package com.garmin.androiddynamicsettings.app.features.controlsmenu.unboundedcontrolsupport.presenter;

import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import p005kotlin.Metadata;
import r0.h;
import th2.c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/androiddynamicsettings/app/features/controlsmenu/unboundedcontrolsupport/presenter/b;", "Landroidx/recyclerview/widget/s$d;", "Landroid/app/Activity;", "activity", "Lcom/garmin/androiddynamicsettings/app/features/controlsmenu/unboundedcontrolsupport/presenter/b$a;", "helperAdapter", "<init>", "(Landroid/app/Activity;Lcom/garmin/androiddynamicsettings/app/features/controlsmenu/unboundedcontrolsupport/presenter/b$a;)V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b extends s.d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f50625f = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Activity f50626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f50627e;

    public interface a {
        void b(int i14, int i15);

        void d(c cVar);

        void p(c cVar);
    }

    public b(Activity activity, a aVar) {
        activity.getClass();
        aVar.getClass();
        this.f50626d = activity;
        this.f50627e = aVar;
    }

    @Override // androidx.recyclerview.widget.s.d
    public final void b(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
        recyclerView.getClass();
        f0Var.getClass();
        super.b(recyclerView, f0Var);
        if (f0Var instanceof c) {
            this.f50626d.runOnUiThread(new h(13, this, f0Var));
        }
    }

    @Override // androidx.recyclerview.widget.s.d
    public final int g(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
        recyclerView.getClass();
        f0Var.getClass();
        if (f0Var.getItemViewType() == 0) {
            return s.d.k(3, 0);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.s.d
    public final boolean i() {
        return false;
    }

    @Override // androidx.recyclerview.widget.s.d
    public final boolean j() {
        return true;
    }

    @Override // androidx.recyclerview.widget.s.d
    public final boolean m(RecyclerView recyclerView, RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2) {
        recyclerView.getClass();
        f0Var.getClass();
        this.f50627e.b(f0Var.getAdapterPosition(), f0Var2.getAdapterPosition());
        return true;
    }

    @Override // androidx.recyclerview.widget.s.d
    public final void n(int i14, RecyclerView.f0 f0Var) {
        if (f0Var instanceof c) {
            this.f50627e.d((c) f0Var);
        }
        super.n(i14, f0Var);
    }

    @Override // androidx.recyclerview.widget.s.d
    public final void o(int i14, RecyclerView.f0 f0Var) {
        f0Var.getClass();
    }
}
