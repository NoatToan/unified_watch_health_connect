package oo;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.manual.viewmodel.ActivitiesEditViewModel$onSaveLinkActivity$1", f = "ActivitiesEditViewModel.kt", l = {224, 239, 246, 248}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f133084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public fg0.k f133085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f133086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f133087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f133088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fg0.k f133089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f133090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f133091h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(fg0.k kVar, b bVar, boolean z14, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f133089f = kVar;
        this.f133090g = bVar;
        this.f133091h = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f133089f, this.f133090g, this.f133091h, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:51:0x0105  */
    /* JADX WARN: Code duplicated, block: B:54:0x010e  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        fg0.k kVar;
        int i14;
        int i15;
        b bVar;
        b bVar2;
        b bVar3;
        b bVar4;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = this.f133088e;
        if (i16 == 0) {
            r.b(obj);
            fg0.k kVar2 = this.f133089f;
            if (kVar2 != null) {
                fg0.j eventCustomization = kVar2.getEventCustomization();
                Long associatedWithActivityId = eventCustomization != null ? eventCustomization.getAssociatedWithActivityId() : null;
                b bVar5 = this.f133090g;
                if (associatedWithActivityId == null) {
                    ps.d dVarX4 = b.x4(bVar5, kVar2);
                    long j8 = bVar5.f133055e;
                    this.f133084a = bVar5;
                    this.f133085b = null;
                    this.f133086c = 0;
                    this.f133087d = 0;
                    this.f133088e = 1;
                    obj = b.y4(bVar5, j8, dVarX4, this);
                    if (obj != aVar) {
                        bVar3 = bVar5;
                        if (((Boolean) obj).booleanValue()) {
                            int i17 = b.f133050p;
                            bVar3.z4().j(ln.a.LINKED);
                            return Unit.INSTANCE;
                        }
                    }
                } else {
                    Long associatedWithActivityId2 = eventCustomization.getAssociatedWithActivityId();
                    ps.d dVar = new ps.d(null, null, 3, null);
                    dVar.b(null);
                    ps.l lVar = new ps.l(null, 1, null);
                    lVar.a();
                    dVar.c(lVar);
                    if (this.f133091h && associatedWithActivityId2 != null) {
                        long jLongValue = associatedWithActivityId2.longValue();
                        this.f133084a = bVar5;
                        this.f133085b = null;
                        this.f133086c = 0;
                        this.f133087d = 0;
                        this.f133088e = 2;
                        obj = b.y4(bVar5, jLongValue, dVar, this);
                        if (obj != aVar) {
                            bVar2 = bVar5;
                            if (((Boolean) obj).booleanValue()) {
                                int i18 = b.f133050p;
                                bVar2.z4().j(ln.a.UN_LINKED);
                                return Unit.INSTANCE;
                            }
                        }
                    } else if (associatedWithActivityId2 != null) {
                        long jLongValue2 = associatedWithActivityId2.longValue();
                        this.f133084a = bVar5;
                        this.f133085b = kVar2;
                        this.f133086c = 0;
                        this.f133087d = 0;
                        this.f133088e = 3;
                        Object objY4 = b.y4(bVar5, jLongValue2, dVar, this);
                        if (objY4 != aVar) {
                            kVar = kVar2;
                            obj = objY4;
                            i14 = 0;
                            i15 = 0;
                            bVar = bVar5;
                            if (((Boolean) obj).booleanValue()) {
                                ps.d dVarX5 = b.x4(bVar, kVar);
                                long j14 = bVar.f133055e;
                                this.f133084a = bVar;
                                this.f133085b = null;
                                this.f133086c = i15;
                                this.f133087d = i14;
                                this.f133088e = 4;
                                obj = b.y4(bVar, j14, dVarX5, this);
                                if (obj != aVar) {
                                    bVar4 = bVar;
                                    if (((Boolean) obj).booleanValue()) {
                                        int i19 = b.f133050p;
                                        bVar4.z4().j(ln.a.LINKED);
                                        return Unit.INSTANCE;
                                    }
                                }
                            }
                        }
                    }
                }
                return aVar;
            }
        } else if (i16 == 1) {
            bVar3 = this.f133084a;
            r.b(obj);
            if (((Boolean) obj).booleanValue()) {
                int i110 = b.f133050p;
                bVar3.z4().j(ln.a.LINKED);
                return Unit.INSTANCE;
            }
        } else if (i16 != 2) {
            if (i16 == 3) {
                i14 = this.f133087d;
                i15 = this.f133086c;
                kVar = this.f133085b;
                bVar = this.f133084a;
                r.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    ps.d dVarX6 = b.x4(bVar, kVar);
                    long j15 = bVar.f133055e;
                    this.f133084a = bVar;
                    this.f133085b = null;
                    this.f133086c = i15;
                    this.f133087d = i14;
                    this.f133088e = 4;
                    obj = b.y4(bVar, j15, dVarX6, this);
                    if (obj != aVar) {
                        bVar4 = bVar;
                    }
                    return aVar;
                }
            } else {
                if (i16 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar4 = this.f133084a;
                r.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                int i111 = b.f133050p;
                bVar4.z4().j(ln.a.LINKED);
                return Unit.INSTANCE;
            }
        } else {
            bVar2 = this.f133084a;
            r.b(obj);
            if (((Boolean) obj).booleanValue()) {
                int i112 = b.f133050p;
                bVar2.z4().j(ln.a.UN_LINKED);
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }
}
