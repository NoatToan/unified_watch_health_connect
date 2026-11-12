package pf0;

import c22.l0;
import o53.b0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zb0.u0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ecg.presentation.stats.EcgDetailViewModel$fetchTutorialVideoForRecordingDevice$1", f = "EcgDetailViewModel.kt", l = {56}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f137510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gf0.b f137511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f137512c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.ecg.presentation.stats.EcgDetailViewModel$fetchTutorialVideoForRecordingDevice$1$1", f = "EcgDetailViewModel.kt", l = {60}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public r f137513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f137514b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ gf0.b f137515c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ r f137516d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gf0.b bVar, r rVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f137515c = bVar;
            this.f137516d = rVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f137515c, this.f137516d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            r rVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f137514b;
            if (i14 == 0) {
                o13.r.b(obj);
                l0 l0Var = l0.f23120a;
                gf0.c deviceInfo = this.f137515c.getSummary().getDeviceInfo();
                String partNumber = deviceInfo != null ? deviceInfo.getPartNumber() : null;
                l0Var.getClass();
                String strSubstring = (partNumber == null || partNumber.length() < 9) ? null : partNumber.substring(5, 9);
                u0 u0Var = (u0) u0.f203782n6.get(strSubstring);
                if (strSubstring != null && u0Var != null) {
                    jf0.a aVar2 = (jf0.a) KoinJavaComponent.get$default(jf0.a.class, null, null, 6, null);
                    r rVar2 = this.f137516d;
                    this.f137513a = rVar2;
                    this.f137514b = 1;
                    obj = aVar2.g(strSubstring, (4 & 2) != 0, false, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    rVar = rVar2;
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rVar = this.f137513a;
            o13.r.b(obj);
            rVar.f137527c = (String) obj;
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(gf0.b bVar, r rVar, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f137511b = bVar;
        this.f137512c = rVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p(this.f137511b, this.f137512c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f137510a;
        if (i14 == 0) {
            o13.r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f137511b, this.f137512c, null);
            this.f137510a = 1;
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
