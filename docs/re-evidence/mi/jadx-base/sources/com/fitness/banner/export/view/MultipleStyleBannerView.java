package com.fitness.banner.export.view;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.transform.RoundedCornersTransformation;
import com.fitness.banner.export.BannerExtKt;
import com.fitness.banner.export.BannerHelper;
import com.fitness.banner.export.IBanner;
import com.fitness.banner.export.v2.BannerItemDetail;
import com.fitness.banner.export.v2.BannerItemV2;
import com.fitness.banner.export.v2.BannerV2DataKt;
import com.fitness.banner.export.v2.SourceItem;
import com.fitness.banner.export.view.MultipleStyleBannerView;
import com.miui.circulate.device.api.Column;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.l02;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 22\u00020\u0001:\u00012B\u001d\b\u0007\u0012\u0006\u0010-\u001a\u00020,\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b0\u00101J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J7\u0010\r\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u000f\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ7\u0010\u0010\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ?\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010)\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u00063"}, d2 = {"Lcom/fitness/banner/export/view/MultipleStyleBannerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "updateTitle", "()V", "Lcom/fitness/banner/export/v2/SourceItem;", "sourceItem", "", Column.SUBTITLE, "Lcom/fitness/banner/export/v2/BannerItemV2;", "bannerItem", "Lcom/fitness/banner/export/v2/BannerItemDetail;", "bannerItemDetail", "updateBannerFirst", "(Lcom/fitness/banner/export/v2/SourceItem;Ljava/lang/String;Lcom/fitness/banner/export/v2/BannerItemV2;Lcom/fitness/banner/export/v2/BannerItemDetail;)V", "updateBannerSecond", "updateBannerThird", "", "index", "updateBgAndClick", "(ILcom/fitness/banner/export/v2/SourceItem;Ljava/lang/String;Lcom/fitness/banner/export/v2/BannerItemV2;Lcom/fitness/banner/export/v2/BannerItemDetail;)V", "item", "updateBanner", "(Lcom/fitness/banner/export/v2/BannerItemV2;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Ll02;", "binding", "Ll02;", "parentView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/widget/TextView;", "tvMainTitle", "Landroid/widget/TextView;", "tvMore", "Landroidx/appcompat/widget/AppCompatImageView;", "ivBannerFirst", "Landroidx/appcompat/widget/AppCompatImageView;", "ivBannerSecond", "ivBannerThird", "mBannerItem", "Lcom/fitness/banner/export/v2/BannerItemV2;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "banner-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMultipleStyleBannerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipleStyleBannerView.kt\ncom/fitness/banner/export/view/MultipleStyleBannerView\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,298:1\n54#2,3:299\n24#2:302\n59#2,6:303\n*S KotlinDebug\n*F\n+ 1 MultipleStyleBannerView.kt\ncom/fitness/banner/export/view/MultipleStyleBannerView\n*L\n228#1:299,3\n228#1:302\n228#1:303,6\n*E\n"})
public final class MultipleStyleBannerView extends ConstraintLayout {

    @NotNull
    public static final String TAG = "MultipleStyleBannerView";

    @NotNull
    private final l02 binding;

    @NotNull
    private final AppCompatImageView ivBannerFirst;

    @NotNull
    private final AppCompatImageView ivBannerSecond;

    @NotNull
    private final AppCompatImageView ivBannerThird;

    @Nullable
    private BannerItemV2 mBannerItem;

    @NotNull
    private final ConstraintLayout parentView;

    @NotNull
    private final TextView tvMainTitle;

    @NotNull
    private final TextView tvMore;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public MultipleStyleBannerView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void updateBannerFirst(SourceItem sourceItem, String subtitle, BannerItemV2 bannerItem, BannerItemDetail bannerItemDetail) {
        updateBgAndClick(0, sourceItem, subtitle, bannerItem, bannerItemDetail);
    }

    private final void updateBannerSecond(SourceItem sourceItem, String subtitle, BannerItemV2 bannerItem, BannerItemDetail bannerItemDetail) {
        updateBgAndClick(1, sourceItem, subtitle, bannerItem, bannerItemDetail);
    }

    private final void updateBannerThird(SourceItem sourceItem, String subtitle, BannerItemV2 bannerItem, BannerItemDetail bannerItemDetail) {
        updateBgAndClick(2, sourceItem, subtitle, bannerItem, bannerItemDetail);
    }

