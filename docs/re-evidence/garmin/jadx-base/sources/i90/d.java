package i90;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.customization.cycling.SimpleSetupProtobufDataHandler", f = "SimpleSetupProtobufDataHandler.kt", l = {90}, m = "sendRestoreListNotification", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f92283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f92284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f92285c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f92284b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f92283a = obj;
        this.f92285c |= Integer.MIN_VALUE;
        return this.f92284b.l(null, this);
    }
}
