package defpackage;

import android.os.Parcel;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;

/* JADX INFO: loaded from: classes7.dex */
public class edi {
    private int b(boolean z) {
        return z ? 1 : 0;
    }

    private void g(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportTimeSetting(parcel.readByte() == 1);
    }

    private void by(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportGetFirmwareVersion(parcel.readByte() == 1);
    }

    private void bz(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportGetBattery(parcel.readByte() == 1);
    }

    private void f(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureAutoLightScreen(parcel.readByte() == 1);
    }

    private void k(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureAvoidDisturb(parcel.readByte() == 1);
    }

    private void v(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureFactoryReset(parcel.readByte() == 1);
    }

    private void cw(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportPairDevice(parcel.readByte() == 1);
    }

    private void ca(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportGetHandsetInfo(parcel.readByte() == 1);
    }

    private void ct(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportNotificationIntervalInfo(parcel.readByte() == 1);
    }

    private void bj(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportActivityType(parcel.readByte() == 1);
    }

    private void bn(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportAuthenticDevice(parcel.readByte() == 1);
    }

    private void ac(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureGoldCard(parcel.readByte() == 1);
    }

    private void de(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportRemoteCamera(parcel.readByte() == 1);
    }

    private void ar(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureMessageAlert(parcel.readByte() == 1);
    }

    private void cp(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportMessageAlertInfo(parcel.readByte() == 1);
    }

    private void cm(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportMessageSupportInfo(parcel.readByte() == 1);
    }

    private void cn(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureupportMessageCenterPushDevice(parcel.readByte() == 1);
    }

    private void dl(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportWearMessagePush(parcel.readByte() == 1);
    }

    private void s(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureContacts(parcel.readByte() == 1);
    }

    private void br(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportCallingOperationType(parcel.readByte() == 1);
    }

    private void au(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureMotionGoalCap(parcel.readInt());
    }

    private void w(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureFitnessFrameType(parcel.readInt());
    }

    private void i(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureActivityReminder(parcel.readByte() == 1);
    }

    private void db(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportSetUserInfoEncrypt(parcel.readByte() == 1);
    }

    private void df(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportSampleFrame(parcel.readByte() == 1);
    }

    private void dh(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportThreshold(parcel.readByte() == 1);
    }

    private void aw(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureReserveSync(parcel.readByte() == 1);
    }

    private void ag(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureIsSupportHeartRateZone(parcel.readByte() == 1);
    }

    private void aa(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureIsSupportCoreSleep(parcel.readByte() == 1);
    }

    private void cb(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportGetUserInfo(parcel.readByte() == 1);
    }

    private void al(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureIsSupportSendCoreSleepOutState(parcel.readByte() == 1);
    }

    private void am(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureIsSupportQueryDeviceCoreSleepSwitch(parcel.readByte() == 1);
    }

    private void r(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureEventAlarm(parcel.readByte() == 1);
    }

    private void u(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureEventAlarmNum(parcel.readInt());
    }

    private void be(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSmartAlarm(parcel.readByte() == 1);
    }

    private void av(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureOtaUpdate(parcel.readByte() == 1);
    }

    private void ap(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureMaintenance(parcel.readByte() == 1);
    }

    private void ao(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureMaintenanceInTime(parcel.readByte() == 1);
    }

    private void as(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureMaintenanceGetData(parcel.readByte() == 1);
    }

    private void bl(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportAntiLost(parcel.readByte() == 1);
    }

    private void l(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureBluetoothOffAlert(parcel.readByte() == 1);
    }

    private void aq(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureLanguage(parcel.readByte() == 1);
    }

    private void dx(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureWeatherPush(parcel.readByte() == 1);
    }

    private void dj(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportUnitWeather(parcel.readByte() == 1);
    }

    private void h(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureAtmosphereSupportExpand(parcel.readByte() == 1);
    }

    private void dv(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureWeatherSupportErrorCode(parcel.readByte() == 1);
    }

    private void bs(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportExerciseAdvice(parcel.readByte() == 1);
    }

    private void bw(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportExerciseAdviceTime(parcel.readByte() == 1);
    }

    private void bt(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportExerciseAdviceMonitor(parcel.readByte() == 1);
    }

    private void dm(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportWorkout(parcel.readByte() == 1);
    }

    private void ds(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportWorkoutInfo(parcel.readByte() == 1);
    }

    private void dy(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportWorkoutReminder(parcel.readByte() == 1);
    }

