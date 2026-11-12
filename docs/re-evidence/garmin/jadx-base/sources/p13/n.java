package p13;

import java.util.RandomAccess;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lp13/n;", "Lp13/c;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends c<Byte> implements RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f134953b;

    public n(byte[] bArr) {
        this.f134953b = bArr;
    }

    @Override // p13.a
    /* JADX INFO: renamed from: a */
    public final int getF134922d() {
        return this.f134953b.length;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0020 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0022 A[RETURN] */
    @Override // p13.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Byte)) {
            return false;
        }
        byte bByteValue = ((Number) obj).byteValue();
        byte[] bArr = this.f134953b;
        bArr.getClass();
        int length = bArr.length;
        int i14 = 0;
        while (i14 < length) {
            if (bByteValue == bArr[i14]) {
                if (i14 >= 0) {
                    return true;
                }
                return false;
            }
            i14++;
        }
        i14 = -1;
        if (i14 >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i14) {
        return Byte.valueOf(this.f134953b[i14]);
    }

    @Override // p13.c, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Byte)) {
            return -1;
        }
        byte bByteValue = ((Number) obj).byteValue();
        byte[] bArr = this.f134953b;
        bArr.getClass();
        int length = bArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            if (bByteValue == bArr[i14]) {
                return i14;
            }
        }
        return -1;
    }

    @Override // p13.a, java.util.Collection
    public final boolean isEmpty() {
        return this.f134953b.length == 0;
    }

    @Override // p13.c, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Byte)) {
            return -1;
        }
        byte bByteValue = ((Number) obj).byteValue();
        byte[] bArr = this.f134953b;
        bArr.getClass();
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i14 = length - 1;
                if (bByteValue == bArr[length]) {
                    return length;
                }
                if (i14 >= 0) {
                    length = i14;
                }
            }
        }
        return -1;
    }
}
