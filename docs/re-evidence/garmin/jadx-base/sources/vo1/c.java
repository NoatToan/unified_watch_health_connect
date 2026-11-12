package vo1;

import am.b2;
import c83.a0;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ms.b0;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import ps.q1;
import ps.y1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lvo1/c;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lvo1/a;", "socialGroupRideAPI", "Lam/b2;", "activityAPI", "<init>", "(Lvo1/a;Lam/b2;)V", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f179028c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vo1.a f179029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f179030b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.socialgroupride.SocialGroupRideRepo", f = "SocialGroupRideRepo.kt", l = {202}, m = "getDeviceRegistrationDetails", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f179031a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f179033c;

        public b(t13.d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f179031a = obj;
            this.f179033c |= Integer.MIN_VALUE;
            return c.this.a(this);
        }
    }

    /* JADX INFO: renamed from: vo1.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lyo1/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.socialgroupride.SocialGroupRideRepo$getDeviceRegistrationDetails$result$1", f = "SocialGroupRideRepo.kt", l = {202}, m = "invokeSuspend", v = 2)
    public static final class C3344c extends v13.i implements e23.l<t13.d<? super a0<List<? extends yo1.a>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f179034a;

        public C3344c(t13.d<? super C3344c> dVar) {
            super(1, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return c.this.new C3344c(dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super a0<List<? extends yo1.a>>> dVar) {
            return ((C3344c) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f179034a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            i0<a0<List<yo1.a>>> i0VarA = c.this.f179029a.a();
            this.f179034a = 1;
            Object objAwait = i0VarA.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    public c(vo1.a aVar, b2 b2Var) {
        aVar.getClass();
        b2Var.getClass();
        this.f179029a = aVar;
        this.f179030b = b2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(t13.d<? super v2<? extends List<yo1.a>>> dVar) {
        b bVar;
        v2.b bVar2;
        int i14;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i15 = bVar.f179033c;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                bVar.f179033c = i15 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objJ = bVar.f179031a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = bVar.f179033c;
        if (i16 == 0) {
            r.b(objJ);
            C3344c c3344c = new C3344c(null);
            bVar.f179033c = 1;
            objJ = f0.J(this, c3344c, bVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        return ((v2Var instanceof v2.b) && (i14 = (bVar2 = (v2.b) v2Var).f47387b) == 204 && !(bVar2.f47386a instanceof List)) ? new v2.a(new Exception("204 No Content. Empty response body. kotlin.Unit cannot be cast to DeviceDTO"), new Integer(i14), null, 4, null) : v2Var;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:104:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00df  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:43:0x0112  */
    /* JADX WARN: Code duplicated, block: B:48:0x0141  */
    /* JADX WARN: Code duplicated, block: B:49:0x0144  */
    /* JADX WARN: Code duplicated, block: B:52:0x016c  */
    /* JADX WARN: Code duplicated, block: B:54:0x017b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0197  */
    /* JADX WARN: Code duplicated, block: B:61:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:67:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:71:0x0209  */
    /* JADX WARN: Code duplicated, block: B:74:0x0215  */
    /* JADX WARN: Code duplicated, block: B:75:0x0222  */
    /* JADX WARN: Code duplicated, block: B:76:0x0228  */
    /* JADX WARN: Code duplicated, block: B:79:0x0232  */
    /* JADX WARN: Code duplicated, block: B:82:0x025d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0266  */
    /* JADX WARN: Code duplicated, block: B:86:0x0276  */
    /* JADX WARN: Code duplicated, block: B:88:0x0280  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:91:0x028c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0292  */
    /* JADX WARN: Code duplicated, block: B:94:0x0298  */
    /* JADX WARN: Code duplicated, block: B:97:0x02a2  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(String str, String str2, Long l14, v13.c cVar) {
        k kVar;
        String str3;
        Long l15;
        v2 v2Var;
        Object objJ;
        String str4;
        v2 v2Var2;
        Long l16;
        v2 v2Var3;
        r0 r0Var;
        String str5;
        ArrayList arrayList;
        yo1.f fVar;
        ArrayList arrayList2;
        List<yo1.d> listD;
        Iterator<T> it;
        v2 v2Var4;
        Object objJ2;
        v2 v2Var5;
        r0 r0Var2;
        v2 v2Var6;
        Long l17;
        String str6;
        v2 v2Var7;
        ps.r rVar;
        ActivityDetailChartDTO activityDetailChartDTO;
        r0 r0Var3;
        v2 v2Var8;
        Long l18;
        String str7;
        ps.r rVar2;
        q1 summaryDTO;
        Double numberOfActiveLengths;
        r0 r0Var4;
        v2 v2Var9;
        v2 v2Var10;
        ps.r rVar3;
        ps.r rVar4;
        ActivityDetailChartDTO activityDetailChartDTO2;
        y1 y1Var;
        ps.n nVar;
        String str8;
        ps.n nVar2;
        Object objJ3;
        v2 v2Var11;
        String str9;
        v2 v2Var12;
        Long l19;
        String activityName;
        v2 v2Var13;
        c cVar2 = this;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f179082l;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f179082l = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(cVar2, cVar);
            }
        } else {
            kVar = new k(cVar2, cVar);
        }
        k kVar2 = kVar;
        Object objJ4 = kVar2.f179080j;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        switch (kVar2.f179082l) {
            case 0:
                r.b(objJ4);
                kVar2.f179071a = str;
                kVar2.f179072b = l14;
                kVar2.f179082l = 1;
                objJ4 = f0.J(cVar2, new m(cVar2, str, str2, l14, null), kVar2);
                if (objJ4 != aVar) {
                    str3 = str;
                    l15 = l14;
                    v2Var = (v2) objJ4;
                    kVar2.f179071a = str3;
                    kVar2.f179072b = l15;
                    kVar2.f179073c = v2Var;
                    kVar2.f179082l = 2;
                    objJ = f0.J(cVar2, new i(cVar2, str3, l15, null), kVar2);
                    if (objJ != aVar) {
                        str4 = str3;
                        v2Var2 = v2Var;
                        objJ4 = objJ;
                        l16 = l15;
                        v2Var3 = (v2) objJ4;
                        r0Var = new r0();
                        if (v2Var3 instanceof v2.b) {
                            r0Var.f105810a = ((v2.b) v2Var3).f47386a;
                        }
                        if (l16 == null) {
                            if (!(v2Var2 instanceof v2.b)) {
                                return new v2.a(new Exception("Something went wrong while fetching social GroupRide details with activity!"), null, null, 6, null);
                            }
                            arrayList = new ArrayList();
                            fVar = (yo1.f) r0Var.f105810a;
                            if (fVar != null && (listD = fVar.d()) != null) {
                                it = listD.iterator();
                                while (it.hasNext()) {
                                    for (yo1.e eVar : ((yo1.d) it.next()).f()) {
                                        if (((yo1.f) r0Var.f105810a).getForUserPk() == eVar.getUserPk()) {
                                            arrayList.add(eVar.getRideData().j());
                                        }
                                    }
                                }
                            }
                            v2.b bVar = (v2.b) v2Var2;
                            yo1.j jVar = (yo1.j) bVar.f47386a;
                            if (arrayList.isEmpty()) {
                                arrayList2 = null;
                            } else {
                                arrayList2 = arrayList;
                            }
                            return new v2.b(new yo1.h(null, str4, null, jVar, null, null, arrayList2, null, (yo1.f) r0Var.f105810a, false, 517, null), bVar.f47387b, null, null, 12, null);
                        }
                        long jLongValue = l16.longValue();
                        kVar2.f179071a = str4;
                        kVar2.f179072b = l16;
                        kVar2.f179073c = v2Var2;
                        kVar2.f179074d = r0Var;
                        kVar2.f179082l = 3;
                        objJ4 = f0.J(cVar2, new f(cVar2, jLongValue, null), kVar2);
                        if (objJ4 != aVar) {
                            str5 = str4;
                            v2Var4 = (v2) objJ4;
                            long jLongValue2 = l16.longValue();
                            kVar2.f179071a = str5;
                            kVar2.f179072b = l16;
                            kVar2.f179073c = v2Var2;
                            kVar2.f179074d = r0Var;
                            kVar2.f179075e = v2Var4;
                            kVar2.f179082l = 4;
                            objJ2 = f0.J(cVar2, new e(cVar2, jLongValue2, null), kVar2);
                            if (objJ2 != aVar) {
                                r0 r0Var5 = r0Var;
                                v2Var5 = v2Var4;
                                objJ4 = objJ2;
                                r0Var2 = r0Var5;
                                v2Var6 = v2Var2;
                                l17 = l16;
                                str6 = str5;
                                v2Var7 = (v2) objJ4;
                                if (!(v2Var5 instanceof v2.b)) {
                                    rVar = null;
                                    activityDetailChartDTO = null;
                                    r0Var3 = r0Var2;
                                    v2Var8 = v2Var6;
                                    l18 = l17;
                                    str7 = str6;
                                    if (v2Var7 instanceof v2.b) {
                                        nVar2 = (ps.n) ((v2.b) v2Var7).f47386a;
                                        long jLongValue3 = l18.longValue();
                                        kVar2.f179071a = str7;
                                        kVar2.f179072b = l18;
                                        kVar2.f179073c = v2Var8;
                                        kVar2.f179074d = r0Var3;
                                        kVar2.f179075e = null;
                                        kVar2.f179076f = null;
                                        kVar2.f179077g = activityDetailChartDTO;
                                        kVar2.f179078h = rVar;
                                        kVar2.f179079i = nVar2;
                                        kVar2.f179082l = 6;
                                        objJ3 = f0.J(cVar2, new g(cVar2, jLongValue3, null), kVar2);
                                        if (objJ3 != aVar) {
                                            v2Var11 = v2Var8;
                                            objJ4 = objJ3;
                                            str9 = str7;
                                            v2Var13 = (v2) objJ4;
                                            if (v2Var13 instanceof v2.b) {
                                                nVar = nVar2;
                                                rVar4 = rVar;
                                                activityDetailChartDTO2 = activityDetailChartDTO;
                                                str8 = str9;
                                                l19 = l18;
                                                y1Var = (y1) ((v2.b) v2Var13).f47386a;
                                                v2Var8 = v2Var11;
                                            } else {
                                                nVar = nVar2;
                                                rVar4 = rVar;
                                                activityDetailChartDTO2 = activityDetailChartDTO;
                                                str8 = str9;
                                                v2Var8 = v2Var11;
                                                y1Var = null;
                                            }
                                            if (!(v2Var8 instanceof v2.b)) {
                                                return new v2.a(new Exception("Something went wrong while fetching social GroupRide details with activity!"), null, null, 6, null);
                                            }
                                            if (rVar4 != null) {
                                                activityName = rVar4.getActivityName();
                                            } else {
                                                activityName = null;
                                            }
                                            v2.b bVar2 = (v2.b) v2Var8;
                                            return new v2.b(new yo1.h(l19, str8, activityName, (yo1.j) bVar2.f47386a, rVar4, nVar, y1Var != null ? y1Var.d() : null, activityDetailChartDTO2, (yo1.f) r0Var3.f105810a, false, 512, null), bVar2.f47387b, null, null, 12, null);
                                        }
                                    } else {
                                        rVar4 = rVar;
                                        activityDetailChartDTO2 = activityDetailChartDTO;
                                        y1Var = null;
                                        nVar = null;
                                        str8 = str7;
                                    }
                                    l19 = l18;
                                    if (!(v2Var8 instanceof v2.b)) {
                                        return new v2.a(new Exception("Something went wrong while fetching social GroupRide details with activity!"), null, null, 6, null);
                                    }
                                    if (rVar4 != null) {
                                        activityName = rVar4.getActivityName();
                                    } else {
                                        activityName = null;
                                    }
                                    v2.b bVar3 = (v2.b) v2Var8;
                                    return new v2.b(new yo1.h(l19, str8, activityName, (yo1.j) bVar3.f47386a, rVar4, nVar, y1Var != null ? y1Var.d() : null, activityDetailChartDTO2, (yo1.f) r0Var3.f105810a, false, 512, null), bVar3.f47387b, null, null, 12, null);
                                }
                                rVar2 = (ps.r) ((v2.b) v2Var5).f47386a;
                                long jLongValue4 = l17.longValue();
                                summaryDTO = rVar2.getSummaryDTO();
                                if (summaryDTO != null) {
                                    numberOfActiveLengths = summaryDTO.getNumberOfActiveLengths();
                                } else {
                                    numberOfActiveLengths = null;
                                }
                                kVar2.f179071a = str6;
                                kVar2.f179072b = l17;
                                kVar2.f179073c = v2Var6;
                                kVar2.f179074d = r0Var2;
                                kVar2.f179075e = null;
                                kVar2.f179076f = v2Var7;
                                kVar2.f179077g = rVar2;
                                kVar2.f179082l = 5;
                                cVar2 = this;
                                objJ4 = f0.J(cVar2, new d(new b0().a(numberOfActiveLengths), this, jLongValue4, null), kVar2);
                                if (objJ4 != aVar) {
                                    r0Var4 = r0Var2;
                                    v2Var9 = v2Var6;
                                    l18 = l17;
                                    str7 = str6;
                                    v2Var10 = v2Var7;
                                    rVar3 = rVar2;
                                    v2Var12 = (v2) objJ4;
                                    if (v2Var12 instanceof v2.b) {
                                        r0 r0Var6 = r0Var4;
                                        activityDetailChartDTO = (ActivityDetailChartDTO) ((v2.b) v2Var12).f47386a;
                                        v2Var8 = v2Var9;
                                        r0Var3 = r0Var6;
                                        v2Var7 = v2Var10;
                                        rVar = rVar3;
                                    } else {
                                        v2Var7 = v2Var10;
                                        v2Var8 = v2Var9;
                                        rVar = rVar3;
                                        r0Var3 = r0Var4;
                                        activityDetailChartDTO = null;
                                    }
                                    if (v2Var7 instanceof v2.b) {
                                        nVar2 = (ps.n) ((v2.b) v2Var7).f47386a;
                                        long jLongValue5 = l18.longValue();
                                        kVar2.f179071a = str7;
                                        kVar2.f179072b = l18;
                                        kVar2.f179073c = v2Var8;
                                        kVar2.f179074d = r0Var3;
                                        kVar2.f179075e = null;
                                        kVar2.f179076f = null;
                                        kVar2.f179077g = activityDetailChartDTO;
                                        kVar2.f179078h = rVar;
                                        kVar2.f179079i = nVar2;
                                        kVar2.f179082l = 6;
                                        objJ3 = f0.J(cVar2, new g(cVar2, jLongValue5, null), kVar2);
                                        if (objJ3 != aVar) {
                                            v2Var11 = v2Var8;
                                            objJ4 = objJ3;
                                            str9 = str7;
                                            v2Var13 = (v2) objJ4;
                                            if (v2Var13 instanceof v2.b) {
                                                nVar = nVar2;
                                                rVar4 = rVar;
                                                activityDetailChartDTO2 = activityDetailChartDTO;
                                                str8 = str9;
                                                l19 = l18;
                                                y1Var = (y1) ((v2.b) v2Var13).f47386a;
                                                v2Var8 = v2Var11;
                                            } else {
                                                nVar = nVar2;
                                                rVar4 = rVar;
                                                activityDetailChartDTO2 = activityDetailChartDTO;
                                                str8 = str9;
                                                v2Var8 = v2Var11;
                                                y1Var = null;
                                            }
                                            if (!(v2Var8 instanceof v2.b)) {
                                                return new v2.a(new Exception("Something went wrong while fetching social GroupRide details with activity!"), null, null, 6, null);
                                            }
                                            if (rVar4 != null) {
                                                activityName = rVar4.getActivityName();
                                            } else {
                                                activityName = null;
                                            }
                                            v2.b bVar4 = (v2.b) v2Var8;
                                            return new v2.b(new yo1.h(l19, str8, activityName, (yo1.j) bVar4.f47386a, rVar4, nVar, y1Var != null ? y1Var.d() : null, activityDetailChartDTO2, (yo1.f) r0Var3.f105810a, false, 512, null), bVar4.f47387b, null, null, 12, null);
                                        }
                                    } else {
                                        rVar4 = rVar;
                                        activityDetailChartDTO2 = activityDetailChartDTO;
                                        y1Var = null;
                                        nVar = null;
                                        str8 = str7;
                                    }
                                    l19 = l18;
                                    if (!(v2Var8 instanceof v2.b)) {
                                        return new v2.a(new Exception("Something went wrong while fetching social GroupRide details with activity!"), null, null, 6, null);
                                    }
                                    if (rVar4 != null) {
                                        activityName = rVar4.getActivityName();
                                    } else {
                                        activityName = null;
                                    }
                                    v2.b bVar5 = (v2.b) v2Var8;
                                    return new v2.b(new yo1.h(l19, str8, activityName, (yo1.j) bVar5.f47386a, rVar4, nVar, y1Var != null ? y1Var.d() : null, activityDetailChartDTO2, (yo1.f) r0Var3.f105810a, false, 512, null), bVar5.f47387b, null, null, 12, null);
                                }
                            }
                        }
                    }
                }
                return aVar;
            case 1:
                l15 = kVar2.f179072b;
                str3 = kVar2.f179071a;
                r.b(objJ4);
                v2Var = (v2) objJ4;
                kVar2.f179071a = str3;
                kVar2.f179072b = l15;
                kVar2.f179073c = v2Var;
                kVar2.f179082l = 2;
                objJ = f0.J(cVar2, new i(cVar2, str3, l15, null), kVar2);
                if (objJ != aVar) {
                    str4 = str3;
                    v2Var2 = v2Var;
                    objJ4 = objJ;
                    l16 = l15;
                    v2Var3 = (v2) objJ4;
                    r0Var = new r0();
                    if (v2Var3 instanceof v2.b) {
                        r0Var.f105810a = ((v2.b) v2Var3).f47386a;
                    }
                    if (l16 == null) {
                        if (!(v2Var2 instanceof v2.b)) {
                            return new v2.a(new Exception("Something went wrong while fetching social GroupRide details with activity!"), null, null, 6, null);
                        }
                        arrayList = new ArrayList();
                        fVar = (yo1.f) r0Var.f105810a;
                        if (fVar != null) {
                            it = listD.iterator();
                            while (it.hasNext()) {
                                while (r5.hasNext()) {
                                    if (((yo1.f) r0Var.f105810a).getForUserPk() == eVar.getUserPk()) {
                                        arrayList.add(eVar.getRideData().j());
                                    }
                                }
                            }
                        }
                        v2.b bVar6 = (v2.b) v2Var2;
                        yo1.j jVar2 = (yo1.j) bVar6.f47386a;
                        if (arrayList.isEmpty()) {
                            arrayList2 = null;
                        } else {
                            arrayList2 = arrayList;
                        }
                        return new v2.b(new yo1.h(null, str4, null, jVar2, null, null, arrayList2, null, (yo1.f) r0Var.f105810a, false, 517, null), bVar6.f47387b, null, null, 12, null);
                    }
                    long jLongValue6 = l16.longValue();
                    kVar2.f179071a = str4;
                    kVar2.f179072b = l16;
                    kVar2.f179073c = v2Var2;
                    kVar2.f179074d = r0Var;
                    kVar2.f179082l = 3;
                    objJ4 = f0.J(cVar2, new f(cVar2, jLongValue6, null), kVar2);
                    if (objJ4 != aVar) {
                        str5 = str4;
                        v2Var4 = (v2) objJ4;
                        long jLongValue7 = l16.longValue();
                        kVar2.f179071a = str5;
                        kVar2.f179072b = l16;
                        kVar2.f179073c = v2Var2;
                        kVar2.f179074d = r0Var;
                        kVar2.f179075e = v2Var4;
                        kVar2.f179082l = 4;
                        objJ2 = f0.J(cVar2, new e(cVar2, jLongValue7, null), kVar2);
                        if (objJ2 != aVar) {
                            r0 r0Var7 = r0Var;
                            v2Var5 = v2Var4;
                            objJ4 = objJ2;
                            r0Var2 = r0Var7;
                            v2Var6 = v2Var2;
                            l17 = l16;
                            str6 = str5;
                            v2Var7 = (v2) objJ4;
                            if (!(v2Var5 instanceof v2.b)) {
                                rVar = null;
                                activityDetailChartDTO = null;
                                r0Var3 = r0Var2;
                                v2Var8 = v2Var6;
                                l18 = l17;
                                str7 = str6;
                                if (v2Var7 instanceof v2.b) {
                                    nVar2 = (ps.n) ((v2.b) v2Var7).f47386a;
                                    long jLongValue8 = l18.longValue();
                                    kVar2.f179071a = str7;
                                    kVar2.f179072b = l18;
                                    kVar2.f179073c = v2Var8;
                                    kVar2.f179074d = r0Var3;
                                    kVar2.f179075e = null;
                                    kVar2.f179076f = null;
                                    kVar2.f179077g = activityDetailChartDTO;
                                    kVar2.f179078h = rVar;
                                    kVar2.f179079i = nVar2;
                                    kVar2.f179082l = 6;
                                    objJ3 = f0.J(cVar2, new g(cVar2, jLongValue8, null), kVar2);
                                    if (objJ3 != aVar) {
                                        v2Var11 = v2Var8;
                                        objJ4 = objJ3;
                                        str9 = str7;
                                        v2Var13 = (v2) objJ4;
                                        if (v2Var13 instanceof v2.b) {
                                            nVar = nVar2;
                                            rVar4 = rVar;
                                            activityDetailChartDTO2 = activityDetailChartDTO;
                                            str8 = str9;
                                            l19 = l18;
                                            y1Var = (y1) ((v2.b) v2Var13).f47386a;
                                            v2Var8 = v2Var11;
                                        } else {
                                            nVar = nVar2;
                                            rVar4 = rVar;
                                            activityDetailChartDTO2 = activityDetailChartDTO;
                                            str8 = str9;
                                            v2Var8 = v2Var11;
                                            y1Var = null;
                                        }
                                        if (!(v2Var8 instanceof v2.b)) {
                                            return new v2.a(new Exception("Something went wrong while fetching social GroupRide details with activity!"), null, null, 6, null);
                                        }
                                        if (rVar4 != null) {
                                            activityName = rVar4.getActivityName();
                                        } else {
                                            activityName = null;
                                        }
                                        v2.b bVar7 = (v2.b) v2Var8;
                                        return new v2.b(new yo1.h(l19, str8, activityName, (yo1.j) bVar7.f47386a, rVar4, nVar, y1Var != null ? y1Var.d() : null, activityDetailChartDTO2, (yo1.f) r0Var3.f105810a, false, 512, null), bVar7.f47387b, null, null, 12, null);
                                    }
                                } else {
                                    rVar4 = rVar;
                                    activityDetailChartDTO2 = activityDetailChartDTO;
                                    y1Var = null;
                                    nVar = null;
                                    str8 = str7;
                                }
                                l19 = l18;
                                if (!(v2Var8 instanceof v2.b)) {
                                    return new v2.a(new Exception("Something went wrong while fetching social GroupRide details with activity!"), null, null, 6, null);
                                }
                                if (rVar4 != null) {
                                    activityName = rVar4.getActivityName();
                                } else {
                                    activityName = null;
                                }
                                v2.b bVar8 = (v2.b) v2Var8;
                                return new v2.b(new yo1.h(l19, str8, activityName, (yo1.j) bVar8.f47386a, rVar4, nVar, y1Var != null ? y1Var.d() : null, activityDetailChartDTO2, (yo1.f) r0Var3.f105810a, false, 512, null), bVar8.f47387b, null, null, 12, null);
                            }
                            rVar2 = (ps.r) ((v2.b) v2Var5).f47386a;
                            long jLongValue9 = l17.longValue();
                            summaryDTO = rVar2.getSummaryDTO();
                            if (summaryDTO != null) {
                                numberOfActiveLengths = summaryDTO.getNumberOfActiveLengths();
                            } else {
                                numberOfActiveLengths = null;
                            }
                            kVar2.f179071a = str6;
                            kVar2.f179072b = l17;
                            kVar2.f179073c = v2Var6;
                            kVar2.f179074d = r0Var2;
                            kVar2.f179075e = null;
                            kVar2.f179076f = v2Var7;
                            kVar2.f179077g = rVar2;
                            kVar2.f179082l = 5;
                            cVar2 = this;
                            objJ4 = f0.J(cVar2, new d(new b0().a(numberOfActiveLengths), this, jLongValue9, null), kVar2);
                            if (objJ4 != aVar) {
                                r0Var4 = r0Var2;
                                v2Var9 = v2Var6;
                                l18 = l17;
                                str7 = str6;
                                v2Var10 = v2Var7;
                                rVar3 = rVar2;
                                v2Var12 = (v2) objJ4;
                                if (v2Var12 instanceof v2.b) {
                                    r0 r0Var8 = r0Var4;
                                    activityDetailChartDTO = (ActivityDetailChartDTO) ((v2.b) v2Var12).f47386a;
                                    v2Var8 = v2Var9;
                                    r0Var3 = r0Var8;
                                    v2Var7 = v2Var10;
                                    rVar = rVar3;
                                } else {
                                    v2Var7 = v2Var10;
                                    v2Var8 = v2Var9;
                                    rVar = rVar3;
                                    r0Var3 = r0Var4;
                                    activityDetailChartDTO = null;
                                }
                                if (v2Var7 instanceof v2.b) {
                                    nVar2 = (ps.n) ((v2.b) v2Var7).f47386a;
                                    long jLongValue10 = l18.longValue();
                                    kVar2.f179071a = str7;
                                    kVar2.f179072b = l18;
                                    kVar2.f179073c = v2Var8;
                                    kVar2.f179074d = r0Var3;
                                    kVar2.f179075e = null;
                                    kVar2.f179076f = null;
                                    kVar2.f179077g = activityDetailChartDTO;
                                    kVar2.f179078h = rVar;
                                    kVar2.f179079i = nVar2;
                                    kVar2.f179082l = 6;
                                    objJ3 = f0.J(cVar2, new g(cVar2, jLongValue10, null), kVar2);
                                    if (objJ3 != aVar) {
                                        v2Var11 = v2Var8;
                                        objJ4 = objJ3;
                                        str9 = str7;
                                        v2Var13 = (v2) objJ4;
                                        if (v2Var13 instanceof v2.b) {
                                            nVar = nVar2;
                                            rVar4 = rVar;
                                            activityDetailChartDTO2 = activityDetailChartDTO;
                                            str8 = str9;
                                            l19 = l18;
                                            y1Var = (y1) ((v2.b) v2Var13).f47386a;
                                            v2Var8 = v2Var11;
                                        } else {
                                            nVar = nVar2;
                                            rVar4 = rVar;
                                            activityDetailChartDTO2 = activityDetailChartDTO;
                                            str8 = str9;
                                            v2Var8 = v2Var11;
                                            y1Var = null;
                                        }
                                        if (!(v2Var8 instanceof v2.b)) {
                                            return new v2.a(new Exception("Something went wrong while fetching social GroupRide details with activity!"), null, null, 6, null);
                                        }
                                        if (rVar4 != null) {
                                            activityName = rVar4.getActivityName();
                                        } else {
                                            activityName = null;
                                        }
                                        v2.b bVar9 = (v2.b) v2Var8;
                                        return new v2.b(new yo1.h(l19, str8, activityName, (yo1.j) bVar9.f47386a, rVar4, nVar, y1Var != null ? y1Var.d() : null, activityDetailChartDTO2, (yo1.f) r0Var3.f105810a, false, 512, null), bVar9.f47387b, null, null, 12, null);
                                    }
                                } else {
                                    rVar4 = rVar;
                                    activityDetailChartDTO2 = activityDetailChartDTO;
                                    y1Var = null;
                                    nVar = null;
                                    str8 = str7;
                                }
                                l19 = l18;
                                if (!(v2Var8 instanceof v2.b)) {
                                    return new v2.a(new Exception("Something went wrong while fetching social GroupRide details with activity!"), null, null, 6, null);
                                }
                                if (rVar4 != null) {
                                    activityName = rVar4.getActivityName();
                                } else {
                                    activityName = null;
                                }
                                v2.b bVar10 = (v2.b) v2Var8;
                                return new v2.b(new yo1.h(l19, str8, activityName, (yo1.j) bVar10.f47386a, rVar4, nVar, y1Var != null ? y1Var.d() : null, activityDetailChartDTO2, (yo1.f) r0Var3.f105810a, false, 512, null), bVar10.f47387b, null, null, 12, null);
                            }
                        }
                    }
                }
                return aVar;
            case 2:
                v2 v2Var14 = kVar2.f179073c;
                Long l24 = kVar2.f179072b;
                String str10 = kVar2.f179071a;
                r.b(objJ4);
                str4 = str10;
                l16 = l24;
                v2Var2 = v2Var14;
                v2Var3 = (v2) objJ4;
                r0Var = new r0();
                if (v2Var3 instanceof v2.b) {
                    r0Var.f105810a = ((v2.b) v2Var3).f47386a;
                }
                if (l16 == null) {
                    if (!(v2Var2 instanceof v2.b)) {
                        return new v2.a(new Exception("Something went wrong while fetching social GroupRide details with activity!"), null, null, 6, null);
                    }
                    arrayList = new ArrayList();
                    fVar = (yo1.f) r0Var.f105810a;
                    if (fVar != null) {
                        it = listD.iterator();
                        while (it.hasNext()) {
                            while (r5.hasNext()) {
                                if (((yo1.f) r0Var.f105810a).getForUserPk() == eVar.getUserPk()) {
                                    arrayList.add(eVar.getRideData().j());
                                }
                            }
                        }
                    }
                    v2.b bVar11 = (v2.b) v2Var2;
                    yo1.j jVar3 = (yo1.j) bVar11.f47386a;
                    if (arrayList.isEmpty()) {
                        arrayList2 = null;
                    } else {
                        arrayList2 = arrayList;
                    }
                    return new v2.b(new yo1.h(null, str4, null, jVar3, null, null, arrayList2, null, (yo1.f) r0Var.f105810a, false, 517, null), bVar11.f47387b, null, null, 12, null);
                }
                long jLongValue11 = l16.longValue();
                kVar2.f179071a = str4;
                kVar2.f179072b = l16;
                kVar2.f179073c = v2Var2;
                kVar2.f179074d = r0Var;
                kVar2.f179082l = 3;
                objJ4 = f0.J(cVar2, new f(cVar2, jLongValue11, null), kVar2);
                if (objJ4 != aVar) {
                    str5 = str4;
                    v2Var4 = (v2) objJ4;
                    long jLongValue12 = l16.longValue();
                    kVar2.f179071a = str5;
                    kVar2.f179072b = l16;
                    kVar2.f179073c = v2Var2;
                    kVar2.f179074d = r0Var;
                    kVar2.f179075e = v2Var4;
                    kVar2.f179082l = 4;
                    objJ2 = f0.J(cVar2, new e(cVar2, jLongValue12, null), kVar2);
                    if (objJ2 != aVar) {
                        r0 r0Var9 = r0Var;
                        v2Var5 = v2Var4;
                        objJ4 = objJ2;
                        r0Var2 = r0Var9;
                        v2Var6 = v2Var2;
                        l17 = l16;
                        str6 = str5;
                        v2Var7 = (v2) objJ4;
                        if (!(v2Var5 instanceof v2.b)) {
                            rVar = null;
                            activityDetailChartDTO = null;
                            r0Var3 = r0Var2;
                            v2Var8 = v2Var6;
                            l18 = l17;
                            str7 = str6;
                            if (v2Var7 instanceof v2.b) {
                                nVar2 = (ps.n) ((v2.b) v2Var7).f47386a;
                                long jLongValue13 = l18.longValue();
                                kVar2.f179071a = str7;
                                kVar2.f179072b = l18;
                                kVar2.f179073c = v2Var8;
                                kVar2.f179074d = r0Var3;
                                kVar2.f179075e = null;
                                kVar2.f179076f = null;
                                kVar2.f179077g = activityDetailChartDTO;
                                kVar2.f179078h = rVar;
                                kVar2.f179079i = nVar2;
                                kVar2.f179082l = 6;
                                objJ3 = f0.J(cVar2, new g(cVar2, jLongValue13, null), kVar2);
                                if (objJ3 != aVar) {
                                    v2Var11 = v2Var8;
                                    objJ4 = objJ3;
                                    str9 = str7;
                                    v2Var13 = (v2) objJ4;
                                    if (v2Var13 instanceof v2.b) {
                                        nVar = nVar2;
                                        rVar4 = rVar;
                                        activityDetailChartDTO2 = activityDetailChartDTO;
                                        str8 = str9;
                                        l19 = l18;
                                        y1Var = (y1) ((v2.b) v2Var13).f47386a;
                                        v2Var8 = v2Var11;
                                    } else {
                                        nVar = nVar2;
                                        rVar4 = rVar;
                                        activityDetailChartDTO2 = activityDetailChartDTO;
                                        str8 = str9;
                                        v2Var8 = v2Var11;
                                        y1Var = null;
                                    }
                                    if (!(v2Var8 instanceof v2.b)) {
                                        return new v2.a(new Exception("Something went wrong while fetching social GroupRide details with activity!"), null, null, 6, null);
                                    }
                                    if (rVar4 != null) {
                                        activityName = rVar4.getActivityName();
                                    } else {
                                        activityName = null;
                                    }
                                    v2.b bVar12 = (v2.b) v2Var8;
                                    return new v2.b(new yo1.h(l19, str8, activityName, (yo1.j) bVar12.f47386a, rVar4, nVar, y1Var != null ? y1Var.d() : null, activityDetailChartDTO2, (yo1.f) r0Var3.f105810a, false, 512, null), bVar12.f47387b, null, null, 12, null);
                                }
                            } else {
                                rVar4 = rVar;
                                activityDetailChartDTO2 = activityDetailChartDTO;
                                y1Var = null;
                                nVar = null;
                                str8 = str7;
                            }
                            l19 = l18;
                            if (!(v2Var8 instanceof v2.b)) {
                                return new v2.a(new Exception("Something went wrong while fetching social GroupRide details with activity!"), null, null, 6, null);
                            }
                            if (rVar4 != null) {
                                activityName = rVar4.getActivityName();
                            } else {
                                activityName = null;
                            }
                            v2.b bVar13 = (v2.b) v2Var8;
                            return new v2.b(new yo1.h(l19, str8, activityName, (yo1.j) bVar13.f47386a, rVar4, nVar, y1Var != null ? y1Var.d() : null, activityDetailChartDTO2, (yo1.f) r0Var3.f105810a, false, 512, null), bVar13.f47387b, null, null, 12, null);
                        }
                        rVar2 = (ps.r) ((v2.b) v2Var5).f47386a;
                        long jLongValue14 = l17.longValue();
                        summaryDTO = rVar2.getSummaryDTO();
                        if (summaryDTO != null) {
                            numberOfActiveLengths = summaryDTO.getNumberOfActiveLengths();
                        } else {
                            numberOfActiveLengths = null;
                        }
                        kVar2.f179071a = str6;
                        kVar2.f179072b = l17;
                        kVar2.f179073c = v2Var6;
                        kVar2.f179074d = r0Var2;
                        kVar2.f179075e = null;
                        kVar2.f179076f = v2Var7;
                        kVar2.f179077g = rVar2;
                        kVar2.f179082l = 5;
                        cVar2 = this;
                        objJ4 = f0.J(cVar2, new d(new b0().a(numberOfActiveLengths), this, jLongValue14, null), kVar2);
                        if (objJ4 != aVar) {
                            r0Var4 = r0Var2;
                            v2Var9 = v2Var6;
                            l18 = l17;
                            str7 = str6;
                            v2Var10 = v2Var7;
                            rVar3 = rVar2;
                            v2Var12 = (v2) objJ4;
                            if (v2Var12 instanceof v2.b) {
                                r0 r0Var10 = r0Var4;
                                activityDetailChartDTO = (ActivityDetailChartDTO) ((v2.b) v2Var12).f47386a;
                                v2Var8 = v2Var9;
                                r0Var3 = r0Var10;
                                v2Var7 = v2Var10;
                                rVar = rVar3;
                            } else {
                                v2Var7 = v2Var10;
                                v2Var8 = v2Var9;
                                rVar = rVar3;
                                r0Var3 = r0Var4;
                                activityDetailChartDTO = null;
                            }
                            if (v2Var7 instanceof v2.b) {
                                nVar2 = (ps.n) ((v2.b) v2Var7).f47386a;
                                long jLongValue15 = l18.longValue();
                                kVar2.f179071a = str7;
                                kVar2.f179072b = l18;
                                kVar2.f179073c = v2Var8;
                                kVar2.f179074d = r0Var3;
                                kVar2.f179075e = null;
                                kVar2.f179076f = null;
                                kVar2.f179077g = activityDetailChartDTO;
                                kVar2.f179078h = rVar;
                                kVar2.f179079i = nVar2;
                                kVar2.f179082l = 6;
                                objJ3 = f0.J(cVar2, new g(cVar2, jLongValue15, null), kVar2);
                                if (objJ3 != aVar) {
                                    v2Var11 = v2Var8;
                                    objJ4 = objJ3;
                                    str9 = str7;
                                    v2Var13 = (v2) objJ4;
                                    if (v2Var13 instanceof v2.b) {
                                        nVar = nVar2;
                                        rVar4 = rVar;
                                        activityDetailChartDTO2 = activityDetailChartDTO;
                                        str8 = str9;
                                        l19 = l18;
                                        y1Var = (y1) ((v2.b) v2Var13).f47386a;
                                        v2Var8 = v2Var11;
                                    } else {
                                        nVar = nVar2;
                                        rVar4 = rVar;
                                        activityDetailChartDTO2 = activityDetailChartDTO;
                                        str8 = str9;
                                        v2Var8 = v2Var11;
                                        y1Var = null;
                                    }
                                    if (!(v2Var8 instanceof v2.b)) {
                                        return new v2.a(new Exception("Something went wrong while fetching social GroupRide details with activity!"), null, null, 6, null);
                                    }
                                    if (rVar4 != null) {
                                        activityName = rVar4.getActivityName();
                                    } else {
                                        activityName = null;
                                    }
                                    v2.b bVar14 = (v2.b) v2Var8;
                                    return new v2.b(new yo1.h(l19, str8, activityName, (yo1.j) bVar14.f47386a, rVar4, nVar, y1Var != null ? y1Var.d() : null, activityDetailChartDTO2, (yo1.f) r0Var3.f105810a, false, 512, null), bVar14.f47387b, null, null, 12, null);
                                }
                            } else {
                                rVar4 = rVar;
                                activityDetailChartDTO2 = activityDetailChartDTO;
                                y1Var = null;
                                nVar = null;
                                str8 = str7;
                            }
                            l19 = l18;
                            if (!(v2Var8 instanceof v2.b)) {
                                return new v2.a(new Exception("Something went wrong while fetching social GroupRide details with activity!"), null, null, 6, null);
                            }
                            if (rVar4 != null) {
                                activityName = rVar4.getActivityName();
                            } else {
                                activityName = null;
                            }
                            v2.b bVar15 = (v2.b) v2Var8;
                            return new v2.b(new yo1.h(l19, str8, activityName, (yo1.j) bVar15.f47386a, rVar4, nVar, y1Var != null ? y1Var.d() : null, activityDetailChartDTO2, (yo1.f) r0Var3.f105810a, false, 512, null), bVar15.f47387b, null, null, 12, null);
                        }
                    }
                }
                return aVar;
            case 3:
                r0Var = kVar2.f179074d;
                v2Var2 = kVar2.f179073c;
                l16 = kVar2.f179072b;
                str5 = kVar2.f179071a;
                r.b(objJ4);
                v2Var4 = (v2) objJ4;
                long jLongValue16 = l16.longValue();
                kVar2.f179071a = str5;
                kVar2.f179072b = l16;
                kVar2.f179073c = v2Var2;
                kVar2.f179074d = r0Var;
                kVar2.f179075e = v2Var4;
                kVar2.f179082l = 4;
                objJ2 = f0.J(cVar2, new e(cVar2, jLongValue16, null), kVar2);
                if (objJ2 != aVar) {
                    r0 r0Var11 = r0Var;
                    v2Var5 = v2Var4;
                    objJ4 = objJ2;
                    r0Var2 = r0Var11;
                    v2Var6 = v2Var2;
                    l17 = l16;
                    str6 = str5;
                    v2Var7 = (v2) objJ4;
                    if (!(v2Var5 instanceof v2.b)) {
                        rVar = null;
                        activityDetailChartDTO = null;
                        r0Var3 = r0Var2;
                        v2Var8 = v2Var6;
                        l18 = l17;
                        str7 = str6;
                        if (v2Var7 instanceof v2.b) {
                            nVar2 = (ps.n) ((v2.b) v2Var7).f47386a;
                            long jLongValue17 = l18.longValue();
                            kVar2.f179071a = str7;
                            kVar2.f179072b = l18;
                            kVar2.f179073c = v2Var8;
                            kVar2.f179074d = r0Var3;
                            kVar2.f179075e = null;
                            kVar2.f179076f = null;
                            kVar2.f179077g = activityDetailChartDTO;
                            kVar2.f179078h = rVar;
                            kVar2.f179079i = nVar2;
                            kVar2.f179082l = 6;
                            objJ3 = f0.J(cVar2, new g(cVar2, jLongValue17, null), kVar2);
                            if (objJ3 != aVar) {
                                v2Var11 = v2Var8;
                                objJ4 = objJ3;
                                str9 = str7;
                                v2Var13 = (v2) objJ4;
                                if (v2Var13 instanceof v2.b) {
                                    nVar = nVar2;
                                    rVar4 = rVar;
                                    activityDetailChartDTO2 = activityDetailChartDTO;
                                    str8 = str9;
                                    l19 = l18;
                                    y1Var = (y1) ((v2.b) v2Var13).f47386a;
                                    v2Var8 = v2Var11;
                                } else {
                                    nVar = nVar2;
                                    rVar4 = rVar;
                                    activityDetailChartDTO2 = activityDetailChartDTO;
                                    str8 = str9;
                                    v2Var8 = v2Var11;
                                    y1Var = null;
                                }
                                if (!(v2Var8 instanceof v2.b)) {
                                    return new v2.a(new Exception("Something went wrong while fetching social GroupRide details with activity!"), null, null, 6, null);
                                }
                                if (rVar4 != null) {
                                    activityName = rVar4.getActivityName();
                                } else {
                                    activityName = null;
                                }
                                v2.b bVar16 = (v2.b) v2Var8;
                                return new v2.b(new yo1.h(l19, str8, activityName, (yo1.j) bVar16.f47386a, rVar4, nVar, y1Var != null ? y1Var.d() : null, activityDetailChartDTO2, (yo1.f) r0Var3.f105810a, false, 512, null), bVar16.f47387b, null, null, 12, null);
                            }
                        } else {
                            rVar4 = rVar;
                            activityDetailChartDTO2 = activityDetailChartDTO;
                            y1Var = null;
                            nVar = null;
                            str8 = str7;
                        }
                        l19 = l18;
                        if (!(v2Var8 instanceof v2.b)) {
                            return new v2.a(new Exception("Something went wrong while fetching social GroupRide details with activity!"), null, null, 6, null);
                        }
                        if (rVar4 != null) {
                            activityName = rVar4.getActivityName();
                        } else {
                            activityName = null;
                        }
                        v2.b bVar17 = (v2.b) v2Var8;
                        return new v2.b(new yo1.h(l19, str8, activityName, (yo1.j) bVar17.f47386a, rVar4, nVar, y1Var != null ? y1Var.d() : null, activityDetailChartDTO2, (yo1.f) r0Var3.f105810a, false, 512, null), bVar17.f47387b, null, null, 12, null);
                    }
                    rVar2 = (ps.r) ((v2.b) v2Var5).f47386a;
                    long jLongValue18 = l17.longValue();
                    summaryDTO = rVar2.getSummaryDTO();
                    if (summaryDTO != null) {
                        numberOfActiveLengths = summaryDTO.getNumberOfActiveLengths();
                    } else {
                        numberOfActiveLengths = null;
                    }
                    kVar2.f179071a = str6;
                    kVar2.f179072b = l17;
                    kVar2.f179073c = v2Var6;
                    kVar2.f179074d = r0Var2;
                    kVar2.f179075e = null;
                    kVar2.f179076f = v2Var7;
                    kVar2.f179077g = rVar2;
                    kVar2.f179082l = 5;
                    cVar2 = this;
                    objJ4 = f0.J(cVar2, new d(new b0().a(numberOfActiveLengths), this, jLongValue18, null), kVar2);
                    if (objJ4 != aVar) {
                        r0Var4 = r0Var2;
                        v2Var9 = v2Var6;
                        l18 = l17;
                        str7 = str6;
                        v2Var10 = v2Var7;
                        rVar3 = rVar2;
                        v2Var12 = (v2) objJ4;
                        if (v2Var12 instanceof v2.b) {
                            r0 r0Var12 = r0Var4;
                            activityDetailChartDTO = (ActivityDetailChartDTO) ((v2.b) v2Var12).f47386a;
                            v2Var8 = v2Var9;
                            r0Var3 = r0Var12;
                            v2Var7 = v2Var10;
                            rVar = rVar3;
                        } else {
                            v2Var7 = v2Var10;
                            v2Var8 = v2Var9;
                            rVar = rVar3;
                            r0Var3 = r0Var4;
                            activityDetailChartDTO = null;
                        }
                        if (v2Var7 instanceof v2.b) {
                            nVar2 = (ps.n) ((v2.b) v2Var7).f47386a;
                            long jLongValue19 = l18.longValue();
                            kVar2.f179071a = str7;
                            kVar2.f179072b = l18;
                            kVar2.f179073c = v2Var8;
                            kVar2.f179074d = r0Var3;
                            kVar2.f179075e = null;
                            kVar2.f179076f = null;
                            kVar2.f179077g = activityDetailChartDTO;
                            kVar2.f179078h = rVar;
                            kVar2.f179079i = nVar2;
                            kVar2.f179082l = 6;
                            objJ3 = f0.J(cVar2, new g(cVar2, jLongValue19, null), kVar2);
                            if (objJ3 != aVar) {
                                v2Var11 = v2Var8;
                                objJ4 = objJ3;
                                str9 = str7;
                                v2Var13 = (v2) objJ4;
                                if (v2Var13 instanceof v2.b) {
                                    nVar = nVar2;
                                    rVar4 = rVar;
                                    activityDetailChartDTO2 = activityDetailChartDTO;
                                    str8 = str9;
                                    l19 = l18;
                                    y1Var = (y1) ((v2.b) v2Var13).f47386a;
                                    v2Var8 = v2Var11;
                                } else {
                                    nVar = nVar2;
                                    rVar4 = rVar;
                                    activityDetailChartDTO2 = activityDetailChartDTO;
                                    str8 = str9;
                                    v2Var8 = v2Var11;
                                    y1Var = null;
                                }
                                if (!(v2Var8 instanceof v2.b)) {
                                    return new v2.a(new Exception("Something went wrong while fetching social GroupRide details with activity!"), null, null, 6, null);
                                }
                                if (rVar4 != null) {
                                    activityName = rVar4.getActivityName();
                                } else {
                                    activityName = null;
                                }
                                v2.b bVar18 = (v2.b) v2Var8;
                                return new v2.b(new yo1.h(l19, str8, activityName, (yo1.j) bVar18.f47386a, rVar4, nVar, y1Var != null ? y1Var.d() : null, activityDetailChartDTO2, (yo1.f) r0Var3.f105810a, false, 512, null), bVar18.f47387b, null, null, 12, null);
                            }
                        } else {
                            rVar4 = rVar;
                            activityDetailChartDTO2 = activityDetailChartDTO;
                            y1Var = null;
                            nVar = null;
                            str8 = str7;
                        }
                        l19 = l18;
                        if (!(v2Var8 instanceof v2.b)) {
                            return new v2.a(new Exception("Something went wrong while fetching social GroupRide details with activity!"), null, null, 6, null);
                        }
                        if (rVar4 != null) {
                            activityName = rVar4.getActivityName();
                        } else {
                            activityName = null;
                        }
                        v2.b bVar19 = (v2.b) v2Var8;
                        return new v2.b(new yo1.h(l19, str8, activityName, (yo1.j) bVar19.f47386a, rVar4, nVar, y1Var != null ? y1Var.d() : null, activityDetailChartDTO2, (yo1.f) r0Var3.f105810a, false, 512, null), bVar19.f47387b, null, null, 12, null);
                    }
                }
                return aVar;
            case 4:
                v2Var5 = kVar2.f179075e;
                r0 r0Var13 = kVar2.f179074d;
                v2 v2Var15 = kVar2.f179073c;
                Long l25 = kVar2.f179072b;
                String str11 = kVar2.f179071a;
                r.b(objJ4);
                v2Var6 = v2Var15;
                l17 = l25;
                str6 = str11;
                r0Var2 = r0Var13;
                v2Var7 = (v2) objJ4;
                if (!(v2Var5 instanceof v2.b)) {
                    rVar = null;
                    activityDetailChartDTO = null;
                    r0Var3 = r0Var2;
                    v2Var8 = v2Var6;
                    l18 = l17;
                    str7 = str6;
                    if (v2Var7 instanceof v2.b) {
                        nVar2 = (ps.n) ((v2.b) v2Var7).f47386a;
                        long jLongValue110 = l18.longValue();
                        kVar2.f179071a = str7;
                        kVar2.f179072b = l18;
                        kVar2.f179073c = v2Var8;
                        kVar2.f179074d = r0Var3;
                        kVar2.f179075e = null;
                        kVar2.f179076f = null;
                        kVar2.f179077g = activityDetailChartDTO;
                        kVar2.f179078h = rVar;
                        kVar2.f179079i = nVar2;
                        kVar2.f179082l = 6;
                        objJ3 = f0.J(cVar2, new g(cVar2, jLongValue110, null), kVar2);
                        if (objJ3 != aVar) {
                            v2Var11 = v2Var8;
                            objJ4 = objJ3;
                            str9 = str7;
                            v2Var13 = (v2) objJ4;
                            if (v2Var13 instanceof v2.b) {
                                nVar = nVar2;
                                rVar4 = rVar;
                                activityDetailChartDTO2 = activityDetailChartDTO;
                                str8 = str9;
                                l19 = l18;
                                y1Var = (y1) ((v2.b) v2Var13).f47386a;
                                v2Var8 = v2Var11;
                            } else {
                                nVar = nVar2;
                                rVar4 = rVar;
                                activityDetailChartDTO2 = activityDetailChartDTO;
                                str8 = str9;
                                v2Var8 = v2Var11;
                                y1Var = null;
                            }
                            if (!(v2Var8 instanceof v2.b)) {
                                return new v2.a(new Exception("Something went wrong while fetching social GroupRide details with activity!"), null, null, 6, null);
                            }
                            if (rVar4 != null) {
                                activityName = rVar4.getActivityName();
                            } else {
                                activityName = null;
                            }
                            v2.b bVar110 = (v2.b) v2Var8;
                            return new v2.b(new yo1.h(l19, str8, activityName, (yo1.j) bVar110.f47386a, rVar4, nVar, y1Var != null ? y1Var.d() : null, activityDetailChartDTO2, (yo1.f) r0Var3.f105810a, false, 512, null), bVar110.f47387b, null, null, 12, null);
                        }
                    } else {
                        rVar4 = rVar;
                        activityDetailChartDTO2 = activityDetailChartDTO;
                        y1Var = null;
                        nVar = null;
                        str8 = str7;
                    }
                    l19 = l18;
                    if (!(v2Var8 instanceof v2.b)) {
                        return new v2.a(new Exception("Something went wrong while fetching social GroupRide details with activity!"), null, null, 6, null);
                    }
                    if (rVar4 != null) {
                        activityName = rVar4.getActivityName();
                    } else {
                        activityName = null;
                    }
                    v2.b bVar111 = (v2.b) v2Var8;
                    return new v2.b(new yo1.h(l19, str8, activityName, (yo1.j) bVar111.f47386a, rVar4, nVar, y1Var != null ? y1Var.d() : null, activityDetailChartDTO2, (yo1.f) r0Var3.f105810a, false, 512, null), bVar111.f47387b, null, null, 12, null);
                }
                rVar2 = (ps.r) ((v2.b) v2Var5).f47386a;
                long jLongValue111 = l17.longValue();
                summaryDTO = rVar2.getSummaryDTO();
                if (summaryDTO != null) {
                    numberOfActiveLengths = summaryDTO.getNumberOfActiveLengths();
                } else {
                    numberOfActiveLengths = null;
                }
                kVar2.f179071a = str6;
                kVar2.f179072b = l17;
                kVar2.f179073c = v2Var6;
                kVar2.f179074d = r0Var2;
                kVar2.f179075e = null;
                kVar2.f179076f = v2Var7;
                kVar2.f179077g = rVar2;
                kVar2.f179082l = 5;
                cVar2 = this;
                objJ4 = f0.J(cVar2, new d(new b0().a(numberOfActiveLengths), this, jLongValue111, null), kVar2);
                if (objJ4 != aVar) {
                    r0Var4 = r0Var2;
                    v2Var9 = v2Var6;
                    l18 = l17;
                    str7 = str6;
                    v2Var10 = v2Var7;
                    rVar3 = rVar2;
                    v2Var12 = (v2) objJ4;
                    if (v2Var12 instanceof v2.b) {
                        r0 r0Var14 = r0Var4;
                        activityDetailChartDTO = (ActivityDetailChartDTO) ((v2.b) v2Var12).f47386a;
                        v2Var8 = v2Var9;
                        r0Var3 = r0Var14;
                        v2Var7 = v2Var10;
                        rVar = rVar3;
                    } else {
                        v2Var7 = v2Var10;
                        v2Var8 = v2Var9;
                        rVar = rVar3;
                        r0Var3 = r0Var4;
                        activityDetailChartDTO = null;
                    }
                    if (v2Var7 instanceof v2.b) {
                        nVar2 = (ps.n) ((v2.b) v2Var7).f47386a;
                        long jLongValue112 = l18.longValue();
                        kVar2.f179071a = str7;
                        kVar2.f179072b = l18;
                        kVar2.f179073c = v2Var8;
                        kVar2.f179074d = r0Var3;
                        kVar2.f179075e = null;
                        kVar2.f179076f = null;
                        kVar2.f179077g = activityDetailChartDTO;
                        kVar2.f179078h = rVar;
                        kVar2.f179079i = nVar2;
                        kVar2.f179082l = 6;
                        objJ3 = f0.J(cVar2, new g(cVar2, jLongValue112, null), kVar2);
                        if (objJ3 != aVar) {
                            v2Var11 = v2Var8;
                            objJ4 = objJ3;
                            str9 = str7;
                            v2Var13 = (v2) objJ4;
                            if (v2Var13 instanceof v2.b) {
                                nVar = nVar2;
                                rVar4 = rVar;
                                activityDetailChartDTO2 = activityDetailChartDTO;
                                str8 = str9;
                                l19 = l18;
                                y1Var = (y1) ((v2.b) v2Var13).f47386a;
                                v2Var8 = v2Var11;
                            } else {
                                nVar = nVar2;
                                rVar4 = rVar;
                                activityDetailChartDTO2 = activityDetailChartDTO;
                                str8 = str9;
                                v2Var8 = v2Var11;
                                y1Var = null;
                            }
                            if (!(v2Var8 instanceof v2.b)) {
                                return new v2.a(new Exception("Something went wrong while fetching social GroupRide details with activity!"), null, null, 6, null);
                            }
                            if (rVar4 != null) {
                                activityName = rVar4.getActivityName();
                            } else {
                                activityName = null;
                            }
                            v2.b bVar112 = (v2.b) v2Var8;
                            return new v2.b(new yo1.h(l19, str8, activityName, (yo1.j) bVar112.f47386a, rVar4, nVar, y1Var != null ? y1Var.d() : null, activityDetailChartDTO2, (yo1.f) r0Var3.f105810a, false, 512, null), bVar112.f47387b, null, null, 12, null);
                        }
                    } else {
                        rVar4 = rVar;
                        activityDetailChartDTO2 = activityDetailChartDTO;
                        y1Var = null;
                        nVar = null;
                        str8 = str7;
                    }
                    l19 = l18;
                    if (!(v2Var8 instanceof v2.b)) {
                        return new v2.a(new Exception("Something went wrong while fetching social GroupRide details with activity!"), null, null, 6, null);
                    }
                    if (rVar4 != null) {
                        activityName = rVar4.getActivityName();
                    } else {
                        activityName = null;
                    }
                    v2.b bVar113 = (v2.b) v2Var8;
                    return new v2.b(new yo1.h(l19, str8, activityName, (yo1.j) bVar113.f47386a, rVar4, nVar, y1Var != null ? y1Var.d() : null, activityDetailChartDTO2, (yo1.f) r0Var3.f105810a, false, 512, null), bVar113.f47387b, null, null, 12, null);
                }
                return aVar;
            case 5:
                rVar3 = (ps.r) kVar2.f179077g;
                v2Var10 = kVar2.f179076f;
                r0Var4 = kVar2.f179074d;
                v2Var9 = kVar2.f179073c;
                l18 = kVar2.f179072b;
                str7 = kVar2.f179071a;
                r.b(objJ4);
                v2Var12 = (v2) objJ4;
                if (v2Var12 instanceof v2.b) {
                    r0 r0Var15 = r0Var4;
                    activityDetailChartDTO = (ActivityDetailChartDTO) ((v2.b) v2Var12).f47386a;
                    v2Var8 = v2Var9;
                    r0Var3 = r0Var15;
                    v2Var7 = v2Var10;
                    rVar = rVar3;
                } else {
                    v2Var7 = v2Var10;
                    v2Var8 = v2Var9;
                    rVar = rVar3;
                    r0Var3 = r0Var4;
                    activityDetailChartDTO = null;
                }
                if (v2Var7 instanceof v2.b) {
                    nVar2 = (ps.n) ((v2.b) v2Var7).f47386a;
                    long jLongValue113 = l18.longValue();
                    kVar2.f179071a = str7;
                    kVar2.f179072b = l18;
                    kVar2.f179073c = v2Var8;
                    kVar2.f179074d = r0Var3;
                    kVar2.f179075e = null;
                    kVar2.f179076f = null;
                    kVar2.f179077g = activityDetailChartDTO;
                    kVar2.f179078h = rVar;
                    kVar2.f179079i = nVar2;
                    kVar2.f179082l = 6;
                    objJ3 = f0.J(cVar2, new g(cVar2, jLongValue113, null), kVar2);
                    if (objJ3 != aVar) {
                        v2Var11 = v2Var8;
                        objJ4 = objJ3;
                        str9 = str7;
                        v2Var13 = (v2) objJ4;
                        if (v2Var13 instanceof v2.b) {
                            nVar = nVar2;
                            rVar4 = rVar;
                            activityDetailChartDTO2 = activityDetailChartDTO;
                            str8 = str9;
                            l19 = l18;
                            y1Var = (y1) ((v2.b) v2Var13).f47386a;
                            v2Var8 = v2Var11;
                        } else {
                            nVar = nVar2;
                            rVar4 = rVar;
                            activityDetailChartDTO2 = activityDetailChartDTO;
                            str8 = str9;
                            v2Var8 = v2Var11;
                            y1Var = null;
                        }
                        if (!(v2Var8 instanceof v2.b)) {
                            return new v2.a(new Exception("Something went wrong while fetching social GroupRide details with activity!"), null, null, 6, null);
                        }
                        if (rVar4 != null) {
                            activityName = rVar4.getActivityName();
                        } else {
                            activityName = null;
                        }
                        v2.b bVar114 = (v2.b) v2Var8;
                        return new v2.b(new yo1.h(l19, str8, activityName, (yo1.j) bVar114.f47386a, rVar4, nVar, y1Var != null ? y1Var.d() : null, activityDetailChartDTO2, (yo1.f) r0Var3.f105810a, false, 512, null), bVar114.f47387b, null, null, 12, null);
                    }
                    return aVar;
                }
                rVar4 = rVar;
                activityDetailChartDTO2 = activityDetailChartDTO;
                y1Var = null;
                nVar = null;
                str8 = str7;
                l19 = l18;
                if (!(v2Var8 instanceof v2.b)) {
                    return new v2.a(new Exception("Something went wrong while fetching social GroupRide details with activity!"), null, null, 6, null);
                }
                if (rVar4 != null) {
                    activityName = rVar4.getActivityName();
                } else {
                    activityName = null;
                }
                v2.b bVar115 = (v2.b) v2Var8;
                return new v2.b(new yo1.h(l19, str8, activityName, (yo1.j) bVar115.f47386a, rVar4, nVar, y1Var != null ? y1Var.d() : null, activityDetailChartDTO2, (yo1.f) r0Var3.f105810a, false, 512, null), bVar115.f47387b, null, null, 12, null);
            case 6:
                nVar2 = kVar2.f179079i;
                rVar = kVar2.f179078h;
                activityDetailChartDTO = (ActivityDetailChartDTO) kVar2.f179077g;
                r0Var3 = kVar2.f179074d;
                v2Var11 = kVar2.f179073c;
                l18 = kVar2.f179072b;
                str9 = kVar2.f179071a;
                r.b(objJ4);
                v2Var13 = (v2) objJ4;
                if (v2Var13 instanceof v2.b) {
                    nVar = nVar2;
                    rVar4 = rVar;
                    activityDetailChartDTO2 = activityDetailChartDTO;
                    str8 = str9;
                    l19 = l18;
                    y1Var = (y1) ((v2.b) v2Var13).f47386a;
                    v2Var8 = v2Var11;
                } else {
                    nVar = nVar2;
                    rVar4 = rVar;
                    activityDetailChartDTO2 = activityDetailChartDTO;
                    str8 = str9;
                    v2Var8 = v2Var11;
                    y1Var = null;
                    l19 = l18;
                }
                if (!(v2Var8 instanceof v2.b)) {
                    return new v2.a(new Exception("Something went wrong while fetching social GroupRide details with activity!"), null, null, 6, null);
                }
                if (rVar4 != null) {
                    activityName = rVar4.getActivityName();
                } else {
                    activityName = null;
                }
                v2.b bVar116 = (v2.b) v2Var8;
                return new v2.b(new yo1.h(l19, str8, activityName, (yo1.j) bVar116.f47386a, rVar4, nVar, y1Var != null ? y1Var.d() : null, activityDetailChartDTO2, (yo1.f) r0Var3.f105810a, false, 512, null), bVar116.f47387b, null, null, 12, null);
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvo1/c$a;", "", "<init>", "()V", "", "DEFAULT_MAX_CHART_SIZE", "I", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static c a(a aVar) {
            ez0.b bVar = ez0.b.f67468a;
            ez0.c cVar = ez0.c.GC;
            vo1.a aVar2 = (vo1.a) ez0.b.a(bVar, cVar, vo1.a.class, new c83.h.a[0], null, null, null, 120);
            b2 b2Var = (b2) ez0.b.a(bVar, cVar, b2.class, new c83.h.a[0], null, null, null, 120);
            aVar.getClass();
            aVar2.getClass();
            b2Var.getClass();
            return new c(aVar2, b2Var);
        }

        private a() {
        }
    }
}
