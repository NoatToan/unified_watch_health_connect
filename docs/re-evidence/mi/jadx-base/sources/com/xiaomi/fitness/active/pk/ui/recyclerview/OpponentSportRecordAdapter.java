package com.xiaomi.fitness.active.pk.ui.recyclerview;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.xiaomi.fit.data.common.data.annotation.FitnessSportType;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportRes;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fitness.active.pk.net.model.GetPkSportRecordsResult;
import com.xiaomi.fitness.active.pk.net.model.SportRecord;
import com.xiaomi.fitness.active.pk.ui.recyclerview.OpponentSportRecordAdapter;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.bui;
import defpackage.myi;
import defpackage.ozi;
import defpackage.wqi;
import defpackage.xpd;
import defpackage.xr5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 62\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003786B\u0007¢\u0006\u0004\b5\u0010\u000fJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u000fJ\u0017\u0010\u0017\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0011H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\"\u0010\u0013J\u0017\u0010#\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010$R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'R\u0016\u0010)\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R*\u0010.\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010*¨\u00069"}, d2 = {"Lcom/xiaomi/fitness/active/pk/ui/recyclerview/OpponentSportRecordAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/active/pk/net/model/SportRecord;", "record1", "record2", "", "hasDifferentDateStr", "(Lcom/xiaomi/fitness/active/pk/net/model/SportRecord;Lcom/xiaomi/fitness/active/pk/net/model/SportRecord;)Z", "record", "", "getConvertedDateTimeStrWithZoneOffset", "(Lcom/xiaomi/fitness/active/pk/net/model/SportRecord;)Ljava/lang/String;", "", "loadMore", "()V", "copyOnePageFromSrcListToDataList", "", "getContentItemCount", "()I", "checkPreload", "Lcom/xiaomi/fitness/active/pk/net/model/GetPkSportRecordsResult;", "result", "updateOppoSportRecordResult", "(Lcom/xiaomi/fitness/active/pk/net/model/GetPkSportRecordsResult;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemCount", "getItemViewType", "(I)I", "", "srcList", "Ljava/util/List;", "mList", "loadMoreFooterCount", "I", "shouldSendMoreNetworkRequest", "Z", "Lkotlin/Function0;", "onPreload", "Lkotlin/jvm/functions/Function0;", "getOnPreload", "()Lkotlin/jvm/functions/Function0;", "setOnPreload", "(Lkotlin/jvm/functions/Function0;)V", "counter", "<init>", "Companion", "LoadMoreItemViewHolder", "SportRecordViewHolder", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class OpponentSportRecordAdapter extends RecyclerView.Adapter<RecyclerView.d0> {
    public static final int ITEM_DISPLAY_COUNT_PER_PAGE = 10;

    @NotNull
    public static final String TAG = "OpponentSportRecordAdapter";
    public static final int TYPE_SPORT_RECORD_ITEM = 1;
    public static final int TYPE_SPORT_RECORD_LOAD_MORE = 2;
    private int counter;

    @Nullable
    private Function0<Unit> onPreload;

    @NotNull
    private List<SportRecord> srcList = new ArrayList();

    @NotNull
    private List<SportRecord> mList = new ArrayList();
    private int loadMoreFooterCount = 1;
    private boolean shouldSendMoreNetworkRequest = true;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/active/pk/ui/recyclerview/OpponentSportRecordAdapter$LoadMoreItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/active/pk/ui/recyclerview/OpponentSportRecordAdapter;Landroid/view/View;)V", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class LoadMoreItemViewHolder extends RecyclerView.d0 {
        final /* synthetic */ OpponentSportRecordAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadMoreItemViewHolder(@NotNull OpponentSportRecordAdapter opponentSportRecordAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = opponentSportRecordAdapter;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010$\u001a\u00020\u0017¢\u0006\u0004\b%\u0010&J\u001f\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0019\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001c\u0010\u001d\u001a\n \u0018*\u0004\u0018\u00010\u001c0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010 \u001a\n \u0018*\u0004\u0018\u00010\u001f0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010\"\u001a\n \u0018*\u0004\u0018\u00010\u001f0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u001c\u0010#\u001a\n \u0018*\u0004\u0018\u00010\u001f0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/active/pk/ui/recyclerview/OpponentSportRecordAdapter$SportRecordViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "valueStr", "unitStr", "setDataFormat", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "distance", "getDistanceStrWithoutUnit", "(I)Ljava/lang/String;", "getDistanceUnit", "Lcom/xiaomi/fitness/active/pk/net/model/SportRecord;", "record", "getSeparatorDateStr", "(Lcom/xiaomi/fitness/active/pk/net/model/SportRecord;)Ljava/lang/String;", "sportRecord", "", "hasDifferentDateWithPrevRecord", "hasDifferentDateWithNextRecord", "", "bindData", "(Lcom/xiaomi/fitness/active/pk/net/model/SportRecord;ZZ)V", "Landroid/view/View;", "kotlin.jvm.PlatformType", "upperVerticalLineView", "Landroid/view/View;", "lowerVerticalLineView", "Landroidx/appcompat/widget/AppCompatImageView;", "sportTypeLogoView", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/widget/TextView;", "sportTypeView", "Landroid/widget/TextView;", "sportValueView", "separatorDateTv", "itemView", "<init>", "(Lcom/xiaomi/fitness/active/pk/ui/recyclerview/OpponentSportRecordAdapter;Landroid/view/View;)V", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nOpponentSportRecordAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpponentSportRecordAdapter.kt\ncom/xiaomi/fitness/active/pk/ui/recyclerview/OpponentSportRecordAdapter$SportRecordViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,299:1\n54#2,3:300\n24#2:303\n57#2,6:304\n63#2,2:311\n57#3:310\n*S KotlinDebug\n*F\n+ 1 OpponentSportRecordAdapter.kt\ncom/xiaomi/fitness/active/pk/ui/recyclerview/OpponentSportRecordAdapter$SportRecordViewHolder\n*L\n135#1:300,3\n135#1:303\n135#1:304,6\n135#1:311,2\n135#1:310\n*E\n"})
    public final class SportRecordViewHolder extends RecyclerView.d0 {
        private final View lowerVerticalLineView;
        private final TextView separatorDateTv;
        private final AppCompatImageView sportTypeLogoView;
        private final TextView sportTypeView;
        private final TextView sportValueView;
        final /* synthetic */ OpponentSportRecordAdapter this$0;
        private final View upperVerticalLineView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SportRecordViewHolder(@NotNull OpponentSportRecordAdapter opponentSportRecordAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = opponentSportRecordAdapter;
            this.upperVerticalLineView = itemView.findViewById(wqi.A1);
            this.lowerVerticalLineView = itemView.findViewById(wqi.W);
            this.sportTypeLogoView = (AppCompatImageView) itemView.findViewById(wqi.L0);
            this.sportTypeView = (TextView) itemView.findViewById(wqi.K0);
            this.sportValueView = (TextView) itemView.findViewById(wqi.B1);
            this.separatorDateTv = (TextView) itemView.findViewById(wqi.m);
        }

        private final String getDistanceStrWithoutUnit(int distance) {
            if (distance >= 1000) {
                String strG = xr5.g(2, (distance * 1.0f) / 1000);
                Intrinsics.checkNotNull(strG);
                return strG;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(distance);
            return sb.toString();
        }

        private final String getDistanceUnit(int distance) {
            if (distance < 1000) {
                String quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(myi.c, distance);
                Intrinsics.checkNotNull(quantityString);
                return quantityString;
            }
            String quantityString2 = ApplicationExtKt.getApplication().getResources().getQuantityString(myi.f27349b, xr5.j(xr5.e(2, (distance * 1.0f) / 1000)));
            Intrinsics.checkNotNull(quantityString2);
            return quantityString2;
        }

        private final String getSeparatorDateStr(SportRecord record) {
            return this.this$0.getConvertedDateTimeStrWithZoneOffset(record);
        }

        private final String setDataFormat(String valueStr, String unitStr) {
            StringBuilder sb = new StringBuilder(valueStr);
            if (unitStr.length() > 0) {
                if (!LocaleUtil.INSTANCE.isChinese()) {
                    unitStr = " " + StringsKt__StringsKt.trim((CharSequence) unitStr).toString();
                }
                sb.append(unitStr);
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }

        public final void bindData(@NotNull SportRecord sportRecord, boolean hasDifferentDateWithPrevRecord, boolean hasDifferentDateWithNextRecord) {
            String dataFormat;
            Integer distance;
            Intrinsics.checkNotNullParameter(sportRecord, "sportRecord");
            if (hasDifferentDateWithNextRecord) {
                View lowerVerticalLineView = this.lowerVerticalLineView;
                Intrinsics.checkNotNullExpressionValue(lowerVerticalLineView, "lowerVerticalLineView");
                ViewExtKt.invisible(lowerVerticalLineView);
            } else {
                View lowerVerticalLineView2 = this.lowerVerticalLineView;
                Intrinsics.checkNotNullExpressionValue(lowerVerticalLineView2, "lowerVerticalLineView");
                ViewExtKt.visible(lowerVerticalLineView2);
            }
            if (hasDifferentDateWithPrevRecord) {
                View upperVerticalLineView = this.upperVerticalLineView;
                Intrinsics.checkNotNullExpressionValue(upperVerticalLineView, "upperVerticalLineView");
                ViewExtKt.invisible(upperVerticalLineView);
                TextView separatorDateTv = this.separatorDateTv;
                Intrinsics.checkNotNullExpressionValue(separatorDateTv, "separatorDateTv");
                ViewExtKt.visible(separatorDateTv);
            } else {
                View upperVerticalLineView2 = this.upperVerticalLineView;
                Intrinsics.checkNotNullExpressionValue(upperVerticalLineView2, "upperVerticalLineView");
                ViewExtKt.visible(upperVerticalLineView2);
                TextView separatorDateTv2 = this.separatorDateTv;
                Intrinsics.checkNotNullExpressionValue(separatorDateTv2, "separatorDateTv");
                ViewExtKt.gone(separatorDateTv2);
            }
            SportBasicReport sportBasicReport = (SportBasicReport) xpd.f(sportRecord.getValue(), SportBasicReport.class);
            if (sportBasicReport == null) {
                return;
            }
            Logger.d(OpponentSportRecordAdapter.TAG, "SportRecordViewHolder timeStamp=" + sportBasicReport.getTimeStamp());
            SportRes sportRes = FitnessSportType.INSTANCE.getSportRes(sportBasicReport.getSportType());
            if (sportBasicReport.getDistance() != null && ((distance = sportBasicReport.getDistance()) == null || distance.intValue() != 0)) {
                Integer correctedDistance = sportBasicReport.getCorrectedDistance();
                Integer distance2 = (correctedDistance == null || correctedDistance.intValue() <= 0) ? sportBasicReport.getDistance() : sportBasicReport.getCorrectedDistance();
                Intrinsics.checkNotNull(distance2);
                dataFormat = setDataFormat(getDistanceStrWithoutUnit(distance2.intValue()), getDistanceUnit(distance2.intValue()));
            } else if (sportBasicReport.getCalories() != null) {
                Resources resources = ApplicationExtKt.getApplication().getResources();
                int i = myi.common_unit_calorie;
                Integer calories = sportBasicReport.getCalories();
                Intrinsics.checkNotNull(calories);
                dataFormat = setDataFormat(String.valueOf(sportBasicReport.getCalories()), resources.getQuantityText(i, calories.intValue()).toString());
            } else {
                dataFormat = "";
            }
            String name = sportRes.getName();
            int icon = sportRes.getIcon() == 0 ? 0 : sportRes.getIcon();
            this.separatorDateTv.setText(getSeparatorDateStr(sportRecord));
            AppCompatImageView sportTypeLogoView = this.sportTypeLogoView;
            Intrinsics.checkNotNullExpressionValue(sportTypeLogoView, "sportTypeLogoView");
            Coil.imageLoader(sportTypeLogoView.getContext()).enqueue(new ImageRequest.Builder(sportTypeLogoView.getContext()).data(Integer.valueOf(icon)).target(sportTypeLogoView).build());
            this.sportTypeView.setText(name);
            Logger.d(OpponentSportRecordAdapter.TAG, "SportRecordViewHolder sportTypeName=" + name);
            this.sportValueView.setText(ResourceExtKt.getString(ozi.T, dataFormat, TimeUtils.INSTANCE.formatSeconds((long) sportBasicReport.getDuration())));
            Logger.d(OpponentSportRecordAdapter.TAG, "SportRecordViewHolder sportValueView.text=" + ((Object) this.sportValueView.getText()));
        }
    }

    private final void checkPreload() {
        boolean z = (this.mList.size() + 10) % 20 == 0;
        if (z) {
            Logger.d(TAG, "checkPreload mList.size=" + this.mList + ".size");
        }
        Function0<Unit> function0 = this.onPreload;
        if (function0 == null || !z || !this.shouldSendMoreNetworkRequest || function0 == null) {
            return;
        }
        function0.invoke();
    }

    private final void copyOnePageFromSrcListToDataList() {
        Logger.d(TAG, "copyOnePageFromSrcListToDataList srcList.size=" + this.srcList.size());
        if (this.mList.size() >= this.srcList.size()) {
            return;
        }
        int iMin = Math.min(this.mList.size() + 10, this.srcList.size());
        List<SportRecord> list = this.mList;
        list.addAll(this.srcList.subList(list.size(), iMin));
        int size = this.mList.size();
        List<SportRecord> list2 = this.mList;
        Logger.d(TAG, "copyOnePageFromSrcListToDataList mList.size=" + size + " mList=" + list2 + "first=" + (list2.size() + 10) + " second=" + this.srcList.size());
    }

    private final int getContentItemCount() {
        Logger.d(TAG, "getContentItemCount size=" + this.mList.size());
        return this.mList.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getConvertedDateTimeStrWithZoneOffset(SportRecord record) {
        long time = record.getTime();
        int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
        if (Intrinsics.compare(currentTZOffsetInSec, record.getZoneOffset()) != 0) {
            time = (record.getTime() + ((long) record.getZoneOffset())) - ((long) currentTZOffsetInSec);
        }
        Logger.d(TAG, "getConvertedDateTimeStrWithZoneOffset curTzInSec=" + currentTZOffsetInSec + " zoneOffset=" + record.getZoneOffset());
        return TimeDateUtil.getDateMMddNumberFormat(time * ((long) 1000));
    }

    private final boolean hasDifferentDateStr(SportRecord record1, SportRecord record2) {
        return !Intrinsics.areEqual(getConvertedDateTimeStrWithZoneOffset(record1), getConvertedDateTimeStrWithZoneOffset(record2));
    }

    private final void loadMore() {
        copyOnePageFromSrcListToDataList();
        notifyDataSetChanged();
        checkPreload();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(OpponentSportRecordAdapter this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadMore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        Logger.d(TAG, "getItemCount mList.size=" + this.mList.size() + " srcList.size=" + this.srcList.size());
        int i = (this.mList.size() < this.srcList.size() || this.shouldSendMoreNetworkRequest) ? 1 : 0;
        this.loadMoreFooterCount = i;
        Logger.d(TAG, "getItemCount footerItemCount size=" + i);
        return getContentItemCount() + this.loadMoreFooterCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return (this.loadMoreFooterCount == 1 && position == getCount() - 1) ? 2 : 1;
    }

    @Nullable
    public final Function0<Unit> getOnPreload() {
        return this.onPreload;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Logger.d(TAG, "---position=" + position + "-----------");
        if (!(holder instanceof SportRecordViewHolder)) {
            Logger.d(TAG, "holderType=LoadMoreItemViewHolder");
            ((LoadMoreItemViewHolder) holder).itemView.setOnClickListener(new View.OnClickListener() { // from class: sbh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OpponentSportRecordAdapter.onBindViewHolder$lambda$0(this.f33486a, view);
                }
            });
            return;
        }
        SportRecord sportRecord = this.mList.get(position);
        Logger.d(TAG, "holderType=SportRecordViewHolder");
        boolean zHasDifferentDateStr = position == 0 ? true : hasDifferentDateStr(sportRecord, this.mList.get(position - 1));
        boolean zHasDifferentDateStr2 = position != this.mList.size() - 1 ? hasDifferentDateStr(sportRecord, this.mList.get(position + 1)) : true;
        Logger.d(TAG, "SportRecordViewHolder position=" + position + " hasDifferentDateWithPrevRecord=" + zHasDifferentDateStr + " hasDifferentDateWithNextRecord=" + zHasDifferentDateStr2);
        ((SportRecordViewHolder) holder).bindData(sportRecord, zHasDifferentDateStr, zHasDifferentDateStr2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 1) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(bui.p, parent, false);
            Intrinsics.checkNotNull(viewInflate);
            return new SportRecordViewHolder(this, viewInflate);
        }
        View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(bui.j, parent, false);
        Intrinsics.checkNotNull(viewInflate2);
        return new LoadMoreItemViewHolder(this, viewInflate2);
    }

    public final void setOnPreload(@Nullable Function0<Unit> function0) {
        this.onPreload = function0;
    }

    public final void updateOppoSportRecordResult(@Nullable GetPkSportRecordsResult result) {
        int i = this.counter + 1;
        this.counter = i;
        Logger.i(TAG, "updateOppoSportRecordResult counter=" + i);
        if ((result != null ? result.getSportRecords() : null) == null) {
            return;
        }
        this.shouldSendMoreNetworkRequest = result.getHasMore();
        this.srcList.addAll(result.getSportRecords());
        if (this.mList.size() == 0) {
            loadMore();
        }
        Logger.i(TAG, "updateOppoSportRecordResult hasMore=" + result.getHasMore());
        Logger.i(TAG, "updateOppoSportRecordResult srcList size=" + this.srcList.size());
    }
}
