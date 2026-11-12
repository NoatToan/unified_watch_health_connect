package defpackage;

import android.os.Parcel;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;

/* JADX INFO: loaded from: classes7.dex */
public class ede {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private edi f32776c = new edi();

    private int e(boolean z) {
        return z ? 1 : 0;
    }

    private void j(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureHmsNotifyUpdate(parcel.readByte() == 1);
    }

    private void e(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureHmsAutoUpdateWifi(parcel.readByte() == 1);
    }

    private void c(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureHmsAutoUpdate(parcel.readByte() == 1);
    }

    private void g(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureIsSupportNotifyDeviceNewVersion(parcel.readByte() == 1);
    }

    private void i(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureIsSupportDeviceRequestCheck(parcel.readByte() == 1);
    }

    private void s(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportHiWear(parcel.readByte() == 1);
    }

    private void ab(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportWearEngine(parcel.readByte() == 1);
    }

    private void m(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportWearEngine(parcel.readByte() == 1);
    }

    private void z(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportWorkoutTrustHeartRate(parcel.readByte() == 1);
    }

    private void n(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportCoreSleepNewFile(parcel.readByte() == 1);
    }

    private void q(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportRriNewFile(parcel.readByte() == 1);
    }

    private void ba(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureIsSupportUploadGpsAndPdrFile(parcel.readByte() == 1);
    }

    private void p(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportRestHeartRateControls(parcel.readByte() == 1);
    }

    private void ah(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.setSupportDeviceFutureWeatherCapability(parcel.readByte() == 1);
    }

    private void o(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureCycleBloodOxygenSwitch(parcel.readByte() == 1);
    }

    private void l(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureBloodOxygenDownRemind(parcel.readByte() == 1);
    }

    private void w(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureRunPaceSetCapability(parcel.readByte() == 1);
    }

    private void bb(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.setSupportTide(parcel.readByte() == 1);
    }

    private void f(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportAppId(parcel.readByte() == 1);
    }

    private void ac(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportWalletOpenCard(parcel.readByte() == 1);
    }

    private void av(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.setSupportSendSwitchStatus(parcel.readByte() == 1);
    }

    private void bc(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportZoneId(parcel.readByte() == 1);
    }

    private void ao(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.setSupportMarketParams(parcel.readByte() == 1);
    }

    private void an(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportHttps(parcel.readByte() == 1);
    }

    private void ai(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportChangePhonePair(parcel.readByte() == 1);
    }

    private void af(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportAccountSwitch(parcel.readByte() == 1);
    }

    private void u(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSyncContacts(parcel.readByte() == 1);
    }

    private void y(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSyncHiCall(parcel.readByte() == 1);
    }

    private void au(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.setSupportSyncAccount(parcel.readByte() == 1);
    }

    private void ax(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportSettingRelated(parcel.readByte() == 1);
    }

    private void al(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportLegalPrivacy(parcel.readByte() == 1);
    }

    private void aq(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportLegalUserAgreement(parcel.readByte() == 1);
    }

    private void am(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportOpenSourceOpen(parcel.readByte() == 1);
    }

    private void ak(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportLegalServiceStatement(parcel.readByte() == 1);
    }

    private void as(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportLegalSourceStatement(parcel.readByte() == 1);
    }

    private void ar(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportLegalSystemWebView(parcel.readByte() == 1);
    }

    private void aj(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportHarmonyAgreement(parcel.readByte() == 1);
    }

    private void t(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportNewEsim(parcel.readByte() == 1);
    }

    private void at(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.setSupportSelfUploadDeviceLog(parcel.readByte() == 1);
    }

    private void az(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportUserSetting(parcel.readByte() == 1);
    }

    private void ad(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportWatchFaceAppId(parcel.readByte() == 1);
    }

    private void aw(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.setSupportSmartWatchVersionStatus(parcel.readByte() == 1);
    }

    private void ay(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.setSupportWeatherErrorCode(parcel.readByte() == 1);
    }

    private void h(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSmartWatchVersionTypeValue(parcel.readInt());
    }

    private void ag(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureHideWalletEntrance(parcel.readByte() == 1);
    }

