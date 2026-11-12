package com.garmin.android.apps.connectmobile;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.AppConfigurationViewActivity$AppConfigurationViewModel$reloadAppConfig$1", f = "AppConfigurationViewActivity.kt", l = {217}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.z1 f39633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AppConfigurationViewActivity.a f39634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f39635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f39637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AppConfigurationViewActivity.a f39638f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(AppConfigurationViewActivity.a aVar, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f39638f = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o(this.f39638f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0053  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0048 -> B:12:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x004a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            u13.a r0 = u13.a.COROUTINE_SUSPENDED
            int r1 = r8.f39637e
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 != r3) goto L16
            int r1 = r8.f39636d
            java.lang.Object r4 = r8.f39635c
            com.garmin.android.apps.connectmobile.AppConfigurationViewActivity$a r5 = r8.f39634b
            r53.z1 r6 = r8.f39633a
            o13.r.b(r9)
            goto L4b
        L16:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r9)
            return r2
        L1c:
            o13.r.b(r9)
            com.garmin.android.apps.connectmobile.AppConfigurationViewActivity$a r9 = r8.f39638f
            r53.p2 r1 = r9.f28629c
            r4 = 0
            r5 = r9
            r6 = r1
            r1 = r4
        L27:
            java.lang.Object r4 = r6.getValue()
            r9 = r4
            android.util.Pair[] r9 = (android.util.Pair[]) r9
            r8.f39633a = r6
            r8.f39634b = r5
            r8.f39635c = r4
            r8.f39636d = r1
            r8.f39637e = r3
            r5.getClass()
            x53.c r9 = o53.s0.f129406a
            x53.b r9 = x53.b.f189152a
            com.garmin.android.apps.connectmobile.n r7 = new com.garmin.android.apps.connectmobile.n
            r7.<init>(r5, r2)
            java.lang.Object r9 = ge1.b.e0(r9, r7, r8)
            if (r9 != r0) goto L4b
            return r0
        L4b:
            android.util.Pair[] r9 = (android.util.Pair[]) r9
            boolean r9 = r6.b(r4, r9)
            if (r9 == 0) goto L27
            kotlin.Unit r9 = p005kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
