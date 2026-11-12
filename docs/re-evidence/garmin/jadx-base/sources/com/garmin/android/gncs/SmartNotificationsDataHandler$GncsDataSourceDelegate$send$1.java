package com.garmin.android.gncs;

import e23.p;
import java.util.function.Consumer;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import rs2.v;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
@v13.e(c = "com.garmin.android.gncs.SmartNotificationsDataHandler$GncsDataSourceDelegate$send$1", f = "SmartNotificationsDataHandler.kt", l = {520}, m = "invokeSuspend")
public final class SmartNotificationsDataHandler$GncsDataSourceDelegate$send$1 extends i implements p<b0, t13.d<? super Unit>, Object> {
    final /* synthetic */ Consumer<byte[]> $listener;
    final /* synthetic */ int $messageType;
    final /* synthetic */ byte[] $payload;
    int label;
    final /* synthetic */ SmartNotificationsDataHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartNotificationsDataHandler$GncsDataSourceDelegate$send$1(SmartNotificationsDataHandler smartNotificationsDataHandler, int i14, byte[] bArr, Consumer<byte[]> consumer, t13.d<? super SmartNotificationsDataHandler$GncsDataSourceDelegate$send$1> dVar) {
        super(2, dVar);
        this.this$0 = smartNotificationsDataHandler;
        this.$messageType = i14;
        this.$payload = bArr;
        this.$listener = consumer;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new SmartNotificationsDataHandler$GncsDataSourceDelegate$send$1(this.this$0, this.$messageType, this.$payload, this.$listener, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((SmartNotificationsDataHandler$GncsDataSourceDelegate$send$1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.label;
        try {
            if (i14 == 0) {
                r.b(obj);
                v vVar = this.this$0.messenger;
                if (vVar == null) {
                    s.m("messenger");
                    throw null;
                }
                int i15 = this.$messageType;
                byte[] bArr = this.$payload;
                this.label = 1;
                obj = vVar.b(i15, bArr, this);
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
            this.$listener.accept((byte[]) obj);
        } catch (Throwable th3) {
            ih2.b.c(this.this$0.logTag + "failed to send message", th3);
            this.$listener.accept(null);
        }
        return Unit.INSTANCE;
    }
}
