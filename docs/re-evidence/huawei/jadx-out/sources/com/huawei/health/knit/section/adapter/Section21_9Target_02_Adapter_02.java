package com.huawei.health.knit.section.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.fpl;
import defpackage.fts;
import defpackage.qqf;
import defpackage.qrs;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class Section21_9Target_02_Adapter_02 extends RecyclerView.Adapter<a> {
    private static final int e = (int) BaseApplication.getContext().getResources().getDimension(R.dimen.health_common_8dp);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Object> f7297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f7298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f7299c;
    private a d;
    private List<String> g;
    private List<Integer> h;
    private List<String> i;
    private OnClickSectionListener j;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i;
    }

    public Section21_9Target_02_Adapter_02(Context context, fpl fplVar) {
        this.f7298b = context;
        c(fplVar);
    }

    private void c(fpl fplVar) {
        this.i = fplVar.d();
        this.f7297a = fplVar.e();
        this.f7299c = fplVar.a();
        this.g = fplVar.j();
        this.h = fplVar.b();
        this.j = fplVar.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(this.f7298b).inflate(R.layout.section21_9target_02_item_02, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i) {
        this.d = aVar;
        if (qrs.y()) {
            this.d.g.setTextSize(1, 23.2f);
            this.d.f7300a.setTextSize(1, 17.4f);
            this.d.f.setTextSize(1, 17.4f);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.d.f7301b.getLayoutParams();
            layoutParams.topMargin = (int) BaseApplication.getContext().getResources().getDimension(R.dimen.health_common_12dp);
            this.d.f7301b.setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.d.f7300a.getLayoutParams();
            layoutParams2.topMargin = (int) BaseApplication.getContext().getResources().getDimension(R.dimen.health_common_2dp);
            this.d.f7300a.setLayoutParams(layoutParams2);
        }
        b(i);
    }

    private void b(final int i) {
        if (fts.d(this.f7297a, i) && this.d.e != null) {
            Object obj = this.f7297a.get(i);
            Object objA = this.d.a();
            if (obj instanceof String) {
                String str = (String) obj;
                String str2 = objA instanceof String ? (String) objA : "";
                if (str.length() > 0 && !str2.equals(str)) {
                    qqf.e(this.d.e, str, e, 0, R.drawable.section_sug_bg_trining_defuct_section);
                    this.d.d(str);
                }
            } else if (obj instanceof Integer) {
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                if ((objA instanceof Integer ? ((Integer) objA).intValue() : 0) != iIntValue) {
                    qqf.a(iIntValue, this.d.e, e);
                    this.d.d(num);
                }
            } else {
                qqf.a(R.drawable.section_sug_bg_trining_defuct_section, this.d.e, e);
            }
        }
        if (fts.d(this.i, i) && this.d.g != null) {
            this.d.g.setText(this.i.get(i));
        }
        if (fts.d(this.f7299c, i) && this.d.f7300a != null) {
            this.d.f7300a.setText(this.f7299c.get(i));
        }
        if (fts.d(this.g, i) && this.d.f != null) {
            this.d.f.setText(this.g.get(i));
            d(i);
        }
        if (this.d.d != null) {
            this.d.d.setOnClickListener(new View.OnClickListener() { // from class: fpj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f34361a.b(i, view);
                }
            });
            this.d.f.setOnClickListener(new View.OnClickListener() { // from class: fpi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.e(i, view);
                }
            });
        }
    }

    public /* synthetic */ void b(int i, View view) {
        OnClickSectionListener onClickSectionListener = this.j;
        if (onClickSectionListener != null) {
            onClickSectionListener.onClick(i);
        }
    }

    public /* synthetic */ void e(int i, View view) {
        OnClickSectionListener onClickSectionListener = this.j;
        if (onClickSectionListener != null) {
            onClickSectionListener.onClick(i, "BUTTON_CLICK_EVENT");
        }
    }

    private void d(int i) {
        Integer num;
        if (!fts.d(this.h, i) || this.d.f == null || (num = this.h.get(i)) == null || num.intValue() == 0) {
            return;
        }
        this.d.f.setTextColor(num.intValue());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return fts.e(this.f7297a, this.i, this.f7299c, this.g);
    }

    static class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextView f7300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final LinearLayout f7301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f7302c;
        private final FrameLayout d;
        private final HealthImageView e;
        private final HealthButton f;
        private final TextView g;

        public a(View view) {
            super(view);
            this.d = (FrameLayout) view.findViewById(R.id.section21_9target_02_item_02);
            this.f7301b = (LinearLayout) view.findViewById(R.id.section_layout);
            this.e = (HealthImageView) view.findViewById(R.id.background_image);
            this.g = (TextView) view.findViewById(R.id.section_title);
            this.f7300a = (TextView) view.findViewById(R.id.section_description);
            this.f = (HealthButton) view.findViewById(R.id.start_button);
        }

        public void d(Object obj) {
            this.f7302c = obj;
        }

        public Object a() {
            return this.f7302c;
        }
    }
}
