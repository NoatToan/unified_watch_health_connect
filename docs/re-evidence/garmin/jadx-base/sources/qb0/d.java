package qb0;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import o53.b0;
import o53.c0;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.sync.DeviceSetupSyncViewModel$setSyncTimeout$1", f = "DeviceSetupSyncViewModel.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f143981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f143982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f143983c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f143983c = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d dVar2 = new d(this.f143983c, dVar);
        dVar2.f143982b = obj;
        return dVar2;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        z90.b bVar;
        int i14;
        b0 b0Var = (b0) this.f143982b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f143981a;
        if (i15 == 0) {
            o13.r.b(obj);
            this.f143982b = b0Var;
            this.f143981a = 1;
            if (m0.b(15000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        if (c0.g(b0Var)) {
            b bVar2 = this.f143983c;
            p2 p2Var = bVar2.f143966i;
            do {
                value = p2Var.getValue();
                bVar = z90.b.GENERIC_ERROR;
                i14 = bVar2.f143973p + 1;
                bVar2.f143973p = i14;
            } while (!p2Var.b(value, new sb0.b(false, 0.0f, false, bVar, i14, 7, null)));
            bVar2.x4().e();
        }
        return Unit.INSTANCE;
    }
}
