package defpackage;

import com.huawei.healthcloud.plugintrack.trackanimation.gpsutil.LatLong;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class jfi {
    public HashMap<Integer, jpk> d(List<jpk> list, ArrayList<LatLong> arrayList) {
        HashMap<Integer, jpk> map = new HashMap<>();
        if (njy.e(list) || njy.e(arrayList)) {
            LogUtil.a("Track_CustomMarkerProcess", "no hiHealthMarkers or no reTrackDatas");
            return map;
        }
        int i = 1;
        for (int i2 = 1; i2 < list.size() - 1; i2++) {
            jpk jpkVar = list.get(i2);
            if (jpkVar == null) {
                ReleaseLogUtil.a("Track_CustomMarkerProcess", "hiHealthMarker is null");
            } else {
                LatLong latLong = new LatLong(jpkVar.e());
                while (i < arrayList.size() - 1) {
                    int i3 = i + 1;
                    if (e(latLong, arrayList.get(i), arrayList.get(i - 1), arrayList.get(i3))) {
                        map.put(Integer.valueOf(i), jpkVar);
                        break;
                    }
                    i = i3;
                }
            }
        }
        return map;
    }

    private boolean e(LatLong latLong, LatLong latLong2, LatLong latLong3, LatLong latLong4) {
        double dB = jfa.b(latLong2, latLong);
        return dB <= jfa.b(latLong3, latLong) && dB <= jfa.b(latLong4, latLong);
    }
}
