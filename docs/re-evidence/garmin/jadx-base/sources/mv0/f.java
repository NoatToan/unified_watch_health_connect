package mv0;

import android.location.Location;
import androidx.lifecycle.t0;
import e23.p;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/t0;", "Landroid/location/Location;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.location.LocationViewModel$getLocation$1", f = "LocationViewModel.kt", l = {21, 23, 25, 26}, m = "invokeSuspend", v = 2)
public final class f extends i implements p<t0<Location>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f121152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f121153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f121154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f121155d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Landroid/location/Location;", "<anonymous>", "(Lo53/b0;)Landroid/location/Location;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.location.LocationViewModel$getLocation$1$currentLocation$1", f = "LocationViewModel.kt", l = {21}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Location>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f121156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f121157b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f121158c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, String str, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f121157b = gVar;
            this.f121158c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f121157b, this.f121158c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Location> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f121156a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            e eVar = this.f121157b.f121162a;
            this.f121156a = 1;
            Object objD = eVar.d(this.f121158c, (4 & 2) != 0 ? 102 : 100, (4 & 4) != 0 ? 30000L : 60000L, this);
            return objD == aVar ? aVar : objD;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Landroid/location/Location;", "<anonymous>", "(Lo53/b0;)Landroid/location/Location;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.location.LocationViewModel$getLocation$1$lastKnownLocation$1", f = "LocationViewModel.kt", l = {25}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Location>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f121159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f121160b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f121161c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g gVar, String str, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f121160b = gVar;
            this.f121161c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f121160b, this.f121161c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Location> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f121159a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            e eVar = this.f121160b.f121162a;
            this.f121159a = 1;
            Object objC = eVar.c(this.f121161c, this);
            return objC == aVar ? aVar : objC;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, String str, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f121154c = gVar;
        this.f121155d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f fVar = new f(this.f121154c, this.f121155d, dVar);
        fVar.f121153b = obj;
        return fVar;
    }

    @Override // e23.p
    public final Object invoke(t0<Location> t0Var, t13.d<? super Unit> dVar) {
        return ((f) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r0.emit(r11, r10) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        if (r0.emit((android.location.Location) r11, r10) == r1) goto L27;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        t0 t0Var = (t0) this.f121153b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f121152a;
        String str = this.f121155d;
        g gVar = this.f121154c;
        if (i14 == 0) {
            r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(gVar, str, null);
            this.f121153b = t0Var;
            this.f121152a = 1;
            obj = ge1.b.e0(bVar, aVar2, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                if (i14 == 3) {
                    r.b(obj);
                    this.f121153b = null;
                    this.f121152a = 4;
                } else if (i14 != 4) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            r.b(obj);
        } else {
            r.b(obj);
        }
        return Unit.INSTANCE;
        Location location = (Location) obj;
        if (location != null) {
            this.f121153b = null;
            this.f121152a = 2;
        } else {
            x53.c cVar2 = s0.f129406a;
            x53.b bVar2 = x53.b.f189152a;
            b bVar3 = new b(gVar, str, null);
            this.f121153b = t0Var;
            this.f121152a = 3;
            obj = ge1.b.e0(bVar2, bVar3, this);
            if (obj != aVar) {
                this.f121153b = null;
                this.f121152a = 4;
            }
        }
        return aVar;
    }
}
