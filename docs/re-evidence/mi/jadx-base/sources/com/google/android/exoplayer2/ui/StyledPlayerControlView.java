package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.v;
import defpackage.bop;
import defpackage.epi;
import defpackage.g2j;
import defpackage.g83;
import defpackage.hqi;
import defpackage.j3j;
import defpackage.jj4;
import defpackage.jrk;
import defpackage.jti;
import defpackage.jwi;
import defpackage.nx5;
import defpackage.o0i;
import defpackage.omi;
import defpackage.pi8;
import defpackage.qnp;
import defpackage.rk1;
import defpackage.rpi;
import defpackage.shi;
import defpackage.wkk;
import defpackage.wlq;
import defpackage.wmo;
import defpackage.xxi;
import defpackage.z3j;
import defpackage.znp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class StyledPlayerControlView extends FrameLayout {
    public final Drawable A;
    public final Drawable B;
    public final float C;
    public final float D;
    public final String E;
    public final String F;
    public final Drawable G;
    public final Drawable H;
    public final String I;
    public final String J;
    public final Drawable K;
    public final Drawable L;
    public final String M;
    public final String N;
    public q O;
    public jj4 P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public int U;
    public int V;
    public int W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f8350a;
    public long[] a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<m> f8351b;
    public boolean[] b0;
    public final View c;
    public long[] c0;
    public final View d;
    public boolean[] d0;
    public final View e;
    public long e0;
    public final View f;
    public long f0;
    public final View g;
    public long g0;
    public final TextView h;
    public wmo h0;
    public final TextView i;
    public Resources i0;
    public final ImageView j;
    public RecyclerView j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ImageView f8352k;
    public h k0;
    public final View l;
    public e l0;
    public final TextView m;
    public PopupWindow m0;
    public final TextView n;
    public boolean n0;
    public final com.google.android.exoplayer2.ui.b o;
    public int o0;
    public final StringBuilder p;
    public DefaultTrackSelector p0;
    public final Formatter q;
    public l q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v.b f8353r;
    public l r0;
    public final v.c s;
    public qnp s0;
    public final Runnable t;
    public ImageView t0;
    public final Drawable u;
    public ImageView u0;
    public final Drawable v;
    public ImageView v0;
    public final Drawable w;
    public View w0;
    public final String x;
    public View x0;
    public final String y;
    public View y0;
    public final String z;

    public final class b extends l {
        public b() {
            super();
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.l
        public void j(List<Integer> list, List<k> list2, com.google.android.exoplayer2.trackselection.c.a aVar) {
            boolean z;
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    z = false;
                    break;
                }
                int iIntValue = list.get(i).intValue();
                TrackGroupArray trackGroupArrayE = aVar.e(iIntValue);
                if (StyledPlayerControlView.this.p0 != null && StyledPlayerControlView.this.p0.v().k(iIntValue, trackGroupArrayE)) {
                    z = true;
                    break;
                }
                i++;
            }
            if (list2.isEmpty()) {
                StyledPlayerControlView.this.k0.k(1, StyledPlayerControlView.this.getResources().getString(g2j.x));
            } else if (z) {
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    k kVar = list2.get(i2);
                    if (kVar.e) {
                        StyledPlayerControlView.this.k0.k(1, kVar.d);
                        break;
                    }
                }
            } else {
                StyledPlayerControlView.this.k0.k(1, StyledPlayerControlView.this.getResources().getString(g2j.w));
            }
            this.f8365a = list;
            this.f8366b = list2;
            this.c = aVar;
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.l
        public void m(i iVar) {
            boolean z;
            iVar.f8361a.setText(g2j.w);
            DefaultTrackSelector.Parameters parametersV = ((DefaultTrackSelector) rk1.e(StyledPlayerControlView.this.p0)).v();
            int i = 0;
            while (true) {
                if (i >= this.f8365a.size()) {
                    z = false;
                    break;
                }
                int iIntValue = this.f8365a.get(i).intValue();
                if (parametersV.k(iIntValue, ((com.google.android.exoplayer2.trackselection.c.a) rk1.e(this.c)).e(iIntValue))) {
                    z = true;
                    break;
                }
                i++;
            }
            iVar.f8362b.setVisibility(z ? 4 : 0);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: emo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f16818a.q(view);
                }
            });
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.l
        public void o(String str) {
            StyledPlayerControlView.this.k0.k(1, str);
        }

        public final /* synthetic */ void q(View view) {
            if (StyledPlayerControlView.this.p0 != null) {
                DefaultTrackSelector.d dVarG = StyledPlayerControlView.this.p0.v().g();
                for (int i = 0; i < this.f8365a.size(); i++) {
                    dVarG = dVarG.e(this.f8365a.get(i).intValue());
                }
                ((DefaultTrackSelector) rk1.e(StyledPlayerControlView.this.p0)).N(dVarG);
            }
            StyledPlayerControlView.this.k0.k(1, StyledPlayerControlView.this.getResources().getString(g2j.w));
            StyledPlayerControlView.this.m0.dismiss();
        }
    }

    public final class c implements q.c, com.google.android.exoplayer2.ui.b.a, View.OnClickListener, PopupWindow.OnDismissListener {
        public c() {
        }

        @Override // com.google.android.exoplayer2.ui.b.a
        public void a(com.google.android.exoplayer2.ui.b bVar, long j, boolean z) {
            StyledPlayerControlView.this.T = false;
            if (!z && StyledPlayerControlView.this.O != null) {
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                styledPlayerControlView.r0(styledPlayerControlView.O, j);
            }
            StyledPlayerControlView.this.h0.W();
        }

        @Override // com.google.android.exoplayer2.ui.b.a
        public void b(com.google.android.exoplayer2.ui.b bVar, long j) {
            if (StyledPlayerControlView.this.n != null) {
                StyledPlayerControlView.this.n.setText(wlq.c0(StyledPlayerControlView.this.p, StyledPlayerControlView.this.q, j));
            }
        }

        @Override // com.google.android.exoplayer2.ui.b.a
        public void c(com.google.android.exoplayer2.ui.b bVar, long j) {
            StyledPlayerControlView.this.T = true;
            if (StyledPlayerControlView.this.n != null) {
                StyledPlayerControlView.this.n.setText(wlq.c0(StyledPlayerControlView.this.p, StyledPlayerControlView.this.q, j));
            }
            StyledPlayerControlView.this.h0.V();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            q qVar = StyledPlayerControlView.this.O;
            if (qVar == null) {
                return;
            }
            StyledPlayerControlView.this.h0.W();
            if (StyledPlayerControlView.this.d == view) {
                StyledPlayerControlView.this.P.i(qVar);
                return;
            }
            if (StyledPlayerControlView.this.c == view) {
                StyledPlayerControlView.this.P.g(qVar);
                return;
            }
            if (StyledPlayerControlView.this.f == view) {
                if (qVar.getPlaybackState() != 4) {
                    StyledPlayerControlView.this.P.d(qVar);
                    return;
                }
                return;
            }
            if (StyledPlayerControlView.this.g == view) {
                StyledPlayerControlView.this.P.k(qVar);
                return;
            }
            if (StyledPlayerControlView.this.e == view) {
                StyledPlayerControlView.this.Z(qVar);
                return;
            }
            if (StyledPlayerControlView.this.j == view) {
                StyledPlayerControlView.this.P.c(qVar, wkk.a(qVar.getRepeatMode(), StyledPlayerControlView.this.W));
                return;
            }
            if (StyledPlayerControlView.this.f8352k == view) {
                StyledPlayerControlView.this.P.b(qVar, !qVar.P());
                return;
            }
            if (StyledPlayerControlView.this.w0 == view) {
                StyledPlayerControlView.this.h0.V();
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                styledPlayerControlView.a0(styledPlayerControlView.k0);
                return;
            }
            if (StyledPlayerControlView.this.x0 == view) {
                StyledPlayerControlView.this.h0.V();
                StyledPlayerControlView styledPlayerControlView2 = StyledPlayerControlView.this;
                styledPlayerControlView2.a0(styledPlayerControlView2.l0);
            } else if (StyledPlayerControlView.this.y0 == view) {
                StyledPlayerControlView.this.h0.V();
                StyledPlayerControlView styledPlayerControlView3 = StyledPlayerControlView.this;
                styledPlayerControlView3.a0(styledPlayerControlView3.r0);
            } else if (StyledPlayerControlView.this.t0 == view) {
                StyledPlayerControlView.this.h0.V();
                StyledPlayerControlView styledPlayerControlView4 = StyledPlayerControlView.this;
                styledPlayerControlView4.a0(styledPlayerControlView4.q0);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (StyledPlayerControlView.this.n0) {
                StyledPlayerControlView.this.h0.W();
            }
        }

        @Override // com.google.android.exoplayer2.q.c
        public void onEvents(q qVar, q.d dVar) {
            if (dVar.b(5, 6)) {
                StyledPlayerControlView.this.z0();
            }
            if (dVar.b(5, 6, 8)) {
                StyledPlayerControlView.this.B0();
            }
            if (dVar.a(9)) {
                StyledPlayerControlView.this.C0();
            }
            if (dVar.a(10)) {
                StyledPlayerControlView.this.F0();
            }
            if (dVar.b(9, 10, 12, 0)) {
                StyledPlayerControlView.this.y0();
            }
            if (dVar.b(12, 0)) {
                StyledPlayerControlView.this.G0();
            }
            if (dVar.a(13)) {
                StyledPlayerControlView.this.A0();
            }
            if (dVar.a(2)) {
                StyledPlayerControlView.this.H0();
            }
        }
    }

    public interface d {
    }

    public final class e extends RecyclerView.Adapter<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[] f8355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f8356b;
        public int c;

        public e(String[] strArr, int[] iArr) {
            this.f8355a = strArr;
            this.f8356b = iArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f8355a.length;
        }

        public String j() {
            return this.f8355a[this.c];
        }

        public final /* synthetic */ void k(int i, View view) {
            if (i != this.c) {
                StyledPlayerControlView.this.setPlaybackSpeed(this.f8356b[i] / 100.0f);
            }
            StyledPlayerControlView.this.m0.dismiss();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(i iVar, final int i) {
            String[] strArr = this.f8355a;
            if (i < strArr.length) {
                iVar.f8361a.setText(strArr[i]);
            }
            iVar.f8362b.setVisibility(i == this.c ? 0 : 4);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: fmo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f17934a.k(i, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public i onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new i(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(jwi.h, (ViewGroup) null));
        }

        public void n(float f) {
            int iRound = Math.round(f * 100.0f);
            int i = 0;
            int i2 = Integer.MAX_VALUE;
            int i3 = 0;
            while (true) {
                int[] iArr = this.f8356b;
                if (i >= iArr.length) {
                    this.c = i3;
                    return;
                }
                int iAbs = Math.abs(iRound - iArr[i]);
                if (iAbs < i2) {
                    i3 = i;
                    i2 = iAbs;
                }
                i++;
            }
        }
    }

    public interface f {
    }

    public final class g extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f8357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f8358b;
        public final ImageView c;

        public g(View view) {
            super(view);
            this.f8357a = (TextView) view.findViewById(hqi.u);
            this.f8358b = (TextView) view.findViewById(hqi.P);
            this.c = (ImageView) view.findViewById(hqi.t);
            view.setOnClickListener(new View.OnClickListener() { // from class: gmo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f19139a.e(view2);
                }
            });
        }

        public final /* synthetic */ void e(View view) {
            StyledPlayerControlView.this.n0(getAdapterPosition());
        }
    }

    public class h extends RecyclerView.Adapter<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[] f8359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f8360b;
        public final Drawable[] c;

        public h(String[] strArr, Drawable[] drawableArr) {
            this.f8359a = strArr;
            this.f8360b = new String[strArr.length];
            this.c = drawableArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f8359a.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(g gVar, int i) {
            gVar.f8357a.setText(this.f8359a[i]);
            if (this.f8360b[i] == null) {
                gVar.f8358b.setVisibility(8);
            } else {
                gVar.f8358b.setText(this.f8360b[i]);
            }
            if (this.c[i] == null) {
                gVar.c.setVisibility(8);
            } else {
                gVar.c.setImageDrawable(this.c[i]);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public g onCreateViewHolder(ViewGroup viewGroup, int i) {
            return StyledPlayerControlView.this.new g(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(jwi.g, (ViewGroup) null));
        }

        public void k(int i, String str) {
            this.f8360b[i] = str;
        }
    }

    public static class i extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f8361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f8362b;

        public i(View view) {
            super(view);
            this.f8361a = (TextView) view.findViewById(hqi.S);
            this.f8362b = view.findViewById(hqi.h);
        }
    }

    public final class j extends l {
        public j() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void q(View view) {
            if (StyledPlayerControlView.this.p0 != null) {
                DefaultTrackSelector.d dVarG = StyledPlayerControlView.this.p0.v().g();
                for (int i = 0; i < this.f8365a.size(); i++) {
                    int iIntValue = this.f8365a.get(i).intValue();
                    dVarG = dVarG.e(iIntValue).l(iIntValue, true);
                }
                ((DefaultTrackSelector) rk1.e(StyledPlayerControlView.this.p0)).N(dVarG);
                StyledPlayerControlView.this.m0.dismiss();
            }
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.l
        public void j(List<Integer> list, List<k> list2, com.google.android.exoplayer2.trackselection.c.a aVar) {
            boolean z = false;
            for (int i = 0; i < list2.size(); i++) {
                if (list2.get(i).e) {
                    z = true;
                    break;
                }
            }
            if (StyledPlayerControlView.this.t0 != null) {
                ImageView imageView = StyledPlayerControlView.this.t0;
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                imageView.setImageDrawable(z ? styledPlayerControlView.G : styledPlayerControlView.H);
                StyledPlayerControlView.this.t0.setContentDescription(z ? StyledPlayerControlView.this.I : StyledPlayerControlView.this.J);
            }
            this.f8365a = list;
            this.f8366b = list2;
            this.c = aVar;
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.l, androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(i iVar, int i) {
            super.onBindViewHolder(iVar, i);
            if (i > 0) {
                iVar.f8362b.setVisibility(this.f8366b.get(i + (-1)).e ? 0 : 4);
            }
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.l
        public void m(i iVar) {
            boolean z;
            iVar.f8361a.setText(g2j.x);
            int i = 0;
            while (true) {
                if (i >= this.f8366b.size()) {
                    z = true;
                    break;
                } else {
                    if (this.f8366b.get(i).e) {
                        z = false;
                        break;
                    }
                    i++;
                }
            }
            iVar.f8362b.setVisibility(z ? 0 : 4);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: hmo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f20243a.q(view);
                }
            });
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.l
        public void o(String str) {
        }
    }

    public static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8364b;
        public final int c;
        public final String d;
        public final boolean e;

        public k(int i, int i2, int i3, String str, boolean z) {
            this.f8363a = i;
            this.f8364b = i2;
            this.c = i3;
            this.d = str;
            this.e = z;
        }
    }

    public abstract class l extends RecyclerView.Adapter<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<Integer> f8365a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<k> f8366b = new ArrayList();
        public com.google.android.exoplayer2.trackselection.c.a c = null;

        public l() {
        }

        public void clear() {
            this.f8366b = Collections.emptyList();
            this.c = null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            if (this.f8366b.isEmpty()) {
                return 0;
            }
            return this.f8366b.size() + 1;
        }

        public abstract void j(List<Integer> list, List<k> list2, com.google.android.exoplayer2.trackselection.c.a aVar);

        public final /* synthetic */ void k(k kVar, View view) {
            if (this.c == null || StyledPlayerControlView.this.p0 == null) {
                return;
            }
            DefaultTrackSelector.d dVarG = StyledPlayerControlView.this.p0.v().g();
            for (int i = 0; i < this.f8365a.size(); i++) {
                int iIntValue = this.f8365a.get(i).intValue();
                dVarG = iIntValue == kVar.f8363a ? dVarG.m(iIntValue, ((com.google.android.exoplayer2.trackselection.c.a) rk1.e(this.c)).e(iIntValue), new DefaultTrackSelector.SelectionOverride(kVar.f8364b, kVar.c)).l(iIntValue, false) : dVarG.e(iIntValue).l(iIntValue, true);
            }
            ((DefaultTrackSelector) rk1.e(StyledPlayerControlView.this.p0)).N(dVarG);
            o(kVar.d);
            StyledPlayerControlView.this.m0.dismiss();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: l */
        public void onBindViewHolder(i iVar, int i) {
            if (StyledPlayerControlView.this.p0 == null || this.c == null) {
                return;
            }
            if (i == 0) {
                m(iVar);
                return;
            }
            final k kVar = this.f8366b.get(i - 1);
            boolean z = ((DefaultTrackSelector) rk1.e(StyledPlayerControlView.this.p0)).v().k(kVar.f8363a, this.c.e(kVar.f8363a)) && kVar.e;
            iVar.f8361a.setText(kVar.d);
            iVar.f8362b.setVisibility(z ? 0 : 4);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: imo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f21302a.k(kVar, view);
                }
            });
        }

        public abstract void m(i iVar);

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public i onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new i(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(jwi.h, (ViewGroup) null));
        }

        public abstract void o(String str);
    }

    public interface m {
        void a(int i);
    }

    static {
        pi8.a("goog.exo.ui");
    }

    public StyledPlayerControlView(Context context) {
        this(context, null);
    }

    public static boolean V(v vVar, v.c cVar) {
        if (vVar.p() > 100) {
            return false;
        }
        int iP = vVar.p();
        for (int i2 = 0; i2 < iP; i2++) {
            if (vVar.n(i2, cVar).n == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    public static int c0(TypedArray typedArray, int i2) {
        return typedArray.getInt(z3j.b0, i2);
    }

    public static void g0(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        view.setOnClickListener(onClickListener);
    }

    @SuppressLint({"InlinedApi"})
    public static boolean i0(int i2) {
        return i2 == 90 || i2 == 89 || i2 == 85 || i2 == 79 || i2 == 126 || i2 == 127 || i2 == 87 || i2 == 88;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f2) {
        q qVar = this.O;
        if (qVar == null) {
            return;
        }
        this.P.h(qVar, qVar.c().b(f2));
    }

    public static void x0(View view, boolean z) {
        if (view == null) {
            return;
        }
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    public final void A0() {
        q qVar = this.O;
        if (qVar == null) {
            return;
        }
        this.l0.n(qVar.c().f27406a);
        this.k0.k(0, this.l0.j());
    }

    public final void B0() {
        long J;
        long jV;
        if (j0() && this.Q) {
            q qVar = this.O;
            if (qVar != null) {
                J = this.e0 + qVar.J();
                jV = this.e0 + qVar.v();
            } else {
                J = 0;
                jV = 0;
            }
            TextView textView = this.n;
            if (textView != null && !this.T) {
                textView.setText(wlq.c0(this.p, this.q, J));
            }
            com.google.android.exoplayer2.ui.b bVar = this.o;
            if (bVar != null) {
                bVar.setPosition(J);
                this.o.setBufferedPosition(jV);
            }
            removeCallbacks(this.t);
            int playbackState = qVar == null ? 1 : qVar.getPlaybackState();
            if (qVar == null || !qVar.isPlaying()) {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(this.t, 1000L);
                return;
            }
            com.google.android.exoplayer2.ui.b bVar2 = this.o;
            long jMin = Math.min(bVar2 != null ? bVar2.getPreferredUpdateDelay() : 1000L, 1000 - (J % 1000));
            float f2 = qVar.c().f27406a;
            postDelayed(this.t, wlq.s(f2 > 0.0f ? (long) (jMin / f2) : 1000L, this.V, 1000L));
        }
    }

    public final void C0() {
        ImageView imageView;
        if (j0() && this.Q && (imageView = this.j) != null) {
            if (this.W == 0) {
                v0(false, imageView);
                return;
            }
            q qVar = this.O;
            if (qVar == null) {
                v0(false, imageView);
                this.j.setImageDrawable(this.u);
                this.j.setContentDescription(this.x);
                return;
            }
            v0(true, imageView);
            int repeatMode = qVar.getRepeatMode();
            if (repeatMode == 0) {
                this.j.setImageDrawable(this.u);
                this.j.setContentDescription(this.x);
            } else if (repeatMode == 1) {
                this.j.setImageDrawable(this.v);
                this.j.setContentDescription(this.y);
            } else {
                if (repeatMode != 2) {
                    return;
                }
                this.j.setImageDrawable(this.w);
                this.j.setContentDescription(this.z);
            }
        }
    }

    public final void D0() {
        jj4 jj4Var = this.P;
        if (jj4Var instanceof com.google.android.exoplayer2.f) {
            this.f0 = ((com.google.android.exoplayer2.f) jj4Var).n();
        }
        int i2 = (int) (this.f0 / 1000);
        TextView textView = this.i;
        if (textView != null) {
            textView.setText(String.valueOf(i2));
        }
        View view = this.g;
        if (view != null) {
            view.setContentDescription(this.i0.getQuantityString(xxi.f39564b, i2, Integer.valueOf(i2)));
        }
    }

    public final void E0() {
        this.j0.measure(0, 0);
        this.m0.setWidth(Math.min(this.j0.getMeasuredWidth(), getWidth() - (this.o0 * 2)));
        this.m0.setHeight(Math.min(getHeight() - (this.o0 * 2), this.j0.getMeasuredHeight()));
    }

    public final void F0() {
        ImageView imageView;
        if (j0() && this.Q && (imageView = this.f8352k) != null) {
            q qVar = this.O;
            if (!this.h0.A(imageView)) {
                v0(false, this.f8352k);
                return;
            }
            if (qVar == null) {
                v0(false, this.f8352k);
                this.f8352k.setImageDrawable(this.B);
                this.f8352k.setContentDescription(this.F);
            } else {
                v0(true, this.f8352k);
                this.f8352k.setImageDrawable(qVar.P() ? this.A : this.B);
                this.f8352k.setContentDescription(qVar.P() ? this.E : this.F);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009e  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cf A[SYNTHETIC] */
    public final void G0() {
        int i2;
        v.c cVar;
        long jL;
        long[] jArr;
        int length;
        q qVar = this.O;
        if (qVar == null) {
            return;
        }
        boolean z = true;
        this.S = this.R && V(qVar.C(), this.s);
        long j2 = 0;
        this.e0 = 0L;
        v vVarC = qVar.C();
        if (vVarC.q()) {
            i2 = 0;
        } else {
            int iY = qVar.y();
            boolean z2 = this.S;
            int i3 = z2 ? 0 : iY;
            int iP = z2 ? vVarC.p() - 1 : iY;
            long j3 = 0;
            i2 = 0;
            while (i3 <= iP) {
                if (i3 == iY) {
                    this.e0 = g83.d(j3);
                }
                vVarC.n(i3, this.s);
                v.c cVar2 = this.s;
                if (cVar2.n == -9223372036854775807L) {
                    rk1.g(this.S ^ z);
                    break;
                }
                int i4 = cVar2.o;
                while (true) {
                    cVar = this.s;
                    if (i4 <= cVar.p) {
                        vVarC.f(i4, this.f8353r);
                        int iC = this.f8353r.c();
                        for (int i5 = 0; i5 < iC; i5++) {
                            long jF = this.f8353r.f(i5);
                            if (jF == Long.MIN_VALUE) {
                                long j4 = this.f8353r.d;
                                if (j4 != -9223372036854775807L) {
                                    jF = j4;
                                    jL = jF + this.f8353r.l();
                                    if (jL >= 0) {
                                        jArr = this.a0;
                                        if (i2 == jArr.length) {
                                            if (jArr.length == 0) {
                                                length = 1;
                                            } else {
                                                length = jArr.length * 2;
                                            }
                                            this.a0 = Arrays.copyOf(jArr, length);
                                            this.b0 = Arrays.copyOf(this.b0, length);
                                        }
                                        this.a0[i2] = g83.d(j3 + jL);
                                        this.b0[i2] = this.f8353r.m(i5);
                                        i2++;
                                    }
                                }
                            } else {
                                jL = jF + this.f8353r.l();
                                if (jL >= 0) {
                                    jArr = this.a0;
                                    if (i2 == jArr.length) {
                                        if (jArr.length == 0) {
                                            length = 1;
                                        } else {
                                            length = jArr.length * 2;
                                        }
                                        this.a0 = Arrays.copyOf(jArr, length);
                                        this.b0 = Arrays.copyOf(this.b0, length);
                                    }
                                    this.a0[i2] = g83.d(j3 + jL);
                                    this.b0[i2] = this.f8353r.m(i5);
                                    i2++;
                                }
                            }
                        }
                        i4++;
                    }
                }
                j3 += cVar.n;
                i3++;
                z = true;
            }
            j2 = j3;
        }
        long jD = g83.d(j2);
        TextView textView = this.m;
        if (textView != null) {
            textView.setText(wlq.c0(this.p, this.q, jD));
        }
        com.google.android.exoplayer2.ui.b bVar = this.o;
        if (bVar != null) {
            bVar.setDuration(jD);
            int length2 = this.c0.length;
            int i6 = i2 + length2;
            long[] jArr2 = this.a0;
            if (i6 > jArr2.length) {
                this.a0 = Arrays.copyOf(jArr2, i6);
                this.b0 = Arrays.copyOf(this.b0, i6);
            }
            System.arraycopy(this.c0, 0, this.a0, i2, length2);
            System.arraycopy(this.d0, 0, this.b0, i2, length2);
            this.o.a(this.a0, this.b0, i6);
        }
        B0();
    }

    public final void H0() {
        f0();
        v0(this.q0.getItemCount() > 0, this.t0);
    }

    public void U(m mVar) {
        rk1.e(mVar);
        this.f8351b.add(mVar);
    }

    public boolean W(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        q qVar = this.O;
        if (qVar == null || !i0(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (qVar.getPlaybackState() == 4) {
                return true;
            }
            this.P.d(qVar);
            return true;
        }
        if (keyCode == 89) {
            this.P.k(qVar);
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            Z(qVar);
            return true;
        }
        if (keyCode == 87) {
            this.P.i(qVar);
            return true;
        }
        if (keyCode == 88) {
            this.P.g(qVar);
            return true;
        }
        if (keyCode == 126) {
            Y(qVar);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        X(qVar);
        return true;
    }

    public final void X(q qVar) {
        this.P.j(qVar, false);
    }

    public final void Y(q qVar) {
        int playbackState = qVar.getPlaybackState();
        if (playbackState == 1) {
            this.P.f(qVar);
        } else if (playbackState == 4) {
            q0(qVar, qVar.y(), -9223372036854775807L);
        }
        this.P.j(qVar, true);
    }

    public final void Z(q qVar) {
        int playbackState = qVar.getPlaybackState();
        if (playbackState == 1 || playbackState == 4 || !qVar.n()) {
            Y(qVar);
        } else {
            X(qVar);
        }
    }

    public final void a0(RecyclerView.Adapter<?> adapter) {
        this.j0.setAdapter(adapter);
        E0();
        this.n0 = false;
        this.m0.dismiss();
        this.n0 = true;
        this.m0.showAsDropDown(this, (getWidth() - this.m0.getWidth()) - this.o0, (-this.m0.getHeight()) - this.o0);
    }

    public final void b0(com.google.android.exoplayer2.trackselection.c.a aVar, int i2, List<k> list) {
        TrackGroupArray trackGroupArrayE = aVar.e(i2);
        znp znpVarA = ((q) rk1.e(this.O)).F().a(i2);
        for (int i3 = 0; i3 < trackGroupArrayE.f8078a; i3++) {
            TrackGroup trackGroupA = trackGroupArrayE.a(i3);
            for (int i4 = 0; i4 < trackGroupA.f8076a; i4++) {
                Format formatA = trackGroupA.a(i4);
                if (aVar.f(i2, i3, i4) == 4) {
                    list.add(new k(i2, i3, i4, this.s0.a(formatA), (znpVarA == null || znpVarA.q(formatA) == -1) ? false : true));
                }
            }
        }
    }

    public void d0() {
        this.h0.C();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return W(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public void e0() {
        this.h0.F();
    }

    public final void f0() {
        DefaultTrackSelector defaultTrackSelector;
        com.google.android.exoplayer2.trackselection.c.a aVarG;
        this.q0.clear();
        this.r0.clear();
        if (this.O == null || (defaultTrackSelector = this.p0) == null || (aVarG = defaultTrackSelector.g()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (int i2 = 0; i2 < aVarG.c(); i2++) {
            if (aVarG.d(i2) == 3 && this.h0.A(this.t0)) {
                b0(aVarG, i2, arrayList);
                arrayList3.add(Integer.valueOf(i2));
            } else if (aVarG.d(i2) == 1) {
                b0(aVarG, i2, arrayList2);
                arrayList4.add(Integer.valueOf(i2));
            }
        }
        this.q0.j(arrayList3, arrayList, aVarG);
        this.r0.j(arrayList4, arrayList2, aVarG);
    }

    public q getPlayer() {
        return this.O;
    }

    public int getRepeatToggleModes() {
        return this.W;
    }

    public boolean getShowShuffleButton() {
        return this.h0.A(this.f8352k);
    }

    public boolean getShowSubtitleButton() {
        return this.h0.A(this.t0);
    }

    public int getShowTimeoutMs() {
        return this.U;
    }

    public boolean getShowVrButton() {
        return this.h0.A(this.l);
    }

    public boolean h0() {
        return this.h0.I();
    }

    public boolean j0() {
        return getVisibility() == 0;
    }

    public void k0() {
        Iterator<m> it = this.f8351b.iterator();
        while (it.hasNext()) {
            it.next().a(getVisibility());
        }
    }

    public final void l0(View view) {
    }

    public final void m0(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = i5 - i3;
        int i11 = i9 - i7;
        if (!(i4 - i2 == i8 - i6 && i10 == i11) && this.m0.isShowing()) {
            E0();
            this.m0.update(view, (getWidth() - this.m0.getWidth()) - this.o0, (-this.m0.getHeight()) - this.o0, -1, -1);
        }
    }

    public final void n0(int i2) {
        if (i2 == 0) {
            a0(this.l0);
        } else if (i2 == 1) {
            a0(this.r0);
        } else {
            this.m0.dismiss();
        }
    }

    public void o0(m mVar) {
        this.f8351b.remove(mVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h0.O();
        this.Q = true;
        if (h0()) {
            this.h0.W();
        }
        u0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h0.P();
        this.Q = false;
        removeCallbacks(this.t);
        this.h0.V();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        this.h0.Q(z, i2, i3, i4, i5);
    }

    public void p0() {
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
    }

    public final boolean q0(q qVar, int i2, long j2) {
        return this.P.a(qVar, i2, j2);
    }

    public final void r0(q qVar, long j2) {
        int iY;
        v vVarC = qVar.C();
        if (this.S && !vVarC.q()) {
            int iP = vVarC.p();
            iY = 0;
            while (true) {
                long jD = vVarC.n(iY, this.s).d();
                if (j2 < jD) {
                    break;
                }
                if (iY == iP - 1) {
                    j2 = jD;
                    break;
                } else {
                    j2 -= jD;
                    iY++;
                }
            }
        } else {
            iY = qVar.y();
        }
        if (q0(qVar, iY, j2)) {
            return;
        }
        B0();
    }

    public final boolean s0() {
        q qVar = this.O;
        return (qVar == null || qVar.getPlaybackState() == 4 || this.O.getPlaybackState() == 1 || !this.O.n()) ? false : true;
    }

    public void setAnimationEnabled(boolean z) {
        this.h0.X(z);
    }

    public void setControlDispatcher(jj4 jj4Var) {
        if (this.P != jj4Var) {
            this.P = jj4Var;
            y0();
        }
    }

    public void setOnFullScreenModeChangedListener(d dVar) {
        x0(this.u0, dVar != null);
        x0(this.v0, dVar != null);
    }

    @Deprecated
    public void setPlaybackPreparer(o0i o0iVar) {
    }

    public void setPlayer(q qVar) {
        rk1.g(Looper.myLooper() == Looper.getMainLooper());
        rk1.a(qVar == null || qVar.D() == Looper.getMainLooper());
        q qVar2 = this.O;
        if (qVar2 == qVar) {
            return;
        }
        if (qVar2 != null) {
            qVar2.i(this.f8350a);
        }
        this.O = qVar;
        if (qVar != null) {
            qVar.t(this.f8350a);
        }
        if (qVar instanceof com.google.android.exoplayer2.i) {
            bop bopVarE = ((com.google.android.exoplayer2.i) qVar).e();
            if (bopVarE instanceof DefaultTrackSelector) {
                this.p0 = (DefaultTrackSelector) bopVarE;
            }
        } else {
            this.p0 = null;
        }
        u0();
    }

    public void setProgressUpdateListener(f fVar) {
    }

    public void setRepeatToggleModes(int i2) {
        this.W = i2;
        q qVar = this.O;
        if (qVar != null) {
            int repeatMode = qVar.getRepeatMode();
            if (i2 == 0 && repeatMode != 0) {
                this.P.c(this.O, 0);
            } else if (i2 == 1 && repeatMode == 2) {
                this.P.c(this.O, 1);
            } else if (i2 == 2 && repeatMode == 1) {
                this.P.c(this.O, 2);
            }
        }
        this.h0.Y(this.j, i2 != 0);
        C0();
    }

    public void setShowFastForwardButton(boolean z) {
        this.h0.Y(this.f, z);
        y0();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.R = z;
        G0();
    }

    public void setShowNextButton(boolean z) {
        this.h0.Y(this.d, z);
        y0();
    }

    public void setShowPreviousButton(boolean z) {
        this.h0.Y(this.c, z);
        y0();
    }

    public void setShowRewindButton(boolean z) {
        this.h0.Y(this.g, z);
        y0();
    }

    public void setShowShuffleButton(boolean z) {
        this.h0.Y(this.f8352k, z);
        F0();
    }

    public void setShowSubtitleButton(boolean z) {
        this.h0.Y(this.t0, z);
    }

    public void setShowTimeoutMs(int i2) {
        this.U = i2;
        if (h0()) {
            this.h0.W();
        }
    }

    public void setShowVrButton(boolean z) {
        this.h0.Y(this.l, z);
    }

    public void setTimeBarMinUpdateInterval(int i2) {
        this.V = wlq.r(i2, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.l;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            v0(onClickListener != null, this.l);
        }
    }

    public void t0() {
        this.h0.b0();
    }

    public void u0() {
        z0();
        y0();
        C0();
        F0();
        H0();
        A0();
        G0();
    }

    public final void v0(boolean z, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.C : this.D);
    }

    public final void w0() {
        jj4 jj4Var = this.P;
        if (jj4Var instanceof com.google.android.exoplayer2.f) {
            this.g0 = ((com.google.android.exoplayer2.f) jj4Var).m();
        }
        int i2 = (int) (this.g0 / 1000);
        TextView textView = this.h;
        if (textView != null) {
            textView.setText(String.valueOf(i2));
        }
        View view = this.f;
        if (view != null) {
            view.setContentDescription(this.i0.getQuantityString(xxi.f39563a, i2, Integer.valueOf(i2)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    public final void y0() {
        boolean z;
        boolean zL;
        boolean z2;
        boolean z3;
        if (j0() && this.Q) {
            q qVar = this.O;
            boolean z4 = false;
            if (qVar != null) {
                v vVarC = qVar.C();
                if (vVarC.q() || qVar.a()) {
                    z = false;
                    zL = false;
                    z2 = false;
                    z3 = false;
                } else {
                    zL = qVar.l(4);
                    vVarC.n(qVar.y(), this.s);
                    z2 = zL || !this.s.f() || qVar.l(6);
                    boolean z5 = zL && this.P.e();
                    z3 = zL && this.P.l();
                    z = (this.s.f() && this.s.i) || qVar.l(5);
                    z4 = z5;
                }
            } else {
                z = false;
                zL = false;
                z2 = false;
                z3 = false;
            }
            if (z4) {
                D0();
            }
            if (z3) {
                w0();
            }
            v0(z2, this.c);
            v0(z4, this.g);
            v0(z3, this.f);
            v0(z, this.d);
            com.google.android.exoplayer2.ui.b bVar = this.o;
            if (bVar != null) {
                bVar.setEnabled(zL);
            }
        }
    }

    public final void z0() {
        if (j0() && this.Q && this.e != null) {
            if (s0()) {
                ((ImageView) this.e).setImageDrawable(this.i0.getDrawable(epi.j));
                this.e.setContentDescription(this.i0.getString(g2j.f));
            } else {
                ((ImageView) this.e).setImageDrawable(this.i0.getDrawable(epi.f16938k));
                this.e.setContentDescription(this.i0.getString(g2j.g));
            }
        }
    }

    public StyledPlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StyledPlayerControlView(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, attributeSet);
    }

    public StyledPlayerControlView(Context context, AttributeSet attributeSet, int i2, AttributeSet attributeSet2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        TextView textView;
        boolean z9;
        super(context, attributeSet, i2);
        int resourceId = jwi.d;
        this.f0 = 5000L;
        this.g0 = 15000L;
        this.U = 5000;
        this.W = 0;
        this.V = 200;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, z3j.X, 0, 0);
            try {
                this.f0 = typedArrayObtainStyledAttributes.getInt(z3j.c0, (int) this.f0);
                this.g0 = typedArrayObtainStyledAttributes.getInt(z3j.a0, (int) this.g0);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(z3j.Z, resourceId);
                this.U = typedArrayObtainStyledAttributes.getInt(z3j.j0, this.U);
                this.W = c0(typedArrayObtainStyledAttributes, this.W);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(z3j.g0, true);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(z3j.d0, true);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(z3j.f0, true);
                boolean z13 = typedArrayObtainStyledAttributes.getBoolean(z3j.e0, true);
                boolean z14 = typedArrayObtainStyledAttributes.getBoolean(z3j.h0, false);
                boolean z15 = typedArrayObtainStyledAttributes.getBoolean(z3j.i0, false);
                boolean z16 = typedArrayObtainStyledAttributes.getBoolean(z3j.k0, false);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(z3j.l0, this.V));
                boolean z17 = typedArrayObtainStyledAttributes.getBoolean(z3j.Y, true);
                typedArrayObtainStyledAttributes.recycle();
                z2 = z14;
                z3 = z15;
                z5 = z10;
                z6 = z11;
                z7 = z12;
                z4 = z17;
                z8 = z13;
                z = z16;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            z = false;
            z2 = false;
            z3 = false;
            z4 = true;
            z5 = true;
            z6 = true;
            z7 = true;
            z8 = true;
        }
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        c cVar = new c();
        this.f8350a = cVar;
        this.f8351b = new CopyOnWriteArrayList<>();
        this.f8353r = new v.b();
        this.s = new v.c();
        StringBuilder sb = new StringBuilder();
        this.p = sb;
        this.q = new Formatter(sb, Locale.getDefault());
        this.a0 = new long[0];
        this.b0 = new boolean[0];
        this.c0 = new long[0];
        this.d0 = new boolean[0];
        boolean z18 = z5;
        this.P = new com.google.android.exoplayer2.f(this.g0, this.f0);
        this.t = new Runnable() { // from class: bmo
            @Override // java.lang.Runnable
            public final void run() {
                this.f4373a.B0();
            }
        };
        this.m = (TextView) findViewById(hqi.m);
        this.n = (TextView) findViewById(hqi.F);
        ImageView imageView = (ImageView) findViewById(hqi.Q);
        this.t0 = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(cVar);
        }
        ImageView imageView2 = (ImageView) findViewById(hqi.s);
        this.u0 = imageView2;
        g0(imageView2, new View.OnClickListener() { // from class: cmo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5488a.l0(view);
            }
        });
        ImageView imageView3 = (ImageView) findViewById(hqi.w);
        this.v0 = imageView3;
        g0(imageView3, new View.OnClickListener() { // from class: cmo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5488a.l0(view);
            }
        });
        View viewFindViewById = findViewById(hqi.M);
        this.w0 = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(cVar);
        }
        View viewFindViewById2 = findViewById(hqi.E);
        this.x0 = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(cVar);
        }
        View viewFindViewById3 = findViewById(hqi.c);
        this.y0 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(cVar);
        }
        com.google.android.exoplayer2.ui.b bVar = (com.google.android.exoplayer2.ui.b) findViewById(hqi.H);
        View viewFindViewById4 = findViewById(hqi.I);
        if (bVar != null) {
            this.o = bVar;
            textView = null;
        } else if (viewFindViewById4 != null) {
            textView = null;
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2, j3j.f22382a);
            defaultTimeBar.setId(hqi.H);
            defaultTimeBar.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.o = defaultTimeBar;
        } else {
            textView = null;
            this.o = null;
        }
        com.google.android.exoplayer2.ui.b bVar2 = this.o;
        if (bVar2 != null) {
            bVar2.addListener(cVar);
        }
        View viewFindViewById5 = findViewById(hqi.D);
        this.e = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(cVar);
        }
        View viewFindViewById6 = findViewById(hqi.G);
        this.c = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(cVar);
        }
        View viewFindViewById7 = findViewById(hqi.x);
        this.d = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(cVar);
        }
        Typeface typefaceH = jrk.h(context, rpi.f32773a);
        View viewFindViewById8 = findViewById(hqi.K);
        TextView textView2 = viewFindViewById8 == null ? (TextView) findViewById(hqi.L) : textView;
        this.i = textView2;
        if (textView2 != null) {
            textView2.setTypeface(typefaceH);
        }
        viewFindViewById8 = viewFindViewById8 == null ? textView2 : viewFindViewById8;
        this.g = viewFindViewById8;
        if (viewFindViewById8 != null) {
            viewFindViewById8.setOnClickListener(cVar);
        }
        View viewFindViewById9 = findViewById(hqi.q);
        TextView textView3 = viewFindViewById9 == null ? (TextView) findViewById(hqi.f20345r) : textView;
        this.h = textView3;
        if (textView3 != null) {
            textView3.setTypeface(typefaceH);
        }
        viewFindViewById9 = viewFindViewById9 == null ? textView3 : viewFindViewById9;
        this.f = viewFindViewById9;
        if (viewFindViewById9 != null) {
            viewFindViewById9.setOnClickListener(cVar);
        }
        ImageView imageView4 = (ImageView) findViewById(hqi.J);
        this.j = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(cVar);
        }
        ImageView imageView5 = (ImageView) findViewById(hqi.N);
        this.f8352k = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(cVar);
        }
        Resources resources = context.getResources();
        this.i0 = resources;
        this.C = resources.getInteger(jti.f23123b) / 100.0f;
        this.D = this.i0.getInteger(jti.f23122a) / 100.0f;
        View viewFindViewById10 = findViewById(hqi.U);
        this.l = viewFindViewById10;
        if (viewFindViewById10 != null) {
            v0(false, viewFindViewById10);
        }
        wmo wmoVar = new wmo(this);
        this.h0 = wmoVar;
        wmoVar.X(z4);
        boolean z19 = z;
        this.k0 = new h(new String[]{this.i0.getString(g2j.h), this.i0.getString(g2j.y)}, new Drawable[]{this.i0.getDrawable(epi.q), this.i0.getDrawable(epi.g)});
        this.o0 = this.i0.getDimensionPixelSize(omi.f29299a);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(jwi.f, (ViewGroup) null);
        this.j0 = recyclerView;
        recyclerView.setAdapter(this.k0);
        this.j0.setLayoutManager(new LinearLayoutManager(getContext()));
        PopupWindow popupWindow = new PopupWindow((View) this.j0, -2, -2, true);
        this.m0 = popupWindow;
        if (wlq.f38110a < 23) {
            z9 = false;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            z9 = false;
        }
        this.m0.setOnDismissListener(cVar);
        this.n0 = true;
        this.s0 = new nx5(getResources());
        this.G = this.i0.getDrawable(epi.s);
        this.H = this.i0.getDrawable(epi.f16939r);
        this.I = this.i0.getString(g2j.f18504b);
        this.J = this.i0.getString(g2j.f18503a);
        this.q0 = new j();
        this.r0 = new b();
        this.l0 = new e(this.i0.getStringArray(shi.f33647a), this.i0.getIntArray(shi.f33648b));
        this.K = this.i0.getDrawable(epi.i);
        this.L = this.i0.getDrawable(epi.h);
        this.u = this.i0.getDrawable(epi.m);
        this.v = this.i0.getDrawable(epi.n);
        this.w = this.i0.getDrawable(epi.l);
        this.A = this.i0.getDrawable(epi.p);
        this.B = this.i0.getDrawable(epi.o);
        this.M = this.i0.getString(g2j.d);
        this.N = this.i0.getString(g2j.c);
        this.x = this.i0.getString(g2j.j);
        this.y = this.i0.getString(g2j.f18505k);
        this.z = this.i0.getString(g2j.i);
        this.E = this.i0.getString(g2j.n);
        this.F = this.i0.getString(g2j.m);
        this.h0.Y((ViewGroup) findViewById(hqi.e), true);
        this.h0.Y(viewFindViewById9, z6);
        this.h0.Y(viewFindViewById8, z18);
        this.h0.Y(viewFindViewById6, z7);
        this.h0.Y(viewFindViewById7, z8);
        this.h0.Y(imageView5, z2);
        this.h0.Y(this.t0, z3);
        this.h0.Y(viewFindViewById10, z19);
        this.h0.Y(imageView4, this.W != 0 ? true : z9);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: dmo
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                this.f15698a.m0(view, i3, i4, i5, i6, i7, i8, i9, i10);
            }
        });
    }
}
