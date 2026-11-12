package gx2;

import android.content.Context;
import jx2.r;
import o13.m;
import o13.t;
import o53.s0;
import o53.z;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.w;
import px2.o;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgx2/b;", "", "<init>", "()V", "d", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static vf1.b f80061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Context f80062c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f80060a = new d(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f80063d = m.b(c.f80068a);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t f80064e = m.b(C1604b.f80067a);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t f80065f = m.b(a.f80066a);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo53/z;", "invoke", "()Lo53/z;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends w implements e23.a<z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f80066a = new a();

        public a() {
            super(0);
        }

        @Override // e23.a
        public final z invoke() {
            return s0.f129406a;
        }
    }

    /* JADX INFO: renamed from: gx2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo53/z;", "invoke", "()Lo53/z;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C1604b extends w implements e23.a<z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1604b f80067a = new C1604b();

        public C1604b() {
            super(0);
        }

        @Override // e23.a
        public final z invoke() {
            x53.c cVar = s0.f129406a;
            return x53.b.f189152a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lorg/slf4j/Logger;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends w implements e23.a<Logger> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f80068a = new c();

        public c() {
            super(0);
        }

        @Override // e23.a
        public final Logger invoke() {
            return ge1.b.L("Helper");
        }
    }

    public static Object a(v13.c cVar) {
        return ge1.b.e0(s0.f129406a, new gx2.d(null), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bb, code lost:
    
        if (r12 == r1) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j8, String str, v13.c cVar) throws Throwable {
        f fVar;
        String str2;
        r rVar;
        o oVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f80075f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f80075f = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object obj = fVar.f80073d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f80075f;
        if (i15 != 0) {
            if (i15 == 1) {
                j8 = fVar.f80070a;
                r rVar2 = fVar.f80072c;
                String str3 = fVar.f80071b;
                o13.r.b(obj);
                rVar = rVar2;
                str2 = str3;
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        r rVar3 = new r();
        fVar.f80071b = str;
        fVar.f80072c = rVar3;
        fVar.f80070a = j8;
        fVar.f80075f = 1;
        Object objK = rVar3.k(j8, fVar);
        if (objK != aVar) {
            str2 = str;
            rVar = rVar3;
            obj = objK;
        }
        return aVar;
        long j14 = j8;
        kx2.d dVar = (kx2.d) obj;
        if (dVar != null && ((dVar.f107130b || dVar.f107129a || dVar.f107131c) && (oVar = (o) da2.d.b().getCapability(str2, o.class)) != null)) {
            String f172496d = oVar.f141835b.getF172496d();
            d dVar2 = f80060a;
            dVar2.getClass();
            Logger loggerB = d.b();
            StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(j14, "onDevicePaired -> ", f172496d, "(");
            sbJ.append(")");
            loggerB.debug(sbJ.toString());
            fVar.f80071b = null;
            fVar.f80072c = null;
            fVar.f80075f = 2;
            rVar.getClass();
            dVar2.getClass();
            Object objE0 = ge1.b.e0(d.a(), new jx2.o(rVar, f172496d, j14, str2, null), fVar);
            if (objE0 != aVar) {
                objE0 = Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lgx2/b$d;", "", "<init>", "()V", "", "LIB_NAME", "Ljava/lang/String;", "LOG_PREFIX", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(j jVar) {
            this();
        }

        public static z a() {
            return (z) b.f80064e.getValue();
        }

        public static Logger b() {
            return (Logger) b.f80063d.getValue();
        }

        private d() {
        }
    }
}
