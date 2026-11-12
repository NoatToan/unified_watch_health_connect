package qi1;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p92.y;
import ui1.o0;
import ui1.x0;
import ui1.z0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.LTESubscriptionViewModel$checkSubscriptionStatus$2", f = "LTESubscriptionViewModel.kt", l = {110, 124, 127, 146, 157}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z0 f144886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f144887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f144888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f144889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f144890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f144891f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, boolean z14, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f144890e = fVar;
        this.f144891f = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        h hVar = new h(this.f144890e, this.f144891f, dVar);
        hVar.f144889d = obj;
        return hVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0195  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:78:0x023d  */
    /* JADX WARN: Code duplicated, block: B:84:0x025a  */
    /* JADX WARN: Code duplicated, block: B:90:0x027d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x027f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0291  */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01c1, code lost:
    
        if (r1 == r2) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0255, code lost:
    
        if (qi1.f.x4(r12, r16) == r2) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02a0, code lost:
    
        if (qi1.f.y4(r12, r11, false, r3, r16) == r2) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objF;
        z0 z0VarA;
        LinkedHashMap linkedHashMapH;
        Object objD;
        Map map;
        v2 v2Var;
        T t7;
        sd2.f fVar;
        String partNumber;
        Object objC;
        y0<g3<u>> y0Var;
        y0<String> y0Var2;
        Map<Object, String> mapD;
        Map map2;
        b0 b0Var = (b0) this.f144889d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f144888c;
        f fVar2 = this.f144890e;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = f.f144858o;
            o0 o0VarD4 = fVar2.D4();
            Long l14 = new Long(fVar2.f144859a);
            this.f144889d = b0Var;
            this.f144888c = 1;
            objF = o0VarD4.f(l14, this);
            if (objF != aVar) {
            }
            map = linkedHashMapH;
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            objF = obj;
        } else if (i14 == 2) {
            Map map3 = this.f144887b;
            z0 z0Var = this.f144886a;
            o13.r.b(obj);
            objD = obj;
            map = map3;
            z0VarA = z0Var;
            map = linkedHashMapH;
            v2Var = (v2) objD;
            if (v2Var instanceof v2.b) {
                t7 = ((v2.b) v2Var).f47386a;
                if (!((Collection) t7).isEmpty()) {
                    List list = (List) t7;
                    int i16 = f.f144858o;
                    o0 o0VarD5 = fVar2.D4();
                    fVar = fVar2.f144872n;
                    if (fVar != null) {
                        partNumber = fVar.getPartNumber();
                    } else {
                        partNumber = null;
                    }
                    this.f144889d = b0Var;
                    this.f144886a = z0VarA;
                    this.f144887b = map;
                    this.f144888c = 3;
                    objC = o0VarD5.c(partNumber, list, this);
                    map2 = map;
                }
                map = linkedHashMapH;
                return aVar;
            }
            int i17 = f.f144858o;
            vi1.b bVarC4 = fVar2.C4();
            y0Var = fVar2.f144862d;
            y0Var2 = fVar2.f144861c;
            long j8 = fVar2.f144859a;
            boolean zK = bVarC4.k(j8);
            StringBuilder sb3 = new StringBuilder("checkSubscriptionStatus(), subscriptionResponseItem: ");
            sb3.append(z0VarA);
            sb3.append(", navigatingFromWebview: ");
            boolean z14 = this.f144891f;
            sb3.append(z14);
            sb3.append(", sharedpref.userFinishedWebViewActivation: ");
            String strK = hb.a.k(sb3, zK, ".");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "LTESubscriptionViewModel", strK);
            if (z0VarA != null) {
            }
            if (z0VarA != null) {
                if (z0VarA == null) {
                    y0Var2.j("LTESubscriptionStatusFragment");
                    g3.a aVar3 = g3.f35298f;
                    u uVar = u.GENESIS;
                    aVar3.getClass();
                    y0Var.j(g3.a.d(uVar));
                } else {
                    this.f144889d = null;
                    this.f144886a = null;
                    this.f144887b = null;
                    this.f144888c = 5;
                }
            } else if (z0VarA == null) {
                y0Var2.j("LTESubscriptionStatusFragment");
                g3.a aVar4 = g3.f35298f;
                u uVar2 = u.GENESIS;
                aVar4.getClass();
                y0Var.j(g3.a.d(uVar2));
            } else {
                this.f144889d = null;
                this.f144886a = null;
                this.f144887b = null;
                this.f144888c = 5;
            }
        } else if (i14 == 3) {
            Map map4 = this.f144887b;
            z0VarA = this.f144886a;
            o13.r.b(obj);
            map2 = map4;
            objC = obj;
            Map<Object, String> map5 = (Map) objC;
            if (map5 != null) {
                Collection collectionValues = map2.values();
                if (collectionValues != null) {
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        map5.remove(it.next());
                    }
                }
                fVar2.f144866h.j(map5);
                String str = "checkSubscriptionStatus()- user has existing subscriptions " + fVar2.f144866h;
                i2.a aVar5 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar5.getClass();
                i2.a.b(a2Var2, "LTESubscriptionViewModel", str);
            }
            int i18 = f.f144858o;
            vi1.b bVarC5 = fVar2.C4();
            y0Var = fVar2.f144862d;
            y0Var2 = fVar2.f144861c;
            long j14 = fVar2.f144859a;
            boolean zK2 = bVarC5.k(j14);
            StringBuilder sb4 = new StringBuilder("checkSubscriptionStatus(), subscriptionResponseItem: ");
            sb4.append(z0VarA);
            sb4.append(", navigatingFromWebview: ");
            boolean z15 = this.f144891f;
            sb4.append(z15);
            sb4.append(", sharedpref.userFinishedWebViewActivation: ");
            String strK2 = hb.a.k(sb4, zK2, ".");
            i2.a aVar6 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar6.getClass();
            i2.a.b(a2Var3, "LTESubscriptionViewModel", strK2);
            if (z0VarA != null && fVar2.C4().k(j14)) {
                this.f144889d = null;
                this.f144886a = null;
                this.f144887b = null;
                this.f144888c = 4;
            } else if (z0VarA != null && (mapD = fVar2.f144866h.d()) != null && !mapD.isEmpty()) {
                y0Var2.j("LTESubscriptionStatusFragment");
                g3.a aVar7 = g3.f35298f;
                u uVar3 = u.TRANSFER;
                aVar7.getClass();
                y0Var.j(g3.a.d(uVar3));
            } else if (z0VarA == null) {
                y0Var2.j("LTESubscriptionStatusFragment");
                g3.a aVar8 = g3.f35298f;
                u uVar4 = u.GENESIS;
                aVar8.getClass();
                y0Var.j(g3.a.d(uVar4));
            } else {
                this.f144889d = null;
                this.f144886a = null;
                this.f144887b = null;
                this.f144888c = 5;
            }
        } else {
            if (i14 != 4 && i14 != 5) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        v2 v2Var2 = (v2) objF;
        if (v2Var2 instanceof v2.b) {
            x0 x0Var = (x0) ((v2.b) v2Var2).f47386a;
            fVar2.f144871m = ui1.y0.b(x0Var);
            long j15 = fVar2.f144859a;
            z0VarA = ui1.y0.a(x0Var);
            linkedHashMapH = fVar2.C4().h();
            y0<g3<u>> y0Var3 = fVar2.f144862d;
            y0<String> y0Var4 = fVar2.f144861c;
            if (z0VarA != null) {
                if (linkedHashMapH.containsKey(String.valueOf(j15))) {
                    fVar2.C4().q(String.valueOf(j15));
                } else if (linkedHashMapH.containsValue(String.valueOf(j15))) {
                    y0Var4.j("LTESubscriptionStatusFragment");
                    g3.a aVar9 = g3.f35298f;
                    u uVar5 = u.TRANSFER_PROCESSING_OLDDEVICE;
                    aVar9.getClass();
                    y0Var3.j(g3.a.d(uVar5));
                    return Unit.INSTANCE;
                }
                if (z0VarA == null || fVar2.C4().k(j15)) {
                    int i19 = f.f144858o;
                    vi1.b bVarC6 = fVar2.C4();
                    y0Var = fVar2.f144862d;
                    y0Var2 = fVar2.f144861c;
                    long j16 = fVar2.f144859a;
                    boolean zK3 = bVarC6.k(j16);
                    StringBuilder sb5 = new StringBuilder("checkSubscriptionStatus(), subscriptionResponseItem: ");
                    sb5.append(z0VarA);
                    sb5.append(", navigatingFromWebview: ");
                    boolean z16 = this.f144891f;
                    sb5.append(z16);
                    sb5.append(", sharedpref.userFinishedWebViewActivation: ");
                    String strK3 = hb.a.k(sb5, zK3, ".");
                    i2.a aVar10 = i2.f36769a;
                    a2 a2Var4 = a2.GENERAL;
                    aVar10.getClass();
                    i2.a.b(a2Var4, "LTESubscriptionViewModel", strK3);
                    if (z0VarA != null) {
                    }
                    if (z0VarA != null) {
                        if (z0VarA == null) {
                            y0Var2.j("LTESubscriptionStatusFragment");
                            g3.a aVar11 = g3.f35298f;
                            u uVar6 = u.GENESIS;
                            aVar11.getClass();
                            y0Var.j(g3.a.d(uVar6));
                        } else {
                            this.f144889d = null;
                            this.f144886a = null;
                            this.f144887b = null;
                            this.f144888c = 5;
                        }
                    } else if (z0VarA == null) {
                        y0Var2.j("LTESubscriptionStatusFragment");
                        g3.a aVar12 = g3.f35298f;
                        u uVar7 = u.GENESIS;
                        aVar12.getClass();
                        y0Var.j(g3.a.d(uVar7));
                    } else {
                        this.f144889d = null;
                        this.f144886a = null;
                        this.f144887b = null;
                        this.f144888c = 5;
                    }
                } else {
                    o0 o0VarD6 = fVar2.D4();
                    Long l15 = new Long(j15);
                    this.f144889d = b0Var;
                    this.f144886a = z0VarA;
                    this.f144887b = linkedHashMapH;
                    this.f144888c = 2;
                    objD = o0VarD6.d(l15, this);
                    if (objD != aVar) {
                        map = linkedHashMapH;
                        v2Var = (v2) objD;
                        if (v2Var instanceof v2.b) {
                            t7 = ((v2.b) v2Var).f47386a;
                            if (!((Collection) t7).isEmpty()) {
                                List list2 = (List) t7;
                                int i110 = f.f144858o;
                                o0 o0VarD7 = fVar2.D4();
                                fVar = fVar2.f144872n;
                                if (fVar != null) {
                                    partNumber = fVar.getPartNumber();
                                } else {
                                    partNumber = null;
                                }
                                this.f144889d = b0Var;
                                this.f144886a = z0VarA;
                                this.f144887b = map;
                                this.f144888c = 3;
                                objC = o0VarD7.c(partNumber, list2, this);
                                map2 = map;
                            }
                        }
                        int i111 = f.f144858o;
                        vi1.b bVarC7 = fVar2.C4();
                        y0Var = fVar2.f144862d;
                        y0Var2 = fVar2.f144861c;
                        long j17 = fVar2.f144859a;
                        boolean zK4 = bVarC7.k(j17);
                        StringBuilder sb6 = new StringBuilder("checkSubscriptionStatus(), subscriptionResponseItem: ");
                        sb6.append(z0VarA);
                        sb6.append(", navigatingFromWebview: ");
                        boolean z17 = this.f144891f;
                        sb6.append(z17);
                        sb6.append(", sharedpref.userFinishedWebViewActivation: ");
                        String strK4 = hb.a.k(sb6, zK4, ".");
                        i2.a aVar13 = i2.f36769a;
                        a2 a2Var5 = a2.GENERAL;
                        aVar13.getClass();
                        i2.a.b(a2Var5, "LTESubscriptionViewModel", strK4);
                        if (z0VarA != null) {
                        }
                        if (z0VarA != null) {
                            if (z0VarA == null) {
                                y0Var2.j("LTESubscriptionStatusFragment");
                                g3.a aVar14 = g3.f35298f;
                                u uVar8 = u.GENESIS;
                                aVar14.getClass();
                                y0Var.j(g3.a.d(uVar8));
                            } else {
                                this.f144889d = null;
                                this.f144886a = null;
                                this.f144887b = null;
                                this.f144888c = 5;
                            }
                        } else if (z0VarA == null) {
                            y0Var2.j("LTESubscriptionStatusFragment");
                            g3.a aVar15 = g3.f35298f;
                            u uVar9 = u.GENESIS;
                            aVar15.getClass();
                            y0Var.j(g3.a.d(uVar9));
                        } else {
                            this.f144889d = null;
                            this.f144886a = null;
                            this.f144887b = null;
                            this.f144888c = 5;
                        }
                    }
                }
                map = linkedHashMapH;
                return aVar;
            }
            if (linkedHashMapH.containsKey(String.valueOf(j15))) {
                y0Var4.j("LTESubscriptionStatusFragment");
                g3.a aVar16 = g3.f35298f;
                u uVar10 = u.TRANSFER_TIMEOUT;
                aVar16.getClass();
                y0Var3.j(g3.a.d(uVar10));
                return Unit.INSTANCE;
            }
            LinkedHashMap linkedHashMapH2 = fVar2.C4().h();
            if (linkedHashMapH2.containsValue(String.valueOf(j15))) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMapH2.entrySet()) {
                    if (p005kotlin.jvm.internal.s.g(entry.getValue(), String.valueOf(j15))) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Set setKeySet = linkedHashMap.keySet();
                if (setKeySet.size() == 1) {
                    fVar2.C4().q(String.valueOf(h0.a0(setKeySet)));
                } else {
                    y.f136664a.getClass();
                    y.a.c("LTESubscriptionViewModel", "user has more than on device in Inprogress table keys?");
                    Iterator it3 = setKeySet.iterator();
                    while (it3.hasNext()) {
                        fVar2.C4().q(String.valueOf(it3.next()));
                    }
                }
            }
            if (z0VarA == null) {
            }
            int i112 = f.f144858o;
            vi1.b bVarC8 = fVar2.C4();
            y0Var = fVar2.f144862d;
            y0Var2 = fVar2.f144861c;
            long j18 = fVar2.f144859a;
            boolean zK5 = bVarC8.k(j18);
            StringBuilder sb7 = new StringBuilder("checkSubscriptionStatus(), subscriptionResponseItem: ");
            sb7.append(z0VarA);
            sb7.append(", navigatingFromWebview: ");
            boolean z18 = this.f144891f;
            sb7.append(z18);
            sb7.append(", sharedpref.userFinishedWebViewActivation: ");
            String strK5 = hb.a.k(sb7, zK5, ".");
            i2.a aVar17 = i2.f36769a;
            a2 a2Var6 = a2.GENERAL;
            aVar17.getClass();
            i2.a.b(a2Var6, "LTESubscriptionViewModel", strK5);
            if (z0VarA != null) {
            }
            if (z0VarA != null) {
                if (z0VarA == null) {
                    y0Var2.j("LTESubscriptionStatusFragment");
                    g3.a aVar18 = g3.f35298f;
                    u uVar11 = u.GENESIS;
                    aVar18.getClass();
                    y0Var.j(g3.a.d(uVar11));
                } else {
                    this.f144889d = null;
                    this.f144886a = null;
                    this.f144887b = null;
                    this.f144888c = 5;
                }
            } else if (z0VarA == null) {
                y0Var2.j("LTESubscriptionStatusFragment");
                g3.a aVar19 = g3.f35298f;
                u uVar12 = u.GENESIS;
                aVar19.getClass();
                y0Var.j(g3.a.d(uVar12));
            } else {
                this.f144889d = null;
                this.f144886a = null;
                this.f144887b = null;
                this.f144888c = 5;
            }
        } else {
            y.f136664a.getClass();
            y.a.c("LTESubscriptionViewModel", "checkSubscriptionStatus() The call to verify subscription wasn't successful moving on to error state.");
            fVar2.f144863e.j(g3.a.a(g3.f35298f, null, null, null, null, 15));
        }
        return Unit.INSTANCE;
    }
}
