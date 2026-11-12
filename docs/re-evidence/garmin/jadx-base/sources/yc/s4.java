package yc;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B7\u0012.\u0010\b\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lyc/s4;", "T1", "T2", "", "Lkotlin/Function4;", "Lyc/r;", "Lt13/d;", "", "send", "<init>", "(Le23/r;)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class s4<T1, T2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.r<T1, T2, r, t13.d<? super Unit>, Object> f196465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o53.s f196466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z53.b f196467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o53.r<Unit>[] f196468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object[] f196469e;

    /* JADX WARN: Multi-variable type inference failed */
    public s4(e23.r<? super T1, ? super T2, ? super r, ? super t13.d<? super Unit>, ? extends Object> rVar) {
        rVar.getClass();
        this.f196465a = rVar;
        this.f196466b = gl.b.b();
        this.f196467c = z53.c.a();
        o53.r<Unit>[] rVarArr = new o53.r[2];
        for (int i14 = 0; i14 < 2; i14++) {
            rVarArr[i14] = gl.b.b();
        }
        this.f196468d = rVarArr;
        Object[] objArr = new Object[2];
        for (int i15 = 0; i15 < 2; i15++) {
            objArr[i15] = i0.f196054a;
        }
        this.f196469e = objArr;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a7 A[Catch: all -> 0x00b0, TRY_ENTER, TryCatch #0 {all -> 0x00b0, blocks: (B:34:0x009e, B:38:0x00a7, B:45:0x00b4, B:47:0x00ba, B:50:0x00c0, B:52:0x00c5, B:56:0x00cf, B:54:0x00ca, B:55:0x00cd, B:41:0x00ad), top: B:66:0x009e }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ad A[Catch: all -> 0x00b0, LOOP:0: B:36:0x00a3->B:41:0x00ad, LOOP_END, TryCatch #0 {all -> 0x00b0, blocks: (B:34:0x009e, B:38:0x00a7, B:45:0x00b4, B:47:0x00ba, B:50:0x00c0, B:52:0x00c5, B:56:0x00cf, B:54:0x00ca, B:55:0x00cd, B:41:0x00ad), top: B:66:0x009e }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ba A[Catch: all -> 0x00b0, TryCatch #0 {all -> 0x00b0, blocks: (B:34:0x009e, B:38:0x00a7, B:45:0x00b4, B:47:0x00ba, B:50:0x00c0, B:52:0x00c5, B:56:0x00cf, B:54:0x00ca, B:55:0x00cd, B:41:0x00ad), top: B:66:0x009e }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c0 A[Catch: all -> 0x00b0, LOOP:1: B:46:0x00b8->B:50:0x00c0, LOOP_END, TryCatch #0 {all -> 0x00b0, blocks: (B:34:0x009e, B:38:0x00a7, B:45:0x00b4, B:47:0x00ba, B:50:0x00c0, B:52:0x00c5, B:56:0x00cf, B:54:0x00ca, B:55:0x00cd, B:41:0x00ad), top: B:66:0x009e }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c5 A[Catch: all -> 0x00b0, TryCatch #0 {all -> 0x00b0, blocks: (B:34:0x009e, B:38:0x00a7, B:45:0x00b4, B:47:0x00ba, B:50:0x00c0, B:52:0x00c5, B:56:0x00cf, B:54:0x00ca, B:55:0x00cd, B:41:0x00ad), top: B:66:0x009e }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ca A[Catch: all -> 0x00b0, TryCatch #0 {all -> 0x00b0, blocks: (B:34:0x009e, B:38:0x00a7, B:45:0x00b4, B:47:0x00ba, B:50:0x00c0, B:52:0x00c5, B:56:0x00cf, B:54:0x00ca, B:55:0x00cd, B:41:0x00ad), top: B:66:0x009e }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00cd A[Catch: all -> 0x00b0, TryCatch #0 {all -> 0x00b0, blocks: (B:34:0x009e, B:38:0x00a7, B:45:0x00b4, B:47:0x00ba, B:50:0x00c0, B:52:0x00c5, B:56:0x00cf, B:54:0x00ca, B:55:0x00cd, B:41:0x00ad), top: B:66:0x009e }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        if (r16.f196466b.C(r3) == r4) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i14, Object obj, v13.c cVar) throws Throwable {
        r4 r4Var;
        Object obj2;
        s4<T1, T2> s4Var;
        Object obj3;
        z53.b bVar;
        int i15;
        s4<T1, T2> s4Var2;
        z53.a aVar;
        Object[] objArr;
        int length;
        int i16;
        Object obj4;
        boolean z14;
        int length2;
        int i17;
        r rVar;
        e23.r<T1, T2, r, t13.d<? super Unit>, Object> rVar2;
        Object obj5;
        Object obj6;
        int i18 = i14;
        if (cVar instanceof r4) {
            r4Var = (r4) cVar;
            int i19 = r4Var.f196384g;
            if ((i19 & Integer.MIN_VALUE) != 0) {
                r4Var.f196384g = i19 - Integer.MIN_VALUE;
            } else {
                r4Var = new r4(this, cVar);
            }
        } else {
            r4Var = new r4(this, cVar);
        }
        Object obj7 = r4Var.f196382e;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i24 = r4Var.f196384g;
        if (i24 == 0) {
            o13.r.b(obj7);
            o53.r<Unit>[] rVarArr = this.f196468d;
            if (rVarArr[i18].e()) {
                r4Var.f196378a = this;
                obj2 = obj;
                r4Var.f196379b = obj2;
                r4Var.f196381d = i18;
                r4Var.f196384g = 1;
            } else {
                obj2 = obj;
                rVarArr[i18].p(Unit.INSTANCE);
            }
            s4Var = this;
        } else {
            if (i24 != 1) {
                if (i24 != 2) {
                    if (i24 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar = (z53.a) r4Var.f196379b;
                    s4Var2 = r4Var.f196378a;
                    try {
                        o13.r.b(obj7);
                        s4Var2.f196466b.g0(Unit.INSTANCE);
                        Unit unit = Unit.INSTANCE;
                        aVar.e(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th3) {
                        th = th3;
                        aVar.e(null);
                        throw th;
                    }
                }
                i18 = r4Var.f196381d;
                bVar = r4Var.f196380c;
                obj3 = r4Var.f196379b;
                s4Var = r4Var.f196378a;
                o13.r.b(obj7);
                i15 = i18;
                s4Var2 = s4Var;
                try {
                    objArr = s4Var2.f196469e;
                    length = objArr.length;
                    i16 = 0;
                    while (true) {
                        obj4 = i0.f196054a;
                        if (i16 < length) {
                            z14 = false;
                            break;
                        }
                        if (objArr[i16] == obj4) {
                            z14 = true;
                            break;
                        }
                        i16++;
                    }
                    objArr[i15] = obj3;
                    length2 = objArr.length;
                    i17 = 0;
                    while (true) {
                        if (i17 < length2) {
                            if (z14) {
                                rVar = r.INITIAL;
                            } else if (i15 == 0) {
                                rVar = r.RECEIVER;
                            } else {
                                rVar = r.OTHER;
                            }
                            rVar2 = s4Var2.f196465a;
                            obj5 = objArr[0];
                            obj6 = objArr[1];
                            r4Var.f196378a = s4Var2;
                            r4Var.f196379b = bVar;
                            r4Var.f196380c = null;
                            r4Var.f196384g = 3;
                            if (rVar2.invoke((T1) obj5, (T2) obj6, rVar, r4Var) != aVar2) {
                                aVar = bVar;
                                s4Var2.f196466b.g0(Unit.INSTANCE);
                                break;
                            }
                            return aVar2;
                        }
                        if (objArr[i17] == obj4) {
                            aVar = bVar;
                            break;
                        }
                        i17++;
                    }
                    Unit unit2 = Unit.INSTANCE;
                    aVar.e(null);
                    return Unit.INSTANCE;
                } catch (Throwable th4) {
                    th = th4;
                    aVar = bVar;
                    aVar.e(null);
                    throw th;
                }
            }
            i18 = r4Var.f196381d;
            obj2 = r4Var.f196379b;
            s4Var = r4Var.f196378a;
            o13.r.b(obj7);
        }
        z53.b bVar2 = s4Var.f196467c;
        r4Var.f196378a = s4Var;
        r4Var.f196379b = obj2;
        r4Var.f196380c = bVar2;
        r4Var.f196381d = i18;
        r4Var.f196384g = 2;
        if (bVar2.c(r4Var) != aVar2) {
            obj3 = obj2;
            bVar = bVar2;
            i15 = i18;
            s4Var2 = s4Var;
            objArr = s4Var2.f196469e;
            length = objArr.length;
            i16 = 0;
            while (true) {
                obj4 = i0.f196054a;
                if (i16 < length) {
                    z14 = false;
                    break;
                }
                if (objArr[i16] == obj4) {
                    z14 = true;
                    break;
                }
                i16++;
            }
            objArr[i15] = obj3;
            length2 = objArr.length;
            i17 = 0;
            while (true) {
                if (i17 < length2) {
                    if (z14) {
                        rVar = r.INITIAL;
                    } else if (i15 == 0) {
                        rVar = r.RECEIVER;
                    } else {
                        rVar = r.OTHER;
                    }
                    rVar2 = s4Var2.f196465a;
                    obj5 = objArr[0];
                    obj6 = objArr[1];
                    r4Var.f196378a = s4Var2;
                    r4Var.f196379b = bVar;
                    r4Var.f196380c = null;
                    r4Var.f196384g = 3;
                    if (rVar2.invoke((T1) obj5, (T2) obj6, rVar, r4Var) != aVar2) {
                        aVar = bVar;
                        s4Var2.f196466b.g0(Unit.INSTANCE);
                        break;
                    }
                } else {
                    if (objArr[i17] == obj4) {
                        aVar = bVar;
                        break;
                    }
                    i17++;
                }
            }
            Unit unit3 = Unit.INSTANCE;
            aVar.e(null);
            return Unit.INSTANCE;
        }
        return aVar2;
    }
}
