package p13;

import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lc53/l;", "", "", "<anonymous>", "(Lc53/l;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", l = {34, 40, 49, 55, 58}, m = "invokeSuspend", v = 2)
public final class d1 extends v13.h implements e23.p<c53.l<? super List<Object>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f134928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f134929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f134930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f134931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f134932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f134933f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f134934g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f134935h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Iterator<Object> f134936i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f134937j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f134938k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(int i14, int i15, Iterator<Object> it, boolean z14, boolean z15, t13.d<? super d1> dVar) {
        super(2, dVar);
        this.f134934g = i14;
        this.f134935h = i15;
        this.f134936i = it;
        this.f134937j = z14;
        this.f134938k = z15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d1 d1Var = new d1(this.f134934g, this.f134935h, this.f134936i, this.f134937j, this.f134938k, dVar);
        d1Var.f134933f = obj;
        return d1Var;
    }

    @Override // e23.p
    public final Object invoke(c53.l<? super List<Object>> lVar, t13.d<? super Unit> dVar) {
        return ((d1) create(lVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:56:0x0111  */
    /* JADX WARN: Code duplicated, block: B:58:0x0115  */
    /* JADX WARN: Code duplicated, block: B:60:0x011c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0121  */
    /* JADX WARN: Code duplicated, block: B:64:0x0126  */
    /* JADX WARN: Code duplicated, block: B:67:0x0138 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x013a  */
    /* JADX WARN: Code duplicated, block: B:69:0x013c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ab -> B:36:0x00ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x010f -> B:66:0x0134). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0151 -> B:73:0x0154). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0182 -> B:85:0x0185). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p13.d1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
