package zz2;

import a03.r0;
import a03.v0;
import a03.w0;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import u1.k1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.skydoves.flexible.bottomsheet.material3.FlexibleBottomSheetKt$FlexibleBottomSheet$anchorChangeHandler$1$2$1", f = "FlexibleBottomSheet.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS}, m = "invokeSuspend")
public final class z extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f207752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a03.p f207753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a03.y f207754c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a03.p pVar, a03.y yVar, t13.d<? super z> dVar) {
        super(2, dVar);
        this.f207753b = pVar;
        this.f207754c = yVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new z(this.f207753b, this.f207754c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((z) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f207752a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f207752a = 1;
            r0<a03.y> r0Var = this.f207753b.f158i;
            r0Var.getClass();
            Object objE = o53.c0.e(new w0(r0Var, k1.Default, new v0(r0Var, this.f207754c, null), null), this);
            if (objE != obj2) {
                objE = Unit.INSTANCE;
            }
            if (objE != obj2) {
                objE = Unit.INSTANCE;
            }
            if (objE != obj2) {
                objE = Unit.INSTANCE;
            }
            if (objE == obj2) {
                return obj2;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
