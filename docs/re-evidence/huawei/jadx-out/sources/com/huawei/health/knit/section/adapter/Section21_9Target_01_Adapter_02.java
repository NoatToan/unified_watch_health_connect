package com.huawei.health.knit.section.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.fpe;
import defpackage.fts;
import defpackage.qqf;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class Section21_9Target_01_Adapter_02 extends RecyclerView.Adapter<d> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f7285c = (int) BaseApplication.getContext().getResources().getDimension(R.dimen.health_common_8dp);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Object> f7286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f7287b;
    private d d;
    private List<String> e;
    private OnClickSectionListener f;
    private List<String> h;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i;
    }

    public Section21_9Target_01_Adapter_02(Context context, fpe fpeVar) {
        this.f7287b = context;
        d(fpeVar);
    }

    private void d(fpe fpeVar) {
        this.h = fpeVar.a();
        this.f7286a = fpeVar.c();
        this.e = fpeVar.e();
        this.f = fpeVar.d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public d onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new d(LayoutInflater.from(this.f7287b).inflate(R.layout.section21_9target_01_item_02, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(d dVar, int i) {
        this.d = dVar;
        d(i);
    }

    private void d(final int i) {
        if (fts.d(this.f7286a, i) && this.d.f7288a != null) {
            Object obj = this.f7286a.get(i);
            Object objA = this.d.a();
            if (obj instanceof String) {
                String str = (String) obj;
                String str2 = objA instanceof String ? (String) objA : "";
                if (str.length() > 0 && !str2.equals(str)) {
                    qqf.e(this.d.f7288a, str, f7285c, 0, R.drawable.section_sug_bg_trining_defuct_section);
                    this.d.c(str);
                }
            } else if (obj instanceof Integer) {
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                if ((objA instanceof Integer ? ((Integer) objA).intValue() : 0) != iIntValue) {
                    qqf.a(iIntValue, this.d.f7288a, f7285c);
                    this.d.c(num);
                }
            } else {
                qqf.a(R.drawable.section_sug_bg_trining_defuct_section, this.d.f7288a, f7285c);
            }
        }
        if (fts.d(this.h, i) && this.d.f7289b != null) {
            this.d.f7289b.setText(this.h.get(i));
        }
        if (fts.d(this.e, i) && this.d.e != null) {
            this.d.e.setText(this.e.get(i));
        }
        if (this.d.f7290c != null) {
            this.d.f7290c.setOnClickListener(new View.OnClickListener() { // from class: fpf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f34353c.d(i, view);
                }
            });
        }
    }

    public /* synthetic */ void d(int i, View view) {
        OnClickSectionListener onClickSectionListener = this.f;
        if (onClickSectionListener != null) {
            onClickSectionListener.onClick(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return fts.e(this.f7286a, this.h, this.e);
    }

    static class d extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HealthImageView f7288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TextView f7289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final FrameLayout f7290c;
        private Object d;
        private final TextView e;

        public d(View view) {
            super(view);
            this.f7290c = (FrameLayout) view.findViewById(R.id.section21_9target_01_item_02);
            this.f7288a = (HealthImageView) view.findViewById(R.id.background_image);
            this.f7289b = (TextView) view.findViewById(R.id.section_title);
            this.e = (TextView) view.findViewById(R.id.section_description);
        }

        public void c(Object obj) {
            this.d = obj;
        }

        public Object a() {
            return this.d;
        }
    }
}
