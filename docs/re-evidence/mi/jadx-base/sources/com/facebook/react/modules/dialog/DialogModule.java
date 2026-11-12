package com.facebook.react.modules.dialog;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import defpackage.cm8;
import defpackage.e4f;
import defpackage.ndj;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = DialogModule.NAME)
public class DialogModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    static final String FRAGMENT_TAG = "com.facebook.catalyst.react.dialog.DialogModule";
    static final String KEY_CANCELABLE = "cancelable";
    static final String KEY_ITEMS = "items";
    static final String KEY_MESSAGE = "message";
    static final String KEY_TITLE = "title";
    public static final String NAME = "DialogManagerAndroid";
    private boolean mIsInForeground;
    static final String ACTION_BUTTON_CLICKED = "buttonClicked";
    static final String ACTION_DISMISSED = "dismissed";
    static final String KEY_BUTTON_POSITIVE = "buttonPositive";
    static final String KEY_BUTTON_NEGATIVE = "buttonNegative";
    static final String KEY_BUTTON_NEUTRAL = "buttonNeutral";
    static final Map<String, Object> CONSTANTS = e4f.h(ACTION_BUTTON_CLICKED, ACTION_BUTTON_CLICKED, ACTION_DISMISSED, ACTION_DISMISSED, KEY_BUTTON_POSITIVE, -1, KEY_BUTTON_NEGATIVE, -2, KEY_BUTTON_NEUTRAL, -3);

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f7408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Bundle f7409b;
        public final /* synthetic */ Callback c;

        public a(c cVar, Bundle bundle, Callback callback) {
            this.f7408a = cVar;
            this.f7409b = bundle;
            this.c = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7408a.b(this.f7409b, this.c);
        }
    }

    public class b implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Callback f7410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f7411b = false;

        public b(Callback callback) {
            this.f7410a = callback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.f7411b || !DialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                return;
            }
            this.f7410a.invoke(DialogModule.ACTION_BUTTON_CLICKED, Integer.valueOf(i));
            this.f7411b = true;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (this.f7411b || !DialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                return;
            }
            this.f7410a.invoke(DialogModule.ACTION_DISMISSED);
            this.f7411b = true;
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FragmentManager f7412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f7413b;

        public c(FragmentManager fragmentManager) {
            this.f7412a = fragmentManager;
        }

        public final void a() {
            AlertFragment alertFragment;
            if (DialogModule.this.mIsInForeground && (alertFragment = (AlertFragment) this.f7412a.l0(DialogModule.FRAGMENT_TAG)) != null && alertFragment.isResumed()) {
                alertFragment.dismiss();
            }
        }

        public void b(Bundle bundle, Callback callback) {
            UiThreadUtil.assertOnUiThread();
            a();
            AlertFragment alertFragment = new AlertFragment(callback != null ? DialogModule.this.new b(callback) : null, bundle);
            if (!DialogModule.this.mIsInForeground || this.f7412a.T0()) {
                this.f7413b = alertFragment;
                return;
            }
            if (bundle.containsKey("cancelable")) {
                alertFragment.setCancelable(bundle.getBoolean("cancelable"));
            }
            alertFragment.show(this.f7412a, DialogModule.FRAGMENT_TAG);
        }

        public void c() {
            UiThreadUtil.assertOnUiThread();
            SoftAssertions.assertCondition(DialogModule.this.mIsInForeground, "showPendingAlert() called in background");
            if (this.f7413b == null) {
                return;
            }
            a();
            ((AlertFragment) this.f7413b).show(this.f7412a, DialogModule.FRAGMENT_TAG);
            this.f7413b = null;
        }
    }

    public DialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private c getFragmentManagerHelper() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return null;
        }
        return new c(((FragmentActivity) currentActivity).getSupportFragmentManager());
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return CONSTANTS;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mIsInForeground = false;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mIsInForeground = true;
        c fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper != null) {
            fragmentManagerHelper.c();
        } else {
            cm8.y(DialogModule.class, "onHostResume called but no FragmentManager found");
        }
    }

    @ReactMethod
    public void showAlert(ReadableMap readableMap, Callback callback, Callback callback2) {
        c fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper == null) {
            callback.invoke("Tried to show an alert while not attached to an Activity");
            return;
        }
        Bundle bundle = new Bundle();
        if (readableMap.hasKey("title")) {
            bundle.putString("title", readableMap.getString("title"));
        }
        if (readableMap.hasKey("message")) {
            bundle.putString("message", readableMap.getString("message"));
        }
        if (readableMap.hasKey(KEY_BUTTON_POSITIVE)) {
            bundle.putString("button_positive", readableMap.getString(KEY_BUTTON_POSITIVE));
        }
        if (readableMap.hasKey(KEY_BUTTON_NEGATIVE)) {
            bundle.putString("button_negative", readableMap.getString(KEY_BUTTON_NEGATIVE));
        }
        if (readableMap.hasKey(KEY_BUTTON_NEUTRAL)) {
            bundle.putString("button_neutral", readableMap.getString(KEY_BUTTON_NEUTRAL));
        }
        if (readableMap.hasKey(KEY_ITEMS)) {
            ReadableArray array = readableMap.getArray(KEY_ITEMS);
            CharSequence[] charSequenceArr = new CharSequence[array.size()];
            for (int i = 0; i < array.size(); i++) {
                charSequenceArr[i] = array.getString(i);
            }
            bundle.putCharSequenceArray(KEY_ITEMS, charSequenceArr);
        }
        if (readableMap.hasKey("cancelable")) {
            bundle.putBoolean("cancelable", readableMap.getBoolean("cancelable"));
        }
        UiThreadUtil.runOnUiThread(new a(fragmentManagerHelper, bundle, callback2));
    }
}
