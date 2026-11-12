package ou;

import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import com.garmin.android.apps.connectmobile.audioprompts.ui.AudioPromptsSettingsActivity;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwitchCompat f133958b;

    public /* synthetic */ d(SwitchCompat switchCompat, int i14) {
        this.f133957a = i14;
        this.f133958b = switchCompat;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f133957a;
        SwitchCompat switchCompat = this.f133958b;
        switch (i14) {
            case 0:
                AudioPromptsSettingsActivity.a aVar = AudioPromptsSettingsActivity.f30263h;
                switchCompat.performClick();
                break;
            case 1:
                AudioPromptsSettingsActivity.a aVar2 = AudioPromptsSettingsActivity.f30263h;
                switchCompat.performClick();
                break;
            default:
                switchCompat.toggle();
                break;
        }
    }
}
