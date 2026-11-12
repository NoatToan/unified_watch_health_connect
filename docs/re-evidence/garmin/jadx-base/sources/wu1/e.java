package wu1;

import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import bv1.a0;
import bv1.z;
import c80.q;
import com.google.mlkit.common.MlKitException;
import e23.p;
import java.util.ArrayList;
import java.util.List;
import jv1.n;
import kotlin.w3;
import o13.r;
import o53.b0;
import o53.s0;
import o53.t1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.y;
import tw1.m;
import u53.o;
import zd0.j1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.dashboard.adapter.FBTDashboardAdapter$updateDashboard$4", f = "FBTDashboardAdapter.kt", l = {MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f187288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f187289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f187290c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.dashboard.adapter.FBTDashboardAdapter$updateDashboard$4$1", f = "FBTDashboardAdapter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f187291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n f187292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f187293c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, n nVar, boolean z14, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f187291a = cVar;
            this.f187292b = nVar;
            this.f187293c = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f187291a, this.f187292b, this.f187293c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            c cVar = this.f187291a;
            h hVar = cVar.f187285r;
            a0 a0Var = cVar.f187281n;
            n nVar = this.f187292b;
            String str = nVar.f101087i;
            List<av1.h> list = nVar.B;
            m mVar = nVar.f101079a;
            boolean z14 = this.f187293c;
            boolean z15 = (mVar == null || !mVar.q0() || z14) ? false : true;
            ComposeView composeView = hVar.f187317c;
            composeView.setViewCompositionStrategy(w3.d.f91628b);
            composeView.setContent(new z3.e(1986198450, true, new g(str, z15, hVar, 0)));
            if (z14 && list != null && (!list.isEmpty())) {
                a0Var.f21420a.setVisibility(0);
                a0Var.getClass();
                list.getClass();
                List<av1.h> listS0 = h0.S0(list, 6);
                Context context = a0Var.f21420a.getContext();
                context.getClass();
                listS0.getClass();
                ArrayList arrayList = new ArrayList(y.r(listS0, 10));
                for (av1.h hVar2 : listS0) {
                    int identifier = context.getResources().getIdentifier(hVar2.getTitleI18nKey(), "string", context.getPackageName());
                    hv1.c contentType = hVar2.getContentType();
                    contentType.getClass();
                    String strF = hVar2.f(!(contentType == hv1.c.VIDEO));
                    long contentId = hVar2.getContentId();
                    hv1.b category = hVar2.getCategory();
                    category.getClass();
                    String string = context.getString(category.f85832a);
                    string.getClass();
                    String string2 = identifier != 0 ? context.getString(identifier) : hVar2.getTitle();
                    string2.getClass();
                    arrayList.add(new av1.g(contentId, string, null, string2, strF, hVar2.getLengthInSeconds(), hVar2.getImageUrlSmall(), hVar2.getContentType(), !hVar2.getSeen()));
                }
                i53.c cVarE = i53.a.e(arrayList);
                ComposeView composeView2 = a0Var.f21379c;
                composeView2.setViewCompositionStrategy(w3.d.f91628b);
                composeView2.setContent(new z3.e(1615144367, true, new z(cVarE, list, a0Var, 0)));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, n nVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f187289b = cVar;
        this.f187290c = nVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f187289b, this.f187290c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (ge1.b.e0(r1, r3, r7) == r0) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f187288a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        j1 j1Var = (j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null);
        q qVar = q.TRAINING_MEDIA;
        this.f187288a = 1;
        obj = j1Var.l(qVar, this);
        if (obj != aVar) {
        }
        return aVar;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        x53.c cVar = s0.f129406a;
        t1 t1Var = o.f168762a;
        a aVar2 = new a(this.f187289b, this.f187290c, zBooleanValue, null);
        this.f187288a = 2;
    }
}
