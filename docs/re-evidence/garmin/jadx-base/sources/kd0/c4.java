package kd0;

import java.util.UUID;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.LiveActivitySessionTypeProviderImpl", f = "LiveActivitySessionTypeProviderImpl.kt", l = {22, 23, 28, 29}, m = "getSessionType", v = 2)
public final class c4 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f104017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public UUID f104018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f104020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g4 f104021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f104022f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(g4 g4Var, t13.d<? super c4> dVar) {
        super(dVar);
        this.f104021e = g4Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104020d = obj;
        this.f104022f |= Integer.MIN_VALUE;
        return this.f104021e.c(0L, null, this);
    }
}
