package mt2;

import lc.u0;
import o13.r;
import o73.u;
import o73.v;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 mt2.d[], still in use, count: 1, list:
  (r0v1 mt2.d[]) from 0x003b: CONSTRUCTOR (r0v1 mt2.d[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lmt2/d;", "", "", "zoneId", "<init>", "(Ljava/lang/String;II)V", "a", "workoutcommon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {
    ZONE_1(1),
    ZONE_2(2),
    ZONE_3(3),
    ZONE_4(4),
    ZONE_5(5);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f121009b = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ w13.c f121016i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f121017a;

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f121018a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.ZONE_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.ZONE_2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.ZONE_3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.ZONE_4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.ZONE_5.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f121018a = iArr;
        }
    }

    static {
        f121016i = new w13.c(new d[]{r0, r1, r2, r3, r4});
    }

    private d(int i14) {
        super(str, i);
        this.f121017a = i14;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f121015h.clone();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0093 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0094  */
    /* JADX WARN: Code duplicated, block: B:27:0x009f  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:49:0x0117  */
    /* JADX WARN: Code duplicated, block: B:51:0x011d  */
    /* JADX WARN: Code duplicated, block: B:54:0x013a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0140  */
    /* JADX WARN: Code duplicated, block: B:59:0x015d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(boolean z14, v13.c cVar) {
        e eVar;
        d dVar;
        String str;
        int i14;
        Object objA;
        String str2;
        Object objA2;
        Object objA3;
        Object objA4;
        Object objA5;
        String str3;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i15 = eVar.f121023e;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                eVar.f121023e = i15 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objB = eVar.f121021c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        switch (eVar.f121023e) {
            case 0:
                r.b(objB);
                kt2.f.f106534a.getClass();
                kt2.e.f106460a.getClass();
                u uVar = (u) kt2.e.f106477f1.getValue();
                Object[] objArr = {new Integer(this.f121017a)};
                eVar.f121019a = this;
                eVar.f121020b = z14;
                eVar.f121023e = 1;
                objB = v.b(uVar, objArr, eVar);
                if (objB != aVar) {
                    dVar = this;
                    str = (String) objB;
                    if (z14) {
                        return str;
                    }
                    i14 = b.f121018a[dVar.ordinal()];
                    if (i14 != 1) {
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        u uVar2 = (u) kt2.e.f106513r1.getValue();
                        eVar.f121019a = str;
                        eVar.f121023e = 2;
                        objA = v.a(uVar2, eVar);
                        if (objA != aVar) {
                            objB = objA;
                            str2 = str;
                            str3 = (String) objB;
                            return com.nimbusds.jose.shaded.gson.internal.a.h(str2, " (", str3, ")");
                        }
                    } else if (i14 != 2) {
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        u uVar3 = (u) kt2.e.f106516s1.getValue();
                        eVar.f121019a = str;
                        eVar.f121023e = 3;
                        objA2 = v.a(uVar3, eVar);
                        if (objA2 != aVar) {
                            objB = objA2;
                            str2 = str;
                            str3 = (String) objB;
                            return com.nimbusds.jose.shaded.gson.internal.a.h(str2, " (", str3, ")");
                        }
                    } else if (i14 != 3) {
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        u uVar4 = (u) kt2.e.f106519t1.getValue();
                        eVar.f121019a = str;
                        eVar.f121023e = 4;
                        objA3 = v.a(uVar4, eVar);
                        if (objA3 != aVar) {
                            objB = objA3;
                            str2 = str;
                            str3 = (String) objB;
                            return com.nimbusds.jose.shaded.gson.internal.a.h(str2, " (", str3, ")");
                        }
                    } else if (i14 != 4) {
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        u uVar5 = (u) kt2.e.f106522u1.getValue();
                        eVar.f121019a = str;
                        eVar.f121023e = 5;
                        objA4 = v.a(uVar5, eVar);
                        if (objA4 != aVar) {
                            objB = objA4;
                            str2 = str;
                            str3 = (String) objB;
                            return com.nimbusds.jose.shaded.gson.internal.a.h(str2, " (", str3, ")");
                        }
                    } else {
                        if (i14 == 5) {
                            u0.r();
                            return null;
                        }
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        u uVar6 = (u) kt2.e.f106525v1.getValue();
                        eVar.f121019a = str;
                        eVar.f121023e = 6;
                        objA5 = v.a(uVar6, eVar);
                        if (objA5 != aVar) {
                            objB = objA5;
                            str2 = str;
                            str3 = (String) objB;
                            return com.nimbusds.jose.shaded.gson.internal.a.h(str2, " (", str3, ")");
                        }
                    }
                }
                return aVar;
            case 1:
                z14 = eVar.f121020b;
                dVar = (d) eVar.f121019a;
                r.b(objB);
                str = (String) objB;
                if (z14) {
                    return str;
                }
                i14 = b.f121018a[dVar.ordinal()];
                if (i14 != 1) {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    u uVar7 = (u) kt2.e.f106513r1.getValue();
                    eVar.f121019a = str;
                    eVar.f121023e = 2;
                    objA = v.a(uVar7, eVar);
                    if (objA != aVar) {
                        objB = objA;
                        str2 = str;
                        str3 = (String) objB;
                        return com.nimbusds.jose.shaded.gson.internal.a.h(str2, " (", str3, ")");
                    }
                } else if (i14 != 2) {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    u uVar8 = (u) kt2.e.f106516s1.getValue();
                    eVar.f121019a = str;
                    eVar.f121023e = 3;
                    objA2 = v.a(uVar8, eVar);
                    if (objA2 != aVar) {
                        objB = objA2;
                        str2 = str;
                        str3 = (String) objB;
                        return com.nimbusds.jose.shaded.gson.internal.a.h(str2, " (", str3, ")");
                    }
                } else if (i14 != 3) {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    u uVar9 = (u) kt2.e.f106519t1.getValue();
                    eVar.f121019a = str;
                    eVar.f121023e = 4;
                    objA3 = v.a(uVar9, eVar);
                    if (objA3 != aVar) {
                        objB = objA3;
                        str2 = str;
                        str3 = (String) objB;
                        return com.nimbusds.jose.shaded.gson.internal.a.h(str2, " (", str3, ")");
                    }
                } else if (i14 != 4) {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    u uVar10 = (u) kt2.e.f106522u1.getValue();
                    eVar.f121019a = str;
                    eVar.f121023e = 5;
                    objA4 = v.a(uVar10, eVar);
                    if (objA4 != aVar) {
                        objB = objA4;
                        str2 = str;
                        str3 = (String) objB;
                        return com.nimbusds.jose.shaded.gson.internal.a.h(str2, " (", str3, ")");
                    }
                } else {
                    if (i14 == 5) {
                        u0.r();
                        return null;
                    }
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    u uVar11 = (u) kt2.e.f106525v1.getValue();
                    eVar.f121019a = str;
                    eVar.f121023e = 6;
                    objA5 = v.a(uVar11, eVar);
                    if (objA5 != aVar) {
                        objB = objA5;
                        str2 = str;
                        str3 = (String) objB;
                        return com.nimbusds.jose.shaded.gson.internal.a.h(str2, " (", str3, ")");
                    }
                }
                return aVar;
            case 2:
                str2 = (String) eVar.f121019a;
                r.b(objB);
                str3 = (String) objB;
                return com.nimbusds.jose.shaded.gson.internal.a.h(str2, " (", str3, ")");
            case 3:
                str2 = (String) eVar.f121019a;
                r.b(objB);
                str3 = (String) objB;
                return com.nimbusds.jose.shaded.gson.internal.a.h(str2, " (", str3, ")");
            case 4:
                str2 = (String) eVar.f121019a;
                r.b(objB);
                str3 = (String) objB;
                return com.nimbusds.jose.shaded.gson.internal.a.h(str2, " (", str3, ")");
            case 5:
                str2 = (String) eVar.f121019a;
                r.b(objB);
                str3 = (String) objB;
                return com.nimbusds.jose.shaded.gson.internal.a.h(str2, " (", str3, ")");
            case 6:
                str2 = (String) eVar.f121019a;
                r.b(objB);
                str3 = (String) objB;
                return com.nimbusds.jose.shaded.gson.internal.a.h(str2, " (", str3, ")");
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmt2/d$a;", "", "<init>", "()V", "workoutcommon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
