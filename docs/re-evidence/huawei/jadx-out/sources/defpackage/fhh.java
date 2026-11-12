package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.google.protobuf.InvalidProtocolBufferException;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.suggestion.CoachController;
import com.huawei.health.suggestion.fit.callback.CourseLinkageLifecycle;
import com.huawei.health.suggestion.protobuf.CourseProto;
import com.huawei.health.suggestion.protobuf.CourseStateProto;
import com.huawei.hms.ads.dynamic.a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class fhh extends fhg implements DataReceiveCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ExtendHandler f34057c;
    private boolean e = false;

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final fhh f34058a = new fhh();
    }

    public static fhh b() {
        return b.f34058a;
    }

    class e implements CourseLinkageLifecycle {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private DeviceInfo f34061b;

        e() {
        }

        @Override // com.huawei.health.suggestion.fit.callback.CourseLinkageLifecycle
        public void start(int i, Bundle bundle) {
            ReleaseLogUtil.d("HWhealthLinkage_CourseLinkageReverse", "AppCommandListener app start, sportType:", Integer.valueOf(i));
            DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "CourseLinkageReverse");
            this.f34061b = deviceInfo;
            if (fkm.d(deviceInfo)) {
                edc.e().registerDeviceSampleListener("hw.course.linkage", fhh.b());
                fhh.this.d(i, bundle);
                fhh.this.a(bundle, this.f34061b);
                return;
            }
            fhh.this.f34050a.start(i, bundle);
        }

        @Override // com.huawei.health.suggestion.fit.callback.CourseLinkageLifecycle
        public void resume(int i) {
            ReleaseLogUtil.d("HWhealthLinkage_CourseLinkageReverse", "AppCommandListener app resume, sportType:", Integer.valueOf(i));
            fhh.this.d = i;
            fhh.this.f34050a.resume(i);
        }

        @Override // com.huawei.health.suggestion.fit.callback.CourseLinkageLifecycle
        public void pause(int i) {
            ReleaseLogUtil.d("HWhealthLinkage_CourseLinkageReverse", "AppCommandListener app pause, sportType:", Integer.valueOf(i));
            fhh.this.f34050a.pause(i);
        }

        @Override // com.huawei.health.suggestion.fit.callback.CourseLinkageLifecycle
        public void stop(int i) {
            ReleaseLogUtil.d("HWhealthLinkage_CourseLinkageReverse", "AppCommandListener app stop, sportType:", Integer.valueOf(i));
            fhh.this.e = false;
            fhh.this.f34050a.stop(i);
        }

        @Override // com.huawei.health.suggestion.fit.callback.CourseLinkageLifecycle
        public void chapterForward(CourseStateProto.CourseState courseState) {
            ReleaseLogUtil.d("HWhealthLinkage_CourseLinkageReverse", "mCourseLinkageLifecycle app chapterForward");
            fkm.a(courseState, 5, this.f34061b);
        }

        @Override // com.huawei.health.suggestion.fit.callback.CourseLinkageLifecycle
        public void chapterBackward(CourseStateProto.CourseState courseState) {
            ReleaseLogUtil.d("HWhealthLinkage_CourseLinkageReverse", "mCourseLinkageLifecycle app chapterBackward");
            fkm.a(courseState, 6, this.f34061b);
        }

        @Override // com.huawei.health.suggestion.fit.callback.CourseLinkageLifecycle
        public void chapterBreak(CourseStateProto.CourseState courseState) {
            ReleaseLogUtil.d("HWhealthLinkage_CourseLinkageReverse", "mCourseLinkageLifecycle app chapterBreak");
            fkm.a(courseState, 7, this.f34061b);
        }

        @Override // com.huawei.health.suggestion.fit.callback.CourseLinkageLifecycle
        public void volumeAdjust(CourseStateProto.CourseState courseState) {
            ReleaseLogUtil.d("HWhealthLinkage_CourseLinkageReverse", "mCourseLinkageLifecycle app volumeAdjust");
            fkm.a(courseState, 8, this.f34061b);
        }
    }

    @Override // defpackage.fhg
    protected void c() {
        ReleaseLogUtil.d("HWhealthLinkage_CourseLinkageReverse", "registerDeviceConnectListener");
        super.c();
    }

    public void d() {
        e eVar = new e();
        ReleaseLogUtil.d("HWhealthLinkage_CourseLinkageReverse", "registerAppCommandListener, appCommandListener: ", eVar);
        CoachController.c().c(CoachController.StatusSource.APP, eVar);
    }

    @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
        ReleaseLogUtil.d("HWhealthLinkage_CourseLinkageReverse", "onDataReceived courseLinkage");
        if (deviceInfo == null || eecVar == null) {
            ReleaseLogUtil.e("HWhealthLinkage_CourseLinkageReverse", "onDataReceived device or message is null.");
            return;
        }
        String strC = c(eecVar);
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        List<eew> listE = e(strC);
        int iA = a(listE);
        if (iA == 4) {
            ReleaseLogUtil.d("HWhealthLinkage_CourseLinkageReverse", "onDataReceived app start");
            this.e = true;
            f();
            return;
        }
        if (iA == 5) {
            ReleaseLogUtil.d("HWhealthLinkage_CourseLinkageReverse", "onDataReceived wear chapterForward");
            CoachController.c().c(CoachController.StatusSource.NEW_LINK_WEAR, 0);
            return;
        }
        if (iA == 6) {
            ReleaseLogUtil.d("HWhealthLinkage_CourseLinkageReverse", "onDataReceived wear chapterBackward");
            CoachController.c().e(CoachController.StatusSource.NEW_LINK_WEAR, 0);
        } else {
            if (iA == 8) {
                ReleaseLogUtil.d("HWhealthLinkage_CourseLinkageReverse", "onDataReceived wear volumeAdjust");
                CourseStateProto.CourseState courseStateB = b(listE);
                if (courseStateB == null) {
                    ReleaseLogUtil.d("HWhealthLinkage_CourseLinkageReverse", "onDataReceived wear volumeAdjust, courseState null");
                    return;
                } else {
                    CoachController.c().e(CoachController.StatusSource.NEW_LINK_WEAR, courseStateB.toBuilder());
                    return;
                }
            }
            ReleaseLogUtil.e("HWhealthLinkage_CourseLinkageReverse", "onDataReceived message is nothing.");
        }
    }

    private String c(eec eecVar) {
        if (!(eecVar instanceof eef)) {
            ReleaseLogUtil.e("HWhealthLinkage_CourseLinkageReverse", "getConfigData message is error.");
            return "";
        }
        List<eeg> configInfoList = ((eef) eecVar).getConfigInfoList();
        if (njy.e(configInfoList)) {
            ReleaseLogUtil.e("HWhealthLinkage_CourseLinkageReverse", "getConfigData sampleConfigList is empty");
            return "";
        }
        eeg eegVar = configInfoList.get(0);
        if (eegVar == null) {
            return "";
        }
        String strE = eeq.e(eegVar.e());
        ReleaseLogUtil.d("HWhealthLinkage_CourseLinkageReverse", "getConfigData configData = ", strE);
        return strE;
    }

    private CourseStateProto.CourseState b(List<eew> list) {
        if (njy.e(list)) {
            ReleaseLogUtil.d("HWhealthLinkage_CourseLinkageReverse", "parseConfigDataTlv0x03 tlvs isEmpty");
            return null;
        }
        try {
            return CourseStateProto.CourseState.parseFrom(eeq.c(list.get(0).b()));
        } catch (InvalidProtocolBufferException e2) {
            ReleaseLogUtil.a("HWhealthLinkage_CourseLinkageReverse", "parseConfigDataTlv0x03 protoException: ", ExceptionUtils.c(e2));
            return null;
        }
    }

    private List<eew> e(String str) {
        ArrayList arrayList = new ArrayList(10);
        try {
            return new eet().b(str).e();
        } catch (eeu e2) {
            ReleaseLogUtil.a("HWhealthLinkage_CourseLinkageReverse", "getConfigDataTlv TlvException: ", ExceptionUtils.c(e2));
            return arrayList;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private int a(List<eew> list) {
        if (njy.e(list)) {
            ReleaseLogUtil.d("HWhealthLinkage_CourseLinkageReverse", "getCommandId tlvs isEmpty");
            return Integer.MIN_VALUE;
        }
        byte b2 = 0;
        eew eewVar = list.get(0);
        String strE = eewVar.e();
        strE.hashCode();
        switch (strE.hashCode()) {
            case 1537:
                if (!strE.equals(HiAnalyticsConstant.KeyAndValue.NUMBER_01)) {
                    b2 = -1;
                }
                break;
            case 1538:
                if (!strE.equals(a.t)) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case 1539:
                if (!strE.equals("03")) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            String strB = eewVar.b();
            if (HiAnalyticsConstant.KeyAndValue.NUMBER_01.equals(strB)) {
                return 5;
            }
            if (a.t.equals(strB)) {
                return 6;
            }
            ReleaseLogUtil.d("HWhealthLinkage_CourseLinkageReverse", "getCommandId not charpter");
            return Integer.MIN_VALUE;
        }
        if (b2 != 1) {
            if (b2 == 2) {
                return 8;
            }
            ReleaseLogUtil.d("HWhealthLinkage_CourseLinkageReverse", "getCommandId nothing");
            return Integer.MIN_VALUE;
        }
        if (eewVar.d() == 0) {
            return 4;
        }
        ReleaseLogUtil.d("HWhealthLinkage_CourseLinkageReverse", "getCommandId not start");
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bundle bundle, DeviceInfo deviceInfo) {
        if (bundle == null) {
            ReleaseLogUtil.d("HWhealthLinkage_CourseLinkageReverse", "optionalParam is null");
            f();
            return;
        }
        if (bundle.containsKey("CourseStateProto") && (bundle.getSerializable("CourseProto") instanceof CourseProto.CourseStorageInfo)) {
            fkm.d((CourseProto.CourseStorageInfo) bundle.getSerializable("CourseProto"), deviceInfo);
        }
        if (bundle.containsKey("CourseStateProto") && (bundle.getSerializable("CourseStateProto") instanceof CourseStateProto.CourseState)) {
            fkm.d((CourseStateProto.CourseState) bundle.getSerializable("CourseStateProto"), deviceInfo);
        }
        this.f34057c = HandlerCenter.b(new c(), "CourseLinkageReverse");
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        this.f34057c.sendMessage(messageObtain, 2000L);
        ReleaseLogUtil.d("HWhealthLinkage_CourseLinkageReverse", "startSportWithReverseControl sendMessage");
    }

    class c implements Handler.Callback {
        private c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                ReleaseLogUtil.d("HWhealthLinkage_CourseLinkageReverse", "mHasAcceptStartReply: ", Boolean.valueOf(fhh.this.e));
                if (!fhh.this.e) {
                    fhh.this.f();
                    ReleaseLogUtil.d("HWhealthLinkage_CourseLinkageReverse", "StartHandlerCallback startSport");
                }
                return true;
            }
            LogUtil.j("CourseLinkageReverse", "no support message : ", Integer.valueOf(message.what));
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, Bundle bundle) {
        this.d = i;
        if (bundle != null) {
            this.f34051b = bundle.getLong("startSportTime");
            ReleaseLogUtil.d("HWhealthLinkage_CourseLinkageReverse", " startTime:", Long.valueOf(this.f34051b));
        }
    }

    @Override // defpackage.fhg
    public void a() {
        this.e = false;
        ExtendHandler extendHandler = this.f34057c;
        if (extendHandler != null) {
            extendHandler.quit(false);
        }
        super.a();
    }
}
