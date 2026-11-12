package p008y1;

import c53.l;
import com.google.mlkit.common.MlKitException;
import e23.a;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import v13.e;
import v13.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Lc53/l;", "", "<anonymous>", "(Lc53/l;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$untilNull$1", f = "MouseWheelScrollable.kt", l = {MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD}, m = "invokeSuspend", v = 1)
public final class u1 extends h implements p<l<Object>, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f193670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f193671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f193672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a<Object> f193673d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(a<Object> aVar, d<? super u1> dVar) {
        super(2, dVar);
        this.f193673d = aVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        u1 u1Var = new u1(this.f193673d, dVar);
        u1Var.f193672c = obj;
        return u1Var;
    }

    @Override // e23.p
    public final Object invoke(l<Object> lVar, d<? super Unit> dVar) {
        return ((u1) create(lVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0036 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0034 -> B:15:0x0038). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0037 -> B:15:0x0038). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:16:0x003a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            u13.a r0 = u13.a.COROUTINE_SUSPENDED
            int r1 = r4.f193671b
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L13
            java.lang.Object r1 = r4.f193670a
            java.lang.Object r3 = r4.f193672c
            c53.l r3 = (c53.l) r3
            o13.r.b(r5)
            goto L38
        L13:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r5)
            r5 = 0
            return r5
        L1a:
            o13.r.b(r5)
            java.lang.Object r5 = r4.f193672c
            c53.l r5 = (c53.l) r5
            r3 = r5
        L22:
            e23.a<java.lang.Object> r5 = r4.f193673d
            java.lang.Object r1 = r5.invoke()
            if (r1 == 0) goto L37
            r4.f193672c = r3
            r4.f193670a = r1
            r4.f193671b = r2
            u13.a r5 = r3.a(r1, r4)
            if (r5 != r0) goto L38
            return r0
        L37:
            r1 = 0
        L38:
            if (r1 != 0) goto L22
            kotlin.Unit r5 = p005kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p008y1.u1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
