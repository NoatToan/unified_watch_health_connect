package qh1;

import com.garmin.android.apps.connectmobile.f0;
import o53.s0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lqh1/e;", "Lqh1/m;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lqh1/k;", "customMetricsApi", "Lm42/a;", "weightsApi", "<init>", "(Lqh1/k;Lm42/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements m, f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f144729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m42.a f144730b;

    public e(k kVar, m42.a aVar) {
        kVar.getClass();
        aVar.getClass();
        this.f144729a = kVar;
        this.f144730b = aVar;
    }

    @Override // qh1.m
    public final Object a(long j8, rh1.b bVar, v vVar) {
        x53.c cVar = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new d(this, j8, bVar, null), vVar);
    }

    @Override // qh1.m
    public final Object b(long j8, u uVar) {
        x53.c cVar = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new c(this, j8, null), uVar);
    }

    @Override // qh1.m
    public final Object c(LocalDate localDate, LocalDate localDate2, v13.i iVar) {
        Boolean bool = Boolean.TRUE;
        x53.c cVar = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new b(this, null, null, localDate, localDate2, bool, null), iVar);
    }

    @Override // qh1.m
    public final Object d(long j8, r rVar) {
        x53.c cVar = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new a(this, j8, null), rVar);
    }
}
