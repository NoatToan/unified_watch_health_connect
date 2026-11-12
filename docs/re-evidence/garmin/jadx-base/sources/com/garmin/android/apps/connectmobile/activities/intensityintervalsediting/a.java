package com.garmin.android.apps.connectmobile.activities.intensityintervalsediting;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.m;
import androidx.lifecycle.x1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import iz1.f;
import java.util.ArrayList;
import ko.c;
import ko.j;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import qs.n;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/intensityintervalsediting/a;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0447a f29122c = new C0447a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f29123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f29124b;

    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m activity = getActivity();
        this.f29124b = activity != null ? (j) new x1(activity).b(s0.f105811a.b(j.class)) : null;
        n[] nVarArrValues = n.values();
        ArrayList arrayList = new ArrayList(nVarArrValues.length);
        for (n nVar : nVarArrValues) {
            arrayList.add(nVar.name());
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f29123a = arrayList2;
        arrayList2.add("CANCEL");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.gcm3_edit_intervals_batch_bottom_sheet, viewGroup, false);
        m activity = getActivity();
        ActivitiesEditIntervalsActivity activitiesEditIntervalsActivity = activity instanceof ActivitiesEditIntervalsActivity ? (ActivitiesEditIntervalsActivity) activity : null;
        View viewFindViewById = viewInflate.findViewById(R.id.recycler_view);
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setHasFixedSize(true);
        ArrayList arrayList = this.f29123a;
        if (arrayList == null) {
            s.m("intervalKeys");
            throw null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!s.g((String) obj, "WALK") || (activitiesEditIntervalsActivity != null && activitiesEditIntervalsActivity.f29118k)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        this.f29123a = arrayList3;
        recyclerView.setAdapter(new c(h0.b1(arrayList3), activitiesEditIntervalsActivity != null ? Boolean.valueOf(activitiesEditIntervalsActivity.f29118k) : null, new f(this, 28)));
        viewFindViewById.getClass();
        return viewInflate;
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.activities.intensityintervalsediting.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/intensityintervalsediting/a$a;", "", "<init>", "()V", "", "CANCEL_SELECTION", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0447a {
        public /* synthetic */ C0447a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0447a() {
        }
    }
}
