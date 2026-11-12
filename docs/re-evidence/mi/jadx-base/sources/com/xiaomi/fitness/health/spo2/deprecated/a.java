package com.xiaomi.fitness.health.spo2.deprecated;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.Spo2Item;
import com.xiaomi.fitness.common.utils.TimeUtils;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import defpackage.nuf;
import defpackage.uv6;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class a extends PagingDataAdapter<Spo2Item, C0620a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f12295a;

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.spo2.deprecated.a$a, reason: collision with other inner class name */
    public static class C0620a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f12296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f12297b;

        public C0620a(View view) {
            super(view);
            this.f12296a = (TextView) view.findViewById(eri.im);
            this.f12297b = (TextView) view.findViewById(eri.qn);
        }
    }

    public interface b {
        void a(DailyRecordItem dailyRecordItem);
    }

    public a() {
        super(new uv6());
    }

    public final /* synthetic */ void j(Spo2Item spo2Item, View view) {
        b bVar = this.f12295a;
        if (bVar != null) {
            bVar.a(spo2Item);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C0620a c0620a, int i) {
        final Spo2Item item = getItem(i);
        Objects.requireNonNull(item);
        c0620a.f12296a.setText(TimeUtils.formatDate(c0620a.f12296a.getContext().getString(c0j.o), Long.valueOf(item.getTime() * 1000)));
        c0620a.f12297b.setText(String.format("%d%%", Integer.valueOf(item.getSpo2())));
        c0620a.itemView.setOnClickListener(new View.OnClickListener() { // from class: m7n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f25848a.j(item, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C0620a onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(jui.a6, viewGroup, false);
        nuf.g(viewInflate);
        return new C0620a(viewInflate);
    }

    public void setOnItemClickListener(b bVar) {
        this.f12295a = bVar;
    }
}
