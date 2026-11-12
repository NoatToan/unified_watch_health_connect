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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0010B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lag0/g;", "Landroidx/appcompat/app/e;", "Landroid/widget/NumberPicker$OnValueChangeListener;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "isUsingMetric", "", "defaultSpeedMPS", "Lag0/h;", "limits", "Lkotlin/Function1;", "", "speedChangeListener", "<init>", "(Landroid/content/Context;ZDLag0/h;Le23/l;)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends androidx.appcompat.app.e implements NumberPicker.OnValueChangeListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f3148f = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f3150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final NumberPicker f3151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final NumberPicker f3152e;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, boolean z14, double d14, h hVar, l<? super Double, Unit> lVar) {
        double dI;
        super(context);
        context.getClass();
        hVar.getClass();
        lVar.getClass();
        this.f3149b = z14;
        this.f3150c = hVar;
        String string = context.getString(z14 ? R.string.kph : R.string.mph);
        string.getClass();
        String string2 = context.getString(R.string.string_space_string_bracket_pattern, context.getString(R.string.lbl_course_goal_speed), string);
        string2.getClass();
        setTitle(string2);
        Object systemService = context.getSystemService("layout_inflater");
        systemService.getClass();
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.goal_speed_spinner, (ViewGroup) null);
        i(viewInflate);
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
        DecimalFormat decimalFormat = new DecimalFormat("#,###,##0.0", decimalFormatSymbols);
        String strValueOf = String.valueOf(decimalFormatSymbols.getDecimalSeparator());
        View viewFindViewById = viewInflate.findViewById(R.id.whole_picker);
        NumberPicker numberPicker = (NumberPicker) viewFindViewById;
        numberPicker.setWrapSelectorWheel(true);
        numberPicker.setMinValue(hVar.f3153a);
        numberPicker.setMaxValue(hVar.f3155c);
        numberPicker.setOnValueChangedListener(this);
        viewFindViewById.getClass();
        this.f3151d = (NumberPicker) viewFindViewById;
        TextView textView = (TextView) viewInflate.findViewById(R.id.decimal_separator);
        View viewFindViewById2 = viewInflate.findViewById(R.id.decimal_picker);
        NumberPicker numberPicker2 = (NumberPicker) viewFindViewById2;
        numberPicker2.setWrapSelectorWheel(true);
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(9);
        numberPicker2.setOnValueChangedListener(this);
        viewFindViewById2.getClass();
        this.f3152e = (NumberPicker) viewFindViewById2;
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
        this.f3151d.setValue(((Number) arrayList.get(0)).intValue());
        this.f3152e.setValue(((Number) arrayList.get(1)).intValue());
        j();
        textView.setText(strValueOf);
        g(-1, context.getString(R.string.lbl_done), new d(1, this, lVar));
        g(-2, context.getString(R.string.lbl_cancel), new e(1));
    }

    public final void j() {
        int value = this.f3151d.getValue();
        h hVar = this.f3150c;
        int i14 = hVar.f3155c;
        NumberPicker numberPicker = this.f3152e;
        if (value == i14) {
            numberPicker.setMinValue(0);
            numberPicker.setMaxValue(hVar.f3156d);
        } else if (value == hVar.f3153a) {
            numberPicker.setMinValue(hVar.f3154b);
            numberPicker.setMaxValue(9);
        } else {
            numberPicker.setMinValue(0);
            numberPicker.setMaxValue(9);
        }
    }

    @Override // android.widget.NumberPicker.OnValueChangeListener
    public final void onValueChange(NumberPicker numberPicker, int i14, int i15) {
        j();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lag0/g$a;", "", "<init>", "()V", "", "MIN_DECIMAL", "I", "MAX_DECIMAL", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
