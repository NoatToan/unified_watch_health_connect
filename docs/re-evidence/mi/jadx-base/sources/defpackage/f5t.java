package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.ScanFilter;
import android.os.ParcelUuid;
import android.text.TextUtils;
import com.xiaomi.hm.health.bt.scan.IBleScanCallback;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public class f5t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<UUID> f17446b;
    public UUID c;
    public List<String> d;
    public String e;
    public z6 f;
    public IBleScanCallback g;
    public boolean h;

    public static class b {
        public z6 e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17447a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public UUID f17448b = null;
        public List<String> c = new ArrayList();
        public String d = null;
        public IBleScanCallback f = null;
        public boolean g = false;

        public b b(int i) {
            this.f17447a = i;
            return this;
        }

        public b c(IBleScanCallback iBleScanCallback) {
            this.f = iBleScanCallback;
            return this;
        }

        public b d(String str) {
            this.d = str;
            return this;
        }

        public b e(UUID uuid) {
            this.f17448b = uuid;
            return this;
        }

        public b f(boolean z) {
            this.g = z;
            return this;
        }

        public f5t g() {
            return new f5t(this);
        }
    }

    public IBleScanCallback a() {
        return this.g;
    }

    public void b(int i) {
        this.f17445a = i;
    }

    public z6 c() {
        return this.f;
    }

    public String d() {
        return this.e;
    }

    public List<String> e() {
        return this.d;
    }

    public UUID f() {
        return this.c;
    }

    public boolean g() {
        return this.h;
    }

    public int h() {
        return this.f17445a;
    }

    public boolean i() {
        return !TextUtils.isEmpty(this.e) && BluetoothAdapter.checkBluetoothAddress(this.e);
    }

    public boolean j() {
        List<String> list = this.d;
        return list != null && list.size() > 0;
    }

    public boolean k() {
        return this.c != null;
    }

    public List<ScanFilter> l() {
        ArrayList arrayList = new ArrayList();
        if (!i() && !j() && !k()) {
            t5t.d("BleScanOption", "no filter!");
            return arrayList;
        }
        if (!j()) {
            ScanFilter.Builder builder = new ScanFilter.Builder();
            if (i()) {
                builder.setDeviceAddress(this.e);
            }
            if (k()) {
                builder.setServiceUuid(new ParcelUuid(this.c));
            }
            arrayList.add(builder.build());
            return arrayList;
        }
        for (String str : this.d) {
            ScanFilter.Builder builder2 = new ScanFilter.Builder();
            builder2.setDeviceName(str);
            if (i()) {
                builder2.setDeviceAddress(this.e);
            }
            if (k()) {
                builder2.setServiceUuid(new ParcelUuid(this.c));
            }
            arrayList.add(builder2.build());
        }
        return arrayList;
    }

    public String toString() {
        return "timeout:" + this.f17445a + ",filterUuid: " + this.c + ",filterAddress:" + this.e + ",needConnectedDevice:" + this.h;
    }

    public f5t(b bVar) {
        this.f17445a = -1;
        this.f17446b = null;
        this.c = null;
        this.d = null;
        this.g = null;
        this.h = false;
        this.f17445a = bVar.f17447a;
        this.c = bVar.f17448b;
        this.e = bVar.d;
        this.d = bVar.c;
        this.g = bVar.f;
        this.f = bVar.e;
        this.h = bVar.g;
    }
}
