package com.xiaomi.fitness.sport.view.justdance.control;

import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.baseui.BaseModel;
import com.xiaomi.fitness.baseui.recyclerview.itembindings.ItemBinding;
import com.xiaomi.fitness.sport.utils.SportPreference;
import com.xiaomi.fitness.sport.view.justdance.PauseSliderData;
import com.xiaomi.fitness.sport.view.justdance.PhoneActionNavigation;
import com.xiaomi.fitness.sport.view.justdance.PlayerData;
import com.xiaomi.fitness.sport.view.justdance.ProfileData;
import com.xiaomi.fitness.sport.view.justdance.SongData;
import com.xiaomi.fitness.sport.view.justdance.WSCommand;
import com.xiaomi.fitness.sport.view.justdance.control.JustDanceControlModel;
import defpackage.dvi;
import defpackage.nv1;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010I\u001a\u00020JJ\u0006\u0010K\u001a\u00020JJ\u0006\u0010L\u001a\u00020JJ\u000e\u0010M\u001a\u00020J2\u0006\u0010N\u001a\u00020.J\u000e\u0010O\u001a\u00020J2\u0006\u0010P\u001a\u00020\u001dR\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\u0019\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0012R\u0011\u0010\"\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0012R\u0011\u0010#\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0012R\u0011\u0010$\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0012R\u0011\u0010%\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0012R\u0011\u0010'\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0012R\u0011\u0010)\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0012R\u0011\u0010+\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0012R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u001c¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0011\u00100\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0012R\u0011\u00101\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0012R\u001a\u00103\u001a\u000204X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0011\u00109\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\u0012R\u0011\u0010;\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\u0012R\u0011\u0010=\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\u0012R\u0011\u0010?\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\u0012R\u001f\u0010A\u001a\u0010\u0012\f\u0012\n D*\u0004\u0018\u00010C0C0B¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u001a\u0010G\u001a\u000204X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u00106\"\u0004\bH\u00108R\u0017\u0010Q\u001a\b\u0012\u0004\u0012\u00020S0R¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0017\u0010V\u001a\b\u0012\u0004\u0012\u00020W0R¢\u0006\b\n\u0000\u001a\u0004\bX\u0010U¨\u0006Y"}, d2 = {"Lcom/xiaomi/fitness/sport/view/justdance/control/JustDanceControlModel;", "Lcom/xiaomi/fitness/baseui/BaseModel;", "<init>", "()V", "wsCommand", "Lcom/xiaomi/fitness/sport/view/justdance/WSCommand;", "getWsCommand", "()Lcom/xiaomi/fitness/sport/view/justdance/WSCommand;", "wsCommand$delegate", "Lkotlin/Lazy;", "songData", "Lcom/xiaomi/fitness/sport/view/justdance/SongData;", "getSongData", "()Lcom/xiaomi/fitness/sport/view/justdance/SongData;", "songData$delegate", "showConnect", "Landroidx/databinding/ObservableBoolean;", "getShowConnect", "()Landroidx/databinding/ObservableBoolean;", "connectSuccess", "getConnectSuccess", "showControl", "getShowControl", "showRecap", "getShowRecap", "showPlayerList", "getShowPlayerList", "phoneUiSetupData", "Landroidx/databinding/ObservableField;", "Lcom/xiaomi/fitness/sport/view/justdance/PauseSliderData;", "getPhoneUiSetupData", "()Landroidx/databinding/ObservableField;", "showDancerCardOnScreen", "getShowDancerCardOnScreen", "isMaster", "isPopup", "isEnabled", "touchGuide", "getTouchGuide", "firstShowTouch", "getFirstShowTouch", "showBack", "getShowBack", "startGame", "getStartGame", "userProfile", "Lcom/xiaomi/fitness/sport/view/justdance/ProfileData;", "getUserProfile", "isUseKeyBoard", "showTouchArea", "getShowTouchArea", "deviceShowTouchArea", "", "getDeviceShowTouchArea", "()Z", "setDeviceShowTouchArea", "(Z)V", "enableVibrate", "getEnableVibrate", "slideMirror", "getSlideMirror", "enableSlide", "getEnableSlide", "nightMode", "getNightMode", "displayText", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "getDisplayText", "()Landroidx/lifecycle/MutableLiveData;", "isSweatMode", "setSweatMode", "refreshShowTouchArea", "", "refreshRecap", "refreshKeyboard", "setUserProfile", "profileData", "setPauseSliderData", "slider", "navigationBindings", "Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "Lcom/xiaomi/fitness/sport/view/justdance/PhoneActionNavigation;", "getNavigationBindings", "()Lcom/xiaomi/fitness/baseui/recyclerview/itembindings/ItemBinding;", "playerDataBindings", "Lcom/xiaomi/fitness/sport/view/justdance/PlayerData;", "getPlayerDataBindings", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nJustDanceControlModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JustDanceControlModel.kt\ncom/xiaomi/fitness/sport/view/justdance/control/JustDanceControlModel\n+ 2 ItemBindingExt.kt\ncom/xiaomi/fitness/baseui/extension/ItemBindingExtKt\n*L\n1#1,143:1\n14#2:144\n14#2:145\n*S KotlinDebug\n*F\n+ 1 JustDanceControlModel.kt\ncom/xiaomi/fitness/sport/view/justdance/control/JustDanceControlModel\n*L\n135#1:144\n141#1:145\n*E\n"})
public final class JustDanceControlModel extends BaseModel {
    private boolean deviceShowTouchArea;
    private boolean isSweatMode;

