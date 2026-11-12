package com.xiaomi.fitness.login.banner;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.target.Target;
import com.fitness.banner.export.BannerExtKt;
import com.fitness.banner.export.IBanner;
import com.fitness.banner.export.v2.BannerItemDetail;
import com.fitness.banner.export.v2.BannerV2DataKt;
import com.fitness.banner.export.v2.SourceItem;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.login.SplashViewModel;
import com.xiaomi.fitness.login.banner.SplashBannerActivity;
import com.xiaomi.fitness.main.export.MainExtKt;
import defpackage.dv1;
import defpackage.jqe;
import defpackage.mui;
import defpackage.sxi;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001*B\u0007¢\u0006\u0004\b)\u0010\u000bJ!\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u000bJ\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u000bJ\u0019\u0010\u001a\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\tH\u0014¢\u0006\u0004\b \u0010\u000bR\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010%¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/login/banner/SplashBannerActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/login/SplashViewModel;", "Ljqe;", "", "Lcom/fitness/banner/export/v2/SourceItem;", "jumpSourceList", "getJumpSourceItem", "(Ljava/util/List;)Lcom/fitness/banner/export/v2/SourceItem;", "", "jumpMainActivity", "()V", "Landroid/widget/ImageView;", "imageView", "", "url", "loadBanner", "(Landroid/widget/ImageView;Ljava/lang/String;)V", "startCountDownTimer", "", "count", "updateCountDownText", "(I)V", "stopCountDownTimer", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", LifecycleConstantKt.ON_STOP, "Landroid/os/CountDownTimer;", "countDownTimer", "Landroid/os/CountDownTimer;", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSplashBannerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SplashBannerActivity.kt\ncom/xiaomi/fitness/login/banner/SplashBannerActivity\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n*L\n1#1,146:1\n54#2,3:147\n24#2:150\n59#2,4:151\n63#2,2:164\n844#3,9:155\n*S KotlinDebug\n*F\n+ 1 SplashBannerActivity.kt\ncom/xiaomi/fitness/login/banner/SplashBannerActivity\n*L\n96#1:147,3\n96#1:150\n96#1:151,4\n96#1:164,2\n98#1:155,9\n*E\n"})
public final class SplashBannerActivity extends BaseBindingActivity<SplashViewModel, jqe> {

    @NotNull
    public static final String PARAM_BANNER = "banner";

    @NotNull
    public static final String TAG = "SplashBannerUI";

    @Nullable
    private CountDownTimer countDownTimer;

