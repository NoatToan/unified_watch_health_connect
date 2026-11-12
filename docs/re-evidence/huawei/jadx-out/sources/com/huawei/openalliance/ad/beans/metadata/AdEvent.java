package com.huawei.openalliance.ad.beans.metadata;

import android.text.TextUtils;
import com.huawei.openalliance.ad.annotations.a;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.dg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class AdEvent {
    public static final String TAG = "AdEvent";
    private Integer adReqSource;
    private String agVerifyCode;
    private Integer appDownloadRelatedActionSource;
    private String appVersionCode;
    private String clickComponent;
    private Long clickDTime;
    private Float clickDownPressure;
    private Integer clickDownScrollHeight;
    private Float clickDownSize;
    private String clickPos;
    private String clickSuccessDestination;
    private Long clickUTime;
    private Float clickUpPressure;
    private Integer clickUpScrollHeight;
    private Float clickUpSize;
    private Integer clickUpX;
    private Integer clickUpY;
    private Integer clickX;
    private Integer clickY;
    private List<String> closeReason;
    private List<String> closeReasonType;
    private Integer contentDownMethod;
    private String creativeSize;
    private String customData;
    private Integer downloadDuration;
    private Integer downloadMode;
    private Integer downloadReason;
    private Long downloadSize;
    private Integer encodingMode;
    private Integer exposure;

    @a
    private String ext;
    private Integer fullDownload;
    private Integer impSource;
    private Integer installRelatedActionSource;
    private String installType;
    private Integer intentDestination;
    private Integer intentFailReason;
    private Integer isAdContainerSizeMatched;
    private String lastFailReason;
    private String lastReportTime;
    private Integer maxShowRatio;
    private int opTimesInLandingPage;

    @a
    private ParamFromServer paramfromserver;
    private Integer playedDuration;
    private String playedProgress;
    private Integer playedTime;
    private Integer preCheckResult;
    private List<String> preContentSuccessList;
    private int rawX;
    private int rawY;
    private String realFailedReason;
    private long repeatedCount;
    private Integer requestType;
    private String seq;
    private String shakeAngle;
    private Long showTimeDuration;
    private String showid;
    private Integer sld;
    private String slotPosition;
    private Long startShowTime;
    private long time;
    private String type;
    private String userId;

    @a
    private String venusExt;
    private Integer videoPlayEndProgress;
    private Long videoPlayEndTime;
    private Integer videoPlayStartProgress;
    private Long videoPlayStartTime;

    public void z(Integer num) {
        this.clickUpY = num;
    }

    public void y(Integer num) {
        this.clickUpX = num;
    }

    public void x(Integer num) {
        this.adReqSource = num;
    }

    public void w(Integer num) {
        this.encodingMode = num;
    }

    public void v(Integer num) {
        this.playedDuration = num;
    }

    public void u(Integer num) {
        this.playedTime = num;
    }

    public void t(String str) {
        this.shakeAngle = str;
    }

    public void t(Integer num) {
        this.sld = num;
    }

    public void s(String str) {
        this.slotPosition = str;
    }

    public void s(Integer num) {
        this.clickY = num;
    }

    public void r(String str) {
        this.playedProgress = str;
    }

    public void r(Integer num) {
        this.clickX = num;
    }

    public void q(String str) {
        this.venusExt = str;
    }

    public void q(Integer num) {
        this.isAdContainerSizeMatched = num;
    }

    public void p(String str) {
        this.creativeSize = str;
    }

    public void p(Integer num) {
        this.requestType = num;
    }

    public void o(String str) {
        this.installType = str;
    }

    public void o(Integer num) {
        this.exposure = num;
    }

    public void n(String str) {
        this.agVerifyCode = str;
    }

    public void n(Integer num) {
        this.downloadMode = num;
    }

    public void m(String str) {
        this.userId = str;
    }

    public void m(Integer num) {
        this.downloadReason = num;
    }

    public void l(String str) {
        this.customData = str;
    }

    public void l(Integer num) {
        this.fullDownload = num;
    }

    public void k(String str) {
        this.realFailedReason = str;
    }

    public void k(Integer num) {
        this.downloadDuration = num;
    }

    public void j(String str) {
        this.appVersionCode = str;
    }

    public void j(Integer num) {
        this.impSource = num;
    }

    public void i(String str) {
        this.lastFailReason = str;
    }

    public void i(Integer num) {
        this.preCheckResult = num;
    }

    public void h(String str) {
        this.lastReportTime = str;
    }

    public void h(Integer num) {
        this.installRelatedActionSource = num;
    }

    public void g(String str) {
        this.ext = str;
    }

    public void g(Long l) {
        this.clickUTime = l;
    }

    public void g(Integer num) {
        this.appDownloadRelatedActionSource = num;
    }

    public void f(String str) {
        if (TextUtils.isEmpty(str)) {
            hw.b(TAG, "clickPos is invalid");
        } else {
            this.clickPos = str;
        }
    }

    public void f(Long l) {
        this.clickDTime = l;
    }

    public void f(Integer num) {
        this.intentFailReason = num;
    }

    public void e(String str) {
        if (TextUtils.isEmpty(str)) {
            hw.b(TAG, "clickComponent is invalid");
        } else {
            this.clickComponent = str;
        }
    }

    public void e(Long l) {
        this.startShowTime = l;
    }

    public void e(Integer num) {
        this.intentDestination = num;
    }

    public void d(String str) {
        this.seq = str;
    }

    public void d(Long l) {
        this.downloadSize = l;
    }

    public void d(Integer num) {
        this.contentDownMethod = num;
    }

    public void d(Float f) {
        this.clickUpSize = f;
    }

    public void c(List<String> list) {
        this.preContentSuccessList = list;
    }

    public void c(String str) {
        this.type = str;
    }

    public void c(Long l) {
        this.videoPlayEndTime = l;
    }

    public void c(Integer num) {
        this.videoPlayEndProgress = num;
    }

    public void c(Float f) {
        this.clickDownSize = f;
    }

    public void c(int i) {
        this.opTimesInLandingPage = i;
    }

    public void b(List<String> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.closeReasonType = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.closeReasonType.add(dg.f(it.next()));
        }
    }

    public void b(String str) {
        this.showid = str;
    }

    public void b(Long l) {
        this.videoPlayStartTime = l;
    }

    public void b(Integer num) {
        this.videoPlayStartProgress = num;
    }

    public void b(Float f) {
        this.clickUpPressure = f;
    }

    public void b(long j) {
        this.repeatedCount = j;
    }

    public void b(int i) {
        this.rawY = i;
    }

    public void a(List<String> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.closeReason = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.closeReason.add(dg.f(it.next()));
        }
    }

    public void a(String str) {
        this.clickSuccessDestination = str;
    }

    public void a(Long l) {
        this.showTimeDuration = l;
    }

    public void a(Integer num) {
        this.maxShowRatio = num;
    }

    public void a(Float f) {
        this.clickDownPressure = f;
    }

    public void a(ParamFromServer paramFromServer) {
        this.paramfromserver = paramFromServer;
    }

    public void a(long j) {
        this.time = j;
    }

    public void a(int i) {
        this.rawX = i;
    }

    public String a() {
        return this.type;
    }

    public void B(Integer num) {
        this.clickUpScrollHeight = num;
    }

    public void A(Integer num) {
        this.clickDownScrollHeight = num;
    }
}
