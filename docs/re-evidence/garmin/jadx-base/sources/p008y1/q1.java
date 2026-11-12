package p008y1;

import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.o0;
import p005kotlin.jvm.internal.r0;
import s1.m;
import s1.n;
import t13.d;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly1/y1;", "", "<anonymous>", "(Ly1/y1;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3", f = "MouseWheelScrollable.kt", l = {297, 310, 334}, m = "invokeSuspend", v = 1)
public final class q1 extends i implements p<y1, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m0 f193563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m0 f193564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f193565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f193566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f193567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o0 f193568f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r0<m<Float, n>> f193569g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r0<n1.a> f193570h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f193571i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n1 f193572j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f193573k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h3 f193574l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(o0 o0Var, r0<m<Float, n>> r0Var, r0<n1.a> r0Var2, float f14, n1 n1Var, float f15, h3 h3Var, d<? super q1> dVar) {
        super(2, dVar);
        this.f193568f = o0Var;
        this.f193569g = r0Var;
        this.f193570h = r0Var2;
        this.f193571i = f14;
        this.f193572j = n1Var;
        this.f193573k = f15;
        this.f193574l = h3Var;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        q1 q1Var = new q1(this.f193568f, this.f193569g, this.f193570h, this.f193571i, this.f193572j, this.f193573k, this.f193574l, dVar);
        q1Var.f193567e = obj;
        return q1Var;
    }

    @Override // e23.p
    public final Object invoke(y1 y1Var, d<? super Unit> dVar) {
        return ((q1) create(y1Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0085  */
    /* JADX WARN: Code duplicated, block: B:19:0x008f  */
    /* JADX WARN: Code duplicated, block: B:22:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:23:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:27:0x0132  */
    /* JADX WARN: Code duplicated, block: B:30:0x0137  */
    /* JADX WARN: Code duplicated, block: B:33:0x013d  */
    /* JADX WARN: Code duplicated, block: B:36:0x015b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0189  */
    /* JADX WARN: Code duplicated, block: B:48:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, s1.m] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x015b -> B:37:0x015c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0167 -> B:38:0x0164). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p008y1.q1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
