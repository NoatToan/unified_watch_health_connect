package vs1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.domain.usecase.SavedTrailsUseCase$addCourseToFavourites$1", f = "SavedTrailsUseCase.kt", l = {108, 111, 128}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f179877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f179878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pt1.t f179879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f179880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l<Boolean, Unit> f179881e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(t tVar, pt1.t tVar2, boolean z14, e23.l<? super Boolean, Unit> lVar, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f179878b = tVar;
        this.f179879c = tVar2;
        this.f179880d = z14;
        this.f179881e = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f179878b, this.f179879c, this.f179880d, this.f179881e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        if (r15.a(r3, r14) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
    
        if (r15.a(r8, r14) == r0) goto L27;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f179877a;
        e23.l<Boolean, Unit> lVar = this.f179881e;
        pt1.t tVar = this.f179879c;
        t tVar2 = this.f179878b;
        if (i14 == 0) {
            o13.r.b(obj);
            ss1.a aVar2 = tVar2.f179894c;
            long j8 = tVar.f140967a;
            this.f179877a = 1;
            obj = aVar2.x0(j8, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else if (i14 == 2) {
            o13.r.b(obj);
            t.a(tVar2, tVar, true);
            if (lVar != null) {
                lVar.invoke(Boolean.TRUE);
            }
        } else {
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        if (((v2) obj) instanceof v2.b) {
            if (this.f179880d) {
                h hVar = tVar2.f179896e;
                Context context = tVar2.f179892a;
                pt1.k kVar = new pt1.k(context.getString(R.string.trail_added_to_favourites), context.getString(R.string.common_undo), new p(tVar2, tVar, lVar, 0));
                this.f179877a = 2;
            }
            t.a(tVar2, tVar, true);
            if (lVar != null) {
                lVar.invoke(Boolean.TRUE);
            }
            return Unit.INSTANCE;
        }
        h hVar2 = tVar2.f179896e;
        pt1.k kVar2 = new pt1.k(tVar2.f179892a.getString(R.string.txt_error_occurred), null, null, 6, null);
        this.f179877a = 3;
        return aVar;
    }
}
