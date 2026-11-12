package zi1;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.settings.notifications.model.NotificationPreferencesDTO;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import o13.r;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.c2;
import r53.j;
import r53.k2;
import r53.l2;
import r53.s;
import sd2.f;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzi1/e;", "Landroidx/lifecycle/u1;", "", "deviceId", "<init>", "(J)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2 f204859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f204860b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000f\u0012\u000b\u0012\t\u0018\u00010\u0001¢\u0006\u0002\b\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lsd2/f;", "Lkotlin/jvm/internal/EnhancedNullability;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.notification.NotificationOffViewModel$deviveRecord$1", f = "NotificationOffViewModel.kt", l = {20}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<j<? super f>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f204861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f204862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f204863c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j8, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f204863c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f204863c, dVar);
            aVar.f204862b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(j<? super f> jVar, t13.d<? super Unit> dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            j jVar = (j) this.f204862b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f204861a;
            if (i14 == 0) {
                r.b(obj);
                rd2.f.a().f152045a.getClass();
                f fVarI = rd2.j.i(this.f204863c, null);
                this.f204862b = null;
                this.f204861a = 1;
                if (jVar.emit(fVarI, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.notification.NotificationOffViewModel$hasPushNotification$1", f = "NotificationOffViewModel.kt", l = {28, 34}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<j<? super Boolean>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f204864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f204865b;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f204865b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(j<? super Boolean> jVar, t13.d<? super Unit> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L19;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            j jVar = (j) this.f204865b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f204864a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                } else {
                    if (i14 != 2) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
            r.b(obj);
            dj1.a aVar2 = (dj1.a) KoinJavaComponent.get$default(dj1.a.class, null, null, 6, null);
            this.f204865b = jVar;
            this.f204864a = 1;
            obj = aVar2.b(this);
            if (obj != aVar) {
            }
            return aVar;
            v2 v2Var = (v2) obj;
            Boolean boolValueOf = Boolean.valueOf(v2Var instanceof v2.b ? ((NotificationPreferencesDTO) ((v2.b) v2Var).f47386a).N0 : false);
            this.f204865b = null;
            this.f204864a = 2;
        }
    }

    public e(long j8) {
        c2 c2Var = new c2(new a(j8, null));
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        l2 l2Var = k2.a.f150705b;
        this.f204859a = s.K(c2Var, aVarA, l2Var, null);
        this.f204860b = s.K(new c2(new b(null)), v1.a(this), l2Var, null);
    }
}
