package com.xiaomi.fitness.share.report.fragment;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import coil.Coil;
import coil.request.ImageRequest;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.share.report.SportReportShareExtKt;
import com.xiaomi.fitness.share.report.fragment.DefaultShareWholeReportFragment;
import com.xiaomi.fitness.share.report.viewmodel.SportReportShareViewModel;
import defpackage.ivi;
import defpackage.yop;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u0006R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/share/report/fragment/DefaultShareWholeReportFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/share/report/viewmodel/SportReportShareViewModel;", "Lyop;", "", "initSlideUpWidget", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "", "viewHeight", "I", "Landroid/graphics/Bitmap;", "shareBitmap", "Landroid/graphics/Bitmap;", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nDefaultShareWholeReportFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultShareWholeReportFragment.kt\ncom/xiaomi/fitness/share/report/fragment/DefaultShareWholeReportFragment\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,93:1\n54#2,3:94\n24#2:97\n57#2,6:98\n63#2,2:105\n57#3:104\n*S KotlinDebug\n*F\n+ 1 DefaultShareWholeReportFragment.kt\ncom/xiaomi/fitness/share/report/fragment/DefaultShareWholeReportFragment\n*L\n66#1:94,3\n66#1:97\n66#1:98,6\n66#1:105,2\n66#1:104\n*E\n"})
public final class DefaultShareWholeReportFragment extends BaseBindingFragment<SportReportShareViewModel, yop> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "DefaultShareWholeReportFragment";

    @Nullable
    private Bitmap shareBitmap;
    private int viewHeight;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/share/report/fragment/DefaultShareWholeReportFragment$Companion;", "", "<init>", "()V", "TAG", "", "newInstance", "Lcom/xiaomi/fitness/share/report/fragment/DefaultShareWholeReportFragment;", "sportBasicReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "bitmapUriStr", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DefaultShareWholeReportFragment newInstance(@NotNull SportBasicReport sportBasicReport, @Nullable String bitmapUriStr) {
            Intrinsics.checkNotNullParameter(sportBasicReport, "sportBasicReport");
            DefaultShareWholeReportFragment defaultShareWholeReportFragment = new DefaultShareWholeReportFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("sport_report", sportBasicReport);
            bundle.putString(SportReportShareExtKt.KEY_BITMAP_URI_STR, bitmapUriStr);
            defaultShareWholeReportFragment.setArguments(bundle);
            return defaultShareWholeReportFragment;
        }
    }

    private final void initSlideUpWidget() {
        getMBinding().G.post(new Runnable() { // from class: yw5
            @Override // java.lang.Runnable
            public final void run() {
                DefaultShareWholeReportFragment.initSlideUpWidget$lambda$1(this.f40634a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSlideUpWidget$lambda$1(final DefaultShareWholeReportFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int height = this$0.getMBinding().G.getHeight();
        Logger.i("DefaultShareWholeReportFragment", "initSlideUpWidget scrollHeight=" + height + " viewHeight=" + this$0.viewHeight);
        ConstraintLayout slideUpWidget = this$0.getMBinding().I;
        Intrinsics.checkNotNullExpressionValue(slideUpWidget, "slideUpWidget");
        ViewExtKt.setVisible(slideUpWidget, height < this$0.viewHeight - ExtUtilsKt.getDp(25));
        ConstraintLayout slideUpWidget2 = this$0.getMBinding().I;
        Intrinsics.checkNotNullExpressionValue(slideUpWidget2, "slideUpWidget");
        if (ExtUtilsKt.isVisible(slideUpWidget2)) {
            this$0.getMBinding().G.setOnScrollChangeListener(new NestedScrollView.d() { // from class: ww5
                @Override // androidx.core.widget.NestedScrollView.d
                public final void a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                    DefaultShareWholeReportFragment.initSlideUpWidget$lambda$1$lambda$0(this.f38418a, nestedScrollView, i, i2, i3, i4);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSlideUpWidget$lambda$1$lambda$0(DefaultShareWholeReportFragment this$0, NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(nestedScrollView, "<unused var>");
        if (i2 >= 20) {
            ConstraintLayout slideUpWidget = this$0.getMBinding().I;
            Intrinsics.checkNotNullExpressionValue(slideUpWidget, "slideUpWidget");
            if (ExtUtilsKt.isVisible(slideUpWidget)) {
                ConstraintLayout slideUpWidget2 = this$0.getMBinding().I;
                Intrinsics.checkNotNullExpressionValue(slideUpWidget2, "slideUpWidget");
                ViewExtKt.gone(slideUpWidget2);
            }
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return ivi.M1;
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Bitmap bitmap = this.shareBitmap;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.shareBitmap = null;
        super.onDestroyView();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString(SportReportShareExtKt.KEY_BITMAP_URI_STR) : null;
        setActionBarDisplayable(false);
        try {
            Uri uri = Uri.parse(string);
            String path = uri.getPath();
            Logger.i("DefaultShareWholeReportFragment", "onViewCreated uri=" + uri + " uriPath=" + path);
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(path);
            this.shareBitmap = bitmapDecodeFile;
            if (bitmapDecodeFile == null) {
                return;
            }
            Intrinsics.checkNotNull(bitmapDecodeFile);
            int height = bitmapDecodeFile.getHeight();
            Bitmap bitmap = this.shareBitmap;
            Intrinsics.checkNotNull(bitmap);
            this.viewHeight = (int) ((height * (UIUtils.INSTANCE.getScreenWidth(ApplicationExtKt.getApplication()) - (ExtUtilsKt.getDp(60) * 2))) / bitmap.getWidth());
            Logger.i("DefaultShareWholeReportFragment", "onViewCreated bitmapRealHeight=" + height);
            ImageView imgShareLong = getMBinding().C;
            Intrinsics.checkNotNullExpressionValue(imgShareLong, "imgShareLong");
            Coil.imageLoader(imgShareLong.getContext()).enqueue(new ImageRequest.Builder(imgShareLong.getContext()).data(this.shareBitmap).target(imgShareLong).build());
            initSlideUpWidget();
        } catch (Exception e) {
            Logger.i("DefaultShareWholeReportFragment", "onViewCreated exception=" + e);
        }
    }
}
