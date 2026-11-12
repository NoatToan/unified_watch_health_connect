package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.datatypes.MusicInfo;
import com.huawei.hwdevice.phoneprocess.binder.ParserInterface;
import com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.dmsmanager.HwDeviceMgrInterface;
import com.huawei.hwdevice.phoneprocess.mgr.musiccontrol.ControlInterface;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class nbp extends HwBaseManager implements ParserInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static HwDeviceMgrInterface f42843c;
    private static nbp d;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f42844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f42845b;

    private nbp(Context context) {
        super(context);
        this.f42845b = false;
        this.f42844a = new Handler(Looper.getMainLooper()) { // from class: nbp.5
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                super.handleMessage(message);
                int i = message.what;
                if (i == 1) {
                    LogUtil.a("MusicControlManager", "handleMessage MSG_REPORT_MUSIC_INFO 5.37.1");
                    nbp.this.g();
                    return;
                }
                if (i == 2) {
                    LogUtil.a("MusicControlManager", "handleMessage unregister callback 5.37.3 100");
                    nbp.this.l();
                    nbp.this.f42845b = false;
                } else {
                    if (i == 3) {
                        LogUtil.a("MusicControlManager", "MESSAGE_SETTING_VOLUME_DELAY.");
                        if (message.obj instanceof eew) {
                            nbp.this.c((eew) message.obj);
                            return;
                        }
                        return;
                    }
                    LogUtil.j("MusicControlManager", "Invalid music message.");
                }
            }
        };
        f42843c = mkf.e(BaseApplication.getContext());
    }

    public static nbp c() {
        nbp nbpVar;
        synchronized (e) {
            if (d == null) {
                d = new nbp(BaseApplication.getContext());
            }
            nbpVar = d;
        }
        return nbpVar;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 2037;
    }

    @Override // com.huawei.hwdevice.phoneprocess.binder.ParserInterface
    public void getResult(DeviceInfo deviceInfo, byte[] bArr) {
        if (deviceInfo == null || bArr == null || bArr.length < 2) {
            LogUtil.j("MusicControlManager", "device or dataContents is null");
            return;
        }
        String strE = eeq.e(bArr);
        if (strE == null || strE.length() < 4) {
            LogUtil.e("MusicControlManager", "data lenth less 4");
            return;
        }
        try {
            List<eew> listE = new eet().b(strE.substring(4)).e();
            boolean zIsSupportMusicControl = false;
            cpl.d("MusicControlManager", bArr, "getResult(): ");
            DeviceCapability deviceCapabilityC = c(deviceInfo);
            if (deviceCapabilityC != null) {
                LogUtil.a("MusicControlManager", "isSupportMusicControl deviceCapability is not null");
                zIsSupportMusicControl = deviceCapabilityC.isSupportMusicControl();
            }
            b(bArr, listE, zIsSupportMusicControl);
        } catch (eeu unused) {
            LogUtil.e("MusicControlManager", "TlvException");
        } catch (IndexOutOfBoundsException unused2) {
            LogUtil.e("MusicControlManager", "IndexOutOfBoundsException");
        }
    }

    private DeviceCapability c(DeviceInfo deviceInfo) {
        DeviceCapability deviceCapability = new DeviceCapability();
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(1, deviceInfo.getDeviceIdentify(), "MusicControlManager");
        return (mapQueryDeviceCapability == null || mapQueryDeviceCapability.isEmpty()) ? deviceCapability : mapQueryDeviceCapability.get(deviceInfo.getDeviceIdentify());
    }

    private void b(byte[] bArr, List<eew> list, boolean z) {
        if (!z) {
            LogUtil.a("MusicControlManager", "not SupportMusicControl");
            return;
        }
        byte b2 = bArr[1];
        if (b2 != 1) {
            if (b2 != 3) {
                LogUtil.j("MusicControlManager", "other command");
                return;
            } else {
                b(bArr, list);
                return;
            }
        }
        if (bArr.length <= 3 || bArr[2] != 1) {
            return;
        }
        this.f42844a.sendEmptyMessage(1);
    }

    private void b(byte[] bArr, List<eew> list) {
        if (bArr == null || list == null) {
            return;
        }
        for (eew eewVar : list) {
            try {
                int i = Integer.parseInt(eewVar.e(), 16);
                if (i == 1) {
                    d(bArr);
                } else if (i != 2) {
                    LogUtil.j("MusicControlManager", "Invalid control types");
                } else {
                    this.f42844a.removeMessages(3);
                    Message messageObtainMessage = this.f42844a.obtainMessage();
                    messageObtainMessage.obj = eewVar;
                    messageObtainMessage.what = 3;
                    this.f42844a.sendMessageDelayed(messageObtainMessage, 50L);
                }
            } catch (NumberFormatException unused) {
                LogUtil.e("MusicControlManager", "musicOperation NumberFormatException");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(eew eewVar) {
        int iB = CommonUtil.b(eewVar.b(), 16);
        if (iB != -1 && e()) {
            nbu.c().setVolume(iB);
            a(100000);
        } else {
            n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        LogUtil.a("MusicControlManager", "enter reportMusicInfo");
        if (!h()) {
            b(136001);
            return;
        }
        j();
        MusicInfo musicInfoB = b();
        if (musicInfoB == null || (musicInfoB.getPlayState() == 0 && musicInfoB.getMaxVolume() == 0)) {
            b(136002);
        } else {
            b(100000);
            e(musicInfoB);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MusicInfo b() {
        return nbu.c().getMusicInfo();
    }

    private void j() {
        if (!this.f42845b) {
            LogUtil.a("MusicControlManager", "enter registerMusicCallback");
            i();
            this.f42845b = true;
            return;
        }
        LogUtil.a("MusicControlManager", "have already registerMusicCallback!");
    }

    private void i() {
        nbu.c().registerMusicCallback(new ControlInterface.MusicChangeCallback() { // from class: nbp.4
            @Override // com.huawei.hwdevice.phoneprocess.mgr.musiccontrol.ControlInterface.MusicChangeCallback
            public void onMusicChanged() {
                LogUtil.a("MusicControlManager", "onMusicChanged");
                MusicInfo musicInfoB = nbp.this.b();
                if (!nbp.this.h() || musicInfoB == null) {
                    return;
                }
                nbp.this.e(musicInfoB);
            }

            @Override // com.huawei.hwdevice.phoneprocess.mgr.musiccontrol.ControlInterface.MusicChangeCallback
            public void onMusicDiedTimeOut() {
                LogUtil.a("MusicControlManager", "onMusicDiedTimeOut");
                nbp.this.f42845b = false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(MusicInfo musicInfo) {
        if ((musicInfo == null || (musicInfo.getSingerName() == null && musicInfo.getSongName() == null)) && !nbu.c().e()) {
            ReleaseLogUtil.d("R_MusicControlManager", "sendMusicInfo error");
            return;
        }
        ReleaseLogUtil.d("R_MusicControlManager", "sendMusicInfo musicInfo:", musicInfo.toString());
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(37);
        deviceCommand.setCommandID(2);
        byte[] bArrE = nbs.e(musicInfo);
        deviceCommand.setDataLen(bArrE.length);
        deviceCommand.setDataContent(bArrE);
        f42843c.sendDeviceData(deviceCommand);
        nbu.c().removeMusicUpdate();
    }

    private void b(int i) {
        LogUtil.a("MusicControlManager", "sendAppStatus errorCode:", Integer.valueOf(i));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(37);
        deviceCommand.setCommandID(1);
        byte[] bArrA = nbs.a(i);
        deviceCommand.setDataLen(bArrA.length);
        deviceCommand.setDataContent(bArrA);
        f42843c.sendDeviceData(deviceCommand);
    }

    private void n() {
        if (h()) {
            a(136002);
        } else {
            a(136001);
        }
    }

    private void a(int i) {
        LogUtil.a("MusicControlManager", "sendAppControlResponse errorCode:", Integer.valueOf(i));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(37);
        deviceCommand.setCommandID(3);
        byte[] bArrA = nbs.a(i);
        deviceCommand.setDataLen(bArrA.length);
        deviceCommand.setDataContent(bArrA);
        f42843c.sendDeviceData(deviceCommand);
    }

    private void d(byte[] bArr) {
        String strE = eeq.e(bArr);
        if (strE == null) {
            return;
        }
        try {
            int iB = CommonUtil.b(new eet().b(strE.substring(4, strE.length())).e().get(0).b(), 16);
            ReleaseLogUtil.d("R_MusicControlManager", "handleMusicControl :", Integer.valueOf(iB));
            if (iB == 100) {
                this.f42844a.sendEmptyMessage(2);
                a(100000);
                this.f42845b = false;
                return;
            }
            f();
            if (!this.f42845b && iB != 5 && iB != 6) {
                if (!h()) {
                    a(136001);
                } else if (b() != null) {
                    LogUtil.a("MusicControlManager", "The music is playing.");
                } else {
                    a(136002);
                }
                LogUtil.a("MusicControlManager", "registerMusicCall is false , can not control music!");
                return;
            }
            if (iB == 1) {
                if (!h()) {
                    b(136001);
                    return;
                }
                j();
                nbu.c().e(1);
                a(100000);
                return;
            }
            if (iB == 2) {
                if (e()) {
                    nbu.c().e(2);
                    a(100000);
                    return;
                } else {
                    n();
                    return;
                }
            }
            e(iB);
        } catch (eeu unused) {
            LogUtil.e("MusicControlManager", "handleMusicControl error");
        }
    }

    private void f() {
        if (this.f42845b || !h()) {
            return;
        }
        this.f42844a.sendEmptyMessage(1);
        try {
            TimeUnit.MILLISECONDS.sleep(700L);
        } catch (InterruptedException unused) {
            LogUtil.e("MusicControlManager", "RegisterMusicListener InterruptedException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        nbu.c().unRegisterMusicCallback();
    }

    private void e(int i) {
        boolean zE = e();
        if (i == 3) {
            if (zE) {
                a(100000);
                nbu.c().e(3);
                return;
            } else {
                n();
                return;
            }
        }
        if (i == 4) {
            if (zE) {
                a(100000);
                nbu.c().e(4);
                return;
            } else {
                n();
                return;
            }
        }
        if (i == 5) {
            if (zE) {
                a(100000);
                d();
                return;
            } else {
                n();
                return;
            }
        }
        if (i != 6) {
            LogUtil.j("MusicControlManager", "Invalid switching music instructions.");
        } else if (zE) {
            a(100000);
            a();
        } else {
            n();
        }
    }

    private void d() {
        nbu.c().controlVolume(true);
        a(100000);
    }

    private void a() {
        nbu.c().controlVolume(false);
        a(100000);
    }

    private boolean e() {
        MusicInfo musicInfoB = b();
        boolean z = musicInfoB == null || (musicInfoB.getPlayState() == 0 && musicInfoB.getMaxVolume() == 0);
        if (!h()) {
            b(136001);
            return false;
        }
        if (z) {
            LogUtil.a("MusicControlManager", "checkState musicAPP is died!");
            b(136002);
            return false;
        }
        LogUtil.a("MusicControlManager", "The music is playing.");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        String switchSettingFromDb;
        return (!mir.a() || (switchSettingFromDb = mhs.a().getSwitchSettingFromDb("music_control_status")) == null || "false".equals(switchSettingFromDb)) ? false : true;
    }
}
