package com.xiaomi.fitness.detail;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.ShareUtil;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.detail.SportLongShareViewFragment;
import com.xiaomi.fitness.detail.video.share.util.SportTraceVideoShareUtilKt;
import com.xiaomi.fitness.detail.view.SportShareLongView;
import com.xiaomi.fitness.share.BaseShareFragment;
import com.xiaomi.fitness.share.amap.SharePathVideoAmapActivity;
import com.xiaomi.fitness.util.BitmapNativeShareUtil;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.av6;
import defpackage.cha;
import defpackage.j1j;
import defpackage.o3r;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 F2\u00020\u0001:\u0001FB\u0007¢\u0006\u0004\bE\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0004J-\u0010\u001a\u001a\u00020\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010\u0004J\r\u0010 \u001a\u00020\u0002¢\u0006\u0004\b \u0010\u0004J\u000f\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\u0004J\u0017\u0010\"\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010\u0011R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\"\u0010,\u001a\u00020\u000e8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u0010\u0011R$\u00102\u001a\u0004\u0018\u0001018\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010:R\u0016\u0010<\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010:R\u0016\u0010=\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020&0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0011\u0010D\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006G"}, d2 = {"Lcom/xiaomi/fitness/detail/SportLongShareViewFragment;", "Lcom/xiaomi/fitness/share/BaseShareFragment;", "", "initView", "()V", "initSharePic", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "initParamsFromBundle", "(Landroid/os/Bundle;)V", "", "uriStr", "shareLongPicByUri", "(Ljava/lang/String;)V", "", CommonConstants.KEY_SESSION, "shareVideoToWX", "(I)V", "shareVideoViaMore", "shareVideoViaWechatBySharesheet", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "shareViaMore", "intentToShareVideo", "saveSharePic", "shareToWX", "Lcha;", "_binding", "Lcha;", "Landroid/graphics/Bitmap;", "shareBitmap", "Landroid/graphics/Bitmap;", "Lcom/xiaomi/fitness/detail/view/SportShareLongView;", "sportShareLongView", "Lcom/xiaomi/fitness/detail/view/SportShareLongView;", "sportDataType", "I", "getSportDataType", "()I", "setSportDataType", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "mBasicReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "getMBasicReport", "()Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "setMBasicReport", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;)V", "", "isGpsPathValid", "Z", "shouldShowSquarePicIcon", "calledFromSportTraceVideo", "videoUriStr", "Ljava/lang/String;", "Landroidx/lifecycle/MutableLiveData;", "bitmapLiveData", "Landroidx/lifecycle/MutableLiveData;", "getMBinding", "()Lcha;", "mBinding", "<init>", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportLongShareViewFragment extends BaseShareFragment {

    @NotNull
    public static final String TAG = "SportLongShareViewFragment";

    @Nullable
    private cha _binding;
    private boolean calledFromSportTraceVideo;

    @Nullable
    private SportBasicReport mBasicReport;

    @Nullable
    private Bitmap shareBitmap;
    private int sportDataType;
    private SportShareLongView sportShareLongView;
    private boolean isGpsPathValid = true;
    private boolean shouldShowSquarePicIcon = true;

    @NotNull
    private String videoUriStr = "";

    @NotNull
    private final MutableLiveData<Bitmap> bitmapLiveData = new MutableLiveData<>();

    private final void initParamsFromBundle(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString(SportRecordBundleKey.BUNDLE_PARAM_URI);
            this.sportDataType = bundle.getInt("sport_type", 22);
            this.mBasicReport = (SportBasicReport) bundle.getSerializable("sport_report");
            this.isGpsPathValid = bundle.getBoolean(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_GPS_VALID, false);
            this.shouldShowSquarePicIcon = bundle.getBoolean(SportRecordBundleKey.BUNDLE_PARAMS_SHOULD_SHOW_SQUARE_PIC_ICON, true);
            shareLongPicByUri(string);
            this.calledFromSportTraceVideo = bundle.getBoolean(SportRecordBundleKey.BUNDLE_PARAMS_SHARE_VIDEO, false);
            this.videoUriStr = bundle.getString(SportRecordBundleKey.BUNDLE_PARAMS_VIDEO_URI_STRING, "");
        }
    }

    private final void initSharePic() {
        boolean z = false;
        boolean z2 = Build.VERSION.SDK_INT >= 29;
        if (this.isGpsPathValid && !AppUtil.INSTANCE.isPlayChannel() && z2) {
            z = true;
        }
        SportShareLongView sportShareLongView = this.sportShareLongView;
        SportShareLongView sportShareLongView2 = null;
        if (sportShareLongView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sportShareLongView");
            sportShareLongView = null;
        }
        sportShareLongView.setShareVideoIconVisible(z);
        SportShareLongView sportShareLongView3 = this.sportShareLongView;
        if (sportShareLongView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sportShareLongView");
        } else {
            sportShareLongView2 = sportShareLongView3;
        }
        sportShareLongView2.setShareLongPicListener(new SportShareLongView.ShareLongPicListener() { // from class: com.xiaomi.fitness.detail.SportLongShareViewFragment.initSharePic.1
            @Override // com.xiaomi.fitness.detail.view.SportShareLongView.ShareLongPicListener
            public void intentToShareCard() {
            }

            @Override // com.xiaomi.fitness.detail.view.SportShareLongView.ShareLongPicListener
            public void intentToShareVideo() {
                if (SportLongShareViewFragment.this.calledFromSportTraceVideo) {
                    return;
                }
                SportLongShareViewFragment.this.intentToShareVideo();
            }

            @Override // com.xiaomi.fitness.detail.view.SportShareLongView.ShareLongPicListener
            public void saveSharePic() {
                if (!SportLongShareViewFragment.this.calledFromSportTraceVideo) {
                    SportLongShareViewFragment.this.saveSharePic();
                    return;
                }
                FragmentActivity fragmentActivityRequireActivity = SportLongShareViewFragment.this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                ToastExtKt.toastShort(fragmentActivityRequireActivity, j1j.k9);
            }

            @Override // com.xiaomi.fitness.detail.view.SportShareLongView.ShareLongPicListener
            public void sharePicViaMore() {
                if (SportLongShareViewFragment.this.calledFromSportTraceVideo) {
                    SportLongShareViewFragment.this.shareVideoViaMore();
                } else {
                    SportLongShareViewFragment.this.shareViaMore();
                }
            }

            @Override // com.xiaomi.fitness.detail.view.SportShareLongView.ShareLongPicListener
            public void shareToWX(int session) {
                if (o3r.i().p()) {
                    if (SportLongShareViewFragment.this.calledFromSportTraceVideo) {
                        SportLongShareViewFragment.this.shareVideoToWX(session);
                    } else {
                        SportLongShareViewFragment.this.shareToWX(session);
                    }
                }
            }
        });
    }

    private final void initView() {
        initParamsFromBundle(getArguments());
        SportShareLongView sportShareLongView = this.sportShareLongView;
        if (sportShareLongView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sportShareLongView");
            sportShareLongView = null;
        }
        sportShareLongView.setSquareImageIconVisible(this.shouldShowSquarePicIcon);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit intentToShareVideo$lambda$3$lambda$2(Bundle bundle, Intent it) {
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtras(bundle);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onInflateView$lambda$0(SportLongShareViewFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
        return Unit.INSTANCE;
    }

    private final void shareLongPicByUri(String uriStr) {
        this.bitmapLiveData.observe(getViewLifecycleOwner(), new SportLongShareViewFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: qqn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportLongShareViewFragment.shareLongPicByUri$lambda$4(this.f31753a, (Bitmap) obj);
            }
        }));
        if (uriStr != null) {
            SportShareLongView sportShareLongView = this.sportShareLongView;
            if (sportShareLongView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sportShareLongView");
                sportShareLongView = null;
            }
            sportShareLongView.setRootViewVisibility(0);
            try {
                String path = Uri.parse(uriStr).getPath();
                Logger.d(TAG, "uriPath=" + path);
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new SportLongShareViewFragment$shareLongPicByUri$2$1(path, this, null), 2, null);
            } catch (Exception e) {
                Logger.i(TAG, "shareLongPicByUri decodeFile failed. error=" + e);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareLongPicByUri$lambda$4(SportLongShareViewFragment this$0, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SportShareLongView sportShareLongView = this$0.sportShareLongView;
        if (sportShareLongView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sportShareLongView");
            sportShareLongView = null;
        }
        sportShareLongView.setImageBitmap(bitmap);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void shareVideoToWX(int session) {
        if (session == o3r.j()) {
            shareVideoViaWechatBySharesheet();
            return;
        }
        CommonDialog commonDialogCreate = new CommonDialog.c("shareVideoToWx").setDialogDescriptionString(new DialogParams.DialogDescriptionString(j1j.Ba, new Object[0])).setNegativeText(j1j.I).setPositiveText(j1j.L1).setCancelable(true).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        Intrinsics.checkNotNull(commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.detail.SportLongShareViewFragment.shareVideoToWX.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -1) {
                    o3r.i().D(SportLongShareViewFragment.this.requireActivity());
                }
            }
        }), "null cannot be cast to non-null type com.xiaomi.fitness.baseui.dialog.CommonDialog<*>");
        commonDialogCreate.showIfNeed(getParentFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void shareVideoViaMore() {
        Uri uri = Uri.parse(this.videoUriStr);
        Intrinsics.checkNotNull(uri);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        SportTraceVideoShareUtilKt.shareVideoWithUri(uri, contextRequireContext);
    }

    private final void shareVideoViaWechatBySharesheet() {
        Uri uri = Uri.parse(this.videoUriStr);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setPackage("com.tencent.mm");
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.setType("video/*");
        requireContext().startActivity(intent);
    }

    @Nullable
    public final SportBasicReport getMBasicReport() {
        return this.mBasicReport;
    }

    @NotNull
    public final cha getMBinding() {
        cha chaVar = this._binding;
        Intrinsics.checkNotNull(chaVar);
        return chaVar;
    }

    public final int getSportDataType() {
        return this.sportDataType;
    }

    public final void intentToShareVideo() {
        final Bundle bundle = new Bundle();
        SportBasicReport sportBasicReport = this.mBasicReport;
        if (sportBasicReport != null) {
            Intrinsics.checkNotNull(sportBasicReport);
            bundle.putLong("time_stamp", sportBasicReport.getTimeStamp());
            bundle.putSerializable("sport_report", this.mBasicReport);
            bundle.putInt("sport_type", this.sportDataType);
            LaunchExtensionKt.startActivity(this, (Class<?>) SharePathVideoAmapActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: rqn
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportLongShareViewFragment.intentToShareVideo$lambda$3$lambda$2(bundle, (Intent) obj);
                }
            });
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        this._binding = cha.A0(inflater, container, false);
        SportShareLongView sportShareLongView = getMBinding().A;
        this.sportShareLongView = sportShareLongView;
        if (sportShareLongView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sportShareLongView");
            sportShareLongView = null;
        }
        sportShareLongView.onKeyBack(new Function0() { // from class: sqn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SportLongShareViewFragment.onInflateView$lambda$0(this.f33894a);
            }
        });
        View root = getMBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        initView();
        initSharePic();
    }

    @Override // com.xiaomi.fitness.share.BaseShareFragment
    public void saveSharePic() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Bitmap bitmap = this.shareBitmap;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ShareUtil.saveImageToGallery$default(fragmentActivityRequireActivity, bitmap, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), false, false, 24, null);
    }

    public final void setMBasicReport(@Nullable SportBasicReport sportBasicReport) {
        this.mBasicReport = sportBasicReport;
    }

    public final void setSportDataType(int i) {
        this.sportDataType = i;
    }

    @Override // com.xiaomi.fitness.share.BaseShareFragment
    public void shareToWX(int session) {
        o3r.i().v(requireActivity(), this.shareBitmap, getString(j1j.f22328a), getString(j1j.p2), session);
    }

    @Override // com.xiaomi.fitness.share.BaseShareFragment
    public void shareViaMore() {
        Bitmap bitmap = this.shareBitmap;
        if (bitmap != null) {
            BitmapNativeShareUtil.INSTANCE.shareBitmapViaMore(new WeakReference<>(requireActivity()), bitmap);
        }
    }
}
