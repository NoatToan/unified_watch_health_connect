package wh1;

import android.widget.ImageView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.settings.devices.activityoptions.ActivityOptionsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.activityoptions.b;
import d53.u;
import d53.w;
import java.util.ArrayList;
import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00050\bj\b\u0012\u0004\u0012\u00020\u0005`\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lwh1/a;", "Lcom/garmin/android/apps/connectmobile/settings/devices/activityoptions/a;", "Lcom/garmin/android/apps/connectmobile/settings/devices/activityoptions/ActivityOptionsActivity;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "activityList", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "activityOptionComparator", "<init>", "(Lcom/garmin/android/apps/connectmobile/settings/devices/activityoptions/ActivityOptionsActivity;Ljava/util/ArrayList;Ljava/util/Comparator;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends com.garmin.android.apps.connectmobile.settings.devices.activityoptions.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f185257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f185258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f185259h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f185260i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ActivityOptionsActivity activityOptionsActivity, ArrayList<String> arrayList, Comparator<String> comparator) {
        super(activityOptionsActivity, arrayList, comparator);
        activityOptionsActivity.getClass();
        arrayList.getClass();
        comparator.getClass();
        b.a aVar = b.f42547d;
        aVar.getClass();
        String string = activityOptionsActivity.getString(b.f42551h);
        string.getClass();
        this.f185257f = string;
        aVar.getClass();
        String string2 = activityOptionsActivity.getString(b.f42552i);
        string2.getClass();
        this.f185258g = string2;
        this.f185259h = !arrayList.contains(string);
        this.f185260i = !arrayList.contains(string2);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.activityoptions.a
    public final void r(String str) {
        super.r(str);
        if (u.q(this.f185257f, w.i0(str).toString(), true)) {
            this.f185259h = false;
        }
        if (u.q(this.f185258g, w.i0(str).toString(), true)) {
            this.f185260i = false;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.activityoptions.a
    public final void t(String str) {
        this.f42541b.remove(str);
        notifyDataSetChanged();
        if (u.q(this.f185257f, w.i0(str).toString(), true)) {
            this.f185259h = true;
        }
        if (u.q(this.f185258g, w.i0(str).toString(), true)) {
            this.f185260i = true;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.activityoptions.a
    public final void u(com.garmin.android.apps.connectmobile.settings.devices.activityoptions.a.C0796a c0796a, String str) {
        c0796a.getClass();
        ImageView imageView = c0796a.f42546b;
        if (!(str.equals(this.f185257f) && this.f185260i) && (!(str.equals(this.f185258g) && this.f185259h) && this.f42544e)) {
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        } else if (imageView != null) {
            imageView.setVisibility(8);
        }
    }
}
