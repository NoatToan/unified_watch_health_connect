package com.xiaomi.fitness.share.report.adapter;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.detail.data.BasicItemInfo;
import com.xiaomi.fitness.detail.util.SportDetailUtil;
import com.xiaomi.fitness.detail.view.SportShareBasicInfoView;
import com.xiaomi.fitness.detail.view.SportShareDataBottomView;
import com.xiaomi.fitness.detail.view.SportShareSloganView;
import com.xiaomi.fitness.detail.view.StickerView;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.share.report.SportReportShareExtKt;
import com.xiaomi.fitness.share.report.adapter.CustomizeSwitchAdapter;
import defpackage.bsi;
import defpackage.hoi;
import defpackage.ivi;
import defpackage.j1j;
import defpackage.lp5;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003./0B\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b,\u0010-J\u0017\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u00061"}, d2 = {"Lcom/xiaomi/fitness/share/report/adapter/CustomizeSwitchAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "position", "getItemViewType", "(I)I", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "accountCoreInfo", "", "isCommonSport", "", "setUserInfo", "(Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;Z)V", "", "name", "setSportName", "(Ljava/lang/String;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "getItemCount", "()I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "sportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "getSportReport", "()Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "", "Landroid/net/Uri;", "bgUris", "Ljava/util/List;", "accountInfo", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "sportName", "Ljava/lang/String;", "<init>", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;Landroidx/lifecycle/LifecycleOwner;)V", "Companion", "RectangleViewHolder", "SquareViewHolder", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CustomizeSwitchAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @NotNull
    public static final String TAG = "CustomizeSwitchAdapter";
    public static final int TYPE_RECTANGLE = 0;
    public static final int TYPE_SQUARE = 1;

    @Nullable
    private AccountCoreInfo accountInfo;

    @NotNull
    private final List<Uri> bgUris;

    @NotNull
    private final LifecycleOwner lifecycleOwner;

    @NotNull
    private String sportName;

    @NotNull
    private final SportBasicReport sportReport;

    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b6\u00107J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n \u001b*\u0004\u0018\u00010\u00180\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001c\u0010\u001e\u001a\n \u001b*\u0004\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\n \u001b*\u0004\u0018\u00010\u00180\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR\u001c\u0010\"\u001a\n \u001b*\u0004\u0018\u00010!0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010$\u001a\n \u001b*\u0004\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001fR\u001c\u0010%\u001a\n \u001b*\u0004\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001fR\u001c\u0010&\u001a\n \u001b*\u0004\u0018\u00010\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0015R\u001c\u0010'\u001a\n \u001b*\u0004\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001fR\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0017\u00102\u001a\u0002018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00068"}, d2 = {"Lcom/xiaomi/fitness/share/report/adapter/CustomizeSwitchAdapter$RectangleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "sportName", "", "initSloganView", "(Ljava/lang/String;)V", "initStickerView", "()V", "", "position", "updateShowView", "(I)V", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "sportReport", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "accountInfo", "bindData", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;ILcom/xiaomi/fitness/account/manager/AccountCoreInfo;Ljava/lang/String;)V", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Landroid/widget/ImageView;", "bgIv", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "qrCodeIv", "Landroid/widget/TextView;", "appNameTv", "Landroid/widget/TextView;", "qrCodeBg", "Landroidx/appcompat/widget/AppCompatImageView;", "maskIv", "Landroidx/appcompat/widget/AppCompatImageView;", "bottomAppNameTv", "algoDataSourceCenter", "algoDataSourceLeft", "algoDataSourceLeftTxt", "Lcom/xiaomi/fitness/detail/view/SportShareBasicInfoView;", "basicInfoView", "Lcom/xiaomi/fitness/detail/view/SportShareBasicInfoView;", "Lcom/xiaomi/fitness/detail/view/SportShareSloganView;", "shareSloganView", "Lcom/xiaomi/fitness/detail/view/SportShareSloganView;", "Landroid/widget/FrameLayout;", "stickerParentView", "Landroid/widget/FrameLayout;", "Landroidx/cardview/widget/CardView;", "cardView", "Landroidx/cardview/widget/CardView;", "getCardView", "()Landroidx/cardview/widget/CardView;", "<init>", "(Lcom/xiaomi/fitness/share/report/adapter/CustomizeSwitchAdapter;Landroid/view/View;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class RectangleViewHolder extends RecyclerView.d0 {
        private final TextView algoDataSourceCenter;
        private final View algoDataSourceLeft;
        private final TextView algoDataSourceLeftTxt;
        private final TextView appNameTv;

        @Nullable
        private SportShareBasicInfoView basicInfoView;

        @NotNull
        private final ImageView bgIv;
        private final TextView bottomAppNameTv;

        @NotNull
        private final CardView cardView;
        private final AppCompatImageView maskIv;
        private final ImageView qrCodeBg;
        private final ImageView qrCodeIv;

        @NotNull
        private SportShareSloganView shareSloganView;

        @NotNull
        private final FrameLayout stickerParentView;
        final /* synthetic */ CustomizeSwitchAdapter this$0;

        @NotNull
        private final View view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RectangleViewHolder(@NotNull CustomizeSwitchAdapter customizeSwitchAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = customizeSwitchAdapter;
            this.view = view;
            View viewFindViewById = view.findViewById(bsi.w);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.bgIv = (ImageView) viewFindViewById;
            this.qrCodeIv = (ImageView) view.findViewById(bsi.d5);
            this.appNameTv = (TextView) view.findViewById(bsi.l);
            this.qrCodeBg = (ImageView) view.findViewById(bsi.e5);
            this.maskIv = (AppCompatImageView) view.findViewById(bsi.e4);
            this.bottomAppNameTv = (TextView) view.findViewById(bsi.m);
            this.algoDataSourceCenter = (TextView) view.findViewById(bsi.O6);
            this.algoDataSourceLeft = view.findViewById(bsi.P6);
            this.algoDataSourceLeftTxt = (TextView) view.findViewById(bsi.Q6);
            this.basicInfoView = (SportShareBasicInfoView) view.findViewById(bsi.f4567r);
            View viewFindViewById2 = view.findViewById(bsi.r6);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.shareSloganView = (SportShareSloganView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(bsi.g7);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.stickerParentView = (FrameLayout) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(bsi.C);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.cardView = (CardView) viewFindViewById4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bindData$lambda$0(RectangleViewHolder this$0, Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            ImageView qrCodeBg = this$0.qrCodeBg;
            Intrinsics.checkNotNullExpressionValue(qrCodeBg, "qrCodeBg");
            ViewExtKt.visible(qrCodeBg);
            ImageView qrCodeIv = this$0.qrCodeIv;
            Intrinsics.checkNotNullExpressionValue(qrCodeIv, "qrCodeIv");
            ViewExtKt.visible(qrCodeIv);
            this$0.qrCodeIv.setImageBitmap(bitmap);
            return Unit.INSTANCE;
        }

        private final void initSloganView(String sportName) {
            String string;
            List<BasicItemInfo> listInitBasicList = SportDetailUtil.INSTANCE.initBasicList(this.this$0.getSportReport(), this.this$0.getSportReport().getSportType(), true);
            String dateYYYYMMDDLocalFormat = TimeDateUtil.getDateYYYYMMDDLocalFormat(this.this$0.getSportReport().getStartTime());
            BasicItemInfo basicItemInfo = listInitBasicList.get(0);
            String pluralTitle = basicItemInfo.getPluralTitle();
            if (pluralTitle == null || pluralTitle.length() == 0) {
                string = AppUtil.getApp().getString(basicItemInfo.getTitle());
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            } else {
                string = basicItemInfo.getPluralTitle();
            }
            String string2 = AppUtil.getApp().getString(j1j.M0, sportName, string, basicItemInfo.getData(), basicItemInfo.getUnit());
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            this.shareSloganView.initSloganView(SportReportShareExtKt.getSloganList().get(0), dateYYYYMMDDLocalFormat, string2);
        }

        private final void initStickerView() {
            this.stickerParentView.removeAllViews();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, ExtUtilsKt.getDp(120));
            layoutParams.gravity = 8388691;
            SportBasicReport sportReport = this.this$0.getSportReport();
            layoutParams.bottomMargin = ExtUtilsKt.getDp((sportReport == null || !sportReport.gpsDataSourceValid()) ? 0 : 20);
            StickerView stickerView = SportReportShareExtKt.getStickerListToShow(AppUtil.getApp(), this.this$0.getSportReport()).get(0);
            stickerView.setLayoutParams(layoutParams);
            stickerView.setStickTextValue(this.this$0.getSportReport());
            this.stickerParentView.addView(stickerView);
            stickerView.invalidate();
        }

        private final void updateShowView(int position) {
            ShareAdapterUtil shareAdapterUtil = ShareAdapterUtil.INSTANCE;
            SportBasicReport sportReport = this.this$0.getSportReport();
            TextView algoDataSourceCenter = this.algoDataSourceCenter;
            Intrinsics.checkNotNullExpressionValue(algoDataSourceCenter, "algoDataSourceCenter");
            TextView algoDataSourceLeftTxt = this.algoDataSourceLeftTxt;
            Intrinsics.checkNotNullExpressionValue(algoDataSourceLeftTxt, "algoDataSourceLeftTxt");
            View algoDataSourceLeft = this.algoDataSourceLeft;
            Intrinsics.checkNotNullExpressionValue(algoDataSourceLeft, "algoDataSourceLeft");
            ShareAdapterUtil.showAlgoDataSource$default(shareAdapterUtil, sportReport, algoDataSourceCenter, algoDataSourceLeftTxt, algoDataSourceLeft, position == 0, false, 32, null);
            if (position == 0) {
                SportShareBasicInfoView sportShareBasicInfoView = this.basicInfoView;
                if (sportShareBasicInfoView != null) {
                    sportShareBasicInfoView.setVisibility(8);
                }
                this.stickerParentView.setVisibility(8);
                this.shareSloganView.setVisibility(0);
                ImageView qrCodeBg = this.qrCodeBg;
                Intrinsics.checkNotNullExpressionValue(qrCodeBg, "qrCodeBg");
                ViewExtKt.invisible(qrCodeBg);
                ImageView qrCodeIv = this.qrCodeIv;
                Intrinsics.checkNotNullExpressionValue(qrCodeIv, "qrCodeIv");
                ViewExtKt.invisible(qrCodeIv);
                TextView textView = this.bottomAppNameTv;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                TextView textView2 = this.appNameTv;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    return;
                }
                return;
            }
            if (position == 1) {
                SportShareBasicInfoView sportShareBasicInfoView2 = this.basicInfoView;
                if (sportShareBasicInfoView2 != null) {
                    sportShareBasicInfoView2.setVisibility(8);
                }
                this.stickerParentView.setVisibility(0);
                this.shareSloganView.setVisibility(8);
                TextView textView3 = this.bottomAppNameTv;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                TextView textView4 = this.appNameTv;
                if (textView4 != null) {
                    textView4.setVisibility(0);
                }
                ImageView qrCodeBg2 = this.qrCodeBg;
                Intrinsics.checkNotNullExpressionValue(qrCodeBg2, "qrCodeBg");
                ViewExtKt.visible(qrCodeBg2);
                ImageView qrCodeIv2 = this.qrCodeIv;
                Intrinsics.checkNotNullExpressionValue(qrCodeIv2, "qrCodeIv");
                ViewExtKt.visible(qrCodeIv2);
                return;
            }
            if (position != 2) {
                return;
            }
            SportShareBasicInfoView sportShareBasicInfoView3 = this.basicInfoView;
            if (sportShareBasicInfoView3 != null) {
                sportShareBasicInfoView3.setVisibility(0);
            }
            this.stickerParentView.setVisibility(8);
            this.shareSloganView.setVisibility(8);
            TextView textView5 = this.bottomAppNameTv;
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
            TextView textView6 = this.appNameTv;
            if (textView6 != null) {
                textView6.setVisibility(0);
            }
            ImageView qrCodeBg3 = this.qrCodeBg;
            Intrinsics.checkNotNullExpressionValue(qrCodeBg3, "qrCodeBg");
            ViewExtKt.visible(qrCodeBg3);
            ImageView qrCodeIv3 = this.qrCodeIv;
            Intrinsics.checkNotNullExpressionValue(qrCodeIv3, "qrCodeIv");
            ViewExtKt.visible(qrCodeIv3);
        }

        public final void bindData(@NotNull SportBasicReport sportReport, int position, @Nullable AccountCoreInfo accountInfo, @NotNull String sportName) {
            Intrinsics.checkNotNullParameter(sportReport, "sportReport");
            Intrinsics.checkNotNullParameter(sportName, "sportName");
            SportReportShareExtKt.loadImgWithHardwareRenderingDisabled$default(this.bgIv, (Uri) this.this$0.bgUris.get(position), 0.0f, false, 12, null);
            Drawable resourceDrawable = ResourceExtKt.getResourceDrawable(ApplicationExtKt.getApplication(), hoi.x);
            if (resourceDrawable != null) {
                resourceDrawable.setBounds(0, 0, 40, 40);
            }
            this.appNameTv.setCompoundDrawables(resourceDrawable, null, null, null);
            this.bottomAppNameTv.setCompoundDrawables(resourceDrawable, null, null, null);
            SportReportShareExtKt.getCommonQrCodeBitmapLiveData().observe(this.this$0.lifecycleOwner, new CustomizeSwitchAdapter$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: cf5
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return CustomizeSwitchAdapter.RectangleViewHolder.bindData$lambda$0(this.f5272a, (Bitmap) obj);
                }
            }));
            this.maskIv.setImageResource(hoi.T);
            List<BasicItemInfo> listInitBasicList = SportDetailUtil.INSTANCE.initBasicList(sportReport, sportReport.getSportType(), true);
            if (listInitBasicList.size() > 3) {
                listInitBasicList = listInitBasicList.subList(0, 3);
            }
            lp5.a(sportReport);
            SportShareBasicInfoView sportShareBasicInfoView = this.basicInfoView;
            if (sportShareBasicInfoView != null) {
                sportShareBasicInfoView.bindData(sportReport, listInitBasicList, sportName, true);
            }
            SportShareBasicInfoView sportShareBasicInfoView2 = this.basicInfoView;
            if (sportShareBasicInfoView2 != null) {
                sportShareBasicInfoView2.updateHeaderInfo(accountInfo, true);
            }
            initSloganView(sportName);
            initStickerView();
            updateShowView(position);
        }

        @NotNull
        public final CardView getCardView() {
            return this.cardView;
        }

        @NotNull
        public final View getView() {
            return this.view;
        }
    }

    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b9\u0010:J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n \u001b*\u0004\u0018\u00010\u00180\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001c\u0010\u001e\u001a\n \u001b*\u0004\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\n \u001b*\u0004\u0018\u00010\u00180\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR\u001c\u0010!\u001a\n \u001b*\u0004\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u001c\u0010\"\u001a\n \u001b*\u0004\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u001c\u0010#\u001a\n \u001b*\u0004\u0018\u00010\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0015R\u001c\u0010$\u001a\n \u001b*\u0004\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001fR\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010+\u001a\n \u001b*\u0004\u0018\u00010*0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006;"}, d2 = {"Lcom/xiaomi/fitness/share/report/adapter/CustomizeSwitchAdapter$SquareViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "sportName", "", "initSloganView", "(Ljava/lang/String;)V", "initStickerView", "()V", "", "position", "updateShowView", "(I)V", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "sportReport", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "accountInfo", "bindData", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;ILcom/xiaomi/fitness/account/manager/AccountCoreInfo;Ljava/lang/String;)V", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Landroid/widget/ImageView;", "bgIv", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "qrCodeIv", "Landroid/widget/TextView;", "appNameTv", "Landroid/widget/TextView;", "qrCodeBg", "bottomAppNameTv", "algoDataSourceCenter", "algoDataSourceLeft", "algoDataSourceLeftTxt", "Landroidx/cardview/widget/CardView;", "cardView", "Landroidx/cardview/widget/CardView;", "getCardView", "()Landroidx/cardview/widget/CardView;", "Landroidx/appcompat/widget/AppCompatImageView;", "maskIv", "Landroidx/appcompat/widget/AppCompatImageView;", "Lcom/xiaomi/fitness/detail/view/SportShareBasicInfoView;", "basicInfoView", "Lcom/xiaomi/fitness/detail/view/SportShareBasicInfoView;", "Lcom/xiaomi/fitness/detail/view/SportShareSloganView;", "shareSloganView", "Lcom/xiaomi/fitness/detail/view/SportShareSloganView;", "Landroid/widget/FrameLayout;", "stickerParentView", "Landroid/widget/FrameLayout;", "Lcom/xiaomi/fitness/detail/view/SportShareDataBottomView;", "bottomTabView", "Lcom/xiaomi/fitness/detail/view/SportShareDataBottomView;", "<init>", "(Lcom/xiaomi/fitness/share/report/adapter/CustomizeSwitchAdapter;Landroid/view/View;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nCustomizeSwitchAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomizeSwitchAdapter.kt\ncom/xiaomi/fitness/share/report/adapter/CustomizeSwitchAdapter$SquareViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,373:1\n54#2,3:374\n24#2:377\n59#2,6:378\n*S KotlinDebug\n*F\n+ 1 CustomizeSwitchAdapter.kt\ncom/xiaomi/fitness/share/report/adapter/CustomizeSwitchAdapter$SquareViewHolder\n*L\n205#1:374,3\n205#1:377\n205#1:378,6\n*E\n"})
    public final class SquareViewHolder extends RecyclerView.d0 {
        private final TextView algoDataSourceCenter;
        private final View algoDataSourceLeft;
        private final TextView algoDataSourceLeftTxt;
        private final TextView appNameTv;

        @Nullable
        private SportShareBasicInfoView basicInfoView;

        @NotNull
        private final ImageView bgIv;
        private final TextView bottomAppNameTv;

        @NotNull
        private final SportShareDataBottomView bottomTabView;

        @NotNull
        private final CardView cardView;
        private final AppCompatImageView maskIv;
        private final ImageView qrCodeBg;
        private final ImageView qrCodeIv;

        @NotNull
        private SportShareSloganView shareSloganView;

        @NotNull
        private final FrameLayout stickerParentView;
        final /* synthetic */ CustomizeSwitchAdapter this$0;

        @NotNull
        private final View view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SquareViewHolder(@NotNull CustomizeSwitchAdapter customizeSwitchAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = customizeSwitchAdapter;
            this.view = view;
            View viewFindViewById = view.findViewById(bsi.w);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.bgIv = (ImageView) viewFindViewById;
            this.qrCodeIv = (ImageView) view.findViewById(bsi.d5);
            this.appNameTv = (TextView) view.findViewById(bsi.l);
            this.qrCodeBg = (ImageView) view.findViewById(bsi.e5);
            this.bottomAppNameTv = (TextView) view.findViewById(bsi.m);
            this.algoDataSourceCenter = (TextView) view.findViewById(bsi.O6);
            this.algoDataSourceLeft = view.findViewById(bsi.P6);
            this.algoDataSourceLeftTxt = (TextView) view.findViewById(bsi.R6);
            View viewFindViewById2 = view.findViewById(bsi.C);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.cardView = (CardView) viewFindViewById2;
            this.maskIv = (AppCompatImageView) view.findViewById(bsi.e4);
            this.basicInfoView = (SportShareBasicInfoView) view.findViewById(bsi.f4567r);
            View viewFindViewById3 = view.findViewById(bsi.r6);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.shareSloganView = (SportShareSloganView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(bsi.g7);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.stickerParentView = (FrameLayout) viewFindViewById4;
            View viewFindViewById5 = view.findViewById(bsi.z);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.bottomTabView = (SportShareDataBottomView) viewFindViewById5;
        }

        private final void initSloganView(String sportName) {
            String string;
            List<BasicItemInfo> listInitBasicList = SportDetailUtil.INSTANCE.initBasicList(this.this$0.getSportReport(), this.this$0.getSportReport().getSportType(), true);
            String dateYYYYMMDDLocalFormat = TimeDateUtil.getDateYYYYMMDDLocalFormat(this.this$0.getSportReport().getStartTime());
            BasicItemInfo basicItemInfo = listInitBasicList.get(0);
            String pluralTitle = basicItemInfo.getPluralTitle();
            if (pluralTitle == null || pluralTitle.length() == 0) {
                string = AppUtil.getApp().getString(basicItemInfo.getTitle());
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            } else {
                string = basicItemInfo.getPluralTitle();
            }
            lp5.a(this.this$0.getSportReport());
            String string2 = AppUtil.getApp().getString(j1j.M0, sportName, string, basicItemInfo.getData(), basicItemInfo.getUnit());
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            this.shareSloganView.initSloganView(SportReportShareExtKt.getSloganList().get(0), dateYYYYMMDDLocalFormat, string2);
        }

        private final void initStickerView() {
            this.stickerParentView.removeAllViews();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, ExtUtilsKt.getDp(120));
            layoutParams.gravity = 8388691;
            SportBasicReport sportReport = this.this$0.getSportReport();
            layoutParams.bottomMargin = ExtUtilsKt.getDp((sportReport == null || !sportReport.gpsDataSourceValid()) ? 0 : 20);
            StickerView stickerView = SportReportShareExtKt.getStickerListToShow(AppUtil.getApp(), this.this$0.getSportReport()).get(0);
            stickerView.setLayoutParams(layoutParams);
            stickerView.setStickTextValue(this.this$0.getSportReport());
            this.stickerParentView.addView(stickerView);
            stickerView.invalidate();
        }

        private final void updateShowView(int position) {
            ShareAdapterUtil shareAdapterUtil = ShareAdapterUtil.INSTANCE;
            SportBasicReport sportReport = this.this$0.getSportReport();
            TextView algoDataSourceCenter = this.algoDataSourceCenter;
            Intrinsics.checkNotNullExpressionValue(algoDataSourceCenter, "algoDataSourceCenter");
            TextView algoDataSourceLeftTxt = this.algoDataSourceLeftTxt;
            Intrinsics.checkNotNullExpressionValue(algoDataSourceLeftTxt, "algoDataSourceLeftTxt");
            View algoDataSourceLeft = this.algoDataSourceLeft;
            Intrinsics.checkNotNullExpressionValue(algoDataSourceLeft, "algoDataSourceLeft");
            shareAdapterUtil.showAlgoDataSource(sportReport, algoDataSourceCenter, algoDataSourceLeftTxt, algoDataSourceLeft, position == 5, position == 3);
            if (position == 3) {
                SportShareBasicInfoView sportShareBasicInfoView = this.basicInfoView;
                if (sportShareBasicInfoView != null) {
                    sportShareBasicInfoView.setVisibility(8);
                }
                this.bottomTabView.setVisibility(0);
                this.stickerParentView.setVisibility(8);
                this.shareSloganView.setVisibility(8);
                TextView textView = this.bottomAppNameTv;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                TextView textView2 = this.appNameTv;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                this.algoDataSourceLeftTxt.setVisibility(8);
                return;
            }
            if (position == 4) {
                SportShareBasicInfoView sportShareBasicInfoView2 = this.basicInfoView;
                if (sportShareBasicInfoView2 != null) {
                    sportShareBasicInfoView2.setVisibility(8);
                }
                this.stickerParentView.setVisibility(0);
                this.shareSloganView.setVisibility(8);
                TextView textView3 = this.bottomAppNameTv;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                TextView textView4 = this.appNameTv;
                if (textView4 != null) {
                    textView4.setVisibility(0);
                    return;
                }
                return;
            }
            if (position != 5) {
                return;
            }
            SportShareBasicInfoView sportShareBasicInfoView3 = this.basicInfoView;
            if (sportShareBasicInfoView3 != null) {
                sportShareBasicInfoView3.setVisibility(8);
            }
            this.stickerParentView.setVisibility(8);
            this.shareSloganView.setVisibility(0);
            TextView textView5 = this.bottomAppNameTv;
            if (textView5 != null) {
                textView5.setVisibility(0);
            }
            TextView textView6 = this.appNameTv;
            if (textView6 != null) {
                textView6.setVisibility(8);
            }
        }

        public final void bindData(@NotNull SportBasicReport sportReport, int position, @Nullable AccountCoreInfo accountInfo, @NotNull String sportName) {
            Intrinsics.checkNotNullParameter(sportReport, "sportReport");
            Intrinsics.checkNotNullParameter(sportName, "sportName");
            ImageView imageView = this.bgIv;
            Object obj = this.this$0.bgUris.get(position);
            ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(obj).target(imageView);
            builderTarget.bitmapConfig(Bitmap.Config.ARGB_8888);
            boolean z = false;
            builderTarget.allowHardware(false);
            imageLoader.enqueue(builderTarget.build());
            Drawable resourceDrawable = ResourceExtKt.getResourceDrawable(ApplicationExtKt.getApplication(), hoi.x);
            if (resourceDrawable != null) {
                resourceDrawable.setBounds(0, 0, 40, 40);
            }
            this.appNameTv.setCompoundDrawables(resourceDrawable, null, null, null);
            this.bottomAppNameTv.setCompoundDrawables(resourceDrawable, null, null, null);
            this.maskIv.setImageResource(hoi.f1);
            List<BasicItemInfo> listInitBasicList = SportDetailUtil.INSTANCE.initBasicList(sportReport, sportReport.getSportType(), true);
            if (listInitBasicList.size() > 3) {
                listInitBasicList = listInitBasicList.subList(0, 2);
            }
            lp5.a(sportReport);
            String dateYYYYMMddLocalFormat = TimeDateUtil.getDateYYYYMMddLocalFormat(sportReport.getStartTime() * ((long) 1000));
            SportShareBasicInfoView sportShareBasicInfoView = this.basicInfoView;
            if (sportShareBasicInfoView != null) {
                sportShareBasicInfoView.bindData(sportReport, listInitBasicList, sportName, true);
            }
            SportShareBasicInfoView sportShareBasicInfoView2 = this.basicInfoView;
            if (sportShareBasicInfoView2 != null) {
                sportShareBasicInfoView2.updateHeaderInfo(accountInfo, true);
            }
            SportShareBasicInfoView sportShareBasicInfoView3 = this.basicInfoView;
            if (sportShareBasicInfoView3 != null) {
                sportShareBasicInfoView3.hideHeaderInfo();
            }
            int iInitChartDataList = this.bottomTabView.initChartDataList();
            SportShareDataBottomView sportShareDataBottomView = this.bottomTabView;
            Integer algorithmDataSource = sportReport.getAlgorithmDataSource();
            if (algorithmDataSource != null && algorithmDataSource.intValue() == 1) {
                z = true;
            }
            sportShareDataBottomView.bingData(listInitBasicList, iInitChartDataList, z);
            this.bottomTabView.updateHeaderInfo(accountInfo, true);
            if (sportName.length() < 7) {
                this.bottomTabView.updateSportNameStr(dateYYYYMMddLocalFormat + " " + sportName);
            } else {
                this.bottomTabView.updateSportNameStr(dateYYYYMMddLocalFormat + "\n" + sportName);
            }
            initSloganView(sportName);
            initStickerView();
            updateShowView(position);
        }

        @NotNull
        public final CardView getCardView() {
            return this.cardView;
        }

        @NotNull
        public final View getView() {
            return this.view;
        }
    }

    public CustomizeSwitchAdapter(@NotNull SportBasicReport sportReport, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(sportReport, "sportReport");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.sportReport = sportReport;
        this.lifecycleOwner = lifecycleOwner;
        this.bgUris = SportReportShareExtKt.getCustomizeSharePreviewUris();
        this.sportName = "";
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return 6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return position < 3 ? 0 : 1;
    }

    @NotNull
    public final SportBasicReport getSportReport() {
        return this.sportReport;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.setIsRecyclable(false);
        if (holder instanceof RectangleViewHolder) {
            RectangleViewHolder rectangleViewHolder = (RectangleViewHolder) holder;
            rectangleViewHolder.bindData(this.sportReport, position, this.accountInfo, this.sportName);
            rectangleViewHolder.getCardView().setTag(Integer.valueOf(position));
        } else if (holder instanceof SquareViewHolder) {
            SquareViewHolder squareViewHolder = (SquareViewHolder) holder;
            squareViewHolder.bindData(this.sportReport, position, this.accountInfo, this.sportName);
            squareViewHolder.getCardView().setTag(Integer.valueOf(position));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(ivi.f, parent, false);
            Intrinsics.checkNotNull(viewInflate);
            return new RectangleViewHolder(this, viewInflate);
        }
        View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(ivi.i, parent, false);
        Intrinsics.checkNotNull(viewInflate2);
        return new SquareViewHolder(this, viewInflate2);
    }

    public final void setSportName(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.sportName = name;
    }

    public final void setUserInfo(@Nullable AccountCoreInfo accountCoreInfo, boolean isCommonSport) {
        this.accountInfo = accountCoreInfo;
    }
}
