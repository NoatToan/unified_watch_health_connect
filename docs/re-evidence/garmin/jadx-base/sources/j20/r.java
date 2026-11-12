package j20;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.contacts.emergency.EmergencyContactViewModel", f = "EmergencyContactViewModel.kt", l = {791}, m = "validatePhoneNumber", v = 2)
public final class r extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f96601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.contacts.emergency.d f96602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f96603c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.garmin.android.apps.connectmobile.contacts.emergency.d dVar, t13.d<? super r> dVar2) {
        super(dVar2);
        this.f96602b = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f96601a = obj;
        this.f96603c |= Integer.MIN_VALUE;
        return com.garmin.android.apps.connectmobile.contacts.emergency.d.z4(this.f96602b, this);
    }
}
