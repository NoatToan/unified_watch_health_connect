package wd2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lwd2/p1;", "Lwd2/o1;", "Lpt2/b;", "credentialsProvider", "<init>", "(Lpt2/b;)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p1 implements o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qt2.b f184560a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f184561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f184562b;

        static {
            int[] iArr = new int[ge2.c.values().length];
            try {
                iArr[ge2.c.ActiveSessionPrivacy.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ge2.c.ProfilePrivacy.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f184561a = iArr;
            int[] iArr2 = new int[ge2.b.values().length];
            try {
                iArr2[ge2.b.Everyone.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            f184562b = iArr2;
        }
    }

    public p1(pt2.b bVar) {
        bVar.getClass();
        this.f184560a = new qt2.b(bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // wd2.o1
    public final Object a(v13.c cVar) {
        r1 r1Var;
        if (cVar instanceof r1) {
            r1Var = (r1) cVar;
            int i14 = r1Var.f184597c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                r1Var.f184597c = i14 - Integer.MIN_VALUE;
            } else {
                r1Var = new r1(this, cVar);
            }
        } else {
            r1Var = new r1(this, cVar);
        }
        Object objF = r1Var.f184595a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = r1Var.f184597c;
        if (i15 == 0) {
            o13.r.b(objF);
            r1Var.f184597c = 1;
            objF = this.f184560a.a().f(r1Var);
            if (objF == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objF);
        }
        return w13.b.o((pt2.g) objF);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // wd2.o1
    public final Object b(String str, v13.c cVar) {
        w1 w1Var;
        if (cVar instanceof w1) {
            w1Var = (w1) cVar;
            int i14 = w1Var.f184658c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                w1Var.f184658c = i14 - Integer.MIN_VALUE;
            } else {
                w1Var = new w1(this, cVar);
            }
        } else {
            w1Var = new w1(this, cVar);
        }
        Object objC = w1Var.f184656a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = w1Var.f184658c;
        if (i15 == 0) {
            o13.r.b(objC);
            w1Var.f184658c = 1;
            objC = this.f184560a.a().c(str, w1Var);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objC);
        }
        return w13.b.o((pt2.g) objC);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // wd2.o1
    public final Object c(String str, v13.c cVar) {
        q1 q1Var;
        if (cVar instanceof q1) {
            q1Var = (q1) cVar;
            int i14 = q1Var.f184585c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                q1Var.f184585c = i14 - Integer.MIN_VALUE;
            } else {
                q1Var = new q1(this, cVar);
            }
        } else {
            q1Var = new q1(this, cVar);
        }
        Object objD = q1Var.f184583a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = q1Var.f184585c;
        if (i15 == 0) {
            o13.r.b(objD);
            q1Var.f184585c = 1;
            objD = this.f184560a.a().d(str, q1Var);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objD);
        }
        return w13.b.o((pt2.g) objD);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:52:0x0105  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // wd2.o1
    public final Object d(v13.c cVar) {
        v1 v1Var;
        HashMap map;
        LinkedHashMap linkedHashMap;
        ge2.d dVar;
        String str;
        String str2;
        if (cVar instanceof v1) {
            v1Var = (v1) cVar;
            int i14 = v1Var.f184645c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                v1Var.f184645c = i14 - Integer.MIN_VALUE;
            } else {
                v1Var = new v1(this, cVar);
            }
        } else {
            v1Var = new v1(this, cVar);
        }
        Object objK = v1Var.f184643a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = v1Var.f184645c;
        if (i15 == 0) {
            o13.r.b(objK);
            v1Var.f184645c = 1;
            objK = this.f184560a.a().k(v1Var);
            if (objK == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objK);
        }
        pt2.g gVar = (pt2.g) objK;
        st2.g gVar2 = (st2.g) gVar.f141042a;
        if (gVar2 == null) {
            return new f0(null, gVar.f141043b);
        }
        Map<String, st2.a> map2 = gVar2.f160938e;
        if (map2 == null) {
            map = null;
        } else {
            map = new HashMap();
            for (Map.Entry<String, st2.a> entry : map2.entrySet()) {
                map.put(Long.valueOf(Long.parseLong(entry.getKey())), entry.getValue());
            }
        }
        if (map != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(p13.t0.a(map.size()));
            for (Map.Entry entry2 : map.entrySet()) {
                Object key = entry2.getKey();
                st2.a aVar2 = (st2.a) entry2.getValue();
                aVar2.getClass();
                linkedHashMap2.put(key, new ge2.a(aVar2.f160907b, aVar2.f160906a, aVar2.f160909d, aVar2.f160908c));
            }
            linkedHashMap = linkedHashMap2;
        } else {
            linkedHashMap = null;
        }
        Boolean bool = gVar2.f160935b;
        Boolean bool2 = gVar2.f160934a;
        Boolean bool3 = gVar2.f160937d;
        Boolean bool4 = gVar2.f160936c;
        st2.f fVar = gVar2.f160939f;
        if (fVar != null) {
            List<tt2.a> list = fVar.f160931b;
            if (list == null) {
                str = null;
            } else {
                ge2.b bVar = list.contains(tt2.a.EVERYONE) ? ge2.b.Everyone : ge2.b.OnlyMe;
                if (bVar != null) {
                    str = bVar.f77016a;
                } else {
                    str = null;
                }
            }
            List<tt2.a> list2 = fVar.f160930a;
            if (list2 == null) {
                str2 = null;
            } else {
                ge2.b bVar2 = list2.contains(tt2.a.EVERYONE) ? ge2.b.Everyone : ge2.b.OnlyMe;
                if (bVar2 != null) {
                    str2 = bVar2.f77016a;
                } else {
                    str2 = null;
                }
            }
            dVar = new ge2.d(str, str2);
        } else {
            dVar = null;
        }
        return new f0(new ge2.e(linkedHashMap, bool, bool2, bool3, bool4, dVar, null, 64, null), null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // wd2.o1
    public final Object e(ge2.c cVar, ge2.b bVar, v13.c cVar2) {
        x1 x1Var;
        tt2.b bVar2;
        if (cVar2 instanceof x1) {
            x1Var = (x1) cVar2;
            int i14 = x1Var.f184670c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                x1Var.f184670c = i14 - Integer.MIN_VALUE;
            } else {
                x1Var = new x1(this, cVar2);
            }
        } else {
            x1Var = new x1(this, cVar2);
        }
        Object objM = x1Var.f184668a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = x1Var.f184670c;
        if (i15 == 0) {
            o13.r.b(objM);
            int i16 = a.f184561a[cVar.ordinal()];
            if (i16 == 1) {
                bVar2 = tt2.b.ACTIVE_SESSION_PRIVACY;
            } else {
                if (i16 != 2) {
                    lc.u0.r();
                    return null;
                }
                bVar2 = tt2.b.PROFILE_PRIVACY;
            }
            List listC = p13.w.c(a.f184562b[bVar.ordinal()] == 1 ? tt2.a.EVERYONE : tt2.a.ONLY_ME);
            x1Var.f184670c = 1;
            objM = this.f184560a.a().m(bVar2.toString(), listC, x1Var);
            if (objM == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objM);
        }
        return w13.b.o((pt2.g) objM);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // wd2.o1
    public final Object f(String str, v13.c cVar) {
        s1 s1Var;
        if (cVar instanceof s1) {
            s1Var = (s1) cVar;
            int i14 = s1Var.f184607c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                s1Var.f184607c = i14 - Integer.MIN_VALUE;
            } else {
                s1Var = new s1(this, cVar);
            }
        } else {
            s1Var = new s1(this, cVar);
        }
        Object objL = s1Var.f184605a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = s1Var.f184607c;
        if (i15 == 0) {
            o13.r.b(objL);
            s1Var.f184607c = 1;
            objL = this.f184560a.a().l(str, s1Var);
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
        return w13.b.o((pt2.g) objL);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // wd2.o1
    public final Object g(v13.c cVar) {
        t1 t1Var;
        if (cVar instanceof t1) {
            t1Var = (t1) cVar;
            int i14 = t1Var.f184619c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                t1Var.f184619c = i14 - Integer.MIN_VALUE;
            } else {
                t1Var = new t1(this, cVar);
            }
        } else {
            t1Var = new t1(this, cVar);
        }
        Object objI = t1Var.f184617a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = t1Var.f184619c;
        if (i15 == 0) {
            o13.r.b(objI);
            t1Var.f184619c = 1;
            objI = this.f184560a.a().i(t1Var);
            if (objI == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objI);
        }
        pt2.g gVar = (pt2.g) objI;
        st2.d dVar = (st2.d) gVar.f141042a;
        return dVar != null ? new f0(new k(dVar.f160923b, dVar.f160922a), null, 2, null) : new f0(null, gVar.f141043b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // wd2.o1
    public final Object h(v13.c cVar) {
        u1 u1Var;
        if (cVar instanceof u1) {
            u1Var = (u1) cVar;
            int i14 = u1Var.f184632c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                u1Var.f184632c = i14 - Integer.MIN_VALUE;
            } else {
                u1Var = new u1(this, cVar);
            }
        } else {
            u1Var = new u1(this, cVar);
        }
        Object objJ = u1Var.f184630a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = u1Var.f184632c;
        if (i15 == 0) {
            o13.r.b(objJ);
            u1Var.f184632c = 1;
            objJ = this.f184560a.a().j(u1Var);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        pt2.g gVar = (pt2.g) objJ;
        st2.e eVar = (st2.e) gVar.f141042a;
        return eVar != null ? new f0(eVar.f160925a, null) : new f0(null, gVar.f141043b);
    }

    @Override // wd2.o1
    public final boolean i(String str) {
        str.getClass();
        this.f184560a.getClass();
        return new d53.k("^[ -~]{8,64}$").d(str);
    }

    @Override // wd2.o1
    public final boolean k(String str) {
        str.getClass();
        this.f184560a.getClass();
        qt2.a.f147848a.getClass();
        return qt2.a.C2779a.f147850b.d(str);
    }
}
