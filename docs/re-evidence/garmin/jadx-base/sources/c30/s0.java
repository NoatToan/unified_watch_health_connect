package c30;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "La50/g;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.custom.SaveCourseUseCase$invoke$1", f = "SaveCourseUseCase.kt", l = {32, 68, 79, 110, 112, 130, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, SyslogConstants.LOG_LOCAL1, 145}, m = "invokeSuspend", v = 2)
public final class s0 extends v13.i implements e23.p<r53.j<? super a50.g>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.courses.model.e f24013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f24014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f24015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.courses.model.e f24016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a50.g f24017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t0 f24018f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Iterator f24019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f24020h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f24021i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f24022j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f24023k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f24024l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a50.g f24025m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t0 f24026n;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((com.garmin.android.apps.connectmobile.courses.model.g) t7).getDistance(), ((com.garmin.android.apps.connectmobile.courses.model.g) t14).getDistance());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(a50.g gVar, t0 t0Var, t13.d<? super s0> dVar) {
        super(2, dVar);
        this.f24025m = gVar;
        this.f24026n = t0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        s0 s0Var = new s0(this.f24025m, this.f24026n, dVar);
        s0Var.f24024l = obj;
        return s0Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super a50.g> jVar, t13.d<? super Unit> dVar) {
        return ((s0) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:219:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0185  */
    /* JADX WARN: Code duplicated, block: B:77:0x019a  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:83:0x01dc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [a50.g, com.garmin.android.apps.connectmobile.courses.model.e, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [a50.g, com.garmin.android.apps.connectmobile.courses.model.e, java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x01d3 -> B:81:0x01d8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 1206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c30.s0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
