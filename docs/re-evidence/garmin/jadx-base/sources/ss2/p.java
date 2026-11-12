package ss2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lss2/p;", "Lss2/s;", "", "sessionKey", "hostInitializationVector", "<init>", "([B[B)V", "a", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f160831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f160832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f160833c;

    static {
        new a(null);
    }

    public p(byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        this.f160831a = bArr;
        this.f160832b = bArr2;
    }

    @Override // ss2.s
    public final byte[] encrypt(byte[] bArr) {
        int length = bArr.length + 8;
        int i14 = (4 - (length % 4)) + length;
        byte[] bArr2 = new byte[i14 + 2];
        long j8 = this.f160833c;
        this.f160833c = 1 + j8;
        jg.b.U(bArr2, 0, j8);
        System.arraycopy(this.f160832b, 0, bArr2, 4, 4);
        System.arraycopy(bArr, 0, bArr2, 8, bArr.length);
        byte[] bArrC = n.c(i14, false, bArr2, this.f160831a);
        jg.b.T(0, bArrC.length + 2, bArr2);
        System.arraycopy(bArrC, 0, bArr2, 2, bArrC.length);
        return bArr2;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lss2/p$a;", "", "<init>", "()V", "", "PACKET_COUNT_LENGTH", "I", "INITIALIZATION_VECTOR_LENGTH", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