    private void dt(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportWorkoutRecord(parcel.readByte() == 1);
    }

    private void dp(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportWorkoutExerciseDisplayLink(parcel.readByte() == 1);
    }

    private void du(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportWorkoutRecordPaceMap(parcel.readByte() == 1);
    }

    private void dn(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportWorkoutCapabilicy(parcel.readByte() == 1);
    }

    private void cf(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportGpsLocation(parcel.readByte() == 1);
    }

    private void bx(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportGpsData(parcel.readByte() == 1);
    }

    private void ce(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportGpsSetParameter(parcel.readByte() == 1);
    }

    private void cg(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportGpsPostProcessing(parcel.readByte() == 1);
    }

    private void cl(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportHeartRateInfo(parcel.readByte() == 1);
    }

    private void az(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSleep(parcel.readByte() == 1);
    }

    private void q(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureClimb(parcel.readByte() == 1);
    }

    private void bc(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureRiding(parcel.readByte() == 1);
    }

    private void bd(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureStand(parcel.readByte() == 1);
    }

    private void bg(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSleepShallow(parcel.readByte() == 1);
    }

    private void bf(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSleepDeep(parcel.readByte() == 1);
    }

    private void dq(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureWalk(parcel.readByte() == 1);
    }

    private void ba(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureRun(parcel.readByte() == 1);
    }

    private void bh(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureStep(parcel.readByte() == 1);
    }

    private void m(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureCalorie(parcel.readByte() == 1);
    }

    private void t(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureDistance(parcel.readByte() == 1);
    }

    private void ah(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureIsSupportHeartRate(parcel.readByte() == 1);
    }

    private void ax(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configurePromptPush(parcel.readInt());
    }

    private void o(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureCallMute(parcel.readByte() == 1);
    }

    private void af(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureIsSupportHelp(parcel.readByte() == 1);
    }

    private void p(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureDistanceDetail(parcel.readByte() == 1);
    }

    private void bv(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportEsim(parcel.readByte() == 1);
    }

    private void cu(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportMultiSim(parcel.readByte() == 1);
    }

    private void cx(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportPay(parcel.readByte() == 1);
    }

    private void cd(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureisSupportHeartRateEnable(parcel.readByte() == 1);
    }

    private void bb(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureRotateSwitchScreen(parcel.readByte() == 1);
    }

    private void cy(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportQueryAllowDisturbContent(parcel.readByte() == 1);
    }

    private void ch(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportLeftRightHandWearMode(parcel.readByte() == 1);
    }

    private void dg(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportStress(parcel.readByte() == 1);
    }

    private void cv(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportMidware(parcel.readByte() == 1);
    }

    private void dk(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportSportTotal(parcel.readByte() == 1);
    }

    private void bm(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportAccount(parcel.readByte() == 1);
    }

    private void cs(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportOneLevelMenu(parcel.readByte() == 1);
    }

    private void bp(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportDeleteMsg(parcel.readByte() == 1);
    }

    private void da(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportPosture(parcel.readByte() == 1);
    }

    private void cr(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportMusicControl(parcel.readByte() == 1);
    }

    private void at(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configruePressAutoMonitor(parcel.readByte() == 1);
    }

    private void bo(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportContinueHeartRate(parcel.readByte() == 1);
    }

    private void bi(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportAtmosphere(parcel.readByte() == 1);
    }

    private void bq(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportAutoDetectMode(parcel.readByte() == 1);
    }

    private void bu(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportFootWear(parcel.readByte() == 1);
    }

    private void dd(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportRunPosture(parcel.readByte() == 1);
    }

    private void ab(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureHeartRateRaiseAlarm(parcel.readByte() == 1);
    }

    private void y(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureGetHeartRateRaiseAlarmNumber(parcel.readByte() == 1);
    }

    private void x(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureGetHighAndMiddleSport(parcel.readByte() == 1);
    }

    private void dw(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.setSupportDefaultSwitch(parcel.readByte() == 1);
    }

    private void z(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureHeartRateDownAlarm(parcel.readByte() == 1);
    }

    private void n(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureChangeAlarm(parcel.readByte() == 1);
    }

    private void ck(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportIntelligentHomeLinkage(parcel.readByte() == 1);
    }

    private void dr(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSyncBeforeOta(parcel.readByte() == 1);
    }

    private void aj(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureIsSupportPhonesInfo(parcel.readByte() == 1);
    }

    private void ai(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureIsSupportNotifyDeviceBroadCast(parcel.readByte() == 1);
    }

