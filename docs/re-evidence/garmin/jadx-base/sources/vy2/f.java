package vy2;

import android.os.Looper;
import com.garmin.uisynthesizer.synthesize.SynthesizerException;
import java.lang.reflect.Method;
import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import uy2.w0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Luy2/c;", "<anonymous>", "(Lo53/b0;)Luy2/c;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.uisynthesizer.synthesize.execution.DirectExecutionHandler$invoke$1", f = "DirectExecutionHandler.kt", l = {16}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements e23.p<b0, t13.d<? super uy2.c>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f180842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f180843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f180844c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, g gVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f180843b = iVar;
        this.f180844c = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f180843b, this.f180844c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super uy2.c> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f180842a;
        if (i14 == 0) {
            o13.r.b(obj);
            i iVar = this.f180843b;
            List<w0> list = iVar.f180850b;
            Method method = iVar.f180851c;
            List<w0> list2 = iVar.f180850b;
            if (list.isEmpty()) {
                throw new SynthesizerException("No definition found for " + method);
            }
            if (p005kotlin.jvm.internal.s.g(Looper.myLooper(), Looper.getMainLooper()) && list2.size() != 1) {
                throw new SynthesizerException("Multiple returns for " + method + " on main thread is not allowed");
            }
            if (list2.size() == 1) {
                return ((w0) h0.I0(list2)).f173465a;
            }
            e23.p<List<w0>, t13.d<? super w0>, Object> pVar = this.f180844c.f180845a;
            this.f180842a = 1;
            obj = pVar.invoke(list2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return ((w0) obj).f173465a;
    }
}
