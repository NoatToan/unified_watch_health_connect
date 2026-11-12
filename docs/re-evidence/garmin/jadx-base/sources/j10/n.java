package j10;

import android.view.View;
import android.widget.EditText;
import androidx.core.view.m1;
import androidx.core.view.z;
import com.garmin.android.apps.connectmobile.connections.groups.details.GroupSettingsMultilineSelectionActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.StyledInlineTextFieldViewDark;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n implements com.garmin.android.apps.connectmobile.connections.groups.details.d.a, z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GroupSettingsMultilineSelectionActivity f96387a;

    @Override // androidx.core.view.z
    public m1 onApplyWindowInsets(View view2, m1 m1Var) {
        com.garmin.android.apps.connectmobile.connections.groups.details.d.c cVar;
        int i14 = GroupSettingsMultilineSelectionActivity.f31448j;
        boolean zU = m1Var.f6508a.u(8);
        i2.c("GroupSettingsMultilineSelectionActivity: Window Insets changed, imeVisible: " + zU);
        if (!zU && (cVar = ((com.garmin.android.apps.connectmobile.connections.groups.details.d) this.f96387a.f31452d).f31491g) != null) {
            StyledInlineTextFieldViewDark styledInlineTextFieldViewDark = cVar.f31492a;
            EditText editText = styledInlineTextFieldViewDark.editText;
            editText.clearFocus();
            v22.e.c(editText, styledInlineTextFieldViewDark);
        }
        return m1Var;
    }
}