    private void aa(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportEcgAuth(parcel.readByte() == 1);
    }

    private void ae(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.setSupportActivityRecognitionStatus(parcel.readByte() == 1);
    }

    private void ap(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportMediumToHighStrengthPreValue(parcel.readByte() == 1);
    }

    private void x(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportSyncTime(parcel.readByte() == 1);
    }

    private void k(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportConnectStatus(parcel.readByte() == 1);
    }

    private void r(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportExpandCapability(parcel.readByte() == 1);
    }

    private void v(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportSyncWifi(parcel.readByte() == 1);
    }

    private void d(Parcel parcel, DeviceCapability deviceCapability) {
        ah(parcel, deviceCapability);
        bb(parcel, deviceCapability);
        f(parcel, deviceCapability);
        ac(parcel, deviceCapability);
        av(parcel, deviceCapability);
        bc(parcel, deviceCapability);
        ao(parcel, deviceCapability);
        an(parcel, deviceCapability);
        s(parcel, deviceCapability);
        y(parcel, deviceCapability);
        u(parcel, deviceCapability);
        au(parcel, deviceCapability);
        ax(parcel, deviceCapability);
        al(parcel, deviceCapability);
        aq(parcel, deviceCapability);
        am(parcel, deviceCapability);
        ak(parcel, deviceCapability);
        as(parcel, deviceCapability);
        t(parcel, deviceCapability);
        at(parcel, deviceCapability);
        ai(parcel, deviceCapability);
        af(parcel, deviceCapability);
        az(parcel, deviceCapability);
        ad(parcel, deviceCapability);
        aw(parcel, deviceCapability);
        h(parcel, deviceCapability);
        ag(parcel, deviceCapability);
        aa(parcel, deviceCapability);
        z(parcel, deviceCapability);
        ae(parcel, deviceCapability);
        p(parcel, deviceCapability);
        g(parcel, deviceCapability);
        i(parcel, deviceCapability);
        o(parcel, deviceCapability);
        l(parcel, deviceCapability);
        ay(parcel, deviceCapability);
        w(parcel, deviceCapability);
        ap(parcel, deviceCapability);
        n(parcel, deviceCapability);
        x(parcel, deviceCapability);
        c(parcel, deviceCapability);
        e(parcel, deviceCapability);
        j(parcel, deviceCapability);
        q(parcel, deviceCapability);
        ba(parcel, deviceCapability);
        k(parcel, deviceCapability);
        ab(parcel, deviceCapability);
        b(parcel, deviceCapability);
    }

    private void b(Parcel parcel, DeviceCapability deviceCapability) {
        r(parcel, deviceCapability);
        v(parcel, deviceCapability);
        m(parcel, deviceCapability);
        ar(parcel, deviceCapability);
        aj(parcel, deviceCapability);
    }

    public DeviceCapability a(Parcel parcel) {
        DeviceCapability deviceCapability = new DeviceCapability();
        if (parcel == null) {
            return deviceCapability;
        }
        this.f32776c.a(parcel, deviceCapability);
        this.f32776c.c(parcel, deviceCapability);
        this.f32776c.b(parcel, deviceCapability);
        d(parcel, deviceCapability);
        return deviceCapability;
    }

    public void a(Parcel parcel, DeviceCapability deviceCapability) {
        if (parcel == null || deviceCapability == null) {
            return;
        }
        this.f32776c.e(parcel, deviceCapability);
        this.f32776c.d(parcel, deviceCapability);
        this.f32776c.j(parcel, deviceCapability);
        bg(parcel, deviceCapability);
    }

