package ch.qos.logback.classic.android;

/* JADX INFO: loaded from: classes7.dex */
final class SystemClock implements Clock {
    @Override // ch.qos.logback.classic.android.Clock
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
