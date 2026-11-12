package defpackage;

import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: loaded from: classes13.dex */
public class oxe {
    public static int a(int i) {
        if (i > 0 && i <= 30) {
            return 1;
        }
        if (i < 52) {
            return 2;
        }
        if (i < 104) {
            return 3;
        }
        return i < 156 ? 4 : 5;
    }

    public static int b(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return calendar.get(11);
    }

    public static ArrayList<Integer> a() {
        ArrayList<Integer> arrayList = new ArrayList<>(24);
        for (int i = 0; i < 24; i++) {
            arrayList.add(i, 0);
        }
        return arrayList;
    }

    public static boolean d(HiTrackMetaData hiTrackMetaData) {
        if (hiTrackMetaData == null) {
            LogUtil.e("PLGACHIEVE_SportCalRule", "trackDataIsInvalid trackMetaData is null return true");
            return true;
        }
        return (hiTrackMetaData.getAbnormalTrack() != 0 || hiTrackMetaData.getDuplicated() != 0) || (hiTrackMetaData.getSportDataSource() == 2);
    }

    public static boolean e(HiTrackMetaData hiTrackMetaData) {
        if (hiTrackMetaData != null) {
            return (hiTrackMetaData.getAbnormalTrack() == 0 && hiTrackMetaData.getDuplicated() == 0) ? false : true;
        }
        LogUtil.e("PLGACHIEVE_SportCalRule", "isTtrackDataDumplicate trackMetaData is null return true");
        return true;
    }
}
