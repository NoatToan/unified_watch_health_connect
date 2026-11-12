package com.xiaomi.hm.health.lab.view.picker;

import android.app.AlertDialog;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.huami.widget.wheelview.OnWheelScrollListener;
import com.huami.widget.wheelview.WheelView;
import com.xiaomi.hm.health.lab.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
public class PickerDialogFragment extends DialogFragment {
    public static final String LAB_PICKER_LEFT_BUTTON_TITLE = "lab.picker.left.title.key";
    public static final String LAB_PICKER_LEFT_TEXT_COLOR = "lab.picker.left.text.color";
    public static final String LAB_PICKER_OPTIONS_1_CURRENT_ITEMS = "lab.picker.options.1.current.items.key";
    public static final String LAB_PICKER_OPTIONS_1_ITEMS = "lab.picker.options.1.items.key";
    public static final String LAB_PICKER_OPTIONS_2_CURRENT_ITEMS = "lab.picker.options.2.current.items.key";
    public static final String LAB_PICKER_OPTIONS_2_ITEMS = "lab.picker.options.2.items.key";
    public static final String LAB_PICKER_RIGHT_BUTTON_TITLE = "lab.picker.right.title.key";
    public static final String LAB_PICKER_TITLE = "lab.picker.title.key";
    private String a;
    private String b = "";
    private int c = 0;
    private String d = "";
    private ArrayList<String> e = new ArrayList<>();
    private ArrayList<ArrayList<String>> f = new ArrayList<>();
    private int g = 0;
    private int h = 0;
    private PickerAdapter i;
    private OnClickListener j;

    public static class Builder {
        private String a = "";
        private String b = "";
        private String c = "";
        private ArrayList<String> d = new ArrayList<>();
        private ArrayList<ArrayList<String>> e = new ArrayList<>();
        private int f = 0;
        private int g = 0;
        private int h = 0;

        public PickerDialogFragment build() {
            PickerDialogFragment pickerDialogFragment = new PickerDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString(PickerDialogFragment.LAB_PICKER_TITLE, this.a);
            bundle.putString(PickerDialogFragment.LAB_PICKER_LEFT_BUTTON_TITLE, this.b);
            bundle.putInt(PickerDialogFragment.LAB_PICKER_LEFT_TEXT_COLOR, this.h);
            bundle.putString(PickerDialogFragment.LAB_PICKER_RIGHT_BUTTON_TITLE, this.c);
            bundle.putStringArrayList(PickerDialogFragment.LAB_PICKER_OPTIONS_1_ITEMS, this.d);
            bundle.putSerializable(PickerDialogFragment.LAB_PICKER_OPTIONS_2_ITEMS, this.e);
            bundle.putInt(PickerDialogFragment.LAB_PICKER_OPTIONS_1_CURRENT_ITEMS, this.f);
            bundle.putInt(PickerDialogFragment.LAB_PICKER_OPTIONS_2_CURRENT_ITEMS, this.g);
            pickerDialogFragment.setArguments(bundle);
            return pickerDialogFragment;
        }

        public Builder setLeftButtonTitle(String str) {
            this.b = str;
            return this;
        }

        public Builder setLeftTextColor(@ColorRes int i) {
            this.h = i;
            return this;
        }

        public Builder setOptions1CurrentItem(int i) {
            this.f = i;
            return this;
        }

        public Builder setOptions1Items(ArrayList<String> arrayList) {
            this.d = arrayList;
            return this;
        }

        public Builder setOptions2CurrentItem(int i) {
            this.g = i;
            return this;
        }

        public Builder setOptions2Items(ArrayList<ArrayList<String>> arrayList) {
            this.e = arrayList;
            return this;
        }

        public Builder setRightButtonTitle(String str) {
            this.c = str;
            return this;
        }

        public Builder setTitle(String str) {
            this.a = str;
            return this;
        }
    }

    public interface OnClickListener {
        void onNegativeClick(int i, int i2);

        void onPositiveClick(int i, int i2);
    }

    public class a implements OnWheelScrollListener {
        public final /* synthetic */ WheelView a;

