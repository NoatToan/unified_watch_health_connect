package ip;

import java.io.Serializable;
import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.privacy.ActivityPrivacyRepo", f = "ActivityPrivacyRepo.kt", l = {17}, m = "hasPendingPrivacyRequest-IoAF18A", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f94641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f94642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f94643c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f94642b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f94641a = obj;
        this.f94643c |= Integer.MIN_VALUE;
        Serializable serializableF = this.f94642b.f(this);
        return serializableF == u13.a.COROUTINE_SUSPENDED ? serializableF : q.a(serializableF);
    }
}
