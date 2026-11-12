package w5;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o53.j2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.c2;
import p3.x3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lw5/i;", "Lp3/x3;", "", "", "Lw5/p;", "fontList", "initialType", "Lw5/u0;", "typefaceRequest", "Lw5/j;", "asyncTypefaceCache", "Lkotlin/Function1;", "Lw5/w0$b;", "", "onCompletion", "Lw5/l0;", "platformFontLoader", "<init>", "(Ljava/util/List;Ljava/lang/Object;Lw5/u0;Lw5/j;Le23/l;Lw5/l0;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i implements x3<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<p> f182117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0 f182118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f182119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.l<w0.b, Unit> f182120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l0 f182121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c2 f182122f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f182123g = true;

    /* JADX WARN: Multi-variable type inference failed */
    public i(List<? extends p> list, Object obj, u0 u0Var, j jVar, e23.l<? super w0.b, Unit> lVar, l0 l0Var) {
        this.f182117a = list;
        this.f182118b = u0Var;
        this.f182119c = jVar;
        this.f182120d = lVar;
        this.f182121e = l0Var;
        this.f182122f = p3.p0.n(obj);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0062 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:13:0x0036, B:25:0x0062, B:27:0x0075, B:32:0x0097, B:35:0x00bf, B:20:0x004d, B:23:0x0059), top: B:44:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0075 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:13:0x0036, B:25:0x0062, B:27:0x0075, B:32:0x0097, B:35:0x00bf, B:20:0x004d, B:23:0x0059), top: B:44:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x008f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0097 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #0 {all -> 0x003b, blocks: (B:13:0x0036, B:25:0x0062, B:27:0x0075, B:32:0x0097, B:35:0x00bf, B:20:0x004d, B:23:0x0059), top: B:44:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00bf A[Catch: all -> 0x003b, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x003b, blocks: (B:13:0x0036, B:25:0x0062, B:27:0x0075, B:32:0x0097, B:35:0x00bf, B:20:0x004d, B:23:0x0059), top: B:44:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d1 A[PHI: r0 r4 r11
      0x00d1: PHI (r0v13 java.util.List<w5.p>) = (r0v8 java.util.List<w5.p>), (r0v14 java.util.List<w5.p>) binds: [B:26:0x0073, B:38:0x00d0] A[DONT_GENERATE, DONT_INLINE]
      0x00d1: PHI (r4v7 int) = (r4v6 int), (r4v8 int) binds: [B:26:0x0073, B:38:0x00d0] A[DONT_GENERATE, DONT_INLINE]
      0x00d1: PHI (r11v3 int) = (r11v2 int), (r11v5 int) binds: [B:26:0x0073, B:38:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0073 -> B:39:0x00d1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00cd -> B:38:0x00d0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(v13.c r18) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.i.a(v13.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(p pVar, v13.c cVar) {
        g gVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f182111d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f182111d = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object obj = gVar.f182109b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f182111d;
        try {
            if (i15 != 0) {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p pVar2 = gVar.f182108a;
                o13.r.b(obj);
                return obj;
            }
            o13.r.b(obj);
            h hVar = new h(this, pVar, null);
            gVar.f182108a = pVar;
            gVar.f182111d = 1;
            Object objC = j2.c(15000L, hVar, gVar);
            return objC == aVar ? aVar : objC;
        } catch (CancellationException e4) {
            if (!g8.i.P(gVar.getF129302c())) {
                throw e4;
            }
            return null;
        } catch (Exception e14) {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) gVar.getF129302c().get(CoroutineExceptionHandler.f105965e0);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.L(new IllegalStateException("Unable to load font " + pVar, e14), gVar.getF129302c());
            }
            return null;
        }
    }

    @Override // p3.x3
    /* JADX INFO: renamed from: getValue */
    public final Object getF182175a() {
        return this.f182122f.getF182175a();
    }
}
