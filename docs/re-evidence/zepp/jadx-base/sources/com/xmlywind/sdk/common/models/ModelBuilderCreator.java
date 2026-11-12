package com.xmlywind.sdk.common.models;

import android.location.Location;
import android.os.Build;
import android.os.Environment;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.common.a;
import com.xmlywind.sdk.common.e.f;
import com.xmlywind.sdk.common.models.sigdsp.pb.AdSlot;
import com.xmlywind.sdk.common.models.sigdsp.pb.App;
import com.xmlywind.sdk.common.models.sigdsp.pb.BidRequest;
import com.xmlywind.sdk.common.models.sigdsp.pb.Device;
import com.xmlywind.sdk.common.models.sigdsp.pb.DeviceId;
import com.xmlywind.sdk.common.models.sigdsp.pb.Geo;
import com.xmlywind.sdk.common.models.sigdsp.pb.Network;
import com.xmlywind.sdk.common.models.sigdsp.pb.Privacy;
import com.xmlywind.sdk.common.models.sigdsp.pb.Size;
import com.xmlywind.sdk.common.models.sigdsp.pb.User;
import com.xmlywind.sdk.common.models.sigdsp.pb.Version;
import com.xmlywind.sdk.common.models.ssp.pb.SdkConfigRequest;
import java.io.File;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes22.dex */
public class ModelBuilderCreator {
    private static Version.Builder a(int i, int i2, int i3) {
        Version.Builder builder = new Version.Builder();
        builder.major(Integer.valueOf(i));
        builder.micro(Integer.valueOf(i2));
        builder.minor(Integer.valueOf(i3));
        return builder;
    }

    private static Version.Builder a(String str) {
        int i;
        int i2;
        String[] strArrSplit = str.split("\\.");
        int i3 = 0;
        try {
            if (strArrSplit.length > 2) {
                int i4 = Integer.parseInt(strArrSplit[0]);
                i2 = Integer.parseInt(strArrSplit[1]);
                i = Integer.parseInt(strArrSplit[2]);
                i3 = i4;
            } else {
                if (strArrSplit.length > 1) {
                    int i5 = Integer.parseInt(strArrSplit[0]);
                    i2 = Integer.parseInt(strArrSplit[1]);
                    i3 = i5;
                } else if (strArrSplit.length > 0) {
                    i2 = 0;
                    i3 = Integer.parseInt(strArrSplit[0]);
                } else {
                    i = 0;
                    i2 = 0;
                }
                i = 0;
            }
        } catch (Throwable unused) {
        }
        return a(i3, i, i2);
    }

    public static AdSlot.Builder createAdSlot() {
        return new AdSlot.Builder();
    }

    public static App.Builder createApp() {
        App.Builder builder = new App.Builder();
        try {
            if (a.n().P() != null) {
                builder.app_package(a.n().P());
            }
            try {
                if (!TextUtils.isEmpty(a.n().ab())) {
                    builder.app_id(a.n().ab());
                }
            } catch (Throwable th) {
                SigmobLog.e(th.getMessage());
            }
            builder.orientation(a.n().Q());
            String strAo = a.n().ao();
            if (!TextUtils.isEmpty(strAo)) {
                builder.name(strAo);
            }
            builder.support_http = Build.VERSION.SDK_INT >= 23 ? Boolean.valueOf(NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) : Boolean.TRUE;
            String strR = a.n().R();
            if (!TextUtils.isEmpty(strR)) {
                Version.Builder builderA = a(strR);
                builderA.version_str(strR);
                builder.app_version(builderA.build());
            }
            builder.idfv("android");
        } catch (Throwable th2) {
            SigmobLog.e("App Builder failed", th2);
        }
        return builder;
    }

