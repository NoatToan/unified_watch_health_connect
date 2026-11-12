package p008y1;

import b5.a0;
import b5.c;
import b5.q;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.r0;
import t13.d;
import v13.e;
import v13.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/c;", "", "<anonymous>", "(Lb5/c;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", l = {1026, 1048}, m = "invokeSuspend", v = 1)
public final class i0 extends h implements p<c, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f193270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f193271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f193272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f193273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m0 f193274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r0<a0> f193275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r0<a0> f193276g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(m0 m0Var, r0<a0> r0Var, r0<a0> r0Var2, d<? super i0> dVar) {
        super(2, dVar);
        this.f193274e = m0Var;
        this.f193275f = r0Var;
        this.f193276g = r0Var2;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        i0 i0Var = new i0(this.f193274e, this.f193275f, this.f193276g, dVar);
        i0Var.f193273d = obj;
        return i0Var;
    }

    @Override // e23.p
    public final Object invoke(c cVar, d<? super Unit> dVar) {
        return ((i0) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    /* JADX WARN: Code duplicated, block: B:20:0x0066 A[LOOP:2: B:16:0x0057->B:20:0x0066, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x006a A[EDGE_INSN: B:74:0x006a->B:22:0x006a BREAK  A[LOOP:2: B:16:0x0057->B:20:0x0066], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [T, b5.a0] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00b0 -> B:39:0x00b3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p008y1.i0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
