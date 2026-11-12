package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.datatype.EventAlarmInfo;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.SharedPreferenceManager;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class lvw {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f40939b;

    lvw(Context context) {
        this.f40939b = context;
    }

    public ByteBuffer a(List<EventAlarmInfo> list, boolean z) {
        ByteBuffer byteBufferA;
        ArrayList arrayList = new ArrayList(0);
        int length = 0;
        for (int i = 0; i < lvv.c(BaseApplication.getContext()).j(); i++) {
            if (i >= list.size()) {
                byteBufferA = c(i);
            } else {
                byteBufferA = a(list, i, z);
            }
            length += byteBufferA.array().length;
            arrayList.add(byteBufferA);
        }
        byte[] bArrC = eeq.c(eeq.b(length));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + bArrC.length + 1);
        byteBufferAllocate.put((byte) -127);
        byteBufferAllocate.put(bArrC);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byteBufferAllocate.put(((ByteBuffer) it.next()).array());
        }
        return byteBufferAllocate;
    }

    private ByteBuffer c(int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
        byteBufferAllocate.put((byte) -126);
        byteBufferAllocate.put((byte) 3);
        byteBufferAllocate.put((byte) 3);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) (i + 1));
        return byteBufferAllocate;
    }

    private ByteBuffer a(List<EventAlarmInfo> list, int i, boolean z) {
        DeviceInfo deviceInfoC;
        String strD = eeq.d(i + 1);
        String strD2 = eeq.d(1);
        String strD3 = eeq.d(3);
        String strE = e(list, i, z);
        String strE2 = eeq.e(eeq.f((list.get(i).getEventAlarmStartTimeHour() * 100) + list.get(i).getEventAlarmStartTimeMin()));
        String strD4 = eeq.d(2);
        String strD5 = eeq.d(5);
        String strD6 = eeq.d(list.get(i).getEventAlarmRepeat());
        String strD7 = eeq.d(1);
        String strD8 = eeq.d(6);
        String strA = eeq.a(list.get(i).getEventAlarmName());
        String strB = eeq.b(strA.length() / 2);
        String strD9 = eeq.d(7);
        String strD10 = eeq.d(list.get(i).getEventAlarmLegalHolidayEnable());
        String strD11 = eeq.d(1);
        String strD12 = eeq.d(8);
        String strB2 = eeq.b(list.get(i).getCreateTimestamp());
        String strB3 = eeq.b(strB2.length() / 2);
        String strD13 = eeq.d(9);
        String strB4 = eeq.b(list.get(i).getModifiedTimestamp());
        String strB5 = eeq.b(strB4.length() / 2);
        String strD14 = eeq.d(10);
        String str = strD3 + strD2 + strD + strE + strD5 + strD4 + strE2 + strD8 + strD7 + strD6 + strD9 + strB + strA + strD12 + strD11 + strD10;
        List<DeviceInfo> listE = mgg.e("AlarmDeviceCommandCompose");
        if (listE != null && listE.size() > 0) {
            deviceInfoC = listE.get(0);
        } else {
            deviceInfoC = mgg.c("AlarmDeviceCommandCompose");
        }
        if (deviceInfoC != null && deviceInfoC.getDeviceName() != null && !deviceInfoC.getDeviceName().toUpperCase(Locale.ROOT).contains("HUAWEI Band 3e".toUpperCase(Locale.ROOT)) && !deviceInfoC.getDeviceName().toUpperCase(Locale.ROOT).contains("honor Band 4R".toUpperCase(Locale.ROOT))) {
            str = str + strD13 + strB3 + strB2 + strD14 + strB5 + strB4;
            LogUtil.a("AlarmDeviceCommandCompose", "not Aw70 device add alarm time value.");
        }
        String strB6 = eeq.b(str.length() / 2);
        byte[] bArrC = eeq.c(eeq.d(130) + strB6 + str);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrC.length);
        byteBufferAllocate.put(bArrC);
        return byteBufferAllocate;
    }

    private String e(List<EventAlarmInfo> list, int i, boolean z) {
        EventAlarmInfo eventAlarmInfo = list.get(i);
        if (z && eventAlarmInfo.getEventAlarmRepeat() == 0 && eventAlarmInfo.getEventAlarmEnable() == 1) {
            int iC = c(eventAlarmInfo);
            LogUtil.a("AlarmDeviceCommandCompose", "AlarmEnable enable = ", Integer.valueOf(iC));
            if (iC == 0) {
                list.get(i).setEventAlarmEnable(0);
            }
        }
        LogUtil.a("AlarmDeviceCommandCompose", "AlarmEnable enable = ", Integer.valueOf(list.get(i).getEventAlarmEnable()));
        String strD = eeq.d(list.get(i).getEventAlarmEnable());
        String strD2 = eeq.d(1);
        return eeq.d(4) + strD2 + strD;
    }

    private int c(EventAlarmInfo eventAlarmInfo) {
        int eventAlarmEnable = eventAlarmInfo.getEventAlarmEnable();
        String strE = SharedPreferenceManager.e(this.f40939b, String.valueOf(10022), "ONCE_EVENT_ALARM_INFO");
        LogUtil.a("AlarmDeviceCommandCompose", " onceEventAlarmIsOver json = " + strE);
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j("AlarmDeviceCommandCompose", "onceEventAlarmIsOver json is null");
            return eventAlarmEnable;
        }
        List<EventAlarmInfo> list = (List) new Gson().fromJson(strE, new TypeToken<List<EventAlarmInfo>>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwalarmmgr.AlarmDeviceCommandCompose$1
        }.getType());
        if (list != null && list.size() != 0) {
            for (EventAlarmInfo eventAlarmInfo2 : list) {
                if (eventAlarmInfo2.getEventAlarmIndex() == eventAlarmInfo.getEventAlarmIndex()) {
                    long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                    LogUtil.a("AlarmDeviceCommandCompose", "onceEventAlarmIsOver CurTime = " + jCurrentTimeMillis);
                    if (jCurrentTimeMillis < eventAlarmInfo2.getEventAlarmTime()) {
                        break;
                    }
                    eventAlarmEnable = 0;
                    break;
                }
            }
        }
        LogUtil.a("AlarmDeviceCommandCompose", "onceEventAlarmIsOver enableResult = " + eventAlarmEnable);
        return eventAlarmEnable;
    }
}
