package yu;

import c83.a0;
import com.garmin.android.apps.connectmobile.badges.service.model.m;
import e23.l;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/badges/service/model/m;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.badges.repo.BadgesDomainRepo$getMyBadgeDetails$2", f = "BadgesDomainRepo.kt", l = {17}, m = "invokeSuspend", v = 2)
public final class a extends i implements l<d<? super a0<m>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f199678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f199679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f199680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f199681d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, int i14, int i15, d<? super a> dVar) {
        super(1, dVar);
        this.f199679b = cVar;
        this.f199680c = i14;
        this.f199681d = i15;
    }

    @Override // v13.a
    public final d<Unit> create(d<?> dVar) {
        return new a(this.f199679b, this.f199680c, this.f199681d, dVar);
    }

    @Override // e23.l
    public final Object invoke(d<? super a0<m>> dVar) {
        return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f199678a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<m>> i0VarA = this.f199679b.f199682a.a(this.f199680c, this.f199681d);
        this.f199678a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
