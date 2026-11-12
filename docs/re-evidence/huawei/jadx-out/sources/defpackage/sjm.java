package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes43.dex */
public final /* synthetic */ class sjm implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
    }
}
