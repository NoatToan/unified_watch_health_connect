package yq0;

import e23.p;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.insights.presentation.home.InsightsHistogramViewModel$fetchHistogramData$1", f = "InsightsHistogramViewModel.kt", l = {79}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f198759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f198760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f198761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f198762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map f198763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f198764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f198765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f198766h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f198767i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f198768j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List<tq0.l> f198769k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f198770l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f198771m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(List<tq0.l> list, f fVar, b bVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f198769k = list;
        this.f198770l = fVar;
        this.f198771m = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f198769k, this.f198770l, this.f198771m, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00da  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00da -> B:29:0x00de). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yq0.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
