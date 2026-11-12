package defpackage;

/* JADX INFO: loaded from: classes9.dex */
public interface szc {
    default int a() {
        return 0;
    }

    default int b() {
        return 0;
    }

    default int c() {
        return 0;
    }

    default long getDuration() {
        return getEndTime() - getStartTime();
    }

    long getEndTime();

    long getStartTime();
}
