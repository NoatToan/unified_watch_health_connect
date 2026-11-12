package s00;

import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.sensors.SensorsActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p005kotlin.Metadata;
import p13.y0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ls00/h0;", "Ls00/j;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h0 extends j {
    static {
        new a(null);
    }

    @Override // n00.d
    public final void a(GarminConnectMobileApp garminConnectMobileApp, n00.c cVar, Bundle bundle) {
        String[] strArr;
        int i14;
        garminConnectMobileApp.getClass();
        cVar.getClass();
        String string = bundle.getString("sensor_message_locKey");
        if (string == null) {
            string = "";
        }
        int identifier = garminConnectMobileApp.getResources().getIdentifier(string, "string", garminConnectMobileApp.getPackageName());
        if (identifier != 0) {
            String string2 = bundle.getString("sensor_message_locArgs");
            String str = string2 != null ? string2 : "";
            int i15 = 0;
            if (str.length() > 0) {
                List listW = d53.w.W(d53.w.S(str, "[", "]"), new String[]{","});
                ArrayList arrayList = new ArrayList(p13.y.r(listW, 10));
                Iterator it = listW.iterator();
                while (it.hasNext()) {
                    arrayList.add(d53.w.S((String) it.next(), "\"", "\""));
                }
                strArr = (String[]) arrayList.toArray(new String[0]);
            } else {
                strArr = null;
            }
            String string3 = garminConnectMobileApp.getString(R.string.device_settings_vector_code_low_battery_title);
            string3.getClass();
            String string4 = (strArr == null || strArr.length == 0) ? garminConnectMobileApp.getString(identifier) : garminConnectMobileApp.getString(identifier, Arrays.copyOf(strArr, strArr.length));
            string4.getClass();
            Intent intent = new Intent(garminConnectMobileApp, (Class<?>) SensorsActivity.class);
            sz0.e eVar = sz0.e.D;
            List listI0 = strArr != null ? p13.u.i0(strArr) : null;
            String[] stringArray = garminConnectMobileApp.getResources().getStringArray(R.array.pn_sensors_messages);
            stringArray.getClass();
            if (listI0 != null) {
                Iterator it3 = new y0(listI0).iterator();
                i14 = 1;
                while (true) {
                    ListIterator<T> listIterator = ((y0.a) it3).f134967a;
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    int length = ((String) listIterator.previous()).length() * i14;
                    i14 *= 100;
                    i15 += length;
                }
            } else {
                i14 = 1;
            }
            j.e(garminConnectMobileApp, eVar, (d(cVar) * i14 * 10) + ((p13.u.M(stringArray, garminConnectMobileApp.getString(identifier)) + 1) * i14) + i15, string3, string4, j.c(garminConnectMobileApp, intent));
        }
    }

    @Override // n00.d
    public final n00.c[] b() {
        return new n00.c[]{n00.c.SENSORS_LOW_BATTERY};
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ls00/h0$a;", "", "<init>", "()V", "", "SENSOR_MESSAGE_KEY", "Ljava/lang/String;", "SENSOR_MESSAGE_ARGS", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
