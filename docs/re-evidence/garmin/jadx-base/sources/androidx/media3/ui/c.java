package androidx.media3.ui;

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
import androidx.media3.common.d0;
import androidx.media3.common.e0;
import androidx.media3.common.g0;
import androidx.media3.common.h0;
import androidx.media3.common.q;
import androidx.media3.common.u;
import androidx.media3.common.y;
import androidx.media3.common.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import aq.b0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.C;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import k32.n;

/* JADX INFO: loaded from: classes.dex */
public class c extends FrameLayout {

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public static final float[] f10036w1;
    public final ImageView A;
    public final View B;
    public final View C;
    public final View D;
    public final TextView E;
    public final TextView F;
    public final d0.c H0;
    public final androidx.media3.ui.e I;
    public final n I0;
    public final Drawable J0;
    public final Drawable K0;
    public final Drawable L0;
    public final Drawable M0;
    public final Drawable N0;
    public final String O0;
    public final StringBuilder P;
    public final String P0;
    public final String Q0;
    public final Drawable R0;
    public final Drawable S0;
    public final Formatter T;
    public final float T0;
    public final float U0;
    public final String V0;
    public final String W0;
    public final Drawable X0;
    public final Drawable Y0;
    public final String Z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kc.f f10037a;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public final String f10038a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f10039b;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public final Drawable f10040b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewOnClickListenerC0133c f10041c;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public final Drawable f10042c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList<m> f10043d;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public final String f10044d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RecyclerView f10045e;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public final String f10046e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f10047f;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public z f10048f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f10049g;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public d f10050g1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f10051h;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public boolean f10052h1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f10053i;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public boolean f10054i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final kc.b f10055j;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public boolean f10056j1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final PopupWindow f10057k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final d0.b f10058k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public boolean f10059k1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f10060l;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public boolean f10061l1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ImageView f10062m;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public boolean f10063m1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ImageView f10064n;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public int f10065n1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImageView f10066o;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public int f10067o1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final View f10068p;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public int f10069p1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final View f10070q;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public long[] f10071q1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f10072r;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public boolean[] f10073r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public final long[] f10074s1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f10075t;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public final boolean[] f10076t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public long f10077u1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ImageView f10078v;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public boolean f10079v1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageView f10080w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ImageView f10081x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ImageView f10082y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ImageView f10083z;

    public final class b extends l {
        private b() {
            super();
        }

        @Override // androidx.media3.ui.c.l
        public final void onTrackSelection(String str) {
            c.this.f10047f.f10095b[1] = str;
        }

        @Override // androidx.media3.ui.c.l
        public final void t(i iVar) {
            iVar.f10098a.setText(R.string.exo_track_selection_auto);
            z zVar = c.this.f10048f1;
            zVar.getClass();
            iVar.f10099b.setVisibility(u(zVar.getTrackSelectionParameters()) ? 4 : 0);
            iVar.itemView.setOnClickListener(new js0.d(this, 5));
        }

