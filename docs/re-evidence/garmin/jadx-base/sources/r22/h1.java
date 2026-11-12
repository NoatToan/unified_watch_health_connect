package r22;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lr22/h1;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lr22/h1$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "metric", "", "pressure", "refPressure", "<init>", "(Landroid/content/Context;Lr22/h1$a;Ljava/lang/String;DD)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f149668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f149669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f149670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f149671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList<String> f149672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<String> f149673f;

    public interface a {
    }

    public h1(Context context, a aVar, String str, double d14, double d15) {
        int i14;
        int i15;
        int[] iArr;
        int minValue;
        NumberPicker numberPicker;
        context.getClass();
        str.getClass();
        this.f149668a = aVar;
        this.f149669b = str;
        double d16 = "po2MinValue".equalsIgnoreCase(str) ? 0.1d : d15;
        this.f149670c = d16;
        double d17 = "po2MaxValue".equalsIgnoreCase(str) ? 2.0d : d15;
        this.f149671d = d17;
        ArrayList<String> arrayListD = p13.x.d(context.getString(R.string.no_value));
        this.f149672e = arrayListD;
        this.f149673f = new ArrayList<>();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.gcm_edit_po2_with_unit, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(R.id.number_picker_pressure_whole);
        viewFindViewById.getClass();
        NumberPicker numberPicker2 = (NumberPicker) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.decimal_char);
        viewFindViewById2.getClass();
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.number_picker_pressure_tenth);
        viewFindViewById3.getClass();
        NumberPicker numberPicker3 = (NumberPicker) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(R.id.number_picker_pressure_unit);
        viewFindViewById4.getClass();
        NumberPicker numberPicker4 = (NumberPicker) viewFindViewById4;
        numberPicker4.setMinValue(0);
        numberPicker4.setMaxValue(0);
        numberPicker4.setDisplayedValues(new String[]{context.getString(R.string.lbl_bar)});
        numberPicker4.setEnabled(false);
        textView.setText(String.valueOf(new DecimalFormatSymbols(Locale.getDefault()).getDecimalSeparator()));
        textView.setVisibility(0);
        numberPicker2.setWrapSelectorWheel(false);
        numberPicker3.setVisibility(0);
        if (Double.isNaN(d14) || d14 == 0.0d) {
            i14 = 1;
            i15 = 0;
            iArr = null;
        } else {
            i14 = 1;
            i15 = 0;
            iArr = new int[]{(int) d14, (int) MathKt.e((d14 - MathKt.e(d14)) * ((double) 10))};
        }
        numberPicker2.setMinValue(i15);
        int i16 = (int) d17;
        int i17 = (int) d16;
        numberPicker2.setMaxValue(arrayListD.size() + (i16 - i17));
        this.f149673f.addAll(arrayListD);
        ArrayList<String> arrayList = this.f149673f;
        j23.l lVar = new j23.l(i17, i16);
        double d18 = d16;
        ArrayList arrayList2 = new ArrayList(p13.y.r(lVar, 10));
        Iterator<Integer> it = lVar.iterator();
        while (((j23.k) it).f96801c) {
            arrayList2.add(String.valueOf(((p13.p0) it).nextInt()));
        }
        arrayList.addAll(arrayList2);
        numberPicker2.setDisplayedValues((String[]) this.f149673f.toArray(new String[0]));
        if (iArr == null || iArr.length == 0) {
            minValue = 0;
        } else {
            int i18 = iArr[0];
            minValue = i18 < i17 ? numberPicker2.getMinValue() : i18 > i16 ? numberPicker2.getMaxValue() : (i18 - i17) + arrayListD.size();
        }
        numberPicker2.setValue(minValue);
        if ((iArr == null || d18 > d14 || d14 > d17) && !arrayListD.isEmpty()) {
            numberPicker = numberPicker3;
            numberPicker.setMinValue(0);
            numberPicker.setMaxValue(arrayListD.size() - 1);
            ArrayList<String> arrayList3 = new ArrayList<>();
            this.f149673f = arrayList3;
            arrayList3.addAll(arrayListD);
            numberPicker.setDisplayedValues((String[]) this.f149673f.toArray(new String[0]));
            numberPicker.setValue(0);
        } else {
            numberPicker = numberPicker3;
            int i19 = iArr == null ? 0 : iArr[i14];
            numberPicker.setValue(0);
            int iRound = numberPicker2.getValue() == numberPicker2.getMaxValue() ? (int) Math.round((d17 % ((double) i14)) * ((double) 10)) : 9;
            numberPicker.setMinValue(0);
            numberPicker.setMaxValue(iRound);
            int iE = numberPicker2.getValue() == 1 ? (int) ((d18 - MathKt.e(d18)) * ((double) 10)) : 0;
            numberPicker.setMinValue(iE);
            ArrayList<String> arrayList4 = new ArrayList<>();
            this.f149673f = arrayList4;
            j23.l lVar2 = new j23.l(iE, iRound);
            ArrayList arrayList5 = new ArrayList(p13.y.r(lVar2, 10));
            Iterator<Integer> it3 = lVar2.iterator();
            while (((j23.k) it3).f96801c) {
                arrayList5.add(String.valueOf(((p13.p0) it3).nextInt()));
            }
            arrayList4.addAll(arrayList5);
            numberPicker.setDisplayedValues((String[]) this.f149673f.toArray(new String[0]));
            numberPicker.setValue(i19 > numberPicker.getMaxValue() ? numberPicker.getMaxValue() : i19);
        }
        numberPicker2.setOnValueChangedListener(new bi2.t(this, numberPicker, numberPicker2));
        new androidx.appcompat.app.e.a(context).setTitle(this.f149669b.equals("po2MaxValue") ? R.string.activity_details_po2_set_point_high : R.string.activity_details_po2_set_point_low).setView(viewInflate).setCancelable(true).setPositiveButton(R.string.lbl_done, new bi2.k(26, numberPicker2, numberPicker, this)).show();
    }
}
