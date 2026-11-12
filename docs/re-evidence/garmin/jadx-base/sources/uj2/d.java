package uj2;

import com.garmin.gfdi.protobuf.ProtobufException;
import com.garmin.proto.generated.GDISmartProto;
import dt2.k;
import e23.p;
import o13.r;
import o53.b0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Luj2/d;", "", "Ldt2/k;", "responder", "Lo53/b0;", "coroutineScope", "Lorg/slf4j/Logger;", "logger", "<init>", "(Ldt2/k;Lo53/b0;Lorg/slf4j/Logger;)V", "ciq-http_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f171603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f171604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Logger f171605c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "com.garmin.device.ciq.http.handlers.ResponderCompat$respond$1", f = "ResponderCompat.kt", l = {26}, m = "invokeSuspend")
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f171606a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GDISmartProto.Smart f171608c;

        /* JADX INFO: renamed from: uj2.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
        @e(c = "com.garmin.device.ciq.http.handlers.ResponderCompat$respond$1$1", f = "ResponderCompat.kt", l = {28}, m = "invokeSuspend")
        public static final class C3192a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f171609a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f171610b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ GDISmartProto.Smart f171611c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3192a(d dVar, GDISmartProto.Smart smart, t13.d<? super C3192a> dVar2) {
                super(2, dVar2);
                this.f171610b = dVar;
                this.f171611c = smart;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C3192a(this.f171610b, this.f171611c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C3192a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f171609a;
                d dVar = this.f171610b;
                try {
                    if (i14 == 0) {
                        r.b(obj);
                        k kVar = dVar.f171603a;
                        GDISmartProto.Smart smart = this.f171611c;
                        this.f171609a = 1;
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
                } catch (ProtobufException e4) {
                    dVar.f171605c.error("failed to send protobuf response", (Throwable) e4);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(GDISmartProto.Smart smart, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f171608c = smart;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new a(this.f171608c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f171606a;
            if (i14 == 0) {
                r.b(obj);
                C3192a c3192a = new C3192a(d.this, this.f171608c, null);
                this.f171606a = 1;
                if (ge1.b.Y(c3192a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public d(k kVar, b0 b0Var, Logger logger) {
        kVar.getClass();
        b0Var.getClass();
        logger.getClass();
        this.f171603a = kVar;
        this.f171604b = b0Var;
        this.f171605c = logger;
    }

    public final void a(GDISmartProto.Smart smart) {
        smart.getClass();
        ge1.b.T(this.f171604b, null, null, new a(smart, null), 3);
    }
}