        public final boolean u(g0 g0Var) {
            for (int i14 = 0; i14 < this.f10104a.size(); i14++) {
                if (g0Var.A.containsKey(this.f10104a.get(i14).f10101a.f8304b)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.ui.c$c, reason: collision with other inner class name */
    public final class ViewOnClickListenerC0133c implements z.d, androidx.media3.ui.e.a, View.OnClickListener, PopupWindow.OnDismissListener {
        private ViewOnClickListenerC0133c() {
        }

        @Override // androidx.media3.ui.e.a
        public final void a(long j8) {
            c cVar = c.this;
            TextView textView = cVar.F;
            if (textView != null) {
                textView.setText(fa.z.A(cVar.P, cVar.T, j8));
            }
        }

        @Override // androidx.media3.ui.e.a
        public final void b(long j8, boolean z14) {
            z zVar;
            c cVar = c.this;
            int i14 = 0;
            cVar.f10063m1 = false;
            if (!z14 && (zVar = cVar.f10048f1) != null) {
                if (cVar.f10061l1) {
                    if (zVar.isCommandAvailable(17) && zVar.isCommandAvailable(10)) {
                        d0 currentTimeline = zVar.getCurrentTimeline();
                        int iO = currentTimeline.o();
                        while (true) {
                            long jY = fa.z.Y(currentTimeline.m(i14, cVar.H0, 0L).f8208m);
                            if (j8 < jY) {
                                break;
                            }
                            if (i14 == iO - 1) {
                                j8 = jY;
                                break;
                            } else {
                                j8 -= jY;
                                i14++;
                            }
                        }
                        zVar.seekTo(i14, j8);
                    }
                } else if (zVar.isCommandAvailable(5)) {
                    zVar.seekTo(j8);
                }
                cVar.o();
            }
            cVar.f10037a.g();
        }

        @Override // androidx.media3.ui.e.a
        public final void c(long j8) {
            c cVar = c.this;
            cVar.f10063m1 = true;
            TextView textView = cVar.F;
            if (textView != null) {
                textView.setText(fa.z.A(cVar.P, cVar.T, j8));
            }
            cVar.f10037a.f();
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            c cVar = c.this;
            z zVar = cVar.f10048f1;
            ImageView imageView = cVar.f10082y;
            View view3 = cVar.D;
            View view4 = cVar.C;
            View view5 = cVar.B;
            kc.f fVar = cVar.f10037a;
            if (zVar == null) {
                return;
            }
            fVar.g();
            if (cVar.f10064n == view2) {
                if (zVar.isCommandAvailable(9)) {
                    zVar.seekToNext();
                    return;
                }
                return;
            }
            if (cVar.f10062m == view2) {
                if (zVar.isCommandAvailable(7)) {
                    zVar.seekToPrevious();
                    return;
                }
                return;
            }
            if (cVar.f10068p == view2) {
                if (zVar.getPlaybackState() == 4 || !zVar.isCommandAvailable(12)) {
                    return;
                }
                zVar.seekForward();
                return;
            }
            if (cVar.f10070q == view2) {
                if (zVar.isCommandAvailable(11)) {
                    zVar.seekBack();
                    return;
                }
                return;
            }
            if (cVar.f10066o == view2) {
                if (fa.z.W(zVar, cVar.f10059k1)) {
                    fa.z.E(zVar);
                    return;
                } else {
                    if (zVar.isCommandAvailable(1)) {
                        zVar.pause();
                        return;
                    }
                    return;
                }
            }
            if (cVar.f10078v == view2) {
                if (zVar.isCommandAvailable(15)) {
                    int repeatMode = zVar.getRepeatMode();
                    int i14 = cVar.f10069p1;
                    for (int i15 = 1; i15 <= 2; i15++) {
                        int i16 = (repeatMode + i15) % 3;
                        if (i16 != 0) {
                            if (i16 != 1) {
                                if (i16 != 2 || (i14 & 2) == 0) {
                                }
                            } else if ((i14 & 1) == 0) {
                            }
                        }
                        repeatMode = i16;
                    }
                    zVar.setRepeatMode(repeatMode);
                    return;
                }
                return;
            }
            if (cVar.f10080w == view2) {
                if (zVar.isCommandAvailable(14)) {
                    zVar.setShuffleModeEnabled(!zVar.getShuffleModeEnabled());
                    return;
                }
                return;
            }
            if (view5 == view2) {
                fVar.f();
                cVar.d(cVar.f10047f, view5);
                return;
            }
            if (view4 == view2) {
                fVar.f();
                cVar.d(cVar.f10049g, view4);
            } else if (view3 == view2) {
                fVar.f();
                cVar.d(cVar.f10053i, view3);
            } else if (imageView == view2) {
                fVar.f();
                cVar.d(cVar.f10051h, imageView);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            c cVar = c.this;
            if (cVar.f10079v1) {
                cVar.f10037a.g();
            }
        }

        @Override // androidx.media3.common.z.d
        public final void r8(z.c cVar) {
            boolean zA = cVar.a(4, 5, 13);
            c cVar2 = c.this;
            if (zA) {
                float[] fArr = c.f10036w1;
                cVar2.m();
            }
            if (cVar.a(4, 5, 7, 13)) {
                float[] fArr2 = c.f10036w1;
                cVar2.o();
            }
            if (cVar.a(8, 13)) {
                float[] fArr3 = c.f10036w1;
                cVar2.p();
            }
            if (cVar.a(9, 13)) {
                float[] fArr4 = c.f10036w1;
                cVar2.r();
            }
            if (cVar.a(8, 9, 11, 0, 16, 17, 13)) {
                float[] fArr5 = c.f10036w1;
                cVar2.l();
            }
            if (cVar.a(11, 0, 13)) {
                float[] fArr6 = c.f10036w1;
                cVar2.s();
            }
            if (cVar.a(12, 13)) {
                float[] fArr7 = c.f10036w1;
                cVar2.n();
            }
            if (cVar.a(2, 13)) {
                float[] fArr8 = c.f10036w1;
                cVar2.t();
            }
        }
    }

    @Deprecated
    public interface d {
    }

    public final class e extends RecyclerView.h<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[] f10086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float[] f10087b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f10088c;

        public e(String[] strArr, float[] fArr) {
            this.f10086a = strArr;
            this.f10087b = fArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final int getItemCount() {
            return this.f10086a.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
            i iVar = (i) f0Var;
            String[] strArr = this.f10086a;
            if (i14 < strArr.length) {
                iVar.f10098a.setText(strArr[i14]);
            }
            if (i14 == this.f10088c) {
                iVar.itemView.setSelected(true);
                iVar.f10099b.setVisibility(0);
            } else {
                iVar.itemView.setSelected(false);
                iVar.f10099b.setVisibility(4);
            }
            iVar.itemView.setOnClickListener(new b0(this, i14, 11));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
            return new i(LayoutInflater.from(c.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    public interface f {
    }

    public final class g extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f10090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f10091b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f10092c;

        public g(View view2) {
            super(view2);
            if (fa.z.f70071a < 26) {
                view2.setFocusable(true);
            }
            this.f10090a = (TextView) view2.findViewById(R.id.exo_main_text);
            this.f10091b = (TextView) view2.findViewById(R.id.exo_sub_text);
            this.f10092c = (ImageView) view2.findViewById(R.id.exo_icon);
            view2.setOnClickListener(new js0.d(this, 6));
        }
    }

    public class h extends RecyclerView.h<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[] f10094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f10095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Drawable[] f10096c;

        public h(String[] strArr, Drawable[] drawableArr) {
            this.f10094a = strArr;
            this.f10095b = new String[strArr.length];
            this.f10096c = drawableArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final int getItemCount() {
            return this.f10094a.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final long getItemId(int i14) {
            return i14;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
            g gVar = (g) f0Var;
            if (r(i14)) {
                gVar.itemView.setLayoutParams(new RecyclerView.q(-1, -2));
            } else {
                gVar.itemView.setLayoutParams(new RecyclerView.q(0, 0));
            }
            gVar.f10090a.setText(this.f10094a[i14]);
            String str = this.f10095b[i14];
            TextView textView = gVar.f10091b;
            if (str == null) {
                textView.setVisibility(8);
            } else {
                textView.setText(str);
            }
            Drawable drawable = this.f10096c[i14];
            ImageView imageView = gVar.f10092c;
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setImageDrawable(drawable);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
            c cVar = c.this;
            return cVar.new g(LayoutInflater.from(cVar.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
        }

        public final boolean r(int i14) {
            c cVar = c.this;
            z zVar = cVar.f10048f1;
            if (zVar == null) {
                return false;
            }
            if (i14 == 0) {
                return zVar.isCommandAvailable(13);
            }
            if (i14 != 1) {
                return true;
            }
            return zVar.isCommandAvailable(30) && cVar.f10048f1.isCommandAvailable(29);
        }
    }

    public static class i extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f10098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f10099b;

        public i(View view2) {
            super(view2);
            if (fa.z.f70071a < 26) {
                view2.setFocusable(true);
            }
            this.f10098a = (TextView) view2.findViewById(R.id.exo_text);
            this.f10099b = view2.findViewById(R.id.exo_check);
        }
    }

    public final class j extends l {
        private j() {
            super();
        }

        public final void init(List<k> list) {
            boolean z14 = false;
            for (int i14 = 0; i14 < list.size(); i14++) {
                k kVar = list.get(i14);
                if (kVar.f10101a.f8307e[kVar.f10102b]) {
                    z14 = true;
                    break;
                }
            }
            c cVar = c.this;
            ImageView imageView = cVar.f10082y;
            if (imageView != null) {
                imageView.setImageDrawable(z14 ? cVar.X0 : cVar.Y0);
                cVar.f10082y.setContentDescription(z14 ? cVar.Z0 : cVar.f10038a1);
            }
            this.f10104a = list;
        }

        @Override // androidx.media3.ui.c.l
        public final void onTrackSelection(String str) {
        }

        @Override // androidx.media3.ui.c.l, androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final void onBindViewHolder(i iVar, int i14) {
            super.onBindViewHolder(iVar, i14);
            if (i14 > 0) {
                k kVar = this.f10104a.get(i14 - 1);
                iVar.f10099b.setVisibility(kVar.f10101a.f8307e[kVar.f10102b] ? 0 : 4);
            }
        }

        @Override // androidx.media3.ui.c.l
        public final void t(i iVar) {
            boolean z14;
            iVar.f10098a.setText(R.string.exo_track_selection_none);
            int i14 = 0;
            while (true) {
                if (i14 >= this.f10104a.size()) {
                    z14 = true;
                    break;
                }
                k kVar = this.f10104a.get(i14);
                if (kVar.f10101a.f8307e[kVar.f10102b]) {
                    z14 = false;
                    break;
                }
                i14++;
            }
            iVar.f10099b.setVisibility(z14 ? 0 : 4);
            iVar.itemView.setOnClickListener(new js0.d(this, 7));
        }
    }

    public static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h0.a f10101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10102b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f10103c;

        public k(h0 h0Var, int i14, int i15, String str) {
            this.f10101a = h0Var.f8302a.get(i14);
            this.f10102b = i15;
            this.f10103c = str;
        }
    }

    public abstract class l extends RecyclerView.h<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<k> f10104a = new ArrayList();

        public l() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final int getItemCount() {
            if (this.f10104a.isEmpty()) {
                return 0;
            }
            return this.f10104a.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
            return new i(LayoutInflater.from(c.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }

        public abstract void onTrackSelection(String str);

        /* JADX WARN: Code duplicated, block: B:13:0x0034  */
        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: r */
        public void onBindViewHolder(i iVar, int i14) {
            boolean z14;
            z zVar = c.this.f10048f1;
            if (zVar == null) {
                return;
            }
            if (i14 == 0) {
                t(iVar);
                return;
            }
            k kVar = this.f10104a.get(i14 - 1);
            e0 e0Var = kVar.f10101a.f8304b;
            if (zVar.getTrackSelectionParameters().A.get(e0Var) != null) {
                z14 = kVar.f10101a.f8307e[kVar.f10102b];
            }
            iVar.f10098a.setText(kVar.f10103c);
            iVar.f10099b.setVisibility(z14 ? 0 : 4);
            iVar.itemView.setOnClickListener(new ew2.c(this, zVar, e0Var, kVar, 10));
        }

        public abstract void t(i iVar);
    }

    @Deprecated
    public interface m {
        void onVisibilityChange(int i14);
    }

    static {
        u.a("media3.ui");
        f10036w1 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public c(Context context, AttributeSet attributeSet, int i14, AttributeSet attributeSet2) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z24;
        int i30;
        int i34;
        boolean z25;
        int i35;
        TextView textView;
        ViewOnClickListenerC0133c viewOnClickListenerC0133c;
        boolean z26;
        super(context, attributeSet, i14);
        this.f10059k1 = true;
        this.f10065n1 = 5000;
        this.f10069p1 = 0;
        this.f10067o1 = 200;
        int resourceId = R.layout.exo_player_control_view;
        int resourceId2 = R.drawable.exo_styled_controls_play;
        int resourceId3 = R.drawable.exo_styled_controls_pause;
        int resourceId4 = R.drawable.exo_styled_controls_next;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, kc.h.f103894c, i14, 0);
            try {
                resourceId = typedArrayObtainStyledAttributes.getResourceId(6, R.layout.exo_player_control_view);
                resourceId2 = typedArrayObtainStyledAttributes.getResourceId(12, R.drawable.exo_styled_controls_play);
                resourceId3 = typedArrayObtainStyledAttributes.getResourceId(11, R.drawable.exo_styled_controls_pause);
                resourceId4 = typedArrayObtainStyledAttributes.getResourceId(10, R.drawable.exo_styled_controls_next);
                int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(7, R.drawable.exo_styled_controls_simple_fastforward);
                int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(15, R.drawable.exo_styled_controls_previous);
                int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(20, R.drawable.exo_styled_controls_simple_rewind);
                int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(9, R.drawable.exo_styled_controls_fullscreen_exit);
                int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(8, R.drawable.exo_styled_controls_fullscreen_enter);
                int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(17, R.drawable.exo_styled_controls_repeat_off);
                int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(18, R.drawable.exo_styled_controls_repeat_one);
                int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(16, R.drawable.exo_styled_controls_repeat_all);
                int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(35, R.drawable.exo_styled_controls_shuffle_on);
                int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(34, R.drawable.exo_styled_controls_shuffle_off);
                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(37, R.drawable.exo_styled_controls_subtitle_on);
                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(36, R.drawable.exo_styled_controls_subtitle_off);
                int resourceId17 = typedArrayObtainStyledAttributes.getResourceId(41, R.drawable.exo_styled_controls_vr);
                this.f10065n1 = typedArrayObtainStyledAttributes.getInt(32, this.f10065n1);
                this.f10069p1 = typedArrayObtainStyledAttributes.getInt(19, this.f10069p1);
                z16 = typedArrayObtainStyledAttributes.getBoolean(29, true);
                z17 = typedArrayObtainStyledAttributes.getBoolean(26, true);
                z18 = typedArrayObtainStyledAttributes.getBoolean(28, true);
                z19 = typedArrayObtainStyledAttributes.getBoolean(27, true);
                boolean z27 = typedArrayObtainStyledAttributes.getBoolean(30, false);
                boolean z28 = typedArrayObtainStyledAttributes.getBoolean(31, false);
                z24 = typedArrayObtainStyledAttributes.getBoolean(33, false);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(38, this.f10067o1));
                z25 = typedArrayObtainStyledAttributes.getBoolean(2, true);
                typedArrayObtainStyledAttributes.recycle();
                i25 = resourceId10;
                z14 = z27;
                i16 = resourceId5;
                i17 = resourceId6;
                i18 = resourceId7;
                i19 = resourceId8;
                i24 = resourceId9;
                i15 = resourceId11;
                i26 = resourceId13;
                i27 = resourceId14;
                i28 = resourceId15;
                i29 = resourceId16;
                i34 = resourceId17;
                i30 = resourceId12;
                z15 = z28;
            } catch (Throwable th3) {
                typedArrayObtainStyledAttributes.recycle();
                throw th3;
            }
        } else {
            i15 = R.drawable.exo_styled_controls_repeat_one;
            i16 = R.drawable.exo_styled_controls_simple_fastforward;
            i17 = R.drawable.exo_styled_controls_previous;
            i18 = R.drawable.exo_styled_controls_simple_rewind;
            i19 = R.drawable.exo_styled_controls_fullscreen_exit;
            i24 = R.drawable.exo_styled_controls_fullscreen_enter;
            i25 = R.drawable.exo_styled_controls_repeat_off;
            i26 = R.drawable.exo_styled_controls_shuffle_on;
            i27 = R.drawable.exo_styled_controls_shuffle_off;
            i28 = R.drawable.exo_styled_controls_subtitle_on;
            i29 = R.drawable.exo_styled_controls_subtitle_off;
            z14 = false;
            z15 = false;
            z16 = true;
            z17 = true;
            z18 = true;
            z19 = true;
            z24 = false;
            i30 = R.drawable.exo_styled_controls_repeat_all;
            i34 = R.drawable.exo_styled_controls_vr;
            z25 = true;
        }
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE);
        ViewOnClickListenerC0133c viewOnClickListenerC0133c2 = new ViewOnClickListenerC0133c();
        this.f10041c = viewOnClickListenerC0133c2;
        this.f10043d = new CopyOnWriteArrayList<>();
        this.f10058k0 = new d0.b();
        this.H0 = new d0.c();
        StringBuilder sb3 = new StringBuilder();
        this.P = sb3;
        int i36 = resourceId2;
        int i37 = resourceId3;
        this.T = new Formatter(sb3, Locale.getDefault());
        this.f10071q1 = new long[0];
        this.f10073r1 = new boolean[0];
        this.f10074s1 = new long[0];
        this.f10076t1 = new boolean[0];
        this.I0 = new n(this, 3);
        this.E = (TextView) findViewById(R.id.exo_duration);
        this.F = (TextView) findViewById(R.id.exo_position);
        ImageView imageView = (ImageView) findViewById(R.id.exo_subtitle);
        this.f10082y = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(viewOnClickListenerC0133c2);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.f10083z = imageView2;
        js0.d dVar = new js0.d(this, 4);
        if (imageView2 != null) {
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(dVar);
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.A = imageView3;
        js0.d dVar2 = new js0.d(this, 4);
        if (imageView3 != null) {
            imageView3.setVisibility(8);
            imageView3.setOnClickListener(dVar2);
        }
        View viewFindViewById = findViewById(R.id.exo_settings);
        this.B = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(viewOnClickListenerC0133c2);
        }
        View viewFindViewById2 = findViewById(R.id.exo_playback_speed);
        this.C = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(viewOnClickListenerC0133c2);
        }
        View viewFindViewById3 = findViewById(R.id.exo_audio_track);
        this.D = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(viewOnClickListenerC0133c2);
        }
        androidx.media3.ui.e eVar = (androidx.media3.ui.e) findViewById(R.id.exo_progress);
        View viewFindViewById4 = findViewById(R.id.exo_progress_placeholder);
        if (eVar != null) {
            this.I = eVar;
            i35 = resourceId4;
            textView = null;
            viewOnClickListenerC0133c = viewOnClickListenerC0133c2;
        } else if (viewFindViewById4 != null) {
            i35 = resourceId4;
            viewOnClickListenerC0133c = viewOnClickListenerC0133c2;
            textView = null;
            androidx.media3.ui.b bVar = new androidx.media3.ui.b(context, null, 0, attributeSet2, R.style.ExoStyledControls_TimeBar);
            bVar.setId(R.id.exo_progress);
            bVar.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(bVar, iIndexOfChild);
            this.I = bVar;
        } else {
            i35 = resourceId4;
            textView = null;
            viewOnClickListenerC0133c = viewOnClickListenerC0133c2;
            this.I = null;
        }
        androidx.media3.ui.e eVar2 = this.I;
        if (eVar2 != null) {
            eVar2.a(viewOnClickListenerC0133c);
        }
        Resources resources = context.getResources();
        this.f10039b = resources;
        ImageView imageView4 = (ImageView) findViewById(R.id.exo_play_pause);
        this.f10066o = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(viewOnClickListenerC0133c);
        }
        ImageView imageView5 = (ImageView) findViewById(R.id.exo_prev);
        this.f10062m = imageView5;
        if (imageView5 != null) {
            imageView5.setImageDrawable(resources.getDrawable(i17, context.getTheme()));
            imageView5.setOnClickListener(viewOnClickListenerC0133c);
        }
        ImageView imageView6 = (ImageView) findViewById(R.id.exo_next);
        this.f10064n = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(resources.getDrawable(i35, context.getTheme()));
            imageView6.setOnClickListener(viewOnClickListenerC0133c);
        }
        Typeface typefaceA = b7.g.a(R.font.roboto_medium_numbers, context);
        ImageView imageView7 = (ImageView) findViewById(R.id.exo_rew);
        TextView textView2 = (TextView) findViewById(R.id.exo_rew_with_amount);
        if (imageView7 != null) {
            imageView7.setImageDrawable(resources.getDrawable(i18, context.getTheme()));
            this.f10070q = imageView7;
            this.f10075t = textView;
        } else if (textView2 != null) {
            textView2.setTypeface(typefaceA);
            this.f10075t = textView2;
            this.f10070q = textView2;
        } else {
            this.f10075t = textView;
            this.f10070q = textView;
        }
        View view2 = this.f10070q;
        if (view2 != null) {
            view2.setOnClickListener(viewOnClickListenerC0133c);
        }
        ImageView imageView8 = (ImageView) findViewById(R.id.exo_ffwd);
        TextView textView3 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
        if (imageView8 != null) {
            imageView8.setImageDrawable(resources.getDrawable(i16, context.getTheme()));
            this.f10068p = imageView8;
            this.f10072r = textView;
        } else if (textView3 != null) {
            textView3.setTypeface(typefaceA);
            this.f10072r = textView3;
            this.f10068p = textView3;
        } else {
            this.f10072r = textView;
            this.f10068p = textView;
        }
        View view3 = this.f10068p;
        if (view3 != null) {
            view3.setOnClickListener(viewOnClickListenerC0133c);
        }
        ImageView imageView9 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.f10078v = imageView9;
        if (imageView9 != null) {
            imageView9.setOnClickListener(viewOnClickListenerC0133c);
        }
        ImageView imageView10 = (ImageView) findViewById(R.id.exo_shuffle);
        this.f10080w = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(viewOnClickListenerC0133c);
        }
        this.T0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.U0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        ImageView imageView11 = (ImageView) findViewById(R.id.exo_vr);
        this.f10081x = imageView11;
        if (imageView11 != null) {
            imageView11.setImageDrawable(resources.getDrawable(i34, context.getTheme()));
            j(false, imageView11);
        }
        kc.f fVar = new kc.f(this);
        this.f10037a = fVar;
        fVar.C = z25;
        h hVar = new h(new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(R.drawable.exo_styled_controls_speed, context.getTheme()), resources.getDrawable(R.drawable.exo_styled_controls_audiotrack, context.getTheme())});
        this.f10047f = hVar;
        this.f10060l = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.f10045e = recyclerView;
        recyclerView.setAdapter(hVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.f10057k = popupWindow;
        if (fa.z.f70071a < 23) {
            z26 = false;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            z26 = false;
        }
        popupWindow.setOnDismissListener(viewOnClickListenerC0133c);
        this.f10079v1 = true;
        this.f10055j = new kc.b(getResources());
        this.X0 = resources.getDrawable(i28, context.getTheme());
        this.Y0 = resources.getDrawable(i29, context.getTheme());
        this.Z0 = resources.getString(R.string.exo_controls_cc_enabled_description);
        this.f10038a1 = resources.getString(R.string.exo_controls_cc_disabled_description);
        this.f10051h = new j();
        this.f10053i = new b();
        this.f10049g = new e(resources.getStringArray(R.array.exo_controls_playback_speeds), f10036w1);
        this.J0 = resources.getDrawable(i36, context.getTheme());
        this.K0 = resources.getDrawable(i37, context.getTheme());
        this.f10040b1 = resources.getDrawable(i19, context.getTheme());
        this.f10042c1 = resources.getDrawable(i24, context.getTheme());
        this.L0 = resources.getDrawable(i25, context.getTheme());
        this.M0 = resources.getDrawable(i15, context.getTheme());
        this.N0 = resources.getDrawable(i30, context.getTheme());
        this.R0 = resources.getDrawable(i26, context.getTheme());
        this.S0 = resources.getDrawable(i27, context.getTheme());
        this.f10044d1 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
        this.f10046e1 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
        this.O0 = resources.getString(R.string.exo_controls_repeat_off_description);
        this.P0 = resources.getString(R.string.exo_controls_repeat_one_description);
        this.Q0 = resources.getString(R.string.exo_controls_repeat_all_description);
        this.V0 = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.W0 = resources.getString(R.string.exo_controls_shuffle_off_description);
        fVar.h((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        fVar.h(this.f10068p, z17);
        fVar.h(this.f10070q, z16);
        fVar.h(imageView5, z18);
        fVar.h(imageView6, z19);
        fVar.h(imageView10, z14);
        fVar.h(imageView, z15);
        fVar.h(imageView11, z24);
        fVar.h(imageView9, this.f10069p1 != 0 ? true : z26);
        addOnLayoutChangeListener(new com.google.android.material.carousel.a(this, 4));
    }

    public static boolean b(z zVar, d0.c cVar) {
        d0 currentTimeline;
        int iO;
        if (!zVar.isCommandAvailable(17) || (iO = (currentTimeline = zVar.getCurrentTimeline()).o()) <= 1 || iO > 100) {
            return false;
        }
        for (int i14 = 0; i14 < iO; i14++) {
            if (currentTimeline.m(i14, cVar, 0L).f8208m == C.TIME_UNSET) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f14) {
        z zVar = this.f10048f1;
        if (zVar == null || !zVar.isCommandAvailable(13)) {
            return;
        }
        z zVar2 = this.f10048f1;
        zVar2.b(new y(f14, zVar2.getPlaybackParameters().f8585b));
    }

    public final boolean c(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        z zVar = this.f10048f1;
        if (zVar == null) {
            return false;
        }
        if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                if (zVar.getPlaybackState() != 4 && zVar.isCommandAvailable(12)) {
                    zVar.seekForward();
                }
            } else if (keyCode == 89 && zVar.isCommandAvailable(11)) {
                zVar.seekBack();
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 79 || keyCode == 85) {
                    if (fa.z.W(zVar, this.f10059k1)) {
                        fa.z.E(zVar);
                    } else if (zVar.isCommandAvailable(1)) {
                        zVar.pause();
                    }
                } else if (keyCode != 87) {
                    if (keyCode != 88) {
                        if (keyCode == 126) {
                            fa.z.E(zVar);
                        } else if (keyCode == 127) {
                            int i14 = fa.z.f70071a;
                            if (zVar.isCommandAvailable(1)) {
                                zVar.pause();
                            }
                        }
                    } else if (zVar.isCommandAvailable(7)) {
                        zVar.seekToPrevious();
                    }
                } else if (zVar.isCommandAvailable(9)) {
                    zVar.seekToNext();
                }
            }
        }
        return true;
    }

