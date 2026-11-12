package tu1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.e3;
import e23.p;
import o13.r;
import o53.b0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.FBTExtensionsKt$showPlanAddToHomeDialog$1$1", f = "FBTExtensions.kt", l = {579}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f166474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f166475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f166476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f166477d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.FBTExtensionsKt$showPlanAddToHomeDialog$1$1$1", f = "FBTExtensions.kt", l = {580, 581}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f166478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f166479b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f166480c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f166481d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view2, Context context, e23.a<Unit> aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f166479b = view2;
            this.f166480c = context;
            this.f166481d = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f166479b, this.f166480c, this.f166481d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        
            if (r8 == r0) goto L15;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f166478a;
            if (i14 == 0) {
                r.b(obj);
                e3 e3Var = (e3) KoinJavaComponent.get$default(e3.class, null, null, 6, null);
                this.f166478a = 1;
                if (e3Var.n(this) != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                Context context = this.f166480c;
                String string = context.getString(R.string.msg_added_to_home_screen, context.getString(R.string.atp_lbl_plans_section_title));
                string.getClass();
                eg0.c.c(this.f166479b, string);
            } else {
                this.f166481d.invoke();
            }
            return Unit.INSTANCE;
            e3 e3Var2 = (e3) KoinJavaComponent.get$default(e3.class, null, null, 6, null);
            this.f166478a = 2;
            obj = e3Var2.m(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(View view2, Context context, e23.a<Unit> aVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f166475b = view2;
        this.f166476c = context;
        this.f166477d = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f166475b, this.f166476c, this.f166477d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f166474a;
        if (i14 == 0) {
            r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f166475b, this.f166476c, this.f166477d, null);
            this.f166474a = 1;
            if (ge1.b.e0(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
