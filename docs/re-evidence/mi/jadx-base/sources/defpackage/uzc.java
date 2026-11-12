package defpackage;

/* JADX INFO: loaded from: classes9.dex */
public interface uzc extends Comparable<uzc> {
    long getTimestamp();

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    default int compareTo(uzc uzcVar) {
        return Long.compare(getTimestamp(), uzcVar.getTimestamp());
    }
}
