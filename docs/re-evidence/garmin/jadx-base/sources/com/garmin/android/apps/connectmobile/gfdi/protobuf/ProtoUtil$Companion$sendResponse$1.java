package com.garmin.android.apps.connectmobile.gfdi.protobuf;

import com.garmin.proto.generated.GDISmartProto;
import dt2.k;
import e23.l;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtoUtil$Companion$sendResponse$1", f = "ProtoUtil.kt", l = {97}, m = "invokeSuspend", v = 2)
public final class ProtoUtil$Companion$sendResponse$1 extends i implements p<b0, t13.d<? super Unit>, Object> {
    final /* synthetic */ l<Exception, Unit> $listener;
    final /* synthetic */ k $responder;
    final /* synthetic */ GDISmartProto.Smart $smart;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ProtoUtil$Companion$sendResponse$1(k kVar, GDISmartProto.Smart smart, l<? super Exception, Unit> lVar, t13.d<? super ProtoUtil$Companion$sendResponse$1> dVar) {
        super(2, dVar);
        this.$responder = kVar;
        this.$smart = smart;
        this.$listener = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new ProtoUtil$Companion$sendResponse$1(this.$responder, this.$smart, this.$listener, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((ProtoUtil$Companion$sendResponse$1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.label;
        try {
            if (i14 == 0) {
                r.b(obj);
                k kVar = this.$responder;
                GDISmartProto.Smart smart = this.$smart;
                this.label = 1;
                if (kVar.a(smart, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            l<Exception, Unit> lVar = this.$listener;
            if (lVar != null) {
                lVar.invoke(null);
            }
        } catch (Exception e4) {
            l<Exception, Unit> lVar2 = this.$listener;
            if (lVar2 != null) {
                lVar2.invoke(e4);
            }
        }
        return Unit.INSTANCE;
    }
}
