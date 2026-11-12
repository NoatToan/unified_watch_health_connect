package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hihealth.HiAppInfo;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hihealth.dictionary.utils.ProductMapParseUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class nrf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("deviceInfo")
    private c f43514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("dataSourceId")
    private String f43515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("appInfo")
    private b f43516c;

    public nrf(HiHealthClient hiHealthClient) {
        if (hiHealthClient == null || hiHealthClient.getHiDeviceInfo() == null) {
            return;
        }
        d(hiHealthClient.getHiDeviceInfo().getDeviceUniqueCode());
        c(new b(hiHealthClient.getHiAppInfo()));
        c(new c(hiHealthClient.getHiDeviceInfo()));
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("hardwareVersion")
        private String f43520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("category")
        private String f43521b;

        @SerializedName("firmwareVersion")
        private String d;

        @SerializedName("mac")
        private String e;

        @SerializedName("name")
        private String f;

        @SerializedName("manufacturer")
        private String g;

        @SerializedName("model")
        private String h;

        @SerializedName("sn")
        private String i;

        @SerializedName("productId")
        private String j;

        @SerializedName("softwareVersion")
        private String k;

        @SerializedName("uniqueId")
        private String m;

        @SerializedName("udid")
        private String o;

        public c(HiDeviceInfo hiDeviceInfo) {
            if (hiDeviceInfo == null) {
                return;
            }
            l(hiDeviceInfo.getDeviceUniqueCode());
            i(hiDeviceInfo.getDeviceUdid());
            f(hiDeviceInfo.getDeviceName());
            e(a(hiDeviceInfo.getDeviceType()));
            h(hiDeviceInfo.getModel());
            c(hiDeviceInfo.getManufacturer());
            a(hiDeviceInfo.getDeviceMac());
            g(hiDeviceInfo.getDeviceSN());
            j(hiDeviceInfo.getSoftwareVersion());
            d(hiDeviceInfo.getHardwareVersion());
            b(hiDeviceInfo.getFirmwareVersion());
        }

        private String a(int i) {
            ProductMapParseUtil.a(BaseApplication.getContext());
            List<ProductMapInfo> listC = ProductMap.c("deviceId", String.valueOf(i));
            if (njy.e(listC)) {
                return "";
            }
            return listC.get(0).e();
        }

        public void l(String str) {
            this.m = str;
        }

        public void i(String str) {
            this.o = str;
        }

        public void f(String str) {
            this.f = str;
        }

        public void e(String str) {
            this.f43521b = str;
        }

        public void h(String str) {
            this.h = str;
        }

        public void c(String str) {
            this.g = str;
        }

        public void a(String str) {
            this.e = str;
        }

        public void g(String str) {
            this.i = str;
        }

        public void d(String str) {
            this.f43520a = str;
        }

        public void j(String str) {
            this.k = str;
        }

        public void b(String str) {
            this.d = str;
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("appName")
        private String f43517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("version")
        private String f43518b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("appId")
        private String f43519c;

        @SerializedName("bundleName")
        private String d;

        public b(HiAppInfo hiAppInfo) {
            if (hiAppInfo == null) {
                return;
            }
            e(hiAppInfo.getPackageName());
            c(hiAppInfo.getAppName());
            b(hiAppInfo.getAppName());
            d(hiAppInfo.getVersion());
        }

        public void e(String str) {
            this.d = str;
        }

        public void c(String str) {
            this.f43519c = str;
        }

        public void b(String str) {
            this.f43517a = str;
        }

        public void d(String str) {
            this.f43518b = str;
        }
    }

    public void d(String str) {
        this.f43515b = str;
    }

    public void c(c cVar) {
        this.f43514a = cVar;
    }

    public void c(b bVar) {
        this.f43516c = bVar;
    }
}
