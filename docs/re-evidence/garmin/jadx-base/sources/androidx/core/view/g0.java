package androidx.core.view;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.common.BikeAlarmResetPassCodeActivity;
import com.garmin.feature.garminpay.providers.felica.ui.FelicaTopUpActivity;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f6449b;

    public /* synthetic */ g0(View view2, rv.b bVar) {
        this.f6448a = 3;
        this.f6449b = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f6448a;
        View view2 = this.f6449b;
        switch (i14) {
            case 0:
                ((InputMethodManager) view2.getContext().getSystemService("input_method")).showSoftInput(view2, 0);
                break;
            case 1:
                view2.requestLayout();
                break;
            case 2:
                ViewUtils.requestFocusAndShowKeyboard(view2, false);
                break;
            case 3:
                rv.b.a aVar = rv.b.f154590r;
                try {
                    EditText editText = (EditText) view2;
                    editText.setSelection(editText.getText().length());
                } catch (ClassCastException unused) {
                    a2 a2Var = a2.BIC;
                    i2.f36769a.getClass();
                    i2.a.f(a2Var, "WheelCircumferenceEstimationFragment", "The selected view is not of type EditText");
                    return;
                }
                break;
            case 4:
                BikeAlarmResetPassCodeActivity.a aVar2 = BikeAlarmResetPassCodeActivity.f42565o;
                EditText editText2 = (EditText) view2;
                editText2.setSelection(editText2.getText().length());
                break;
            default:
                FelicaTopUpActivity.a aVar3 = FelicaTopUpActivity.f50969p;
                EditText editText3 = (EditText) view2;
                editText3.setSelection(editText3.getText().length());
                break;
        }
    }

    public /* synthetic */ g0(View view2, int i14) {
        this.f6448a = i14;
        this.f6449b = view2;
    }
}
