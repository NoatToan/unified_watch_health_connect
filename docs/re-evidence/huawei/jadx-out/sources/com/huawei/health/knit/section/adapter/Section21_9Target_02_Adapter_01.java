package com.huawei.health.knit.section.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.columnlayout.HealthColumnLinearLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import defpackage.fph;
import defpackage.fts;
import defpackage.qqf;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class Section21_9Target_02_Adapter_01 extends RecyclerView.Adapter<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f7291a = (int) BaseApplication.getContext().getResources().getDimension(R.dimen.health_common_8dp);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f7292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f7293c;
    private List<String> d;
    private List<String> e;
    private OnClickSectionListener f;
    private List<Integer> g;
    private c h;
    private List<String> i;
    private List<Integer> j;
    private List<String> k;
    private List<String> o;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i;
    }

    public Section21_9Target_02_Adapter_01(Context context, fph fphVar) {
        this.f7293c = context;
        e(fphVar);
    }

    private void e(fph fphVar) {
        this.f7292b = fphVar.d();
        this.i = fphVar.b();
        this.d = fphVar.a();
        this.k = fphVar.i();
        this.e = fphVar.e();
        this.g = fphVar.c();
        this.o = fphVar.h();
        this.j = fphVar.g();
        this.f = fphVar.j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new c(LayoutInflater.from(this.f7293c).inflate(R.layout.section21_9target_02_item_01, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(c cVar, int i) {
        this.h = cVar;
        if (qrs.y()) {
            this.h.m.setTextSize(1, 31.5f);
            qrs.a(this.h.m);
            this.h.j.setTextSize(1, 17.4f);
            qrs.a(this.h.j);
            this.h.h.setTextSize(1, 17.4f);
            qrs.a(this.h.h);
            this.h.i.setTextSize(1, 17.4f);
            qrs.a(this.h.i);
            this.h.f7294a.setTextSize(1, 31.5f);
            qrs.a(this.h.f7294a);
            this.h.f7295b.setTextSize(1, 17.4f);
            qrs.a(this.h.f7295b);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.h.l.getLayoutParams();
            layoutParams.topMargin = (int) BaseApplication.getContext().getResources().getDimension(R.dimen.health_common_12dp);
            layoutParams.bottomMargin = (int) BaseApplication.getContext().getResources().getDimension(R.dimen.health_common_12dp);
            this.h.l.setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.h.o.getLayoutParams();
            layoutParams2.topMargin = (int) BaseApplication.getContext().getResources().getDimension(R.dimen.health_common_2dp);
            this.h.o.setLayoutParams(layoutParams2);
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.h.g.getLayoutParams();
            layoutParams3.height = (int) BaseApplication.getContext().getResources().getDimension(R.dimen.health_common_12dp);
            this.h.g.setLayoutParams(layoutParams3);
        }
        this.h.m.setVisibility(8);
        this.h.j.setVisibility(8);
        this.h.h.setVisibility(8);
        this.h.i.setVisibility(8);
        this.h.g.setVisibility(8);
        this.h.n.setVisibility(8);
        this.h.f7294a.setVisibility(8);
        this.h.f7295b.setVisibility(8);
        if (this.f7292b != null && this.i != null && this.d == null && this.k != null && this.e == null && this.g == null && this.o == null) {
            a(i, true);
        } else {
            a(i, false);
        }
    }

    private void a(final int i, boolean z) {
        if (!z) {
            this.h.l.setVisibility(0);
            this.h.e.setVisibility(8);
        } else {
            this.h.l.setVisibility(8);
            this.h.e.setVisibility(0);
        }
        c(i);
        if (this.h.o != null) {
            if (LanguageUtil.f(BaseApplication.getContext())) {
                this.h.o.setOrientation(0);
            } else {
                this.h.o.setOrientation(1);
            }
        }
        e(i);
        if (this.h.d != null) {
            this.h.d.setOnClickListener(new View.OnClickListener() { // from class: fpd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f34348b.b(i, view);
                }
            });
        }
    }

    public /* synthetic */ void b(int i, View view) {
        if (this.f != null) {
            LogUtil.a("Track_RunPlanProvider", "target click");
            this.f.onClick(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return fts.e(this.f7292b, this.i, this.k, this.d, this.e, this.o);
    }

    private void e(final int i) {
        if (fts.d(this.i, i) && this.h.j != null) {
            this.h.j.setVisibility(0);
            this.h.j.setText(this.i.get(i));
            e(this.h.j);
        }
        if (fts.d(this.k, i) && this.h.m != null) {
            this.h.m.setVisibility(0);
            this.h.m.setText(this.k.get(i));
            if (LanguageUtil.bb(this.f7293c)) {
                this.h.m.setTextSize(17.0f);
            }
            if (LanguageUtil.ax(this.f7293c)) {
                this.h.m.setTextSize(16.0f);
            }
            if (qrs.ac()) {
                qrs.a(this.h.m);
            }
        }
        if (fts.d(this.d, i) && this.h.h != null) {
            this.h.h.setVisibility(0);
            this.h.h.setText(this.d.get(i));
            e(this.h.h);
        }
        if (fts.d(this.e, i) && this.h.i != null) {
            this.h.i.setVisibility(0);
            this.h.i.setText(this.e.get(i));
            e(this.h.i);
        }
        if (fts.d(this.g, i) && this.h.g != null) {
            this.h.g.setVisibility(0);
            this.h.g.setProgress(this.g.get(i).intValue());
            e(this.h.g);
        }
        if (fts.d(this.o, i) && this.h.n != null) {
            this.h.n.setText(this.o.get(i));
            this.h.n.setVisibility(0);
            this.h.n.setOnClickListener(new View.OnClickListener() { // from class: fpc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f34347c.c(i, view);
                }
            });
            b(i);
        }
        a(i);
    }

    public /* synthetic */ void c(int i, View view) {
        OnClickSectionListener onClickSectionListener = this.f;
        if (onClickSectionListener != null) {
            onClickSectionListener.onClick(i, "BUTTON_CLICK_EVENT");
        }
    }

    private void b(int i) {
        Integer num;
        if (!fts.d(this.j, i) || this.h.n == null || (num = this.j.get(i)) == null || num.intValue() == 0) {
            return;
        }
        this.h.n.setTextColor(num.intValue());
    }

    private void a(int i) {
        if (fts.d(this.i, i) && this.h.f7295b != null) {
            this.h.f7295b.setVisibility(0);
            this.h.f7295b.setText(this.i.get(i));
            e(this.h.f7295b);
        }
        if (!fts.d(this.k, i) || this.h.f7294a == null) {
            return;
        }
        this.h.f7294a.setVisibility(0);
        this.h.f7294a.setText(this.k.get(i));
        if (qrs.ac()) {
            qrs.a(this.h.f7294a);
        }
    }

    private void c(int i) {
        if (!fts.d(this.f7292b, i) || this.h.f7296c == null) {
            return;
        }
        Object obj = this.f7292b.get(i);
        Object objD = this.h.d();
        if (obj instanceof String) {
            String str = (String) obj;
            String str2 = objD instanceof String ? (String) objD : "";
            if (str.length() <= 0 || str2.equals(str)) {
                return;
            }
            qqf.e(this.h.f7296c, str, f7291a, 0, R.drawable.section_sug_bg_trining_defuct_section);
            this.h.d(str);
            return;
        }
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            int iIntValue = num.intValue();
            if ((objD instanceof Integer ? ((Integer) objD).intValue() : 0) != iIntValue) {
                qqf.a(iIntValue, this.h.f7296c, f7291a);
                this.h.d(num);
                return;
            }
            return;
        }
        qqf.a(R.drawable.section_sug_bg_trining_defuct_section, this.h.f7296c, f7291a);
    }

    static class c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f7294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f7295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthImageView f7296c;
        HealthCardView d;
        HealthColumnLinearLayout e;
        Object f;
        HealthProgressBar g;
        HealthTextView h;
        HealthTextView i;
        HealthTextView j;
        HealthColumnLinearLayout l;
        HealthTextView m;
        HealthButton n;
        LinearLayout o;

        public c(View view) {
            super(view);
            this.d = (HealthCardView) view.findViewById(R.id.section21_9target_02_item_01);
            this.f7296c = (HealthImageView) view.findViewById(R.id.background_image);
            this.m = (HealthTextView) view.findViewById(R.id.section_title);
            this.j = (HealthTextView) view.findViewById(R.id.left_value_text);
            this.h = (HealthTextView) view.findViewById(R.id.middle_value_text);
            this.i = (HealthTextView) view.findViewById(R.id.right_value_text);
            this.o = (LinearLayout) view.findViewById(R.id.value_layout);
            this.g = (HealthProgressBar) view.findViewById(R.id.progress_bar);
            this.n = (HealthButton) view.findViewById(R.id.start_button);
            this.f7294a = (HealthTextView) view.findViewById(R.id.bottom_section_title);
            this.f7295b = (HealthTextView) view.findViewById(R.id.bottom_left_value_text);
            this.l = (HealthColumnLinearLayout) view.findViewById(R.id.section_layout);
            this.e = (HealthColumnLinearLayout) view.findViewById(R.id.bottom_section_layout);
        }

        public void d(Object obj) {
            this.f = obj;
        }

        public Object d() {
            return this.f;
        }
    }

    public void e(View view) {
        if (qrs.ac()) {
            view.setVisibility(8);
        }
    }
}
