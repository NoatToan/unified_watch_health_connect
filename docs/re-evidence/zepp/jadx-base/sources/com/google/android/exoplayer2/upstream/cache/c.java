package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
final class c {
    private static final String f = "CachedContent";
    public final int a;
    public final String b;
    private final TreeSet<f> c;
    private final ArrayList<a> d;
    private DefaultContentMetadata e;

    public static final class a {
        public final long a;
        public final long b;

        public a(long position, long length) {
            this.a = position;
            this.b = length;
        }

        public boolean a(long otherPosition, long otherLength) {
            long j = this.b;
            if (j == -1) {
                return otherPosition >= this.a;
            }
            if (otherLength == -1) {
                return false;
            }
            long j2 = this.a;
            return j2 <= otherPosition && otherPosition + otherLength <= j2 + j;
        }

        public boolean b(long otherPosition, long otherLength) {
            long j = this.a;
            if (j > otherPosition) {
                return otherLength == -1 || otherPosition + otherLength > j;
            }
            long j2 = this.b;
            return j2 == -1 || j + j2 > otherPosition;
        }
    }

    public c(int id, String key) {
        this(id, key, DefaultContentMetadata.EMPTY);
    }

    public void a(f span) {
        this.c.add(span);
    }

    public boolean b(ContentMetadataMutations mutations) {
        DefaultContentMetadata defaultContentMetadata = this.e;
        DefaultContentMetadata defaultContentMetadataCopyWithMutationsApplied = defaultContentMetadata.copyWithMutationsApplied(mutations);
        this.e = defaultContentMetadataCopyWithMutationsApplied;
        return !defaultContentMetadataCopyWithMutationsApplied.equals(defaultContentMetadata);
    }

    public long c(long position, long length) {
        Assertions.checkArgument(position >= 0);
        Assertions.checkArgument(length >= 0);
        f fVarE = e(position, length);
        if (fVarE.isHoleSpan()) {
            return -Math.min(fVarE.isOpenEnded() ? Long.MAX_VALUE : fVarE.length, length);
        }
        long j = position + length;
        long j2 = j >= 0 ? j : Long.MAX_VALUE;
        long jMax = fVarE.position + fVarE.length;
        if (jMax < j2) {
            for (f fVar : this.c.tailSet(fVarE, false)) {
                long j3 = fVar.position;
                if (j3 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j3 + fVar.length);
                if (jMax >= j2) {
                    break;
                }
            }
        }
        return Math.min(jMax - position, length);
    }

    public DefaultContentMetadata d() {
        return this.e;
    }

    public f e(long position, long length) {
        f fVarE = f.e(this.b, position);
        f fVarFloor = this.c.floor(fVarE);
        if (fVarFloor != null && fVarFloor.position + fVarFloor.length > position) {
            return fVarFloor;
        }
        f fVarCeiling = this.c.ceiling(fVarE);
        if (fVarCeiling != null) {
            long j = fVarCeiling.position - position;
            length = length == -1 ? j : Math.min(j, length);
        }
        return f.d(this.b, position, length);
    }

    public boolean equals(@Nullable Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || c.class != o.getClass()) {
            return false;
        }
        c cVar = (c) o;
        return this.a == cVar.a && this.b.equals(cVar.b) && this.c.equals(cVar.c) && this.e.equals(cVar.e);
    }

    public TreeSet<f> f() {
        return this.c;
    }

    public boolean g() {
        return this.c.isEmpty();
    }

    public boolean h(long position, long length) {
        for (int i = 0; i < this.d.size(); i++) {
            if (this.d.get(i).a(position, length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.a * 31) + this.b.hashCode()) * 31) + this.e.hashCode();
    }

    public boolean i() {
        return this.d.isEmpty();
    }

    public boolean j(long position, long length) {
        for (int i = 0; i < this.d.size(); i++) {
            if (this.d.get(i).b(position, length)) {
                return false;
            }
        }
        this.d.add(new a(position, length));
        return true;
    }

    public boolean k(CacheSpan span) {
        if (!this.c.remove(span)) {
            return false;
        }
        File file = span.file;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public f l(f cacheSpan, long lastTouchTimestamp, boolean updateFile) {
        Assertions.checkState(this.c.remove(cacheSpan));
        File file = (File) Assertions.checkNotNull(cacheSpan.file);
        if (updateFile) {
            File fileF = f.f((File) Assertions.checkNotNull(file.getParentFile()), this.a, cacheSpan.position, lastTouchTimestamp);
            if (file.renameTo(fileF)) {
                file = fileF;
            } else {
                String strValueOf = String.valueOf(file);
                String strValueOf2 = String.valueOf(fileF);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 21 + strValueOf2.length());
                sb.append("Failed to rename ");
                sb.append(strValueOf);
                sb.append(" to ");
                sb.append(strValueOf2);
                Log.w(f, sb.toString());
            }
        }
        f fVarA = cacheSpan.a(file, lastTouchTimestamp);
        this.c.add(fVarA);
        return fVarA;
    }

    public void m(long position) {
        for (int i = 0; i < this.d.size(); i++) {
            if (this.d.get(i).a == position) {
                this.d.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public c(int id, String key, DefaultContentMetadata metadata) {
        this.a = id;
        this.b = key;
        this.e = metadata;
        this.c = new TreeSet<>();
        this.d = new ArrayList<>();
    }
}
