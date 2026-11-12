package ag0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import android.widget.TextView;
import c22.l3;
import c22.q3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import d53.t;
import d53.w;
import e23.l;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000eB3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lag0/f;", "Landroidx/appcompat/app/e;", "Landroid/widget/NumberPicker$OnValueChangeListener;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "defaultSpeedMPS", "", "isUsingMetric", "Lkotlin/Function1;", "", "speedChangeListener", "<init>", "(Landroid/content/Context;DZLe23/l;)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends androidx.appcompat.app.e implements NumberPicker.OnValueChangeListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f3142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f3143f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f3144g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NumberPicker f3146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final NumberPicker f3147d;

    static {
        new a(null);
        f3142e = new int[]{0, 0};
        f3143f = new int[]{130, 9};
        f3144g = new int[]{80, 9};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, double d14, boolean z14, l<? super Double, Unit> lVar) {
        double dI;
        super(context);
        context.getClass();
        lVar.getClass();
        this.f3145b = z14;
        String string = context.getString(z14 ? R.string.kph : R.string.mph);
        string.getClass();
        String string2 = context.getString(R.string.string_space_string_bracket_pattern, context.getString(R.string.lbl_course_goal_speed), string);
        string2.getClass();
        setTitle(string2);
        Object systemService = context.getSystemService("layout_inflater");
        systemService.getClass();
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.goal_speed_spinner, (ViewGroup) null);
        i(viewInflate);
        int[] iArr = f3144g;
        int[] iArr2 = f3143f;
        if (z14) {
            int i14 = iArr2[1];
        } else {
            int i15 = iArr[1];
        }
        View viewFindViewById = viewInflate.findViewById(R.id.whole_picker);
        NumberPicker numberPicker = (NumberPicker) viewFindViewById;
        numberPicker.setWrapSelectorWheel(true);
        int[] iArr3 = f3142e;
        numberPicker.setMinValue(iArr3[0]);
        numberPicker.setMaxValue(z14 ? iArr2[0] : iArr[0]);
        numberPicker.setOnValueChangedListener(this);
        viewFindViewById.getClass();
        this.f3146c = (NumberPicker) viewFindViewById;
        TextView textView = (TextView) viewInflate.findViewById(R.id.decimal_separator);
        View viewFindViewById2 = viewInflate.findViewById(R.id.decimal_picker);
        NumberPicker numberPicker2 = (NumberPicker) viewFindViewById2;
        numberPicker2.setWrapSelectorWheel(true);
        numberPicker2.setMinValue(iArr3[1]);
        numberPicker2.setMaxValue(z14 ? iArr2[1] : iArr[1]);
        numberPicker2.setOnValueChangedListener(this);
        viewFindViewById2.getClass();
        this.f3147d = (NumberPicker) viewFindViewById2;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0", decimalFormatSymbols);
        String strValueOf = String.valueOf(decimalFormatSymbols.getDecimalSeparator());
        if (z14) {
            l3.f23124b.getClass();
            dI = l3.a.i(d14, q3.KILOMETER_PER_HOUR);
        } else {
            l3.f23124b.getClass();
            dI = l3.a.i(d14, q3.MILE_PER_HOUR);
        }
        String str = decimalFormat.format(dI);
        str.getClass();
        List listW = w.W(str, new String[]{strValueOf});
        ArrayList arrayList = new ArrayList();
        Iterator it = listW.iterator();
        while (it.hasNext()) {
            Integer numI = t.i((String) it.next());
            if (numI != null) {
                arrayList.add(numI);
            }
        }
        this.f3146c.setValue(((Number) arrayList.get(0)).intValue());
        this.f3147d.setValue(arrayList.size() > 1 ? ((Number) arrayList.get(1)).intValue() : 0);
        j();
        textView.setText(strValueOf);
        g(-1, context.getString(R.string.lbl_done), new d(0, this, lVar));
        g(-2, context.getString(R.string.lbl_cancel), new e(0));
    }

    public final void j() {
        int value = this.f3146c.getValue();
        boolean z14 = this.f3145b;
        NumberPicker numberPicker = this.f3147d;
        if (z14) {
            int[] iArr = f3143f;
            numberPicker.setMaxValue(value == iArr[0] ? iArr[1] : 9);
        } else {
            int[] iArr2 = f3142e;
            numberPicker.setMinValue(value == iArr2[0] ? iArr2[1] : 0);
            int[] iArr3 = f3144g;
            numberPicker.setMaxValue(value == iArr3[0] ? iArr3[1] : 9);
        }
    }

    @Override // android.widget.NumberPicker.OnValueChangeListener
    public final void onValueChange(NumberPicker numberPicker, int i14, int i15) {
        j();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lag0/f$a;", "", "<init>", "()V", "", "PICKER_MIN_VALUES", "[I", "PICKER_MAX_METRIC_VALUES", "PICKER_MAX_STATUTE_VALUES", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
