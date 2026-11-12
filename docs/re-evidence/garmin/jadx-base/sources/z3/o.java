package z3;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lz3/o;", "", "", "size", "", UserMetadata.KEYDATA_FILENAME, "", "values", "<init>", "(I[J[Ljava/lang/Object;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f202121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f202122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f202123c;

    public o(int i14, long[] jArr, Object[] objArr) {
        this.f202121a = i14;
        this.f202122b = jArr;
        this.f202123c = objArr;
    }

    public final int a(long j8) {
        int i14 = this.f202121a - 1;
        if (i14 != -1) {
            long[] jArr = this.f202122b;
            int i15 = 0;
            if (i14 != 0) {
                while (i15 <= i14) {
                    int i16 = (i15 + i14) >>> 1;
                    long j14 = jArr[i16] - j8;
                    if (j14 < 0) {
                        i15 = i16 + 1;
                    } else {
                        if (j14 <= 0) {
                            return i16;
                        }
                        i14 = i16 - 1;
                    }
                }
                return -(i15 + 1);
            }
            long j15 = jArr[0];
            if (j15 == j8) {
                return 0;
            }
            if (j15 > j8) {
                return -2;
            }
        }
        return -1;
    }

    public final o b(long j8, Object obj) {
        long[] jArr;
        int i14;
        Object[] objArr = this.f202123c;
        int i15 = 0;
        int i16 = 0;
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                i16++;
            }
        }
        int i17 = i16 + 1;
        long[] jArr2 = new long[i17];
        Object[] objArr2 = new Object[i17];
        if (i17 > 1) {
            int i18 = 0;
            while (true) {
                jArr = this.f202122b;
                i14 = this.f202121a;
                if (i15 >= i17 || i18 >= i14) {
                    break;
                }
                long j14 = jArr[i18];
                Object obj3 = objArr[i18];
                if (j14 > j8) {
                    jArr2[i15] = j8;
                    objArr2[i15] = obj;
                    i15++;
                    break;
                }
                if (obj3 != null) {
                    jArr2[i15] = j14;
                    objArr2[i15] = obj3;
                    i15++;
                }
                i18++;
            }
            if (i18 == i14) {
                jArr2[i16] = j8;
                objArr2[i16] = obj;
            } else {
                while (i15 < i17) {
                    long j15 = jArr[i18];
                    Object obj4 = objArr[i18];
                    if (obj4 != null) {
                        jArr2[i15] = j15;
                        objArr2[i15] = obj4;
                        i15++;
                    }
                    i18++;
                }
            }
        } else {
            jArr2[0] = j8;
            objArr2[0] = obj;
        }
        return new o(i17, jArr2, objArr2);
    }
}
