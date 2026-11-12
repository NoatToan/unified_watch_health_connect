package com.garmin.android.apps.connectmobile.view.reusablecomponents;

import android.content.Context;
import android.icu.text.NumberFormat;
import android.text.InputFilter;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import bb0.d;
import c32.h;
import c32.j;
import ch.qos.logback.core.CoreConstants;
import d53.s;
import d53.w;
import e23.p;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import r1.q2;
import tn.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001RB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR(\u0010\u0010\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR(\u0010\u0016\u001a\u0004\u0018\u00010\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R(\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010.\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R.\u00103\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\r\u001a\u0004\b0\u0010\u000f\"\u0004\b1\u00102R.\u00107\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\r\u001a\u0004\b5\u0010\u000f\"\u0004\b6\u00102R*\u0010;\u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\u001f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010!\u001a\u0004\b9\u0010#\"\u0004\b:\u0010%R*\u0010B\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR8\u0010K\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020D\u0018\u00010C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0016\u0010O\u001a\u0004\u0018\u00010L8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0016\u0010Q\u001a\u0004\u0018\u00010'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010+¨\u0006S"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/reusablecomponents/InlineUnitsTextFieldView;", "Lc32/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "value", "J0", "Ljava/lang/Number;", "getCurrentNumber", "()Ljava/lang/Number;", "currentNumber", "Lcom/garmin/android/apps/connectmobile/view/reusablecomponents/InlineUnitsTextFieldView$a;", "K0", "Lcom/garmin/android/apps/connectmobile/view/reusablecomponents/InlineUnitsTextFieldView$a;", "getCurrentUnit", "()Lcom/garmin/android/apps/connectmobile/view/reusablecomponents/InlineUnitsTextFieldView$a;", "currentUnit", "", "L0", "Ljava/util/List;", "getUnitList", "()Ljava/util/List;", "setUnitList", "(Ljava/util/List;)V", "unitList", "", "M0", "Z", "getUseShortActionLabel", "()Z", "setUseShortActionLabel", "(Z)V", "useShortActionLabel", "", "N0", "Ljava/lang/String;", "getPickerTitle", "()Ljava/lang/String;", "setPickerTitle", "(Ljava/lang/String;)V", "pickerTitle", "O0", "getMaxNumber", "setMaxNumber", "(Ljava/lang/Number;)V", "maxNumber", "P0", "getMinNumber", "setMinNumber", "minNumber", "Q0", "getAllowNegative", "setAllowNegative", "allowNegative", "R0", "I", "getNumberOfDecimalsAllowed", "()I", "setNumberOfDecimalsAllowed", "(I)V", "numberOfDecimalsAllowed", "Lkotlin/Function2;", "", "S0", "Le23/p;", "getOnDoneEditingNumber", "()Le23/p;", "setOnDoneEditingNumber", "(Le23/p;)V", "onDoneEditingNumber", "Lcom/garmin/android/apps/connectmobile/view/reusablecomponents/b$a;", "getUnitButton", "()Lcom/garmin/android/apps/connectmobile/view/reusablecomponents/b$a;", "unitButton", "getDisplayText", "displayText", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class InlineUnitsTextFieldView extends h {
    public static final /* synthetic */ int T0 = 0;
    public final Locale H0;
    public final char I0;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    public Number currentNumber;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    public a currentUnit;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public List<? extends a> unitList;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public boolean useShortActionLabel;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    public String pickerTitle;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    public Number maxNumber;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    public Number minNumber;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    public boolean allowNegative;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    public int numberOfDecimalsAllowed;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    public p<? super a, ? super Number, Unit> onDoneEditingNumber;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final d f47689k0;

    public interface a extends c32.d {
        default String b(Context context) {
            return a(context);
        }

        String c(Number number, Context context);
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            InlineUnitsTextFieldView inlineUnitsTextFieldView = InlineUnitsTextFieldView.this;
            EditText editText = inlineUnitsTextFieldView.editText;
            editText.setImportantForAccessibility(1);
            editText.requestFocus();
            Object systemService = editText.getContext().getSystemService("input_method");
            systemService.getClass();
            ((InputMethodManager) systemService).showSoftInput(editText, 1);
            p<a, Number, Unit> onDoneEditingNumber = inlineUnitsTextFieldView.getOnDoneEditingNumber();
            if (onDoneEditingNumber != null) {
                a currentUnit = inlineUnitsTextFieldView.getCurrentUnit();
                currentUnit.getClass();
                onDoneEditingNumber.invoke(currentUnit, inlineUnitsTextFieldView.getCurrentNumber());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/view/reusablecomponents/InlineUnitsTextFieldView$c", "Landroid/text/InputFilter;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements InputFilter {
        public c() {
        }

        @Override // android.text.InputFilter
        public final CharSequence filter(CharSequence charSequence, int i14, int i15, Spanned spanned, int i16, int i17) {
            charSequence.getClass();
            String strF = k.f("0123456789", InlineUnitsTextFieldView.this.I0);
            while (i14 < i15) {
                if (!w.A(strF, charSequence.charAt(i14))) {
                    return charSequence;
                }
                i14++;
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineUnitsTextFieldView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        this.f47689k0 = new d(18, this, context);
        Locale locale = Locale.getDefault();
        this.H0 = locale;
        this.I0 = new DecimalFormatSymbols(locale).getDecimalSeparator();
        this.unitList = j0.f134944a;
        setInputType(8194);
        setShowCharacterCount(false);
        setOnDoneEditing(new j(this, 0));
        j();
    }

    private final String getDisplayText() {
        String strValueOf;
        boolean mIsEditing = getMIsEditing();
        Number number = this.currentNumber;
        if (mIsEditing) {
            if (number != null) {
                boolean z14 = number.doubleValue() % ((double) 1) == 0.0d;
                if (number.intValue() >= Integer.MAX_VALUE || number.doubleValue() >= Double.MAX_VALUE) {
                    strValueOf = "";
                } else {
                    strValueOf = z14 ? String.valueOf(number.intValue()) : String.valueOf(number.doubleValue());
                }
                if (strValueOf != null) {
                    return strValueOf;
                }
            }
            return getEditHintText();
        }
        if (number != null) {
            int i14 = this.numberOfDecimalsAllowed;
            a aVar = this.currentUnit;
            String strC = null;
            if (i14 == 0) {
                if (aVar != null) {
                    Context context = getContext();
                    context.getClass();
                    strC = aVar.c(Integer.valueOf(number.intValue()), context);
                }
            } else if (aVar != null) {
                Context context2 = getContext();
                context2.getClass();
                strC = aVar.c(number, context2);
            }
            if (strC != null) {
                return strC;
            }
        }
        return getEditHintText();
    }

    private final com.garmin.android.apps.connectmobile.view.reusablecomponents.b.a getUnitButton() {
        String lowerCase;
        a aVar = this.currentUnit;
        if (aVar == null) {
            return null;
        }
        boolean z14 = this.useShortActionLabel;
        Locale locale = this.H0;
        if (z14) {
            Context context = getContext();
            context.getClass();
            String strB = aVar.b(context);
            locale.getClass();
            lowerCase = strB.toLowerCase(locale);
            lowerCase.getClass();
        } else {
            Context context2 = getContext();
            context2.getClass();
            String strA = aVar.a(context2);
            locale.getClass();
            lowerCase = strA.toLowerCase(locale);
            lowerCase.getClass();
        }
        return new com.garmin.android.apps.connectmobile.view.reusablecomponents.b.a(lowerCase, this.f47689k0);
    }

    public static Unit i(InlineUnitsTextFieldView inlineUnitsTextFieldView, a aVar) {
        aVar.getClass();
        inlineUnitsTextFieldView.currentUnit = aVar;
        inlineUnitsTextFieldView.setActionButtonData(inlineUnitsTextFieldView.getUnitButton());
        return Unit.INSTANCE;
    }

    @Override // com.garmin.android.apps.connectmobile.view.reusablecomponents.b
    public final void a() {
        double dDoubleValue;
        super.a();
        if (w.J(getEditTextValue())) {
            this.currentNumber = null;
            return;
        }
        if (this.numberOfDecimalsAllowed <= 0 || !w.A(getEditTextValue(), this.I0)) {
            Double dF = s.f(getEditTextValue());
            if (dF == null) {
                return;
            } else {
                dDoubleValue = dF.doubleValue();
            }
        } else {
            try {
                dDoubleValue = NumberFormat.getInstance(this.H0).parse(getEditTextValue()).doubleValue();
            } catch (ParseException unused) {
                Double dF2 = s.f(getEditTextValue());
                if (dF2 == null) {
                    return;
                } else {
                    dDoubleValue = dF2.doubleValue();
                }
            }
        }
        Number number = this.maxNumber;
        double dMin = Math.min(dDoubleValue, number != null ? number.doubleValue() : dDoubleValue);
        Number number2 = this.minNumber;
        this.currentNumber = Double.valueOf(Math.max(dMin, number2 != null ? number2.doubleValue() : dMin));
    }

    @Override // com.garmin.android.apps.connectmobile.view.reusablecomponents.b
    public final void b() {
        super.b();
        p<? super a, ? super Number, Unit> pVar = this.onDoneEditingNumber;
        if (pVar != null) {
            a aVar = this.currentUnit;
            aVar.getClass();
            pVar.invoke(aVar, this.currentNumber);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.view.reusablecomponents.b
    public final void g() {
        super.g();
        k();
    }

    public final boolean getAllowNegative() {
        return this.allowNegative;
    }

    public final Number getCurrentNumber() {
        return this.currentNumber;
    }

    public final a getCurrentUnit() {
        return this.currentUnit;
    }

    public final Number getMaxNumber() {
        return this.maxNumber;
    }

    public final Number getMinNumber() {
        return this.minNumber;
    }

    public final int getNumberOfDecimalsAllowed() {
        return this.numberOfDecimalsAllowed;
    }

    public final p<a, Number, Unit> getOnDoneEditingNumber() {
        return this.onDoneEditingNumber;
    }

    public final String getPickerTitle() {
        return this.pickerTitle;
    }

    public final List<a> getUnitList() {
        return this.unitList;
    }

    public final boolean getUseShortActionLabel() {
        return this.useShortActionLabel;
    }

    public final void j() {
        String strF = "0123456789";
        if (this.numberOfDecimalsAllowed > 0) {
            strF = k.f("0123456789", this.I0);
        } else if (this.allowNegative) {
            strF = "0123456789-";
        }
        setAllowedDigits(strF);
    }

    public final void k() {
        String editHintText;
        String displayText = getDisplayText();
        if (displayText == null) {
            displayText = "";
        }
        setEditTextValue(displayText);
        if (!getMIsEditing() || (editHintText = getEditHintText()) == null || editHintText.length() == 0 || !p005kotlin.jvm.internal.s.g(getEditTextValue(), getEditHintText())) {
            return;
        }
        postDelayed(new a0.c(this, 28), 25L);
    }

    public final void l() {
        Integer numValueOf;
        Number number = this.maxNumber;
        if (number != null) {
            int iIntValue = number.intValue();
            numValueOf = Integer.valueOf(this.numberOfDecimalsAllowed > 0 ? String.valueOf(iIntValue - 1).length() + this.numberOfDecimalsAllowed + 1 : String.valueOf(iIntValue).length());
        } else {
            numValueOf = null;
        }
        setEditCharLimit(numValueOf);
    }

    public final void m(Number number, a aVar) {
        aVar.getClass();
        this.currentNumber = number;
        this.currentUnit = aVar;
        setActionButtonData(getUnitButton());
        k();
    }

    public final void setAllowNegative(boolean z14) {
        this.allowNegative = z14;
        j();
        l();
    }

    public final void setMaxNumber(Number number) throws Exception {
        Number number2 = this.minNumber;
        if (number2 != null) {
            double dDoubleValue = number2.doubleValue();
            if (number != null && number.doubleValue() < dDoubleValue) {
                q2.u("InlineUnitsTextFieldView: Max cannot be less than min");
                return;
            }
        }
        this.maxNumber = number;
        l();
    }

    public final void setMinNumber(Number number) throws Exception {
        Number number2 = this.maxNumber;
        if (number2 != null) {
            double dDoubleValue = number2.doubleValue();
            if (number != null && number.doubleValue() > dDoubleValue) {
                q2.u("InlineUnitsTextFieldView: Min cannot be greater than max");
                return;
            }
        }
        this.minNumber = number;
    }

    public final void setNumberOfDecimalsAllowed(int i14) {
        this.numberOfDecimalsAllowed = i14;
        j();
        l();
        if (this.numberOfDecimalsAllowed > 0) {
            getEditText().setFilters(new c[]{new c()});
        }
    }

    public final void setOnDoneEditingNumber(p<? super a, ? super Number, Unit> pVar) {
        this.onDoneEditingNumber = pVar;
    }

    public final void setPickerTitle(String str) {
        this.pickerTitle = str;
    }

    public final void setUnitList(List<? extends a> list) {
        list.getClass();
        this.unitList = list;
    }

    public final void setUseShortActionLabel(boolean z14) {
        this.useShortActionLabel = z14;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InlineUnitsTextFieldView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InlineUnitsTextFieldView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ InlineUnitsTextFieldView(Context context, AttributeSet attributeSet, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
