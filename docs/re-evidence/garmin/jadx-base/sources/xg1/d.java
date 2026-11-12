package xg1;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import android.widget.TextView;
import bi2.c0;
import com.garmin.android.apps.connectmobile.R;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b\u0012\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lxg1/d;", "Landroidx/fragment/app/i;", "", "titleResId", "", "currentValue", "", "currentUnit", "", "Lxg1/d$a$a;", "units", "Lkotlin/Function2;", "", "onDoneCallback", "<init>", "(ILjava/lang/Double;Ljava/lang/String;Ljava/util/Map;Le23/p;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends androidx.fragment.app.i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f190879k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f190880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f190881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f190882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, a.C3553a> f190883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e23.p<Double, String, Unit> f190884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public NumberPicker f190885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public NumberPicker f190886g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public NumberPicker f190887h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f190888i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f190889j;

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(int i14, Double d14, String str, Map<String, a.C3553a> map, e23.p<? super Double, ? super String, Unit> pVar) {
        map.getClass();
        pVar.getClass();
        this.f190880a = i14;
        this.f190881b = d14;
        this.f190882c = str;
        this.f190883d = map;
        this.f190884e = pVar;
        this.f190889j = map.size() == 1;
    }

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        View viewInflate = LayoutInflater.from(getActivity()).inflate(R.layout.gcm_double_number_with_unit_picker, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(R.id.integer_value_picker);
        viewFindViewById.getClass();
        this.f190885f = (NumberPicker) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.decimal_value_picker);
        viewFindViewById2.getClass();
        this.f190886g = (NumberPicker) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.unit_picker);
        viewFindViewById3.getClass();
        this.f190887h = (NumberPicker) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(R.id.unit);
        viewFindViewById4.getClass();
        this.f190888i = (TextView) viewFindViewById4;
        Map<String, a.C3553a> map = this.f190883d;
        String str = this.f190882c;
        if (str == null) {
            str = (String) h0.a0(map.keySet());
        }
        Double d14 = this.f190881b;
        v6(d14, str);
        u6(d14, str);
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        if (this.f190889j) {
            NumberPicker numberPicker = this.f190887h;
            if (numberPicker == null) {
                p005kotlin.jvm.internal.s.m("unitPicker");
                throw null;
            }
            numberPicker.setVisibility(8);
            TextView textView = this.f190888i;
            if (textView == null) {
                p005kotlin.jvm.internal.s.m("unit");
                throw null;
            }
            textView.setText(strArr[0]);
        } else {
            TextView textView2 = this.f190888i;
            if (textView2 == null) {
                p005kotlin.jvm.internal.s.m("unit");
                throw null;
            }
            textView2.setVisibility(8);
            NumberPicker numberPicker2 = this.f190887h;
            if (numberPicker2 == null) {
                p005kotlin.jvm.internal.s.m("unitPicker");
                throw null;
            }
            numberPicker2.setMinValue(0);
            NumberPicker numberPicker3 = this.f190887h;
            if (numberPicker3 == null) {
                p005kotlin.jvm.internal.s.m("unitPicker");
                throw null;
            }
            numberPicker3.setMaxValue(map.size() - 1);
            NumberPicker numberPicker4 = this.f190887h;
            if (numberPicker4 == null) {
                p005kotlin.jvm.internal.s.m("unitPicker");
                throw null;
            }
            numberPicker4.setValue(h0.f0(map.keySet(), str));
            NumberPicker numberPicker5 = this.f190887h;
            if (numberPicker5 == null) {
                p005kotlin.jvm.internal.s.m("unitPicker");
                throw null;
            }
            numberPicker5.setDisplayedValues(strArr);
            NumberPicker numberPicker6 = this.f190887h;
            if (numberPicker6 == null) {
                p005kotlin.jvm.internal.s.m("unitPicker");
                throw null;
            }
            numberPicker6.setOnValueChangedListener(new c0(1, this, strArr));
        }
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(requireActivity());
        aVar.setTitle(this.f190880a);
        aVar.setView(viewInflate);
        aVar.setPositiveButton(R.string.lbl_done, new sa2.b(this, 29));
        aVar.setNegativeButton(R.string.lbl_cancel, new vu1.k(21));
        androidx.appcompat.app.e eVarCreate = aVar.create();
        eVarCreate.getClass();
        eVarCreate.setCanceledOnTouchOutside(false);
        return eVarCreate;
    }

    public final void u6(Double d14, String str) {
        a.C3553a c3553a = this.f190883d.get(str);
        if (d14 == null || c3553a == null) {
            NumberPicker numberPicker = this.f190886g;
            if (numberPicker == null) {
                p005kotlin.jvm.internal.s.m("decimalValuePicker");
                throw null;
            }
            numberPicker.setMinValue(0);
            NumberPicker numberPicker2 = this.f190886g;
            if (numberPicker2 == null) {
                p005kotlin.jvm.internal.s.m("decimalValuePicker");
                throw null;
            }
            numberPicker2.setMaxValue(9);
            if (c3553a != null) {
                double d15 = c3553a.f190890a;
                NumberPicker numberPicker3 = this.f190886g;
                if (numberPicker3 != null) {
                    numberPicker3.setValue(((int) (d15 * ((double) 10))) % 10);
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("decimalValuePicker");
                    throw null;
                }
            }
            return;
        }
        double d16 = c3553a.f190892c;
        double d17 = 10;
        int iDoubleValue = ((int) (d14.doubleValue() * d17)) % 10;
        int iDoubleValue2 = (int) d14.doubleValue();
        if (iDoubleValue2 == ((int) d16)) {
            NumberPicker numberPicker4 = this.f190886g;
            if (numberPicker4 == null) {
                p005kotlin.jvm.internal.s.m("decimalValuePicker");
                throw null;
            }
            numberPicker4.setMinValue(0);
            NumberPicker numberPicker5 = this.f190886g;
            if (numberPicker5 == null) {
                p005kotlin.jvm.internal.s.m("decimalValuePicker");
                throw null;
            }
            numberPicker5.setMaxValue(((int) (d16 * d17)) % 10);
            NumberPicker numberPicker6 = this.f190886g;
            if (numberPicker6 != null) {
                numberPicker6.setValue(iDoubleValue);
                return;
            } else {
                p005kotlin.jvm.internal.s.m("decimalValuePicker");
                throw null;
            }
        }
        double d18 = c3553a.f190891b;
        int i14 = (int) d18;
        NumberPicker numberPicker7 = this.f190886g;
        if (iDoubleValue2 == i14) {
            if (numberPicker7 == null) {
                p005kotlin.jvm.internal.s.m("decimalValuePicker");
                throw null;
            }
            numberPicker7.setMinValue(((int) (d18 * d17)) % 10);
            NumberPicker numberPicker8 = this.f190886g;
            if (numberPicker8 == null) {
                p005kotlin.jvm.internal.s.m("decimalValuePicker");
                throw null;
            }
            numberPicker8.setMaxValue(9);
            NumberPicker numberPicker9 = this.f190886g;
            if (numberPicker9 != null) {
                numberPicker9.setValue(iDoubleValue);
                return;
            } else {
                p005kotlin.jvm.internal.s.m("decimalValuePicker");
                throw null;
            }
        }
        if (numberPicker7 == null) {
            p005kotlin.jvm.internal.s.m("decimalValuePicker");
            throw null;
        }
        numberPicker7.setMinValue(0);
        NumberPicker numberPicker10 = this.f190886g;
        if (numberPicker10 == null) {
            p005kotlin.jvm.internal.s.m("decimalValuePicker");
            throw null;
        }
        numberPicker10.setMaxValue(9);
        NumberPicker numberPicker11 = this.f190886g;
        if (numberPicker11 != null) {
            numberPicker11.setValue(iDoubleValue);
        } else {
            p005kotlin.jvm.internal.s.m("decimalValuePicker");
            throw null;
        }
    }

    public final void v6(Double d14, String str) {
        a.C3553a c3553a = this.f190883d.get(str);
        int i14 = c3553a != null ? (int) c3553a.f190891b : Integer.MIN_VALUE;
        int i15 = c3553a != null ? (int) c3553a.f190892c : Integer.MAX_VALUE;
        NumberPicker numberPicker = this.f190885f;
        if (numberPicker == null) {
            p005kotlin.jvm.internal.s.m("integerValuePicker");
            throw null;
        }
        numberPicker.setMinValue(i14);
        NumberPicker numberPicker2 = this.f190885f;
        if (numberPicker2 == null) {
            p005kotlin.jvm.internal.s.m("integerValuePicker");
            throw null;
        }
        numberPicker2.setMaxValue(i15);
        double d15 = c3553a != null ? c3553a.f190891b : Double.NaN;
        double d16 = c3553a != null ? c3553a.f190892c : Double.NaN;
        if (d14 != null && !Double.isNaN(d14.doubleValue()) && d14.doubleValue() >= d15 && d14.doubleValue() <= d16) {
            NumberPicker numberPicker3 = this.f190885f;
            if (numberPicker3 == null) {
                p005kotlin.jvm.internal.s.m("integerValuePicker");
                throw null;
            }
            numberPicker3.setValue((int) d14.doubleValue());
        } else if (c3553a != null) {
            v6(Double.valueOf(c3553a.f190890a), str);
        }
        NumberPicker numberPicker4 = this.f190885f;
        if (numberPicker4 != null) {
            numberPicker4.setOnValueChangedListener(new c0(2, this, str));
        } else {
            p005kotlin.jvm.internal.s.m("integerValuePicker");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lxg1/d$a;", "", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: xg1.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lxg1/d$a$a;", "", "", "default", "min", "max", "<init>", "(DDD)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C3553a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final double f190890a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final double f190891b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final double f190892c;

            public C3553a(double d14, double d15, double d16) {
                this.f190890a = d14;
                this.f190891b = d15;
                this.f190892c = d16;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3553a)) {
                    return false;
                }
                C3553a c3553a = (C3553a) obj;
                return Double.compare(this.f190890a, c3553a.f190890a) == 0 && Double.compare(this.f190891b, c3553a.f190891b) == 0 && Double.compare(this.f190892c, c3553a.f190892c) == 0;
            }

            public final int hashCode() {
                return Double.hashCode(this.f190892c) + org.apache.commons.lang3.e.b(Double.hashCode(this.f190890a) * 31, 31, this.f190891b);
            }

            public final String toString() {
                StringBuilder sbA = com.airbnb.lottie.parser.moshi.a.a("DoubleValueUnit(default=", this.f190890a, ", min=");
                sbA.append(this.f190891b);
                return am.j.r(sbA, ", max=", this.f190892c, ")");
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
