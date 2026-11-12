package sk0;

import p005kotlin.Metadata;
import yc.h3;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.menu.GearListDataSource", f = "GearListDataSource.kt", l = {29}, m = "load", v = 2)
public final class t0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h3.a f159839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f159840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f159841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s0 f159842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f159843e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(s0 s0Var, t13.d<? super t0> dVar) {
        super(dVar);
        this.f159842d = s0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f159841c = obj;
        this.f159843e |= Integer.MIN_VALUE;
        return this.f159842d.e(null, this);
    }
}
