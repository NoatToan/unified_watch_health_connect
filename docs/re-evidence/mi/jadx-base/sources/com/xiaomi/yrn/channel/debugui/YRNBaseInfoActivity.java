package com.xiaomi.yrn.channel.debugui;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import defpackage.rsi;
import defpackage.xvi;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class YRNBaseInfoActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f14491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f14492b;
    public a c;
    public List<b> d = new ArrayList();

    public static class a extends RecyclerView.Adapter<C0899a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<b> f14493a;

        /* JADX INFO: renamed from: com.xiaomi.yrn.channel.debugui.YRNBaseInfoActivity$a$a, reason: collision with other inner class name */
        public static class C0899a extends RecyclerView.d0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public TextView f14494a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public TextView f14495b;
            public View c;

            public C0899a(View view) {
                super(view);
                d(view);
            }

            private void d(View view) {
                this.c = view.findViewById(rsi.j);
                this.f14494a = (TextView) view.findViewById(rsi.v);
                this.f14495b = (TextView) view.findViewById(rsi.s);
            }
        }

        public a(List<b> list) {
            this.f14493a = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f14493a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C0899a c0899a, int i) {
            if (i >= this.f14493a.size()) {
                return;
            }
            b bVar = this.f14493a.get(i);
            c0899a.f14494a.setText(bVar.f14496a);
            c0899a.f14495b.setText(bVar.f14497b);
            try {
                if (bVar.f14496a.contains("appName")) {
                    c0899a.f14494a.setVisibility(8);
                    c0899a.f14495b.setGravity(17);
                    c0899a.c.setBackgroundColor(Color.parseColor("#CCFFCC"));
                } else {
                    c0899a.f14494a.setVisibility(0);
                    c0899a.f14495b.setGravity(8388611);
                    c0899a.c.setBackgroundColor(Color.parseColor("#FFFFFF"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public C0899a onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C0899a(LayoutInflater.from(viewGroup.getContext()).inflate(xvi.d, viewGroup, false));
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f14496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f14497b;

        public b(String str, String str2) {
            this.f14496a = str;
            this.f14497b = str2;
        }
    }

    public void a() {
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(xvi.f39514b);
        this.f14491a = (TextView) findViewById(rsi.p);
        this.f14492b = (RecyclerView) findViewById(rsi.g);
        this.c = new a(this.d);
        this.f14492b.setLayoutManager(new LinearLayoutManager(this));
        this.f14492b.setAdapter(this.c);
        this.f14492b.addItemDecoration(new i(getBaseContext(), 1));
        a();
    }
}
