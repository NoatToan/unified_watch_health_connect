package ch.qos.logback.core.util;

/* JADX INFO: loaded from: classes7.dex */
class CharSequenceState {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final char f27288c;
    int occurrences = 1;

    public CharSequenceState(char c14) {
        this.f27288c = c14;
    }

    public void incrementOccurrences() {
        this.occurrences++;
    }
}
