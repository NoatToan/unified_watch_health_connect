package com.xiaomi.yrn.channel.debugui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.rsi;
import defpackage.woi;
import defpackage.xvi;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class YRNKitActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f14517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f14518b;
    public a c;
    public List<b> d = new ArrayList();

    public static class a extends RecyclerView.Adapter<C0900a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<b> f14519a;

        /* JADX INFO: renamed from: com.xiaomi.yrn.channel.debugui.YRNKitActivity$a$a, reason: collision with other inner class name */
        public static class C0900a extends RecyclerView.d0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public ImageView f14520a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public TextView f14521b;
            public View c;

            public C0900a(View view) {
                super(view);
                d(view);
            }

            private void d(View view) {
                this.c = view.findViewById(rsi.j);
                this.f14520a = (ImageView) view.findViewById(rsi.f);
                this.f14521b = (TextView) view.findViewById(rsi.s);
            }
        }

        public a(List<b> list) {
            this.f14519a = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f14519a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C0900a c0900a, int i) {
            if (i >= this.f14519a.size()) {
                return;
            }
            b bVar = this.f14519a.get(i);
            c0900a.f14520a.setImageResource(bVar.f14522a);
            c0900a.f14521b.setText(bVar.f14523b);
            c0900a.c.setOnClickListener(bVar.c);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public C0900a onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C0900a(LayoutInflater.from(viewGroup.getContext()).inflate(xvi.g, viewGroup, false));
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f14522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f14523b;
        public View.OnClickListener c;

        public b(int i, String str, View.OnClickListener onClickListener) {
            this.f14522a = i;
            this.f14523b = str;
            this.c = onClickListener;
        }
    }

    public final void e() {
        this.f14517a.setText("YRN KIT");
        this.d.clear();
        this.d.add(new b(woi.f38194a, "调试配置", new View.OnClickListener() { // from class: pxr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f30887a.f(view);
            }
        }));
        this.d.add(new b(woi.f38195b, "详细信息", new View.OnClickListener() { // from class: qxr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f31947a.g(view);
            }
        }));
        this.d.add(new b(woi.d, "简单信息", new View.OnClickListener() { // from class: rxr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f33047a.h(view);
            }
        }));
        this.d.add(new b(woi.c, "log", new View.OnClickListener() { // from class: sxr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bzr.k("敬请期待");
            }
        }));
        this.c.notifyDataSetChanged();
    }

    public final /* synthetic */ void f(View view) {
        startActivity(new Intent(this, (Class<?>) YRNDevModeActivity.class));
    }

    public final /* synthetic */ void g(View view) {
        startActivity(new Intent(this, (Class<?>) YRNDetailInfoActivity.class));
    }

    public final /* synthetic */ void h(View view) {
        startActivity(new Intent(this, (Class<?>) YRNSimpleInfoActivity.class));
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(xvi.f39514b);
        this.f14517a = (TextView) findViewById(rsi.p);
        this.f14518b = (RecyclerView) findViewById(rsi.g);
        this.c = new a(this.d);
        this.f14518b.setLayoutManager(new GridLayoutManager(this, 3));
        this.f14518b.setAdapter(this.c);
        e();
    }
}
