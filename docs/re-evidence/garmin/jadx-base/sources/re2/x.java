package re2;

import java.io.Serializable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.AuthenticationHelper", f = "AuthenticationHelper.kt", l = {1107, 1125, 1132, 1138}, m = "runOAuth2IT")
public final class x extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Serializable f152351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f152352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f152353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f152354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f152355e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(b bVar, t13.d<? super x> dVar) {
        super(dVar);
        this.f152354d = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f152353c = obj;
        this.f152355e |= Integer.MIN_VALUE;
        b bVar = b.f152215a;
        return this.f152354d.D(null, false, null, this);
    }
}
