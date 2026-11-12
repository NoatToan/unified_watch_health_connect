package zy2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\u0010\u000f\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00072\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\bB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lzy2/h;", "", "", "", "value", "<init>", "(J)V", "Companion", "a", "util-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@i63.h(with = i.class)
public final class h extends Number implements Comparable<h> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f207530a;

    public h(long j8) {
        this.f207530a = j8;
    }

    @Override // java.lang.Number
    public final byte byteValue() {
        return (byte) this.f207530a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(h hVar) {
        h hVar2 = hVar;
        hVar2.getClass();
        return s.i(this.f207530a, hVar2.f207530a);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return this.f207530a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return this.f207530a == ((h) obj).f207530a;
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return this.f207530a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f207530a);
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) this.f207530a;
    }

    @Override // java.lang.Number
    public final long longValue() {
        return this.f207530a;
    }

    @Override // java.lang.Number
    public final short shortValue() {
        return (short) this.f207530a;
    }

    public final String toString() {
        return String.valueOf(this.f207530a);
    }

    /* JADX INFO: renamed from: zy2.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lzy2/h$a;", "", "<init>", "()V", "Li63/c;", "Lzy2/h;", "serializer", "()Li63/c;", "util-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<h> serializer() {
            return i.f207531a;
        }

        private Companion() {
        }
    }
}
