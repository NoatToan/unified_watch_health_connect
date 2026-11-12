package com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import aq.b0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.workouts.data.model.h0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import i3.e5;
import java.util.ArrayList;
import k32.k;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\bB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/multisports/i;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/multisports/i$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/multisports/i$a;)V", "b", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f49203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f49204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f49205c;

    public interface a {
        void C5(int i14);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/multisports/i$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f49206a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view2) {
            super(view2);
            view2.getClass();
            this.f49206a = new k(view2);
        }
    }

    public i(a aVar) {
        aVar.getClass();
        this.f49203a = aVar;
        this.f49205c = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f49205c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        String string;
        f0Var.getClass();
        if (f0Var instanceof b) {
            m52.k kVar = ((h0) this.f49205c.get(i14)).f48193h;
            bv.b.f21239a.getClass();
            bv.b.a();
            boolean zL0 = k1.f37122a.l0();
            Context context = this.f49204b;
            if (context == null) {
                s.m(CoreConstants.CONTEXT_SCOPE_VALUE);
                throw null;
            }
            String string2 = context.getString(R.string.lbl_workout_leg_number, String.valueOf(i14 + 1));
            string2.getClass();
            m52.k kVar2 = m52.k.A;
            Context context2 = this.f49204b;
            if (kVar == kVar2) {
                if (context2 == null) {
                    s.m(CoreConstants.CONTEXT_SCOPE_VALUE);
                    throw null;
                }
                string = context2.getString(R.string.lbl_workout_choose_leg);
            } else {
                if (context2 == null) {
                    s.m(CoreConstants.CONTEXT_SCOPE_VALUE);
                    throw null;
                }
                string = context2.getString(kVar.d(zL0));
            }
            string.getClass();
            k.a(((b) f0Var).f49206a, string2, string);
            f0Var.itemView.setOnClickListener(new b0(this, i14, 5));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        View viewE = e5.e(viewGroup, R.layout.gcm_list_item, viewGroup, false);
        Context context = viewGroup.getContext();
        context.getClass();
        this.f49204b = context;
        viewE.getClass();
        return new b(viewE);
    }

    public final ArrayList r() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f49205c) {
            if (((h0) obj).f48193h != m52.k.A) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
