package kk0;

import com.garmin.android.apps.connectmobile.v2;
import java.io.File;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.data.repository.WebDataRepositoryImpl", f = "WebDataRepositoryImpl.kt", l = {35, 37, 42, 46}, m = "getGearBrandsModels", v = 2)
public final class k0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public File f105061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v2.a f105062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f105063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o0 f105064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f105065e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(o0 o0Var, t13.d<? super k0> dVar) {
        super(dVar);
        this.f105064d = o0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f105063c = obj;
        this.f105065e |= Integer.MIN_VALUE;
        return this.f105064d.a(null, this);
    }
}
