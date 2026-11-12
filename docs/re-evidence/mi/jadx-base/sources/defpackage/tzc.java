package defpackage;

/* JADX INFO: loaded from: classes9.dex */
public interface tzc extends Comparable<tzc> {
    long getEndTime();

    long getStartTime();

    long getTimestamp();

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    default int compareTo(tzc tzcVar) {
        return Long.compare(getTimestamp(), tzcVar.getTimestamp());
    }
}