    public static BidRequest.Builder createBidRequest() {
        int i;
        BidRequest.Builder builder = new BidRequest.Builder();
        try {
            String strW = a.n().W();
            if (!TextUtils.isEmpty(strW)) {
                builder.options.put("bluetoothName", strW);
            }
            a.n();
            String strI = a.i();
            if (!TextUtils.isEmpty(strI)) {
                builder.options.put("cpu_32I", strI);
            }
            a.n();
            String strJ = a.j();
            if (!TextUtils.isEmpty(strJ)) {
                builder.options.put("CPUModel", strJ);
            }
            builder.app(createApp().build());
            builder.device(createDevice().build());
            Privacy.Builder builder2 = new Privacy.Builder();
            builder2.age(Integer.valueOf(a.n().ae()));
            a.n();
            builder2.child_protection(Integer.valueOf(a.m()));
            try {
                a.n();
                i = Integer.parseInt(a.l());
            } catch (Throwable unused) {
                i = 0;
            }
            builder2.gdpr_consent(Integer.valueOf(i));
            User.Builder builder3 = new User.Builder();
            builder3.is_minor = Boolean.valueOf(!a.n().ap());
            builder3.disable_personalized_recommendation = Boolean.valueOf(!a.n().aq());
            builder.user(builder3.build());
            builder.privacy(builder2.build());
        } catch (Throwable th) {
            SigmobLog.e(th.getMessage());
        }
        return builder;
    }

