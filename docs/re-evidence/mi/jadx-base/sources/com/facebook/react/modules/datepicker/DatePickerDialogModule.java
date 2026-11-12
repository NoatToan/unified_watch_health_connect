package com.facebook.react.modules.datepicker;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.DatePicker;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import defpackage.ndj;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = DatePickerDialogModule.FRAGMENT_TAG)
public class DatePickerDialogModule extends ReactContextBaseJavaModule {
    static final String ACTION_DATE_SET = "dateSetAction";
    static final String ACTION_DISMISSED = "dismissedAction";
    static final String ARG_DATE = "date";
    static final String ARG_MAXDATE = "maxDate";
    static final String ARG_MINDATE = "minDate";
    static final String ARG_MODE = "mode";
    private static final String ERROR_NO_ACTIVITY = "E_NO_ACTIVITY";
    public static final String FRAGMENT_TAG = "DatePickerAndroid";

    public class a implements DatePickerDialog.OnDateSetListener, DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Promise f7398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f7399b = false;

        public a(Promise promise) {
            this.f7398a = promise;
        }

        @Override // android.app.DatePickerDialog.OnDateSetListener
        public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
            if (this.f7399b || !DatePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", DatePickerDialogModule.ACTION_DATE_SET);
            writableNativeMap.putInt("year", i);
            writableNativeMap.putInt("month", i2);
            writableNativeMap.putInt("day", i3);
            this.f7398a.resolve(writableNativeMap);
            this.f7399b = true;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (this.f7399b || !DatePickerDialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("action", DatePickerDialogModule.ACTION_DISMISSED);
            this.f7398a.resolve(writableNativeMap);
            this.f7399b = true;
        }
    }

    public DatePickerDialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private Bundle createFragmentArguments(ReadableMap readableMap) {
        Bundle bundle = new Bundle();
        if (readableMap.hasKey("date") && !readableMap.isNull("date")) {
            bundle.putLong("date", (long) readableMap.getDouble("date"));
        }
        if (readableMap.hasKey(ARG_MINDATE) && !readableMap.isNull(ARG_MINDATE)) {
            bundle.putLong(ARG_MINDATE, (long) readableMap.getDouble(ARG_MINDATE));
        }
        if (readableMap.hasKey(ARG_MAXDATE) && !readableMap.isNull(ARG_MAXDATE)) {
            bundle.putLong(ARG_MAXDATE, (long) readableMap.getDouble(ARG_MAXDATE));
        }
        if (readableMap.hasKey("mode") && !readableMap.isNull("mode")) {
            bundle.putString("mode", readableMap.getString("mode"));
        }
        return bundle;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return FRAGMENT_TAG;
    }

    @ReactMethod
    public void open(ReadableMap readableMap, Promise promise) {
        FragmentActivity fragmentActivity = (FragmentActivity) getCurrentActivity();
        if (fragmentActivity == null) {
            promise.reject(ERROR_NO_ACTIVITY, "Tried to open a DatePicker dialog while not attached to an Activity");
            return;
        }
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        DialogFragment dialogFragment = (DialogFragment) supportFragmentManager.l0(FRAGMENT_TAG);
        if (dialogFragment != null) {
            dialogFragment.dismiss();
        }
        DatePickerDialogFragment datePickerDialogFragment = new DatePickerDialogFragment();
        if (readableMap != null) {
            datePickerDialogFragment.setArguments(createFragmentArguments(readableMap));
        }
        a aVar = new a(promise);
        datePickerDialogFragment.setOnDismissListener(aVar);
        datePickerDialogFragment.setOnDateSetListener(aVar);
        datePickerDialogFragment.show(supportFragmentManager, FRAGMENT_TAG);
    }
}
