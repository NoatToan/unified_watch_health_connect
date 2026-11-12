package mm0;

import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.group.service.model.GroupDetailsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.Collection;
import java.util.List;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import ym0.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/g3;", "Lcom/garmin/android/apps/connectmobile/group/service/model/GroupDetailsDTO;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.GroupDetailViewModel$fetchGroupDetailsDTO$1", f = "GroupDetailViewModel.kt", l = {71, 73, 74, 78, 80, 80, 80, 80}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<t0<g3<? extends GroupDetailsDTO>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f119534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f119535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f119536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f119537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f119538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f119539f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f119540g;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/group/service/model/GroupDetailsDTO;", "groupResult", "", "Luz0/b;", "invitationResult", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.group.details.GroupDetailViewModel$fetchGroupDetailsDTO$1$1", f = "GroupDetailViewModel.kt", l = {76, 76, 76}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.q<v2<? extends GroupDetailsDTO>, v2<? extends List<? extends uz0.b>>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public t0 f119541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e f119542b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f119543c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ v2 f119544d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ v2 f119545e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ e f119546f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ t0<g3<GroupDetailsDTO>> f119547g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, t0<g3<GroupDetailsDTO>> t0Var, t13.d<? super a> dVar) {
            super(3, dVar);
            this.f119546f = eVar;
            this.f119547g = t0Var;
        }

        @Override // e23.q
        public final Object invoke(v2<? extends GroupDetailsDTO> v2Var, v2<? extends List<? extends uz0.b>> v2Var2, t13.d<? super Unit> dVar) {
            a aVar = new a(this.f119546f, this.f119547g, dVar);
            aVar.f119544d = v2Var;
            aVar.f119545e = v2Var2;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x009c, code lost:
        
            if (r0.emit(r11, r10) == r2) goto L28;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            t0<g3<GroupDetailsDTO>> t0Var;
            e eVar;
            t0 t0Var2;
            v2 v2Var = this.f119544d;
            v2 v2Var2 = this.f119545e;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f119543c;
            if (i14 != 0) {
                if (i14 == 1) {
                    eVar = this.f119542b;
                    t0Var = this.f119541a;
                    o13.r.b(obj);
                } else if (i14 == 2) {
                    t0Var2 = this.f119541a;
                    o13.r.b(obj);
                    this.f119544d = null;
                    this.f119545e = null;
                    this.f119541a = null;
                    this.f119543c = 3;
                } else {
                    if (i14 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            int i15 = e.f119504m;
            e eVar2 = this.f119546f;
            eVar2.getClass();
            if (v2Var2 instanceof v2.a) {
                String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var2).f47383a, "Fetch invitation failed: ");
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var, "GroupDetailViewModel", strD);
            } else {
                if (!(v2Var2 instanceof v2.b)) {
                    u0.r();
                    return null;
                }
                eVar2.f119510f.j(h0.d1((Collection) ((v2.b) v2Var2).f47386a));
            }
            this.f119544d = null;
            this.f119545e = null;
            t0Var = this.f119547g;
            this.f119541a = t0Var;
            this.f119542b = eVar2;
            this.f119543c = 1;
            Object objY4 = e.y4(eVar2, v2Var, this);
            if (objY4 != aVar) {
                eVar = eVar2;
                obj = objY4;
            }
            return aVar;
            this.f119544d = null;
            this.f119545e = null;
            this.f119541a = t0Var;
            this.f119542b = null;
            this.f119543c = 2;
            obj = e.x4(eVar, (v2) obj, this);
            if (obj != aVar) {
                t0Var2 = t0Var;
                this.f119544d = null;
                this.f119545e = null;
                this.f119541a = null;
                this.f119543c = 3;
            }
            return aVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(e eVar, String str, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f119539f = eVar;
        this.f119540g = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j jVar = new j(this.f119539f, this.f119540g, dVar);
        jVar.f119538e = obj;
        return jVar;
    }

    @Override // e23.p
    public final Object invoke(t0<g3<? extends GroupDetailsDTO>> t0Var, t13.d<? super Unit> dVar) {
        return ((j) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0071  */
    /* JADX WARN: Code duplicated, block: B:21:0x0086 A[PHI: r9
      0x0086: PHI (r9v12 java.lang.Object) = (r9v11 java.lang.Object), (r9v0 java.lang.Object) binds: [B:19:0x0082, B:11:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x00b0 A[PHI: r2 r9
      0x00b0: PHI (r2v5 r53.i) = (r2v4 r53.i), (r2v7 r53.i) binds: [B:22:0x00ac, B:10:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x00b0: PHI (r9v15 java.lang.Object) = (r9v14 java.lang.Object), (r9v0 java.lang.Object) binds: [B:22:0x00ac, B:10:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:38:0x0110  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ca, code lost:
    
        if (r53.s.j(r0, r8) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x011d, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L41;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List<uz0.b> listD;
        ym0.a aVar;
        String str;
        e eVar;
        r53.i mVar;
        t0 t0Var;
        e eVar2;
        t0 t0Var2;
        t0 t0Var3 = (t0) this.f119538e;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f119537d;
        e eVar3 = this.f119539f;
        switch (i14) {
            case 0:
                o13.r.b(obj);
                g3 g3VarC = g3.a.c(g3.f35298f);
                this.f119538e = t0Var3;
                this.f119537d = 1;
                if (t0Var3.emit(g3VarC, this) != aVar2) {
                    listD = eVar3.f119510f.d();
                    aVar = eVar3.f119505a;
                    str = this.f119540g;
                    if (listD != null) {
                        this.f119538e = null;
                        this.f119534a = t0Var3;
                        this.f119535b = eVar3;
                        this.f119536c = eVar3;
                        this.f119537d = 5;
                        aVar.getClass();
                        obj = f0.J(aVar, new ym0.y(aVar, str, null), this);
                        if (obj != aVar2) {
                            eVar = eVar3;
                            this.f119538e = null;
                            this.f119534a = t0Var3;
                            this.f119535b = eVar;
                            this.f119536c = null;
                            this.f119537d = 6;
                            obj = e.y4(eVar3, (v2) obj, this);
                            if (obj != aVar2) {
                                e eVar4 = eVar;
                                t0Var = t0Var3;
                                eVar2 = eVar4;
                                this.f119538e = null;
                                this.f119534a = t0Var;
                                this.f119535b = null;
                                this.f119537d = 7;
                                obj = e.x4(eVar2, (v2) obj, this);
                                if (obj != aVar2) {
                                    t0Var2 = t0Var;
                                    this.f119538e = null;
                                    this.f119534a = null;
                                    this.f119537d = 8;
                                }
                            }
                        }
                    } else {
                        this.f119538e = t0Var3;
                        this.f119537d = 2;
                        aVar.getClass();
                        obj = f0.J(aVar, new ym0.y(aVar, str, null), this);
                        if (obj != aVar2) {
                            mVar = new r53.m(obj);
                            ym0.a aVar3 = eVar3.f119505a;
                            String userDisplayName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName();
                            this.f119538e = t0Var3;
                            this.f119534a = mVar;
                            this.f119537d = 3;
                            aVar3.getClass();
                            obj = f0.J(aVar3, new j0(aVar3, userDisplayName, null), this);
                            if (obj != aVar2) {
                                s53.n nVar = new s53.n(new r53.m(obj), mVar, new a(eVar3, t0Var3, null));
                                this.f119538e = null;
                                this.f119534a = null;
                                this.f119537d = 4;
                            }
                        }
                    }
                    break;
                }
                return aVar2;
            case 1:
                o13.r.b(obj);
                listD = eVar3.f119510f.d();
                aVar = eVar3.f119505a;
                str = this.f119540g;
                if (listD != null) {
                    this.f119538e = t0Var3;
                    this.f119537d = 2;
                    aVar.getClass();
                    obj = f0.J(aVar, new ym0.y(aVar, str, null), this);
                    if (obj != aVar2) {
                        mVar = new r53.m(obj);
                        ym0.a aVar4 = eVar3.f119505a;
                        String userDisplayName2 = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName();
                        this.f119538e = t0Var3;
                        this.f119534a = mVar;
                        this.f119537d = 3;
                        aVar4.getClass();
                        obj = f0.J(aVar4, new j0(aVar4, userDisplayName2, null), this);
                        if (obj != aVar2) {
                            s53.n nVar2 = new s53.n(new r53.m(obj), mVar, new a(eVar3, t0Var3, null));
                            this.f119538e = null;
                            this.f119534a = null;
                            this.f119537d = 4;
                        }
                    }
                    break;
                } else {
                    this.f119538e = null;
                    this.f119534a = t0Var3;
                    this.f119535b = eVar3;
                    this.f119536c = eVar3;
                    this.f119537d = 5;
                    aVar.getClass();
                    obj = f0.J(aVar, new ym0.y(aVar, str, null), this);
                    if (obj != aVar2) {
                        eVar = eVar3;
                        this.f119538e = null;
                        this.f119534a = t0Var3;
                        this.f119535b = eVar;
                        this.f119536c = null;
                        this.f119537d = 6;
                        obj = e.y4(eVar3, (v2) obj, this);
                        if (obj != aVar2) {
                            e eVar5 = eVar;
                            t0Var = t0Var3;
                            eVar2 = eVar5;
                            this.f119538e = null;
                            this.f119534a = t0Var;
                            this.f119535b = null;
                            this.f119537d = 7;
                            obj = e.x4(eVar2, (v2) obj, this);
                            if (obj != aVar2) {
                                t0Var2 = t0Var;
                                this.f119538e = null;
                                this.f119534a = null;
                                this.f119537d = 8;
                            }
                        }
                    }
                    break;
                }
                return aVar2;
            case 2:
                o13.r.b(obj);
                mVar = new r53.m(obj);
                ym0.a aVar5 = eVar3.f119505a;
                String userDisplayName3 = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName();
                this.f119538e = t0Var3;
                this.f119534a = mVar;
                this.f119537d = 3;
                aVar5.getClass();
                obj = f0.J(aVar5, new j0(aVar5, userDisplayName3, null), this);
                if (obj != aVar2) {
                    s53.n nVar3 = new s53.n(new r53.m(obj), mVar, new a(eVar3, t0Var3, null));
                    this.f119538e = null;
                    this.f119534a = null;
                    this.f119537d = 4;
                    break;
                }
                return aVar2;
            case 3:
                mVar = (r53.i) this.f119534a;
                o13.r.b(obj);
                s53.n nVar4 = new s53.n(new r53.m(obj), mVar, new a(eVar3, t0Var3, null));
                this.f119538e = null;
                this.f119534a = null;
                this.f119537d = 4;
                break;
            case 4:
            case 8:
                o13.r.b(obj);
                return Unit.INSTANCE;
            case 5:
                eVar3 = this.f119536c;
                e eVar6 = this.f119535b;
                t0 t0Var4 = (t0) this.f119534a;
                o13.r.b(obj);
                eVar = eVar6;
                t0Var3 = t0Var4;
                this.f119538e = null;
                this.f119534a = t0Var3;
                this.f119535b = eVar;
                this.f119536c = null;
                this.f119537d = 6;
                obj = e.y4(eVar3, (v2) obj, this);
                if (obj != aVar2) {
                    e eVar7 = eVar;
                    t0Var = t0Var3;
                    eVar2 = eVar7;
                    this.f119538e = null;
                    this.f119534a = t0Var;
                    this.f119535b = null;
                    this.f119537d = 7;
                    obj = e.x4(eVar2, (v2) obj, this);
                    if (obj != aVar2) {
                        t0Var2 = t0Var;
                        this.f119538e = null;
                        this.f119534a = null;
                        this.f119537d = 8;
                    }
                    break;
                }
                return aVar2;
            case 6:
                eVar2 = this.f119535b;
                t0Var = (t0) this.f119534a;
                o13.r.b(obj);
                this.f119538e = null;
                this.f119534a = t0Var;
                this.f119535b = null;
                this.f119537d = 7;
                obj = e.x4(eVar2, (v2) obj, this);
                if (obj != aVar2) {
                    t0Var2 = t0Var;
                    this.f119538e = null;
                    this.f119534a = null;
                    this.f119537d = 8;
                    break;
                }
                return aVar2;
            case 7:
                t0Var2 = (t0) this.f119534a;
                o13.r.b(obj);
                this.f119538e = null;
                this.f119534a = null;
                this.f119537d = 8;
                break;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
