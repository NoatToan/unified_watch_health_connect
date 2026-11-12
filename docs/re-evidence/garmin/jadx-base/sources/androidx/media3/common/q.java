package androidx.media3.common;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.math.DoubleMath;
import com.google.maps.android.BuildConfig;
import i3.e5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class q {
    public static final q N = new b().a();
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f8351a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f8352b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f8353c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f8354d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final String f8355e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final String f8356f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final String f8357g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final String f8358h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final String f8359i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final String f8360j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final String f8361k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final String f8362l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final String f8363m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final String f8364n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final String f8365o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final String f8366p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final String f8367q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final String f8368r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final String f8369s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final String f8370t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final String f8371u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final String f8372v0;
    public final int A;
    public final i B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public int M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImmutableList f8375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8379g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8380h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f8381i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f8382j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f8383k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w f8384l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f8385m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f8386n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f8387o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f8388p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List<byte[]> f8389q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l f8390r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f8391s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f8392t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f8393u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f8394v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final float f8395w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f8396x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final float f8397y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final byte[] f8398z;

    static {
        int i14 = fa.z.f70071a;
        O = Integer.toString(0, 36);
        P = Integer.toString(1, 36);
        Q = Integer.toString(2, 36);
        R = Integer.toString(3, 36);
        S = Integer.toString(4, 36);
        T = Integer.toString(5, 36);
        U = Integer.toString(6, 36);
        V = Integer.toString(7, 36);
        W = Integer.toString(8, 36);
        X = Integer.toString(9, 36);
        Y = Integer.toString(10, 36);
        Z = Integer.toString(11, 36);
        f8351a0 = Integer.toString(12, 36);
        f8352b0 = Integer.toString(13, 36);
        f8353c0 = Integer.toString(14, 36);
        f8354d0 = Integer.toString(15, 36);
        f8355e0 = Integer.toString(16, 36);
        f8356f0 = Integer.toString(17, 36);
        f8357g0 = Integer.toString(18, 36);
        f8358h0 = Integer.toString(19, 36);
        f8359i0 = Integer.toString(20, 36);
        f8360j0 = Integer.toString(21, 36);
        f8361k0 = Integer.toString(22, 36);
        f8362l0 = Integer.toString(23, 36);
        f8363m0 = Integer.toString(24, 36);
        f8364n0 = Integer.toString(25, 36);
        f8365o0 = Integer.toString(26, 36);
        f8366p0 = Integer.toString(27, 36);
        f8367q0 = Integer.toString(28, 36);
        f8368r0 = Integer.toString(29, 36);
        f8369s0 = Integer.toString(30, 36);
        f8370t0 = Integer.toString(31, 36);
        f8371u0 = Integer.toString(32, 36);
        f8372v0 = Integer.toString(33, 36);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private q(b bVar) {
        boolean z14;
        String str;
        this.f8373a = bVar.f8399a;
        String strP = fa.z.P(bVar.f8402d);
        this.f8376d = strP;
        if (bVar.f8401c.isEmpty() && bVar.f8400b != null) {
            this.f8375c = ImmutableList.of(new s(strP, bVar.f8400b));
            this.f8374b = bVar.f8400b;
        } else if (bVar.f8401c.isEmpty() || bVar.f8400b != null) {
            if (!bVar.f8401c.isEmpty() || bVar.f8400b != null) {
                int i14 = 0;
                while (true) {
                    if (i14 >= bVar.f8401c.size()) {
                        z14 = false;
                        break;
                    } else {
                        if (((s) bVar.f8401c.get(i14)).f8436b.equals(bVar.f8400b)) {
                            z14 = true;
                            break;
                        }
                        i14++;
                    }
                }
            } else {
                z14 = true;
                break;
            }
            fa.a.d(z14);
            this.f8375c = bVar.f8401c;
            this.f8374b = bVar.f8400b;
        } else {
            ImmutableList immutableList = bVar.f8401c;
            this.f8375c = immutableList;
            Iterator<E> it = immutableList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((s) immutableList.get(0)).f8436b;
                    break;
                }
                s sVar = (s) it.next();
                if (TextUtils.equals(sVar.f8435a, strP)) {
                    str = sVar.f8436b;
                    break;
                }
            }
            this.f8374b = str;
        }
        this.f8377e = bVar.f8403e;
        fa.a.e(bVar.f8405g == 0 || (bVar.f8404f & 32768) != 0, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.f8378f = bVar.f8404f;
        this.f8379g = bVar.f8405g;
        int i15 = bVar.f8406h;
        this.f8380h = i15;
        int i16 = bVar.f8407i;
        this.f8381i = i16;
        this.f8382j = i16 != -1 ? i16 : i15;
        this.f8383k = bVar.f8408j;
        this.f8384l = bVar.f8409k;
        this.f8385m = bVar.f8410l;
        this.f8386n = bVar.f8411m;
        this.f8387o = bVar.f8412n;
        this.f8388p = bVar.f8413o;
        List<byte[]> list = bVar.f8414p;
        this.f8389q = list == null ? Collections.EMPTY_LIST : list;
        l lVar = bVar.f8415q;
        this.f8390r = lVar;
        this.f8391s = bVar.f8416r;
        this.f8392t = bVar.f8417s;
        this.f8393u = bVar.f8418t;
        this.f8394v = bVar.f8419u;
        this.f8395w = bVar.f8420v;
        int i17 = bVar.f8421w;
        this.f8396x = i17 == -1 ? 0 : i17;
        float f14 = bVar.f8422x;
        this.f8397y = f14 == -1.0f ? 1.0f : f14;
        this.f8398z = bVar.f8423y;
        this.A = bVar.f8424z;
        this.B = bVar.A;
        this.C = bVar.B;
        this.D = bVar.C;
        this.E = bVar.D;
        int i18 = bVar.E;
        this.F = i18 == -1 ? 0 : i18;
        int i19 = bVar.F;
        this.G = i19 != -1 ? i19 : 0;
        this.H = bVar.G;
        this.I = bVar.H;
        this.J = bVar.I;
        this.K = bVar.J;
        int i24 = bVar.K;
        if (i24 != 0 || lVar == null) {
            this.L = i24;
        } else {
            this.L = 1;
        }
    }

    public static q b(Bundle bundle) {
        ImmutableList immutableListBuild;
        b bVar = new b();
        if (bundle != null) {
            ClassLoader classLoader = fa.b.class.getClassLoader();
            int i14 = fa.z.f70071a;
            bundle.setClassLoader(classLoader);
        }
        String string = bundle.getString(O);
        q qVar = N;
        String str = qVar.f8373a;
        if (string == null) {
            string = str;
        }
        bVar.f8399a = string;
        String string2 = bundle.getString(P);
        String str2 = qVar.f8374b;
        if (string2 == null) {
            string2 = str2;
        }
        bVar.f8400b = string2;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f8371u0);
        int i15 = 0;
        if (parcelableArrayList == null) {
            immutableListBuild = ImmutableList.of();
        } else {
            ImmutableList.Builder builder = ImmutableList.builder();
            for (int i16 = 0; i16 < parcelableArrayList.size(); i16++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i16);
                bundle2.getClass();
                String string3 = bundle2.getString(s.f8433c);
                String string4 = bundle2.getString(s.f8434d);
                string4.getClass();
                builder.add(new s(string3, string4));
            }
            immutableListBuild = builder.build();
        }
        bVar.f8401c = ImmutableList.copyOf((Collection) immutableListBuild);
        String string5 = bundle.getString(Q);
        String str3 = qVar.f8376d;
        if (string5 == null) {
            string5 = str3;
        }
        bVar.f8402d = string5;
        bVar.f8403e = bundle.getInt(R, qVar.f8377e);
        bVar.f8404f = bundle.getInt(S, qVar.f8378f);
        bVar.f8405g = bundle.getInt(f8372v0, qVar.f8379g);
        bVar.f8406h = bundle.getInt(T, qVar.f8380h);
        bVar.f8407i = bundle.getInt(U, qVar.f8381i);
        String string6 = bundle.getString(V);
        String str4 = qVar.f8383k;
        if (string6 == null) {
            string6 = str4;
        }
        bVar.f8408j = string6;
        w wVar = (w) bundle.getParcelable(W);
        w wVar2 = qVar.f8384l;
        if (wVar == null) {
            wVar = wVar2;
        }
        bVar.f8409k = wVar;
        String string7 = bundle.getString(X);
        String str5 = qVar.f8385m;
        if (string7 == null) {
            string7 = str5;
        }
        bVar.f8410l = x.n(string7);
        String string8 = bundle.getString(Y);
        String str6 = qVar.f8386n;
        if (string8 == null) {
            string8 = str6;
        }
        bVar.f8411m = x.n(string8);
        bVar.f8412n = bundle.getInt(Z, qVar.f8387o);
        ArrayList arrayList = new ArrayList();
        while (true) {
            byte[] byteArray = bundle.getByteArray(f8351a0 + "_" + Integer.toString(i15, 36));
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i15++;
        }
        bVar.f8414p = arrayList;
        bVar.f8415q = (l) bundle.getParcelable(f8352b0);
        bVar.f8416r = bundle.getLong(f8353c0, qVar.f8391s);
        bVar.f8418t = bundle.getInt(f8354d0, qVar.f8393u);
        bVar.f8419u = bundle.getInt(f8355e0, qVar.f8394v);
        bVar.f8420v = bundle.getFloat(f8356f0, qVar.f8395w);
        bVar.f8421w = bundle.getInt(f8357g0, qVar.f8396x);
        bVar.f8422x = bundle.getFloat(f8358h0, qVar.f8397y);
        bVar.f8423y = bundle.getByteArray(f8359i0);
        bVar.f8424z = bundle.getInt(f8360j0, qVar.A);
        Bundle bundle3 = bundle.getBundle(f8361k0);
        if (bundle3 != null) {
            bVar.A = i.d(bundle3);
        }
        bVar.B = bundle.getInt(f8362l0, qVar.C);
        bVar.C = bundle.getInt(f8363m0, qVar.D);
        bVar.D = bundle.getInt(f8364n0, qVar.E);
        bVar.E = bundle.getInt(f8365o0, qVar.F);
        bVar.F = bundle.getInt(f8366p0, qVar.G);
        bVar.G = bundle.getInt(f8367q0, qVar.H);
        bVar.I = bundle.getInt(f8369s0, qVar.J);
        bVar.J = bundle.getInt(f8370t0, qVar.K);
        bVar.K = bundle.getInt(f8368r0, qVar.L);
        return bVar.a();
    }

    public static String d(q qVar) {
        int i14;
        String str;
        String strD;
        if (qVar == null) {
            return BuildConfig.TRAVIS;
        }
        int i15 = qVar.f8377e;
        ImmutableList immutableList = qVar.f8375c;
        String str2 = qVar.f8376d;
        int i16 = qVar.D;
        int i17 = qVar.C;
        float f14 = qVar.f8395w;
        i iVar = qVar.B;
        float f15 = qVar.f8397y;
        int i18 = qVar.f8394v;
        int i19 = qVar.f8393u;
        l lVar = qVar.f8390r;
        String str3 = qVar.f8383k;
        int i24 = qVar.f8382j;
        String str4 = qVar.f8385m;
        int i25 = qVar.f8378f;
        Joiner joinerOn = Joiner.on(CoreConstants.COMMA_CHAR);
        StringBuilder sbK = e5.k("id=");
        sbK.append(qVar.f8373a);
        sbK.append(", mimeType=");
        sbK.append(qVar.f8386n);
        if (str4 != null) {
            sbK.append(", container=");
            sbK.append(str4);
        }
        int i26 = -1;
        if (i24 != -1) {
            sbK.append(", bitrate=");
            sbK.append(i24);
        }
        if (str3 != null) {
            sbK.append(", codecs=");
            sbK.append(str3);
        }
        if (lVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i27 = 0;
            while (i27 < lVar.f8341d) {
                UUID uuid = lVar.f8338a[i27].f8343b;
                if (uuid.equals(h.f8297b)) {
                    linkedHashSet.add(C.CENC_TYPE_cenc);
                } else if (uuid.equals(h.f8298c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(h.f8300e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(h.f8299d)) {
                    linkedHashSet.add("widevine");
                } else {
                    if (uuid.equals(h.f8296a)) {
                        linkedHashSet.add("universal");
                    } else {
                        linkedHashSet.add("unknown (" + uuid + ")");
                    }
                    i27++;
                    lVar = lVar;
                }
                i27++;
                lVar = lVar;
            }
            sbK.append(", drm=[");
            joinerOn.appendTo(sbK, (Iterable<? extends Object>) linkedHashSet);
            sbK.append(']');
            i26 = -1;
        }
        if (i19 != i26 && i18 != i26) {
            androidx.core.view.j.m(i19, i18, ", res=", "x", sbK);
        }
        if (!DoubleMath.fuzzyEquals(f15, 1.0d, 0.001d)) {
            sbK.append(", par=");
            Object[] objArr = {Float.valueOf(f15)};
            int i28 = fa.z.f70071a;
            sbK.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (iVar != null) {
            int i29 = iVar.f8320f;
            int i30 = iVar.f8319e;
            if ((i30 != -1 && i29 != -1) || iVar.e()) {
                sbK.append(", color=");
                if (iVar.e()) {
                    String strB = i.b(iVar.f8315a);
                    String strA = i.a(iVar.f8316b);
                    String strC = i.c(iVar.f8317c);
                    int i34 = fa.z.f70071a;
                    Locale locale = Locale.US;
                    strD = j20.x.d(strB, "/", strA, "/", strC);
                } else {
                    strD = "NA/NA/NA";
                }
                sbK.append(strD + "/" + ((i30 == -1 || i29 == -1) ? "NA/NA" : androidx.core.view.j.d(i30, i29, "/")));
            }
        }
        if (f14 != -1.0f) {
            sbK.append(", fps=");
            sbK.append(f14);
        }
        if (i17 != -1) {
            sbK.append(", channels=");
            sbK.append(i17);
        }
        if (i16 != -1) {
            sbK.append(", sample_rate=");
            sbK.append(i16);
        }
        if (str2 != null) {
            sbK.append(", language=");
            sbK.append(str2);
        }
        if (!immutableList.isEmpty()) {
            sbK.append(", labels=[");
            joinerOn.appendTo(sbK, (Iterable<? extends Object>) Lists.transform(immutableList, new p(0)));
            sbK.append("]");
        }
        if (i15 != 0) {
            sbK.append(", selectionFlags=[");
            int i35 = fa.z.f70071a;
            ArrayList arrayList = new ArrayList();
            if ((i15 & 4) != 0) {
                arrayList.add(TtmlNode.TEXT_EMPHASIS_AUTO);
            }
            if ((i15 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i15 & 2) != 0) {
                arrayList.add("forced");
            }
            joinerOn.appendTo(sbK, (Iterable<? extends Object>) arrayList);
            sbK.append("]");
        }
        if (i25 != 0) {
            sbK.append(", roleFlags=[");
            int i36 = fa.z.f70071a;
            ArrayList arrayList2 = new ArrayList();
            if ((i25 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i25 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i25 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i25 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i25 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i25 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i25 & 64) != 0) {
                arrayList2.add("caption");
            }
            i14 = i25;
            if ((i14 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i14 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i14 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i14 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i14 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i14 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i14 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i14 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i14 & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            joinerOn.appendTo(sbK, (Iterable<? extends Object>) arrayList2);
            sbK.append("]");
        } else {
            i14 = i25;
        }
        if ((i14 & 32768) != 0) {
            sbK.append(", auxiliaryTrackType=");
            int i37 = qVar.f8379g;
            int i38 = fa.z.f70071a;
            if (i37 == 0) {
                str = "undefined";
            } else if (i37 == 1) {
                str = "original";
            } else if (i37 == 2) {
                str = "depth-linear";
            } else if (i37 == 3) {
                str = "depth-inverse";
            } else {
                if (i37 != 4) {
                    vb.h.z("Unsupported auxiliary track type");
                    return null;
                }
                str = "depth metadata";
            }
            sbK.append(str);
        }
        return sbK.toString();
    }

    public final b a() {
        return new b();
    }

    public final boolean c(q qVar) {
        List<byte[]> list = this.f8389q;
        if (list.size() != qVar.f8389q.size()) {
            return false;
        }
        for (int i14 = 0; i14 < list.size(); i14++) {
            if (!Arrays.equals(list.get(i14), qVar.f8389q.get(i14))) {
                return false;
            }
        }
        return true;
    }

    public final q e(q qVar) {
        String str;
        String str2;
        int i14;
        int i15;
        if (this == qVar) {
            return this;
        }
        int iH = x.h(this.f8386n);
        String str3 = qVar.f8373a;
        ImmutableList immutableList = qVar.f8375c;
        int i16 = qVar.J;
        int i17 = qVar.K;
        String str4 = qVar.f8374b;
        if (str4 == null) {
            str4 = this.f8374b;
        }
        if (immutableList.isEmpty()) {
            immutableList = this.f8375c;
        }
        if ((iH != 3 && iH != 1) || (str = qVar.f8376d) == null) {
            str = this.f8376d;
        }
        int i18 = this.f8380h;
        if (i18 == -1) {
            i18 = qVar.f8380h;
        }
        int i19 = this.f8381i;
        if (i19 == -1) {
            i19 = qVar.f8381i;
        }
        String str5 = this.f8383k;
        if (str5 == null) {
            String strS = fa.z.s(qVar.f8383k, iH);
            if (fa.z.X(strS).length == 1) {
                str5 = strS;
            }
        }
        w wVarD = qVar.f8384l;
        w wVar = this.f8384l;
        if (wVar != null) {
            wVarD = wVar.d(wVarD);
        }
        float f14 = this.f8395w;
        if (f14 == -1.0f && iH == 2) {
            f14 = qVar.f8395w;
        }
        int i24 = this.f8377e | qVar.f8377e;
        int i25 = this.f8378f | qVar.f8378f;
        l lVar = qVar.f8390r;
        Parcelable.Creator<l> creator = l.CREATOR;
        ArrayList arrayList = new ArrayList();
        ImmutableList immutableList2 = immutableList;
        if (lVar != null) {
            String str6 = lVar.f8340c;
            l.b[] bVarArr = lVar.f8338a;
            int length = bVarArr.length;
            int i26 = 0;
            while (i26 < length) {
                int i27 = i26;
                l.b bVar = bVarArr[i27];
                int i28 = length;
                if (bVar.f8346e != null) {
                    arrayList.add(bVar);
                }
                i26 = i27 + 1;
                length = i28;
            }
            str2 = str6;
        } else {
            str2 = null;
        }
        l lVar2 = this.f8390r;
        if (lVar2 != null) {
            if (str2 == null) {
                str2 = lVar2.f8340c;
            }
            int size = arrayList.size();
            l.b[] bVarArr2 = lVar2.f8338a;
            String str7 = str2;
            int length2 = bVarArr2.length;
            int i29 = 0;
            while (i29 < length2) {
                int i30 = i29;
                l.b bVar2 = bVarArr2[i30];
                int i34 = length2;
                if (bVar2.f8346e != null) {
                    UUID uuid = bVar2.f8343b;
                    i15 = i17;
                    int i35 = 0;
                    while (true) {
                        if (i35 >= size) {
                            i14 = size;
                            arrayList.add(bVar2);
                            break;
                        }
                        i14 = size;
                        if (((l.b) arrayList.get(i35)).f8343b.equals(uuid)) {
                            break;
                        }
                        i35++;
                        size = i14;
                    }
                } else {
                    i14 = size;
                    i15 = i17;
                }
                i29 = i30 + 1;
                length2 = i34;
                i17 = i15;
                size = i14;
            }
            str2 = str7;
        }
        int i36 = i17;
        l lVar3 = arrayList.isEmpty() ? null : new l(str2, arrayList);
        b bVarA = a();
        bVarA.f8399a = str3;
        bVarA.f8400b = str4;
        bVarA.f8401c = ImmutableList.copyOf((Collection) immutableList2);
        bVarA.f8402d = str;
        bVarA.f8403e = i24;
        bVarA.f8404f = i25;
        bVarA.f8406h = i18;
        bVarA.f8407i = i19;
        bVarA.f8408j = str5;
        bVarA.f8409k = wVarD;
        bVarA.f8415q = lVar3;
        bVarA.f8420v = f14;
        bVarA.I = i16;
        bVarA.J = i36;
        return bVarA.a();
    }

    public final boolean equals(Object obj) {
        int i14;
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        int i15 = this.M;
        return (i15 == 0 || (i14 = qVar.M) == 0 || i15 == i14) && this.f8377e == qVar.f8377e && this.f8378f == qVar.f8378f && this.f8379g == qVar.f8379g && this.f8380h == qVar.f8380h && this.f8381i == qVar.f8381i && this.f8387o == qVar.f8387o && this.f8391s == qVar.f8391s && this.f8393u == qVar.f8393u && this.f8394v == qVar.f8394v && this.f8396x == qVar.f8396x && this.A == qVar.A && this.C == qVar.C && this.D == qVar.D && this.E == qVar.E && this.F == qVar.F && this.G == qVar.G && this.H == qVar.H && this.J == qVar.J && this.K == qVar.K && this.L == qVar.L && Float.compare(this.f8395w, qVar.f8395w) == 0 && Float.compare(this.f8397y, qVar.f8397y) == 0 && Objects.equals(this.f8373a, qVar.f8373a) && Objects.equals(this.f8374b, qVar.f8374b) && this.f8375c.equals(qVar.f8375c) && Objects.equals(this.f8383k, qVar.f8383k) && Objects.equals(this.f8385m, qVar.f8385m) && Objects.equals(this.f8386n, qVar.f8386n) && Objects.equals(this.f8376d, qVar.f8376d) && Arrays.equals(this.f8398z, qVar.f8398z) && Objects.equals(this.f8384l, qVar.f8384l) && Objects.equals(this.B, qVar.B) && Objects.equals(this.f8390r, qVar.f8390r) && c(qVar);
    }

    public final int hashCode() {
        if (this.M == 0) {
            String str = this.f8373a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f8374b;
            int iHashCode2 = (this.f8375c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.f8376d;
            int iHashCode3 = (((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f8377e) * 31) + this.f8378f) * 31) + this.f8379g) * 31) + this.f8380h) * 31) + this.f8381i) * 31;
            String str4 = this.f8383k;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            w wVar = this.f8384l;
            int iHashCode5 = (iHashCode4 + (wVar == null ? 0 : wVar.hashCode())) * 961;
            String str5 = this.f8385m;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f8386n;
            this.M = ((((((((((((((((((((Float.floatToIntBits(this.f8397y) + ((((Float.floatToIntBits(this.f8395w) + ((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f8387o) * 31) + ((int) this.f8391s)) * 31) + this.f8393u) * 31) + this.f8394v) * 31)) * 31) + this.f8396x) * 31)) * 31) + this.A) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.J) * 31) + this.K) * 31) + this.L;
        }
        return this.M;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Format(");
        sb3.append(this.f8373a);
        sb3.append(", ");
        sb3.append(this.f8374b);
        sb3.append(", ");
        sb3.append(this.f8385m);
        sb3.append(", ");
        sb3.append(this.f8386n);
        sb3.append(", ");
        sb3.append(this.f8383k);
        sb3.append(", ");
        sb3.append(this.f8382j);
        sb3.append(", ");
        sb3.append(this.f8376d);
        sb3.append(", [");
        sb3.append(this.f8393u);
        sb3.append(", ");
        sb3.append(this.f8394v);
        sb3.append(", ");
        sb3.append(this.f8395w);
        sb3.append(", ");
        sb3.append(this.B);
        sb3.append("], [");
        sb3.append(this.C);
        sb3.append(", ");
        return am.j.q(sb3, this.D, "])");
    }

    public static final class b {
        public i A;
        public int B;
        public int C;
        public int D;
        public int E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f8399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f8400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ImmutableList f8401c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f8402d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f8403e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f8404f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f8405g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f8406h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f8407i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f8408j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public w f8409k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f8410l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f8411m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f8412n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f8413o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public List<byte[]> f8414p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public l f8415q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public long f8416r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f8417s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f8418t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f8419u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public float f8420v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f8421w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public float f8422x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public byte[] f8423y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f8424z;

        private b(q qVar) {
            this.f8399a = qVar.f8373a;
            this.f8400b = qVar.f8374b;
            this.f8401c = qVar.f8375c;
            this.f8402d = qVar.f8376d;
            this.f8403e = qVar.f8377e;
            this.f8404f = qVar.f8378f;
            this.f8406h = qVar.f8380h;
            this.f8407i = qVar.f8381i;
            this.f8408j = qVar.f8383k;
            this.f8409k = qVar.f8384l;
            this.f8410l = qVar.f8385m;
            this.f8411m = qVar.f8386n;
            this.f8412n = qVar.f8387o;
            this.f8413o = qVar.f8388p;
            this.f8414p = qVar.f8389q;
            this.f8415q = qVar.f8390r;
            this.f8416r = qVar.f8391s;
            this.f8417s = qVar.f8392t;
            this.f8418t = qVar.f8393u;
            this.f8419u = qVar.f8394v;
            this.f8420v = qVar.f8395w;
            this.f8421w = qVar.f8396x;
            this.f8422x = qVar.f8397y;
            this.f8423y = qVar.f8398z;
            this.f8424z = qVar.A;
            this.A = qVar.B;
            this.B = qVar.C;
            this.C = qVar.D;
            this.D = qVar.E;
            this.E = qVar.F;
            this.F = qVar.G;
            this.G = qVar.H;
            this.H = qVar.I;
            this.I = qVar.J;
            this.J = qVar.K;
            this.K = qVar.L;
        }

        public final q a() {
            return new q(this);
        }

        public b() {
            this.f8401c = ImmutableList.of();
            this.f8406h = -1;
            this.f8407i = -1;
            this.f8412n = -1;
            this.f8413o = -1;
            this.f8416r = Long.MAX_VALUE;
            this.f8418t = -1;
            this.f8419u = -1;
            this.f8420v = -1.0f;
            this.f8422x = 1.0f;
            this.f8424z = -1;
            this.B = -1;
            this.C = -1;
            this.D = -1;
            this.G = -1;
            this.H = 1;
            this.I = -1;
            this.J = -1;
            this.K = 0;
            this.f8405g = 0;
        }
    }
}
