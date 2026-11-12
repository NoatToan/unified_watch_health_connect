package fl1;

import com.garmin.android.apps.connectmobile.v2;
import java.io.Serializable;
import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.setup.domain.GetDeviceRecentActivityTypesUseCase", f = "GetDeviceRecentActivityTypesUseCase.kt", l = {25, 34}, m = "invoke-0E7RQCE", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f71994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v2.b f71995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f71996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f71997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f71998e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f71997d = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f71996c = obj;
        this.f71998e |= Integer.MIN_VALUE;
        Serializable serializableA = this.f71997d.a(null, null, this);
        return serializableA == u13.a.COROUTINE_SUSPENDED ? serializableA : q.a(serializableA);
    }
}
