package fs0;

import android.content.Context;
import android.text.SpannableStringBuilder;
import androidx.core.view.j;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p13.h0;
import p13.x;
import r22.x1;
import yr0.f;
import yr0.g;
import yr0.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lfs0/a;", "Lvz/b;", "Lyr0/g;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements vz.b<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f73413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x1 f73414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ks0.c f73415c;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f73416a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.PRE_TRIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.TRAVELING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.AT_DESTINATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f73416a = iArr;
        }
    }

    static {
        new C1481a(null);
    }

    public a(Context context) {
        context.getClass();
        this.f73413a = context;
        this.f73414b = new x1(context);
        this.f73415c = new ks0.c(context);
    }

    @Override // vz.b
    public final PieDataSet a(g gVar) {
        ArrayList arrayListD;
        f fVar;
        t tVar;
        g gVar2 = gVar;
        ArrayList arrayList = new ArrayList(4);
        for (int i14 = 0; i14 < 4; i14++) {
            arrayList.add(new PieEntry(25.0f));
        }
        ns0.b.f127812a.getClass();
        boolean z14 = (gVar2 == null || (tVar = gVar2.f198960c) == null || (gVar2.f198958a.getSeverity() > 0 && !x.k(t.PAST_PRE_TRIP, t.PAST_TRAVEL_DAY, t.PAST_NO_GUIDANCE, t.PAST_PRE_FLIGHT, t.PRE_TRIP, t.TRAVELING).contains(tVar))) ? false : true;
        if (!z14 && gVar2 != null && (fVar = gVar2.f198958a) != null) {
            int severity = fVar.getSeverity();
            int severity2 = (severity == 0 || severity == 1 || severity == 2) ? 0 : fVar.getSeverity() - 2;
            Integer severityPercentage = fVar.getSeverityPercentage();
            ((PieEntry) arrayList.get(severity2)).setData(h0.R(x.k(t.ACCLIMATED, t.PAST_ACCLIMATED), gVar2.f198960c) ? 0 : Integer.valueOf(j.a(severityPercentage != null ? severityPercentage.intValue() : 0, 25, 100, severity2 * 25)));
        }
        Context context = this.f73413a;
        if (z14) {
            ArrayList arrayList2 = new ArrayList(4);
            for (int i15 = 0; i15 < 4; i15++) {
                arrayList2.add(Integer.valueOf(a7.b.getColor(context, R.color.gcm_surface_3)));
            }
            arrayListD = arrayList2;
        } else {
            arrayListD = x.d(Integer.valueOf(a7.b.getColor(context, R.color.gcm_jet_lag_gauge_slight_interval)), Integer.valueOf(a7.b.getColor(context, R.color.gcm_jet_lag_gauge_moderate_interval)), Integer.valueOf(a7.b.getColor(context, R.color.gcm_jet_lag_gauge_significant_interval)), Integer.valueOf(a7.b.getColor(context, R.color.gcm_jet_lag_gauge_severe_interval)));
        }
        PieDataSet pieDataSet = new PieDataSet(arrayList, "");
        pieDataSet.setColors(arrayListD);
        return pieDataSet;
    }

    @Override // vz.b
    public final CharSequence b(g gVar) {
        g gVar2 = gVar;
        if (gVar2 != null && gVar2.f198960c != t.PAST_NO_GUIDANCE) {
            return e(gVar2);
        }
        String string = this.f73413a.getString(R.string.txt_empty_page_no_data);
        string.getClass();
        return string;
    }

    @Override // vz.b
    public final /* bridge */ /* synthetic */ void c(Object obj) {
    }

    @Override // vz.b
    public final CharSequence d(g gVar) {
        return e(gVar);
    }

    public final SpannableStringBuilder e(g gVar) {
        f fVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        t tVar = gVar != null ? gVar.f198960c : null;
        ns0.b bVar = ns0.b.f127812a;
        Integer numValueOf = (gVar == null || (fVar = gVar.f198958a) == null) ? null : Integer.valueOf(fVar.getSeverity());
        bVar.getClass();
        boolean zP = ns0.b.p(numValueOf, tVar);
        boolean zN = ns0.b.n(gVar);
        Integer numJ = ns0.b.j(gVar);
        ks0.c cVar = this.f73415c;
        SpannableStringBuilder spannableStringBuilderC = cVar.c(numJ);
        CharSequence charSequenceB = cVar.b(numJ != null ? Double.valueOf(((double) numJ.intValue()) / 60.0d) : null);
        Context context = this.f73413a;
        if (!zN) {
            charSequenceB = context.getString(R.string.lbl_acclimated);
            charSequenceB.getClass();
        }
        int i14 = zN ? 2132149045 : R.style.Text_Title3_Primary;
        x1 x1Var = this.f73414b;
        SpannableStringBuilder spannableStringBuilderB = x1.b(x1Var, charSequenceB, i14);
        int i15 = tVar == null ? -1 : b.f73416a[tVar.ordinal()];
        if (i15 != 1 && i15 != 2 && i15 != 3) {
            spannableStringBuilderC = spannableStringBuilderB;
        }
        String strH = cVar.h(tVar);
        if (strH != null && !zP) {
            spannableStringBuilder.append((CharSequence) x1.b(x1Var, strH, R.style.Text_Caption_Primary));
            spannableStringBuilder.append('\n');
        }
        String string = context.getString(R.string.no_value_card);
        string.getClass();
        SpannableStringBuilder spannableStringBuilderB2 = x1.b(x1Var, string, R.style.Text_Title1_Primary);
        if (zP) {
            spannableStringBuilderC = spannableStringBuilderB2;
        }
        spannableStringBuilder.append((CharSequence) spannableStringBuilderC);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: fs0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lfs0/a$a;", "", "<init>", "()V", "", "ONE_HOUR_IN_MINUTES", "D", "", "EMPTY_STRING", "Ljava/lang/String;", "", "SLICES_COUNT", "I", "ONE_HUNDRED_PERCENT", "SLICE_PERCENTAGE", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1481a {
        public /* synthetic */ C1481a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1481a() {
        }
    }
}
