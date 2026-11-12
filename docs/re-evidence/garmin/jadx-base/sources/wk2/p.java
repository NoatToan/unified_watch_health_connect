package wk2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.core.data.UrlDataSource", f = "UrlDataSource.kt", l = {154}, m = "load$suspendImpl")
public final class p extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f185879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f185880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f185881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f185882d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(o oVar, t13.d<? super p> dVar) {
        super(dVar);
        this.f185881c = oVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f185880b = obj;
        this.f185882d |= Integer.MIN_VALUE;
        return o.i(this.f185881c, this);
    }
}
