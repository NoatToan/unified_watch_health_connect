package androidx.health.platform.client.proto;

import defpackage.pee;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CodedOutputStream f2506a;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2507a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f2507a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2507a[WireFormat.FieldType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2507a[WireFormat.FieldType.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2507a[WireFormat.FieldType.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2507a[WireFormat.FieldType.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2507a[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2507a[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2507a[WireFormat.FieldType.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2507a[WireFormat.FieldType.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2507a[WireFormat.FieldType.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2507a[WireFormat.FieldType.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2507a[WireFormat.FieldType.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public j(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) f0.b(codedOutputStream, "output");
        this.f2506a = codedOutputStream2;
        codedOutputStream2.f2452a = this;
    }

    public static j P(CodedOutputStream codedOutputStream) {
        j jVar = codedOutputStream.f2452a;
        return jVar != null ? jVar : new j(codedOutputStream);
    }

    @Override // androidx.health.platform.client.proto.Writer
    public void A(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f2506a.L0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f2506a.T0(i, 2);
        int iN = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iN += CodedOutputStream.N(list.get(i3).longValue());
        }
        this.f2506a.V0(iN);
        while (i2 < list.size()) {
            this.f2506a.M0(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // androidx.health.platform.client.proto.Writer
    public Writer.FieldOrder B() {
        return Writer.FieldOrder.ASCENDING;
    }

    @Override // androidx.health.platform.client.proto.Writer
    public void C(int i, long j) throws IOException {
        this.f2506a.D0(i, j);
    }

    @Override // androidx.health.platform.client.proto.Writer
    public void D(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f2506a.J0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f2506a.T0(i, 2);
        int iL = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iL += CodedOutputStream.L(list.get(i3).intValue());
        }
        this.f2506a.V0(iL);
        while (i2 < list.size()) {
            this.f2506a.K0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // androidx.health.platform.client.proto.Writer
    public void E(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f2506a.h0(i, list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        this.f2506a.T0(i, 2);
        int iF = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iF += CodedOutputStream.f(list.get(i3).booleanValue());
        }
        this.f2506a.V0(iF);
        while (i2 < list.size()) {
            this.f2506a.i0(list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // androidx.health.platform.client.proto.Writer
    public void F(int i, float f) throws IOException {
        this.f2506a.v0(i, f);
    }

    @Override // androidx.health.platform.client.proto.Writer
    public void G(int i, int i2) throws IOException {
        this.f2506a.p0(i, i2);
    }

    @Override // androidx.health.platform.client.proto.Writer
    public void H(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f2506a.D0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f2506a.T0(i, 2);
        int iZ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZ += CodedOutputStream.z(list.get(i3).longValue());
        }
        this.f2506a.V0(iZ);
        while (i2 < list.size()) {
            this.f2506a.E0(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // androidx.health.platform.client.proto.Writer
    public void I(int i, int i2) throws IOException {
        this.f2506a.N0(i, i2);
    }

    @Override // androidx.health.platform.client.proto.Writer
    public void J(int i, ByteString byteString) throws IOException {
        this.f2506a.l0(i, byteString);
    }

    @Override // androidx.health.platform.client.proto.Writer
    public void K(int i, Object obj, w1 w1Var) throws IOException {
        this.f2506a.F0(i, (o0) obj, w1Var);
    }

    @Override // androidx.health.platform.client.proto.Writer
    public void L(int i, List<?> list, w1 w1Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            K(i, list.get(i2), w1Var);
        }
    }

    @Override // androidx.health.platform.client.proto.Writer
    public void M(int i, Object obj, w1 w1Var) throws IOException {
        this.f2506a.y0(i, (o0) obj, w1Var);
    }

    @Override // androidx.health.platform.client.proto.Writer
    public <K, V> void N(int i, l0.a<K, V> aVar, Map<K, V> map) throws IOException {
        if (this.f2506a.c0()) {
            T(i, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f2506a.T0(i, 2);
            this.f2506a.V0(l0.b(aVar, entry.getKey(), entry.getValue()));
            l0.e(this.f2506a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.health.platform.client.proto.Writer
    public void O(int i, List<?> list, w1 w1Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            M(i, list.get(i2), w1Var);
        }
    }

    public final <V> void Q(int i, boolean z, V v, l0.a<Boolean, V> aVar) throws IOException {
        this.f2506a.T0(i, 2);
        this.f2506a.V0(l0.b(aVar, Boolean.valueOf(z), v));
        l0.e(this.f2506a, aVar, Boolean.valueOf(z), v);
    }

    public final <V> void R(int i, l0.a<Integer, V> aVar, Map<Integer, V> map) throws IOException {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = it.next().intValue();
            i2++;
        }
        Arrays.sort(iArr);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            V v = map.get(Integer.valueOf(i4));
            this.f2506a.T0(i, 2);
            this.f2506a.V0(l0.b(aVar, Integer.valueOf(i4), v));
            l0.e(this.f2506a, aVar, Integer.valueOf(i4), v);
        }
    }

    public final <V> void S(int i, l0.a<Long, V> aVar, Map<Long, V> map) throws IOException {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator<Long> it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            jArr[i2] = it.next().longValue();
            i2++;
        }
        Arrays.sort(jArr);
        for (int i3 = 0; i3 < size; i3++) {
            long j = jArr[i3];
            V v = map.get(Long.valueOf(j));
            this.f2506a.T0(i, 2);
            this.f2506a.V0(l0.b(aVar, Long.valueOf(j), v));
            l0.e(this.f2506a, aVar, Long.valueOf(j), v);
        }
    }

    public final <K, V> void T(int i, l0.a<K, V> aVar, Map<K, V> map) throws IOException {
        switch (a.f2507a[aVar.f2516a.ordinal()]) {
            case 1:
                V v = map.get(Boolean.FALSE);
                if (v != null) {
                    Q(i, false, v, aVar);
                }
                V v2 = map.get(Boolean.TRUE);
                if (v2 != null) {
                    Q(i, true, v2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                R(i, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                S(i, aVar, map);
                return;
            case 12:
                U(i, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f2516a);
        }
    }

    public final <V> void U(int i, l0.a<String, V> aVar, Map<String, V> map) throws IOException {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator<String> it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            strArr[i2] = it.next();
            i2++;
        }
        Arrays.sort(strArr);
        for (int i3 = 0; i3 < size; i3++) {
            String str = strArr[i3];
            V v = map.get(str);
            this.f2506a.T0(i, 2);
            this.f2506a.V0(l0.b(aVar, str, v));
            l0.e(this.f2506a, aVar, str, v);
        }
    }

    public final void V(int i, Object obj) throws IOException {
        if (obj instanceof String) {
            this.f2506a.R0(i, (String) obj);
        } else {
            this.f2506a.l0(i, (ByteString) obj);
        }
    }

    @Override // androidx.health.platform.client.proto.Writer
    public void a(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f2506a.v0(i, list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        this.f2506a.T0(i, 2);
        int iS = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iS += CodedOutputStream.s(list.get(i3).floatValue());
        }
        this.f2506a.V0(iS);
        while (i2 < list.size()) {
            this.f2506a.w0(list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // androidx.health.platform.client.proto.Writer
    public final void b(int i, Object obj) throws IOException {
        if (obj instanceof ByteString) {
            this.f2506a.I0(i, (ByteString) obj);
        } else {
            this.f2506a.H0(i, (o0) obj);
        }
    }

    @Override // androidx.health.platform.client.proto.Writer
    public void c(int i, int i2) throws IOException {
        this.f2506a.r0(i, i2);
    }

    @Override // androidx.health.platform.client.proto.Writer
    public void d(int i, String str) throws IOException {
        this.f2506a.R0(i, str);
    }

    @Override // androidx.health.platform.client.proto.Writer
    public void e(int i, long j) throws IOException {
        this.f2506a.W0(i, j);
    }

    @Override // androidx.health.platform.client.proto.Writer
    public void f(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f2506a.B0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f2506a.T0(i, 2);
        int iX = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iX += CodedOutputStream.x(list.get(i3).intValue());
        }
        this.f2506a.V0(iX);
        while (i2 < list.size()) {
            this.f2506a.C0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // androidx.health.platform.client.proto.Writer
    public void g(int i, int i2) throws IOException {
        this.f2506a.B0(i, i2);
    }

    @Override // androidx.health.platform.client.proto.Writer
    public void h(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f2506a.r0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f2506a.T0(i, 2);
        int iO = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iO += CodedOutputStream.o(list.get(i3).intValue());
        }
        this.f2506a.V0(iO);
        while (i2 < list.size()) {
            this.f2506a.s0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // androidx.health.platform.client.proto.Writer
    public void i(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f2506a.U0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f2506a.T0(i, 2);
        int iW = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iW += CodedOutputStream.W(list.get(i3).intValue());
        }
        this.f2506a.V0(iW);
        while (i2 < list.size()) {
            this.f2506a.V0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // androidx.health.platform.client.proto.Writer
    public void j(int i, long j) throws IOException {
        this.f2506a.P0(i, j);
    }

    @Override // androidx.health.platform.client.proto.Writer
    public void k(int i, int i2) throws IOException {
        this.f2506a.U0(i, i2);
    }

    @Override // androidx.health.platform.client.proto.Writer
    public void l(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f2506a.W0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f2506a.T0(i, 2);
        int iY = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iY += CodedOutputStream.Y(list.get(i3).longValue());
        }
        this.f2506a.V0(iY);
        while (i2 < list.size()) {
            this.f2506a.X0(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // androidx.health.platform.client.proto.Writer
    public void m(int i, long j) throws IOException {
        this.f2506a.t0(i, j);
    }

    @Override // androidx.health.platform.client.proto.Writer
    public void n(int i, boolean z) throws IOException {
        this.f2506a.h0(i, z);
    }

    @Override // androidx.health.platform.client.proto.Writer
    public void o(int i, int i2) throws IOException {
        this.f2506a.J0(i, i2);
    }

    @Override // androidx.health.platform.client.proto.Writer
    @Deprecated
    public void p(int i) throws IOException {
        this.f2506a.T0(i, 3);
    }

    @Override // androidx.health.platform.client.proto.Writer
    public void q(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f2506a.t0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f2506a.T0(i, 2);
        int iQ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iQ += CodedOutputStream.q(list.get(i3).longValue());
        }
        this.f2506a.V0(iQ);
        while (i2 < list.size()) {
            this.f2506a.u0(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // androidx.health.platform.client.proto.Writer
    @Deprecated
    public void r(int i) throws IOException {
        this.f2506a.T0(i, 4);
    }

    @Override // androidx.health.platform.client.proto.Writer
    public void s(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f2506a.N0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f2506a.T0(i, 2);
        int iP = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iP += CodedOutputStream.P(list.get(i3).intValue());
        }
        this.f2506a.V0(iP);
        while (i2 < list.size()) {
            this.f2506a.O0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // androidx.health.platform.client.proto.Writer
    public void t(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f2506a.n0(i, list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        this.f2506a.T0(i, 2);
        int iK = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iK += CodedOutputStream.k(list.get(i3).doubleValue());
        }
        this.f2506a.V0(iK);
        while (i2 < list.size()) {
            this.f2506a.o0(list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // androidx.health.platform.client.proto.Writer
    public void u(int i, List<ByteString> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f2506a.l0(i, list.get(i2));
        }
    }

    @Override // androidx.health.platform.client.proto.Writer
    public void v(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (!(list instanceof pee)) {
            while (i2 < list.size()) {
                this.f2506a.R0(i, list.get(i2));
                i2++;
            }
        } else {
            pee peeVar = (pee) list;
            while (i2 < list.size()) {
                V(i, peeVar.d(i2));
                i2++;
            }
        }
    }

    @Override // androidx.health.platform.client.proto.Writer
    public void w(int i, long j) throws IOException {
        this.f2506a.L0(i, j);
    }

    @Override // androidx.health.platform.client.proto.Writer
    public void x(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f2506a.P0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f2506a.T0(i, 2);
        int iR = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iR += CodedOutputStream.R(list.get(i3).longValue());
        }
        this.f2506a.V0(iR);
        while (i2 < list.size()) {
            this.f2506a.Q0(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // androidx.health.platform.client.proto.Writer
    public void y(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f2506a.p0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f2506a.T0(i, 2);
        int iM = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM += CodedOutputStream.m(list.get(i3).intValue());
        }
        this.f2506a.V0(iM);
        while (i2 < list.size()) {
            this.f2506a.q0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // androidx.health.platform.client.proto.Writer
    public void z(int i, double d) throws IOException {
        this.f2506a.n0(i, d);
    }
}
