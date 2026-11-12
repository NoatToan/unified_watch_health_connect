package e40;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.i;
import dv0.n;
import e23.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.x;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Le40/e;", "Lcom/garmin/android/apps/connectmobile/f;", "<init>", "()V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends com.garmin.android.apps.connectmobile.f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f62848m = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l<? super i, Unit> f62849h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i f62850i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i f62851j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f62852k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f62853l;

    public e() {
        super(R.layout.course_list_bottom_sheet_content, true, false, false, 12, null);
        this.f62852k = -1;
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final boolean A6() {
        return this.f62850i != this.f62851j;
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final void C6() {
        l<? super i, Unit> lVar;
        i iVar = this.f62851j;
        if (iVar != null && (lVar = this.f62849h) != null) {
            lVar.invoke(iVar);
        }
        dismiss();
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final void E6() {
        dismiss();
    }

    @Override // com.garmin.android.apps.connectmobile.b0
    public final void u6(View view2) {
        i iVar;
        Object serializable;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = arguments.getSerializable("courseType", i.class);
            } else {
                Object serializable2 = arguments.getSerializable("courseType");
                if (!(serializable2 instanceof i)) {
                    serializable2 = null;
                }
                serializable = (i) serializable2;
            }
            iVar = (i) serializable;
        } else {
            iVar = null;
        }
        this.f62850i = iVar;
        this.f62851j = iVar;
        Bundle arguments2 = getArguments();
        this.f62852k = arguments2 != null ? arguments2.getInt("flowType", -1) : -1;
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(view2.getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(null);
        int i14 = 0;
        recyclerView.setMotionEventSplittingEnabled(false);
        Integer numValueOf = Integer.valueOf(R.drawable.run_trail);
        Integer numValueOf2 = Integer.valueOf(R.drawable.run);
        String string = getString(R.string.snapshot_cycle);
        string.getClass();
        f.a aVar = new f.a(string);
        i iVar2 = i.ROAD_CYCLING;
        f.b bVar = new f.b(iVar2.f32984f, Integer.valueOf(R.drawable.bike), getString(iVar2.f32979a), this.f62851j == iVar2);
        i iVar3 = i.GRAVEL_CYCLING;
        f.b bVar2 = new f.b(iVar3.f32984f, Integer.valueOf(R.drawable.gravel_bike), getString(iVar3.f32979a), this.f62851j == iVar3);
        i iVar4 = i.MOUNTAIN_BIKING;
        List listK = x.k(aVar, bVar, bVar2, new f.b(iVar4.f32984f, Integer.valueOf(R.drawable.mountain_bike), getString(iVar4.f32979a), this.f62851j == iVar4));
        int i15 = this.f62852k;
        List list = listK;
        if (i15 != 1) {
            if (i15 == 2) {
                ArrayList arrayList = new ArrayList();
                String string2 = getString(R.string.snapshot_run);
                string2.getClass();
                arrayList.add(new f.a(string2));
                i iVar5 = i.RUNNING;
                arrayList.add(new f.b(iVar5.f32984f, numValueOf2, getString(iVar5.f32979a), this.f62851j == iVar5));
                i iVar6 = i.TRAIL_RUNNING;
                arrayList.add(new f.b(iVar6.f32984f, numValueOf, getString(iVar6.f32979a), this.f62851j == iVar6));
                list = arrayList;
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(listK);
                String string3 = getString(R.string.snapshot_run);
                string3.getClass();
                arrayList2.add(new f.a(string3));
                i iVar7 = i.RUNNING;
                arrayList2.add(new f.b(iVar7.f32984f, numValueOf2, getString(iVar7.f32979a), this.f62851j == iVar7));
                i iVar8 = i.TRAIL_RUNNING;
                arrayList2.add(new f.b(iVar8.f32984f, numValueOf, getString(iVar8.f32979a), this.f62851j == iVar8));
                String string4 = getString(R.string.lbl_hiking);
                string4.getClass();
                arrayList2.add(new f.a(string4));
                i iVar9 = i.HIKING;
                arrayList2.add(new f.b(iVar9.f32984f, Integer.valueOf(R.drawable.hike), getString(iVar9.f32979a), this.f62851j == iVar9));
                String string5 = getString(R.string.tabbar_more);
                string5.getClass();
                arrayList2.add(new f.a(string5));
                i iVar10 = i.OTHER;
                arrayList2.add(new f.b(iVar10.f32984f, Integer.valueOf(R.drawable.other_activity), getString(iVar10.f32979a), this.f62851j == iVar10));
                list = arrayList2;
            }
        }
        b bVar3 = new b(new d(this, i14));
        list.getClass();
        ArrayList arrayList3 = bVar3.f62836b;
        arrayList3.clear();
        arrayList3.addAll(list);
        bVar3.notifyDataSetChanged();
        Iterator it = list.iterator();
        int i16 = 0;
        while (true) {
            if (!it.hasNext()) {
                i16 = -1;
                break;
            }
            f fVar = (f) it.next();
            f.b bVar4 = fVar instanceof f.b ? (f.b) fVar : null;
            if (bVar4 != null && bVar4.f62858d) {
                break;
            } else {
                i16++;
            }
        }
        bVar3.f62837c = i16;
        bVar3.f62838d = new n(22);
        this.f62853l = bVar3;
        recyclerView.setAdapter(bVar3);
        View viewFindViewById = view2.findViewById(R.id.lap_course_info_view);
        viewFindViewById.getClass();
        v22.e.r(viewFindViewById, this.f62852k == 2);
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final String y6() {
        String string = getString(R.string.lbl_done);
        string.getClass();
        return string;
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final String z6() {
        String string = getString(R.string.lbl_course_type);
        string.getClass();
        return string;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Le40/e$a;", "", "<init>", "()V", "", "EXTRA_COURSE_TYPE", "Ljava/lang/String;", "EXTRA_FLOW_TYPE", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
