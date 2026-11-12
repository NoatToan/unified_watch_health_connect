package zm;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.formatter.ValueFormatter;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzm/g;", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends ValueFormatter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ im.n f205238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f205239b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f205240a;

        static {
            int[] iArr = new int[im.n.values().length];
            try {
                iArr[im.n.AUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[im.n.LUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f205240a = iArr;
        }
    }

    public g(im.n nVar, Context context) {
        this.f205238a = nVar;
        this.f205239b = context;
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public final String getFormattedValue(float f14) {
        im.n nVar = this.f205238a;
        Context context = this.f205239b;
        if (f14 == 0.0f) {
            int i14 = nVar == null ? -1 : a.f205240a[nVar.ordinal()];
            if (i14 == 1) {
                String string = context.getString(R.string.lbl_aero);
                string.getClass();
                return string;
            }
            if (i14 != 2) {
                String string2 = context.getString(R.string.activity_details_seated);
                string2.getClass();
                return string2;
            }
            String string3 = context.getString(R.string.lbl_lowered);
            string3.getClass();
            return string3;
        }
        if (f14 != 1.0f) {
            if (f14 != 2.0f) {
                return "";
            }
            String string4 = context.getString(R.string.activity_details_standing);
            string4.getClass();
            return string4;
        }
        if (nVar != im.n.AUS && nVar != im.n.LUS) {
            return "";
        }
        String string5 = context.getString(R.string.lbl_upright);
        string5.getClass();
        return string5;
    }
}
