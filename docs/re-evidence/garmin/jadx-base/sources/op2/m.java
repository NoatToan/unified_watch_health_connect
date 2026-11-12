package op2;

import android.content.Context;
import android.content.Intent;
import com.garmin.feature.garminpay.providers.gpay.model.Product;
import com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballAddCardActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.common.NewFitPayWebNavigationActivity;
import java.util.List;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.common.NewFitPayWebNavigationActivity$navigateToSnowballAddCardFlow$1", f = "NewFitPayWebNavigationActivity.kt", l = {427}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f133235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f133236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NewFitPayWebNavigationActivity f133237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd2.f f133238d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(boolean z14, NewFitPayWebNavigationActivity newFitPayWebNavigationActivity, sd2.f fVar, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f133236b = z14;
        this.f133237c = newFitPayWebNavigationActivity;
        this.f133238d = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f133236b, this.f133237c, this.f133238d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:28:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0072  */
    /* JADX WARN: Code duplicated, block: B:32:0x0076  */
    /* JADX WARN: Code duplicated, block: B:34:0x0088  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x0076, please report this as an issue */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        qy2.d dVar;
        SnowballAddCardActivity.a aVar;
        Context contextC;
        d dVar2;
        Product productV1;
        d dVar3;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f133235a;
        NewFitPayWebNavigationActivity newFitPayWebNavigationActivity = this.f133237c;
        if (i14 == 0) {
            r.b(obj);
            if (this.f133236b) {
                d dVar4 = newFitPayWebNavigationActivity.f51554j;
                if (dVar4 == null) {
                    s.m("fitPayWebNavigationViewModel");
                    throw null;
                }
                this.f133235a = 1;
                obj = dVar4.y(this);
                if (obj == aVar2) {
                    return aVar2;
                }
            }
            dVar = qy2.d.f148594a;
            aVar = SnowballAddCardActivity.f51227j;
            contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
            dVar2 = newFitPayWebNavigationActivity.f51554j;
            if (dVar2 != null) {
                s.m("fitPayWebNavigationViewModel");
                throw null;
            }
            productV1 = dVar2.getProduct();
            if (productV1 == null) {
                dVar3 = newFitPayWebNavigationActivity.f51554j;
                if (dVar3 == null) {
                    s.m("fitPayWebNavigationViewModel");
                    throw null;
                }
                throw new ns2.d("No product specified in " + dVar3);
            }
            aVar.getClass();
            sd2.f fVar = this.f133238d;
            fVar.getClass();
            Intent intent = new Intent(contextC, (Class<?>) SnowballAddCardActivity.class);
            intent.putExtra("extra.synthesize.model_factory", new SnowballAddCardActivity.a.C1058a(fVar, productV1));
            intent.putExtra("extra.synthesize.presenter_factory", new SnowballAddCardActivity.a.b());
            oc.b.L(newFitPayWebNavigationActivity, dVar, intent, newFitPayWebNavigationActivity.f51563t);
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        List list = (List) obj;
        if (!list.isEmpty()) {
            if (list.size() > 1) {
                NewFitPayWebNavigationActivity.f51550x.warn("Unexpected state: more than one Snowball cards on a device.");
            }
            hn2.c.U9(newFitPayWebNavigationActivity, newFitPayWebNavigationActivity, null, 12);
            newFitPayWebNavigationActivity.finish();
            return Unit.INSTANCE;
        }
        dVar = qy2.d.f148594a;
        aVar = SnowballAddCardActivity.f51227j;
        contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
        dVar2 = newFitPayWebNavigationActivity.f51554j;
        if (dVar2 != null) {
            s.m("fitPayWebNavigationViewModel");
            throw null;
        }
        productV1 = dVar2.getProduct();
        if (productV1 == null) {
            dVar3 = newFitPayWebNavigationActivity.f51554j;
            if (dVar3 == null) {
                s.m("fitPayWebNavigationViewModel");
                throw null;
            }
            throw new ns2.d("No product specified in " + dVar3);
        }
        aVar.getClass();
        sd2.f fVar2 = this.f133238d;
        fVar2.getClass();
        Intent intent2 = new Intent(contextC, (Class<?>) SnowballAddCardActivity.class);
        intent2.putExtra("extra.synthesize.model_factory", new SnowballAddCardActivity.a.C1058a(fVar2, productV1));
        intent2.putExtra("extra.synthesize.presenter_factory", new SnowballAddCardActivity.a.b());
        oc.b.L(newFitPayWebNavigationActivity, dVar, intent2, newFitPayWebNavigationActivity.f51563t);
        return Unit.INSTANCE;
    }
}
