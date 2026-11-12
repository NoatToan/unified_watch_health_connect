package dt2;

import com.garmin.gfdi.protobuf.ProtobufException;
import com.garmin.proto.generated.GDISmartProto;
import java.util.concurrent.CancellationException;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import rs2.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ldt2/f;", "Ldt2/k;", "Ldt2/d;", "handler", "", "requestId", "<init>", "(Ldt2/d;I)V", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f61195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f61196b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "com.garmin.gfdi.protobuf.ProtobufHandlerResponder", f = "ProtobufHandler.kt", l = {82}, m = "respond")
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f61197a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f61199c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f61197a = obj;
            this.f61199c |= Integer.MIN_VALUE;
            return f.this.a(null, this);
        }
    }

    public f(d dVar, int i14) {
        dVar.getClass();
        this.f61195a = dVar;
        this.f61196b = i14;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // dt2.k
    public final Object a(GDISmartProto.Smart smart, t13.d<? super Unit> dVar) throws ProtobufException {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f61199c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f61199c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f61197a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f61199c;
        d dVar2 = this.f61195a;
        try {
            if (i15 == 0) {
                r.b(obj);
                rs2.g gVar = dVar2.f61149d;
                int i16 = this.f61196b;
                if (gVar != null) {
                    gVar.onProtobufRespond(i16, smart);
                }
                aVar.f61199c = 1;
                if (dVar2.h(5044, i16, smart, aVar) == aVar2) {
                    return aVar2;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        } catch (ProtobufException e4) {
            if (!(e4.getCause() instanceof CancellationException)) {
                v vVar = dVar2.f61147b;
                if (!(vVar instanceof us2.b) || ((us2.b) vVar).f172464g.get() != us2.b.a.ENDED) {
                    throw e4;
                }
            }
        } catch (CancellationException unused) {
        }
        return Unit.INSTANCE;
    }
}
