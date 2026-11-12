package su0;

import java.util.List;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.data.repository.ConnectionsRepository", f = "ConnectionsRepository.kt", l = {41, 46, 52, 53}, m = "fetchConnections", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i0 f160946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f160947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f160948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f160949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f160950e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f160949d = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f160948c = obj;
        this.f160950e |= Integer.MIN_VALUE;
        return this.f160949d.a(this);
    }
}
