package io.sentry.android.core.performance;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public class b implements Comparable<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final e f21568a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final e f21569b = new e();

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(b bVar) {
        int iCompare = Long.compare(this.f21568a.m(), bVar.f21568a.m());
        return iCompare == 0 ? Long.compare(this.f21569b.m(), bVar.f21569b.m()) : iCompare;
    }

    @NotNull
    public final e b() {
        return this.f21568a;
    }

    @NotNull
    public final e c() {
        return this.f21569b;
    }
}
