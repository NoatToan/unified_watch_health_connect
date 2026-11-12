package com.xiaomi.fitness.sport.view.launch.gym.setting;

import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport_manager_export.data.FinishSportData;
import com.xiaomi.fitness.sport_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_manager_export.data.SportLocationResult;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteData;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener;
import com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener;
import com.xiaomi.fitness.webview.WebViewActivity;
import defpackage.kad;
import defpackage.x7r;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 42\u00020\u00012\u00020\u00022\u00020\u0003:\u00014B\u0007¢\u0006\u0004\b3\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u0006J\u000f\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u0006J+\u0010!\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J\u0019\u0010)\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*R\u001a\u0010,\u001a\u00020+8\u0006X\u0086D¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00065"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/gym/setting/GuideWebViewActivity;", "Lcom/xiaomi/fitness/webview/WebViewActivity;", "Lcom/xiaomi/fitness/sport_manager_export/listener/ISportStateChangedListener;", "Lcom/xiaomi/fitness/sport_manager_export/listener/ISportDataChangedListener;", "", "postStartEvent", "()V", "postSpeedEvent", "initView", "Lkad;", "getJavaScriptInterface", "()Lkad;", "", "code", "startTime", "timeZone", DailyRecordKey.sportType, "sportLaunchType", "onSportStarted", "(IIIII)V", "Lcom/xiaomi/fitness/sport_manager_export/data/PhoneSportData;", "phoneSportData", "onPhoneDataChanged", "(Lcom/xiaomi/fitness/sport_manager_export/data/PhoneSportData;)V", LifecycleConstantKt.ON_DESTROY, "onSportRestarted", "onSportPaused", "", "validSport", "", "ids", "Lcom/xiaomi/fitness/sport_manager_export/data/FinishSportData;", "finishSportData", "onSportFinished", "(Z[BLcom/xiaomi/fitness/sport_manager_export/data/FinishSportData;)V", "Lx7r;", "wearSportData", "onReceiveWearData", "(Lx7r;)V", "Lcom/xiaomi/fitness/sport_manager_export/data/SportLocationResult;", "location", "onLocationChanged", "(Lcom/xiaomi/fitness/sport_manager_export/data/SportLocationResult;)V", "", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "Lcom/xiaomi/fitness/webview/a;", "webViewBusinessHelper", "Lcom/xiaomi/fitness/webview/a;", "<init>", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class GuideWebViewActivity extends WebViewActivity implements ISportStateChangedListener, ISportDataChangedListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String MACHINE_GUIDE_STEP_SPEED = "step_speed";

    @NotNull
    public static final String MACHINE_GUIDE_STEP_START = "step_start";
    private static boolean isSportStart;
    private static boolean isWelcome;

    @NotNull
    private final String TAG = "GuideWebViewActivity";

    @Nullable
    private com.xiaomi.fitness.webview.a webViewBusinessHelper;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/gym/setting/GuideWebViewActivity$Companion;", "", "<init>", "()V", "MACHINE_GUIDE_STEP_START", "", "MACHINE_GUIDE_STEP_SPEED", "isWelcome", "", "()Z", "setWelcome", "(Z)V", "isSportStart", "setSportStart", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isSportStart() {
            return GuideWebViewActivity.isSportStart;
        }

        public final boolean isWelcome() {
            return GuideWebViewActivity.isWelcome;
        }

        public final void setSportStart(boolean z) {
            GuideWebViewActivity.isSportStart = z;
        }

        public final void setWelcome(boolean z) {
            GuideWebViewActivity.isWelcome = z;
        }
    }

    private final void postSpeedEvent() {
        Logger.d(this.TAG, "postSpeedEvent");
        com.xiaomi.fitness.webview.a aVar = this.webViewBusinessHelper;
        if (aVar != null) {
            aVar.o("step_speed");
        }
    }

    private final void postStartEvent() {
        Logger.d(this.TAG, "postStartEvent");
        com.xiaomi.fitness.webview.a aVar = this.webViewBusinessHelper;
        if (aVar != null) {
            aVar.o("step_start");
        }
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity
    @NotNull
    public kad getJavaScriptInterface() {
        return new GuideJavaScriptImpl(this, this);
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity
    public void initView() {
        super.initView();
        Logger.i(this.TAG, "initView");
        isWelcome = true;
        SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).addSportStateChangedListener(GuideWebViewActivity.class, this);
        SportManagerExtKt.getInstance(ISportRemoteData.INSTANCE).addSportDataChangedListener(GuideWebViewActivity.class, this);
        this.webViewBusinessHelper = new com.xiaomi.fitness.webview.a(new WeakReference(this), new WeakReference(getWebView()));
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity, com.xiaomi.fitness.webview.Hilt_WebViewActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        isWelcome = false;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener
    public void onLocationChanged(@Nullable SportLocationResult location) {
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener
    public void onPhoneDataChanged(@Nullable PhoneSportData phoneSportData) {
        int i;
        if (phoneSportData == null || (i = phoneSportData.pace) <= 0) {
            return;
        }
        double d = 3600 / i;
        if (d <= 2.7d || d >= 3.3d) {
            return;
        }
        postSpeedEvent();
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener
    public void onReceiveWearData(@Nullable x7r wearSportData) {
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportFinished(boolean validSport, @Nullable byte[] ids, @Nullable FinishSportData finishSportData) {
        isSportStart = false;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportPaused() {
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportRestarted() {
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportSegment(int i, int i2) {
        ISportStateChangedListener.DefaultImpls.onSportSegment(this, i, i2);
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportStarted(int code, int startTime, int timeZone, int sportType, int sportLaunchType) {
        postStartEvent();
        isSportStart = true;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void preSport() {
        ISportStateChangedListener.DefaultImpls.preSport(this);
    }
}
