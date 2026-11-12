package com.xiaomi.fitness.devicesettings.base.worldclock;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import defpackage.eui;
import defpackage.zqi;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public class a extends RecyclerView.Adapter<C0452a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f11958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<TimeZoneItem> f11959b;
    public int c = -5;
    public HashMap<String, TimeZoneItem> d = new HashMap<>();
    public final String e;
    public b f;

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.base.worldclock.a$a, reason: collision with other inner class name */
    public class C0452a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f11960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f11961b;
        public TextView c;
        public LinearLayout d;

        public C0452a(View view) {
            super(view);
            this.d = (LinearLayout) view.findViewById(zqi.H4);
            this.f11960a = (TextView) view.findViewById(zqi.ma);
            this.f11961b = (TextView) view.findViewById(zqi.la);
            this.c = (TextView) view.findViewById(zqi.na);
        }
    }

    public interface b {
        void onItemClick(View view, int i, HashMap<String, TimeZoneItem> map);
    }

    public a(Context context, List<TimeZoneItem> list) {
        this.f11958a = context;
        this.f11959b = list;
        String upperCase = RegionExtKt.getInstance(RegionManager.INSTANCE).getLocalCountry().toUpperCase();
        this.e = upperCase;
        Logger.i("TimeZoneCityChooseAdapter", "mCurRegion: " + upperCase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(int i, View view) {
        this.f.onItemClick(view, i, this.d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<TimeZoneItem> list = this.f11959b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int j(int i) {
        for (int i2 = 0; i2 < getItemCount(); i2++) {
            if (this.f11959b.get(i2).h.toUpperCase().charAt(0) == i) {
                return i2;
            }
        }
        return -1;
    }

    public final int k(TimeZoneItem timeZoneItem) {
        return timeZoneItem.h.charAt(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C0452a c0452a, @SuppressLint({"RecyclerView"}) final int i) {
        int iK = k(this.f11959b.get(i));
        TimeZoneItem timeZoneItem = this.f11959b.get(i);
        c0452a.f11961b.setVisibility(8);
        if (i == j(iK)) {
            c0452a.f11961b.setText(this.f11959b.get(i).h);
        }
        c0452a.f11960a.setText(timeZoneItem.c());
        c0452a.c.setText(timeZoneItem.k());
        c0452a.itemView.setOnClickListener(new View.OnClickListener() { // from class: jfp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22747a.l(i, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public C0452a onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        return new C0452a(LayoutInflater.from(this.f11958a).inflate(eui.H2, viewGroup, false));
    }

    public void o(List<TimeZoneItem> list) {
        this.f11959b.clear();
        this.f11959b.addAll(list);
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(b bVar) {
        this.f = bVar;
    }
}
