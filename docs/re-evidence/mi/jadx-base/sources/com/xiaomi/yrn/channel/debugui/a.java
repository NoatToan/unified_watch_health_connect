package com.xiaomi.yrn.channel.debugui;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.yrn.env.entity.YRNDevModeInfo;
import defpackage.rsi;
import defpackage.xvi;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class a extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<YRNDevModeInfo> f14524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f14525b;

    /* JADX INFO: renamed from: com.xiaomi.yrn.channel.debugui.a$a, reason: collision with other inner class name */
    public class ViewOnClickListenerC0901a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f14526a;

        public ViewOnClickListenerC0901a(b bVar) {
            this.f14526a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.f14525b != null) {
                a.this.f14525b.a(this.f14526a.getLayoutPosition());
            }
        }
    }

    public static class b extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f14528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f14529b;
        public TextView c;
        public TextView d;
        public TextView e;

        public b(View view) {
            super(view);
            f(view);
        }

        private void f(View view) {
            this.f14528a = (TextView) view.findViewById(rsi.q);
            this.f14529b = (TextView) view.findViewById(rsi.u);
            this.c = (TextView) view.findViewById(rsi.f32862r);
            this.d = (TextView) view.findViewById(rsi.t);
            this.e = (TextView) view.findViewById(rsi.f32860b);
        }
    }

    public interface c {
        void a(int i);

        void b(int i);
    }

    public a(List<YRNDevModeInfo> list) {
        this.f14524a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f14524a.size();
    }

    public final /* synthetic */ void k(b bVar, View view) {
        if (this.f14525b != null) {
            this.f14525b.b(bVar.getLayoutPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final b bVar, int i) {
        YRNDevModeInfo yRNDevModeInfo;
        int adapterPosition = bVar.getAdapterPosition();
        if (adapterPosition < this.f14524a.size() && (yRNDevModeInfo = this.f14524a.get(adapterPosition)) != null) {
            bVar.f14528a.setText("AppName : " + yRNDevModeInfo.a());
            bVar.f14529b.setText("Module : " + yRNDevModeInfo.e());
            bVar.c.setText("Branch : " + yRNDevModeInfo.c());
            bVar.d.setText("Ip : " + yRNDevModeInfo.d());
            bVar.c.setVisibility(TextUtils.isEmpty(yRNDevModeInfo.c()) ? 8 : 0);
            bVar.d.setVisibility(TextUtils.isEmpty(yRNDevModeInfo.d()) ? 8 : 0);
            bVar.e.setOnClickListener(new ViewOnClickListenerC0901a(bVar));
            bVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: rwr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f32987a.k(bVar, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(xvi.f, viewGroup, false));
    }

    public void setOnDevModeListActionListener(c cVar) {
        this.f14525b = cVar;
    }
}
