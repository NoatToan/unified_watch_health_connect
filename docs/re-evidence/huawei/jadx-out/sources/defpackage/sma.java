package defpackage;

import android.media.session.PlaybackState;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.JavascriptInterface;
import android.widget.RelativeLayout;
import androidx.core.util.Consumer;
import com.alipay.sdk.m.s.e;
import com.google.android.gms.common.util.BiConsumer;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.h5pro.core.H5ProBundle;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.h5pro.vengine.H5ProViewControls;
import com.huawei.health.musicservice.api.IAudioPlayer;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriberAdapter;
import com.huawei.ui.homehealth.healthheadlinecard.bottomplayer.BottomPlayerView;
import com.huawei.ui.homehealth.healthheadlinecard.utils.MediaCenterCallback;
import com.huawei.ui.main.R;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class sma extends JsBaseModule {
    private static final Float e = Float.valueOf(1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BottomPlayerView f48345b;
    private H5ProViewControls d;
    private Runnable j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final smp f48344a = smp.b();
    private final d h = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f48346c = false;

    private int d(int i) {
        if (i == 3) {
            return 1;
        }
        if (i == 99) {
            return i;
        }
        return 0;
    }

    final class d extends MediaStatusSubscriberAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ConcurrentHashMap<String, Long> f48349a;

        private d() {
            this.f48349a = new ConcurrentHashMap<>();
        }

        void c(String str, long j) {
            this.f48349a.put(str, Long.valueOf(j));
        }

        @Override // com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriberAdapter, com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriber
        public void onPlaybackStateChanged(PlaybackState playbackState) {
            Iterator<Long> it = this.f48349a.values().iterator();
            while (it.hasNext()) {
                sma.this.c(it.next().longValue(), "onPlaybackStateChanged");
            }
        }

        @Override // com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriberAdapter, com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriber
        public void onMediaChanged(gdy gdyVar, int i) {
            Iterator<Long> it = this.f48349a.values().iterator();
            while (it.hasNext()) {
                sma.this.e(it.next().longValue(), "onMediaChanged", i);
            }
            sma.this.e();
            sma.this.f48346c = false;
        }

        @Override // com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriberAdapter, com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriber
        public void onProgressChanged(int i, int i2, float f, int i3) {
            Iterator<Long> it = this.f48349a.values().iterator();
            while (it.hasNext()) {
                sma.this.a(it.next().longValue(), "onProgressChanged");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(long j, String str) {
        e(j, str, this.f48344a.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j, String str) {
        String strD = this.f48344a.j().d();
        int iD = d(this.f48344a.q());
        float fK = this.f48344a.k();
        int iR = this.f48344a.r();
        String strH = this.f48344a.j().h();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playprogressTime", iR);
            jSONObject.put("playProgress", fK);
            jSONObject.put(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID, strH);
            jSONObject.put("time", strD);
            jSONObject.put("playStatus", iD);
            onSuccessCallback(j, jSONObject);
            LogUtil.a("HealthHeadLinesInnerApi", str, " callbackProgressToH5 callbackId = ", Long.valueOf(j), ", params = ", jSONObject);
        } catch (JSONException e2) {
            onFailureCallback(j, e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(long j, String str, int i) {
        int iD;
        int iA = smp.b().a();
        LogUtil.a("HealthHeadLinesInnerApi", "getCurrentHomePageState = ", Integer.valueOf(iA));
        if (iA == 3) {
            iD = 1;
        } else {
            iD = iA == 6 ? 3 : d(this.f48344a.q());
        }
        gdy gdyVarJ = this.f48344a.j();
        String strD = gdyVarJ.d();
        String strH = gdyVarJ.h();
        float fK = this.f48344a.k();
        int iR = this.f48344a.r();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playStatus", iD);
            jSONObject.put(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID, strH);
            jSONObject.put("time", strD);
            jSONObject.put("playprogressTime", iR);
            jSONObject.put("playProgress", fK);
            jSONObject.put("index", i);
            onSuccessCallback(j, jSONObject);
            LogUtil.a("HealthHeadLinesInnerApi", str, " callbackToH5 callbackId = ", Long.valueOf(j), ", params = ", jSONObject);
        } catch (JSONException e2) {
            onFailureCallback(j, e2.getMessage());
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule
    public void onCreate(H5ProBundle h5ProBundle) {
        super.onCreate(h5ProBundle);
        LogUtil.a("HealthHeadLinesInnerApi", "onCreate");
        this.d = b();
        this.f48344a.e(this.h);
        this.f48344a.d(this);
    }

    @Override // com.huawei.health.h5pro.jsbridge.base.JsBaseModule, com.huawei.health.h5pro.jsbridge.base.JsModuleBase
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("HealthHeadLinesInnerApi", "onDestroy");
        this.f48344a.b(this.h);
        this.f48344a.e(this);
        this.d = null;
    }

    public H5ProViewControls b() {
        if (this.mH5ProInstance == null) {
            LogUtil.e("HealthHeadLinesInnerApi", "getH5ProViewControls failed, cause mH5ProInstance is null!");
            return null;
        }
        return this.mH5ProInstance.getViewControls();
    }

    @JavascriptInterface
    public void postInfo(long j, String str) {
        LogUtil.a("HealthHeadLinesInnerApi", "H5 callback postInfo callbackId = ", Long.valueOf(j), ", params = ", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID);
            String strOptString2 = jSONObject.optString("audioId");
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = this.f48344a.a(strOptString2);
            }
            if (TextUtils.isEmpty(strOptString)) {
                LogUtil.e("HealthHeadLinesInnerApi", "postInfo empty with workoutId = ", strOptString, ", audioId = ", strOptString2);
            }
            int iB = this.f48344a.b(strOptString);
            if (iB < 0) {
                LogUtil.e("HealthHeadLinesInnerApi", "postInfo failed, cause not found mediaId = ", strOptString, " in list!");
            } else {
                this.f48344a.b(iB, 3);
            }
        } catch (JSONException unused) {
            onFailureCallback(j, "loadH5ProApp fail:param invalid");
        }
    }

    @JavascriptInterface
    public boolean isNeedShowMobileDataDialog() {
        LogUtil.a("HealthHeadLinesInnerApi", "isNeedShowWifiDialog enter.");
        return sog.e();
    }

    @JavascriptInterface
    public void checkMobileDataDialogBeforePlay(final long j) {
        sog.d(new MediaCenterCallback() { // from class: sma.2
            @Override // com.huawei.ui.homehealth.healthheadlinecard.utils.MediaCenterCallback
            public void onResponse(int i, String str) {
                LogUtil.a("HealthHeadLinesInnerApi", "checkMobileDataDialogBeforePlay when play = ", Integer.valueOf(i));
                if (i == 0) {
                    sma.this.onSuccessCallback(j, "success");
                } else {
                    sma.this.onSuccessCallback(j, ParamConstants.CallbackMethod.ON_FAIL);
                }
            }
        });
    }

    @JavascriptInterface
    public void getPlayStatus(long j) {
        LogUtil.a("HealthHeadLinesInnerApi", "H5 callback getPlayStatus callbackId = ", Long.valueOf(j));
        this.h.c("getPlayStatus", j);
        c(j, "getPlayStatus");
    }

    @JavascriptInterface
    public void changePlayStatus(final long j, String str) {
        LogUtil.a("HealthHeadLinesInnerApi", "H5 callback changePlayStatus callbackId = ", Long.valueOf(j), ", params = ", str);
        try {
            final int iOptInt = new JSONObject(str).optInt("playStatus");
            if (!this.f48344a.c("H5changePlayStatus")) {
                Consumer<Boolean> consumer = new Consumer() { // from class: com.huawei.ui.homehealth.healthheadlinecard.HealthHeadLinesInnerApi$$ExternalSyntheticLambda0
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        this.e.a(iOptInt, j, (Boolean) obj);
                    }
                };
                List<gdy> listU = this.f48344a.u();
                List<snk> listW = this.f48344a.w();
                if (njy.e(listU) || njy.e(listW)) {
                    LogUtil.e("HealthHeadLinesInnerApi", "playWithInitList failed cause play list is empty!");
                    return;
                }
                smp smpVar = this.f48344a;
                smpVar.d(listU, listW, smpVar.f(), consumer);
                this.f48344a.y();
                return;
            }
            int iQ = this.f48344a.q();
            if (iOptInt == 1) {
                if (iQ == 2) {
                    this.f48344a.z();
                } else {
                    smp smpVar2 = this.f48344a;
                    smpVar2.c(smpVar2.f());
                }
                onSuccessCallback(j, "success");
                return;
            }
            if (iOptInt != 1 && iQ == 3) {
                this.f48344a.ac();
                onSuccessCallback(j, "success");
            } else {
                LogUtil.j("HealthHeadLinesInnerApi", "changePlayStatus playStatus is ", Integer.valueOf(iOptInt), ", lastPlayStatus = ", Integer.valueOf(iQ));
                onSuccessCallback(j, "no need to changePlayStatus");
            }
        } catch (JSONException unused) {
            onFailureCallback(j, "loadH5ProApp fail:param invalid");
        }
    }

    public /* synthetic */ void a(int i, long j, Boolean bool) {
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        if (i == 1) {
            smp smpVar = this.f48344a;
            smpVar.c(smpVar.f());
        } else {
            this.f48344a.ac();
        }
        onSuccessCallback(j, "success");
    }

    @JavascriptInterface
    public void changePlayProgress(long j, String str) {
        LogUtil.a("HealthHeadLinesInnerApi", "H5 callback changePlayProgress callbackId = ", Long.valueOf(j), ", params = ", str);
        try {
            double dOptDouble = new JSONObject(str).optDouble("playProgress");
            LogUtil.a("HealthHeadLinesInnerApi", "changePlayProgress playProgress is ", Double.valueOf(dOptDouble));
            this.f48344a.d((long) (dOptDouble * this.f48344a.g()));
        } catch (JSONException unused) {
            onFailureCallback(j, "loadH5ProApp fail:param invalid");
        }
    }

    @JavascriptInterface
    public void isShowEntrance(long j) {
        LogUtil.a("HealthHeadLinesInnerApi", "isShowEntrance ", Boolean.valueOf(slq.a()));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isShowEntrance", slq.a());
            onSuccessCallback(j, jSONObject);
        } catch (JSONException unused) {
            onFailureCallback(j, "isShowEntrance error");
        }
    }

    @JavascriptInterface
    public void changeEntranceStatus(long j, String str) {
        LogUtil.a("HealthHeadLinesInnerApi", "changeEntranceStatus");
        try {
            boolean zOptBoolean = new JSONObject(str).optBoolean("isShowEntrance");
            LogUtil.a("HealthHeadLinesInnerApi", "changeEntranceStatus isShowEntrance ", Boolean.valueOf(zOptBoolean));
            slq.c(zOptBoolean);
            ObserverManagerUtil.e("HOME_RECYCLE_VIEW_MOVE", Boolean.valueOf(zOptBoolean), true);
            onSuccessCallback(j, "success");
        } catch (JSONException unused) {
            onFailureCallback(j, "loadH5ProApp fail:param invalid");
        }
    }

    @JavascriptInterface
    public void isEntranceBeResident(long j, String str) {
        try {
            boolean zOptBoolean = new JSONObject(str).optBoolean("isEntranceBeResident");
            LogUtil.a("HealthHeadLinesInnerApi", "isEntranceBeResident: ", Boolean.valueOf(zOptBoolean));
            if (zOptBoolean) {
                slq.e(zOptBoolean);
                onSuccessCallback(j, "success");
            } else {
                onFailureCallback(j, "not beyond 3");
            }
        } catch (JSONException unused) {
            onFailureCallback(j, "loadH5ProApp fail:param invalid");
        }
    }

    private boolean a(String str, int i) {
        if (str == null || str.equals(Constants.NULL)) {
            ReleaseLogUtil.e("R_HealthHeadLinesInnerApi", "selMediaId is null.");
            return false;
        }
        int iQ = this.f48344a.q();
        boolean zEquals = TextUtils.equals(str, this.f48344a.n());
        if (iQ == 3 && zEquals) {
            ReleaseLogUtil.d("R_HealthHeadLinesInnerApi", "Current media is playing.");
            return true;
        }
        if ((iQ == 2 || iQ == 1) && zEquals) {
            ReleaseLogUtil.d("R_HealthHeadLinesInnerApi", "Current media is not playing. set play to continue.");
            this.f48344a.b(i);
            return true;
        }
        int iB = this.f48344a.b(str);
        if (iB < 0) {
            ReleaseLogUtil.e("R_HealthHeadLinesInnerApi", "skipToListSelMediaIfNeeded failed, cause not found selMediaId = ", str, " in list!");
            return false;
        }
        this.f48344a.b(iB, i);
        return true;
    }

    @JavascriptInterface
    public void getPlayList(final long j, String str) {
        LogUtil.a("HealthHeadLinesInnerApi", "H5 callback getPlayList callbackId = ", Long.valueOf(j), ", params = ", str);
        this.f48344a.d("2");
        this.f48344a.g("2");
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean zOptBoolean = jSONObject.optBoolean("isLocalList");
            final int iOptInt = jSONObject.optInt("type");
            final String strOptString = jSONObject.optString(e.n);
            final int iOptInt2 = jSONObject.optInt("pageNum");
            final String strOptString2 = jSONObject.optString(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID);
            final boolean zOptBoolean2 = jSONObject.optBoolean("isUseForPlay");
            String strOptString3 = jSONObject.optString("time");
            LogUtil.a("HealthHeadLinesInnerApi", "getPlayList type: ", Integer.valueOf(iOptInt), " lectureOrTopicId: ", strOptString, " pageNum: ", Integer.valueOf(iOptInt2), " workoutId: ", strOptString2, " isUserForPlay: ", Boolean.valueOf(zOptBoolean2));
            this.f48346c = !strOptString2.equals(this.f48344a.j().h());
            if (!CommonUtil.ab(this.mContext)) {
                qpx.b(this.mContext, this.mContext.getResources().getString(R.string.IDS_network_connect_error));
                onFailureCallback(j, "netWork is disConnected");
            }
            Consumer consumer = new Consumer() { // from class: com.huawei.ui.homehealth.healthheadlinecard.HealthHeadLinesInnerApi$$ExternalSyntheticLambda3
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    this.f25539b.a(j, iOptInt2, (JSONArray) obj);
                }
            };
            BiConsumer<List<gdy>, List<snk>> biConsumer = new BiConsumer() { // from class: smj
                @Override // com.google.android.gms.common.util.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    this.e.d(zOptBoolean2, strOptString2, iOptInt, iOptInt2, strOptString, j, (List) obj, (List) obj2);
                }
            };
            List<snk> listD = zOptBoolean ? this.f48344a.d() : null;
            this.f48344a.f(iOptInt);
            switch (iOptInt) {
                case 1:
                case 3:
                case 10:
                    onFailureCallback(j, "loadH5ProApp fail:type invalid");
                    break;
                case 2:
                case 6:
                    skz.d(biConsumer, strOptString2, iOptInt2, strOptString3);
                    break;
                case 4:
                    skz.b((Consumer<JSONArray>) consumer, biConsumer, listD);
                    break;
                case 5:
                    skz.c(consumer, biConsumer, listD);
                    break;
                case 7:
                    skz.b(strOptString, consumer, biConsumer, listD);
                    this.f48344a.d(strOptString);
                    break;
                case 8:
                case 9:
                    sky.e().d(strOptString, biConsumer, iOptInt2);
                    this.f48344a.g(strOptString);
                    break;
            }
        } catch (JSONException unused) {
            onFailureCallback(j, "loadH5ProApp fail:parameter invalid");
        }
    }

    public /* synthetic */ void a(long j, int i, JSONArray jSONArray) {
        if (jSONArray == null) {
            LogUtil.e("HealthHeadLinesInnerApi", "fetch h5 play list failed, return!");
        } else {
            c(j, i, jSONArray);
        }
    }

    /* synthetic */ void d(final boolean z, final String str, final int i, int i2, String str2, long j, List list, List list2) {
        JSONArray jSONArrayC;
        boolean zC = this.f48344a.c("H5getPlayList");
        Consumer<Boolean> consumer = new Consumer() { // from class: com.huawei.ui.homehealth.healthheadlinecard.HealthHeadLinesInnerApi$$ExternalSyntheticLambda1
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.d.d(z, str, i, (Boolean) obj);
            }
        };
        int size = 0;
        boolean z2 = i == 2 || i == 6;
        boolean z3 = i == 8 || i == 9;
        if (njy.b(list) && njy.b(list2)) {
            if (z2) {
                c(list, list2, zC, str, consumer);
                if (i2 == 0) {
                    this.f48344a.y();
                }
            } else if (i2 == 0) {
                c(list, list2, zC, str, consumer);
                this.f48344a.y();
            } else if (z3 && i2 > 0 && sky.e().d(i2, str2)) {
                this.f48344a.e((List<gdy>) list, (List<snk>) list2);
            }
        }
        if (z2) {
            size = 30;
        } else if (z3) {
            size = 20;
        } else if (list2 != null) {
            size = list2.size();
        }
        if (!z3) {
            jSONArrayC = skz.a((List<snk>) list2, i2, size);
        } else {
            jSONArrayC = skz.c((List<snk>) list2);
        }
        LogUtil.a("HealthHeadLinesInnerApi", "nativePlayerListCallback callbackId = ", Long.valueOf(j), ", pageNum = ", Integer.valueOf(i2), ", h5JsonArray = ", jSONArrayC);
        c(j, i2, jSONArrayC);
        if (zC) {
            consumer.accept(true);
        }
    }

    public /* synthetic */ void d(boolean z, String str, int i, Boolean bool) {
        if (bool != null && bool.booleanValue() && z) {
            ReleaseLogUtil.d("R_HealthHeadLinesInnerApi", "need to play! selMediaId = ", str);
            if (a(str, i)) {
                smp.b().i(3);
            } else {
                LogUtil.a("HealthHeadLinesInnerApi", "skipToListSelMediaIfNeeded fail.");
                smp.b().i(99);
            }
        }
    }

    private void c(List<gdy> list, List<snk> list2, boolean z, String str, Consumer<Boolean> consumer) {
        smp smpVar = this.f48344a;
        int iF = smpVar.f();
        if (z) {
            consumer = null;
        }
        smpVar.d(list, list2, iF, consumer);
        int iB = this.f48344a.b(str);
        LogUtil.a("HealthHeadLinesInnerApi", "aboutToPlayIndex in setPlayList : ", Integer.valueOf(iB));
        if (iB >= 0) {
            this.f48344a.e(iB);
        }
    }

    @JavascriptInterface
    public void deleteWorkoutId(long j, String str) {
        LogUtil.a("HealthHeadLinesInnerApi", "H5 callback deleteWorkoutId callbackId = ", Long.valueOf(j), ", params = ", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("deleteWorkoutId");
            LogUtil.a("HealthHeadLinesInnerApi", "deleteWorkoutId: ", strOptString, " deleteAudioId: ", jSONObject.optString("deleteAudioId"));
            this.f48344a.e(strOptString);
        } catch (JSONException unused) {
            onFailureCallback(j, "loadH5ProApp fail:parameter invalid");
        }
    }

    private void j() {
        if (this.f48345b == null) {
            LogUtil.j("HealthHeadLinesInnerApi", "mBottomPlayerView == null in refreshMiniPlayerUi.");
            return;
        }
        this.f48345b.b(this.f48344a.j(), this.f48344a.q(), this.f48344a.o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void a() {
        RelativeLayout.LayoutParams layoutParams;
        if (this.d == null) {
            LogUtil.j("HealthHeadLinesInnerApi", "showMiniPlayer mH5ProViewControls == null.");
            return;
        }
        LogUtil.a("HealthHeadLinesInnerApi", "showMiniPlayer mBottomPlayerView begin = ", this.f48345b);
        if (this.f48345b != null) {
            this.d.removeAllNativeView();
            this.d.showNativeView(this.f48345b);
            j();
            return;
        }
        if (this.mContext == null) {
            LogUtil.j("HealthHeadLinesInnerApi", "showMiniPlayer mContext = null.");
            return;
        }
        this.f48345b = new BottomPlayerView(BaseApplication.b(), this);
        qjb.c().c(this.f48345b);
        qjb.c().d(true);
        ViewGroup.LayoutParams layoutParams2 = this.f48345b.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(layoutParams2);
        }
        layoutParams.addRule(12);
        layoutParams.addRule(14);
        this.f48345b.setLayoutParams(layoutParams);
        LogUtil.a("HealthHeadLinesInnerApi", "showMiniPlayer mBottomPlayerView created = ", this.f48345b);
        if (this.d != null) {
            LogUtil.a("HealthHeadLinesInnerApi", "mH5ProViewControls not null, show minibar");
            this.d.showNativeView(this.f48345b);
        }
        j();
    }

    private void a(long j) {
        d();
        onSuccessCallback(j);
    }

    public void d() {
        BottomPlayerView bottomPlayerView = this.f48345b;
        if (bottomPlayerView != null) {
            bottomPlayerView.e();
        }
        H5ProViewControls h5ProViewControls = this.d;
        if (h5ProViewControls == null) {
            LogUtil.e("HealthHeadLinesInnerApi", "hideMiniPlayer failed, mH5ProViewControls is null!");
            return;
        }
        h5ProViewControls.removeAllNativeView();
        LogUtil.a("HealthHeadLinesInnerApi", "hideMiniPlayer done mBottomPlayerView = ", this.f48345b);
        this.f48345b = null;
    }

    public void c() {
        LogUtil.a("HealthHeadLinesInnerApi", "hideMiniPlayer start.");
        BottomPlayerView bottomPlayerView = this.f48345b;
        if (bottomPlayerView != null) {
            bottomPlayerView.e();
            ViewParent parent = this.f48345b.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f48345b);
                LogUtil.a("HealthHeadLinesInnerApi", "mBottomPlayerView removed from parent view tree successfully.");
            } else {
                this.f48345b.setVisibility(8);
            }
        }
        qjb.c().d(false);
        qjb.c().c((View) null);
        this.f48345b = null;
        H5ProViewControls h5ProViewControls = this.d;
        if (h5ProViewControls == null) {
            LogUtil.e("HealthHeadLinesInnerApi", "hideMiniPlayer failed, mH5ProViewControls is null!");
        } else {
            h5ProViewControls.removeAllNativeView();
            LogUtil.a("HealthHeadLinesInnerApi", "hideMiniPlayer done via mH5ProViewControls");
        }
    }

    @JavascriptInterface
    public void showMiniPlayer(long j, String str) {
        LogUtil.a("HealthHeadLinesInnerApi", "H5 callback showMiniPlayer callbackId = ", Long.valueOf(j), ", params = ", str);
        try {
            boolean zOptBoolean = new JSONObject(str).optBoolean("showMiniPlayer");
            if (!CommonUtil.ab(this.mContext)) {
                LogUtil.e("HealthHeadLinesInnerApi", "netWork is disConnected");
                onFailureCallback(j, "netWork is disConnected");
                return;
            }
            if (zOptBoolean) {
                LogUtil.a("HealthHeadLinesInnerApi", "showMiniPlayer currentItem = ", this.f48344a.j().h(), ", mIsSkippingToOtherMedia = ", Boolean.valueOf(this.f48346c));
                if (!TextUtils.isEmpty(this.f48344a.j().h()) && !this.f48346c) {
                    if (e()) {
                        return;
                    }
                    a();
                    return;
                } else {
                    LogUtil.a("HealthHeadLinesInnerApi", "do not showMiniPlayer now, to schedule as a task!");
                    this.j = new Runnable() { // from class: smg
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f48360b.a();
                        }
                    };
                    return;
                }
            }
            LogUtil.a("HealthHeadLinesInnerApi", "hideMiniPlayer now");
            a(j);
        } catch (JSONException unused) {
            onFailureCallback(j, "loadH5ProApp fail:parameter invalid");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e() {
        Runnable runnable = this.j;
        if (runnable != null) {
            runnable.run();
            this.j = null;
            LogUtil.a("HealthHeadLinesInnerApi", "executeShowMiniPlayerTask true");
            return true;
        }
        LogUtil.a("HealthHeadLinesInnerApi", "executeShowMiniPlayerTask false");
        return false;
    }

    @JavascriptInterface
    public void setPlayMode(long j, String str) {
        try {
            IAudioPlayer.PlayMode playModeB = b(new JSONObject(str).optInt("playMode"));
            LogUtil.a("HealthHeadLinesInnerApi", "H5 callback setPlayMode callbackId = ", Long.valueOf(j), ", params = ", str, ", playMode = ", playModeB.name());
            this.f48344a.b(playModeB);
        } catch (JSONException unused) {
            onFailureCallback(j, "loadH5ProApp fail:parameter invalid");
        }
    }

    private IAudioPlayer.PlayMode b(int i) {
        if (i == 2) {
            return IAudioPlayer.PlayMode.RANDOM_CIRCLE;
        }
        if (i == 3) {
            return IAudioPlayer.PlayMode.SEQUENCE_CIRCLE;
        }
        if (i == 5) {
            return IAudioPlayer.PlayMode.PLAY_ONCE;
        }
        return IAudioPlayer.PlayMode.SEQUENCE_PLAY;
    }

    /* JADX INFO: renamed from: sma$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[IAudioPlayer.PlayMode.values().length];
            d = iArr;
            try {
                iArr[IAudioPlayer.PlayMode.RANDOM_CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[IAudioPlayer.PlayMode.SEQUENCE_CIRCLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[IAudioPlayer.PlayMode.PLAY_ONCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[IAudioPlayer.PlayMode.SEQUENCE_PLAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private int d(IAudioPlayer.PlayMode playMode) {
        int i = AnonymousClass1.d[playMode.ordinal()];
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 1 : 5;
        }
        return 3;
    }

    @JavascriptInterface
    public void getPlayMode(long j) {
        JSONObject jSONObject = new JSONObject();
        IAudioPlayer.PlayMode playModeM = this.f48344a.m();
        int iD = d(playModeM);
        LogUtil.a("HealthHeadLinesInnerApi", "getPlayMode playMode = ", playModeM.name(), ", callbackId = ", Long.valueOf(j));
        try {
            jSONObject.put("playMode", iD);
            onSuccessCallback(j, jSONObject);
        } catch (JSONException e2) {
            onFailureCallback(j, e2.getMessage());
        }
    }

    @JavascriptInterface
    public void setPlaySpeed(long j, float f) {
        this.f48344a.e(Float.valueOf(f));
        LogUtil.a("HealthHeadLinesInnerApi", "setPlaySpeed parameter = ", Float.valueOf(f));
    }

    @JavascriptInterface
    public void getPlaySpeed(long j) {
        JSONObject jSONObject = new JSONObject();
        float fL = this.f48344a.l();
        this.f48344a.e(Float.valueOf(fL));
        LogUtil.a("HealthHeadLinesInnerApi", "getPlaySpeed callbackId = ", Long.valueOf(j), ", playSpeed = ", Float.valueOf(fL));
        try {
            jSONObject.put("playSpeed", fL);
            onSuccessCallback(j, jSONObject);
        } catch (JSONException e2) {
            onFailureCallback(j, e2.getMessage());
        }
    }

    @JavascriptInterface
    public void changeMusic(long j, String str) {
        LogUtil.a("HealthHeadLinesInnerApi", "H5 callback changeMusic callbackId = ", Long.valueOf(j), ", params = ", str);
        try {
            int iOptInt = new JSONObject(str).optInt("changeMusic");
            this.h.c("changeMusic", j);
            if (iOptInt == 0) {
                this.f48344a.af();
            } else if (iOptInt == 1) {
                this.f48344a.ae();
            } else {
                LogUtil.j("HealthHeadLinesInnerApi", "changeMusic is wrong!");
            }
        } catch (JSONException unused) {
            onFailureCallback(j, "loadH5ProApp fail:parameter invalid");
        }
    }

    private void c(long j, int i, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playList", jSONArray);
            jSONObject.put("pageNum", i);
            onSuccessCallback(j, jSONObject);
        } catch (JSONException e2) {
            onFailureCallback(j, e2.getMessage());
        }
    }
}
