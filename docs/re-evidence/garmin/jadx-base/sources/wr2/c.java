package wr2;

import java.util.Arrays;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lwr2/c;", "", "", "payload", "status", "<init>", "([B[B)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f186833d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f186834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f186835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.t f186836c;

    public c(byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        this.f186834a = bArr;
        this.f186835b = bArr2;
        this.f186836c = o13.m.b(new wd.c(this, 12));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        c cVar = (c) obj;
        return Arrays.equals(this.f186834a, cVar.f186834a) && Arrays.equals(this.f186835b, cVar.f186835b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f186835b) + (Arrays.hashCode(this.f186834a) * 31);
    }

    public final String toString() {
        return e0.g("ApduResponse(payload=", Arrays.toString(this.f186834a), ", status=", Arrays.toString(this.f186835b), ")");
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwr2/c$a;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
