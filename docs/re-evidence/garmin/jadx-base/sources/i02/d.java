package i02;

import b5.a0;
import b5.h0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.draggable.grid.DragGestureKt$awaitLongPressOrCancellation$2", f = "DragGesture.kt", l = {80}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f86840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f86841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r0<a0> f86842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r0<a0> f86843d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/c;", "", "<anonymous>", "(Lb5/c;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.draggable.grid.DragGestureKt$awaitLongPressOrCancellation$2$1", f = "DragGesture.kt", l = {83, 100}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.h implements e23.p<b5.c, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b5.q f86844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f86845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f86846c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f86847d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ r0<a0> f86848e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ r0<a0> f86849f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r0<a0> r0Var, r0<a0> r0Var2, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f86848e = r0Var;
            this.f86849f = r0Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f86848e, this.f86849f, dVar);
            aVar.f86847d = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b5.c cVar, t13.d<? super Unit> dVar) {
            return ((a) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:103:0x00c8 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:104:? A[LOOP:5: B:49:0x00b6->B:104:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:20:0x004c  */
        /* JADX WARN: Code duplicated, block: B:23:0x0056  */
        /* JADX WARN: Code duplicated, block: B:29:0x0068  */
        /* JADX WARN: Code duplicated, block: B:32:0x006f  */
        /* JADX WARN: Code duplicated, block: B:35:0x0079  */
        /* JADX WARN: Code duplicated, block: B:37:0x0085  */
        /* JADX WARN: Code duplicated, block: B:51:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:93:0x0093 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:96:0x0063 A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v5, types: [T, b5.a0] */
        /* JADX WARN: Type inference failed for: r8v9 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00a2 -> B:43:0x00a5). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 326
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: i02.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h0 h0Var, r0<a0> r0Var, r0<a0> r0Var2, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f86841b = h0Var;
        this.f86842c = r0Var;
        this.f86843d = r0Var2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f86841b, this.f86842c, this.f86843d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f86840a;
        if (i14 == 0) {
            o13.r.b(obj);
            a aVar2 = new a(this.f86842c, this.f86843d, null);
            this.f86840a = 1;
            if (this.f86841b.R(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
