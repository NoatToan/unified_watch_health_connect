package u10;

import java.util.HashMap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.p0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.requests.oauth.ConnectIQOAuthRepo", f = "ConnectIQOAuthRepo.kt", l = {93}, m = "getJsonResult", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap f167736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p0 f167737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f167738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f167739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f167740e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f167739d = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f167738c = obj;
        this.f167740e |= Integer.MIN_VALUE;
        int i14 = b.f167726b;
        return this.f167739d.b(null, null, this);
    }
}
