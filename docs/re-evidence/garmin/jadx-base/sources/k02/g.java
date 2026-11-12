package k02;

import e23.p;
import f2.p0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.grid.GridDragAndDropStateKt$rememberGridDragDropState$1$1", f = "GridDragAndDropState.kt", l = {165, 166}, m = "invokeSuspend", v = 2)
public final class g extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f102120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f102121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f102122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p0 f102123d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d dVar, p0 p0Var, t13.d<? super g> dVar2) {
        super(2, dVar2);
        this.f102122c = dVar;
        this.f102123d = p0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f102122c, this.f102123d, dVar);
        gVar.f102121b = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001f  */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:16:0x0034 A[PHI: r6
      0x0034: PHI (r6v6 java.lang.Object) = (r6v5 java.lang.Object), (r6v0 java.lang.Object) binds: [B:14:0x0031, B:9:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0044 -> B:11:0x001f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f102121b
            o53.b0 r0 = (o53.b0) r0
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r5.f102120a
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1c
            if (r2 == r4) goto L18
            if (r2 != r3) goto L11
            goto L1c
        L11:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r6)
            r6 = 0
            return r6
        L18:
            o13.r.b(r6)
            goto L34
        L1c:
            o13.r.b(r6)
        L1f:
            boolean r6 = o53.c0.g(r0)
            if (r6 == 0) goto L47
            k02.d r6 = r5.f102122c
            q53.b r6 = r6.f102112g
            r5.f102121b = r0
            r5.f102120a = r4
            java.lang.Object r6 = r6.g(r5)
            if (r6 != r1) goto L34
            goto L46
        L34:
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            r5.f102121b = r0
            r5.f102120a = r3
            f2.p0 r2 = r5.f102123d
            java.lang.Object r6 = p008y1.m2.b(r2, r6, r5)
            if (r6 != r1) goto L1f
        L46:
            return r1
        L47:
            kotlin.Unit r6 = p005kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k02.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
