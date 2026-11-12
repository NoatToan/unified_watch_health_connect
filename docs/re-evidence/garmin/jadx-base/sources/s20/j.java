package s20;

import androidx.lifecycle.y0;
import e23.p;
import java.util.List;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.CoursesListViewModel$getMyCoursesList$1", f = "CoursesListViewModel.kt", l = {27}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f156009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0<fw.m<List<com.garmin.android.apps.connectmobile.courses.model.d>>> f156010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f156011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f156012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f156013e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.CoursesListViewModel$getMyCoursesList$1$1", f = "CoursesListViewModel.kt", l = {28}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f156014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f156015b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f156016c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f156017d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f156018e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ y0<fw.m<List<com.garmin.android.apps.connectmobile.courses.model.d>>> f156019f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, String str, int i14, y0<fw.m<List<com.garmin.android.apps.connectmobile.courses.model.d>>> y0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f156016c = iVar;
            this.f156017d = str;
            this.f156018e = i14;
            this.f156019f = y0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f156016c, this.f156017d, this.f156018e, this.f156019f, dVar);
            aVar.f156015b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            a aVar;
            b0 b0Var = (b0) this.f156015b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f156014a;
            if (i14 == 0) {
                r.b(obj);
                d60.b bVar = this.f156016c.f156008a;
                Boolean bool = Boolean.FALSE;
                this.f156015b = b0Var;
                this.f156014a = 1;
                aVar = this;
                obj = d60.b.f(bVar, this.f156017d, this.f156018e, null, null, bool, aVar, 28);
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                aVar = this;
            }
            List list = (List) obj;
            y0<fw.m<List<com.garmin.android.apps.connectmobile.courses.model.d>>> y0Var = aVar.f156019f;
            if (list != null) {
                y0Var.j(fw.m.a.g(fw.m.f73767e, list, 1));
            } else {
                y0Var.j(fw.m.a.b(fw.m.f73767e, new fw.r(), null, 5));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(y0<fw.m<List<com.garmin.android.apps.connectmobile.courses.model.d>>> y0Var, i iVar, String str, int i14, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f156010b = y0Var;
        this.f156011c = iVar;
        this.f156012d = str;
        this.f156013e = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f156010b, this.f156011c, this.f156012d, this.f156013e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f156009a;
        if (i14 == 0) {
            r.b(obj);
            this.f156010b.m(fw.m.a.f(fw.m.f73767e, null, null, 3));
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f156011c, this.f156012d, this.f156013e, this.f156010b, null);
            this.f156009a = 1;
            if (ge1.b.e0(bVar, aVar2, this) == aVar) {
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
