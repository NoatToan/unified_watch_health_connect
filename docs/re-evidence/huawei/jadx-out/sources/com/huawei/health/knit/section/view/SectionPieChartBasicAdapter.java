package com.huawei.health.knit.section.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import com.huawei.health.servicesui.R;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.njy;
import defpackage.qrs;
import defpackage.qsp;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class SectionPieChartBasicAdapter extends RecyclerView.Adapter<TitleViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<b> f7870a = new ArrayList();
    private final Context d;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (i != 0) {
            return i == 3 ? 2 : 1;
        }
        return 0;
    }

    public SectionPieChartBasicAdapter(Context context) {
        this.d = context;
    }

    public void c(List<b> list) {
        this.f7870a.clear();
        this.f7870a.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public TitleViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        if (i != 0) {
            i2 = R.layout.section_pie_basic_situation_value_row;
        } else {
            i2 = R.layout.section_pie_basic_situation_title_row;
        }
        View viewInflate = LayoutInflater.from(this.d).inflate(i2, viewGroup, false);
        if (i == 2) {
            d(viewInflate);
        }
        return i != 0 ? new ValueViewHolder(viewInflate) : new TitleViewHolder(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(TitleViewHolder titleViewHolder, int i) {
        if (!njy.e(this.f7870a, i)) {
            titleViewHolder.e(this.f7870a.get(i));
        }
        if (i == getItemCount() - 1) {
            qsp.c((View) titleViewHolder.f7871a, 8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f7870a.size();
    }

    private void d(View view) {
        if (view.getLayoutParams() instanceof RecyclerView.LayoutParams) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            layoutParams.height = (int) Utils.convertDpToPixel(42.0f);
            view.setLayoutParams(layoutParams);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CharSequence f7875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private CharSequence f7876b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CharSequence f7877c;
        private CharSequence d;
        private CharSequence e;
        private Drawable f;
        private Drawable g;
        private CharSequence h;
        private Drawable i;
        private CharSequence j;

        public b() {
        }

        public b(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4) {
            this(charSequence, charSequence2, null, null, charSequence3, null, null, charSequence4, null, null);
        }

        public b(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Drawable drawable, CharSequence charSequence4, CharSequence charSequence5, Drawable drawable2, CharSequence charSequence6, CharSequence charSequence7, Drawable drawable3) {
            this.d = charSequence;
            this.f7876b = charSequence2;
            this.e = charSequence3;
            this.f7877c = charSequence4;
            this.h = charSequence5;
            this.f7875a = charSequence6;
            this.j = charSequence7;
            this.i = drawable;
            this.f = drawable2;
            this.g = drawable3;
        }
    }

    public static class TitleViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HealthDivider f7871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HealthTextView f7872b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final HealthTextView f7873c;
        private final HealthTextView d;
        private final HealthTextView e;

        public TitleViewHolder(View view) {
            super(view);
            this.e = (HealthTextView) view.findViewById(R.id.text1);
            this.f7872b = (HealthTextView) view.findViewById(R.id.text2);
            this.f7873c = (HealthTextView) view.findViewById(R.id.text3);
            this.d = (HealthTextView) view.findViewById(R.id.text4);
            this.f7871a = (HealthDivider) view.findViewById(R.id.basic_situation_value_divider);
        }

        public void e(b bVar) {
            qsp.b(this.e, bVar.d);
            qsp.b(this.f7872b, bVar.f7876b);
            qsp.b(this.f7873c, bVar.f7877c);
            qsp.b(this.d, bVar.f7875a);
            if (qrs.y() && qrs.i() < 1.45f) {
                this.d.setTextSize(1, 14.0f);
                return;
            }
            if (qrs.i() >= 1.45f && qrs.i() < 1.55f) {
                this.d.setTextSize(1, 17.0f);
            } else if (qrs.i() > 1.55f) {
                this.d.setTextSize(1, 22.0f);
            } else {
                this.d.setTextSize(1, 14.0f);
            }
        }
    }

    public static class ValueViewHolder extends TitleViewHolder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HealthTextView f7874b;
        private final HealthTextView d;
        private final HealthTextView e;

        public ValueViewHolder(View view) {
            super(view);
            this.d = (HealthTextView) view.findViewById(R.id.textSub2);
            this.f7874b = (HealthTextView) view.findViewById(R.id.textSub3);
            this.e = (HealthTextView) view.findViewById(R.id.textSub4);
        }

        @Override // com.huawei.health.knit.section.view.SectionPieChartBasicAdapter.TitleViewHolder
        public void e(b bVar) {
            super.e(bVar);
            qsp.b(this.d, bVar.e);
            HealthTextView healthTextView = this.d;
            if (healthTextView != null) {
                healthTextView.setVisibility(TextUtils.isEmpty(bVar.e) ? 8 : 0);
            }
            qsp.a(this.d, bVar.i);
            qsp.b(this.f7874b, bVar.h);
            HealthTextView healthTextView2 = this.f7874b;
            if (healthTextView2 != null) {
                healthTextView2.setVisibility(TextUtils.isEmpty(bVar.h) ? 8 : 0);
            }
            qsp.a(this.f7874b, bVar.f);
            qsp.b(this.e, bVar.j);
            HealthTextView healthTextView3 = this.e;
            if (healthTextView3 != null) {
                healthTextView3.setVisibility(TextUtils.isEmpty(bVar.j) ? 8 : 0);
            }
            qsp.a(this.e, bVar.g);
        }
    }
}
