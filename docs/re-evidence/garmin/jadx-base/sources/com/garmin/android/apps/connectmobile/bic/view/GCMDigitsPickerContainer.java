package com.garmin.android.apps.connectmobile.bic.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.bic.GCMNumberPicker;
import com.garmin.android.gncs.settings.GNCSOptOutSettingsFragment;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0015\u001aB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\b\b\u0001\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0011R*\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u0011R*\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u0011R*\u0010\"\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u0011R*\u0010&\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\r\"\u0004\b%\u0010\u0011R*\u0010*\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0016\u001a\u0004\b(\u0010\r\"\u0004\b)\u0010\u0011R*\u0010+\u001a\u00020\t2\u0006\u0010+\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0016\u001a\u0004\b-\u0010\r\"\u0004\b.\u0010\u0011R*\u00100\u001a\u00020/2\u0006\u00100\u001a\u00020/8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u0010>\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lcom/garmin/android/apps/connectmobile/bic/view/GCMDigitsPickerContainer;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getValueFromPickers", "()I", GNCSOptOutSettingsFragment.EXTRA_TEXT_COLOR, "", "setTextColor", "(I)V", "textSize", "setTextSize", "digits", "a", "I", "getDigits", "setDigits", "minValue", "b", "getMinFirstDigitValue", "setMinFirstDigitValue", "minFirstDigitValue", "maxValue", "c", "getMaxFirstDigitValue", "setMaxFirstDigitValue", "maxFirstDigitValue", "d", "getMinSecondDigitValue", "setMinSecondDigitValue", "minSecondDigitValue", JWKParameterNames.RSA_EXPONENT, "getMaxSecondDigitValue", "setMaxSecondDigitValue", "maxSecondDigitValue", "value", "f", "getValue", "setValue", "", "wrapSelectorWheel", "g", "Z", "getWrapSelectorWheel", "()Z", "setWrapSelectorWheel", "(Z)V", "Lcom/garmin/android/apps/connectmobile/bic/view/GCMDigitsPickerContainer$b;", IntegerTokenConverter.CONVERTER_KEY, "Lcom/garmin/android/apps/connectmobile/bic/view/GCMDigitsPickerContainer$b;", "getOnValueChangeListener", "()Lcom/garmin/android/apps/connectmobile/bic/view/GCMDigitsPickerContainer$b;", "setOnValueChangeListener", "(Lcom/garmin/android/apps/connectmobile/bic/view/GCMDigitsPickerContainer$b;)V", "onValueChangeListener", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GCMDigitsPickerContainer extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public int digits;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int minFirstDigitValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int maxFirstDigitValue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int minSecondDigitValue;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int maxSecondDigitValue;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int value;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean wrapSelectorWheel;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f30763h;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public b onValueChangeListener;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final NumberPicker.OnValueChangeListener f30765j;

    public interface b {
        void a(GCMDigitsPickerContainer gCMDigitsPickerContainer);
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GCMDigitsPickerContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.digits = 2;
        this.maxFirstDigitValue = 9;
        this.maxSecondDigitValue = 9;
        this.f30763h = new ArrayList();
        this.f30765j = new j42.a(this, 6);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        c();
    }

    public static void a(GCMDigitsPickerContainer gCMDigitsPickerContainer) {
        gCMDigitsPickerContainer.setValue(gCMDigitsPickerContainer.getValueFromPickers());
        b bVar = gCMDigitsPickerContainer.onValueChangeListener;
        if (bVar != null) {
            bVar.a(gCMDigitsPickerContainer);
        }
    }

    private final int getValueFromPickers() {
        ArrayList arrayList = this.f30763h;
        int value = ((GCMNumberPicker) arrayList.get(0)).getValue();
        int i14 = this.digits;
        for (int i15 = 1; i15 < i14; i15++) {
            value = (value * 10) + ((GCMNumberPicker) arrayList.get(i15)).getValue();
        }
        return value;
    }

    public final void b(int i14, int i15) {
        GCMNumberPicker gCMNumberPicker = new GCMNumberPicker(getContext());
        gCMNumberPicker.setMinValue(i14);
        gCMNumberPicker.setMaxValue(i15);
        gCMNumberPicker.setValue(gCMNumberPicker.getMinValue());
        gCMNumberPicker.setOnValueChangedListener(this.f30765j);
        this.f30763h.add(gCMNumberPicker);
        addView(gCMNumberPicker);
    }

    public final void c() {
        b(this.minFirstDigitValue, this.maxFirstDigitValue);
        b(this.minSecondDigitValue, this.maxSecondDigitValue);
        int i14 = this.digits;
        for (int i15 = 2; i15 < i14; i15++) {
            b(0, 9);
        }
    }

    public final void d() {
        removeAllViews();
        this.f30763h.clear();
        c();
    }

    public final int getDigits() {
        return this.digits;
    }

    public final int getMaxFirstDigitValue() {
        return this.maxFirstDigitValue;
    }

    public final int getMaxSecondDigitValue() {
        return this.maxSecondDigitValue;
    }

    public final int getMinFirstDigitValue() {
        return this.minFirstDigitValue;
    }

    public final int getMinSecondDigitValue() {
        return this.minSecondDigitValue;
    }

    public final b getOnValueChangeListener() {
        return this.onValueChangeListener;
    }

    public final int getValue() {
        return this.value;
    }

    public final boolean getWrapSelectorWheel() {
        return this.wrapSelectorWheel;
    }

    public final void setDigits(int i14) {
        if (i14 < 2) {
            h.w();
        } else {
            this.digits = i14;
            d();
        }
    }

    public final void setMaxFirstDigitValue(int i14) {
        if (i14 < 0 || i14 > 9 || i14 < this.minFirstDigitValue) {
            h.w();
        } else {
            this.maxFirstDigitValue = i14;
            d();
        }
    }

    public final void setMaxSecondDigitValue(int i14) {
        if (i14 < 0 || i14 > 9 || i14 < this.minSecondDigitValue) {
            h.w();
        } else {
            this.maxSecondDigitValue = i14;
            d();
        }
    }

    public final void setMinFirstDigitValue(int i14) {
        if (i14 < 0 || i14 > 9 || i14 > this.maxFirstDigitValue) {
            h.w();
        } else {
            this.minFirstDigitValue = i14;
            d();
        }
    }

    public final void setMinSecondDigitValue(int i14) {
        if (i14 < 0 || i14 > 9 || i14 > this.maxSecondDigitValue) {
            h.w();
        } else {
            this.minSecondDigitValue = i14;
            d();
        }
    }

    public final void setOnValueChangeListener(b bVar) {
        this.onValueChangeListener = bVar;
    }

    public final void setTextColor(int textColor) {
        for (GCMNumberPicker gCMNumberPicker : this.f30763h) {
            gCMNumberPicker.setTextColorResId(textColor);
            gCMNumberPicker.getWrapSelectorWheel();
        }
    }

    public final void setTextSize(int textSize) {
        Iterator it = this.f30763h.iterator();
        while (it.hasNext()) {
            ((GCMNumberPicker) it.next()).setTextDimenResId(textSize);
        }
    }

    public final void setValue(int i14) {
        if (i14 >= 0) {
            int length = String.valueOf(i14).length();
            int i15 = this.digits;
            if (length <= i15) {
                int i16 = 1;
                if (1 <= i15) {
                    while (true) {
                        ((GCMNumberPicker) this.f30763h.get(this.digits - i16)).setValue(i14 % 10);
                        i14 /= 10;
                        if (i16 == i15) {
                            break;
                        } else {
                            i16++;
                        }
                    }
                }
                this.value = getValueFromPickers();
                return;
            }
        }
        h.w();
    }

    public final void setWrapSelectorWheel(boolean z14) {
        this.wrapSelectorWheel = z14;
        Iterator it = this.f30763h.iterator();
        while (it.hasNext()) {
            ((GCMNumberPicker) it.next()).setWrapSelectorWheel(z14);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/bic/view/GCMDigitsPickerContainer$a;", "", "<init>", "()V", "", "DIGIT_CONSTANT", "I", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GCMDigitsPickerContainer(Context context) {
        super(context);
        context.getClass();
        this.digits = 2;
        this.maxFirstDigitValue = 9;
        this.maxSecondDigitValue = 9;
        this.f30763h = new ArrayList();
        this.f30765j = new j42.a(this, 6);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        c();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GCMDigitsPickerContainer(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        attributeSet.getClass();
        this.digits = 2;
        this.maxFirstDigitValue = 9;
        this.maxSecondDigitValue = 9;
        this.f30763h = new ArrayList();
        this.f30765j = new j42.a(this, 6);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        c();
    }
}
