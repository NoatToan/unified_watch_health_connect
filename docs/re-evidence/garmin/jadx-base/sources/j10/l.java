package j10;

import android.text.Editable;
import android.text.TextWatcher;
import com.garmin.android.apps.connectmobile.connections.groups.details.GroupSettingsActivity;

/* JADX INFO: loaded from: classes7.dex */
public class l implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.e f96385a;

    public l(GroupSettingsActivity groupSettingsActivity, androidx.appcompat.app.e eVar) {
        this.f96385a = eVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        this.f96385a.e(-1).setEnabled(charSequence.length() >= 2);
    }
}
