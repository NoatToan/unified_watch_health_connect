package defpackage;

import com.duokan.airkan.common.aidl.ParcelDeviceData;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class e7q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16358b;
    public myl c = new myl();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<Integer, zzc> f16357a = new Hashtable();

    public e7q(String str) {
        this.f16358b = str;
    }

    public String a() {
        return this.f16358b;
    }

    public boolean b() {
        return this.f16357a.isEmpty();
    }

    public void c(List<ParcelDeviceData> list) {
        for (ParcelDeviceData parcelDeviceData : this.c.c()) {
            list.add(parcelDeviceData);
        }
    }

    public void d(int i, zzc zzcVar) {
        this.f16357a.put(Integer.valueOf(i), zzcVar);
        StringBuilder sb = new StringBuilder();
        sb.append("Regist callback success, AppID: ");
        sb.append(i);
    }

    public void e(int i) {
        this.f16357a.remove(Integer.valueOf(i));
        StringBuilder sb = new StringBuilder();
        sb.append("Remove callback success, AppID: ");
        sb.append(i);
    }
}
