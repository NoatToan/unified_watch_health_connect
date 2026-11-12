package ow2;

import p005kotlin.Metadata;
import t13.d;
import v13.e;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@e(c = "com.garmin.realtimesettings.app.datahandler.servicecalls.menu.MenuResponseServiceCalls", f = "MenuResponseServiceCalls.kt", l = {40, 47}, m = "getSettingsMenuResponseService", v = 1)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f134307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f134308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f134309c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, d<? super b> dVar) {
        super(dVar);
        this.f134308b = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f134307a = obj;
        this.f134309c |= Integer.MIN_VALUE;
        return this.f134308b.d(null, this);
    }
}
