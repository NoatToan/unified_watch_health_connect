package j10;

import android.widget.Toast;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connections.groups.details.GroupSettingsActivity;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupSettingsActivity f96379b;

    public /* synthetic */ i(GroupSettingsActivity groupSettingsActivity, int i14) {
        this.f96378a = i14;
        this.f96379b = groupSettingsActivity;
    }

    @Override // androidx.lifecycle.z0
    public final void onChanged(Object obj) {
        int i14 = this.f96378a;
        GroupSettingsActivity groupSettingsActivity = this.f96379b;
        g3 g3Var = (g3) obj;
        switch (i14) {
            case 0:
                int i15 = GroupSettingsActivity.f31420z;
                int i16 = GroupSettingsActivity.b.f31447c[g3Var.f35300a.ordinal()];
                if (i16 == 1) {
                    List<com.garmin.android.apps.connectmobile.group.service.model.a> list = (List) g3Var.f35301b;
                    if (list != null) {
                        groupSettingsActivity.ia(list);
                    }
                    groupSettingsActivity.ka();
                    break;
                } else if (i16 == 2) {
                    groupSettingsActivity.hideProgressOverlay();
                    Toast.makeText(groupSettingsActivity, R.string.txt_error_occurred, 0).show();
                    break;
                }
                break;
            case 1:
                int i17 = GroupSettingsActivity.f31420z;
                int i18 = GroupSettingsActivity.b.f31447c[g3Var.f35300a.ordinal()];
                if (i18 == 1) {
                    Object[] objArr = {new com.garmin.android.apps.connectmobile.group.service.model.a("Profile", null), new com.garmin.android.apps.connectmobile.group.service.model.a("Friends", null), new com.garmin.android.apps.connectmobile.group.service.model.a("Thumbnail", null)};
                    ArrayList arrayList = new ArrayList(3);
                    for (int i19 = 0; i19 < 3; i19++) {
                        Object obj2 = objArr[i19];
                        Objects.requireNonNull(obj2);
                        arrayList.add(obj2);
                    }
                    groupSettingsActivity.ia(Collections.unmodifiableList(arrayList));
                    groupSettingsActivity.ka();
                    break;
                } else if (i18 == 2) {
                    groupSettingsActivity.hideProgressOverlay();
                    Toast.makeText(groupSettingsActivity, R.string.txt_error_occurred, 0).show();
                    break;
                }
                break;
            default:
                int i24 = GroupSettingsActivity.f31420z;
                int i25 = GroupSettingsActivity.b.f31447c[g3Var.f35300a.ordinal()];
                if (i25 == 1) {
                    groupSettingsActivity.hideProgressOverlay();
                    groupSettingsActivity.f31440v = (GroupDTO) groupSettingsActivity.f31439t.clone();
                    groupSettingsActivity.f31427g = null;
                    groupSettingsActivity.f31426f = null;
                    groupSettingsActivity.setResult(-1);
                    groupSettingsActivity.finish();
                    break;
                } else if (i25 == 2) {
                    i2.f(a2.CONNECTIONS, "GroupSettingsActivity", "Couldn't save group settings: " + g3Var.f35303d);
                    groupSettingsActivity.hideProgressOverlay();
                    Toast.makeText(groupSettingsActivity, R.string.txt_error_occurred, 0).show();
                    break;
                }
                break;
        }
    }
}
