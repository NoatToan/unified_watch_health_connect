package com.huawei.health.knit.section.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.knit.section.adapter.Section21_9List_01Adapter;
import com.huawei.health.marketing.request.GlobalSearchContent;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.dkf;
import defpackage.ezi;
import defpackage.qqw;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class Section21_9List_01 extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthRecycleView f7658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f7659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f7660c;
    private HealthSubHeader e;

    public Section21_9List_01(Context context) {
        this(context, null);
    }

    public Section21_9List_01(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Section21_9List_01(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7660c = context;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.section21_9list_01_layout, (ViewGroup) this, false);
        this.f7659b = viewInflate;
        HealthSubHeader healthSubHeader = (HealthSubHeader) viewInflate.findViewById(R.id.section_sub_header);
        this.e = healthSubHeader;
        dkf.c(healthSubHeader);
        this.e.setSubHeaderBackgroundColor(ContextCompat.getColor(this.f7659b.getContext(), R.color.common_transparent));
        HealthRecycleView healthRecycleView = (HealthRecycleView) this.f7659b.findViewById(R.id.section21_9list_01_recycler_view);
        this.f7658a = healthRecycleView;
        dkf.a(healthRecycleView, context);
        if (this.f7658a.getItemDecorationCount() > 0 && this.f7658a.getItemDecorationAt(0) != null) {
            this.f7658a.removeItemDecorationAt(0);
        }
        this.f7658a.addItemDecoration(new e(this.f7660c, 0, 12));
        return this.f7659b;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "Section21_9List_01";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        this.e.setHeadTitleText(qqw.d((Map) map, "TITLE", ""));
        OnClickSectionListener onClickSectionListenerC = qqw.c(map, "CLICK_EVENT_LISTENER", (OnClickSectionListener) null);
        ezi.c(map, this.e);
        List listA = qqw.a((Map) map, "SEARCH_CONTENT", GlobalSearchContent.class, (List) null);
        if (listA == null) {
            LogUtil.e("Section21_9List_01", "bindParamsToView not found content list");
            return;
        }
        Section21_9List_01Adapter section21_9List_01Adapter = new Section21_9List_01Adapter(this.f7660c, listA);
        if (onClickSectionListenerC != null) {
            section21_9List_01Adapter.a(onClickSectionListenerC);
        }
        int iC = qqw.c(map, "ITEM_LIMIT", 0);
        if (iC > 0) {
            section21_9List_01Adapter.e(iC);
        }
        this.f7658a.setAdapter(section21_9List_01Adapter);
    }

    static class e extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f7661b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f7662c;
        private Context e;

        e(Context context, int i, int i2) {
            this.e = context;
            this.f7661b = i;
            this.f7662c = i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            super.onDraw(canvas, recyclerView, state);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            if (rect == null || recyclerView == null) {
                LogUtil.j("Section21_9List_01", "getItemOffsets, outRect or parent is null");
                return;
            }
            super.getItemOffsets(rect, view, recyclerView, state);
            Context context = this.e;
            int i = this.f7661b;
            dkf.b(rect, view, recyclerView, 2, context, i, i, 2, true);
        }
    }
}
