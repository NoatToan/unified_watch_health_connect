package re2;

import java.io.Serializable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.AuthenticationHelper", f = "AuthenticationHelper.kt", l = {1411, 1417, 1426, 1446, 1458, 1465}, m = "runOAuth2DI")
public final class w extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Serializable f152341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r0 f152342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m0 f152343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r0 f152344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r0 f152345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r0 f152346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f152347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f152348h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b f152349i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f152350j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(b bVar, t13.d<? super w> dVar) {
        super(dVar);
        this.f152349i = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f152348h = obj;
        this.f152350j |= Integer.MIN_VALUE;
        b bVar = b.f152215a;
        return this.f152349i.C(null, false, null, this);
    }
}
