package defpackage;

import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.wearengine.sensor.AsyncReadCallback;
import com.huawei.wearengine.sensor.DataResult;
import com.huawei.wearengine.sensor.Sensor;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes46.dex */
public class ykr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f53595c;
    private Map<String, ykt> d = new ConcurrentHashMap(16);
    private String e;

    public ykr(String str, int i) {
        this.e = str;
        this.f53594b = i;
    }

    public int d() {
        return this.f53594b;
    }

    public void a(String str, Sensor sensor, AsyncReadCallback asyncReadCallback) {
        if (TextUtils.isEmpty(str)) {
            yit.b("AsyncReadGroup", "addCallback packageName is null or empty");
            return;
        }
        if (sensor == null) {
            yit.b("AsyncReadGroup", "addCallback sensor is null");
            return;
        }
        if (asyncReadCallback == null) {
            yit.b("AsyncReadGroup", "addCallback asyncReadCallback is null");
            return;
        }
        List<ykv> supportFrequencyList = sensor.getSupportFrequencyList();
        int iD = ymn.d(sensor.getExtendJson());
        ykv ykvVar = null;
        ykv ykvVar2 = null;
        for (ykv ykvVar3 : supportFrequencyList) {
            if (ykvVar3.d() == this.f53594b) {
                ykvVar2 = ykvVar3;
            }
            if (ykvVar3.d() == iD) {
                ykvVar = ykvVar3;
            }
        }
        if (ykvVar == null || ykvVar2 == null) {
            yit.b("AsyncReadGroup", "addCallback sensor frequency or deviceFrequency is null");
            return;
        }
        yit.e("AsyncReadGroup", "addCallback success");
        String strD = d(str);
        this.d.put(strD, new ykt(ykvVar2, ykvVar, asyncReadCallback, strD));
    }

    public void c(String str) {
        yit.e("AsyncReadGroup", "enter deleteCallback");
        String strD = d(str);
        ykt yktVar = this.d.get(strD);
        if (yktVar != null) {
            yktVar.b();
        }
        this.d.remove(strD);
    }

    private String d(String str) {
        return this.e + Constants.LINK + str;
    }

    public void b(int i, DataResult dataResult) {
        for (Map.Entry<String, ykt> entry : this.d.entrySet()) {
            if (entry.getValue() != null) {
                yit.e("AsyncReadGroup", "AsyncReadGroup handlerData");
                entry.getValue().e(i, dataResult);
            }
        }
    }

    public void c(ykv ykvVar) {
        if (ykvVar == null) {
            yit.b("AsyncReadGroup", " updateCurrentFrequency deviceFqu is null");
            return;
        }
        for (Map.Entry<String, ykt> entry : this.d.entrySet()) {
            if (entry.getValue() != null) {
                yit.e("AsyncReadGroup", " updateCurrentFrequency");
                entry.getValue().b();
                entry.getValue().a(ykvVar);
            }
        }
        this.f53594b = ykvVar.d();
    }

    public int e() {
        return this.d.size();
    }

    public boolean e(ykv ykvVar) {
        yit.e("AsyncReadGroup", "enter isNeedDownFrequency");
        if (ykvVar == null) {
            yit.b("AsyncReadGroup", " isNeedDownFrequency deviceFqu is null");
            return false;
        }
        for (Map.Entry<String, ykt> entry : this.d.entrySet()) {
            if (entry.getValue() != null && entry.getValue().d() != null && entry.getValue().d().d() < ykvVar.d()) {
                yit.e("AsyncReadGroup", "not need down frequency");
                return false;
            }
        }
        return true;
    }

    public boolean b() {
        return this.f53595c;
    }

    public void d(boolean z) {
        this.f53595c = z;
    }
}