    @NotNull
    private final ItemBinding<PhoneActionNavigation> navigationBindings;

    @NotNull
    private final ItemBinding<PlayerData> playerDataBindings;

    /* JADX INFO: renamed from: wsCommand$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy wsCommand = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: axd
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return JustDanceControlModel.wsCommand_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: songData$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy songData = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: bxd
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return JustDanceControlModel.songData_delegate$lambda$1();
        }
    });

    @NotNull
    private final ObservableBoolean showConnect = new ObservableBoolean(true);

    @NotNull
    private final ObservableBoolean connectSuccess = new ObservableBoolean(false);

    @NotNull
    private final ObservableBoolean showControl = new ObservableBoolean(false);

    @NotNull
    private final ObservableBoolean showRecap = new ObservableBoolean(false);

    @NotNull
    private final ObservableBoolean showPlayerList = new ObservableBoolean(false);

    @NotNull
    private final ObservableField<PauseSliderData> phoneUiSetupData = new ObservableField<>();

    @NotNull
    private final ObservableBoolean showDancerCardOnScreen = new ObservableBoolean(false);

    @NotNull
    private final ObservableBoolean isMaster = new ObservableBoolean(false);

    @NotNull
    private final ObservableBoolean isPopup = new ObservableBoolean(false);

    @NotNull
    private final ObservableBoolean isEnabled = new ObservableBoolean(false);

    @NotNull
    private final ObservableBoolean touchGuide = new ObservableBoolean(false);

    @NotNull
    private final ObservableBoolean firstShowTouch = new ObservableBoolean(false);

    @NotNull
    private final ObservableBoolean showBack = new ObservableBoolean(false);

    @NotNull
    private final ObservableBoolean startGame = new ObservableBoolean(false);

    @NotNull
    private final ObservableField<ProfileData> userProfile = new ObservableField<>();

    @NotNull
    private final ObservableBoolean isUseKeyBoard = new ObservableBoolean(false);

    @NotNull
    private final ObservableBoolean showTouchArea = new ObservableBoolean(false);

    @NotNull
    private final ObservableBoolean enableVibrate = new ObservableBoolean(true);

    @NotNull
    private final ObservableBoolean slideMirror = new ObservableBoolean(false);

    @NotNull
    private final ObservableBoolean enableSlide = new ObservableBoolean(true);

    @NotNull
    private final ObservableBoolean nightMode = new ObservableBoolean(false);

    @NotNull
    private final MutableLiveData<String> displayText = new MutableLiveData<>("");

    public JustDanceControlModel() {
        int i = nv1.g;
        int i2 = dvi.z0;
        ItemBinding.Companion companion = ItemBinding.INSTANCE;
        this.navigationBindings = companion.of(i, i2);
        this.playerDataBindings = companion.of(nv1.j, dvi.A0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SongData songData_delegate$lambda$1() {
        return new SongData(null, null, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WSCommand wsCommand_delegate$lambda$0() {
        return new WSCommand(null, null, null, null, null, null, null, 127, null);
    }

    @NotNull
    public final ObservableBoolean getConnectSuccess() {
        return this.connectSuccess;
    }

    public final boolean getDeviceShowTouchArea() {
        return this.deviceShowTouchArea;
    }

    @NotNull
    public final MutableLiveData<String> getDisplayText() {
        return this.displayText;
    }

    @NotNull
    public final ObservableBoolean getEnableSlide() {
        return this.enableSlide;
    }

    @NotNull
    public final ObservableBoolean getEnableVibrate() {
        return this.enableVibrate;
    }

    @NotNull
    public final ObservableBoolean getFirstShowTouch() {
        return this.firstShowTouch;
    }

    @NotNull
    public final ItemBinding<PhoneActionNavigation> getNavigationBindings() {
        return this.navigationBindings;
    }

    @NotNull
    public final ObservableBoolean getNightMode() {
        return this.nightMode;
    }

    @NotNull
    public final ObservableField<PauseSliderData> getPhoneUiSetupData() {
        return this.phoneUiSetupData;
    }

    @NotNull
    public final ItemBinding<PlayerData> getPlayerDataBindings() {
        return this.playerDataBindings;
    }

    @NotNull
    public final ObservableBoolean getShowBack() {
        return this.showBack;
    }

    @NotNull
    public final ObservableBoolean getShowConnect() {
        return this.showConnect;
    }

    @NotNull
    public final ObservableBoolean getShowControl() {
        return this.showControl;
    }

    @NotNull
    public final ObservableBoolean getShowDancerCardOnScreen() {
        return this.showDancerCardOnScreen;
    }

    @NotNull
    public final ObservableBoolean getShowPlayerList() {
        return this.showPlayerList;
    }

    @NotNull
    public final ObservableBoolean getShowRecap() {
        return this.showRecap;
    }

    @NotNull
    public final ObservableBoolean getShowTouchArea() {
        return this.showTouchArea;
    }

    @NotNull
    public final ObservableBoolean getSlideMirror() {
        return this.slideMirror;
    }

    @NotNull
    public final SongData getSongData() {
        return (SongData) this.songData.getValue();
    }

    @NotNull
    public final ObservableBoolean getStartGame() {
        return this.startGame;
    }

    @NotNull
    public final ObservableBoolean getTouchGuide() {
        return this.touchGuide;
    }

    @NotNull
    public final ObservableField<ProfileData> getUserProfile() {
        return this.userProfile;
    }

    @NotNull
    public final WSCommand getWsCommand() {
        return (WSCommand) this.wsCommand.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: isEnabled, reason: from getter */
    public final ObservableBoolean getIsEnabled() {
        return this.isEnabled;
    }

