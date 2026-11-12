package ja0;

import p005kotlin.Metadata;
import v13.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.cycling.ActivityProfilesAndSensorsViewModel", f = "ActivityProfilesAndSensorsViewModel.kt", l = {94, 120}, m = "fetchFeatureListFromDevice", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f98070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f98071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f98072c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f98071b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f98070a = obj;
        this.f98072c |= Integer.MIN_VALUE;
        return this.f98071b.y4(this);
    }
}
