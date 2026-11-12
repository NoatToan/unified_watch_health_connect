package te2;

import android.content.Context;
import com.garmin.android.library.mobileauth.exception.MFATokenExpiredException;
import com.garmin.android.library.mobileauth.exception.NoMFATokenException;
import java.net.URI;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lte2/f1;", "", "<init>", "()V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f164026a;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f164027a;

        static {
            int[] iArr = new int[ve2.h.values().length];
            try {
                iArr[ve2.h.SKIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ve2.h.MANDATORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ve2.h.USE_IF_ENABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f164027a = iArr;
        }
    }

    public f1() {
        re2.l0.f152316a.getClass();
        this.f164026a = re2.l0.c("ITAutoLoginURIGenerator");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if (r10 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
    
        if (r10 == r1) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(f1 f1Var, ve2.h hVar, ve2.d dVar, v13.c cVar) throws Throwable {
        j1 j1Var;
        f1Var.getClass();
        if (cVar instanceof j1) {
            j1Var = (j1) cVar;
            int i14 = j1Var.f164114c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                j1Var.f164114c = i14 - Integer.MIN_VALUE;
            } else {
                j1Var = new j1(f1Var, cVar);
            }
        } else {
            j1Var = new j1(f1Var, cVar);
        }
        Object objD = j1Var.f164112a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = j1Var.f164114c;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(objD);
                return (String) objD;
            }
            if (i15 == 2) {
                o13.r.b(objD);
                if (((Boolean) objD).booleanValue()) {
                    j1Var.f164114c = 3;
                    objD = f1Var.d(j1Var);
                }
                return null;
            }
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objD);
            return (String) objD;
        }
        o13.r.b(objD);
        int i16 = a.f164027a[hVar.ordinal()];
        if (i16 != 1) {
            if (i16 == 2) {
                j1Var.f164114c = 1;
                objD = f1Var.d(j1Var);
            } else {
                if (i16 != 3) {
                    lc.u0.r();
                    return null;
                }
                re2.b bVar = re2.b.f152215a;
                j1Var.f164114c = 2;
                bVar.getClass();
                x53.c cVar2 = o53.s0.f129406a;
                objD = ge1.b.e0(x53.b.f189152a, new re2.k(dVar, null), j1Var);
                if (objD != obj) {
                    if (((Boolean) objD).booleanValue()) {
                        j1Var.f164114c = 3;
                        objD = f1Var.d(j1Var);
                    }
                }
            }
            return obj;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object b(Context context, String str, o13.p pVar, ve2.e eVar, URI uri, String str2, v13.c cVar) throws Throwable {
        h1 h1Var;
        if (cVar instanceof h1) {
            h1Var = (h1) cVar;
            int i14 = h1Var.f164073c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                h1Var.f164073c = i14 - Integer.MIN_VALUE;
            } else {
                h1Var = new h1(this, cVar);
            }
        } else {
            h1Var = new h1(this, cVar);
        }
        Object objE0 = h1Var.f164071a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = h1Var.f164073c;
        if (i15 == 0) {
            o13.r.b(objE0);
            re2.b.f152215a.L();
            x53.c cVar2 = o53.s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            i1 i1Var = new i1(this, uri, context, eVar, str, pVar, str2, null);
            h1Var.f164073c = 1;
            objE0 = ge1.b.e0(bVar, i1Var, h1Var);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE0);
        }
        objE0.getClass();
        return objE0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object c(Context context, String str, o13.p pVar, ve2.e eVar, URI uri, String str2, String str3, v13.c cVar) throws Throwable {
        l1 l1Var;
        if (cVar instanceof l1) {
            l1Var = (l1) cVar;
            int i14 = l1Var.f164164c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                l1Var.f164164c = i14 - Integer.MIN_VALUE;
            } else {
                l1Var = new l1(this, cVar);
            }
        } else {
            l1Var = new l1(this, cVar);
        }
        Object objE0 = l1Var.f164162a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = l1Var.f164164c;
        if (i15 == 0) {
            o13.r.b(objE0);
            re2.b.f152215a.L();
            x53.c cVar2 = o53.s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            m1 m1Var = new m1(this, uri, context, eVar, str, pVar, str3, str2, null);
            l1Var.f164164c = 1;
            objE0 = ge1.b.e0(bVar, m1Var, l1Var);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE0);
        }
        objE0.getClass();
        return objE0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(v13.c cVar) throws Throwable {
        n1 n1Var;
        if (cVar instanceof n1) {
            n1Var = (n1) cVar;
            int i14 = n1Var.f164200c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                n1Var.f164200c = i14 - Integer.MIN_VALUE;
            } else {
                n1Var = new n1(this, cVar);
            }
        } else {
            n1Var = new n1(this, cVar);
        }
        Object objL = n1Var.f164198a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = n1Var.f164200c;
        try {
            if (i15 == 0) {
                o13.r.b(objL);
                re2.b bVar = re2.b.f152215a;
                n1Var.f164200c = 1;
                objL = bVar.l(n1Var);
                if (objL == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objL);
            }
            String str = (String) objL;
            if (str != null) {
                return str;
            }
            throw new NoMFATokenException();
        } catch (MFATokenExpiredException unused) {
            throw new NoMFATokenException();
        }
    }
}
