package gx2;

import com.google.mlkit.common.MlKitException;
import e23.p;
import o13.r;
import o53.b0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
@v13.e(c = "com.garmin.samd.SaMDHelper$onUploadConsentChanged$2", f = "SaMDHelper.kt", l = {194, MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE, 209}, m = "invokeSuspend")
public final class g extends v13.i implements p<b0, t13.d<? super Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f80076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f80077b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(boolean z14, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f80077b = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f80077b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Object> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        if (r7.m(null, r6) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r1.m(r7, r6) == r0) goto L31;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f80076a;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return Unit.INSTANCE;
                }
                if (i14 == 2) {
                    r.b(obj);
                    return Unit.INSTANCE;
                }
                if (i14 == 3) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            b.f80060a.getClass();
            Logger loggerB = b.d.b();
            boolean z14 = this.f80077b;
            wr.g.y("onUploadConsentChanged: ", z14, loggerB);
            if (z14) {
                String strE = qx2.a.f148445a.e();
                if (strE != null) {
                    jx2.r rVar = new jx2.r();
                    this.f80076a = 2;
                } else {
                    jx2.b bVar = new jx2.b();
                    this.f80076a = 3;
                    Object objL = bVar.l(this);
                    if (objL != aVar) {
                        return objL;
                    }
                }
            } else {
                qx2.a.f148445a.i(null);
                jx2.r rVar2 = new jx2.r();
                this.f80076a = 1;
            }
            return aVar;
        } catch (Exception e4) {
            b.f80060a.getClass();
            b.d.b().warn("onUploadConsentChanged", (Throwable) e4);
            return Unit.INSTANCE;
        }
    }
}
