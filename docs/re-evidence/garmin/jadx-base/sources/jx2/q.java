package jx2;

import com.garmin.device.datatypes.DeviceProfile;
import java.util.Iterator;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
@v13.e(c = "com.garmin.samd.manager.SaMDDeviceManager$updateSaMDId$2", f = "SaMDDeviceManager.kt", l = {213}, m = "invokeSuspend")
public final class q extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f101607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f101608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public da2.d f101609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f101610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DeviceProfile f101611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f101612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r f101613g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f101614h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, String str, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f101613g = rVar;
        this.f101614h = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f101613g, this.f101614h, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007b A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #1 {all -> 0x001d, blocks: (B:6:0x0018, B:34:0x00b0, B:24:0x0075, B:26:0x007b, B:27:0x0082, B:29:0x0090, B:31:0x0094, B:36:0x00b3, B:15:0x0033, B:16:0x004a, B:18:0x0050, B:20:0x005d, B:22:0x006a, B:23:0x006e), top: B:43:0x000a, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0075 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00ad -> B:34:0x00b0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:24:0x0075
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jx2.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
