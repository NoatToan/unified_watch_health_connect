package ja0;

import p005kotlin.Metadata;
import v13.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.cycling.ActivityProfilesAndSensorsViewModel", f = "ActivityProfilesAndSensorsViewModel.kt", l = {64, 78}, m = "fetchActivityProfiles", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f98067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f98068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f98069c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f98068b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f98067a = obj;
        this.f98069c |= Integer.MIN_VALUE;
        return this.f98068b.x4(this);
    }
}
