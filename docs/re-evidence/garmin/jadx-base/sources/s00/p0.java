package s00;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.cloudmessaging.handlers.SubscriptionCommonPushNotificationHandler", f = "SubscriptionCommonPushNotificationHandler.kt", l = {223}, m = "showNotification", v = 2)
public final class p0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k0 f155387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f155388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public sz0.e f155389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f155390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f155391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k0 f155392f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f155393g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f155394h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f155395i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k0 f155396j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f155397k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(k0 k0Var, t13.d<? super p0> dVar) {
        super(dVar);
        this.f155396j = k0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f155395i = obj;
        this.f155397k |= Integer.MIN_VALUE;
        return k0.f(this.f155396j, null, null, null, this);
    }
}
