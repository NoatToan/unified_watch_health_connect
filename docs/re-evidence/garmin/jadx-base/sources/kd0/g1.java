package kd0;

import java.util.Iterator;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.DeviceDelegateImpl", f = "DeviceDelegateImpl.kt", l = {362, 363, 371, 379}, m = "checkDeviceOnboardingInfo", v = 2)
public final class g1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set f104074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b31.a f104075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b31.f f104076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f104077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d31.a f104078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f104079f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f104080g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f104081h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l1 f104082i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f104083j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(l1 l1Var, t13.d<? super g1> dVar) {
        super(dVar);
        this.f104082i = l1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104081h = obj;
        this.f104083j |= Integer.MIN_VALUE;
        return this.f104082i.a(null, this);
    }
}
