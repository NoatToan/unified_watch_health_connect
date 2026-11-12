package g53;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import d53.u;
import java.io.Serializable;
import o13.z;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00060\u0002j\u0002`\u0003:\u0001\tB\u0019\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lg53/b;", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "mostSignificantBits", "leastSignificantBits", "<init>", "(JJ)V", "a", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements Comparable<b>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f75983c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f75984d = new b(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f75985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f75986b;

    private b(long j8, long j14) {
        this.f75985a = j8;
        this.f75986b = j14;
    }

    @Override // java.lang.Comparable
    public final int compareTo(b bVar) {
        b bVar2 = bVar;
        bVar2.getClass();
        long j8 = bVar2.f75985a;
        long j14 = this.f75985a;
        if (j14 != j8) {
            z.a aVar = z.f128618b;
            return Long.compareUnsigned(j14, j8);
        }
        z.a aVar2 = z.f128618b;
        return Long.compareUnsigned(this.f75986b, bVar2.f75986b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f75985a == bVar.f75985a && this.f75986b == bVar.f75986b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f75985a ^ this.f75986b);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        c.a(this.f75985a, 0, bArr, 0, 4);
        bArr[8] = 45;
        c.a(this.f75985a, 9, bArr, 4, 6);
        bArr[13] = 45;
        c.a(this.f75985a, 14, bArr, 6, 8);
        bArr[18] = 45;
        c.a(this.f75986b, 19, bArr, 0, 2);
        bArr[23] = 45;
        c.a(this.f75986b, 24, bArr, 2, 8);
        return u.n(bArr);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lg53/b$a;", "", "<init>", "()V", "", "SIZE_BYTES", "I", "SIZE_BITS", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static b a(long j8, long j14) {
            return (j8 == 0 && j14 == 0) ? b.f75984d : new b(j8, j14, null);
        }

        public static b b() {
            byte[] bArr = new byte[16];
            g53.a.f75981a.getClass();
            g53.a.f75982b.nextBytes(bArr);
            byte b14 = (byte) (bArr[6] & Ascii.SI);
            bArr[6] = b14;
            bArr[6] = (byte) (b14 | SignedBytes.MAX_POWER_OF_TWO);
            byte b15 = (byte) (bArr[8] & 63);
            bArr[8] = b15;
            bArr[8] = (byte) (b15 | UnsignedBytes.MAX_POWER_OF_TWO);
            b.f75983c.getClass();
            return a(c.b(0, bArr), c.b(8, bArr));
        }

        private a() {
        }
    }

    public /* synthetic */ b(long j8, long j14, j jVar) {
        this(j8, j14);
    }
}
