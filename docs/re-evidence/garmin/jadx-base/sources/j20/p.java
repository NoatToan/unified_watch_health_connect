package j20;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.contacts.emergency.EmergencyContactViewModel", f = "EmergencyContactViewModel.kt", l = {735, 736}, m = "updatePhoneNumberWithLiveTrackFlag", v = 2)
public final class p extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f96594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.contacts.emergency.d f96595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f96596c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.garmin.android.apps.connectmobile.contacts.emergency.d dVar, t13.d<? super p> dVar2) {
        super(dVar2);
        this.f96595b = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f96594a = obj;
        this.f96596c |= Integer.MIN_VALUE;
        return com.garmin.android.apps.connectmobile.contacts.emergency.d.y4(this.f96595b, 0L, this);
    }
}
