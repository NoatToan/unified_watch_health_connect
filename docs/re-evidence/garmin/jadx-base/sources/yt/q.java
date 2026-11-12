package yt;

import android.content.Context;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.annual_report.player.AnnualReportPlayerViewModel$prepareShareResource$1", f = "AnnualReportPlayerViewModel.kt", l = {252}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f199372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f199373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f199374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f199375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ot.l f199376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Iterator f199377f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f199378g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f199379h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f199380i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f199381j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f199382k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f199383l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n f199384m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f199385n;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Integer.valueOf(((ot.l) t7) instanceof ot.u ? -1 : 0), Integer.valueOf(((ot.l) t14) instanceof ot.u ? -1 : 0));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n nVar, Context context, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f199384m = nVar;
        this.f199385n = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        q qVar = new q(this.f199384m, this.f199385n, dVar);
        qVar.f199383l = obj;
        return qVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:26:0x0103  */
    /* JADX WARN: Code duplicated, block: B:28:0x013e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x013f  */
    /* JADX WARN: Code duplicated, block: B:34:0x015c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00e9 -> B:24:0x00fd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x013f -> B:30:0x0143). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yt.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
