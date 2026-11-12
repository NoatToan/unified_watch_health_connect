package uy0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lcom/garmin/android/apps/connectmobile/navigation/more/b;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.navigation.domain.GetProfileAndPrivacySearchItemsUseCase$invoke$2", f = "GetProfileAndPrivacySearchItemsUseCase.kt", l = {69, 87}, m = "invokeSuspend", v = 2)
public final class n0 extends v13.i implements e23.p<o53.b0, t13.d<? super List<com.garmin.android.apps.connectmobile.navigation.more.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f173252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m0 f173253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m0 f173254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f173255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Iterator f173256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f173257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f173258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Collection f173259h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Iterator f173260i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public m12.t f173261j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f173262k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f173263l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f173264m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f173265n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f173266o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f173267p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ m12.t f173268q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m0 f173269r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(m12.t tVar, m0 m0Var, t13.d<? super n0> dVar) {
        super(2, dVar);
        this.f173268q = tVar;
        this.f173269r = m0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n0(this.f173268q, this.f173269r, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super List<com.garmin.android.apps.connectmobile.navigation.more.b>> dVar) {
        return ((n0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:21:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:24:0x00f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:27:0x0101  */
    /* JADX WARN: Code duplicated, block: B:29:0x0104  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Iterator, uy0.m0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x008f -> B:16:0x00ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00e3 -> B:22:0x00ec). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0165 -> B:39:0x0168). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uy0.n0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
