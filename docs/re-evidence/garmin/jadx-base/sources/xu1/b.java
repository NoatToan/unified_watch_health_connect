package xu1;

import android.content.Context;
import android.text.SpannableStringBuilder;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import d53.w;
import java.util.ArrayList;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.x;
import r22.x1;
import xn.r;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lxu1/b;", "Lvz/b;", "Lxu1/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements vz.b<xu1.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f192251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f192252b;

    static {
        new a(null);
    }

    public b(Context context) {
        context.getClass();
        this.f192251a = context;
        this.f192252b = m.b(new r(this, 4));
    }

    @Override // vz.b
    public final PieDataSet a(xu1.a aVar) {
        float f14;
        xu1.a aVar2 = aVar;
        Context context = this.f192251a;
        if (aVar2 == null) {
            PieDataSet pieDataSet = new PieDataSet(x.k(new PieEntry(50.0f), new PieEntry(50.0f)), "");
            pieDataSet.setColors(x.k(Integer.valueOf(a7.b.getColor(context, R.color.gds_data_viz_neutral_secondary)), Integer.valueOf(a7.b.getColor(context, R.color.gds_data_viz_neutral_secondary))));
            return pieDataSet;
        }
        int i14 = aVar2.f192247a;
        int i15 = aVar2.f192248b;
        if (i14 >= i15) {
            f14 = 100.0f;
        } else {
            f14 = i14 <= 0 ? 0.0f : (i14 * 100.0f) / i15;
        }
        int i16 = 0;
        if (f14 == 100.0f) {
            float[] fArr = {50.0f, 50.0f};
            ArrayList arrayList = new ArrayList();
            while (i16 < 2) {
                arrayList.add(new PieEntry(fArr[i16]));
                i16++;
            }
            PieDataSet pieDataSet2 = new PieDataSet(arrayList, "");
            pieDataSet2.setColors(x.k(Integer.valueOf(a7.b.getColor(context, R.color.gds_data_viz_blue_primary)), Integer.valueOf(a7.b.getColor(context, R.color.gds_data_viz_blue_primary))));
            return pieDataSet2;
        }
        if (f14 == 0.0f) {
            float[] fArr2 = {50.0f, 50.0f};
            ArrayList arrayList2 = new ArrayList();
            while (i16 < 2) {
                arrayList2.add(new PieEntry(fArr2[i16]));
                i16++;
            }
            PieDataSet pieDataSet3 = new PieDataSet(arrayList2, "");
            pieDataSet3.setColors(x.k(Integer.valueOf(a7.b.getColor(context, R.color.gds_data_viz_neutral_secondary)), Integer.valueOf(a7.b.getColor(context, R.color.gds_data_viz_neutral_secondary))));
            return pieDataSet3;
        }
        float[] fArr3 = {f14, 100.0f - f14};
        ArrayList arrayList3 = new ArrayList();
        while (i16 < 2) {
            arrayList3.add(new PieEntry(fArr3[i16]));
            i16++;
        }
        PieDataSet pieDataSet4 = new PieDataSet(arrayList3, "");
        pieDataSet4.setColors(x.k(Integer.valueOf(a7.b.getColor(context, R.color.gds_data_viz_blue_primary)), Integer.valueOf(a7.b.getColor(context, R.color.gds_data_viz_neutral_secondary))));
        return pieDataSet4;
    }

    @Override // vz.b
    public final CharSequence b(xu1.a aVar) {
        xu1.a aVar2 = aVar;
        String string = null;
        Integer numValueOf = aVar2 != null ? Integer.valueOf(aVar2.f192249c) : null;
        Integer numValueOf2 = aVar2 != null ? Integer.valueOf(aVar2.f192250d) : null;
        Context context = this.f192251a;
        if (numValueOf != null && numValueOf2 != null) {
            string = context.getString(R.string.week_num_of_num, String.valueOf(numValueOf.intValue()), String.valueOf(numValueOf2.intValue()));
        }
        if (string != null) {
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
    public final CharSequence d(xu1.a aVar) {
        xu1.a aVar2 = aVar;
        String string = this.f192251a.getString(R.string.week_num_of_num, aVar2 != null ? Integer.valueOf(aVar2.f192249c) : null, aVar2 != null ? Integer.valueOf(aVar2.f192250d) : null);
        string.getClass();
        int length = String.valueOf(aVar2 != null ? Integer.valueOf(aVar2.f192249c) : null).length() + w.H(string, String.valueOf(aVar2 != null ? Integer.valueOf(aVar2.f192249c) : null), 0, false, 6);
        String strSubstring = string.substring(0, length);
        String strSubstring2 = string.substring(length + 1, string.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        t tVar = this.f192252b;
        spannableStringBuilder.append((CharSequence) x1.b((x1) tVar.getValue(), strSubstring, R.style.FBTPieChartCenterPrimaryValueText));
        spannableStringBuilder.append((CharSequence) "\n");
        spannableStringBuilder.append((CharSequence) x1.b((x1) tVar.getValue(), strSubstring2, R.style.Text_Body2_Secondary));
        return spannableStringBuilder;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lxu1/b$a;", "", "<init>", "()V", "", "PROGRESS_MAX", "F", "PROGRESS_HALF", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
