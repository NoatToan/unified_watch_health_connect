package com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.m;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;
import j02.r;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/filter/d;", "Ld10/i;", "Lj62/d;", "<init>", "()V", "a", "b", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends d10.i<j62.d> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f49517c = new a(null);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/filter/d$b;", "Ld10/f;", "Lj62/d;", "filterData", "<init>", "(Lj62/d;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends d10.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j62.d f49518b;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(j62.d dVar) {
            dVar.getClass();
            List<? extends com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.a> list = dVar.f97422n;
            com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.a.f49510c.getClass();
            com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.a[] aVarArr = (com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.a[]) com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.a.C0972a.a().toArray(new com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.a[0]);
            boolean[] zArr = new boolean[aVarArr.length];
            if (list != null) {
                int size = list.size();
                for (int i14 = 0; i14 < size; i14++) {
                    int iM = u.M(aVarArr, list.get(i14));
                    if (iM >= 0) {
                        zArr[iM] = true;
                    }
                }
            }
            super(zArr);
            this.f49518b = dVar;
        }

        @Override // d10.f
        public final void A(boolean[] zArr) {
            zArr.getClass();
            com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.a.f49510c.getClass();
            List listA = com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.a.C0972a.a();
            ArrayList arrayList = new ArrayList();
            int length = zArr.length;
            for (int i14 = 0; i14 < length; i14++) {
                if (zArr[i14]) {
                    arrayList.add(listA.get(i14));
                }
            }
            int size = arrayList.size();
            j62.d dVar = this.f49518b;
            if (size <= 0 || arrayList.size() == listA.size()) {
                dVar.g(null);
            } else {
                dVar.g(arrayList);
            }
        }

        @Override // d10.f
        public final void z(d10.h.a aVar, int i14) {
            String strA;
            aVar.getClass();
            GCMCheckableRow gCMCheckableRow = aVar.f57035a;
            if (i14 == -1) {
                return;
            }
            com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.a.f49510c.getClass();
            com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.a aVar2 = (com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.a) com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.a.C0972a.a().get(i14);
            Context context = gCMCheckableRow.getContext();
            context.getClass();
            int i15 = aVar2.f49511a;
            int i16 = aVar2.f49512b;
            gCMCheckableRow.setDefaultText(e.b(i15, i16, context));
            Context context2 = gCMCheckableRow.getContext();
            context2.getClass();
            int i17 = aVar2.f49511a;
            if (i17 == 0 && i16 == Integer.MAX_VALUE) {
                strA = context2.getString(R.string.common_all);
                strA.getClass();
            } else if (i17 == 61) {
                strA = oi0.c.A(context2, new r(11), context2.getString(R.string.msn_workout_duration_greater_than_value_interval, Integer.valueOf(i17 - 1)));
            } else if (i16 == 19) {
                strA = oi0.c.A(context2, new r(12), context2.getString(R.string.msn_workout_duration_less_than_value_interval, Integer.valueOf(i16 + 1)));
            } else if (i17 == 0) {
                strA = oi0.c.A(context2, new r(13), context2.getString(R.string.msn_workout_duration_less_than_equal_value_interval, Integer.valueOf(i16)));
            } else if (i16 == Integer.MAX_VALUE) {
                strA = oi0.c.A(context2, new r(14), context2.getString(R.string.msn_workout_duration_greater_than_equal_value_interval, Integer.valueOf(i17)));
            } else {
                strA = oi0.c.A(context2, new r(15), context2.getString(R.string.msn_workout_duration_interval, Integer.valueOf(i17), Integer.valueOf(i16)));
            }
            gCMCheckableRow.setDefaultTextContentDescription(strA);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m activity = getActivity();
        activity.getClass();
        ((com.garmin.android.apps.connectmobile.c) activity).initActionBar(true, R.string.txt_duration);
    }

    @Override // d10.i
    public final RecyclerView.h u6() {
        Object objO = this.f57036a.O();
        objO.getClass();
        return new b((j62.d) objO);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/filter/d$a;", "", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
