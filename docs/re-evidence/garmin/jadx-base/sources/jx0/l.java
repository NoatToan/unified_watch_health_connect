package jx0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.v;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.l2;
import java.text.NumberFormat;
import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ljx0/l;", "Ljx0/d;", "Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/f$a;", "<init>", "()V", "b", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends d implements com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.f.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f101499k = new a(null);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ljx0/l$b;", "Ljx0/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/fragment/app/v;", "fragmentManager", "", "reportSize", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/v;I)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends jx0.b {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Context f101500j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f101501k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final pi0.e f101502l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, v vVar, int i14) {
            super(vVar);
            context.getClass();
            vVar.getClass();
            this.f101500j = context;
            this.f101501k = i14;
            this.f101502l = new pi0.e(context);
        }

        @Override // jx0.b
        public final jx0.a b(ww0.k kVar, boolean z14) {
            f.f101438w.getClass();
            f fVar = new f();
            jx0.a.C1950a c1950a = jx0.a.f101397n;
            if (kVar == null) {
                z14 = false;
            }
            c1950a.getClass();
            Bundle bundle = new Bundle();
            bundle.putParcelable("AbstractMenstrualCycleReportFragmentReport", kVar);
            bundle.putBoolean("AbstractMenstrualCycleReportFragmentLoading", z14);
            int i14 = this.f101501k;
            bundle.putInt("REPORT_SIZE", i14);
            bundle.putString("AbstractMenstrualCycleReportFragmentCycleReportState", "CYCLE_REPORT_" + i14);
            l2.f37135b.getClass();
            l2.a.c(fVar, bundle);
            return fVar;
        }

        @Override // jx0.b
        public final String c(ww0.k kVar, ww0.k.b bVar) {
            List<ww0.n> listF;
            String string = "";
            if (kVar != null && (listF = kVar.f()) != null && (!listF.isEmpty())) {
                LocalDate localDateQ = kVar.q();
                LocalDate localDateH = kVar.h();
                String strM = (localDateQ == null || localDateH == null) ? null : this.f101502l.m(localDateQ, localDateH, pi0.f.SHORT_MONTH_NO_WEEKDAY);
                return strM == null ? "" : strM;
            }
            if (this.f101410h.size() == 1 && !this.f101410h.get(0).f101415d) {
                string = this.f101500j.getString(R.string.mct_lbl_today);
            }
            string.getClass();
            return string;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.f.a
    public final String A(Context context) {
        context.getClass();
        String string = context.getString(R.string.mct_num_cycles, NumberFormat.getIntegerInstance().format(Integer.valueOf(getF101504k())));
        string.getClass();
        return string;
    }

    @Override // com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.f.a
    public final String k(i.c cVar) {
        cVar.getClass();
        if (getF101504k() == 1) {
            String string = cVar.getString(R.string.lbl_one_cycle);
            string.getClass();
            return string;
        }
        String string2 = cVar.getString(R.string.lbl_number_of_cycles, NumberFormat.getIntegerInstance().format(Integer.valueOf(getF101504k())));
        string2.getClass();
        return string2;
    }

    @Override // jx0.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        z6().setImportantForAccessibility(2);
    }

    @Override // jx0.d
    public final jx0.b u6() {
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        v childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        return new b(contextRequireContext, childFragmentManager, getF101504k());
    }

    @Override // jx0.d
    /* JADX INFO: renamed from: y6 */
    public final int getF101504k() {
        Bundle bundle = (Bundle) this.f101425g.getValue();
        if (bundle != null) {
            return bundle.getInt("REPORT_SIZE");
        }
        return 6;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljx0/l$a;", "", "<init>", "()V", "", "REPORT_SIZE_KEY", "Ljava/lang/String;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
