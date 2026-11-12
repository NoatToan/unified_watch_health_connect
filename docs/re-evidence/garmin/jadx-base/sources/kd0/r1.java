package kd0;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.DeviceSetupDelegateImpl", f = "DeviceSetupDelegateImpl.kt", l = {485, 490}, m = "buildTransferDeviceList", v = 2)
public final class r1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f104324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f104325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ui1.o0 f104326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f104327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f104328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q1 f104329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f104330g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(q1 q1Var, t13.d<? super r1> dVar) {
        super(dVar);
        this.f104329f = q1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104328e = obj;
        this.f104330g |= Integer.MIN_VALUE;
        int i14 = q1.f104302c;
        return this.f104329f.t(0L, null, null, null, this);
    }
}
