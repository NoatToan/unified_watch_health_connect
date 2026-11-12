package mz1;

import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.EventDetailsViewModel$fetchAvailableActivityTypes$1", f = "EventDetailsViewModel.kt", l = {1338}, m = "invokeSuspend", v = 2)
public final class h0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f121772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f121773b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.EventDetailsViewModel$fetchAvailableActivityTypes$1$1", f = "EventDetailsViewModel.kt", l = {1346}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f121774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e0 f121775b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e0 e0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f121775b = e0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f121775b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Double d14;
            Double lon;
            ArrayList arrayList;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f121774a;
            e0 e0Var = this.f121775b;
            if (i14 == 0) {
                o13.r.b(obj);
                fg0.k kVarD = e0Var.k5().d();
                fg0.y locationStartPoint = kVarD != null ? kVarD.getLocationStartPoint() : null;
                if (locationStartPoint != null) {
                    Double lat = locationStartPoint.getLat();
                    lon = locationStartPoint.getLon();
                    d14 = lat;
                } else {
                    d14 = null;
                    lon = null;
                }
                d60.b bVarF4 = e0Var.F4();
                String userDisplayName = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName();
                int userProfilePk = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk();
                Boolean bool = Boolean.TRUE;
                this.f121774a = 1;
                obj = d60.b.f(bVarF4, userDisplayName, userProfilePk, d14, lon, bool, this, 16);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            List list = (List) obj;
            lz1.f.a aVar2 = lz1.f.f115404a;
            fg0.k kVarD2 = e0Var.k5().d();
            gg0.f eventType = kVarD2 != null ? kVarD2.getEventType() : null;
            aVar2.getClass();
            List<am.x0> listG = lz1.f.a.g(eventType);
            ArrayList arrayList2 = new ArrayList();
            if (listG != null) {
                for (am.x0 x0Var : listG) {
                    if (list != null) {
                        arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            if (x0Var == ((com.garmin.android.apps.connectmobile.courses.model.d) obj2).C()) {
                                arrayList.add(obj2);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        arrayList2.add(x0Var);
                    }
                }
            }
            e0Var.X = arrayList2;
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(e0 e0Var, t13.d<? super h0> dVar) {
        super(2, dVar);
        this.f121773b = e0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h0(this.f121773b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f121772a;
        if (i14 == 0) {
            o13.r.b(obj);
            x53.c cVar = o53.s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f121773b, null);
            this.f121772a = 1;
            if (ge1.b.e0(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
