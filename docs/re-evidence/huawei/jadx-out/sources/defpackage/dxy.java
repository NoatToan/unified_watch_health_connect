package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;

/* JADX INFO: loaded from: classes7.dex */
public class dxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DeviceInfo f32499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32501c;
    private DeviceInfo d;
    private int f;
    private String g;
    private String h;
    private boolean i;
    private String j;
    private long l;
    private int m;
    private String n;
    private int o;
    private String e = "";
    private int r = -1;
    private boolean k = true;

    public void b(String str) {
        this.j = str;
    }

    public boolean k() {
        return this.k;
    }

    public void c(boolean z) {
        this.k = z;
    }

    public int l() {
        return this.o;
    }

    public void a(int i) {
        this.o = i;
    }

    public String i() {
        return (String) dym.d(this.g);
    }

    public void a(String str) {
        this.g = str;
    }

    public int b() {
        return ((Integer) dym.d(Integer.valueOf(this.f32501c))).intValue();
    }

    public void b(int i) {
        this.f32501c = i;
    }

    public int c() {
        return ((Integer) dym.d(Integer.valueOf(this.f32500b))).intValue();
    }

    public void c(int i) {
        this.f32500b = i;
    }

    public int g() {
        return this.f;
    }

    public void e(int i) {
        this.f = ((Integer) dym.d(Integer.valueOf(i))).intValue();
    }

    public String n() {
        return (String) dym.d(this.n);
    }

    public void e(String str) {
        this.n = str;
    }

    public String d() {
        return (String) dym.d(this.e);
    }

    public void d(String str) {
        this.e = str;
    }

    public int o() {
        return ((Integer) dym.d(Integer.valueOf(this.m))).intValue();
    }

    public void d(int i) {
        this.m = i;
    }

    public String toString() {
        return "[mDeviceName = " + this.g + ",mDeviceConnectState = " + this.f32501c + "]";
    }

    public void c(DeviceInfo deviceInfo, int i, int i2) {
        if (deviceInfo == null) {
            LogUtil.j("DeviceInfoForWear", "setData deviceInfo is null");
            return;
        }
        if ("PORSCHE DESIGN".equals(deviceInfo.getDeviceName())) {
            e(String.valueOf(R.mipmap.img_porsche_design_pic1));
            d(R.mipmap.img_porsche_design_pic1);
        } else {
            e(String.valueOf(i2));
            d(i);
        }
        b(deviceInfo.getDeviceConnectState());
        c(deviceInfo.getDeviceActiveState());
        d(deviceInfo.getDeviceIdentify());
        b(deviceInfo.getHiLinkDeviceId());
        a(deviceInfo.getPowerSaveModel());
        g(deviceInfo.getAutoDetectSwitchStatus());
    }

    public int m() {
        return ((Integer) dym.d(Integer.valueOf(this.r))).intValue();
    }

    public void g(int i) {
        this.r = i;
    }

    public long j() {
        return this.l;
    }

    public void a(long j) {
        this.l = j;
    }

    public boolean h() {
        return this.i;
    }

    public void d(boolean z) {
        this.i = z;
    }

    public String f() {
        return this.h;
    }

    public void c(String str) {
        this.h = str;
    }

    public void c(DeviceInfo deviceInfo) {
        this.d = deviceInfo;
    }

    public DeviceInfo e() {
        return this.d;
    }

    public DeviceInfo a() {
        return this.f32499a;
    }

    public void a(DeviceInfo deviceInfo) {
        this.f32499a = deviceInfo;
    }
}
