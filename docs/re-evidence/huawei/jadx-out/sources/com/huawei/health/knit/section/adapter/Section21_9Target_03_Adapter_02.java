package com.huawei.health.knit.section.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.pricetagbean.PriceTagBean;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.fpo;
import defpackage.fts;
import defpackage.njy;
import defpackage.pea;
import defpackage.qqf;
import defpackage.qrs;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class Section21_9Target_03_Adapter_02 extends RecyclerView.Adapter<b> {
    private static final int e = (int) BaseApplication.getContext().getResources().getDimension(R.dimen.health_common_8dp);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f7309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<List<PriceTagBean>> f7310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f7311c;
    private List<Object> d;
    private OnClickSectionListener f;
    private b g;
    private List<String> i;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i;
    }

    public Section21_9Target_03_Adapter_02(Context context, fpo fpoVar) {
        this.f7309a = context;
        b(fpoVar);
    }

    private void b(fpo fpoVar) {
        this.i = fpoVar.a();
        this.d = fpoVar.c();
        this.f7311c = fpoVar.b();
        this.f = fpoVar.e();
        this.f7310b = fpoVar.d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(this.f7309a).inflate(R.layout.section21_9target_03_item_02, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i) {
        this.g = bVar;
        b(i);
    }

    private void b(final int i) {
        RecyclerView.LayoutParams layoutParamsE = e(i);
        if (layoutParamsE == null) {
            LogUtil.e("params is invalid!", new Object[0]);
            return;
        }
        if (fts.d(this.d, i) && this.g.f7313b != null) {
            c(i);
        }
        if (fts.d(this.f7310b, i) && this.g.f7314c != null) {
            d(i);
        }
        if (fts.d(this.i, i) && this.g.f != null) {
            this.g.f.setText(this.i.get(i));
        }
        if (fts.d(this.f7311c, i) && this.g.d != null) {
            this.g.d.setText(this.f7311c.get(i));
        }
        if (this.g.f7312a != null) {
            this.g.f7312a.setLayoutParams(layoutParamsE);
            this.g.f7312a.setOnClickListener(new View.OnClickListener() { // from class: fpp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.c(i, view);
                }
            });
        }
    }

    public /* synthetic */ void c(int i, View view) {
        OnClickSectionListener onClickSectionListener = this.f;
        if (onClickSectionListener != null) {
            onClickSectionListener.onClick(i);
        }
    }

    private void d(int i) {
        if (njy.e(this.f7310b, i)) {
            LogUtil.a("Section21_9Target_03_Adapter_02", "position is out of bounds");
            this.g.f7314c.setVisibility(8);
            return;
        }
        List<PriceTagBean> list = this.f7310b.get(i);
        if (njy.b(list)) {
            this.g.f7314c.setVisibility(0);
            qqf.d(pea.e(list), this.g.f7314c, 0.0f, qqf.d, 0.0f, 0.0f);
        } else {
            this.g.f7314c.setVisibility(8);
        }
    }

    private void c(int i) {
        Object obj = this.d.get(i);
        Object objB = this.g.b();
        if (obj instanceof String) {
            c(obj, objB);
        } else if (obj instanceof Integer) {
            d(obj, objB);
        } else {
            qqf.a(R.drawable.section_sug_bg_trining_defuct_section, this.g.f7313b, e);
        }
    }

    private void c(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = obj2 instanceof String ? (String) obj2 : "";
        if (str.length() <= 0 || str2.equals(str)) {
            return;
        }
        qqf.e(this.g.f7313b, str, e, 0, R.drawable.section_sug_bg_trining_defuct_section);
        this.g.d(str);
    }

    private void d(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        if ((obj2 instanceof Integer ? ((Integer) obj2).intValue() : 0) != iIntValue) {
            qqf.a(iIntValue, this.g.f7313b, e);
            this.g.d(num);
        }
    }

    private RecyclerView.LayoutParams e(int i) {
        ViewGroup.LayoutParams layoutParams = this.g.f7312a.getLayoutParams();
        if (!(layoutParams instanceof RecyclerView.LayoutParams)) {
            LogUtil.e("layoutParams error", new Object[0]);
            return null;
        }
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
        int dimensionPixelSize = this.f7309a.getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart);
        int dimensionPixelSize2 = this.f7309a.getResources().getDimensionPixelSize(R.dimen.defaultPaddingEnd);
        int dimensionPixelSize3 = this.f7309a.getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle);
        if (i == 0) {
            layoutParams2.setMarginStart(dimensionPixelSize);
            return layoutParams2;
        }
        if (i == getItemCount() - 1) {
            layoutParams2.setMarginStart(dimensionPixelSize3);
            layoutParams2.setMarginEnd(dimensionPixelSize2);
            return layoutParams2;
        }
        layoutParams2.setMarginStart(dimensionPixelSize3);
        return layoutParams2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return fts.e(this.d, this.i, this.f7311c);
    }

    static class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final FrameLayout f7312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HealthImageView f7313b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final HealthImageView f7314c;
        private final TextView d;
        private Object e;
        private final TextView f;

        public b(View view) {
            super(view);
            this.f7312a = (FrameLayout) view.findViewById(R.id.section21_9target_03_item_02);
            this.f7313b = (HealthImageView) view.findViewById(R.id.background_image);
            TextView textView = (TextView) view.findViewById(R.id.section_title);
            this.f = textView;
            TextView textView2 = (TextView) view.findViewById(R.id.section_description);
            this.d = textView2;
            this.f7314c = (HealthImageView) view.findViewById(R.id.card_corner);
            if (qrs.ac()) {
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setMaxLines(1);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
            }
        }

        public void d(Object obj) {
            this.e = obj;
        }

        public Object b() {
            return this.e;
        }
    }
}
