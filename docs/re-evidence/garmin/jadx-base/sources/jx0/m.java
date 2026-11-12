package jx0;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.v;
import c22.j0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import java.text.NumberFormat;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ljx0/m;", "Ljx0/d;", "Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/f$a;", "<init>", "()V", "b", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends d implements com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.f.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f101503l = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f101504k = 1;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljx0/m$b;", "Ljx0/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/fragment/app/v;", "fragmentManager", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/v;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends jx0.b {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Context f101505j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, v vVar) {
            super(vVar);
            context.getClass();
            vVar.getClass();
            this.f101505j = context;
        }

        @Override // jx0.b
        public final jx0.a b(ww0.k kVar, boolean z14) {
            return ((ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null)).n(kVar, z14);
        }

        @Override // jx0.b
        public final String c(ww0.k kVar, ww0.k.b bVar) {
            String string;
            String strA;
            String strA2;
            LocalDate localDate;
            String strB;
            String strB2;
            LocalDate localDateQ = kVar != null ? kVar.q() : null;
            if (localDateQ == null) {
                return "";
            }
            List<ww0.n> listF = kVar.f();
            if (listF != null && (!listF.isEmpty()) && bVar == ww0.k.b.CYCLE) {
                Integer avgCycleLength = kVar.getAvgCycleLength();
                if (avgCycleLength == null || (localDate = localDateQ.plusDays(avgCycleLength.intValue() - 1)) == null) {
                    localDate = new LocalDate();
                }
                i52.a.f91796a.getClass();
                if (i52.a.l() == ww0.a.PREGNANT || new LocalDate().isBefore(localDate)) {
                    localDate = new LocalDate();
                }
                DateTime dateTimeAtStartOfDay = localDate.toDateTimeAtStartOfDay(DateTimeZone.getDefault());
                DateTime dateTimeAtStartOfDay2 = localDateQ.toDateTimeAtStartOfDay();
                boolean z14 = localDateQ.getYear() != localDate.getYear();
                boolean z15 = localDate.getYear() != new LocalDate().getYear();
                if (z14) {
                    strB = j0.b(dateTimeAtStartOfDay2, "MMM d, yyyy", dateTimeAtStartOfDay2.getZone());
                    strB2 = j0.b(dateTimeAtStartOfDay, "MMM d, yyyy", dateTimeAtStartOfDay.getZone());
                } else if (z15) {
                    strB = j0.b(dateTimeAtStartOfDay2, "MMM d", dateTimeAtStartOfDay2.getZone());
                    strB2 = j0.b(dateTimeAtStartOfDay, "MMM d, yyyy", dateTimeAtStartOfDay.getZone());
                } else {
                    string = e5.g(j0.b(dateTimeAtStartOfDay2, "MMM d", dateTimeAtStartOfDay2.getZone()), " — ", j0.b(dateTimeAtStartOfDay, "MMM d", dateTimeAtStartOfDay.getZone()));
                }
                string = e5.g(strB, " — ", strB2);
            } else {
                List<ww0.n> listF2 = kVar.f();
                if (listF2 != null && (!listF2.isEmpty()) && bVar == ww0.k.b.WEEKS) {
                    LocalDate localDate2 = new LocalDate().isBefore(kVar.h()) ? new LocalDate() : kVar.h();
                    if (localDate2 != null) {
                        tb1.c.f163744a.getClass();
                        int year = new LocalDate().getYear();
                        int year2 = localDateQ.getYear();
                        int year3 = localDate2.getYear();
                        if (year == year2 && year == year3) {
                            j0 j0Var = j0.f23099a;
                            DateTime dateTime = new DateTime(localDateQ.toDate().getTime());
                            j0Var.getClass();
                            strA = j0.k(dateTime, 'M');
                            strA2 = j0.k(new DateTime(localDate2.toDate().getTime()), 'M');
                        } else if (year2 == year3) {
                            j0 j0Var2 = j0.f23099a;
                            DateTime dateTime2 = new DateTime(localDateQ.toDate().getTime());
                            j0Var2.getClass();
                            strA = j0.k(dateTime2, 'M');
                            strA2 = j0.a(new DateTime(localDate2.toDate().getTime()), 'M');
                        } else {
                            strA = j0.a(new DateTime(localDateQ.toDate().getTime()), 'M');
                            strA2 = j0.a(new DateTime(localDate2.toDate().getTime()), 'M');
                        }
                        string = e5.g(strA, " - ", strA2);
                    } else {
                        string = this.f101505j.getString(R.string.pregnancy_title);
                        string.getClass();
                    }
                } else {
                    j0.f23099a.getClass();
                    string = j0.w("MMMM yyyy").format(localDateQ.toDate());
                }
            }
            string.getClass();
            return string;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.f.a
    public final String A(Context context) {
        context.getClass();
        String string = context.getString(w6() ? R.string.mct_num_cycles : R.string.mct_number_months, NumberFormat.getIntegerInstance().format(1L));
        string.getClass();
        return string;
    }

    @Override // jx0.d
    public final boolean H6() {
        return false;
    }

    @Override // com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.f.a
    public final String k(i.c cVar) {
        cVar.getClass();
        if (w6()) {
            String string = cVar.getString(R.string.lbl_one_cycle);
            string.getClass();
            return string;
        }
        String string2 = cVar.getString(R.string.lbl_one_month);
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
        return new b(contextRequireContext, childFragmentManager);
    }

    @Override // jx0.d
    /* JADX INFO: renamed from: y6, reason: from getter */
    public final int getF101504k() {
        return this.f101504k;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljx0/m$a;", "", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
