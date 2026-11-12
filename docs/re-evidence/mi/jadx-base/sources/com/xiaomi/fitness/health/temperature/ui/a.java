package com.xiaomi.fitness.health.temperature.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.xiaomi.fit.fitness.export.data.item.TemperatureItem;
import com.xiaomi.fitness.common.utils.TimeUtils;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class a extends PagingDataAdapter<TemperatureItem, b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f12304a;

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.temperature.ui.a$a, reason: collision with other inner class name */
    public class C0622a extends h.f<TemperatureItem> {
        @Override // androidx.recyclerview.widget.h.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(@NotNull TemperatureItem temperatureItem, @NotNull TemperatureItem temperatureItem2) {
            return temperatureItem.getTime() == temperatureItem2.getTime() && Objects.equals(temperatureItem.getSkinTemp(), temperatureItem2.getSkinTemp()) && Objects.equals(temperatureItem.getBodyTemp(), temperatureItem2.getBodyTemp());
        }

        @Override // androidx.recyclerview.widget.h.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(@NotNull TemperatureItem temperatureItem, @NotNull TemperatureItem temperatureItem2) {
            return temperatureItem.getTime() == temperatureItem2.getTime() && Objects.equals(temperatureItem.getSkinTemp(), temperatureItem2.getSkinTemp()) && Objects.equals(temperatureItem.getBodyTemp(), temperatureItem2.getBodyTemp());
        }
    }

    public static class b extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f12305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f12306b;
        public TextView c;

        public b(View view) {
            super(view);
            this.f12305a = (TextView) view.findViewById(eri.im);
            this.f12306b = (TextView) view.findViewById(eri.qn);
            this.c = (TextView) view.findViewById(eri.xm);
        }
    }

    public interface c {
        void a(TemperatureItem temperatureItem);
    }

    public a() {
        super(new C0622a());
    }

    public final /* synthetic */ void j(TemperatureItem temperatureItem, View view) {
        c cVar = this.f12304a;
        if (cVar != null) {
            cVar.a(temperatureItem);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i) {
        final TemperatureItem item = getItem(i);
        Objects.requireNonNull(item);
        long time = item.getTime();
        Context context = bVar.f12305a.getContext();
        bVar.f12305a.setText(TimeUtils.formatDate(context.getString(c0j.o), Long.valueOf(time * 1000)));
        if (item.getBodyTemp() == null || item.getBodyTemp().floatValue() <= 0.0f) {
            bVar.f12306b.setVisibility(8);
        } else {
            bVar.f12306b.setVisibility(0);
            bVar.f12306b.setText(String.format("%s %s", context.getString(c0j.dn), context.getString(c0j.tn, item.getBodyTemp())));
        }
        if (item.getSkinTemp() == null || item.getSkinTemp().floatValue() <= 0.0f) {
            bVar.c.setVisibility(8);
        } else {
            bVar.c.setVisibility(0);
            bVar.c.setText(String.format("%s %s", context.getString(c0j.nn), context.getString(c0j.tn, item.getSkinTemp())));
        }
        bVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: l2p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f24575a.j(item, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(jui.b6, viewGroup, false));
    }

    public void setOnItemClickListener(c cVar) {
        this.f12304a = cVar;
    }
}
