package com.huawei.health.knit.section.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import defpackage.fpg;
import defpackage.fts;
import defpackage.qqf;
import defpackage.qrs;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class Section21_9Target_01_Adapter_01 extends RecyclerView.Adapter<c> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f7279c = (int) BaseApplication.getContext().getResources().getDimension(R.dimen.health_common_8dp);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f7280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Integer> f7281b;
    private Context d;
    private List<String> e;
    private List<String> f;
    private c g;
    private List<String> h;
    private OnClickSectionListener i;
    private List<Integer> j;
    private List<String> l;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i;
    }

    public Section21_9Target_01_Adapter_01(Context context, fpg fpgVar) {
        this.d = context;
        a(fpgVar);
    }

    private void a(fpg fpgVar) {
        this.f7281b = fpgVar.e();
        this.f = fpgVar.c();
        this.e = fpgVar.d();
        this.l = fpgVar.i();
        this.f7280a = fpgVar.a();
        this.j = fpgVar.b();
        this.h = fpgVar.h();
        this.i = fpgVar.f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new c(LayoutInflater.from(this.d).inflate(R.layout.section21_9target_01_item_01, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(c cVar, int i) {
        this.g = cVar;
        b(i);
    }

    private void b(final int i) {
        if (fts.d(this.f7281b, i) && this.g.f7284c != null) {
            Object obj = this.f7281b.get(i);
            Object objC = this.g.c();
            if (obj instanceof String) {
                String str = (String) obj;
                String str2 = objC instanceof String ? (String) objC : "";
                if (str.length() > 0 && !str2.equals(str)) {
                    qqf.e(this.g.f7284c, str, f7279c, 0, R.drawable.section_sug_bg_trining_defuct_section);
                    this.g.a(str);
                }
            } else if (obj instanceof Integer) {
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                if ((objC instanceof Integer ? ((Integer) objC).intValue() : 0) != iIntValue) {
                    qqf.a(iIntValue, this.g.f7284c, f7279c);
                    this.g.a(num);
                }
            } else {
                qqf.a(R.drawable.section_sug_bg_trining_defuct_section, this.g.f7284c, f7279c);
            }
        }
        a(i);
        d(i);
        if (qrs.ac()) {
            this.g.f.setVisibility(8);
            qrs.a(this.g.d);
            qrs.a(this.g.f7283b);
            qrs.a(this.g.i);
            this.g.j.setVisibility(8);
        }
        if (this.g.f7282a != null) {
            this.g.f7282a.setOnClickListener(new View.OnClickListener() { // from class: fox
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.a(i, view);
                }
            });
        }
    }

    public /* synthetic */ void a(int i, View view) {
        OnClickSectionListener onClickSectionListener = this.i;
        if (onClickSectionListener != null) {
            onClickSectionListener.onClick(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return fts.e(this.f7281b, this.f, this.l, this.e, this.f7280a, this.h);
    }

    private void a(int i) {
        if (fts.d(this.f, i) && this.g.d != null) {
            this.g.d.setText(this.f.get(i));
        }
        if (fts.d(this.l, i) && this.g.g != null) {
            this.g.g.setText(this.l.get(i));
        }
        if (fts.d(this.e, i) && this.g.f7283b != null) {
            this.g.f7283b.setText(this.e.get(i));
        }
        if (fts.d(this.f7280a, i) && this.g.i != null) {
            this.g.i.setText(this.f7280a.get(i));
        }
        if (!fts.d(this.j, i) || this.g.j == null) {
            return;
        }
        this.g.j.setProgress(this.j.get(i).intValue());
    }

    private void d(final int i) {
        List<String> list = this.h;
        if (list != null && fts.d(list, i) && this.g.h != null) {
            this.g.h.setText(this.h.get(i));
            this.g.h.setVisibility(0);
            this.g.f.setVisibility(8);
            this.g.h.setOnClickListener(new View.OnClickListener() { // from class: fpa
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f34341a.c(i, view);
                }
            });
            return;
        }
        this.g.f.setVisibility(0);
    }

    public /* synthetic */ void c(int i, View view) {
        OnClickSectionListener onClickSectionListener = this.i;
        if (onClickSectionListener != null) {
            onClickSectionListener.onClick(i, "BUTTON_CLICK_EVENT");
        }
    }

    static class c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthCardView f7282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f7283b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthImageView f7284c;
        HealthTextView d;
        Object e;
        View f;
        HealthTextView g;
        HealthButton h;
        HealthTextView i;
        HealthProgressBar j;

        public c(View view) {
            super(view);
            this.f7282a = (HealthCardView) view.findViewById(R.id.section21_9target_01_item_01);
            this.f7284c = (HealthImageView) view.findViewById(R.id.background_image);
            this.g = (HealthTextView) view.findViewById(R.id.section_title);
            this.d = (HealthTextView) view.findViewById(R.id.left_value_text);
            this.f7283b = (HealthTextView) view.findViewById(R.id.middle_value_text);
            this.i = (HealthTextView) view.findViewById(R.id.right_value_text);
            this.j = (HealthProgressBar) view.findViewById(R.id.progress_bar);
            this.h = (HealthButton) view.findViewById(R.id.start_button);
            this.f = view.findViewById(R.id.space_view);
        }

        public void a(Object obj) {
            this.e = obj;
        }

        public Object c() {
            return this.e;
        }
    }
}
