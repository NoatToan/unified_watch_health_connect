package com.xiaomi.fitness.medal.share;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.extensions.PermissionBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.medal.export.MedalManager;
import com.xiaomi.fitness.medal.export.MedalManagerExtKt;
import com.xiaomi.fitness.medal.share.MedalShareActivity;
import com.xiaomi.fitness.relative.ui.util.RelativeCareConstants;
import com.xiaomi.fitness.widget.view.RoundImageView;
import com.xiaomi.onetrack.OneTrack;
import defpackage.av6;
import defpackage.bcf;
import defpackage.fv1;
import defpackage.iri;
import defpackage.j0j;
import defpackage.nji;
import defpackage.pui;
import defpackage.s4m;
import defpackage.s9h;
import defpackage.tni;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 d2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001dB\u0007¢\u0006\u0004\bc\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\"\u0010\u001e\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010'\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010&\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010&R\u0014\u0010.\u001a\u00020-8\u0002X\u0082D¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010&R\u0014\u00101\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010&R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010\u0016R\"\u00107\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010>\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010D\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u00108\u001a\u0004\bE\u0010:\"\u0004\bF\u0010<R\"\u0010H\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010N\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u00108\u001a\u0004\bO\u0010:\"\u0004\bP\u0010<R\"\u0010Q\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u00108\u001a\u0004\bR\u0010:\"\u0004\bS\u0010<R\"\u0010T\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010?\u001a\u0004\bU\u0010A\"\u0004\bV\u0010CR\u0016\u0010W\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010&R\u0016\u0010X\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010/R\u0016\u0010Y\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010/R\u0016\u0010Z\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010/R\u0016\u0010[\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010/R\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00040\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010)R\u0014\u0010b\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010)¨\u0006e"}, d2 = {"Lcom/xiaomi/fitness/medal/share/MedalShareActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/medal/share/MedalShareViewModel;", "Lbcf;", "", "handleSwipeUpView", "()V", "launchShareComponent", "setOnShareListeners", "oneTrackShareCount", "showNativePermissionAuthorizationDialog", "Landroid/view/MotionEvent;", "event", "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "medalName", "Ljava/lang/String;", "getMedalName", "()Ljava/lang/String;", "setMedalName", "(Ljava/lang/String;)V", "medalDetailName", "getMedalDetailName", "setMedalDetailName", "medalIcon", "getMedalIcon", "setMedalIcon", "", "medalGotTime", "J", "", "medalId", "I", "medalClass", "getMedalClass", "()I", "setMedalClass", "(I)V", "medalIconHeight", "", "originalRatio", "F", "originalHeight", "qrCodeWidth", "Ls4m;", "shareComponent", "Ls4m;", "shareMethodString", "Landroid/widget/TextView;", "shareMedalName", "Landroid/widget/TextView;", "getShareMedalName", "()Landroid/widget/TextView;", "setShareMedalName", "(Landroid/widget/TextView;)V", "Landroid/widget/ImageView;", "shareMedalIcon", "Landroid/widget/ImageView;", "getShareMedalIcon", "()Landroid/widget/ImageView;", "setShareMedalIcon", "(Landroid/widget/ImageView;)V", "tvUserAchieved", "getTvUserAchieved", "setTvUserAchieved", "Lcom/xiaomi/fitness/widget/view/RoundImageView;", "photoView", "Lcom/xiaomi/fitness/widget/view/RoundImageView;", "getPhotoView", "()Lcom/xiaomi/fitness/widget/view/RoundImageView;", "setPhotoView", "(Lcom/xiaomi/fitness/widget/view/RoundImageView;)V", "nickNameText", "getNickNameText", "setNickNameText", "gotTimeTv", "getGotTimeTv", "setGotTimeTv", "shareQRCode", "getShareQRCode", "setShareQRCode", "medalShareContentCardHeight", "x1", "y1", "x2", "y2", "Lkotlin/Function0;", "requestPermission", "Lkotlin/jvm/functions/Function0;", "getViewModelId", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMedalShareActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MedalShareActivity.kt\ncom/xiaomi/fitness/medal/share/MedalShareActivity\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,332:1\n54#2,3:333\n24#2:336\n57#2,6:337\n63#2,2:344\n54#2,3:346\n24#2:349\n59#2,6:350\n54#2,3:356\n24#2:359\n59#2,6:360\n57#3:343\n*S KotlinDebug\n*F\n+ 1 MedalShareActivity.kt\ncom/xiaomi/fitness/medal/share/MedalShareActivity\n*L\n153#1:333,3\n153#1:336\n153#1:337,6\n153#1:344,2\n171#1:346,3\n171#1:349\n171#1:350,6\n176#1:356,3\n176#1:359\n176#1:360,6\n153#1:343\n*E\n"})
public final class MedalShareActivity extends Hilt_MedalShareActivity<MedalShareViewModel, bcf> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String KEY_SHARE_BUNDLE_TYPE = "share_bundle_medal_type";

    @NotNull
    private static final String KEY_SHARE_MEDAL_DETAIL_NAME = "share_medal_detail_name";

    @NotNull
    private static final String KEY_SHARE_MEDAL_GOTTIME = "share_medal_gottime";

    @NotNull
    private static final String KEY_SHARE_MEDAL_ICON = "share_medal_icon";

    @NotNull
    private static final String KEY_SHARE_MEDAL_ID = "key_share_medal_id";

    @NotNull
    private static final String KEY_SHARE_MEDAL_NAME = "share_medal_name";

    @NotNull
    private static final String KEY_SHARE_MEDAL_TYPE = "share_medal_type";

    @NotNull
    public static final String TAG = "MedalShareActivity";
    public TextView gotTimeTv;
    private int medalClass;
    public String medalDetailName;
    private long medalGotTime;
    public String medalIcon;
    private int medalId;
    public String medalName;
    private int medalShareContentCardHeight;
    public TextView nickNameText;
    private final int originalHeight;
    public RoundImageView photoView;
    private final int qrCodeWidth;

    @NotNull
    private final Function0<Unit> requestPermission;

    @Nullable
    private s4m shareComponent;
    public ImageView shareMedalIcon;
    public TextView shareMedalName;

    @NotNull
    private String shareMethodString;
    public ImageView shareQRCode;
    public TextView tvUserAchieved;
    private float x1;
    private float x2;
    private float y1;
    private float y2;
    private final int medalIconHeight = ExtUtilsKt.getDp(Integer.valueOf(SportReportBaseParser.ReportType.algorithmDataSource));
    private final float originalRatio = 1.0f;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/medal/share/MedalShareActivity$Companion;", "", "<init>", "()V", "TAG", "", "KEY_SHARE_MEDAL_NAME", "KEY_SHARE_MEDAL_ICON", "KEY_SHARE_MEDAL_GOTTIME", "KEY_SHARE_MEDAL_TYPE", "KEY_SHARE_MEDAL_DETAIL_NAME", "KEY_SHARE_MEDAL_ID", "KEY_SHARE_BUNDLE_TYPE", "getMedalShareBundle", "Landroid/os/Bundle;", "medalName", "detailName", "medalIcon", "medalGotTime", "", "medalClass", "", "medalId", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Bundle getMedalShareBundle(@NotNull String medalName, @NotNull String detailName, @NotNull String medalIcon, long medalGotTime, int medalClass, long medalId) {
            Intrinsics.checkNotNullParameter(medalName, "medalName");
            Intrinsics.checkNotNullParameter(detailName, "detailName");
            Intrinsics.checkNotNullParameter(medalIcon, "medalIcon");
            Bundle bundle = new Bundle();
            bundle.putString(MedalShareActivity.KEY_SHARE_MEDAL_NAME, medalName);
            bundle.putString(MedalShareActivity.KEY_SHARE_MEDAL_DETAIL_NAME, detailName);
            bundle.putString(MedalShareActivity.KEY_SHARE_MEDAL_ICON, medalIcon);
            bundle.putLong(MedalShareActivity.KEY_SHARE_MEDAL_GOTTIME, medalGotTime);
            bundle.putInt(MedalShareActivity.KEY_SHARE_MEDAL_TYPE, medalClass);
            bundle.putLong(MedalShareActivity.KEY_SHARE_MEDAL_ID, medalId);
            return bundle;
        }
    }

    public MedalShareActivity() {
        int dp = ExtUtilsKt.getDp(Float.valueOf(50.0f));
        this.originalHeight = dp;
        this.qrCodeWidth = (int) (dp * 1.0f);
        this.shareMethodString = "";
        this.requestPermission = new Function0() { // from class: zgf
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MedalShareActivity.requestPermission$lambda$11(this.f41252a);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ bcf access$getMBinding(MedalShareActivity medalShareActivity) {
        return (bcf) medalShareActivity.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void handleSwipeUpView() {
        ViewTreeObserver viewTreeObserver = ((bcf) getMBinding()).J.getViewTreeObserver();
        Intrinsics.checkNotNullExpressionValue(viewTreeObserver, "getViewTreeObserver(...)");
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.xiaomi.fitness.medal.share.MedalShareActivity.handleSwipeUpView.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                MedalShareActivity.access$getMBinding(MedalShareActivity.this).J.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                MedalShareActivity medalShareActivity = MedalShareActivity.this;
                medalShareActivity.medalShareContentCardHeight = MedalShareActivity.access$getMBinding(medalShareActivity).J.getMeasuredHeight();
            }
        });
        ((bcf) getMBinding()).I.postDelayed(new Runnable() { // from class: ygf
            @Override // java.lang.Runnable
            public final void run() {
                MedalShareActivity.handleSwipeUpView$lambda$7(this.f40156a);
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void handleSwipeUpView$lambda$7(MedalShareActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean z = ((bcf) this$0.getMBinding()).I.getHeight() >= this$0.medalShareContentCardHeight;
        Logger.d(TAG, "handleSwipeUpView mBinding.shareContent.height=" + ((bcf) this$0.getMBinding()).I.getHeight());
        Logger.d(TAG, "handleSwipeUpView medalShareContentCardHeight=" + this$0.medalShareContentCardHeight);
        Logger.d(TAG, "handleSwipeUpView shouldShowSwipeUpView=" + z);
        if (z) {
            ConstraintLayout swipeUpView = ((bcf) this$0.getMBinding()).K;
            Intrinsics.checkNotNullExpressionValue(swipeUpView, "swipeUpView");
            ViewExtKt.visible(swipeUpView);
        } else {
            ConstraintLayout swipeUpView2 = ((bcf) this$0.getMBinding()).K;
            Intrinsics.checkNotNullExpressionValue(swipeUpView2, "swipeUpView");
            ViewExtKt.gone(swipeUpView2);
        }
    }

    private final void launchShareComponent() {
        if (Build.VERSION.SDK_INT >= 29 || PermissionExtKt.isPermissionGranted(this, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            setOnShareListeners();
        } else if (PermissionExtKt.supportMiuiPermissionEnable()) {
            this.requestPermission.invoke();
        } else {
            showNativePermissionAuthorizationDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(MedalShareActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.lambda$onCreate$0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$4(Ref.ObjectRef xiaomiCoreInfo, final MedalShareActivity this$0, AccountCoreInfo accountCoreInfo) {
        String userName;
        Intrinsics.checkNotNullParameter(xiaomiCoreInfo, "$xiaomiCoreInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        xiaomiCoreInfo.element = accountCoreInfo;
        if (accountCoreInfo != 0) {
            String avatarAddress = accountCoreInfo != 0 ? accountCoreInfo.getAvatarAddress() : null;
            if (avatarAddress == null || avatarAddress.length() == 0) {
                this$0.getPhotoView().post(new Runnable() { // from class: chf
                    @Override // java.lang.Runnable
                    public final void run() {
                        MedalShareActivity.onCreate$lambda$4$lambda$2(this.f5348a);
                    }
                });
            }
            RoundImageView photoView = this$0.getPhotoView();
            AccountCoreInfo accountCoreInfo2 = (AccountCoreInfo) xiaomiCoreInfo.element;
            String avatarAddress2 = accountCoreInfo2 != null ? accountCoreInfo2.getAvatarAddress() : null;
            ImageLoader imageLoader = Coil.imageLoader(photoView.getContext());
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(photoView.getContext()).data(avatarAddress2).target(photoView);
            builderTarget.bitmapConfig(Bitmap.Config.ARGB_8888);
            imageLoader.enqueue(builderTarget.build());
            TextView nickNameText = this$0.getNickNameText();
            AccountCoreInfo accountCoreInfo3 = (AccountCoreInfo) xiaomiCoreInfo.element;
            nickNameText.setText(accountCoreInfo3 != null ? accountCoreInfo3.getUserName() : null);
            AccountCoreInfo accountCoreInfo4 = (AccountCoreInfo) xiaomiCoreInfo.element;
            Logger.d(TAG, "USERNAME == " + (accountCoreInfo4 != null ? accountCoreInfo4.getUserName() : null));
            AccountCoreInfo accountCoreInfo5 = (AccountCoreInfo) xiaomiCoreInfo.element;
            if (accountCoreInfo5 == null || (userName = accountCoreInfo5.getUserName()) == null) {
                AccountCoreInfo accountCoreInfo6 = (AccountCoreInfo) xiaomiCoreInfo.element;
                String userId = accountCoreInfo6 != null ? accountCoreInfo6.getUserId() : null;
                userName = userId == null ? "" : userId;
            }
            this$0.getTvUserAchieved().setText(this$0.getString(j0j.u, userName));
        }
        Logger.d(TAG, "xiaomiCoreInfo == " + xiaomiCoreInfo.element);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$4$lambda$2(MedalShareActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RoundImageView photoView = this$0.getPhotoView();
        Integer numValueOf = Integer.valueOf(tni.f34874a);
        ImageLoader imageLoader = Coil.imageLoader(photoView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(photoView.getContext()).data(numValueOf).target(photoView);
        builderTarget.bitmapConfig(Bitmap.Config.ARGB_8888);
        imageLoader.enqueue(builderTarget.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$6(final MedalShareActivity this$0, final Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getShareQRCode().post(new Runnable() { // from class: ihf
            @Override // java.lang.Runnable
            public final void run() {
                MedalShareActivity.onCreate$lambda$6$lambda$5(this.f21145a, bitmap);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$6$lambda$5(MedalShareActivity this$0, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getShareQRCode().getLayoutParams().width = this$0.qrCodeWidth;
        this$0.getShareQRCode().getLayoutParams().height = this$0.qrCodeWidth;
        this$0.getShareQRCode().setImageBitmap(bitmap);
    }

    private final void oneTrackShareCount() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        Map<String, ? extends Object> mapMapOf = MapsKt__MapsKt.mapOf(TuplesKt.to("name", "share_medal"), TuplesKt.to(OneTrack.Param.ASSET_NAME, getMedalName()), TuplesKt.to("asset_id", Integer.valueOf(this.medalId)), TuplesKt.to("method", this.shareMethodString), TuplesKt.to("device_model", wearableDeviceModel != null ? DeviceModelExtKt.getModel(wearableDeviceModel) : null), TuplesKt.to("tip", "56.16.1.1.22918"));
        Logger.d(TAG, "oneTrackShareCount oneTrackMap=" + mapMapOf);
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(RelativeCareConstants.RELATIVE_CARE_EVENT_V3, mapMapOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermission$lambda$11(final MedalShareActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PermissionExtKt.permission(this$0, "android.permission.WRITE_EXTERNAL_STORAGE", this$0.getString(j0j.C), (Function1<? super PermissionBuilder, Unit>) new Function1() { // from class: hhf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalShareActivity.requestPermission$lambda$11$lambda$10(this.f20069a, (PermissionBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermission$lambda$11$lambda$10(final MedalShareActivity this$0, PermissionBuilder permission) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(permission, "$this$permission");
        permission.granted(new Function1() { // from class: ahf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalShareActivity.requestPermission$lambda$11$lambda$10$lambda$8(this.f1025a, (String) obj);
            }
        });
        permission.denied(new Function1() { // from class: bhf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalShareActivity.requestPermission$lambda$11$lambda$10$lambda$9((String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermission$lambda$11$lambda$10$lambda$8(MedalShareActivity this$0, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.d(TAG, "branch 3");
        this$0.launchShareComponent();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestPermission$lambda$11$lambda$10$lambda$9(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setOnShareListeners() {
        if (this.shareComponent == null) {
            s4m s4mVar = new s4m(this);
            this.shareComponent = s4mVar;
            Intrinsics.checkNotNull(s4mVar);
            s4mVar.setOnShareMethodListener(new s9h() { // from class: dhf
                @Override // defpackage.s9h
                public final void onShareMethodClicked(int i) {
                    MedalShareActivity.setOnShareListeners$lambda$12(this.f15531a, i);
                }
            });
        }
        ((bcf) getMBinding()).F.setOnClickListener(new View.OnClickListener() { // from class: ehf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MedalShareActivity.setOnShareListeners$lambda$13(this.f16646a, view);
            }
        });
        ((bcf) getMBinding()).H.setOnClickListener(new View.OnClickListener() { // from class: fhf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MedalShareActivity.setOnShareListeners$lambda$14(this.f17786a, view);
            }
        });
        ((bcf) getMBinding()).G.setOnClickListener(new View.OnClickListener() { // from class: ghf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MedalShareActivity.setOnShareListeners$lambda$15(this.f19002a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnShareListeners$lambda$12(MedalShareActivity this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.shareMethodString = MedalManagerExtKt.getInstance(MedalManager.INSTANCE).getShareMethodString(i);
        this$0.oneTrackShareCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setOnShareListeners$lambda$13(MedalShareActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        s4m s4mVar = this$0.shareComponent;
        Intrinsics.checkNotNull(s4mVar);
        s4mVar.e(this$0.getMedalName(), this$0.getMedalDetailName(), ((bcf) this$0.getMBinding()).I);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setOnShareListeners$lambda$14(MedalShareActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        s4m s4mVar = this$0.shareComponent;
        Intrinsics.checkNotNull(s4mVar);
        s4mVar.u(this$0.getMedalName(), this$0.getMedalDetailName(), ((bcf) this$0.getMBinding()).I);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setOnShareListeners$lambda$15(MedalShareActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        s4m s4mVar = this$0.shareComponent;
        Intrinsics.checkNotNull(s4mVar);
        s4mVar.v(this$0.getMedalName(), this$0.getMedalDetailName(), ((bcf) this$0.getMBinding()).I);
    }

    private final void showNativePermissionAuthorizationDialog() {
        CommonDialog commonDialogCreate = new CommonDialog.c(getString(j0j.E)).setDialogDescription(j0j.E).setPositiveText(j0j.c).setNegativeText(j0j.f22299b).create();
        Intrinsics.checkNotNull(commonDialogCreate != null ? commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.medal.share.MedalShareActivity.showNativePermissionAuthorizationDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                super.onDialogClick(dialogName, dialog, which);
                MedalShareActivity.this.requestPermission.invoke();
            }
        }) : null, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
        commonDialogCreate.showIfNeed(getSupportFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 0) {
            this.x1 = event.getX();
            this.y1 = event.getY();
        }
        if (event.getAction() == 1) {
            this.x2 = event.getX();
            float y = event.getY();
            this.y2 = y;
            float f = this.y1;
            if (f - y > 50.0f) {
                Logger.d(TAG, "onTouchEvent y1=" + f + ", y2=" + y);
                ConstraintLayout swipeUpView = ((bcf) getMBinding()).K;
                Intrinsics.checkNotNullExpressionValue(swipeUpView, "swipeUpView");
                ViewExtKt.gone(swipeUpView);
            }
        }
        return super.dispatchTouchEvent(event);
    }

    @NotNull
    public final TextView getGotTimeTv() {
        TextView textView = this.gotTimeTv;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("gotTimeTv");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return pui.d;
    }

    public final int getMedalClass() {
        return this.medalClass;
    }

    @NotNull
    public final String getMedalDetailName() {
        String str = this.medalDetailName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("medalDetailName");
        return null;
    }

    @NotNull
    public final String getMedalIcon() {
        String str = this.medalIcon;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("medalIcon");
        return null;
    }

    @NotNull
    public final String getMedalName() {
        String str = this.medalName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("medalName");
        return null;
    }

    @NotNull
    public final TextView getNickNameText() {
        TextView textView = this.nickNameText;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("nickNameText");
        return null;
    }

    @NotNull
    public final RoundImageView getPhotoView() {
        RoundImageView roundImageView = this.photoView;
        if (roundImageView != null) {
            return roundImageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("photoView");
        return null;
    }

    @NotNull
    public final ImageView getShareMedalIcon() {
        ImageView imageView = this.shareMedalIcon;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shareMedalIcon");
        return null;
    }

    @NotNull
    public final TextView getShareMedalName() {
        TextView textView = this.shareMedalName;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shareMedalName");
        return null;
    }

    @NotNull
    public final ImageView getShareQRCode() {
        ImageView imageView = this.shareQRCode;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shareQRCode");
        return null;
    }

    @NotNull
    public final TextView getTvUserAchieved() {
        TextView textView = this.tvUserAchieved;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tvUserAchieved");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return fv1.f18275a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.medal.share.Hilt_MedalShareActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        String string;
        String string2;
        Bundle bundleExtra;
        Bundle bundleExtra2;
        Bundle bundleExtra3;
        Bundle bundleExtra4;
        String string3;
        Bundle bundleExtra5;
        Bundle bundleExtra6;
        super.onCreate(savedInstanceState);
        ((MedalShareViewModel) getMViewModel()).getAccountCoreInfo();
        setTitleBackground(nji.f);
        getWindow().setStatusBarColor(getColor(nji.f));
        UIUtils uIUtils = UIUtils.INSTANCE;
        uIUtils.setNavigationBarColor(this, nji.f27982b);
        setActionBarDisplayable(false);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        uIUtils.setLightStatusBar(window, false);
        Intent intent = getIntent();
        String str = "";
        if (intent == null || (bundleExtra6 = intent.getBundleExtra(KEY_SHARE_BUNDLE_TYPE)) == null || (string = bundleExtra6.getString(KEY_SHARE_MEDAL_NAME)) == null) {
            string = "";
        }
        setMedalName(string);
        Intent intent2 = getIntent();
        if (intent2 == null || (bundleExtra5 = intent2.getBundleExtra(KEY_SHARE_BUNDLE_TYPE)) == null || (string2 = bundleExtra5.getString(KEY_SHARE_MEDAL_DETAIL_NAME)) == null) {
            string2 = "";
        }
        setMedalDetailName(string2);
        Intent intent3 = getIntent();
        if (intent3 != null && (bundleExtra4 = intent3.getBundleExtra(KEY_SHARE_BUNDLE_TYPE)) != null && (string3 = bundleExtra4.getString(KEY_SHARE_MEDAL_ICON)) != null) {
            str = string3;
        }
        setMedalIcon(str);
        Intent intent4 = getIntent();
        this.medalGotTime = (intent4 == null || (bundleExtra3 = intent4.getBundleExtra(KEY_SHARE_BUNDLE_TYPE)) == null) ? 0L : bundleExtra3.getLong(KEY_SHARE_MEDAL_GOTTIME);
        Intent intent5 = getIntent();
        this.medalClass = (intent5 == null || (bundleExtra2 = intent5.getBundleExtra(KEY_SHARE_BUNDLE_TYPE)) == null) ? 0 : bundleExtra2.getInt(KEY_SHARE_MEDAL_TYPE);
        Intent intent6 = getIntent();
        this.medalId = (intent6 == null || (bundleExtra = intent6.getBundleExtra(KEY_SHARE_BUNDLE_TYPE)) == null) ? 0 : bundleExtra.getInt(KEY_SHARE_MEDAL_ID);
        setShareMedalName((TextView) ((bcf) getMBinding()).I.findViewById(iri.m0));
        setShareMedalIcon((ImageView) ((bcf) getMBinding()).I.findViewById(iri.l0));
        setTvUserAchieved((TextView) ((bcf) getMBinding()).I.findViewById(iri.t0));
        getShareMedalName().setText(getMedalDetailName());
        getShareMedalIcon().getLayoutParams().width = (int) (this.medalIconHeight / MedalManagerExtKt.getInstance(MedalManager.INSTANCE).getMedalListImgRatio(this.medalClass));
        ImageView shareMedalIcon = getShareMedalIcon();
        Coil.imageLoader(shareMedalIcon.getContext()).enqueue(new ImageRequest.Builder(shareMedalIcon.getContext()).data(getMedalIcon()).target(shareMedalIcon).build());
        MedalShareViewModel medalShareViewModel = (MedalShareViewModel) getMViewModel();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        medalShareViewModel.createQRBitmap(resources);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ((bcf) getMBinding()).E.setContentDescription(getString(j0j.f22298a));
        ((bcf) getMBinding()).E.setOnClickListener(new View.OnClickListener() { // from class: jhf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MedalShareActivity.onCreate$lambda$0(this.f22808a, view);
            }
        });
        setPhotoView((RoundImageView) ((bcf) getMBinding()).I.findViewById(iri.V));
        setNickNameText((TextView) ((bcf) getMBinding()).I.findViewById(iri.R));
        setGotTimeTv((TextView) ((bcf) getMBinding()).I.findViewById(iri.u));
        setShareQRCode((ImageView) ((bcf) getMBinding()).I.findViewById(iri.n0));
        ((MedalShareViewModel) getMViewModel()).getXiaomiCoreInfo().observe(this, new MedalShareActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: khf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalShareActivity.onCreate$lambda$4(objectRef, this, (AccountCoreInfo) obj);
            }
        }));
        Logger.d("xiaomiCoreInfo after == " + objectRef.element, new Object[0]);
        getGotTimeTv().setText(getString(j0j.n, TimeDateUtil.getDateYYYYMMdd(this.medalGotTime)));
        launchShareComponent();
        ((MedalShareViewModel) getMViewModel()).getBitmapQR().observe(this, new MedalShareActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: lhf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalShareActivity.onCreate$lambda$6(this.f25076a, (Bitmap) obj);
            }
        }));
        handleSwipeUpView();
    }

    public final void setGotTimeTv(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.gotTimeTv = textView;
    }

    public final void setMedalClass(int i) {
        this.medalClass = i;
    }

    public final void setMedalDetailName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.medalDetailName = str;
    }

    public final void setMedalIcon(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.medalIcon = str;
    }

    public final void setMedalName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.medalName = str;
    }

    public final void setNickNameText(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.nickNameText = textView;
    }

    public final void setPhotoView(@NotNull RoundImageView roundImageView) {
        Intrinsics.checkNotNullParameter(roundImageView, "<set-?>");
        this.photoView = roundImageView;
    }

    public final void setShareMedalIcon(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.shareMedalIcon = imageView;
    }

    public final void setShareMedalName(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.shareMedalName = textView;
    }

    public final void setShareQRCode(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.shareQRCode = imageView;
    }

    public final void setTvUserAchieved(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.tvUserAchieved = textView;
    }
}
