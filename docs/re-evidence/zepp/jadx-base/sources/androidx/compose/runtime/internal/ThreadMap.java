package androidx.compose.runtime.internal;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001J\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001R\u0016\u0010\u000b\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/internal/ThreadMap;", "", "", "key", "", "find", "get", "value", "", "trySet", "newWith", "size", LogUtil.I, "", "keys", "[J", "", "values", "[Ljava/lang/Object;", "<init>", "(I[J[Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 5, 1})
public final class ThreadMap {

    @NotNull
    private final long[] keys;
    private final int size;

    @NotNull
    private final Object[] values;

    public ThreadMap(int i, @NotNull long[] jArr, @NotNull Object[] objArr) {
        this.size = i;
        this.keys = jArr;
        this.values = objArr;
    }

    private final int find(long key) {
        int i = this.size - 1;
        if (i == -1) {
            return -1;
        }
        int i2 = 0;
        if (i == 0) {
            long[] jArr = this.keys;
            if (jArr[0] == key) {
                return 0;
            }
            return jArr[0] > key ? -2 : -1;
        }
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            long j = this.keys[i3] - key;
            if (j < 0) {
                i2 = i3 + 1;
            } else {
                if (j <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    @Nullable
    public final Object get(long key) {
        int iFind = find(key);
        if (iFind >= 0) {
            return this.values[iFind];
        }
        return null;
    }

    @NotNull
    public final ThreadMap newWith(long key, @Nullable Object value) {
        int i = this.size;
        Object[] objArr = this.values;
        int length = objArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            if (objArr[i3] != null) {
                i4++;
            }
            i3++;
        }
        int i5 = i4 + 1;
        long[] jArr = new long[i5];
        Object[] objArr2 = new Object[i5];
        if (i5 > 1) {
            int i6 = 0;
            while (i2 < i5 && i6 < i) {
                long j = this.keys[i6];
                Object obj = this.values[i6];
                if (j > key) {
                    jArr[i2] = key;
                    objArr2[i2] = value;
                    i2++;
                    break;
                }
                if (obj != null) {
                    jArr[i2] = j;
                    objArr2[i2] = obj;
                    i2++;
                }
                i6++;
            }
            if (i6 == i) {
                int i7 = i5 - 1;
                jArr[i7] = key;
                objArr2[i7] = value;
            } else {
                while (i2 < i5) {
                    long j2 = this.keys[i6];
                    Object obj2 = this.values[i6];
                    if (obj2 != null) {
                        jArr[i2] = j2;
                        objArr2[i2] = obj2;
                        i2++;
                    }
                    i6++;
                }
            }
        } else {
            jArr[0] = key;
            objArr2[0] = value;
        }
        return new ThreadMap(i5, jArr, objArr2);
    }

    public final boolean trySet(long key, @Nullable Object value) {
        int iFind = find(key);
        if (iFind < 0) {
            return false;
        }
        this.values[iFind] = value;
        return true;
    }
}
