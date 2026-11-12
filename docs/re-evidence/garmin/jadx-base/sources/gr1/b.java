package gr1;

import c83.a0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.segments.model.StravaStatusDTO;
import com.garmin.android.apps.connectmobile.v2;
import f12.l;
import fr1.i;
import lc.u0;
import o13.r;
import o53.i0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lgr1/b;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lgr1/a;", "stravaApi", "Lf12/l;", "userSettings", "Lfr1/i;", "stravaDelegate", "<init>", "(Lgr1/a;Lf12/l;Lfr1/i;)V", "a", "gcm-strava_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f78550d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gr1.a f78551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f78552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f78553c;

    /* JADX INFO: renamed from: gr1.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.strava.data.StravaRepo", f = "StravaRepo.kt", l = {23}, m = "getStravaStatus", v = 2)
    public static final class C1584b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f78554a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f78556c;

        public C1584b(t13.d<? super C1584b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f78554a = obj;
            this.f78556c |= Integer.MIN_VALUE;
            return b.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/segments/model/StravaStatusDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.strava.data.StravaRepo$getStravaStatus$result$1", f = "StravaRepo.kt", l = {23}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.l<t13.d<? super a0<StravaStatusDTO>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f78557a;

        public c(t13.d<? super c> dVar) {
            super(1, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return b.this.new c(dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super a0<StravaStatusDTO>> dVar) {
            return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f78557a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            i0<a0<StravaStatusDTO>> i0VarA = b.this.f78551a.a();
            this.f78557a = 1;
            Object objAwait = i0VarA.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    public b(gr1.a aVar, l lVar, i iVar) {
        aVar.getClass();
        lVar.getClass();
        iVar.getClass();
        this.f78551a = aVar;
        this.f78552b = lVar;
        this.f78553c = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(t13.d<? super v2<StravaStatusDTO>> dVar) {
        C1584b c1584b;
        if (dVar instanceof C1584b) {
            c1584b = (C1584b) dVar;
            int i14 = c1584b.f78556c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c1584b.f78556c = i14 - Integer.MIN_VALUE;
            } else {
                c1584b = new C1584b(dVar);
            }
        } else {
            c1584b = new C1584b(dVar);
        }
        Object objJ = c1584b.f78554a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = c1584b.f78556c;
        if (i15 == 0) {
            r.b(objJ);
            c cVar = new c(null);
            c1584b.f78556c = 1;
            objJ = f0.J(this, cVar, c1584b);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            StravaStatusDTO stravaStatusDTO = (StravaStatusDTO) ((v2.b) v2Var).f47386a;
            boolean z14 = stravaStatusDTO.f41332d;
            l lVar = this.f78552b;
            lVar.Y1(z14);
            boolean z15 = stravaStatusDTO.f41332d && stravaStatusDTO.f41330b && stravaStatusDTO.f41331c;
            i iVar = this.f78553c;
            if (!z15) {
                iVar.e();
                lVar.d2(false);
                return v2Var;
            }
            iVar.b(stravaStatusDTO.f41334f);
            if (!stravaStatusDTO.f41334f) {
                lVar.d2(false);
                return v2Var;
            }
        } else if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        return v2Var;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgr1/b$a;", "", "<init>", "()V", "gcm-strava_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static b a() {
            return new b((gr1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, gr1.a.class, new c83.h.a[0], null, null, null, 120), (l) KoinJavaComponent.get$default(l.class, null, null, 6, null), (i) KoinJavaComponent.get$default(i.class, null, null, 6, null));
        }

        private a() {
        }
    }
}