    public final void d(RecyclerView.h<?> hVar, View view2) {
        this.f10045e.setAdapter(hVar);
        q();
        this.f10079v1 = false;
        PopupWindow popupWindow = this.f10057k;
        popupWindow.dismiss();
        this.f10079v1 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i14 = this.f10060l;
        popupWindow.showAsDropDown(view2, width - i14, (-popupWindow.getHeight()) - i14);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return c(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final ImmutableList<k> e(h0 h0Var, int i14) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        ImmutableList<h0.a> immutableList = h0Var.f8302a;
        for (int i15 = 0; i15 < immutableList.size(); i15++) {
            h0.a aVar = immutableList.get(i15);
            if (aVar.f8304b.f8216c == i14) {
                for (int i16 = 0; i16 < aVar.f8303a; i16++) {
                    if (aVar.a(i16)) {
                        q qVar = aVar.f8304b.f8217d[i16];
                        if ((qVar.f8377e & 2) == 0) {
                            builder.add(new k(h0Var, i15, i16, this.f10055j.a(qVar)));
                        }
                    }
                }
            }
        }
        return builder.build();
    }

    public final void f() {
        kc.f fVar = this.f10037a;
        int i14 = fVar.f103878z;
        if (i14 == 3 || i14 == 2) {
            return;
        }
        fVar.f();
        if (!fVar.C) {
            fVar.i(2);
        } else if (fVar.f103878z == 1) {
            fVar.f103865m.start();
        } else {
            fVar.f103866n.start();
        }
    }

    public final boolean g() {
        kc.f fVar = this.f10037a;
        return fVar.f103878z == 0 && fVar.f103853a.h();
    }

    public z getPlayer() {
        return this.f10048f1;
    }

    public int getRepeatToggleModes() {
        return this.f10069p1;
    }

    public boolean getShowShuffleButton() {
        return this.f10037a.b(this.f10080w);
    }

    public boolean getShowSubtitleButton() {
        return this.f10037a.b(this.f10082y);
    }

    public int getShowTimeoutMs() {
        return this.f10065n1;
    }

    public boolean getShowVrButton() {
        return this.f10037a.b(this.f10081x);
    }

    public final boolean h() {
        return getVisibility() == 0;
    }

    public final void i() {
        m();
        l();
        p();
        r();
        t();
        n();
        s();
    }

    public final void j(boolean z14, View view2) {
        if (view2 == null) {
            return;
        }
        view2.setEnabled(z14);
        view2.setAlpha(z14 ? this.T0 : this.U0);
    }

    public final void k(boolean z14) {
        if (this.f10052h1 == z14) {
            return;
        }
        this.f10052h1 = z14;
        String str = this.f10046e1;
        Drawable drawable = this.f10042c1;
        String str2 = this.f10044d1;
        Drawable drawable2 = this.f10040b1;
        ImageView imageView = this.f10083z;
        if (imageView != null) {
            if (z14) {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            } else {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            }
        }
        ImageView imageView2 = this.A;
        if (imageView2 != null) {
            if (z14) {
                imageView2.setImageDrawable(drawable2);
                imageView2.setContentDescription(str2);
            } else {
                imageView2.setImageDrawable(drawable);
                imageView2.setContentDescription(str);
            }
        }
        d dVar = this.f10050g1;
        if (dVar != null) {
            PlayerView.this.getClass();
        }
    }

    public final void l() {
        boolean zIsCommandAvailable;
        boolean zIsCommandAvailable2;
        boolean zIsCommandAvailable3;
        boolean zIsCommandAvailable4;
        boolean zIsCommandAvailable5;
        if (h() && this.f10054i1) {
            z zVar = this.f10048f1;
            if (zVar != null) {
                zIsCommandAvailable = (this.f10056j1 && b(zVar, this.H0)) ? zVar.isCommandAvailable(10) : zVar.isCommandAvailable(5);
                zIsCommandAvailable3 = zVar.isCommandAvailable(7);
                zIsCommandAvailable4 = zVar.isCommandAvailable(11);
                zIsCommandAvailable5 = zVar.isCommandAvailable(12);
                zIsCommandAvailable2 = zVar.isCommandAvailable(9);
            } else {
                zIsCommandAvailable = false;
                zIsCommandAvailable2 = false;
                zIsCommandAvailable3 = false;
                zIsCommandAvailable4 = false;
                zIsCommandAvailable5 = false;
            }
            Resources resources = this.f10039b;
            View view2 = this.f10070q;
            if (zIsCommandAvailable4) {
                z zVar2 = this.f10048f1;
                int seekBackIncrement = (int) ((zVar2 != null ? zVar2.getSeekBackIncrement() : 5000L) / 1000);
                TextView textView = this.f10075t;
                if (textView != null) {
                    textView.setText(String.valueOf(seekBackIncrement));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, seekBackIncrement, Integer.valueOf(seekBackIncrement)));
                }
            }
            View view3 = this.f10068p;
            if (zIsCommandAvailable5) {
                z zVar3 = this.f10048f1;
                int seekForwardIncrement = (int) ((zVar3 != null ? zVar3.getSeekForwardIncrement() : 15000L) / 1000);
                TextView textView2 = this.f10072r;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(seekForwardIncrement));
                }
                if (view3 != null) {
                    view3.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, seekForwardIncrement, Integer.valueOf(seekForwardIncrement)));
                }
            }
            j(zIsCommandAvailable3, this.f10062m);
            j(zIsCommandAvailable4, view2);
            j(zIsCommandAvailable5, view3);
            j(zIsCommandAvailable2, this.f10064n);
            androidx.media3.ui.e eVar = this.I;
            if (eVar != null) {
                eVar.setEnabled(zIsCommandAvailable);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    public final void m() {
        ImageView imageView;
        boolean z14;
        if (h() && this.f10054i1 && (imageView = this.f10066o) != null) {
            boolean zW = fa.z.W(this.f10048f1, this.f10059k1);
            Drawable drawable = zW ? this.J0 : this.K0;
            int i14 = zW ? R.string.exo_controls_play_description : R.string.exo_controls_pause_description;
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(this.f10039b.getString(i14));
            z zVar = this.f10048f1;
            if (zVar != null) {
                z14 = true;
                if (!zVar.isCommandAvailable(1) || (this.f10048f1.isCommandAvailable(17) && this.f10048f1.getCurrentTimeline().p())) {
                    z14 = false;
                }
            } else {
                z14 = false;
            }
            j(z14, imageView);
        }
    }

    public final void n() {
        e eVar;
        z zVar = this.f10048f1;
        if (zVar == null) {
            return;
        }
        float f14 = zVar.getPlaybackParameters().f8584a;
        float f15 = Float.MAX_VALUE;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            eVar = this.f10049g;
            float[] fArr = eVar.f10087b;
            if (i14 >= fArr.length) {
                break;
            }
            float fAbs = Math.abs(f14 - fArr[i14]);
            if (fAbs < f15) {
                i15 = i14;
                f15 = fAbs;
            }
            i14++;
        }
        eVar.f10088c = i15;
        String str = eVar.f10086a[i15];
        h hVar = this.f10047f;
        hVar.f10095b[0] = str;
        j(hVar.r(1) || hVar.r(0), this.B);
    }

    public final void o() {
        long contentPosition;
        long contentBufferedPosition;
        if (h() && this.f10054i1) {
            z zVar = this.f10048f1;
            if (zVar == null || !zVar.isCommandAvailable(16)) {
                contentPosition = 0;
                contentBufferedPosition = 0;
            } else {
                contentPosition = zVar.getContentPosition() + this.f10077u1;
                contentBufferedPosition = zVar.getContentBufferedPosition() + this.f10077u1;
            }
            TextView textView = this.F;
            if (textView != null && !this.f10063m1) {
                textView.setText(fa.z.A(this.P, this.T, contentPosition));
            }
            androidx.media3.ui.e eVar = this.I;
            if (eVar != null) {
                eVar.setPosition(contentPosition);
                eVar.setBufferedPosition(contentBufferedPosition);
            }
            n nVar = this.I0;
            removeCallbacks(nVar);
            int playbackState = zVar == null ? 1 : zVar.getPlaybackState();
            if (zVar != null && zVar.isPlaying()) {
                long jMin = Math.min(eVar != null ? eVar.getPreferredUpdateDelay() : 1000L, 1000 - (contentPosition % 1000));
                float f14 = zVar.getPlaybackParameters().f8584a;
                postDelayed(nVar, fa.z.j(f14 > 0.0f ? (long) (jMin / f14) : 1000L, this.f10067o1, 1000L));
            } else {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(nVar, 1000L);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kc.f fVar = this.f10037a;
        fVar.f103853a.addOnLayoutChangeListener(fVar.f103876x);
        this.f10054i1 = true;
        if (g()) {
            fVar.g();
        }
        i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kc.f fVar = this.f10037a;
        fVar.f103853a.removeOnLayoutChangeListener(fVar.f103876x);
        this.f10054i1 = false;
        removeCallbacks(this.I0);
        fVar.f();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        super.onLayout(z14, i14, i15, i16, i17);
        View view2 = this.f10037a.f103854b;
        if (view2 != null) {
            view2.layout(0, 0, i16 - i14, i17 - i15);
        }
    }

    public final void p() {
        ImageView imageView;
        if (h() && this.f10054i1 && (imageView = this.f10078v) != null) {
            if (this.f10069p1 == 0) {
                j(false, imageView);
                return;
            }
            z zVar = this.f10048f1;
            String str = this.O0;
            Drawable drawable = this.L0;
            if (zVar == null || !zVar.isCommandAvailable(15)) {
                j(false, imageView);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            j(true, imageView);
            int repeatMode = zVar.getRepeatMode();
            if (repeatMode == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (repeatMode == 1) {
                imageView.setImageDrawable(this.M0);
                imageView.setContentDescription(this.P0);
            } else {
                if (repeatMode != 2) {
                    return;
                }
                imageView.setImageDrawable(this.N0);
                imageView.setContentDescription(this.Q0);
            }
        }
    }

    public final void q() {
        RecyclerView recyclerView = this.f10045e;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i14 = this.f10060l;
        int iMin = Math.min(recyclerView.getMeasuredWidth(), width - (i14 * 2));
        PopupWindow popupWindow = this.f10057k;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - (i14 * 2), recyclerView.getMeasuredHeight()));
    }

    public final void r() {
        ImageView imageView;
        if (h() && this.f10054i1 && (imageView = this.f10080w) != null) {
            z zVar = this.f10048f1;
            if (!this.f10037a.b(imageView)) {
                j(false, imageView);
                return;
            }
            String str = this.W0;
            Drawable drawable = this.S0;
            if (zVar == null || !zVar.isCommandAvailable(14)) {
                j(false, imageView);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            j(true, imageView);
            if (zVar.getShuffleModeEnabled()) {
                drawable = this.R0;
            }
            imageView.setImageDrawable(drawable);
            if (zVar.getShuffleModeEnabled()) {
                str = this.V0;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x008f  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00da  */
    /* JADX WARN: Code duplicated, block: B:57:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:75:0x0148  */
    /* JADX WARN: Code duplicated, block: B:93:0x00f3 A[SYNTHETIC] */
    public final void s() {
        long jO;
        int i14;
        long j8;
        long[] jArr;
        androidx.media3.common.b.C0118b c0118bA;
        int i15;
        int i16;
        d0 d0Var;
        boolean z14;
        boolean z15;
        int i17;
        int i18;
        int length;
        z zVar = this.f10048f1;
        if (zVar == null) {
            return;
        }
        boolean z16 = this.f10056j1;
        d0.c cVar = this.H0;
        boolean z17 = false;
        boolean z18 = true;
        this.f10061l1 = z16 && b(zVar, cVar);
        long j14 = 0;
        this.f10077u1 = 0L;
        d0 currentTimeline = zVar.isCommandAvailable(17) ? zVar.getCurrentTimeline() : d0.f8186a;
        boolean zP = currentTimeline.p();
        long j15 = C.TIME_UNSET;
        if (zP) {
            if (zVar.isCommandAvailable(16)) {
                long contentDuration = zVar.getContentDuration();
                if (contentDuration != C.TIME_UNSET) {
                    jO = fa.z.O(contentDuration);
                } else {
                    jO = 0;
                }
            } else {
                jO = 0;
            }
            i14 = 0;
        } else {
            int currentMediaItemIndex = zVar.getCurrentMediaItemIndex();
            boolean z19 = this.f10061l1;
            int i19 = z19 ? 0 : currentMediaItemIndex;
            int iO = z19 ? currentTimeline.o() - 1 : currentMediaItemIndex;
            i14 = 0;
            long j16 = 0;
            while (i19 <= iO) {
                long j17 = j14;
                if (i19 == currentMediaItemIndex) {
                    this.f10077u1 = fa.z.Y(j16);
                }
                currentTimeline.n(i19, cVar);
                if (cVar.f8208m == j15) {
                    fa.a.d(this.f10061l1 ^ z18);
                    break;
                }
                int i24 = cVar.f8209n;
                while (i24 <= cVar.f8210o) {
                    d0.b bVar = this.f10058k0;
                    currentTimeline.f(i24, bVar, z17);
                    long j18 = j15;
                    androidx.media3.common.b bVar2 = bVar.f8193g;
                    int i25 = bVar2.f8159e;
                    int i26 = bVar2.f8156b;
                    while (i25 < i26) {
                        long jD = bVar.d(i25);
                        if (jD == Long.MIN_VALUE) {
                            long j19 = bVar.f8190d;
                            if (j19 == j18) {
                                d0Var = currentTimeline;
                                z14 = true;
                            } else {
                                jD = j19;
                                j8 = jD + bVar.f8191e;
                                if (j8 >= j17) {
                                    jArr = this.f10071q1;
                                    if (i14 == jArr.length) {
                                        if (jArr.length == 0) {
                                            length = 1;
                                        } else {
                                            length = jArr.length * 2;
                                        }
                                        this.f10071q1 = Arrays.copyOf(jArr, length);
                                        this.f10073r1 = Arrays.copyOf(this.f10073r1, length);
                                    }
                                    this.f10071q1[i14] = fa.z.Y(j16 + j8);
                                    boolean[] zArr = this.f10073r1;
                                    c0118bA = bVar.f8193g.a(i25);
                                    i15 = c0118bA.f8162b;
                                    if (i15 != -1) {
                                        i16 = 0;
                                        while (true) {
                                            if (i16 < i15) {
                                                d0Var = currentTimeline;
                                                z14 = true;
                                                z15 = false;
                                                break;
                                            }
                                            i17 = i16;
                                            i18 = c0118bA.f8166f[i17];
                                            d0Var = currentTimeline;
                                            z14 = true;
                                            if (i18 != 0 || i18 == 1) {
                                                z15 = true;
                                                break;
                                            } else {
                                                i16 = i17 + 1;
                                                currentTimeline = d0Var;
                                            }
                                        }
                                    } else {
                                        d0Var = currentTimeline;
                                        z14 = true;
                                        z15 = true;
                                    }
                                    zArr[i14] = !z15;
                                    i14++;
                                } else {
                                    d0Var = currentTimeline;
                                    z14 = true;
                                }
                            }
                        } else {
                            j8 = jD + bVar.f8191e;
                            if (j8 >= j17) {
                                jArr = this.f10071q1;
                                if (i14 == jArr.length) {
                                    if (jArr.length == 0) {
                                        length = 1;
                                    } else {
                                        length = jArr.length * 2;
                                    }
                                    this.f10071q1 = Arrays.copyOf(jArr, length);
                                    this.f10073r1 = Arrays.copyOf(this.f10073r1, length);
                                }
                                this.f10071q1[i14] = fa.z.Y(j16 + j8);
                                boolean[] zArr2 = this.f10073r1;
                                c0118bA = bVar.f8193g.a(i25);
                                i15 = c0118bA.f8162b;
                                if (i15 != -1) {
                                    d0Var = currentTimeline;
                                    z14 = true;
                                    z15 = true;
                                } else {
                                    i16 = 0;
                                    while (true) {
                                        if (i16 < i15) {
                                            d0Var = currentTimeline;
                                            z14 = true;
                                            z15 = false;
                                            break;
                                        } else {
                                            i17 = i16;
                                            i18 = c0118bA.f8166f[i17];
                                            d0Var = currentTimeline;
                                            z14 = true;
                                            if (i18 != 0) {
                                            }
                                            z15 = true;
                                            break;
                                        }
                                        i16 = i17 + 1;
                                        currentTimeline = d0Var;
                                    }
                                }
                                zArr2[i14] = !z15;
                                i14++;
                            } else {
                                d0Var = currentTimeline;
                                z14 = true;
                            }
                        }
                        i25++;
                        z18 = z14;
                        currentMediaItemIndex = currentMediaItemIndex;
                        currentTimeline = d0Var;
                        j17 = 0;
                    }
                    i24++;
                    j15 = j18;
                    currentTimeline = currentTimeline;
                    z17 = false;
                    j17 = 0;
                }
                j16 += cVar.f8208m;
                i19++;
                z18 = z18;
                currentTimeline = currentTimeline;
                z17 = false;
                j14 = 0;
            }
            jO = j16;
        }
        long jY = fa.z.Y(jO);
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(fa.z.A(this.P, this.T, jY));
        }
        androidx.media3.ui.e eVar = this.I;
        if (eVar != null) {
            eVar.setDuration(jY);
            long[] jArr2 = this.f10074s1;
            int length2 = jArr2.length;
            int i27 = i14 + length2;
            long[] jArr3 = this.f10071q1;
            if (i27 > jArr3.length) {
                this.f10071q1 = Arrays.copyOf(jArr3, i27);
                this.f10073r1 = Arrays.copyOf(this.f10073r1, i27);
            }
            System.arraycopy(jArr2, 0, this.f10071q1, i14, length2);
            System.arraycopy(this.f10076t1, 0, this.f10073r1, i14, length2);
            eVar.setAdGroupTimesMs(this.f10071q1, this.f10073r1, i27);
        }
        o();
    }

    public void setAnimationEnabled(boolean z14) {
        this.f10037a.C = z14;
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(d dVar) {
        this.f10050g1 = dVar;
        boolean z14 = dVar != null;
        ImageView imageView = this.f10083z;
        if (imageView != null) {
            if (z14) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z15 = dVar != null;
        ImageView imageView2 = this.A;
        if (imageView2 == null) {
            return;
        }
        if (z15) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    public void setPlayer(z zVar) {
        fa.a.d(Looper.myLooper() == Looper.getMainLooper());
        fa.a.a(zVar == null || zVar.getApplicationLooper() == Looper.getMainLooper());
        z zVar2 = this.f10048f1;
        if (zVar2 == zVar) {
            return;
        }
        ViewOnClickListenerC0133c viewOnClickListenerC0133c = this.f10041c;
        if (zVar2 != null) {
            zVar2.d(viewOnClickListenerC0133c);
        }
        this.f10048f1 = zVar;
        if (zVar != null) {
            zVar.e(viewOnClickListenerC0133c);
        }
        i();
    }

    public void setProgressUpdateListener(f fVar) {
    }

    public void setRepeatToggleModes(int i14) {
        this.f10069p1 = i14;
        z zVar = this.f10048f1;
        if (zVar != null && zVar.isCommandAvailable(15)) {
            int repeatMode = this.f10048f1.getRepeatMode();
            if (i14 == 0 && repeatMode != 0) {
                this.f10048f1.setRepeatMode(0);
            } else if (i14 == 1 && repeatMode == 2) {
                this.f10048f1.setRepeatMode(1);
            } else if (i14 == 2 && repeatMode == 1) {
                this.f10048f1.setRepeatMode(2);
            }
        }
        this.f10037a.h(this.f10078v, i14 != 0);
        p();
    }

    public void setShowFastForwardButton(boolean z14) {
        this.f10037a.h(this.f10068p, z14);
        l();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z14) {
        this.f10056j1 = z14;
        s();
    }

    public void setShowNextButton(boolean z14) {
        this.f10037a.h(this.f10064n, z14);
        l();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z14) {
        this.f10059k1 = z14;
        m();
    }

    public void setShowPreviousButton(boolean z14) {
        this.f10037a.h(this.f10062m, z14);
        l();
    }

    public void setShowRewindButton(boolean z14) {
        this.f10037a.h(this.f10070q, z14);
        l();
    }

    public void setShowShuffleButton(boolean z14) {
        this.f10037a.h(this.f10080w, z14);
        r();
    }

    public void setShowSubtitleButton(boolean z14) {
        this.f10037a.h(this.f10082y, z14);
    }

    public void setShowTimeoutMs(int i14) {
        this.f10065n1 = i14;
        if (g()) {
            this.f10037a.g();
        }
    }

    public void setShowVrButton(boolean z14) {
        this.f10037a.h(this.f10081x, z14);
    }

    public void setTimeBarMinUpdateInterval(int i14) {
        this.f10067o1 = fa.z.i(i14, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.f10081x;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            j(onClickListener != null, imageView);
        }
    }

    public final void t() {
        j jVar = this.f10051h;
        jVar.getClass();
        List<k> list = Collections.EMPTY_LIST;
        jVar.f10104a = list;
        b bVar = this.f10053i;
        bVar.getClass();
        bVar.f10104a = list;
        z zVar = this.f10048f1;
        ImageView imageView = this.f10082y;
        if (zVar != null && zVar.isCommandAvailable(30) && this.f10048f1.isCommandAvailable(29)) {
            h0 h0VarG = this.f10048f1.g();
            ImmutableList<k> immutableListE = e(h0VarG, 1);
            bVar.f10104a = immutableListE;
            c cVar = c.this;
            z zVar2 = cVar.f10048f1;
            h hVar = cVar.f10047f;
            zVar2.getClass();
            g0 trackSelectionParameters = zVar2.getTrackSelectionParameters();
            if (immutableListE.isEmpty()) {
                hVar.f10095b[1] = cVar.getResources().getString(R.string.exo_track_selection_none);
            } else if (bVar.u(trackSelectionParameters)) {
                for (int i14 = 0; i14 < immutableListE.size(); i14++) {
                    k kVar = immutableListE.get(i14);
                    if (kVar.f10101a.f8307e[kVar.f10102b]) {
                        hVar.f10095b[1] = kVar.f10103c;
                        break;
                    }
                }
            } else {
                hVar.f10095b[1] = cVar.getResources().getString(R.string.exo_track_selection_auto);
            }
            if (this.f10037a.b(imageView)) {
                jVar.init(e(h0VarG, 3));
            } else {
                jVar.init(ImmutableList.of());
            }
        }
        j(jVar.getItemCount() > 0, imageView);
        h hVar2 = this.f10047f;
        j(hVar2.r(1) || hVar2.r(0), this.B);
    }

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public c(Context context, AttributeSet attributeSet, int i14) {
        this(context, attributeSet, i14, attributeSet);
    }

    public c(Context context) {
        this(context, null);
    }
}
