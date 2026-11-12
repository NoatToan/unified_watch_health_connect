package bp;

import androidx.lifecycle.t0;
import androidx.room.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lda1/b;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.photos.GroupPostViewImageViewModel$flagPostImage$1", f = "GroupPostViewImageViewModel.kt", l = {34, 45}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements p<t0<v2<? extends da1.b>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f19376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f19377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f19378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ea1.a f19379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f19380g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lda1/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.photos.GroupPostViewImageViewModel$flagPostImage$1$result$1", f = "GroupPostViewImageViewModel.kt", l = {35}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super v2<? extends da1.b>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f19382b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f19383c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f19384d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f19385e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ea1.a f19386f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f19387g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, String str, String str2, ea1.a aVar, String str3, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f19383c = eVar;
            this.f19384d = str;
            this.f19385e = str2;
            this.f19386f = aVar;
            this.f19387g = str3;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f19383c, this.f19384d, this.f19385e, this.f19386f, this.f19387g, dVar);
            aVar.f19382b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super v2<? extends da1.b>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.f19382b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f19381a;
            if (i14 == 0) {
                r.b(obj);
                d dVar = this.f19383c.f19369a;
                da1.a aVar2 = new da1.a(this.f19386f, ea1.b.GROUP_POST.f63645b, this.f19387g);
                this.f19382b = b0Var;
                this.f19381a = 1;
                dVar.getClass();
                obj = f0.J(dVar, new c(dVar, this.f19384d, this.f19385e, aVar2, null), this);
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
            if (v2Var instanceof v2.a) {
                String strG = a0.g(((v2.a) v2Var).f47384b, "Report image failed ");
                i2.a aVar3 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var, "GroupPostViewImageViewModel", strG);
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, String str, String str2, ea1.a aVar, String str3, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f19376c = eVar;
        this.f19377d = str;
        this.f19378e = str2;
        this.f19379f = aVar;
        this.f19380g = str3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f19376c, this.f19377d, this.f19378e, this.f19379f, this.f19380g, dVar);
        gVar.f19375b = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(t0<v2<? extends da1.b>> t0Var, t13.d<? super Unit> dVar) {
        return ((g) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r0.emit((com.garmin.android.apps.connectmobile.v2) r14, r13) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        t0 t0Var = (t0) this.f19375b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f19374a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        x53.c cVar = s0.f129406a;
        x53.b bVar = x53.b.f189152a;
        a aVar2 = new a(this.f19376c, this.f19377d, this.f19378e, this.f19379f, this.f19380g, null);
        this.f19375b = t0Var;
        this.f19374a = 1;
        obj = ge1.b.e0(bVar, aVar2, this);
        if (obj != aVar) {
        }
        return aVar;
        this.f19375b = null;
        this.f19374a = 2;
    }
}
