package ip;

import java.io.Serializable;
import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.privacy.ActivityPrivacyRepo", f = "ActivityPrivacyRepo.kt", l = {32}, m = "updatePastActivities-gIAlu-s", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f94646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f94647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f94648c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f94647b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f94646a = obj;
        this.f94648c |= Integer.MIN_VALUE;
        Serializable serializableC = this.f94647b.c(null, this);
        return serializableC == u13.a.COROUTINE_SUSPENDED ? serializableC : q.a(serializableC);
    }
}
