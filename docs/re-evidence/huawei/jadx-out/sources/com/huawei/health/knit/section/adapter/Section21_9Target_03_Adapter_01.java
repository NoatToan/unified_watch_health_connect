package com.huawei.health.knit.section.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import defpackage.fpn;
import defpackage.fts;
import defpackage.qqf;
import defpackage.qrs;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class Section21_9Target_03_Adapter_01 extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f7303a = (int) BaseApplication.getContext().getResources().getDimension(R.dimen.health_common_8dp);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Object> f7304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f7305c;
    private List<String> d;
    private List<String> e;
    private List<Integer> f;
    private List<Integer> g;
    private b h;
    private OnClickSectionListener i;
    private List<String> j;
    private List<String> k;
    private List<String> l;
    private List<String> m;
    private List<String> o;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i;
    }

    public Section21_9Target_03_Adapter_01(Context context, fpn fpnVar) {
        this.f7305c = context;
        a(fpnVar);
    }

    private void a(fpn fpnVar) {
        this.f7304b = fpnVar.d();
        this.j = fpnVar.a();
        this.e = fpnVar.c();
        this.o = fpnVar.n();
        this.d = fpnVar.e();
        this.f = fpnVar.b();
        this.m = fpnVar.i();
        this.g = fpnVar.f();
        this.l = fpnVar.g();
        this.k = fpnVar.j();
        this.i = fpnVar.h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(this.f7305c).inflate(R.layout.section21_9target_03_item_01, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i) {
        this.h = bVar;
        e(i);
    }

    private void e(final int i) {
        if (fts.d(this.f7304b, i) && this.h.f7306a != null) {
            c(i);
        }
        if (fts.d(this.k, i) && this.h.h != null) {
            if (fts.d(this.j, i) && this.h.i != null) {
                this.h.i.setText(this.j.get(i));
            }
            this.h.h.setText(this.k.get(i));
            this.h.f.setVisibility(8);
            this.h.f7307b.setVisibility(0);
        } else {
            d(i);
        }
        if (this.h.d != null) {
            this.h.d.setLayoutParams(a(i));
            this.h.d.setOnClickListener(new View.OnClickListener() { // from class: fpq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.d(i, view);
                }
            });
        }
    }

    public /* synthetic */ void d(int i, View view) {
        OnClickSectionListener onClickSectionListener = this.i;
        if (onClickSectionListener != null) {
            onClickSectionListener.onClick(i);
        }
    }

    private RecyclerView.LayoutParams a(int i) {
        ViewGroup.LayoutParams layoutParams = this.h.d.getLayoutParams();
        if (!(layoutParams instanceof RecyclerView.LayoutParams)) {
            LogUtil.e("layoutParams error", new Object[0]);
            return null;
        }
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
        int dimensionPixelSize = this.f7305c.getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart);
        int dimensionPixelSize2 = this.f7305c.getResources().getDimensionPixelSize(R.dimen.defaultPaddingEnd);
        int dimensionPixelSize3 = this.f7305c.getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle);
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

    private void d(final int i) {
        this.h.f.setVisibility(0);
        this.h.f7307b.setVisibility(8);
        if (fts.d(this.l, i) && this.h.g != null) {
            this.h.g.setText(this.l.get(i));
            this.h.g.setVisibility(0);
            this.h.k.setVisibility(8);
            this.h.l.setVisibility(8);
        } else if (fts.d(this.m, i) && this.h.k != null) {
            this.h.k.setText(this.m.get(i));
            this.h.k.setVisibility(0);
            this.h.l.setVisibility(8);
            this.h.k.setOnClickListener(new View.OnClickListener() { // from class: fpk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f34363c.a(i, view);
                }
            });
            b(i);
        } else {
            this.h.l.setVisibility(0);
        }
        i(i);
    }

    public /* synthetic */ void a(int i, View view) {
        OnClickSectionListener onClickSectionListener = this.i;
        if (onClickSectionListener != null) {
            onClickSectionListener.onClick(i, "BUTTON_CLICK_EVENT");
        }
    }

    private void b(int i) {
        Integer num;
        if (!fts.d(this.g, i) || this.h.k == null || (num = this.g.get(i)) == null || num.intValue() == 0) {
            return;
        }
        this.h.k.setTextColor(num.intValue());
    }

    private void i(int i) {
        if (fts.d(this.j, i) && this.h.e != null) {
            this.h.e.setText(this.j.get(i));
        }
        if (fts.d(this.o, i) && this.h.n != null) {
            this.h.n.setText(this.o.get(i));
        }
        if (fts.d(this.e, i) && this.h.j != null) {
            this.h.j.setText(this.e.get(i));
        }
        if (fts.d(this.d, i) && this.h.o != null) {
            this.h.o.setText(this.d.get(i));
        }
        if (fts.d(this.f, i) && this.h.m != null) {
            this.h.m.setProgress(this.f.get(i).intValue());
        }
        g(i);
    }

    private void c(int i) {
        c();
        Object obj = this.f7304b.get(i);
        Object objC = this.h.c();
        if (obj instanceof String) {
            a(obj, objC);
        } else if (obj instanceof Integer) {
            e(obj, objC);
        } else {
            qqf.a(R.drawable.section_sug_bg_trining_defuct_section, this.h.f7306a, f7303a);
        }
    }

    private void a(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = obj2 instanceof String ? (String) obj2 : "";
        if (str.length() <= 0 || str2.equals(str)) {
            return;
        }
        qqf.e(this.h.f7306a, str, f7303a, 0, R.drawable.section_sug_bg_trining_defuct_section);
        this.h.d(str);
    }

    private void e(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        if ((obj2 instanceof Integer ? ((Integer) obj2).intValue() : 0) != iIntValue) {
            qqf.a(iIntValue, this.h.f7306a, f7303a);
            this.h.d(num);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return fts.e(this.f7304b, this.j, this.o, this.e, this.d, this.m);
    }

    private void c() {
        if (this.h.m != null) {
            this.h.m.setVisibility(0);
        }
        if (this.h.j != null) {
            this.h.j.setVisibility(0);
        }
        if (this.h.o != null) {
            this.h.o.setVisibility(0);
        }
    }

    private void g(int i) {
        if (this.f7305c == null || !fts.d(this.m, i) || TextUtils.isEmpty(this.m.get(i)) || !TextUtils.equals(this.m.get(i), BaseApplication.getContext().getResources().getString(R.string.IDS_user_vip_renew))) {
            return;
        }
        if (this.h.k != null) {
            this.h.k.setVisibility(0);
        }
        if (this.h.m != null) {
            this.h.m.setVisibility(8);
        }
        if (this.h.j != null) {
            this.h.j.setVisibility(8);
        }
        if (this.h.o != null) {
            this.h.o.setVisibility(8);
        }
    }

    static class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthImageView f7306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        LinearLayout f7307b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f7308c;
        HealthCardView d;
        HealthTextView e;
        LinearLayout f;
        HealthTextView g;
        HealthTextView h;
        HealthTextView i;
        HealthTextView j;
        HealthButton k;
        View l;
        HealthProgressBar m;
        HealthTextView n;
        HealthTextView o;

        public b(View view) {
            super(view);
            this.d = (HealthCardView) view.findViewById(R.id.section21_9target_03_item_01);
            this.f7306a = (HealthImageView) view.findViewById(R.id.background_image);
            this.n = (HealthTextView) view.findViewById(R.id.section_title);
            this.e = (HealthTextView) view.findViewById(R.id.left_value_text);
            this.j = (HealthTextView) view.findViewById(R.id.middle_value_text);
            this.o = (HealthTextView) view.findViewById(R.id.right_value_text);
            this.m = (HealthProgressBar) view.findViewById(R.id.progress_bar);
            this.k = (HealthButton) view.findViewById(R.id.start_button);
            this.l = view.findViewById(R.id.space_view);
            this.g = (HealthTextView) view.findViewById(R.id.summary_text);
            this.i = (HealthTextView) this.d.findViewById(R.id.lowerText);
            this.h = (HealthTextView) view.findViewById(R.id.upperText);
            this.f = (LinearLayout) this.d.findViewById(R.id.ongoing_view);
            this.f7307b = (LinearLayout) this.d.findViewById(R.id.helper_view);
            e();
        }

        public void d(Object obj) {
            this.f7308c = obj;
        }

        public Object c() {
            return this.f7308c;
        }

        private void e() {
            b();
        }

        private void b() {
            if (qrs.d(1.45f)) {
                if (BaseApplication.getContext().getResources() == null) {
                    LogUtil.j("Section21_9Target_03_Adapter_01", "setLargeFontScaleMode resources is null.");
                    return;
                }
                if (this.n.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) this.n.getLayoutParams()).topMargin = 36;
                }
                this.n.setTextSize(0, 78.0f);
                this.e.setTextSize(0, 51.0f);
                this.j.setTextSize(0, 51.0f);
                this.o.setTextSize(0, 51.0f);
                this.k.setTextSize(0, 51.0f);
                this.k.setAutoTextSize(0, 51.0f);
                this.k.setAutoTextInfo(51, 1, 0);
                if (this.k.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) this.k.getLayoutParams()).bottomMargin = 36;
                }
            }
        }
    }
}
