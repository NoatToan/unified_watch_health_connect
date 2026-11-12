package i90;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.customization.cycling.SportProfileProtobufDataHandler", f = "SportProfileProtobufDataHandler.kt", l = {105}, m = "sendSelectedSportList", v = 2)
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f92296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f92297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f92298c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f92297b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f92296a = obj;
        this.f92298c |= Integer.MIN_VALUE;
        return this.f92297b.l(null, this);
    }
}