    private final SourceItem getJumpSourceItem(List<SourceItem> jumpSourceList) {
        List<SourceItem> list = jumpSourceList;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return jumpSourceList.size() == 1 ? (SourceItem) CollectionsKt___CollectionsKt.first((List) jumpSourceList) : (SourceItem) CollectionsKt___CollectionsKt.first((List) jumpSourceList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jumpMainActivity() {
        MainExtKt.showMainActivity$default(this, null, null, 6, null);
        finish();
    }

    private final void loadBanner(final ImageView imageView, String url) {
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(url).target(imageView);
        builderTarget.bitmapConfig(Bitmap.Config.ARGB_8888);
        builderTarget.target(new Target(imageView, this) { // from class: com.xiaomi.fitness.login.banner.SplashBannerActivity$loadBanner$lambda$4$$inlined$target$default$1
            final /* synthetic */ ImageView $imageView$inlined;

            @Override // coil.target.Target
            public void onError(@Nullable Drawable error) {
                Logger.i(SplashBannerActivity.TAG, "image load error");
                this.this$0.jumpMainActivity();
            }

            @Override // coil.target.Target
            public void onStart(@Nullable Drawable placeholder) {
            }

            @Override // coil.target.Target
            public void onSuccess(@NotNull Drawable result) {
                Logger.i(SplashBannerActivity.TAG, "image load success");
                Intrinsics.checkNotNull(result, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                this.$imageView$inlined.setImageBitmap(((BitmapDrawable) result).getBitmap());
                this.this$0.startCountDownTimer();
                SplashBannerPreference.INSTANCE.updateBannerLastShowTime(System.currentTimeMillis() / ((long) 1000));
            }
        });
        imageLoader.enqueue(builderTarget.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(String str, SourceItem sourceItem, BannerItemDetail bannerItemDetail, View view) {
        IBanner.DefaultImpls.onBannerV2Click$default(BannerExtKt.getINSTANCE(IBanner.INSTANCE), str, sourceItem.getHeadLinkType(), bannerItemDetail.getSubTitle(), null, null, null, 56, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(SplashBannerActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.stopCountDownTimer();
        this$0.jumpMainActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startCountDownTimer() {
        stopCountDownTimer();
        TextView tvCountDown = getMBinding().C;
        Intrinsics.checkNotNullExpressionValue(tvCountDown, "tvCountDown");
        ViewExtKt.setVisible(tvCountDown, true);
        this.countDownTimer = new CountDownTimer(((long) 5) * 1000) { // from class: com.xiaomi.fitness.login.banner.SplashBannerActivity.startCountDownTimer.1
            @Override // android.os.CountDownTimer
            public void onFinish() {
                SplashBannerActivity.this.jumpMainActivity();
            }

            @Override // android.os.CountDownTimer
            public void onTick(long millisUntilFinished) {
                Logger.i(SplashBannerActivity.TAG, "onTick " + millisUntilFinished);
                long j = (long) 1000;
                SplashBannerActivity.this.updateCountDownText((int) ((millisUntilFinished + j) / j));
            }
        };
        updateCountDownText(5);
        CountDownTimer countDownTimer = this.countDownTimer;
        if (countDownTimer != null) {
            countDownTimer.start();
        }
    }

    private final void stopCountDownTimer() {
        CountDownTimer countDownTimer = this.countDownTimer;
        if (countDownTimer != null) {
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.countDownTimer = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCountDownText(int count) {
        getMBinding().C.setText(getResources().getQuantityString(sxi.f34083a, count, Integer.valueOf(count)));
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return mui.d;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return dv1.f15951a;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        setRequestedOrientation(UIUtils.INSTANCE.isTabletOrLandscape(this) ? -1 : 1);
        super.onConfigurationChanged(newConfig);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0089  */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActionBarDisplayable(false);
        final BannerItemDetail bannerItemDetail = (BannerItemDetail) getIntent().getSerializableExtra("banner");
        Logger.i(TAG, "bundle result " + bannerItemDetail);
        final String iconImgJumpUrl = null;
        final SourceItem jumpSourceItem = getJumpSourceItem(bannerItemDetail != null ? bannerItemDetail.getSourceList() : null);
        if (bannerItemDetail == null) {
            jumpMainActivity();
        } else {
            if ((jumpSourceItem != null ? jumpSourceItem.getIconDefaultUrl() : null) != null) {
                AppCompatImageView ivBanner = getMBinding().B;
                Intrinsics.checkNotNullExpressionValue(ivBanner, "ivBanner");
                String iconDefaultUrl = jumpSourceItem.getIconDefaultUrl();
                Intrinsics.checkNotNull(iconDefaultUrl);
                loadBanner(ivBanner, iconDefaultUrl);
                if (jumpSourceItem.getHeadLinkType() == 1) {
                    String iconImgJumpUrl2 = jumpSourceItem.getIconImgJumpUrl();
                    if (iconImgJumpUrl2 != null) {
                        iconImgJumpUrl = BannerV2DataKt.appendCurrentLocaleIfNeed(iconImgJumpUrl2);
                    }
                } else {
                    iconImgJumpUrl = jumpSourceItem.getIconImgJumpUrl();
                }
                if (iconImgJumpUrl != null && !StringsKt__StringsKt.isBlank(iconImgJumpUrl)) {
                    getMBinding().B.setOnClickListener(new View.OnClickListener() { // from class: k6n
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            SplashBannerActivity.onCreate$lambda$0(iconImgJumpUrl, jumpSourceItem, bannerItemDetail, view);
                        }
                    });
                }
            } else {
                jumpMainActivity();
            }
        }
        getMBinding().C.setOnClickListener(new View.OnClickListener() { // from class: l6n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SplashBannerActivity.onCreate$lambda$1(this.f24724a, view);
            }
        });
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        stopCountDownTimer();
    }
}
