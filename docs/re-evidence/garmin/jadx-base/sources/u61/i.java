package u61;

import android.content.Context;
import android.text.SpannableStringBuilder;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import java.util.ArrayList;
import o13.p;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;
import p13.x;
import r22.x1;
import x61.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lu61/i;", "Lvz/b;", "Lx61/t;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements vz.b<t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f168885a;

    public i(Context context) {
        context.getClass();
        this.f168885a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vz.b
    public final PieDataSet a(t tVar) {
        t tVar2 = tVar;
        Context context = this.f168885a;
        ArrayList arrayListD = x.d(Integer.valueOf(a7.b.getColor(context, R.color.gcm_vo2_max_poor)), Integer.valueOf(a7.b.getColor(context, R.color.gcm_vo2_max_fair)), Integer.valueOf(a7.b.getColor(context, R.color.gcm_vo2_max_good)), Integer.valueOf(a7.b.getColor(context, R.color.gcm_vo2_max_excellent)), Integer.valueOf(a7.b.getColor(context, R.color.gcm_vo2_max_superior)));
        float[] fArr = {40.0f, 15.0f, 15.0f, 15.0f, 15.0f};
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < 5; i14++) {
            arrayList.add(new PieEntry(fArr[i14]));
        }
        if (tVar2 != null) {
            double d14 = tVar2.f189283c;
            a61.e.f1563a.getClass();
            if (a61.e.k(d14)) {
                p pVarI = oi0.c.I(d14, oi0.c.j(tVar2.f189281a, d14));
                int iIntValue = ((Number) pVarI.f128595b).intValue();
                int iIntValue2 = ((Number) pVarI.f128594a).intValue();
                if (iIntValue2 >= 0 && iIntValue2 < arrayList.size() && iIntValue >= 0) {
                    ((PieEntry) arrayList.get(iIntValue2)).setData(Integer.valueOf(iIntValue));
                }
            }
        }
        PieDataSet pieDataSet = new PieDataSet(arrayList, "");
        pieDataSet.setColors(arrayListD);
        return pieDataSet;
    }

    @Override // vz.b
    public final CharSequence b(t tVar) {
        t tVar2 = tVar;
        if (tVar2 == null) {
            String string = this.f168885a.getString(R.string.txt_empty_page_no_data);
            string.getClass();
            return string;
        }
        int iB = MathKt.b(tVar2.f189282b);
        String str = tVar2.f189284d;
        if (str == null) {
            str = "";
        }
        return org.apache.commons.lang3.e.d(iB, StringUtils.SPACE, str);
    }

    @Override // vz.b
    public final /* bridge */ /* synthetic */ void c(Object obj) {
    }

    @Override // vz.b
    public final CharSequence d(t tVar) {
        String string;
        String str;
        t tVar2 = tVar;
        double d14 = tVar2 != null ? tVar2.f189282b : Double.NaN;
        a61.e.f1563a.getClass();
        boolean zK = a61.e.k(d14);
        Context context = this.f168885a;
        if (zK) {
            string = String.valueOf(MathKt.b(d14));
        } else {
            string = context.getString(R.string.no_value);
            string.getClass();
        }
        x1 x1Var = new x1(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) x1.b(x1Var, string, R.style.PieChartCenterPrimaryValueText));
        spannableStringBuilder.append('\n');
        if (tVar2 == null || (str = tVar2.f189284d) == null) {
            str = "";
        }
        spannableStringBuilder.append((CharSequence) x1.b(x1Var, str, R.style.PieChartCenterSecondaryText));
        return spannableStringBuilder;
    }
}
