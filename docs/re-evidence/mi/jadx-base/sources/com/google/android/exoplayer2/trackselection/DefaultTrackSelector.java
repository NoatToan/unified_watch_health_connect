package com.google.android.exoplayer2.trackselection;

import android.content.Context;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.v;
import com.google.common.collect.ImmutableList;
import defpackage.ahd;
import defpackage.ich;
import defpackage.rk1;
import defpackage.rkk;
import defpackage.skk;
import defpackage.u94;
import defpackage.wlq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public class DefaultTrackSelector extends com.google.android.exoplayer2.trackselection.c {
    public static final int[] f = new int[0];
    public static final ich<Integer> g = ich.a(new Comparator() { // from class: ox5
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return DefaultTrackSelector.A((Integer) obj, (Integer) obj2);
        }
    });
    public static final ich<Integer> h = ich.a(new Comparator() { // from class: px5
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return DefaultTrackSelector.B((Integer) obj, (Integer) obj2);
        }
    });
    public final com.google.android.exoplayer2.trackselection.b.InterfaceC0203b d;
    public final AtomicReference<Parameters> e;

    public static final class SelectionOverride implements Parcelable {
        public static final Parcelable.Creator<SelectionOverride> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f8300b;
        public final int c;
        public final int d;

        public class a implements Parcelable.Creator<SelectionOverride> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SelectionOverride createFromParcel(Parcel parcel) {
                return new SelectionOverride(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SelectionOverride[] newArray(int i) {
                return new SelectionOverride[i];
            }
        }

        public SelectionOverride(int i, int... iArr) {
            this(i, iArr, 0);
        }

        public boolean a(int i) {
            for (int i2 : this.f8300b) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SelectionOverride.class != obj.getClass()) {
                return false;
            }
            SelectionOverride selectionOverride = (SelectionOverride) obj;
            return this.f8299a == selectionOverride.f8299a && Arrays.equals(this.f8300b, selectionOverride.f8300b) && this.d == selectionOverride.d;
        }

        public int hashCode() {
            return (((this.f8299a * 31) + Arrays.hashCode(this.f8300b)) * 31) + this.d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f8299a);
            parcel.writeInt(this.f8300b.length);
            parcel.writeIntArray(this.f8300b);
            parcel.writeInt(this.d);
        }

        public SelectionOverride(int i, int[] iArr, int i2) {
            this.f8299a = i;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f8300b = iArrCopyOf;
            this.c = iArr.length;
            this.d = i2;
            Arrays.sort(iArrCopyOf);
        }

        public SelectionOverride(Parcel parcel) {
            this.f8299a = parcel.readInt();
            int i = parcel.readByte();
            this.c = i;
            int[] iArr = new int[i];
            this.f8300b = iArr;
            parcel.readIntArray(iArr);
            this.d = parcel.readInt();
        }
    }

    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f8301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f8302b;
        public final Parameters c;
        public final boolean d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final boolean j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f8303k;
        public final int l;
        public final int m;
        public final int n;

        public b(Format format, Parameters parameters, int i) {
            int i2;
            int iT;
            int iT2;
            this.c = parameters;
            this.f8302b = DefaultTrackSelector.D(format.c);
            this.d = DefaultTrackSelector.x(i, false);
            int i3 = 0;
            while (true) {
                i2 = Integer.MAX_VALUE;
                if (i3 >= parameters.f8312a.size()) {
                    iT = 0;
                    i3 = Integer.MAX_VALUE;
                    break;
                } else {
                    iT = DefaultTrackSelector.t(format, parameters.f8312a.get(i3), false);
                    if (iT > 0) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.f = i3;
            this.e = iT;
            this.g = Integer.bitCount(format.e & parameters.f8313b);
            boolean z = true;
            this.j = (format.d & 1) != 0;
            int i4 = format.y;
            this.f8303k = i4;
            this.l = format.z;
            int i5 = format.h;
            this.m = i5;
            if ((i5 != -1 && i5 > parameters.w) || (i4 != -1 && i4 > parameters.v)) {
                z = false;
            }
            this.f8301a = z;
            String[] strArrD0 = wlq.d0();
            int i6 = 0;
            while (true) {
                if (i6 >= strArrD0.length) {
                    iT2 = 0;
                    i6 = Integer.MAX_VALUE;
                    break;
                } else {
                    iT2 = DefaultTrackSelector.t(format, strArrD0[i6], false);
                    if (iT2 > 0) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            this.h = i6;
            this.i = iT2;
            for (int i7 = 0; i7 < parameters.B.size(); i7++) {
                String str = format.l;
                if (str != null && str.equals(parameters.B.get(i7))) {
                    i2 = i7;
                    break;
                }
            }
            this.n = i2;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            ich ichVarH = (this.f8301a && this.d) ? DefaultTrackSelector.g : DefaultTrackSelector.g.h();
            u94 u94VarG = u94.k().h(this.d, bVar.d).g(Integer.valueOf(this.f), Integer.valueOf(bVar.f), ich.e().h()).d(this.e, bVar.e).d(this.g, bVar.g).h(this.f8301a, bVar.f8301a).g(Integer.valueOf(this.n), Integer.valueOf(bVar.n), ich.e().h()).g(Integer.valueOf(this.m), Integer.valueOf(bVar.m), this.c.C ? DefaultTrackSelector.g.h() : DefaultTrackSelector.h).h(this.j, bVar.j).g(Integer.valueOf(this.h), Integer.valueOf(bVar.h), ich.e().h()).d(this.i, bVar.i).g(Integer.valueOf(this.f8303k), Integer.valueOf(bVar.f8303k), ichVarH).g(Integer.valueOf(this.l), Integer.valueOf(bVar.l), ichVarH);
            Integer numValueOf = Integer.valueOf(this.m);
            Integer numValueOf2 = Integer.valueOf(bVar.m);
            if (!wlq.c(this.f8302b, bVar.f8302b)) {
                ichVarH = DefaultTrackSelector.h;
            }
            return u94VarG.g(numValueOf, numValueOf2, ichVarH).j();
        }
    }

    public static final class c implements Comparable<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f8304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f8305b;

        public c(Format format, int i) {
            this.f8304a = (format.d & 1) != 0;
            this.f8305b = DefaultTrackSelector.x(i, false);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return u94.k().h(this.f8305b, cVar.f8305b).h(this.f8304a, cVar.f8304a).j();
        }
    }

    public static final class d extends TrackSelectionParameters.b {
        public boolean A;
        public ImmutableList<String> B;
        public boolean C;
        public boolean D;
        public boolean E;
        public boolean F;
        public boolean G;
        public final SparseArray<Map<TrackGroupArray, SelectionOverride>> H;
        public final SparseBooleanArray I;
        public int g;
        public int h;
        public int i;
        public int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f8306k;
        public int l;
        public int m;
        public int n;
        public boolean o;
        public boolean p;
        public boolean q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f8307r;
        public int s;
        public boolean t;
        public ImmutableList<String> u;
        public int v;
        public int w;
        public boolean x;
        public boolean y;
        public boolean z;

        public static SparseArray<Map<TrackGroupArray, SelectionOverride>> f(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2 = new SparseArray<>();
            for (int i = 0; i < sparseArray.size(); i++) {
                sparseArray2.put(sparseArray.keyAt(i), new HashMap(sparseArray.valueAt(i)));
            }
            return sparseArray2;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Parameters a() {
            return new Parameters(this.g, this.h, this.i, this.j, this.f8306k, this.l, this.m, this.n, this.o, this.p, this.q, this.f8307r, this.s, this.t, this.u, this.f8314a, this.f8315b, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, this.G, this.H, this.I);
        }

        public final d e(int i) {
            Map<TrackGroupArray, SelectionOverride> map = this.H.get(i);
            if (map != null && !map.isEmpty()) {
                this.H.remove(i);
            }
            return this;
        }

        public final void g() {
            this.g = Integer.MAX_VALUE;
            this.h = Integer.MAX_VALUE;
            this.i = Integer.MAX_VALUE;
            this.j = Integer.MAX_VALUE;
            this.o = true;
            this.p = false;
            this.q = true;
            this.f8307r = Integer.MAX_VALUE;
            this.s = Integer.MAX_VALUE;
            this.t = true;
            this.u = ImmutableList.of();
            this.v = Integer.MAX_VALUE;
            this.w = Integer.MAX_VALUE;
            this.x = true;
            this.y = false;
            this.z = false;
            this.A = false;
            this.B = ImmutableList.of();
            this.C = false;
            this.D = false;
            this.E = true;
            this.F = false;
            this.G = true;
        }

        public d h(int i) {
            this.j = i;
            return this;
        }

        public d i(int i, int i2) {
            this.g = i;
            this.h = i2;
            return this;
        }

        public d j(int i, int i2) {
            this.f8306k = i;
            this.l = i2;
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.b
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public d b(Context context) {
            super.b(context);
            return this;
        }

        public final d l(int i, boolean z) {
            if (this.I.get(i) == z) {
                return this;
            }
            if (z) {
                this.I.put(i, true);
            } else {
                this.I.delete(i);
            }
            return this;
        }

        public final d m(int i, TrackGroupArray trackGroupArray, SelectionOverride selectionOverride) {
            Map<TrackGroupArray, SelectionOverride> map = this.H.get(i);
            if (map == null) {
                map = new HashMap<>();
                this.H.put(i, map);
            }
            if (map.containsKey(trackGroupArray) && wlq.c(map.get(trackGroupArray), selectionOverride)) {
                return this;
            }
            map.put(trackGroupArray, selectionOverride);
            return this;
        }

        public d n(int i, int i2, boolean z) {
            this.f8307r = i;
            this.s = i2;
            this.t = z;
            return this;
        }

        public d o(Context context, boolean z) {
            Point pointN = wlq.N(context);
            return n(pointN.x, pointN.y, z);
        }

        @Deprecated
        public d() {
            g();
            this.H = new SparseArray<>();
            this.I = new SparseBooleanArray();
        }

        public d(Context context) {
            super(context);
            g();
            this.H = new SparseArray<>();
            this.I = new SparseBooleanArray();
            o(context, true);
        }

        public d(Parameters parameters) {
            super(parameters);
            this.g = parameters.g;
            this.h = parameters.h;
            this.i = parameters.i;
            this.j = parameters.j;
            this.f8306k = parameters.f8297k;
            this.l = parameters.l;
            this.m = parameters.m;
            this.n = parameters.n;
            this.o = parameters.o;
            this.p = parameters.p;
            this.q = parameters.q;
            this.f8307r = parameters.f8298r;
            this.s = parameters.s;
            this.t = parameters.t;
            this.u = parameters.u;
            this.v = parameters.v;
            this.w = parameters.w;
            this.x = parameters.x;
            this.y = parameters.y;
            this.z = parameters.z;
            this.A = parameters.A;
            this.B = parameters.B;
            this.C = parameters.C;
            this.D = parameters.D;
            this.E = parameters.E;
            this.F = parameters.F;
            this.G = parameters.G;
            this.H = f(parameters.H);
            this.I = parameters.I.clone();
        }
    }

    public static final class e implements Comparable<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f8308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f8309b;
        public final boolean c;
        public final boolean d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final boolean i;

        public e(Format format, Parameters parameters, int i, String str) {
            int iT;
            boolean z = false;
            this.f8309b = DefaultTrackSelector.x(i, false);
            int i2 = format.d & (~parameters.f);
            this.c = (i2 & 1) != 0;
            this.d = (i2 & 2) != 0;
            ImmutableList<String> immutableListOf = parameters.c.isEmpty() ? ImmutableList.of("") : parameters.c;
            int i3 = 0;
            while (true) {
                if (i3 >= immutableListOf.size()) {
                    i3 = Integer.MAX_VALUE;
                    iT = 0;
                    break;
                } else {
                    iT = DefaultTrackSelector.t(format, immutableListOf.get(i3), parameters.e);
                    if (iT > 0) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.e = i3;
            this.f = iT;
            int iBitCount = Integer.bitCount(format.e & parameters.d);
            this.g = iBitCount;
            this.i = (format.e & 1088) != 0;
            int iT2 = DefaultTrackSelector.t(format, str, DefaultTrackSelector.D(str) == null);
            this.h = iT2;
            if (iT > 0 || ((parameters.c.isEmpty() && iBitCount > 0) || this.c || (this.d && iT2 > 0))) {
                z = true;
            }
            this.f8308a = z;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(e eVar) {
            u94 u94VarD = u94.k().h(this.f8309b, eVar.f8309b).g(Integer.valueOf(this.e), Integer.valueOf(eVar.e), ich.e().h()).d(this.f, eVar.f).d(this.g, eVar.g).h(this.c, eVar.c).g(Boolean.valueOf(this.d), Boolean.valueOf(eVar.d), this.f == 0 ? ich.e() : ich.e().h()).d(this.h, eVar.h);
            if (this.g == 0) {
                u94VarD = u94VarD.i(this.i, eVar.i);
            }
            return u94VarD.j();
        }
    }

    public static final class f implements Comparable<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f8310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Parameters f8311b;
        public final boolean c;
        public final boolean d;
        public final int e;
        public final int f;
        public final int g;

        /* JADX WARN: Code duplicated, block: B:21:0x0033  */
        /* JADX WARN: Code duplicated, block: B:41:0x005e  */
        public f(Format format, Parameters parameters, int i, boolean z) {
            boolean z2;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            this.f8311b = parameters;
            boolean z3 = true;
            int i8 = 0;
            if (!z || (((i5 = format.q) != -1 && i5 > parameters.g) || ((i6 = format.f7818r) != -1 && i6 > parameters.h))) {
                z2 = false;
            } else {
                float f = format.s;
                if ((f == -1.0f || f <= parameters.i) && ((i7 = format.h) == -1 || i7 <= parameters.j)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            this.f8310a = z2;
            if (!z || (((i2 = format.q) != -1 && i2 < parameters.f8297k) || ((i3 = format.f7818r) != -1 && i3 < parameters.l))) {
                z3 = false;
            } else {
                float f2 = format.s;
                if ((f2 != -1.0f && f2 < parameters.m) || ((i4 = format.h) != -1 && i4 < parameters.n)) {
                    z3 = false;
                }
            }
            this.c = z3;
            this.d = DefaultTrackSelector.x(i, false);
            this.e = format.h;
            this.f = format.e();
            while (i8 < parameters.u.size()) {
                String str = format.l;
                if (str != null && str.equals(parameters.u.get(i8))) {
                    this.g = i8;
                }
                i8++;
            }
            i8 = Integer.MAX_VALUE;
            this.g = i8;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(f fVar) {
            ich ichVarH = (this.f8310a && this.d) ? DefaultTrackSelector.g : DefaultTrackSelector.g.h();
            return u94.k().h(this.d, fVar.d).h(this.f8310a, fVar.f8310a).h(this.c, fVar.c).g(Integer.valueOf(this.g), Integer.valueOf(fVar.g), ich.e().h()).g(Integer.valueOf(this.e), Integer.valueOf(fVar.e), this.f8311b.C ? DefaultTrackSelector.g.h() : DefaultTrackSelector.h).g(Integer.valueOf(this.f), Integer.valueOf(fVar.f), ichVarH).g(Integer.valueOf(this.e), Integer.valueOf(fVar.e), ichVarH).j();
        }
    }

    @Deprecated
    public DefaultTrackSelector() {
        this(Parameters.DEFAULT_WITHOUT_CONTEXT, new com.google.android.exoplayer2.trackselection.a.b());
    }

    public static /* synthetic */ int A(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    public static /* synthetic */ int B(Integer num, Integer num2) {
        return 0;
    }

    public static void C(com.google.android.exoplayer2.trackselection.c.a aVar, int[][][] iArr, skk[] skkVarArr, com.google.android.exoplayer2.trackselection.b[] bVarArr) {
        boolean z;
        boolean z2 = false;
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= aVar.c()) {
                z = true;
                break;
            }
            int iD = aVar.d(i3);
            com.google.android.exoplayer2.trackselection.b bVar = bVarArr[i3];
            if ((iD == 1 || iD == 2) && bVar != null && E(iArr[i3], aVar.e(i3), bVar)) {
                if (iD == 1) {
                    if (i2 != -1) {
                        z = false;
                        break;
                    }
                    i2 = i3;
                } else {
                    if (i != -1) {
                        z = false;
                        break;
                    }
                    i = i3;
                }
            }
            i3++;
        }
        if (i2 != -1 && i != -1) {
            z2 = true;
        }
        if (z && z2) {
            skk skkVar = new skk(true);
            skkVarArr[i2] = skkVar;
            skkVarArr[i] = skkVar;
        }
    }

    public static String D(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean E(int[][] iArr, TrackGroupArray trackGroupArray, com.google.android.exoplayer2.trackselection.b bVar) {
        if (bVar == null) {
            return false;
        }
        int iC = trackGroupArray.c(bVar.f());
        for (int i = 0; i < bVar.length(); i++) {
            if (rkk.s(iArr[iC][bVar.c(i)]) != 32) {
                return false;
            }
        }
        return true;
    }

    public static com.google.android.exoplayer2.trackselection.b.a F(TrackGroupArray trackGroupArray, int[][] iArr, int i, Parameters parameters) {
        Parameters parameters2 = parameters;
        int i2 = parameters2.q ? 24 : 16;
        boolean z = parameters2.p && (i & i2) != 0;
        int i3 = 0;
        while (i3 < trackGroupArray.f8078a) {
            TrackGroup trackGroupA = trackGroupArray.a(i3);
            int i4 = i3;
            int[] iArrS = s(trackGroupA, iArr[i3], z, i2, parameters2.g, parameters2.h, parameters2.i, parameters2.j, parameters2.f8297k, parameters2.l, parameters2.m, parameters2.n, parameters2.f8298r, parameters2.s, parameters2.t);
            if (iArrS.length > 0) {
                return new com.google.android.exoplayer2.trackselection.b.a(trackGroupA, iArrS);
            }
            i3 = i4 + 1;
            parameters2 = parameters;
        }
        return null;
    }

    public static com.google.android.exoplayer2.trackselection.b.a I(TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters) {
        int i = -1;
        TrackGroup trackGroup = null;
        f fVar = null;
        for (int i2 = 0; i2 < trackGroupArray.f8078a; i2++) {
            TrackGroup trackGroupA = trackGroupArray.a(i2);
            List<Integer> listW = w(trackGroupA, parameters.f8298r, parameters.s, parameters.t);
            int[] iArr2 = iArr[i2];
            for (int i3 = 0; i3 < trackGroupA.f8076a; i3++) {
                Format formatA = trackGroupA.a(i3);
                if ((formatA.e & 16384) == 0 && x(iArr2[i3], parameters.E)) {
                    f fVar2 = new f(formatA, parameters, iArr2[i3], listW.contains(Integer.valueOf(i3)));
                    if ((fVar2.f8310a || parameters.o) && (fVar == null || fVar2.compareTo(fVar) > 0)) {
                        trackGroup = trackGroupA;
                        i = i3;
                        fVar = fVar2;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new com.google.android.exoplayer2.trackselection.b.a(trackGroup, i);
    }

    public static void p(TrackGroup trackGroup, int[] iArr, int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int iIntValue = list.get(size).intValue();
            if (!z(trackGroup.a(iIntValue), str, iArr[iIntValue], i, i2, i3, i4, i5, i6, i7, i8, i9)) {
                list.remove(size);
            }
        }
    }

    public static int[] q(TrackGroup trackGroup, int[] iArr, int i, int i2, boolean z, boolean z2, boolean z3) {
        Format formatA = trackGroup.a(i);
        int[] iArr2 = new int[trackGroup.f8076a];
        int i3 = 0;
        for (int i4 = 0; i4 < trackGroup.f8076a; i4++) {
            if (i4 == i || y(trackGroup.a(i4), iArr[i4], formatA, i2, z, z2, z3)) {
                iArr2[i3] = i4;
                i3++;
            }
        }
        return Arrays.copyOf(iArr2, i3);
    }

    public static int r(TrackGroup trackGroup, int[] iArr, int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, List<Integer> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int iIntValue = list.get(i11).intValue();
            if (z(trackGroup.a(iIntValue), str, iArr[iIntValue], i, i2, i3, i4, i5, i6, i7, i8, i9)) {
                i10++;
            }
        }
        return i10;
    }

    public static int[] s(TrackGroup trackGroup, int[] iArr, boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z2) {
        String str;
        int i12;
        int i13;
        HashSet hashSet;
        if (trackGroup.f8076a < 2) {
            return f;
        }
        List<Integer> listW = w(trackGroup, i10, i11, z2);
        if (listW.size() < 2) {
            return f;
        }
        if (z) {
            str = null;
        } else {
            HashSet hashSet2 = new HashSet();
            String str2 = null;
            int i14 = 0;
            int i15 = 0;
            while (i15 < listW.size()) {
                String str3 = trackGroup.a(listW.get(i15).intValue()).l;
                if (hashSet2.add(str3)) {
                    i12 = i14;
                    i13 = i15;
                    hashSet = hashSet2;
                    int iR = r(trackGroup, iArr, i, str3, i2, i3, i4, i5, i6, i7, i8, i9, listW);
                    if (iR > i12) {
                        i14 = iR;
                        str2 = str3;
                    }
                    i15 = i13 + 1;
                    hashSet2 = hashSet;
                } else {
                    i12 = i14;
                    i13 = i15;
                    hashSet = hashSet2;
                }
                i14 = i12;
                i15 = i13 + 1;
                hashSet2 = hashSet;
            }
            str = str2;
        }
        p(trackGroup, iArr, i, str, i2, i3, i4, i5, i6, i7, i8, i9, listW);
        return listW.size() < 2 ? f : ahd.k(listW);
    }

    public static int t(Format format, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(format.c)) {
            return 4;
        }
        String strD = D(str);
        String strD2 = D(format.c);
        if (strD2 == null || strD == null) {
            return (z && strD2 == null) ? 1 : 0;
        }
        if (strD2.startsWith(strD) || strD.startsWith(strD2)) {
            return 3;
        }
        return wlq.N0(strD2, "-")[0].equals(wlq.N0(strD, "-")[0]) ? 2 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x000f  */
    public static Point u(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            if ((i3 > i4) == (i > i2)) {
                i2 = i;
                i = i2;
            }
        } else {
            i2 = i;
            i = i2;
        }
        int i5 = i3 * i;
        int i6 = i4 * i2;
        return i5 >= i6 ? new Point(i2, wlq.l(i6, i3)) : new Point(wlq.l(i5, i4), i);
    }

    public static List<Integer> w(TrackGroup trackGroup, int i, int i2, boolean z) {
        int i3;
        ArrayList arrayList = new ArrayList(trackGroup.f8076a);
        for (int i4 = 0; i4 < trackGroup.f8076a; i4++) {
            arrayList.add(Integer.valueOf(i4));
        }
        if (i != Integer.MAX_VALUE && i2 != Integer.MAX_VALUE) {
            int i5 = Integer.MAX_VALUE;
            for (int i6 = 0; i6 < trackGroup.f8076a; i6++) {
                Format formatA = trackGroup.a(i6);
                int i7 = formatA.q;
                if (i7 > 0 && (i3 = formatA.f7818r) > 0) {
                    Point pointU = u(z, i, i2, i7, i3);
                    int i8 = formatA.q;
                    int i9 = formatA.f7818r;
                    int i10 = i8 * i9;
                    if (i8 >= ((int) (pointU.x * 0.98f)) && i9 >= ((int) (pointU.y * 0.98f)) && i10 < i5) {
                        i5 = i10;
                    }
                }
            }
            if (i5 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int iE = trackGroup.a(((Integer) arrayList.get(size)).intValue()).e();
                    if (iE == -1 || iE > i5) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean x(int i, boolean z) {
        int iP = rkk.p(i);
        return iP == 4 || (z && iP == 3);
    }

    public static boolean y(Format format, int i, Format format2, int i2, boolean z, boolean z2, boolean z3) {
        int i3;
        int i4;
        String str;
        int i5;
        if (!x(i, false) || (i3 = format.h) == -1 || i3 > i2) {
            return false;
        }
        if (!z3 && ((i5 = format.y) == -1 || i5 != format2.y)) {
            return false;
        }
        if (z || ((str = format.l) != null && TextUtils.equals(str, format2.l))) {
            return z2 || ((i4 = format.z) != -1 && i4 == format2.z);
        }
        return false;
    }

    public static boolean z(Format format, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11;
        if ((format.e & 16384) != 0 || !x(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str != null && !wlq.c(format.l, str)) {
            return false;
        }
        int i12 = format.q;
        if (i12 != -1 && (i7 > i12 || i12 > i3)) {
            return false;
        }
        int i13 = format.f7818r;
        if (i13 != -1 && (i8 > i13 || i13 > i4)) {
            return false;
        }
        float f2 = format.s;
        return (f2 == -1.0f || (((float) i9) <= f2 && f2 <= ((float) i5))) && (i11 = format.h) != -1 && i10 <= i11 && i11 <= i6;
    }

    public com.google.android.exoplayer2.trackselection.b.a[] G(com.google.android.exoplayer2.trackselection.c.a aVar, int[][][] iArr, int[] iArr2, Parameters parameters) throws ExoPlaybackException {
        boolean z;
        String str;
        int i;
        b bVar;
        String str2;
        int i2;
        int iC = aVar.c();
        com.google.android.exoplayer2.trackselection.b.a[] aVarArr = new com.google.android.exoplayer2.trackselection.b.a[iC];
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        boolean z3 = false;
        while (true) {
            z = true;
            if (i4 >= iC) {
                break;
            }
            if (2 == aVar.d(i4)) {
                if (!z2) {
                    com.google.android.exoplayer2.trackselection.b.a aVarL = L(aVar.e(i4), iArr[i4], iArr2[i4], parameters, true);
                    aVarArr[i4] = aVarL;
                    z2 = aVarL != null;
                }
                z3 |= aVar.e(i4).f8078a > 0;
            }
            i4++;
        }
        int i5 = 0;
        int i6 = -1;
        b bVar2 = null;
        String str3 = null;
        while (i5 < iC) {
            if (z == aVar.d(i5)) {
                boolean z4 = (parameters.G || !z3) ? z : false;
                i = i6;
                bVar = bVar2;
                str2 = str3;
                i2 = i5;
                Pair<com.google.android.exoplayer2.trackselection.b.a, b> pairH = H(aVar.e(i5), iArr[i5], iArr2[i5], parameters, z4);
                if (pairH != null && (bVar == null || ((b) pairH.second).compareTo(bVar) > 0)) {
                    if (i != -1) {
                        aVarArr[i] = null;
                    }
                    com.google.android.exoplayer2.trackselection.b.a aVar2 = (com.google.android.exoplayer2.trackselection.b.a) pairH.first;
                    aVarArr[i2] = aVar2;
                    str3 = aVar2.f8322a.a(aVar2.f8323b[0]).c;
                    bVar2 = (b) pairH.second;
                    i6 = i2;
                }
                i5 = i2 + 1;
                z = true;
            } else {
                i = i6;
                bVar = bVar2;
                str2 = str3;
                i2 = i5;
            }
            i6 = i;
            bVar2 = bVar;
            str3 = str2;
            i5 = i2 + 1;
            z = true;
        }
        String str4 = str3;
        int i7 = -1;
        e eVar = null;
        while (i3 < iC) {
            int iD = aVar.d(i3);
            if (iD == 1) {
                str = str4;
            } else if (iD == 2) {
                str = str4;
            } else if (iD != 3) {
                aVarArr[i3] = J(iD, aVar.e(i3), iArr[i3], parameters);
                str = str4;
            } else {
                str = str4;
                Pair<com.google.android.exoplayer2.trackselection.b.a, e> pairK = K(aVar.e(i3), iArr[i3], parameters, str);
                if (pairK != null && (eVar == null || ((e) pairK.second).compareTo(eVar) > 0)) {
                    if (i7 != -1) {
                        aVarArr[i7] = null;
                    }
                    aVarArr[i3] = (com.google.android.exoplayer2.trackselection.b.a) pairK.first;
                    eVar = (e) pairK.second;
                    i7 = i3;
                }
            }
            i3++;
            str4 = str;
        }
        return aVarArr;
    }

    public Pair<com.google.android.exoplayer2.trackselection.b.a, b> H(TrackGroupArray trackGroupArray, int[][] iArr, int i, Parameters parameters, boolean z) throws ExoPlaybackException {
        com.google.android.exoplayer2.trackselection.b.a aVar = null;
        int i2 = -1;
        int i3 = -1;
        b bVar = null;
        for (int i4 = 0; i4 < trackGroupArray.f8078a; i4++) {
            TrackGroup trackGroupA = trackGroupArray.a(i4);
            int[] iArr2 = iArr[i4];
            for (int i5 = 0; i5 < trackGroupA.f8076a; i5++) {
                if (x(iArr2[i5], parameters.E)) {
                    b bVar2 = new b(trackGroupA.a(i5), parameters, iArr2[i5]);
                    if ((bVar2.f8301a || parameters.x) && (bVar == null || bVar2.compareTo(bVar) > 0)) {
                        i2 = i4;
                        i3 = i5;
                        bVar = bVar2;
                    }
                }
            }
        }
        if (i2 == -1) {
            return null;
        }
        TrackGroup trackGroupA2 = trackGroupArray.a(i2);
        if (!parameters.D && !parameters.C && z) {
            int[] iArrQ = q(trackGroupA2, iArr[i2], i3, parameters.w, parameters.y, parameters.z, parameters.A);
            if (iArrQ.length > 1) {
                aVar = new com.google.android.exoplayer2.trackselection.b.a(trackGroupA2, iArrQ);
            }
        }
        if (aVar == null) {
            aVar = new com.google.android.exoplayer2.trackselection.b.a(trackGroupA2, i3);
        }
        return Pair.create(aVar, (b) rk1.e(bVar));
    }

    public com.google.android.exoplayer2.trackselection.b.a J(int i, TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters) throws ExoPlaybackException {
        TrackGroup trackGroup = null;
        c cVar = null;
        int i2 = 0;
        for (int i3 = 0; i3 < trackGroupArray.f8078a; i3++) {
            TrackGroup trackGroupA = trackGroupArray.a(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < trackGroupA.f8076a; i4++) {
                if (x(iArr2[i4], parameters.E)) {
                    c cVar2 = new c(trackGroupA.a(i4), iArr2[i4]);
                    if (cVar == null || cVar2.compareTo(cVar) > 0) {
                        trackGroup = trackGroupA;
                        i2 = i4;
                        cVar = cVar2;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new com.google.android.exoplayer2.trackselection.b.a(trackGroup, i2);
    }

    public Pair<com.google.android.exoplayer2.trackselection.b.a, e> K(TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters, String str) throws ExoPlaybackException {
        int i = -1;
        TrackGroup trackGroup = null;
        e eVar = null;
        for (int i2 = 0; i2 < trackGroupArray.f8078a; i2++) {
            TrackGroup trackGroupA = trackGroupArray.a(i2);
            int[] iArr2 = iArr[i2];
            for (int i3 = 0; i3 < trackGroupA.f8076a; i3++) {
                if (x(iArr2[i3], parameters.E)) {
                    e eVar2 = new e(trackGroupA.a(i3), parameters, iArr2[i3], str);
                    if (eVar2.f8308a && (eVar == null || eVar2.compareTo(eVar) > 0)) {
                        trackGroup = trackGroupA;
                        i = i3;
                        eVar = eVar2;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return Pair.create(new com.google.android.exoplayer2.trackselection.b.a(trackGroup, i), (e) rk1.e(eVar));
    }

    public com.google.android.exoplayer2.trackselection.b.a L(TrackGroupArray trackGroupArray, int[][] iArr, int i, Parameters parameters, boolean z) throws ExoPlaybackException {
        com.google.android.exoplayer2.trackselection.b.a aVarF = (parameters.D || parameters.C || !z) ? null : F(trackGroupArray, iArr, i, parameters);
        return aVarF == null ? I(trackGroupArray, iArr, parameters) : aVarF;
    }

    public void M(Parameters parameters) {
        rk1.e(parameters);
        if (this.e.getAndSet(parameters).equals(parameters)) {
            return;
        }
        c();
    }

    public void N(d dVar) {
        M(dVar.a());
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public final Pair<skk[], com.google.android.exoplayer2.trackselection.b[]> j(com.google.android.exoplayer2.trackselection.c.a aVar, int[][][] iArr, int[] iArr2, k.a aVar2, v vVar) throws ExoPlaybackException {
        Parameters parameters = this.e.get();
        int iC = aVar.c();
        com.google.android.exoplayer2.trackselection.b.a[] aVarArrG = G(aVar, iArr, iArr2, parameters);
        int i = 0;
        while (true) {
            if (i >= iC) {
                break;
            }
            if (parameters.i(i)) {
                aVarArrG[i] = null;
            } else {
                TrackGroupArray trackGroupArrayE = aVar.e(i);
                if (parameters.k(i, trackGroupArrayE)) {
                    SelectionOverride selectionOverrideJ = parameters.j(i, trackGroupArrayE);
                    aVarArrG[i] = selectionOverrideJ != null ? new com.google.android.exoplayer2.trackselection.b.a(trackGroupArrayE.a(selectionOverrideJ.f8299a), selectionOverrideJ.f8300b, selectionOverrideJ.d) : null;
                }
            }
            i++;
        }
        com.google.android.exoplayer2.trackselection.b[] bVarArrA = this.d.a(aVarArrG, a(), aVar2, vVar);
        skk[] skkVarArr = new skk[iC];
        for (int i2 = 0; i2 < iC; i2++) {
            skkVarArr[i2] = (parameters.i(i2) || (aVar.d(i2) != 7 && bVarArrA[i2] == null)) ? null : skk.f33739b;
        }
        if (parameters.F) {
            C(aVar, iArr, skkVarArr, bVarArrA);
        }
        return Pair.create(skkVarArr, bVarArrA);
    }

    public d o() {
        return v().g();
    }

    public Parameters v() {
        return this.e.get();
    }

    public DefaultTrackSelector(Context context) {
        this(context, new com.google.android.exoplayer2.trackselection.a.b());
    }

    public DefaultTrackSelector(Context context, com.google.android.exoplayer2.trackselection.b.InterfaceC0203b interfaceC0203b) {
        this(Parameters.h(context), interfaceC0203b);
    }

    public DefaultTrackSelector(Parameters parameters, com.google.android.exoplayer2.trackselection.b.InterfaceC0203b interfaceC0203b) {
        this.d = interfaceC0203b;
        this.e = new AtomicReference<>(parameters);
    }

    public static final class Parameters extends TrackSelectionParameters {
        public final boolean A;
        public final ImmutableList<String> B;
        public final boolean C;
        public final boolean D;
        public final boolean E;
        public final boolean F;
        public final boolean G;
        public final SparseArray<Map<TrackGroupArray, SelectionOverride>> H;
        public final SparseBooleanArray I;
        public final int g;
        public final int h;
        public final int i;
        public final int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f8297k;
        public final int l;
        public final int m;
        public final int n;
        public final boolean o;
        public final boolean p;
        public final boolean q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f8298r;
        public final int s;
        public final boolean t;
        public final ImmutableList<String> u;
        public final int v;
        public final int w;
        public final boolean x;
        public final boolean y;
        public final boolean z;
        public static final Parameters DEFAULT_WITHOUT_CONTEXT = new d().a();
        public static final Parcelable.Creator<Parameters> CREATOR = new a();

        public class a implements Parcelable.Creator<Parameters> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Parameters createFromParcel(Parcel parcel) {
                return new Parameters(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Parameters[] newArray(int i) {
                return new Parameters[i];
            }
        }

        public Parameters(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, boolean z2, boolean z3, int i9, int i10, boolean z4, ImmutableList<String> immutableList, ImmutableList<String> immutableList2, int i11, int i12, int i13, boolean z5, boolean z6, boolean z7, boolean z8, ImmutableList<String> immutableList3, ImmutableList<String> immutableList4, int i14, boolean z9, int i15, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseBooleanArray sparseBooleanArray) {
            super(immutableList2, i11, immutableList4, i14, z9, i15);
            this.g = i;
            this.h = i2;
            this.i = i3;
            this.j = i4;
            this.f8297k = i5;
            this.l = i6;
            this.m = i7;
            this.n = i8;
            this.o = z;
            this.p = z2;
            this.q = z3;
            this.f8298r = i9;
            this.s = i10;
            this.t = z4;
            this.u = immutableList;
            this.v = i12;
            this.w = i13;
            this.x = z5;
            this.y = z6;
            this.z = z7;
            this.A = z8;
            this.B = immutableList3;
            this.C = z10;
            this.D = z11;
            this.E = z12;
            this.F = z13;
            this.G = z14;
            this.H = sparseArray;
            this.I = sparseBooleanArray;
        }

        public static boolean d(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }

        public static boolean e(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (iIndexOfKey < 0 || !f(sparseArray.valueAt(i), sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        public static boolean f(Map<TrackGroupArray, SelectionOverride> map, Map<TrackGroupArray, SelectionOverride> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<TrackGroupArray, SelectionOverride> entry : map.entrySet()) {
                TrackGroupArray key = entry.getKey();
                if (!map2.containsKey(key) || !wlq.c(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }

        public static Parameters h(Context context) {
            return new d(context).a();
        }

        public static SparseArray<Map<TrackGroupArray, SelectionOverride>> l(Parcel parcel) {
            int i = parcel.readInt();
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray = new SparseArray<>(i);
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = parcel.readInt();
                int i4 = parcel.readInt();
                HashMap map = new HashMap(i4);
                for (int i5 = 0; i5 < i4; i5++) {
                    map.put((TrackGroupArray) rk1.e((TrackGroupArray) parcel.readParcelable(TrackGroupArray.class.getClassLoader())), (SelectionOverride) parcel.readParcelable(SelectionOverride.class.getClassLoader()));
                }
                sparseArray.put(i3, map);
            }
            return sparseArray;
        }

        public static void m(Parcel parcel, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                int iKeyAt = sparseArray.keyAt(i);
                Map<TrackGroupArray, SelectionOverride> mapValueAt = sparseArray.valueAt(i);
                int size2 = mapValueAt.size();
                parcel.writeInt(iKeyAt);
                parcel.writeInt(size2);
                for (Map.Entry<TrackGroupArray, SelectionOverride> entry : mapValueAt.entrySet()) {
                    parcel.writeParcelable(entry.getKey(), 0);
                    parcel.writeParcelable(entry.getValue(), 0);
                }
            }
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Parameters.class != obj.getClass()) {
                return false;
            }
            Parameters parameters = (Parameters) obj;
            return super.equals(obj) && this.g == parameters.g && this.h == parameters.h && this.i == parameters.i && this.j == parameters.j && this.f8297k == parameters.f8297k && this.l == parameters.l && this.m == parameters.m && this.n == parameters.n && this.o == parameters.o && this.p == parameters.p && this.q == parameters.q && this.t == parameters.t && this.f8298r == parameters.f8298r && this.s == parameters.s && this.u.equals(parameters.u) && this.v == parameters.v && this.w == parameters.w && this.x == parameters.x && this.y == parameters.y && this.z == parameters.z && this.A == parameters.A && this.B.equals(parameters.B) && this.C == parameters.C && this.D == parameters.D && this.E == parameters.E && this.F == parameters.F && this.G == parameters.G && d(this.I, parameters.I) && e(this.H, parameters.H);
        }

        public d g() {
            return new d(this);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((((((((((((((((((((super.hashCode() * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31) + this.f8297k) * 31) + this.l) * 31) + this.m) * 31) + this.n) * 31) + (this.o ? 1 : 0)) * 31) + (this.p ? 1 : 0)) * 31) + (this.q ? 1 : 0)) * 31) + (this.t ? 1 : 0)) * 31) + this.f8298r) * 31) + this.s) * 31) + this.u.hashCode()) * 31) + this.v) * 31) + this.w) * 31) + (this.x ? 1 : 0)) * 31) + (this.y ? 1 : 0)) * 31) + (this.z ? 1 : 0)) * 31) + (this.A ? 1 : 0)) * 31) + this.B.hashCode()) * 31) + (this.C ? 1 : 0)) * 31) + (this.D ? 1 : 0)) * 31) + (this.E ? 1 : 0)) * 31) + (this.F ? 1 : 0)) * 31) + (this.G ? 1 : 0);
        }

        public final boolean i(int i) {
            return this.I.get(i);
        }

        public final SelectionOverride j(int i, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, SelectionOverride> map = this.H.get(i);
            if (map != null) {
                return map.get(trackGroupArray);
            }
            return null;
        }

        public final boolean k(int i, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, SelectionOverride> map = this.H.get(i);
            return map != null && map.containsKey(trackGroupArray);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
            parcel.writeInt(this.f8297k);
            parcel.writeInt(this.l);
            parcel.writeInt(this.m);
            parcel.writeInt(this.n);
            wlq.X0(parcel, this.o);
            wlq.X0(parcel, this.p);
            wlq.X0(parcel, this.q);
            parcel.writeInt(this.f8298r);
            parcel.writeInt(this.s);
            wlq.X0(parcel, this.t);
            parcel.writeList(this.u);
            parcel.writeInt(this.v);
            parcel.writeInt(this.w);
            wlq.X0(parcel, this.x);
            wlq.X0(parcel, this.y);
            wlq.X0(parcel, this.z);
            wlq.X0(parcel, this.A);
            parcel.writeList(this.B);
            wlq.X0(parcel, this.C);
            wlq.X0(parcel, this.D);
            wlq.X0(parcel, this.E);
            wlq.X0(parcel, this.F);
            wlq.X0(parcel, this.G);
            m(parcel, this.H);
            parcel.writeSparseBooleanArray(this.I);
        }

        public Parameters(Parcel parcel) {
            super(parcel);
            this.g = parcel.readInt();
            this.h = parcel.readInt();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
            this.f8297k = parcel.readInt();
            this.l = parcel.readInt();
            this.m = parcel.readInt();
            this.n = parcel.readInt();
            this.o = wlq.F0(parcel);
            this.p = wlq.F0(parcel);
            this.q = wlq.F0(parcel);
            this.f8298r = parcel.readInt();
            this.s = parcel.readInt();
            this.t = wlq.F0(parcel);
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, null);
            this.u = ImmutableList.copyOf((Collection) arrayList);
            this.v = parcel.readInt();
            this.w = parcel.readInt();
            this.x = wlq.F0(parcel);
            this.y = wlq.F0(parcel);
            this.z = wlq.F0(parcel);
            this.A = wlq.F0(parcel);
            ArrayList arrayList2 = new ArrayList();
            parcel.readList(arrayList2, null);
            this.B = ImmutableList.copyOf((Collection) arrayList2);
            this.C = wlq.F0(parcel);
            this.D = wlq.F0(parcel);
            this.E = wlq.F0(parcel);
            this.F = wlq.F0(parcel);
            this.G = wlq.F0(parcel);
            this.H = l(parcel);
            this.I = (SparseBooleanArray) wlq.j(parcel.readSparseBooleanArray());
        }
    }
}
