package com.garmin.android.apps.connectmobile.weighttracker.data.womenshealth.network;

import c83.a0;
import e23.p;
import o13.r;
import o53.b0;
import okhttp3.ResponseBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.weighttracker.data.womenshealth.network.WomensHealthServiceApi$Companion$getDetailedDailySummary$message$1", f = "WomensHealthServiceApi.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d extends i implements p<b0, t13.d<? super String>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0<j52.c> f47990a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a0<j52.c> a0Var, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f47990a = a0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f47990a, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super String> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        ResponseBody responseBody = this.f47990a.f25747c;
        if (responseBody != null) {
            return responseBody.string();
        }
        return null;
    }
}
