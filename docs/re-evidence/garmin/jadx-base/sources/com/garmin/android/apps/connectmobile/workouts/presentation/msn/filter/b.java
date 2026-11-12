package com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.m;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;
import d10.k;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/filter/b;", "Ld10/i;", "Lj62/d;", "<init>", "()V", "a", "b", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends d10.i<j62.d> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f49513c = new a(null);

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/filter/b$b;", "Ld10/k;", "Lj62/d;", "filterData", "<init>", "(Lj62/d;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0977b extends k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j62.d f49514b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0977b(j62.d dVar) {
            super(u.M(j62.b.values(), dVar.f97419k));
            dVar.getClass();
            this.f49514b = dVar;
        }

        @Override // d10.k
        public final int u() {
            return j62.b.f97406i.getF134973e();
        }

        @Override // d10.k
        public final void x(d10.h.a aVar, int i14) {
            aVar.getClass();
            if (i14 == -1) {
                return;
            }
            j62.b bVar = (j62.b) j62.b.f97406i.get(i14);
            GCMCheckableRow gCMCheckableRow = aVar.f57035a;
            Context context = gCMCheckableRow.getContext();
            context.getClass();
            bVar.getClass();
            String string = context.getString(bVar.f97408b);
            string.getClass();
            gCMCheckableRow.setDefaultText(string);
        }

        @Override // d10.k
        public final void z(int i14) {
            j62.d dVar = this.f49514b;
            if (i14 == -1) {
                dVar.d(null);
                return;
            }
            w13.c cVar = j62.b.f97406i;
            cVar.getClass();
            dVar.d(((j62.b[]) p005kotlin.jvm.internal.i.d(cVar, new j62.b[0]))[i14]);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m activity = getActivity();
        activity.getClass();
        ((com.garmin.android.apps.connectmobile.c) activity).initActionBar(true, R.string.lbl_msn_workouts_activity_type_filter);
    }

    @Override // d10.i
    public final RecyclerView.h u6() {
        Object objO = this.f57036a.O();
        objO.getClass();
        return new C0977b((j62.d) objO);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/filter/b$a;", "", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
