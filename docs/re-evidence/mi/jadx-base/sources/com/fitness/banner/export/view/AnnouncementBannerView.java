package com.fitness.banner.export.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import coil.Coil;
import coil.request.ImageRequest;
import com.fitness.banner.export.BannerExtKt;
import com.fitness.banner.export.BannerHelper;
import com.fitness.banner.export.IBanner;
import com.fitness.banner.export.v2.BannerItemDetail;
import com.fitness.banner.export.v2.BannerItemV2;
import com.fitness.banner.export.v2.BannerV2DataKt;
import com.fitness.banner.export.v2.DisplayExtra;
import com.fitness.banner.export.v2.RepeatExtra;
import com.fitness.banner.export.v2.SourceItem;
import com.fitness.banner.export.view.AnnouncementBannerView;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.dpi;
import defpackage.g02;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\u00042\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a¨\u0006\""}, d2 = {"Lcom/fitness/banner/export/view/AnnouncementBannerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/fitness/banner/export/v2/BannerItemDetail;", "bannerItem", "", "updateBanner", "(Lcom/fitness/banner/export/v2/BannerItemDetail;)V", "", "visible", "updateBannerVisible", "(Z)V", "", "Lcom/fitness/banner/export/v2/BannerItemV2;", "list", "updateAnnounceBannerList", "(Ljava/util/List;)V", "Lg02;", "binding", "Lg02;", "parentView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/widget/TextView;", "tvContent", "Landroid/widget/TextView;", "Landroidx/appcompat/widget/AppCompatImageView;", "ivClose", "Landroidx/appcompat/widget/AppCompatImageView;", "ivLeftImg", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "banner-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAnnouncementBannerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnouncementBannerView.kt\ncom/fitness/banner/export/view/AnnouncementBannerView\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,192:1\n54#2,3:193\n24#2:196\n57#2,6:197\n63#2,2:204\n57#3:203\n*S KotlinDebug\n*F\n+ 1 AnnouncementBannerView.kt\ncom/fitness/banner/export/view/AnnouncementBannerView\n*L\n107#1:193,3\n107#1:196\n107#1:197,6\n107#1:204,2\n107#1:203\n*E\n"})
public final class AnnouncementBannerView extends ConstraintLayout {

    @NotNull
    private final g02 binding;

    @NotNull
    private final AppCompatImageView ivClose;

    @NotNull
    private final AppCompatImageView ivLeftImg;

    @NotNull
    private final ConstraintLayout parentView;

