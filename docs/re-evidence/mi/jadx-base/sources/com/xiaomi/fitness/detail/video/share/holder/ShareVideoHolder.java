package com.xiaomi.fitness.detail.video.share.holder;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import com.amap.api.maps.AMap;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.ShareUtil;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.detail.SportLongShareViewFragment;
import com.xiaomi.fitness.detail.view.SportShareLongView;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.hqp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB/\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0004R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/detail/video/share/holder/ShareVideoHolder;", "", "", "showSportTraceShareFragment", "()V", "initHolder", "Landroidx/fragment/app/FragmentActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "Lhqp;", "mBinding", "Lhqp;", "getMBinding", "()Lhqp;", "Landroidx/lifecycle/MutableLiveData;", "Landroid/net/Uri;", "recordedVideoUriLiveData", "Landroidx/lifecycle/MutableLiveData;", "getRecordedVideoUriLiveData", "()Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "basicReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "Lcom/xiaomi/fitness/detail/view/SportShareLongView;", "sportShareLongView", "Lcom/xiaomi/fitness/detail/view/SportShareLongView;", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lhqp;Landroidx/lifecycle/MutableLiveData;Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;)V", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ShareVideoHolder {

    @NotNull
    public static final String TAG = "ShareVideoHolder";

    @NotNull
    private final FragmentActivity activity;

    @Nullable
    private final SportBasicReport basicReport;

    @NotNull
    private final hqp mBinding;

    @NotNull
    private final MutableLiveData<Uri> recordedVideoUriLiveData;
    private SportShareLongView sportShareLongView;

    public ShareVideoHolder(@NotNull FragmentActivity activity, @NotNull hqp mBinding, @NotNull MutableLiveData<Uri> recordedVideoUriLiveData, @Nullable SportBasicReport sportBasicReport) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(mBinding, "mBinding");
        Intrinsics.checkNotNullParameter(recordedVideoUriLiveData, "recordedVideoUriLiveData");
        this.activity = activity;
        this.mBinding = mBinding;
        this.recordedVideoUriLiveData = recordedVideoUriLiveData;
        this.basicReport = sportBasicReport;
    }

    @NotNull
    public final FragmentActivity getActivity() {
        return this.activity;
    }

    @NotNull
    public final hqp getMBinding() {
        return this.mBinding;
    }

    @NotNull
    public final MutableLiveData<Uri> getRecordedVideoUriLiveData() {
        return this.recordedVideoUriLiveData;
    }

    public final void initHolder() {
        this.sportShareLongView = this.mBinding.K;
    }

    public final void showSportTraceShareFragment() {
        this.mBinding.D.getMap().getMapScreenShot(new AMap.OnMapScreenShotListener() { // from class: com.xiaomi.fitness.detail.video.share.holder.ShareVideoHolder.showSportTraceShareFragment.1
            @Override // com.amap.api.maps.AMap.OnMapScreenShotListener
            public void onMapScreenShot(Bitmap bitmap, int p1) {
            }

            @Override // com.amap.api.maps.AMap.OnMapScreenShotListener
            public void onMapScreenShot(Bitmap bitmap) {
                Logger.d(ShareVideoHolder.TAG, "onMapScreenShot bitmap=" + (bitmap == null ? AbstractJsonLexerKt.NULL : bitmap));
                if (bitmap == null) {
                    return;
                }
                SportShareLongView sportShareLongView = ShareVideoHolder.this.sportShareLongView;
                SportShareLongView sportShareLongView2 = null;
                if (sportShareLongView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sportShareLongView");
                    sportShareLongView = null;
                }
                sportShareLongView.setImageBitmap(bitmap);
                SportShareLongView sportShareLongView3 = ShareVideoHolder.this.sportShareLongView;
                if (sportShareLongView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sportShareLongView");
                    sportShareLongView3 = null;
                }
                sportShareLongView3.setShareVideoIconVisible(false);
                SportShareLongView sportShareLongView4 = ShareVideoHolder.this.sportShareLongView;
                if (sportShareLongView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sportShareLongView");
                } else {
                    sportShareLongView2 = sportShareLongView4;
                }
                sportShareLongView2.setSquareImageIconVisible(false);
                Uri uriSaveImageToTmp = ShareUtil.INSTANCE.saveImageToTmp(bitmap);
                Bundle bundle = new Bundle();
                ShareVideoHolder shareVideoHolder = ShareVideoHolder.this;
                bundle.putString(SportRecordBundleKey.BUNDLE_PARAM_URI, String.valueOf(uriSaveImageToTmp));
                SportBasicReport sportBasicReport = shareVideoHolder.basicReport;
                bundle.putInt("sport_type", sportBasicReport != null ? sportBasicReport.getSportType() : 1);
                bundle.putSerializable("sport_report", shareVideoHolder.basicReport);
                bundle.putBoolean(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_GPS_VALID, true);
                bundle.putBoolean(SportRecordBundleKey.BUNDLE_PARAMS_SHOULD_SHOW_VIDEO_ICON, false);
                bundle.putBoolean(SportRecordBundleKey.BUNDLE_PARAMS_SHOULD_SHOW_SQUARE_PIC_ICON, false);
                bundle.putBoolean(SportRecordBundleKey.BUNDLE_PARAMS_SHARE_VIDEO, true);
                bundle.putString(SportRecordBundleKey.BUNDLE_PARAMS_VIDEO_URI_STRING, String.valueOf(shareVideoHolder.getRecordedVideoUriLiveData().getValue()));
                BaseFragmentExKt.gotoFragmentPage(ShareVideoHolder.this.getActivity(), SportLongShareViewFragment.class, bundle, true);
            }
        });
    }
}
