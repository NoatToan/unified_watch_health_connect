package com.xiaomi.fitness.baseui.dialog;

import android.app.Dialog;
import android.content.Context;
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
import defpackage.n1j;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class PickerStringDialog extends CommonDialog<DialogParams> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NumberPickerView f11663a;
    public boolean c;
    public String e;
    public int f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11664b = "";
    public int d = 0;
    public int g = 0;

    public static class PickerDialogParams extends DialogParams {
        public static final Parcelable.Creator<PickerDialogParams> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String[] f11665a;

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

        public String[] a() {
            String[] strArr = this.f11665a;
            Objects.requireNonNull(strArr);
            return strArr;
        }

        public void c(String[] strArr) {
            Objects.requireNonNull(strArr);
            this.f11665a = strArr;
        }

        @Override // com.xiaomi.fitness.baseui.dialog.DialogParams, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f11665a.length);
            parcel.writeStringArray(this.f11665a);
        }

        public PickerDialogParams(Parcel parcel) {
            super(parcel);
            String[] strArr = new String[parcel.readInt()];
            this.f11665a = strArr;
            parcel.readStringArray(strArr);
        }
    }

    public interface a {
        int getCount();

        String getValue(int i);
    }

    public static class b extends com.xiaomi.fitness.baseui.dialog.a<b, PickerDialogParams, PickerStringDialog> {
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
        public PickerStringDialog internalCreate() {
            return new PickerStringDialog();
        }

        public b c(a aVar) {
            Objects.requireNonNull(aVar, "adapter can not be null");
            int count = aVar.getCount();
            String[] strArr = new String[count];
            for (int i = 0; i < count; i++) {
                strArr[i] = String.valueOf(aVar.getValue(i));
            }
            requireDialogParams().c(strArr);
            return this;
        }

        public b(PickerDialogParams pickerDialogParams) {
            super(pickerDialogParams);
            setCustomLayoutId(mvi.p);
        }
    }

    private int getCurrentIndex() {
        NumberPickerView numberPickerView = this.f11663a;
        if (numberPickerView != null) {
            return numberPickerView.getPickedIndexRelativeToRaw();
        }
        return 0;
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

    public String C() {
        if (this.f11663a == null) {
            return this.f11664b;
        }
        int currentIndex = getCurrentIndex();
        String[] strArrA = B().a();
        return currentIndex < strArrA.length ? strArrA[currentIndex] : this.f11664b;
    }

    public final void D(String[] strArr) {
        Objects.requireNonNull(strArr, "data can't be null,setData() first");
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String displayValue = getDisplayValue(i);
            if (displayValue == null) {
                displayValue = String.valueOf(strArr[i]);
            }
            strArr2[i] = displayValue;
        }
        NumberPickerView numberPickerView = this.f11663a;
        if (numberPickerView != null) {
            numberPickerView.setDisplayedValues(strArr2);
            this.f11663a.setMinValue(0);
            this.f11663a.setMaxValue(length - 1);
            NumberPickerView numberPickerView2 = this.f11663a;
            Utils utils = Utils.INSTANCE;
            numberPickerView2.setNormalTextColor(utils.getColor(gki.f19087r));
            this.f11663a.setSelectedTextColor(utils.getColor(gki.d));
            this.f11663a.setHintTextColor(utils.getColor(gki.d));
            if (this.d != 0) {
                this.f11663a.setHintText(this.f11664b);
            } else if (!TextUtils.isEmpty(this.e)) {
                this.f11663a.setHintText(this.e);
            }
            this.f11663a.setOnValueChangedListener(new NumberPickerView.d() { // from class: fwh
                @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.d
                public final void onValueChange(NumberPickerView numberPickerView3, int i2, int i3) {
                    this.f18317a.lambda$initPickerView$0(numberPickerView3, i2, i3);
                }
            });
            this.f11663a.setOnValueChangeListenerInScrolling(new NumberPickerView.e() { // from class: gwh
                @Override // com.xiaomi.fitness.baseui.widget.NumberPickerView.e
                public final void a(NumberPickerView numberPickerView3, int i2, int i3) {
                    this.f19399a.lambda$initPickerView$1(numberPickerView3, i2, i3);
                }
            });
        }
    }

    public void E(int i) {
        this.g = i;
    }

    public void F(String str) {
        UIUtils.checkInMainThread();
        if (!this.c || this.f11663a == null) {
            this.f11664b = str;
        } else {
            G(str);
        }
    }

    public final void G(String str) {
        if (this.f11663a == null) {
            return;
        }
        String str2 = B().a()[this.f11663a.getMaxValue()];
        this.f11663a.setValue(this.g);
        int i = this.f;
        if (i != 0) {
            this.f11663a.setContentDescription(getString(i, str));
        }
    }

    public String getDisplayValue(int i) {
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(View view) {
        super.initCustomView(view);
        this.f11663a = (NumberPickerView) view.findViewById(gsi.Q);
    }

    public final /* synthetic */ void lambda$initPickerView$0(NumberPickerView numberPickerView, int i, int i2) {
        Context context = getContext();
        if (context != null) {
            numberPickerView.setContentDescription(context.getString(n1j.E, String.valueOf(C())));
            if (this.d != 0) {
                numberPickerView.setHintText(C());
            }
        }
    }

    public final /* synthetic */ void lambda$initPickerView$1(NumberPickerView numberPickerView, int i, int i2) {
        clb.a(getContext());
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        String[] strArrA = B().a();
        if (bundle != null) {
            this.f11664b = strArrA[bundle.getInt("sel_idx", -1)];
        }
        D(strArrA);
        String str = this.f11664b;
        if (str != "") {
            G(str);
            this.f11664b = "";
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
            bundle.putInt(PickerDialog.KEY_SELECTED_VALUE, getCurrentIndex());
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
}