    @NotNull
    private final TextView tvContent;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public AnnouncementBannerView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void updateBanner(final BannerItemDetail bannerItem) {
        String mainTitle;
        final List<Integer> arrayList;
        SourceItem sourceItem;
        SourceItem sourceItem2;
        if (bannerItem == null || bannerItem.getBannerId() <= 0 || (mainTitle = bannerItem.getMainTitle()) == null || StringsKt__StringsKt.isBlank(mainTitle)) {
            updateBannerVisible(false);
            return;
        }
        updateBannerVisible(true);
        setTag(AnnouncementBannerViewKt.buildAnnouncementBannerExposeTag(bannerItem));
        String mainTitle2 = bannerItem.getMainTitle();
        DisplayExtra displayExtra = bannerItem.getDisplayExtra();
        RepeatExtra repeatExtra = bannerItem.getRepeatExtra();
        final String strAppendCurrentLocaleIfNeed = null;
        if (displayExtra != null && displayExtra.getShowTimeSegment()) {
            String cycleStartStr = repeatExtra != null ? repeatExtra.getCycleStartStr() : null;
            if (cycleStartStr != null && !StringsKt__StringsKt.isBlank(cycleStartStr)) {
                String cycleEndStr = repeatExtra != null ? repeatExtra.getCycleEndStr() : null;
                if (cycleEndStr != null && !StringsKt__StringsKt.isBlank(cycleEndStr)) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    Object[] objArr = new Object[2];
                    objArr[0] = repeatExtra != null ? repeatExtra.getCycleStartStr() : null;
                    objArr[1] = repeatExtra != null ? repeatExtra.getCycleEndStr() : null;
                    String str = String.format("%s-%s", Arrays.copyOf(objArr, 2));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    mainTitle2 = String.format("%s %s", Arrays.copyOf(new Object[]{str, mainTitle2}, 2));
                    Intrinsics.checkNotNullExpressionValue(mainTitle2, "format(...)");
                }
            }
        }
        this.tvContent.setText(mainTitle2);
        this.tvContent.setCompoundDrawablesWithIntrinsicBounds(0, 0, displayExtra != null ? displayExtra.getShowViewIcon() : false ? dpi.f15792a : 0, 0);
        this.tvContent.requestFocus();
        List<SourceItem> sourceList = bannerItem.getSourceList();
        SourceItem sourceItem3 = sourceList != null ? (SourceItem) CollectionsKt___CollectionsKt.firstOrNull((List) sourceList) : null;
        String iconDefaultUrl = sourceItem3 != null ? sourceItem3.getIconDefaultUrl() : null;
        if (iconDefaultUrl == null || StringsKt__StringsKt.isBlank(iconDefaultUrl)) {
            ViewExtKt.setVisible(this.ivLeftImg, false);
        } else {
            ViewExtKt.setVisible(this.ivLeftImg, true);
            AppCompatImageView appCompatImageView = this.ivLeftImg;
            Coil.imageLoader(appCompatImageView.getContext()).enqueue(new ImageRequest.Builder(appCompatImageView.getContext()).data(iconDefaultUrl).target(appCompatImageView).build());
        }
        if (displayExtra == null || (arrayList = displayExtra.getDestroyTypeList()) == null) {
            arrayList = new ArrayList<>();
        }
        List<SourceItem> sourceList2 = bannerItem.getSourceList();
        if (sourceList2 != null && (sourceItem2 = sourceList2.get(0)) != null) {
            strAppendCurrentLocaleIfNeed = sourceItem2.getIconImgJumpUrl();
        }
        if (sourceItem3 != null && sourceItem3.getHeadLinkType() == 1) {
            strAppendCurrentLocaleIfNeed = BannerV2DataKt.appendCurrentLocaleIfNeed(strAppendCurrentLocaleIfNeed);
        }
        List<SourceItem> sourceList3 = bannerItem.getSourceList();
        final int headLinkType = (sourceList3 == null || (sourceItem = (SourceItem) CollectionsKt___CollectionsKt.getOrNull(sourceList3, 0)) == null) ? 0 : sourceItem.getHeadLinkType();
        if (strAppendCurrentLocaleIfNeed != null && !StringsKt__StringsKt.isBlank(strAppendCurrentLocaleIfNeed)) {
            this.parentView.setOnClickListener(new View.OnClickListener() { // from class: md1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AnnouncementBannerView.updateBanner$lambda$0(bannerItem, strAppendCurrentLocaleIfNeed, headLinkType, arrayList, view);
                }
            });
        }
        ViewExtKt.setVisible(this.ivClose, displayExtra != null ? displayExtra.getShowCloseIcon() : false);
        this.ivClose.setOnClickListener(new View.OnClickListener() { // from class: nd1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnnouncementBannerView.updateBanner$lambda$1(arrayList, bannerItem, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateBanner$lambda$0(BannerItemDetail bannerItemDetail, String str, int i, List destroyTypeList, View view) {
        Intrinsics.checkNotNullParameter(destroyTypeList, "$destroyTypeList");
        AnnouncementBannerViewKt.oneTrackOnAnnouncementClick(bannerItemDetail);
        IBanner.Companion companion = IBanner.INSTANCE;
        BannerExtKt.getINSTANCE(companion).onBannerV2Click(str, i, bannerItemDetail.getSubTitle(), "manual_operation", "banner_" + bannerItemDetail.getBannerId(), "banner_" + bannerItemDetail.getBannerId());
        if (destroyTypeList.contains(1)) {
            IBanner.DefaultImpls.updateBannerTimeConfig$default(BannerExtKt.getINSTANCE(companion), bannerItemDetail.getBannerId(), Long.valueOf(System.currentTimeMillis() / ((long) 1000)), null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateBanner$lambda$1(List destroyTypeList, BannerItemDetail bannerItemDetail, AnnouncementBannerView this$0, View view) {
        Intrinsics.checkNotNullParameter(destroyTypeList, "$destroyTypeList");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (destroyTypeList.contains(2)) {
            IBanner.DefaultImpls.updateBannerTimeConfig$default(BannerExtKt.getINSTANCE(IBanner.INSTANCE), bannerItemDetail.getBannerId(), null, Long.valueOf(System.currentTimeMillis() / ((long) 1000)), 2, null);
        }
        this$0.updateBannerVisible(false);
    }

    public final void updateAnnounceBannerList(@Nullable List<BannerItemV2> list) {
        String mainTitle;
        List<BannerItemV2> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            updateBannerVisible(false);
            return;
        }
        List<BannerItemDetail> bannerInfoList = ((BannerItemV2) CollectionsKt___CollectionsKt.first((List) list)).getBannerInfoList();
        List<BannerItemDetail> list3 = bannerInfoList;
        if (list3 == null || list3.isEmpty()) {
            updateBannerVisible(false);
            return;
        }
        for (BannerItemDetail bannerItemDetail : bannerInfoList) {
            if (bannerItemDetail.getBannerId() > 0 && (mainTitle = bannerItemDetail.getMainTitle()) != null && !StringsKt__StringsKt.isBlank(mainTitle) && !BannerHelper.INSTANCE.needInterceptBannerShow(bannerItemDetail)) {
                updateBanner(bannerItemDetail);
            }
        }
        bannerItemDetail = null;
        updateBanner(bannerItemDetail);
    }

    public final void updateBannerVisible(boolean visible) {
        ViewExtKt.setVisible(this.parentView, visible);
    }

    public /* synthetic */ AnnouncementBannerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AnnouncementBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        g02 g02VarA0 = g02.A0(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(g02VarA0, "inflate(...)");
        this.binding = g02VarA0;
        ConstraintLayout clContent = g02VarA0.A;
        Intrinsics.checkNotNullExpressionValue(clContent, "clContent");
        this.parentView = clContent;
        TextView tvContent = g02VarA0.D;
        Intrinsics.checkNotNullExpressionValue(tvContent, "tvContent");
        this.tvContent = tvContent;
        AppCompatImageView ivClose = g02VarA0.B;
        Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
        this.ivClose = ivClose;
        AppCompatImageView ivLeft = g02VarA0.C;
        Intrinsics.checkNotNullExpressionValue(ivLeft, "ivLeft");
        this.ivLeftImg = ivLeft;
    }
}
