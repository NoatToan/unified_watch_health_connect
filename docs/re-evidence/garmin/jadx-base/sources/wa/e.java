package wa;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.common.d0;
import androidx.media3.common.e0;
import androidx.media3.common.f0;
import androidx.media3.common.g0;
import androidx.media3.common.p;
import androidx.media3.common.q;
import androidx.media3.exoplayer.u0;
import androidx.media3.exoplayer.v0;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.base.Predicate;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import fa.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import o62.b0;
import sa.r;
import vn2.t0;

/* JADX INFO: loaded from: classes.dex */
public class e extends wa.i implements u0.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Ordering<Integer> f183652k = Ordering.from(new tl2.g(3));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f183653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f183654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wa.g.b f183655f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f183656g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C3405e f183657h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g f183658i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public androidx.media3.common.d f183659j;

    public static final class b extends i<b> implements Comparable<b> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f183660e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f183661f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f183662g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final C3405e f183663h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f183664i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f183665j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f183666k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f183667l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f183668m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f183669n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f183670o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f183671p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final boolean f183672q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f183673r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f183674t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final int f183675v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final int f183676w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final boolean f183677x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final boolean f183678y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final boolean f183679z;

        /* JADX WARN: Code duplicated, block: B:100:0x0161  */
        /* JADX WARN: Code duplicated, block: B:103:0x0174  */
        /* JADX WARN: Code duplicated, block: B:55:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:95:0x0154  */
        /* JADX WARN: Code duplicated, block: B:96:0x0156  */
        /* JADX WARN: Code duplicated, block: B:99:0x015f  */
        public b(int i14, e0 e0Var, int i15, C3405e c3405e, int i16, boolean z14, Predicate<q> predicate, int i17) {
            int i18;
            int iJ;
            boolean z15;
            int iJ2;
            boolean z16;
            boolean z17;
            boolean z18;
            super(i14, e0Var, i15);
            this.f183663h = c3405e;
            boolean z19 = c3405e.f183694r0;
            ImmutableList<String> immutableList = c3405e.f8251r;
            ImmutableList<String> immutableList2 = c3405e.f8247n;
            int i19 = z19 ? 24 : 16;
            int i24 = 1;
            this.f183668m = c3405e.f183690n0 && (i17 & i19) != 0;
            this.f183662g = e.m(this.f183724d.f8376d);
            this.f183664i = u0.j(i16, false);
            int i25 = 0;
            while (true) {
                i18 = Integer.MAX_VALUE;
                if (i25 >= immutableList2.size()) {
                    iJ = 0;
                    i25 = Integer.MAX_VALUE;
                    break;
                } else {
                    iJ = e.j(this.f183724d, immutableList2.get(i25), false);
                    if (iJ > 0) {
                        break;
                    } else {
                        i25++;
                    }
                }
            }
            this.f183666k = i25;
            this.f183665j = iJ;
            int i26 = this.f183724d.f8378f;
            int i27 = c3405e.f8248o;
            this.f183667l = (i26 == 0 || i26 != i27) ? Integer.bitCount(i26 & i27) : Integer.MAX_VALUE;
            q qVar = this.f183724d;
            int i28 = qVar.f8378f;
            this.f183669n = i28 == 0 || (i28 & 1) != 0;
            this.f183672q = (qVar.f8377e & 1) != 0;
            String str = qVar.f8386n;
            if (str != null) {
                switch (str) {
                    case "audio/eac3-joc":
                    case "audio/ac4":
                    case "audio/iamf":
                        z15 = true;
                        break;
                    default:
                        z15 = false;
                        break;
                }
            } else {
                z15 = false;
            }
            this.f183679z = z15;
            int i29 = qVar.C;
            this.f183673r = i29;
            this.f183674t = qVar.D;
            int i30 = qVar.f8382j;
            this.f183675v = i30;
            this.f183661f = (i30 == -1 || i30 <= c3405e.f8250q) && (i29 == -1 || i29 <= c3405e.f8249p) && predicate.apply(qVar);
            int i34 = z.f70071a;
            Configuration configuration = Resources.getSystem().getConfiguration();
            String[] strArrSplit = z.f70071a >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{configuration.locale.toLanguageTag()};
            for (int i35 = 0; i35 < strArrSplit.length; i35++) {
                strArrSplit[i35] = z.P(strArrSplit[i35]);
            }
            int i36 = 0;
            while (true) {
                if (i36 < strArrSplit.length) {
                    iJ2 = e.j(this.f183724d, strArrSplit[i36], false);
                    if (iJ2 <= 0) {
                        i36++;
                    }
                } else {
                    iJ2 = 0;
                    i36 = Integer.MAX_VALUE;
                }
            }
            this.f183670o = i36;
            this.f183671p = iJ2;
            for (int i37 = 0; i37 < immutableList.size(); i37++) {
                String str2 = this.f183724d.f8386n;
                if (str2 != null && str2.equals(immutableList.get(i37))) {
                    i18 = i37;
                    this.f183676w = i18;
                    if ((i16 & 384) == 128) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    this.f183677x = z16;
                    if ((i16 & 64) == 64) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    this.f183678y = z17;
                    q qVar2 = this.f183724d;
                    boolean z24 = this.f183661f;
                    C3405e c3405e2 = this.f183663h;
                    z18 = c3405e2.f183696t0;
                    g0.b bVar = c3405e2.f8252s;
                    if (u0.j(i16, z18) || (!(z24 || c3405e2.f183689m0) || (bVar.f8264a == 2 && !e.n(c3405e2, i16, qVar2)))) {
                        i24 = 0;
                    } else if (u0.j(i16, false) && z24 && qVar2.f8382j != -1 && !c3405e2.f8259z && !c3405e2.f8258y && ((c3405e2.f183698v0 || !z14) && bVar.f8264a != 2 && (i19 & i16) != 0)) {
                        i24 = 2;
                    }
                    this.f183660e = i24;
                }
            }
            this.f183676w = i18;
            if ((i16 & 384) == 128) {
                z16 = true;
            } else {
                z16 = false;
            }
            this.f183677x = z16;
            if ((i16 & 64) == 64) {
                z17 = true;
            } else {
                z17 = false;
            }
            this.f183678y = z17;
            q qVar3 = this.f183724d;
            boolean z25 = this.f183661f;
            C3405e c3405e3 = this.f183663h;
            z18 = c3405e3.f183696t0;
            g0.b bVar2 = c3405e3.f8252s;
            if (u0.j(i16, z18)) {
                i24 = 0;
            } else if (u0.j(i16, false)) {
                i24 = 2;
            }
            this.f183660e = i24;
        }

        @Override // wa.e.i
        public final int a() {
            return this.f183660e;
        }

        @Override // wa.e.i
        public final boolean b(i iVar) {
            int i14;
            String str;
            int i15;
            b bVar = (b) iVar;
            q qVar = bVar.f183724d;
            C3405e c3405e = this.f183663h;
            boolean z14 = c3405e.f183692p0;
            q qVar2 = this.f183724d;
            if (!z14 && ((i15 = qVar2.C) == -1 || i15 != qVar.C)) {
                return false;
            }
            if (!this.f183668m && ((str = qVar2.f8386n) == null || !TextUtils.equals(str, qVar.f8386n))) {
                return false;
            }
            if (!c3405e.f183691o0 && ((i14 = qVar2.D) == -1 || i14 != qVar.D)) {
                return false;
            }
            if (c3405e.f183693q0) {
                return true;
            }
            return this.f183677x == bVar.f183677x && this.f183678y == bVar.f183678y;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final int compareTo(b bVar) {
            boolean z14 = this.f183664i;
            boolean z15 = this.f183661f;
            Object objReverse = (z15 && z14) ? e.f183652k : e.f183652k.reverse();
            ComparisonChain comparisonChainStart = ComparisonChain.start();
            boolean z16 = bVar.f183664i;
            int i14 = bVar.f183675v;
            ComparisonChain comparisonChainCompare = comparisonChainStart.compareFalseFirst(z14, z16).compare(Integer.valueOf(this.f183666k), Integer.valueOf(bVar.f183666k), Ordering.natural().reverse()).compare(this.f183665j, bVar.f183665j).compare(this.f183667l, bVar.f183667l).compareFalseFirst(this.f183672q, bVar.f183672q).compareFalseFirst(this.f183669n, bVar.f183669n).compare(Integer.valueOf(this.f183670o), Integer.valueOf(bVar.f183670o), Ordering.natural().reverse()).compare(this.f183671p, bVar.f183671p).compareFalseFirst(z15, bVar.f183661f).compare(Integer.valueOf(this.f183676w), Integer.valueOf(bVar.f183676w), Ordering.natural().reverse());
            boolean z17 = this.f183663h.f8258y;
            int i15 = this.f183675v;
            if (z17) {
                comparisonChainCompare = comparisonChainCompare.compare(Integer.valueOf(i15), Integer.valueOf(i14), e.f183652k.reverse());
            }
            ComparisonChain comparisonChainCompare2 = comparisonChainCompare.compareFalseFirst(this.f183677x, bVar.f183677x).compareFalseFirst(this.f183678y, bVar.f183678y).compareFalseFirst(this.f183679z, bVar.f183679z).compare(Integer.valueOf(this.f183673r), Integer.valueOf(bVar.f183673r), objReverse).compare(Integer.valueOf(this.f183674t), Integer.valueOf(bVar.f183674t), objReverse);
            String str = bVar.f183662g;
            int i16 = z.f70071a;
            if (Objects.equals(this.f183662g, str)) {
                comparisonChainCompare2 = comparisonChainCompare2.compare(Integer.valueOf(i15), Integer.valueOf(i14), objReverse);
            }
            return comparisonChainCompare2.result();
        }
    }

    public static final class c extends i<c> implements Comparable<c> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f183680e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f183681f;

        public c(int i14, e0 e0Var, int i15, C3405e c3405e, int i16) {
            int i17;
            super(i14, e0Var, i15);
            this.f183680e = u0.j(i16, c3405e.f183696t0) ? 1 : 0;
            q qVar = this.f183724d;
            int i18 = qVar.f8393u;
            int i19 = -1;
            if (i18 != -1 && (i17 = qVar.f8394v) != -1) {
                i19 = i18 * i17;
            }
            this.f183681f = i19;
        }

        @Override // wa.e.i
        public final int a() {
            return this.f183680e;
        }

        @Override // wa.e.i
        public final /* bridge */ /* synthetic */ boolean b(i iVar) {
            return false;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            return Integer.compare(this.f183681f, cVar.f183681f);
        }
    }

    public static final class d implements Comparable<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f183682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f183683b;

        public d(q qVar, int i14) {
            this.f183682a = (qVar.f8377e & 1) != 0;
            this.f183683b = u0.j(i14, false);
        }

        @Override // java.lang.Comparable
        public final int compareTo(d dVar) {
            d dVar2 = dVar;
            return ComparisonChain.start().compareFalseFirst(this.f183683b, dVar2.f183683b).compareFalseFirst(this.f183682a, dVar2.f183682a).result();
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Spatializer f183708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f183709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Handler f183710c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public wa.f f183711d;

        private g(Spatializer spatializer) {
            this.f183708a = spatializer;
            this.f183709b = spatializer.getImmersiveAudioLevel() != 0;
        }

        public static g b(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            if (audioManager == null) {
                return null;
            }
            return new g(audioManager.getSpatializer());
        }

        public final boolean a(androidx.media3.common.d dVar, q qVar) {
            String str = qVar.f8386n;
            int i14 = qVar.C;
            if (Objects.equals(str, MimeTypes.AUDIO_E_AC3_JOC)) {
                if (i14 == 16) {
                    i14 = 12;
                }
            } else if (Objects.equals(str, "audio/iamf")) {
                if (i14 == -1) {
                    i14 = 6;
                }
            } else if (Objects.equals(str, MimeTypes.AUDIO_AC4) && (i14 == 18 || i14 == 21)) {
                i14 = 24;
            }
            int iQ = z.q(i14);
            if (iQ == 0) {
                return false;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iQ);
            int i15 = qVar.D;
            if (i15 != -1) {
                channelMask.setSampleRate(i15);
            }
            return this.f183708a.canBeSpatialized(dVar.a().f8185a, channelMask.build());
        }
    }

    public static final class h extends i<h> implements Comparable<h> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f183712e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f183713f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f183714g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f183715h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f183716i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f183717j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f183718k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f183719l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f183720m;

        public h(int i14, e0 e0Var, int i15, C3405e c3405e, int i16, String str) {
            int iJ;
            super(i14, e0Var, i15);
            int i17 = 0;
            this.f183713f = u0.j(i16, false);
            int i18 = this.f183724d.f8377e;
            int i19 = c3405e.f8255v;
            ImmutableList<String> immutableList = c3405e.f8253t;
            int i24 = i18 & (~i19);
            this.f183714g = (i24 & 1) != 0;
            this.f183715h = (i24 & 2) != 0;
            ImmutableList<String> immutableListOf = immutableList.isEmpty() ? ImmutableList.of("") : immutableList;
            int i25 = 0;
            while (true) {
                if (i25 >= immutableListOf.size()) {
                    iJ = 0;
                    i25 = Integer.MAX_VALUE;
                    break;
                } else {
                    iJ = e.j(this.f183724d, immutableListOf.get(i25), c3405e.f8256w);
                    if (iJ > 0) {
                        break;
                    } else {
                        i25++;
                    }
                }
            }
            this.f183716i = i25;
            this.f183717j = iJ;
            int i26 = this.f183724d.f8378f;
            int i27 = c3405e.f8254u;
            Ordering<Integer> ordering = e.f183652k;
            int iBitCount = (i26 == 0 || i26 != i27) ? Integer.bitCount(i26 & i27) : Integer.MAX_VALUE;
            this.f183718k = iBitCount;
            this.f183720m = (this.f183724d.f8378f & 1088) != 0;
            int iJ2 = e.j(this.f183724d, str, e.m(str) == null);
            this.f183719l = iJ2;
            boolean z14 = iJ > 0 || (immutableList.isEmpty() && iBitCount > 0) || this.f183714g || (this.f183715h && iJ2 > 0);
            if (u0.j(i16, c3405e.f183696t0) && z14) {
                i17 = 1;
            }
            this.f183712e = i17;
        }

        @Override // wa.e.i
        public final int a() {
            return this.f183712e;
        }

        @Override // wa.e.i
        public final /* bridge */ /* synthetic */ boolean b(i iVar) {
            return false;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final int compareTo(h hVar) {
            ComparisonChain comparisonChainCompare = ComparisonChain.start().compareFalseFirst(this.f183713f, hVar.f183713f).compare(Integer.valueOf(this.f183716i), Integer.valueOf(hVar.f183716i), Ordering.natural().reverse());
            int i14 = hVar.f183717j;
            int i15 = this.f183717j;
            ComparisonChain comparisonChainCompare2 = comparisonChainCompare.compare(i15, i14);
            int i16 = hVar.f183718k;
            int i17 = this.f183718k;
            ComparisonChain comparisonChainCompare3 = comparisonChainCompare2.compare(i17, i16).compareFalseFirst(this.f183714g, hVar.f183714g).compare(Boolean.valueOf(this.f183715h), Boolean.valueOf(hVar.f183715h), i15 == 0 ? Ordering.natural() : Ordering.natural().reverse()).compare(this.f183719l, hVar.f183719l);
            if (i17 == 0) {
                comparisonChainCompare3 = comparisonChainCompare3.compareTrueFirst(this.f183720m, hVar.f183720m);
            }
            return comparisonChainCompare3.result();
        }
    }

    public static abstract class i<T extends i<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f183721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e0 f183722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f183723c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final q f183724d;

        public interface a<T extends i<T>> {
            ImmutableList e(e0 e0Var, int[] iArr, int i14);
        }

        public i(int i14, e0 e0Var, int i15) {
            this.f183721a = i14;
            this.f183722b = e0Var;
            this.f183723c = i15;
            this.f183724d = e0Var.f8217d[i15];
        }

        public abstract int a();

        public abstract boolean b(T t7);
    }

    public static final class j extends i<j> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f183725e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final C3405e f183726f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f183727g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f183728h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f183729i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f183730j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f183731k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f183732l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f183733m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f183734n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final boolean f183735o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f183736p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final boolean f183737q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final boolean f183738r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f183739t;

        /* JADX WARN: Code duplicated, block: B:121:0x014e  */
        /* JADX WARN: Code duplicated, block: B:31:0x004d  */
        /* JADX WARN: Code duplicated, block: B:51:0x007b  */
        public j(int i14, e0 e0Var, int i15, C3405e c3405e, int i16, int i17, boolean z14) {
            boolean z15;
            boolean z16;
            int i18;
            int i19;
            q qVar;
            int i24;
            int i25;
            int i26;
            q qVar2;
            int i27;
            int i28;
            int i29;
            super(i14, e0Var, i15);
            this.f183726f = c3405e;
            boolean z17 = c3405e.f183687k0;
            ImmutableList<String> immutableList = c3405e.f8245l;
            int i30 = z17 ? 24 : 16;
            int i34 = 0;
            this.f183735o = c3405e.f183686j0 && (i17 & i30) != 0;
            if (!z14 || (((i27 = (qVar2 = this.f183724d).f8393u) != -1 && i27 > c3405e.f8234a) || ((i28 = qVar2.f8394v) != -1 && i28 > c3405e.f8235b))) {
                z15 = false;
            } else {
                float f14 = qVar2.f8395w;
                if ((f14 == -1.0f || f14 <= c3405e.f8236c) && ((i29 = qVar2.f8382j) == -1 || i29 <= c3405e.f8237d)) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            }
            this.f183725e = z15;
            if (!z14 || (((i24 = (qVar = this.f183724d).f8393u) != -1 && i24 < c3405e.f8238e) || ((i25 = qVar.f8394v) != -1 && i25 < c3405e.f8239f))) {
                z16 = false;
            } else {
                float f15 = qVar.f8395w;
                if ((f15 == -1.0f || f15 >= c3405e.f8240g) && ((i26 = qVar.f8382j) == -1 || i26 >= c3405e.f8241h)) {
                    z16 = true;
                } else {
                    z16 = false;
                }
            }
            this.f183727g = z16;
            this.f183728h = u0.j(i16, false);
            q qVar3 = this.f183724d;
            float f16 = qVar3.f8395w;
            this.f183729i = f16 != -1.0f && f16 >= 10.0f;
            this.f183730j = qVar3.f8382j;
            int i35 = qVar3.f8393u;
            this.f183731k = (i35 == -1 || (i19 = qVar3.f8394v) == -1) ? -1 : i35 * i19;
            int i36 = qVar3.f8378f;
            int i37 = c3405e.f8246m;
            Ordering<Integer> ordering = e.f183652k;
            int i38 = Integer.MAX_VALUE;
            this.f183733m = (i36 == 0 || i36 != i37) ? Integer.bitCount(i36 & i37) : Integer.MAX_VALUE;
            int i39 = this.f183724d.f8378f;
            this.f183734n = i39 == 0 || (i39 & 1) != 0;
            for (int i44 = 0; i44 < immutableList.size(); i44++) {
                String str = this.f183724d.f8386n;
                if (str != null && str.equals(immutableList.get(i44))) {
                    i38 = i44;
                    break;
                }
            }
            this.f183732l = i38;
            this.f183737q = (i16 & 384) == 128;
            this.f183738r = (i16 & 64) == 64;
            q qVar4 = this.f183724d;
            String str2 = qVar4.f8386n;
            if (str2 != null) {
                i18 = 4;
                switch (str2) {
                    case "video/dolby-vision":
                        i18 = 5;
                        break;
                    case "video/av01":
                        break;
                    case "video/hevc":
                        i18 = 3;
                        break;
                    case "video/avc":
                        i18 = 1;
                        break;
                    case "video/x-vnd.on2.vp9":
                        i18 = 2;
                        break;
                    default:
                        i18 = 0;
                        break;
                }
            } else {
                i18 = 0;
            }
            this.f183739t = i18;
            boolean z18 = this.f183725e;
            C3405e c3405e2 = this.f183726f;
            if ((qVar4.f8378f & 16384) == 0 && u0.j(i16, c3405e2.f183696t0) && (z18 || c3405e2.f183685i0)) {
                i34 = (!u0.j(i16, false) || !this.f183727g || !z18 || qVar4.f8382j == -1 || c3405e2.f8259z || c3405e2.f8258y || (i30 & i16) == 0) ? 1 : 2;
            }
            this.f183736p = i34;
        }

        @Override // wa.e.i
        public final int a() {
            return this.f183736p;
        }

        @Override // wa.e.i
        public final boolean b(i iVar) {
            j jVar = (j) iVar;
            if (!this.f183735o) {
                String str = this.f183724d.f8386n;
                String str2 = jVar.f183724d.f8386n;
                int i14 = z.f70071a;
                if (!Objects.equals(str, str2)) {
                    return false;
                }
            }
            if (this.f183726f.f183688l0) {
                return true;
            }
            return this.f183737q == jVar.f183737q && this.f183738r == jVar.f183738r;
        }
    }

    private e(g0 g0Var, wa.g.b bVar, Context context) {
        this.f183653d = new Object();
        this.f183654e = context != null ? context.getApplicationContext() : null;
        this.f183655f = bVar;
        if (g0Var instanceof C3405e) {
            this.f183657h = (C3405e) g0Var;
        } else {
            C3405e c3405eA = context != null ? new C3405e.a(context).a() : C3405e.f183684z0;
            c3405eA.getClass();
            C3405e.a aVar = new C3405e.a();
            aVar.c(g0Var);
            this.f183657h = aVar.a();
        }
        this.f183659j = androidx.media3.common.d.f8178g;
        boolean z14 = context != null && z.L(context);
        this.f183656g = z14;
        if (!z14 && context != null && z.f70071a >= 32) {
            this.f183658i = g.b(context);
        }
        if (this.f183657h.f183695s0 && context == null) {
            fa.k.g("Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void i(r rVar, g0 g0Var, HashMap map) {
        for (int i14 = 0; i14 < rVar.f158153a; i14++) {
            f0 f0Var = g0Var.A.get(rVar.a(i14));
            if (f0Var != null) {
                e0 e0Var = f0Var.f8223a;
                f0 f0Var2 = (f0) map.get(Integer.valueOf(e0Var.f8216c));
                if (f0Var2 == null || (f0Var2.f8224b.isEmpty() && !f0Var.f8224b.isEmpty())) {
                    map.put(Integer.valueOf(e0Var.f8216c), f0Var);
                }
            }
        }
    }

    public static int j(q qVar, String str, boolean z14) {
        if (!TextUtils.isEmpty(str) && str.equals(qVar.f8376d)) {
            return 4;
        }
        String strM = m(str);
        String strM2 = m(qVar.f8376d);
        if (strM2 == null || strM == null) {
            return (z14 && strM2 == null) ? 1 : 0;
        }
        if (strM2.startsWith(strM) || strM.startsWith(strM2)) {
            return 3;
        }
        int i14 = z.f70071a;
        return strM2.split("-", 2)[0].equals(strM.split("-", 2)[0]) ? 2 : 0;
    }

    public static String m(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, C.LANGUAGE_UNDETERMINED)) {
            return null;
        }
        return str;
    }

    public static boolean n(C3405e c3405e, int i14, q qVar) {
        if ((i14 & 3584) == 0) {
            return false;
        }
        g0.b bVar = c3405e.f8252s;
        if (bVar.f8266c && (i14 & 2048) == 0) {
            return false;
        }
        if (bVar.f8265b) {
            boolean z14 = (qVar.F == 0 && qVar.G == 0) ? false : true;
            boolean z15 = (i14 & 1024) != 0;
            if (z14 && !z15) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Pair o(int i14, wa.i.a aVar, int[][][] iArr, i.a aVar2, Comparator comparator) {
        int i15;
        RandomAccess randomAccessOf;
        wa.i.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int i16 = aVar3.f183747a;
        int i17 = 0;
        while (i17 < i16) {
            if (i14 == aVar3.f183748b[i17]) {
                r rVar = aVar3.f183749c[i17];
                for (int i18 = 0; i18 < rVar.f158153a; i18++) {
                    e0 e0VarA = rVar.a(i18);
                    ImmutableList immutableListE = aVar2.e(e0VarA, iArr[i17][i18], i17);
                    int i19 = e0VarA.f8214a;
                    boolean[] zArr = new boolean[i19];
                    int i24 = 0;
                    while (i24 < i19) {
                        i iVar = (i) immutableListE.get(i24);
                        int iA = iVar.a();
                        if (zArr[i24] || iA == 0) {
                            i15 = i16;
                        } else {
                            if (iA == 1) {
                                randomAccessOf = ImmutableList.of(iVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(iVar);
                                int i25 = i24 + 1;
                                while (i25 < i19) {
                                    i iVar2 = (i) immutableListE.get(i25);
                                    int i26 = i16;
                                    if (iVar2.a() == 2 && iVar.b(iVar2)) {
                                        arrayList2.add(iVar2);
                                        zArr[i25] = true;
                                    }
                                    i25++;
                                    i16 = i26;
                                }
                                randomAccessOf = arrayList2;
                            }
                            i15 = i16;
                            arrayList.add(randomAccessOf);
                        }
                        i24++;
                        i16 = i15;
                    }
                }
            }
            i17++;
            aVar3 = aVar;
            i16 = i16;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i27 = 0; i27 < list.size(); i27++) {
            iArr2[i27] = ((i) list.get(i27)).f183723c;
        }
        i iVar3 = (i) list.get(0);
        return Pair.create(new wa.g.a(iVar3.f183722b, iArr2), Integer.valueOf(iVar3.f183721a));
    }

    @Override // wa.l
    public final u0.a b() {
        return this;
    }

    @Override // wa.l
    public final void d() {
        g gVar;
        wa.f fVar;
        synchronized (this.f183653d) {
            try {
                if (z.f70071a >= 32 && (gVar = this.f183658i) != null && (fVar = gVar.f183711d) != null && gVar.f183710c != null) {
                    gVar.f183708a.removeOnSpatializerStateChangedListener(fVar);
                    gVar.f183710c.removeCallbacksAndMessages(null);
                    gVar.f183710c = null;
                    gVar.f183711d = null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        super.d();
    }

    @Override // wa.l
    public final void f(androidx.media3.common.d dVar) {
        boolean zEquals;
        synchronized (this.f183653d) {
            zEquals = this.f183659j.equals(dVar);
            this.f183659j = dVar;
        }
        if (zEquals) {
            return;
        }
        l();
    }

    @Override // wa.l
    public final void g(g0 g0Var) {
        if (g0Var instanceof C3405e) {
            p((C3405e) g0Var);
        }
        C3405e.a aVar = new C3405e.a();
        aVar.c(g0Var);
        p(aVar.a());
    }

    /* JADX WARN: Code duplicated, block: B:124:0x027c  */
    /* JADX WARN: Code duplicated, block: B:159:0x02f9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [wa.e$d] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6, types: [wa.g$b] */
    /* JADX WARN: Type inference failed for: r3v12, types: [android.util.Pair] */
    /* JADX WARN: Type inference failed for: r3v19, types: [androidx.media3.exoplayer.v0[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.media3.exoplayer.v0] */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42, types: [wa.e$f] */
    /* JADX WARN: Type inference failed for: r7v62 */
    /* JADX WARN: Type inference failed for: r9v0, types: [wa.g$a[]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // wa.i
    public final Pair<v0[], wa.g[]> h(wa.i.a aVar, int[][][] iArr, final int[] iArr2, androidx.media3.exoplayer.source.j.b bVar, d0 d0Var) {
        final C3405e c3405e;
        int i14;
        e0 e0Var;
        Pair pairO;
        int i15;
        final boolean z14;
        Object obj;
        Pair pairO2;
        ?? r14;
        int i16;
        boolean z15;
        int i17;
        ?? r15;
        Object aVar2;
        f fVar;
        int i18;
        r[] rVarArr;
        int[] iArr3;
        Object aVar3;
        r rVar;
        int[] iArr4;
        g gVar;
        int[][][] iArr5 = iArr;
        synchronized (this.f183653d) {
            try {
                c3405e = this.f183657h;
                i14 = 32;
                if (c3405e.f183695s0 && z.f70071a >= 32 && (gVar = this.f183658i) != null) {
                    Looper looperMyLooper = Looper.myLooper();
                    fa.a.f(looperMyLooper);
                    if (gVar.f183711d == null && gVar.f183710c == null) {
                        gVar.f183711d = new wa.f(gVar, this);
                        Handler handler = new Handler(looperMyLooper);
                        gVar.f183710c = handler;
                        gVar.f183708a.addOnSpatializerStateChangedListener(new ka.l(handler, 0), gVar.f183711d);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        int i19 = aVar.f183747a;
        r[] rVarArr2 = aVar.f183749c;
        int[] iArr6 = aVar.f183748b;
        ?? r16 = new wa.g.a[i19];
        g0.b bVar2 = c3405e.f8252s;
        int i24 = 2;
        Pair pairO3 = bVar2.f8264a == 2 ? null : o(2, aVar, iArr5, new b0(27, c3405e, iArr2), new tl2.g(6));
        int i25 = 4;
        if ((c3405e.f8257x || pairO3 == null) && bVar2.f8264a != 2) {
            e0Var = null;
            pairO = o(4, aVar, iArr5, new t0(c3405e, 13), new tl2.g(4));
        } else {
            e0Var = null;
            pairO = null;
        }
        if (pairO != null) {
            r16[((Integer) pairO.second).intValue()] = (wa.g.a) pairO.first;
        } else if (pairO3 != null) {
            r16[((Integer) pairO3.second).intValue()] = (wa.g.a) pairO3.first;
        }
        int i26 = 0;
        while (true) {
            i15 = 1;
            if (i26 >= aVar.f183747a) {
                z14 = false;
                break;
            }
            if (2 == iArr6[i26] && rVarArr2[i26].f158153a > 0) {
                z14 = true;
                break;
            }
            i26++;
        }
        Pair pairO4 = o(1, aVar, iArr5, new i.a() { // from class: wa.c
            @Override // wa.e.i.a
            public final ImmutableList e(e0 e0Var2, int[] iArr7, int i27) {
                Ordering<Integer> ordering = e.f183652k;
                final e eVar = this.f183647a;
                Predicate predicate = new Predicate() { // from class: wa.d
                    /* JADX WARN: Code duplicated, block: B:43:0x0065 A[Catch: all -> 0x008e, FALL_THROUGH, TryCatch #0 {all -> 0x008e, blocks: (B:4:0x0007, B:6:0x000e, B:8:0x0012, B:12:0x001a, B:37:0x0059, B:39:0x005d, B:41:0x0061, B:43:0x0065, B:45:0x0069, B:47:0x006d, B:49:0x0071, B:51:0x0079, B:53:0x0083, B:59:0x0091), top: B:63:0x0007 }] */
                    /* JADX WARN: Code duplicated, block: B:58:0x0090  */
                    @Override // com.google.common.base.Predicate
                    public final boolean apply(Object obj2) {
                        boolean z16;
                        e.g gVar2;
                        e.g gVar3;
                        e eVar2 = eVar;
                        q qVar = (q) obj2;
                        synchronized (eVar2.f183653d) {
                            try {
                                z16 = true;
                                if (eVar2.f183657h.f183695s0 && !eVar2.f183656g) {
                                    int i28 = qVar.C;
                                    if (i28 != -1 && i28 > 2) {
                                        String str = qVar.f8386n;
                                        if (str != null) {
                                            switch (str) {
                                                case "audio/eac3-joc":
                                                case "audio/ac3":
                                                case "audio/ac4":
                                                case "audio/eac3":
                                                    if (z.f70071a >= 32 && (gVar3 = eVar2.f183658i) != null && gVar3.f183709b) {
                                                    }
                                                default:
                                                    if (z.f70071a < 32) {
                                                        z16 = false;
                                                        break;
                                                    } else {
                                                        z16 = false;
                                                        break;
                                                    }
                                                    break;
                                            }
                                        } else if (z.f70071a < 32 || (gVar2 = eVar2.f183658i) == null || !gVar2.f183709b || !gVar2.f183708a.isAvailable() || !eVar2.f183658i.f183708a.isEnabled() || !eVar2.f183658i.a(eVar2.f183659j, qVar)) {
                                            z16 = false;
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                        return z16;
                    }
                };
                int i28 = iArr2[i27];
                ImmutableList.Builder builder = ImmutableList.builder();
                for (int i29 = 0; i29 < e0Var2.f8214a; i29++) {
                    builder.add(new e.b(i27, e0Var2, i29, c3405e, iArr7[i29], z14, predicate, i28));
                }
                return builder.build();
            }
        }, new tl2.g(5));
        if (pairO4 != null) {
            r16[((Integer) pairO4.second).intValue()] = (wa.g.a) pairO4.first;
        }
        if (pairO4 == null) {
            obj = e0Var;
        } else {
            wa.g.a aVar4 = (wa.g.a) pairO4.first;
            obj = aVar4.f183741a.f8217d[aVar4.f183742b[0]].f8376d;
        }
        int i27 = 3;
        if (bVar2.f8264a == 2) {
            r14 = e0Var;
        } else {
            pairO2 = o(3, aVar, iArr5, new b0(28, c3405e, obj), new tl2.g(7));
        }
        if (r14 != 0) {
            r14 = pairO2;
            r16[((Integer) ((Pair) r14).second).intValue()] = (wa.g.a) ((Pair) r14).first;
        }
        r14 = pairO2;
        int i28 = 0;
        while (i28 < i19) {
            int i29 = iArr6[i28];
            if (i29 == i24 || i29 == i15 || i29 == i27 || i29 == i25) {
                i18 = i28;
                rVarArr = rVarArr2;
                iArr3 = iArr6;
            } else {
                r rVar2 = rVarArr2[i28];
                int[][] iArr7 = iArr5[i28];
                if (bVar2.f8264a == i24) {
                    aVar3 = e0Var;
                    i18 = i28;
                    rVarArr = rVarArr2;
                    iArr3 = iArr6;
                } else {
                    e0 e0Var2 = e0Var;
                    ?? r17 = e0Var2;
                    int i30 = 0;
                    int i34 = 0;
                    while (i30 < rVar2.f158153a) {
                        e0 e0VarA = rVar2.a(i30);
                        int[] iArr8 = iArr7[i30];
                        int i35 = i28;
                        ?? r18 = r17;
                        int i36 = 0;
                        while (i36 < e0VarA.f8214a) {
                            r[] rVarArr3 = rVarArr2;
                            if (u0.j(iArr8[i36], c3405e.f183696t0)) {
                                rVar = rVar2;
                                d dVar = new d(e0VarA.f8217d[i36], iArr8[i36]);
                                if (r18 != 0) {
                                    iArr4 = iArr6;
                                    if (ComparisonChain.start().compareFalseFirst(dVar.f183683b, r18.f183683b).compareFalseFirst(dVar.f183682a, r18.f183682a).result() > 0) {
                                    }
                                } else {
                                    iArr4 = iArr6;
                                }
                                r18 = dVar;
                                e0Var2 = e0VarA;
                                i34 = i36;
                            } else {
                                rVar = rVar2;
                                iArr4 = iArr6;
                            }
                            i36++;
                            rVarArr2 = rVarArr3;
                            rVar2 = rVar;
                            iArr6 = iArr4;
                            r18 = r18;
                        }
                        i30++;
                        r17 = r18;
                        i28 = i35;
                    }
                    i18 = i28;
                    rVarArr = rVarArr2;
                    iArr3 = iArr6;
                    aVar3 = e0Var2 == null ? e0Var : new wa.g.a(e0Var2, i34);
                }
                r16[i18] = aVar3;
            }
            i28 = i18 + 1;
            iArr5 = iArr;
            rVarArr2 = rVarArr;
            iArr6 = iArr3;
            i24 = 2;
            i27 = 3;
            i15 = 1;
            i25 = 4;
        }
        int i37 = aVar.f183747a;
        r[] rVarArr4 = aVar.f183749c;
        HashMap map = new HashMap();
        for (int i38 = 0; i38 < i37; i38++) {
            i(rVarArr4[i38], c3405e, map);
        }
        i(aVar.f183752f, c3405e, map);
        int i39 = 0;
        while (true) {
            i16 = -1;
            if (i39 >= i37) {
                break;
            }
            f0 f0Var = (f0) map.get(Integer.valueOf(aVar.f183748b[i39]));
            if (f0Var != null) {
                e0 e0Var3 = f0Var.f8223a;
                ImmutableList<Integer> immutableList = f0Var.f8224b;
                r16[i39] = (immutableList.isEmpty() || rVarArr4[i39].b(e0Var3) == -1) ? e0Var : new wa.g.a(e0Var3, Ints.toArray(immutableList));
            }
            i39++;
        }
        int i44 = aVar.f183747a;
        for (int i45 = 0; i45 < i44; i45++) {
            r rVar3 = aVar.f183749c[i45];
            Map<r, f> map2 = c3405e.f183700x0.get(i45);
            if (map2 != null && map2.containsKey(rVar3)) {
                Map<r, f> map3 = c3405e.f183700x0.get(i45);
                if (map3 != null) {
                    fVar = map3.get(rVar3);
                } else {
                    r15 = e0Var;
                }
                if (r15 != 0) {
                    int[] iArr9 = r15.f183706b;
                    if (iArr9.length != 0) {
                        r15 = fVar;
                        aVar2 = new wa.g.a(rVar3.a(r15.f183705a), iArr9, r15.f183707c);
                    } else {
                        r15 = fVar;
                        r15 = fVar;
                        aVar2 = e0Var;
                    }
                } else {
                    r15 = fVar;
                    r15 = fVar;
                    aVar2 = e0Var;
                }
                r16[i45] = aVar2;
            }
        }
        for (int i46 = 0; i46 < i19; i46++) {
            int i47 = aVar.f183748b[i46];
            if (c3405e.f183701y0.get(i46) || c3405e.B.contains(Integer.valueOf(i47))) {
                r16[i46] = e0Var;
            }
        }
        ?? r19 = this.f183655f;
        xa.c cVar = this.f183754b;
        fa.a.f(cVar);
        wa.g[] gVarArrA = r19.a(r16, cVar);
        ?? r24 = new v0[i19];
        for (int i48 = 0; i48 < i19; i48++) {
            r24[i48] = (c3405e.f183701y0.get(i48) || c3405e.B.contains(Integer.valueOf(aVar.f183748b[i48])) || (aVar.f183748b[i48] != -2 && gVarArrA[i48] == null)) ? e0Var : v0.f9773c;
        }
        if (c3405e.f183697u0) {
            int i49 = -1;
            int i54 = -1;
            int i55 = 0;
            while (true) {
                if (i55 >= aVar.f183747a) {
                    z15 = true;
                    break;
                }
                int i56 = aVar.f183748b[i55];
                wa.g gVar2 = gVarArrA[i55];
                if (i56 != 1 && i56 != 2) {
                    i17 = i14;
                } else if (gVar2 != null) {
                    int[][] iArr10 = iArr[i55];
                    int iB = aVar.f183749c[i55].b(gVar2.getTrackGroup());
                    int i57 = 0;
                    while (true) {
                        if (i57 >= gVar2.length()) {
                            i17 = i14;
                            if (i56 != 1) {
                                if (i49 == -1) {
                                    i49 = i55;
                                    break;
                                }
                                z15 = false;
                                break;
                            }
                            if (i54 == -1) {
                                i54 = i55;
                                break;
                            }
                            z15 = false;
                            break;
                        }
                        i17 = i14;
                        if ((iArr10[iB][gVar2.getIndexInTrackGroup(i57)] & 32) != i17) {
                            break;
                        }
                        i57++;
                        i14 = i17;
                    }
                } else {
                    i17 = i14;
                }
                i55++;
                i14 = i17;
            }
            if (z15 & ((i54 == -1 || i49 == -1) ? false : true)) {
                v0 v0Var = new v0(0, true);
                r24[i54] = v0Var;
                r24[i49] = v0Var;
            }
        }
        if (c3405e.f8252s.f8264a != 0) {
            int i58 = 0;
            for (int i59 = 0; i59 < aVar.f183747a; i59++) {
                int i64 = aVar.f183748b[i59];
                wa.g gVar3 = gVarArrA[i59];
                if (i64 == 1 || gVar3 == null) {
                    if (i64 == 1 && gVar3 != null && gVar3.length() == 1) {
                        if (n(c3405e, iArr[i59][aVar.f183749c[i59].b(gVar3.getTrackGroup())][gVar3.getIndexInTrackGroup(0)], gVar3.getSelectedFormat())) {
                            i58++;
                            i16 = i59;
                        }
                    }
                }
            }
            if (i58 == 1) {
                int i65 = c3405e.f8252s.f8265b ? 1 : 2;
                ?? r25 = r24[i16];
                r24[i16] = new v0(i65, r25 != 0 && r25.f9775b);
            }
        }
        return Pair.create(r24, gVarArrA);
    }

    @Override // wa.l
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final C3405e a() {
        C3405e c3405e;
        synchronized (this.f183653d) {
            c3405e = this.f183657h;
        }
        return c3405e;
    }

    public final void l() {
        boolean z14;
        androidx.media3.exoplayer.z zVar;
        g gVar;
        synchronized (this.f183653d) {
            try {
                z14 = this.f183657h.f183695s0 && !this.f183656g && z.f70071a >= 32 && (gVar = this.f183658i) != null && gVar.f183709b;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (!z14 || (zVar = this.f183753a) == null) {
            return;
        }
        zVar.f9893i.sendEmptyMessage(10);
    }

    public final void p(C3405e c3405e) {
        boolean zEquals;
        c3405e.getClass();
        synchronized (this.f183653d) {
            zEquals = this.f183657h.equals(c3405e);
            this.f183657h = c3405e;
        }
        if (zEquals) {
            return;
        }
        if (c3405e.f183695s0 && this.f183654e == null) {
            fa.k.g("Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        androidx.media3.exoplayer.z zVar = this.f183753a;
        if (zVar != null) {
            zVar.f9893i.sendEmptyMessage(10);
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f183702d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f183703e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f183704f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f183705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f183706b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f183707c;

        static {
            int i14 = z.f70071a;
            f183702d = Integer.toString(0, 36);
            f183703e = Integer.toString(1, 36);
            f183704f = Integer.toString(2, 36);
        }

        public f(int i14, int[] iArr, int i15) {
            this.f183705a = i14;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f183706b = iArrCopyOf;
            this.f183707c = i15;
            Arrays.sort(iArrCopyOf);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && f.class == obj.getClass()) {
                f fVar = (f) obj;
                if (this.f183705a == fVar.f183705a && Arrays.equals(this.f183706b, fVar.f183706b) && this.f183707c == fVar.f183707c) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((Arrays.hashCode(this.f183706b) + (this.f183705a * 31)) * 31) + this.f183707c;
        }

        public f(int i14, int... iArr) {
            this(i14, iArr, 0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(Context context, wa.g.b bVar) {
        this(context, new C3405e.a(context).a(), bVar);
        C3405e c3405e = C3405e.f183684z0;
    }

    public e(Context context, g0 g0Var) {
        this(context, g0Var, new wa.a.b());
    }

    @Deprecated
    public e(g0 g0Var, wa.g.b bVar) {
        this(g0Var, bVar, (Context) null);
    }

    public e(Context context, g0 g0Var, wa.g.b bVar) {
        this(g0Var, bVar, context);
    }

    public e(Context context) {
        this(context, new wa.a.b());
    }

    /* JADX INFO: renamed from: wa.e$e, reason: collision with other inner class name */
    public static final class C3405e extends g0 {
        public static final String A0;
        public static final String B0;
        public static final String C0;
        public static final String D0;
        public static final String E0;
        public static final String F0;
        public static final String G0;
        public static final String H0;
        public static final String I0;
        public static final String J0;
        public static final String K0;
        public static final String L0;
        public static final String M0;
        public static final String N0;
        public static final String O0;
        public static final String P0;
        public static final String Q0;
        public static final String R0;
        public static final String S0;

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        public static final C3405e f183684z0 = new a().a();

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public final boolean f183685i0;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public final boolean f183686j0;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public final boolean f183687k0;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public final boolean f183688l0;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public final boolean f183689m0;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public final boolean f183690n0;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public final boolean f183691o0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final boolean f183692p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final boolean f183693q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f183694r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f183695s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final boolean f183696t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final boolean f183697u0;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        public final boolean f183698v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final boolean f183699w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final SparseArray<Map<r, f>> f183700x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final SparseBooleanArray f183701y0;

        static {
            int i14 = z.f70071a;
            A0 = Integer.toString(1000, 36);
            B0 = Integer.toString(1001, 36);
            C0 = Integer.toString(1002, 36);
            D0 = Integer.toString(1003, 36);
            E0 = Integer.toString(1004, 36);
            F0 = Integer.toString(1005, 36);
            G0 = Integer.toString(1006, 36);
            H0 = Integer.toString(1007, 36);
            I0 = Integer.toString(1008, 36);
            J0 = Integer.toString(1009, 36);
            K0 = Integer.toString(1010, 36);
            L0 = Integer.toString(1011, 36);
            M0 = Integer.toString(1012, 36);
            N0 = Integer.toString(1013, 36);
            O0 = Integer.toString(1014, 36);
            P0 = Integer.toString(1015, 36);
            Q0 = Integer.toString(1016, 36);
            R0 = Integer.toString(1017, 36);
            S0 = Integer.toString(1018, 36);
        }

        private C3405e(a aVar) {
            super(aVar);
            this.f183685i0 = aVar.C;
            this.f183686j0 = aVar.D;
            this.f183687k0 = aVar.E;
            this.f183688l0 = aVar.F;
            this.f183689m0 = aVar.G;
            this.f183690n0 = aVar.H;
            this.f183691o0 = aVar.I;
            this.f183692p0 = aVar.J;
            this.f183693q0 = aVar.K;
            this.f183694r0 = aVar.L;
            this.f183695s0 = aVar.M;
            this.f183696t0 = aVar.N;
            this.f183697u0 = aVar.O;
            this.f183698v0 = aVar.P;
            this.f183699w0 = aVar.Q;
            this.f183700x0 = aVar.R;
            this.f183701y0 = aVar.S;
        }

        @Override // androidx.media3.common.g0
        public final g0.c a() {
            return new a();
        }

        @Override // androidx.media3.common.g0
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C3405e.class == obj.getClass()) {
                C3405e c3405e = (C3405e) obj;
                if (super.equals(c3405e) && this.f183685i0 == c3405e.f183685i0 && this.f183686j0 == c3405e.f183686j0 && this.f183687k0 == c3405e.f183687k0 && this.f183688l0 == c3405e.f183688l0 && this.f183689m0 == c3405e.f183689m0 && this.f183690n0 == c3405e.f183690n0 && this.f183691o0 == c3405e.f183691o0 && this.f183692p0 == c3405e.f183692p0 && this.f183693q0 == c3405e.f183693q0 && this.f183694r0 == c3405e.f183694r0 && this.f183695s0 == c3405e.f183695s0 && this.f183696t0 == c3405e.f183696t0 && this.f183697u0 == c3405e.f183697u0 && this.f183698v0 == c3405e.f183698v0 && this.f183699w0 == c3405e.f183699w0) {
                    SparseBooleanArray sparseBooleanArray = c3405e.f183701y0;
                    SparseBooleanArray sparseBooleanArray2 = this.f183701y0;
                    int size = sparseBooleanArray2.size();
                    if (sparseBooleanArray.size() == size) {
                        for (int i14 = 0; i14 < size; i14++) {
                            if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i14)) >= 0) {
                            }
                        }
                        SparseArray<Map<r, f>> sparseArray = c3405e.f183700x0;
                        SparseArray<Map<r, f>> sparseArray2 = this.f183700x0;
                        int size2 = sparseArray2.size();
                        if (sparseArray.size() == size2) {
                            for (int i15 = 0; i15 < size2; i15++) {
                                int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i15));
                                if (iIndexOfKey >= 0) {
                                    Map<r, f> mapValueAt = sparseArray2.valueAt(i15);
                                    Map<r, f> mapValueAt2 = sparseArray.valueAt(iIndexOfKey);
                                    if (mapValueAt2.size() == mapValueAt.size()) {
                                        for (Map.Entry<r, f> entry : mapValueAt.entrySet()) {
                                            r key = entry.getKey();
                                            if (mapValueAt2.containsKey(key)) {
                                                f value = entry.getValue();
                                                f fVar = mapValueAt2.get(key);
                                                int i16 = z.f70071a;
                                                if (!Objects.equals(value, fVar)) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        @Override // androidx.media3.common.g0
        public final int hashCode() {
            return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f183685i0 ? 1 : 0)) * 31) + (this.f183686j0 ? 1 : 0)) * 31) + (this.f183687k0 ? 1 : 0)) * 31) + (this.f183688l0 ? 1 : 0)) * 31) + (this.f183689m0 ? 1 : 0)) * 31) + (this.f183690n0 ? 1 : 0)) * 31) + (this.f183691o0 ? 1 : 0)) * 31) + (this.f183692p0 ? 1 : 0)) * 31) + (this.f183693q0 ? 1 : 0)) * 31) + (this.f183694r0 ? 1 : 0)) * 31) + (this.f183695s0 ? 1 : 0)) * 31) + (this.f183696t0 ? 1 : 0)) * 31) + (this.f183697u0 ? 1 : 0)) * 31) + (this.f183698v0 ? 1 : 0)) * 31) + (this.f183699w0 ? 1 : 0);
        }

        /* JADX INFO: renamed from: wa.e$e$a */
        public static final class a extends g0.c {
            public boolean C;
            public boolean D;
            public boolean E;
            public boolean F;
            public boolean G;
            public boolean H;
            public boolean I;
            public boolean J;
            public boolean K;
            public boolean L;
            public boolean M;
            public boolean N;
            public boolean O;
            public boolean P;
            public boolean Q;
            public final SparseArray<Map<r, f>> R;
            public final SparseBooleanArray S;

            /* JADX WARN: Code duplicated, block: B:34:0x015a  */
            /* JADX WARN: Multi-variable type inference failed */
            private a(Bundle bundle) {
                SparseArray sparseArray;
                SparseBooleanArray sparseBooleanArray;
                super(bundle);
                m();
                C3405e c3405e = C3405e.f183684z0;
                this.C = bundle.getBoolean(C3405e.A0, c3405e.f183685i0);
                this.D = bundle.getBoolean(C3405e.B0, c3405e.f183686j0);
                this.E = bundle.getBoolean(C3405e.C0, c3405e.f183687k0);
                this.F = bundle.getBoolean(C3405e.O0, c3405e.f183688l0);
                this.G = bundle.getBoolean(C3405e.D0, c3405e.f183689m0);
                this.H = bundle.getBoolean(C3405e.E0, c3405e.f183690n0);
                this.I = bundle.getBoolean(C3405e.F0, c3405e.f183691o0);
                this.J = bundle.getBoolean(C3405e.G0, c3405e.f183692p0);
                this.K = bundle.getBoolean(C3405e.P0, c3405e.f183693q0);
                this.L = bundle.getBoolean(C3405e.S0, c3405e.f183694r0);
                this.M = bundle.getBoolean(C3405e.Q0, c3405e.f183695s0);
                this.N = bundle.getBoolean(C3405e.H0, c3405e.f183696t0);
                this.O = bundle.getBoolean(C3405e.I0, c3405e.f183697u0);
                this.P = bundle.getBoolean(C3405e.J0, c3405e.f183698v0);
                this.Q = bundle.getBoolean(C3405e.R0, c3405e.f183699w0);
                this.R = new SparseArray<>();
                int[] intArray = bundle.getIntArray(C3405e.K0);
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(C3405e.L0);
                ImmutableList immutableListOf = parcelableArrayList == null ? ImmutableList.of() : fa.b.a(new p(19), parcelableArrayList);
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(C3405e.M0);
                if (sparseParcelableArray == null) {
                    sparseArray = new SparseArray();
                } else {
                    SparseArray sparseArray2 = new SparseArray(sparseParcelableArray.size());
                    for (int i14 = 0; i14 < sparseParcelableArray.size(); i14++) {
                        int iKeyAt = sparseParcelableArray.keyAt(i14);
                        Bundle bundle2 = (Bundle) sparseParcelableArray.valueAt(i14);
                        int i15 = bundle2.getInt(f.f183702d, -1);
                        int[] intArray2 = bundle2.getIntArray(f.f183703e);
                        int i16 = bundle2.getInt(f.f183704f, -1);
                        fa.a.a(i15 >= 0 && i16 >= 0);
                        intArray2.getClass();
                        sparseArray2.put(iKeyAt, new f(i15, intArray2, i16));
                    }
                    sparseArray = sparseArray2;
                }
                if (intArray != null && intArray.length == immutableListOf.size()) {
                    for (int i17 = 0; i17 < intArray.length; i17++) {
                        int i18 = intArray[i17];
                        r rVar = (r) immutableListOf.get(i17);
                        f fVar = (f) sparseArray.get(i17);
                        SparseArray<Map<r, f>> sparseArray3 = this.R;
                        Map<r, f> map = sparseArray3.get(i18);
                        if (map == null) {
                            map = new HashMap<>();
                            sparseArray3.put(i18, map);
                        }
                        if (map.containsKey(rVar)) {
                            f fVar2 = map.get(rVar);
                            int i19 = z.f70071a;
                            if (!Objects.equals(fVar2, fVar)) {
                                map.put(rVar, fVar);
                            }
                        } else {
                            map.put(rVar, fVar);
                        }
                    }
                }
                int[] intArray3 = bundle.getIntArray(C3405e.N0);
                if (intArray3 == null) {
                    sparseBooleanArray = new SparseBooleanArray();
                } else {
                    SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray(intArray3.length);
                    for (int i24 : intArray3) {
                        sparseBooleanArray2.append(i24, true);
                    }
                    sparseBooleanArray = sparseBooleanArray2;
                }
                this.S = sparseBooleanArray;
            }

            @Override // androidx.media3.common.g0.c
            @CanIgnoreReturnValue
            public final g0.c b(int i14) {
                super.b(i14);
                return this;
            }

            @Override // androidx.media3.common.g0.c
            @CanIgnoreReturnValue
            public final g0.c e() {
                this.f8291v = -3;
                return this;
            }

            @Override // androidx.media3.common.g0.c
            @CanIgnoreReturnValue
            public final g0.c f(f0 f0Var) {
                super.f(f0Var);
                return this;
            }

            @Override // androidx.media3.common.g0.c
            @CanIgnoreReturnValue
            public final g0.c g() {
                super.g();
                return this;
            }

            @Override // androidx.media3.common.g0.c
            @CanIgnoreReturnValue
            public final g0.c h(String[] strArr) {
                super.h(strArr);
                return this;
            }

            @Override // androidx.media3.common.g0.c
            @CanIgnoreReturnValue
            public final g0.c i() {
                this.f8290u = 0;
                return this;
            }

            @Override // androidx.media3.common.g0.c
            @CanIgnoreReturnValue
            public final g0.c j(int i14) {
                super.j(i14);
                return this;
            }

            @Override // androidx.media3.common.g0.c
            @CanIgnoreReturnValue
            public final g0.c k(int i14, int i15) {
                super.k(i14, i15);
                return this;
            }

            @Override // androidx.media3.common.g0.c
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public final C3405e a() {
                return new C3405e(this);
            }

            public final void m() {
                this.C = true;
                this.D = false;
                this.E = true;
                this.F = false;
                this.G = true;
                this.H = false;
                this.I = false;
                this.J = false;
                this.K = false;
                this.L = true;
                this.M = true;
                this.N = true;
                this.O = false;
                this.P = true;
                this.Q = false;
            }

            @CanIgnoreReturnValue
            public final void n(int i14, boolean z14) {
                SparseBooleanArray sparseBooleanArray = this.S;
                if (sparseBooleanArray.get(i14) == z14) {
                    return;
                }
                if (z14) {
                    sparseBooleanArray.put(i14, true);
                } else {
                    sparseBooleanArray.delete(i14);
                }
            }

            @Deprecated
            public a() {
                this.R = new SparseArray<>();
                this.S = new SparseBooleanArray();
                m();
            }

            public a(Context context) {
                super(context);
                this.R = new SparseArray<>();
                this.S = new SparseBooleanArray();
                m();
            }

            private a(C3405e c3405e) {
                super(c3405e);
                this.C = c3405e.f183685i0;
                this.D = c3405e.f183686j0;
                this.E = c3405e.f183687k0;
                this.F = c3405e.f183688l0;
                this.G = c3405e.f183689m0;
                this.H = c3405e.f183690n0;
                this.I = c3405e.f183691o0;
                this.J = c3405e.f183692p0;
                this.K = c3405e.f183693q0;
                this.L = c3405e.f183694r0;
                this.M = c3405e.f183695s0;
                this.N = c3405e.f183696t0;
                this.O = c3405e.f183697u0;
                this.P = c3405e.f183698v0;
                this.Q = c3405e.f183699w0;
                SparseArray<Map<r, f>> sparseArray = c3405e.f183700x0;
                SparseArray<Map<r, f>> sparseArray2 = new SparseArray<>();
                for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                    sparseArray2.put(sparseArray.keyAt(i14), new HashMap(sparseArray.valueAt(i14)));
                }
                this.R = sparseArray2;
                this.S = c3405e.f183701y0.clone();
            }
        }
    }
}
