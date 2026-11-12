package kr;

import bq0.k;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lzp0/f;", "<anonymous>", "(Lo53/b0;)Lzp0/f;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.data.repository.ActivityImageDataSource$processImage$loadedImage$1", f = "ActivityImageDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super zp0.f>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f106220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f106221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f106222c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, k kVar, long j8, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f106220a = gVar;
        this.f106221b = kVar;
        this.f106222c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f106220a, this.f106221b, this.f106222c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super zp0.f> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        g gVar = this.f106220a;
        return gVar.f106216b.a(gVar.f106215a, this.f106221b, new Long(this.f106222c));
    }
}
