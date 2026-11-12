package mw2;

import p005kotlin.Metadata;
import t13.d;
import v13.e;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@e(c = "com.garmin.realtimesettings.app.datahandler.servicecalls.compositions.CompositionServiceCalls", f = "CompositionServiceCalls.kt", l = {41, 43, 47, 49}, m = "getCompositionService", v = 1)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f121301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f121302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f121303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f121304d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, d<? super b> dVar) {
        super(dVar);
        this.f121303c = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f121302b = obj;
        this.f121304d |= Integer.MIN_VALUE;
        return this.f121303c.d(0, null, this);
    }
}