    private void bg(Parcel parcel, DeviceCapability deviceCapability) {
        parcel.writeByte((byte) e(deviceCapability.isSupportSosTransmission()));
        parcel.writeByte((byte) e(deviceCapability.isSupportSendSosSms()));
        parcel.writeByte((byte) e(deviceCapability.isSupportDeviceFutureWeatherCapability()));
        parcel.writeByte((byte) e(deviceCapability.isSupportTide()));
        parcel.writeByte((byte) e(deviceCapability.isSupportAppId()));
        parcel.writeByte((byte) e(deviceCapability.isSupportWalletOpenCard()));
        parcel.writeByte((byte) e(deviceCapability.isSupportSendSwitchStatus()));
        parcel.writeByte((byte) e(deviceCapability.isSupportZoneId()));
        parcel.writeByte((byte) e(deviceCapability.isSupportMarketParams()));
        parcel.writeByte((byte) e(deviceCapability.isSupportHttps()));
        parcel.writeByte((byte) e(deviceCapability.isSupportHiWear()));
        parcel.writeByte((byte) e(deviceCapability.isSupportSyncHiCall()));
        parcel.writeByte((byte) e(deviceCapability.isSupportSyncContacts()));
        parcel.writeByte((byte) e(deviceCapability.isSupportSyncAccount()));
        parcel.writeByte((byte) e(deviceCapability.isSupportSettingRelated()));
        parcel.writeByte((byte) e(deviceCapability.isSupportLegalPrivacy()));
        parcel.writeByte((byte) e(deviceCapability.isSupportLegalUserAgreement()));
        parcel.writeByte((byte) e(deviceCapability.isSupportLegalOpenSource()));
        parcel.writeByte((byte) e(deviceCapability.isSupportLegalServiceStatement()));
        parcel.writeByte((byte) e(deviceCapability.isSupportLegalSourceStatement()));
        parcel.writeByte((byte) e(deviceCapability.isSupportNewEsim()));
        parcel.writeByte((byte) e(deviceCapability.isSupportSelfUploadDeviceLog()));
        parcel.writeByte((byte) e(deviceCapability.isSupportChangePhonePair()));
        parcel.writeByte((byte) e(deviceCapability.isSupportAccountSwitch()));
        parcel.writeByte((byte) e(deviceCapability.isSupportUserSetting()));
        parcel.writeByte((byte) e(deviceCapability.isSupportWatchFaceAppId()));
        parcel.writeByte((byte) e(deviceCapability.isSupportSmartWatchVersionStatus()));
        parcel.writeInt(deviceCapability.getSmartWatchVersionTypeValue());
        parcel.writeByte((byte) e(deviceCapability.isHideWalletEntrance()));
        parcel.writeByte((byte) e(deviceCapability.isSupportEcgAuth()));
        parcel.writeByte((byte) e(deviceCapability.isSupportWorkoutTrustHeartRate()));
        parcel.writeByte((byte) e(deviceCapability.isSupportActivityRecognitionStatus()));
        parcel.writeByte((byte) e(deviceCapability.isSupportRestHeartRateControls()));
        parcel.writeByte((byte) e(deviceCapability.getIsSupportNotifyDeviceNewVersion()));
        parcel.writeByte((byte) e(deviceCapability.getIsSupportDeviceRequestCheck()));
        parcel.writeByte((byte) e(deviceCapability.isSupportCycleBloodOxygenSwitch()));
        parcel.writeByte((byte) e(deviceCapability.isSupportBloodOxygenDownRemind()));
        parcel.writeByte((byte) e(deviceCapability.isSupportWeatherErrorCode()));
        parcel.writeByte((byte) e(deviceCapability.isSupportRunPaceSetCapability()));
        parcel.writeByte((byte) e(deviceCapability.isSupportMediumToHighStrengthPreValue()));
        parcel.writeByte((byte) e(deviceCapability.isSupportCoreSleepNewFile()));
        parcel.writeByte((byte) e(deviceCapability.isSupportSyncTime()));
        parcel.writeByte((byte) e(deviceCapability.isHmsAutoUpdate()));
        parcel.writeByte((byte) e(deviceCapability.isHmsAutoUpdateWifi()));
        parcel.writeByte((byte) e(deviceCapability.isHmsNotifyUpdate()));
        bf(parcel, deviceCapability);
    }

