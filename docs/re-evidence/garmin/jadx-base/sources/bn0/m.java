package bn0;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import o53.z;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.groupride.GroupRideViewModel$getGroupRideDetails$1", f = "GroupRideViewModel.kt", l = {31}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0<fw.m<cn0.b>> f19013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f19014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f19015d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.groupride.GroupRideViewModel$getGroupRideDetails$1$1", f = "GroupRideViewModel.kt", l = {32}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f19017b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f19018c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ y0<fw.m<cn0.b>> f19019d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l lVar, String str, y0<fw.m<cn0.b>> y0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f19017b = lVar;
            this.f19018c = str;
            this.f19019d = y0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f19017b, this.f19018c, this.f19019d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f19016a;
            l lVar = this.f19017b;
            if (i14 == 0) {
                r.b(obj);
                d dVar = lVar.f19011c;
                this.f19016a = 1;
                obj = dVar.d(this.f19018c, this);
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
            v2 v2Var = (v2) obj;
            boolean z14 = v2Var instanceof v2.b;
            y0<fw.m<cn0.b>> y0Var = this.f19019d;
            if (z14) {
                y0Var.j(fw.m.a.g(fw.m.f73767e, ((v2.b) v2Var).f47386a, 1));
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                Logger logger = lVar.f19010b;
                String str = l.f19008d;
                v2.a aVar2 = (v2.a) v2Var;
                Integer num = aVar2.f47384b;
                logger.error(str + " - Got " + num + " http error code while getting group ride details.\n " + aVar2.f47385c);
                y0Var.j(fw.m.f73767e.e(aVar2.f47383a, num));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(y0<fw.m<cn0.b>> y0Var, l lVar, String str, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f19013b = y0Var;
        this.f19014c = lVar;
        this.f19015d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f19013b, this.f19014c, this.f19015d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f19012a;
        if (i14 == 0) {
            r.b(obj);
            fw.m<cn0.b> mVarF = fw.m.a.f(fw.m.f73767e, null, null, 3);
            y0<fw.m<cn0.b>> y0Var = this.f19013b;
            y0Var.j(mVarF);
            l lVar = this.f19014c;
            z zVar = lVar.f19009a.f22991c;
            a aVar2 = new a(lVar, this.f19015d, y0Var, null);
            this.f19012a = 1;
            if (ge1.b.e0(zVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
