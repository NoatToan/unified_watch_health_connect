package rw2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "com.garmin.realtimesettings.app.datalayer.SettingsDataModel", f = "SettingsDataModel.kt", l = {279}, m = "getComposition", v = 1)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f154890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f154891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f154892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f154893d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f154892c = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f154891b = obj;
        this.f154893d |= Integer.MIN_VALUE;
        return a.b(this.f154892c, null, false, 0, 0, false, this);
    }
}
