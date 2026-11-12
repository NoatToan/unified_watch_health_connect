package defpackage;

import java.util.Date;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class mvl extends hul {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Date f27263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f27264b;

    public mvl() {
        this(yq5.c(), System.nanoTime());
    }

    @Override // defpackage.hul, java.lang.Comparable
    /* JADX INFO: renamed from: a */
    public int compareTo(@NotNull hul hulVar) {
        if (!(hulVar instanceof mvl)) {
            return super.compareTo(hulVar);
        }
        mvl mvlVar = (mvl) hulVar;
        long time = this.f27263a.getTime();
        long time2 = mvlVar.f27263a.getTime();
        return time == time2 ? Long.valueOf(this.f27264b).compareTo(Long.valueOf(mvlVar.f27264b)) : Long.valueOf(time).compareTo(Long.valueOf(time2));
    }

    @Override // defpackage.hul
    public long b(@NotNull hul hulVar) {
        return hulVar instanceof mvl ? this.f27264b - ((mvl) hulVar).f27264b : super.b(hulVar);
    }

    @Override // defpackage.hul
    public long e(@Nullable hul hulVar) {
        if (hulVar == null || !(hulVar instanceof mvl)) {
            return super.e(hulVar);
        }
        mvl mvlVar = (mvl) hulVar;
        return compareTo(hulVar) < 0 ? i(this, mvlVar) : i(mvlVar, this);
    }

    @Override // defpackage.hul
    public long h() {
        return yq5.a(this.f27263a);
    }

    public final long i(@NotNull mvl mvlVar, @NotNull mvl mvlVar2) {
        return mvlVar.h() + (mvlVar2.f27264b - mvlVar.f27264b);
    }

    public mvl(@NotNull Date date, long j) {
        this.f27263a = date;
        this.f27264b = j;
    }
}
