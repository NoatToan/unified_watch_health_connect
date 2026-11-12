package ir;

import c83.a0;
import e23.l;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lir/f;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.data.epic.EpicRepository$getEpicsForActivity$2", f = "EpicRepository.kt", l = {17}, m = "invokeSuspend", v = 2)
public final class d extends i implements l<t13.d<? super a0<List<? extends f>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f94751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f94752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f94753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f94754d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, long j8, String str, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f94752b = eVar;
        this.f94753c = j8;
        this.f94754d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f94752b, this.f94753c, this.f94754d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends f>>> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f94751a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        a aVar2 = this.f94752b.f94755a;
        this.f94751a = 1;
        Object objA = aVar2.a(this.f94753c, this.f94754d, this);
        return objA == aVar ? aVar : objA;
    }
}
