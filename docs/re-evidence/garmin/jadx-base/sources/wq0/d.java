package wq0;

import android.content.Context;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p3.x3;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.insights.presentation.edit.EditInsightsScreenKt$EditInsightsScreen$1$1", f = "EditInsightsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f186588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l<List<tq0.f>, Unit> f186589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f186590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f186591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x3<z> f186592e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(l lVar, e23.l<? super List<tq0.f>, Unit> lVar2, e23.a<Unit> aVar, Context context, x3<z> x3Var, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f186588a = lVar;
        this.f186589b = lVar2;
        this.f186590c = aVar;
        this.f186591d = context;
        this.f186592e = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f186588a, this.f186589b, this.f186590c, this.f186591d, this.f186592e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        x3<z> x3Var = this.f186592e;
        boolean z14 = x3Var.getF182175a().f186621f;
        e23.a<Unit> aVar2 = this.f186590c;
        l lVar = this.f186588a;
        if (z14) {
            p2 p2Var = lVar.f186610d;
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, z.a((z) value2, false, null, null, false, false, false, 23)));
            p2 p2Var2 = lVar.f186610d;
            ArrayList arrayListC0 = h0.C0(((z) p2Var2.getValue()).f186617b, ((z) p2Var2.getValue()).f186618c);
            ArrayList arrayList = new ArrayList(p13.y.r(arrayListC0, 10));
            Iterator it = arrayListC0.iterator();
            while (it.hasNext()) {
                arrayList.add(((a0.b) it.next()).f186582b);
            }
            this.f186589b.invoke(arrayList);
            aVar2.invoke();
        }
        if (x3Var.getF182175a().f186619d) {
            Toast.makeText(this.f186591d, R.string.txt_error_occurred, 0).show();
            p2 p2Var3 = lVar.f186610d;
            do {
                value = p2Var3.getValue();
            } while (!p2Var3.b(value, z.a((z) value, false, null, null, false, false, false, 23)));
            aVar2.invoke();
        }
        return Unit.INSTANCE;
    }
}
