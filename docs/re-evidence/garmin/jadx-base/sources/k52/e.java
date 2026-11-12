package k52;

import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lk52/e;", "", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f102947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f102948b;

    public e(l22.b bVar) {
        bVar.getClass();
        this.f102947a = bVar;
        this.f102948b = bVar.getString(R.string.no_value_card);
    }

    public static String b(e eVar, Double d14, boolean z14) {
        l3.f23124b.getClass();
        DecimalFormat decimalFormat = l3.f23130h;
        eVar.getClass();
        decimalFormat.getClass();
        String strA = eVar.a(d14, decimalFormat);
        l22.b bVar = eVar.f102947a;
        return strA.concat(StringUtils.SPACE.concat(z14 ? bVar.getString(R.string.lbl_kg) : bVar.getString(R.string.lbl_lbs)));
    }

    public final String a(Double d14, NumberFormat numberFormat) {
        numberFormat.getClass();
        StringBuilder sb3 = new StringBuilder();
        if (d14 == null || d14.doubleValue() <= 0.0d || Double.isNaN(d14.doubleValue())) {
            sb3.append(this.f102948b);
        } else {
            sb3.append(numberFormat.format(d14.doubleValue()));
        }
        return sb3.toString();
    }
}
