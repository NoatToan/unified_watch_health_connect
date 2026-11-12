package zd0;

import android.content.Context;
import android.net.Uri;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.domain.PurchaseDelegateImpl", f = "PurchaseDelegateImpl.kt", l = {35, 43}, m = "getAutoLoginUrl", v = 2)
public final class i1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Uri f204029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f12.b f204030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f204031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f204032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h1 f204033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f204034f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(h1 h1Var, t13.d<? super i1> dVar) {
        super(dVar);
        this.f204033e = h1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f204032d = obj;
        this.f204034f |= Integer.MIN_VALUE;
        return this.f204033e.e3(null, this);
    }
}
