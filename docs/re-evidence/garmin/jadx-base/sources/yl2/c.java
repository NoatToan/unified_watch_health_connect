package yl2;

import lm2.i;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyl2/c;", "Llm2/i$a;", "Lbm2/d;", "deviceInfoDto", "", "xmlBytes", "<init>", "(Lbm2/d;[B)V", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bm2.d f197837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f197838b;

    public c(bm2.d dVar, byte[] bArr) {
        dVar.getClass();
        this.f197837a = dVar;
        this.f197838b = bArr;
    }

    @Override // lm2.i.a
    /* JADX INFO: renamed from: b, reason: from getter */
    public final byte[] getF197838b() {
        return this.f197838b;
    }

    @Override // lm2.i.a
    /* JADX INFO: renamed from: d */
    public final long getF197655a() {
        bm2.d f197837a = getF197837a();
        if (f197837a != null) {
            return f197837a.getF172494b();
        }
        return -1L;
    }

    @Override // lm2.i.a
    public final String f() {
        bm2.d f197837a = getF197837a();
        if (f197837a == null || f197837a.getF172495c() <= 0) {
            return null;
        }
        return String.valueOf(f197837a.getF172495c());
    }

    @Override // lm2.i.a
    /* JADX INFO: renamed from: getDeviceInfo, reason: from getter */
    public final bm2.d getF197837a() {
        return this.f197837a;
    }

    @Override // lm2.i.a
    /* JADX INFO: renamed from: getMacAddress */
    public final String getF197656b() {
        bm2.d f197837a = getF197837a();
        if (f197837a != null) {
            return f197837a.f();
        }
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(bm2.d dVar) {
        this(dVar, null, 2, 0 == true ? 1 : 0);
        dVar.getClass();
    }

    public /* synthetic */ c(bm2.d dVar, byte[] bArr, int i14, j jVar) {
        this(dVar, (i14 & 2) != 0 ? null : bArr);
    }
}
