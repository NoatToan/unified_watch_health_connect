package u21;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import b21.l4;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;
import v01.d2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0016BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lu21/u0;", "Landroidx/lifecycle/u1;", "Lm01/g;", "nutritionRepo", "Ld01/c;", "nutritionStore", "Lx01/i;", "nutritionStateProvider", "Ls01/f;", "nutritionSettingsConfigProvider", "Lv01/b1;", "getNutritionReminders", "Lv01/d2;", "saveNutritionReminders", "Lc22/o;", "appUtilDelegate", "", "enteredFromPaywall", "Ls01/c;", "eventPoster", "<init>", "(Lm01/g;Ld01/c;Lx01/i;Ls01/f;Lv01/b1;Lv01/d2;Lc22/o;ZLs01/c;)V", "a", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u0 extends u1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f168149q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m01.g f168150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d01.c f168151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x01.i f168152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s01.f f168153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v01.b1 f168154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d2 f168155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c22.o f168156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f168157h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s01.c f168158i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2 f168159j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f168160k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f168161l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public l01.k f168162m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List<q01.e> f168163n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p2 f168164o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b2 f168165p;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f168166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f168167b;

        static {
            int[] iArr = new int[s21.a.values().length];
            try {
                iArr[s21.a.ACTIVE_CALORIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s21.a.CUSTOM_ACTIVE_CALORIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f168166a = iArr;
            int[] iArr2 = new int[s21.y.values().length];
            try {
                iArr2[s21.y.SETTINGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[s21.y.REMINDERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f168167b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Ls21/a0;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.setup.viewmodel.NutritionSetupViewModel$uiState$1", f = "NutritionSetupViewModel.kt", l = {97}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<r53.j<? super s21.a0>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f168168a;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return u0.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super s21.a0> jVar, t13.d<? super Unit> dVar) {
            return ((c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            s21.a0 a0Var;
            String strW;
            LocalDate localDateL1;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f168168a;
            u0 u0Var = u0.this;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f168168a = 1;
                if (u0.x4(u0Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            int i15 = u0.f168149q;
            u0Var.getClass();
            f12.l.f68084a.getClass();
            f12.l lVarA = f12.l.a.a();
            p2 p2Var = u0Var.f168164o;
            do {
                value = p2Var.getValue();
                a0Var = (s21.a0) value;
                strW = lVarA.w();
                localDateL1 = lVarA.l1();
            } while (!p2Var.b(value, s21.a0.a(a0Var, null, null, false, false, null, strW, localDateL1 != null ? g22.k.t(localDateL1) : null, Float.valueOf(lVarA.t()), Boolean.valueOf(lVarA.y()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, 0, -961, 3)));
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u0(m01.g gVar, d01.c cVar, x01.i iVar, s01.f fVar, v01.b1 b1Var, d2 d2Var, c22.o oVar, boolean z14, s01.c cVar2) {
        gVar.getClass();
        cVar.getClass();
        iVar.getClass();
        fVar.getClass();
        b1Var.getClass();
        d2Var.getClass();
        oVar.getClass();
        cVar2.getClass();
        this.f168150a = gVar;
        this.f168151b = cVar;
        this.f168152c = iVar;
        this.f168153d = fVar;
        this.f168154e = b1Var;
        this.f168155f = d2Var;
        this.f168156g = oVar;
        this.f168157h = z14;
        this.f168158i = cVar2;
        this.f168159j = q2.a(new s21.t(null, null, null, null, 15, null));
        this.f168160k = q2.a(j53.l.b());
        this.f168163n = p13.j0.f134944a;
        Integer num = null;
        boolean z15 = false;
        p2 p2VarA = q2.a(new s21.a0(null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, num, null, null, null, null, null, true, false, null, z15, false, null, null, null, null, 0, -16777217, 3, null));
        this.f168164o = p2VarA;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        Object[] objArr16 = 0 == true ? 1 : 0;
        Object[] objArr17 = 0 == true ? 1 : 0;
        Object[] objArr18 = 0 == true ? 1 : 0;
        Object[] objArr19 = 0 == true ? 1 : 0;
        this.f168165p = r53.s.K(new r53.v(new c(null), p2VarA), v1.a(this), k2.a.a(k2.f150703a, 2), new s21.a0(objArr, null, null, false, false, objArr2, objArr3, objArr4, objArr5, objArr6, objArr7, objArr8, objArr9, objArr10, objArr11, objArr12, num, objArr13, objArr14, objArr15, objArr16, objArr17, null, null, true, z15, null, false, false, objArr18, objArr19, null, null, 0, -16777217, 3, null));
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0183  */
    /* JADX WARN: Code duplicated, block: B:108:0x0186  */
    /* JADX WARN: Code duplicated, block: B:113:0x019c  */
    /* JADX WARN: Code duplicated, block: B:114:0x019e  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:124:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:126:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:128:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:136:0x0216  */
    /* JADX WARN: Code duplicated, block: B:139:0x0231  */
    /* JADX WARN: Code duplicated, block: B:147:0x0262  */
    /* JADX WARN: Code duplicated, block: B:151:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:154:0x02ca A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:155:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:188:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:189:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:195:0x0414  */
    /* JADX WARN: Code duplicated, block: B:197:0x0418  */
    /* JADX WARN: Code duplicated, block: B:200:0x0429  */
    /* JADX WARN: Code duplicated, block: B:210:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00da  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:67:0x0102  */
    /* JADX WARN: Code duplicated, block: B:79:0x012a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:80:0x012c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0134  */
    /* JADX WARN: Code duplicated, block: B:86:0x013e  */
    /* JADX WARN: Code duplicated, block: B:95:0x015a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0164  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object x4(u0 u0Var, v13.c cVar) {
        x0 x0Var;
        x01.e eVar;
        v2 v2Var;
        l01.c cVar2;
        List<l01.d> listN0;
        l01.d dVar;
        List<l01.f> listN1;
        l01.f fVar;
        l01.f fVar2;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        p2 p2Var;
        Object value;
        String str;
        boolean z14;
        boolean z15;
        boolean z16;
        q13.g gVar;
        l01.f fVar3;
        List list;
        LinkedHashMap linkedHashMap2;
        l01.f fVar4;
        l01.d dVar2;
        List list2;
        LinkedHashMap linkedHashMap3;
        l01.f fVar5;
        l01.d dVar3;
        String str2;
        String str3;
        String str4;
        Object next;
        Iterator it;
        Object next2;
        String str5;
        List<l01.f> list3;
        Iterator it3;
        Object next3;
        String str6;
        List<l01.d> list4;
        Object value2;
        s21.a0 a0Var;
        s21.z zVar;
        l4 l4Var;
        s21.a0 a0VarA;
        Object obj;
        o13.p pVar;
        s92.g gVar2;
        Object value3;
        s21.a0 a0Var2;
        s21.c0 c0Var;
        List<s92.b> listQ;
        c22.o oVar = u0Var.f168156g;
        p2 p2Var2 = u0Var.f168164o;
        p2 p2Var3 = u0Var.f168160k;
        if (cVar instanceof x0) {
            x0Var = (x0) cVar;
            int i14 = x0Var.f168186i;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                x0Var.f168186i = i14 - Integer.MIN_VALUE;
            } else {
                x0Var = new x0(u0Var, cVar);
            }
        } else {
            x0Var = new x0(u0Var, cVar);
        }
        Object objA = x0Var.f168184g;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = x0Var.f168186i;
        if (i15 == 0) {
            o13.r.b(objA);
            x01.i iVar = u0Var.f168152c;
            x0Var.f168186i = 1;
            objA = iVar.a(true, x0Var);
            if (objA != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            o13.r.b(objA);
        } else {
            if (i15 == 2) {
                eVar = x0Var.f168178a;
                o13.r.b(objA);
                v2Var = (v2) objA;
                if (v2Var instanceof v2.b) {
                    cVar2 = (l01.c) ((v2.b) v2Var).f47386a;
                    if (cVar2 != null || (list4 = cVar2.f107841a) == null) {
                        listN0 = null;
                    } else {
                        listN0 = p13.h0.N0(list4, new v0());
                    }
                    String country = hb2.h.a(oVar.c()).getCountry();
                    if (listN0 != null) {
                        it3 = listN0.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next3 = null;
                                break;
                            }
                            next3 = it3.next();
                            str6 = ((l01.d) next3).f107844a;
                            if (str6 == null && str6.equalsIgnoreCase(country)) {
                                break;
                            }
                        }
                        dVar = (l01.d) next3;
                    } else {
                        dVar = null;
                    }
                    if (cVar2 != null || (list3 = cVar2.f107842b) == null) {
                        listN1 = null;
                    } else {
                        listN1 = p13.h0.N0(list3, new w0());
                    }
                    String strB = oVar.b();
                    if (listN1 != null) {
                        it = listN1.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it.next();
                            str5 = ((l01.f) next2).f107853a;
                            if (str5 == null && str5.equalsIgnoreCase(strB)) {
                                break;
                            }
                        }
                        fVar = (l01.f) next2;
                    } else {
                        fVar = null;
                    }
                    if (fVar == null) {
                        if (dVar != null) {
                            str4 = dVar.f107846c;
                        } else {
                            str4 = null;
                        }
                        if (str4 != null || listN1 == null) {
                            fVar2 = null;
                        } else {
                            Iterator it4 = listN1.iterator();
                            do {
                                if (!it4.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it4.next();
                            } while (!d53.u.q(((l01.f) next).f107853a, dVar.f107846c, true));
                            fVar2 = (l01.f) next;
                        }
                    } else {
                        fVar2 = fVar;
                    }
                    arrayList = new ArrayList();
                    if (listN0 != null) {
                        for (l01.d dVar4 : listN0) {
                            if (dVar4.f107844a == null && dVar4.f107845b != null) {
                                arrayList.add(dVar4);
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                    linkedHashMap = new LinkedHashMap();
                    if (listN1 != null) {
                        for (l01.f fVar6 : listN1) {
                            str2 = fVar6.f107853a;
                            if (str2 == null && (str3 = fVar6.f107854b) != null) {
                                linkedHashMap.put(str2, str3);
                            }
                        }
                        Unit unit2 = Unit.INSTANCE;
                    }
                    p2Var = u0Var.f168159j;
                    do {
                        value = p2Var.getValue();
                        s21.t tVar = (s21.t) value;
                        if (fVar2 != null) {
                            str = fVar2.f107854b;
                        } else {
                            str = null;
                        }
                        tVar.getClass();
                    } while (!p2Var.b(value, new s21.t(str, linkedHashMap, dVar, arrayList)));
                    z14 = false;
                    if (eVar.f188254c == x01.f.ACTIVE) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = u0Var.f168157h;
                    if (dVar != null && fVar != null) {
                        z14 = true;
                    }
                    gVar = new q13.g();
                    if (!z16) {
                        gVar.add(s21.z.Genesis);
                    }
                    if (!z10.d1.h(q92.x.DI_CONNECT_UPLOAD, true)) {
                        gVar.add(s21.z.StorageAndProcessing);
                    }
                    if (z15) {
                        gVar.add(s21.z.DisconnectMFP);
                    }
                    if (!z14) {
                        gVar.add(s21.z.Location);
                    }
                    gVar.add(s21.z.Goal);
                    gVar.add(s21.z.PersonalDetails);
                    gVar.add(s21.z.Weight);
                    gVar.add(s21.z.Recommendation);
                    if (p005kotlin.jvm.internal.s.g(((s21.a0) p2Var2.getValue()).f156037b, Boolean.FALSE) && u0Var.f168153d.e()) {
                        gVar.add(s21.z.MealSettings);
                    }
                    gVar.add(s21.z.ReviewPlan);
                    gVar.add(s21.z.CompletePlan);
                    p2Var3.setValue(i53.a.j(p13.a1.a(gVar)));
                    if (z15) {
                        p92.o oVar2 = p92.o.f136619a;
                        q92.x xVar = q92.x.DI_CONNECT_THIRDPARTY;
                        x0Var.f168178a = null;
                        x0Var.f168179b = listN0;
                        x0Var.f168180c = dVar;
                        x0Var.f168181d = fVar;
                        x0Var.f168182e = fVar2;
                        x0Var.f168183f = linkedHashMap;
                        x0Var.f168186i = 3;
                        objA = oVar2.f(xVar, Locale.getDefault(), x0Var);
                        if (objA != aVar) {
                            list2 = listN0;
                            linkedHashMap3 = linkedHashMap;
                            fVar5 = fVar;
                            dVar3 = dVar;
                        }
                        return aVar;
                    }
                    fVar3 = fVar2;
                    list = listN0;
                    linkedHashMap2 = linkedHashMap;
                    fVar4 = fVar;
                    dVar2 = dVar;
                    do {
                        value2 = p2Var2.getValue();
                        a0Var = (s21.a0) value2;
                        if (dVar2 != null || fVar4 == null) {
                            zVar = (s21.z) p13.h0.d0((List) p2Var3.getValue());
                            if (zVar != null) {
                                l4Var = zVar.f156223a;
                            } else {
                                l4Var = null;
                            }
                            a0VarA = s21.a0.a(a0Var, l4Var, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, 0, -16777218, 3);
                        } else {
                            o13.p<String, String> pVar2 = a0Var.f156059x;
                            o13.p<String, String> pVar3 = a0Var.f156058w;
                            if (pVar2.f128594a == null && pVar3.f128594a == null) {
                                pVar = new o13.p(new o13.p(dVar2.f107844a, dVar2.f107845b), new o13.p(fVar3 != null ? fVar3.f107853a : null, fVar3 != null ? fVar3.f107854b : null));
                            } else {
                                String str7 = pVar3.f128594a;
                                Iterator it5 = list.iterator();
                                while (true) {
                                    if (!it5.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    Object next4 = it5.next();
                                    if (d53.u.q(((l01.d) next4).f107844a, pVar3.f128594a, true)) {
                                        obj = next4;
                                        break;
                                    }
                                }
                                l01.d dVar5 = (l01.d) obj;
                                o13.p pVar4 = new o13.p(str7, dVar5 != null ? dVar5.f107845b : null);
                                String str8 = a0Var.f156059x.f128594a;
                                pVar = new o13.p(pVar4, new o13.p(str8, linkedHashMap2.get(str8)));
                            }
                            o13.p pVar5 = (o13.p) pVar.f128594a;
                            o13.p pVar6 = (o13.p) pVar.f128595b;
                            s21.z zVar2 = (s21.z) p13.h0.d0((List) p2Var3.getValue());
                            a0VarA = s21.a0.a(a0Var, zVar2 != null ? zVar2.f156223a : null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, pVar5, pVar6, false, false, null, false, false, null, null, null, null, 0, -29360130, 3);
                        }
                    } while (!p2Var2.b(value2, a0VarA));
                } else {
                    if (v2Var instanceof v2.a) {
                        lc.u0.r();
                        return null;
                    }
                    a2 a2Var = a2.NUTRITION;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "NutritionSetupViewModel", "getLocationInfo: error retrieving country and languages");
                }
                return Unit.INSTANCE;
            }
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            linkedHashMap3 = x0Var.f168183f;
            fVar2 = x0Var.f168182e;
            l01.f fVar7 = x0Var.f168181d;
            l01.d dVar6 = x0Var.f168180c;
            List list5 = x0Var.f168179b;
            o13.r.b(objA);
            dVar3 = dVar6;
            fVar5 = fVar7;
            list2 = list5;
        }
        l01.f fVar8 = fVar2;
        gVar2 = (s92.g) objA;
        do {
            value3 = p2Var2.getValue();
            a0Var2 = (s21.a0) value3;
            if (gVar2 != null || (listQ = gVar2.q()) == null) {
                c0Var = null;
            } else {
                c0Var = new s21.c0(gVar2.getConsentTypeId(), gVar2.getVersion(), gVar2.getLocale(), i53.a.e(listQ));
            }
        } while (!p2Var2.b(value3, s21.a0.a(a0Var2, null, c0Var, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, 0, -5, 3)));
        linkedHashMap2 = linkedHashMap3;
        fVar3 = fVar8;
        list = list2;
        fVar4 = fVar5;
        dVar2 = dVar3;
        do {
            value2 = p2Var2.getValue();
            a0Var = (s21.a0) value2;
            if (dVar2 != null) {
                zVar = (s21.z) p13.h0.d0((List) p2Var3.getValue());
                if (zVar != null) {
                    l4Var = zVar.f156223a;
                } else {
                    l4Var = null;
                }
                a0VarA = s21.a0.a(a0Var, l4Var, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, 0, -16777218, 3);
            } else {
                zVar = (s21.z) p13.h0.d0((List) p2Var3.getValue());
                if (zVar != null) {
                    l4Var = zVar.f156223a;
                } else {
                    l4Var = null;
                }
                a0VarA = s21.a0.a(a0Var, l4Var, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, 0, -16777218, 3);
            }
        } while (!p2Var2.b(value2, a0VarA));
        return Unit.INSTANCE;
        eVar = (x01.e) objA;
        m01.g gVar3 = u0Var.f168150a;
        x0Var.f168178a = eVar;
        x0Var.f168186i = 2;
        objA = gVar3.I(x0Var);
        if (objA != aVar) {
            v2Var = (v2) objA;
            if (v2Var instanceof v2.b) {
                cVar2 = (l01.c) ((v2.b) v2Var).f47386a;
                if (cVar2 != null) {
                    listN0 = null;
                } else {
                    listN0 = null;
                }
                String country2 = hb2.h.a(oVar.c()).getCountry();
                if (listN0 != null) {
                    it3 = listN0.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it3.next();
                        str6 = ((l01.d) next3).f107844a;
                        if (str6 == null) {
                        }
                    }
                    dVar = (l01.d) next3;
                } else {
                    dVar = null;
                }
                if (cVar2 != null) {
                    listN1 = null;
                } else {
                    listN1 = null;
                }
                String strB2 = oVar.b();
                if (listN1 != null) {
                    it = listN1.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        str5 = ((l01.f) next2).f107853a;
                        if (str5 == null) {
                        }
                    }
                    fVar = (l01.f) next2;
                } else {
                    fVar = null;
                }
                if (fVar == null) {
                    if (dVar != null) {
                        str4 = dVar.f107846c;
                    } else {
                        str4 = null;
                    }
                    if (str4 != null) {
                        fVar2 = null;
                    } else {
                        fVar2 = null;
                    }
                } else {
                    fVar2 = fVar;
                }
                arrayList = new ArrayList();
                if (listN0 != null) {
                    while (r12.hasNext()) {
                        if (dVar4.f107844a == null) {
                        }
                    }
                    Unit unit3 = Unit.INSTANCE;
                }
                linkedHashMap = new LinkedHashMap();
                if (listN1 != null) {
                    while (r1.hasNext()) {
                        str2 = fVar6.f107853a;
                        if (str2 == null) {
                        }
                    }
                    Unit unit4 = Unit.INSTANCE;
                }
                p2Var = u0Var.f168159j;
                do {
                    value = p2Var.getValue();
                    s21.t tVar2 = (s21.t) value;
                    if (fVar2 != null) {
                        str = fVar2.f107854b;
                    } else {
                        str = null;
                    }
                    tVar2.getClass();
                } while (!p2Var.b(value, new s21.t(str, linkedHashMap, dVar, arrayList)));
                z14 = false;
                if (eVar.f188254c == x01.f.ACTIVE) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = u0Var.f168157h;
                if (dVar != null) {
                    z14 = true;
                }
                gVar = new q13.g();
                if (!z16) {
                    gVar.add(s21.z.Genesis);
                }
                if (!z10.d1.h(q92.x.DI_CONNECT_UPLOAD, true)) {
                    gVar.add(s21.z.StorageAndProcessing);
                }
                if (z15) {
                    gVar.add(s21.z.DisconnectMFP);
                }
                if (!z14) {
                    gVar.add(s21.z.Location);
                }
                gVar.add(s21.z.Goal);
                gVar.add(s21.z.PersonalDetails);
                gVar.add(s21.z.Weight);
                gVar.add(s21.z.Recommendation);
                if (p005kotlin.jvm.internal.s.g(((s21.a0) p2Var2.getValue()).f156037b, Boolean.FALSE)) {
                    gVar.add(s21.z.MealSettings);
                }
                gVar.add(s21.z.ReviewPlan);
                gVar.add(s21.z.CompletePlan);
                p2Var3.setValue(i53.a.j(p13.a1.a(gVar)));
                if (z15) {
                    p92.o oVar3 = p92.o.f136619a;
                    q92.x xVar2 = q92.x.DI_CONNECT_THIRDPARTY;
                    x0Var.f168178a = null;
                    x0Var.f168179b = listN0;
                    x0Var.f168180c = dVar;
                    x0Var.f168181d = fVar;
                    x0Var.f168182e = fVar2;
                    x0Var.f168183f = linkedHashMap;
                    x0Var.f168186i = 3;
                    objA = oVar3.f(xVar2, Locale.getDefault(), x0Var);
                    if (objA != aVar) {
                        list2 = listN0;
                        linkedHashMap3 = linkedHashMap;
                        fVar5 = fVar;
                        dVar3 = dVar;
                        l01.f fVar9 = fVar2;
                        gVar2 = (s92.g) objA;
                        do {
                            value3 = p2Var2.getValue();
                            a0Var2 = (s21.a0) value3;
                            if (gVar2 != null) {
                                c0Var = null;
                            } else {
                                c0Var = null;
                            }
                        } while (!p2Var2.b(value3, s21.a0.a(a0Var2, null, c0Var, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, 0, -5, 3)));
                        linkedHashMap2 = linkedHashMap3;
                        fVar3 = fVar9;
                        list = list2;
                        fVar4 = fVar5;
                        dVar2 = dVar3;
                    }
                } else {
                    fVar3 = fVar2;
                    list = listN0;
                    linkedHashMap2 = linkedHashMap;
                    fVar4 = fVar;
                    dVar2 = dVar;
                }
                do {
                    value2 = p2Var2.getValue();
                    a0Var = (s21.a0) value2;
                    if (dVar2 != null) {
                        zVar = (s21.z) p13.h0.d0((List) p2Var3.getValue());
                        if (zVar != null) {
                            l4Var = zVar.f156223a;
                        } else {
                            l4Var = null;
                        }
                        a0VarA = s21.a0.a(a0Var, l4Var, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, 0, -16777218, 3);
                    } else {
                        zVar = (s21.z) p13.h0.d0((List) p2Var3.getValue());
                        if (zVar != null) {
                            l4Var = zVar.f156223a;
                        } else {
                            l4Var = null;
                        }
                        a0VarA = s21.a0.a(a0Var, l4Var, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, 0, -16777218, 3);
                    }
                } while (!p2Var2.b(value2, a0VarA));
            } else {
                if (v2Var instanceof v2.a) {
                    lc.u0.r();
                    return null;
                }
                a2 a2Var2 = a2.NUTRITION;
                i2.f36769a.getClass();
                i2.a.b(a2Var2, "NutritionSetupViewModel", "getLocationInfo: error retrieving country and languages");
            }
            return Unit.INSTANCE;
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r53.s.k((r53.i) r8, r2, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object y4(u0 u0Var, l01.k kVar, v13.c cVar) {
        c1 c1Var;
        u0Var.getClass();
        if (cVar instanceof c1) {
            c1Var = (c1) cVar;
            int i14 = c1Var.f167923d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c1Var.f167923d = i14 - Integer.MIN_VALUE;
            } else {
                c1Var = new c1(u0Var, cVar);
            }
        } else {
            c1Var = new c1(u0Var, cVar);
        }
        Object objA = c1Var.f167921b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = c1Var.f167923d;
        if (i15 != 0) {
            if (i15 == 1) {
                kVar = c1Var.f167920a;
                o13.r.b(objA);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objA);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(objA);
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var, "NutritionSetupViewModel", "Loading nutrition reminders");
        v01.b1 b1Var = u0Var.f168154e;
        pd1.a aVar3 = pd1.a.GCNT;
        c1Var.f167920a = kVar;
        c1Var.f167923d = 1;
        objA = b1Var.a(aVar3, c1Var);
        if (objA != aVar) {
        }
        return aVar;
        d1 d1Var = new d1(u0Var, kVar, null);
        c1Var.f167920a = null;
        c1Var.f167923d = 2;
    }

    public final i53.h<s21.z> A4() {
        return i53.a.l((Iterable) this.f168160k.getValue());
    }

    public final void u1() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f168164o;
            value = p2Var.getValue();
        } while (!p2Var.b(value, s21.a0.a((s21.a0) value, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, 0, -67108865, 3)));
    }

    public final void z4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f168164o;
            value = p2Var.getValue();
        } while (!p2Var.b(value, s21.a0.a((s21.a0) value, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, 0, -939524097, 3)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lu21/u0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
