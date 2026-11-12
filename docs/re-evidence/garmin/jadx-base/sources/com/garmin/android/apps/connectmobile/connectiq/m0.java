package com.garmin.android.apps.connectmobile.connectiq;

import android.view.View;
import android.widget.AdapterView;
import androidx.fragment.app.Fragment;
import com.roomorama.caldroid.CaldroidListener;
import com.roomorama.caldroid.CalendarHelper;
import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class m0 implements AdapterView.OnItemLongClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f31904b;

    public /* synthetic */ m0(Fragment fragment, int i14) {
        this.f31903a = i14;
        this.f31904b = fragment;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view2, int i14, long j8) {
        h03.a aVar;
        h03.a aVar2;
        h03.a aVar3;
        ArrayList<h03.a> arrayList;
        hc0.b.d dVar;
        hc0.b bVar;
        gc0.e eVar;
        sd2.f fVar;
        int i15 = this.f31903a;
        int i16 = 0;
        Fragment fragment = this.f31904b;
        switch (i15) {
            case 0:
                n0 n0Var = (n0) fragment;
                if (n0Var.f31912o != null) {
                    return false;
                }
                n0Var.f31907j.setChoiceMode(2);
                n0Var.f31907j.setItemChecked(i14, true);
                if (n0Var.getActivity() != null) {
                    n0Var.f31912o = n0Var.getActivity().startActionMode(n0Var.f31916t);
                }
                return true;
            case 1:
                com.garmin.android.apps.connectmobile.calendar.presentation.a aVar4 = (com.garmin.android.apps.connectmobile.calendar.presentation.a) fragment;
                ArrayList<h03.a> arrayList2 = aVar4.f31119n;
                if (arrayList2 != null && (aVar = arrayList2.get(i14)) != null && aVar4.C != null && (aVar4.f31128y || (((aVar2 = aVar4.f31117l) == null || !aVar.r(aVar2)) && (((aVar3 = aVar4.f31118m) == null || !aVar.o(aVar3)) && ((arrayList = aVar4.f31115j) == null || arrayList.indexOf(aVar) == -1))))) {
                    Date dateConvertDateTimeToDate = CalendarHelper.convertDateTimeToDate(aVar);
                    CaldroidListener caldroidListener = aVar4.C;
                    if (caldroidListener != null) {
                        caldroidListener.onLongClickDate(dateConvertDateTimeToDate, view2);
                    }
                }
                return false;
            case 2:
                hc0.k kVar = (hc0.k) fragment;
                if (kVar.U6() && (dVar = (hc0.b.d) view2.getTag()) != null && !dVar.f83230k && !dVar.f83229j && (bVar = kVar.f83255x) != null && (eVar = (gc0.e) bVar.f83208a.get(i14)) != null && (fVar = eVar.f76845a) != null) {
                    new gc0.b(kVar.getActivity(), fVar, new hc0.c(i16, kVar, fVar));
                }
                return true;
            case 3:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.f fVar2 = (com.garmin.android.apps.connectmobile.leaderboard.challenges.f) fragment;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.f.a aVar5 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f.R0;
                adapterView.getClass();
                if (!fVar2.v7().f37437b) {
                    fVar2.x7(true);
                    fVar2.E7(i14);
                }
                return true;
            default:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.k kVar2 = (com.garmin.android.apps.connectmobile.leaderboard.challenges.k) fragment;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.k.a aVar6 = com.garmin.android.apps.connectmobile.leaderboard.challenges.k.O0;
                if (!kVar2.u7().f37624i) {
                    kVar2.v7(true);
                    kVar2.z7(i14);
                }
                return true;
        }
    }
}