    private final void updateBgAndClick(int index, final SourceItem sourceItem, final String subtitle, final BannerItemV2 bannerItem, final BannerItemDetail bannerItemDetail) {
        AppCompatImageView appCompatImageView;
        if (index != 0) {
            appCompatImageView = index != 1 ? this.ivBannerThird : this.ivBannerSecond;
        } else {
            appCompatImageView = this.ivBannerFirst;
        }
        String iconImgJumpUrl = null;
        String strFindFirstNotNullImgUrl = sourceItem != null ? BannerHelper.INSTANCE.findFirstNotNullImgUrl(sourceItem, index != 0) : null;
        if (strFindFirstNotNullImgUrl == null || StringsKt__StringsKt.isBlank(strFindFirstNotNullImgUrl)) {
            ViewExtKt.setVisible(appCompatImageView, false);
            return;
        }
        ViewExtKt.setVisible(appCompatImageView, true);
        if (!TextUtils.isEmpty(sourceItem.getIconLayerTxtStr())) {
            appCompatImageView.setContentDescription(sourceItem.getIconLayerTxtStr());
        } else if (!TextUtils.isEmpty(subtitle)) {
            appCompatImageView.setContentDescription(subtitle);
        }
        ImageLoader imageLoader = Coil.imageLoader(appCompatImageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(appCompatImageView.getContext()).data(strFindFirstNotNullImgUrl).target(appCompatImageView);
        builderTarget.transformations(new RoundedCornersTransformation(ExtUtilsKt.getDp(20)));
        imageLoader.enqueue(builderTarget.build());
        if (sourceItem.getHeadLinkType() == 1) {
            String iconImgJumpUrl2 = sourceItem.getIconImgJumpUrl();
            if (iconImgJumpUrl2 != null) {
                iconImgJumpUrl = BannerV2DataKt.appendCurrentLocaleIfNeed(iconImgJumpUrl2);
            }
        } else {
            iconImgJumpUrl = sourceItem.getIconImgJumpUrl();
        }
        final String str = iconImgJumpUrl;
        if (str == null || StringsKt__StringsKt.isBlank(str) || this.mBannerItem == null) {
            return;
        }
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: sag
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MultipleStyleBannerView.updateBgAndClick$lambda$2(bannerItem, bannerItemDetail, str, sourceItem, subtitle, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateBgAndClick$lambda$2(BannerItemV2 bannerItemV2, BannerItemDetail bannerItemDetail, String str, SourceItem sourceItem, String str2, View view) {
        MultipleStyleBannerViewKt.oneTrackOnBannerDetailItemClick(bannerItemV2, bannerItemDetail);
        BannerExtKt.getINSTANCE(IBanner.INSTANCE).onBannerV2Click(str, sourceItem.getHeadLinkType(), str2, "manual_operation", "banner_" + (bannerItemDetail != null ? Integer.valueOf(bannerItemDetail.getBannerId()) : null), "banner_" + (bannerItemDetail != null ? Integer.valueOf(bannerItemDetail.getBannerId()) : null));
    }

    private final void updateTitle() {
        BannerItemV2 bannerItemV2 = this.mBannerItem;
        String resourceTitle = bannerItemV2 != null ? bannerItemV2.getResourceTitle() : null;
        if (resourceTitle == null || StringsKt__StringsKt.isBlank(resourceTitle)) {
            ViewExtKt.setVisible(this.tvMainTitle, false);
        } else {
            ViewExtKt.setVisible(this.tvMainTitle, true);
            this.tvMainTitle.setText(resourceTitle);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(@Nullable Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        BannerItemV2 bannerItemV2 = this.mBannerItem;
        if (bannerItemV2 != null) {
            updateBanner(bannerItemV2);
        }
    }

    public final void updateBanner(@NotNull BannerItemV2 item) {
        int i;
        List<SourceItem> sourceList;
        List<SourceItem> sourceList2;
        List<SourceItem> sourceList3;
        List<SourceItem> sourceList4;
        List<SourceItem> sourceList5;
        List<SourceItem> sourceList6;
        Intrinsics.checkNotNullParameter(item, "item");
        this.mBannerItem = item;
        List<BannerItemDetail> bannerInfoList = item.getBannerInfoList();
        Logger.d(TAG, "updateBanner bannerInfoList size=" + (bannerInfoList != null ? bannerInfoList.size() : 0) + " bannerInfoList=" + bannerInfoList);
        List<BannerItemDetail> list = bannerInfoList;
        if (list == null || list.isEmpty()) {
            ViewExtKt.gone(this.parentView);
            return;
        }
        int size = bannerInfoList.size();
        if (size != 1) {
            i = size != 2 ? 1 : 3;
        } else {
            i = 2;
        }
        ViewExtKt.setVisible(this.parentView, true);
        BannerItemDetail bannerItemDetail = (BannerItemDetail) CollectionsKt___CollectionsKt.getOrNull(bannerInfoList, 0);
        BannerItemDetail bannerItemDetail2 = (BannerItemDetail) CollectionsKt___CollectionsKt.getOrNull(bannerInfoList, 1);
        BannerItemDetail bannerItemDetail3 = (BannerItemDetail) CollectionsKt___CollectionsKt.getOrNull(bannerInfoList, 2);
        Logger.d(TAG, "updateBanner item=" + item.getResourceId() + " style=" + i);
        Logger.d(TAG, "updateBanner firstItem=" + bannerItemDetail + " secondItem=" + bannerItemDetail2 + " thirdItem=" + bannerItemDetail3);
        if (i == 1) {
            ViewExtKt.setVisible(this.ivBannerFirst, true);
            ViewExtKt.setVisible(this.ivBannerSecond, true);
            ViewExtKt.setVisible(this.ivBannerThird, true);
            updateBannerFirst((bannerItemDetail == null || (sourceList3 = bannerItemDetail.getSourceList()) == null) ? null : sourceList3.get(0), bannerItemDetail != null ? bannerItemDetail.getSubTitle() : null, item, bannerItemDetail);
            updateBannerSecond((bannerItemDetail2 == null || (sourceList2 = bannerItemDetail2.getSourceList()) == null) ? null : sourceList2.get(0), bannerItemDetail2 != null ? bannerItemDetail2.getSubTitle() : null, item, bannerItemDetail2);
            updateBannerThird((bannerItemDetail3 == null || (sourceList = bannerItemDetail3.getSourceList()) == null) ? null : sourceList.get(0), bannerItemDetail3 != null ? bannerItemDetail3.getSubTitle() : null, item, bannerItemDetail2);
            if (bannerItemDetail != null) {
                this.ivBannerFirst.setTag(MultipleStyleBannerViewKt.buildBannerCardItemExposeTag(item, bannerItemDetail));
            }
            if (bannerItemDetail2 != null) {
                this.ivBannerSecond.setTag(MultipleStyleBannerViewKt.buildBannerCardItemExposeTag(item, bannerItemDetail2));
            }
            if (bannerItemDetail3 != null) {
                this.ivBannerThird.setTag(MultipleStyleBannerViewKt.buildBannerCardItemExposeTag(item, bannerItemDetail3));
            }
        } else if (i != 3) {
            ViewExtKt.setVisible(this.ivBannerFirst, true);
            ViewExtKt.setVisible(this.ivBannerSecond, false);
            ViewExtKt.setVisible(this.ivBannerThird, false);
            updateBannerFirst((bannerItemDetail == null || (sourceList6 = bannerItemDetail.getSourceList()) == null) ? null : sourceList6.get(0), bannerItemDetail != null ? bannerItemDetail.getSubTitle() : null, item, bannerItemDetail);
            if (bannerItemDetail != null) {
                this.ivBannerFirst.setTag(MultipleStyleBannerViewKt.buildBannerCardItemExposeTag(item, bannerItemDetail));
            }
        } else {
            ViewExtKt.setVisible(this.ivBannerFirst, false);
            ViewExtKt.setVisible(this.ivBannerSecond, true);
            ViewExtKt.setVisible(this.ivBannerThird, true);
            updateBannerSecond((bannerItemDetail == null || (sourceList5 = bannerItemDetail.getSourceList()) == null) ? null : sourceList5.get(0), bannerItemDetail != null ? bannerItemDetail.getSubTitle() : null, item, bannerItemDetail);
            updateBannerThird((bannerItemDetail2 == null || (sourceList4 = bannerItemDetail2.getSourceList()) == null) ? null : sourceList4.get(0), bannerItemDetail2 != null ? bannerItemDetail2.getSubTitle() : null, item, bannerItemDetail2);
            if (bannerItemDetail != null) {
                this.ivBannerSecond.setTag(MultipleStyleBannerViewKt.buildBannerCardItemExposeTag(item, bannerItemDetail));
            }
            if (bannerItemDetail2 != null) {
                this.ivBannerThird.setTag(MultipleStyleBannerViewKt.buildBannerCardItemExposeTag(item, bannerItemDetail2));
            }
        }
        updateTitle();
    }

    public /* synthetic */ MultipleStyleBannerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MultipleStyleBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        l02 l02VarA0 = l02.A0(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(l02VarA0, "inflate(...)");
        this.binding = l02VarA0;
        ConstraintLayout bannerMultipleLayout = l02VarA0.A;
        Intrinsics.checkNotNullExpressionValue(bannerMultipleLayout, "bannerMultipleLayout");
        this.parentView = bannerMultipleLayout;
        TextView tvMainTitle = l02VarA0.E;
        Intrinsics.checkNotNullExpressionValue(tvMainTitle, "tvMainTitle");
        this.tvMainTitle = tvMainTitle;
        TextView tvShowMore = l02VarA0.F;
        Intrinsics.checkNotNullExpressionValue(tvShowMore, "tvShowMore");
        this.tvMore = tvShowMore;
        AppCompatImageView ivBannerFirst = l02VarA0.B;
        Intrinsics.checkNotNullExpressionValue(ivBannerFirst, "ivBannerFirst");
        this.ivBannerFirst = ivBannerFirst;
        AppCompatImageView ivBannerSecond = l02VarA0.C;
        Intrinsics.checkNotNullExpressionValue(ivBannerSecond, "ivBannerSecond");
        this.ivBannerSecond = ivBannerSecond;
        AppCompatImageView ivBannerThird = l02VarA0.D;
        Intrinsics.checkNotNullExpressionValue(ivBannerThird, "ivBannerThird");
        this.ivBannerThird = ivBannerThird;
    }
}
