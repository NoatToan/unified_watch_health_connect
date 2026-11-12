package com.garmin.android.apps.connectmobile.gfdi.protobuf;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import rd2.j;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\t\u0018\u00010\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lsd2/f;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lo53/b0;)Lsd2/f;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gfdi.protobuf.DeviceStatusDataHandler$onProtobufRequest$1$deviceRecord$1", f = "DeviceStatusDataHandler.kt", l = {}, m = "invokeSuspend", v = 2)
public final class DeviceStatusDataHandler$onProtobufRequest$1$deviceRecord$1 extends i implements p<b0, t13.d<? super sd2.f>, Object> {
    int label;
    final /* synthetic */ DeviceStatusDataHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceStatusDataHandler$onProtobufRequest$1$deviceRecord$1(DeviceStatusDataHandler deviceStatusDataHandler, t13.d<? super DeviceStatusDataHandler$onProtobufRequest$1$deviceRecord$1> dVar) {
        super(2, dVar);
        this.this$0 = deviceStatusDataHandler;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new DeviceStatusDataHandler$onProtobufRequest$1$deviceRecord$1(this.this$0, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super sd2.f> dVar) {
        return ((DeviceStatusDataHandler$onProtobufRequest$1$deviceRecord$1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        j jVar = rd2.f.a().f152045a;
        rs2.c cVar = this.this$0.deviceInfo;
        if (cVar == null) {
            s.m("deviceInfo");
            throw null;
        }
        long f92746j = cVar.getF92746j();
        jVar.getClass();
        return j.i(f92746j, null);
    }
}
