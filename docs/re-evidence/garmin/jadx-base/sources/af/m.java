package af;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BS\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Laf/m;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lef/b;", "taskExecutor", "Laf/g;", "", "batteryChargingTracker", "Laf/c;", "batteryNotLowTracker", "Lye/f;", "networkStateTracker", "storageNotLowTracker", "<init>", "(Landroid/content/Context;Lef/b;Laf/g;Laf/c;Laf/g;Laf/g;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g<Boolean> f3030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f3031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g<ye.f> f3032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g<Boolean> f3033e;

    public m(Context context, ef.b bVar, g gVar, c cVar, g gVar2, g gVar3, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 4) != 0) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            gVar = new a(applicationContext, bVar);
        }
        g gVar4 = gVar;
        if ((i14 & 8) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            applicationContext2.getClass();
            cVar = new c(applicationContext2, bVar);
        }
        c cVar2 = cVar;
        if ((i14 & 16) != 0) {
            Context applicationContext3 = context.getApplicationContext();
            applicationContext3.getClass();
            int i15 = j.f3027a;
            bVar.getClass();
            gVar2 = new i(applicationContext3, bVar);
        }
        g gVar5 = gVar2;
        if ((i14 & 32) != 0) {
            Context applicationContext4 = context.getApplicationContext();
            applicationContext4.getClass();
            gVar3 = new k(applicationContext4, bVar);
        }
        this(context, bVar, gVar4, cVar2, gVar5, gVar3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(Context context, ef.b bVar, g<Boolean> gVar) {
        this(context, bVar, gVar, null, null, null, 56, null);
        context.getClass();
        bVar.getClass();
        gVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(Context context, ef.b bVar, g<Boolean> gVar, c cVar) {
        this(context, bVar, gVar, cVar, null, null, 48, null);
        context.getClass();
        bVar.getClass();
        gVar.getClass();
        cVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(Context context, ef.b bVar, g<Boolean> gVar, c cVar, g<ye.f> gVar2) {
        this(context, bVar, gVar, cVar, gVar2, null, 32, null);
        context.getClass();
        bVar.getClass();
        gVar.getClass();
        cVar.getClass();
        gVar2.getClass();
    }

    public m(Context context, ef.b bVar, g<Boolean> gVar, c cVar, g<ye.f> gVar2, g<Boolean> gVar3) {
        context.getClass();
        bVar.getClass();
        gVar.getClass();
        cVar.getClass();
        gVar2.getClass();
        gVar3.getClass();
        this.f3029a = context;
        this.f3030b = gVar;
        this.f3031c = cVar;
        this.f3032d = gVar2;
        this.f3033e = gVar3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(Context context, ef.b bVar) {
        this(context, bVar, null, null, null, null, 60, null);
        context.getClass();
        bVar.getClass();
    }
}
