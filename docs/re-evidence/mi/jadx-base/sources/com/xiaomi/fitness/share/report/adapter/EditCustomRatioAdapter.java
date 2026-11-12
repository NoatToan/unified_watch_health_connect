package com.xiaomi.fitness.share.report.adapter;

import android.annotation.SuppressLint;
import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
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
import com.xiaomi.fitness.share.report.adapter.EditCustomRatioAdapter;
import com.xiaomi.fitness.share.report.viewmodel.SportReportShareViewModel;
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
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 U2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003UVWB'\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010=\u001a\u00020\u0003\u0012\u0006\u0010@\u001a\u00020?\u0012\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bS\u0010TJ\u0017\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0015J\u001b\u0010\u001a\u001a\u00020\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u0003¢\u0006\u0004\b%\u0010\u001dJ%\u0010*\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020&¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020&¢\u0006\u0004\b.\u0010-J\u0015\u00100\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020&¢\u0006\u0004\b0\u0010-J\u0015\u00101\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b1\u0010\u001dJ\u0015\u00102\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b2\u0010\u001dJ+\u00104\u001a\u00020\u000f2\u0006\u00103\u001a\u00020 2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010$\u001a\u00020\u0003¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\u00020\u000f2\u0006\u00106\u001a\u00020&¢\u0006\u0004\b7\u0010-R\u0017\u00109\u001a\u0002088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001c\u0010F\u001a\b\u0018\u00010ER\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u001c\u0010I\u001a\b\u0018\u00010HR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010\u001bR\"\u0010P\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010>\u001a\u0004\bQ\u0010\r\"\u0004\bR\u0010\u001d¨\u0006X"}, d2 = {"Lcom/xiaomi/fitness/share/report/adapter/EditCustomRatioAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "getItemCount", "()I", "holder", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Lcom/xiaomi/fitness/detail/view/StickerView;", "stickerView", "setRectangleStickerView", "(Lcom/xiaomi/fitness/detail/view/StickerView;)V", "setSquareStickerView", "", "Lcom/xiaomi/fitness/detail/data/BasicItemInfo;", "dataList", "showDataList", "(Ljava/util/List;)V", "updateShowView", "(I)V", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "accountCoreInfo", "", "isCommonSport", "setDataViewUserInfo", "(Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;Z)V", "chartType", "changeLineChartType", "", "sloganTxt", "timeTxt", "sportValueTxt", "showSloganView", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "updateSloganTxt", "(Ljava/lang/String;)V", "updateSportTxt", "nameStr", "updateSportNameTxt", "replaceRectangleBgOrCustomizeBg", "replaceSquareBgOrCustomizeBg", "show", "showWhiteBottomTag", "(ZLjava/util/List;I)V", "sportNameTxt", "updateWhiteBottomSportName", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "sportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "getSportReport", "()Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "bgPositionOfPreviewList", "I", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "Lcom/xiaomi/fitness/share/report/viewmodel/SportReportShareViewModel;", "mViewModel", "Lcom/xiaomi/fitness/share/report/viewmodel/SportReportShareViewModel;", "Lcom/xiaomi/fitness/share/report/adapter/EditCustomRatioAdapter$RectangleViewHolder;", "rectangleHolder", "Lcom/xiaomi/fitness/share/report/adapter/EditCustomRatioAdapter$RectangleViewHolder;", "Lcom/xiaomi/fitness/share/report/adapter/EditCustomRatioAdapter$SquareViewHolder;", "squareHolder", "Lcom/xiaomi/fitness/share/report/adapter/EditCustomRatioAdapter$SquareViewHolder;", "allDataList", "Ljava/util/List;", "getShowDataList", "()Ljava/util/List;", "setShowDataList", "showEditType", "getShowEditType", "setShowEditType", "<init>", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;ILcom/xiaomi/fitness/baseui/view/BaseActivity;Lcom/xiaomi/fitness/share/report/viewmodel/SportReportShareViewModel;)V", "Companion", "RectangleViewHolder", "SquareViewHolder", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class EditCustomRatioAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @NotNull
    public static final String TAG = "EditCustomRatioAdapter";

    @NotNull
    public static final String TAG_RECTANGLE_CARD_VIEW = "rectangleCardView";

    @NotNull
    public static final String TAG_SQUARE_CARD_VIEW = "squareCardView";
    public static final int TYPE_RECTANGLE = 0;
    public static final int TYPE_SQUARE = 1;

    @NotNull
    private final BaseActivity activity;

    @NotNull
    private final List<BasicItemInfo> allDataList;
    private final int bgPositionOfPreviewList;

    @NotNull
    private final SportReportShareViewModel mViewModel;

    @Nullable
    private RectangleViewHolder rectangleHolder;

    @NotNull
    private List<BasicItemInfo> showDataList;
    private int showEditType;

    @NotNull
    private final SportBasicReport sportReport;

    @Nullable
    private SquareViewHolder squareHolder;

    @Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\bW\u0010XJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001d\u001a\u00020\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0002¢\u0006\u0004\b&\u0010\u0006J\u0015\u0010(\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0002¢\u0006\u0004\b(\u0010\u0006J\u0015\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u0002¢\u0006\u0004\b*\u0010\u0006R\u0017\u0010,\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001c\u00104\u001a\n 3*\u0004\u0018\u000100008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00102R\u001c\u00106\u001a\n 3*\u0004\u0018\u000105058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u00108\u001a\n 3*\u0004\u0018\u000100008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00102R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010<\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010E\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001c\u0010J\u001a\n 3*\u0004\u0018\u000105058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u00107R\u001c\u0010K\u001a\n 3*\u0004\u0018\u000105058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u00107R\u001c\u0010L\u001a\n 3*\u0004\u0018\u00010+0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010-R\u001c\u0010M\u001a\n 3*\u0004\u0018\u000105058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u00107R\u0014\u0010N\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\"\u0010P\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010\u0012R\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006Y"}, d2 = {"Lcom/xiaomi/fitness/share/report/adapter/EditCustomRatioAdapter$RectangleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "bgPositionOfPreviewList", "", "showTabPosition", "(I)V", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "sportReport", "bindData", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;)V", "", "sloganTxt", "timeTxt", "sportValueTxt", "showSloganView", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "updateSloganTxt", "(Ljava/lang/String;)V", "updateSportTxt", "sportStr", "updateSportNameTxt", "Lcom/xiaomi/fitness/detail/view/StickerView;", "stickerView", "showStickerView", "(Lcom/xiaomi/fitness/detail/view/StickerView;)V", "", "Lcom/xiaomi/fitness/detail/data/BasicItemInfo;", "dataList", "showDataInfoView", "(Ljava/util/List;)V", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "accountCoreInfo", "", "isCommonSport", "setUserInfo", "(Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;Z)V", "chartType", "changeLineChartType", "position", "replaceBgOrCustomizeBg", "viewType", "updateShowView", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Landroid/widget/ImageView;", "bg", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "qrCodeIv", "Landroid/widget/TextView;", "appNameTv", "Landroid/widget/TextView;", "qrCodeBg", "Landroid/widget/FrameLayout;", "stickerParentView", "Landroid/widget/FrameLayout;", "holderSportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "Lcom/xiaomi/fitness/detail/view/SportShareBasicInfoView;", "basicInfoView", "Lcom/xiaomi/fitness/detail/view/SportShareBasicInfoView;", "Landroidx/cardview/widget/CardView;", "cardView", "Landroidx/cardview/widget/CardView;", "Lcom/xiaomi/fitness/detail/view/SportShareSloganView;", "shareSloganView", "Lcom/xiaomi/fitness/detail/view/SportShareSloganView;", "Landroidx/appcompat/widget/AppCompatImageView;", "maskIv", "Landroidx/appcompat/widget/AppCompatImageView;", "bottomAppNameTv", "algoDataSourceCenter", "algoDataSourceLeft", "algoDataSourceLeftTxt", "sportNameType", "I", "sportNameTxt", "Ljava/lang/String;", "getSportNameTxt", "()Ljava/lang/String;", "setSportNameTxt", "sportAllDataList", "Ljava/util/List;", "<init>", "(Lcom/xiaomi/fitness/share/report/adapter/EditCustomRatioAdapter;Landroid/view/View;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class RectangleViewHolder extends RecyclerView.d0 {
        private final TextView algoDataSourceCenter;
        private final View algoDataSourceLeft;
        private final TextView algoDataSourceLeftTxt;
        private final TextView appNameTv;

        @Nullable
        private SportShareBasicInfoView basicInfoView;

        @NotNull
        private final ImageView bg;
        private final TextView bottomAppNameTv;

        @NotNull
        private final CardView cardView;

        @Nullable
        private SportBasicReport holderSportReport;

        @NotNull
        private final AppCompatImageView maskIv;
        private final ImageView qrCodeBg;
        private final ImageView qrCodeIv;

        @NotNull
        private SportShareSloganView shareSloganView;

        @NotNull
        private final List<BasicItemInfo> sportAllDataList;

        @NotNull
        private String sportNameTxt;
        private final int sportNameType;

        @NotNull
        private final FrameLayout stickerParentView;
        final /* synthetic */ EditCustomRatioAdapter this$0;

        @NotNull
        private final View view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RectangleViewHolder(@NotNull EditCustomRatioAdapter editCustomRatioAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = editCustomRatioAdapter;
            this.view = view;
            View viewFindViewById = view.findViewById(bsi.w);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.bg = (ImageView) viewFindViewById;
            this.qrCodeIv = (ImageView) view.findViewById(bsi.d5);
            TextView textView = (TextView) view.findViewById(bsi.l);
            this.appNameTv = textView;
            this.qrCodeBg = (ImageView) view.findViewById(bsi.e5);
            View viewFindViewById2 = view.findViewById(bsi.g7);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.stickerParentView = (FrameLayout) viewFindViewById2;
            this.basicInfoView = (SportShareBasicInfoView) view.findViewById(bsi.f4567r);
            View viewFindViewById3 = view.findViewById(bsi.C);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            CardView cardView = (CardView) viewFindViewById3;
            this.cardView = cardView;
            View viewFindViewById4 = view.findViewById(bsi.r6);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.shareSloganView = (SportShareSloganView) viewFindViewById4;
            View viewFindViewById5 = view.findViewById(bsi.e4);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.maskIv = (AppCompatImageView) viewFindViewById5;
            TextView textView2 = (TextView) view.findViewById(bsi.m);
            this.bottomAppNameTv = textView2;
            this.algoDataSourceCenter = (TextView) view.findViewById(bsi.O6);
            this.algoDataSourceLeft = view.findViewById(bsi.P6);
            this.algoDataSourceLeftTxt = (TextView) view.findViewById(bsi.Q6);
            int iA = lp5.a(editCustomRatioAdapter.getSportReport());
            this.sportNameType = iA;
            String strC = lp5.c(iA);
            Intrinsics.checkNotNullExpressionValue(strC, "getSportTypeName(...)");
            this.sportNameTxt = strC;
            this.sportAllDataList = SportDetailUtil.INSTANCE.initBasicList(editCustomRatioAdapter.getSportReport(), editCustomRatioAdapter.getSportReport().getSportType(), true);
            cardView.setTag(EditCustomRatioAdapter.TAG_RECTANGLE_CARD_VIEW);
            Drawable resourceDrawable = ResourceExtKt.getResourceDrawable(ApplicationExtKt.getApplication(), hoi.x);
            if (resourceDrawable != null) {
                resourceDrawable.setBounds(0, 0, 40, 40);
            }
            textView.setCompoundDrawables(resourceDrawable, null, null, null);
            textView2.setCompoundDrawables(resourceDrawable, null, null, null);
            SportReportShareExtKt.getCommonQrCodeBitmapLiveData().observe(editCustomRatioAdapter.activity, new EditCustomRatioAdapter$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: b18
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return EditCustomRatioAdapter.RectangleViewHolder._init_$lambda$0(this.f3674a, (Bitmap) obj);
                }
            }));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit _init_$lambda$0(RectangleViewHolder this$0, Bitmap bitmap) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showStickerView$lambda$2(final StickerView stickerView, RectangleViewHolder this$0, int i, final Ref.FloatRef xDown, final Ref.FloatRef yDown) {
            Intrinsics.checkNotNullParameter(stickerView, "$stickerView");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(xDown, "$xDown");
            Intrinsics.checkNotNullParameter(yDown, "$yDown");
            final float width = this$0.cardView.getWidth() - stickerView.getViewWidth();
            final float f = i;
            final float height = (this$0.cardView.getHeight() - stickerView.getHeight()) - f;
            final float f2 = 0.0f;
            stickerView.setOnTouchListener(new View.OnTouchListener() { // from class: a18
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return EditCustomRatioAdapter.RectangleViewHolder.showStickerView$lambda$2$lambda$1(xDown, yDown, stickerView, f2, width, f, height, view, motionEvent);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean showStickerView$lambda$2$lambda$1(Ref.FloatRef xDown, Ref.FloatRef yDown, StickerView stickerView, float f, float f2, float f3, float f4, View view, MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(xDown, "$xDown");
            Intrinsics.checkNotNullParameter(yDown, "$yDown");
            Intrinsics.checkNotNullParameter(stickerView, "$stickerView");
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                xDown.element = motionEvent.getX();
                float y = motionEvent.getY();
                yDown.element = y;
                Logger.i(EditCustomRatioAdapter.TAG, "ACTION_DOWN xDown=" + xDown.element + " yDown=" + y);
                return true;
            }
            if (actionMasked != 2) {
                return true;
            }
            float x = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f5 = x - xDown.element;
            float f6 = y2 - yDown.element;
            float x2 = stickerView.getX() + f5;
            if (x2 >= f) {
                f = x2;
            }
            if (f <= f2) {
                f2 = f;
            }
            float y3 = stickerView.getY() + f6;
            if (y3 >= f3) {
                f3 = y3;
            }
            if (f3 <= f4) {
                f4 = f3;
            }
            stickerView.setX(f2);
            stickerView.setY(f4);
            return true;
        }

        private final void showTabPosition(int bgPositionOfPreviewList) {
            String string;
            if (bgPositionOfPreviewList == 1) {
                updateShowView(1);
                return;
            }
            if (bgPositionOfPreviewList == 2) {
                showStickerView(SportReportShareExtKt.getStickerListToShow(AppUtil.getApp(), this.this$0.getSportReport()).get(this.this$0.mViewModel.getCurrentStickerViewPosition()));
                updateShowView(2);
                return;
            }
            if (bgPositionOfPreviewList != 3) {
                return;
            }
            String str = SportReportShareExtKt.getSloganList().get(this.this$0.mViewModel.getSloganTxtIndex());
            String dateYYYYMMDDLocalFormat = TimeDateUtil.getDateYYYYMMDDLocalFormat(this.this$0.getSportReport().getTimeStamp());
            BasicItemInfo basicItemInfo = this.sportAllDataList.get(this.this$0.mViewModel.getSloganDataIndex());
            String pluralTitle = basicItemInfo.getPluralTitle();
            if (pluralTitle == null || pluralTitle.length() == 0) {
                string = AppUtil.getApp().getString(basicItemInfo.getTitle());
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            } else {
                string = basicItemInfo.getPluralTitle();
            }
            String string2 = AppUtil.getApp().getString(j1j.M0, this.sportNameTxt, string, basicItemInfo.getData(), basicItemInfo.getUnit());
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            showSloganView(str, dateYYYYMMDDLocalFormat, string2);
        }

        public final void bindData(@NotNull SportBasicReport sportReport) {
            Intrinsics.checkNotNullParameter(sportReport, "sportReport");
            this.holderSportReport = sportReport;
            Uri localBgUri = SportReportShareExtKt.getLocalBgUri(true, SportReportShareExtKt.getIndexByPosition(this.this$0.bgPositionOfPreviewList));
            Logger.i(EditCustomRatioAdapter.TAG, "bindData bgPositionOfPreviewList square bgPositionOfPreviewList=" + this.this$0.bgPositionOfPreviewList);
            this.stickerParentView.setVisibility(8);
            SportShareBasicInfoView sportShareBasicInfoView = this.basicInfoView;
            if (sportShareBasicInfoView != null) {
                sportShareBasicInfoView.bindData(sportReport, this.this$0.getShowDataList(), this.sportNameTxt, true);
            }
            showTabPosition(this.this$0.getShowEditType());
            Logger.i(EditCustomRatioAdapter.TAG, "loadImgWithHardwareRenderingDisabled rectangle bgUri=" + localBgUri);
            SportReportShareExtKt.loadImgWithHardwareRenderingDisabled$default(this.bg, localBgUri, 0.0f, false, 12, null);
        }

        public final void changeLineChartType(int chartType) {
            SportShareBasicInfoView sportShareBasicInfoView = this.basicInfoView;
            if (sportShareBasicInfoView != null) {
                sportShareBasicInfoView.changeLineChartType(chartType);
            }
        }

        @NotNull
        public final String getSportNameTxt() {
            return this.sportNameTxt;
        }

        @NotNull
        public final View getView() {
            return this.view;
        }

        public final void replaceBgOrCustomizeBg(int position) {
            if (position == 0) {
                SportReportShareExtKt.handleCroppedImage(this.this$0.activity, this.bg, 9, 16);
            } else {
                SportReportShareExtKt.loadImgWithHardwareRenderingDisabled$default(this.bg, SportReportShareExtKt.getLocalBgUri(true, position - 1), 0.0f, false, 12, null);
            }
        }

        public final void setSportNameTxt(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.sportNameTxt = str;
        }

        public final void setUserInfo(@Nullable AccountCoreInfo accountCoreInfo, boolean isCommonSport) {
            SportShareBasicInfoView sportShareBasicInfoView = this.basicInfoView;
            if (sportShareBasicInfoView != null) {
                sportShareBasicInfoView.updateHeaderInfo(accountCoreInfo, isCommonSport);
            }
        }

        public final void showDataInfoView(@NotNull List<BasicItemInfo> dataList) {
            Intrinsics.checkNotNullParameter(dataList, "dataList");
            String strC = lp5.c(lp5.a(this.this$0.getSportReport()));
            this.this$0.setShowDataList(dataList);
            SportShareBasicInfoView sportShareBasicInfoView = this.basicInfoView;
            if (sportShareBasicInfoView != null) {
                sportShareBasicInfoView.bindData(this.this$0.getSportReport(), dataList, strC, true);
            }
            this.stickerParentView.setVisibility(8);
            this.shareSloganView.setVisibility(8);
            SportShareBasicInfoView sportShareBasicInfoView2 = this.basicInfoView;
            if (sportShareBasicInfoView2 != null) {
                sportShareBasicInfoView2.setVisibility(0);
            }
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public final void showSloganView(@NotNull String sloganTxt, @NotNull String timeTxt, @NotNull String sportValueTxt) {
            Intrinsics.checkNotNullParameter(sloganTxt, "sloganTxt");
            Intrinsics.checkNotNullParameter(timeTxt, "timeTxt");
            Intrinsics.checkNotNullParameter(sportValueTxt, "sportValueTxt");
            this.shareSloganView.initSloganView(sloganTxt, timeTxt, sportValueTxt);
            updateShowView(3);
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public final void showStickerView(@NotNull final StickerView stickerView) {
            Intrinsics.checkNotNullParameter(stickerView, "stickerView");
            this.stickerParentView.removeAllViews();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, ExtUtilsKt.getDp(120));
            layoutParams.gravity = 8388691;
            SportBasicReport sportBasicReport = this.holderSportReport;
            final int dp = (sportBasicReport == null || !sportBasicReport.gpsDataSourceValid()) ? ExtUtilsKt.getDp(16) : ExtUtilsKt.getDp(40);
            layoutParams.setMarginStart(ExtUtilsKt.getDp(16));
            layoutParams.bottomMargin = dp;
            stickerView.setLayoutParams(layoutParams);
            SportBasicReport sportBasicReport2 = this.holderSportReport;
            if (sportBasicReport2 != null) {
                Intrinsics.checkNotNull(sportBasicReport2);
                stickerView.setStickTextValue(sportBasicReport2);
            }
            if (stickerView.getParent() != null) {
                ViewParent parent = stickerView.getParent();
                Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent).removeView(stickerView);
            }
            this.stickerParentView.addView(stickerView);
            stickerView.invalidate();
            this.stickerParentView.setVisibility(0);
            SportShareBasicInfoView sportShareBasicInfoView = this.basicInfoView;
            if (sportShareBasicInfoView != null) {
                sportShareBasicInfoView.setVisibility(8);
            }
            this.shareSloganView.setVisibility(8);
            final Ref.FloatRef floatRef = new Ref.FloatRef();
            final Ref.FloatRef floatRef2 = new Ref.FloatRef();
            floatRef2.element = dp;
            stickerView.post(new Runnable() { // from class: z08
                @Override // java.lang.Runnable
                public final void run() {
                    EditCustomRatioAdapter.RectangleViewHolder.showStickerView$lambda$2(stickerView, this, dp, floatRef, floatRef2);
                }
            });
        }

        public final void updateShowView(int viewType) {
            ShareAdapterUtil shareAdapterUtil = ShareAdapterUtil.INSTANCE;
            SportBasicReport sportReport = this.this$0.getSportReport();
            TextView algoDataSourceCenter = this.algoDataSourceCenter;
            Intrinsics.checkNotNullExpressionValue(algoDataSourceCenter, "algoDataSourceCenter");
            TextView algoDataSourceLeftTxt = this.algoDataSourceLeftTxt;
            Intrinsics.checkNotNullExpressionValue(algoDataSourceLeftTxt, "algoDataSourceLeftTxt");
            View algoDataSourceLeft = this.algoDataSourceLeft;
            Intrinsics.checkNotNullExpressionValue(algoDataSourceLeft, "algoDataSourceLeft");
            ShareAdapterUtil.showAlgoDataSource$default(shareAdapterUtil, sportReport, algoDataSourceCenter, algoDataSourceLeftTxt, algoDataSourceLeft, viewType == 3, false, 32, null);
            if (viewType == 1) {
                this.stickerParentView.setVisibility(8);
                SportShareBasicInfoView sportShareBasicInfoView = this.basicInfoView;
                if (sportShareBasicInfoView != null) {
                    sportShareBasicInfoView.setVisibility(0);
                }
                this.shareSloganView.setVisibility(8);
                TextView textView = this.bottomAppNameTv;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                TextView textView2 = this.appNameTv;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                ImageView qrCodeBg = this.qrCodeBg;
                Intrinsics.checkNotNullExpressionValue(qrCodeBg, "qrCodeBg");
                ViewExtKt.visible(qrCodeBg);
                ImageView qrCodeIv = this.qrCodeIv;
                Intrinsics.checkNotNullExpressionValue(qrCodeIv, "qrCodeIv");
                ViewExtKt.visible(qrCodeIv);
                this.maskIv.setImageResource(hoi.T);
                return;
            }
            if (viewType == 2) {
                this.stickerParentView.setVisibility(0);
                SportShareBasicInfoView sportShareBasicInfoView2 = this.basicInfoView;
                if (sportShareBasicInfoView2 != null) {
                    sportShareBasicInfoView2.setVisibility(8);
                }
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
                this.maskIv.setImageResource(hoi.T);
                return;
            }
            if (viewType != 3) {
                return;
            }
            this.stickerParentView.setVisibility(8);
            SportShareBasicInfoView sportShareBasicInfoView3 = this.basicInfoView;
            if (sportShareBasicInfoView3 != null) {
                sportShareBasicInfoView3.setVisibility(8);
            }
            this.shareSloganView.setVisibility(0);
            TextView textView5 = this.bottomAppNameTv;
            if (textView5 != null) {
                textView5.setVisibility(0);
            }
            TextView textView6 = this.appNameTv;
            if (textView6 != null) {
                textView6.setVisibility(8);
            }
            ImageView qrCodeBg3 = this.qrCodeBg;
            Intrinsics.checkNotNullExpressionValue(qrCodeBg3, "qrCodeBg");
            ViewExtKt.invisible(qrCodeBg3);
            ImageView qrCodeIv3 = this.qrCodeIv;
            Intrinsics.checkNotNullExpressionValue(qrCodeIv3, "qrCodeIv");
            ViewExtKt.invisible(qrCodeIv3);
            this.maskIv.setImageResource(hoi.U);
        }

        public final void updateSloganTxt(@NotNull String sloganTxt) {
            Intrinsics.checkNotNullParameter(sloganTxt, "sloganTxt");
            this.shareSloganView.updateSloganTxt(sloganTxt);
        }

        public final void updateSportNameTxt(@NotNull String sportStr) {
            Intrinsics.checkNotNullParameter(sportStr, "sportStr");
            this.sportNameTxt = sportStr;
        }

        public final void updateSportTxt(@NotNull String sportValueTxt) {
            Intrinsics.checkNotNullParameter(sportValueTxt, "sportValueTxt");
            this.shareSloganView.updateSportTxt(sportValueTxt);
        }
    }

    @Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\bc\u0010dJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006J+\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u0013J\u0015\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u0013J\u0015\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0010¢\u0006\u0004\b \u0010\u0013J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b#\u0010$J\u001b\u0010%\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b%\u0010&J\u001f\u0010*\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010)\u001a\u00020\b¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b,\u0010\u0006J\u0015\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0002¢\u0006\u0004\b.\u0010\u0006R\u0017\u00100\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001c\u0010;\u001a\n :*\u0004\u0018\u000107078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00109R\u001c\u0010=\u001a\n :*\u0004\u0018\u00010<0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001c\u0010?\u001a\n :*\u0004\u0018\u000107078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00109R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010G\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010L\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001c\u0010Q\u001a\n :*\u0004\u0018\u00010<0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010>R\u001c\u0010R\u001a\n :*\u0004\u0018\u00010<0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010>R\u001c\u0010S\u001a\n :*\u0004\u0018\u00010/0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u00101R\u001c\u0010T\u001a\n :*\u0004\u0018\u00010<0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010>R\u0017\u0010U\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR*\u0010\u0011\u001a\n :*\u0004\u0018\u00010\u00100\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010\u0013R\u001d\u0010]\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0016\u0010a\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010b¨\u0006e"}, d2 = {"Lcom/xiaomi/fitness/share/report/adapter/EditCustomRatioAdapter$SquareViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "position", "", "showTabPosition", "(I)V", "replaceBgOrCustomizeBg", "", "show", "", "Lcom/xiaomi/fitness/detail/data/BasicItemInfo;", "dataList", "chartType", "showWhiteBottomWindow", "(ZLjava/util/List;I)V", "", "sportNameTxt", "updateSportName", "(Ljava/lang/String;)V", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "sportReport", "bindData", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;)V", "sloganTxt", "timeTxt", "sportValueTxt", "showSloganView", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "updateSloganTxt", "updateSportTxt", "sportStr", "updateSportNameTxt", "Lcom/xiaomi/fitness/detail/view/StickerView;", "stickerView", "showStickerView", "(Lcom/xiaomi/fitness/detail/view/StickerView;)V", "showDataInfoView", "(Ljava/util/List;)V", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "accountCoreInfo", "isCommonSport", "setUserInfo", "(Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;Z)V", "changeLineChartType", "viewType", "updateShowView", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Landroidx/cardview/widget/CardView;", "cardView", "Landroidx/cardview/widget/CardView;", "Landroid/widget/ImageView;", "bg", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "qrCodeIv", "Landroid/widget/TextView;", "appNameTv", "Landroid/widget/TextView;", "qrCodeBg", "Lcom/xiaomi/fitness/detail/view/SportShareDataBottomView;", "bottomTab", "Lcom/xiaomi/fitness/detail/view/SportShareDataBottomView;", "Lcom/xiaomi/fitness/detail/view/SportShareBasicInfoView;", "basicInfoView", "Lcom/xiaomi/fitness/detail/view/SportShareBasicInfoView;", "Lcom/xiaomi/fitness/detail/view/SportShareSloganView;", "shareSloganView", "Lcom/xiaomi/fitness/detail/view/SportShareSloganView;", "Landroid/widget/FrameLayout;", "stickerParentView", "Landroid/widget/FrameLayout;", "holderSportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "Landroidx/appcompat/widget/AppCompatImageView;", "maskIv", "Landroidx/appcompat/widget/AppCompatImageView;", "bottomAppNameTv", "algoDataSourceCenter", "algoDataSourceLeft", "algoDataSourceLeftTxt", "sportNameType", "I", "getSportNameType", "()I", "Ljava/lang/String;", "getSportNameTxt", "()Ljava/lang/String;", "setSportNameTxt", "sportAllDataList", "Ljava/util/List;", "getSportAllDataList", "()Ljava/util/List;", "showBottomView", "Z", "<init>", "(Lcom/xiaomi/fitness/share/report/adapter/EditCustomRatioAdapter;Landroid/view/View;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class SquareViewHolder extends RecyclerView.d0 {
        private final TextView algoDataSourceCenter;
        private final View algoDataSourceLeft;
        private final TextView algoDataSourceLeftTxt;
        private final TextView appNameTv;

        @Nullable
        private SportShareBasicInfoView basicInfoView;

        @NotNull
        private final ImageView bg;
        private final TextView bottomAppNameTv;

        @NotNull
        private final SportShareDataBottomView bottomTab;

        @NotNull
        private final CardView cardView;

        @Nullable
        private SportBasicReport holderSportReport;

        @NotNull
        private final AppCompatImageView maskIv;
        private final ImageView qrCodeBg;
        private final ImageView qrCodeIv;

        @NotNull
        private SportShareSloganView shareSloganView;
        private boolean showBottomView;

        @NotNull
        private final List<BasicItemInfo> sportAllDataList;
        private String sportNameTxt;
        private final int sportNameType;

        @NotNull
        private final FrameLayout stickerParentView;
        final /* synthetic */ EditCustomRatioAdapter this$0;

        @NotNull
        private final View view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SquareViewHolder(@NotNull EditCustomRatioAdapter editCustomRatioAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = editCustomRatioAdapter;
            this.view = view;
            View viewFindViewById = view.findViewById(bsi.C);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            CardView cardView = (CardView) viewFindViewById;
            this.cardView = cardView;
            View viewFindViewById2 = view.findViewById(bsi.w);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.bg = (ImageView) viewFindViewById2;
            this.qrCodeIv = (ImageView) view.findViewById(bsi.d5);
            TextView textView = (TextView) view.findViewById(bsi.l);
            this.appNameTv = textView;
            this.qrCodeBg = (ImageView) view.findViewById(bsi.e5);
            View viewFindViewById3 = view.findViewById(bsi.z);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.bottomTab = (SportShareDataBottomView) viewFindViewById3;
            this.basicInfoView = (SportShareBasicInfoView) view.findViewById(bsi.f4567r);
            View viewFindViewById4 = view.findViewById(bsi.r6);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.shareSloganView = (SportShareSloganView) viewFindViewById4;
            View viewFindViewById5 = view.findViewById(bsi.g7);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.stickerParentView = (FrameLayout) viewFindViewById5;
            View viewFindViewById6 = view.findViewById(bsi.e4);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
            this.maskIv = (AppCompatImageView) viewFindViewById6;
            TextView textView2 = (TextView) view.findViewById(bsi.m);
            this.bottomAppNameTv = textView2;
            this.algoDataSourceCenter = (TextView) view.findViewById(bsi.O6);
            this.algoDataSourceLeft = view.findViewById(bsi.P6);
            this.algoDataSourceLeftTxt = (TextView) view.findViewById(bsi.R6);
            int iA = lp5.a(editCustomRatioAdapter.getSportReport());
            this.sportNameType = iA;
            this.sportNameTxt = lp5.c(iA);
            this.sportAllDataList = SportDetailUtil.initBasicList$default(SportDetailUtil.INSTANCE, editCustomRatioAdapter.getSportReport(), editCustomRatioAdapter.getSportReport().getSportType(), false, 4, null);
            this.showBottomView = true;
            cardView.setTag(EditCustomRatioAdapter.TAG_SQUARE_CARD_VIEW);
            Drawable resourceDrawable = ResourceExtKt.getResourceDrawable(ApplicationExtKt.getApplication(), hoi.x);
            if (resourceDrawable != null) {
                resourceDrawable.setBounds(0, 0, 40, 40);
            }
            textView.setCompoundDrawables(resourceDrawable, null, null, null);
            textView2.setCompoundDrawables(resourceDrawable, null, null, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showStickerView$lambda$1(final StickerView stickerView, SquareViewHolder this$0, int i, final Ref.FloatRef xDown, final Ref.FloatRef yDown) {
            Intrinsics.checkNotNullParameter(stickerView, "$stickerView");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(xDown, "$xDown");
            Intrinsics.checkNotNullParameter(yDown, "$yDown");
            final float width = this$0.cardView.getWidth() - stickerView.getViewWidth();
            final float f = i;
            final float height = (this$0.cardView.getHeight() - stickerView.getHeight()) - f;
            final float f2 = 0.0f;
            stickerView.setOnTouchListener(new View.OnTouchListener() { // from class: c18
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return EditCustomRatioAdapter.SquareViewHolder.showStickerView$lambda$1$lambda$0(xDown, yDown, stickerView, f2, width, f, height, view, motionEvent);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean showStickerView$lambda$1$lambda$0(Ref.FloatRef xDown, Ref.FloatRef yDown, StickerView stickerView, float f, float f2, float f3, float f4, View view, MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(xDown, "$xDown");
            Intrinsics.checkNotNullParameter(yDown, "$yDown");
            Intrinsics.checkNotNullParameter(stickerView, "$stickerView");
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                xDown.element = motionEvent.getX();
                float y = motionEvent.getY();
                yDown.element = y;
                Logger.i(EditCustomRatioAdapter.TAG, "ACTION_DOWN xDown=" + xDown.element + " yDown=" + y);
                return true;
            }
            if (actionMasked != 2) {
                return true;
            }
            float x = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f5 = x - xDown.element;
            float f6 = y2 - yDown.element;
            float x2 = stickerView.getX() + f5;
            if (x2 >= f) {
                f = x2;
            }
            if (f <= f2) {
                f2 = f;
            }
            float y3 = stickerView.getY() + f6;
            if (y3 >= f3) {
                f3 = y3;
            }
            if (f3 <= f4) {
                f4 = f3;
            }
            stickerView.setX(f2);
            stickerView.setY(f4);
            return true;
        }

        private final void showTabPosition(int position) {
            String string;
            if (position == 1) {
                updateShowView(1);
                return;
            }
            if (position == 2) {
                showStickerView(SportReportShareExtKt.getStickerListToShow(AppUtil.getApp(), this.this$0.getSportReport()).get(0));
                updateShowView(2);
                return;
            }
            if (position != 3) {
                return;
            }
            String str = SportReportShareExtKt.getSloganList().get(0);
            String dateYYYYMMDDLocalFormat = TimeDateUtil.getDateYYYYMMDDLocalFormat(this.this$0.getSportReport().getTimeStamp());
            BasicItemInfo basicItemInfo = this.sportAllDataList.get(0);
            String pluralTitle = basicItemInfo.getPluralTitle();
            if (pluralTitle == null || pluralTitle.length() == 0) {
                string = AppUtil.getApp().getString(basicItemInfo.getTitle());
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            } else {
                string = basicItemInfo.getPluralTitle();
            }
            String string2 = AppUtil.getApp().getString(j1j.M0, this.sportNameTxt, string, basicItemInfo.getData(), basicItemInfo.getUnit());
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            showSloganView(str, dateYYYYMMDDLocalFormat, string2);
        }

        public final void bindData(@NotNull SportBasicReport sportReport) {
            Intrinsics.checkNotNullParameter(sportReport, "sportReport");
            this.holderSportReport = sportReport;
            Logger.i(EditCustomRatioAdapter.TAG, "bindData bgPositionOfPreviewList rectangle bgPositionOfPreviewList=" + this.this$0.bgPositionOfPreviewList);
            boolean z = false;
            Uri localBgUri = SportReportShareExtKt.getLocalBgUri(false, SportReportShareExtKt.getIndexByPosition(this.this$0.bgPositionOfPreviewList));
            this.stickerParentView.setVisibility(8);
            lp5.a(sportReport);
            String dateYYYYMMddLocalFormat = TimeDateUtil.getDateYYYYMMddLocalFormat(sportReport.getStartTime() * ((long) 1000));
            SportShareBasicInfoView sportShareBasicInfoView = this.basicInfoView;
            if (sportShareBasicInfoView != null) {
                sportShareBasicInfoView.bindData(sportReport, this.this$0.getShowDataList(), this.sportNameTxt, true);
            }
            SportShareBasicInfoView sportShareBasicInfoView2 = this.basicInfoView;
            if (sportShareBasicInfoView2 != null) {
                sportShareBasicInfoView2.hideHeaderInfo();
            }
            int iInitChartDataList = this.bottomTab.initChartDataList();
            List<BasicItemInfo> listInitBasicList = SportDetailUtil.INSTANCE.initBasicList(sportReport, sportReport.getSportType(), true);
            if (listInitBasicList.size() > 3) {
                listInitBasicList = listInitBasicList.subList(0, 2);
            }
            SportShareDataBottomView sportShareDataBottomView = this.bottomTab;
            Integer algorithmDataSource = sportReport.getAlgorithmDataSource();
            if (algorithmDataSource != null && algorithmDataSource.intValue() == 1) {
                z = true;
            }
            sportShareDataBottomView.bingData(listInitBasicList, iInitChartDataList, z);
            if (this.sportNameTxt.length() < 7) {
                this.bottomTab.updateSportNameStr(dateYYYYMMddLocalFormat + " " + this.sportNameTxt);
            } else {
                this.bottomTab.updateSportNameStr(dateYYYYMMddLocalFormat + "\n" + this.sportNameTxt);
            }
            showTabPosition(this.this$0.getShowEditType());
            Logger.i(EditCustomRatioAdapter.TAG, "loadImgWithHardwareRenderingDisabled square bgUri=" + localBgUri);
            SportReportShareExtKt.loadImgWithHardwareRenderingDisabled$default(this.bg, localBgUri, 0.0f, false, 12, null);
            TextView textView = this.algoDataSourceLeftTxt;
            ShareAdapterUtil shareAdapterUtil = ShareAdapterUtil.INSTANCE;
            Application context = shareAdapterUtil.getContext();
            String string = shareAdapterUtil.getContext().getString(j1j.D2);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = shareAdapterUtil.getContext().getString(j1j.E2);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            textView.setText(shareAdapterUtil.insertIconInText(context, string, string2, hoi.a2));
        }

        public final void changeLineChartType(int chartType) {
            SportShareBasicInfoView sportShareBasicInfoView = this.basicInfoView;
            if (sportShareBasicInfoView != null) {
                sportShareBasicInfoView.changeLineChartType(chartType);
            }
            this.bottomTab.updateChartLineType(chartType);
        }

        @NotNull
        public final List<BasicItemInfo> getSportAllDataList() {
            return this.sportAllDataList;
        }

        public final String getSportNameTxt() {
            return this.sportNameTxt;
        }

        public final int getSportNameType() {
            return this.sportNameType;
        }

        @NotNull
        public final View getView() {
            return this.view;
        }

        public final void replaceBgOrCustomizeBg(int position) {
            if (position == 0) {
                SportReportShareExtKt.handleCroppedImage(this.this$0.activity, this.bg, 1, 1);
            } else {
                SportReportShareExtKt.loadImgWithHardwareRenderingDisabled$default(this.bg, SportReportShareExtKt.getLocalBgUri(false, position - 1), 0.0f, false, 12, null);
            }
        }

        public final void setSportNameTxt(String str) {
            this.sportNameTxt = str;
        }

        public final void setUserInfo(@Nullable AccountCoreInfo accountCoreInfo, boolean isCommonSport) {
            SportShareBasicInfoView sportShareBasicInfoView = this.basicInfoView;
            if (sportShareBasicInfoView != null) {
                sportShareBasicInfoView.updateHeaderInfo(accountCoreInfo, isCommonSport);
            }
            this.bottomTab.updateHeaderInfo(accountCoreInfo, isCommonSport);
        }

        public final void showDataInfoView(@NotNull List<BasicItemInfo> dataList) {
            Intrinsics.checkNotNullParameter(dataList, "dataList");
            String strC = lp5.c(lp5.a(this.this$0.getSportReport()));
            SportShareBasicInfoView sportShareBasicInfoView = this.basicInfoView;
            if (sportShareBasicInfoView != null) {
                sportShareBasicInfoView.bindData(this.this$0.getSportReport(), dataList, strC, true);
            }
            SportShareBasicInfoView sportShareBasicInfoView2 = this.basicInfoView;
            if (sportShareBasicInfoView2 != null) {
                sportShareBasicInfoView2.hideHeaderInfo();
            }
            this.stickerParentView.setVisibility(8);
            this.shareSloganView.setVisibility(8);
            SportShareBasicInfoView sportShareBasicInfoView3 = this.basicInfoView;
            if (sportShareBasicInfoView3 != null) {
                sportShareBasicInfoView3.setVisibility(0);
            }
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public final void showSloganView(@NotNull String sloganTxt, @NotNull String timeTxt, @NotNull String sportValueTxt) {
            Intrinsics.checkNotNullParameter(sloganTxt, "sloganTxt");
            Intrinsics.checkNotNullParameter(timeTxt, "timeTxt");
            Intrinsics.checkNotNullParameter(sportValueTxt, "sportValueTxt");
            this.shareSloganView.initSloganView(sloganTxt, timeTxt, sportValueTxt);
            updateShowView(3);
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public final void showStickerView(@NotNull final StickerView stickerView) {
            Intrinsics.checkNotNullParameter(stickerView, "stickerView");
            this.stickerParentView.removeAllViews();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, ExtUtilsKt.getDp(120));
            layoutParams.gravity = 8388691;
            SportBasicReport sportBasicReport = this.holderSportReport;
            final int dp = (sportBasicReport == null || !sportBasicReport.gpsDataSourceValid()) ? ExtUtilsKt.getDp(16) : ExtUtilsKt.getDp(40);
            layoutParams.setMarginStart(ExtUtilsKt.getDp(16));
            layoutParams.bottomMargin = dp;
            stickerView.setLayoutParams(layoutParams);
            SportBasicReport sportBasicReport2 = this.holderSportReport;
            if (sportBasicReport2 != null) {
                Intrinsics.checkNotNull(sportBasicReport2);
                stickerView.setStickTextValue(sportBasicReport2);
            }
            if (stickerView.getParent() != null) {
                ViewParent parent = stickerView.getParent();
                Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent).removeView(stickerView);
            }
            this.stickerParentView.addView(stickerView);
            stickerView.invalidate();
            final Ref.FloatRef floatRef = new Ref.FloatRef();
            final Ref.FloatRef floatRef2 = new Ref.FloatRef();
            floatRef2.element = dp;
            stickerView.post(new Runnable() { // from class: d18
                @Override // java.lang.Runnable
                public final void run() {
                    EditCustomRatioAdapter.SquareViewHolder.showStickerView$lambda$1(stickerView, this, dp, floatRef, floatRef2);
                }
            });
        }

        public final void showWhiteBottomWindow(boolean show, @NotNull List<BasicItemInfo> dataList, int chartType) {
            Intrinsics.checkNotNullParameter(dataList, "dataList");
            this.showBottomView = show;
            showDataInfoView(dataList);
            SportShareDataBottomView sportShareDataBottomView = this.bottomTab;
            Integer algorithmDataSource = this.this$0.getSportReport().getAlgorithmDataSource();
            sportShareDataBottomView.bingData(dataList, chartType, algorithmDataSource != null && algorithmDataSource.intValue() == 1);
            ViewExtKt.setVisible(this.bottomTab, this.showBottomView);
            SportShareBasicInfoView sportShareBasicInfoView = this.basicInfoView;
            if (sportShareBasicInfoView != null) {
                ViewExtKt.setVisible(sportShareBasicInfoView, !this.showBottomView);
            }
            this.maskIv.setImageResource(this.showBottomView ? hoi.e1 : hoi.f1);
            ShareAdapterUtil shareAdapterUtil = ShareAdapterUtil.INSTANCE;
            SportBasicReport sportReport = this.this$0.getSportReport();
            TextView algoDataSourceCenter = this.algoDataSourceCenter;
            Intrinsics.checkNotNullExpressionValue(algoDataSourceCenter, "algoDataSourceCenter");
            TextView algoDataSourceLeftTxt = this.algoDataSourceLeftTxt;
            Intrinsics.checkNotNullExpressionValue(algoDataSourceLeftTxt, "algoDataSourceLeftTxt");
            View algoDataSourceLeft = this.algoDataSourceLeft;
            Intrinsics.checkNotNullExpressionValue(algoDataSourceLeft, "algoDataSourceLeft");
            shareAdapterUtil.showAlgoDataSource(sportReport, algoDataSourceCenter, algoDataSourceLeftTxt, algoDataSourceLeft, false, this.showBottomView);
        }

        public final void updateShowView(int viewType) {
            ShareAdapterUtil shareAdapterUtil = ShareAdapterUtil.INSTANCE;
            SportBasicReport sportReport = this.this$0.getSportReport();
            TextView algoDataSourceCenter = this.algoDataSourceCenter;
            Intrinsics.checkNotNullExpressionValue(algoDataSourceCenter, "algoDataSourceCenter");
            TextView algoDataSourceLeftTxt = this.algoDataSourceLeftTxt;
            Intrinsics.checkNotNullExpressionValue(algoDataSourceLeftTxt, "algoDataSourceLeftTxt");
            View algoDataSourceLeft = this.algoDataSourceLeft;
            Intrinsics.checkNotNullExpressionValue(algoDataSourceLeft, "algoDataSourceLeft");
            shareAdapterUtil.showAlgoDataSource(sportReport, algoDataSourceCenter, algoDataSourceLeftTxt, algoDataSourceLeft, viewType == 3, viewType == 1 && this.showBottomView);
            if (viewType == 1) {
                this.stickerParentView.setVisibility(8);
                ViewExtKt.setVisible(this.bottomTab, this.showBottomView);
                SportShareBasicInfoView sportShareBasicInfoView = this.basicInfoView;
                if (sportShareBasicInfoView != null) {
                    ViewExtKt.setVisible(sportShareBasicInfoView, !this.showBottomView);
                }
                this.shareSloganView.setVisibility(8);
                TextView textView = this.bottomAppNameTv;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                TextView textView2 = this.appNameTv;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                ImageView qrCodeBg = this.qrCodeBg;
                Intrinsics.checkNotNullExpressionValue(qrCodeBg, "qrCodeBg");
                ViewExtKt.invisible(qrCodeBg);
                ImageView qrCodeIv = this.qrCodeIv;
                Intrinsics.checkNotNullExpressionValue(qrCodeIv, "qrCodeIv");
                ViewExtKt.invisible(qrCodeIv);
                this.maskIv.setImageResource(hoi.f1);
                return;
            }
            if (viewType == 2) {
                this.stickerParentView.setVisibility(0);
                SportShareBasicInfoView sportShareBasicInfoView2 = this.basicInfoView;
                if (sportShareBasicInfoView2 != null) {
                    sportShareBasicInfoView2.setVisibility(8);
                }
                this.shareSloganView.setVisibility(8);
                this.bottomTab.setVisibility(8);
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
                ViewExtKt.invisible(qrCodeBg2);
                ImageView qrCodeIv2 = this.qrCodeIv;
                Intrinsics.checkNotNullExpressionValue(qrCodeIv2, "qrCodeIv");
                ViewExtKt.invisible(qrCodeIv2);
                this.maskIv.setImageResource(hoi.f1);
                return;
            }
            if (viewType != 3) {
                return;
            }
            this.stickerParentView.setVisibility(8);
            SportShareBasicInfoView sportShareBasicInfoView3 = this.basicInfoView;
            if (sportShareBasicInfoView3 != null) {
                sportShareBasicInfoView3.setVisibility(8);
            }
            this.bottomTab.setVisibility(8);
            this.shareSloganView.setVisibility(0);
            TextView textView5 = this.bottomAppNameTv;
            if (textView5 != null) {
                textView5.setVisibility(0);
            }
            TextView textView6 = this.appNameTv;
            if (textView6 != null) {
                textView6.setVisibility(8);
            }
            ImageView qrCodeBg3 = this.qrCodeBg;
            Intrinsics.checkNotNullExpressionValue(qrCodeBg3, "qrCodeBg");
            ViewExtKt.invisible(qrCodeBg3);
            ImageView qrCodeIv3 = this.qrCodeIv;
            Intrinsics.checkNotNullExpressionValue(qrCodeIv3, "qrCodeIv");
            ViewExtKt.invisible(qrCodeIv3);
            this.maskIv.setImageResource(hoi.g1);
        }

        public final void updateSloganTxt(@NotNull String sloganTxt) {
            Intrinsics.checkNotNullParameter(sloganTxt, "sloganTxt");
            this.shareSloganView.updateSloganTxt(sloganTxt);
        }

        public final void updateSportName(@NotNull String sportNameTxt) {
            Intrinsics.checkNotNullParameter(sportNameTxt, "sportNameTxt");
            String dateYYYYMMddLocalFormat = TimeDateUtil.getDateYYYYMMddLocalFormat(this.this$0.getSportReport().getStartTime() * ((long) 1000));
            if (sportNameTxt.length() < 7) {
                this.bottomTab.updateSportNameStr(dateYYYYMMddLocalFormat + " " + sportNameTxt);
                return;
            }
            this.bottomTab.updateSportNameStr(dateYYYYMMddLocalFormat + "\n" + sportNameTxt);
        }

        public final void updateSportNameTxt(@NotNull String sportStr) {
            Intrinsics.checkNotNullParameter(sportStr, "sportStr");
            this.sportNameTxt = sportStr;
        }

        public final void updateSportTxt(@NotNull String sportValueTxt) {
            Intrinsics.checkNotNullParameter(sportValueTxt, "sportValueTxt");
            this.shareSloganView.updateSportTxt(sportValueTxt);
        }
    }

    public EditCustomRatioAdapter(@NotNull SportBasicReport sportReport, int i, @NotNull BaseActivity activity, @NotNull SportReportShareViewModel mViewModel) {
        Intrinsics.checkNotNullParameter(sportReport, "sportReport");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(mViewModel, "mViewModel");
        this.sportReport = sportReport;
        this.bgPositionOfPreviewList = i;
        this.activity = activity;
        this.mViewModel = mViewModel;
        List<BasicItemInfo> listInitBasicList = SportDetailUtil.INSTANCE.initBasicList(sportReport, sportReport.getSportType(), true);
        this.allDataList = listInitBasicList;
        this.showDataList = listInitBasicList.size() > 3 ? listInitBasicList.subList(0, 3) : listInitBasicList;
        this.showEditType = 1;
    }

    public final void changeLineChartType(int chartType) {
        RectangleViewHolder rectangleViewHolder = this.rectangleHolder;
        if (rectangleViewHolder != null) {
            rectangleViewHolder.changeLineChartType(chartType);
        }
        SquareViewHolder squareViewHolder = this.squareHolder;
        if (squareViewHolder != null) {
            squareViewHolder.changeLineChartType(chartType);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return position == 0 ? 0 : 1;
    }

    @NotNull
    public final List<BasicItemInfo> getShowDataList() {
        return this.showDataList;
    }

    public final int getShowEditType() {
        return this.showEditType;
    }

    @NotNull
    public final SportBasicReport getSportReport() {
        return this.sportReport;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof RectangleViewHolder) {
            RectangleViewHolder rectangleViewHolder = (RectangleViewHolder) holder;
            this.rectangleHolder = rectangleViewHolder;
            rectangleViewHolder.bindData(this.sportReport);
        } else if (holder instanceof SquareViewHolder) {
            SquareViewHolder squareViewHolder = (SquareViewHolder) holder;
            this.squareHolder = squareViewHolder;
            squareViewHolder.bindData(this.sportReport);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(ivi.g, parent, false);
            Intrinsics.checkNotNull(viewInflate);
            return new RectangleViewHolder(this, viewInflate);
        }
        View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(ivi.j, parent, false);
        Intrinsics.checkNotNull(viewInflate2);
        return new SquareViewHolder(this, viewInflate2);
    }

    public final void replaceRectangleBgOrCustomizeBg(int position) {
        RectangleViewHolder rectangleViewHolder = this.rectangleHolder;
        if (rectangleViewHolder != null) {
            rectangleViewHolder.replaceBgOrCustomizeBg(position);
        }
    }

    public final void replaceSquareBgOrCustomizeBg(int position) {
        SquareViewHolder squareViewHolder = this.squareHolder;
        if (squareViewHolder != null) {
            squareViewHolder.replaceBgOrCustomizeBg(position);
        }
    }

    public final void setDataViewUserInfo(@Nullable AccountCoreInfo accountCoreInfo, boolean isCommonSport) {
        RectangleViewHolder rectangleViewHolder = this.rectangleHolder;
        if (rectangleViewHolder != null) {
            rectangleViewHolder.setUserInfo(accountCoreInfo, isCommonSport);
        }
        SquareViewHolder squareViewHolder = this.squareHolder;
        if (squareViewHolder != null) {
            squareViewHolder.setUserInfo(accountCoreInfo, isCommonSport);
        }
    }

    public final void setRectangleStickerView(@NotNull StickerView stickerView) {
        Intrinsics.checkNotNullParameter(stickerView, "stickerView");
        RectangleViewHolder rectangleViewHolder = this.rectangleHolder;
        if (rectangleViewHolder != null) {
            rectangleViewHolder.showStickerView(stickerView);
        }
    }

    public final void setShowDataList(@NotNull List<BasicItemInfo> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.showDataList = list;
    }

    public final void setShowEditType(int i) {
        this.showEditType = i;
    }

    public final void setSquareStickerView(@NotNull StickerView stickerView) {
        Intrinsics.checkNotNullParameter(stickerView, "stickerView");
        SquareViewHolder squareViewHolder = this.squareHolder;
        if (squareViewHolder != null) {
            squareViewHolder.showStickerView(stickerView);
        }
    }

    public final void showDataList(@NotNull List<BasicItemInfo> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.showDataList = dataList;
        RectangleViewHolder rectangleViewHolder = this.rectangleHolder;
        if (rectangleViewHolder != null) {
            rectangleViewHolder.showDataInfoView(dataList);
        }
        SquareViewHolder squareViewHolder = this.squareHolder;
        if (squareViewHolder != null) {
            squareViewHolder.showDataInfoView(dataList);
        }
    }

    public final void showSloganView(@NotNull String sloganTxt, @NotNull String timeTxt, @NotNull String sportValueTxt) {
        Intrinsics.checkNotNullParameter(sloganTxt, "sloganTxt");
        Intrinsics.checkNotNullParameter(timeTxt, "timeTxt");
        Intrinsics.checkNotNullParameter(sportValueTxt, "sportValueTxt");
        RectangleViewHolder rectangleViewHolder = this.rectangleHolder;
        if (rectangleViewHolder != null) {
            rectangleViewHolder.showSloganView(sloganTxt, timeTxt, sportValueTxt);
        }
        SquareViewHolder squareViewHolder = this.squareHolder;
        if (squareViewHolder != null) {
            squareViewHolder.showSloganView(sloganTxt, timeTxt, sportValueTxt);
        }
    }

    public final void showWhiteBottomTag(boolean show, @NotNull List<BasicItemInfo> dataList, int chartType) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        SquareViewHolder squareViewHolder = this.squareHolder;
        if (squareViewHolder != null) {
            squareViewHolder.showWhiteBottomWindow(show, dataList, chartType);
        }
    }

    public final void updateShowView(int viewType) {
        SquareViewHolder squareViewHolder = this.squareHolder;
        if (squareViewHolder != null) {
            squareViewHolder.updateShowView(viewType);
        }
        RectangleViewHolder rectangleViewHolder = this.rectangleHolder;
        if (rectangleViewHolder != null) {
            rectangleViewHolder.updateShowView(viewType);
        }
    }

    public final void updateSloganTxt(@NotNull String sloganTxt) {
        Intrinsics.checkNotNullParameter(sloganTxt, "sloganTxt");
        RectangleViewHolder rectangleViewHolder = this.rectangleHolder;
        if (rectangleViewHolder != null) {
            rectangleViewHolder.updateSloganTxt(sloganTxt);
        }
        SquareViewHolder squareViewHolder = this.squareHolder;
        if (squareViewHolder != null) {
            squareViewHolder.updateSloganTxt(sloganTxt);
        }
    }

    public final void updateSportNameTxt(@NotNull String nameStr) {
        Intrinsics.checkNotNullParameter(nameStr, "nameStr");
        RectangleViewHolder rectangleViewHolder = this.rectangleHolder;
        if (rectangleViewHolder != null) {
            rectangleViewHolder.updateSportNameTxt(nameStr);
        }
        SquareViewHolder squareViewHolder = this.squareHolder;
        if (squareViewHolder != null) {
            squareViewHolder.updateSportNameTxt(nameStr);
        }
    }

    public final void updateSportTxt(@NotNull String sportValueTxt) {
        Intrinsics.checkNotNullParameter(sportValueTxt, "sportValueTxt");
        RectangleViewHolder rectangleViewHolder = this.rectangleHolder;
        if (rectangleViewHolder != null) {
            rectangleViewHolder.updateSportTxt(sportValueTxt);
        }
        SquareViewHolder squareViewHolder = this.squareHolder;
        if (squareViewHolder != null) {
            squareViewHolder.updateSportTxt(sportValueTxt);
        }
    }

    public final void updateWhiteBottomSportName(@NotNull String sportNameTxt) {
        Intrinsics.checkNotNullParameter(sportNameTxt, "sportNameTxt");
        SquareViewHolder squareViewHolder = this.squareHolder;
        if (squareViewHolder != null) {
            squareViewHolder.updateSportName(sportNameTxt);
        }
    }
}
