package com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.k;
import com.garmin.android.apps.connectmobile.workouts.data.model.r;
import java.util.ArrayList;
import java.util.List;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/filter/MSNWorkoutFilterActivity;", "Ld10/a;", "Lj62/d;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/filter/f$b;", "<init>", "()V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MSNWorkoutFilterActivity extends d10.a<j62.d> implements f.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f49506d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<r> f49507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j62.d f49508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j62.d f49509c;

    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b
    public final void C2() {
        c.f49515c.getClass();
        da(new c());
    }

    @Override // d10.c
    public final void N3() {
        j62.d dVar = this.f49509c;
        if (dVar == null) {
            s.m("filterData");
            throw null;
        }
        dVar.d(null);
        dVar.b(null);
        dVar.f(null);
        dVar.g(null);
        dVar.i(null);
        dVar.h(null);
    }

    @Override // d10.b
    public final Object O() {
        j62.d dVar = this.f49509c;
        if (dVar != null) {
            return dVar;
        }
        s.m("filterData");
        throw null;
    }

    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b
    public final void X4() {
        b.f49513c.getClass();
        da(new b());
    }

    @Override // d10.a
    public final Fragment ca() {
        f.f49519e.getClass();
        return new f();
    }

    @Override // d10.c
    public final void d2() {
        j62.d dVar = this.f49509c;
        if (dVar == null) {
            s.m("filterData");
            throw null;
        }
        j62.d dVar2 = this.f49508b;
        if (dVar2 == null) {
            s.m("initialFilterData");
            throw null;
        }
        if (!s.g(dVar, dVar2)) {
            Intent intent = new Intent();
            j62.d dVar3 = this.f49509c;
            if (dVar3 == null) {
                s.m("filterData");
                throw null;
            }
            intent.putExtra("GCM_workout_filter_data", dVar3);
            setResult(-1, intent);
        }
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b
    public final void d3() {
        h.f49523c.getClass();
        da(new h());
    }

    public final void ea() {
        String string;
        ArrayList<r> arrayList = this.f49507a;
        if (arrayList == null) {
            s.m("workouts");
            throw null;
        }
        j62.d dVar = this.f49509c;
        if (dVar == null) {
            s.m("filterData");
            throw null;
        }
        int size = e.a(arrayList, dVar, null).size();
        if (size != 0) {
            string = size != 1 ? getString(R.string.lbl_filter_nbr_results, Integer.valueOf(size)) : getString(R.string.lbl_filter_single_result);
        } else {
            string = getString(R.string.common_no_results_lbl);
        }
        setSubtitle(string);
    }

    @Override // d10.c
    public final boolean g8() {
        j62.d dVar = this.f49509c;
        if (dVar == null) {
            s.m("filterData");
            throw null;
        }
        if (dVar.f97419k != null) {
            return false;
        }
        List<String> list = dVar.f97420l;
        if (list != null && (!list.isEmpty())) {
            return false;
        }
        List<p<String, String>> list2 = dVar.f97421m;
        if (list2 != null && (!list2.isEmpty())) {
            return false;
        }
        List<? extends com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.a> list3 = dVar.f97422n;
        if (list3 != null && (!list3.isEmpty())) {
            return false;
        }
        List<p<String, String>> list4 = dVar.f97423o;
        if (list4 != null && (!list4.isEmpty())) {
            return false;
        }
        List<p<String, String>> list5 = dVar.f97424p;
        return list5 == null || !(list5.isEmpty() ^ true);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    @Override // d10.a, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ArrayList<r> arrayList;
        Bundle extras;
        Bundle extras2;
        Parcelable parcelable;
        super.onCreate(bundle);
        Intent intent = getIntent();
        j62.d dVar = null;
        dVar = null;
        if (intent != null && (extras2 = intent.getExtras()) != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras2.getParcelable("GCM_workout_filter_data", j62.d.class);
            } else {
                Parcelable parcelable2 = extras2.getParcelable("GCM_workout_filter_data");
                parcelable = (j62.d) (parcelable2 instanceof j62.d ? parcelable2 : null);
            }
            dVar = (j62.d) parcelable;
        }
        Intent intent2 = getIntent();
        if (intent2 == null || (extras = intent2.getExtras()) == null) {
            arrayList = new ArrayList<>();
        } else {
            arrayList = Build.VERSION.SDK_INT >= 33 ? extras.getParcelableArrayList("GCM_workouts_list", r.class) : extras.getParcelableArrayList("GCM_workouts_list");
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
        }
        this.f49507a = arrayList;
        if (dVar == null || arrayList.isEmpty()) {
            finish();
            return;
        }
        this.f49508b = dVar;
        List<p<String, String>> list = dVar.f97409a;
        List<p<String, String>> list2 = dVar.f97410b;
        List<p<String, String>> list3 = dVar.f97411c;
        List<String> list4 = dVar.f97412d;
        j62.b bVar = dVar.f97413e;
        List<p<String, String>> list5 = dVar.f97414f;
        List<? extends com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.a> list6 = dVar.f97415g;
        List<p<String, String>> list7 = dVar.f97416h;
        List<p<String, String>> list8 = dVar.f97417i;
        List<String> list9 = dVar.f97418j;
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        j62.d dVar2 = new j62.d(list, list2, list3, list4, bVar, list5, list6, list7, list8, list9);
        this.f49509c = dVar2;
        dVar2.addObserver(new k(this, 2));
        ea();
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        j62.d dVar = this.f49509c;
        if (dVar != null) {
            if (dVar != null) {
                dVar.deleteObservers();
            } else {
                s.m("filterData");
                throw null;
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b
    public final void p6(boolean z14) {
        i.f49525d.getClass();
        da(new i(z14));
    }

    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b
    public final void v5() {
        g.f49521c.getClass();
        da(new g());
    }

    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.msn.filter.f.b
    public final void v8() {
        d.f49517c.getClass();
        da(new d());
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/msn/filter/MSNWorkoutFilterActivity$a;", "", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
