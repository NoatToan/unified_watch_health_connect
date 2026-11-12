package r02;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/c;", "", "<anonymous>", "(Lb5/c;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.zoomable.ZoomableLayoutKt$detectTransformGestures$4", f = "ZoomableLayout.kt", l = {243, 246}, m = "invokeSuspend", v = 2)
public final class h extends v13.h implements e23.p<b5.c, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f148851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f148852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f148853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.q<n4.c, n4.c, Float, Unit> f148854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f148855e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(e23.a<Unit> aVar, e23.q<? super n4.c, ? super n4.c, ? super Float, Unit> qVar, e23.a<Unit> aVar2, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f148853c = aVar;
        this.f148854d = qVar;
        this.f148855e = aVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        h hVar = new h(this.f148853c, this.f148854d, this.f148855e, dVar);
        hVar.f148852b = obj;
        return hVar;
    }

    @Override // e23.p
    public final Object invoke(b5.c cVar, t13.d<? super Unit> dVar) {
        return ((h) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:68:0x004c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:? A[LOOP:2: B:23:0x0052->B:70:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003c -> B:17:0x003f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r02.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
