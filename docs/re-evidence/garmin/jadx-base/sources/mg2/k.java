package mg2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import o53.b0;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.ui.composable.DeviceAlertSnackbarHostKt$DeviceAlertSnackbarHost$1$1", f = "DeviceAlertSnackbarHost.kt", l = {TsExtractor.TS_STREAM_TYPE_AC4}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f118400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f118401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.h f118402c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(f fVar, kotlin.h hVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f118401b = fVar;
        this.f118402c = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f118401b, this.f118402c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f118400a;
        f fVar = this.f118401b;
        if (i14 == 0) {
            o13.r.b(obj);
            if (fVar != null) {
                kotlin.h hVar = this.f118402c;
                long jA = hVar != null ? hVar.a(5000L, true) : 5000L;
                this.f118400a = 1;
                if (m0.b(jA, this) == aVar) {
                    return aVar;
                }
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        fVar.dismiss();
        return Unit.INSTANCE;
    }
}
