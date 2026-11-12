package wu2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "com.garmin.realtimesettings.app.baseviews.action.ActionDataHandler$Companion", f = "ActionDataHandler.kt", l = {55}, m = "actionClick", v = 1)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f187336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f187337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f187338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d.a f187339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f187340e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d.a aVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f187339d = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f187338c = obj;
        this.f187340e |= Integer.MIN_VALUE;
        return this.f187339d.a(0, 0, this);
    }
}
