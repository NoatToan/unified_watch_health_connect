package com.xiaomi.fitness.health.hrm.deprecated;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.item.AbnormalFibItem;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import defpackage.eri;
import defpackage.jui;
import defpackage.qxi;
import defpackage.uv6;

/* JADX INFO: loaded from: classes9.dex */
public class a extends PagingDataAdapter<AbnormalFibItem, C0599a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f12254a;

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.hrm.deprecated.a$a, reason: collision with other inner class name */
    public class C0599a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f12255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f12256b;
        public TextView c;

        public C0599a(View view) {
            super(view);
            this.f12255a = (TextView) view.findViewById(eri.im);
            this.f12256b = (TextView) view.findViewById(eri.qn);
            TextView textView = (TextView) view.findViewById(eri.K);
            this.c = textView;
            textView.setVisibility(8);
        }

        public void b(final AbnormalFibItem abnormalFibItem) {
            this.f12255a.setText(TimeDateUtil.getDateYYYYMMDDHHmmLocalFormat(abnormalFibItem.getStartTime(), false) + "-" + TimeDateUtil.getDateHHmm24Format(abnormalFibItem.getEndTime()));
            int duration = abnormalFibItem.getDuration();
            this.f12256b.setText(this.f12256b.getContext().getResources().getQuantityString(qxi.R1, duration, Integer.valueOf(duration)));
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: dec
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f15438a.c(abnormalFibItem, view);
                }
            });
        }

        public final /* synthetic */ void c(AbnormalFibItem abnormalFibItem, View view) {
            if (a.this.f12254a != null) {
                a.this.f12254a.onClick(abnormalFibItem);
            }
        }
    }

    public interface b {
        void onClick(AbnormalFibItem abnormalFibItem);
    }

    public a() {
        super(new uv6());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C0599a c0599a, int i) {
        c0599a.b(getItem(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public C0599a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C0599a(LayoutInflater.from(viewGroup.getContext()).inflate(jui.h6, viewGroup, false));
    }

    public void setOnItemClickListener(b bVar) {
        this.f12254a = bVar;
    }
}
