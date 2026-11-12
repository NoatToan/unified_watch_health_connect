package u40;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.b0;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lu40/j;", "Lcom/garmin/android/apps/connectmobile/b0;", "<init>", "()V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends b0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f168573h = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public NestedScrollView f168574f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e23.l<? super com.garmin.android.apps.connectmobile.courses.model.f, Unit> f168575g;

    public j() {
        super(R.layout.action_bottom_sheet_header, R.layout.course_list_bottom_sheet_content, true, false, false);
    }

    @Override // com.garmin.android.apps.connectmobile.b0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        this.f168574f = (NestedScrollView) view2.findViewById(R.id.scroll_view);
    }

    @Override // com.garmin.android.apps.connectmobile.b0
    public final void u6(View view2) {
        com.garmin.android.apps.connectmobile.courses.model.f fVar;
        int iIndexOf;
        Object serializable;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = arguments.getSerializable("COURSE_POINT", com.garmin.android.apps.connectmobile.courses.model.f.class);
            } else {
                Object serializable2 = arguments.getSerializable("COURSE_POINT");
                if (!(serializable2 instanceof com.garmin.android.apps.connectmobile.courses.model.f)) {
                    serializable2 = null;
                }
                serializable = (com.garmin.android.apps.connectmobile.courses.model.f) serializable2;
            }
            fVar = (com.garmin.android.apps.connectmobile.courses.model.f) serializable;
        } else {
            fVar = null;
        }
        Bundle arguments2 = getArguments();
        boolean z14 = arguments2 != null ? arguments2.getBoolean("COURSE_POINT_EDIT_MODE") : false;
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(view2.getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(null);
        recyclerView.setMotionEventSplittingEnabled(false);
        k kVar = new k(new ad0.f(z14, recyclerView, this, 24), new i(this, 1));
        recyclerView.setAdapter(kVar);
        if (fVar != null) {
            kVar.f168579f = fVar;
            kVar.notifyDataSetChanged();
            e.f168556c.getClass();
            e eVar = e.f168557d;
            eVar.getClass();
            List<com.garmin.android.apps.connectmobile.courses.model.f> list = eVar.f168567b;
            if (list.contains(fVar)) {
                iIndexOf = list.indexOf(fVar) + 1;
            } else {
                e eVar2 = e.f168558e;
                eVar2.getClass();
                List<com.garmin.android.apps.connectmobile.courses.model.f> list2 = eVar2.f168567b;
                if (list2.contains(fVar)) {
                    iIndexOf = list2.indexOf(fVar) + list.size() + 2;
                } else {
                    e eVar3 = e.f168559f;
                    eVar3.getClass();
                    List<com.garmin.android.apps.connectmobile.courses.model.f> list3 = eVar3.f168567b;
                    if (list3.contains(fVar)) {
                        iIndexOf = list3.indexOf(fVar) + list2.size() + list.size() + 3;
                    } else {
                        e eVar4 = e.f168560g;
                        eVar4.getClass();
                        List<com.garmin.android.apps.connectmobile.courses.model.f> list4 = eVar4.f168567b;
                        if (list4.contains(fVar)) {
                            iIndexOf = list4.indexOf(fVar) + list3.size() + list2.size() + list.size() + 4;
                        } else {
                            e eVar5 = e.f168561h;
                            eVar5.getClass();
                            List<com.garmin.android.apps.connectmobile.courses.model.f> list5 = eVar5.f168567b;
                            if (list5.contains(fVar)) {
                                iIndexOf = list5.indexOf(fVar) + list4.size() + list3.size() + list2.size() + list.size() + 5;
                            } else {
                                e eVar6 = e.f168563j;
                                eVar6.getClass();
                                List<com.garmin.android.apps.connectmobile.courses.model.f> list6 = eVar6.f168567b;
                                if (list6.contains(fVar)) {
                                    iIndexOf = list6.indexOf(fVar) + list5.size() + list4.size() + list3.size() + list2.size() + list.size() + 6;
                                } else {
                                    e eVar7 = e.f168564k;
                                    eVar7.getClass();
                                    List<com.garmin.android.apps.connectmobile.courses.model.f> list7 = eVar7.f168567b;
                                    if (list7.contains(fVar)) {
                                        iIndexOf = list7.indexOf(fVar) + list6.size() + list5.size() + list4.size() + list3.size() + list2.size() + list.size() + 7;
                                    } else {
                                        iIndexOf = -1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            kVar.f168577d.invoke(Integer.valueOf(iIndexOf));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.b0
    public final void v6(View view2) {
        View viewFindViewById = view2.findViewById(R.id.bottom_sheet_pull_tab);
        viewFindViewById.getClass();
        viewFindViewById.setVisibility(8);
        View viewFindViewById2 = view2.findViewById(R.id.bottom_sheet_back_button);
        viewFindViewById2.getClass();
        v22.e.n(viewFindViewById2, new i(this, 0));
        viewFindViewById2.setVisibility(0);
        ((TextView) view2.findViewById(R.id.bottom_sheet_title)).setText(R.string.lbl_select_course_point_type);
        View viewFindViewById3 = view2.findViewById(R.id.bottom_sheet_action_button);
        viewFindViewById3.getClass();
        viewFindViewById3.setVisibility(8);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lu40/j$a;", "", "<init>", "()V", "", "EXTRA_COURSE_POINT", "Ljava/lang/String;", "EXTRA_COURSE_POINT_EDIT_MODE", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static j a(com.garmin.android.apps.connectmobile.courses.model.f fVar, boolean z14) {
            j jVar = new j();
            Bundle bundle = new Bundle();
            bundle.putSerializable("COURSE_POINT", fVar);
            bundle.putBoolean("COURSE_POINT_EDIT_MODE", z14);
            jVar.setArguments(bundle);
            return jVar;
        }

        private a() {
        }
    }
}
