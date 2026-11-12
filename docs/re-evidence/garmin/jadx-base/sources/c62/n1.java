package c62;

import android.content.Context;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n1 implements l52.u, SuccessContinuation, r22.c0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f24818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24820c;

    public /* synthetic */ n1(Object obj, Object obj2, boolean z14) {
        this.f24819b = obj;
        this.f24818a = z14;
        this.f24820c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r22.c0.b
    public void h(Calendar calendar) {
        gg0.f fVar;
        Calendar calendar2 = (Calendar) this.f24819b;
        dz1.c cVar = (dz1.c) this.f24820c;
        dz1.c.a aVar = dz1.c.f61669w;
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        int i14 = Calendar.getInstance().get(1);
        int i15 = calendar.get(1);
        c22.j0 j0Var = c22.j0.f23099a;
        String string = new DateTime(calendar).toLocalDate().toString();
        j0Var.getClass();
        String strC = c22.j0.c(string, "yyyy-MM-dd", "MM/dd/yy", "");
        if (this.f24818a) {
            cVar.f61685p = i15 > i14 ? "MMM d, yyyy" : "MMM d";
            TextView textView = cVar.f61681l;
            if (textView == null) {
                p005kotlin.jvm.internal.s.m("textViewBeginningDate");
                throw null;
            }
            textView.setText(strC);
            cVar.f61683n = strC.toString();
            cz1.a aVarW6 = cVar.w6();
            String str = cVar.f61683n;
            str.getClass();
            ((androidx.lifecycle.y0) aVarW6.f56874k0.getValue()).j(str);
            cz1.a aVarW7 = cVar.w6();
            ny1.f fVar2 = ny1.f.CUSTOM;
            cz1.a.h5(aVarW7, fVar2, cVar.f61683n, null, 4);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yy", Locale.getDefault());
            if (simpleDateFormat.parse(cVar.f61683n).after(simpleDateFormat.parse(cVar.f61684o))) {
                cVar.f61686q = "MMM d, yyyy";
                String strC2 = c22.j0.c(new DateTime(calendar).toLocalDate().plusDays(7).toString(), "yyyy-MM-dd", "MM/dd/yy", "");
                TextView textView2 = cVar.f61682m;
                if (textView2 == null) {
                    p005kotlin.jvm.internal.s.m("textViewEndingDate");
                    throw null;
                }
                textView2.setText(strC2);
                cVar.f61684o = strC2.toString();
                cz1.a aVarW8 = cVar.w6();
                String str2 = cVar.f61684o;
                str2.getClass();
                ((androidx.lifecycle.y0) aVarW8.H0.getValue()).j(str2);
                cz1.a.h5(cVar.w6(), fVar2, null, cVar.f61684o, 2);
            }
        } else {
            cVar.f61686q = i15 > i14 ? "MMM d, yyyy" : "MMM d";
            TextView textView3 = cVar.f61682m;
            if (textView3 == null) {
                p005kotlin.jvm.internal.s.m("textViewEndingDate");
                throw null;
            }
            textView3.setText(strC);
            cVar.f61684o = strC.toString();
            cz1.a aVarW9 = cVar.w6();
            String str3 = cVar.f61684o;
            str3.getClass();
            ((androidx.lifecycle.y0) aVarW9.H0.getValue()).j(str3);
            cz1.a.h5(cVar.w6(), ny1.f.CUSTOM, null, cVar.f61684o, 2);
        }
        String strD = c22.j0.d(cVar.f61683n, cVar.f61685p);
        String strD2 = c22.j0.d(cVar.f61684o, cVar.f61686q);
        my1.d dVar = (my1.d) cVar.w6().L0.d();
        if (dVar == null || (fVar = dVar.f121487d) == null) {
            return;
        }
        Context contextRequireContext = cVar.requireContext();
        contextRequireContext.getClass();
        String strA = fVar.a(contextRequireContext);
        TextView textView4 = cVar.f61680k;
        if (textView4 != null) {
            textView4.setText(cVar.getString(R.string.find_events_between_date_range, strA, strD, strD2));
        } else {
            p005kotlin.jvm.internal.s.m("dateRangeView");
            throw null;
        }
    }

    @Override // l52.u
    public void o(l52.i.a aVar) {
        com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar = (com.garmin.android.apps.connectmobile.workouts.presentation.details.f) this.f24819b;
        m52.k kVar = (m52.k) this.f24820c;
        int i14 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
        com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar.getData();
        if (this.f24818a) {
            String str = j0Var.L0;
            if (g22.n.d(str)) {
                for (com.garmin.android.apps.connectmobile.workouts.data.model.b bVar : fVar.f48609x) {
                    String benchmarkKey = bVar.getBenchmarkKey();
                    if (g22.n.d(benchmarkKey) && d53.u.q(benchmarkKey, str, true)) {
                        Double dM = bVar.m();
                        j0Var.N0 = dM != null ? dM.doubleValue() : Double.NaN;
                        break;
                    }
                }
            }
        } else {
            com.garmin.android.apps.connectmobile.workouts.data.model.j0.a aVar2 = com.garmin.android.apps.connectmobile.workouts.data.model.j0.Q0;
            j0Var.L0 = null;
            j0Var.M0 = Double.NaN;
            j0Var.N0 = Double.NaN;
        }
        if (kVar == m52.k.f116754n && j0Var.f48217c == m52.d.RECOVERY && p005kotlin.jvm.internal.s.g(j0Var.H0, "RUN") && p005kotlin.jvm.internal.s.g(j0Var.g(), "WALK")) {
            j0Var.f48217c = m52.d.WALK;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return ((ConfigCacheClient) this.f24819b).lambda$put$1(this.f24818a, (ConfigContainer) this.f24820c, (Void) obj);
    }

    public /* synthetic */ n1(boolean z14, com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar, m52.k kVar) {
        this.f24818a = z14;
        this.f24819b = fVar;
        this.f24820c = kVar;
    }
}