    @NotNull
    /* JADX INFO: renamed from: isMaster, reason: from getter */
    public final ObservableBoolean getIsMaster() {
        return this.isMaster;
    }

    @NotNull
    /* JADX INFO: renamed from: isPopup, reason: from getter */
    public final ObservableBoolean getIsPopup() {
        return this.isPopup;
    }

    /* JADX INFO: renamed from: isSweatMode, reason: from getter */
    public final boolean getIsSweatMode() {
        return this.isSweatMode;
    }

    @NotNull
    /* JADX INFO: renamed from: isUseKeyBoard, reason: from getter */
    public final ObservableBoolean getIsUseKeyBoard() {
        return this.isUseKeyBoard;
    }

    public final void refreshKeyboard() {
        boolean z = false;
        boolean z2 = (this.isPopup.get() && this.isEnabled.get()) || this.isMaster.get() || this.showDancerCardOnScreen.get();
        this.isUseKeyBoard.set(true);
        boolean z3 = this.startGame.get();
        this.showTouchArea.set((!z2 || z3 || this.showRecap.get() || this.isUseKeyBoard.get()) ? false : true);
        if (!this.isMaster.get()) {
            z = this.showTouchArea.get();
        } else if (!z3) {
            z = true;
        }
        this.deviceShowTouchArea = z;
    }

    public final void refreshRecap() {
        boolean z = false;
        boolean z2 = (this.isPopup.get() && this.isEnabled.get()) || this.isMaster.get() || this.showDancerCardOnScreen.get();
        this.showRecap.set(true);
        boolean z3 = this.startGame.get();
        this.showTouchArea.set((!z2 || z3 || this.showRecap.get() || this.isUseKeyBoard.get()) ? false : true);
        if (!this.isMaster.get()) {
            z = this.showTouchArea.get();
        } else if (!z3) {
            z = true;
        }
        this.deviceShowTouchArea = z;
    }

    public final void refreshShowTouchArea() {
        boolean z = true;
        boolean z2 = (this.isPopup.get() && this.isEnabled.get()) || this.isMaster.get() || this.showDancerCardOnScreen.get();
        if (z2) {
            this.showRecap.set(false);
            this.isUseKeyBoard.set(false);
            this.showPlayerList.set(false);
        }
        boolean z3 = this.startGame.get();
        this.showTouchArea.set((!z2 || z3 || this.showRecap.get() || this.isUseKeyBoard.get()) ? false : true);
        if (this.showTouchArea.get()) {
            SportPreference sportPreference = SportPreference.INSTANCE;
            this.firstShowTouch.set(sportPreference.getSHOW_JD_TOUCH_GUIDE());
            if (this.firstShowTouch.get()) {
                this.touchGuide.set(true);
                this.firstShowTouch.set(false);
                sportPreference.setSHOW_JD_TOUCH_GUIDE(false);
            }
        }
        if (!this.isMaster.get()) {
            z = this.showTouchArea.get();
        } else if (z3) {
            z = false;
        }
        this.deviceShowTouchArea = z;
    }

    public final void setDeviceShowTouchArea(boolean z) {
        this.deviceShowTouchArea = z;
    }

    public final void setPauseSliderData(@NotNull PauseSliderData slider) {
        Intrinsics.checkNotNullParameter(slider, "slider");
        if (Intrinsics.areEqual(this.phoneUiSetupData.get(), slider)) {
            this.phoneUiSetupData.notifyChange();
        }
        this.phoneUiSetupData.set(slider);
    }

    public final void setSweatMode(boolean z) {
        this.isSweatMode = z;
    }

    public final void setUserProfile(@NotNull ProfileData profileData) {
        Intrinsics.checkNotNullParameter(profileData, "profileData");
        if (Intrinsics.areEqual(this.userProfile.get(), profileData)) {
            this.userProfile.notifyChange();
        }
        this.userProfile.set(profileData);
    }
}
