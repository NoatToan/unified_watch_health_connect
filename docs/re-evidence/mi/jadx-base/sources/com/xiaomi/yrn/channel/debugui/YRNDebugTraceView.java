package com.xiaomi.yrn.channel.debugui;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.yrn.env.trace.YRNTraceEvent;
import defpackage.bzr;
import defpackage.czr;
import defpackage.ezr;
import defpackage.gwr;
import defpackage.nxr;
import defpackage.rsi;
import defpackage.wwr;
import defpackage.xvi;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class YRNDebugTraceView extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<d> f14498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f14499b;
    public final Handler c;
    public boolean d;
    public RecyclerView e;
    public b f;
    public TextView g;
    public final Runnable h;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            YRNDebugTraceView.this.f14498a.clear();
            YRNDebugTraceView.this.f14499b.notifyDataSetChanged();
        }
    }

    public interface b {
        void a();
    }

    public static class c extends RecyclerView.Adapter<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<d> f14501a;

        public static class a extends RecyclerView.d0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public TextView f14502a;

            public a(View view) {
                super(view);
                b(view);
            }

            private void b(View view) {
                this.f14502a = (TextView) view.findViewById(rsi.v);
            }
        }

        public c(List<d> list) {
            this.f14501a = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f14501a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(a aVar, int i) {
            if (i >= this.f14501a.size()) {
                return;
            }
            aVar.f14502a.setText(this.f14501a.get(i).f14503a);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public a onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new a(LayoutInflater.from(viewGroup.getContext()).inflate(xvi.e, viewGroup, false));
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f14503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public YRNTraceEvent f14504b;
        public String c;

        public d(YRNTraceEvent yRNTraceEvent, String str, String str2) {
            this.f14504b = yRNTraceEvent;
            this.f14503a = str;
            this.c = str2;
        }
    }

    public YRNDebugTraceView(Context context) {
        super(context);
        this.f14498a = new ArrayList();
        this.c = new Handler(Looper.getMainLooper());
        this.d = false;
        this.h = new a();
        e(context);
    }

    public void e(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(xvi.c, (ViewGroup) this, true);
        findViewById(rsi.x).setOnClickListener(this);
        findViewById(rsi.w).setOnClickListener(this);
        findViewById(rsi.z).setOnClickListener(this);
        this.g = (TextView) findViewById(rsi.A);
        this.e = (RecyclerView) viewInflate.findViewById(rsi.y);
        this.f14499b = new c(this.f14498a);
        this.e.setLayoutManager(new LinearLayoutManager(context));
        this.e.setAdapter(this.f14499b);
        ezr.c().e(new czr() { // from class: nwr
            @Override // defpackage.czr
            public final void a(YRNTraceEvent yRNTraceEvent) {
                this.f28528a.f(yRNTraceEvent);
            }
        });
    }

    public final /* synthetic */ void f(YRNTraceEvent yRNTraceEvent) {
        if (yRNTraceEvent == null || !this.d) {
            return;
        }
        this.f14498a.add(new d(yRNTraceEvent, yRNTraceEvent.toString(), gwr.a()));
        this.c.post(new Runnable() { // from class: owr
            @Override // java.lang.Runnable
            public final void run() {
                this.f29775a.g();
            }
        });
    }

    public final /* synthetic */ void g() {
        this.f14499b.notifyDataSetChanged();
        this.e.scrollToPosition(this.f14498a.isEmpty() ? 0 : this.f14498a.size() - 1);
    }

    public final void h() {
        List<d> list = this.f14498a;
        if (list == null || list.size() == 0) {
            bzr.k("内容为空~");
            return;
        }
        String str = getContext().getExternalCacheDir().getAbsolutePath() + File.separator;
        String str2 = "yrn_sdk_trace_" + System.currentTimeMillis() + ".txt";
        wwr.o(nxr.f(this.f14498a), str, str2);
        this.g.setVisibility(0);
        this.g.setText("上次保存：" + str + str2);
    }

    public void i() {
        if (this.d) {
            return;
        }
        this.d = true;
    }

    public void j() {
        this.d = false;
        this.c.post(this.h);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != rsi.x) {
            if (view.getId() == rsi.w) {
                this.c.post(this.h);
                return;
            } else {
                if (view.getId() == rsi.z) {
                    h();
                    return;
                }
                return;
            }
        }
        b bVar = this.f;
        if (bVar != null) {
            bVar.a();
        }
        Handler handler = this.c;
        if (handler != null) {
            handler.removeCallbacks(this.h);
        }
    }

    public void setOnDebugTraceListener(b bVar) {
        this.f = bVar;
    }
}
