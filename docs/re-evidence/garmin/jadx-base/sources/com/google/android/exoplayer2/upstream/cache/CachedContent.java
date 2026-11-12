package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import j20.x;
import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;
import wr.g;

/* JADX INFO: loaded from: classes14.dex */
final class CachedContent {
    private static final String TAG = "CachedContent";
    private final TreeSet<SimpleCacheSpan> cachedSpans;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public final int f53131id;
    public final String key;
    private final ArrayList<Range> lockedRanges;
    private DefaultContentMetadata metadata;

    public static final class Range {
        public final long length;
        public final long position;

        public Range(long j8, long j14) {
            this.position = j8;
            this.length = j14;
        }

        public boolean contains(long j8, long j14) {
            long j15 = this.length;
            if (j15 == -1) {
                return j8 >= this.position;
            }
            if (j14 == -1) {
                return false;
            }
            long j16 = this.position;
            return j16 <= j8 && j8 + j14 <= j16 + j15;
        }

        public boolean intersects(long j8, long j14) {
            long j15 = this.position;
            if (j15 > j8) {
                return j14 == -1 || j8 + j14 > j15;
            }
            long j16 = this.length;
            return j16 == -1 || j15 + j16 > j8;
        }
    }

    public CachedContent(int i14, String str, DefaultContentMetadata defaultContentMetadata) {
        this.f53131id = i14;
        this.key = str;
        this.metadata = defaultContentMetadata;
        this.cachedSpans = new TreeSet<>();
        this.lockedRanges = new ArrayList<>();
    }

    public void addSpan(SimpleCacheSpan simpleCacheSpan) {
        this.cachedSpans.add(simpleCacheSpan);
    }

    public boolean applyMetadataMutations(ContentMetadataMutations contentMetadataMutations) {
        DefaultContentMetadata defaultContentMetadata = this.metadata;
        DefaultContentMetadata defaultContentMetadataCopyWithMutationsApplied = defaultContentMetadata.copyWithMutationsApplied(contentMetadataMutations);
        this.metadata = defaultContentMetadataCopyWithMutationsApplied;
        return !defaultContentMetadataCopyWithMutationsApplied.equals(defaultContentMetadata);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CachedContent.class == obj.getClass()) {
            CachedContent cachedContent = (CachedContent) obj;
            if (this.f53131id == cachedContent.f53131id && this.key.equals(cachedContent.key) && this.cachedSpans.equals(cachedContent.cachedSpans) && this.metadata.equals(cachedContent.metadata)) {
                return true;
            }
        }
        return false;
    }

    public long getCachedBytesLength(long j8, long j14) {
        Assertions.checkArgument(j8 >= 0);
        Assertions.checkArgument(j14 >= 0);
        SimpleCacheSpan span = getSpan(j8, j14);
        if (span.isHoleSpan()) {
            return -Math.min(span.isOpenEnded() ? Long.MAX_VALUE : span.length, j14);
        }
        long j15 = j8 + j14;
        long j16 = j15 >= 0 ? j15 : Long.MAX_VALUE;
        long jMax = span.position + span.length;
        if (jMax < j16) {
            for (SimpleCacheSpan simpleCacheSpan : this.cachedSpans.tailSet(span, false)) {
                long j17 = simpleCacheSpan.position;
                if (j17 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j17 + simpleCacheSpan.length);
                if (jMax >= j16) {
                    break;
                }
            }
        }
        return Math.min(jMax - j8, j14);
    }

    public DefaultContentMetadata getMetadata() {
        return this.metadata;
    }

    public SimpleCacheSpan getSpan(long j8, long j14) {
        SimpleCacheSpan simpleCacheSpanCreateLookup = SimpleCacheSpan.createLookup(this.key, j8);
        SimpleCacheSpan simpleCacheSpanFloor = this.cachedSpans.floor(simpleCacheSpanCreateLookup);
        if (simpleCacheSpanFloor != null && simpleCacheSpanFloor.position + simpleCacheSpanFloor.length > j8) {
            return simpleCacheSpanFloor;
        }
        SimpleCacheSpan simpleCacheSpanCeiling = this.cachedSpans.ceiling(simpleCacheSpanCreateLookup);
        if (simpleCacheSpanCeiling != null) {
            long j15 = simpleCacheSpanCeiling.position - j8;
            j14 = j14 == -1 ? j15 : Math.min(j15, j14);
        }
        return SimpleCacheSpan.createHole(this.key, j8, j14);
    }

    public TreeSet<SimpleCacheSpan> getSpans() {
        return this.cachedSpans;
    }

    public int hashCode() {
        return this.metadata.hashCode() + g.j(this.f53131id * 31, 31, this.key);
    }

    public boolean isEmpty() {
        return this.cachedSpans.isEmpty();
    }

    public boolean isFullyLocked(long j8, long j14) {
        for (int i14 = 0; i14 < this.lockedRanges.size(); i14++) {
            if (this.lockedRanges.get(i14).contains(j8, j14)) {
                return true;
            }
        }
        return false;
    }

    public boolean isFullyUnlocked() {
        return this.lockedRanges.isEmpty();
    }

    public boolean lockRange(long j8, long j14) {
        int i14 = 0;
        while (true) {
            int size = this.lockedRanges.size();
            ArrayList<Range> arrayList = this.lockedRanges;
            if (i14 >= size) {
                arrayList.add(new Range(j8, j14));
                return true;
            }
            if (arrayList.get(i14).intersects(j8, j14)) {
                return false;
            }
            i14++;
        }
    }

    public boolean removeSpan(CacheSpan cacheSpan) {
        if (!this.cachedSpans.remove(cacheSpan)) {
            return false;
        }
        File file = cacheSpan.file;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public SimpleCacheSpan setLastTouchTimestamp(SimpleCacheSpan simpleCacheSpan, long j8, boolean z14) {
        long j14;
        Assertions.checkState(this.cachedSpans.remove(simpleCacheSpan));
        File file = (File) Assertions.checkNotNull(simpleCacheSpan.file);
        if (z14) {
            j14 = j8;
            File cacheFile = SimpleCacheSpan.getCacheFile((File) Assertions.checkNotNull(file.getParentFile()), this.f53131id, simpleCacheSpan.position, j14);
            if (file.renameTo(cacheFile)) {
                file = cacheFile;
            } else {
                String strValueOf = String.valueOf(file);
                String strValueOf2 = String.valueOf(cacheFile);
                StringBuilder sb3 = new StringBuilder(strValueOf2.length() + strValueOf.length() + 21);
                sb3.append("Failed to rename ");
                sb3.append(strValueOf);
                sb3.append(" to ");
                sb3.append(strValueOf2);
                Log.w(TAG, sb3.toString());
            }
        } else {
            j14 = j8;
        }
        SimpleCacheSpan simpleCacheSpanCopyWithFileAndLastTouchTimestamp = simpleCacheSpan.copyWithFileAndLastTouchTimestamp(file, j14);
        this.cachedSpans.add(simpleCacheSpanCopyWithFileAndLastTouchTimestamp);
        return simpleCacheSpanCopyWithFileAndLastTouchTimestamp;
    }

    public void unlockRange(long j8) {
        for (int i14 = 0; i14 < this.lockedRanges.size(); i14++) {
            if (this.lockedRanges.get(i14).position == j8) {
                this.lockedRanges.remove(i14);
                return;
            }
        }
        x.h();
    }

    public CachedContent(int i14, String str) {
        this(i14, str, DefaultContentMetadata.EMPTY);
    }
}
