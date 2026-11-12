package com.huawei.health.knit.section.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.fow;
import defpackage.fts;
import defpackage.qqf;
import defpackage.qrs;
import defpackage.qsp;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class Section16_9Series_01Adapter extends RecyclerView.Adapter<Section16_9Series_01ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f7229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f7230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Object> f7231c;
    private List<String> d;
    private Context e;
    private List<String> f;
    private OnClickSectionListener g;
    private List<String> h;
    private List<String> i;
    private List<Object> j;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i;
    }

    public Section16_9Series_01Adapter(Context context, fow fowVar) {
        this.e = context;
        a(fowVar);
    }

    public void c(fow fowVar) {
        a(fowVar);
        notifyDataSetChanged();
    }

    private void a(fow fowVar) {
        this.h = fowVar.j();
        this.f7231c = fowVar.e();
        this.j = fowVar.i();
        this.f7230b = fowVar.b();
        this.d = fowVar.a();
        this.f = fowVar.d();
        this.f7229a = fowVar.c();
        this.i = fowVar.f();
        this.g = fowVar.h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Section16_9Series_01ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new Section16_9Series_01ViewHolder(LayoutInflater.from(this.e).inflate(R.layout.section16_9series_01_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(Section16_9Series_01ViewHolder section16_9Series_01ViewHolder, int i) {
        b(section16_9Series_01ViewHolder, i);
    }

    private void b(Section16_9Series_01ViewHolder section16_9Series_01ViewHolder, final int i) {
        RecyclerView.LayoutParams layoutParamsC = c(section16_9Series_01ViewHolder, i);
        if (layoutParamsC == null) {
            LogUtil.e("params is invalid!", new Object[0]);
            return;
        }
        if (section16_9Series_01ViewHolder.g != null) {
            section16_9Series_01ViewHolder.g.setLayoutParams(layoutParamsC);
            section16_9Series_01ViewHolder.g.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.adapter.Section16_9Series_01Adapter.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (Section16_9Series_01Adapter.this.g != null) {
                        Section16_9Series_01Adapter.this.g.onClick(i);
                    }
                }
            });
        }
        a(section16_9Series_01ViewHolder, i);
        f(section16_9Series_01ViewHolder, i);
        d(section16_9Series_01ViewHolder, i);
        h(section16_9Series_01ViewHolder, i);
    }

    protected RecyclerView.LayoutParams c(Section16_9Series_01ViewHolder section16_9Series_01ViewHolder, int i) {
        ViewGroup.LayoutParams layoutParams = section16_9Series_01ViewHolder.g.getLayoutParams();
        if (!(layoutParams instanceof RecyclerView.LayoutParams)) {
            LogUtil.e("layoutParams error", new Object[0]);
            return null;
        }
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
        int dimensionPixelSize = this.e.getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart);
        int dimensionPixelSize2 = this.e.getResources().getDimensionPixelSize(R.dimen.defaultPaddingEnd);
        int dimensionPixelSize3 = this.e.getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle);
        if (i == 0) {
            layoutParams2.setMarginStart(dimensionPixelSize + ((Integer) BaseActivity.getSafeRegionWidth().first).intValue());
            return layoutParams2;
        }
        if (i == getItemCount() - 1) {
            layoutParams2.setMarginStart(dimensionPixelSize3);
            layoutParams2.setMarginEnd(dimensionPixelSize2 + ((Integer) BaseActivity.getSafeRegionWidth().second).intValue());
            return layoutParams2;
        }
        layoutParams2.setMarginStart(dimensionPixelSize3);
        return layoutParams2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return fts.e(this.f7231c, this.h, this.d, this.f, this.f7229a, this.i);
    }

    private void h(Section16_9Series_01ViewHolder section16_9Series_01ViewHolder, int i) {
        if (fts.d(this.h, i) && section16_9Series_01ViewHolder.o != null) {
            section16_9Series_01ViewHolder.o.setText(this.h.get(i));
        }
        if (!fts.d(this.d, i) || TextUtils.isEmpty(this.d.get(i)) || section16_9Series_01ViewHolder.h == null) {
            qsp.c((View) section16_9Series_01ViewHolder.h, 8);
        } else {
            section16_9Series_01ViewHolder.h.setText(this.d.get(i));
        }
        if (fts.d(this.f, i) && section16_9Series_01ViewHolder.j != null) {
            section16_9Series_01ViewHolder.j.setText(this.f.get(i));
        }
        if (!fts.d(this.f7229a, i) || TextUtils.isEmpty(this.f7229a.get(i)) || section16_9Series_01ViewHolder.d == null) {
            qsp.c((View) section16_9Series_01ViewHolder.d, 8);
        } else {
            section16_9Series_01ViewHolder.d.setText(this.f7229a.get(i));
        }
        if (!fts.d(this.i, i) || section16_9Series_01ViewHolder.l == null) {
            return;
        }
        section16_9Series_01ViewHolder.l.setText(this.i.get(i));
        if (qrs.ac()) {
            section16_9Series_01ViewHolder.l.setVisibility(8);
        }
    }

    private void c(final Section16_9Series_01ViewHolder section16_9Series_01ViewHolder, Object obj, Object obj2) {
        final String str = (String) obj;
        String str2 = obj2 instanceof String ? (String) obj2 : "";
        if (str.length() > 0 && !str.equals(str2)) {
            qqf.b(str, new CustomTarget<Drawable>() { // from class: com.huawei.health.knit.section.adapter.Section16_9Series_01Adapter.2
                @Override // com.bumptech.glide.request.target.Target
                public void onLoadCleared(Drawable drawable) {
                }

                @Override // com.bumptech.glide.request.target.Target
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onResourceReady(Drawable drawable, Transition<? super Drawable> transition) {
                    section16_9Series_01ViewHolder.f.setImageDrawable(drawable);
                    section16_9Series_01ViewHolder.b(str);
                }

                @Override // com.bumptech.glide.request.target.CustomTarget, com.bumptech.glide.request.target.Target
                public void onLoadFailed(Drawable drawable) {
                    LogUtil.j("Section16_9Series_01Adapter", "loadRoundRectangle onLoadFailed");
                }
            });
        }
        section16_9Series_01ViewHolder.f.setVisibility(0);
    }

    private void f(Section16_9Series_01ViewHolder section16_9Series_01ViewHolder, int i) {
        if (fts.d(this.j, i) && section16_9Series_01ViewHolder.f != null) {
            Object obj = this.j.get(i);
            Object objB = section16_9Series_01ViewHolder.b();
            if (obj instanceof String) {
                c(section16_9Series_01ViewHolder, obj, objB);
                return;
            }
            if (obj instanceof Integer) {
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                if (iIntValue != (objB instanceof Integer ? ((Integer) objB).intValue() : 0)) {
                    section16_9Series_01ViewHolder.f.setImageResource(iIntValue);
                    section16_9Series_01ViewHolder.b(num);
                }
                section16_9Series_01ViewHolder.f.setVisibility(0);
                return;
            }
            section16_9Series_01ViewHolder.f.setVisibility(8);
            return;
        }
        qsp.c((View) section16_9Series_01ViewHolder.f, 8);
    }

    private void d(Section16_9Series_01ViewHolder section16_9Series_01ViewHolder, int i) {
        if (section16_9Series_01ViewHolder.f == null || section16_9Series_01ViewHolder.f.getVisibility() != 0) {
            if (fts.d(this.f7230b, i) && section16_9Series_01ViewHolder.f7237c != null) {
                String str = this.f7230b.get(i);
                boolean zIsEmpty = TextUtils.isEmpty(str);
                if (!zIsEmpty) {
                    qqf.d(str, section16_9Series_01ViewHolder.f7237c, 0.0f, qqf.d, 0.0f, 0.0f);
                }
                qsp.c((View) section16_9Series_01ViewHolder.f7237c, zIsEmpty ? 8 : 0);
                return;
            }
            qsp.c((View) section16_9Series_01ViewHolder.f7237c, 8);
            return;
        }
        qsp.c((View) section16_9Series_01ViewHolder.f7237c, 8);
    }

    private void a(Section16_9Series_01ViewHolder section16_9Series_01ViewHolder, int i) {
        if (!fts.d(this.f7231c, i) || section16_9Series_01ViewHolder.f7236b == null) {
            return;
        }
        Object obj = this.f7231c.get(i);
        Object objD = section16_9Series_01ViewHolder.d();
        if (obj instanceof String) {
            String str = (String) obj;
            String str2 = objD instanceof String ? (String) objD : "";
            if (str.length() <= 0 || str.equals(str2)) {
                return;
            }
            qqf.e(section16_9Series_01ViewHolder.f7236b, str, qqf.d, 6, R.drawable.section_blank_1008);
            section16_9Series_01ViewHolder.d(str);
            return;
        }
        if (obj instanceof Integer) {
            int iIntValue = objD instanceof Integer ? ((Integer) objD).intValue() : 0;
            Integer num = (Integer) obj;
            int iIntValue2 = num.intValue();
            if (iIntValue != iIntValue2) {
                section16_9Series_01ViewHolder.f7236b.setImageResource(iIntValue2);
                section16_9Series_01ViewHolder.d(num);
                return;
            }
            return;
        }
        qqf.a(R.drawable.section_blank_1008, section16_9Series_01ViewHolder.f7236b, qqf.d);
    }

    public class Section16_9Series_01ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f7235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthImageView f7236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthImageView f7237c;
        private HealthTextView d;
        private ImageView f;
        private FrameLayout g;
        private HealthTextView h;
        private Object i;
        private HealthTextView j;
        private HealthTextView l;
        private HealthTextView o;

        public Section16_9Series_01ViewHolder(View view) {
            super(view);
            this.g = (FrameLayout) view.findViewById(R.id.recycle_item);
            this.f7236b = (HealthImageView) view.findViewById(R.id.background_image);
            this.f7237c = (HealthImageView) view.findViewById(R.id.section16_9series_01_card_corner);
            this.f = (ImageView) view.findViewById(R.id.new_image);
            this.o = (HealthTextView) view.findViewById(R.id.section_title);
            this.h = (HealthTextView) view.findViewById(R.id.section_difficulty);
            this.j = (HealthTextView) view.findViewById(R.id.section_duration);
            this.d = (HealthTextView) view.findViewById(R.id.section_calorie);
            this.l = (HealthTextView) view.findViewById(R.id.section_train_number);
        }

        Object d() {
            return this.f7235a;
        }

        void d(Object obj) {
            this.f7235a = obj;
        }

        Object b() {
            return this.i;
        }

        void b(Object obj) {
            this.i = obj;
        }

        public FrameLayout a() {
            return this.g;
        }
    }
}
