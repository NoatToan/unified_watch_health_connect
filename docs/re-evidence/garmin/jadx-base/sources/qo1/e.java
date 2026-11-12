package qo1;

import c83.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.userprofile.model.k;
import com.garmin.android.apps.connectmobile.userprofile.model.m;
import com.garmin.android.apps.connectmobile.v2;
import com.google.gson.Gson;
import e23.l;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.r;
import o53.b0;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/userprofile/model/m;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.repo.SocialProfileRepo$getSocialProfile$2", f = "SocialProfileRepo.kt", l = {50}, m = "invokeSuspend", v = 2)
public final class e extends i implements p<b0, t13.d<? super v2<? extends m>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f145966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f145967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f145968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<k> f145969d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/userprofile/model/m;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.social.repo.SocialProfileRepo$getSocialProfile$2$result$1", f = "SocialProfileRepo.kt", l = {50}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements l<t13.d<? super a0<m>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f145970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f145971b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<k> f145972c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(c cVar, List<? extends k> list, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f145971b = cVar;
            this.f145972c = list;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f145971b, this.f145972c, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super a0<m>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f145970a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            eo1.a aVar2 = this.f145971b.f145961a;
            List<k> list = this.f145972c;
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((k) it.next()).name());
            }
            i0<a0<m>> i0VarA = aVar2.a(arrayList);
            this.f145970a = 1;
            Object objAwait = i0VarA.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(boolean z14, c cVar, List<? extends k> list, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f145967b = z14;
        this.f145968c = cVar;
        this.f145969d = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f145967b, this.f145968c, this.f145969d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super v2<? extends m>> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        m mVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f145966a;
        c cVar = this.f145968c;
        if (i14 == 0) {
            r.b(obj);
            if (this.f145967b) {
                c.a aVar2 = c.f145960d;
                cVar.getClass();
                qd2.a aVarB = qd2.a.b();
                try {
                    mVar = (m) new Gson().fromJson(aVarB != null ? aVarB.c(qd2.a.b.SOCIAL_PROFILE) : null, m.class);
                } catch (Exception e4) {
                    a2 a2Var = a2.USER;
                    String strH = f3.h(e4, "getSocialProfileCache: parsing failed with exception=[", "]");
                    i2.f36769a.getClass();
                    i2.a.p(a2Var, "SocialProfileRepo", strH);
                    mVar = null;
                }
                if (mVar != null) {
                    return new v2.b(mVar, 200, null, null, 12, null);
                }
            }
            a aVar3 = new a(cVar, this.f145969d, null);
            this.f145966a = 1;
            cVar.getClass();
            obj = f0.J(cVar, aVar3, this);
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
            c.a(cVar, (m) ((v2.b) v2Var).f47386a);
        } else if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        return v2Var;
    }
}
