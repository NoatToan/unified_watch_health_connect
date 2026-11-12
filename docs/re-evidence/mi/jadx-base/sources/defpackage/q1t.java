package defpackage;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class q1t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ik f31000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sd f31001b;
    public byte[] c;

    public q1t(sd sdVar, ik ikVar) {
        this.f31000a = ik.UNKNOWN;
        sd sdVar2 = sd.VDevice;
        this.c = null;
        this.f31001b = sdVar;
        this.f31000a = ikVar;
    }

    public void a(byte[] bArr) {
        this.c = bArr;
    }

    public byte[] b() {
        return this.c;
    }

    public ik c() {
        return this.f31000a;
    }

    public String toString() {
        return "HMLFEvent{mType=" + this.f31000a + ", mDeviceType=" + this.f31001b + ", extra=" + tet.x(this.c) + AbstractJsonLexerKt.END_OBJ;
    }
}
