package com.garmin.android.apps.connectmobile.dashboard.presentation;

import e23.l;
import e23.p;
import i3.fe;
import i3.se;
import i3.yd;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardScreenKt$Dashboard$action$1$showSnackbar$1", f = "DashboardScreen.kt", l = {194}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fe f33529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f33530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f33531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f33532e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yd f33533f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m4.b0 f33534g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l<se, Unit> f33535h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(fe feVar, String str, String str2, boolean z14, yd ydVar, m4.b0 b0Var, l<? super se, Unit> lVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f33529b = feVar;
        this.f33530c = str;
        this.f33531d = str2;
        this.f33532e = z14;
        this.f33533f = ydVar;
        this.f33534g = b0Var;
        this.f33535h = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f33529b, this.f33530c, this.f33531d, this.f33532e, this.f33533f, this.f33534g, this.f33535h, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f33528a;
        if (i14 == 0) {
            r.b(obj);
            this.f33528a = 1;
            fe feVar = this.f33529b;
            feVar.getClass();
            obj = feVar.a(new fe.b(this.f33530c, this.f33531d, this.f33532e, this.f33533f), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        m4.b0.a(this.f33534g);
        this.f33535h.invoke((se) obj);
        return Unit.INSTANCE;
    }
}
