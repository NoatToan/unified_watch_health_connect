package ep;

import android.content.Context;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.powercurve.PowerCurveScreenKt$PowerCurveScreen$1$1", f = "PowerCurveScreen.kt", l = {81}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f64831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f64832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f64833c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f64834a;

        public a(Context context) {
            this.f64834a = context;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            ((Boolean) obj).booleanValue();
            Toast.makeText(this.f64834a, R.string.txt_error_occurred, 0).show();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, Context context, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f64832b = oVar;
        this.f64833c = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f64832b, this.f64833c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to ep.l for r4v1 'this'  t13.d
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            u13.a r0 = u13.a.COROUTINE_SUSPENDED
            int r1 = r4.f64831a
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 == r2) goto L10
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r5)
        Le:
            r5 = 0
            return r5
        L10:
            o13.r.b(r5)
            goto L2d
        L14:
            o13.r.b(r5)
            ep.o r5 = r4.f64832b
            r53.a2 r5 = r5.f64849h
            ep.l$a r1 = new ep.l$a
            android.content.Context r3 = r4.f64833c
            r1.<init>(r3)
            r4.f64831a = r2
            r53.d2<T> r5 = r5.f150526a
            java.lang.Object r5 = r5.collect(r1, r4)
            if (r5 != r0) goto L2d
            return r0
        L2d:
            o2.c.f()
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: ep.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
