package u10;

import java.util.HashMap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.p0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.requests.oauth.ConnectIQOAuthRepo", f = "ConnectIQOAuthRepo.kt", l = {57}, m = "getEncodedResult", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap f167728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p0 f167729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f167730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f167731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f167732e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f167731d = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f167730c = obj;
        this.f167732e |= Integer.MIN_VALUE;
        int i14 = b.f167726b;
        return this.f167731d.a(null, null, this);
    }
}
