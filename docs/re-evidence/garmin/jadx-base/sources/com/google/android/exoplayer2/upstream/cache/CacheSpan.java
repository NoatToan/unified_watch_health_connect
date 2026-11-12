package com.google.android.exoplayer2.upstream.cache;

import am.j;
import com.google.android.exoplayer2.C;
import java.io.File;

/* JADX INFO: loaded from: classes14.dex */
public class CacheSpan implements Comparable<CacheSpan> {
    public final File file;
    public final boolean isCached;
    public final String key;
    public final long lastTouchTimestamp;
    public final long length;
    public final long position;

    public CacheSpan(String str, long j8, long j14, long j15, File file) {
        this.key = str;
        this.position = j8;
        this.length = j14;
        this.isCached = file != null;
        this.file = file;
        this.lastTouchTimestamp = j15;
    }

    @Override // java.lang.Comparable
    public int compareTo(CacheSpan cacheSpan) {
        if (!this.key.equals(cacheSpan.key)) {
            return this.key.compareTo(cacheSpan.key);
        }
        long j8 = this.position - cacheSpan.position;
        if (j8 == 0) {
            return 0;
        }
        return j8 < 0 ? -1 : 1;
    }

    public boolean isHoleSpan() {
        return !this.isCached;
    }

    public boolean isOpenEnded() {
        return this.length == -1;
    }

    public String toString() {
        long j8 = this.position;
        long j14 = this.length;
        StringBuilder sb3 = new StringBuilder(44);
        sb3.append("[");
        sb3.append(j8);
        sb3.append(", ");
        return j.i(j14, "]", sb3);
    }

    public CacheSpan(String str, long j8, long j14) {
        this(str, j8, j14, C.TIME_UNSET, null);
    }
}
