package com.xiaomi.fitness.health.bloodpressure.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.item.BloodPressureItem;
import com.xiaomi.fitness.common.utils.TimeUtils;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import defpackage.nuf;
import defpackage.uv6;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class a extends PagingDataAdapter<BloodPressureItem, C0578a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f12230a;

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.bloodpressure.ui.a$a, reason: collision with other inner class name */
    public static class C0578a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f12231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f12232b;

        public C0578a(View view) {
            super(view);
            this.f12231a = (TextView) view.findViewById(eri.im);
            this.f12232b = (TextView) view.findViewById(eri.qn);
        }
    }

    public interface b {
        void a(BloodPressureItem bloodPressureItem);
    }

    public a() {
        super(new uv6());
    }

    public final /* synthetic */ void j(BloodPressureItem bloodPressureItem, View view) {
        b bVar = this.f12230a;
        if (bVar != null) {
            bVar.a(bloodPressureItem);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C0578a c0578a, int i) {
        final BloodPressureItem item = getItem(i);
        Objects.requireNonNull(item);
        long time = item.getTime();
        Context context = c0578a.f12231a.getContext();
        c0578a.f12231a.setText(TimeUtils.formatDate(context.getString(c0j.o), Long.valueOf(time * 1000)));
        c0578a.f12232b.setText(String.format("%s/%s%s", Integer.valueOf(item.getHighPressure()), Integer.valueOf(item.getLowPressure()), context.getString(c0j.D2)));
        c0578a.itemView.setOnClickListener(new View.OnClickListener() { // from class: oy2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f29799a.j(item, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C0578a onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(jui.a6, viewGroup, false);
        nuf.g(viewInflate);
        return new C0578a(viewInflate);
    }

    public void setOnItemClickListener(b bVar) {
        this.f12230a = bVar;
    }
}
