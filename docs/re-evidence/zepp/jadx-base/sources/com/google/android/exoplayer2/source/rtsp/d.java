package com.google.android.exoplayer2.source.rtsp;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
final class d {

    @VisibleForTesting
    public static final int e = 1000;
    private static final int f = 65535;
    private static final int g = 5000;

    @GuardedBy("this")
    private final TreeSet<a> a = new TreeSet<>(new Comparator() { // from class: com.google.android.exoplayer2.source.rtsp.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return d.d((d.a) obj, (d.a) obj2);
        }
    });

    @GuardedBy("this")
    private int b;

    @GuardedBy("this")
    private int c;

    @GuardedBy("this")
    private boolean d;

    public static final class a {
        public final RtpPacket a;
        public final long b;

        public a(RtpPacket packet, long receivedTimestampMs) {
            this.a = packet;
            this.b = receivedTimestampMs;
        }
    }

    public d() {
        i();
    }

    private synchronized void b(a packet) {
        this.b = packet.a.sequenceNumber;
        this.a.add(packet);
    }

    private static int c(int sequenceNumber, int previousSequenceNumber) {
        int iMin;
        int i = sequenceNumber - previousSequenceNumber;
        if (Math.abs(i) <= 1000 || (iMin = (Math.min(sequenceNumber, previousSequenceNumber) - Math.max(sequenceNumber, previousSequenceNumber)) + 65535) >= 1000) {
            return i;
        }
        return sequenceNumber < previousSequenceNumber ? iMin : -iMin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int d(a aVar, a aVar2) {
        return c(aVar.a.sequenceNumber, aVar2.a.sequenceNumber);
    }

    private static int e(int sequenceNumber) {
        return (sequenceNumber + 1) % 65535;
    }

    private static int h(int sequenceNumber) {
        if (sequenceNumber == 0) {
            return 65534;
        }
        return (sequenceNumber - 1) % 65535;
    }

    public synchronized boolean f(RtpPacket packet, long receivedTimestampMs) {
        if (this.a.size() >= 5000) {
            throw new IllegalStateException("Queue size limit of 5000 reached.");
        }
        int i = packet.sequenceNumber;
        if (!this.d) {
            i();
            this.c = h(i);
            this.d = true;
            b(new a(packet, receivedTimestampMs));
            return true;
        }
        if (Math.abs(c(i, e(this.b))) < 1000) {
            if (c(i, this.c) <= 0) {
                return false;
            }
            b(new a(packet, receivedTimestampMs));
            return true;
        }
        this.c = h(i);
        this.a.clear();
        b(new a(packet, receivedTimestampMs));
        return true;
    }

    @Nullable
    public synchronized RtpPacket g(long cutoffTimestampMs) {
        if (this.a.isEmpty()) {
            return null;
        }
        a aVarFirst = this.a.first();
        int i = aVarFirst.a.sequenceNumber;
        if (i != e(this.c) && cutoffTimestampMs < aVarFirst.b) {
            return null;
        }
        this.a.pollFirst();
        this.c = i;
        return aVarFirst.a;
    }

    public synchronized void i() {
        this.a.clear();
        this.d = false;
        this.c = -1;
        this.b = -1;
    }
}
