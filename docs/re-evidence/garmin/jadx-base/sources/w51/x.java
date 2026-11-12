package w51;

import android.content.Context;
import ch.qos.logback.core.net.SyslogConstants;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pending.activities.presentation.PendingActivitiesViewModel$acceptAll$1", f = "PendingActivitiesViewModel.kt", l = {162, SyslogConstants.LOG_LOCAL7}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p005kotlin.jvm.internal.m0 f182454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h0 f182455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f182456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f182457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b63.o f182458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Iterator f182459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f182460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f182461h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f182462i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f182463j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h0 f182464k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f182465l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(h0 h0Var, Context context, t13.d<? super x> dVar) {
        super(2, dVar);
        this.f182464k = h0Var;
        this.f182465l = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new x(this.f182464k, this.f182465l, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((x) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x0173  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0099 -> B:25:0x00b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x012a -> B:42:0x0135). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w51.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
