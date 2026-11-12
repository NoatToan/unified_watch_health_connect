package sg1;

import am.j;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import p005kotlin.Metadata;
import p13.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsg1/g;", "", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f159217a = new g();

    private g() {
    }

    public static ArrayList a(l22.b bVar, List list, long j8, boolean z14, boolean z15) {
        Long deviceId;
        bVar.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qg1.b bVar2 = (qg1.b) it.next();
            f159217a.getClass();
            DateTime date = bVar2.getDate();
            if (date == null) {
                date = DateTime.now();
            }
            String string = date.toString(DateTimeFormat.shortDate());
            string.getClass();
            String strA = bVar.a(R.string.lbl_device_migration_last_backup, string);
            if (z14 && (deviceId = bVar2.getDeviceId()) != null && deviceId.longValue() == j8) {
                strA = bVar.a(R.string.string_space_dot_space_string_pattern, bVar.getString(R.string.lbl_device_migration_current_device), strA);
            }
            String deviceName = bVar2.getDeviceName();
            if (deviceName == null) {
                deviceName = "";
            }
            DateTime date2 = bVar2.getDate();
            if (date2 == null) {
                date2 = DateTime.now();
            }
            String string2 = date2.toString(DateTimeFormat.shortDate());
            string2.getClass();
            String strA2 = bVar.a(R.string.lbl_device_migration_remove_backup_dialog_message, bVar.a(R.string.string_short_dash_line_string_pattern, deviceName, string2));
            String imageUrl = bVar2.getImageUrl();
            String str = imageUrl == null ? "" : imageUrl;
            String deviceName2 = bVar2.getDeviceName();
            String str2 = deviceName2 == null ? "" : deviceName2;
            if (z15) {
                strA = j.m("(", strA, ")");
            }
            String str3 = strA;
            Long deviceBackupId = bVar2.getDeviceBackupId();
            long jLongValue = -1;
            long jLongValue2 = deviceBackupId != null ? deviceBackupId.longValue() : -1L;
            Long deviceId2 = bVar2.getDeviceId();
            boolean z16 = deviceId2 != null && deviceId2.longValue() == j8;
            Long deviceId3 = bVar2.getDeviceId();
            if (deviceId3 != null) {
                jLongValue = deviceId3.longValue();
            }
            arrayList.add(new c(str, str2, str3, jLongValue, jLongValue2, z16, strA2, false));
        }
        return arrayList;
    }
}
