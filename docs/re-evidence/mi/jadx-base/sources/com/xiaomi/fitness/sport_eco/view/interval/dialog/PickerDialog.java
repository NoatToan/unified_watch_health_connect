package com.xiaomi.fitness.sport_eco.view.interval.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import com.xiaomi.fitness.baseui.Utils;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.widget.NumberPickerView;
import com.xiaomi.fitness.common.utils.UIUtils;
import defpackage.clb;
import defpackage.gki;
import defpackage.gsi;
import defpackage.n1j;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public class PickerDialog extends CommonDialog<DialogParams> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NumberPickerView f13083a;
    public boolean c;
    public String e;
    public int f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13084b = -1;
    public int d = 0;

    public static class PickerDialogParams extends DialogParams {
        public static final Parcelable.Creator<PickerDialogParams> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f13085a;

        public class a implements Parcelable.Creator<PickerDialogParams> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public PickerDialogParams createFromParcel(Parcel parcel) {
                return new PickerDialogParams(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public PickerDialogParams[] newArray(int i) {
                return new PickerDialogParams[i];
            }
        }

        public PickerDialogParams(String str) {
            super(str);
        }

        public int[] getPickerData() {
            int[] iArr = this.f13085a;
            Objects.requireNonNull(iArr);
            return iArr;
        }

        public void setPickerData(int[] iArr) {
            Objects.requireNonNull(iArr);
            this.f13085a = iArr;
        }

        @Override // com.xiaomi.fitness.baseui.dialog.DialogParams, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f13085a.length);
            parcel.writeIntArray(this.f13085a);
        }

        public PickerDialogParams(Parcel parcel) {
            super(parcel);
            int[] iArr = new int[parcel.readInt()];
            this.f13085a = iArr;
            parcel.readIntArray(iArr);
        }
    }

    public interface a {
        int getCount();

        int getValue(int i);
    }

    public static class b extends com.xiaomi.fitness.baseui.dialog.a<b, PickerDialogParams, PickerDialog> {
        public b(String str) {
            this(new PickerDialogParams(str));
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b getThis() {
            return this;
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PickerDialog internalCreate() {
            return new PickerDialog();
        }

        public b c(a aVar) {
            Objects.requireNonNull(aVar, "adapter can not be null");
            int count = aVar.getCount();
            int[] iArr = new int[count];
            for (int i = 0; i < count; i++) {
                iArr[i] = aVar.getValue(i);
            }
            requireDialogParams().setPickerData(iArr);
            return this;
        }

        public b(PickerDialogParams pickerDialogParams) {
            super(pickerDialogParams);
        }
    }

    private int getCurrentIndex() {
        NumberPickerView numberPickerView = this.f13083a;
        if (numberPickerView != null) {
            return numberPickerView.getPickedIndexRelativeToRaw();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initPickerView$0(NumberPickerView numberPickerView, int i, int i2) {
        Context context = getContext();
        if (context != null) {
            numberPickerView.setContentDescription(context.getString(n1j.E, String.valueOf(getValue())));
            if (this.d != 0) {
                numberPickerView.setHintText(requireContext().getResources().getQuantityText(this.d, getValue()).toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initPickerView$1(NumberPickerView numberPickerView, int i, int i2) {
        clb.a(getContext());
    }

    private void updateValue(int i) {
        if (this.f13083a == null) {
            return;
        }
        int[] pickerData = B().getPickerData();
        int i2 = pickerData[this.f13083a.getMaxValue()];
        if (i2 >= i) {
            int i3 = 0;
            for (int i4 : pickerData) {
                if (i4 == i) {
                    this.f13083a.setValue(i3);
                    break;
                }
                i3++;
            }
        } else {
            NumberPickerView numberPickerView = this.f13083a;
            numberPickerView.setValue(numberPickerView.getMaxValue());
            i = i2;
        }
        int i5 = this.f;
        if (i5 != 0) {
            this.f13083a.setContentDescription(getString(i5, Integer.valueOf(i)));
        }
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public b buildUpon() {
        return new b(B());
    }

    public PickerDialogParams B() {
        DialogParams dialogParamsRequireDialogParams = requireDialogParams();
        if (dialogParamsRequireDialogParams instanceof PickerDialogParams) {
            return (PickerDialogParams) dialogParamsRequireDialogParams;
        }
        throw new IllegalStateException("picker dialog params not set");
    }

    public String getDisplayValue(int i) {
        return null;
    }

    public int getValue() {
        if (this.f13083a == null) {
            return this.f13084b;
        }
        int currentIndex = getCurrentIndex();
        int[] pickerData = B().getPickerData();
        return currentIndex < pickerData.length ? pickerData[currentIndex] : this.f13084b;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(View view) {
        super.initCustomView(view);
        this.f13083a = (NumberPickerView) view.findViewById(gsi.Q);
    }

    public final void initPickerView(int[] iArr) {
        Objects.requireNonNull(iArr, "data can't be null,setData() first");
        int length = iArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            String displayValue = getDisplayValue(i);
            if (displayValue == null) {
                displayValue = String.valueOf(iArr[i]);
            }
            strArr[i] = displayValue;
        }
        NumberPickerView numberPickerView = this.f13083a;
        if (numberPickerView != null) {
            numberPickerView.setDisplayedValues(strArr);
            this.f13083a.setMinValue(0);
            this.f13083a.setMaxValue(length - 1);
            NumberPickerView numberPickerView2 = this.f13083a;
            Utils utils = Utils.INSTANCE;
            numberPickerView2.setNormalTextColor(utils.getColor(gki.f19087r));
            this.f13083a.setSelectedTextColor(utils.getColor(gki.p));
            this.f13083a.setHintTextColor(utils.getColor(gki.p));
            if (this.d != 0) {
                this.f13083a.setHintText(requireContext().getResources().getQuantityText(this.d, this.f13084b).toString());
            } else if (!TextUtils.isEmpty(this.e)) {
                this.f13083a.setHintText(this.e);
            }
            this.f13083a.setOnValueChangedListener(new NumberPickerView.d() { // from class: zvh
                @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.d
                public final void onValueChange(NumberPickerView numberPickerView3, int i2, int i3) {
                    this.f41715a.lambda$initPickerView$0(numberPickerView3, i2, i3);
                }
            });
            this.f13083a.setOnValueChangeListenerInScrolling(new NumberPickerView.e() { // from class: bwh
                @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.e
                public final void a(NumberPickerView numberPickerView3, int i2, int i3) {
                    this.f4672a.lambda$initPickerView$1(numberPickerView3, i2, i3);
                }
            });
        }
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        int[] pickerData = B().getPickerData();
        if (bundle != null) {
            this.f13084b = pickerData[bundle.getInt("sel_idx", -1)];
        }
        initPickerView(pickerData);
        int i = this.f13084b;
        if (i != -1) {
            updateValue(i);
            this.f13084b = -1;
        }
        this.c = true;
        return dialogOnCreateDialog;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.c = false;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void onDialogDismiss(int i) {
        super.onDialogDismiss(i);
        if (i == -1) {
            Bundle bundle = new Bundle();
            bundle.putInt(com.xiaomi.fitness.baseui.dialog.PickerDialog.KEY_SELECTED_VALUE, getValue());
            setResultData(-1, bundle);
        }
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("sel_idx", getCurrentIndex());
    }

    public void setPickerHintText(String str) {
        this.e = str;
    }

    public void setValue(int i) {
        UIUtils.checkInMainThread();
        if (!this.c || this.f13083a == null) {
            this.f13084b = i;
        } else {
            updateValue(i);
        }
    }
}
