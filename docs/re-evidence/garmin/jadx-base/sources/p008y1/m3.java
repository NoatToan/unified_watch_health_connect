package p008y1;

import b5.a0;
import b5.c;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import v13.e;
import v13.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/c;", "Lb5/a0;", "<anonymous>", "(Lb5/c;)Lb5/a0;"}, k = 3, mv = {2, 0, 0})
@e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", l = {227}, m = "invokeSuspend", v = 1)
public final class m3 extends h implements p<c, d<? super a0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f193425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f193426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f193427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f193428d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(a0 a0Var, d<? super m3> dVar) {
        super(2, dVar);
        this.f193428d = a0Var;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        m3 m3Var = new m3(this.f193428d, dVar);
        m3Var.f193427c = obj;
        return m3Var;
    }

    @Override // e23.p
    public final Object invoke(c cVar, d<? super a0> dVar) {
        return ((m3) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0048 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003d -> B:12:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            u13.a r0 = u13.a.COROUTINE_SUSPENDED
            int r1 = r7.f193426b
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L13
            long r3 = r7.f193425a
            java.lang.Object r1 = r7.f193427c
            b5.c r1 = (b5.c) r1
            o13.r.b(r8)
            goto L40
        L13:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r8)
            r8 = 0
            return r8
        L1a:
            o13.r.b(r8)
            java.lang.Object r8 = r7.f193427c
            b5.c r8 = (b5.c) r8
            b5.a0 r1 = r7.f193428d
            long r3 = r1.f15749b
            i5.a4 r1 = r8.getViewConfiguration()
            r1.getClass()
            r5 = 40
            long r5 = r5 + r3
            r1 = r8
            r3 = r5
        L31:
            r7.f193427c = r1
            r7.f193425a = r3
            r7.f193426b = r2
            r8 = 0
            r5 = 3
            java.lang.Object r8 = p008y1.k3.c(r1, r8, r7, r5)
            if (r8 != r0) goto L40
            return r0
        L40:
            b5.a0 r8 = (b5.a0) r8
            long r5 = r8.f15749b
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 < 0) goto L31
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p008y1.m3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
