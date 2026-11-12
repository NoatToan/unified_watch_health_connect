package qo1;

import c83.a0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.userprofile.model.m;
import com.garmin.android.apps.connectmobile.v2;
import e23.l;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.repo.SocialProfileRepo$updateSocialProfile$2", f = "SocialProfileRepo.kt", l = {71}, m = "invokeSuspend", v = 2)
public final class g extends i implements p<b0, t13.d<? super v2<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f145977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f145978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f145979c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.social.repo.SocialProfileRepo$updateSocialProfile$2$result$1", f = "SocialProfileRepo.kt", l = {71}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements l<t13.d<? super a0<Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f145980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f145981b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m f145982c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, m mVar, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f145981b = cVar;
            this.f145982c = mVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f145981b, this.f145982c, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super a0<Unit>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f145980a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            i0<a0<Unit>> i0VarG = this.f145981b.f145961a.g(this.f145982c);
            this.f145980a = 1;
            Object objAwait = i0VarG.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c cVar, m mVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f145978b = cVar;
        this.f145979c = mVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f145978b, this.f145979c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super v2<? extends Unit>> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f145977a;
        m mVar = this.f145979c;
        c cVar = this.f145978b;
        if (i14 == 0) {
            r.b(obj);
            a aVar2 = new a(cVar, mVar, null);
            this.f145977a = 1;
            cVar.getClass();
            obj = f0.J(cVar, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            c.a(cVar, mVar);
            return v2Var;
        }
        if (v2Var instanceof v2.a) {
            return (v2.a) v2Var;
        }
        u0.r();
        return null;
    }
}
