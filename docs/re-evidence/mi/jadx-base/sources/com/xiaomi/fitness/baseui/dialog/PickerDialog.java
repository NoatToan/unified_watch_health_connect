package com.xiaomi.fitness.baseui.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import com.xiaomi.fitness.baseui.Utils;
import com.xiaomi.fitness.baseui.widget.NumberPickerView;
import com.xiaomi.fitness.common.utils.UIUtils;
import defpackage.clb;
import defpackage.gki;
import defpackage.gsi;
import defpackage.mvi;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class PickerDialog extends CommonDialog<DialogParams> {
    public static final String KEY_SELECTED_VALUE = "sel_val";
    private static final String STATE_SELECT_IDX = "sel_idx";
    private int mFocusDescriptionRes;
    private String mHintText;
    private boolean mInitOver;
    private NumberPickerView mPickerView;
    private int mDeferredPickValue = -1;
    private int mHintTextPluralsRes = 0;

    public static class PickerDialogParams extends DialogParams {
        public static final Parcelable.Creator<PickerDialogParams> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f11662a;

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
            int[] iArr = this.f11662a;
            Objects.requireNonNull(iArr);
            return iArr;
        }

        public void setPickerData(int[] iArr) {
            Objects.requireNonNull(iArr);
            this.f11662a = iArr;
        }

        @Override // com.xiaomi.fitness.baseui.dialog.DialogParams, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f11662a.length);
            parcel.writeIntArray(this.f11662a);
        }

        public PickerDialogParams(Parcel parcel) {
            super(parcel);
            int[] iArr = new int[parcel.readInt()];
            this.f11662a = iArr;
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
            setCustomLayoutId(mvi.p);
        }
    }

    private int getCurrentIndex() {
        NumberPickerView numberPickerView = this.mPickerView;
        if (numberPickerView != null) {
            return numberPickerView.getPickedIndexRelativeToRaw();
        }
        return 0;
    }

    private void initPickerView(int[] iArr) {
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
        NumberPickerView numberPickerView = this.mPickerView;
        if (numberPickerView != null) {
            numberPickerView.setDisplayedValues(strArr);
            this.mPickerView.setMinValue(0);
            this.mPickerView.setMaxValue(length - 1);
            NumberPickerView numberPickerView2 = this.mPickerView;
            Utils utils = Utils.INSTANCE;
            numberPickerView2.setNormalTextColor(utils.getColor(gki.f19087r));
            this.mPickerView.setSelectedTextColor(utils.getColor(gki.d));
            this.mPickerView.setHintTextColor(utils.getColor(gki.d));
            if (this.mHintTextPluralsRes != 0) {
                this.mPickerView.setHintText(requireContext().getResources().getQuantityText(this.mHintTextPluralsRes, this.mDeferredPickValue).toString());
            } else if (TextUtils.isEmpty(this.mHintText)) {
                this.mPickerView.setHintText("");
            } else {
                this.mPickerView.setHintText(this.mHintText);
            }
            this.mPickerView.setOnValueChangedListener(new NumberPickerView.d() { // from class: awh
                @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.d
                public final void onValueChange(NumberPickerView numberPickerView3, int i2, int i3) {
                    this.f3515a.lambda$initPickerView$0(numberPickerView3, i2, i3);
                }
            });
            this.mPickerView.setOnValueChangeListenerInScrolling(new NumberPickerView.e() { // from class: cwh
                @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.e
                public final void a(NumberPickerView numberPickerView3, int i2, int i3) {
                    this.f14802a.lambda$initPickerView$1(numberPickerView3, i2, i3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initPickerView$0(NumberPickerView numberPickerView, int i, int i2) {
        onPickerValueChange(numberPickerView, i, i2);
        if (getContext() != null) {
            if (this.mHintTextPluralsRes != 0) {
                numberPickerView.setHintText(requireContext().getResources().getQuantityText(this.mHintTextPluralsRes, getValue()).toString());
            } else if (TextUtils.isEmpty(this.mHintText)) {
                this.mPickerView.setHintText("");
            } else {
                this.mPickerView.setHintText(this.mHintText);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initPickerView$1(NumberPickerView numberPickerView, int i, int i2) {
        clb.a(getContext());
    }

    private void updateValue(int i) {
        if (this.mPickerView == null) {
            return;
        }
        int[] pickerData = getPickerDialogParam().getPickerData();
        int i2 = pickerData[this.mPickerView.getMaxValue()];
        if (i2 >= i) {
            int i3 = 0;
            for (int i4 : pickerData) {
                if (i4 == i) {
                    this.mPickerView.setValue(i3);
                    break;
                }
                i3++;
            }
        } else {
            NumberPickerView numberPickerView = this.mPickerView;
            numberPickerView.setValue(numberPickerView.getMaxValue());
            i = i2;
        }
        int i5 = this.mFocusDescriptionRes;
        if (i5 != 0) {
            this.mPickerView.setContentDescription(getString(i5, Integer.valueOf(i)));
        }
    }

    public String getDisplayValue(int i) {
        return null;
    }

    public PickerDialogParams getPickerDialogParam() {
        DialogParams dialogParamsRequireDialogParams = requireDialogParams();
        if (dialogParamsRequireDialogParams instanceof PickerDialogParams) {
            return (PickerDialogParams) dialogParamsRequireDialogParams;
        }
        throw new IllegalStateException("picker dialog params not set");
    }

    public int getValue() {
        if (this.mPickerView == null) {
            return this.mDeferredPickValue;
        }
        int currentIndex = getCurrentIndex();
        int[] pickerData = getPickerDialogParam().getPickerData();
        return currentIndex < pickerData.length ? pickerData[currentIndex] : this.mDeferredPickValue;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(View view) {
        super.initCustomView(view);
        this.mPickerView = (NumberPickerView) view.findViewById(gsi.Q);
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        int[] pickerData = getPickerDialogParam().getPickerData();
        if (bundle != null) {
            this.mDeferredPickValue = pickerData[bundle.getInt(STATE_SELECT_IDX, -1)];
        }
        initPickerView(pickerData);
        int i = this.mDeferredPickValue;
        if (i != -1) {
            updateValue(i);
            this.mDeferredPickValue = -1;
        }
        this.mInitOver = true;
        return dialogOnCreateDialog;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.mInitOver = false;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void onDialogDismiss(int i) {
        super.onDialogDismiss(i);
        if (i == -1) {
            Bundle bundle = new Bundle();
            bundle.putInt(KEY_SELECTED_VALUE, getValue());
            setResultData(-1, bundle);
        }
    }

    public void onPickerValueChange(NumberPickerView numberPickerView, int i, int i2) {
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(STATE_SELECT_IDX, getCurrentIndex());
    }

    public void setFocusDescriptionRes(int i) {
        this.mFocusDescriptionRes = i;
    }

    public void setPickerHintText(String str) {
        this.mHintText = str;
    }

    public void setPickerHintTextPluralsRes(int i) {
        this.mHintTextPluralsRes = i;
    }

    public void setValue(int i) {
        UIUtils.checkInMainThread();
        if (!this.mInitOver || this.mPickerView == null) {
            this.mDeferredPickValue = i;
        } else {
            updateValue(i);
        }
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public b buildUpon() {
        return new b(getPickerDialogParam());
    }
}
