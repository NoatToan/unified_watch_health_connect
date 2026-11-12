package com.huawei.health.knit.section.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.health.knit.section.adapter.ObserverRecycleViewAdapter;
import com.huawei.health.marketing.utils.ColumnLayoutItemDecoration;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.fot;
import defpackage.qqw;
import defpackage.qrs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class ObserverRecyclerViewSection extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ObserverRecycleViewAdapter f7626a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f7627c;
    private Context d;
    private HealthRecycleView e;

    public ObserverRecyclerViewSection(Context context) {
        this(context, null);
    }

    public ObserverRecyclerViewSection(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ObserverRecyclerViewSection(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = context;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        LogUtil.a("ObserverRecycleView", "loadView");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.observer_recycleview_layout, (ViewGroup) this, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.bp_view_layout);
        this.f7627c = linearLayout;
        linearLayout.post(new Runnable() { // from class: com.huawei.health.knit.section.view.ObserverRecyclerViewSection.2
            @Override // java.lang.Runnable
            public void run() {
                ObserverRecyclerViewSection.this.f7627c.setMinimumWidth(qrs.q());
            }
        });
        HealthRecycleView healthRecycleView = (HealthRecycleView) viewInflate.findViewById(R.id.sectionbprecycleview_recycler_view);
        this.e = healthRecycleView;
        healthRecycleView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        return viewInflate;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "ObserverRecycleView";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a("ObserverRecycleView", "bindViewParams");
        fot fotVar = new fot();
        fotVar.b(qqw.a((Map) map, "CARD_TITLE_TEXT", String.class, (List) new ArrayList()));
        fotVar.c(qqw.a((Map) map, "CARD_DATA_TEXT", String.class, (List) new ArrayList()));
        fotVar.a(qqw.a((Map) map, "CARD_PIECE_TEXT", String.class, (List) new ArrayList()));
        fotVar.e(qqw.a((Map) map, "LEFT_MIDDLE_TEXT", String.class, (List) new ArrayList()));
        fotVar.d(qqw.c(map, "SELECTED_BACKGROUND", R.drawable.background_charteye_select));
        fotVar.b(qqw.c(map, "UNSELECTED_BACKGROUND", R.drawable.background_charteye));
        fotVar.c(qqw.c(map, "SELECTED_TEXT_COLOR", -16777216));
        fotVar.a(qqw.c(map, "UNSELECTED_TEXT_COLOR", -16777216));
        fotVar.c((Typeface) qqw.a(map, "SELECTED_TEXT_TYPEFACE", (Class<Typeface>) Typeface.class, Typeface.create(this.d.getResources().getString(R.string.textFontFamilyMedium), 0)));
        fotVar.d((Typeface) qqw.a(map, "SELECTED_TEXT_TYPEFACE", (Class<Typeface>) Typeface.class, Typeface.create(this.d.getResources().getString(R.string.textFontFamilyRegular), 0)));
        fotVar.c((OnClickSectionListener) qqw.a(map, "CLICK_EVENT_LISTENER", (Class<Object>) OnClickSectionListener.class, (Object) null));
        if (this.f7626a == null) {
            LogUtil.a("ObserverRecycleView", "adapter == null");
            this.f7626a = new ObserverRecycleViewAdapter(this.d, fotVar);
            this.e.addItemDecoration(new ColumnLayoutItemDecoration(getResources().getDimensionPixelOffset(R.dimen.cardMarginMiddle), 0, 2, new int[]{getResources().getDimensionPixelOffset(R.dimen.cardMarginStart), 0, getResources().getDimensionPixelOffset(R.dimen.cardMarginStart), 0}));
            this.e.setAdapter(this.f7626a);
        }
        this.f7626a.a(fotVar);
        this.f7626a.notifyDataSetChanged();
    }
}
