package w5;

import android.content.Context;
import android.graphics.Typeface;
import android.util.TypedValue;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lw5/b;", "Lw5/l0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f182065a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "androidx.compose.ui.text.font.AndroidFontLoader", f = "AndroidFontLoader.android.kt", l = {55, 57}, m = "awaitLoad", v = 1)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p0 f182066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f182067b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f182069d;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f182067b = obj;
            this.f182069d |= Integer.MIN_VALUE;
            return b.this.b(null, this);
        }
    }

    public b(Context context) {
        this.f182065a = context.getApplicationContext();
    }

    @Override // w5.l0
    /* JADX INFO: renamed from: a */
    public final Object getF182139b() {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // w5.l0
    public final Object b(p pVar, t13.d<? super Typeface> dVar) throws Throwable {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f182069d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f182069d = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objP = aVar.f182067b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f182069d;
        Context context = this.f182065a;
        if (i15 == 0) {
            o13.r.b(objP);
            if (pVar instanceof w5.a) {
                aVar.f182069d = 1;
                throw null;
            }
            if (!(pVar instanceof p0)) {
                com.google.firebase.messaging.l.j(pVar, "Unknown font type: ");
                return null;
            }
            p0 p0Var = (p0) pVar;
            aVar.f182066a = p0Var;
            aVar.f182069d = 2;
            o53.k kVar = new o53.k(u13.f.b(aVar), 1);
            kVar.q();
            int i16 = p0Var.f182144a;
            c cVar = new c(kVar, p0Var);
            ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
            if (context.isRestricted()) {
                cVar.callbackFailAsync(-4, null);
            } else {
                b7.g.b(context, i16, new TypedValue(), 0, cVar, false, false);
            }
            objP = kVar.p();
            if (objP == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 == 1) {
                o13.r.b(objP);
                return objP;
            }
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pVar = aVar.f182066a;
            o13.r.b(objP);
        }
        return o0.a((Typeface) objP, ((p0) pVar).f182147d, context);
    }

    @Override // w5.l0
    public final Object c(p pVar) {
        Object bVar;
        Typeface typefaceA;
        if (pVar instanceof w5.a) {
            throw null;
        }
        if (pVar instanceof p0) {
            p0 p0Var = (p0) pVar;
            int i14 = p0Var.f182148e;
            z.f182183b.getClass();
            Context context = this.f182065a;
            if (i14 == 0) {
                typefaceA = b7.g.a(p0Var.f182144a, context);
                typefaceA.getClass();
            } else if (i14 == z.f182184c) {
                try {
                    int i15 = o13.q.f128596b;
                    bVar = b7.g.a(((p0) pVar).f182144a, context);
                    bVar.getClass();
                } catch (Throwable th3) {
                    int i16 = o13.q.f128596b;
                    bVar = new o13.q.b(th3);
                }
                typefaceA = (Typeface) (bVar instanceof o13.q.b ? null : bVar);
            } else {
                if (i14 == z.f182185d) {
                    org.apache.commons.lang3.e.w("Unsupported Async font load path");
                    return null;
                }
                n23.j.A(z.a(i14), "Unknown loading type ");
            }
            return o0.a(typefaceA, p0Var.f182147d, context);
        }
        return null;
    }
}
