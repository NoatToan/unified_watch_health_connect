package com.google.protobuf;

import defpackage.ree;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CodedOutputStream f9687a;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9688a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f9688a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9688a[WireFormat.FieldType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9688a[WireFormat.FieldType.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9688a[WireFormat.FieldType.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9688a[WireFormat.FieldType.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9688a[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9688a[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9688a[WireFormat.FieldType.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9688a[WireFormat.FieldType.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9688a[WireFormat.FieldType.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9688a[WireFormat.FieldType.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9688a[WireFormat.FieldType.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public l(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) d0.b(codedOutputStream, "output");
        this.f9687a = codedOutputStream2;
        codedOutputStream2.f9463a = this;
    }

    public static l T(CodedOutputStream codedOutputStream) {
        l lVar = codedOutputStream.f9463a;
        return lVar != null ? lVar : new l(codedOutputStream);
    }

    @Override // com.google.protobuf.Writer
    public void A(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9687a.S0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f9687a.a1(i, 2);
        int iQ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iQ += CodedOutputStream.Q(list.get(i3).longValue());
        }
        this.f9687a.c1(iQ);
        while (i2 < list.size()) {
            this.f9687a.T0(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    public Writer.FieldOrder B() {
        return Writer.FieldOrder.ASCENDING;
    }

    @Override // com.google.protobuf.Writer
    public void C(int i, long j) throws IOException {
        this.f9687a.I0(i, j);
    }

    @Override // com.google.protobuf.Writer
    public void D(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9687a.Q0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f9687a.a1(i, 2);
        int iO = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iO += CodedOutputStream.O(list.get(i3).intValue());
        }
        this.f9687a.c1(iO);
        while (i2 < list.size()) {
            this.f9687a.R0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void E(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9687a.m0(i, list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        this.f9687a.a1(i, 2);
        int iF = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iF += CodedOutputStream.f(list.get(i3).booleanValue());
        }
        this.f9687a.c1(iF);
        while (i2 < list.size()) {
            this.f9687a.n0(list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void F(int i, float f) throws IOException {
        this.f9687a.A0(i, f);
    }

    @Override // com.google.protobuf.Writer
    public void G(int i, int i2) throws IOException {
        this.f9687a.u0(i, i2);
    }

    @Override // com.google.protobuf.Writer
    public void H(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9687a.I0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f9687a.a1(i, 2);
        int iA = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iA += CodedOutputStream.A(list.get(i3).longValue());
        }
        this.f9687a.c1(iA);
        while (i2 < list.size()) {
            this.f9687a.J0(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void I(int i, int i2) throws IOException {
        this.f9687a.U0(i, i2);
    }

    @Override // com.google.protobuf.Writer
    public void J(int i, List<?> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            S(i, list.get(i2));
        }
    }

    @Override // com.google.protobuf.Writer
    public void K(int i, ByteString byteString) throws IOException {
        this.f9687a.q0(i, byteString);
    }

    @Override // com.google.protobuf.Writer
    public void L(int i, List<?> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            R(i, list.get(i2));
        }
    }

    @Override // com.google.protobuf.Writer
    public <K, V> void M(int i, k0.b<K, V> bVar, Map<K, V> map) throws IOException {
        if (this.f9687a.g0()) {
            X(i, bVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f9687a.a1(i, 2);
            this.f9687a.c1(k0.b(bVar, entry.getKey(), entry.getValue()));
            k0.f(this.f9687a, bVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.protobuf.Writer
    public void N(int i, List<?> list, e1 e1Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            Q(i, list.get(i2), e1Var);
        }
    }

    @Override // com.google.protobuf.Writer
    public void O(int i, Object obj, e1 e1Var) throws IOException {
        this.f9687a.D0(i, (q0) obj, e1Var);
    }

    @Override // com.google.protobuf.Writer
    public void P(int i, List<?> list, e1 e1Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            O(i, list.get(i2), e1Var);
        }
    }

    @Override // com.google.protobuf.Writer
    public void Q(int i, Object obj, e1 e1Var) throws IOException {
        this.f9687a.L0(i, (q0) obj, e1Var);
    }

    @Override // com.google.protobuf.Writer
    public void R(int i, Object obj) throws IOException {
        this.f9687a.K0(i, (q0) obj);
    }

    @Override // com.google.protobuf.Writer
    public void S(int i, Object obj) throws IOException {
        this.f9687a.C0(i, (q0) obj);
    }

    public final <V> void U(int i, boolean z, V v, k0.b<Boolean, V> bVar) throws IOException {
        this.f9687a.a1(i, 2);
        this.f9687a.c1(k0.b(bVar, Boolean.valueOf(z), v));
        k0.f(this.f9687a, bVar, Boolean.valueOf(z), v);
    }

    public final <V> void V(int i, k0.b<Integer, V> bVar, Map<Integer, V> map) throws IOException {
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
            this.f9687a.a1(i, 2);
            this.f9687a.c1(k0.b(bVar, Integer.valueOf(i4), v));
            k0.f(this.f9687a, bVar, Integer.valueOf(i4), v);
        }
    }

    public final <V> void W(int i, k0.b<Long, V> bVar, Map<Long, V> map) throws IOException {
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
            this.f9687a.a1(i, 2);
            this.f9687a.c1(k0.b(bVar, Long.valueOf(j), v));
            k0.f(this.f9687a, bVar, Long.valueOf(j), v);
        }
    }

    public final <K, V> void X(int i, k0.b<K, V> bVar, Map<K, V> map) throws IOException {
        switch (a.f9688a[bVar.f9683a.ordinal()]) {
            case 1:
                V v = map.get(Boolean.FALSE);
                if (v != null) {
                    U(i, false, v, bVar);
                }
                V v2 = map.get(Boolean.TRUE);
                if (v2 != null) {
                    U(i, true, v2, bVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                V(i, bVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                W(i, bVar, map);
                return;
            case 12:
                Y(i, bVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + bVar.f9683a);
        }
    }

    public final <V> void Y(int i, k0.b<String, V> bVar, Map<String, V> map) throws IOException {
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
            this.f9687a.a1(i, 2);
            this.f9687a.c1(k0.b(bVar, str, v));
            k0.f(this.f9687a, bVar, str, v);
        }
    }

    public final void Z(int i, Object obj) throws IOException {
        if (obj instanceof String) {
            this.f9687a.Y0(i, (String) obj);
        } else {
            this.f9687a.q0(i, (ByteString) obj);
        }
    }

    @Override // com.google.protobuf.Writer
    public void a(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9687a.A0(i, list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        this.f9687a.a1(i, 2);
        int iS = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iS += CodedOutputStream.s(list.get(i3).floatValue());
        }
        this.f9687a.c1(iS);
        while (i2 < list.size()) {
            this.f9687a.B0(list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    public final void b(int i, Object obj) throws IOException {
        if (obj instanceof ByteString) {
            this.f9687a.O0(i, (ByteString) obj);
        } else {
            this.f9687a.N0(i, (q0) obj);
        }
    }

    @Override // com.google.protobuf.Writer
    public void c(int i, int i2) throws IOException {
        this.f9687a.w0(i, i2);
    }

    @Override // com.google.protobuf.Writer
    public void d(int i, String str) throws IOException {
        this.f9687a.Y0(i, str);
    }

    @Override // com.google.protobuf.Writer
    public void e(int i, long j) throws IOException {
        this.f9687a.d1(i, j);
    }

    @Override // com.google.protobuf.Writer
    public void f(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9687a.G0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f9687a.a1(i, 2);
        int iY = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iY += CodedOutputStream.y(list.get(i3).intValue());
        }
        this.f9687a.c1(iY);
        while (i2 < list.size()) {
            this.f9687a.H0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void g(int i, int i2) throws IOException {
        this.f9687a.G0(i, i2);
    }

    @Override // com.google.protobuf.Writer
    public void h(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9687a.w0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f9687a.a1(i, 2);
        int iO = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iO += CodedOutputStream.o(list.get(i3).intValue());
        }
        this.f9687a.c1(iO);
        while (i2 < list.size()) {
            this.f9687a.x0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void i(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9687a.b1(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f9687a.a1(i, 2);
        int iZ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZ += CodedOutputStream.Z(list.get(i3).intValue());
        }
        this.f9687a.c1(iZ);
        while (i2 < list.size()) {
            this.f9687a.c1(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void j(int i, long j) throws IOException {
        this.f9687a.W0(i, j);
    }

    @Override // com.google.protobuf.Writer
    public void k(int i, int i2) throws IOException {
        this.f9687a.b1(i, i2);
    }

    @Override // com.google.protobuf.Writer
    public void l(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9687a.d1(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f9687a.a1(i, 2);
        int iB0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iB0 += CodedOutputStream.b0(list.get(i3).longValue());
        }
        this.f9687a.c1(iB0);
        while (i2 < list.size()) {
            this.f9687a.e1(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void m(int i, long j) throws IOException {
        this.f9687a.y0(i, j);
    }

    @Override // com.google.protobuf.Writer
    public void n(int i, boolean z) throws IOException {
        this.f9687a.m0(i, z);
    }

    @Override // com.google.protobuf.Writer
    public void o(int i, int i2) throws IOException {
        this.f9687a.Q0(i, i2);
    }

    @Override // com.google.protobuf.Writer
    public void p(int i) throws IOException {
        this.f9687a.a1(i, 3);
    }

    @Override // com.google.protobuf.Writer
    public void q(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9687a.y0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f9687a.a1(i, 2);
        int iQ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iQ += CodedOutputStream.q(list.get(i3).longValue());
        }
        this.f9687a.c1(iQ);
        while (i2 < list.size()) {
            this.f9687a.z0(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void r(int i) throws IOException {
        this.f9687a.a1(i, 4);
    }

    @Override // com.google.protobuf.Writer
    public void s(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9687a.U0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f9687a.a1(i, 2);
        int iS = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iS += CodedOutputStream.S(list.get(i3).intValue());
        }
        this.f9687a.c1(iS);
        while (i2 < list.size()) {
            this.f9687a.V0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void t(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9687a.s0(i, list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        this.f9687a.a1(i, 2);
        int iK = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iK += CodedOutputStream.k(list.get(i3).doubleValue());
        }
        this.f9687a.c1(iK);
        while (i2 < list.size()) {
            this.f9687a.t0(list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void u(int i, List<ByteString> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f9687a.q0(i, list.get(i2));
        }
    }

    @Override // com.google.protobuf.Writer
    public void v(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (!(list instanceof ree)) {
            while (i2 < list.size()) {
                this.f9687a.Y0(i, list.get(i2));
                i2++;
            }
        } else {
            ree reeVar = (ree) list;
            while (i2 < list.size()) {
                Z(i, reeVar.d(i2));
                i2++;
            }
        }
    }

    @Override // com.google.protobuf.Writer
    public void w(int i, long j) throws IOException {
        this.f9687a.S0(i, j);
    }

    @Override // com.google.protobuf.Writer
    public void x(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9687a.W0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f9687a.a1(i, 2);
        int iU = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iU += CodedOutputStream.U(list.get(i3).longValue());
        }
        this.f9687a.c1(iU);
        while (i2 < list.size()) {
            this.f9687a.X0(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void y(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9687a.u0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f9687a.a1(i, 2);
        int iM = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM += CodedOutputStream.m(list.get(i3).intValue());
        }
        this.f9687a.c1(iM);
        while (i2 < list.size()) {
            this.f9687a.v0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.protobuf.Writer
    public void z(int i, double d) throws IOException {
        this.f9687a.s0(i, d);
    }
}
