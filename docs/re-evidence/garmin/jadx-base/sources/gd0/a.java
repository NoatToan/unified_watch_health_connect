package gd0;

import com.garmin.android.apps.connectmobile.courses.model.e;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import d60.f;
import k30.p;
import lc.u0;
import o13.r;
import o53.s0;
import o53.t1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import u53.o;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lgd0/a;", "Lq20/a;", "Lgd0/a$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "courseId", "Lk30/p;", "courseUpdateDTO", "<init>", "(Lgd0/a$a;Ljava/lang/String;Lk30/p;)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends q20.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1550a f76954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f76956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d60.b f76957e;

    /* JADX INFO: renamed from: gd0.a$a, reason: collision with other inner class name */
    public interface InterfaceC1550a {
        void a();

        void b(e eVar);
    }

    public a(InterfaceC1550a interfaceC1550a, String str, p pVar) {
        interfaceC1550a.getClass();
        str.getClass();
        pVar.getClass();
        this.f76954b = interfaceC1550a;
        this.f76955c = str;
        this.f76956d = pVar;
        this.f76957e = u0.g(d60.b.f57806c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (ge1.b.e0(r2, r3, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        if (ge1.b.e0(r9, r2, r0) == r1) goto L32;
     */
    @Override // q20.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(v13.c cVar) {
        b bVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f76960c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f76960c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objJ = bVar.f76958a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f76960c;
        if (i15 == 0) {
            r.b(objJ);
            bVar.f76960c = 1;
            d60.b bVar2 = this.f76957e;
            bVar2.getClass();
            objJ = f0.J(bVar2, new f(bVar2, this.f76955c, this.f76956d, null), bVar);
            if (objJ != aVar) {
            }
            return aVar;
        }
        if (i15 != 1) {
            if (i15 == 2) {
                r.b(objJ);
                return Unit.INSTANCE;
            }
            if (i15 == 3) {
                r.b(objJ);
                return Unit.INSTANCE;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(objJ);
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            x53.c cVar2 = s0.f129406a;
            t1 t1Var = o.f168762a;
            c cVar3 = new c(v2Var, this, null);
            bVar.f76960c = 2;
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            x53.c cVar4 = s0.f129406a;
            t1 t1Var2 = o.f168762a;
            d dVar = new d(this, null);
            bVar.f76960c = 3;
        }
        return aVar;
    }
}
