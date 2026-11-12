package com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter;

import android.os.Bundle;
import androidx.fragment.app.m;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.List;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/filter/c;", "Ld10/i;", "Lj62/d;", "<init>", "()V", "a", "b", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends d10.i<j62.d> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f49515c = new a(null);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/filter/c$b;", "Ld10/f;", "Lj62/d;", "filterData", "<init>", "(Lj62/d;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends d10.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j62.d f49516b;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(j62.d dVar) {
            dVar.getClass();
            List<p<String, String>> list = dVar.f97409a;
            List<p<String, String>> list2 = dVar.f97421m;
            list.getClass();
            p[] pVarArr = (p[]) list.toArray(new p[0]);
            boolean[] zArr = new boolean[list.size()];
            if (list2 != null) {
                int size = list2.size();
                for (int i14 = 0; i14 < size; i14++) {
                    int iM = u.M(pVarArr, list2.get(i14));
                    if (iM >= 0) {
                        zArr[iM] = true;
                    }
                }
            }
            super(zArr);
            this.f49516b = dVar;
        }

        @Override // d10.f
        public final void A(boolean[] zArr) {
            j62.d dVar;
            zArr.getClass();
            ArrayList arrayList = new ArrayList();
            int length = zArr.length;
            int i14 = 0;
            while (true) {
                dVar = this.f49516b;
                if (i14 >= length) {
                    break;
                }
                if (zArr[i14]) {
                    arrayList.add(dVar.f97409a.get(i14));
                }
                i14++;
            }
            if (arrayList.size() <= 0 || arrayList.size() == dVar.f97409a.size()) {
                dVar.f(null);
            } else {
                dVar.f(arrayList);
            }
        }

        @Override // d10.f
        public final void z(d10.h.a aVar, int i14) {
            aVar.getClass();
            if (i14 == -1) {
                return;
            }
            aVar.f57035a.setDefaultText(this.f49516b.f97409a.get(i14).f128595b);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m activity = getActivity();
        activity.getClass();
        ((com.garmin.android.apps.connectmobile.c) activity).initActionBar(true, R.string.common_difficulty);
    }

    @Override // d10.i
    public final RecyclerView.h u6() {
        Object objO = this.f57036a.O();
        objO.getClass();
        return new b((j62.d) objO);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/filter/c$a;", "", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