    private void bf(Parcel parcel, DeviceCapability deviceCapability) {
        parcel.writeByte((byte) e(deviceCapability.isSupportRriNewFile()));
        parcel.writeByte((byte) e(deviceCapability.isSupportUploadGpsAndPdrFile()));
        parcel.writeByte((byte) e(deviceCapability.isSupportConnectStatus()));
        parcel.writeByte((byte) e(deviceCapability.isSupportWearEngine()));
        parcel.writeByte((byte) e(deviceCapability.isSupportExpandCapability()));
        parcel.writeByte((byte) e(deviceCapability.isSupportSyncWifi()));
        parcel.writeByte((byte) e(deviceCapability.isSupportCheckDeviceSpace()));
        parcel.writeByte((byte) e(deviceCapability.isSupportLegalSystemWebView()));
        parcel.writeByte((byte) e(deviceCapability.isSupportHarmonyAgreement()));
    }

    public void c(DeviceCapability deviceCapability) {
        this.f32776c.e(deviceCapability);
        this.f32776c.d(deviceCapability);
        this.f32776c.a(deviceCapability);
        b(deviceCapability);
    }

    private void b(DeviceCapability deviceCapability) {
        deviceCapability.configureSupportSendSosSms(false);
        deviceCapability.setSupportDeviceFutureWeatherCapability(false);
        deviceCapability.setSupportTide(false);
        deviceCapability.configureSupportAppId(false);
        deviceCapability.configureSupportWalletOpenCard(false);
        deviceCapability.setSupportSendSwitchStatus(false);
        deviceCapability.configureSupportZoneId(false);
        deviceCapability.setSupportMarketParams(false);
        deviceCapability.configureSupportHttps(false);
        deviceCapability.configureSupportHiWear(false);
        deviceCapability.configureSyncHiCall(false);
        deviceCapability.configureSyncContacts(false);
        deviceCapability.setSupportSyncAccount(false);
        deviceCapability.configureSupportSettingRelated(false);
        deviceCapability.configureSupportLegalPrivacy(false);
        deviceCapability.configureSupportLegalUserAgreement(false);
        deviceCapability.configureSupportOpenSourceOpen(false);
        deviceCapability.configureSupportLegalServiceStatement(false);
        deviceCapability.configureSupportLegalSourceStatement(false);
        deviceCapability.configureSupportNewEsim(false);
        deviceCapability.setSupportSelfUploadDeviceLog(false);
        deviceCapability.configureSupportChangePhonePair(false);
        deviceCapability.configureSupportAccountSwitch(false);
        deviceCapability.configureSupportUserSetting(false);
        deviceCapability.configureSupportWatchFaceAppId(false);
        deviceCapability.setSupportSmartWatchVersionStatus(false);
        deviceCapability.configureSmartWatchVersionTypeValue(0);
        deviceCapability.configureHideWalletEntrance(false);
        deviceCapability.configureSupportEcgAuth(false);
        deviceCapability.configureSupportWorkoutTrustHeartRate(false);
        deviceCapability.setSupportActivityRecognitionStatus(false);
        deviceCapability.configureSupportRestHeartRateControls(false);
        deviceCapability.configureIsSupportNotifyDeviceNewVersion(false);
        deviceCapability.configureIsSupportDeviceRequestCheck(false);
        deviceCapability.configureCycleBloodOxygenSwitch(false);
        deviceCapability.configureBloodOxygenDownRemind(false);
        deviceCapability.setSupportWeatherErrorCode(false);
        deviceCapability.configureRunPaceSetCapability(false);
        deviceCapability.configureSupportMediumToHighStrengthPreValue(false);
        deviceCapability.configureSupportCoreSleepNewFile(false);
        deviceCapability.configureSupportSyncTime(false);
        deviceCapability.configureHmsAutoUpdate(false);
        deviceCapability.configureHmsAutoUpdateWifi(false);
        deviceCapability.configureHmsNotifyUpdate(false);
        deviceCapability.configureSupportRriNewFile(false);
        deviceCapability.configureIsSupportUploadGpsAndPdrFile(false);
        deviceCapability.configureSupportConnectStatus(false);
        d(deviceCapability);
    }

    private void d(DeviceCapability deviceCapability) {
        deviceCapability.configureSupportWearEngine(false);
        deviceCapability.configureSupportExpandCapability(false);
        deviceCapability.configureSupportSyncWifi(false);
        deviceCapability.configureSupportCheckDeviceSpace(false);
        deviceCapability.configureSupportLegalSystemWebView(false);
        deviceCapability.configureSupportHarmonyAgreement(false);
    }
}
