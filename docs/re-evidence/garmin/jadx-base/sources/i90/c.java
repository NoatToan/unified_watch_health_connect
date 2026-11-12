package i90;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.customization.cycling.SimpleSetupProtobufDataHandler", f = "SimpleSetupProtobufDataHandler.kt", l = {60}, m = "fetchFeatureList", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f92280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f92281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f92282c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f92281b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f92280a = obj;
        this.f92282c |= Integer.MIN_VALUE;
        return this.f92281b.c(this);
    }
}
