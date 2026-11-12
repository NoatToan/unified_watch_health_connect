package v01;

import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lq01/i;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.GetRecipeUseCase$invoke$2", f = "GetRecipeUseCase.kt", l = {27, 48, 54, 56}, m = "invokeSuspend", v = 2)
public final class i1 extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends q01.i>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f174404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s21.o f174405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f174406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f174407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j1 f174408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f174409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b63.o f174410g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ls21/o;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.GetRecipeUseCase$invoke$2$settingsTask$1", f = "GetRecipeUseCase.kt", l = {43}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends s21.o>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f174411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j1 f174412b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b63.o f174413c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j1 j1Var, b63.o oVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f174412b = j1Var;
            this.f174413c = oVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f174412b, this.f174413c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends s21.o>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f174411a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            t0 t0Var = this.f174412b.f174442b;
            this.f174411a = 1;
            Object objA = t0Var.a(this.f174413c, this);
            return objA == aVar ? aVar : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(j1 j1Var, String str, b63.o oVar, t13.d<? super i1> dVar) {
        super(2, dVar);
        this.f174408e = j1Var;
        this.f174409f = str;
        this.f174410g = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i1 i1Var = new i1(this.f174408e, this.f174409f, this.f174410g, dVar);
        i1Var.f174407d = obj;
        return i1Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends q01.i>> dVar) {
        return ((i1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:57:0x010b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0110  */
    /* JADX WARN: Code duplicated, block: B:62:0x0121  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c0, code lost:
    
        if (r1 == r2) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objA;
        ArrayList arrayList;
        v2 v2Var;
        Object objC;
        List list;
        s21.o oVar;
        String str;
        Object objA2;
        List list2;
        Object objB;
        List list3;
        q01.h hVar;
        List list4;
        o13.p pVar;
        o53.b0 b0Var = (o53.b0) this.f174407d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f174406c;
        b63.o oVar2 = this.f174410g;
        j1 j1Var = this.f174408e;
        if (i14 == 0) {
            o13.r.b(obj);
            m01.g gVar = j1Var.f174441a;
            this.f174407d = b0Var;
            this.f174406c = 1;
            objA = gVar.a(this);
            if (objA != aVar) {
            }
            list = arrayList;
            return aVar;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                if (i14 == 3) {
                    oVar = this.f174405b;
                    List list5 = this.f174404a;
                    o13.r.b(obj);
                    objB = obj;
                    list3 = list5;
                    hVar = (q01.h) objB;
                    list4 = list3;
                    if (hVar == null) {
                        return new v2.a(new IllegalStateException("Recipe not found"), null, null, 6, null);
                    }
                    return new v2.b(new q01.i(hVar, list4, oVar), 200, null, null, 12, null);
                }
                if (i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oVar = this.f174405b;
                List list6 = this.f174404a;
                o13.r.b(obj);
                objA2 = obj;
                list2 = list6;
                pVar = (o13.p) objA2;
                if (pVar == null) {
                    return new v2.a(new IllegalStateException("Missing language or region code"), null, null, 6, null);
                }
                String str2 = (String) pVar.f128594a;
                String str3 = (String) pVar.f128595b;
                j1Var.getClass();
                hVar = new q01.h(null, null, null, null, null, g01.c.SERVING, null, str2, str3, null, 607, null);
                list4 = list2;
                return new v2.b(new q01.i(hVar, list4, oVar), 200, null, null, 12, null);
            }
            List list7 = this.f174404a;
            o13.r.b(obj);
            List list8 = list7;
            objC = obj;
            list8 = arrayList;
            v2Var = (v2) objC;
            list = list8;
            if (v2Var instanceof v2.b) {
                oVar = (s21.o) ((v2.b) v2Var).f47386a;
            } else {
                oVar = null;
            }
            str = this.f174409f;
            if (str != null) {
                this.f174407d = null;
                this.f174404a = list;
                this.f174405b = oVar;
                this.f174406c = 3;
                objB = j1.b(j1Var, str, this);
                if (objB != aVar) {
                    list3 = list;
                    hVar = (q01.h) objB;
                    list4 = list3;
                    if (hVar == null) {
                        return new v2.a(new IllegalStateException("Recipe not found"), null, null, 6, null);
                    }
                    return new v2.b(new q01.i(hVar, list4, oVar), 200, null, null, 12, null);
                }
            } else {
                this.f174407d = null;
                this.f174404a = list;
                this.f174405b = oVar;
                this.f174406c = 4;
                objA2 = j1.a(j1Var, oVar2, this);
                if (objA2 != aVar) {
                    list2 = list;
                    pVar = (o13.p) objA2;
                    if (pVar == null) {
                        return new v2.a(new IllegalStateException("Missing language or region code"), null, null, 6, null);
                    }
                    String str4 = (String) pVar.f128594a;
                    String str5 = (String) pVar.f128595b;
                    j1Var.getClass();
                    hVar = new q01.h(null, null, null, null, null, g01.c.SERVING, null, str4, str5, null, 607, null);
                    list4 = list2;
                    return new v2.b(new q01.i(hVar, list4, oVar), 200, null, null, 12, null);
                }
            }
            list8 = arrayList;
            return aVar;
        }
        o13.r.b(obj);
        objA = obj;
        v2 v2Var2 = (v2) objA;
        if (!(v2Var2 instanceof v2.b)) {
            if (v2Var2 instanceof v2.a) {
                return new v2.a(((v2.a) v2Var2).f47383a, null, null, 6, null);
            }
            lc.u0.r();
            return null;
        }
        List<g01.f0> list9 = ((g01.g0) ((v2.b) v2Var2).f47386a).f74189a;
        if (list9 != null) {
            arrayList = new ArrayList(p13.y.r(list9, 10));
            for (g01.f0 f0Var : list9) {
                g01.c.Companion companion = g01.c.INSTANCE;
                String str6 = f0Var.f74179a;
                companion.getClass();
                arrayList.add(g01.c.Companion.a(str6));
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return new v2.a(new IllegalStateException("Units not found"), null, null, 6, null);
        }
        o53.j0 j0VarJ = j1Var.f174443c.e() ? ge1.b.j(b0Var, null, null, new a(j1Var, oVar2, null), 3) : null;
        if (j0VarJ != null) {
            this.f174407d = null;
            this.f174404a = arrayList;
            this.f174406c = 2;
            objC = j0VarJ.C(this);
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        } else {
            v2Var = null;
            list = arrayList;
            if (v2Var instanceof v2.b) {
                oVar = (s21.o) ((v2.b) v2Var).f47386a;
            } else {
                oVar = null;
            }
            str = this.f174409f;
            if (str != null) {
                this.f174407d = null;
                this.f174404a = list;
                this.f174405b = oVar;
                this.f174406c = 3;
                objB = j1.b(j1Var, str, this);
                if (objB != aVar) {
                    list3 = list;
                    hVar = (q01.h) objB;
                    list4 = list3;
                    if (hVar == null) {
                        return new v2.a(new IllegalStateException("Recipe not found"), null, null, 6, null);
                    }
                    return new v2.b(new q01.i(hVar, list4, oVar), 200, null, null, 12, null);
                }
            } else {
                this.f174407d = null;
                this.f174404a = list;
                this.f174405b = oVar;
                this.f174406c = 4;
                objA2 = j1.a(j1Var, oVar2, this);
                if (objA2 != aVar) {
                    list2 = list;
                    pVar = (o13.p) objA2;
                    if (pVar == null) {
                        return new v2.a(new IllegalStateException("Missing language or region code"), null, null, 6, null);
                    }
                    String str7 = (String) pVar.f128594a;
                    String str8 = (String) pVar.f128595b;
                    j1Var.getClass();
                    hVar = new q01.h(null, null, null, null, null, g01.c.SERVING, null, str7, str8, null, 607, null);
                    list4 = list2;
                    return new v2.b(new q01.i(hVar, list4, oVar), 200, null, null, 12, null);
                }
            }
        }
        list8 = arrayList;
        return aVar;
    }
}
