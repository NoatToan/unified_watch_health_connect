package ih1;

import android.widget.ImageView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.settings.devices.activityoptions.ActivityOptionsActivity;
import java.util.ArrayList;
import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00050\bj\b\u0012\u0004\u0012\u00020\u0005`\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lih1/a;", "Lcom/garmin/android/apps/connectmobile/settings/devices/activityoptions/a;", "Lcom/garmin/android/apps/connectmobile/settings/devices/activityoptions/ActivityOptionsActivity;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "activityList", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "activityOptionComparator", "<init>", "(Lcom/garmin/android/apps/connectmobile/settings/devices/activityoptions/ActivityOptionsActivity;Ljava/util/ArrayList;Ljava/util/Comparator;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends com.garmin.android.apps.connectmobile.settings.devices.activityoptions.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ActivityOptionsActivity activityOptionsActivity, ArrayList<String> arrayList, Comparator<String> comparator) {
        super(activityOptionsActivity, arrayList, comparator);
        activityOptionsActivity.getClass();
        arrayList.getClass();
        comparator.getClass();
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.activityoptions.a
    public final void u(com.garmin.android.apps.connectmobile.settings.devices.activityoptions.a.C0796a c0796a, String str) {
        c0796a.getClass();
        ImageView imageView = c0796a.f42546b;
        com.garmin.android.apps.connectmobile.settings.devices.activityoptions.b.f42547d.getClass();
        if (str.equals(this.f42540a.getString(com.garmin.android.apps.connectmobile.settings.devices.activityoptions.b.f42549f)) || !this.f42544e) {
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        } else if (imageView != null) {
            imageView.setVisibility(0);
        }
    }
}
