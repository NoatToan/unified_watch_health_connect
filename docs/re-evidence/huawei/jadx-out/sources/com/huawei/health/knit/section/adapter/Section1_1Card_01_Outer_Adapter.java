package com.huawei.health.knit.section.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.servicesui.R;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.utils.AsyncLoadDrawableCallback;
import defpackage.foz;
import defpackage.fpb;
import defpackage.qqf;
import health.compact.a.util.LogUtil;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class Section1_1Card_01_Outer_Adapter extends RecyclerView.Adapter<ListThreeOuterViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Object> f7245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OnClickSectionListener f7246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Object> f7247c;
    private List<Object> d;
    private Context e;
    private List<Object> h;
    private List<Map<Object, Object>> j;

    public Section1_1Card_01_Outer_Adapter(Context context) {
        this.e = context;
    }

    public void d(fpb fpbVar) {
        if (fpbVar != null) {
            this.d = fpbVar.a();
            this.h = fpbVar.e();
            this.f7247c = fpbVar.b();
            this.j = fpbVar.h();
            this.f7245a = fpbVar.d();
            this.f7246b = fpbVar.c();
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ListThreeOuterViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ListThreeOuterViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.section1_1card_outer_recyclerview_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(ListThreeOuterViewHolder listThreeOuterViewHolder, final int i) {
        List<Object> list;
        List<Object> list2 = this.d;
        if (list2 != null && i < list2.size() && listThreeOuterViewHolder.d != null && listThreeOuterViewHolder.f7253c != null) {
            c(listThreeOuterViewHolder, i);
        }
        List<Object> list3 = this.h;
        if (list3 != null && i < list3.size() && listThreeOuterViewHolder.f != null && (this.h.get(i) instanceof String)) {
            listThreeOuterViewHolder.f.setText(String.valueOf(this.h.get(i)));
        }
        List<Object> list4 = this.f7247c;
        if (list4 != null && i < list4.size() && listThreeOuterViewHolder.f7252b != null && (this.f7247c.get(i) instanceof String)) {
            listThreeOuterViewHolder.f7252b.setText(String.valueOf(this.f7247c.get(i)));
        }
        if (listThreeOuterViewHolder.f7251a != null && (list = this.f7245a) != null && i < list.size() && this.f7246b != null && (this.f7245a.get(i) instanceof String)) {
            listThreeOuterViewHolder.f7251a.setText(String.valueOf(this.f7245a.get(i)));
            listThreeOuterViewHolder.f7251a.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.adapter.Section1_1Card_01_Outer_Adapter.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Section1_1Card_01_Outer_Adapter.this.f7246b.onClick(i, "SHOW_MORE_CLICK_EVENT");
                }
            });
        }
        b(i, listThreeOuterViewHolder);
        a(listThreeOuterViewHolder, i);
    }

    private void c(final ListThreeOuterViewHolder listThreeOuterViewHolder, int i) {
        if (this.d.get(i) instanceof String) {
            String str = (String) this.d.get(i);
            if (!TextUtils.isEmpty(str)) {
                qqf.a(str, listThreeOuterViewHolder.d, R.drawable.section_blank_1008, new AsyncLoadDrawableCallback() { // from class: com.huawei.health.knit.section.adapter.Section1_1Card_01_Outer_Adapter.3
                    @Override // com.huawei.ui.commonui.utils.AsyncLoadDrawableCallback
                    public void getDrawable(final Drawable drawable) {
                        qqf.a(drawable);
                        HandlerExecutor.c(new Runnable() { // from class: com.huawei.health.knit.section.adapter.Section1_1Card_01_Outer_Adapter.3.5
                            @Override // java.lang.Runnable
                            public void run() {
                                listThreeOuterViewHolder.f7253c.setBackground(drawable);
                                listThreeOuterViewHolder.d.setVisibility(8);
                            }
                        });
                    }
                });
            } else {
                listThreeOuterViewHolder.d.setVisibility(8);
            }
        }
        if (this.d.get(i) instanceof Integer) {
            listThreeOuterViewHolder.d.setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<Object> list = this.d;
        int size = list != null ? list.size() : 0;
        List<Object> list2 = this.h;
        int size2 = list2 != null ? list2.size() : 0;
        List<Object> list3 = this.f7247c;
        int size3 = list3 != null ? list3.size() : 0;
        List<Map<Object, Object>> list4 = this.j;
        int size4 = list4 != null ? list4.size() : 0;
        List<Object> list5 = this.f7245a;
        return Math.max(size, Math.max(size2, Math.max(size3, Math.max(size4, list5 != null ? list5.size() : 0))));
    }

    private void a(ListThreeOuterViewHolder listThreeOuterViewHolder, int i) {
        RecyclerView.LayoutParams layoutParamsE = e(listThreeOuterViewHolder, i);
        if (layoutParamsE == null) {
            LogUtil.c("params is invalid!", new Object[0]);
        } else if (listThreeOuterViewHolder.f7253c != null) {
            listThreeOuterViewHolder.f7253c.setLayoutParams(layoutParamsE);
        }
    }

    protected RecyclerView.LayoutParams e(ListThreeOuterViewHolder listThreeOuterViewHolder, int i) {
        ViewGroup.LayoutParams layoutParams = listThreeOuterViewHolder.f7253c.getLayoutParams();
        if (!(layoutParams instanceof RecyclerView.LayoutParams)) {
            LogUtil.c("layoutParams error", new Object[0]);
            return null;
        }
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
        if (getItemCount() > 1) {
            layoutParams2.width = this.e.getResources().getDimensionPixelSize(R.dimen.health_common_300dp);
        }
        int dimensionPixelSize = this.e.getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart);
        int dimensionPixelSize2 = this.e.getResources().getDimensionPixelSize(R.dimen.defaultPaddingEnd);
        int dimensionPixelSize3 = this.e.getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle);
        if (i == 0) {
            layoutParams2.setMarginStart(dimensionPixelSize);
        }
        if (i == getItemCount() - 1) {
            if (i != 0) {
                dimensionPixelSize = dimensionPixelSize3;
            }
            layoutParams2.setMarginStart(dimensionPixelSize);
            layoutParams2.setMarginEnd(dimensionPixelSize2);
        }
        if (i > 0 && i < getItemCount() - 1) {
            layoutParams2.setMarginStart(dimensionPixelSize3);
        }
        return layoutParams2;
    }

    public static class ListThreeOuterViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthButton f7251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f7252b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private FrameLayout f7253c;
        private ImageView d;
        private HealthRecycleView e;
        private HealthTextView f;

        public ListThreeOuterViewHolder(View view) {
            super(view);
            this.f7253c = (FrameLayout) view.findViewById(R.id.course_item_tahiti);
            this.d = (ImageView) view.findViewById(R.id.course_item_tahiti_background);
            this.f = (HealthTextView) view.findViewById(R.id.series_course_tahiti_title);
            this.f7252b = (HealthTextView) view.findViewById(R.id.series_course_tahiti_subtitle);
            this.e = (HealthRecycleView) view.findViewById(R.id.course_item_recyclerview);
            this.f7251a = (HealthButton) view.findViewById(R.id.bt_show_more);
        }
    }

    private void b(int i, ListThreeOuterViewHolder listThreeOuterViewHolder) {
        List<Map<Object, Object>> list = this.j;
        if (list == null || i >= list.size() || this.j.get(i) == null) {
            return;
        }
        Object obj = this.j.get(i).get("IMAGE");
        Object obj2 = this.j.get(i).get("NAME");
        Object obj3 = this.j.get(i).get("DIFFICULTY");
        Object obj4 = this.j.get(i).get("TIME");
        if ((obj instanceof List) && (obj2 instanceof List) && (obj3 instanceof List) && (obj4 instanceof List)) {
            foz fozVar = new foz((List) obj, (List) obj2, (List) obj3, (List) obj4, i);
            Section1_1Card_01_Inner_Adapter section1_1Card_01_Inner_Adapter = new Section1_1Card_01_Inner_Adapter(this.e, this.f7246b);
            section1_1Card_01_Inner_Adapter.a(fozVar);
            if (listThreeOuterViewHolder.e != null) {
                listThreeOuterViewHolder.e.b(false);
                listThreeOuterViewHolder.e.e(false);
                listThreeOuterViewHolder.e.setAdapter(section1_1Card_01_Inner_Adapter);
                listThreeOuterViewHolder.e.setLayoutManager(new LinearLayoutManager(this.e, 1, false));
            }
        }
    }
}
