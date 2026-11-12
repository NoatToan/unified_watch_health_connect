package ug0;

import com.garmin.android.apps.connectmobile.v2;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.z1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.viewable.ViewableAccountsViewModel$loadManagedAccounts$1", f = "ViewableAccountsViewModel.kt", l = {61, 77, 161, 85}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2 f170604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z1 f170605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f170606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f170607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f170608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z53.b f170609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f170610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f170611h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f170612i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f170613j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q f170614k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f170614k = qVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o(this.f170614k, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0101 A[LOOP:0: B:30:0x00fb->B:32:0x0101, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x012a A[LOOP:1: B:34:0x0124->B:36:0x012a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x0167  */
    /* JADX WARN: Code duplicated, block: B:44:0x018b  */
    /* JADX WARN: Code duplicated, block: B:49:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:53:0x01d5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01c3 -> B:50:0x01c4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug0.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
