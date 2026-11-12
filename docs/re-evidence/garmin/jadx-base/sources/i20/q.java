package i20;

import android.view.View;
import android.widget.EditText;
import com.garmin.android.apps.connectmobile.settings.devices.index.InviteByEmailActivity;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class q implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f87182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditText f87183b;

    public /* synthetic */ q(EditText editText, int i14) {
        this.f87182a = i14;
        this.f87183b = editText;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f87182a;
        EditText editText = this.f87183b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.contacts.edit.b.a aVar = com.garmin.android.apps.connectmobile.contacts.edit.b.f32541c;
                editText.getText().clear();
                break;
            default:
                InviteByEmailActivity.a aVar2 = InviteByEmailActivity.f43034c;
                if (editText.getVisibility() != 0) {
                    editText.setVisibility(0);
                    editText.requestFocus();
                    break;
                }
                break;
        }
    }
}
