package yf1;

import c83.a0;
import com.garmin.android.apps.connectmobile.segments.data.model.UserRankDTO;
import e23.l;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/segments/data/model/UserRankDTO;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.segments.data.SegmentsRepo$getUserRankForSegment$2", f = "SegmentsRepo.kt", l = {18}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements l<t13.d<? super a0<UserRankDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f196877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f196878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f196879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f196880d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b bVar, String str, String str2, t13.d<? super f> dVar) {
        super(1, dVar);
        this.f196878b = bVar;
        this.f196879c = str;
        this.f196880d = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f(this.f196878b, this.f196879c, this.f196880d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<UserRankDTO>> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f196877a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<UserRankDTO>> i0VarF = this.f196878b.f196867a.f(this.f196879c, this.f196880d);
        this.f196877a = 1;
        Object objAwait = i0VarF.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
