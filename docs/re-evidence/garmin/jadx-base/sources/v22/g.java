package v22;

import android.view.View;
import android.view.ViewGroup;
import c53.l;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc53/l;", "Landroid/view/View;", "", "<anonymous>", "(Lc53/l;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.view.extensions.ViewGroupExtensionsKt$getChildren$1", f = "ViewGroupExtensions.kt", l = {9}, m = "invokeSuspend", v = 2)
public final class g extends h implements p<l<? super View>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f175345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f175346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f175347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f175348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f175349e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ViewGroup viewGroup, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f175349e = viewGroup;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f175349e, dVar);
        gVar.f175348d = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(l<? super View> lVar, t13.d<? super Unit> dVar) {
        return ((g) create(lVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:12:0x003f A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003d -> B:13:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f175348d
            c53.l r0 = (c53.l) r0
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r6.f175347c
            android.view.ViewGroup r3 = r6.f175349e
            r4 = 1
            if (r2 == 0) goto L1e
            if (r2 != r4) goto L17
            int r2 = r6.f175346b
            int r5 = r6.f175345a
            o13.r.b(r7)
            goto L40
        L17:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r7)
            r7 = 0
            return r7
        L1e:
            o13.r.b(r7)
            int r7 = r3.getChildCount()
            r2 = 0
            r5 = r2
            r2 = r7
        L28:
            if (r5 >= r2) goto L42
            android.view.View r7 = r3.getChildAt(r5)
            r7.getClass()
            r6.f175348d = r0
            r6.f175345a = r5
            r6.f175346b = r2
            r6.f175347c = r4
            u13.a r7 = r0.a(r7, r6)
            if (r7 != r1) goto L40
            return r1
        L40:
            int r5 = r5 + r4
            goto L28
        L42:
            kotlin.Unit r7 = p005kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v22.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
