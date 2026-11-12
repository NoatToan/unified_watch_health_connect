package e41;

import android.content.Context;
import android.text.SpannableStringBuilder;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.math.MathKt;
import p13.x;
import r22.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Le41/b;", "Lvz/b;", "Lx31/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "isCardView", "<init>", "(Landroid/content/Context;Z)V", "a", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements vz.b<x31.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f62863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f62864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x1 f62865c;

    /* JADX INFO: renamed from: e41.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C1323b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f62866a;

        static {
            int[] iArr = new int[x31.b.values().length];
            try {
                iArr[x31.b.BALANCED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x31.b.UNBALANCED_UPPER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x31.b.UNBALANCED_LOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x31.b.LOW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[x31.b.POOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[x31.b.NONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[x31.b.INVALID.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f62866a = iArr;
        }
    }

    static {
        new a(null);
    }

    public b(Context context, boolean z14) {
        context.getClass();
        this.f62863a = context;
        this.f62864b = z14;
        this.f62865c = new x1(context);
    }

    @Override // vz.b
    public final PieDataSet a(x31.a aVar) {
        x31.a aVar2 = aVar;
        float[] fArr = {12.5f, 12.5f, 50.0f, 25.0f};
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        for (int i15 = 0; i15 < 4; i15++) {
            arrayList.add(new PieEntry(fArr[i15]));
        }
        x31.b bVar = aVar2 != null ? aVar2.f188575c : null;
        int i16 = bVar == null ? -1 : C1323b.f62866a[bVar.ordinal()];
        Context context = this.f62863a;
        ArrayList arrayListD = (i16 == 1 || i16 == 2 || i16 == 3 || i16 == 4) ? x.d(Integer.valueOf(a7.b.getColor(context, R.color.gcm_chart_hrv_status_low)), Integer.valueOf(a7.b.getColor(context, R.color.gcm_chart_hrv_status_unbalanced)), Integer.valueOf(a7.b.getColor(context, R.color.gcm_chart_hrv_status_balanced)), Integer.valueOf(a7.b.getColor(context, R.color.gcm_chart_hrv_status_unbalanced))) : i16 != 5 ? x.d(Integer.valueOf(a7.b.getColor(context, R.color.gcm_progress_indicator_empty)), Integer.valueOf(a7.b.getColor(context, R.color.gcm_progress_indicator_empty)), Integer.valueOf(a7.b.getColor(context, R.color.gcm_progress_indicator_empty)), Integer.valueOf(a7.b.getColor(context, R.color.gcm_progress_indicator_empty))) : x.d(Integer.valueOf(a7.b.getColor(context, R.color.gcm_chart_hrv_status_poor)), Integer.valueOf(a7.b.getColor(context, R.color.gcm_progress_indicator_empty)), Integer.valueOf(a7.b.getColor(context, R.color.gcm_progress_indicator_empty)), Integer.valueOf(a7.b.getColor(context, R.color.gcm_progress_indicator_empty)));
        x31.b bVar2 = aVar2 != null ? aVar2.f188575c : null;
        int i17 = bVar2 == null ? -1 : C1323b.f62866a[bVar2.ordinal()];
        boolean z14 = (i17 == -1 || i17 == 5 || i17 == 6 || i17 == 7) ? false : true;
        float f14 = aVar2 != null ? aVar2.f188574b : -1.0f;
        if (z14 && f14 >= 0.0f) {
            x31.b bVar3 = aVar2 != null ? aVar2.f188575c : null;
            int i18 = bVar3 != null ? C1323b.f62866a[bVar3.ordinal()] : -1;
            if (i18 == 1) {
                i14 = 2;
            } else if (i18 == 3) {
                i14 = 1;
            } else if (i18 != 4) {
                i14 = 3;
            }
            ((PieEntry) arrayList.get(i14)).setData(Integer.valueOf(MathKt.c(f14 * 100.0f)));
        }
        PieDataSet pieDataSet = new PieDataSet(arrayList, "");
        pieDataSet.setColors(arrayListD);
        return pieDataSet;
    }

    @Override // vz.b
    public final CharSequence b(x31.a aVar) {
        x31.a aVar2 = aVar;
        int i14 = aVar2 != null ? aVar2.f188573a : Integer.MIN_VALUE;
        Context context = this.f62863a;
        if (i14 > 0) {
            String string = context.getString(R.string.lbl_milliseconds_7d_average_value, String.valueOf(i14));
            string.getClass();
            return string;
        }
        String string2 = context.getString(R.string.txt_empty_page_no_data);
        string2.getClass();
        return string2;
    }

    @Override // vz.b
    public final /* bridge */ /* synthetic */ void c(Object obj) {
    }

    @Override // vz.b
    public final CharSequence d(x31.a aVar) {
        x31.a aVar2 = aVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z14 = this.f62864b;
        int i14 = z14 ? R.style.CardPieChartCenterPrimaryValueText : R.style.PieChartCenterPrimaryValueText;
        int i15 = z14 ? R.style.CardPieChartCenterSecondaryText : R.style.PieChartCenterSecondaryText;
        int i16 = aVar2 != null ? aVar2.f188573a : Integer.MIN_VALUE;
        String strValueOf = i16 > 0 ? String.valueOf(i16) : "--";
        x1 x1Var = this.f62865c;
        spannableStringBuilder.append((CharSequence) x1.b(x1Var, strValueOf, i14));
        Context context = this.f62863a;
        if (!z14 && i16 > 0) {
            spannableStringBuilder.append((CharSequence) x1.b(x1Var, StringUtils.SPACE + context.getString(R.string.lbl_ms), R.style.Text_Title3_Primary));
        }
        spannableStringBuilder.append((CharSequence) "\n");
        String string = context.getString(R.string.lbl_7d_avg);
        string.getClass();
        spannableStringBuilder.append((CharSequence) x1.b(x1Var, string, i15));
        return spannableStringBuilder;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Le41/b$a;", "", "<init>", "()V", "", "PIE_PROGRESS_MAX", "F", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
