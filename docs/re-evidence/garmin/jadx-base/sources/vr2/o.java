package vr2;

import java.util.Iterator;
import java.util.Map;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.ui.userwallet.viewmodels.PaymentCardDetailsViewModel$loadDeviceItems$2", f = "PaymentCardDetailsViewModel.kt", l = {379}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map f179640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f179641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f179642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f179643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f179644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f179645f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f179646g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f179647h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f179648i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f179649j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(i iVar, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f179649j = iVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o(this.f179649j, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00db A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00dc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00dc -> B:37:0x00dd). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vr2.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
