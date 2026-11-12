package fl1;

import java.io.Serializable;
import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.setup.domain.GetDeviceWheelchairAvailabilityUseCase", f = "GetDeviceWheelchairAvailabilityUseCase.kt", l = {13}, m = "invoke-gIAlu-s", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f71999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f72000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f72001c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f72000b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f71999a = obj;
        this.f72001c |= Integer.MIN_VALUE;
        Serializable serializableA = this.f72000b.a(0L, this);
        return serializableA == u13.a.COROUTINE_SUSPENDED ? serializableA : q.a(serializableA);
    }
}
