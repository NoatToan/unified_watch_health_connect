package a23;

import java.io.ByteArrayOutputStream;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La23/a;", "Ljava/io/ByteArrayOutputStream;", "", "size", "<init>", "(I)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends ByteArrayOutputStream {
    public a(int i14) {
        super(i14);
    }

    public final byte[] a() {
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        bArr.getClass();
        return bArr;
    }
}
