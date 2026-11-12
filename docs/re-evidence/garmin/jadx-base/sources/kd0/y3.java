package kd0;

import android.net.Uri;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.LiveActivityAppNotificationsProviderImpl", f = "LiveActivityAppNotificationsProviderImpl.kt", l = {72}, m = "isNotificationEnabled", v = 2)
public final class y3 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f104455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x3 f104456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104457c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(x3 x3Var, t13.d<? super y3> dVar) {
        super(dVar);
        this.f104456b = x3Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104455a = obj;
        this.f104457c |= Integer.MIN_VALUE;
        Uri uri = x3.f104447a;
        return this.f104456b.d(this);
    }
}
