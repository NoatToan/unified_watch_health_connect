package rw2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "com.garmin.realtimesettings.app.datalayer.SettingsDataModel", f = "SettingsDataModel.kt", l = {386, 393, 400, 407, 416, 423, 430, 438, 446, 453, 460, 467, 474, 481}, m = "updateDataValue", v = 1)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f154894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f154895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f154896c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f154895b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f154894a = obj;
        this.f154896c |= Integer.MIN_VALUE;
        return this.f154895b.g(null, null, 0, null, this);
    }
}
