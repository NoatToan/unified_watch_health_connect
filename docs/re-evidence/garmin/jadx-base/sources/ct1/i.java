package ct1;

import ch.qos.logback.core.net.SyslogConstants;
import e2.i0;
import e23.p;
import o13.r;
import o53.b0;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.composables.images.ImagesPreviewCarouselKt$ImagesPreviewCarousel$1$3$1$1", f = "ImagesPreviewCarousel.kt", l = {SyslogConstants.LOG_LOCAL1, 137}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f55509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f55510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f55511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f55512d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(i0 i0Var, int i14, int i15, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f55510b = i0Var;
        this.f55511c = i14;
        this.f55512d = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f55510b, this.f55511c, this.f55512d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        if (r5.f55510b.l(r6, r1, r5) == r0) goto L19;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f55509a;
        if (i14 == 0) {
            r.b(obj);
            this.f55509a = 1;
            if (m0.b(100L, this) != aVar) {
            }
            return aVar;
        }
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
        int i15 = this.f55511c;
        int i16 = i15 > 0 ? -this.f55512d : 0;
        this.f55509a = 2;
    }
}
