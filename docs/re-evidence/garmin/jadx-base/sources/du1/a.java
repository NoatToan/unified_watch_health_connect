package du1;

import android.content.Context;
import android.text.SpannableStringBuilder;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import fu1.g;
import java.util.ArrayList;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.x;
import r22.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Ldu1/a;", "Lvz/b;", "Lfu1/g;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements vz.b<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f61258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f61259b;

    static {
        new C1301a(null);
    }

    public a(Context context) {
        context.getClass();
        this.f61258a = context;
        this.f61259b = m.b(new cq0.g(this, 25));
    }

    @Override // vz.b
    public final PieDataSet a(g gVar) {
        float f14;
        g gVar2 = gVar;
        Context context = this.f61258a;
        if (gVar2 == null) {
            PieDataSet pieDataSet = new PieDataSet(x.k(new PieEntry(50.0f), new PieEntry(50.0f)), "");
            pieDataSet.setColors(x.k(Integer.valueOf(a7.b.getColor(context, R.color.gcm_progress_indicator_empty)), Integer.valueOf(a7.b.getColor(context, R.color.gcm_progress_indicator_empty))));
            return pieDataSet;
        }
        int i14 = gVar2.f73514a;
        int i15 = gVar2.f73515b;
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
            pieDataSet2.setColors(x.k(Integer.valueOf(a7.b.getColor(context, R.color.palette_blue_22)), Integer.valueOf(a7.b.getColor(context, R.color.palette_blue_22))));
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
            pieDataSet3.setColors(x.k(Integer.valueOf(a7.b.getColor(context, R.color.gcm_progress_indicator_empty)), Integer.valueOf(a7.b.getColor(context, R.color.gcm_progress_indicator_empty))));
            return pieDataSet3;
        }
        float[] fArr3 = {f14, 100.0f - f14};
        ArrayList arrayList3 = new ArrayList();
        while (i16 < 2) {
            arrayList3.add(new PieEntry(fArr3[i16]));
            i16++;
        }
        PieDataSet pieDataSet4 = new PieDataSet(arrayList3, "");
        pieDataSet4.setColors(x.k(Integer.valueOf(a7.b.getColor(context, R.color.palette_blue_22)), Integer.valueOf(a7.b.getColor(context, R.color.gcm_progress_indicator_empty))));
        return pieDataSet4;
    }

    @Override // vz.b
    public final CharSequence b(g gVar) {
        g gVar2 = gVar;
        if (gVar2 != null) {
            return gVar2.f73516c;
        }
        String string = this.f61258a.getString(R.string.txt_empty_page_no_data);
        string.getClass();
        return string;
    }

    @Override // vz.b
    public final /* bridge */ /* synthetic */ void c(Object obj) {
    }

    @Override // vz.b
    public final CharSequence d(g gVar) {
        String string;
        g gVar2 = gVar;
        x1 x1Var = (x1) this.f61259b.getValue();
        if (gVar2 != null) {
            string = gVar2.f73516c;
        } else {
            string = this.f61258a.getString(R.string.no_value);
            string.getClass();
        }
        return new SpannableStringBuilder(x1.b(x1Var, string, R.style.CardPieChartCenterPrimaryValueText));
    }

    /* JADX INFO: renamed from: du1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ldu1/a$a;", "", "<init>", "()V", "", "PROGRESS_MAX", "F", "PROGRESS_HALF", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1301a {
        public /* synthetic */ C1301a(j jVar) {
            this();
        }

        private C1301a() {
        }
    }
}
