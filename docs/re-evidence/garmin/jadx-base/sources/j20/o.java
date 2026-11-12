package j20;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.contacts.emergency.EmergencyContactViewModel", f = "EmergencyContactViewModel.kt", l = {763, 764}, m = "updateEmailWithLiveTrackFlag", v = 2)
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f96591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.contacts.emergency.d f96592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f96593c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.garmin.android.apps.connectmobile.contacts.emergency.d dVar, t13.d<? super o> dVar2) {
        super(dVar2);
        this.f96592b = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f96591a = obj;
        this.f96593c |= Integer.MIN_VALUE;
        return com.garmin.android.apps.connectmobile.contacts.emergency.d.x4(this.f96592b, 0L, this);
    }
}
