package com.huami.moving.ui.sport.detail;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.moving.R;
import com.huami.moving.ui.export.ExportGPXActivity;
import com.huami.moving.ui.sport.detail.SportSharePreDialog;
import com.huami.moving.ui.sport.detail.share.SportDetailsInterface;
import com.huami.moving.ui.sport.detail.share.TrackVideoShareActivity;
import com.huami.moving.ui.sport.detail.tool.ShareFileUtils;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.moving.ui.utils.SportTypeIconUtils;
import com.huami.moving.ui.utils.SportTypeIdentifier;
import com.huami.moving.ui.watermark.WatermarkClient;
import com.huami.moving.utils.Utils;
import com.huami.network.hmnetwork.config.HMRunning;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.notification.TransportUri;
import com.huami.widget.share.ShareAnalyticsListener;
import com.huami.widget.share.ShareConfig;
import com.huami.widget.share.ShareContent;
import com.huami.widget.share.ShareListener;
import com.huami.widget.share.ShareLongDialog;
import com.tbruyelle.rxpermissions2.RxPermissions;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import io.reactivex.functions.Consumer;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 P2\u00020\u0001:\u0006QRPSTUB\u0007¢\u0006\u0004\bN\u0010OJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J+\u0010\u000b\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J&\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016J\u001a\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eJ\u000e\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!J\u000e\u0010%\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020$J\u000e\u0010'\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020&J\u000e\u0010)\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020(J\u0010\u0010*\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eJ\"\u00100\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010\u00072\b\u0010/\u001a\u0004\u0018\u00010.J\u000e\u00102\u001a\u00020\u00042\u0006\u0010\"\u001a\u000201R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00109\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010<\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010?\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010B\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010E\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\"\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070F8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010M\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006V"}, d2 = {"Lcom/huami/moving/ui/sport/detail/SportSharePreDialog;", "Landroidx/appcompat/app/AppCompatDialogFragment;", "", "visibility", "", DTransferConstants.SEARCH_KEY, "", "", "permissions", "Lkotlin/Function0;", TransportUri.ACTION_BLOCK, "o", "([Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "shortPath", "longPath", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/widget/share/ShareContent;", "i", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "onStart", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Landroidx/fragment/app/FragmentActivity;", "activity", "onShareLong", "Lcom/huami/moving/ui/sport/detail/SportSharePreDialog$CaptureScreenListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setCaptureScreenListener", "Lcom/huami/moving/ui/sport/detail/SportSharePreDialog$MutualCallerListener;", "setMutualCallerListener", "Lcom/huami/moving/ui/sport/detail/SportSharePreDialog$AnalyticsEventListener;", "setAnalyticsEventListener", "Lcom/huami/moving/ui/sport/detail/SportSharePreDialog$ShareExportListener;", "setShareExportListener", "showCaptureScreen", "Landroidx/fragment/app/FragmentManager;", "manager", "tag", "Landroidx/fragment/app/DialogFragment;", "fragment", "showAllowingStateLoss", "Lcom/huami/moving/ui/sport/detail/SportSharePreDialog$ShareVideoTrackListener;", "setShareVideoTrackListener", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "a", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loading", "b", "Lcom/huami/moving/ui/sport/detail/SportSharePreDialog$CaptureScreenListener;", "captureListener", "c", "Lcom/huami/moving/ui/sport/detail/SportSharePreDialog$MutualCallerListener;", "mutualListener", GoogleApiAvailabilityLight.a, "Lcom/huami/moving/ui/sport/detail/SportSharePreDialog$AnalyticsEventListener;", "analyticsListener", "e", "Lcom/huami/moving/ui/sport/detail/SportSharePreDialog$ShareExportListener;", "mShareExportListener", "f", "Lcom/huami/moving/ui/sport/detail/SportSharePreDialog$ShareVideoTrackListener;", "mShareVideoTrackListener", "", "g", "Ljava/util/Map;", "extrasClick", "Lcom/huami/widget/share/ShareLongDialog;", "h", "Lcom/huami/widget/share/ShareLongDialog;", "shareLongDialog", "<init>", "()V", "Companion", "AnalyticsEventListener", "CaptureScreenListener", "MutualCallerListener", "ShareExportListener", "ShareVideoTrackListener", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class SportSharePreDialog extends AppCompatDialogFragment {

    @NotNull
    public static final String SPORT_SHARE_TAB_LONG = "sportDetails_long.jpg";

    @NotNull
    public static final String SPORT_SHARE_TAB_SHORT = "sportDetails_short.jpg";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog loading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private CaptureScreenListener captureListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private MutualCallerListener mutualListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private AnalyticsEventListener analyticsListener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private ShareExportListener mShareExportListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private ShareVideoTrackListener mShareVideoTrackListener;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private Map<String, String> extrasClick;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private ShareLongDialog shareLongDialog;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/moving/ui/sport/detail/SportSharePreDialog$AnalyticsEventListener;", "", "", DbUtils.Const.Columns.Event.EVENT_ID, "", "onAnalyticsClick", "moving_release"}, k = 1, mv = {1, 5, 1})
    public interface AnalyticsEventListener {
        void onAnalyticsClick(@NotNull String eventId);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/moving/ui/sport/detail/SportSharePreDialog$CaptureScreenListener;", "", "Lcom/huami/moving/ui/sport/detail/SportSharePreDialog;", "dialog", "", "onCaptureScreen", "moving_release"}, k = 1, mv = {1, 5, 1})
    public interface CaptureScreenListener {
        void onCaptureScreen(@NotNull SportSharePreDialog dialog);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0006"}, d2 = {"Lcom/huami/moving/ui/sport/detail/SportSharePreDialog$MutualCallerListener;", "", "", "getTrackId", "", "getDeviceSource", "moving_release"}, k = 1, mv = {1, 5, 1})
    public interface MutualCallerListener {
        int getDeviceSource();

        long getTrackId();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0006"}, d2 = {"Lcom/huami/moving/ui/sport/detail/SportSharePreDialog$ShareExportListener;", "", "", "isHasTrack", "", "getSportType", "moving_release"}, k = 1, mv = {1, 5, 1})
    public interface ShareExportListener {
        /* JADX INFO: renamed from: getSportType */
        int getRealSportType();

        boolean isHasTrack();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0006"}, d2 = {"Lcom/huami/moving/ui/sport/detail/SportSharePreDialog$ShareVideoTrackListener;", "", "", "getSportType", "", "isHasTrack", "moving_release"}, k = 1, mv = {1, 5, 1})
    public interface ShareVideoTrackListener {
        /* JADX INFO: renamed from: getSportType */
        int getRealSportType();

        boolean isHasTrack();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public final /* synthetic */ FragmentActivity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FragmentActivity fragmentActivity) {
            super(0);
            this.b = fragmentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Unit getA() {
            SportSharePreDialog sportSharePreDialog = SportSharePreDialog.this;
            LoadingDialog loadingDialogShowDialog = sportSharePreDialog.loading;
            if (loadingDialogShowDialog == null) {
                loadingDialogShowDialog = null;
            } else {
                ShareLongDialog shareLongDialog = SportSharePreDialog.this.shareLongDialog;
                boolean zIsShowing = shareLongDialog == null ? false : shareLongDialog.isShowing();
                if (!zIsShowing && !zIsShowing) {
                    loadingDialogShowDialog.show();
                }
                Unit unit = Unit.INSTANCE;
            }
            if (loadingDialogShowDialog == null) {
                FragmentActivity fragmentActivity = this.b;
                loadingDialogShowDialog = LoadingDialog.showDialog(fragmentActivity, fragmentActivity.getString(R.string.running_history_loading));
            }
            sportSharePreDialog.loading = loadingDialogShowDialog;
            CaptureScreenListener captureScreenListener = SportSharePreDialog.this.captureListener;
            if (captureScreenListener == null) {
                return null;
            }
            captureScreenListener.onCaptureScreen(SportSharePreDialog.this);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SportSharePreDialog sportSharePreDialog = SportSharePreDialog.this;
            LoadingDialog loadingDialogShowDialog = sportSharePreDialog.loading;
            if (loadingDialogShowDialog == null) {
                loadingDialogShowDialog = null;
            } else {
                loadingDialogShowDialog.show();
                Unit unit = Unit.INSTANCE;
            }
            if (loadingDialogShowDialog == null) {
                loadingDialogShowDialog = LoadingDialog.showDialog(SportSharePreDialog.this.getContext(), SportSharePreDialog.this.getString(R.string.running_history_loading));
            }
            sportSharePreDialog.loading = loadingDialogShowDialog;
            CaptureScreenListener captureScreenListener = SportSharePreDialog.this.captureListener;
            if (captureScreenListener != null) {
                captureScreenListener.onCaptureScreen(SportSharePreDialog.this);
            }
            Map map = SportSharePreDialog.this.extrasClick;
            Objects.requireNonNull(map);
            map.put("pos", "picture");
            CountEventBuilder countEventBuilder = new CountEventBuilder(SportAnalytics.SPORT_DETAIL_SHARE_C);
            Map<String, String> map2 = SportSharePreDialog.this.extrasClick;
            Objects.requireNonNull(map2);
            Analytics.recordEvent(countEventBuilder.putExtras(map2).setAnonymous(!Utils.isChinaUser()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            WatermarkClient.Companion companion = WatermarkClient.INSTANCE;
            companion.getInstance().startWatermarkActivity(SportSharePreDialog.this.requireContext(), SportSharePreDialog.this.mutualListener.getTrackId(), SportSharePreDialog.this.mutualListener.getDeviceSource());
            companion.getInstance().setFromSportSummary(false);
            Map map = SportSharePreDialog.this.extrasClick;
            Objects.requireNonNull(map);
            map.put("pos", SportAnalytics.ParamValue.ShareType.WATER_MARK_CAMERA);
            CountEventBuilder countEventBuilder = new CountEventBuilder(SportAnalytics.SPORT_DETAIL_SHARE_C);
            Map<String, String> map2 = SportSharePreDialog.this.extrasClick;
            Objects.requireNonNull(map2);
            Analytics.recordEvent(countEventBuilder.putExtras(map2).setAnonymous(!Utils.isChinaUser()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Unit> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ExportGPXActivity.INSTANCE.start(SportSharePreDialog.this.requireContext(), SportSharePreDialog.this.mutualListener.getTrackId(), SportSharePreDialog.this.mutualListener.getDeviceSource(), SportSharePreDialog.this.mShareExportListener.getRealSportType());
            Map map = SportSharePreDialog.this.extrasClick;
            Objects.requireNonNull(map);
            map.put("pos", SportAnalytics.ParamValue.ShareType.EXPORT_TRACK);
            CountEventBuilder countEventBuilder = new CountEventBuilder(SportAnalytics.SPORT_DETAIL_SHARE_C);
            Map<String, String> map2 = SportSharePreDialog.this.extrasClick;
            Objects.requireNonNull(map2);
            Analytics.recordEvent(countEventBuilder.putExtras(map2).setAnonymous(!Utils.isChinaUser()));
        }
    }

    private final ShareContent i(String shortPath, String longPath, Context context) {
        ShareContent shareContent = new ShareContent();
        shareContent.title = context.getString(R.string.running_share_to_sport_trace);
        shareContent.content = "";
        shareContent.url = HMRunning.SHARE_URL;
        shareContent.topic = context.getString(R.string.running_share_to_topic, Utils.appName());
        shareContent.shortBitmapUrl = shortPath;
        shareContent.longBitmapUrl = longPath;
        return shareContent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(SportSharePreDialog sportSharePreDialog, FragmentActivity fragmentActivity, Boolean bool) {
        a aVar = sportSharePreDialog.new a(fragmentActivity);
        if (!bool.booleanValue()) {
            aVar = null;
        }
        if (aVar == null) {
            return;
        }
        aVar.getA();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(SportSharePreDialog sportSharePreDialog, View view) {
        AnalyticsEventListener analyticsEventListener = sportSharePreDialog.analyticsListener;
        if (analyticsEventListener != null) {
            analyticsEventListener.onAnalyticsClick(SportAnalytics.EVENT_SHARE_PIC_BUTTON_CLICK);
        }
        sportSharePreDialog.o(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, sportSharePreDialog.new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(SportSharePreDialog sportSharePreDialog, View view) {
        AnalyticsEventListener analyticsEventListener = sportSharePreDialog.analyticsListener;
        if (analyticsEventListener != null) {
            analyticsEventListener.onAnalyticsClick(SportAnalytics.EVENT_SHARE_MARK_BUTTON_CLICK);
        }
        sportSharePreDialog.o(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.CAMERA"}, sportSharePreDialog.new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(SportSharePreDialog sportSharePreDialog, View view) {
        sportSharePreDialog.o(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, sportSharePreDialog.new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(SportSharePreDialog sportSharePreDialog, View view) {
        sportSharePreDialog.dismissAllowingStateLoss();
    }

    private final void o(String[] permissions, final Function0<Unit> block) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        new RxPermissions(activity).request((String[]) Arrays.copyOf(permissions, permissions.length)).subscribe(new Consumer() { // from class: mc7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SportSharePreDialog.p(block, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(Function0 function0, Boolean bool) {
        if (!bool.booleanValue()) {
            function0 = null;
        }
        if (function0 == null) {
            return;
        }
        function0.getA();
    }

    private final void q(boolean visibility) {
        if (visibility) {
            View view = getView();
            ((TextView) (view == null ? null : view.findViewById(R.id.run_share_video))).setVisibility(0);
            View view2 = getView();
            ((TextView) (view2 != null ? view2.findViewById(R.id.run_share_video) : null)).setOnClickListener(new View.OnClickListener() { // from class: hc7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    SportSharePreDialog.r(this.a, view3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(SportSharePreDialog sportSharePreDialog, View view) {
        if (sportSharePreDialog.getActivity() instanceof SportDetailsInterface) {
            KeyEventDispatcher.Component activity = sportSharePreDialog.getActivity();
            Objects.requireNonNull(activity, "null cannot be cast to non-null type com.huami.moving.ui.sport.detail.share.SportDetailsInterface");
            ((SportDetailsInterface) activity).setIsPlayTrack();
            KeyEventDispatcher.Component activity2 = sportSharePreDialog.getActivity();
            Objects.requireNonNull(activity2, "null cannot be cast to non-null type com.huami.moving.ui.sport.detail.share.SportDetailsInterface");
            ((SportDetailsInterface) activity2).uploadData();
        }
        TrackVideoShareActivity.INSTANCE.start(sportSharePreDialog.requireContext(), sportSharePreDialog.mutualListener.getTrackId(), sportSharePreDialog.mutualListener.getDeviceSource(), sportSharePreDialog.mShareVideoTrackListener.getRealSportType());
        Analytics.recordEvent(new CountEventBuilder(SportAnalytics.ENTER_ROUTE_VIDEO_C).setAnonymous(false));
        Map<String, String> map = sportSharePreDialog.extrasClick;
        Objects.requireNonNull(map);
        map.put("pos", SportAnalytics.ParamValue.ShareType.ROUTE_VIDEO);
        CountEventBuilder countEventBuilder = new CountEventBuilder(SportAnalytics.SPORT_DETAIL_SHARE_C);
        Map<String, String> map2 = sportSharePreDialog.extrasClick;
        Objects.requireNonNull(map2);
        Analytics.recordEvent(countEventBuilder.putExtras(map2).setAnonymous(!Utils.isChinaUser()));
        sportSharePreDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(SportSharePreDialog sportSharePreDialog, DialogInterface dialogInterface) {
        ShareLongDialog shareLongDialog = sportSharePreDialog.shareLongDialog;
        if (shareLongDialog != null) {
            shareLongDialog.dismiss();
        }
        sportSharePreDialog.shareLongDialog = null;
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog_share_pre_new, container, false);
    }

    public final void onShareLong(@Nullable final FragmentActivity activity) {
        AnalyticsEventListener analyticsEventListener = this.analyticsListener;
        if (analyticsEventListener != null) {
            analyticsEventListener.onAnalyticsClick(SportAnalytics.EVENT_SHARE_PIC_BUTTON_CLICK);
        }
        if (activity == null) {
            return;
        }
        new RxPermissions(activity).request("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE").subscribe(new Consumer() { // from class: lc7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SportSharePreDialog.j(this.a, activity, (Boolean) obj);
            }
        });
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        Window window = dialog == null ? null : dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            attributes.width = -1;
            attributes.height = -2;
            window.setAttributes(attributes);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        boolean hasTrackPage;
        Intent intent;
        String stringExtra;
        super.onViewCreated(view, savedInstanceState);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.extrasClick = linkedHashMap;
        Objects.requireNonNull(linkedHashMap);
        FragmentActivity activity = getActivity();
        String str = "";
        if (activity != null && (intent = activity.getIntent()) != null && (stringExtra = intent.getStringExtra(StatEvent.CF)) != null) {
            str = stringExtra;
        }
        linkedHashMap.put("cf", str);
        Map<String, String> map = this.extrasClick;
        Objects.requireNonNull(map);
        ShareExportListener shareExportListener = this.mShareExportListener;
        map.put("tp", shareExportListener != null && shareExportListener.isHasTrack() ? "withGPS" : "withoutGPS");
        Map<String, String> map2 = this.extrasClick;
        Objects.requireNonNull(map2);
        ShareExportListener shareExportListener2 = this.mShareExportListener;
        map2.put("sportstype", String.valueOf(shareExportListener2 == null ? null : Integer.valueOf(shareExportListener2.getRealSportType())));
        View view2 = getView();
        ((TextView) (view2 == null ? null : view2.findViewById(R.id.run_share_long_img))).setOnClickListener(new View.OnClickListener() { // from class: gc7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                SportSharePreDialog.k(this.a, view3);
            }
        });
        View view3 = getView();
        ((TextView) (view3 == null ? null : view3.findViewById(R.id.run_share_long_cam))).setOnClickListener(new View.OnClickListener() { // from class: ic7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                SportSharePreDialog.l(this.a, view4);
            }
        });
        ShareExportListener shareExportListener3 = this.mShareExportListener;
        if ((shareExportListener3 != null && shareExportListener3.isHasTrack()) && this.mShareExportListener.getRealSportType() != 26 && !SportTypeIdentifier.isComplexSport(this.mShareExportListener.getRealSportType())) {
            View view4 = getView();
            ((TextView) (view4 == null ? null : view4.findViewById(R.id.run_share_export))).setVisibility(0);
            View view5 = getView();
            ((TextView) (view5 == null ? null : view5.findViewById(R.id.run_share_export))).setOnClickListener(new View.OnClickListener() { // from class: kc7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view6) {
                    SportSharePreDialog.m(this.a, view6);
                }
            });
        }
        if (getActivity() instanceof SportDetailsInterface) {
            KeyEventDispatcher.Component activity2 = getActivity();
            Objects.requireNonNull(activity2, "null cannot be cast to non-null type com.huami.moving.ui.sport.detail.share.SportDetailsInterface");
            hasTrackPage = ((SportDetailsInterface) activity2).getHasTrackPage();
        } else {
            hasTrackPage = true;
        }
        ShareExportListener shareExportListener4 = this.mShareExportListener;
        q(((shareExportListener4 == null ? false : SportTypeIconUtils.INSTANCE.getSportNameMap().containsKey(Integer.valueOf(shareExportListener4.getRealSportType()))) && hasTrackPage) && Utils.isChinaUser());
        View view6 = getView();
        ((TextView) (view6 != null ? view6.findViewById(R.id.cancel_tv) : null)).setOnClickListener(new View.OnClickListener() { // from class: jc7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view7) {
                SportSharePreDialog.n(this.a, view7);
            }
        });
    }

    public final void setAnalyticsEventListener(@NotNull AnalyticsEventListener listener) {
        this.analyticsListener = listener;
    }

    public final void setCaptureScreenListener(@NotNull CaptureScreenListener listener) {
        this.captureListener = listener;
    }

    public final void setMutualCallerListener(@NotNull MutualCallerListener listener) {
        this.mutualListener = listener;
    }

    public final void setShareExportListener(@NotNull ShareExportListener listener) {
        this.mShareExportListener = listener;
    }

    public final void setShareVideoTrackListener(@NotNull ShareVideoTrackListener listener) {
        this.mShareVideoTrackListener = listener;
    }

    public final void showAllowingStateLoss(@NotNull FragmentManager manager, @Nullable String tag, @Nullable DialogFragment fragment) {
        try {
            Field declaredField = DialogFragment.class.getDeclaredField("mDismissed");
            declaredField.setAccessible(true);
            declaredField.setBoolean(this, false);
            Field declaredField2 = DialogFragment.class.getDeclaredField("mShownByMe");
            declaredField2.setAccessible(true);
            declaredField2.setBoolean(this, true);
            if ((fragment == null ? null : Boolean.valueOf(fragment.isAdded())).booleanValue() || manager.findFragmentByTag(tag) != null || manager.isDestroyed()) {
                return;
            }
            FragmentTransaction fragmentTransactionBeginTransaction = manager.beginTransaction();
            fragmentTransactionBeginTransaction.add(fragment, tag);
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
            manager.executePendingTransactions();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void showCaptureScreen(@Nullable FragmentActivity activity) {
        LoadingDialog loadingDialog = this.loading;
        if (loadingDialog != null) {
            if (!loadingDialog.isShowing()) {
                loadingDialog = null;
            }
            if (loadingDialog != null) {
                loadingDialog.dismiss();
            }
        }
        if (activity == null) {
            return;
        }
        ShareFileUtils.Companion companion = ShareFileUtils.INSTANCE;
        String absolutePath = companion.getShareCacheFile(activity, SPORT_SHARE_TAB_SHORT).getAbsolutePath();
        String absolutePath2 = companion.getShareCacheFile(activity, SPORT_SHARE_TAB_LONG).getAbsolutePath();
        ShareConfig shareConfig = new ShareConfig();
        shareConfig.isOnlyImage = true;
        if (this.shareLongDialog == null) {
            this.shareLongDialog = ShareLongDialog.newInstance(shareConfig, i(absolutePath, absolutePath2, activity), R.color.color_tab_selected);
        }
        ShareLongDialog shareLongDialog = this.shareLongDialog;
        if (shareLongDialog != null) {
            shareLongDialog.setCancelable(true);
        }
        ShareLongDialog shareLongDialog2 = this.shareLongDialog;
        if (shareLongDialog2 != null) {
            shareLongDialog2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: fc7
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    SportSharePreDialog.s(this.a, dialogInterface);
                }
            });
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", String.valueOf(this.mutualListener.getTrackId()));
        linkedHashMap.put(SportAnalytics.ParamKey.PIC, SportAnalytics.ParamValue.PicType.SHORT);
        ShareLongDialog shareLongDialog3 = this.shareLongDialog;
        if (shareLongDialog3 != null) {
            shareLongDialog3.setShareListener(new ShareListener() { // from class: com.huami.moving.ui.sport.detail.SportSharePreDialog$showCaptureScreen$2$2
                @Override // com.huami.widget.share.ShareListener
                public void onFailed(int shareType, @Nullable String message) {
                }

                @Override // com.huami.widget.share.ShareListener
                @NotNull
                public ShareContent onShareContentCreated(int shareType) {
                    throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                }

                @Override // com.huami.widget.share.ShareListener
                public void onStart(int shareType) {
                }

                @Override // com.huami.widget.share.ShareListener
                public void onSuccess(int shareType) {
                    switch (shareType) {
                        case 1:
                            linkedHashMap.put("fr", "Wechat");
                            break;
                        case 2:
                            linkedHashMap.put("fr", "Moments");
                            break;
                        case 4:
                            linkedHashMap.put("fr", "Weibo");
                            break;
                        case 5:
                            linkedHashMap.put("fr", "QQZone");
                            break;
                        case 6:
                            linkedHashMap.put("fr", "QQ");
                            break;
                        case 8:
                            linkedHashMap.put("fr", "Facebook");
                            break;
                        case 9:
                            linkedHashMap.put("fr", "Twitter");
                            break;
                        case 13:
                            linkedHashMap.put("fr", "Save");
                            break;
                        case 14:
                            linkedHashMap.put("fr", "MiFit");
                            break;
                        case 15:
                            linkedHashMap.put("fr", "Instagram");
                            break;
                    }
                    Analytics.recordEvent(new CountEventBuilder(SportAnalytics.SPORT_DETAIL_SHARE_PIC_C).putExtras(linkedHashMap).setAnonymous(!Utils.isChinaUser()));
                }
            });
        }
        ShareLongDialog shareLongDialog4 = this.shareLongDialog;
        if (shareLongDialog4 != null) {
            shareLongDialog4.setShareAnalyticsListener(new ShareAnalyticsListener() { // from class: com.huami.moving.ui.sport.detail.SportSharePreDialog$showCaptureScreen$2$3
                @Override // com.huami.widget.share.ShareAnalyticsListener
                public void onShareClose() {
                    SportSharePreDialog.AnalyticsEventListener analyticsEventListener = this.a.analyticsListener;
                    if (analyticsEventListener == null) {
                        return;
                    }
                    analyticsEventListener.onAnalyticsClick(SportAnalytics.EVENT_SHARE_CLOSE_CLICK);
                }

                @Override // com.huami.widget.share.ShareAnalyticsListener
                public void onShareLongPic() {
                    SportSharePreDialog.AnalyticsEventListener analyticsEventListener = this.a.analyticsListener;
                    if (analyticsEventListener != null) {
                        analyticsEventListener.onAnalyticsClick(SportAnalytics.EVENT_SHARE_LONG_PIC_TAB_CLICK);
                    }
                    linkedHashMap.put(SportAnalytics.ParamKey.PIC, SportAnalytics.ParamValue.PicType.LONG);
                }

                @Override // com.huami.widget.share.ShareAnalyticsListener
                public void onShareShortPic() {
                    SportSharePreDialog.AnalyticsEventListener analyticsEventListener = this.a.analyticsListener;
                    if (analyticsEventListener != null) {
                        analyticsEventListener.onAnalyticsClick(SportAnalytics.EVENT_SHARE_SHORT_PIC_TAB_CLICK);
                    }
                    linkedHashMap.put(SportAnalytics.ParamKey.PIC, SportAnalytics.ParamValue.PicType.SHORT);
                }
            });
        }
        ShareLongDialog shareLongDialog5 = this.shareLongDialog;
        if ((shareLongDialog5 == null || shareLongDialog5.isShowing()) ? false : true) {
            showAllowingStateLoss(activity.getSupportFragmentManager(), "sl", this.shareLongDialog);
        }
    }
}
