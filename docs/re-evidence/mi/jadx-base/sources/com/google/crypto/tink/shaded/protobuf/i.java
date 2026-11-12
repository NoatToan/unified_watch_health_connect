package com.google.crypto.tink.shaded.protobuf;

import defpackage.qee;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CodedOutputStream f9394a;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9395a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f9395a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9395a[WireFormat.FieldType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9395a[WireFormat.FieldType.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9395a[WireFormat.FieldType.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9395a[WireFormat.FieldType.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9395a[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9395a[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9395a[WireFormat.FieldType.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9395a[WireFormat.FieldType.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9395a[WireFormat.FieldType.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9395a[WireFormat.FieldType.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9395a[WireFormat.FieldType.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public i(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) s.b(codedOutputStream, "output");
        this.f9394a = codedOutputStream2;
        codedOutputStream2.f9354a = this;
    }

    public static i P(CodedOutputStream codedOutputStream) {
        i iVar = codedOutputStream.f9354a;
        return iVar != null ? iVar : new i(codedOutputStream);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void A(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9394a.G0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f9394a.N0(i, 2);
        int iO = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iO += CodedOutputStream.O(list.get(i3).longValue());
        }
        this.f9394a.P0(iO);
        while (i2 < list.size()) {
            this.f9394a.H0(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public Writer.FieldOrder B() {
        return Writer.FieldOrder.ASCENDING;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void C(int i, long j) throws IOException {
        this.f9394a.z0(i, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void D(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9394a.E0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f9394a.N0(i, 2);
        int iM = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM += CodedOutputStream.M(list.get(i3).intValue());
        }
        this.f9394a.P0(iM);
        while (i2 < list.size()) {
            this.f9394a.F0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void E(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9394a.i0(i, list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        this.f9394a.N0(i, 2);
        int iF = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iF += CodedOutputStream.f(list.get(i3).booleanValue());
        }
        this.f9394a.P0(iF);
        while (i2 < list.size()) {
            this.f9394a.j0(list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void F(int i, float f) throws IOException {
        this.f9394a.t0(i, f);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void G(int i, int i2) throws IOException {
        this.f9394a.n0(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void H(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9394a.z0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f9394a.N0(i, 2);
        int iZ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZ += CodedOutputStream.z(list.get(i3).longValue());
        }
        this.f9394a.P0(iZ);
        while (i2 < list.size()) {
            this.f9394a.A0(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void I(int i, int i2) throws IOException {
        this.f9394a.I0(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public <K, V> void J(int i, y.a<K, V> aVar, Map<K, V> map) throws IOException {
        if (this.f9394a.d0()) {
            Q(i, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f9394a.N0(i, 2);
            this.f9394a.P0(y.b(aVar, entry.getKey(), entry.getValue()));
            y.d(this.f9394a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void K(int i, Object obj, k0 k0Var) throws IOException {
        this.f9394a.v0(i, (b0) obj, k0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void L(int i, List<?> list, k0 k0Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            M(i, list.get(i2), k0Var);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void M(int i, Object obj, k0 k0Var) throws IOException {
        this.f9394a.B0(i, (b0) obj, k0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void N(int i, List<?> list, k0 k0Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            K(i, list.get(i2), k0Var);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void O(int i, ByteString byteString) throws IOException {
        this.f9394a.k0(i, byteString);
    }

    public final <K, V> void Q(int i, y.a<K, V> aVar, Map<K, V> map) throws IOException {
        int[] iArr = a.f9395a;
        throw null;
    }

    public final void R(int i, Object obj) throws IOException {
        if (obj instanceof String) {
            this.f9394a.M0(i, (String) obj);
        } else {
            this.f9394a.k0(i, (ByteString) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void a(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9394a.t0(i, list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        this.f9394a.N0(i, 2);
        int iS = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iS += CodedOutputStream.s(list.get(i3).floatValue());
        }
        this.f9394a.P0(iS);
        while (i2 < list.size()) {
            this.f9394a.u0(list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void b(int i, Object obj) throws IOException {
        if (obj instanceof ByteString) {
            this.f9394a.D0(i, (ByteString) obj);
        } else {
            this.f9394a.C0(i, (b0) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void c(int i, int i2) throws IOException {
        this.f9394a.p0(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void d(int i, String str) throws IOException {
        this.f9394a.M0(i, str);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void e(int i, long j) throws IOException {
        this.f9394a.Q0(i, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void f(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9394a.x0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f9394a.N0(i, 2);
        int iX = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iX += CodedOutputStream.x(list.get(i3).intValue());
        }
        this.f9394a.P0(iX);
        while (i2 < list.size()) {
            this.f9394a.y0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void g(int i, int i2) throws IOException {
        this.f9394a.x0(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void h(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9394a.p0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f9394a.N0(i, 2);
        int iO = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iO += CodedOutputStream.o(list.get(i3).intValue());
        }
        this.f9394a.P0(iO);
        while (i2 < list.size()) {
            this.f9394a.q0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void i(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9394a.O0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f9394a.N0(i, 2);
        int iX = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iX += CodedOutputStream.X(list.get(i3).intValue());
        }
        this.f9394a.P0(iX);
        while (i2 < list.size()) {
            this.f9394a.P0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void j(int i, long j) throws IOException {
        this.f9394a.K0(i, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void k(int i, int i2) throws IOException {
        this.f9394a.O0(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void l(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9394a.Q0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f9394a.N0(i, 2);
        int iZ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZ += CodedOutputStream.Z(list.get(i3).longValue());
        }
        this.f9394a.P0(iZ);
        while (i2 < list.size()) {
            this.f9394a.R0(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void m(int i, long j) throws IOException {
        this.f9394a.r0(i, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void n(int i, boolean z) throws IOException {
        this.f9394a.i0(i, z);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void o(int i, int i2) throws IOException {
        this.f9394a.E0(i, i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void p(int i) throws IOException {
        this.f9394a.N0(i, 3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void q(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9394a.r0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f9394a.N0(i, 2);
        int iQ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iQ += CodedOutputStream.q(list.get(i3).longValue());
        }
        this.f9394a.P0(iQ);
        while (i2 < list.size()) {
            this.f9394a.s0(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void r(int i) throws IOException {
        this.f9394a.N0(i, 4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void s(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9394a.I0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f9394a.N0(i, 2);
        int iQ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iQ += CodedOutputStream.Q(list.get(i3).intValue());
        }
        this.f9394a.P0(iQ);
        while (i2 < list.size()) {
            this.f9394a.J0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void t(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9394a.l0(i, list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        this.f9394a.N0(i, 2);
        int iK = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iK += CodedOutputStream.k(list.get(i3).doubleValue());
        }
        this.f9394a.P0(iK);
        while (i2 < list.size()) {
            this.f9394a.m0(list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void u(int i, List<ByteString> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f9394a.k0(i, list.get(i2));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void v(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (!(list instanceof qee)) {
            while (i2 < list.size()) {
                this.f9394a.M0(i, list.get(i2));
                i2++;
            }
        } else {
            qee qeeVar = (qee) list;
            while (i2 < list.size()) {
                R(i, qeeVar.d(i2));
                i2++;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void w(int i, long j) throws IOException {
        this.f9394a.G0(i, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void x(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9394a.K0(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.f9394a.N0(i, 2);
        int iS = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iS += CodedOutputStream.S(list.get(i3).longValue());
        }
        this.f9394a.P0(iS);
        while (i2 < list.size()) {
            this.f9394a.L0(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void y(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.f9394a.n0(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.f9394a.N0(i, 2);
        int iM = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iM += CodedOutputStream.m(list.get(i3).intValue());
        }
        this.f9394a.P0(iM);
        while (i2 < list.size()) {
            this.f9394a.o0(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public void z(int i, double d) throws IOException {
        this.f9394a.l0(i, d);
    }
}
