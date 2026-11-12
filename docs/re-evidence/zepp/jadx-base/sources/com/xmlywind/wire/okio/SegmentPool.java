package com.xmlywind.wire.okio;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes22.dex */
final class SegmentPool {
    public static final long MAX_SIZE = 65536;
    public static long byteCount;
    public static Segment next;

    private SegmentPool() {
    }

    public static void recycle(Segment segment) {
        if (segment.next != null || segment.prev != null) {
            throw new IllegalArgumentException();
        }
        if (segment.shared) {
            return;
        }
        synchronized (SegmentPool.class) {
            long j = byteCount;
            if (j + PlaybackStateCompat.ACTION_PLAY_FROM_URI <= 65536) {
                byteCount = j + PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                segment.next = next;
                segment.limit = 0;
                segment.pos = 0;
                next = segment;
            }
        }
    }

    public static Segment take() {
        synchronized (SegmentPool.class) {
            Segment segment = next;
            if (segment == null) {
                return new Segment();
            }
            next = segment.next;
            segment.next = null;
            byteCount -= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            return segment;
        }
    }
}
