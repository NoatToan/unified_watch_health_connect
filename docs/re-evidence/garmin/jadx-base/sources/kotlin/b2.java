package kotlin;

import e23.p;
import o53.b0;
import q53.k;
import q53.v;
import t13.d;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {64}, m = "invokeSuspend", v = 1)
public final class b2 extends i implements p<b0, d<? super p005kotlin.Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v f91087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f91088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f91089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q53.i<p005kotlin.Unit> f91090d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(q53.i<p005kotlin.Unit> iVar, d<? super b2> dVar) {
        super(2, dVar);
        this.f91090d = iVar;
    }

    @Override // v13.a
    public final d<p005kotlin.Unit> create(Object obj, d<?> dVar) {
        return new b2(this.f91090d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super p005kotlin.Unit> dVar) {
        return ((b2) create(b0Var, dVar)).invokeSuspend(p005kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0030 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0039 A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:6:0x000e, B:17:0x0031, B:19:0x0039, B:14:0x0024, B:20:0x004e, B:13:0x001f), top: B:27:0x0006 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002e -> B:17:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            u13.a r0 = u13.a.COROUTINE_SUSPENDED
            int r1 = r6.f91089c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 != r3) goto L14
            q53.k r1 = r6.f91088b
            q53.v r4 = r6.f91087a
            o13.r.b(r7)     // Catch: java.lang.Throwable -> L12
            goto L31
        L12:
            r7 = move-exception
            goto L56
        L14:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r7)
            return r2
        L1a:
            o13.r.b(r7)
            q53.i<kotlin.Unit> r4 = r6.f91090d
            q53.k r7 = r4.iterator()     // Catch: java.lang.Throwable -> L12
            r1 = r7
        L24:
            r6.f91087a = r4     // Catch: java.lang.Throwable -> L12
            r6.f91088b = r1     // Catch: java.lang.Throwable -> L12
            r6.f91089c = r3     // Catch: java.lang.Throwable -> L12
            java.lang.Object r7 = r1.a(r6)     // Catch: java.lang.Throwable -> L12
            if (r7 != r0) goto L31
            return r0
        L31:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L12
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L12
            if (r7 == 0) goto L4e
            java.lang.Object r7 = r1.next()     // Catch: java.lang.Throwable -> L12
            kotlin.Unit r7 = (p005kotlin.Unit) r7     // Catch: java.lang.Throwable -> L12
            java.util.concurrent.atomic.AtomicBoolean r7 = kotlin.d2.f91134c     // Catch: java.lang.Throwable -> L12
            r5 = 0
            r7.set(r5)     // Catch: java.lang.Throwable -> L12
            f4.f$a r7 = f4.f.f68735e     // Catch: java.lang.Throwable -> L12
            r7.getClass()     // Catch: java.lang.Throwable -> L12
            f4.f.a.f()     // Catch: java.lang.Throwable -> L12
            goto L24
        L4e:
            kotlin.Unit r7 = p005kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L12
            r4.c(r2)
            kotlin.Unit r7 = p005kotlin.Unit.INSTANCE
            return r7
        L56:
            throw r7     // Catch: java.lang.Throwable -> L57
        L57:
            r0 = move-exception
            og.a.v(r4, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.b2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