    public static Device.Builder createDevice() {
        Device.Builder builder = new Device.Builder();
        builder.device_type(Integer.valueOf(a.n().E() ? 5 : 4));
        builder.os_type(2);
        try {
            Size.Builder builder2 = new Size.Builder();
            builder2.height = Integer.valueOf(a.n().aa().heightPixels);
            builder2.width = Integer.valueOf(a.n().aa().widthPixels);
            builder.resolution(builder2.build());
            builder.battery_level(a.n().F());
            builder.battery_state(a.n().G());
            builder.battery_save_enabled(a.n().H());
            builder.dpi(Integer.valueOf(a.n().I()));
            builder.os_version(a(a.c()).build());
            builder.vendor(a.d());
            builder.is_root(Boolean.valueOf(a.o()));
            Size.Builder builderWidth = new Size.Builder().height(a.n().J()).width(a.n().K());
            if (!TextUtils.isEmpty(a.e())) {
                builder.model(a.e());
            }
            builder.screen_size(builderWidth.build());
            builder.geo(createGeo().build());
            builder.disk_size(Long.valueOf(Environment.getDataDirectory().getTotalSpace()));
            String strAg = a.n().ag();
            if (!TextUtils.isEmpty(strAg)) {
                builder.device_name(strAg);
            }
            builder.start_timestamp(a.f());
            builder.android_api_level(a.g());
            builder.mem_size(a.n().ah());
            builder.total_disk_size(Long.valueOf(Environment.getDataDirectory().getTotalSpace()));
            builder.free_disk_size(Long.valueOf(Environment.getDataDirectory().getFreeSpace()));
            String strL = a.n().L();
            if (!TextUtils.isEmpty(strL)) {
                builder.sd_total_disk_size(Long.valueOf(new File(strL).getTotalSpace()));
                builder.sd_free_disk_size(Long.valueOf(new File(strL).getFreeSpace()));
            }
            String strZ = a.n().z();
            if (!TextUtils.isEmpty(strZ)) {
                builder.boot_mark(strZ);
            }
            String strA = a.n().A();
            if (!TextUtils.isEmpty(strA)) {
                builder.update_mark(strA);
            }
        } catch (Throwable th) {
            SigmobLog.e("Device Builder failed", th);
        }
        return builder;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00db A[Catch: all -> 0x00df, TRY_LEAVE, TryCatch #2 {all -> 0x00df, blocks: (B:36:0x00ce, B:38:0x00db), top: B:49:0x00ce, outer: #1 }] */
    public static DeviceId.Builder createDeviceId() {
        String strK;
        DeviceId.Builder builder = new DeviceId.Builder();
        try {
            String strT = a.n().t();
            if (!TextUtils.isEmpty(strT)) {
                builder.android_id(strT);
                builder.udid(strT);
            }
            String strW = a.n().w();
            if (!TextUtils.isEmpty(strW)) {
                builder.gaid(strW);
            }
            String strAc = a.n().ac();
            if (!TextUtils.isEmpty(strAc)) {
                builder.uid(strAc);
            }
            String strY = a.n().y();
            if (!TextUtils.isEmpty(strY)) {
                builder.imei(strY);
            }
            String strB = a.n().B();
            if (!TextUtils.isEmpty(strB)) {
                builder.android_uuid(strB);
            }
            String strC = a.n().C();
            if (!TextUtils.isEmpty(strC)) {
                builder.imsi(strC);
            }
            String strB2 = a.n().b(0);
            if (!TextUtils.isEmpty(strB2)) {
                builder.imei1(strB2);
            }
            String strB3 = a.n().b(1);
            if (!TextUtils.isEmpty(strB3)) {
                builder.imei2(strB3);
            }
            String strD = a.n().D();
            if (!TextUtils.isEmpty(strD)) {
                builder.brand(strD);
            }
            try {
                String strY2 = a.n().Y();
                if (TextUtils.isEmpty(strY2)) {
                    a.n();
                    strK = a.k();
                    if (!TextUtils.isEmpty(strK)) {
                        builder.vaid(strK);
                    }
                } else {
                    builder.oaid(strY2);
                    try {
                        a.n();
                        strK = a.k();
                        if (!TextUtils.isEmpty(strK)) {
                            builder.vaid(strK);
                        }
                    } catch (Throwable th) {
                        SigmobLog.e("getVAID " + th.getMessage());
                    }
                }
            } catch (Throwable th2) {
                SigmobLog.e("getOAID " + th2.getMessage());
            }
        } catch (Throwable th3) {
            SigmobLog.e("DeviceId Builder failed", th3);
        }
        return builder;
    }

    public static Geo.Builder createGeo() {
        Geo.Builder builder = new Geo.Builder();
        try {
            a.n().X().getCountry();
            builder.country(a.n().X().getCountry());
            builder.language(a.n().X().getLanguage().toUpperCase());
            Location locationAn = a.n().an();
            if (locationAn != null) {
                builder.lat(Float.valueOf((float) locationAn.getLatitude()));
                builder.lon(Float.valueOf((float) locationAn.getLongitude()));
            }
            builder.timeZone(TimeZone.getDefault().getID());
        } catch (Throwable th) {
            SigmobLog.e("Geo Builder failed", th);
        }
        return builder;
    }

    public static Network.Builder createNetwork() {
        Network.Builder builder = new Network.Builder();
        try {
            builder.connection_type(Integer.valueOf(a.n().S()));
            String strT = a.n().T();
            if (!TextUtils.isEmpty(strT)) {
                builder.operator(strT);
            }
            String strC = f.c();
            if (!TextUtils.isEmpty(strC)) {
                builder.ua(strC);
            }
            builder.connection_type(Integer.valueOf(a.n().S()));
            a.n();
            String strH = a.h();
            if (!TextUtils.isEmpty(strH)) {
                builder.mac(strH);
            }
            String strU = a.n().U();
            if (!TextUtils.isEmpty(strU)) {
                builder.wifi_mac(strU);
            }
            String strV = a.n().V();
            if (!TextUtils.isEmpty(strV)) {
                builder.wifi_id(strV);
            }
        } catch (Throwable th) {
            SigmobLog.e("Network Builder failed", th);
        }
        return builder;
    }

    public static SdkConfigRequest.Builder createSdkConfigRequest() {
        SdkConfigRequest.Builder builder = new SdkConfigRequest.Builder();
        if (a.n() != null && a.n().X() != null) {
            builder.language(a.n().X().getLanguage());
            builder.country(a.n().X().getCountry());
        }
        return builder;
    }
}
