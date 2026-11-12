package com.garmin.android.apps.connectmobile.bic.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import c22.l3;
import c22.m3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.bic.GCMNumberPicker;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import po.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bR$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/garmin/android/apps/connectmobile/bic/view/CircumferencePickerLayout;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/garmin/android/apps/connectmobile/bic/view/CircumferencePickerLayout$a;", "c", "Lcom/garmin/android/apps/connectmobile/bic/view/CircumferencePickerLayout$a;", "getPickerCallback", "()Lcom/garmin/android/apps/connectmobile/bic/view/CircumferencePickerLayout$a;", "setPickerCallback", "(Lcom/garmin/android/apps/connectmobile/bic/view/CircumferencePickerLayout$a;)V", "pickerCallback", "b", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CircumferencePickerLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GCMDigitsPickerContainer f30750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GCMNumberPicker f30751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public a pickerCallback;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final NumberPicker.OnValueChangeListener f30753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f30754e;

    public interface a {
        void a(int i14, boolean z14);
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/bic/view/CircumferencePickerLayout$c", "Lcom/garmin/android/apps/connectmobile/bic/view/GCMDigitsPickerContainer$b;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements GCMDigitsPickerContainer.b {
        public c() {
        }

        @Override // com.garmin.android.apps.connectmobile.bic.view.GCMDigitsPickerContainer.b
        public final void a(GCMDigitsPickerContainer gCMDigitsPickerContainer) {
            CircumferencePickerLayout circumferencePickerLayout = CircumferencePickerLayout.this;
            a pickerCallback = circumferencePickerLayout.getPickerCallback();
            if (pickerCallback != null) {
                GCMDigitsPickerContainer gCMDigitsPickerContainer2 = circumferencePickerLayout.f30750a;
                if (gCMDigitsPickerContainer2 == null) {
                    s.m("valuePicker");
                    throw null;
                }
                int value = gCMDigitsPickerContainer2.getValue();
                GCMNumberPicker gCMNumberPicker = circumferencePickerLayout.f30751b;
                if (gCMNumberPicker != null) {
                    pickerCallback.a(value, gCMNumberPicker.getValue() == 1);
                } else {
                    s.m("unitsPicker");
                    throw null;
                }
            }
        }
    }

    static {
        new b(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircumferencePickerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.f30753d = new j42.a(this, 5);
        this.f30754e = new c();
        b();
    }

    public static void a(CircumferencePickerLayout circumferencePickerLayout) {
        GCMNumberPicker gCMNumberPicker = circumferencePickerLayout.f30751b;
        if (gCMNumberPicker == null) {
            s.m("unitsPicker");
            throw null;
        }
        circumferencePickerLayout.c(gCMNumberPicker.getValue() == 1);
        GCMNumberPicker gCMNumberPicker2 = circumferencePickerLayout.f30751b;
        if (gCMNumberPicker2 == null) {
            s.m("unitsPicker");
            throw null;
        }
        if (gCMNumberPicker2.getValue() == 1) {
            l3.a aVar = l3.f23124b;
            GCMDigitsPickerContainer gCMDigitsPickerContainer = circumferencePickerLayout.f30750a;
            if (gCMDigitsPickerContainer == null) {
                s.m("valuePicker");
                throw null;
            }
            double value = gCMDigitsPickerContainer.getValue();
            m3 m3Var = m3.INCH;
            m3 m3Var2 = m3.MILLIMETER;
            aVar.getClass();
            int iB = MathKt.b(l3.a.g(value, m3Var, m3Var2));
            GCMNumberPicker gCMNumberPicker3 = circumferencePickerLayout.f30751b;
            if (gCMNumberPicker3 == null) {
                s.m("unitsPicker");
                throw null;
            }
            circumferencePickerLayout.d(iB, gCMNumberPicker3.getValue() == 1);
        } else {
            GCMDigitsPickerContainer gCMDigitsPickerContainer2 = circumferencePickerLayout.f30750a;
            if (gCMDigitsPickerContainer2 == null) {
                s.m("valuePicker");
                throw null;
            }
            int value2 = gCMDigitsPickerContainer2.getValue();
            GCMNumberPicker gCMNumberPicker4 = circumferencePickerLayout.f30751b;
            if (gCMNumberPicker4 == null) {
                s.m("unitsPicker");
                throw null;
            }
            circumferencePickerLayout.d(value2, gCMNumberPicker4.getValue() == 1);
        }
        GCMDigitsPickerContainer gCMDigitsPickerContainer3 = circumferencePickerLayout.f30750a;
        if (gCMDigitsPickerContainer3 != null) {
            gCMDigitsPickerContainer3.setWrapSelectorWheel(false);
        } else {
            s.m("valuePicker");
            throw null;
        }
    }

    public final void b() {
        View.inflate(getContext(), R.layout.gcm3_wheel_circumference_picker, this);
        String[] strArr = {getContext().getString(R.string.lbl_inch), getContext().getString(R.string.lbl_mm)};
        View viewFindViewById = findViewById(R.id.picker_digits);
        viewFindViewById.getClass();
        GCMDigitsPickerContainer gCMDigitsPickerContainer = (GCMDigitsPickerContainer) viewFindViewById;
        this.f30750a = gCMDigitsPickerContainer;
        gCMDigitsPickerContainer.setTextSize(2131165313);
        GCMDigitsPickerContainer gCMDigitsPickerContainer2 = this.f30750a;
        if (gCMDigitsPickerContainer2 == null) {
            s.m("valuePicker");
            throw null;
        }
        gCMDigitsPickerContainer2.setOnValueChangeListener(this.f30754e);
        GCMDigitsPickerContainer gCMDigitsPickerContainer3 = this.f30750a;
        if (gCMDigitsPickerContainer3 == null) {
            s.m("valuePicker");
            throw null;
        }
        gCMDigitsPickerContainer3.setDigits(4);
        GCMDigitsPickerContainer gCMDigitsPickerContainer4 = this.f30750a;
        if (gCMDigitsPickerContainer4 == null) {
            s.m("valuePicker");
            throw null;
        }
        gCMDigitsPickerContainer4.setMinFirstDigitValue(0);
        GCMDigitsPickerContainer gCMDigitsPickerContainer5 = this.f30750a;
        if (gCMDigitsPickerContainer5 == null) {
            s.m("valuePicker");
            throw null;
        }
        gCMDigitsPickerContainer5.setWrapSelectorWheel(false);
        GCMDigitsPickerContainer gCMDigitsPickerContainer6 = this.f30750a;
        if (gCMDigitsPickerContainer6 == null) {
            s.m("valuePicker");
            throw null;
        }
        gCMDigitsPickerContainer6.post(new g(this, 22));
        View viewFindViewById2 = findViewById(R.id.picker_units);
        viewFindViewById2.getClass();
        GCMNumberPicker gCMNumberPicker = (GCMNumberPicker) viewFindViewById2;
        this.f30751b = gCMNumberPicker;
        gCMNumberPicker.setTextColorResId(R.color.gcm_text_primary);
        GCMNumberPicker gCMNumberPicker2 = this.f30751b;
        if (gCMNumberPicker2 == null) {
            s.m("unitsPicker");
            throw null;
        }
        gCMNumberPicker2.setTextDimenResId(2131165313);
        GCMNumberPicker gCMNumberPicker3 = this.f30751b;
        if (gCMNumberPicker3 == null) {
            s.m("unitsPicker");
            throw null;
        }
        gCMNumberPicker3.setMinValue(0);
        GCMNumberPicker gCMNumberPicker4 = this.f30751b;
        if (gCMNumberPicker4 == null) {
            s.m("unitsPicker");
            throw null;
        }
        gCMNumberPicker4.setMaxValue(1);
        GCMNumberPicker gCMNumberPicker5 = this.f30751b;
        if (gCMNumberPicker5 == null) {
            s.m("unitsPicker");
            throw null;
        }
        gCMNumberPicker5.setWrapSelectorWheel(false);
        GCMNumberPicker gCMNumberPicker6 = this.f30751b;
        if (gCMNumberPicker6 == null) {
            s.m("unitsPicker");
            throw null;
        }
        gCMNumberPicker6.setDisplayedValues(strArr);
        GCMNumberPicker gCMNumberPicker7 = this.f30751b;
        if (gCMNumberPicker7 == null) {
            s.m("unitsPicker");
            throw null;
        }
        gCMNumberPicker7.setOnValueChangedListener(this.f30753d);
        GCMNumberPicker gCMNumberPicker8 = this.f30751b;
        if (gCMNumberPicker8 != null) {
            gCMNumberPicker8.setDescendantFocusability(393216);
        } else {
            s.m("unitsPicker");
            throw null;
        }
    }

    public final void c(boolean z14) {
        GCMDigitsPickerContainer gCMDigitsPickerContainer = this.f30750a;
        if (z14) {
            if (gCMDigitsPickerContainer == null) {
                s.m("valuePicker");
                throw null;
            }
            gCMDigitsPickerContainer.setMaxFirstDigitValue(9);
            GCMDigitsPickerContainer gCMDigitsPickerContainer2 = this.f30750a;
            if (gCMDigitsPickerContainer2 == null) {
                s.m("valuePicker");
                throw null;
            }
            gCMDigitsPickerContainer2.setMinFirstDigitValue(0);
            GCMDigitsPickerContainer gCMDigitsPickerContainer3 = this.f30750a;
            if (gCMDigitsPickerContainer3 != null) {
                gCMDigitsPickerContainer3.setMaxSecondDigitValue(9);
                return;
            } else {
                s.m("valuePicker");
                throw null;
            }
        }
        if (gCMDigitsPickerContainer == null) {
            s.m("valuePicker");
            throw null;
        }
        gCMDigitsPickerContainer.setMinFirstDigitValue(0);
        GCMDigitsPickerContainer gCMDigitsPickerContainer4 = this.f30750a;
        if (gCMDigitsPickerContainer4 == null) {
            s.m("valuePicker");
            throw null;
        }
        gCMDigitsPickerContainer4.setMaxFirstDigitValue(0);
        GCMDigitsPickerContainer gCMDigitsPickerContainer5 = this.f30750a;
        if (gCMDigitsPickerContainer5 != null) {
            gCMDigitsPickerContainer5.setMaxSecondDigitValue(3);
        } else {
            s.m("valuePicker");
            throw null;
        }
    }

    public final void d(int i14, boolean z14) {
        if (z14) {
            GCMDigitsPickerContainer gCMDigitsPickerContainer = this.f30750a;
            if (i14 <= 9999) {
                if (gCMDigitsPickerContainer == null) {
                    s.m("valuePicker");
                    throw null;
                }
                gCMDigitsPickerContainer.setValue(i14);
            } else {
                if (gCMDigitsPickerContainer == null) {
                    s.m("valuePicker");
                    throw null;
                }
                gCMDigitsPickerContainer.setValue(2111);
            }
        } else {
            l3.a aVar = l3.f23124b;
            double d14 = i14;
            m3 m3Var = m3.MILLIMETER;
            m3 m3Var2 = m3.INCH;
            aVar.getClass();
            int iB = MathKt.b(l3.a.g(d14, m3Var, m3Var2));
            GCMDigitsPickerContainer gCMDigitsPickerContainer2 = this.f30750a;
            if (iB <= 393) {
                if (gCMDigitsPickerContainer2 == null) {
                    s.m("valuePicker");
                    throw null;
                }
                gCMDigitsPickerContainer2.setValue(iB);
            } else {
                if (gCMDigitsPickerContainer2 == null) {
                    s.m("valuePicker");
                    throw null;
                }
                gCMDigitsPickerContainer2.setValue(83);
            }
        }
        a aVar2 = this.pickerCallback;
        if (aVar2 != null) {
            GCMDigitsPickerContainer gCMDigitsPickerContainer3 = this.f30750a;
            if (gCMDigitsPickerContainer3 == null) {
                s.m("valuePicker");
                throw null;
            }
            aVar2.a(gCMDigitsPickerContainer3.getValue(), z14);
        }
        GCMNumberPicker gCMNumberPicker = this.f30751b;
        if (gCMNumberPicker != null) {
            gCMNumberPicker.setValue(z14 ? 1 : 0);
        } else {
            s.m("unitsPicker");
            throw null;
        }
    }

    public final a getPickerCallback() {
        return this.pickerCallback;
    }

    public final void setPickerCallback(a aVar) {
        this.pickerCallback = aVar;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/garmin/android/apps/connectmobile/bic/view/CircumferencePickerLayout$b;", "", "<init>", "()V", "", "MIN_FIGURE_OF_THOUSANDS_FOR_MM", "I", "MAX_FIGURE_OF_THOUSANDS_FOR_MM", "FIGURE_OF_THOUSANDS_FOR_INCH", "MAX_FIGURE_OF_HUNDREDS_FOR_INCH", "NUMBER_OF_DIGITS", "DEFAULT_BIKE_CIRCUMFERENCE_IN_MM", "MAX_CIRCUMFERENCE_IN_MM", "DEFAULT_BIKE_CIRCUMFERENCE_IN_INCH", "MAX_CIRCUMFERENCE_IN_INCH", "US_UNITS_PICKER_VALUE", "METRIC_UNITS_PICKER_VALUE", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircumferencePickerLayout(Context context) {
        super(context);
        context.getClass();
        this.f30753d = new j42.a(this, 5);
        this.f30754e = new c();
        b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircumferencePickerLayout(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        attributeSet.getClass();
        this.f30753d = new j42.a(this, 5);
        this.f30754e = new c();
        b();
    }
}
