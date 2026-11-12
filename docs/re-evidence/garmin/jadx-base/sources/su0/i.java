package su0;

import java.util.List;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.data.repository.ContactsRepository", f = "ContactsRepository.kt", l = {70, 71, 73, 73}, m = "fetchAllRecipients", v = 2)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i0 f160965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i0 f160966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t f160967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f160968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f160969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t f160970f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f160971g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(t tVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f160970f = tVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f160969e = obj;
        this.f160971g |= Integer.MIN_VALUE;
        return this.f160970f.c(this);
    }
}
