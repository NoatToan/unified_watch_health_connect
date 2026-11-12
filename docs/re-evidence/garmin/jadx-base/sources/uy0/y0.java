package uy0;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.navigation.domain.GetSettingsItemsUseCase", f = "GetSettingsItemsUseCase.kt", l = {142, 149}, m = "handleRegisteredDevices", v = 2)
public final class y0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f173362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f173363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public gj1.b f173364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public gj1.b f173365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p005kotlin.jvm.internal.r0 f173366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p005kotlin.jvm.internal.r0 f173367f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f173368g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f173369h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f173370i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v0 f173371j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f173372k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(v0 v0Var, t13.d<? super y0> dVar) {
        super(dVar);
        this.f173371j = v0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f173370i = obj;
        this.f173372k |= Integer.MIN_VALUE;
        int i14 = v0.f173327h;
        return this.f173371j.c(null, false, this);
    }
}
