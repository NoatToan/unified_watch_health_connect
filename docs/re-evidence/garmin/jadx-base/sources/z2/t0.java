package z2;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class t0 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.l<Boolean, Unit> f201797a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/c;", "", "<anonymous>", "(Lb5/c;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1", f = "SelectionGestures.kt", l = {94}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.h implements e23.p<b5.c, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f201798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f201799b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.l<Boolean, Unit> f201800c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super Boolean, Unit> lVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f201800c = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f201800c, dVar);
            aVar.f201799b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b5.c cVar, t13.d<? super Unit> dVar) {
            return ((a) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x002c A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:12:0x002d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x002c
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                u13.a r0 = u13.a.COROUTINE_SUSPENDED
                int r1 = r4.f201798a
                r2 = 1
                if (r1 == 0) goto L18
                if (r1 != r2) goto L11
                java.lang.Object r1 = r4.f201799b
                b5.c r1 = (b5.c) r1
                o13.r.b(r5)
                goto L2d
            L11:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r5)
                r5 = 0
                return r5
            L18:
                o13.r.b(r5)
                java.lang.Object r5 = r4.f201799b
                b5.c r5 = (b5.c) r5
                r1 = r5
            L20:
                b5.s r5 = b5.s.Initial
                r4.f201799b = r1
                r4.f201798a = r2
                java.lang.Object r5 = r1.W0(r5, r4)
                if (r5 != r0) goto L2d
                return r0
            L2d:
                b5.q r5 = (b5.q) r5
                boolean r5 = z2.u0.a(r5)
                r5 = r5 ^ r2
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                e23.l<java.lang.Boolean, kotlin.Unit> r3 = r4.f201800c
                r3.invoke(r5)
                goto L20
            */
            throw new UnsupportedOperationException("Method not decompiled: z2.t0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t0(e23.l<? super Boolean, Unit> lVar) {
        this.f201797a = lVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(b5.h0 h0Var, t13.d<? super Unit> dVar) {
        Object objR = h0Var.R(new a(this.f201797a, null), dVar);
        return objR == u13.a.COROUTINE_SUSPENDED ? objR : Unit.INSTANCE;
    }
}
