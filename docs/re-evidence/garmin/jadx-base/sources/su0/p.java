package su0;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.data.repository.ContactsRepository", f = "ContactsRepository.kt", l = {162, 167}, m = "removeChildLiveTrackRecipient", v = 2)
public final class p extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public pu0.b f160988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v2.b f160989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f160990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f160991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f160992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f160993f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(t tVar, t13.d<? super p> dVar) {
        super(dVar);
        this.f160992e = tVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f160991d = obj;
        this.f160993f |= Integer.MIN_VALUE;
        return this.f160992e.n(null, this);
    }
}
