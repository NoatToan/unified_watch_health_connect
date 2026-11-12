package st1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import f12.l;
import fg0.k;
import gu1.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import lc.u0;
import o13.r;
import o53.b0;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p13.x;
import p13.y;
import r53.p2;
import tw1.m;
import tw1.n;
import v13.i;
import vt1.o;
import ww1.e0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.activeplans.domain.usecase.GetActiveTrainingPlansUseCase$fetchActiveTrainingPlans$2", f = "GetActiveTrainingPlansUseCase.kt", l = {36, 39, 54, 69, 74, 86, 91, 107, 113, 119, 125}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f160854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ww1.c f160855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ww1.b f160856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ww1.d f160857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f160858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f160859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ww1.a f160860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f160861h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f160862i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f160863j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f160864k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f160865l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f160866m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f160867n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a f160868o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f160868o = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b bVar = new b(this.f160868o, dVar);
        bVar.f160867n = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0233  */
    /* JADX WARN: Code duplicated, block: B:103:0x023f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0246  */
    /* JADX WARN: Code duplicated, block: B:107:0x0252  */
    /* JADX WARN: Code duplicated, block: B:109:0x027a  */
    /* JADX WARN: Code duplicated, block: B:113:0x028a  */
    /* JADX WARN: Code duplicated, block: B:119:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:121:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:122:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:125:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:126:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:129:0x0303  */
    /* JADX WARN: Code duplicated, block: B:130:0x0306  */
    /* JADX WARN: Code duplicated, block: B:134:0x031a  */
    /* JADX WARN: Code duplicated, block: B:135:0x0322 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:136:0x0324  */
    /* JADX WARN: Code duplicated, block: B:137:0x032c  */
    /* JADX WARN: Code duplicated, block: B:139:0x032f  */
    /* JADX WARN: Code duplicated, block: B:156:0x0398  */
    /* JADX WARN: Code duplicated, block: B:160:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:163:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:166:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:169:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:171:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:173:0x0427  */
    /* JADX WARN: Code duplicated, block: B:174:0x042a  */
    /* JADX WARN: Code duplicated, block: B:176:0x0463  */
    /* JADX WARN: Code duplicated, block: B:178:0x0467  */
    /* JADX WARN: Code duplicated, block: B:181:0x046f  */
    /* JADX WARN: Code duplicated, block: B:184:0x047a  */
    /* JADX WARN: Code duplicated, block: B:193:0x0492  */
    /* JADX WARN: Code duplicated, block: B:196:0x049a  */
    /* JADX WARN: Code duplicated, block: B:199:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:208:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:20:0x00c1 A[PHI: r3
      0x00c1: PHI (r3v5 java.lang.Object) = (r3v4 java.lang.Object), (r3v21 java.lang.Object) binds: [B:18:0x00be, B:12:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:211:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:214:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:222:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:225:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:228:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:22:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:239:0x053c  */
    /* JADX WARN: Code duplicated, block: B:242:0x0547  */
    /* JADX WARN: Code duplicated, block: B:245:0x058a  */
    /* JADX WARN: Code duplicated, block: B:247:0x058e  */
    /* JADX WARN: Code duplicated, block: B:24:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:250:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:252:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:254:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:257:0x0602  */
    /* JADX WARN: Code duplicated, block: B:259:0x0606  */
    /* JADX WARN: Code duplicated, block: B:261:0x060b  */
    /* JADX WARN: Code duplicated, block: B:264:0x0639  */
    /* JADX WARN: Code duplicated, block: B:266:0x063d  */
    /* JADX WARN: Code duplicated, block: B:268:0x0642  */
    /* JADX WARN: Code duplicated, block: B:273:0x0664  */
    /* JADX WARN: Code duplicated, block: B:276:0x0507 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x04f5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:282:0x04dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:285:0x04ca A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x04b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:291:0x049f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x0486 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x0474 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:0x011a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:310:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x01a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:0x021a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x0207 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x0297 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:324:0x0284 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:329:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:330:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:334:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:38:0x010d  */
    /* JADX WARN: Code duplicated, block: B:41:0x011e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0121  */
    /* JADX WARN: Code duplicated, block: B:44:0x0125  */
    /* JADX WARN: Code duplicated, block: B:48:0x0132  */
    /* JADX WARN: Code duplicated, block: B:54:0x0145  */
    /* JADX WARN: Code duplicated, block: B:56:0x014f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0152  */
    /* JADX WARN: Code duplicated, block: B:59:0x0182  */
    /* JADX WARN: Code duplicated, block: B:62:0x0189  */
    /* JADX WARN: Code duplicated, block: B:65:0x0197  */
    /* JADX WARN: Code duplicated, block: B:71:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:83:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:86:0x0203  */
    /* JADX WARN: Code duplicated, block: B:89:0x020d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0226  */
    /* JADX WARN: Code duplicated, block: B:99:0x0230  */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0350, code lost:
    
        if (r4 == r2) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objB;
        v2 v2Var;
        List<m> listA;
        ?? arrayList;
        List<m> listA2;
        ArrayList arrayList2;
        List list;
        Iterator it;
        Object next;
        m mVar;
        ww1.c cVar;
        List<m> listA3;
        ww1.b bVar;
        List<m> listA4;
        ww1.d dVar;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Iterator it3;
        String str;
        Long l14;
        long jLongValue;
        Object objC;
        String trainingPlanName;
        String str2;
        int iM;
        n trainingPlanType;
        o oVarB;
        int i14;
        Iterator it4;
        Object next2;
        m mVar2;
        String trainingPlanName2;
        String str3;
        n trainingPlanType2;
        o oVarB2;
        DateTime dateTimeO;
        m mVar3;
        ListIterator<m> listIterator;
        m mVarPrevious;
        m mVar4;
        String trainingPlanName3;
        String str4;
        n trainingPlanType3;
        o oVarB3;
        DateTime dateTimeO2;
        String trainingPlanName4;
        String str5;
        List list2;
        ww1.b bVar2;
        ww1.c cVar2;
        Object objJ;
        List list3;
        List list4;
        v2 v2Var2;
        List list5;
        Object objA;
        ww1.d dVar2;
        ww1.c cVar3;
        ww1.b bVar3;
        List list6;
        List list7;
        v2 v2Var3;
        xw1.d dVar3;
        ww1.a aVar;
        Iterator it5;
        int i15;
        Iterator it6;
        int i16;
        Iterator it7;
        int i17;
        Iterator it8;
        int i18;
        Object objJ2;
        ww1.c cVar4;
        int i19;
        String strB;
        String str6;
        List list8;
        ww1.a aVar2;
        List list9;
        List list10;
        ww1.d dVar4;
        ww1.b bVar4;
        v2 v2Var4;
        b0 b0Var = (b0) this.f160867n;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i24 = this.f160866m;
        String str7 = "";
        int i25 = 6;
        a aVar4 = this.f160868o;
        switch (i24) {
            case 0:
                r.b(obj);
                p2 p2Var = aVar4.f160851d;
                g3 g3VarC = g3.a.c(g3.f35298f);
                this.f160867n = b0Var;
                this.f160866m = 1;
                p2Var.k(null, g3VarC);
                if (Unit.INSTANCE != aVar3) {
                    uw1.b bVar5 = aVar4.f160849b;
                    this.f160867n = b0Var;
                    this.f160866m = 2;
                    objB = bVar5.b(this);
                    if (objB != aVar3) {
                        v2Var = (v2) objB;
                        if (v2Var instanceof v2.b) {
                            tw1.o oVar = (tw1.o) ((v2.b) v2Var).f47386a;
                            listA = oVar.a();
                            if (listA != null) {
                                arrayList = new ArrayList();
                                for (Object obj2 : listA) {
                                    if (((m) obj2).Z()) {
                                        arrayList.add(obj2);
                                    }
                                }
                            } else {
                                arrayList = 0;
                            }
                            if (arrayList == 0) {
                                arrayList = j0.f134944a;
                            }
                            listA2 = oVar.a();
                            if (listA2 != null) {
                                arrayList2 = new ArrayList();
                                for (Object obj3 : listA2) {
                                    if (((m) obj3).e0()) {
                                        arrayList2.add(obj3);
                                    }
                                }
                            } else {
                                arrayList2 = null;
                            }
                            if (arrayList2 == null) {
                                list = j0.f134944a;
                            } else {
                                list = arrayList2;
                            }
                            Iterable iterable = (Iterable) arrayList;
                            it = iterable.iterator();
                            do {
                                if (it.hasNext()) {
                                    next = it.next();
                                } else {
                                    next = null;
                                }
                                mVar = (m) next;
                                if (mVar != null) {
                                    long trainingPlanId = mVar.getTrainingPlanId();
                                    trainingPlanName4 = mVar.getTrainingPlanName();
                                    if (trainingPlanName4 == null) {
                                        str5 = "";
                                    } else {
                                        str5 = trainingPlanName4;
                                    }
                                    cVar = new ww1.c(trainingPlanId, str5, mVar.m(), vw1.c.h(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c, mVar.getStartDate(), mVar.o()), mVar.o(), null, 32, null);
                                } else {
                                    cVar = null;
                                }
                                listA3 = oVar.a();
                                if (listA3 != null) {
                                    listIterator = listA3.listIterator(listA3.size());
                                    do {
                                        if (listIterator.hasPrevious()) {
                                            mVarPrevious = listIterator.previous();
                                        } else {
                                            mVarPrevious = null;
                                        }
                                        mVar4 = mVarPrevious;
                                        if (mVar4 != null) {
                                            long trainingPlanId2 = mVar4.getTrainingPlanId();
                                            trainingPlanName3 = mVar4.getTrainingPlanName();
                                            if (trainingPlanName3 == null) {
                                                str4 = "";
                                            } else {
                                                str4 = trainingPlanName3;
                                            }
                                            int iM2 = mVar4.m();
                                            trainingPlanType3 = mVar4.getTrainingPlanType();
                                            if (trainingPlanType3 != null) {
                                                oVarB3 = trainingPlanType3.b();
                                            } else {
                                                oVarB3 = null;
                                            }
                                            DateTime startDate = mVar4.getStartDate();
                                            dateTimeO2 = mVar4.o();
                                            if (dateTimeO2 == null) {
                                                dateTimeO2 = DateTime.now();
                                            }
                                            bVar = new ww1.b(trainingPlanId2, str4, iM2, vw1.c.h(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c, startDate, dateTimeO2), mVar4.o(), oVarB3, null, 64, null);
                                        } else {
                                            bVar = null;
                                        }
                                    } while (!mVarPrevious.a0());
                                    mVar4 = mVarPrevious;
                                    if (mVar4 != null) {
                                        long trainingPlanId3 = mVar4.getTrainingPlanId();
                                        trainingPlanName3 = mVar4.getTrainingPlanName();
                                        if (trainingPlanName3 == null) {
                                            str4 = "";
                                        } else {
                                            str4 = trainingPlanName3;
                                        }
                                        int iM3 = mVar4.m();
                                        trainingPlanType3 = mVar4.getTrainingPlanType();
                                        if (trainingPlanType3 != null) {
                                            oVarB3 = trainingPlanType3.b();
                                        } else {
                                            oVarB3 = null;
                                        }
                                        DateTime startDate2 = mVar4.getStartDate();
                                        dateTimeO2 = mVar4.o();
                                        if (dateTimeO2 == null) {
                                            dateTimeO2 = DateTime.now();
                                        }
                                        bVar = new ww1.b(trainingPlanId3, str4, iM3, vw1.c.h(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c, startDate2, dateTimeO2), mVar4.o(), oVarB3, null, 64, null);
                                    } else {
                                        bVar = null;
                                    }
                                } else {
                                    bVar = null;
                                }
                                listA4 = oVar.a();
                                if (listA4 != null) {
                                    it4 = listA4.iterator();
                                    while (true) {
                                        if (it4.hasNext()) {
                                            next2 = it4.next();
                                            mVar3 = (m) next2;
                                            if (mVar3.p0() || !mVar3.Z()) {
                                            }
                                        } else {
                                            next2 = null;
                                        }
                                    }
                                    mVar2 = (m) next2;
                                    if (mVar2 != null) {
                                        long trainingPlanId4 = mVar2.getTrainingPlanId();
                                        trainingPlanName2 = mVar2.getTrainingPlanName();
                                        if (trainingPlanName2 == null) {
                                            str3 = "";
                                        } else {
                                            str3 = trainingPlanName2;
                                        }
                                        int iM4 = mVar2.m();
                                        trainingPlanType2 = mVar2.getTrainingPlanType();
                                        if (trainingPlanType2 != null) {
                                            oVarB2 = trainingPlanType2.b();
                                        } else {
                                            oVarB2 = null;
                                        }
                                        DateTime startDate3 = mVar2.getStartDate();
                                        dateTimeO = mVar2.o();
                                        if (dateTimeO == null) {
                                            dateTimeO = DateTime.now();
                                        }
                                        dVar = new ww1.d(trainingPlanId4, str3, iM4, vw1.c.h(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c, startDate3, dateTimeO), mVar2.o(), oi0.c.N(mVar2), mVar2.getStartDate(), oVarB2);
                                    } else {
                                        dVar = null;
                                    }
                                } else {
                                    dVar = null;
                                }
                                arrayList3 = new ArrayList();
                                for (Object obj4 : iterable) {
                                    if (((m) obj4).o0()) {
                                        arrayList3.add(obj4);
                                    }
                                }
                                arrayList4 = new ArrayList(y.r(arrayList3, 10));
                                it3 = arrayList3.iterator();
                                while (it3.hasNext()) {
                                    m mVar5 = (m) it3.next();
                                    mVar5.getClass();
                                    long trainingPlanId5 = mVar5.getTrainingPlanId();
                                    trainingPlanName = mVar5.getTrainingPlanName();
                                    if (trainingPlanName == null) {
                                        str2 = str7;
                                    } else {
                                        str2 = trainingPlanName;
                                    }
                                    DateTime startDate4 = mVar5.getStartDate();
                                    iM = mVar5.m();
                                    Iterator it9 = it3;
                                    String str8 = str7;
                                    int iH = vw1.c.h(((l) KoinJavaComponent.get$default(l.class, null, null, i25, null)).e1().f77271c, mVar5.getStartDate(), mVar5.o());
                                    DateTime dateTimeO3 = mVar5.o();
                                    trainingPlanType = mVar5.getTrainingPlanType();
                                    if (trainingPlanType != null) {
                                        oVarB = trainingPlanType.b();
                                    } else {
                                        oVarB = null;
                                    }
                                    if (iM < 0) {
                                        i14 = 0;
                                    } else {
                                        i14 = iM;
                                    }
                                    arrayList4.add(new ww1.e(trainingPlanId5, str2, i14, iH, dateTimeO3, startDate4, oVarB));
                                    it3 = it9;
                                    str7 = str8;
                                    i25 = 6;
                                }
                                str = str7;
                                if (cVar != null) {
                                    l14 = new Long(cVar.f187755a);
                                } else if (bVar != null) {
                                    l14 = new Long(bVar.f187755a);
                                } else {
                                    l14 = null;
                                }
                                if (l14 != null) {
                                    jLongValue = l14.longValue();
                                    zf0.d dVar5 = aVar4.f160850c;
                                    this.f160867n = b0Var;
                                    this.f160854a = list;
                                    this.f160855b = cVar;
                                    this.f160856c = bVar;
                                    this.f160857d = dVar;
                                    this.f160858e = arrayList4;
                                    this.f160861h = jLongValue;
                                    this.f160862i = 0;
                                    this.f160866m = 3;
                                    objC = dVar5.c(jLongValue, this);
                                    break;
                                } else {
                                    list2 = arrayList4;
                                    bVar2 = bVar;
                                    cVar2 = cVar;
                                    fy1.i.f73924a.getClass();
                                    String strF = fy1.i.a.f();
                                    gu1.b bVar6 = aVar4.f160848a;
                                    this.f160867n = null;
                                    this.f160854a = list;
                                    this.f160855b = cVar2;
                                    this.f160856c = bVar2;
                                    this.f160857d = dVar;
                                    this.f160858e = list2;
                                    this.f160866m = 4;
                                    objJ = f0.J(bVar6, new h(bVar6, strF, null), this);
                                    if (objJ != aVar3) {
                                        list3 = list;
                                        list4 = list2;
                                        v2Var2 = (v2) objJ;
                                        if (v2Var2 instanceof v2.b) {
                                            list5 = (List) ((v2.b) v2Var2).f47386a;
                                            gu1.b bVar7 = aVar4.f160848a;
                                            this.f160867n = null;
                                            this.f160854a = list3;
                                            this.f160855b = cVar2;
                                            this.f160856c = bVar2;
                                            this.f160857d = dVar;
                                            this.f160858e = list4;
                                            this.f160859f = list5;
                                            this.f160866m = 5;
                                            objA = bVar7.a(this);
                                            if (objA != aVar3) {
                                                ww1.b bVar8 = bVar2;
                                                dVar2 = dVar;
                                                cVar3 = cVar2;
                                                bVar3 = bVar8;
                                                list6 = list5;
                                                list7 = list4;
                                                v2Var3 = (v2) objA;
                                                if (v2Var3 instanceof v2.b) {
                                                    dVar3 = (xw1.d) ((v2.b) v2Var3).f47386a;
                                                    if (dVar3 != null) {
                                                        long athletePlanId = dVar3.getAthletePlanId();
                                                        vt1.a.C3360a c3360a = vt1.a.f180073b;
                                                        int workoutPlanId = (int) dVar3.getWorkoutPlanId();
                                                        c3360a.getClass();
                                                        String strA = vt1.a.C3360a.a(workoutPlanId);
                                                        strB = vt1.a.C3360a.b((int) dVar3.getWorkoutPlanId(), ((rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null)).b());
                                                        if (strB == null) {
                                                            str6 = str;
                                                        } else {
                                                            str6 = strB;
                                                        }
                                                        DateTime dateTimeNow = DateTime.now();
                                                        dateTimeNow.getClass();
                                                        aVar = new ww1.a(athletePlanId, strA, str6, dVar3.j(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c, dateTimeNow), dVar3.A(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c), dVar3.r(), dVar3.getAthleteRace());
                                                    } else {
                                                        aVar = null;
                                                    }
                                                    if (list3 == null && list3.isEmpty()) {
                                                        i15 = 0;
                                                    } else {
                                                        it5 = list3.iterator();
                                                        int i26 = 0;
                                                        while (it5.hasNext()) {
                                                            if (!((m) it5.next()).n0() && (i26 = i26 + 1) < 0) {
                                                                x.p();
                                                                throw null;
                                                            }
                                                        }
                                                        i15 = i26;
                                                    }
                                                    if (list3 == null && list3.isEmpty()) {
                                                        i16 = 0;
                                                    } else {
                                                        it6 = list3.iterator();
                                                        int i27 = 0;
                                                        while (it6.hasNext()) {
                                                            if (!((m) it6.next()).h0() && (i27 = i27 + 1) < 0) {
                                                                x.p();
                                                                throw null;
                                                            }
                                                        }
                                                        i16 = i27;
                                                    }
                                                    if (list3 == null && list3.isEmpty()) {
                                                        i17 = 0;
                                                    } else {
                                                        it7 = list3.iterator();
                                                        i17 = 0;
                                                        while (it7.hasNext()) {
                                                            if (!((m) it7.next()).p0() && (i17 = i17 + 1) < 0) {
                                                                x.p();
                                                                throw null;
                                                            }
                                                        }
                                                    }
                                                    if (list3 == null && list3.isEmpty()) {
                                                        i18 = 0;
                                                    } else {
                                                        it8 = list3.iterator();
                                                        int i28 = 0;
                                                        while (it8.hasNext()) {
                                                            if (!((m) it8.next()).o0() && (i28 = i28 + 1) < 0) {
                                                                x.p();
                                                                throw null;
                                                            }
                                                        }
                                                        i18 = i28;
                                                    }
                                                    gu1.b bVar9 = aVar4.f160848a;
                                                    this.f160867n = null;
                                                    this.f160854a = null;
                                                    this.f160855b = cVar3;
                                                    this.f160856c = bVar3;
                                                    this.f160857d = dVar2;
                                                    this.f160858e = list7;
                                                    this.f160859f = list6;
                                                    this.f160860g = aVar;
                                                    this.f160862i = i15;
                                                    this.f160863j = i16;
                                                    this.f160864k = i17;
                                                    this.f160865l = i18;
                                                    this.f160866m = 6;
                                                    objJ2 = f0.J(bVar9, new gu1.f(bVar9, null), this);
                                                    if (objJ2 == aVar3) {
                                                        return aVar3;
                                                    }
                                                    cVar4 = cVar3;
                                                    i19 = i17;
                                                    list8 = list7;
                                                    aVar2 = aVar;
                                                    list9 = list6;
                                                    list10 = list8;
                                                    dVar4 = dVar2;
                                                    bVar4 = bVar3;
                                                    v2Var4 = (v2) objJ2;
                                                    if (v2Var4 instanceof v2.b) {
                                                        int size = ((List) ((v2.b) v2Var4).f47386a).size() + i15 + i16 + i19 + i18;
                                                        p2 p2Var2 = aVar4.f160851d;
                                                        g3.a aVar5 = g3.f35298f;
                                                        e0 e0Var = new e0(list10, cVar4, aVar2, bVar4, dVar4, list9, size);
                                                        aVar5.getClass();
                                                        g3 g3VarD = g3.a.d(e0Var);
                                                        this.f160867n = null;
                                                        this.f160854a = null;
                                                        this.f160855b = null;
                                                        this.f160856c = null;
                                                        this.f160857d = null;
                                                        this.f160858e = null;
                                                        this.f160859f = null;
                                                        this.f160860g = null;
                                                        this.f160862i = i15;
                                                        this.f160863j = i16;
                                                        this.f160864k = i19;
                                                        this.f160865l = i18;
                                                        this.f160866m = 7;
                                                        p2Var2.k(null, g3VarD);
                                                        if (Unit.INSTANCE == aVar3) {
                                                            return aVar3;
                                                        }
                                                    } else {
                                                        if (v2Var4 instanceof v2.a) {
                                                            u0.r();
                                                            return null;
                                                        }
                                                        p2 p2Var3 = aVar4.f160851d;
                                                        g3 g3VarA = g3.a.a(g3.f35298f, null, ((v2.a) v2Var4).f47383a, null, null, 13);
                                                        this.f160867n = null;
                                                        this.f160854a = null;
                                                        this.f160855b = null;
                                                        this.f160856c = null;
                                                        this.f160857d = null;
                                                        this.f160858e = null;
                                                        this.f160859f = null;
                                                        this.f160860g = null;
                                                        this.f160862i = i15;
                                                        this.f160863j = i16;
                                                        this.f160864k = i19;
                                                        this.f160865l = i18;
                                                        this.f160866m = 8;
                                                        p2Var3.k(null, g3VarA);
                                                        if (Unit.INSTANCE == aVar3) {
                                                            return aVar3;
                                                        }
                                                    }
                                                } else {
                                                    if (!(v2Var3 instanceof v2.a)) {
                                                        u0.r();
                                                        return null;
                                                    }
                                                    p2 p2Var4 = aVar4.f160851d;
                                                    g3 g3VarA2 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var3).f47383a, null, null, 13);
                                                    this.f160867n = null;
                                                    this.f160854a = null;
                                                    this.f160855b = null;
                                                    this.f160856c = null;
                                                    this.f160857d = null;
                                                    this.f160858e = null;
                                                    this.f160859f = null;
                                                    this.f160866m = 9;
                                                    p2Var4.k(null, g3VarA2);
                                                    if (Unit.INSTANCE == aVar3) {
                                                        return aVar3;
                                                    }
                                                }
                                            }
                                        } else {
                                            if (v2Var2 instanceof v2.a) {
                                                u0.r();
                                                return null;
                                            }
                                            p2 p2Var5 = aVar4.f160851d;
                                            g3 g3VarA3 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var2).f47383a, null, null, 13);
                                            this.f160867n = null;
                                            this.f160854a = null;
                                            this.f160855b = null;
                                            this.f160856c = null;
                                            this.f160857d = null;
                                            this.f160858e = null;
                                            this.f160866m = 10;
                                            p2Var5.k(null, g3VarA3);
                                            if (Unit.INSTANCE == aVar3) {
                                                return aVar3;
                                            }
                                        }
                                    }
                                }
                            } while (!((m) next).n0());
                            mVar = (m) next;
                            if (mVar != null) {
                                long trainingPlanId6 = mVar.getTrainingPlanId();
                                trainingPlanName4 = mVar.getTrainingPlanName();
                                if (trainingPlanName4 == null) {
                                    str5 = "";
                                } else {
                                    str5 = trainingPlanName4;
                                }
                                cVar = new ww1.c(trainingPlanId6, str5, mVar.m(), vw1.c.h(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c, mVar.getStartDate(), mVar.o()), mVar.o(), null, 32, null);
                            } else {
                                cVar = null;
                            }
                            listA3 = oVar.a();
                            if (listA3 != null) {
                                listIterator = listA3.listIterator(listA3.size());
                                do {
                                    if (listIterator.hasPrevious()) {
                                        mVarPrevious = listIterator.previous();
                                    } else {
                                        mVarPrevious = null;
                                    }
                                    mVar4 = mVarPrevious;
                                    if (mVar4 != null) {
                                        long trainingPlanId7 = mVar4.getTrainingPlanId();
                                        trainingPlanName3 = mVar4.getTrainingPlanName();
                                        if (trainingPlanName3 == null) {
                                            str4 = "";
                                        } else {
                                            str4 = trainingPlanName3;
                                        }
                                        int iM5 = mVar4.m();
                                        trainingPlanType3 = mVar4.getTrainingPlanType();
                                        if (trainingPlanType3 != null) {
                                            oVarB3 = trainingPlanType3.b();
                                        } else {
                                            oVarB3 = null;
                                        }
                                        DateTime startDate5 = mVar4.getStartDate();
                                        dateTimeO2 = mVar4.o();
                                        if (dateTimeO2 == null) {
                                            dateTimeO2 = DateTime.now();
                                        }
                                        bVar = new ww1.b(trainingPlanId7, str4, iM5, vw1.c.h(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c, startDate5, dateTimeO2), mVar4.o(), oVarB3, null, 64, null);
                                    } else {
                                        bVar = null;
                                    }
                                } while (!mVarPrevious.a0());
                                mVar4 = mVarPrevious;
                                if (mVar4 != null) {
                                    long trainingPlanId8 = mVar4.getTrainingPlanId();
                                    trainingPlanName3 = mVar4.getTrainingPlanName();
                                    if (trainingPlanName3 == null) {
                                        str4 = "";
                                    } else {
                                        str4 = trainingPlanName3;
                                    }
                                    int iM6 = mVar4.m();
                                    trainingPlanType3 = mVar4.getTrainingPlanType();
                                    if (trainingPlanType3 != null) {
                                        oVarB3 = trainingPlanType3.b();
                                    } else {
                                        oVarB3 = null;
                                    }
                                    DateTime startDate6 = mVar4.getStartDate();
                                    dateTimeO2 = mVar4.o();
                                    if (dateTimeO2 == null) {
                                        dateTimeO2 = DateTime.now();
                                    }
                                    bVar = new ww1.b(trainingPlanId8, str4, iM6, vw1.c.h(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c, startDate6, dateTimeO2), mVar4.o(), oVarB3, null, 64, null);
                                } else {
                                    bVar = null;
                                }
                            } else {
                                bVar = null;
                            }
                            listA4 = oVar.a();
                            if (listA4 != null) {
                                it4 = listA4.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        next2 = it4.next();
                                        mVar3 = (m) next2;
                                        if (mVar3.p0()) {
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                }
                                mVar2 = (m) next2;
                                if (mVar2 != null) {
                                    long trainingPlanId9 = mVar2.getTrainingPlanId();
                                    trainingPlanName2 = mVar2.getTrainingPlanName();
                                    if (trainingPlanName2 == null) {
                                        str3 = "";
                                    } else {
                                        str3 = trainingPlanName2;
                                    }
                                    int iM7 = mVar2.m();
                                    trainingPlanType2 = mVar2.getTrainingPlanType();
                                    if (trainingPlanType2 != null) {
                                        oVarB2 = trainingPlanType2.b();
                                    } else {
                                        oVarB2 = null;
                                    }
                                    DateTime startDate7 = mVar2.getStartDate();
                                    dateTimeO = mVar2.o();
                                    if (dateTimeO == null) {
                                        dateTimeO = DateTime.now();
                                    }
                                    dVar = new ww1.d(trainingPlanId9, str3, iM7, vw1.c.h(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c, startDate7, dateTimeO), mVar2.o(), oi0.c.N(mVar2), mVar2.getStartDate(), oVarB2);
                                } else {
                                    dVar = null;
                                }
                            } else {
                                dVar = null;
                            }
                            arrayList3 = new ArrayList();
                            while (r8.hasNext()) {
                                if (((m) obj4).o0()) {
                                    arrayList3.add(obj4);
                                }
                            }
                            arrayList4 = new ArrayList(y.r(arrayList3, 10));
                            it3 = arrayList3.iterator();
                            while (it3.hasNext()) {
                                m mVar6 = (m) it3.next();
                                mVar6.getClass();
                                long trainingPlanId10 = mVar6.getTrainingPlanId();
                                trainingPlanName = mVar6.getTrainingPlanName();
                                if (trainingPlanName == null) {
                                    str2 = str7;
                                } else {
                                    str2 = trainingPlanName;
                                }
                                DateTime startDate8 = mVar6.getStartDate();
                                iM = mVar6.m();
                                Iterator it10 = it3;
                                String str9 = str7;
                                int iH2 = vw1.c.h(((l) KoinJavaComponent.get$default(l.class, null, null, i25, null)).e1().f77271c, mVar6.getStartDate(), mVar6.o());
                                DateTime dateTimeO4 = mVar6.o();
                                trainingPlanType = mVar6.getTrainingPlanType();
                                if (trainingPlanType != null) {
                                    oVarB = trainingPlanType.b();
                                } else {
                                    oVarB = null;
                                }
                                if (iM < 0) {
                                    i14 = 0;
                                } else {
                                    i14 = iM;
                                }
                                arrayList4.add(new ww1.e(trainingPlanId10, str2, i14, iH2, dateTimeO4, startDate8, oVarB));
                                it3 = it10;
                                str7 = str9;
                                i25 = 6;
                            }
                            str = str7;
                            if (cVar != null) {
                                l14 = new Long(cVar.f187755a);
                            } else if (bVar != null) {
                                l14 = new Long(bVar.f187755a);
                            } else {
                                l14 = null;
                            }
                            if (l14 != null) {
                                jLongValue = l14.longValue();
                                zf0.d dVar6 = aVar4.f160850c;
                                this.f160867n = b0Var;
                                this.f160854a = list;
                                this.f160855b = cVar;
                                this.f160856c = bVar;
                                this.f160857d = dVar;
                                this.f160858e = arrayList4;
                                this.f160861h = jLongValue;
                                this.f160862i = 0;
                                this.f160866m = 3;
                                objC = dVar6.c(jLongValue, this);
                                break;
                            } else {
                                list2 = arrayList4;
                                bVar2 = bVar;
                                cVar2 = cVar;
                                fy1.i.f73924a.getClass();
                                String strF2 = fy1.i.a.f();
                                gu1.b bVar10 = aVar4.f160848a;
                                this.f160867n = null;
                                this.f160854a = list;
                                this.f160855b = cVar2;
                                this.f160856c = bVar2;
                                this.f160857d = dVar;
                                this.f160858e = list2;
                                this.f160866m = 4;
                                objJ = f0.J(bVar10, new h(bVar10, strF2, null), this);
                                if (objJ != aVar3) {
                                    list3 = list;
                                    list4 = list2;
                                    v2Var2 = (v2) objJ;
                                    if (v2Var2 instanceof v2.b) {
                                        list5 = (List) ((v2.b) v2Var2).f47386a;
                                        gu1.b bVar11 = aVar4.f160848a;
                                        this.f160867n = null;
                                        this.f160854a = list3;
                                        this.f160855b = cVar2;
                                        this.f160856c = bVar2;
                                        this.f160857d = dVar;
                                        this.f160858e = list4;
                                        this.f160859f = list5;
                                        this.f160866m = 5;
                                        objA = bVar11.a(this);
                                        if (objA != aVar3) {
                                            ww1.b bVar12 = bVar2;
                                            dVar2 = dVar;
                                            cVar3 = cVar2;
                                            bVar3 = bVar12;
                                            list6 = list5;
                                            list7 = list4;
                                            v2Var3 = (v2) objA;
                                            if (v2Var3 instanceof v2.b) {
                                                dVar3 = (xw1.d) ((v2.b) v2Var3).f47386a;
                                                if (dVar3 != null) {
                                                    long athletePlanId2 = dVar3.getAthletePlanId();
                                                    vt1.a.C3360a c3360a2 = vt1.a.f180073b;
                                                    int workoutPlanId2 = (int) dVar3.getWorkoutPlanId();
                                                    c3360a2.getClass();
                                                    String strA2 = vt1.a.C3360a.a(workoutPlanId2);
                                                    strB = vt1.a.C3360a.b((int) dVar3.getWorkoutPlanId(), ((rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null)).b());
                                                    if (strB == null) {
                                                        str6 = str;
                                                    } else {
                                                        str6 = strB;
                                                    }
                                                    DateTime dateTimeNow2 = DateTime.now();
                                                    dateTimeNow2.getClass();
                                                    aVar = new ww1.a(athletePlanId2, strA2, str6, dVar3.j(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c, dateTimeNow2), dVar3.A(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c), dVar3.r(), dVar3.getAthleteRace());
                                                } else {
                                                    aVar = null;
                                                }
                                                if (list3 == null) {
                                                    it5 = list3.iterator();
                                                    int i29 = 0;
                                                    while (it5.hasNext()) {
                                                        if (!((m) it5.next()).n0()) {
                                                        }
                                                    }
                                                    i15 = i29;
                                                } else {
                                                    it5 = list3.iterator();
                                                    int i210 = 0;
                                                    while (it5.hasNext()) {
                                                        if (!((m) it5.next()).n0()) {
                                                        }
                                                    }
                                                    i15 = i210;
                                                }
                                                if (list3 == null) {
                                                    it6 = list3.iterator();
                                                    int i211 = 0;
                                                    while (it6.hasNext()) {
                                                        if (!((m) it6.next()).h0()) {
                                                        }
                                                    }
                                                    i16 = i211;
                                                } else {
                                                    it6 = list3.iterator();
                                                    int i212 = 0;
                                                    while (it6.hasNext()) {
                                                        if (!((m) it6.next()).h0()) {
                                                        }
                                                    }
                                                    i16 = i212;
                                                }
                                                if (list3 == null) {
                                                    it7 = list3.iterator();
                                                    i17 = 0;
                                                    while (it7.hasNext()) {
                                                        if (!((m) it7.next()).p0()) {
                                                        }
                                                    }
                                                } else {
                                                    it7 = list3.iterator();
                                                    i17 = 0;
                                                    while (it7.hasNext()) {
                                                        if (!((m) it7.next()).p0()) {
                                                        }
                                                    }
                                                }
                                                if (list3 == null) {
                                                    it8 = list3.iterator();
                                                    int i213 = 0;
                                                    while (it8.hasNext()) {
                                                        if (!((m) it8.next()).o0()) {
                                                        }
                                                    }
                                                    i18 = i213;
                                                } else {
                                                    it8 = list3.iterator();
                                                    int i214 = 0;
                                                    while (it8.hasNext()) {
                                                        if (!((m) it8.next()).o0()) {
                                                        }
                                                    }
                                                    i18 = i214;
                                                }
                                                gu1.b bVar13 = aVar4.f160848a;
                                                this.f160867n = null;
                                                this.f160854a = null;
                                                this.f160855b = cVar3;
                                                this.f160856c = bVar3;
                                                this.f160857d = dVar2;
                                                this.f160858e = list7;
                                                this.f160859f = list6;
                                                this.f160860g = aVar;
                                                this.f160862i = i15;
                                                this.f160863j = i16;
                                                this.f160864k = i17;
                                                this.f160865l = i18;
                                                this.f160866m = 6;
                                                objJ2 = f0.J(bVar13, new gu1.f(bVar13, null), this);
                                                if (objJ2 == aVar3) {
                                                    return aVar3;
                                                }
                                                cVar4 = cVar3;
                                                i19 = i17;
                                                list8 = list7;
                                                aVar2 = aVar;
                                                list9 = list6;
                                                list10 = list8;
                                                dVar4 = dVar2;
                                                bVar4 = bVar3;
                                                v2Var4 = (v2) objJ2;
                                                if (v2Var4 instanceof v2.b) {
                                                    int size2 = ((List) ((v2.b) v2Var4).f47386a).size() + i15 + i16 + i19 + i18;
                                                    p2 p2Var6 = aVar4.f160851d;
                                                    g3.a aVar6 = g3.f35298f;
                                                    e0 e0Var2 = new e0(list10, cVar4, aVar2, bVar4, dVar4, list9, size2);
                                                    aVar6.getClass();
                                                    g3 g3VarD2 = g3.a.d(e0Var2);
                                                    this.f160867n = null;
                                                    this.f160854a = null;
                                                    this.f160855b = null;
                                                    this.f160856c = null;
                                                    this.f160857d = null;
                                                    this.f160858e = null;
                                                    this.f160859f = null;
                                                    this.f160860g = null;
                                                    this.f160862i = i15;
                                                    this.f160863j = i16;
                                                    this.f160864k = i19;
                                                    this.f160865l = i18;
                                                    this.f160866m = 7;
                                                    p2Var6.k(null, g3VarD2);
                                                    if (Unit.INSTANCE == aVar3) {
                                                        return aVar3;
                                                    }
                                                } else {
                                                    if (v2Var4 instanceof v2.a) {
                                                        u0.r();
                                                        return null;
                                                    }
                                                    p2 p2Var7 = aVar4.f160851d;
                                                    g3 g3VarA4 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var4).f47383a, null, null, 13);
                                                    this.f160867n = null;
                                                    this.f160854a = null;
                                                    this.f160855b = null;
                                                    this.f160856c = null;
                                                    this.f160857d = null;
                                                    this.f160858e = null;
                                                    this.f160859f = null;
                                                    this.f160860g = null;
                                                    this.f160862i = i15;
                                                    this.f160863j = i16;
                                                    this.f160864k = i19;
                                                    this.f160865l = i18;
                                                    this.f160866m = 8;
                                                    p2Var7.k(null, g3VarA4);
                                                    if (Unit.INSTANCE == aVar3) {
                                                        return aVar3;
                                                    }
                                                }
                                            } else {
                                                if (!(v2Var3 instanceof v2.a)) {
                                                    u0.r();
                                                    return null;
                                                }
                                                p2 p2Var8 = aVar4.f160851d;
                                                g3 g3VarA5 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var3).f47383a, null, null, 13);
                                                this.f160867n = null;
                                                this.f160854a = null;
                                                this.f160855b = null;
                                                this.f160856c = null;
                                                this.f160857d = null;
                                                this.f160858e = null;
                                                this.f160859f = null;
                                                this.f160866m = 9;
                                                p2Var8.k(null, g3VarA5);
                                                if (Unit.INSTANCE == aVar3) {
                                                    return aVar3;
                                                }
                                            }
                                        }
                                    } else {
                                        if (v2Var2 instanceof v2.a) {
                                            u0.r();
                                            return null;
                                        }
                                        p2 p2Var9 = aVar4.f160851d;
                                        g3 g3VarA6 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var2).f47383a, null, null, 13);
                                        this.f160867n = null;
                                        this.f160854a = null;
                                        this.f160855b = null;
                                        this.f160856c = null;
                                        this.f160857d = null;
                                        this.f160858e = null;
                                        this.f160866m = 10;
                                        p2Var9.k(null, g3VarA6);
                                        if (Unit.INSTANCE == aVar3) {
                                            return aVar3;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (!(v2Var instanceof v2.a)) {
                                u0.r();
                                return null;
                            }
                            p2 p2Var10 = aVar4.f160851d;
                            g3 g3VarA7 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                            this.f160867n = null;
                            this.f160866m = 11;
                            p2Var10.k(null, g3VarA7);
                            if (Unit.INSTANCE == aVar3) {
                                return aVar3;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                list = arrayList4;
                return aVar3;
            case 1:
                r.b(obj);
                uw1.b bVar14 = aVar4.f160849b;
                this.f160867n = b0Var;
                this.f160866m = 2;
                objB = bVar14.b(this);
                if (objB != aVar3) {
                    v2Var = (v2) objB;
                    if (v2Var instanceof v2.b) {
                        tw1.o oVar2 = (tw1.o) ((v2.b) v2Var).f47386a;
                        listA = oVar2.a();
                        if (listA != null) {
                            arrayList = new ArrayList();
                            while (r11.hasNext()) {
                                if (((m) obj2).Z()) {
                                    arrayList.add(obj2);
                                }
                            }
                        } else {
                            arrayList = 0;
                        }
                        if (arrayList == 0) {
                            arrayList = j0.f134944a;
                        }
                        listA2 = oVar2.a();
                        if (listA2 != null) {
                            arrayList2 = new ArrayList();
                            while (r11.hasNext()) {
                                if (((m) obj3).e0()) {
                                    arrayList2.add(obj3);
                                }
                            }
                        } else {
                            arrayList2 = null;
                        }
                        if (arrayList2 == null) {
                            list = j0.f134944a;
                        } else {
                            list = arrayList2;
                        }
                        Iterable iterable2 = (Iterable) arrayList;
                        it = iterable2.iterator();
                        do {
                            if (it.hasNext()) {
                                next = it.next();
                            } else {
                                next = null;
                            }
                            mVar = (m) next;
                            if (mVar != null) {
                                long trainingPlanId11 = mVar.getTrainingPlanId();
                                trainingPlanName4 = mVar.getTrainingPlanName();
                                if (trainingPlanName4 == null) {
                                    str5 = "";
                                } else {
                                    str5 = trainingPlanName4;
                                }
                                cVar = new ww1.c(trainingPlanId11, str5, mVar.m(), vw1.c.h(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c, mVar.getStartDate(), mVar.o()), mVar.o(), null, 32, null);
                            } else {
                                cVar = null;
                            }
                            listA3 = oVar2.a();
                            if (listA3 != null) {
                                listIterator = listA3.listIterator(listA3.size());
                                do {
                                    if (listIterator.hasPrevious()) {
                                        mVarPrevious = listIterator.previous();
                                    } else {
                                        mVarPrevious = null;
                                    }
                                    mVar4 = mVarPrevious;
                                    if (mVar4 != null) {
                                        long trainingPlanId12 = mVar4.getTrainingPlanId();
                                        trainingPlanName3 = mVar4.getTrainingPlanName();
                                        if (trainingPlanName3 == null) {
                                            str4 = "";
                                        } else {
                                            str4 = trainingPlanName3;
                                        }
                                        int iM8 = mVar4.m();
                                        trainingPlanType3 = mVar4.getTrainingPlanType();
                                        if (trainingPlanType3 != null) {
                                            oVarB3 = trainingPlanType3.b();
                                        } else {
                                            oVarB3 = null;
                                        }
                                        DateTime startDate9 = mVar4.getStartDate();
                                        dateTimeO2 = mVar4.o();
                                        if (dateTimeO2 == null) {
                                            dateTimeO2 = DateTime.now();
                                        }
                                        bVar = new ww1.b(trainingPlanId12, str4, iM8, vw1.c.h(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c, startDate9, dateTimeO2), mVar4.o(), oVarB3, null, 64, null);
                                    } else {
                                        bVar = null;
                                    }
                                } while (!mVarPrevious.a0());
                                mVar4 = mVarPrevious;
                                if (mVar4 != null) {
                                    long trainingPlanId13 = mVar4.getTrainingPlanId();
                                    trainingPlanName3 = mVar4.getTrainingPlanName();
                                    if (trainingPlanName3 == null) {
                                        str4 = "";
                                    } else {
                                        str4 = trainingPlanName3;
                                    }
                                    int iM9 = mVar4.m();
                                    trainingPlanType3 = mVar4.getTrainingPlanType();
                                    if (trainingPlanType3 != null) {
                                        oVarB3 = trainingPlanType3.b();
                                    } else {
                                        oVarB3 = null;
                                    }
                                    DateTime startDate10 = mVar4.getStartDate();
                                    dateTimeO2 = mVar4.o();
                                    if (dateTimeO2 == null) {
                                        dateTimeO2 = DateTime.now();
                                    }
                                    bVar = new ww1.b(trainingPlanId13, str4, iM9, vw1.c.h(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c, startDate10, dateTimeO2), mVar4.o(), oVarB3, null, 64, null);
                                } else {
                                    bVar = null;
                                }
                            } else {
                                bVar = null;
                            }
                            listA4 = oVar2.a();
                            if (listA4 != null) {
                                it4 = listA4.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        next2 = it4.next();
                                        mVar3 = (m) next2;
                                        if (mVar3.p0()) {
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                }
                                mVar2 = (m) next2;
                                if (mVar2 != null) {
                                    long trainingPlanId14 = mVar2.getTrainingPlanId();
                                    trainingPlanName2 = mVar2.getTrainingPlanName();
                                    if (trainingPlanName2 == null) {
                                        str3 = "";
                                    } else {
                                        str3 = trainingPlanName2;
                                    }
                                    int iM10 = mVar2.m();
                                    trainingPlanType2 = mVar2.getTrainingPlanType();
                                    if (trainingPlanType2 != null) {
                                        oVarB2 = trainingPlanType2.b();
                                    } else {
                                        oVarB2 = null;
                                    }
                                    DateTime startDate11 = mVar2.getStartDate();
                                    dateTimeO = mVar2.o();
                                    if (dateTimeO == null) {
                                        dateTimeO = DateTime.now();
                                    }
                                    dVar = new ww1.d(trainingPlanId14, str3, iM10, vw1.c.h(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c, startDate11, dateTimeO), mVar2.o(), oi0.c.N(mVar2), mVar2.getStartDate(), oVarB2);
                                } else {
                                    dVar = null;
                                }
                            } else {
                                dVar = null;
                            }
                            arrayList3 = new ArrayList();
                            while (r8.hasNext()) {
                                if (((m) obj4).o0()) {
                                    arrayList3.add(obj4);
                                }
                            }
                            arrayList4 = new ArrayList(y.r(arrayList3, 10));
                            it3 = arrayList3.iterator();
                            while (it3.hasNext()) {
                                m mVar7 = (m) it3.next();
                                mVar7.getClass();
                                long trainingPlanId15 = mVar7.getTrainingPlanId();
                                trainingPlanName = mVar7.getTrainingPlanName();
                                if (trainingPlanName == null) {
                                    str2 = str7;
                                } else {
                                    str2 = trainingPlanName;
                                }
                                DateTime startDate12 = mVar7.getStartDate();
                                iM = mVar7.m();
                                Iterator it11 = it3;
                                String str10 = str7;
                                int iH3 = vw1.c.h(((l) KoinJavaComponent.get$default(l.class, null, null, i25, null)).e1().f77271c, mVar7.getStartDate(), mVar7.o());
                                DateTime dateTimeO5 = mVar7.o();
                                trainingPlanType = mVar7.getTrainingPlanType();
                                if (trainingPlanType != null) {
                                    oVarB = trainingPlanType.b();
                                } else {
                                    oVarB = null;
                                }
                                if (iM < 0) {
                                    i14 = 0;
                                } else {
                                    i14 = iM;
                                }
                                arrayList4.add(new ww1.e(trainingPlanId15, str2, i14, iH3, dateTimeO5, startDate12, oVarB));
                                it3 = it11;
                                str7 = str10;
                                i25 = 6;
                            }
                            str = str7;
                            if (cVar != null) {
                                l14 = new Long(cVar.f187755a);
                            } else if (bVar != null) {
                                l14 = new Long(bVar.f187755a);
                            } else {
                                l14 = null;
                            }
                            if (l14 != null) {
                                jLongValue = l14.longValue();
                                zf0.d dVar7 = aVar4.f160850c;
                                this.f160867n = b0Var;
                                this.f160854a = list;
                                this.f160855b = cVar;
                                this.f160856c = bVar;
                                this.f160857d = dVar;
                                this.f160858e = arrayList4;
                                this.f160861h = jLongValue;
                                this.f160862i = 0;
                                this.f160866m = 3;
                                objC = dVar7.c(jLongValue, this);
                                break;
                            } else {
                                list2 = arrayList4;
                                bVar2 = bVar;
                                cVar2 = cVar;
                                fy1.i.f73924a.getClass();
                                String strF3 = fy1.i.a.f();
                                gu1.b bVar15 = aVar4.f160848a;
                                this.f160867n = null;
                                this.f160854a = list;
                                this.f160855b = cVar2;
                                this.f160856c = bVar2;
                                this.f160857d = dVar;
                                this.f160858e = list2;
                                this.f160866m = 4;
                                objJ = f0.J(bVar15, new h(bVar15, strF3, null), this);
                                if (objJ != aVar3) {
                                    list3 = list;
                                    list4 = list2;
                                    v2Var2 = (v2) objJ;
                                    if (v2Var2 instanceof v2.b) {
                                        list5 = (List) ((v2.b) v2Var2).f47386a;
                                        gu1.b bVar16 = aVar4.f160848a;
                                        this.f160867n = null;
                                        this.f160854a = list3;
                                        this.f160855b = cVar2;
                                        this.f160856c = bVar2;
                                        this.f160857d = dVar;
                                        this.f160858e = list4;
                                        this.f160859f = list5;
                                        this.f160866m = 5;
                                        objA = bVar16.a(this);
                                        if (objA != aVar3) {
                                            ww1.b bVar17 = bVar2;
                                            dVar2 = dVar;
                                            cVar3 = cVar2;
                                            bVar3 = bVar17;
                                            list6 = list5;
                                            list7 = list4;
                                            v2Var3 = (v2) objA;
                                            if (v2Var3 instanceof v2.b) {
                                                dVar3 = (xw1.d) ((v2.b) v2Var3).f47386a;
                                                if (dVar3 != null) {
                                                    long athletePlanId3 = dVar3.getAthletePlanId();
                                                    vt1.a.C3360a c3360a3 = vt1.a.f180073b;
                                                    int workoutPlanId3 = (int) dVar3.getWorkoutPlanId();
                                                    c3360a3.getClass();
                                                    String strA3 = vt1.a.C3360a.a(workoutPlanId3);
                                                    strB = vt1.a.C3360a.b((int) dVar3.getWorkoutPlanId(), ((rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null)).b());
                                                    if (strB == null) {
                                                        str6 = str;
                                                    } else {
                                                        str6 = strB;
                                                    }
                                                    DateTime dateTimeNow3 = DateTime.now();
                                                    dateTimeNow3.getClass();
                                                    aVar = new ww1.a(athletePlanId3, strA3, str6, dVar3.j(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c, dateTimeNow3), dVar3.A(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c), dVar3.r(), dVar3.getAthleteRace());
                                                } else {
                                                    aVar = null;
                                                }
                                                if (list3 == null) {
                                                    it5 = list3.iterator();
                                                    int i215 = 0;
                                                    while (it5.hasNext()) {
                                                        if (!((m) it5.next()).n0()) {
                                                        }
                                                    }
                                                    i15 = i215;
                                                } else {
                                                    it5 = list3.iterator();
                                                    int i216 = 0;
                                                    while (it5.hasNext()) {
                                                        if (!((m) it5.next()).n0()) {
                                                        }
                                                    }
                                                    i15 = i216;
                                                }
                                                if (list3 == null) {
                                                    it6 = list3.iterator();
                                                    int i217 = 0;
                                                    while (it6.hasNext()) {
                                                        if (!((m) it6.next()).h0()) {
                                                        }
                                                    }
                                                    i16 = i217;
                                                } else {
                                                    it6 = list3.iterator();
                                                    int i218 = 0;
                                                    while (it6.hasNext()) {
                                                        if (!((m) it6.next()).h0()) {
                                                        }
                                                    }
                                                    i16 = i218;
                                                }
                                                if (list3 == null) {
                                                    it7 = list3.iterator();
                                                    i17 = 0;
                                                    while (it7.hasNext()) {
                                                        if (!((m) it7.next()).p0()) {
                                                        }
                                                    }
                                                } else {
                                                    it7 = list3.iterator();
                                                    i17 = 0;
                                                    while (it7.hasNext()) {
                                                        if (!((m) it7.next()).p0()) {
                                                        }
                                                    }
                                                }
                                                if (list3 == null) {
                                                    it8 = list3.iterator();
                                                    int i219 = 0;
                                                    while (it8.hasNext()) {
                                                        if (!((m) it8.next()).o0()) {
                                                        }
                                                    }
                                                    i18 = i219;
                                                } else {
                                                    it8 = list3.iterator();
                                                    int i2110 = 0;
                                                    while (it8.hasNext()) {
                                                        if (!((m) it8.next()).o0()) {
                                                        }
                                                    }
                                                    i18 = i2110;
                                                }
                                                gu1.b bVar18 = aVar4.f160848a;
                                                this.f160867n = null;
                                                this.f160854a = null;
                                                this.f160855b = cVar3;
                                                this.f160856c = bVar3;
                                                this.f160857d = dVar2;
                                                this.f160858e = list7;
                                                this.f160859f = list6;
                                                this.f160860g = aVar;
                                                this.f160862i = i15;
                                                this.f160863j = i16;
                                                this.f160864k = i17;
                                                this.f160865l = i18;
                                                this.f160866m = 6;
                                                objJ2 = f0.J(bVar18, new gu1.f(bVar18, null), this);
                                                if (objJ2 == aVar3) {
                                                    return aVar3;
                                                }
                                                cVar4 = cVar3;
                                                i19 = i17;
                                                list8 = list7;
                                                aVar2 = aVar;
                                                list9 = list6;
                                                list10 = list8;
                                                dVar4 = dVar2;
                                                bVar4 = bVar3;
                                                v2Var4 = (v2) objJ2;
                                                if (v2Var4 instanceof v2.b) {
                                                    int size3 = ((List) ((v2.b) v2Var4).f47386a).size() + i15 + i16 + i19 + i18;
                                                    p2 p2Var11 = aVar4.f160851d;
                                                    g3.a aVar7 = g3.f35298f;
                                                    e0 e0Var3 = new e0(list10, cVar4, aVar2, bVar4, dVar4, list9, size3);
                                                    aVar7.getClass();
                                                    g3 g3VarD3 = g3.a.d(e0Var3);
                                                    this.f160867n = null;
                                                    this.f160854a = null;
                                                    this.f160855b = null;
                                                    this.f160856c = null;
                                                    this.f160857d = null;
                                                    this.f160858e = null;
                                                    this.f160859f = null;
                                                    this.f160860g = null;
                                                    this.f160862i = i15;
                                                    this.f160863j = i16;
                                                    this.f160864k = i19;
                                                    this.f160865l = i18;
                                                    this.f160866m = 7;
                                                    p2Var11.k(null, g3VarD3);
                                                    if (Unit.INSTANCE == aVar3) {
                                                        return aVar3;
                                                    }
                                                } else {
                                                    if (v2Var4 instanceof v2.a) {
                                                        u0.r();
                                                        return null;
                                                    }
                                                    p2 p2Var12 = aVar4.f160851d;
                                                    g3 g3VarA8 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var4).f47383a, null, null, 13);
                                                    this.f160867n = null;
                                                    this.f160854a = null;
                                                    this.f160855b = null;
                                                    this.f160856c = null;
                                                    this.f160857d = null;
                                                    this.f160858e = null;
                                                    this.f160859f = null;
                                                    this.f160860g = null;
                                                    this.f160862i = i15;
                                                    this.f160863j = i16;
                                                    this.f160864k = i19;
                                                    this.f160865l = i18;
                                                    this.f160866m = 8;
                                                    p2Var12.k(null, g3VarA8);
                                                    if (Unit.INSTANCE == aVar3) {
                                                        return aVar3;
                                                    }
                                                }
                                            } else {
                                                if (!(v2Var3 instanceof v2.a)) {
                                                    u0.r();
                                                    return null;
                                                }
                                                p2 p2Var13 = aVar4.f160851d;
                                                g3 g3VarA9 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var3).f47383a, null, null, 13);
                                                this.f160867n = null;
                                                this.f160854a = null;
                                                this.f160855b = null;
                                                this.f160856c = null;
                                                this.f160857d = null;
                                                this.f160858e = null;
                                                this.f160859f = null;
                                                this.f160866m = 9;
                                                p2Var13.k(null, g3VarA9);
                                                if (Unit.INSTANCE == aVar3) {
                                                    return aVar3;
                                                }
                                            }
                                        }
                                    } else {
                                        if (v2Var2 instanceof v2.a) {
                                            u0.r();
                                            return null;
                                        }
                                        p2 p2Var14 = aVar4.f160851d;
                                        g3 g3VarA10 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var2).f47383a, null, null, 13);
                                        this.f160867n = null;
                                        this.f160854a = null;
                                        this.f160855b = null;
                                        this.f160856c = null;
                                        this.f160857d = null;
                                        this.f160858e = null;
                                        this.f160866m = 10;
                                        p2Var14.k(null, g3VarA10);
                                        if (Unit.INSTANCE == aVar3) {
                                            return aVar3;
                                        }
                                    }
                                }
                            }
                        } while (!((m) next).n0());
                        mVar = (m) next;
                        if (mVar != null) {
                            long trainingPlanId16 = mVar.getTrainingPlanId();
                            trainingPlanName4 = mVar.getTrainingPlanName();
                            if (trainingPlanName4 == null) {
                                str5 = "";
                            } else {
                                str5 = trainingPlanName4;
                            }
                            cVar = new ww1.c(trainingPlanId16, str5, mVar.m(), vw1.c.h(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c, mVar.getStartDate(), mVar.o()), mVar.o(), null, 32, null);
                        } else {
                            cVar = null;
                        }
                        listA3 = oVar2.a();
                        if (listA3 != null) {
                            listIterator = listA3.listIterator(listA3.size());
                            do {
                                if (listIterator.hasPrevious()) {
                                    mVarPrevious = listIterator.previous();
                                } else {
                                    mVarPrevious = null;
                                }
                                mVar4 = mVarPrevious;
                                if (mVar4 != null) {
                                    long trainingPlanId17 = mVar4.getTrainingPlanId();
                                    trainingPlanName3 = mVar4.getTrainingPlanName();
                                    if (trainingPlanName3 == null) {
                                        str4 = "";
                                    } else {
                                        str4 = trainingPlanName3;
                                    }
                                    int iM11 = mVar4.m();
                                    trainingPlanType3 = mVar4.getTrainingPlanType();
                                    if (trainingPlanType3 != null) {
                                        oVarB3 = trainingPlanType3.b();
                                    } else {
                                        oVarB3 = null;
                                    }
                                    DateTime startDate13 = mVar4.getStartDate();
                                    dateTimeO2 = mVar4.o();
                                    if (dateTimeO2 == null) {
                                        dateTimeO2 = DateTime.now();
                                    }
                                    bVar = new ww1.b(trainingPlanId17, str4, iM11, vw1.c.h(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c, startDate13, dateTimeO2), mVar4.o(), oVarB3, null, 64, null);
                                } else {
                                    bVar = null;
                                }
                            } while (!mVarPrevious.a0());
                            mVar4 = mVarPrevious;
                            if (mVar4 != null) {
                                long trainingPlanId18 = mVar4.getTrainingPlanId();
                                trainingPlanName3 = mVar4.getTrainingPlanName();
                                if (trainingPlanName3 == null) {
                                    str4 = "";
                                } else {
                                    str4 = trainingPlanName3;
                                }
                                int iM12 = mVar4.m();
                                trainingPlanType3 = mVar4.getTrainingPlanType();
                                if (trainingPlanType3 != null) {
                                    oVarB3 = trainingPlanType3.b();
                                } else {
                                    oVarB3 = null;
                                }
                                DateTime startDate14 = mVar4.getStartDate();
                                dateTimeO2 = mVar4.o();
                                if (dateTimeO2 == null) {
                                    dateTimeO2 = DateTime.now();
                                }
                                bVar = new ww1.b(trainingPlanId18, str4, iM12, vw1.c.h(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c, startDate14, dateTimeO2), mVar4.o(), oVarB3, null, 64, null);
                            } else {
                                bVar = null;
                            }
                        } else {
                            bVar = null;
                        }
                        listA4 = oVar2.a();
                        if (listA4 != null) {
                            it4 = listA4.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    next2 = it4.next();
                                    mVar3 = (m) next2;
                                    if (mVar3.p0()) {
                                    }
                                } else {
                                    next2 = null;
                                }
                            }
                            mVar2 = (m) next2;
                            if (mVar2 != null) {
                                long trainingPlanId19 = mVar2.getTrainingPlanId();
                                trainingPlanName2 = mVar2.getTrainingPlanName();
                                if (trainingPlanName2 == null) {
                                    str3 = "";
                                } else {
                                    str3 = trainingPlanName2;
                                }
                                int iM13 = mVar2.m();
                                trainingPlanType2 = mVar2.getTrainingPlanType();
                                if (trainingPlanType2 != null) {
                                    oVarB2 = trainingPlanType2.b();
                                } else {
                                    oVarB2 = null;
                                }
                                DateTime startDate15 = mVar2.getStartDate();
                                dateTimeO = mVar2.o();
                                if (dateTimeO == null) {
                                    dateTimeO = DateTime.now();
                                }
                                dVar = new ww1.d(trainingPlanId19, str3, iM13, vw1.c.h(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c, startDate15, dateTimeO), mVar2.o(), oi0.c.N(mVar2), mVar2.getStartDate(), oVarB2);
                            } else {
                                dVar = null;
                            }
                        } else {
                            dVar = null;
                        }
                        arrayList3 = new ArrayList();
                        while (r8.hasNext()) {
                            if (((m) obj4).o0()) {
                                arrayList3.add(obj4);
                            }
                        }
                        arrayList4 = new ArrayList(y.r(arrayList3, 10));
                        it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            m mVar8 = (m) it3.next();
                            mVar8.getClass();
                            long trainingPlanId110 = mVar8.getTrainingPlanId();
                            trainingPlanName = mVar8.getTrainingPlanName();
                            if (trainingPlanName == null) {
                                str2 = str7;
                            } else {
                                str2 = trainingPlanName;
                            }
                            DateTime startDate16 = mVar8.getStartDate();
                            iM = mVar8.m();
                            Iterator it12 = it3;
                            String str11 = str7;
                            int iH4 = vw1.c.h(((l) KoinJavaComponent.get$default(l.class, null, null, i25, null)).e1().f77271c, mVar8.getStartDate(), mVar8.o());
                            DateTime dateTimeO6 = mVar8.o();
                            trainingPlanType = mVar8.getTrainingPlanType();
                            if (trainingPlanType != null) {
                                oVarB = trainingPlanType.b();
                            } else {
                                oVarB = null;
                            }
                            if (iM < 0) {
                                i14 = 0;
                            } else {
                                i14 = iM;
                            }
                            arrayList4.add(new ww1.e(trainingPlanId110, str2, i14, iH4, dateTimeO6, startDate16, oVarB));
                            it3 = it12;
                            str7 = str11;
                            i25 = 6;
                        }
                        str = str7;
                        if (cVar != null) {
                            l14 = new Long(cVar.f187755a);
                        } else if (bVar != null) {
                            l14 = new Long(bVar.f187755a);
                        } else {
                            l14 = null;
                        }
                        if (l14 != null) {
                            jLongValue = l14.longValue();
                            zf0.d dVar8 = aVar4.f160850c;
                            this.f160867n = b0Var;
                            this.f160854a = list;
                            this.f160855b = cVar;
                            this.f160856c = bVar;
                            this.f160857d = dVar;
                            this.f160858e = arrayList4;
                            this.f160861h = jLongValue;
                            this.f160862i = 0;
                            this.f160866m = 3;
                            objC = dVar8.c(jLongValue, this);
                            break;
                        } else {
                            list2 = arrayList4;
                            bVar2 = bVar;
                            cVar2 = cVar;
                            fy1.i.f73924a.getClass();
                            String strF4 = fy1.i.a.f();
                            gu1.b bVar19 = aVar4.f160848a;
                            this.f160867n = null;
                            this.f160854a = list;
                            this.f160855b = cVar2;
                            this.f160856c = bVar2;
                            this.f160857d = dVar;
                            this.f160858e = list2;
                            this.f160866m = 4;
                            objJ = f0.J(bVar19, new h(bVar19, strF4, null), this);
                            if (objJ != aVar3) {
                                list3 = list;
                                list4 = list2;
                                v2Var2 = (v2) objJ;
                                if (v2Var2 instanceof v2.b) {
                                    list5 = (List) ((v2.b) v2Var2).f47386a;
                                    gu1.b bVar110 = aVar4.f160848a;
                                    this.f160867n = null;
                                    this.f160854a = list3;
                                    this.f160855b = cVar2;
                                    this.f160856c = bVar2;
                                    this.f160857d = dVar;
                                    this.f160858e = list4;
                                    this.f160859f = list5;
                                    this.f160866m = 5;
                                    objA = bVar110.a(this);
                                    if (objA != aVar3) {
                                        ww1.b bVar111 = bVar2;
                                        dVar2 = dVar;
                                        cVar3 = cVar2;
                                        bVar3 = bVar111;
                                        list6 = list5;
                                        list7 = list4;
                                        v2Var3 = (v2) objA;
                                        if (v2Var3 instanceof v2.b) {
                                            dVar3 = (xw1.d) ((v2.b) v2Var3).f47386a;
                                            if (dVar3 != null) {
                                                long athletePlanId4 = dVar3.getAthletePlanId();
                                                vt1.a.C3360a c3360a4 = vt1.a.f180073b;
                                                int workoutPlanId4 = (int) dVar3.getWorkoutPlanId();
                                                c3360a4.getClass();
                                                String strA4 = vt1.a.C3360a.a(workoutPlanId4);
                                                strB = vt1.a.C3360a.b((int) dVar3.getWorkoutPlanId(), ((rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null)).b());
                                                if (strB == null) {
                                                    str6 = str;
                                                } else {
                                                    str6 = strB;
                                                }
                                                DateTime dateTimeNow4 = DateTime.now();
                                                dateTimeNow4.getClass();
                                                aVar = new ww1.a(athletePlanId4, strA4, str6, dVar3.j(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c, dateTimeNow4), dVar3.A(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c), dVar3.r(), dVar3.getAthleteRace());
                                            } else {
                                                aVar = null;
                                            }
                                            if (list3 == null) {
                                                it5 = list3.iterator();
                                                int i2111 = 0;
                                                while (it5.hasNext()) {
                                                    if (!((m) it5.next()).n0()) {
                                                    }
                                                }
                                                i15 = i2111;
                                            } else {
                                                it5 = list3.iterator();
                                                int i2112 = 0;
                                                while (it5.hasNext()) {
                                                    if (!((m) it5.next()).n0()) {
                                                    }
                                                }
                                                i15 = i2112;
                                            }
                                            if (list3 == null) {
                                                it6 = list3.iterator();
                                                int i2113 = 0;
                                                while (it6.hasNext()) {
                                                    if (!((m) it6.next()).h0()) {
                                                    }
                                                }
                                                i16 = i2113;
                                            } else {
                                                it6 = list3.iterator();
                                                int i2114 = 0;
                                                while (it6.hasNext()) {
                                                    if (!((m) it6.next()).h0()) {
                                                    }
                                                }
                                                i16 = i2114;
                                            }
                                            if (list3 == null) {
                                                it7 = list3.iterator();
                                                i17 = 0;
                                                while (it7.hasNext()) {
                                                    if (!((m) it7.next()).p0()) {
                                                    }
                                                }
                                            } else {
                                                it7 = list3.iterator();
                                                i17 = 0;
                                                while (it7.hasNext()) {
                                                    if (!((m) it7.next()).p0()) {
                                                    }
                                                }
                                            }
                                            if (list3 == null) {
                                                it8 = list3.iterator();
                                                int i2115 = 0;
                                                while (it8.hasNext()) {
                                                    if (!((m) it8.next()).o0()) {
                                                    }
                                                }
                                                i18 = i2115;
                                            } else {
                                                it8 = list3.iterator();
                                                int i2116 = 0;
                                                while (it8.hasNext()) {
                                                    if (!((m) it8.next()).o0()) {
                                                    }
                                                }
                                                i18 = i2116;
                                            }
                                            gu1.b bVar112 = aVar4.f160848a;
                                            this.f160867n = null;
                                            this.f160854a = null;
                                            this.f160855b = cVar3;
                                            this.f160856c = bVar3;
                                            this.f160857d = dVar2;
                                            this.f160858e = list7;
                                            this.f160859f = list6;
                                            this.f160860g = aVar;
                                            this.f160862i = i15;
                                            this.f160863j = i16;
                                            this.f160864k = i17;
                                            this.f160865l = i18;
                                            this.f160866m = 6;
                                            objJ2 = f0.J(bVar112, new gu1.f(bVar112, null), this);
                                            if (objJ2 == aVar3) {
                                                return aVar3;
                                            }
                                            cVar4 = cVar3;
                                            i19 = i17;
                                            list8 = list7;
                                            aVar2 = aVar;
                                            list9 = list6;
                                            list10 = list8;
                                            dVar4 = dVar2;
                                            bVar4 = bVar3;
                                            v2Var4 = (v2) objJ2;
                                            if (v2Var4 instanceof v2.b) {
                                                int size4 = ((List) ((v2.b) v2Var4).f47386a).size() + i15 + i16 + i19 + i18;
                                                p2 p2Var15 = aVar4.f160851d;
                                                g3.a aVar8 = g3.f35298f;
                                                e0 e0Var4 = new e0(list10, cVar4, aVar2, bVar4, dVar4, list9, size4);
                                                aVar8.getClass();
                                                g3 g3VarD4 = g3.a.d(e0Var4);
                                                this.f160867n = null;
                                                this.f160854a = null;
                                                this.f160855b = null;
                                                this.f160856c = null;
                                                this.f160857d = null;
                                                this.f160858e = null;
                                                this.f160859f = null;
                                                this.f160860g = null;
                                                this.f160862i = i15;
                                                this.f160863j = i16;
                                                this.f160864k = i19;
                                                this.f160865l = i18;
                                                this.f160866m = 7;
                                                p2Var15.k(null, g3VarD4);
                                                if (Unit.INSTANCE == aVar3) {
                                                    return aVar3;
                                                }
                                            } else {
                                                if (v2Var4 instanceof v2.a) {
                                                    u0.r();
                                                    return null;
                                                }
                                                p2 p2Var16 = aVar4.f160851d;
                                                g3 g3VarA11 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var4).f47383a, null, null, 13);
                                                this.f160867n = null;
                                                this.f160854a = null;
                                                this.f160855b = null;
                                                this.f160856c = null;
                                                this.f160857d = null;
                                                this.f160858e = null;
                                                this.f160859f = null;
                                                this.f160860g = null;
                                                this.f160862i = i15;
                                                this.f160863j = i16;
                                                this.f160864k = i19;
                                                this.f160865l = i18;
                                                this.f160866m = 8;
                                                p2Var16.k(null, g3VarA11);
                                                if (Unit.INSTANCE == aVar3) {
                                                    return aVar3;
                                                }
                                            }
                                        } else {
                                            if (!(v2Var3 instanceof v2.a)) {
                                                u0.r();
                                                return null;
                                            }
                                            p2 p2Var17 = aVar4.f160851d;
                                            g3 g3VarA12 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var3).f47383a, null, null, 13);
                                            this.f160867n = null;
                                            this.f160854a = null;
                                            this.f160855b = null;
                                            this.f160856c = null;
                                            this.f160857d = null;
                                            this.f160858e = null;
                                            this.f160859f = null;
                                            this.f160866m = 9;
                                            p2Var17.k(null, g3VarA12);
                                            if (Unit.INSTANCE == aVar3) {
                                                return aVar3;
                                            }
                                        }
                                    }
                                } else {
                                    if (v2Var2 instanceof v2.a) {
                                        u0.r();
                                        return null;
                                    }
                                    p2 p2Var18 = aVar4.f160851d;
                                    g3 g3VarA13 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var2).f47383a, null, null, 13);
                                    this.f160867n = null;
                                    this.f160854a = null;
                                    this.f160855b = null;
                                    this.f160856c = null;
                                    this.f160857d = null;
                                    this.f160858e = null;
                                    this.f160866m = 10;
                                    p2Var18.k(null, g3VarA13);
                                    if (Unit.INSTANCE == aVar3) {
                                        return aVar3;
                                    }
                                }
                            }
                        }
                    } else {
                        if (!(v2Var instanceof v2.a)) {
                            u0.r();
                            return null;
                        }
                        p2 p2Var19 = aVar4.f160851d;
                        g3 g3VarA14 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                        this.f160867n = null;
                        this.f160866m = 11;
                        p2Var19.k(null, g3VarA14);
                        if (Unit.INSTANCE == aVar3) {
                            return aVar3;
                        }
                    }
                    return Unit.INSTANCE;
                }
                list = arrayList4;
                return aVar3;
            case 2:
                r.b(obj);
                objB = obj;
                v2Var = (v2) objB;
                if (v2Var instanceof v2.b) {
                    tw1.o oVar3 = (tw1.o) ((v2.b) v2Var).f47386a;
                    listA = oVar3.a();
                    if (listA != null) {
                        arrayList = new ArrayList();
                        while (r11.hasNext()) {
                            if (((m) obj2).Z()) {
                                arrayList.add(obj2);
                            }
                        }
                    } else {
                        arrayList = 0;
                    }
                    if (arrayList == 0) {
                        arrayList = j0.f134944a;
                    }
                    listA2 = oVar3.a();
                    if (listA2 != null) {
                        arrayList2 = new ArrayList();
                        while (r11.hasNext()) {
                            if (((m) obj3).e0()) {
                                arrayList2.add(obj3);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                    if (arrayList2 == null) {
                        list = j0.f134944a;
                    } else {
                        list = arrayList2;
                    }
                    Iterable iterable3 = (Iterable) arrayList;
                    it = iterable3.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                        }
                        mVar = (m) next;
                        if (mVar != null) {
                            long trainingPlanId111 = mVar.getTrainingPlanId();
                            trainingPlanName4 = mVar.getTrainingPlanName();
                            if (trainingPlanName4 == null) {
                                str5 = "";
                            } else {
                                str5 = trainingPlanName4;
                            }
                            cVar = new ww1.c(trainingPlanId111, str5, mVar.m(), vw1.c.h(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c, mVar.getStartDate(), mVar.o()), mVar.o(), null, 32, null);
                        } else {
                            cVar = null;
                        }
                        listA3 = oVar3.a();
                        if (listA3 != null) {
                            listIterator = listA3.listIterator(listA3.size());
                            do {
                                if (listIterator.hasPrevious()) {
                                    mVarPrevious = listIterator.previous();
                                } else {
                                    mVarPrevious = null;
                                }
                                mVar4 = mVarPrevious;
                                if (mVar4 != null) {
                                    long trainingPlanId112 = mVar4.getTrainingPlanId();
                                    trainingPlanName3 = mVar4.getTrainingPlanName();
                                    if (trainingPlanName3 == null) {
                                        str4 = "";
                                    } else {
                                        str4 = trainingPlanName3;
                                    }
                                    int iM14 = mVar4.m();
                                    trainingPlanType3 = mVar4.getTrainingPlanType();
                                    if (trainingPlanType3 != null) {
                                        oVarB3 = trainingPlanType3.b();
                                    } else {
                                        oVarB3 = null;
                                    }
                                    DateTime startDate17 = mVar4.getStartDate();
                                    dateTimeO2 = mVar4.o();
                                    if (dateTimeO2 == null) {
                                        dateTimeO2 = DateTime.now();
                                    }
                                    bVar = new ww1.b(trainingPlanId112, str4, iM14, vw1.c.h(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c, startDate17, dateTimeO2), mVar4.o(), oVarB3, null, 64, null);
                                } else {
                                    bVar = null;
                                }
                            } while (!mVarPrevious.a0());
                            mVar4 = mVarPrevious;
                            if (mVar4 != null) {
                                long trainingPlanId113 = mVar4.getTrainingPlanId();
                                trainingPlanName3 = mVar4.getTrainingPlanName();
                                if (trainingPlanName3 == null) {
                                    str4 = "";
                                } else {
                                    str4 = trainingPlanName3;
                                }
                                int iM15 = mVar4.m();
                                trainingPlanType3 = mVar4.getTrainingPlanType();
                                if (trainingPlanType3 != null) {
                                    oVarB3 = trainingPlanType3.b();
                                } else {
                                    oVarB3 = null;
                                }
                                DateTime startDate18 = mVar4.getStartDate();
                                dateTimeO2 = mVar4.o();
                                if (dateTimeO2 == null) {
                                    dateTimeO2 = DateTime.now();
                                }
                                bVar = new ww1.b(trainingPlanId113, str4, iM15, vw1.c.h(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c, startDate18, dateTimeO2), mVar4.o(), oVarB3, null, 64, null);
                            } else {
                                bVar = null;
                            }
                        } else {
                            bVar = null;
                        }
                        listA4 = oVar3.a();
                        if (listA4 != null) {
                            it4 = listA4.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    next2 = it4.next();
                                    mVar3 = (m) next2;
                                    if (mVar3.p0()) {
                                    }
                                } else {
                                    next2 = null;
                                }
                            }
                            mVar2 = (m) next2;
                            if (mVar2 != null) {
                                long trainingPlanId114 = mVar2.getTrainingPlanId();
                                trainingPlanName2 = mVar2.getTrainingPlanName();
                                if (trainingPlanName2 == null) {
                                    str3 = "";
                                } else {
                                    str3 = trainingPlanName2;
                                }
                                int iM16 = mVar2.m();
                                trainingPlanType2 = mVar2.getTrainingPlanType();
                                if (trainingPlanType2 != null) {
                                    oVarB2 = trainingPlanType2.b();
                                } else {
                                    oVarB2 = null;
                                }
                                DateTime startDate19 = mVar2.getStartDate();
                                dateTimeO = mVar2.o();
                                if (dateTimeO == null) {
                                    dateTimeO = DateTime.now();
                                }
                                dVar = new ww1.d(trainingPlanId114, str3, iM16, vw1.c.h(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c, startDate19, dateTimeO), mVar2.o(), oi0.c.N(mVar2), mVar2.getStartDate(), oVarB2);
                            } else {
                                dVar = null;
                            }
                        } else {
                            dVar = null;
                        }
                        arrayList3 = new ArrayList();
                        while (r8.hasNext()) {
                            if (((m) obj4).o0()) {
                                arrayList3.add(obj4);
                            }
                        }
                        arrayList4 = new ArrayList(y.r(arrayList3, 10));
                        it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            m mVar9 = (m) it3.next();
                            mVar9.getClass();
                            long trainingPlanId115 = mVar9.getTrainingPlanId();
                            trainingPlanName = mVar9.getTrainingPlanName();
                            if (trainingPlanName == null) {
                                str2 = str7;
                            } else {
                                str2 = trainingPlanName;
                            }
                            DateTime startDate110 = mVar9.getStartDate();
                            iM = mVar9.m();
                            Iterator it13 = it3;
                            String str12 = str7;
                            int iH5 = vw1.c.h(((l) KoinJavaComponent.get$default(l.class, null, null, i25, null)).e1().f77271c, mVar9.getStartDate(), mVar9.o());
                            DateTime dateTimeO7 = mVar9.o();
                            trainingPlanType = mVar9.getTrainingPlanType();
                            if (trainingPlanType != null) {
                                oVarB = trainingPlanType.b();
                            } else {
                                oVarB = null;
                            }
                            if (iM < 0) {
                                i14 = 0;
                            } else {
                                i14 = iM;
                            }
                            arrayList4.add(new ww1.e(trainingPlanId115, str2, i14, iH5, dateTimeO7, startDate110, oVarB));
                            it3 = it13;
                            str7 = str12;
                            i25 = 6;
                        }
                        str = str7;
                        if (cVar != null) {
                            l14 = new Long(cVar.f187755a);
                        } else if (bVar != null) {
                            l14 = new Long(bVar.f187755a);
                        } else {
                            l14 = null;
                        }
                        if (l14 != null) {
                            jLongValue = l14.longValue();
                            zf0.d dVar9 = aVar4.f160850c;
                            this.f160867n = b0Var;
                            this.f160854a = list;
                            this.f160855b = cVar;
                            this.f160856c = bVar;
                            this.f160857d = dVar;
                            this.f160858e = arrayList4;
                            this.f160861h = jLongValue;
                            this.f160862i = 0;
                            this.f160866m = 3;
                            objC = dVar9.c(jLongValue, this);
                            break;
                        } else {
                            list2 = arrayList4;
                            bVar2 = bVar;
                            cVar2 = cVar;
                            fy1.i.f73924a.getClass();
                            String strF5 = fy1.i.a.f();
                            gu1.b bVar113 = aVar4.f160848a;
                            this.f160867n = null;
                            this.f160854a = list;
                            this.f160855b = cVar2;
                            this.f160856c = bVar2;
                            this.f160857d = dVar;
                            this.f160858e = list2;
                            this.f160866m = 4;
                            objJ = f0.J(bVar113, new h(bVar113, strF5, null), this);
                            if (objJ != aVar3) {
                                list3 = list;
                                list4 = list2;
                                v2Var2 = (v2) objJ;
                                if (v2Var2 instanceof v2.b) {
                                    list5 = (List) ((v2.b) v2Var2).f47386a;
                                    gu1.b bVar114 = aVar4.f160848a;
                                    this.f160867n = null;
                                    this.f160854a = list3;
                                    this.f160855b = cVar2;
                                    this.f160856c = bVar2;
                                    this.f160857d = dVar;
                                    this.f160858e = list4;
                                    this.f160859f = list5;
                                    this.f160866m = 5;
                                    objA = bVar114.a(this);
                                    if (objA != aVar3) {
                                        ww1.b bVar115 = bVar2;
                                        dVar2 = dVar;
                                        cVar3 = cVar2;
                                        bVar3 = bVar115;
                                        list6 = list5;
                                        list7 = list4;
                                        v2Var3 = (v2) objA;
                                        if (v2Var3 instanceof v2.b) {
                                            dVar3 = (xw1.d) ((v2.b) v2Var3).f47386a;
                                            if (dVar3 != null) {
                                                long athletePlanId5 = dVar3.getAthletePlanId();
                                                vt1.a.C3360a c3360a5 = vt1.a.f180073b;
                                                int workoutPlanId5 = (int) dVar3.getWorkoutPlanId();
                                                c3360a5.getClass();
                                                String strA5 = vt1.a.C3360a.a(workoutPlanId5);
                                                strB = vt1.a.C3360a.b((int) dVar3.getWorkoutPlanId(), ((rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null)).b());
                                                if (strB == null) {
                                                    str6 = str;
                                                } else {
                                                    str6 = strB;
                                                }
                                                DateTime dateTimeNow5 = DateTime.now();
                                                dateTimeNow5.getClass();
                                                aVar = new ww1.a(athletePlanId5, strA5, str6, dVar3.j(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c, dateTimeNow5), dVar3.A(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c), dVar3.r(), dVar3.getAthleteRace());
                                            } else {
                                                aVar = null;
                                            }
                                            if (list3 == null) {
                                                it5 = list3.iterator();
                                                int i2117 = 0;
                                                while (it5.hasNext()) {
                                                    if (!((m) it5.next()).n0()) {
                                                    }
                                                }
                                                i15 = i2117;
                                            } else {
                                                it5 = list3.iterator();
                                                int i2118 = 0;
                                                while (it5.hasNext()) {
                                                    if (!((m) it5.next()).n0()) {
                                                    }
                                                }
                                                i15 = i2118;
                                            }
                                            if (list3 == null) {
                                                it6 = list3.iterator();
                                                int i2119 = 0;
                                                while (it6.hasNext()) {
                                                    if (!((m) it6.next()).h0()) {
                                                    }
                                                }
                                                i16 = i2119;
                                            } else {
                                                it6 = list3.iterator();
                                                int i21110 = 0;
                                                while (it6.hasNext()) {
                                                    if (!((m) it6.next()).h0()) {
                                                    }
                                                }
                                                i16 = i21110;
                                            }
                                            if (list3 == null) {
                                                it7 = list3.iterator();
                                                i17 = 0;
                                                while (it7.hasNext()) {
                                                    if (!((m) it7.next()).p0()) {
                                                    }
                                                }
                                            } else {
                                                it7 = list3.iterator();
                                                i17 = 0;
                                                while (it7.hasNext()) {
                                                    if (!((m) it7.next()).p0()) {
                                                    }
                                                }
                                            }
                                            if (list3 == null) {
                                                it8 = list3.iterator();
                                                int i21111 = 0;
                                                while (it8.hasNext()) {
                                                    if (!((m) it8.next()).o0()) {
                                                    }
                                                }
                                                i18 = i21111;
                                            } else {
                                                it8 = list3.iterator();
                                                int i21112 = 0;
                                                while (it8.hasNext()) {
                                                    if (!((m) it8.next()).o0()) {
                                                    }
                                                }
                                                i18 = i21112;
                                            }
                                            gu1.b bVar116 = aVar4.f160848a;
                                            this.f160867n = null;
                                            this.f160854a = null;
                                            this.f160855b = cVar3;
                                            this.f160856c = bVar3;
                                            this.f160857d = dVar2;
                                            this.f160858e = list7;
                                            this.f160859f = list6;
                                            this.f160860g = aVar;
                                            this.f160862i = i15;
                                            this.f160863j = i16;
                                            this.f160864k = i17;
                                            this.f160865l = i18;
                                            this.f160866m = 6;
                                            objJ2 = f0.J(bVar116, new gu1.f(bVar116, null), this);
                                            if (objJ2 == aVar3) {
                                                return aVar3;
                                            }
                                            cVar4 = cVar3;
                                            i19 = i17;
                                            list8 = list7;
                                            aVar2 = aVar;
                                            list9 = list6;
                                            list10 = list8;
                                            dVar4 = dVar2;
                                            bVar4 = bVar3;
                                            v2Var4 = (v2) objJ2;
                                            if (v2Var4 instanceof v2.b) {
                                                int size5 = ((List) ((v2.b) v2Var4).f47386a).size() + i15 + i16 + i19 + i18;
                                                p2 p2Var110 = aVar4.f160851d;
                                                g3.a aVar9 = g3.f35298f;
                                                e0 e0Var5 = new e0(list10, cVar4, aVar2, bVar4, dVar4, list9, size5);
                                                aVar9.getClass();
                                                g3 g3VarD5 = g3.a.d(e0Var5);
                                                this.f160867n = null;
                                                this.f160854a = null;
                                                this.f160855b = null;
                                                this.f160856c = null;
                                                this.f160857d = null;
                                                this.f160858e = null;
                                                this.f160859f = null;
                                                this.f160860g = null;
                                                this.f160862i = i15;
                                                this.f160863j = i16;
                                                this.f160864k = i19;
                                                this.f160865l = i18;
                                                this.f160866m = 7;
                                                p2Var110.k(null, g3VarD5);
                                                if (Unit.INSTANCE == aVar3) {
                                                    return aVar3;
                                                }
                                            } else {
                                                if (v2Var4 instanceof v2.a) {
                                                    u0.r();
                                                    return null;
                                                }
                                                p2 p2Var111 = aVar4.f160851d;
                                                g3 g3VarA15 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var4).f47383a, null, null, 13);
                                                this.f160867n = null;
                                                this.f160854a = null;
                                                this.f160855b = null;
                                                this.f160856c = null;
                                                this.f160857d = null;
                                                this.f160858e = null;
                                                this.f160859f = null;
                                                this.f160860g = null;
                                                this.f160862i = i15;
                                                this.f160863j = i16;
                                                this.f160864k = i19;
                                                this.f160865l = i18;
                                                this.f160866m = 8;
                                                p2Var111.k(null, g3VarA15);
                                                if (Unit.INSTANCE == aVar3) {
                                                    return aVar3;
                                                }
                                            }
                                        } else {
                                            if (!(v2Var3 instanceof v2.a)) {
                                                u0.r();
                                                return null;
                                            }
                                            p2 p2Var112 = aVar4.f160851d;
                                            g3 g3VarA16 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var3).f47383a, null, null, 13);
                                            this.f160867n = null;
                                            this.f160854a = null;
                                            this.f160855b = null;
                                            this.f160856c = null;
                                            this.f160857d = null;
                                            this.f160858e = null;
                                            this.f160859f = null;
                                            this.f160866m = 9;
                                            p2Var112.k(null, g3VarA16);
                                            if (Unit.INSTANCE == aVar3) {
                                                return aVar3;
                                            }
                                        }
                                    }
                                } else {
                                    if (v2Var2 instanceof v2.a) {
                                        u0.r();
                                        return null;
                                    }
                                    p2 p2Var113 = aVar4.f160851d;
                                    g3 g3VarA17 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var2).f47383a, null, null, 13);
                                    this.f160867n = null;
                                    this.f160854a = null;
                                    this.f160855b = null;
                                    this.f160856c = null;
                                    this.f160857d = null;
                                    this.f160858e = null;
                                    this.f160866m = 10;
                                    p2Var113.k(null, g3VarA17);
                                    if (Unit.INSTANCE == aVar3) {
                                        return aVar3;
                                    }
                                }
                            }
                        }
                        list = arrayList4;
                        return aVar3;
                    } while (!((m) next).n0());
                    mVar = (m) next;
                    if (mVar != null) {
                        long trainingPlanId116 = mVar.getTrainingPlanId();
                        trainingPlanName4 = mVar.getTrainingPlanName();
                        if (trainingPlanName4 == null) {
                            str5 = "";
                        } else {
                            str5 = trainingPlanName4;
                        }
                        cVar = new ww1.c(trainingPlanId116, str5, mVar.m(), vw1.c.h(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c, mVar.getStartDate(), mVar.o()), mVar.o(), null, 32, null);
                    } else {
                        cVar = null;
                    }
                    listA3 = oVar3.a();
                    if (listA3 != null) {
                        listIterator = listA3.listIterator(listA3.size());
                        do {
                            if (listIterator.hasPrevious()) {
                                mVarPrevious = listIterator.previous();
                            } else {
                                mVarPrevious = null;
                            }
                            mVar4 = mVarPrevious;
                            if (mVar4 != null) {
                                long trainingPlanId117 = mVar4.getTrainingPlanId();
                                trainingPlanName3 = mVar4.getTrainingPlanName();
                                if (trainingPlanName3 == null) {
                                    str4 = "";
                                } else {
                                    str4 = trainingPlanName3;
                                }
                                int iM17 = mVar4.m();
                                trainingPlanType3 = mVar4.getTrainingPlanType();
                                if (trainingPlanType3 != null) {
                                    oVarB3 = trainingPlanType3.b();
                                } else {
                                    oVarB3 = null;
                                }
                                DateTime startDate111 = mVar4.getStartDate();
                                dateTimeO2 = mVar4.o();
                                if (dateTimeO2 == null) {
                                    dateTimeO2 = DateTime.now();
                                }
                                bVar = new ww1.b(trainingPlanId117, str4, iM17, vw1.c.h(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c, startDate111, dateTimeO2), mVar4.o(), oVarB3, null, 64, null);
                            } else {
                                bVar = null;
                            }
                        } while (!mVarPrevious.a0());
                        mVar4 = mVarPrevious;
                        if (mVar4 != null) {
                            long trainingPlanId118 = mVar4.getTrainingPlanId();
                            trainingPlanName3 = mVar4.getTrainingPlanName();
                            if (trainingPlanName3 == null) {
                                str4 = "";
                            } else {
                                str4 = trainingPlanName3;
                            }
                            int iM18 = mVar4.m();
                            trainingPlanType3 = mVar4.getTrainingPlanType();
                            if (trainingPlanType3 != null) {
                                oVarB3 = trainingPlanType3.b();
                            } else {
                                oVarB3 = null;
                            }
                            DateTime startDate112 = mVar4.getStartDate();
                            dateTimeO2 = mVar4.o();
                            if (dateTimeO2 == null) {
                                dateTimeO2 = DateTime.now();
                            }
                            bVar = new ww1.b(trainingPlanId118, str4, iM18, vw1.c.h(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c, startDate112, dateTimeO2), mVar4.o(), oVarB3, null, 64, null);
                        } else {
                            bVar = null;
                        }
                    } else {
                        bVar = null;
                    }
                    listA4 = oVar3.a();
                    if (listA4 != null) {
                        it4 = listA4.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                next2 = it4.next();
                                mVar3 = (m) next2;
                                if (mVar3.p0()) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        mVar2 = (m) next2;
                        if (mVar2 != null) {
                            long trainingPlanId119 = mVar2.getTrainingPlanId();
                            trainingPlanName2 = mVar2.getTrainingPlanName();
                            if (trainingPlanName2 == null) {
                                str3 = "";
                            } else {
                                str3 = trainingPlanName2;
                            }
                            int iM19 = mVar2.m();
                            trainingPlanType2 = mVar2.getTrainingPlanType();
                            if (trainingPlanType2 != null) {
                                oVarB2 = trainingPlanType2.b();
                            } else {
                                oVarB2 = null;
                            }
                            DateTime startDate113 = mVar2.getStartDate();
                            dateTimeO = mVar2.o();
                            if (dateTimeO == null) {
                                dateTimeO = DateTime.now();
                            }
                            dVar = new ww1.d(trainingPlanId119, str3, iM19, vw1.c.h(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c, startDate113, dateTimeO), mVar2.o(), oi0.c.N(mVar2), mVar2.getStartDate(), oVarB2);
                        } else {
                            dVar = null;
                        }
                    } else {
                        dVar = null;
                    }
                    arrayList3 = new ArrayList();
                    while (r8.hasNext()) {
                        if (((m) obj4).o0()) {
                            arrayList3.add(obj4);
                        }
                    }
                    arrayList4 = new ArrayList(y.r(arrayList3, 10));
                    it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        m mVar10 = (m) it3.next();
                        mVar10.getClass();
                        long trainingPlanId1110 = mVar10.getTrainingPlanId();
                        trainingPlanName = mVar10.getTrainingPlanName();
                        if (trainingPlanName == null) {
                            str2 = str7;
                        } else {
                            str2 = trainingPlanName;
                        }
                        DateTime startDate114 = mVar10.getStartDate();
                        iM = mVar10.m();
                        Iterator it14 = it3;
                        String str13 = str7;
                        int iH6 = vw1.c.h(((l) KoinJavaComponent.get$default(l.class, null, null, i25, null)).e1().f77271c, mVar10.getStartDate(), mVar10.o());
                        DateTime dateTimeO8 = mVar10.o();
                        trainingPlanType = mVar10.getTrainingPlanType();
                        if (trainingPlanType != null) {
                            oVarB = trainingPlanType.b();
                        } else {
                            oVarB = null;
                        }
                        if (iM < 0) {
                            i14 = 0;
                        } else {
                            i14 = iM;
                        }
                        arrayList4.add(new ww1.e(trainingPlanId1110, str2, i14, iH6, dateTimeO8, startDate114, oVarB));
                        it3 = it14;
                        str7 = str13;
                        i25 = 6;
                    }
                    str = str7;
                    if (cVar != null) {
                        l14 = new Long(cVar.f187755a);
                    } else if (bVar != null) {
                        l14 = new Long(bVar.f187755a);
                    } else {
                        l14 = null;
                    }
                    if (l14 != null) {
                        jLongValue = l14.longValue();
                        zf0.d dVar10 = aVar4.f160850c;
                        this.f160867n = b0Var;
                        this.f160854a = list;
                        this.f160855b = cVar;
                        this.f160856c = bVar;
                        this.f160857d = dVar;
                        this.f160858e = arrayList4;
                        this.f160861h = jLongValue;
                        this.f160862i = 0;
                        this.f160866m = 3;
                        objC = dVar10.c(jLongValue, this);
                        break;
                    } else {
                        list2 = arrayList4;
                        bVar2 = bVar;
                        cVar2 = cVar;
                        fy1.i.f73924a.getClass();
                        String strF6 = fy1.i.a.f();
                        gu1.b bVar117 = aVar4.f160848a;
                        this.f160867n = null;
                        this.f160854a = list;
                        this.f160855b = cVar2;
                        this.f160856c = bVar2;
                        this.f160857d = dVar;
                        this.f160858e = list2;
                        this.f160866m = 4;
                        objJ = f0.J(bVar117, new h(bVar117, strF6, null), this);
                        if (objJ != aVar3) {
                            list3 = list;
                            list4 = list2;
                            v2Var2 = (v2) objJ;
                            if (v2Var2 instanceof v2.b) {
                                list5 = (List) ((v2.b) v2Var2).f47386a;
                                gu1.b bVar118 = aVar4.f160848a;
                                this.f160867n = null;
                                this.f160854a = list3;
                                this.f160855b = cVar2;
                                this.f160856c = bVar2;
                                this.f160857d = dVar;
                                this.f160858e = list4;
                                this.f160859f = list5;
                                this.f160866m = 5;
                                objA = bVar118.a(this);
                                if (objA != aVar3) {
                                    ww1.b bVar119 = bVar2;
                                    dVar2 = dVar;
                                    cVar3 = cVar2;
                                    bVar3 = bVar119;
                                    list6 = list5;
                                    list7 = list4;
                                    v2Var3 = (v2) objA;
                                    if (v2Var3 instanceof v2.b) {
                                        dVar3 = (xw1.d) ((v2.b) v2Var3).f47386a;
                                        if (dVar3 != null) {
                                            long athletePlanId6 = dVar3.getAthletePlanId();
                                            vt1.a.C3360a c3360a6 = vt1.a.f180073b;
                                            int workoutPlanId6 = (int) dVar3.getWorkoutPlanId();
                                            c3360a6.getClass();
                                            String strA6 = vt1.a.C3360a.a(workoutPlanId6);
                                            strB = vt1.a.C3360a.b((int) dVar3.getWorkoutPlanId(), ((rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null)).b());
                                            if (strB == null) {
                                                str6 = str;
                                            } else {
                                                str6 = strB;
                                            }
                                            DateTime dateTimeNow6 = DateTime.now();
                                            dateTimeNow6.getClass();
                                            aVar = new ww1.a(athletePlanId6, strA6, str6, dVar3.j(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c, dateTimeNow6), dVar3.A(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c), dVar3.r(), dVar3.getAthleteRace());
                                        } else {
                                            aVar = null;
                                        }
                                        if (list3 == null) {
                                            it5 = list3.iterator();
                                            int i21113 = 0;
                                            while (it5.hasNext()) {
                                                if (!((m) it5.next()).n0()) {
                                                }
                                            }
                                            i15 = i21113;
                                        } else {
                                            it5 = list3.iterator();
                                            int i21114 = 0;
                                            while (it5.hasNext()) {
                                                if (!((m) it5.next()).n0()) {
                                                }
                                            }
                                            i15 = i21114;
                                        }
                                        if (list3 == null) {
                                            it6 = list3.iterator();
                                            int i21115 = 0;
                                            while (it6.hasNext()) {
                                                if (!((m) it6.next()).h0()) {
                                                }
                                            }
                                            i16 = i21115;
                                        } else {
                                            it6 = list3.iterator();
                                            int i21116 = 0;
                                            while (it6.hasNext()) {
                                                if (!((m) it6.next()).h0()) {
                                                }
                                            }
                                            i16 = i21116;
                                        }
                                        if (list3 == null) {
                                            it7 = list3.iterator();
                                            i17 = 0;
                                            while (it7.hasNext()) {
                                                if (!((m) it7.next()).p0()) {
                                                }
                                            }
                                        } else {
                                            it7 = list3.iterator();
                                            i17 = 0;
                                            while (it7.hasNext()) {
                                                if (!((m) it7.next()).p0()) {
                                                }
                                            }
                                        }
                                        if (list3 == null) {
                                            it8 = list3.iterator();
                                            int i21117 = 0;
                                            while (it8.hasNext()) {
                                                if (!((m) it8.next()).o0()) {
                                                }
                                            }
                                            i18 = i21117;
                                        } else {
                                            it8 = list3.iterator();
                                            int i21118 = 0;
                                            while (it8.hasNext()) {
                                                if (!((m) it8.next()).o0()) {
                                                }
                                            }
                                            i18 = i21118;
                                        }
                                        gu1.b bVar1110 = aVar4.f160848a;
                                        this.f160867n = null;
                                        this.f160854a = null;
                                        this.f160855b = cVar3;
                                        this.f160856c = bVar3;
                                        this.f160857d = dVar2;
                                        this.f160858e = list7;
                                        this.f160859f = list6;
                                        this.f160860g = aVar;
                                        this.f160862i = i15;
                                        this.f160863j = i16;
                                        this.f160864k = i17;
                                        this.f160865l = i18;
                                        this.f160866m = 6;
                                        objJ2 = f0.J(bVar1110, new gu1.f(bVar1110, null), this);
                                        if (objJ2 == aVar3) {
                                            return aVar3;
                                        }
                                        cVar4 = cVar3;
                                        i19 = i17;
                                        list8 = list7;
                                        aVar2 = aVar;
                                        list9 = list6;
                                        list10 = list8;
                                        dVar4 = dVar2;
                                        bVar4 = bVar3;
                                        v2Var4 = (v2) objJ2;
                                        if (v2Var4 instanceof v2.b) {
                                            int size6 = ((List) ((v2.b) v2Var4).f47386a).size() + i15 + i16 + i19 + i18;
                                            p2 p2Var114 = aVar4.f160851d;
                                            g3.a aVar10 = g3.f35298f;
                                            e0 e0Var6 = new e0(list10, cVar4, aVar2, bVar4, dVar4, list9, size6);
                                            aVar10.getClass();
                                            g3 g3VarD6 = g3.a.d(e0Var6);
                                            this.f160867n = null;
                                            this.f160854a = null;
                                            this.f160855b = null;
                                            this.f160856c = null;
                                            this.f160857d = null;
                                            this.f160858e = null;
                                            this.f160859f = null;
                                            this.f160860g = null;
                                            this.f160862i = i15;
                                            this.f160863j = i16;
                                            this.f160864k = i19;
                                            this.f160865l = i18;
                                            this.f160866m = 7;
                                            p2Var114.k(null, g3VarD6);
                                            if (Unit.INSTANCE == aVar3) {
                                                return aVar3;
                                            }
                                        } else {
                                            if (v2Var4 instanceof v2.a) {
                                                u0.r();
                                                return null;
                                            }
                                            p2 p2Var115 = aVar4.f160851d;
                                            g3 g3VarA18 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var4).f47383a, null, null, 13);
                                            this.f160867n = null;
                                            this.f160854a = null;
                                            this.f160855b = null;
                                            this.f160856c = null;
                                            this.f160857d = null;
                                            this.f160858e = null;
                                            this.f160859f = null;
                                            this.f160860g = null;
                                            this.f160862i = i15;
                                            this.f160863j = i16;
                                            this.f160864k = i19;
                                            this.f160865l = i18;
                                            this.f160866m = 8;
                                            p2Var115.k(null, g3VarA18);
                                            if (Unit.INSTANCE == aVar3) {
                                                return aVar3;
                                            }
                                        }
                                    } else {
                                        if (!(v2Var3 instanceof v2.a)) {
                                            u0.r();
                                            return null;
                                        }
                                        p2 p2Var116 = aVar4.f160851d;
                                        g3 g3VarA19 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var3).f47383a, null, null, 13);
                                        this.f160867n = null;
                                        this.f160854a = null;
                                        this.f160855b = null;
                                        this.f160856c = null;
                                        this.f160857d = null;
                                        this.f160858e = null;
                                        this.f160859f = null;
                                        this.f160866m = 9;
                                        p2Var116.k(null, g3VarA19);
                                        if (Unit.INSTANCE == aVar3) {
                                            return aVar3;
                                        }
                                    }
                                }
                            } else {
                                if (v2Var2 instanceof v2.a) {
                                    u0.r();
                                    return null;
                                }
                                p2 p2Var117 = aVar4.f160851d;
                                g3 g3VarA110 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var2).f47383a, null, null, 13);
                                this.f160867n = null;
                                this.f160854a = null;
                                this.f160855b = null;
                                this.f160856c = null;
                                this.f160857d = null;
                                this.f160858e = null;
                                this.f160866m = 10;
                                p2Var117.k(null, g3VarA110);
                                if (Unit.INSTANCE == aVar3) {
                                    return aVar3;
                                }
                            }
                        }
                    }
                    list = arrayList4;
                    return aVar3;
                }
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                p2 p2Var118 = aVar4.f160851d;
                g3 g3VarA111 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13);
                this.f160867n = null;
                this.f160866m = 11;
                p2Var118.k(null, g3VarA111);
                if (Unit.INSTANCE == aVar3) {
                    return aVar3;
                }
                return Unit.INSTANCE;
            case 3:
                jLongValue = this.f160861h;
                List list11 = this.f160858e;
                dVar = this.f160857d;
                bVar = this.f160856c;
                cVar = this.f160855b;
                list = this.f160854a;
                r.b(obj);
                objC = obj;
                List list12 = list11;
                str = "";
                list12 = arrayList4;
                v2 v2Var5 = (v2) objC;
                if (v2Var5 instanceof v2.b) {
                    k kVar = (k) h0.d0((List) ((v2.b) v2Var5).f47386a);
                    if (cVar != null) {
                        cVar.f187729g = kVar;
                        Unit unit = Unit.INSTANCE;
                    }
                    if (bVar != null) {
                        bVar.f187721h = kVar;
                        Unit unit2 = Unit.INSTANCE;
                    }
                } else {
                    if (!(v2Var5 instanceof v2.a)) {
                        u0.r();
                        return null;
                    }
                    String strN = wr.g.n("Error getting event for planId ", jLongValue, ". Exception=", ((v2.a) v2Var5).f47383a);
                    i2.a aVar11 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar11.getClass();
                    i2.a.f(a2Var, "GetActiveTrainingPlansUseCase", strN);
                }
                Unit unit3 = Unit.INSTANCE;
                list2 = list12;
                bVar2 = bVar;
                cVar2 = cVar;
                fy1.i.f73924a.getClass();
                String strF7 = fy1.i.a.f();
                gu1.b bVar1111 = aVar4.f160848a;
                this.f160867n = null;
                this.f160854a = list;
                this.f160855b = cVar2;
                this.f160856c = bVar2;
                this.f160857d = dVar;
                this.f160858e = list2;
                this.f160866m = 4;
                objJ = f0.J(bVar1111, new h(bVar1111, strF7, null), this);
                if (objJ != aVar3) {
                    list3 = list;
                    list4 = list2;
                    v2Var2 = (v2) objJ;
                    if (v2Var2 instanceof v2.b) {
                        list5 = (List) ((v2.b) v2Var2).f47386a;
                        gu1.b bVar1112 = aVar4.f160848a;
                        this.f160867n = null;
                        this.f160854a = list3;
                        this.f160855b = cVar2;
                        this.f160856c = bVar2;
                        this.f160857d = dVar;
                        this.f160858e = list4;
                        this.f160859f = list5;
                        this.f160866m = 5;
                        objA = bVar1112.a(this);
                        if (objA != aVar3) {
                            ww1.b bVar1113 = bVar2;
                            dVar2 = dVar;
                            cVar3 = cVar2;
                            bVar3 = bVar1113;
                            list6 = list5;
                            list7 = list4;
                            v2Var3 = (v2) objA;
                            if (v2Var3 instanceof v2.b) {
                                dVar3 = (xw1.d) ((v2.b) v2Var3).f47386a;
                                if (dVar3 != null) {
                                    long athletePlanId7 = dVar3.getAthletePlanId();
                                    vt1.a.C3360a c3360a7 = vt1.a.f180073b;
                                    int workoutPlanId7 = (int) dVar3.getWorkoutPlanId();
                                    c3360a7.getClass();
                                    String strA7 = vt1.a.C3360a.a(workoutPlanId7);
                                    strB = vt1.a.C3360a.b((int) dVar3.getWorkoutPlanId(), ((rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null)).b());
                                    if (strB == null) {
                                        str6 = str;
                                    } else {
                                        str6 = strB;
                                    }
                                    DateTime dateTimeNow7 = DateTime.now();
                                    dateTimeNow7.getClass();
                                    aVar = new ww1.a(athletePlanId7, strA7, str6, dVar3.j(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c, dateTimeNow7), dVar3.A(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c), dVar3.r(), dVar3.getAthleteRace());
                                } else {
                                    aVar = null;
                                }
                                if (list3 == null) {
                                    it5 = list3.iterator();
                                    int i21119 = 0;
                                    while (it5.hasNext()) {
                                        if (!((m) it5.next()).n0()) {
                                        }
                                    }
                                    i15 = i21119;
                                } else {
                                    it5 = list3.iterator();
                                    int i211110 = 0;
                                    while (it5.hasNext()) {
                                        if (!((m) it5.next()).n0()) {
                                        }
                                    }
                                    i15 = i211110;
                                }
                                if (list3 == null) {
                                    it6 = list3.iterator();
                                    int i211111 = 0;
                                    while (it6.hasNext()) {
                                        if (!((m) it6.next()).h0()) {
                                        }
                                    }
                                    i16 = i211111;
                                } else {
                                    it6 = list3.iterator();
                                    int i211112 = 0;
                                    while (it6.hasNext()) {
                                        if (!((m) it6.next()).h0()) {
                                        }
                                    }
                                    i16 = i211112;
                                }
                                if (list3 == null) {
                                    it7 = list3.iterator();
                                    i17 = 0;
                                    while (it7.hasNext()) {
                                        if (!((m) it7.next()).p0()) {
                                        }
                                    }
                                } else {
                                    it7 = list3.iterator();
                                    i17 = 0;
                                    while (it7.hasNext()) {
                                        if (!((m) it7.next()).p0()) {
                                        }
                                    }
                                }
                                if (list3 == null) {
                                    it8 = list3.iterator();
                                    int i211113 = 0;
                                    while (it8.hasNext()) {
                                        if (!((m) it8.next()).o0()) {
                                        }
                                    }
                                    i18 = i211113;
                                } else {
                                    it8 = list3.iterator();
                                    int i211114 = 0;
                                    while (it8.hasNext()) {
                                        if (!((m) it8.next()).o0()) {
                                        }
                                    }
                                    i18 = i211114;
                                }
                                gu1.b bVar1114 = aVar4.f160848a;
                                this.f160867n = null;
                                this.f160854a = null;
                                this.f160855b = cVar3;
                                this.f160856c = bVar3;
                                this.f160857d = dVar2;
                                this.f160858e = list7;
                                this.f160859f = list6;
                                this.f160860g = aVar;
                                this.f160862i = i15;
                                this.f160863j = i16;
                                this.f160864k = i17;
                                this.f160865l = i18;
                                this.f160866m = 6;
                                objJ2 = f0.J(bVar1114, new gu1.f(bVar1114, null), this);
                                if (objJ2 == aVar3) {
                                    return aVar3;
                                }
                                cVar4 = cVar3;
                                i19 = i17;
                                list8 = list7;
                                aVar2 = aVar;
                                list9 = list6;
                                list10 = list8;
                                dVar4 = dVar2;
                                bVar4 = bVar3;
                                v2Var4 = (v2) objJ2;
                                if (v2Var4 instanceof v2.b) {
                                    int size7 = ((List) ((v2.b) v2Var4).f47386a).size() + i15 + i16 + i19 + i18;
                                    p2 p2Var119 = aVar4.f160851d;
                                    g3.a aVar12 = g3.f35298f;
                                    e0 e0Var7 = new e0(list10, cVar4, aVar2, bVar4, dVar4, list9, size7);
                                    aVar12.getClass();
                                    g3 g3VarD7 = g3.a.d(e0Var7);
                                    this.f160867n = null;
                                    this.f160854a = null;
                                    this.f160855b = null;
                                    this.f160856c = null;
                                    this.f160857d = null;
                                    this.f160858e = null;
                                    this.f160859f = null;
                                    this.f160860g = null;
                                    this.f160862i = i15;
                                    this.f160863j = i16;
                                    this.f160864k = i19;
                                    this.f160865l = i18;
                                    this.f160866m = 7;
                                    p2Var119.k(null, g3VarD7);
                                    if (Unit.INSTANCE == aVar3) {
                                        return aVar3;
                                    }
                                } else {
                                    if (v2Var4 instanceof v2.a) {
                                        u0.r();
                                        return null;
                                    }
                                    p2 p2Var1110 = aVar4.f160851d;
                                    g3 g3VarA112 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var4).f47383a, null, null, 13);
                                    this.f160867n = null;
                                    this.f160854a = null;
                                    this.f160855b = null;
                                    this.f160856c = null;
                                    this.f160857d = null;
                                    this.f160858e = null;
                                    this.f160859f = null;
                                    this.f160860g = null;
                                    this.f160862i = i15;
                                    this.f160863j = i16;
                                    this.f160864k = i19;
                                    this.f160865l = i18;
                                    this.f160866m = 8;
                                    p2Var1110.k(null, g3VarA112);
                                    if (Unit.INSTANCE == aVar3) {
                                        return aVar3;
                                    }
                                }
                            } else {
                                if (!(v2Var3 instanceof v2.a)) {
                                    u0.r();
                                    return null;
                                }
                                p2 p2Var1111 = aVar4.f160851d;
                                g3 g3VarA113 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var3).f47383a, null, null, 13);
                                this.f160867n = null;
                                this.f160854a = null;
                                this.f160855b = null;
                                this.f160856c = null;
                                this.f160857d = null;
                                this.f160858e = null;
                                this.f160859f = null;
                                this.f160866m = 9;
                                p2Var1111.k(null, g3VarA113);
                                if (Unit.INSTANCE == aVar3) {
                                    return aVar3;
                                }
                            }
                        }
                    } else {
                        if (v2Var2 instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        p2 p2Var1112 = aVar4.f160851d;
                        g3 g3VarA114 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var2).f47383a, null, null, 13);
                        this.f160867n = null;
                        this.f160854a = null;
                        this.f160855b = null;
                        this.f160856c = null;
                        this.f160857d = null;
                        this.f160858e = null;
                        this.f160866m = 10;
                        p2Var1112.k(null, g3VarA114);
                        if (Unit.INSTANCE == aVar3) {
                            return aVar3;
                        }
                    }
                    return Unit.INSTANCE;
                }
                list12 = arrayList4;
                return aVar3;
            case 4:
                List list13 = this.f160858e;
                dVar = this.f160857d;
                bVar2 = this.f160856c;
                cVar2 = this.f160855b;
                list3 = this.f160854a;
                r.b(obj);
                objJ = obj;
                list4 = list13;
                str = "";
                v2Var2 = (v2) objJ;
                if (v2Var2 instanceof v2.b) {
                    list5 = (List) ((v2.b) v2Var2).f47386a;
                    gu1.b bVar1115 = aVar4.f160848a;
                    this.f160867n = null;
                    this.f160854a = list3;
                    this.f160855b = cVar2;
                    this.f160856c = bVar2;
                    this.f160857d = dVar;
                    this.f160858e = list4;
                    this.f160859f = list5;
                    this.f160866m = 5;
                    objA = bVar1115.a(this);
                    if (objA != aVar3) {
                        ww1.b bVar1116 = bVar2;
                        dVar2 = dVar;
                        cVar3 = cVar2;
                        bVar3 = bVar1116;
                        list6 = list5;
                        list7 = list4;
                        v2Var3 = (v2) objA;
                        if (v2Var3 instanceof v2.b) {
                            dVar3 = (xw1.d) ((v2.b) v2Var3).f47386a;
                            if (dVar3 != null) {
                                long athletePlanId8 = dVar3.getAthletePlanId();
                                vt1.a.C3360a c3360a8 = vt1.a.f180073b;
                                int workoutPlanId8 = (int) dVar3.getWorkoutPlanId();
                                c3360a8.getClass();
                                String strA8 = vt1.a.C3360a.a(workoutPlanId8);
                                strB = vt1.a.C3360a.b((int) dVar3.getWorkoutPlanId(), ((rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null)).b());
                                if (strB == null) {
                                    str6 = str;
                                } else {
                                    str6 = strB;
                                }
                                DateTime dateTimeNow8 = DateTime.now();
                                dateTimeNow8.getClass();
                                aVar = new ww1.a(athletePlanId8, strA8, str6, dVar3.j(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c, dateTimeNow8), dVar3.A(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c), dVar3.r(), dVar3.getAthleteRace());
                            } else {
                                aVar = null;
                            }
                            if (list3 == null) {
                                it5 = list3.iterator();
                                int i211115 = 0;
                                while (it5.hasNext()) {
                                    if (!((m) it5.next()).n0()) {
                                    }
                                }
                                i15 = i211115;
                            } else {
                                it5 = list3.iterator();
                                int i211116 = 0;
                                while (it5.hasNext()) {
                                    if (!((m) it5.next()).n0()) {
                                    }
                                }
                                i15 = i211116;
                            }
                            if (list3 == null) {
                                it6 = list3.iterator();
                                int i211117 = 0;
                                while (it6.hasNext()) {
                                    if (!((m) it6.next()).h0()) {
                                    }
                                }
                                i16 = i211117;
                            } else {
                                it6 = list3.iterator();
                                int i211118 = 0;
                                while (it6.hasNext()) {
                                    if (!((m) it6.next()).h0()) {
                                    }
                                }
                                i16 = i211118;
                            }
                            if (list3 == null) {
                                it7 = list3.iterator();
                                i17 = 0;
                                while (it7.hasNext()) {
                                    if (!((m) it7.next()).p0()) {
                                    }
                                }
                            } else {
                                it7 = list3.iterator();
                                i17 = 0;
                                while (it7.hasNext()) {
                                    if (!((m) it7.next()).p0()) {
                                    }
                                }
                            }
                            if (list3 == null) {
                                it8 = list3.iterator();
                                int i211119 = 0;
                                while (it8.hasNext()) {
                                    if (!((m) it8.next()).o0()) {
                                    }
                                }
                                i18 = i211119;
                            } else {
                                it8 = list3.iterator();
                                int i2111110 = 0;
                                while (it8.hasNext()) {
                                    if (!((m) it8.next()).o0()) {
                                    }
                                }
                                i18 = i2111110;
                            }
                            gu1.b bVar1117 = aVar4.f160848a;
                            this.f160867n = null;
                            this.f160854a = null;
                            this.f160855b = cVar3;
                            this.f160856c = bVar3;
                            this.f160857d = dVar2;
                            this.f160858e = list7;
                            this.f160859f = list6;
                            this.f160860g = aVar;
                            this.f160862i = i15;
                            this.f160863j = i16;
                            this.f160864k = i17;
                            this.f160865l = i18;
                            this.f160866m = 6;
                            objJ2 = f0.J(bVar1117, new gu1.f(bVar1117, null), this);
                            if (objJ2 == aVar3) {
                                return aVar3;
                            }
                            cVar4 = cVar3;
                            i19 = i17;
                            list8 = list7;
                            aVar2 = aVar;
                            list9 = list6;
                            list10 = list8;
                            dVar4 = dVar2;
                            bVar4 = bVar3;
                            v2Var4 = (v2) objJ2;
                            if (v2Var4 instanceof v2.b) {
                                int size8 = ((List) ((v2.b) v2Var4).f47386a).size() + i15 + i16 + i19 + i18;
                                p2 p2Var1113 = aVar4.f160851d;
                                g3.a aVar13 = g3.f35298f;
                                e0 e0Var8 = new e0(list10, cVar4, aVar2, bVar4, dVar4, list9, size8);
                                aVar13.getClass();
                                g3 g3VarD8 = g3.a.d(e0Var8);
                                this.f160867n = null;
                                this.f160854a = null;
                                this.f160855b = null;
                                this.f160856c = null;
                                this.f160857d = null;
                                this.f160858e = null;
                                this.f160859f = null;
                                this.f160860g = null;
                                this.f160862i = i15;
                                this.f160863j = i16;
                                this.f160864k = i19;
                                this.f160865l = i18;
                                this.f160866m = 7;
                                p2Var1113.k(null, g3VarD8);
                                if (Unit.INSTANCE == aVar3) {
                                    return aVar3;
                                }
                            } else {
                                if (v2Var4 instanceof v2.a) {
                                    u0.r();
                                    return null;
                                }
                                p2 p2Var1114 = aVar4.f160851d;
                                g3 g3VarA115 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var4).f47383a, null, null, 13);
                                this.f160867n = null;
                                this.f160854a = null;
                                this.f160855b = null;
                                this.f160856c = null;
                                this.f160857d = null;
                                this.f160858e = null;
                                this.f160859f = null;
                                this.f160860g = null;
                                this.f160862i = i15;
                                this.f160863j = i16;
                                this.f160864k = i19;
                                this.f160865l = i18;
                                this.f160866m = 8;
                                p2Var1114.k(null, g3VarA115);
                                if (Unit.INSTANCE == aVar3) {
                                    return aVar3;
                                }
                            }
                        } else {
                            if (!(v2Var3 instanceof v2.a)) {
                                u0.r();
                                return null;
                            }
                            p2 p2Var1115 = aVar4.f160851d;
                            g3 g3VarA116 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var3).f47383a, null, null, 13);
                            this.f160867n = null;
                            this.f160854a = null;
                            this.f160855b = null;
                            this.f160856c = null;
                            this.f160857d = null;
                            this.f160858e = null;
                            this.f160859f = null;
                            this.f160866m = 9;
                            p2Var1115.k(null, g3VarA116);
                            if (Unit.INSTANCE == aVar3) {
                                return aVar3;
                            }
                        }
                    }
                    list12 = arrayList4;
                    return aVar3;
                }
                if (v2Var2 instanceof v2.a) {
                    u0.r();
                    return null;
                }
                p2 p2Var1116 = aVar4.f160851d;
                g3 g3VarA117 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var2).f47383a, null, null, 13);
                this.f160867n = null;
                this.f160854a = null;
                this.f160855b = null;
                this.f160856c = null;
                this.f160857d = null;
                this.f160858e = null;
                this.f160866m = 10;
                p2Var1116.k(null, g3VarA117);
                if (Unit.INSTANCE == aVar3) {
                    return aVar3;
                }
                return Unit.INSTANCE;
            case 5:
                List list14 = this.f160859f;
                List list15 = this.f160858e;
                ww1.d dVar11 = this.f160857d;
                ww1.b bVar20 = this.f160856c;
                ww1.c cVar5 = this.f160855b;
                list3 = this.f160854a;
                r.b(obj);
                list6 = list14;
                list7 = list15;
                str = "";
                cVar3 = cVar5;
                objA = obj;
                bVar3 = bVar20;
                dVar2 = dVar11;
                v2Var3 = (v2) objA;
                if (v2Var3 instanceof v2.b) {
                    dVar3 = (xw1.d) ((v2.b) v2Var3).f47386a;
                    if (dVar3 != null) {
                        long athletePlanId9 = dVar3.getAthletePlanId();
                        vt1.a.C3360a c3360a9 = vt1.a.f180073b;
                        int workoutPlanId9 = (int) dVar3.getWorkoutPlanId();
                        c3360a9.getClass();
                        String strA9 = vt1.a.C3360a.a(workoutPlanId9);
                        strB = vt1.a.C3360a.b((int) dVar3.getWorkoutPlanId(), ((rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null)).b());
                        if (strB == null) {
                            str6 = str;
                        } else {
                            str6 = strB;
                        }
                        DateTime dateTimeNow9 = DateTime.now();
                        dateTimeNow9.getClass();
                        aVar = new ww1.a(athletePlanId9, strA9, str6, dVar3.j(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c, dateTimeNow9), dVar3.A(((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1().f77271c), dVar3.r(), dVar3.getAthleteRace());
                    } else {
                        aVar = null;
                    }
                    if (list3 == null) {
                        it5 = list3.iterator();
                        int i2111111 = 0;
                        while (it5.hasNext()) {
                            if (!((m) it5.next()).n0()) {
                            }
                        }
                        i15 = i2111111;
                    } else {
                        it5 = list3.iterator();
                        int i2111112 = 0;
                        while (it5.hasNext()) {
                            if (!((m) it5.next()).n0()) {
                            }
                        }
                        i15 = i2111112;
                    }
                    if (list3 == null) {
                        it6 = list3.iterator();
                        int i2111113 = 0;
                        while (it6.hasNext()) {
                            if (!((m) it6.next()).h0()) {
                            }
                        }
                        i16 = i2111113;
                    } else {
                        it6 = list3.iterator();
                        int i2111114 = 0;
                        while (it6.hasNext()) {
                            if (!((m) it6.next()).h0()) {
                            }
                        }
                        i16 = i2111114;
                    }
                    if (list3 == null) {
                        it7 = list3.iterator();
                        i17 = 0;
                        while (it7.hasNext()) {
                            if (!((m) it7.next()).p0()) {
                            }
                        }
                    } else {
                        it7 = list3.iterator();
                        i17 = 0;
                        while (it7.hasNext()) {
                            if (!((m) it7.next()).p0()) {
                            }
                        }
                    }
                    if (list3 == null) {
                        it8 = list3.iterator();
                        int i2111115 = 0;
                        while (it8.hasNext()) {
                            if (!((m) it8.next()).o0()) {
                            }
                        }
                        i18 = i2111115;
                    } else {
                        it8 = list3.iterator();
                        int i2111116 = 0;
                        while (it8.hasNext()) {
                            if (!((m) it8.next()).o0()) {
                            }
                        }
                        i18 = i2111116;
                    }
                    gu1.b bVar1118 = aVar4.f160848a;
                    this.f160867n = null;
                    this.f160854a = null;
                    this.f160855b = cVar3;
                    this.f160856c = bVar3;
                    this.f160857d = dVar2;
                    this.f160858e = list7;
                    this.f160859f = list6;
                    this.f160860g = aVar;
                    this.f160862i = i15;
                    this.f160863j = i16;
                    this.f160864k = i17;
                    this.f160865l = i18;
                    this.f160866m = 6;
                    objJ2 = f0.J(bVar1118, new gu1.f(bVar1118, null), this);
                    if (objJ2 == aVar3) {
                        return aVar3;
                    }
                    cVar4 = cVar3;
                    i19 = i17;
                    list8 = list7;
                    aVar2 = aVar;
                    list9 = list6;
                    list10 = list8;
                    dVar4 = dVar2;
                    bVar4 = bVar3;
                    v2Var4 = (v2) objJ2;
                    if (v2Var4 instanceof v2.b) {
                        int size9 = ((List) ((v2.b) v2Var4).f47386a).size() + i15 + i16 + i19 + i18;
                        p2 p2Var1117 = aVar4.f160851d;
                        g3.a aVar14 = g3.f35298f;
                        e0 e0Var9 = new e0(list10, cVar4, aVar2, bVar4, dVar4, list9, size9);
                        aVar14.getClass();
                        g3 g3VarD9 = g3.a.d(e0Var9);
                        this.f160867n = null;
                        this.f160854a = null;
                        this.f160855b = null;
                        this.f160856c = null;
                        this.f160857d = null;
                        this.f160858e = null;
                        this.f160859f = null;
                        this.f160860g = null;
                        this.f160862i = i15;
                        this.f160863j = i16;
                        this.f160864k = i19;
                        this.f160865l = i18;
                        this.f160866m = 7;
                        p2Var1117.k(null, g3VarD9);
                        if (Unit.INSTANCE == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (v2Var4 instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        p2 p2Var1118 = aVar4.f160851d;
                        g3 g3VarA118 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var4).f47383a, null, null, 13);
                        this.f160867n = null;
                        this.f160854a = null;
                        this.f160855b = null;
                        this.f160856c = null;
                        this.f160857d = null;
                        this.f160858e = null;
                        this.f160859f = null;
                        this.f160860g = null;
                        this.f160862i = i15;
                        this.f160863j = i16;
                        this.f160864k = i19;
                        this.f160865l = i18;
                        this.f160866m = 8;
                        p2Var1118.k(null, g3VarA118);
                        if (Unit.INSTANCE == aVar3) {
                            return aVar3;
                        }
                    }
                } else {
                    if (!(v2Var3 instanceof v2.a)) {
                        u0.r();
                        return null;
                    }
                    p2 p2Var1119 = aVar4.f160851d;
                    g3 g3VarA119 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var3).f47383a, null, null, 13);
                    this.f160867n = null;
                    this.f160854a = null;
                    this.f160855b = null;
                    this.f160856c = null;
                    this.f160857d = null;
                    this.f160858e = null;
                    this.f160859f = null;
                    this.f160866m = 9;
                    p2Var1119.k(null, g3VarA119);
                    if (Unit.INSTANCE == aVar3) {
                        return aVar3;
                    }
                }
                return Unit.INSTANCE;
            case 6:
                i18 = this.f160865l;
                i19 = this.f160864k;
                i16 = this.f160863j;
                i15 = this.f160862i;
                aVar = this.f160860g;
                list6 = this.f160859f;
                List list16 = this.f160858e;
                dVar2 = this.f160857d;
                bVar3 = this.f160856c;
                ww1.c cVar6 = this.f160855b;
                r.b(obj);
                aVar3 = aVar3;
                cVar4 = cVar6;
                objJ2 = obj;
                list8 = list16;
                aVar2 = aVar;
                list9 = list6;
                list10 = list8;
                dVar4 = dVar2;
                bVar4 = bVar3;
                v2Var4 = (v2) objJ2;
                if (v2Var4 instanceof v2.b) {
                    int size10 = ((List) ((v2.b) v2Var4).f47386a).size() + i15 + i16 + i19 + i18;
                    p2 p2Var11110 = aVar4.f160851d;
                    g3.a aVar15 = g3.f35298f;
                    e0 e0Var10 = new e0(list10, cVar4, aVar2, bVar4, dVar4, list9, size10);
                    aVar15.getClass();
                    g3 g3VarD10 = g3.a.d(e0Var10);
                    this.f160867n = null;
                    this.f160854a = null;
                    this.f160855b = null;
                    this.f160856c = null;
                    this.f160857d = null;
                    this.f160858e = null;
                    this.f160859f = null;
                    this.f160860g = null;
                    this.f160862i = i15;
                    this.f160863j = i16;
                    this.f160864k = i19;
                    this.f160865l = i18;
                    this.f160866m = 7;
                    p2Var11110.k(null, g3VarD10);
                    if (Unit.INSTANCE == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (v2Var4 instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    p2 p2Var11111 = aVar4.f160851d;
                    g3 g3VarA1110 = g3.a.a(g3.f35298f, null, ((v2.a) v2Var4).f47383a, null, null, 13);
                    this.f160867n = null;
                    this.f160854a = null;
                    this.f160855b = null;
                    this.f160856c = null;
                    this.f160857d = null;
                    this.f160858e = null;
                    this.f160859f = null;
                    this.f160860g = null;
                    this.f160862i = i15;
                    this.f160863j = i16;
                    this.f160864k = i19;
                    this.f160865l = i18;
                    this.f160866m = 8;
                    p2Var11111.k(null, g3VarA1110);
                    if (Unit.INSTANCE == aVar3) {
                        return aVar3;
                    }
                }
                return Unit.INSTANCE;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                r.b(obj);
                return Unit.INSTANCE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
