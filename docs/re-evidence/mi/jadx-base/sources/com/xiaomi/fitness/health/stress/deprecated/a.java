package com.xiaomi.fitness.health.stress.deprecated;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.StressItem;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.util.StressDataUtil;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import defpackage.uv6;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class a extends PagingDataAdapter<StressItem, C0621a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f12299a;

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.stress.deprecated.a$a, reason: collision with other inner class name */
    public static class C0621a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f12300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f12301b;

        public C0621a(View view) {
            super(view);
            this.f12300a = (TextView) view.findViewById(eri.im);
            this.f12301b = (TextView) view.findViewById(eri.qn);
        }
    }

    public interface b {
        void a(DailyRecordItem dailyRecordItem);
    }

    public a() {
        super(new uv6());
    }

    public final /* synthetic */ void j(StressItem stressItem, View view) {
        b bVar = this.f12299a;
        if (bVar != null) {
            bVar.a(stressItem);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C0621a c0621a, int i) {
        final StressItem item = getItem(i);
        Objects.requireNonNull(item);
        c0621a.f12300a.setText(TimeUtils.formatDate(c0621a.f12300a.getContext().getString(c0j.o), Long.valueOf(item.getTime() * 1000)));
        c0621a.f12301b.setText(String.format("%d %s", Integer.valueOf(item.getStress()), StressDataUtil.getStressTypeNameAsValue(item.getStress())));
        c0621a.itemView.setOnClickListener(new View.OnClickListener() { // from class: jjo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22872a.j(item, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C0621a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C0621a(LayoutInflater.from(viewGroup.getContext()).inflate(jui.a6, viewGroup, false));
    }

    public void setOnItemClickListener(b bVar) {
        this.f12299a = bVar;
    }
}
