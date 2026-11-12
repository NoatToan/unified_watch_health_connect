package ya1;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import android.widget.TextView;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.y0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000eB3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lya1/b;", "Landroidx/appcompat/app/e;", "Landroid/widget/NumberPicker$OnValueChangeListener;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "defaultWeightKg", "", "isUsingMetric", "Lkotlin/Function1;", "", "weightChangeListener", "<init>", "(Landroid/content/Context;DZLe23/l;)V", "a", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends androidx.appcompat.app.e implements NumberPicker.OnValueChangeListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f195531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f195532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f195533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f195534h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f195535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NumberPicker f195536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final NumberPicker f195537d;

    static {
        new a(null);
        f195531e = new int[]{1, 0};
        f195532f = new int[]{50, 0};
        f195533g = new int[]{2, 2};
        f195534h = new int[]{110, 3};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, double d14, boolean z14, final e23.l<? super Double, Unit> lVar) {
        super(context);
        context.getClass();
        lVar.getClass();
        this.f195535b = z14;
        setTitle(R.string.bike_weight_dialog_title);
        Object systemService = context.getSystemService("layout_inflater");
        systemService.getClass();
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.bike_weight_spinner, (ViewGroup) null);
        i(viewInflate);
        View viewFindViewById = viewInflate.findViewById(R.id.whole_picker);
        NumberPicker numberPicker = (NumberPicker) viewFindViewById;
        numberPicker.setWrapSelectorWheel(true);
        numberPicker.setMinValue(z14 ? f195531e[0] : f195533g[0]);
        numberPicker.setMaxValue(z14 ? f195532f[0] : f195534h[0]);
        numberPicker.setOnValueChangedListener(this);
        viewFindViewById.getClass();
        this.f195536c = (NumberPicker) viewFindViewById;
        TextView textView = (TextView) viewInflate.findViewById(R.id.decimal_separator);
        View viewFindViewById2 = viewInflate.findViewById(R.id.decimal_picker);
        NumberPicker numberPicker2 = (NumberPicker) viewFindViewById2;
        numberPicker2.setWrapSelectorWheel(true);
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(9);
        numberPicker2.setOnValueChangedListener(this);
        viewFindViewById2.getClass();
        this.f195537d = (NumberPicker) viewFindViewById2;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0", decimalFormatSymbols);
        String strValueOf = String.valueOf(decimalFormatSymbols.getDecimalSeparator());
        if (!z14) {
            l3.f23124b.getClass();
            d14 *= 2.20462d;
        }
        String str = decimalFormat.format(d14);
        str.getClass();
        List listW = d53.w.W(str, new String[]{strValueOf});
        ArrayList arrayList = new ArrayList();
        Iterator it = listW.iterator();
        while (it.hasNext()) {
            Integer numI = d53.t.i((String) it.next());
            if (numI != null) {
                arrayList.add(numI);
            }
        }
        final int iIntValue = ((Number) arrayList.get(0)).intValue();
        final int iIntValue2 = ((Number) arrayList.get(1)).intValue();
        this.f195536c.setValue(iIntValue);
        this.f195537d.setValue(iIntValue2);
        j();
        textView.setText(strValueOf);
        int i14 = this.f195535b ? R.string.lbl_kg : R.string.lbl_lbs;
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.unit_of_measurement);
        textView2.setText(i14);
        textView2.setContentDescription(oi0.c.A(context, new y0(24), context.getString(i14)));
        g(-1, context.getString(R.string.lbl_done), new DialogInterface.OnClickListener() { // from class: ya1.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i15) {
                double dDoubleValue;
                b bVar = this.f195527a;
                int value = bVar.f195536c.getValue();
                int value2 = bVar.f195537d.getValue();
                if (value != iIntValue || value2 != iIntValue2) {
                    Double dF = d53.s.f(value + "." + value2);
                    if (dF != null) {
                        if (bVar.f195535b) {
                            dDoubleValue = dF.doubleValue();
                        } else {
                            l3.a aVar = l3.f23124b;
                            double dDoubleValue2 = dF.doubleValue();
                            aVar.getClass();
                            dDoubleValue = dDoubleValue2 / 2.20462d;
                        }
                        lVar.invoke(Double.valueOf(dDoubleValue));
                    }
                }
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
            }
        });
    }

    public final void j() {
        int value = this.f195536c.getValue();
        boolean z14 = this.f195535b;
        NumberPicker numberPicker = this.f195537d;
        if (z14) {
            int[] iArr = f195532f;
            numberPicker.setMaxValue(value == iArr[0] ? iArr[1] : 9);
        } else {
            int[] iArr2 = f195533g;
            numberPicker.setMinValue(value == iArr2[0] ? iArr2[1] : 0);
            int[] iArr3 = f195534h;
            numberPicker.setMaxValue(value == iArr3[0] ? iArr3[1] : 9);
        }
    }

    @Override // android.widget.NumberPicker.OnValueChangeListener
    public final void onValueChange(NumberPicker numberPicker, int i14, int i15) {
        j();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lya1/b$a;", "", "<init>", "()V", "", "PICKER_MIN_METRIC_VALUES", "[I", "PICKER_MAX_METRIC_VALUES", "PICKER_MIN_STATUTE_VALUES", "PICKER_MAX_STATUTE_VALUES", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
