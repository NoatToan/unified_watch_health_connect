package bw2;

import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity;
import java.util.List;
import java.util.Map;
import kh2.k;
import p005kotlin.Unit;
import p13.j0;
import rt1.n;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f21574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f21575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f21576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f21577g;

    public /* synthetic */ a(Fragment fragment, View view2, ii2.b bVar, Map map, ei2.h hVar, String str) {
        this.f21571a = 1;
        this.f21572b = fragment;
        this.f21574d = view2;
        this.f21575e = bVar;
        this.f21573c = map;
        this.f21576f = hVar;
        this.f21577g = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f21571a;
        Map map = null;
        Unit unit = null;
        Unit unit2 = null;
        map = null;
        Object obj = this.f21577g;
        Object obj2 = this.f21576f;
        Object obj3 = this.f21575e;
        Object obj4 = this.f21573c;
        Object obj5 = this.f21574d;
        Object obj6 = this.f21572b;
        switch (i14) {
            case 0:
                Fragment fragment = (Fragment) obj6;
                SwitchCompat switchCompat = (SwitchCompat) obj5;
                Map map2 = (Map) obj4;
                dx2.c cVar = (dx2.c) obj3;
                i iVar = (i) obj2;
                ConstraintLayout constraintLayout = (ConstraintLayout) obj;
                d dVar = d.f21586a;
                cx2.i.f56681a.getClass();
                if (!cx2.i.a.a(fragment)) {
                    d.a(iVar, constraintLayout, cVar, map2);
                } else {
                    boolean zIsChecked = switchCompat.isChecked();
                    boolean z14 = !zIsChecked;
                    Object obj7 = map2.get(gw2.i.TOGGLE_OPTIONS.f79975a);
                    if (obj7 != null) {
                        try {
                            if (!(obj7 instanceof Map)) {
                                obj7 = null;
                            }
                            map = (Map) obj7;
                        } catch (ClassCastException unused) {
                        }
                    }
                    if (map == null || map.isEmpty()) {
                        iVar.h(cVar, map2, Boolean.valueOf(z14));
                    } else {
                        cVar.getClass();
                        wu2.b bVarZ4 = dx2.c.z4(map);
                        if (zIsChecked || bVarZ4 == null) {
                            iVar.h(cVar, map2, Boolean.FALSE);
                        } else {
                            wu2.i iVar2 = wu2.i.f187354a;
                            c cVar2 = new c(iVar, fragment, cVar, map2, constraintLayout);
                            iVar2.getClass();
                            wu2.i.a(fragment, cVar2, cVar, iVar, bVarZ4);
                        }
                    }
                }
                break;
            case 1:
                Fragment fragment2 = (Fragment) obj6;
                View view3 = (View) obj5;
                ii2.b bVar = (ii2.b) obj3;
                Map<String, ? extends Object> map3 = (Map) obj4;
                ei2.h hVar = (ei2.h) obj2;
                String str = (String) obj;
                view3.getClass();
                bVar.getClass();
                m activity = fragment2.getActivity();
                if (!(activity instanceof com.garmin.androiddynamicsettings.app.presentationlayer.b)) {
                    activity = null;
                }
                com.garmin.androiddynamicsettings.app.presentationlayer.b bVar2 = (com.garmin.androiddynamicsettings.app.presentationlayer.b) activity;
                if (bVar2 == null || !bVar2.S9()) {
                    if (bVar2 == null) {
                        zh2.e.f204807a.getClass();
                        if (!((uc0.d) zh2.e.a()).i()) {
                        }
                    }
                }
                int id3 = view3.getId();
                if (id3 == R.id.header_action_text_view) {
                    kh2.b.f104781b.a("setRowAccessoryClickListener: Help clicked.");
                    Map<String, Object> mapZ4 = bVar.z4(map3);
                    if (mapZ4 != null) {
                        k.f104801a.getClass();
                        k.a.a(fragment2, bVar, map3, mapZ4);
                    }
                } else if (id3 == R.id.remove_value_text_view) {
                    kh2.b.f104781b.a("setRowAccessoryClickListener: Remove clicked.");
                    if (hVar != null) {
                        if (str != null) {
                            if (str.equals(mh2.h.HYDRATION_CONTAINER.f118578a)) {
                                hVar.n(bVar, map3, j0.f134944a);
                            } else {
                                k.f104801a.getClass();
                                k.a.d(bVar, map3);
                            }
                            unit = Unit.INSTANCE;
                        }
                        if (unit == null) {
                            k.f104801a.getClass();
                            k.a.d(bVar, map3);
                        }
                        unit2 = Unit.INSTANCE;
                    }
                    if (unit2 == null) {
                        k.f104801a.getClass();
                        k.a.d(bVar, map3);
                    }
                }
                break;
            default:
                ActiveTrainingPlansActivity activeTrainingPlansActivity = (ActiveTrainingPlansActivity) obj6;
                ww1.a aVar = (ww1.a) obj5;
                ww1.c cVar3 = (ww1.c) obj4;
                List list = (List) obj;
                ActiveTrainingPlansActivity.a aVar2 = ActiveTrainingPlansActivity.f45098w;
                v supportFragmentManager = activeTrainingPlansActivity.getSupportFragmentManager();
                supportFragmentManager.getClass();
                n.c(activeTrainingPlansActivity, supportFragmentManager, aVar, cVar3, (ww1.b) obj3, (ww1.d) obj2, list, new ry0.g(21, activeTrainingPlansActivity, list), new ok0.d(aVar, cVar3, activeTrainingPlansActivity, list, 27));
                break;
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i14) {
        this.f21571a = i14;
        this.f21572b = obj;
        this.f21574d = obj2;
        this.f21573c = obj3;
        this.f21575e = obj4;
        this.f21576f = obj5;
        this.f21577g = obj6;
    }
}
