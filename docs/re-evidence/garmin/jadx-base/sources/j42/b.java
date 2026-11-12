package j42;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import android.widget.TextView;
import androidx.appcompat.app.e;
import bi2.k;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import f12.l;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B9\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rBY\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u0013B_\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0014B_\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u0015¨\u0006\u0018"}, d2 = {"Lj42/b;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lj42/b$b;", "callback", "", "weightInKg", "", "useMetricUnits", "persistNewWeight", "isRoundedDecimals", "<init>", "(Landroid/content/Context;Lj42/b$b;DZZZ)V", "", "kgMinWeight", "kgMaxWeight", "lbMinWeight", "lbMaxWeight", "(Landroid/content/Context;Lj42/b$b;DZZIIIIZ)V", "(Landroid/content/Context;Lj42/b$b;DZZIIII)V", "(Landroid/content/Context;DZZIIIILj42/b$b;)V", "b", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f97028k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f97029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1852b f97030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f97031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f97032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f97033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f97034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f97035g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f97036h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f97037i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f97038j;

    /* JADX INFO: renamed from: j42.b$b, reason: collision with other inner class name */
    public interface InterfaceC1852b {
        void j(double d14);
    }

    static {
        new a(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ b(Context context, InterfaceC1852b interfaceC1852b, double d14, boolean z14, boolean z15, int i14, int i15, int i16, int i17, int i18, j jVar) {
        double dV3;
        if ((i18 & 4) != 0) {
            l.f68084a.getClass();
            dV3 = l.a.a().v3();
        } else {
            dV3 = d14;
        }
        this(context, interfaceC1852b, dV3, (i18 & 8) != 0 ? am.j.z(l.f68084a) : z14, (i18 & 16) != 0 ? true : z15, (i18 & 32) != 0 ? 1 : i14, (i18 & 64) != 0 ? 453 : i15, (i18 & 128) != 0 ? 2 : i16, (i18 & 256) != 0 ? 999 : i17);
    }

    public final void a() {
        Context context = this.f97029a;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.gcm_edit_weight, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(R.id.number_picker_weight_whole);
        viewFindViewById.getClass();
        NumberPicker numberPicker = (NumberPicker) viewFindViewById;
        numberPicker.setOnValueChangedListener(new j42.a(this, 0));
        View viewFindViewById2 = viewInflate.findViewById(R.id.decimal_char);
        viewFindViewById2.getClass();
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.number_picker_weight_tenth);
        viewFindViewById3.getClass();
        NumberPicker numberPicker2 = (NumberPicker) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(R.id.weight_label);
        viewFindViewById4.getClass();
        TextView textView2 = (TextView) viewFindViewById4;
        textView.setText(String.valueOf(new DecimalFormatSymbols(Locale.getDefault()).getDecimalSeparator()));
        if (this.f97034f) {
            numberPicker2.setDisplayedValues(new String[]{"0", "5"});
            numberPicker2.setMinValue(0);
            numberPicker2.setMaxValue(1);
        } else {
            numberPicker2.setMinValue(0);
            numberPicker2.setMaxValue(9);
        }
        boolean z14 = this.f97032d;
        double d14 = this.f97031c;
        if (z14) {
            textView2.setText(R.string.lbl_kg);
            textView2.setContentDescription(context.getString(R.string.lbl_kilograms));
            numberPicker.setMinValue(this.f97035g);
            numberPicker.setMaxValue(this.f97036h);
            numberPicker2.setVisibility(0);
            textView.setVisibility(0);
            if (d14 > 0.0d) {
                numberPicker.setValue((int) d14);
                numberPicker2.setValue((int) Math.round((d14 % ((double) 1)) * ((double) 10)));
            } else {
                numberPicker.setValue(75);
                numberPicker2.setValue(0);
            }
        } else {
            textView2.setText(R.string.lbl_lbs);
            textView2.setContentDescription(context.getString(R.string.lbl_pounds));
            numberPicker2.setVisibility(0);
            textView.setVisibility(0);
            numberPicker.setMinValue(this.f97037i);
            numberPicker.setMaxValue(this.f97038j);
            if (d14 > 0.0d) {
                l3.f23124b.getClass();
                double dT1 = l3.a.T1(d14 * 2.20462d, 1);
                numberPicker.setValue((int) dT1);
                numberPicker2.setValue((int) Math.round((dT1 % ((double) 1)) * ((double) 10)));
            } else {
                numberPicker.setValue(165);
                numberPicker2.setValue(0);
            }
        }
        numberPicker.setWrapSelectorWheel(false);
        new e.a(context).setTitle(R.string.card_weight_title).setView(viewInflate).setCancelable(true).setPositiveButton(R.string.lbl_done, new k(19, numberPicker, numberPicker2, this)).show();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lj42/b$a;", "", "<init>", "()V", "", "DEFAULT_KG_MIN_WEIGHT", "I", "DEFAULT_KG_MAX_WEIGHT", "DEFAULT_LB_MIN_WEIGHT", "DEFAULT_LB_MAX_WEIGHT", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Context context, InterfaceC1852b interfaceC1852b, double d14) {
        this(context, interfaceC1852b, d14, false, false, 0, 0, 0, 0, 504, (j) null);
        context.getClass();
        interfaceC1852b.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Context context, InterfaceC1852b interfaceC1852b, double d14, boolean z14) {
        this(context, interfaceC1852b, d14, z14, false, 0, 0, 0, 0, 496, (j) null);
        context.getClass();
        interfaceC1852b.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Context context, InterfaceC1852b interfaceC1852b, double d14, boolean z14, boolean z15) {
        this(context, interfaceC1852b, d14, z14, z15, 0, 0, 0, 0, 480, (j) null);
        context.getClass();
        interfaceC1852b.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Context context, InterfaceC1852b interfaceC1852b, double d14, boolean z14, boolean z15, int i14) {
        this(context, interfaceC1852b, d14, z14, z15, i14, 0, 0, 0, 448, (j) null);
        context.getClass();
        interfaceC1852b.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Context context, InterfaceC1852b interfaceC1852b, double d14, boolean z14, boolean z15, int i14, int i15) {
        this(context, interfaceC1852b, d14, z14, z15, i14, i15, 0, 0, 384, (j) null);
        context.getClass();
        interfaceC1852b.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Context context, InterfaceC1852b interfaceC1852b, double d14, boolean z14, boolean z15, int i14, int i15, int i16) {
        this(context, interfaceC1852b, d14, z14, z15, i14, i15, i16, 0, 256, (j) null);
        context.getClass();
        interfaceC1852b.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Context context, InterfaceC1852b interfaceC1852b, double d14, boolean z14, boolean z15, boolean z16) {
        this(context, interfaceC1852b, d14, z14, z15, 1, 453, 2, 999, z16);
        context.getClass();
        interfaceC1852b.getClass();
    }

    public b(Context context, InterfaceC1852b interfaceC1852b, double d14, boolean z14, boolean z15, int i14, int i15, int i16, int i17, boolean z16) {
        context.getClass();
        interfaceC1852b.getClass();
        this.f97029a = context;
        this.f97030b = interfaceC1852b;
        this.f97031c = d14;
        this.f97032d = z14;
        this.f97033e = z15;
        this.f97035g = i14;
        this.f97036h = i15;
        this.f97037i = i16;
        this.f97038j = i17;
        this.f97034f = z16;
        a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Context context, InterfaceC1852b interfaceC1852b) {
        this(context, interfaceC1852b, 0.0d, false, false, 0, 0, 0, 0, 508, (j) null);
        context.getClass();
        interfaceC1852b.getClass();
    }

    public b(Context context, InterfaceC1852b interfaceC1852b, double d14, boolean z14, boolean z15, int i14, int i15, int i16, int i17) {
        context.getClass();
        interfaceC1852b.getClass();
        this.f97029a = context;
        this.f97030b = interfaceC1852b;
        this.f97031c = d14;
        this.f97032d = z14;
        this.f97033e = z15;
        this.f97035g = i14;
        this.f97036h = i15;
        this.f97037i = i16;
        this.f97038j = i17;
        a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ b(Context context, double d14, boolean z14, boolean z15, int i14, int i15, int i16, int i17, InterfaceC1852b interfaceC1852b, int i18, j jVar) {
        double dV3;
        if ((i18 & 2) != 0) {
            l.f68084a.getClass();
            dV3 = l.a.a().v3();
        } else {
            dV3 = d14;
        }
        this(context, dV3, (i18 & 4) != 0 ? am.j.z(l.f68084a) : z14, (i18 & 8) != 0 ? true : z15, (i18 & 16) != 0 ? 1 : i14, (i18 & 32) != 0 ? 453 : i15, (i18 & 64) != 0 ? 2 : i16, (i18 & 128) != 0 ? 999 : i17, interfaceC1852b);
    }

    public b(Context context, double d14, boolean z14, boolean z15, int i14, int i15, int i16, int i17, InterfaceC1852b interfaceC1852b) {
        context.getClass();
        interfaceC1852b.getClass();
        this.f97029a = context;
        this.f97030b = interfaceC1852b;
        this.f97031c = d14;
        this.f97032d = z14;
        this.f97033e = z15;
        this.f97035g = i14;
        this.f97036h = i15;
        this.f97037i = i16;
        this.f97038j = i17;
        a();
    }
}
