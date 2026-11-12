package pv1;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.wallet.WalletConstants;
import e23.p;
import java.util.List;
import kv1.a0;
import kv1.y;
import lc.u0;
import o13.r;
import o53.b0;
import o53.i0;
import o53.j0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import tw1.t;
import zf0.c0;
import zf0.e0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.preferences.viewmodel.FBTEditPreferencesViewModel$updateRunBikePreferences$1", f = "FBTEditPreferencesViewModel.kt", l = {378, WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR, WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED, 407, WalletConstants.ERROR_CODE_UNKNOWN}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public jv1.b f141572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f141573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j0 f141574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i0 f141575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v2 f141576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v2 f141577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f141578g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f141579h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f141580i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ pv1.b f141581j;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.preferences.viewmodel.FBTEditPreferencesViewModel$updateRunBikePreferences$1$updateAdaptiveCoachWorkoutAsync$1", f = "FBTEditPreferencesViewModel.kt", l = {381}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super v2<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f141582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ pv1.b f141583b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ jv1.b f141584c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pv1.b bVar, jv1.b bVar2, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f141583b = bVar;
            this.f141584c = bVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f141583b, this.f141584c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends Unit>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f141582a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            y yVarZ4 = pv1.b.Z4(this.f141583b);
            this.f141582a = 1;
            yVarZ4.getClass();
            Object objJ = f0.J(yVarZ4, new a0(yVarZ4, this.f141584c, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.preferences.viewmodel.FBTEditPreferencesViewModel$updateRunBikePreferences$1$updateCourseProfileAsync$1", f = "FBTEditPreferencesViewModel.kt", l = {391, 392}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super v2<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f141585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fg0.k f141586b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ pv1.b f141587c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ j61.f f141588d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(fg0.k kVar, pv1.b bVar, j61.f fVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f141586b = kVar;
            this.f141587c = bVar;
            this.f141588d = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f141586b, this.f141587c, this.f141588d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends Unit>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x004a  */
        /* JADX WARN: Code duplicated, block: B:26:0x0068 A[RETURN] */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        
            if (r11 == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
        
            if (r11 == r0) goto L23;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Long l14;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f141585a;
            j61.f fVar = this.f141588d;
            pv1.b bVar = this.f141587c;
            fg0.k kVar = this.f141586b;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return (v2) obj;
            }
            r.b(obj);
            String shareableEventUuid = kVar.getShareableEventUuid();
            if (shareableEventUuid != null) {
                zf0.d dVar = bVar.f204384a;
                this.f141585a = 1;
                dVar.getClass();
                obj = f0.J(dVar, new e0(dVar, shareableEventUuid, fVar, null), this);
            } else {
                l14 = kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                if (l14 != null) {
                    return null;
                }
                long jLongValue = l14.longValue();
                zf0.d dVar2 = bVar.f204384a;
                String strValueOf = String.valueOf(jLongValue);
                this.f141585a = 2;
                dVar2.getClass();
                obj = f0.J(dVar2, new c0(dVar2, strValueOf, fVar, null), this);
            }
            return aVar;
            v2 v2Var = (v2) obj;
            if (v2Var != null) {
                return v2Var;
            }
            l14 = kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
            if (l14 != null) {
                return null;
            }
            long jLongValue2 = l14.longValue();
            zf0.d dVar3 = bVar.f204384a;
            String strValueOf2 = String.valueOf(jLongValue2);
            this.f141585a = 2;
            dVar3.getClass();
            obj = f0.J(dVar3, new c0(dVar3, strValueOf2, fVar, null), this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.preferences.viewmodel.FBTEditPreferencesViewModel$updateRunBikePreferences$1$updateCourseProfileAsync$2", f = "FBTEditPreferencesViewModel.kt", l = {397, 398}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super v2<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f141589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fg0.k f141590b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ pv1.b f141591c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(fg0.k kVar, pv1.b bVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f141590b = kVar;
            this.f141591c = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f141590b, this.f141591c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends Unit>> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
        
            if (r8 == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
        
            if (r8 == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
        
            return r0;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Long l14;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f141589a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return (v2) obj;
                }
                if (i14 == 2) {
                    r.b(obj);
                    return (v2) obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            pv1.b bVar = this.f141591c;
            fg0.k kVar = this.f141590b;
            if (kVar != null && kVar.o0()) {
                String shareableEventUuid = kVar.getShareableEventUuid();
                if (shareableEventUuid != null) {
                    zf0.d dVar = bVar.f204384a;
                    this.f141589a = 1;
                    dVar.getClass();
                    obj = f0.J(dVar, new zf0.h(dVar, shareableEventUuid, null), this);
                }
                return null;
            }
            if (kVar != null && (l14 = kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String()) != null) {
                long jLongValue = l14.longValue();
                zf0.d dVar2 = bVar.f204384a;
                this.f141589a = 2;
                dVar2.getClass();
                obj = f0.J(dVar2, new zf0.g(dVar2, jLongValue, null), this);
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.preferences.viewmodel.FBTEditPreferencesViewModel$updateRunBikePreferences$1$updateTrainingVersionAsync$1", f = "FBTEditPreferencesViewModel.kt", l = {384}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<b0, t13.d<? super v2<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f141592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t f141593b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ pv1.b f141594c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(t tVar, pv1.b bVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f141593b = tVar;
            this.f141594c = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f141593b, this.f141594c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends Unit>> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f141592a;
            if (i14 == 0) {
                r.b(obj);
                t tVar = this.f141593b;
                if (tVar == null) {
                    return null;
                }
                int i15 = pv1.b.f141488i1;
                pv1.b bVar = this.f141594c;
                kv1.b bVarD5 = bVar.d5();
                long j8 = bVar.T;
                this.f141592a = 1;
                bVarD5.getClass();
                obj = f0.J(bVarD5, new kv1.t(bVarD5, j8, tVar, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return (v2) obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(pv1.b bVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f141581j = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        k kVar = new k(this.f141581j, dVar);
        kVar.f141580i = obj;
        return kVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:109:0x0218  */
    /* JADX WARN: Code duplicated, block: B:111:0x021c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0248  */
    /* JADX WARN: Code duplicated, block: B:114:0x024c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0278  */
    /* JADX WARN: Code duplicated, block: B:117:0x027c  */
    /* JADX WARN: Code duplicated, block: B:118:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:84:0x019b  */
    /* JADX WARN: Code duplicated, block: B:91:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ef  */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0215, code lost:
    
        if (pv1.b.a5(r10, r20) == r2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e9, code lost:
    
        if (r1 == r2) goto L108;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int size;
        jv1.a aVar;
        Object objJ;
        t tVar;
        jv1.b bVar;
        j0 j0VarJ;
        i0 i0VarJ;
        Object objC;
        v2 v2Var;
        Object objAwait;
        i0 i0Var;
        v2 v2Var2;
        v2 v2Var3;
        v2 v2Var4;
        Object objAwait2;
        b0 b0Var = (b0) this.f141580i;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f141579h;
        pv1.b bVar2 = this.f141581j;
        if (i14 == 0) {
            r.b(obj);
            int i15 = pv1.b.f141488i1;
            y0<g3<Unit>> y0VarH5 = bVar2.h5();
            p2 p2Var = bVar2.N0;
            y0VarH5.j(g3.a.c(g3.f35298f));
            mv1.a aVar3 = (mv1.a) p2Var.getValue();
            List<String> list = aVar3 != null ? aVar3.f121166d : null;
            size = list != null ? list.size() : 0;
            if (!bVar2.m5()) {
                aVar = jv1.a.GENERIC;
            } else if (size != 3) {
                aVar = size != 4 ? jv1.a.GENERIC : jv1.a.NOVICE_4_DAYS;
            } else {
                aVar = jv1.a.NOVICE_3_DAYS;
            }
            jv1.a aVar4 = aVar;
            Long userProfilePk = bVar2.f141497k0.getUserProfilePk();
            Long l14 = new Long(userProfilePk != null ? userProfilePk.longValue() : pv1.b.Y4(bVar2));
            mv1.a aVar5 = (mv1.a) p2Var.getValue();
            List<String> list2 = aVar5 != null ? aVar5.f121166d : null;
            mv1.a aVar6 = (mv1.a) p2Var.getValue();
            jv1.e0 e0Var = new jv1.e0(l14, list2, aVar6 != null ? aVar6.f121167e : null, p13.j0.f134944a, aVar4);
            int iY4 = pv1.b.Y4(bVar2);
            mv1.a aVar7 = (mv1.a) p2Var.getValue();
            jv1.b bVar3 = new jv1.b(new Integer(iY4), bVar2.l5() ? jv1.a0.CYCLING : jv1.a0.RUNNING, aVar7 != null ? aVar7.f121168f : null);
            mv1.a aVar8 = (mv1.a) p2Var.getValue();
            jv1.c cVar = aVar8 != null ? aVar8.f121168f : null;
            t tVarZ = cVar != null ? tu1.a.z(cVar) : null;
            y yVar = (y) bVar2.I.getValue();
            this.f141580i = b0Var;
            this.f141572a = bVar3;
            this.f141573b = tVarZ;
            this.f141578g = size;
            this.f141579h = 1;
            yVar.getClass();
            objJ = f0.J(yVar, new kv1.b0(yVar, e0Var, null), this);
            if (objJ != aVar2) {
                tVar = tVarZ;
                bVar = bVar3;
            }
            return aVar2;
        }
        if (i14 == 1) {
            size = this.f141578g;
            tVar = this.f141573b;
            bVar = this.f141572a;
            r.b(obj);
            objJ = obj;
        } else {
            if (i14 == 2) {
                size = this.f141578g;
                i0VarJ = this.f141575d;
                j0VarJ = this.f141574c;
                r.b(obj);
                objC = obj;
                v2Var = (v2) objC;
                this.f141580i = b0Var;
                this.f141572a = null;
                this.f141573b = null;
                this.f141574c = null;
                this.f141575d = i0VarJ;
                this.f141576e = v2Var;
                this.f141578g = size;
                this.f141579h = 3;
                objAwait = j0VarJ.await(this);
                if (objAwait != aVar2) {
                    i0Var = i0VarJ;
                    v2Var2 = v2Var;
                    v2Var3 = (v2) objAwait;
                    if (i0Var != null) {
                        this.f141580i = b0Var;
                        this.f141572a = null;
                        this.f141573b = null;
                        this.f141574c = null;
                        this.f141575d = null;
                        this.f141576e = v2Var2;
                        this.f141577f = v2Var3;
                        this.f141578g = size;
                        this.f141579h = 4;
                        objAwait2 = i0Var.await(this);
                    } else {
                        v2Var4 = null;
                        if (!(v2Var2 instanceof v2.b)) {
                            if (v2Var2 instanceof v2.a) {
                                v2.a aVar9 = (v2.a) v2Var2;
                                String strD = com.airbnb.lottie.animation.keyframe.a.d(aVar9.f47383a, "Error updating workout ");
                                i2.a aVar10 = i2.f36769a;
                                a2 a2Var = a2.GENERAL;
                                aVar10.getClass();
                                i2.a.f(a2Var, "EventBaseViewModel", strD);
                                int i16 = pv1.b.f141488i1;
                                bVar2.h5().j(g3.a.a(g3.f35298f, null, aVar9.f47383a, null, null, 13));
                            } else if (v2Var3 instanceof v2.a) {
                                v2.a aVar11 = (v2.a) v2Var3;
                                String strD2 = com.airbnb.lottie.animation.keyframe.a.d(aVar11.f47383a, "Error updating TrainingVersion ");
                                i2.a aVar12 = i2.f36769a;
                                a2 a2Var2 = a2.GENERAL;
                                aVar12.getClass();
                                i2.a.f(a2Var2, "EventBaseViewModel", strD2);
                                int i17 = pv1.b.f141488i1;
                                bVar2.h5().j(g3.a.a(g3.f35298f, null, aVar11.f47383a, null, null, 13));
                            } else if (v2Var4 instanceof v2.a) {
                                v2.a aVar13 = (v2.a) v2Var4;
                                String strD3 = com.airbnb.lottie.animation.keyframe.a.d(aVar13.f47383a, "Error updating course profile ");
                                i2.a aVar14 = i2.f36769a;
                                a2 a2Var3 = a2.GENERAL;
                                aVar14.getClass();
                                i2.a.f(a2Var3, "EventBaseViewModel", strD3);
                                int i18 = pv1.b.f141488i1;
                                bVar2.h5().j(g3.a.a(g3.f35298f, null, aVar13.f47383a, null, null, 13));
                            } else {
                                i2.a aVar15 = i2.f36769a;
                                a2 a2Var4 = a2.GENERAL;
                                aVar15.getClass();
                                i2.a.f(a2Var4, "EventBaseViewModel", "Error updating workout and TrainingVersion");
                                int i19 = pv1.b.f141488i1;
                                bVar2.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                            }
                        } else if (v2Var2 instanceof v2.a) {
                            v2.a aVar16 = (v2.a) v2Var2;
                            String strD4 = com.airbnb.lottie.animation.keyframe.a.d(aVar16.f47383a, "Error updating workout ");
                            i2.a aVar17 = i2.f36769a;
                            a2 a2Var5 = a2.GENERAL;
                            aVar17.getClass();
                            i2.a.f(a2Var5, "EventBaseViewModel", strD4);
                            int i110 = pv1.b.f141488i1;
                            bVar2.h5().j(g3.a.a(g3.f35298f, null, aVar16.f47383a, null, null, 13));
                        } else if (v2Var3 instanceof v2.a) {
                            v2.a aVar18 = (v2.a) v2Var3;
                            String strD5 = com.airbnb.lottie.animation.keyframe.a.d(aVar18.f47383a, "Error updating TrainingVersion ");
                            i2.a aVar19 = i2.f36769a;
                            a2 a2Var6 = a2.GENERAL;
                            aVar19.getClass();
                            i2.a.f(a2Var6, "EventBaseViewModel", strD5);
                            int i111 = pv1.b.f141488i1;
                            bVar2.h5().j(g3.a.a(g3.f35298f, null, aVar18.f47383a, null, null, 13));
                        } else if (v2Var4 instanceof v2.a) {
                            v2.a aVar110 = (v2.a) v2Var4;
                            String strD6 = com.airbnb.lottie.animation.keyframe.a.d(aVar110.f47383a, "Error updating course profile ");
                            i2.a aVar111 = i2.f36769a;
                            a2 a2Var7 = a2.GENERAL;
                            aVar111.getClass();
                            i2.a.f(a2Var7, "EventBaseViewModel", strD6);
                            int i112 = pv1.b.f141488i1;
                            bVar2.h5().j(g3.a.a(g3.f35298f, null, aVar110.f47383a, null, null, 13));
                        } else {
                            i2.a aVar112 = i2.f36769a;
                            a2 a2Var8 = a2.GENERAL;
                            aVar112.getClass();
                            i2.a.f(a2Var8, "EventBaseViewModel", "Error updating workout and TrainingVersion");
                            int i113 = pv1.b.f141488i1;
                            bVar2.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                        }
                    }
                }
                return aVar2;
            }
            if (i14 == 3) {
                size = this.f141578g;
                v2Var2 = this.f141576e;
                i0Var = this.f141575d;
                r.b(obj);
                objAwait = obj;
                v2Var3 = (v2) objAwait;
                if (i0Var != null) {
                    this.f141580i = b0Var;
                    this.f141572a = null;
                    this.f141573b = null;
                    this.f141574c = null;
                    this.f141575d = null;
                    this.f141576e = v2Var2;
                    this.f141577f = v2Var3;
                    this.f141578g = size;
                    this.f141579h = 4;
                    objAwait2 = i0Var.await(this);
                } else {
                    v2Var4 = null;
                    if (!(v2Var2 instanceof v2.b)) {
                        if (v2Var2 instanceof v2.a) {
                            v2.a aVar113 = (v2.a) v2Var2;
                            String strD7 = com.airbnb.lottie.animation.keyframe.a.d(aVar113.f47383a, "Error updating workout ");
                            i2.a aVar114 = i2.f36769a;
                            a2 a2Var9 = a2.GENERAL;
                            aVar114.getClass();
                            i2.a.f(a2Var9, "EventBaseViewModel", strD7);
                            int i114 = pv1.b.f141488i1;
                            bVar2.h5().j(g3.a.a(g3.f35298f, null, aVar113.f47383a, null, null, 13));
                        } else if (v2Var3 instanceof v2.a) {
                            v2.a aVar115 = (v2.a) v2Var3;
                            String strD8 = com.airbnb.lottie.animation.keyframe.a.d(aVar115.f47383a, "Error updating TrainingVersion ");
                            i2.a aVar116 = i2.f36769a;
                            a2 a2Var10 = a2.GENERAL;
                            aVar116.getClass();
                            i2.a.f(a2Var10, "EventBaseViewModel", strD8);
                            int i115 = pv1.b.f141488i1;
                            bVar2.h5().j(g3.a.a(g3.f35298f, null, aVar115.f47383a, null, null, 13));
                        } else if (v2Var4 instanceof v2.a) {
                            v2.a aVar117 = (v2.a) v2Var4;
                            String strD9 = com.airbnb.lottie.animation.keyframe.a.d(aVar117.f47383a, "Error updating course profile ");
                            i2.a aVar118 = i2.f36769a;
                            a2 a2Var11 = a2.GENERAL;
                            aVar118.getClass();
                            i2.a.f(a2Var11, "EventBaseViewModel", strD9);
                            int i116 = pv1.b.f141488i1;
                            bVar2.h5().j(g3.a.a(g3.f35298f, null, aVar117.f47383a, null, null, 13));
                        } else {
                            i2.a aVar119 = i2.f36769a;
                            a2 a2Var12 = a2.GENERAL;
                            aVar119.getClass();
                            i2.a.f(a2Var12, "EventBaseViewModel", "Error updating workout and TrainingVersion");
                            int i117 = pv1.b.f141488i1;
                            bVar2.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                        }
                    } else if (v2Var2 instanceof v2.a) {
                        v2.a aVar1110 = (v2.a) v2Var2;
                        String strD10 = com.airbnb.lottie.animation.keyframe.a.d(aVar1110.f47383a, "Error updating workout ");
                        i2.a aVar1111 = i2.f36769a;
                        a2 a2Var13 = a2.GENERAL;
                        aVar1111.getClass();
                        i2.a.f(a2Var13, "EventBaseViewModel", strD10);
                        int i118 = pv1.b.f141488i1;
                        bVar2.h5().j(g3.a.a(g3.f35298f, null, aVar1110.f47383a, null, null, 13));
                    } else if (v2Var3 instanceof v2.a) {
                        v2.a aVar1112 = (v2.a) v2Var3;
                        String strD11 = com.airbnb.lottie.animation.keyframe.a.d(aVar1112.f47383a, "Error updating TrainingVersion ");
                        i2.a aVar1113 = i2.f36769a;
                        a2 a2Var14 = a2.GENERAL;
                        aVar1113.getClass();
                        i2.a.f(a2Var14, "EventBaseViewModel", strD11);
                        int i119 = pv1.b.f141488i1;
                        bVar2.h5().j(g3.a.a(g3.f35298f, null, aVar1112.f47383a, null, null, 13));
                    } else if (v2Var4 instanceof v2.a) {
                        v2.a aVar1114 = (v2.a) v2Var4;
                        String strD12 = com.airbnb.lottie.animation.keyframe.a.d(aVar1114.f47383a, "Error updating course profile ");
                        i2.a aVar1115 = i2.f36769a;
                        a2 a2Var15 = a2.GENERAL;
                        aVar1115.getClass();
                        i2.a.f(a2Var15, "EventBaseViewModel", strD12);
                        int i1110 = pv1.b.f141488i1;
                        bVar2.h5().j(g3.a.a(g3.f35298f, null, aVar1114.f47383a, null, null, 13));
                    } else {
                        i2.a aVar1116 = i2.f36769a;
                        a2 a2Var16 = a2.GENERAL;
                        aVar1116.getClass();
                        i2.a.f(a2Var16, "EventBaseViewModel", "Error updating workout and TrainingVersion");
                        int i1111 = pv1.b.f141488i1;
                        bVar2.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                    }
                }
                return aVar2;
            }
            if (i14 == 4) {
                int i24 = this.f141578g;
                v2 v2Var5 = this.f141577f;
                v2Var2 = this.f141576e;
                r.b(obj);
                v2Var3 = v2Var5;
                size = i24;
                objAwait2 = obj;
                v2Var4 = (v2) objAwait2;
                if (!(v2Var2 instanceof v2.b) && (v2Var3 instanceof v2.b) && (v2Var4 == null || (v2Var4 instanceof v2.b))) {
                    this.f141580i = null;
                    this.f141572a = null;
                    this.f141573b = null;
                    this.f141574c = null;
                    this.f141575d = null;
                    this.f141576e = null;
                    this.f141577f = null;
                    this.f141578g = size;
                    this.f141579h = 5;
                } else if (v2Var2 instanceof v2.a) {
                    v2.a aVar1117 = (v2.a) v2Var2;
                    String strD13 = com.airbnb.lottie.animation.keyframe.a.d(aVar1117.f47383a, "Error updating workout ");
                    i2.a aVar1118 = i2.f36769a;
                    a2 a2Var17 = a2.GENERAL;
                    aVar1118.getClass();
                    i2.a.f(a2Var17, "EventBaseViewModel", strD13);
                    int i1112 = pv1.b.f141488i1;
                    bVar2.h5().j(g3.a.a(g3.f35298f, null, aVar1117.f47383a, null, null, 13));
                } else if (v2Var3 instanceof v2.a) {
                    v2.a aVar1119 = (v2.a) v2Var3;
                    String strD14 = com.airbnb.lottie.animation.keyframe.a.d(aVar1119.f47383a, "Error updating TrainingVersion ");
                    i2.a aVar11110 = i2.f36769a;
                    a2 a2Var18 = a2.GENERAL;
                    aVar11110.getClass();
                    i2.a.f(a2Var18, "EventBaseViewModel", strD14);
                    int i1113 = pv1.b.f141488i1;
                    bVar2.h5().j(g3.a.a(g3.f35298f, null, aVar1119.f47383a, null, null, 13));
                } else if (v2Var4 instanceof v2.a) {
                    v2.a aVar11111 = (v2.a) v2Var4;
                    String strD15 = com.airbnb.lottie.animation.keyframe.a.d(aVar11111.f47383a, "Error updating course profile ");
                    i2.a aVar11112 = i2.f36769a;
                    a2 a2Var19 = a2.GENERAL;
                    aVar11112.getClass();
                    i2.a.f(a2Var19, "EventBaseViewModel", strD15);
                    int i1114 = pv1.b.f141488i1;
                    bVar2.h5().j(g3.a.a(g3.f35298f, null, aVar11111.f47383a, null, null, 13));
                } else {
                    i2.a aVar11113 = i2.f36769a;
                    a2 a2Var110 = a2.GENERAL;
                    aVar11113.getClass();
                    i2.a.f(a2Var110, "EventBaseViewModel", "Error updating workout and TrainingVersion");
                    int i1115 = pv1.b.f141488i1;
                    bVar2.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                }
            } else {
                if (i14 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        }
        return Unit.INSTANCE;
        v2 v2Var6 = (v2) objJ;
        if (v2Var6 instanceof v2.b) {
            j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new a(bVar2, bVar, null), 3);
            j0VarJ = ge1.b.j(b0Var, null, null, new d(tVar, bVar2, null), 3);
            mv1.a aVar20 = (mv1.a) bVar2.N0.getValue();
            fg0.k kVar = aVar20 != null ? aVar20.f121169g : null;
            j61.f courseProfileDTO = kVar != null ? kVar.getCourseProfileDTO() : null;
            if (courseProfileDTO != null && g22.n.d(courseProfileDTO.getElevationProfileType())) {
                i0VarJ = ge1.b.j(b0Var, null, null, new b(kVar, bVar2, courseProfileDTO, null), 3);
            } else if (courseProfileDTO != null) {
                i0VarJ = null;
            } else {
                fg0.k kVar2 = bVar2.P0.f121169g;
                if ((kVar2 != null ? kVar2.getCourseProfileDTO() : null) != null) {
                    i0VarJ = ge1.b.j(b0Var, null, null, new c(kVar, bVar2, null), 3);
                } else {
                    i0VarJ = null;
                }
            }
            this.f141580i = b0Var;
            this.f141572a = null;
            this.f141573b = null;
            this.f141574c = j0VarJ;
            this.f141575d = i0VarJ;
            this.f141578g = size;
            this.f141579h = 2;
            objC = j0VarJ2.C(this);
            if (objC != aVar2) {
                v2Var = (v2) objC;
                this.f141580i = b0Var;
                this.f141572a = null;
                this.f141573b = null;
                this.f141574c = null;
                this.f141575d = i0VarJ;
                this.f141576e = v2Var;
                this.f141578g = size;
                this.f141579h = 3;
                objAwait = j0VarJ.await(this);
                if (objAwait != aVar2) {
                    i0Var = i0VarJ;
                    v2Var2 = v2Var;
                    v2Var3 = (v2) objAwait;
                    if (i0Var != null) {
                        this.f141580i = b0Var;
                        this.f141572a = null;
                        this.f141573b = null;
                        this.f141574c = null;
                        this.f141575d = null;
                        this.f141576e = v2Var2;
                        this.f141577f = v2Var3;
                        this.f141578g = size;
                        this.f141579h = 4;
                        objAwait2 = i0Var.await(this);
                    } else {
                        v2Var4 = null;
                        if (!(v2Var2 instanceof v2.b)) {
                            if (v2Var2 instanceof v2.a) {
                                v2.a aVar11114 = (v2.a) v2Var2;
                                String strD16 = com.airbnb.lottie.animation.keyframe.a.d(aVar11114.f47383a, "Error updating workout ");
                                i2.a aVar11115 = i2.f36769a;
                                a2 a2Var111 = a2.GENERAL;
                                aVar11115.getClass();
                                i2.a.f(a2Var111, "EventBaseViewModel", strD16);
                                int i1116 = pv1.b.f141488i1;
                                bVar2.h5().j(g3.a.a(g3.f35298f, null, aVar11114.f47383a, null, null, 13));
                            } else if (v2Var3 instanceof v2.a) {
                                v2.a aVar11116 = (v2.a) v2Var3;
                                String strD17 = com.airbnb.lottie.animation.keyframe.a.d(aVar11116.f47383a, "Error updating TrainingVersion ");
                                i2.a aVar11117 = i2.f36769a;
                                a2 a2Var112 = a2.GENERAL;
                                aVar11117.getClass();
                                i2.a.f(a2Var112, "EventBaseViewModel", strD17);
                                int i1117 = pv1.b.f141488i1;
                                bVar2.h5().j(g3.a.a(g3.f35298f, null, aVar11116.f47383a, null, null, 13));
                            } else if (v2Var4 instanceof v2.a) {
                                v2.a aVar11118 = (v2.a) v2Var4;
                                String strD18 = com.airbnb.lottie.animation.keyframe.a.d(aVar11118.f47383a, "Error updating course profile ");
                                i2.a aVar11119 = i2.f36769a;
                                a2 a2Var113 = a2.GENERAL;
                                aVar11119.getClass();
                                i2.a.f(a2Var113, "EventBaseViewModel", strD18);
                                int i1118 = pv1.b.f141488i1;
                                bVar2.h5().j(g3.a.a(g3.f35298f, null, aVar11118.f47383a, null, null, 13));
                            } else {
                                i2.a aVar111110 = i2.f36769a;
                                a2 a2Var114 = a2.GENERAL;
                                aVar111110.getClass();
                                i2.a.f(a2Var114, "EventBaseViewModel", "Error updating workout and TrainingVersion");
                                int i1119 = pv1.b.f141488i1;
                                bVar2.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                            }
                        } else if (v2Var2 instanceof v2.a) {
                            v2.a aVar111111 = (v2.a) v2Var2;
                            String strD19 = com.airbnb.lottie.animation.keyframe.a.d(aVar111111.f47383a, "Error updating workout ");
                            i2.a aVar111112 = i2.f36769a;
                            a2 a2Var115 = a2.GENERAL;
                            aVar111112.getClass();
                            i2.a.f(a2Var115, "EventBaseViewModel", strD19);
                            int i11110 = pv1.b.f141488i1;
                            bVar2.h5().j(g3.a.a(g3.f35298f, null, aVar111111.f47383a, null, null, 13));
                        } else if (v2Var3 instanceof v2.a) {
                            v2.a aVar111113 = (v2.a) v2Var3;
                            String strD110 = com.airbnb.lottie.animation.keyframe.a.d(aVar111113.f47383a, "Error updating TrainingVersion ");
                            i2.a aVar111114 = i2.f36769a;
                            a2 a2Var116 = a2.GENERAL;
                            aVar111114.getClass();
                            i2.a.f(a2Var116, "EventBaseViewModel", strD110);
                            int i11111 = pv1.b.f141488i1;
                            bVar2.h5().j(g3.a.a(g3.f35298f, null, aVar111113.f47383a, null, null, 13));
                        } else if (v2Var4 instanceof v2.a) {
                            v2.a aVar111115 = (v2.a) v2Var4;
                            String strD111 = com.airbnb.lottie.animation.keyframe.a.d(aVar111115.f47383a, "Error updating course profile ");
                            i2.a aVar111116 = i2.f36769a;
                            a2 a2Var117 = a2.GENERAL;
                            aVar111116.getClass();
                            i2.a.f(a2Var117, "EventBaseViewModel", strD111);
                            int i11112 = pv1.b.f141488i1;
                            bVar2.h5().j(g3.a.a(g3.f35298f, null, aVar111115.f47383a, null, null, 13));
                        } else {
                            i2.a aVar111117 = i2.f36769a;
                            a2 a2Var118 = a2.GENERAL;
                            aVar111117.getClass();
                            i2.a.f(a2Var118, "EventBaseViewModel", "Error updating workout and TrainingVersion");
                            int i11113 = pv1.b.f141488i1;
                            bVar2.h5().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                        }
                    }
                }
            }
            return aVar2;
        }
        if (!(v2Var6 instanceof v2.a)) {
            u0.r();
            return null;
        }
        v2.a aVar21 = (v2.a) v2Var6;
        String strD20 = com.airbnb.lottie.animation.keyframe.a.d(aVar21.f47383a, "Error updating user settings ");
        i2.a aVar22 = i2.f36769a;
        a2 a2Var20 = a2.GENERAL;
        aVar22.getClass();
        i2.a.f(a2Var20, "EventBaseViewModel", strD20);
        int i25 = pv1.b.f141488i1;
        bVar2.h5().j(g3.a.a(g3.f35298f, null, aVar21.f47383a, null, null, 13));
        return Unit.INSTANCE;
    }
}
