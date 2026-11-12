package com.huawei.health.knit.section.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.knit.section.view.BaseBiItemView;
import com.huawei.health.search.SearchResultItemView;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.dkf;
import defpackage.ezi;
import defpackage.fts;
import defpackage.qqf;
import defpackage.qqp;
import defpackage.qrs;
import defpackage.qsp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class Section3_2List_01_Adapter extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f7320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, List<Object>> f7321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Object> f7322c;
    private List<Object> d;
    private List<Map<String, Object>> e;
    private OnClickSectionListener g;
    private String i;
    private int j = Integer.MAX_VALUE;

    public Section3_2List_01_Adapter(Context context) {
        this.f7320a = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(new SearchResultItemView(this.f7320a, R.layout.config_scholastic_page_item));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, final int i) {
        if ((aVar.itemView instanceof BaseBiItemView) && fts.d(this.e, i)) {
            ((BaseBiItemView) aVar.itemView).a(this.e.get(i));
        }
        if ((this.d.get(i) instanceof String) && fts.d(this.d, i)) {
            a(aVar, i);
        } else if ((this.d.get(i) instanceof Integer) && fts.d(this.d, i)) {
            d(aVar, ((Integer) this.d.get(i)).intValue());
        } else {
            aVar.d.setVisibility(4);
        }
        if ((this.f7322c.get(i) instanceof String) && fts.d(this.f7322c, i)) {
            qsp.a(aVar.f7324a, ezi.e((String) this.f7322c.get(i), this.i), true);
        }
        if (fts.d(this.f7322c, i)) {
            e(aVar, i);
        }
        aVar.e.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.adapter.Section3_2List_01_Adapter.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Section3_2List_01_Adapter.this.g != null) {
                    Section3_2List_01_Adapter.this.g.onClick(i);
                }
            }
        });
    }

    private void a(a aVar, int i) {
        c(aVar);
        if ((this.d.get(i) instanceof String) && fts.d(this.d, i)) {
            qqf.b(aVar.d, (String) this.d.get(i), qqf.e, 0, 0);
        }
    }

    private void c(a aVar) {
        ViewGroup.LayoutParams layoutParams = aVar.d.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.height = qqp.a(BaseApplication.getContext(), 56.0f);
            layoutParams2.width = (layoutParams2.height * 16) / 9;
            aVar.d.setLayoutParams(layoutParams2);
        }
    }

    private void d(a aVar, int i) {
        c(aVar);
        qqf.a(aVar.d, BaseApplication.getContext().getResources().getDrawable(i), qqf.d, 0);
    }

    private void e(a aVar, int i) {
        if (getItemCount() == 0) {
            return;
        }
        if (getItemCount() == 1) {
            a(aVar.f7325b);
            return;
        }
        if (qrs.af(BaseApplication.getContext())) {
            if (i == getItemCount() - 1 || i == getItemCount() - 2) {
                a(aVar.f7325b);
                return;
            }
            return;
        }
        if (i == getItemCount() - 1) {
            a(aVar.f7325b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return Math.min(a(this.f7321b), this.j);
    }

    private int a(Map<String, List<Object>> map) {
        return dkf.a(map, "Section3_2List_01_Adapter");
    }

    class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f7324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthDivider f7325b;
        ImageView d;
        LinearLayout e;

        a(View view) {
            super(view);
            this.f7325b = (HealthDivider) view.findViewById(R.id.right_img_item_line);
            this.d = (ImageView) view.findViewById(R.id.left_img_item_configure);
            this.f7324a = (HealthTextView) view.findViewById(R.id.text_area_title);
            this.e = (LinearLayout) view.findViewById(R.id.item_configure_image_text_layout);
        }
    }

    public void d(Map<String, List<Object>> map) {
        this.f7321b = map;
        this.d = new ArrayList();
        this.f7322c = new ArrayList();
        for (Map.Entry<String, List<Object>> entry : this.f7321b.entrySet()) {
            String key = entry.getKey();
            List<Object> value = entry.getValue();
            if (key.equals("SCHOLASTIC_TYPE_CONTENT")) {
                this.f7322c = value;
            } else if (key.equals("SCHOLASTIC_TYPE_IMAGE")) {
                this.d = value;
            } else {
                LogUtil.j("Section3_2List_01_Adapter", "setAdapterData listContent or listLeftImage does not obtained!");
                return;
            }
        }
    }

    public void a(int i) {
        this.j = i;
    }

    private void a(HealthDivider healthDivider) {
        if (healthDivider == null) {
            LogUtil.j("Section3_2List_01_Adapter", "setHealthDividerIsVisible healthDivider is null.");
        } else {
            healthDivider.setVisibility(4);
        }
    }

    public void d(OnClickSectionListener onClickSectionListener) {
        this.g = onClickSectionListener;
    }

    public void e(String str) {
        this.i = str;
    }

    public void c(List<Map<String, Object>> list) {
        this.e = list;
    }
}
