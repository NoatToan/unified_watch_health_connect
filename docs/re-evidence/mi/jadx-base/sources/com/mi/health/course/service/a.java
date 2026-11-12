package com.mi.health.course.service;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.milink.sdk.cast.MiLinkDevice;
import defpackage.oqi;
import defpackage.sti;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class a extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f10001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<MiLinkDevice> f10002b;
    public b c;

    /* JADX INFO: renamed from: com.mi.health.course.service.a$a, reason: collision with other inner class name */
    public class C0300a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f10003a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f10004b;

        public C0300a(View view) {
            super(view);
            this.f10003a = (TextView) view.findViewById(oqi.L0);
            this.f10004b = (TextView) view.findViewById(oqi.r1);
        }
    }

    public interface b {
        void a(MiLinkDevice miLinkDevice, int i);
    }

    public a(Context context, List<MiLinkDevice> list) {
        this.f10001a = context;
        this.f10002b = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f10002b.size();
    }

    public final /* synthetic */ void j(MiLinkDevice miLinkDevice, int i, View view) {
        b bVar = this.c;
        if (bVar != null) {
            bVar.a(miLinkDevice, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.d0 d0Var, final int i) {
        final MiLinkDevice miLinkDevice = this.f10002b.get(i);
        C0300a c0300a = (C0300a) d0Var;
        c0300a.f10003a.setText(miLinkDevice.getName() + "(" + miLinkDevice.getType() + ")");
        c0300a.f10004b.setText("ip=" + miLinkDevice.getIp() + "\nwifi=" + miLinkDevice.getWifiMac() + "\nble=" + miLinkDevice.getBleMac() + "\np2p=" + miLinkDevice.getP2pMac());
        c0300a.itemView.setOnClickListener(new View.OnClickListener() { // from class: s16
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f33159a.j(miLinkDevice, i, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C0300a(LayoutInflater.from(this.f10001a).inflate(sti.n, viewGroup, false));
    }

    public void setOnItemClickListener(b bVar) {
        this.c = bVar;
    }
}
