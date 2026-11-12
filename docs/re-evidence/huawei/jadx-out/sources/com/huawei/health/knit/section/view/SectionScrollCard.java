package com.huawei.health.knit.section.view;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import com.huawei.health.knit.ui.KnitHealthDetailActivity;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.datastruct.MachineControlPointResponse;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.ftf;
import defpackage.njy;
import defpackage.qqp;
import defpackage.qqv;
import defpackage.qqw;
import defpackage.qrs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SectionScrollCard extends BaseSection implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f7911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OnClickSectionListener f7912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7913c;
    private String[] d;
    protected List<ScrollCardParentView> e;
    private int f;
    private int g;
    private int h;
    private int i;
    private a j;
    private boolean k;
    private OnSelectListener l;
    private Map<String, SpannableStringBuilder> m;
    private int n;
    private boolean o;
    private int p;
    private int q;
    private List<ScrollCardParentView> r;
    private int s;
    private HealthRecycleView t;
    private View u;
    private View v;
    private String w;
    private Map<String, ftf> x;
    private View y;

    public interface OnSelectListener {
        void onSelect(String str, boolean z);
    }

    public SectionScrollCard(Context context) {
        this(context, null);
    }

    public SectionScrollCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SectionScrollCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new ArrayList();
        this.w = "TEMPERATURE_MIN_MAX";
        this.d = new String[]{"TEMPERATURE_MIN_MAX", "SKIN_TEMPERATURE_MIN_MAX"};
        this.o = false;
        this.k = false;
        this.f7913c = 0;
        this.f = 0;
        this.n = 0;
        this.m = new HashMap();
        this.x = new HashMap();
        this.f7911a = context;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        LogUtil.a("SectionScrollCard", "onCreateView");
        this.f7911a = context;
        a();
        return this.u;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionScrollCard";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a("SectionScrollCard", "start to bindViewParams");
        if (map == null || map.size() == 0) {
            LogUtil.a("SectionScrollCard", "not need to bind");
            return;
        }
        Map<String, ftf> map2 = (Map) qqw.a(map, "TEMPERATURE_CARD_DATA", (Class<Object>) HashMap.class, (Object) null);
        this.x = map2;
        if (map2 != null) {
            this.m.put("TEMPERATURE_MIN_MAX", map2.get("TEMPERATURE_MIN_MAX").a());
            this.m.put("SKIN_TEMPERATURE_MIN_MAX", this.x.get("SKIN_TEMPERATURE_MIN_MAX").a());
        }
        this.f7912b = (OnClickSectionListener) qqw.a(map, "CLICK_EVENT_LISTENER", (Class<Object>) OnClickSectionListener.class, (Object) null);
        this.w = (String) qqw.a(map, KnitHealthDetailActivity.TEMPERATURE_TYPE, (Class<String>) String.class, "TEMPERATURE_MIN_MAX");
        if (!this.k) {
            LogUtil.a("SectionScrollCard", "mHasInitDataAndView" + this.k);
            c();
        }
        a(this.m);
    }

    public void a(Map<String, SpannableStringBuilder> map) {
        LogUtil.a("SectionScrollCard", "begin to updateContent");
        if (njy.e(this.r) || map == null || map.isEmpty()) {
            LogUtil.j("SectionScrollCard", "updateContent mScrollCardParentViewList is null");
            return;
        }
        LogUtil.d("SectionScrollCard", "updateContent ", Integer.valueOf(map.size()));
        for (int i = 0; i < this.r.size(); i++) {
            for (Map.Entry<String, SpannableStringBuilder> entry : map.entrySet()) {
                ScrollCardParentView scrollCardParentView = this.r.get(i);
                if (scrollCardParentView.e().equals(entry.getKey())) {
                    scrollCardParentView.e(entry.getValue());
                    b(scrollCardParentView, entry.getValue());
                    LogUtil.a("SectionScrollCard", "updateContent ", entry.getValue());
                }
            }
        }
    }

    private void a() {
        if (this.u == null) {
            LogUtil.j("SectionScrollCard", "initView mainView is null, start to inflate");
            this.u = LayoutInflater.from(this.f7911a).inflate(R.layout.layout_blood_sugar_charteye, (ViewGroup) this, false);
        }
        this.e = new ArrayList();
        this.j = new a();
        View view = new View(this.f7911a);
        this.v = view;
        view.setMinimumWidth((int) Utils.convertDpToPixel(0.5f));
        this.v.setMinimumHeight((int) Utils.convertDpToPixel(32.0f));
        LogUtil.d("SectionScrollCard", "mViewDivider height ", Integer.valueOf(this.v.getMinimumHeight()), "mViewDivider width ", Integer.valueOf(this.v.getMinimumWidth()));
        View view2 = new View(this.f7911a);
        this.y = view2;
        view2.setMinimumWidth((int) Utils.convertDpToPixel(0.5f));
        this.y.setMinimumHeight((int) Utils.convertDpToPixel(32.0f));
        HealthRecycleView healthRecycleView = (HealthRecycleView) this.u.findViewById(R.id.observer_view_container);
        this.t = healthRecycleView;
        healthRecycleView.setLayoutManager(new LinearLayoutManager(this.f7911a, 0, false));
        this.t.setAdapter(this.j);
    }

    private void c() {
        LogUtil.d("SectionScrollCard", "begin to initDataAndView");
        Utils.init(this.f7911a);
        this.o = qrs.af(this.f7911a);
        this.f7913c = getCardWidth();
        this.f = getGutter();
        this.n = getMargin();
        e(this.x);
        this.k = true;
    }

    private int getCardWidth() {
        return (int) Utils.convertDpToPixel(getNormalWidth());
    }

    private int getMargin() {
        Context context = this.f7911a;
        if (context == null) {
            LogUtil.j("SectionScrollCard", "getMargin() mContext is null.");
            return 0;
        }
        return context.getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart);
    }

    private int getGutter() {
        return qqp.b(this.f7911a);
    }

    private int getNormalWidth() {
        if (this.f7911a == null) {
            LogUtil.j("SectionScrollCard", "getNormalWidth() mContext is null.");
            return MachineControlPointResponse.OP_CODE_EXTENSION_SET_DYNAMIC_ENERGY;
        }
        int iIntValue = ((Integer) BaseActivity.getSafeRegionWidth().first).intValue() * 2;
        LogUtil.d("SectionScrollCard", "getNormalWidth() safeWidth is ", Integer.valueOf(iIntValue));
        return qqp.d(this.f7911a, ((qqv.d(this.f7911a) - ((getMargin() + iIntValue) * 2)) - getGutter()) / 2);
    }

    private void e(Map<String, ftf> map) {
        LogUtil.a("SectionScrollCard", "enableClassifiedViewObserver");
        this.i = R.color.textColorSecondary;
        this.g = R.color.textColorPrimary;
        this.h = R.drawable.background_charteye;
        this.p = R.color.textColorPrimaryInverse;
        this.s = R.color.textColorPrimaryInverse;
        this.q = R.drawable.bakground_temperature_select;
        this.v.setMinimumWidth(this.f);
        this.y.setMinimumWidth(this.n);
        this.r = new ArrayList(16);
        if (map == null) {
            LogUtil.e("SectionScrollCard", "enableClassifiedViewObserver dataMap null");
            return;
        }
        for (int i = 0; i < this.d.length; i++) {
            for (Map.Entry<String, ftf> entry : map.entrySet()) {
                if (entry != null && entry.getKey() != null && entry.getKey().equals(this.d[i])) {
                    ftf value = entry.getValue();
                    ScrollCardParentView scrollCardParentView = new ScrollCardParentView(this.f7911a, value.b(), value.d(), entry.getKey(), value.a());
                    b(scrollCardParentView, value.a());
                    this.r.add(scrollCardParentView);
                }
            }
        }
        b(this.r);
        if (this.d[0].equals(this.w)) {
            setSelectIndex(this.r.get(0));
        } else if (this.d[1].equals(this.w)) {
            setSelectIndex(this.r.get(1));
        } else {
            LogUtil.j("SectionScrollCard", "TemperatureType Is UnKnow");
        }
    }

    public void b(List<ScrollCardParentView> list) {
        this.e.clear();
        this.e.addAll(list);
        this.j.notifyDataSetChanged();
    }

    private void b(ScrollCardParentView scrollCardParentView, SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder == null) {
            scrollCardParentView.d().setVisibility(8);
        } else if ("--".equals(spannableStringBuilder.toString())) {
            scrollCardParentView.d().setVisibility(8);
        } else {
            scrollCardParentView.d().setVisibility(0);
        }
    }

    static class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private LinearLayout f7919a;

        b(View view) {
            super(view);
            this.f7919a = null;
            this.f7919a = (LinearLayout) view.findViewById(R.id.observer_view_item_place);
        }

        public void d(ScrollCardParentView scrollCardParentView) {
            if (scrollCardParentView != null && (scrollCardParentView.getParent() instanceof ViewGroup)) {
                ((ViewGroup) scrollCardParentView.getParent()).removeView(scrollCardParentView);
            }
            this.f7919a.removeAllViews();
            this.f7919a.addView(scrollCardParentView);
        }
    }

    static class c extends RecyclerView.ViewHolder {
        c(View view) {
            super(view);
        }
    }

    static class e extends RecyclerView.ViewHolder {
        e(View view) {
            super(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(ViewGroup viewGroup, View view) {
        if (viewGroup == null || view == null) {
            LogUtil.j("SectionScrollCard", "adaptView input parameters can't be null.");
        } else {
            view.setLayoutParams(new FrameLayout.LayoutParams(this.f7913c, -2));
        }
    }

    public void setSelectIndex(View view) {
        LogUtil.a("SectionScrollCard", "setSelectIndex");
        for (ScrollCardParentView scrollCardParentView : this.e) {
            if (scrollCardParentView instanceof ScrollCardParentView) {
                scrollCardParentView.setClickable(true);
                ScrollCardParentView scrollCardParentView2 = scrollCardParentView;
                e(scrollCardParentView2, this.i, this.g, this.h);
                if (scrollCardParentView == this.e.get(0)) {
                    LogUtil.a("SectionScrollCard", "init card 0 TEMPERATURE_SELECT");
                    d(scrollCardParentView2, "TEMPERATURE_SELECT");
                } else if (scrollCardParentView == this.e.get(1)) {
                    LogUtil.a("SectionScrollCard", "init card 1 SKIN_TEMPERATURE_SELECT");
                    d(scrollCardParentView2, "SKIN_TEMPERATURE_SELECT");
                } else {
                    LogUtil.a("SectionScrollCard", "fault select");
                }
            }
        }
        if (view instanceof ScrollCardParentView) {
            ScrollCardParentView scrollCardParentView3 = (ScrollCardParentView) view;
            e(scrollCardParentView3, this.p, this.s, this.q);
            scrollCardParentView3.setClickable(false);
            scrollCardParentView3.setOnClickListener(null);
            this.j.notifyDataSetChanged();
        }
    }

    private void e(ScrollCardParentView scrollCardParentView, int i, int i2, int i3) {
        if (scrollCardParentView == null) {
            LogUtil.j("SectionScrollCard", "setViewResource cardView is null.");
            return;
        }
        scrollCardParentView.setBackgroundResource(i3);
        scrollCardParentView.setTextColor(scrollCardParentView.c(), i);
        scrollCardParentView.setTextColor(scrollCardParentView.b(), i2);
        scrollCardParentView.setTextColor(scrollCardParentView.d(), i2);
    }

    private void d(ScrollCardParentView scrollCardParentView, final String str) {
        scrollCardParentView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.SectionScrollCard.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("SectionScrollCard", "start to setViewListener, keyString is " + str);
                SectionScrollCard.this.f7912b.onClick(str);
                SectionScrollCard.this.setSelectIndex(view);
                SectionScrollCard.this.j.notifyDataSetChanged();
                if (SectionScrollCard.this.l == null || !(view instanceof ScrollCardParentView)) {
                    return;
                }
                SectionScrollCard.this.l.onSelect(((ScrollCardParentView) view).e() + "", true);
            }
        });
    }

    class a extends RecyclerView.Adapter {
        private a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-2, SectionScrollCard.this.v.getMinimumHeight());
            if (i == 0) {
                View view = new View(SectionScrollCard.this.f7911a);
                view.setMinimumWidth(SectionScrollCard.this.v.getMinimumWidth());
                view.setMinimumHeight(SectionScrollCard.this.v.getMinimumHeight());
                view.setLayoutParams(layoutParams);
                return new c(view);
            }
            if (i == 2) {
                View view2 = new View(SectionScrollCard.this.f7911a);
                view2.setMinimumWidth(SectionScrollCard.this.y.getMinimumWidth());
                view2.setMinimumHeight(SectionScrollCard.this.y.getMinimumHeight());
                view2.setLayoutParams(layoutParams);
                return new e(view2);
            }
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_bloodsugar_charteye_placeholder, viewGroup, false);
            SectionScrollCard.this.b(viewGroup, viewInflate);
            return new b(viewInflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2;
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                if (viewHolder instanceof c) {
                    viewHolder.itemView.setMinimumWidth(SectionScrollCard.this.v.getMinimumWidth());
                    viewHolder.itemView.setMinimumHeight(SectionScrollCard.this.v.getMinimumHeight());
                    return;
                }
                return;
            }
            if (itemViewType == 2) {
                if (viewHolder instanceof e) {
                    LogUtil.d("SectionScrollCard", Integer.valueOf(i), "mViewEdge.getMinimumWidth() ", Integer.valueOf(SectionScrollCard.this.y.getMinimumWidth()));
                    viewHolder.itemView.setMinimumWidth(SectionScrollCard.this.y.getMinimumWidth() + ((Integer) BaseActivity.getSafeRegionWidth().first).intValue());
                    viewHolder.itemView.setMinimumHeight(SectionScrollCard.this.y.getMinimumHeight());
                    return;
                }
                return;
            }
            if (!(viewHolder instanceof b) || (i2 = i / 2) >= SectionScrollCard.this.e.size()) {
                return;
            }
            ((b) viewHolder).d(SectionScrollCard.this.e.get(i2));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return SectionScrollCard.this.e.size() + SectionScrollCard.this.e.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            if (i == 0 || i == getItemCount() - 1) {
                return 2;
            }
            return (i < 0 || i % 2 != 1) ? 0 : 1;
        }
    }

    class ScrollCardParentView extends LinearLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f7915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f7916b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f7917c;
        private Context e;
        private HealthTextView f;

        public ScrollCardParentView(Context context, String str, String str2, String str3, SpannableStringBuilder spannableStringBuilder) {
            super(context);
            this.e = context;
            c(str, str2, spannableStringBuilder);
            this.f7915a = str3;
        }

        public void e(SpannableStringBuilder spannableStringBuilder) {
            HealthTextView healthTextView = this.f7916b;
            if (healthTextView != null) {
                healthTextView.setText(spannableStringBuilder);
            }
        }

        public HealthTextView d() {
            return this.f;
        }

        public HealthTextView c() {
            return this.f7917c;
        }

        public HealthTextView b() {
            return this.f7916b;
        }

        public void setTextColor(View view, int i) {
            if (view == null) {
                LogUtil.j("ScrollCardParentView_temperature", "view is null");
            } else if (view instanceof HealthTextView) {
                ((HealthTextView) view).setTextColor(ContextCompat.getColor(this.e, i));
            }
        }

        private void c(String str, String str2, SpannableStringBuilder spannableStringBuilder) {
            LayoutInflater.from(getContext()).inflate(R.layout.item_temperature_cardeview, (ViewGroup) this, true);
            this.f7917c = (HealthTextView) findViewById(R.id.eye_card_temperature_title);
            this.f7916b = (HealthTextView) findViewById(R.id.eye_card_temperature_data);
            this.f = (HealthTextView) findViewById(R.id.eye_card_temperature_unit);
            this.f7917c.setText(str);
            this.f7916b.setText(spannableStringBuilder);
            this.f.setVisibility(8);
        }

        public String e() {
            return this.f7915a;
        }
    }
}
