package jy0;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.z1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.creation.MultiDayActivitiesCreationViewModel$setCreationData$2", f = "MultiDayActivitiesCreationViewModel.kt", l = {306}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z1 f101793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public cy0.k f101794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f101795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f101796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public sy0.j f101797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f101798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f101799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f101800h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f101801i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ cy0.k f101802j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(l lVar, cy0.k kVar, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f101801i = lVar;
        this.f101802j = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r(this.f101801i, this.f101802j, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0041  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00db  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0069 -> B:16:0x006c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jy0.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
