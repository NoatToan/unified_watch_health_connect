package uf2;

import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.garmin.gfdi.protobuf.ProtobufException;
import com.garmin.proto.generated.GDISmartProto;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luf2/y0;", "", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GDISmartProto.Smart f170540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dt2.g f170541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f170542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f170543d;

    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:
    
        if (b(r0) == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(v13.c cVar) {
        w0 w0Var;
        int i14;
        int i15;
        if (cVar instanceof w0) {
            w0Var = (w0) cVar;
            int i16 = w0Var.f170530d;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                w0Var.f170530d = i16 - Integer.MIN_VALUE;
            } else {
                w0Var = new w0(this, cVar);
            }
        } else {
            w0Var = new w0(this, cVar);
        }
        Object objB = w0Var.f170528b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i17 = w0Var.f170530d;
        try {
            if (i17 != 0) {
                if (i17 == 1) {
                    i15 = w0Var.f170527a;
                    o13.r.b(objB);
                } else {
                    if (i17 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(objB);
                }
                this.f170542c++;
                return Unit.INSTANCE;
            }
            o13.r.b(objB);
            GDISmartProto.Smart smart = this.f170540a;
            if (smart != null) {
                dt2.g gVar = this.f170541b;
                i14 = 0;
                if (gVar != null) {
                    w0Var.f170527a = 0;
                    w0Var.f170530d = 1;
                    objB = gVar.b(smart, w0Var);
                    if (objB != obj) {
                        i15 = 0;
                    }
                } else if (this.f170542c < 10) {
                    w0Var.f170527a = i14;
                    w0Var.f170530d = 2;
                }
                return obj;
            }
            return Unit.INSTANCE;
            i14 = i15;
            if (this.f170542c < 10) {
                w0Var.f170527a = i14;
                w0Var.f170530d = 2;
            }
            return Unit.INSTANCE;
        } catch (ProtobufException unused) {
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        if (a(r0) == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(v13.c cVar) {
        x0 x0Var;
        if (cVar instanceof x0) {
            x0Var = (x0) cVar;
            int i14 = x0Var.f170537c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                x0Var.f170537c = i14 - Integer.MIN_VALUE;
            } else {
                x0Var = new x0(this, cVar);
            }
        } else {
            x0Var = new x0(this, cVar);
        }
        Object obj = x0Var.f170535a;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = x0Var.f170537c;
        if (i15 == 0) {
            o13.r.b(obj);
            x0Var.f170537c = 1;
            if (o53.m0.b(AbstractComponentTracker.LINGERING_TIMEOUT, x0Var) != obj2) {
            }
            return obj2;
        }
        if (i15 == 1) {
            o13.r.b(obj);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        if (this.f170543d) {
            return Unit.INSTANCE;
        }
        x0Var.f170537c = 2;
    }
}
