package mu0;

import android.view.View;
import android.widget.EditText;
import androidx.core.view.g0;
import com.garmin.feature.garminpay.providers.felica.ui.FelicaTopUpActivity;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121097a;

    public /* synthetic */ c(int i14) {
        this.f121097a = i14;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view2, boolean z14) {
        switch (this.f121097a) {
            case 0:
                com.garmin.android.apps.connectmobile.liveeventsharing.ui.a.C0679a c0679a = com.garmin.android.apps.connectmobile.liveeventsharing.ui.a.f38531q;
                ht.a.f85464a.getClass();
                ht.a.a(null, "EstCompletionTimeTextInput");
                break;
            default:
                FelicaTopUpActivity.a aVar = FelicaTopUpActivity.f50969p;
                view2.getClass();
                EditText editText = (EditText) view2;
                if (z14) {
                    editText.post(new g0(view2, 5));
                }
                break;
        }
    }
}
