package com.xiaomi.fitness.sport_eco.view.launch.gym.setting;

import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport_eco_manager_export.SportConstants;
import com.xiaomi.fitness.sport_eco_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_eco_manager_export.di.SportEcoManagerExtKt;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteData;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportDataChangedListener;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import com.xiaomi.fitness.webview.WebViewActivity;
import defpackage.kad;
import defpackage.y7r;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 /2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001/B\u0007¢\u0006\u0004\b.\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001a\u0010\u0006J\u000f\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u0006J\u000f\u0010\u001c\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u0006J!\u0010 \u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010$\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%R\u001a\u0010'\u001a\u00020&8\u0006X\u0086D¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u00060"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/GuideWebViewActivity;", "Lcom/xiaomi/fitness/webview/WebViewActivity;", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISportStateChangedListener;", "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/ISportDataChangedListener;", "", "postStartEvent", "()V", "postSpeedEvent", "", "isSupportLinkModel", "()Z", "initView", "Lkad;", "getJavaScriptInterface", "()Lkad;", "", "startTime", "timeZone", DailyRecordKey.sportType, "sportLaunchType", "onSportStarted", "(IIII)V", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/PhoneSportData;", "phoneSportData", "onPhoneDataChanged", "(Lcom/xiaomi/fitness/sport_eco_manager_export/data/PhoneSportData;)V", LifecycleConstantKt.ON_DESTROY, "onSportRestarted", "onSportPaused", "validSport", "", "ids", "onSportFinished", "(Z[B)V", "Ly7r;", "wearSportData", "onReceiveWearData", "(Ly7r;)V", "", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "Lcom/xiaomi/fitness/webview/a;", "webViewBusinessHelper", "Lcom/xiaomi/fitness/webview/a;", "<init>", "Companion", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class GuideWebViewActivity extends WebViewActivity implements ISportStateChangedListener, ISportDataChangedListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String MACHINE_GUIDE_STEP_SPEED = "step_speed";

    @NotNull
    public static final String MACHINE_GUIDE_STEP_START = "step_start";
    private static boolean isSportStart;
    private static boolean isSupportLink;
    private static boolean isWelcome;

    @NotNull
    private final String TAG = "GuideWebViewActivity";

    @Nullable
    private com.xiaomi.fitness.webview.a webViewBusinessHelper;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/GuideWebViewActivity$Companion;", "", "<init>", "()V", "MACHINE_GUIDE_STEP_START", "", "MACHINE_GUIDE_STEP_SPEED", "isWelcome", "", "()Z", "setWelcome", "(Z)V", "isSportStart", "setSportStart", "isSupportLink", "setSupportLink", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isSportStart() {
            return GuideWebViewActivity.isSportStart;
        }

        public final boolean isSupportLink() {
            return GuideWebViewActivity.isSupportLink;
        }

        public final boolean isWelcome() {
            return GuideWebViewActivity.isWelcome;
        }

        public final void setSportStart(boolean z) {
            GuideWebViewActivity.isSportStart = z;
        }

        public final void setSupportLink(boolean z) {
            GuideWebViewActivity.isSupportLink = z;
        }

        public final void setWelcome(boolean z) {
            GuideWebViewActivity.isWelcome = z;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:13:0x0029 A[ORIG_RETURN, RETURN] */
    private final boolean isSupportLinkModel() {
        switch (SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE()) {
            case "yunmai.jmprope.sr803":
                return true;
            case "yunmai.jmprope.sr804":
                return true;
            case "ksmb.treadmill.m1v1":
                return true;
            default:
                return false;
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
        boolean zIsSupportLinkModel = isSupportLinkModel();
        isSupportLink = zIsSupportLinkModel;
        if (zIsSupportLinkModel) {
            SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE).addSportStateChangedListener(GuideWebViewActivity.class, this);
            SportEcoManagerExtKt.getInstance(IEcoSportRemoteData.INSTANCE).addSportDataChangedListener(GuideWebViewActivity.class, this);
        }
        this.webViewBusinessHelper = new com.xiaomi.fitness.webview.a(new WeakReference(this), new WeakReference(getWebView()));
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity, com.xiaomi.fitness.webview.Hilt_WebViewActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        isWelcome = false;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportDataChangedListener
    public void onPhoneDataChanged(@Nullable PhoneSportData phoneSportData) {
        if (phoneSportData == null || phoneSportData.pace <= 0 || !Intrinsics.areEqual(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE(), "ksmb.treadmill.m1v1")) {
            return;
        }
        double d = 3600 / phoneSportData.pace;
        if (d <= 2.7d || d >= 3.3d) {
            return;
        }
        postSpeedEvent();
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportDataChangedListener
    public void onReceiveWearData(@Nullable y7r wearSportData) {
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportFinished(boolean validSport, @Nullable byte[] ids) {
        isSportStart = false;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportPaused() {
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportRestarted() {
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportRested() {
        ISportStateChangedListener.DefaultImpls.onSportRested(this);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportShutdown() {
        ISportStateChangedListener.DefaultImpls.onSportShutdown(this);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportStarted(int startTime, int timeZone, int sportType, int sportLaunchType) {
        String key_gym_local_sport_type = SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE();
        int iHashCode = key_gym_local_sport_type.hashCode();
        if (iHashCode != 1396900280) {
            switch (iHashCode) {
                case 405899618:
                    if (key_gym_local_sport_type.equals("yunmai.jmprope.sr803")) {
                        postStartEvent();
                    }
                    break;
                case 405899619:
                    if (key_gym_local_sport_type.equals("yunmai.jmprope.sr804")) {
                        postStartEvent();
                    }
                    break;
                case 405899620:
                    if (key_gym_local_sport_type.equals(SportConstants.GYM_MODEL_YUN_MAI_JUMP_WINE_RED)) {
                        postStartEvent();
                    }
                    break;
            }
        } else if (key_gym_local_sport_type.equals("ksmb.treadmill.m1v1")) {
            postStartEvent();
        }
        isSportStart = true;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void preSport() {
        ISportStateChangedListener.DefaultImpls.preSport(this);
    }
}
