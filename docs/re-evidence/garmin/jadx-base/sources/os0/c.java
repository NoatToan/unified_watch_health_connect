package os0;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import o13.p;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import yr0.o;
import z3.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Los0/c;", "", "Landroid/view/View;", "view", "Lkotlin/Function0;", "", "onAddTripPressed", "<init>", "(Landroid/view/View;Le23/a;)V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.a<Unit> f133542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ks0.c f133543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ComposeView f133544c;

    public c(View view2, e23.a<Unit> aVar) {
        view2.getClass();
        aVar.getClass();
        this.f133542a = aVar;
        Context context = view2.getContext();
        context.getClass();
        this.f133543b = new ks0.c(context);
        View viewFindViewById = view2.findViewById(R.id.jet_lag_empty);
        viewFindViewById.getClass();
        this.f133544c = (ComposeView) viewFindViewById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(o oVar) {
        if (oVar != null) {
            ns0.b.f127812a.getClass();
            String strF = ns0.b.f(oVar);
            p pVarL = ns0.b.l(oVar);
            this.f133544c.setContent(new e(-768251364, true, new a(this, e5.g(strF, ", ", this.f133543b.a(pVarL != null ? (DateTime) pVarL.f128594a : null, pVarL != null ? (DateTime) pVarL.f128595b : null)), 0)));
        }
    }
}
