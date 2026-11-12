package i02;

import f2.p0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.draggable.grid.ReorderableLazyGridStateKt$rememberReorderableLazyGridState$2$1", f = "ReorderableLazyGridState.kt", l = {40, 42}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f86879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f86880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p0 f86881c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(m mVar, p0 p0Var, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f86880b = mVar;
        this.f86881c = p0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o(this.f86880b, this.f86881c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    /* JADX WARN: Code duplicated, block: B:17:0x002d A[PHI: r6
      0x002d: PHI (r6v2 java.lang.Object) = (r6v8 java.lang.Object), (r6v0 java.lang.Object) binds: [B:15:0x002a, B:12:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003b -> B:14:0x0020). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x003e -> B:14:0x0020). Please report as a decompilation issue!!! */
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
            u13.a r0 = u13.a.COROUTINE_SUSPENDED
            int r1 = r5.f86879a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L19
            if (r1 != r2) goto L12
            o13.r.b(r6)     // Catch: java.lang.Exception -> L10
            goto L20
        L10:
            r6 = move-exception
            goto L3e
        L12:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r6)
            r6 = 0
            return r6
        L19:
            o13.r.b(r6)
            goto L2d
        L1d:
            o13.r.b(r6)
        L20:
            i02.m r6 = r5.f86880b
            q53.b r6 = r6.f86893i
            r5.f86879a = r3
            java.lang.Object r6 = r6.g(r5)
            if (r6 != r0) goto L2d
            goto L3d
        L2d:
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            f2.p0 r1 = r5.f86881c     // Catch: java.lang.Exception -> L10
            r5.f86879a = r2     // Catch: java.lang.Exception -> L10
            java.lang.Object r6 = p008y1.m2.b(r1, r6, r5)     // Catch: java.lang.Exception -> L10
            if (r6 != r0) goto L20
        L3d:
            return r0
        L3e:
            com.garmin.android.apps.connectmobile.i2$a r1 = com.garmin.android.apps.connectmobile.i2.f36769a
            java.lang.String r4 = "ReorderableLazyGridState"
            com.garmin.android.apps.connectmobile.i2.a.i(r1, r4, r6)
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: i02.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
