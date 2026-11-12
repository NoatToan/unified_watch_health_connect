package com.huawei.health.knit.section.adapter;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.fol;
import defpackage.ftl;
import defpackage.njy;
import defpackage.qqf;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class HorizontalAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<fol> f7215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f7216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7217c = Integer.MAX_VALUE;
    private OnItemClickListener e;

    public interface OnItemClickListener {
        void onItemClick(View view, int i);
    }

    public HorizontalAdapter(Context context, List<fol> list) {
        this.f7216b = context;
        this.f7215a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(this.f7216b).inflate(R.layout.section1_1list_02_item_02, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final ViewHolder viewHolder, int i) {
        if (njy.e(this.f7215a)) {
            LogUtil.a("HorizontalAdapter", "onBindViewHolder: list is null");
            return;
        }
        final int size = i % this.f7215a.size();
        fol folVar = this.f7215a.get(size);
        viewHolder.h.setText(folVar.g());
        viewHolder.e.setText(folVar.i());
        viewHolder.e.setTextSize(1, 10.0f);
        viewHolder.f7218a.setText(ftl.d(folVar.h(), folVar.c(), this.f7216b.getResources().getDimensionPixelSize(R.dimen.health_common_10dp)));
        viewHolder.f7218a.setTextSize(1, 12.0f);
        String strJ = folVar.j();
        if (strJ != null) {
            SpannableString spannableString = new SpannableString(strJ);
            spannableString.setSpan(new StrikethroughSpan(), 0, strJ.length(), 17);
            viewHolder.f7220c.setText(spannableString);
            viewHolder.f7220c.setTextSize(1, 10.0f);
        }
        String strE = folVar.e();
        if (!TextUtils.isEmpty(strE) && strE.startsWith("http")) {
            float f = (int) ((this.f7216b.getResources().getDisplayMetrics().density * 8.0f) + 0.5f);
            qqf.b(folVar.e(), viewHolder.d, f, f, 0.0f, 0.0f);
        }
        viewHolder.f7219b.setOnClickListener(new View.OnClickListener() { // from class: fou
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34329b.a(viewHolder, size, view);
            }
        });
    }

    public /* synthetic */ void a(ViewHolder viewHolder, int i, View view) {
        OnItemClickListener onItemClickListener = this.e;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(viewHolder.f7219b, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f7217c;
    }

    public void b(int i) {
        this.f7217c = i;
    }

    public void a(List<fol> list) {
        LogUtil.a("HorizontalAdapter", "setItemData: ", Integer.valueOf(list.size()));
        this.f7215a = list;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f7218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthCardView f7219b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthTextView f7220c;
        ImageView d;
        HealthTextView e;
        HealthTextView h;

        public ViewHolder(View view) {
            super(view);
            this.h = (HealthTextView) view.findViewById(R.id.title);
            this.e = (HealthTextView) view.findViewById(R.id.provider);
            this.f7218a = (HealthTextView) view.findViewById(R.id.text1);
            this.f7220c = (HealthTextView) view.findViewById(R.id.text2);
            this.f7219b = (HealthCardView) view.findViewById(R.id.section1_1_list_02_item);
            this.d = (ImageView) view.findViewById(R.id.image);
        }
    }

    public void b(OnItemClickListener onItemClickListener) {
        this.e = onItemClickListener;
    }
}
