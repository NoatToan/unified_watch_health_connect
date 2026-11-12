package ri1;

import ch.qos.logback.core.net.SyslogConstants;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.z1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.cwsactivation.InReachSubscriptionManagerViewModel$fetchSubscriptionState$1", f = "InReachSubscriptionManagerViewModel.kt", l = {183, SyslogConstants.LOG_LOCAL7, 185, 192, 194, 226, 238}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public si1.e f152911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yx2.c f152912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f152913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f152914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z1 f152915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s f152916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f152917g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public si1.k f152918h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f152919i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f152920j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f152921k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f152922l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f152923m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f152924n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f152925o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f152926p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f152927q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f152928r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f152929t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f152930v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f152931w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f152932x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ s f152933y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(s sVar, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f152933y = sVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        v vVar = new v(this.f152933y, dVar);
        vVar.f152932x = obj;
        return vVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0385  */
    /* JADX WARN: Code duplicated, block: B:120:0x038f  */
    /* JADX WARN: Code duplicated, block: B:121:0x039e  */
    /* JADX WARN: Code duplicated, block: B:124:0x03a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x03b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x03b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:130:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:132:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:133:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:135:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:136:0x03d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:137:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:138:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:140:0x03e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:142:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:146:0x0453  */
    /* JADX WARN: Code duplicated, block: B:149:0x0479  */
    /* JADX WARN: Code duplicated, block: B:150:0x047c  */
    /* JADX WARN: Code duplicated, block: B:152:0x0480  */
    /* JADX WARN: Code duplicated, block: B:153:0x0483  */
    /* JADX WARN: Code duplicated, block: B:155:0x0487  */
    /* JADX WARN: Code duplicated, block: B:156:0x048a  */
    /* JADX WARN: Code duplicated, block: B:160:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0229  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1 */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:146:0x0453 -> B:147:0x0470). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instruction units count: 1298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ri1.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
