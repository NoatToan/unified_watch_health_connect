package z21;

import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import java.util.Arrays;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;
import tn.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lz21/c;", "", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f201996a;

    public c(l22.b bVar) {
        bVar.getClass();
        this.f201996a = bVar;
    }

    public final String a(double d14, q22.b bVar, int i14) {
        int i15 = ((int) d14) == 1 ? bVar.f142314c : bVar.f142315d;
        l3.f23124b.getClass();
        String str = l3.f23131i.format(d14);
        str.getClass();
        l22.b bVar2 = this.f201996a;
        return bVar2.a(R.string.lbl_nutrition_hydration_interval_value, bVar2.a(R.string.string_space_string_pattern, str, bVar2.getString(i15)), new u00.a(bVar2).d(i14));
    }

    public final String b(double d14, q22.b bVar) {
        boolean zD = zf.b.D(Double.valueOf(d14));
        l22.b bVar2 = this.f201996a;
        if (!zD || d14 <= 0.0d) {
            return bVar2.getString(R.string.no_hydration_guidance_note);
        }
        int i14 = ((int) d14) == 1 ? bVar.f142314c : bVar.f142315d;
        x0 x0Var = x0.f105818a;
        String string = bVar2.getString(R.string.string_space_string_pattern);
        l3.f23124b.getClass();
        return String.format(bVar2.getString(R.string.lbl_hydration_total_value), Arrays.copyOf(new Object[]{String.format(string, Arrays.copyOf(new Object[]{l3.f23131i.format(d14), bVar2.getString(i14)}, 2))}, 1));
    }

    public final String c(w01.d dVar) {
        dVar.getClass();
        q22.b bVar = dVar.f181039b;
        j23.g<Double> gVar = dVar.f181040c;
        Double d14 = dVar.f181038a;
        l22.b bVar2 = this.f201996a;
        if (d14 == null || gVar == null) {
            return d14 != null ? b(d14.doubleValue(), bVar) : bVar2.getString(R.string.no_hydration_guidance_note);
        }
        return bVar2.a(R.string.string_space_bullet_string_pattern, b(d14.doubleValue(), bVar), e(gVar, dVar.f181041d));
    }

    public final String d(j23.g<Double> gVar, w01.e eVar, int i14) {
        double dDoubleValue = ((Number) gVar.getStart()).doubleValue();
        double dDoubleValue2 = ((Number) gVar.b()).doubleValue();
        if (!zf.b.D(Double.valueOf(dDoubleValue)) || dDoubleValue <= 0.0d || !zf.b.D(Double.valueOf(dDoubleValue2)) || dDoubleValue2 <= 0.0d) {
            return "";
        }
        x0 x0Var = x0.f105818a;
        l22.b bVar = this.f201996a;
        String string = bVar.getString(R.string.string_space_string_pattern);
        String string2 = bVar.getString(R.string.string_line_string_pattern_no_space);
        l3.f23124b.getClass();
        return String.format(bVar.getString(R.string.lbl_nutrition_hydration_interval_value), Arrays.copyOf(new Object[]{String.format(string, Arrays.copyOf(new Object[]{String.format(string2, Arrays.copyOf(new Object[]{l3.f23131i.format(dDoubleValue), l3.f23131i.format(dDoubleValue2)}, 2)), bVar.getString(eVar.f181048b)}, 2)), new u00.a(bVar).d(i14)}, 2));
    }

    public final String e(j23.g<Double> gVar, w01.e eVar) {
        gVar.getClass();
        double dDoubleValue = ((Number) gVar.getStart()).doubleValue();
        double dDoubleValue2 = ((Number) gVar.b()).doubleValue();
        if (!zf.b.D(Double.valueOf(dDoubleValue)) || dDoubleValue <= 0.0d || !zf.b.D(Double.valueOf(dDoubleValue2)) || dDoubleValue2 <= 0.0d) {
            return "";
        }
        x0 x0Var = x0.f105818a;
        l22.b bVar = this.f201996a;
        String string = bVar.getString(R.string.string_space_string_pattern);
        String string2 = bVar.getString(R.string.string_line_string_pattern_no_space);
        l3.f23124b.getClass();
        return String.format(bVar.getString(R.string.lbl_nutrition_total_value), Arrays.copyOf(new Object[]{String.format(string, Arrays.copyOf(new Object[]{String.format(string2, Arrays.copyOf(new Object[]{l3.f23131i.format(dDoubleValue), l3.f23131i.format(dDoubleValue2)}, 2)), bVar.getString(eVar.f181048b)}, 2))}, 1));
    }

    public final String f(double d14) {
        if (!zf.b.D(Double.valueOf(d14))) {
            return "";
        }
        return k.g(l3.f23125c.format(d14), this.f201996a.getString(R.string.lbl_hours_abbreviation));
    }
}
