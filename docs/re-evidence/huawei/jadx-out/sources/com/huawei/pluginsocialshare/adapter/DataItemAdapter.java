package com.huawei.pluginsocialshare.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsocialshare.R;
import defpackage.lrd;
import defpackage.njy;
import defpackage.pna;
import defpackage.qpx;
import defpackage.qqf;
import defpackage.qqs;
import defpackage.qqz;
import defpackage.qre;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes42.dex */
public class DataItemAdapter extends RecyclerView.Adapter<DataContentViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OnItemClickListener f22453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<pna> f22454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f22455c;
    private List<pna> e = new ArrayList();

    public interface OnItemClickListener {
        void onItemClick(int i, List<pna> list, pna pnaVar);
    }

    public DataItemAdapter(Context context, List<pna> list, OnItemClickListener onItemClickListener) {
        this.f22455c = context;
        this.f22454b = list;
        this.f22453a = onItemClickListener;
    }

    public void c(List<pna> list) {
        if (njy.e(list)) {
            return;
        }
        this.f22454b = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (njy.e(this.f22454b)) {
            return 0;
        }
        return this.f22454b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DataContentViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new DataContentViewHolder(LayoutInflater.from(this.f22455c).inflate(R.layout.data_item_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(DataContentViewHolder dataContentViewHolder, int i) {
        if (njy.e(this.f22454b, i)) {
            return;
        }
        a(dataContentViewHolder, this.f22454b.get(i), i, this.f22453a);
    }

    private void a(TextView textView, String str) {
        if (TextUtils.isEmpty(str) || LanguageUtil.o(BaseApplication.b()) || LanguageUtil.q(BaseApplication.b()) || str.length() <= 12) {
            return;
        }
        textView.setTextSize(1, 12.0f);
    }

    public void a(DataContentViewHolder dataContentViewHolder, pna pnaVar, int i, OnItemClickListener onItemClickListener) {
        if (pnaVar == null) {
            return;
        }
        dataContentViewHolder.d.setText(pnaVar.n());
        a(dataContentViewHolder.d, pnaVar.n());
        dataContentViewHolder.itemView.setSelected(pnaVar.o());
        if (pnaVar.o()) {
            Drawable drawableA = a(pnaVar.k(), pnaVar.g());
            if (drawableA == null) {
                dataContentViewHolder.f22459a.setImageResource(pnaVar.g());
            } else {
                dataContentViewHolder.f22459a.setImageDrawable(drawableA);
            }
            dataContentViewHolder.f22460b.setBackground(qre.c(R.drawable.share_data_bg_select));
        } else {
            Drawable drawableE = e(pnaVar.k(), pnaVar.g());
            if (drawableE == null) {
                dataContentViewHolder.f22459a.setImageResource(pnaVar.g());
            } else {
                dataContentViewHolder.f22459a.setImageDrawable(drawableE);
            }
            dataContentViewHolder.f22460b.setBackground(qre.c(R.drawable.share_data_bg_unselect));
            lrd.c(dataContentViewHolder.itemView, (CharSequence) pnaVar.n(), false);
        }
        b(dataContentViewHolder, pnaVar, i, onItemClickListener);
    }

    private Drawable a(boolean z, int i) {
        LogUtil.a("Share_DataItemAdapter", "getSelectBgDrawable imageResId=", Integer.valueOf(i));
        if (LanguageUtil.ba(this.f22455c) && z) {
            return qqz.e(this.f22455c, i);
        }
        return qre.c(i);
    }

    private Drawable e(boolean z, int i) {
        Drawable drawableC;
        LogUtil.a("Share_DataItemAdapter", "getUnSelectBgDrawable imageResId=", Integer.valueOf(i));
        if (LanguageUtil.ba(this.f22455c) && z) {
            drawableC = qqz.e(this.f22455c, i);
        } else {
            drawableC = qre.c(i);
        }
        if (drawableC == null) {
            return drawableC;
        }
        if (qqs.e(this.f22455c)) {
            return qqf.c(drawableC, qre.e(R.color.common_white_60alpha));
        }
        return qqf.c(drawableC, qre.e(R.color.common_black_60alpha));
    }

    private void b(final DataContentViewHolder dataContentViewHolder, final pna pnaVar, final int i, final OnItemClickListener onItemClickListener) {
        dataContentViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.pluginsocialshare.adapter.DataItemAdapter.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DataItemAdapter.this.e(dataContentViewHolder, pnaVar, i, onItemClickListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(DataContentViewHolder dataContentViewHolder, pna pnaVar, int i, OnItemClickListener onItemClickListener) {
        int iE = e(this.f22454b);
        boolean z = iE == 4 && !pnaVar.o();
        boolean z2 = iE == 1 && pnaVar.o();
        if (z) {
            e();
        } else if (z2) {
            b();
        } else {
            d(dataContentViewHolder, pnaVar, i, onItemClickListener);
        }
    }

    private void e() {
        qpx.e(BaseApplication.b(), qre.a(R.string.IDS_hwh_edit_share_max_remind, UnitUtil.e(4.0d, 1, 0)));
    }

    private void b() {
        qpx.e(BaseApplication.b(), qre.a(R.string.IDS_hwh_edit_share_min_remind, UnitUtil.e(1.0d, 1, 0)));
    }

    private void d(DataContentViewHolder dataContentViewHolder, pna pnaVar, int i, OnItemClickListener onItemClickListener) {
        pnaVar.d(!pnaVar.o());
        dataContentViewHolder.itemView.setSelected(pnaVar.o());
        if (!pnaVar.o()) {
            Drawable drawableE = e(pnaVar.k(), pnaVar.g());
            if (drawableE == null) {
                dataContentViewHolder.f22459a.setImageResource(pnaVar.g());
            } else {
                dataContentViewHolder.f22459a.setImageDrawable(drawableE);
            }
            dataContentViewHolder.f22460b.setBackground(qre.c(R.drawable.share_data_bg_unselect));
            dataContentViewHolder.itemView.announceForAccessibility(qre.f(R.string.accessibility_Unchecked));
            a(this.e, pnaVar);
        } else {
            dataContentViewHolder.f22459a.setImageResource(pnaVar.g());
            dataContentViewHolder.f22460b.setBackground(qre.c(R.drawable.share_data_bg_select));
            dataContentViewHolder.itemView.announceForAccessibility(qre.f(R.string.accessibility_checked));
            b(this.e, pnaVar);
        }
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(i, this.e, null);
        }
    }

    private void b(List<pna> list, pna pnaVar) {
        if (list == null || pnaVar == null) {
            return;
        }
        for (pna pnaVar2 : list) {
            if (pnaVar2.b().equals(pnaVar.b()) && pnaVar2.n().equals(pnaVar.n())) {
                return;
            }
        }
        list.add(pnaVar);
    }

    private void a(List<pna> list, pna pnaVar) {
        if (list == null || pnaVar == null) {
            return;
        }
        for (pna pnaVar2 : list) {
            if (pnaVar2.b().equals(pnaVar.b()) && pnaVar2.n().equals(pnaVar.n())) {
                list.remove(pnaVar);
                return;
            }
        }
    }

    private int e(List<pna> list) {
        int i = 0;
        if (!njy.e(list) && this.e != null) {
            for (pna pnaVar : list) {
                if (pnaVar.o()) {
                    i++;
                    b(this.e, pnaVar);
                }
            }
        }
        return i;
    }

    public static class DataContentViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ImageView f22459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RelativeLayout f22460b;
        private TextView d;

        public DataContentViewHolder(View view) {
            super(view);
            this.f22460b = (RelativeLayout) view.findViewById(R.id.data_bg_layout);
            this.f22459a = (ImageView) view.findViewById(R.id.data_img);
            this.d = (TextView) view.findViewById(R.id.data_name);
        }
    }
}
