package defpackage;

import androidx.media3.muxer.Mp4Utils;
import com.google.common.collect.CompactHashMap;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
class all<K, V> extends CompactHashMap<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @CheckForNull
    transient long[] f512c;
    private transient int h;
    private transient int j;

    public static <K, V> all<K, V> j(int i) {
        return new all<>(i);
    }

    all() {
        this(3);
    }

    all(int i) {
        this(i, false);
    }

    all(int i, boolean z) {
        super(i);
        this.f511b = z;
    }

    @Override // com.google.common.collect.CompactHashMap
    public void a(int i) {
        super.a(i);
        this.h = -2;
        this.j = -2;
    }

    @Override // com.google.common.collect.CompactHashMap
    public int c() {
        int iC = super.c();
        this.f512c = new long[iC];
        return iC;
    }

    @Override // com.google.common.collect.CompactHashMap
    public Map<K, V> c(int i) {
        return new LinkedHashMap(i, 1.0f, this.f511b);
    }

    @Override // com.google.common.collect.CompactHashMap
    public Map<K, V> a() {
        Map<K, V> mapA = super.a();
        this.f512c = null;
        return mapA;
    }

    private int i(int i) {
        return ((int) (g(i) >>> 32)) - 1;
    }

    @Override // com.google.common.collect.CompactHashMap
    public int e(int i) {
        return ((int) g(i)) - 1;
    }

    private void a(int i, int i2) {
        d(i, (g(i) & (-4294967296L)) | (((long) (i2 + 1)) & Mp4Utils.UNSIGNED_INT_MAX_VALUE));
    }

    private void b(int i, int i2) {
        d(i, (g(i) & Mp4Utils.UNSIGNED_INT_MAX_VALUE) | (((long) (i2 + 1)) << 32));
    }

    private void d(int i, int i2) {
        if (i == -2) {
            this.h = i2;
        } else {
            a(i, i2);
        }
        if (i2 == -2) {
            this.j = i;
        } else {
            b(i2, i);
        }
    }

    @Override // com.google.common.collect.CompactHashMap
    public void c(int i, @ParametricNullness K k, @ParametricNullness V v, int i2, int i3) {
        super.c(i, k, v, i2, i3);
        d(this.j, i);
        d(i, -2);
    }

    @Override // com.google.common.collect.CompactHashMap
    public void b(int i) {
        if (this.f511b) {
            d(i(i), e(i));
            d(this.j, i);
            d(i, -2);
            n();
        }
    }

    @Override // com.google.common.collect.CompactHashMap
    public void c(int i, int i2) {
        int size = size() - 1;
        super.c(i, i2);
        d(i(i), e(i));
        if (i < size) {
            d(i(size), i);
            d(i, e(size));
        }
        d(size, 0L);
    }

    @Override // com.google.common.collect.CompactHashMap
    public void h(int i) {
        super.h(i);
        this.f512c = Arrays.copyOf(l(), i);
    }

    @Override // com.google.common.collect.CompactHashMap
    public int h() {
        return this.h;
    }

    @Override // com.google.common.collect.CompactHashMap
    public int e(int i, int i2) {
        return i >= size() ? i2 : i;
    }

    @Override // com.google.common.collect.CompactHashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        if (o()) {
            return;
        }
        this.h = -2;
        this.j = -2;
        long[] jArr = this.f512c;
        if (jArr != null) {
            Arrays.fill(jArr, 0, size(), 0L);
        }
        super.clear();
    }

    private long[] l() {
        return (long[]) Objects.requireNonNull(this.f512c);
    }

    private long g(int i) {
        return l()[i];
    }

    private void d(int i, long j) {
        l()[i] = j;
    }
}