        public a(WheelView wheelView) {
            this.a = wheelView;
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingFinished(WheelView wheelView) {
            PickerDialogFragment pickerDialogFragment = PickerDialogFragment.this;
            pickerDialogFragment.i = new PickerAdapter(pickerDialogFragment.getContext(), (ArrayList) PickerDialogFragment.this.f.get(wheelView.getRealCurrentItem()), this.a);
            this.a.setViewAdapter(PickerDialogFragment.this.i);
            if (this.a.getRealCurrentItem() + 1 > PickerDialogFragment.this.i.getItemsCount()) {
                this.a.setCurrentItem(PickerDialogFragment.this.i.getItemsCount() - 1);
            }
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingStarted(WheelView wheelView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(WheelView wheelView, WheelView wheelView2, View view) {
        OnClickListener onClickListener = this.j;
        if (onClickListener != null) {
            onClickListener.onNegativeClick(wheelView.getRealCurrentItem(), wheelView2.getRealCurrentItem());
        }
        dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(WheelView wheelView, WheelView wheelView2, View view) {
        OnClickListener onClickListener = this.j;
        if (onClickListener != null) {
            onClickListener.onPositiveClick(wheelView.getRealCurrentItem(), wheelView2.getRealCurrentItem());
        }
        dismissAllowingStateLoss();
    }

    private void initData() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.a = arguments.getString(LAB_PICKER_TITLE, "");
            this.b = arguments.getString(LAB_PICKER_LEFT_BUTTON_TITLE, "");
            this.c = arguments.getInt(LAB_PICKER_LEFT_TEXT_COLOR, 0);
            this.d = arguments.getString(LAB_PICKER_RIGHT_BUTTON_TITLE, "");
            this.e = arguments.getStringArrayList(LAB_PICKER_OPTIONS_1_ITEMS);
            this.f = (ArrayList) arguments.getSerializable(LAB_PICKER_OPTIONS_2_ITEMS);
            this.g = arguments.getInt(LAB_PICKER_OPTIONS_1_CURRENT_ITEMS, 0);
            this.h = arguments.getInt(LAB_PICKER_OPTIONS_2_CURRENT_ITEMS, 0);
        }
    }

    private void initView(View view) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.lab_dialog_picker_title);
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) view.findViewById(R.id.lab_temperature_cancel);
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) view.findViewById(R.id.lab_temperature_ok);
        final WheelView wheelView = (WheelView) view.findViewById(R.id.lab_temperature_wheelview_1);
        final WheelView wheelView2 = (WheelView) view.findViewById(R.id.lab_temperature_wheelview_2);
        appCompatTextView2.setOnClickListener(new View.OnClickListener() { // from class: ez5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.f(wheelView, wheelView2, view2);
            }
        });
        appCompatTextView3.setOnClickListener(new View.OnClickListener() { // from class: fz5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.g(wheelView, wheelView2, view2);
            }
        });
        if (!TextUtils.isEmpty(this.a)) {
            appCompatTextView.setText(this.a);
        }
        if (!TextUtils.isEmpty(this.b)) {
            appCompatTextView2.setText(this.b);
        }
        if (this.c > 0 && getContext() != null) {
            appCompatTextView2.setTextColor(ContextCompat.getColor(getContext(), this.c));
        }
        if (!TextUtils.isEmpty(this.d)) {
            appCompatTextView3.setText(this.d);
        }
        PickerAdapter pickerAdapter = new PickerAdapter(getContext(), this.e, wheelView);
        wheelView.setVisibleItems(3);
        wheelView2.setVisibleItems(3);
        int i = R.drawable.lab_wheel_custom_2;
        wheelView.setCenterDrawable(i);
        wheelView2.setCenterDrawable(i);
        wheelView.setViewAdapter(pickerAdapter);
        if (this.f.size() > 0) {
            PickerAdapter pickerAdapter2 = new PickerAdapter(getContext(), this.f.get(this.g), wheelView2);
            this.i = pickerAdapter2;
            wheelView2.setViewAdapter(pickerAdapter2);
        }
        wheelView.setCurrentItem(this.g);
        wheelView2.setCurrentItem(this.h);
        wheelView.addScrollingListener(new a(wheelView2));
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.lab_picker_dialog_fragment, (ViewGroup) null, false);
        initData();
        initView(viewInflate);
        builder.setView(viewInflate);
        return builder.show();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        if (getDialog() == null || (window = getDialog().getWindow()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 80;
        getDialog().getWindow().setAttributes(attributes);
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.j = onClickListener;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(@NonNull FragmentManager fragmentManager, @Nullable String str) {
        try {
            super.show(fragmentManager, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
