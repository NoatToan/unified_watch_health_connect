package defpackage;

import android.content.ContentValues;
import android.os.Parcel;
import com.huawei.hihealth.HiHealthData;
import health.compact.a.HiDateUtil;
import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class gwg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<HiHealthData> f36134a;

    public gwg(List<HiHealthData> list) {
        List<HiHealthData> listB = b(list);
        if (listB == null) {
            LogUtil.b("SleepDetailLogDecorator", "sleepDetailDataCp is null");
        } else {
            this.f36134a = new ArrayList(listB);
        }
    }

    public List<HiHealthData> b(List<HiHealthData> list) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeTypedList(list);
        parcelObtain.setDataPosition(0);
        ArrayList arrayListCreateTypedArrayList = parcelObtain.createTypedArrayList(HiHealthData.CREATOR);
        parcelObtain.recycle();
        return arrayListCreateTypedArrayList;
    }

    private List<String> c() {
        ContentValues valueHolder;
        ArrayList arrayList = new ArrayList();
        for (HiHealthData hiHealthData : this.f36134a) {
            if (hiHealthData != null && (valueHolder = hiHealthData.getValueHolder()) != null) {
                arrayList.add("{ tp=" + hiHealthData.getType() + " st=" + hiHealthData.getStartTime() + " et=" + hiHealthData.getEndTime() + " dt=" + valueHolder.getAsString("trackdata_deviceType") + " ss=" + valueHolder.getAsString("sync_status") + " mg=" + valueHolder.getAsString("merged") + " dm=" + valueHolder.getAsString("device_model") + " dp=" + valueHolder.getAsString("device_prodid") + " tz=" + valueHolder.getAsString("time_zone") + " du=" + valueHolder.getAsString("device_uniquecode") + " mt=" + valueHolder.getAsString("modified_time") + " }");
            }
        }
        return arrayList;
    }

    private HiHealthData d() {
        if (coq.d(this.f36134a)) {
            return new HiHealthData();
        }
        for (int size = this.f36134a.size() - 1; size >= 0; size--) {
            HiHealthData hiHealthData = this.f36134a.get(size);
            if (hiHealthData != null) {
                return hiHealthData;
            }
        }
        return new HiHealthData();
    }

    public String toString() {
        if (coq.d(this.f36134a)) {
            return "";
        }
        return "day=" + HiDateUtil.e(d().getStartTime(), "yyyyMMdd") + "," + c();
    }
}
