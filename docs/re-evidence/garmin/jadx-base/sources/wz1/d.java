package wz1;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b5.a0;
import b5.h0;
import b5.q;
import b5.s;
import e23.p;
import java.util.Iterator;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.h1;
import p008y1.k3;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class d implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f188185a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/c;", "", "<anonymous>", "(Lb5/c;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.ui.ModifierExtensionsKt$awaitFirstUpGesture$1$1$1", f = "ModifierExtensions.kt", l = {87, 90}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.h implements p<b5.c, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f188186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f188187b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f188188c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e23.a<Unit> aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f188188c = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f188188c, dVar);
            aVar.f188187b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b5.c cVar, t13.d<? super Unit> dVar) {
            return ((a) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
        
            if (r6 == r1) goto L15;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0038 -> B:16:0x003b). Please report as a decompilation issue!!! */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            b5.c cVar = (b5.c) this.f188187b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f188186a;
            if (i14 == 0) {
                r.b(obj);
                this.f188187b = cVar;
                this.f188186a = 1;
                if (k3.c(cVar, null, this, 2) != aVar) {
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
            List<a0> list = ((q) obj).f15870a;
            if (list == null || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (!((a0) it.next()).f15751d);
            }
            this.f188188c.invoke();
            return Unit.INSTANCE;
            this.f188187b = cVar;
            this.f188186a = 2;
            obj = cVar.W0(s.Main, this);
        }
    }

    public d(e23.a<Unit> aVar) {
        this.f188185a = aVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(h0 h0Var, t13.d<? super Unit> dVar) {
        Object objC = h1.c(h0Var, new a(this.f188185a, null), dVar);
        return objC == u13.a.COROUTINE_SUSPENDED ? objC : Unit.INSTANCE;
    }
}
