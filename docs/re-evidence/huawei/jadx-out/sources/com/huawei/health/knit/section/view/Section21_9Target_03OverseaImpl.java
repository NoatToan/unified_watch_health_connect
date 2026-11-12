package com.huawei.health.knit.section.view;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.knit.section.adapter.Section21_9Target_03_OverseaAdapter;
import com.huawei.health.servicesui.R;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.fqk;
import defpackage.njy;
import defpackage.qqw;
import defpackage.qrs;
import defpackage.qsp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public class Section21_9Target_03OverseaImpl extends Section21_9Target_03Impl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthSubHeader f7676a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthRecycleView f7677c;
    private Section21_9Target_03_OverseaAdapter d;
    private View e;

    public Section21_9Target_03OverseaImpl(Context context) {
        super(context);
    }

    @Override // com.huawei.health.knit.section.view.Section21_9Target_03Impl
    public View onCreateView(Context context, ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section21_9target_03_layout_oversea, viewGroup, false);
        this.e = viewInflate;
        HealthSubHeader healthSubHeader = (HealthSubHeader) viewInflate.findViewById(R.id.sub_header);
        this.f7676a = healthSubHeader;
        healthSubHeader.setMoreTextVisibility(8);
        this.f7676a.setSubHeaderBackgroundColor(context.getResources().getColor(R.color.common_transparent));
        this.f7677c = (HealthRecycleView) this.e.findViewById(R.id.grid_view);
        int i = qrs.af(context) ? 2 : 1;
        this.f7677c.setLayoutManager(new GridLayoutManager(context, i, 1, false));
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle);
        this.f7677c.addItemDecoration(new d(i, dimensionPixelSize, dimensionPixelSize));
        Section21_9Target_03_OverseaAdapter section21_9Target_03_OverseaAdapter = new Section21_9Target_03_OverseaAdapter(context, dimensionPixelSize, i);
        this.d = section21_9Target_03_OverseaAdapter;
        this.f7677c.setAdapter(section21_9Target_03_OverseaAdapter);
        this.e.post(new Runnable() { // from class: fur
            @Override // java.lang.Runnable
            public final void run() {
                this.f34592b.d();
            }
        });
        return this.e;
    }

    public /* synthetic */ void d() {
        qrs.f(this.e);
    }

    @Override // com.huawei.health.knit.section.view.Section21_9Target_03Impl
    public void bindParamsToView(HashMap<String, Object> map) {
        Object obj = map.get("SectionAiWorkoutPlanType_PLAN_LIST");
        if (njy.b(obj, fqk.class)) {
            List<fqk> list = (List) obj;
            qsp.d(this.f7676a, njy.e(list) ? 8 : 0, qqw.d((Map) map, "TITLE", ""), 8, 8);
            Section21_9Target_03_OverseaAdapter section21_9Target_03_OverseaAdapter = this.d;
            if (section21_9Target_03_OverseaAdapter != null) {
                section21_9Target_03_OverseaAdapter.c(list);
            }
        }
    }

    @Override // com.huawei.health.knit.section.view.Section21_9Target_03Impl
    public String getLogTag() {
        return "Section21_9Target_03OverseaImpl";
    }

    static final class d extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f7678a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f7679c;
        private int d;

        public d(int i, int i2, int i3) {
            this.f7679c = i;
            this.f7678a = i2;
            this.d = i3;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int i = this.f7679c;
            if (childAdapterPosition % i > 0) {
                rect.left = this.f7678a / i;
            }
            if (childAdapterPosition / this.f7679c >= 1) {
                rect.top = this.d;
            }
        }
    }
}
