package com.huami.feedback.screencapture;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.devicerecorder.UriGetter;
import com.huami.feedback.R;
import com.huami.feedback.api.FeedbackParams;
import com.huami.feedback.api.FeedbackService;
import com.huami.feedback.screencapture.ScreenCapture;
import com.huami.koinstartup.KoinAdapterKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.imageload.DisplayConfig;
import com.xiaomi.hm.health.imageload.HMImageLoader;
import com.xiaomi.hm.health.imageload.ext.ImageLoadExtentionsKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0002¨\u0006\u0010"}, d2 = {"Lcom/huami/feedback/screencapture/ScreenCapture;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/net/Uri;", "imageUrl", "Landroid/view/View;", "a", "Landroid/widget/ImageView;", ViewHierarchyConstants.VIEW_KEY, "uri", "", "b", "<init>", "()V", "Companion", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final class ScreenCapture {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final double a = 0.7d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/huami/feedback/screencapture/ScreenCapture$Companion;", "", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Landroid/net/Uri;", "imgUri", "Lcom/huami/android/design/dialog/AlertDialogFragment;", "showCaptureDialog", "", "IMG_SIZE_PERCENT", LogUtil.D, "<init>", "()V", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(Context context, Uri uri, DialogInterface dialogInterface, int i) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.STREAM", uri);
            intent.setType(UriGetter.ShareContentType.IMAGE);
            context.startActivity(Intent.createChooser(intent, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(CoroutineScope coroutineScope, Context context, FragmentManager fragmentManager, Uri uri, DialogInterface dialogInterface, int i) {
            ((FeedbackService) KoinAdapterKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(FeedbackService.class), null, null)).feedback(coroutineScope, context, fragmentManager, new FeedbackParams(null, null, null, CollectionsKt__CollectionsKt.mutableListOf(uri), false, 23, null));
        }

        @NotNull
        public final AlertDialogFragment showCaptureDialog(@NotNull final CoroutineScope coroutineScope, @NotNull final Context context, @NotNull final FragmentManager fragmentManager, @NotNull final Uri imgUri) {
            AlertDialogFragment alertDialogFragmentShow = new ScreenCaptureDialog.Builder(context).setContentView(new ScreenCapture(null).a(context, imgUri)).setNegativeButton(R.string.dialog_screen_capture_share, new DialogInterface.OnClickListener() { // from class: xj6
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ScreenCapture.Companion.c(context, imgUri, dialogInterface, i);
                }
            }).setPositiveButton(R.string.feedback_title_new, new DialogInterface.OnClickListener() { // from class: yj6
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ScreenCapture.Companion.d(coroutineScope, context, fragmentManager, imgUri, dialogInterface, i);
                }
            }).show(fragmentManager);
            alertDialogFragmentShow.setGravity(17);
            return alertDialogFragmentShow;
        }
    }

    private ScreenCapture() {
    }

    public /* synthetic */ ScreenCapture(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View a(Context context, Uri imageUrl) {
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        b(imageView, imageUrl);
        return imageView;
    }

    private final void b(ImageView view, Uri uri) {
        Point screeSize = CaptureUitlsKt.getScreeSize(view.getContext());
        try {
            HMImageLoader.with(view).diskCacheStrategy(DisplayConfig.ConfigBuilder.DiskCacheStrategy.ALL).load(uri).override((int) (((double) screeSize.x) * 0.7d), (int) (((double) screeSize.y) * 0.7d)).crossFade().fitCenter().into(view);
        } catch (Exception e) {
            HMLog.e(ImageLoadExtentionsKt.TAG, e);
        }
    }
}
