package r22;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lr22/j2;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function2;", "", "", "", "onWeightPicked", "weight", "", "minWeightInKg", "maxWeightInKg", "minWeightInLb", "maxWeightInLb", "useMetricUnits", "canChangeUnit", "<init>", "(Landroid/content/Context;Le23/p;DIIIIZZ)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.p<Double, Boolean, Unit> f149719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f149720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f149721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f149722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f149723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f149724f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final NumberPicker f149725g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final NumberPicker f149726h;

    /* JADX WARN: Multi-variable type inference failed */
    public j2(Context context, e23.p<? super Double, ? super Boolean, Unit> pVar, double d14, int i14, int i15, int i16, int i17, boolean z14, boolean z15) {
        String[] strArr;
        context.getClass();
        pVar.getClass();
        this.f149719a = pVar;
        this.f149720b = i14;
        this.f149721c = i15;
        this.f149722d = i16;
        this.f149723e = i17;
        this.f149724f = z14;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.gcm_edit_weight_with_unit, (ViewGroup) null);
        viewInflate.getClass();
        if (z15) {
            strArr = new String[]{context.getString(R.string.lbl_kg), context.getString(R.string.lbl_lbs)};
        } else {
            strArr = this.f149724f ? new String[]{context.getString(R.string.lbl_kg)} : new String[]{context.getString(R.string.lbl_lbs)};
        }
        View viewFindViewById = viewInflate.findViewById(R.id.number_picker_weight_whole);
        viewFindViewById.getClass();
        NumberPicker numberPicker = (NumberPicker) viewFindViewById;
        this.f149726h = numberPicker;
        final int i18 = 0;
        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener(this) { // from class: r22.i2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j2 f149694b;

            {
                this.f149694b = this;
            }

            @Override // android.widget.NumberPicker.OnValueChangeListener
            public final void onValueChange(NumberPicker numberPicker2, int i19, int i24) {
                switch (i18) {
                    case 0:
                        j2 j2Var = this.f149694b;
                        if (j2Var.f149724f) {
                            if (i24 < j2Var.f149720b) {
                                numberPicker2.setValue(i19);
                                return;
                            }
                            return;
                        } else {
                            if (i24 < j2Var.f149722d) {
                                numberPicker2.setValue(i19);
                                return;
                            }
                            return;
                        }
                    default:
                        boolean z16 = i24 == 0;
                        j2 j2Var2 = this.f149694b;
                        j2Var2.f149724f = z16;
                        int i25 = j2Var2.f149723e;
                        int i26 = j2Var2.f149722d;
                        int i27 = j2Var2.f149721c;
                        int i28 = j2Var2.f149720b;
                        NumberPicker numberPicker3 = j2Var2.f149726h;
                        if (numberPicker3 == null) {
                            p005kotlin.jvm.internal.s.m("pickerWhole");
                            throw null;
                        }
                        int value = numberPicker3.getValue();
                        boolean z17 = j2Var2.f149724f;
                        NumberPicker numberPicker4 = j2Var2.f149726h;
                        if (z17) {
                            if (numberPicker4 == null) {
                                p005kotlin.jvm.internal.s.m("pickerWhole");
                                throw null;
                            }
                            numberPicker4.setMinValue(i28);
                            NumberPicker numberPicker5 = j2Var2.f149726h;
                            if (numberPicker5 == null) {
                                p005kotlin.jvm.internal.s.m("pickerWhole");
                                throw null;
                            }
                            numberPicker5.setMaxValue(i27);
                            if (value < i28) {
                                NumberPicker numberPicker6 = j2Var2.f149726h;
                                if (numberPicker6 != null) {
                                    numberPicker6.setValue(i28);
                                    return;
                                } else {
                                    p005kotlin.jvm.internal.s.m("pickerWhole");
                                    throw null;
                                }
                            }
                            if (value > i27) {
                                NumberPicker numberPicker7 = j2Var2.f149726h;
                                if (numberPicker7 != null) {
                                    numberPicker7.setValue(i27);
                                    return;
                                } else {
                                    p005kotlin.jvm.internal.s.m("pickerWhole");
                                    throw null;
                                }
                            }
                            return;
                        }
                        if (numberPicker4 == null) {
                            p005kotlin.jvm.internal.s.m("pickerWhole");
                            throw null;
                        }
                        numberPicker4.setMinValue(i26);
                        NumberPicker numberPicker8 = j2Var2.f149726h;
                        if (numberPicker8 == null) {
                            p005kotlin.jvm.internal.s.m("pickerWhole");
                            throw null;
                        }
                        numberPicker8.setMaxValue(i25);
                        if (value < i26) {
                            NumberPicker numberPicker9 = j2Var2.f149726h;
                            if (numberPicker9 != null) {
                                numberPicker9.setValue(i26);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("pickerWhole");
                                throw null;
                            }
                        }
                        if (value > i25) {
                            NumberPicker numberPicker10 = j2Var2.f149726h;
                            if (numberPicker10 != null) {
                                numberPicker10.setValue(i25);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("pickerWhole");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        View viewFindViewById2 = viewInflate.findViewById(R.id.number_picker_weight_unit);
        viewFindViewById2.getClass();
        NumberPicker numberPicker2 = (NumberPicker) viewFindViewById2;
        this.f149725g = numberPicker2;
        numberPicker2.setDisplayedValues(strArr);
        NumberPicker numberPicker3 = this.f149725g;
        if (numberPicker3 == null) {
            p005kotlin.jvm.internal.s.m("pickerUnit");
            throw null;
        }
        final int i19 = 1;
        numberPicker3.setOnValueChangedListener(new NumberPicker.OnValueChangeListener(this) { // from class: r22.i2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j2 f149694b;

            {
                this.f149694b = this;
            }

            @Override // android.widget.NumberPicker.OnValueChangeListener
            public final void onValueChange(NumberPicker numberPicker4, int i110, int i24) {
                switch (i19) {
                    case 0:
                        j2 j2Var = this.f149694b;
                        if (j2Var.f149724f) {
                            if (i24 < j2Var.f149720b) {
                                numberPicker4.setValue(i110);
                                return;
                            }
                            return;
                        } else {
                            if (i24 < j2Var.f149722d) {
                                numberPicker4.setValue(i110);
                                return;
                            }
                            return;
                        }
                    default:
                        boolean z16 = i24 == 0;
                        j2 j2Var2 = this.f149694b;
                        j2Var2.f149724f = z16;
                        int i25 = j2Var2.f149723e;
                        int i26 = j2Var2.f149722d;
                        int i27 = j2Var2.f149721c;
                        int i28 = j2Var2.f149720b;
                        NumberPicker numberPicker5 = j2Var2.f149726h;
                        if (numberPicker5 == null) {
                            p005kotlin.jvm.internal.s.m("pickerWhole");
                            throw null;
                        }
                        int value = numberPicker5.getValue();
                        boolean z17 = j2Var2.f149724f;
                        NumberPicker numberPicker6 = j2Var2.f149726h;
                        if (z17) {
                            if (numberPicker6 == null) {
                                p005kotlin.jvm.internal.s.m("pickerWhole");
                                throw null;
                            }
                            numberPicker6.setMinValue(i28);
                            NumberPicker numberPicker7 = j2Var2.f149726h;
                            if (numberPicker7 == null) {
                                p005kotlin.jvm.internal.s.m("pickerWhole");
                                throw null;
                            }
                            numberPicker7.setMaxValue(i27);
                            if (value < i28) {
                                NumberPicker numberPicker8 = j2Var2.f149726h;
                                if (numberPicker8 != null) {
                                    numberPicker8.setValue(i28);
                                    return;
                                } else {
                                    p005kotlin.jvm.internal.s.m("pickerWhole");
                                    throw null;
                                }
                            }
                            if (value > i27) {
                                NumberPicker numberPicker9 = j2Var2.f149726h;
                                if (numberPicker9 != null) {
                                    numberPicker9.setValue(i27);
                                    return;
                                } else {
                                    p005kotlin.jvm.internal.s.m("pickerWhole");
                                    throw null;
                                }
                            }
                            return;
                        }
                        if (numberPicker6 == null) {
                            p005kotlin.jvm.internal.s.m("pickerWhole");
                            throw null;
                        }
                        numberPicker6.setMinValue(i26);
                        NumberPicker numberPicker10 = j2Var2.f149726h;
                        if (numberPicker10 == null) {
                            p005kotlin.jvm.internal.s.m("pickerWhole");
                            throw null;
                        }
                        numberPicker10.setMaxValue(i25);
                        if (value < i26) {
                            NumberPicker numberPicker11 = j2Var2.f149726h;
                            if (numberPicker11 != null) {
                                numberPicker11.setValue(i26);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("pickerWhole");
                                throw null;
                            }
                        }
                        if (value > i25) {
                            NumberPicker numberPicker12 = j2Var2.f149726h;
                            if (numberPicker12 != null) {
                                numberPicker12.setValue(i25);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("pickerWhole");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        NumberPicker numberPicker4 = this.f149726h;
        if (numberPicker4 == null) {
            p005kotlin.jvm.internal.s.m("pickerWhole");
            throw null;
        }
        numberPicker4.setWrapSelectorWheel(false);
        NumberPicker numberPicker5 = this.f149725g;
        if (numberPicker5 == null) {
            p005kotlin.jvm.internal.s.m("pickerUnit");
            throw null;
        }
        numberPicker5.setMinValue(0);
        NumberPicker numberPicker6 = this.f149725g;
        if (numberPicker6 == null) {
            p005kotlin.jvm.internal.s.m("pickerUnit");
            throw null;
        }
        numberPicker6.setMaxValue(z15 ? 1 : 0);
        NumberPicker numberPicker7 = this.f149725g;
        if (numberPicker7 == null) {
            p005kotlin.jvm.internal.s.m("pickerUnit");
            throw null;
        }
        numberPicker7.setValue((!z15 || this.f149724f) ? 0 : 1);
        boolean z16 = this.f149724f;
        NumberPicker numberPicker8 = this.f149726h;
        if (z16) {
            if (numberPicker8 == null) {
                p005kotlin.jvm.internal.s.m("pickerWhole");
                throw null;
            }
            numberPicker8.setMaxValue(i15);
            NumberPicker numberPicker9 = this.f149726h;
            if (numberPicker9 == null) {
                p005kotlin.jvm.internal.s.m("pickerWhole");
                throw null;
            }
            numberPicker9.setMinValue(i14);
        } else {
            if (numberPicker8 == null) {
                p005kotlin.jvm.internal.s.m("pickerWhole");
                throw null;
            }
            numberPicker8.setMaxValue(i17);
            NumberPicker numberPicker10 = this.f149726h;
            if (numberPicker10 == null) {
                p005kotlin.jvm.internal.s.m("pickerWhole");
                throw null;
            }
            numberPicker10.setMinValue(i16);
        }
        NumberPicker numberPicker11 = this.f149726h;
        if (numberPicker11 == null) {
            p005kotlin.jvm.internal.s.m("pickerWhole");
            throw null;
        }
        numberPicker11.setValue(d14 > 0.0d ? (int) d14 : 0);
        new androidx.appcompat.app.e.a(context).setTitle(R.string.lbl_weight).setView(viewInflate).setCancelable(true).setPositiveButton(R.string.lbl_done, new ng1.c1(this, 23)).show();
    }
}
