package cz2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@v13.e(c = "com.garmin.util.coroutines.SingleRunner", f = "SingleRunner.kt", l = {80, 70}, m = "afterPrevious")
public final class o<T> extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f56953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z53.b f56954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f56955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f56956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f56957e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, t13.d<? super o> dVar) {
        super(dVar);
        this.f56956d = pVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f56955c = obj;
        this.f56957e |= Integer.MIN_VALUE;
        return this.f56956d.a(null, this);
    }
}
