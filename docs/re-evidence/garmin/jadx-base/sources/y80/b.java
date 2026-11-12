package y80;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lz80/g;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.data.ActivityOptionsRepository$getDisplayedActivities$2", f = "ActivityOptionsRepository.kt", l = {12}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends z80.g>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f195086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f195087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f195088c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, long j8, t13.d<? super b> dVar2) {
        super(1, dVar2);
        this.f195087b = dVar;
        this.f195088c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b(this.f195087b, this.f195088c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends z80.g>>> dVar) {
        return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f195086a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<List<z80.g>>> i0VarA = this.f195087b.f195109a.a(this.f195088c);
        this.f195086a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
