package qr;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqr/m;", "Landroidx/core/view/s;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m implements androidx.core.view.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ActivityDetailsFragment f146336a;

    public m(ActivityDetailsFragment activityDetailsFragment) {
        this.f146336a = activityDetailsFragment;
    }

    @Override // androidx.core.view.s
    public final void Y3(Menu menu, MenuInflater menuInflater) {
        zl.a.f(menu, menuInflater, R.menu.activity_summary, menu);
    }

    @Override // androidx.core.view.s
    public final void Z4(Menu menu) {
        ActivityDetailsFragment activityDetailsFragment = this.f146336a;
        Context contextRequireContext = activityDetailsFragment.requireContext();
        contextRequireContext.getClass();
        oc.b.B(menu, contextRequireContext);
        nr.t tVar = ((nr.i) activityDetailsFragment.z6().L1.getValue()).f127191a;
        if (tVar != null) {
            nr.t.f fVar = (nr.t.f) tVar;
            boolean z14 = fVar.f127339d;
            boolean z15 = fVar.f127350o;
            boolean z16 = fVar.f127341f;
            boolean z17 = false;
            ActivityDetailsFragment.V6(activityDetailsFragment, menu, R.id.menu_item_add_remove_gear, z16 && fVar.f127347l && !z15);
            ActivityDetailsFragment.V6(activityDetailsFragment, menu, R.id.menu_item_add_dive_gear, z16 && fVar.f127351p);
            ActivityDetailsFragment.V6(activityDetailsFragment, menu, R.id.menu_item_edit, z16 && !z15);
            ActivityDetailsFragment.V6(activityDetailsFragment, menu, R.id.menu_item_favorite, z16 && !z15);
            ActivityDetailsFragment.V6(activityDetailsFragment, menu, R.id.menu_item_delete, fVar.f127348m);
            ActivityDetailsFragment.V6(activityDetailsFragment, menu, R.id.menu_item_restore, fVar.f127342g);
            ActivityDetailsFragment.V6(activityDetailsFragment, menu, R.id.menu_item_help, z16 && fVar.f127346k);
            ActivityDetailsFragment.V6(activityDetailsFragment, menu, R.id.menu_item_send_course_to_device, z14 && !z15);
            if (z14 && !z15) {
                z17 = true;
            }
            ActivityDetailsFragment.V6(activityDetailsFragment, menu, R.id.menu_item_save_to_my_courses, z17);
            MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_exclude_from_physio);
            if (menuItemFindItem != null) {
                menuItemFindItem.setTitle(fVar.f127345j);
            }
            ActivityDetailsFragment.V6(activityDetailsFragment, menu, R.id.menu_item_exclude_from_physio, fVar.f127352q);
            menu.findItem(R.id.menu_item_favorite).setTitle(fVar.f127343h);
            menu.findItem(R.id.menu_item_edit).setTitle(fVar.f127344i);
            MenuItem menuItemFindItem2 = menu.findItem(R.id.menu_item_add_remove_gear);
            if (menuItemFindItem2 != null) {
                Context contextRequireContext2 = activityDetailsFragment.requireContext();
                contextRequireContext2.getClass();
                oc.b.G(menuItemFindItem2, contextRequireContext2, R.color.gcm_icon_primary);
            }
        }
        Context contextRequireContext3 = activityDetailsFragment.requireContext();
        contextRequireContext3.getClass();
        oc.b.B(menu, contextRequireContext3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v4, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.ArrayList] */
    @Override // androidx.core.view.s
    public final boolean w5(MenuItem menuItem) {
        ?? arrayList;
        r80.b bVarB;
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        ActivityDetailsFragment activityDetailsFragment = this.f146336a;
        if (itemId == R.id.menu_item_add_remove_gear) {
            int i14 = ActivityDetailsFragment.I;
            activityDetailsFragment.z6().D4();
            return true;
        }
        if (itemId == R.id.menu_item_add_dive_gear) {
            int i15 = ActivityDetailsFragment.I;
            t tVarZ6 = activityDetailsFragment.z6();
            tVarZ6.E4(new nr.w0.p1(tVarZ6.f146575z, false, 2, null));
            return true;
        }
        if (itemId == R.id.menu_item_delete) {
            int i16 = ActivityDetailsFragment.I;
            t tVarZ7 = activityDetailsFragment.z6();
            tVarZ7.getClass();
            if (z10.d1.f()) {
                tVarZ7.E4(nr.w0.a.f127397a);
                return true;
            }
            tVarZ7.E4(new nr.w0.d(null, tVarZ7.T1, nr.a0.IN_PROGRESS, 1, null));
            return true;
        }
        ro0.l lVar = null;
        if (itemId == R.id.menu_item_edit) {
            int i17 = ActivityDetailsFragment.I;
            t tVarZ8 = activityDetailsFragment.z6();
            String str = tVarZ8.A.f4358a;
            am.z0 z0Var = am.z0.f4390a;
            if (am.z0.b(am.x0.D, str)) {
                tVarZ8.E4(new nr.w0.p1(tVarZ8.f146575z, false, 2, null));
                return true;
            }
            ps.r value = tVarZ8.W4().getValue();
            if (value != null) {
                ActivityDetailChartDTO value2 = tVarZ8.N4().getValue();
                ps.q1 summaryDTO = value.getSummaryDTO();
                List list = (List) ((r53.z1) tVarZ8.f146570x1.getValue()).getValue();
                if (list != null) {
                    arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ps.r) it.next()).h().f4358a);
                    }
                } else {
                    arrayList = 0;
                }
                if (arrayList == 0) {
                    arrayList = p13.j0.f134944a;
                }
                ps.s0 value3 = tVarZ8.k5().getValue();
                ps.p value4 = tVarZ8.U4().getValue();
                nr.v value5 = tVarZ8.h5().getValue();
                tVarZ8.E4(new nr.w0.v(value, value3, value4, (value5 == null || (bVarB = value5.b()) == null || !bVarB.f()) ? false : true, bm.m.q(summaryDTO != null ? summaryDTO.getDistance() : null, value2), bm.m.s(summaryDTO != null ? summaryDTO.getDuration() : null, value2), bm.m.r(arrayList), bm.m.o(value2), value.getParentId() != null ? am.x0.C.f4358a : null));
                return true;
            }
        } else {
            if (itemId == R.id.menu_item_favorite) {
                int i18 = ActivityDetailsFragment.I;
                activityDetailsFragment.z6().U5();
                return true;
            }
            if (itemId != R.id.menu_item_help) {
                if (itemId == R.id.menu_item_save_to_my_courses) {
                    int i19 = ActivityDetailsFragment.I;
                    t tVarZ9 = activityDetailsFragment.z6();
                    ps.r value6 = tVarZ9.W4().getValue();
                    tVarZ9.E4(new nr.w0.t0(value6 != null ? value6.h() : null, Long.valueOf(tVarZ9.f146575z), tVarZ9.U4().getValue().i()));
                    return true;
                }
                if (itemId == R.id.menu_item_send_course_to_device) {
                    int i24 = ActivityDetailsFragment.I;
                    t tVarZ10 = activityDetailsFragment.z6();
                    tVarZ10.getClass();
                    tVarZ10.E4(nr.w0.q1.f127517a);
                    return true;
                }
                if (itemId == R.id.menu_item_restore) {
                    int i25 = ActivityDetailsFragment.I;
                    activityDetailsFragment.z6().R5();
                    return true;
                }
                if (itemId != R.id.menu_item_exclude_from_physio) {
                    return false;
                }
                int i26 = ActivityDetailsFragment.I;
                t tVarZ11 = activityDetailsFragment.z6();
                tVarZ11.getClass();
                if (z10.d1.f()) {
                    tVarZ11.E4(nr.w0.a.f127397a);
                    return true;
                }
                tVarZ11.E4(new nr.w0.s1(tVarZ11.f146575z));
                return true;
            }
            int i27 = ActivityDetailsFragment.I;
            t tVarZ12 = activityDetailsFragment.z6();
            am.x0 x0Var = tVarZ12.A;
            x0Var.getClass();
            switch (am.s1.a.f4192a[x0Var.ordinal()]) {
                case 5:
                    lVar = ro0.l.ACTIVITY_DETAILS_BREATHWORK;
                    break;
                case 6:
                    lVar = ro0.l.ACTIVITY_HIIT;
                    break;
                case 7:
                    lVar = ro0.l.ACTIVITY_DETAILS_PILATES;
                    break;
                case 8:
                    lVar = ro0.l.ACTIVITY_DETAILS_MOBILITY;
                    break;
                case 9:
                    lVar = ro0.l.STRENGTH_TRAINING;
                    break;
            }
            if (lVar != null) {
                tVarZ12.G5(lVar);
            }
        }
        return true;
    }
}
