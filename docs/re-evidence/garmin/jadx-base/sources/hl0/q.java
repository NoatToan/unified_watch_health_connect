package hl0;

import o53.b0;
import org.json.JSONArray;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.golf.courses.domain.GolfCourseIntermediateMapTypeUpdateCheckOperation$execute$1", f = "GolfCourseIntermediateMapTypeUpdateCheckOperation.kt", l = {43}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public JSONArray f84317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f84318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f84319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f84320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f84321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f84322f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p pVar, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f84322f = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        q qVar = new q(this.f84322f, dVar);
        qVar.f84321e = obj;
        return qVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006c A[Catch: Exception -> 0x0022, JSONException -> 0x0025, TryCatch #0 {JSONException -> 0x0025, blocks: (B:6:0x001c, B:26:0x006c, B:28:0x007f, B:30:0x0085, B:33:0x00da, B:24:0x005b), top: B:42:0x0012, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x007f A[Catch: Exception -> 0x0022, JSONException -> 0x0025, TryCatch #0 {JSONException -> 0x0025, blocks: (B:6:0x001c, B:26:0x006c, B:28:0x007f, B:30:0x0085, B:33:0x00da, B:24:0x005b), top: B:42:0x0012, outer: #1 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007d -> B:7:0x001f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0083 -> B:7:0x001f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hl0.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
