package jw2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "com.garmin.realtimesettings.app.datahandler.decipher.MenuChangeResponse$Companion", f = "MenuChangeResponse.kt", l = {41}, m = "handleMenuChange", v = 1)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f101367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c.a f101368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f101369c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c.a aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f101368b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f101367a = obj;
        this.f101369c |= Integer.MIN_VALUE;
        return this.f101368b.a(0, 0, this);
    }
}