    private void bk(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportAtrialOperator(parcel.readByte() == 1);
    }

    private void ay(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSetHrrHeartRateCapability(parcel.readByte() == 1);
    }

    private void ee(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.setSupportWatchFace(parcel.readByte() == 1);
    }

    private void ea(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.setSupportMarketFace(parcel.readByte() == 1);
    }

    private void cj(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportInformCloseOrOpen(parcel.readByte() == 1);
    }

    private void ak(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureIsSupportStressAppToDevice(parcel.readByte() == 1);
    }

    private void ae(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureIsSupportMusicInfoList(parcel.readByte() == 1);
    }

    private void eb(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.setSupportOneTouch(parcel.readByte() == 1);
    }

    private void ec(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.setSupportTws(parcel.readByte() == 1);
    }

    private void dc(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportSleepBreathe(parcel.readByte() == 1);
    }

    private void ci(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportHiCarDriverRemind(parcel.readByte() == 1);
    }

    private void co(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportMessageFeedback(parcel.readByte() == 1);
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private void m1948do(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportWearStatus(parcel.readByte() == 1);
    }

    private void cz(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportPhd(parcel.readByte() == 1);
    }

    private void ad(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureIsSupportAutoUpdate(parcel.readByte() == 1);
    }

    private void cc(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportGpsSearchStarOptimization(parcel.readByte() == 1);
    }

    private void an(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureIsSupportUpdateChange(parcel.readByte() == 1);
    }

    private void ed(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.setSupportElectronicCard(parcel.readByte() == 1);
    }

    private void dz(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureWeatherSupportFutureInfo(parcel.readByte() == 1);
    }

    private void cq(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportMenstrual(parcel.readByte() == 1);
    }

    private void di(Parcel parcel, DeviceCapability deviceCapability) {
        deviceCapability.configureSupportSosTransmission(parcel.readByte() == 1);
        deviceCapability.configureSupportSendSosSms(parcel.readByte() == 1);
    }

    public void a(Parcel parcel, DeviceCapability deviceCapability) {
        if (parcel == null || deviceCapability == null) {
            return;
        }
        g(parcel, deviceCapability);
        by(parcel, deviceCapability);
        bz(parcel, deviceCapability);
        f(parcel, deviceCapability);
        k(parcel, deviceCapability);
        v(parcel, deviceCapability);
        cw(parcel, deviceCapability);
        ca(parcel, deviceCapability);
        ct(parcel, deviceCapability);
        bj(parcel, deviceCapability);
        bn(parcel, deviceCapability);
        ac(parcel, deviceCapability);
        de(parcel, deviceCapability);
        ar(parcel, deviceCapability);
        cp(parcel, deviceCapability);
        cm(parcel, deviceCapability);
        cn(parcel, deviceCapability);
        dl(parcel, deviceCapability);
        s(parcel, deviceCapability);
        br(parcel, deviceCapability);
        au(parcel, deviceCapability);
        w(parcel, deviceCapability);
        i(parcel, deviceCapability);
        db(parcel, deviceCapability);
        df(parcel, deviceCapability);
        dh(parcel, deviceCapability);
        aw(parcel, deviceCapability);
        ag(parcel, deviceCapability);
        aa(parcel, deviceCapability);
        cb(parcel, deviceCapability);
        al(parcel, deviceCapability);
        am(parcel, deviceCapability);
        r(parcel, deviceCapability);
        u(parcel, deviceCapability);
        be(parcel, deviceCapability);
        av(parcel, deviceCapability);
        ap(parcel, deviceCapability);
        ao(parcel, deviceCapability);
        as(parcel, deviceCapability);
    }

    public void c(Parcel parcel, DeviceCapability deviceCapability) {
        if (parcel == null || deviceCapability == null) {
            return;
        }
        bl(parcel, deviceCapability);
        l(parcel, deviceCapability);
        aq(parcel, deviceCapability);
        dx(parcel, deviceCapability);
        dj(parcel, deviceCapability);
        h(parcel, deviceCapability);
        dv(parcel, deviceCapability);
        bs(parcel, deviceCapability);
        bw(parcel, deviceCapability);
        bt(parcel, deviceCapability);
        dm(parcel, deviceCapability);
        ds(parcel, deviceCapability);
        dy(parcel, deviceCapability);
        dt(parcel, deviceCapability);
        dp(parcel, deviceCapability);
        du(parcel, deviceCapability);
        dn(parcel, deviceCapability);
        cf(parcel, deviceCapability);
        bx(parcel, deviceCapability);
        ce(parcel, deviceCapability);
        cg(parcel, deviceCapability);
        cl(parcel, deviceCapability);
        az(parcel, deviceCapability);
        q(parcel, deviceCapability);
        bc(parcel, deviceCapability);
        bd(parcel, deviceCapability);
        bg(parcel, deviceCapability);
        bf(parcel, deviceCapability);
        dq(parcel, deviceCapability);
        ba(parcel, deviceCapability);
        bh(parcel, deviceCapability);
        m(parcel, deviceCapability);
        t(parcel, deviceCapability);
        ah(parcel, deviceCapability);
        ax(parcel, deviceCapability);
        o(parcel, deviceCapability);
        af(parcel, deviceCapability);
        p(parcel, deviceCapability);
        bv(parcel, deviceCapability);
        cu(parcel, deviceCapability);
        cx(parcel, deviceCapability);
        cd(parcel, deviceCapability);
        bb(parcel, deviceCapability);
        cy(parcel, deviceCapability);
        ch(parcel, deviceCapability);
    }

    public void b(Parcel parcel, DeviceCapability deviceCapability) {
        if (parcel == null || deviceCapability == null) {
            return;
        }
        dg(parcel, deviceCapability);
        cv(parcel, deviceCapability);
        dk(parcel, deviceCapability);
        bm(parcel, deviceCapability);
        cs(parcel, deviceCapability);
        bp(parcel, deviceCapability);
        da(parcel, deviceCapability);
        cr(parcel, deviceCapability);
        at(parcel, deviceCapability);
        bo(parcel, deviceCapability);
        bi(parcel, deviceCapability);
        bq(parcel, deviceCapability);
        bu(parcel, deviceCapability);
        dd(parcel, deviceCapability);
        ab(parcel, deviceCapability);
        y(parcel, deviceCapability);
        x(parcel, deviceCapability);
        dw(parcel, deviceCapability);
        z(parcel, deviceCapability);
        n(parcel, deviceCapability);
        ck(parcel, deviceCapability);
        dr(parcel, deviceCapability);
        aj(parcel, deviceCapability);
        ai(parcel, deviceCapability);
        bk(parcel, deviceCapability);
        ay(parcel, deviceCapability);
        ee(parcel, deviceCapability);
        ea(parcel, deviceCapability);
        cj(parcel, deviceCapability);
        ak(parcel, deviceCapability);
        ae(parcel, deviceCapability);
        eb(parcel, deviceCapability);
        ec(parcel, deviceCapability);
        dc(parcel, deviceCapability);
        ci(parcel, deviceCapability);
        co(parcel, deviceCapability);
        m1948do(parcel, deviceCapability);
        cz(parcel, deviceCapability);
        ad(parcel, deviceCapability);
        cc(parcel, deviceCapability);
        an(parcel, deviceCapability);
        ed(parcel, deviceCapability);
        dz(parcel, deviceCapability);
        cq(parcel, deviceCapability);
        di(parcel, deviceCapability);
    }

    public void e(Parcel parcel, DeviceCapability deviceCapability) {
        if (parcel == null || deviceCapability == null) {
            return;
        }
        parcel.writeByte((byte) b(deviceCapability.isSupportTimeSetting()));
        parcel.writeByte((byte) b(deviceCapability.isSupportGetFirmwareVersion()));
        parcel.writeByte((byte) b(deviceCapability.isSupportGetBattery()));
        parcel.writeByte((byte) b(deviceCapability.isSupportAutoLightScreen()));
        parcel.writeByte((byte) b(deviceCapability.isAvoidDisturb()));
        parcel.writeByte((byte) b(deviceCapability.isFactoryReset()));
        parcel.writeByte((byte) b(deviceCapability.isSupportPairDevice()));
        parcel.writeByte((byte) b(deviceCapability.isSupportGetHandsetInfo()));
        parcel.writeByte((byte) b(deviceCapability.isSupportNotificationIntervalInfo()));
        parcel.writeByte((byte) b(deviceCapability.isSupportActivityType()));
        parcel.writeByte((byte) b(deviceCapability.isSupportAuthenticDevice()));
        parcel.writeByte((byte) b(deviceCapability.isGoldCard()));
        parcel.writeByte((byte) b(deviceCapability.isSupportRemoteCamera()));
        parcel.writeByte((byte) b(deviceCapability.isMessageAlert()));
        parcel.writeByte((byte) b(deviceCapability.isSupportMessageAlertInfo()));
        parcel.writeByte((byte) b(deviceCapability.isSupportMessageSupportInfo()));
        parcel.writeByte((byte) b(deviceCapability.isSupportMessageCenterPushDevice()));
        parcel.writeByte((byte) b(deviceCapability.isSupportWearMessagePush()));
        parcel.writeByte((byte) b(deviceCapability.isContacts()));
        parcel.writeByte((byte) b(deviceCapability.isSupportCallingOperationType()));
        parcel.writeInt(deviceCapability.getMotionGoalCap());
        parcel.writeInt(deviceCapability.getFitnessFrameType());
        parcel.writeByte((byte) b(deviceCapability.isActivityReminder()));
        parcel.writeByte((byte) b(deviceCapability.isSupportSetUserInfoEncrypt()));
        parcel.writeByte((byte) b(deviceCapability.isSupportSampleFrame()));
        parcel.writeByte((byte) b(deviceCapability.isSupportThreshold()));
        parcel.writeByte((byte) b(deviceCapability.isReserveSync()));
        parcel.writeByte((byte) b(deviceCapability.isSupportHeartRateZone()));
        parcel.writeByte((byte) b(deviceCapability.isSupportCoreSleep()));
        parcel.writeByte((byte) b(deviceCapability.isSupportGetUserInfo()));
        parcel.writeByte((byte) b(deviceCapability.isSupportSendCoreSleepOutState()));
        parcel.writeByte((byte) b(deviceCapability.isSupportQueryDeviceCoreSleepSwitch()));
        parcel.writeByte((byte) b(deviceCapability.isEventAlarm()));
        parcel.writeInt(deviceCapability.getEventAlarmNum());
        parcel.writeByte((byte) b(deviceCapability.isSmartAlarm()));
        parcel.writeByte((byte) b(deviceCapability.isOtaUpdate()));
        parcel.writeByte((byte) b(deviceCapability.isMaintenance()));
        parcel.writeByte((byte) b(deviceCapability.isMaintenanceInTime()));
        parcel.writeByte((byte) b(deviceCapability.isMaintenanceGetData()));
    }

    public void d(Parcel parcel, DeviceCapability deviceCapability) {
        if (parcel == null || deviceCapability == null) {
            return;
        }
        parcel.writeByte((byte) b(deviceCapability.isSupportAntiLost()));
        parcel.writeByte((byte) b(deviceCapability.isBluetoothOffAlert()));
        parcel.writeByte((byte) b(deviceCapability.isLanguage()));
        parcel.writeByte((byte) b(deviceCapability.isWeatherPush()));
        parcel.writeByte((byte) b(deviceCapability.isSupportUnitWeather()));
        parcel.writeByte((byte) b(deviceCapability.isAtmosphereSupportExpand()));
        parcel.writeByte((byte) b(deviceCapability.isWeatherSupportErrorCode()));
        parcel.writeByte((byte) b(deviceCapability.isSupportExerciseAdvice()));
        parcel.writeByte((byte) b(deviceCapability.isSupportExerciseAdviceTime()));
        parcel.writeByte((byte) b(deviceCapability.isSupportExerciseAdviceMonitor()));
        parcel.writeByte((byte) b(deviceCapability.isSupportWorkout()));
        parcel.writeByte((byte) b(deviceCapability.isSupportWorkoutInfo()));
        parcel.writeByte((byte) b(deviceCapability.isSupportWorkoutReminder()));
        parcel.writeByte((byte) b(deviceCapability.isSupportWorkoutRecord()));
        parcel.writeByte((byte) b(deviceCapability.isSupportWorkoutExerciseDisplayLink()));
        parcel.writeByte((byte) b(deviceCapability.isSupportWorkoutRecordPaceMap()));
        parcel.writeByte((byte) b(deviceCapability.isSupportWorkoutCapabilicy()));
        parcel.writeByte((byte) b(deviceCapability.isSupportGpsLocation()));
        parcel.writeByte((byte) b(deviceCapability.isSupportGpsData()));
        parcel.writeByte((byte) b(deviceCapability.isSupportGpsSetParameter()));
        parcel.writeByte((byte) b(deviceCapability.isSupportGpsPostProcessing()));
        parcel.writeByte((byte) b(deviceCapability.isSupportHeartRateInfo()));
        parcel.writeByte((byte) b(deviceCapability.isSleep()));
        parcel.writeByte((byte) b(deviceCapability.isClimb()));
        parcel.writeByte((byte) b(deviceCapability.isRiding()));
        parcel.writeByte((byte) b(deviceCapability.isStand()));
        parcel.writeByte((byte) b(deviceCapability.isSleepShallow()));
        parcel.writeByte((byte) b(deviceCapability.isSleepDeep()));
        parcel.writeByte((byte) b(deviceCapability.isWalk()));
        parcel.writeByte((byte) b(deviceCapability.isRun()));
        parcel.writeByte((byte) b(deviceCapability.isStep()));
        parcel.writeByte((byte) b(deviceCapability.isCalorie()));
        parcel.writeByte((byte) b(deviceCapability.isDistance()));
        parcel.writeByte((byte) b(deviceCapability.isSupportHeartRate()));
        parcel.writeInt(deviceCapability.isPromptPush());
        parcel.writeByte((byte) b(deviceCapability.isSupportCallMute()));
        parcel.writeByte((byte) b(deviceCapability.isSupportHelp()));
        parcel.writeByte((byte) b(deviceCapability.getDistanceDetail()));
        parcel.writeByte((byte) b(deviceCapability.isSupportEsim()));
        parcel.writeByte((byte) b(deviceCapability.isSupportMultiSim()));
        parcel.writeByte((byte) b(deviceCapability.isSupportPay()));
        parcel.writeByte((byte) b(deviceCapability.isSupportHeartRateEnable()));
        parcel.writeByte((byte) b(deviceCapability.isSupportRotateSwitchScreen()));
        parcel.writeByte((byte) b(deviceCapability.isSupportQueryAllowDisturbContent()));
        parcel.writeByte((byte) b(deviceCapability.isSupportLeftRightHandWearMode()));
    }

    public void j(Parcel parcel, DeviceCapability deviceCapability) {
        if (parcel == null || deviceCapability == null) {
            return;
        }
        parcel.writeByte((byte) b(deviceCapability.isSupportStress()));
        parcel.writeByte((byte) b(deviceCapability.isSupportMidware()));
        parcel.writeByte((byte) b(deviceCapability.isSupportSportTotal()));
        parcel.writeByte((byte) b(deviceCapability.isSupportAccount()));
        parcel.writeByte((byte) b(deviceCapability.isSupportOneLevelMenu()));
        parcel.writeByte((byte) b(deviceCapability.isSupportDeleteMsg()));
        parcel.writeByte((byte) b(deviceCapability.isSupportPosture()));
        parcel.writeByte((byte) b(deviceCapability.isSupportMusicControl()));
        parcel.writeByte((byte) b(deviceCapability.isSupportPressAutoMonitor()));
        parcel.writeByte((byte) b(deviceCapability.isSupportContinueHeartRate()));
        parcel.writeByte((byte) b(deviceCapability.isSupportAtmosphere()));
        parcel.writeByte((byte) b(deviceCapability.isSupportAutoDetectMode()));
        parcel.writeByte((byte) b(deviceCapability.isSupportFootWear()));
        parcel.writeByte((byte) b(deviceCapability.isSupportRunPosture()));
        parcel.writeByte((byte) b(deviceCapability.isSupportHeartRateRaiseAlarm()));
        parcel.writeByte((byte) b(deviceCapability.isSupportGetHeartRateRaiseAlarmNumber()));
        parcel.writeByte((byte) b(deviceCapability.isSupportGetHighAndMiddleSport()));
        parcel.writeByte((byte) b(deviceCapability.isSupportDefaultSwitch()));
        parcel.writeByte((byte) b(deviceCapability.isSupportHeartRateDownAlarm()));
        parcel.writeByte((byte) b(deviceCapability.isSupportChangeAlarm()));
        parcel.writeByte((byte) b(deviceCapability.isSupportIntelligentHomeLinkage()));
        parcel.writeByte((byte) b(deviceCapability.isNeedSyncBeforeOta()));
        parcel.writeByte((byte) b(deviceCapability.isSupportPhonesInfo()));
        parcel.writeByte((byte) b(deviceCapability.isSupportNotifyDeviceBroadCast()));
        parcel.writeByte((byte) b(deviceCapability.isSupportAtrialOperator()));
        parcel.writeByte((byte) b(deviceCapability.getIsSupportHrrHeartRateCapability()));
        parcel.writeByte((byte) b(deviceCapability.isSupportWatchFace()));
        parcel.writeByte((byte) b(deviceCapability.isSupportMarketFace()));
        parcel.writeByte((byte) b(deviceCapability.isSupportInformCloseOrOpen()));
        parcel.writeByte((byte) b(deviceCapability.isSupportStressAppToDevice()));
        parcel.writeByte((byte) b(deviceCapability.isSupportMusicInfoList()));
        parcel.writeByte((byte) b(deviceCapability.isSupportOneTouch()));
        parcel.writeByte((byte) b(deviceCapability.isSupportTws()));
        parcel.writeByte((byte) b(deviceCapability.isSupportSleepBreathe()));
        parcel.writeByte((byte) b(deviceCapability.isSupportHiCarDriverRemind()));
        parcel.writeByte((byte) b(deviceCapability.isSupportMessageFeedback()));
        parcel.writeByte((byte) b(deviceCapability.isSupportWearStatus()));
        parcel.writeByte((byte) b(deviceCapability.isSupportPhd()));
        parcel.writeByte((byte) b(deviceCapability.getIsSupportAutoUpdate()));
        parcel.writeByte((byte) b(deviceCapability.isSupportGpsSearchStarOptimization()));
        parcel.writeByte((byte) b(deviceCapability.getIsSupportUpdateChange()));
        parcel.writeByte((byte) b(deviceCapability.isSupportElectronicCard()));
        parcel.writeByte((byte) b(deviceCapability.isWeatherSupportFutureInfo()));
        parcel.writeByte((byte) b(deviceCapability.isSupportMenstrual()));
    }

    public void e(DeviceCapability deviceCapability) {
        if (deviceCapability == null) {
            return;
        }
        deviceCapability.configureSupportTimeSetting(false);
        deviceCapability.configureSupportGetFirmwareVersion(false);
        deviceCapability.configureSupportGetBattery(false);
        deviceCapability.configureAutoLightScreen(false);
        deviceCapability.configureAvoidDisturb(false);
        deviceCapability.configureFactoryReset(false);
        deviceCapability.configureSupportPairDevice(false);
        deviceCapability.configureSupportGetHandsetInfo(false);
        deviceCapability.configureSupportNotificationIntervalInfo(false);
        deviceCapability.configureSupportActivityType(false);
        deviceCapability.configureSupportAuthenticDevice(false);
        deviceCapability.configureGoldCard(false);
        deviceCapability.configureSupportRemoteCamera(false);
        deviceCapability.configureMessageAlert(false);
        deviceCapability.configureSupportMessageAlertInfo(false);
        deviceCapability.configureSupportMessageSupportInfo(false);
        deviceCapability.configureupportMessageCenterPushDevice(false);
        deviceCapability.configureSupportWearMessagePush(false);
        deviceCapability.configureContacts(false);
        deviceCapability.configureSupportCallingOperationType(false);
        deviceCapability.configureMotionGoalCap(1);
        deviceCapability.configureFitnessFrameType(0);
        deviceCapability.configureActivityReminder(false);
        deviceCapability.configureSupportSetUserInfoEncrypt(false);
        deviceCapability.configureSupportSampleFrame(false);
        deviceCapability.configureSupportThreshold(false);
        deviceCapability.configureReserveSync(false);
        deviceCapability.configureIsSupportHeartRateZone(false);
        deviceCapability.configureIsSupportCoreSleep(false);
        deviceCapability.configureSupportGetUserInfo(false);
        deviceCapability.configureIsSupportSendCoreSleepOutState(false);
        deviceCapability.configureIsSupportQueryDeviceCoreSleepSwitch(false);
        deviceCapability.configureEventAlarm(false);
        deviceCapability.configureEventAlarmNum(5);
        deviceCapability.configureSmartAlarm(false);
        deviceCapability.configureOtaUpdate(false);
        deviceCapability.configureMaintenance(false);
        deviceCapability.configureMaintenanceInTime(false);
        deviceCapability.configureMaintenanceGetData(false);
    }

    public void d(DeviceCapability deviceCapability) {
        if (deviceCapability == null) {
            return;
        }
        deviceCapability.configureSupportAntiLost(false);
        deviceCapability.configureBluetoothOffAlert(false);
        deviceCapability.configureLanguage(false);
        deviceCapability.configureWeatherPush(false);
        deviceCapability.configureSupportUnitWeather(false);
        deviceCapability.configureAtmosphereSupportExpand(false);
        deviceCapability.configureWeatherSupportErrorCode(false);
        deviceCapability.configureSupportExerciseAdvice(false);
        deviceCapability.configureSupportExerciseAdviceTime(false);
        deviceCapability.configureSupportExerciseAdviceMonitor(false);
        deviceCapability.configureSupportWorkout(false);
        deviceCapability.configureSupportWorkoutInfo(false);
        deviceCapability.configureSupportWorkoutReminder(false);
        deviceCapability.configureSupportWorkoutRecord(false);
        deviceCapability.configureSupportWorkoutExerciseDisplayLink(false);
        deviceCapability.configureSupportWorkoutRecordPaceMap(false);
        deviceCapability.configureSupportWorkoutCapabilicy(false);
        deviceCapability.configureSupportGpsLocation(false);
        deviceCapability.configureSupportGpsData(false);
        deviceCapability.configureSupportGpsSetParameter(false);
        deviceCapability.configureSupportGpsPostProcessing(false);
        deviceCapability.configureSupportHeartRateInfo(false);
        deviceCapability.configureSleep(false);
        deviceCapability.configureClimb(false);
        deviceCapability.configureRiding(false);
        deviceCapability.configureStand(false);
        deviceCapability.configureSleepShallow(false);
        deviceCapability.configureSleepDeep(false);
        deviceCapability.configureWalk(false);
        deviceCapability.configureRun(false);
        deviceCapability.configureStep(false);
        deviceCapability.configureCalorie(false);
        deviceCapability.configureDistance(false);
        deviceCapability.configureIsSupportHeartRate(false);
        deviceCapability.configurePromptPush(0);
        deviceCapability.configureCallMute(false);
        deviceCapability.configureIsSupportHelp(false);
        deviceCapability.configureDistanceDetail(false);
        deviceCapability.configureSupportEsim(false);
        deviceCapability.configureSupportMultiSim(false);
        deviceCapability.configureSupportPay(false);
        deviceCapability.configureisSupportHeartRateEnable(false);
        deviceCapability.configureRotateSwitchScreen(false);
        deviceCapability.configureSupportQueryAllowDisturbContent(false);
        deviceCapability.configureSupportLeftRightHandWearMode(false);
    }

    public void a(DeviceCapability deviceCapability) {
        if (deviceCapability == null) {
            return;
        }
        deviceCapability.configureSupportStress(false);
        deviceCapability.configureSupportMidware(false);
        deviceCapability.configureSupportSportTotal(false);
        deviceCapability.configureSupportAccount(false);
        deviceCapability.configureSupportOneLevelMenu(false);
        deviceCapability.configureSupportDeleteMsg(false);
        deviceCapability.configureSupportPosture(false);
        deviceCapability.configureSupportMusicControl(false);
        deviceCapability.configruePressAutoMonitor(false);
        deviceCapability.configureSupportContinueHeartRate(false);
        deviceCapability.configureSupportAtmosphere(false);
        deviceCapability.configureSupportAutoDetectMode(false);
        deviceCapability.configureSupportFootWear(false);
        deviceCapability.configureSupportRunPosture(false);
        deviceCapability.configureHeartRateRaiseAlarm(false);
        deviceCapability.configureGetHeartRateRaiseAlarmNumber(false);
        deviceCapability.configureGetHighAndMiddleSport(false);
        deviceCapability.setSupportDefaultSwitch(false);
        deviceCapability.configureHeartRateDownAlarm(false);
        deviceCapability.configureChangeAlarm(false);
        deviceCapability.configureSupportIntelligentHomeLinkage(false);
        deviceCapability.configureSyncBeforeOta(false);
        deviceCapability.configureIsSupportPhonesInfo(false);
        deviceCapability.configureIsSupportNotifyDeviceBroadCast(false);
        deviceCapability.configureSupportAtrialOperator(false);
        deviceCapability.configureSetHrrHeartRateCapability(false);
        deviceCapability.setSupportWatchFace(false);
        deviceCapability.setSupportMarketFace(false);
        deviceCapability.configureSupportInformCloseOrOpen(false);
        deviceCapability.configureIsSupportStressAppToDevice(false);
        deviceCapability.configureIsSupportMusicInfoList(false);
        deviceCapability.setSupportOneTouch(false);
        deviceCapability.setSupportTws(false);
        deviceCapability.configureSupportSleepBreathe(false);
        deviceCapability.configureSupportHiCarDriverRemind(false);
        deviceCapability.configureSupportMessageFeedback(false);
        deviceCapability.configureSupportWearStatus(false);
        deviceCapability.configureSupportPhd(false);
        deviceCapability.configureIsSupportAutoUpdate(false);
        deviceCapability.configureSupportGpsSearchStarOptimization(false);
        deviceCapability.configureIsSupportUpdateChange(false);
        deviceCapability.setSupportElectronicCard(false);
        deviceCapability.configureWeatherSupportFutureInfo(false);
        deviceCapability.configureSupportMenstrual(false);
        deviceCapability.configureSupportSosTransmission(false);
    }
}
