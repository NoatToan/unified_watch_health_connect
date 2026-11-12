package mz1;

import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class l1<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f121832a;

    public l1(long j8) {
        this.f121832a = j8;
    }

    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        long unitID = ((sd2.f) t14).getUnitID();
        long j8 = this.f121832a;
        return r13.a.b(Boolean.valueOf(unitID == j8), Boolean.valueOf(((sd2.f) t7).getUnitID() == j8));
    }
}
