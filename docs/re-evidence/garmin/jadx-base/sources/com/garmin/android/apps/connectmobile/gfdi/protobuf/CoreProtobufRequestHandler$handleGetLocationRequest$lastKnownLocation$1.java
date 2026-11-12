package com.garmin.android.apps.connectmobile.gfdi.protobuf;

import android.location.Location;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Landroid/location/Location;", "<anonymous>", "(Lo53/b0;)Landroid/location/Location;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gfdi.protobuf.CoreProtobufRequestHandler$handleGetLocationRequest$lastKnownLocation$1", f = "CoreProtobufRequestHandler.kt", l = {87}, m = "invokeSuspend", v = 2)
public final class CoreProtobufRequestHandler$handleGetLocationRequest$lastKnownLocation$1 extends i implements p<b0, t13.d<? super Location>, Object> {
    final /* synthetic */ mv0.e $locationProvider;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreProtobufRequestHandler$handleGetLocationRequest$lastKnownLocation$1(mv0.e eVar, t13.d<? super CoreProtobufRequestHandler$handleGetLocationRequest$lastKnownLocation$1> dVar) {
        super(2, dVar);
        this.$locationProvider = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new CoreProtobufRequestHandler$handleGetLocationRequest$lastKnownLocation$1(this.$locationProvider, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Location> dVar) {
        return ((CoreProtobufRequestHandler$handleGetLocationRequest$lastKnownLocation$1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.label;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        mv0.e eVar = this.$locationProvider;
        this.label = 1;
        Object objC = eVar.c("CoreProtobufReqHandler", this);
        return objC == aVar ? aVar : objC;
    }
}
