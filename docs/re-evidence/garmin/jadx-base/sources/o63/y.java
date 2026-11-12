package o63;

import com.google.maps.android.BuildConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.y0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lo63/y;", "", "Ln63/g;", "configuration", "Lo63/a;", "lexer", "<init>", "(Ln63/g;Lo63/a;)V", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f129905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f129906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f129907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f129908d;

    public y(n63.g gVar, a aVar) {
        gVar.getClass();
        aVar.getClass();
        this.f129905a = aVar;
        this.f129906b = gVar.f123921c;
        this.f129907c = gVar.f123932n;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005b  */
    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:25:0x007e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x007f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    /* JADX WARN: Code duplicated, block: B:31:0x0097  */
    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x007f -> B:27:0x0085). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(o63.y r12, o13.c r13, v13.a r14) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o63.y.a(o63.y, o13.c, v13.a):java.lang.Object");
    }

    public final n63.i b() {
        n63.i xVar;
        Object obj;
        Object objInvoke;
        a aVar = this.f129905a;
        byte bQ = aVar.q();
        if (bQ == 1) {
            return d(true);
        }
        if (bQ == 0) {
            return d(false);
        }
        if (bQ != 6) {
            if (bQ == 8) {
                return c();
            }
            a.m(aVar, "Cannot read Json element because of unexpected ".concat(ge1.b.b0(bQ)), 0, null, 6);
            throw null;
        }
        int i14 = this.f129908d + 1;
        this.f129908d = i14;
        if (i14 == 200) {
            o13.a aVar2 = new o13.a(new w(this, null));
            Unit unit = Unit.INSTANCE;
            u13.a aVar3 = o13.b.f128565a;
            o13.d dVar = new o13.d(aVar2.f128561a, unit);
            while (true) {
                obj = dVar.f128572d;
                t13.d<Object> dVar2 = dVar.f128571c;
                if (dVar2 == null) {
                    break;
                }
                u13.a aVar4 = o13.b.f128565a;
                int i15 = o13.q.f128596b;
                if (p005kotlin.jvm.internal.s.g(aVar4, obj)) {
                    try {
                        e23.q<? super o13.c<?, ?>, Object, ? super t13.d<Object>, ? extends Object> qVar = dVar.f128569a;
                        Object obj2 = dVar.f128570b;
                        if (qVar instanceof v13.a) {
                            y0.e(3, qVar);
                            objInvoke = qVar.invoke(dVar, obj2, dVar2);
                        } else {
                            qVar.getClass();
                            t13.g f129302c = dVar2.getF157466b();
                            t13.d dVar3 = f129302c == t13.h.f161748a ? new u13.d(dVar2) : new u13.e(dVar2, f129302c);
                            y0.e(3, qVar);
                            objInvoke = qVar.invoke(dVar, obj2, dVar3);
                        }
                        if (objInvoke != u13.a.COROUTINE_SUSPENDED) {
                            dVar2.resumeWith(objInvoke);
                        }
                    } catch (Throwable th3) {
                        int i16 = o13.q.f128596b;
                        dVar2.resumeWith(new o13.q.b(th3));
                    }
                } else {
                    dVar.f128572d = aVar4;
                    dVar2.resumeWith(obj);
                }
            }
            o13.r.b(obj);
            xVar = (n63.i) obj;
        } else {
            byte bF = aVar.f((byte) 6);
            if (aVar.q() == 4) {
                a.m(aVar, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (aVar.b()) {
                String strJ = this.f129906b ? aVar.j() : aVar.i();
                aVar.f((byte) 5);
                linkedHashMap.put(strJ, b());
                bF = aVar.e();
                if (bF != 4) {
                    if (bF == 7) {
                        break;
                    }
                    a.m(aVar, "Expected end of the object or comma", 0, null, 6);
                    throw null;
                }
            }
            if (bF == 6) {
                aVar.f((byte) 7);
            } else if (bF == 4) {
                if (!this.f129907c) {
                    gg.b.G(aVar, "object");
                    throw null;
                }
                aVar.f((byte) 7);
            }
            xVar = new n63.x(linkedHashMap);
        }
        this.f129908d--;
        return xVar;
    }

    public final n63.c c() {
        a aVar = this.f129905a;
        byte bE = aVar.e();
        if (aVar.q() == 4) {
            a.m(aVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (aVar.b()) {
            arrayList.add(b());
            bE = aVar.e();
            if (bE != 4) {
                boolean z14 = bE == 9;
                int i14 = aVar.f129815a;
                if (!z14) {
                    a.m(aVar, "Expected end of the array or comma", i14, null, 4);
                    throw null;
                }
            }
        }
        if (bE == 8) {
            aVar.f((byte) 9);
        } else if (bE == 4) {
            if (!this.f129907c) {
                gg.b.G(aVar, "array");
                throw null;
            }
            aVar.f((byte) 9);
        }
        return new n63.c(arrayList);
    }

    public final n63.z d(boolean z14) {
        boolean z15 = this.f129906b;
        a aVar = this.f129905a;
        String strJ = (z15 || !z14) ? aVar.j() : aVar.i();
        if (z14 || !p005kotlin.jvm.internal.s.g(strJ, BuildConfig.TRAVIS)) {
            return new n63.q(strJ, z14, null, 4, null);
        }
        return n63.u.INSTANCE;
    }
}
