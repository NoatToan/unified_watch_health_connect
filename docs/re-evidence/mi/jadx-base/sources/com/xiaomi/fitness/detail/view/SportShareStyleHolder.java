package com.xiaomi.fitness.detail.view;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.baseui.recyclerview.decoration.GridItemSpace;
import com.xiaomi.fitness.common.extensions.ItemDecorationExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.detail.data.BasicItemInfo;
import com.xiaomi.fitness.detail.model.SportRecordShareModel;
import com.xiaomi.fitness.detail.recycler.SportShareEditAdapter;
import com.xiaomi.fitness.share.report.SportReportShareExtKt;
import defpackage.bsi;
import defpackage.j1j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 I2\u00020\u0001:\u0001IB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010&\u001a\u00020'JS\u0010(\u001a\u00020'2K\u0010)\u001aG\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(-\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110/¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020'0*J\u0016\u00101\u001a\u00020'2\u0006\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u0007J[\u00104\u001a\u00020'2K\u0010)\u001aG\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(-\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110/¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020'0*2\u0006\u0010\u0006\u001a\u00020\u0007J\"\u00105\u001a\u00020'2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J{\u00108\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010<\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010\u00102\u0010\b\u0002\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010?2\u0010\b\u0002\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00102\u0010\b\u0002\u0010A\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010\u00102\b\b\u0002\u0010B\u001a\u00020\u0007¢\u0006\u0002\u0010CJ\u001b\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010E\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010FJ\u0010\u0010G\u001a\u00020H2\u0006\u00102\u001a\u00020\u0007H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006J"}, d2 = {"Lcom/xiaomi/fitness/detail/view/SportShareStyleHolder;", "", "context", "Landroid/content/Context;", "styleView", "Landroid/view/View;", "holderType", "", "<init>", "(Landroid/content/Context;Landroid/view/View;I)V", "getContext", "()Landroid/content/Context;", "firstViewAdapter", "Lcom/xiaomi/fitness/detail/recycler/SportShareEditAdapter;", "secondViewAdapter", "firstDataList", "", "Lcom/xiaomi/fitness/detail/model/SportRecordShareModel;", "getFirstDataList", "()Ljava/util/List;", "setFirstDataList", "(Ljava/util/List;)V", "secondDataList", "getSecondDataList", "setSecondDataList", "firstView", "Landroidx/recyclerview/widget/RecyclerView;", "getFirstView", "()Landroidx/recyclerview/widget/RecyclerView;", "secondView", "secondLabel", "Landroid/widget/TextView;", "firstLabel", "choiceDataMaxNum", "choiceSloganMaxNum", "currentDataCount", "currentSloganCount", "holderDataType", "initHolder", "", "setOnItemClickListener", "callback", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "typeId", "choiceId", "", "isSelected", "setHolderDataType", "type", "index", "setOnItemStringClickListener", "setHolderDataList", "setList", "secondList", "buiLdlViewItemList", "sportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "categoryType", "dataInfoList", "Lcom/xiaomi/fitness/detail/data/BasicItemInfo;", "selectedBgPositionLiveData", "Landroidx/lifecycle/MutableLiveData;", "chartDataList", "choiceDataList", "choiceIndex", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;Ljava/lang/Integer;Ljava/util/List;Landroidx/lifecycle/MutableLiveData;Ljava/util/List;Ljava/util/List;I)Ljava/util/List;", "changeChoiceBgPosition", "selectBgPosition", "(Ljava/lang/Integer;)Ljava/util/List;", "getChartStringByType", "", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportShareStyleHolder {
    public static final int COUNT_5_PER_ROW = 5;
    public static final int HOLDER_CHART = 6;

    @NotNull
    public static final String TAG = "SportShareStyleHolder";
    public static final int holderBottomData = 8;
    public static final int holderData = 3;
    public static final int holderLongBackground = 1;
    public static final int holderNormalBackground = 2;
    public static final int holderSlogan = 5;
    public static final int holderSloganData = 7;
    public static final int holderWatermark = 4;
    private final int choiceDataMaxNum;
    private final int choiceSloganMaxNum;

    @NotNull
    private final Context context;
    private int currentDataCount;
    private int currentSloganCount;

    @NotNull
    private List<SportRecordShareModel> firstDataList;

    @NotNull
    private final TextView firstLabel;

    @NotNull
    private final RecyclerView firstView;

    @Nullable
    private SportShareEditAdapter firstViewAdapter;
    private int holderDataType;
    private final int holderType;

    @NotNull
    private List<SportRecordShareModel> secondDataList;

    @NotNull
    private final TextView secondLabel;

    @NotNull
    private final RecyclerView secondView;

    @Nullable
    private SportShareEditAdapter secondViewAdapter;

    @NotNull
    private final View styleView;

    public SportShareStyleHolder(@NotNull Context context, @NotNull View styleView, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(styleView, "styleView");
        this.context = context;
        this.styleView = styleView;
        this.holderType = i;
        this.firstDataList = new ArrayList();
        this.secondDataList = new ArrayList();
        View viewFindViewById = styleView.findViewById(bsi.b2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.firstView = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = styleView.findViewById(bsi.h6);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.secondView = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = styleView.findViewById(bsi.d6);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.secondLabel = (TextView) viewFindViewById3;
        View viewFindViewById4 = styleView.findViewById(bsi.Y1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.firstLabel = (TextView) viewFindViewById4;
        this.choiceDataMaxNum = 6;
        this.choiceSloganMaxNum = 3;
        this.currentDataCount = 3;
        this.currentSloganCount = 1;
        this.holderDataType = 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List buiLdlViewItemList$default(SportShareStyleHolder sportShareStyleHolder, SportBasicReport sportBasicReport, Integer num, List list, MutableLiveData mutableLiveData, List list2, List list3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            sportBasicReport = null;
        }
        if ((i2 & 2) != 0) {
            num = null;
        }
        if ((i2 & 4) != 0) {
            list = null;
        }
        if ((i2 & 8) != 0) {
            mutableLiveData = null;
        }
        if ((i2 & 16) != 0) {
            list2 = null;
        }
        if ((i2 & 32) != 0) {
            list3 = null;
        }
        if ((i2 & 64) != 0) {
            i = 0;
        }
        return sportShareStyleHolder.buiLdlViewItemList(sportBasicReport, num, list, mutableLiveData, list2, list3, i);
    }

    private final String getChartStringByType(int type) {
        if (type == 0) {
            String string = this.context.getString(j1j.t0);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (type == 1) {
            String string2 = this.context.getString(j1j.q0);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (type == 2) {
            String string3 = this.context.getString(j1j.s0);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        if (type == 3) {
            String string4 = this.context.getString(j1j.r0);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            return string4;
        }
        if (type != 4) {
            String string5 = this.context.getString(j1j.q0);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            return string5;
        }
        String string6 = this.context.getString(j1j.p0);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        return string6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @NotNull
    public final List<SportRecordShareModel> buiLdlViewItemList(@Nullable SportBasicReport sportReport, @Nullable Integer categoryType, @Nullable List<BasicItemInfo> dataInfoList, @Nullable MutableLiveData<Integer> selectedBgPositionLiveData, @Nullable List<Integer> chartDataList, @Nullable List<BasicItemInfo> choiceDataList, int choiceIndex) {
        String string;
        String string2;
        StickerView watermarkView;
        ArrayList arrayList = new ArrayList();
        int iIntValue = this.holderType;
        if (categoryType != null) {
            iIntValue = categoryType.intValue();
        }
        int i = 0;
        switch (iIntValue) {
            case 1:
                List<Uri> allRectangleBgUriList = SportReportShareExtKt.getAllRectangleBgUriList();
                ListExtKt.add(arrayList, new SportRecordShareModel(null, null, null, null, null, null, false, 127, null));
                int size = allRectangleBgUriList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    SportRecordShareModel sportRecordShareModel = new SportRecordShareModel(null, allRectangleBgUriList.get(i2), null, null, null, null, false, 125, null);
                    if (selectedBgPositionLiveData != null) {
                        Integer value = selectedBgPositionLiveData.getValue();
                        if (i2 == SportReportShareExtKt.getIndexByPosition(value != null ? value.intValue() : 0)) {
                            sportRecordShareModel.setSelect(true);
                        }
                    } else if (i2 == 0) {
                        sportRecordShareModel.setSelect(true);
                    }
                    ListExtKt.add(arrayList, sportRecordShareModel);
                }
                return arrayList;
            case 2:
                List<Uri> allSquareBgUriList = SportReportShareExtKt.getAllSquareBgUriList();
                ListExtKt.add(arrayList, new SportRecordShareModel(null, null, null, null, null, null, false, 127, null));
                int size2 = allSquareBgUriList.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    SportRecordShareModel sportRecordShareModel2 = new SportRecordShareModel(null, allSquareBgUriList.get(i3), null, null, null, null, false, 125, null);
                    if (selectedBgPositionLiveData != null) {
                        Integer value2 = selectedBgPositionLiveData.getValue();
                        if (i3 == SportReportShareExtKt.getIndexByPosition(value2 != null ? value2.intValue() : 0)) {
                            sportRecordShareModel2.setSelect(true);
                        }
                    } else if (i3 == 0) {
                        sportRecordShareModel2.setSelect(true);
                    }
                    ListExtKt.add(arrayList, sportRecordShareModel2);
                }
                return arrayList;
            case 3:
                if (dataInfoList == null) {
                    return arrayList;
                }
                int size3 = dataInfoList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    BasicItemInfo basicItemInfo = dataInfoList.get(i4);
                    String pluralTitle = basicItemInfo.getPluralTitle();
                    if (pluralTitle == null || pluralTitle.length() == 0) {
                        string = this.context.getString(basicItemInfo.getTitle());
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    } else {
                        string = basicItemInfo.getPluralTitle();
                    }
                    SportRecordShareModel sportRecordShareModel3 = new SportRecordShareModel(null, null, string, null, null, null, false, 123, null);
                    if (choiceDataList != null) {
                        int size4 = choiceDataList.size();
                        for (int i5 = 0; i5 < size4; i5++) {
                            BasicItemInfo basicItemInfo2 = choiceDataList.get(i5);
                            String pluralTitle2 = basicItemInfo2.getPluralTitle();
                            if (pluralTitle2 == null || pluralTitle2.length() == 0) {
                                string2 = this.context.getString(basicItemInfo2.getTitle());
                                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            } else {
                                string2 = basicItemInfo2.getPluralTitle();
                            }
                            if (Intrinsics.areEqual(sportRecordShareModel3.getEditString(), string2)) {
                                sportRecordShareModel3.setSelect(true);
                            }
                        }
                    } else if (i4 == choiceIndex) {
                        sportRecordShareModel3.setSelect(true);
                    }
                    ListExtKt.add(arrayList, sportRecordShareModel3);
                }
                return arrayList;
            case 4:
                List<StickerView> stickerListToShow = SportReportShareExtKt.getStickerListToShow(this.context, sportReport);
                int size5 = stickerListToShow.size();
                while (i < size5) {
                    SportRecordShareModel sportRecordShareModel4 = new SportRecordShareModel(null, null, null, null, stickerListToShow.get(i), null, false, 111, null);
                    if (sportReport != null && (watermarkView = sportRecordShareModel4.getWatermarkView()) != null) {
                        watermarkView.setStickTextValue(sportReport);
                    }
                    if (i == choiceIndex) {
                        sportRecordShareModel4.setSelect(true);
                    }
                    ListExtKt.add(arrayList, sportRecordShareModel4);
                    i++;
                }
                return arrayList;
            case 5:
                List<String> sloganList = SportReportShareExtKt.getSloganList();
                int size6 = sloganList.size();
                while (i < size6) {
                    SportRecordShareModel sportRecordShareModel5 = new SportRecordShareModel(null, null, sloganList.get(i), null, null, null, false, 123, null);
                    if (i == choiceIndex) {
                        sportRecordShareModel5.setSelect(true);
                    }
                    ListExtKt.add(arrayList, sportRecordShareModel5);
                    i++;
                }
                return arrayList;
            case 6:
                if (chartDataList == null) {
                    return arrayList;
                }
                int size7 = chartDataList.size();
                while (i < size7) {
                    SportRecordShareModel sportRecordShareModel6 = new SportRecordShareModel(null, null, getChartStringByType(chartDataList.get(i).intValue()), null, null, null, false, 123, null);
                    if (i == choiceIndex) {
                        sportRecordShareModel6.setSelect(true);
                    }
                    ListExtKt.add(arrayList, sportRecordShareModel6);
                    i++;
                }
                return arrayList;
            default:
                return arrayList;
        }
    }

    @NotNull
    public final List<SportRecordShareModel> changeChoiceBgPosition(@Nullable Integer selectBgPosition) {
        ArrayList arrayList = new ArrayList();
        int i = this.holderType;
        int i2 = 0;
        if (i == 1) {
            List<Uri> allRectangleBgUriList = SportReportShareExtKt.getAllRectangleBgUriList();
            ListExtKt.add(arrayList, new SportRecordShareModel(null, null, null, null, null, null, false, 127, null));
            int size = allRectangleBgUriList.size();
            while (i2 < size) {
                SportRecordShareModel sportRecordShareModel = new SportRecordShareModel(null, allRectangleBgUriList.get(i2), null, null, null, null, false, 125, null);
                if (selectBgPosition == null) {
                    if (i2 == 0) {
                        sportRecordShareModel.setSelect(true);
                    }
                } else if (i2 == selectBgPosition.intValue()) {
                    sportRecordShareModel.setSelect(true);
                }
                ListExtKt.add(arrayList, sportRecordShareModel);
                i2++;
            }
        } else if (i == 2) {
            List<Uri> allSquareBgUriList = SportReportShareExtKt.getAllSquareBgUriList();
            ListExtKt.add(arrayList, new SportRecordShareModel(null, null, null, null, null, null, false, 127, null));
            int size2 = allSquareBgUriList.size();
            while (i2 < size2) {
                SportRecordShareModel sportRecordShareModel2 = new SportRecordShareModel(null, allSquareBgUriList.get(i2), null, null, null, null, false, 125, null);
                if (selectBgPosition == null) {
                    if (i2 == 0) {
                        sportRecordShareModel2.setSelect(true);
                    }
                } else if (i2 == selectBgPosition.intValue()) {
                    sportRecordShareModel2.setSelect(true);
                }
                ListExtKt.add(arrayList, sportRecordShareModel2);
                i2++;
            }
        }
        return arrayList;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final List<SportRecordShareModel> getFirstDataList() {
        return this.firstDataList;
    }

    @NotNull
    public final RecyclerView getFirstView() {
        return this.firstView;
    }

    @NotNull
    public final List<SportRecordShareModel> getSecondDataList() {
        return this.secondDataList;
    }

    public final void initHolder() {
        int i = this.holderType;
        if (i == 1) {
            SportShareEditAdapter sportShareEditAdapter = new SportShareEditAdapter(1);
            this.firstViewAdapter = sportShareEditAdapter;
            sportShareEditAdapter.setRecyclerView(this.firstView);
            SportShareEditAdapter sportShareEditAdapter2 = this.firstViewAdapter;
            if (sportShareEditAdapter2 != null) {
                sportShareEditAdapter2.bindListData(this.firstDataList);
            }
            int i2 = UIUtils.INSTANCE.getScreenState() == 0 ? 1 : 0;
            this.firstView.setLayoutManager(new GridLayoutManager(this.context, i2 == 0 ? 1 : 6, i2, false));
            this.firstView.setAdapter(this.firstViewAdapter);
            this.firstLabel.setVisibility(8);
            return;
        }
        if (i == 2) {
            SportShareEditAdapter sportShareEditAdapter3 = new SportShareEditAdapter(2);
            this.firstViewAdapter = sportShareEditAdapter3;
            sportShareEditAdapter3.setRecyclerView(this.firstView);
            SportShareEditAdapter sportShareEditAdapter4 = this.firstViewAdapter;
            if (sportShareEditAdapter4 != null) {
                sportShareEditAdapter4.bindListData(this.firstDataList);
            }
            this.firstView.setAdapter(this.firstViewAdapter);
            int i3 = UIUtils.INSTANCE.getScreenState() != 0 ? 0 : 1;
            this.firstView.setLayoutManager(new GridLayoutManager(this.context, i3 == 0 ? 2 : 6, i3, false));
            this.firstLabel.setVisibility(8);
            return;
        }
        if (i == 3) {
            this.firstViewAdapter = new SportShareEditAdapter(3);
            this.secondViewAdapter = new SportShareEditAdapter(3);
            SportShareEditAdapter sportShareEditAdapter5 = this.firstViewAdapter;
            if (sportShareEditAdapter5 != null) {
                sportShareEditAdapter5.setRecyclerView(this.firstView);
            }
            SportShareEditAdapter sportShareEditAdapter6 = this.secondViewAdapter;
            if (sportShareEditAdapter6 != null) {
                sportShareEditAdapter6.setRecyclerView(this.secondView);
            }
            SportShareEditAdapter sportShareEditAdapter7 = this.firstViewAdapter;
            if (sportShareEditAdapter7 != null) {
                sportShareEditAdapter7.bindListData(this.firstDataList);
            }
            SportShareEditAdapter sportShareEditAdapter8 = this.secondViewAdapter;
            if (sportShareEditAdapter8 != null) {
                sportShareEditAdapter8.bindListData(this.secondDataList);
            }
            this.firstView.setLayoutManager(SportReportShareExtKt.getLinearOrFlexBoxLayoutManager(this.context));
            this.secondView.setLayoutManager(SportReportShareExtKt.getLinearOrFlexBoxLayoutManager(this.context));
            this.secondView.setAdapter(this.secondViewAdapter);
            this.firstView.setAdapter(this.firstViewAdapter);
            this.secondLabel.setVisibility(0);
            this.secondView.setVisibility(0);
            return;
        }
        if (i == 4) {
            SportShareEditAdapter sportShareEditAdapter9 = new SportShareEditAdapter(4);
            this.firstViewAdapter = sportShareEditAdapter9;
            sportShareEditAdapter9.setRecyclerView(this.firstView);
            List<SportRecordShareModel> listBuiLdlViewItemList$default = buiLdlViewItemList$default(this, null, null, null, null, null, null, 0, 127, null);
            this.firstDataList = listBuiLdlViewItemList$default;
            SportShareEditAdapter sportShareEditAdapter10 = this.firstViewAdapter;
            if (sportShareEditAdapter10 != null) {
                sportShareEditAdapter10.bindListData(listBuiLdlViewItemList$default);
            }
            this.firstView.setAdapter(this.firstViewAdapter);
            this.firstLabel.setVisibility(8);
            return;
        }
        if (i != 5) {
            return;
        }
        this.firstViewAdapter = new SportShareEditAdapter(3);
        this.secondViewAdapter = new SportShareEditAdapter(3);
        SportShareEditAdapter sportShareEditAdapter11 = this.firstViewAdapter;
        if (sportShareEditAdapter11 != null) {
            sportShareEditAdapter11.setRecyclerView(this.firstView);
        }
        SportShareEditAdapter sportShareEditAdapter12 = this.secondViewAdapter;
        if (sportShareEditAdapter12 != null) {
            sportShareEditAdapter12.setRecyclerView(this.secondView);
        }
        SportShareEditAdapter sportShareEditAdapter13 = this.firstViewAdapter;
        if (sportShareEditAdapter13 != null) {
            sportShareEditAdapter13.bindListData(this.firstDataList);
        }
        this.firstView.setLayoutManager(SportReportShareExtKt.getLinearOrFlexBoxLayoutManager(this.context));
        this.secondView.setLayoutManager(SportReportShareExtKt.getLinearOrFlexBoxLayoutManager(this.context));
        SportShareEditAdapter sportShareEditAdapter14 = this.secondViewAdapter;
        if (sportShareEditAdapter14 != null) {
            sportShareEditAdapter14.bindListData(this.secondDataList);
        }
        this.secondView.setAdapter(this.secondViewAdapter);
        this.firstView.setAdapter(this.firstViewAdapter);
        this.firstLabel.setText(this.context.getString(j1j.l7));
        this.secondLabel.setText(this.context.getString(j1j.j7));
        this.secondLabel.setVisibility(0);
        this.secondView.setVisibility(0);
    }

    public final void setFirstDataList(@NotNull List<SportRecordShareModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.firstDataList = list;
    }

    public final void setHolderDataList(@NotNull List<SportRecordShareModel> setList, @NotNull List<SportRecordShareModel> secondList) {
        Intrinsics.checkNotNullParameter(setList, "setList");
        Intrinsics.checkNotNullParameter(secondList, "secondList");
        this.firstDataList = setList;
        if (this.holderType == 4) {
            int i = UIUtils.INSTANCE.getScreenState() == 0 ? 1 : 0;
            ItemDecorationExtKt.clearAllItemDecorations(this.firstView);
            int i2 = 5;
            if (i != 0) {
                this.firstView.addItemDecoration(new GridItemSpace(ExtUtilsKt.getDp(4), ExtUtilsKt.getDp(5), false, 4, null));
            } else {
                i2 = this.firstDataList.size() < 5 ? 1 : 2;
            }
            this.firstView.setLayoutManager(new GridLayoutManager(this.context, i2, i, false));
        }
        this.secondDataList = secondList;
        SportShareEditAdapter sportShareEditAdapter = this.firstViewAdapter;
        if (sportShareEditAdapter != null) {
            sportShareEditAdapter.bindListData(this.firstDataList);
        }
        this.currentDataCount = 0;
        Iterator<SportRecordShareModel> it = this.firstDataList.iterator();
        while (it.hasNext()) {
            if (it.next().isSelect()) {
                this.currentDataCount++;
            }
        }
        SportShareEditAdapter sportShareEditAdapter2 = this.firstViewAdapter;
        if (sportShareEditAdapter2 != null) {
            sportShareEditAdapter2.notifyDataSetChanged();
        }
        SportShareEditAdapter sportShareEditAdapter3 = this.secondViewAdapter;
        if (sportShareEditAdapter3 != null) {
            if (sportShareEditAdapter3 != null) {
                sportShareEditAdapter3.bindListData(this.secondDataList);
            }
            SportShareEditAdapter sportShareEditAdapter4 = this.secondViewAdapter;
            Intrinsics.checkNotNull(sportShareEditAdapter4);
            sportShareEditAdapter4.notifyDataSetChanged();
        }
        if (secondList.isEmpty()) {
            this.secondLabel.setVisibility(8);
        }
    }

    public final void setHolderDataType(int type, int index) {
        this.holderDataType = type;
        if (type != 8 || this.firstDataList.isEmpty()) {
            return;
        }
        this.currentDataCount = 2;
        Iterator<SportRecordShareModel> it = this.firstDataList.iterator();
        while (it.hasNext()) {
            it.next().setSelect(false);
        }
        this.firstDataList.get(index).setSelect(true);
        this.firstDataList.get(0).setSelect(true);
        SportShareEditAdapter sportShareEditAdapter = this.firstViewAdapter;
        if (sportShareEditAdapter != null) {
            sportShareEditAdapter.notifyDataSetChanged();
        }
    }

    public final void setOnItemClickListener(@NotNull final Function3<? super Integer, ? super Integer, ? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        SportShareEditAdapter sportShareEditAdapter = this.firstViewAdapter;
        if (sportShareEditAdapter != null) {
            sportShareEditAdapter.setOnItemClickListener(new SportShareEditAdapter.OnItemClickListener() { // from class: com.xiaomi.fitness.detail.view.SportShareStyleHolder.setOnItemClickListener.1
                @Override // com.xiaomi.fitness.detail.recycler.SportShareEditAdapter.OnItemClickListener
                public void onItemClick(SportRecordShareModel styleItem, int position) {
                    Intrinsics.checkNotNullParameter(styleItem, "styleItem");
                    Logger.i(SportShareStyleHolder.TAG, "setOnItemClickListener position=" + position + " styleItem=" + styleItem + " holderType=" + SportShareStyleHolder.this.holderType);
                    if (SportShareStyleHolder.this.holderType == 2) {
                        Iterator<SportRecordShareModel> it = SportShareStyleHolder.this.getFirstDataList().iterator();
                        while (it.hasNext()) {
                            it.next().setSelect(false);
                        }
                        SportShareStyleHolder.this.getFirstDataList().get(position).setSelect(true);
                        SportShareEditAdapter sportShareEditAdapter2 = SportShareStyleHolder.this.firstViewAdapter;
                        if (sportShareEditAdapter2 != null) {
                            sportShareEditAdapter2.notifyDataSetChanged();
                        }
                        callback.invoke(Integer.valueOf(SportShareStyleHolder.this.holderType), Integer.valueOf(position), Boolean.TRUE);
                        return;
                    }
                    if (SportShareStyleHolder.this.holderType == 1) {
                        Iterator<SportRecordShareModel> it2 = SportShareStyleHolder.this.getFirstDataList().iterator();
                        while (it2.hasNext()) {
                            it2.next().setSelect(false);
                        }
                        SportShareStyleHolder.this.getFirstDataList().get(position).setSelect(true);
                        SportShareEditAdapter sportShareEditAdapter3 = SportShareStyleHolder.this.firstViewAdapter;
                        if (sportShareEditAdapter3 != null) {
                            sportShareEditAdapter3.notifyDataSetChanged();
                        }
                        callback.invoke(Integer.valueOf(SportShareStyleHolder.this.holderType), Integer.valueOf(position), Boolean.TRUE);
                        return;
                    }
                    if (SportShareStyleHolder.this.holderType != 3) {
                        Iterator<SportRecordShareModel> it3 = SportShareStyleHolder.this.getFirstDataList().iterator();
                        while (it3.hasNext()) {
                            it3.next().setSelect(false);
                        }
                        SportShareStyleHolder.this.getFirstDataList().get(position).setSelect(true);
                        SportShareEditAdapter sportShareEditAdapter4 = SportShareStyleHolder.this.firstViewAdapter;
                        if (sportShareEditAdapter4 != null) {
                            sportShareEditAdapter4.notifyDataSetChanged();
                        }
                        callback.invoke(Integer.valueOf(SportShareStyleHolder.this.holderType), Integer.valueOf(position), Boolean.TRUE);
                        return;
                    }
                    if (SportShareStyleHolder.this.holderDataType != 3) {
                        if (SportShareStyleHolder.this.holderDataType == 8) {
                            if (position == 0) {
                                ToastUtil.showToast(ResourceExtKt.getString(j1j.J0));
                                return;
                            }
                            if (SportShareStyleHolder.this.getFirstDataList().isEmpty()) {
                                return;
                            }
                            SportShareStyleHolder.this.currentDataCount = 2;
                            Iterator<SportRecordShareModel> it4 = SportShareStyleHolder.this.getFirstDataList().iterator();
                            while (it4.hasNext()) {
                                it4.next().setSelect(false);
                            }
                            SportShareStyleHolder.this.getFirstDataList().get(0).setSelect(true);
                            SportShareStyleHolder.this.getFirstDataList().get(position).setSelect(true);
                            SportShareEditAdapter sportShareEditAdapter5 = SportShareStyleHolder.this.firstViewAdapter;
                            if (sportShareEditAdapter5 != null) {
                                sportShareEditAdapter5.notifyDataSetChanged();
                            }
                            callback.invoke(Integer.valueOf(SportShareStyleHolder.this.holderDataType), Integer.valueOf(position), Boolean.TRUE);
                            return;
                        }
                        return;
                    }
                    if (position == 0) {
                        ToastUtil.showToast(ResourceExtKt.getString(j1j.J0));
                        return;
                    }
                    boolean z = !SportShareStyleHolder.this.getFirstDataList().get(position).isSelect();
                    if (z) {
                        if (SportShareStyleHolder.this.currentDataCount >= 7) {
                            ToastUtil.showToast(ResourceExtKt.getString(j1j.K0));
                            return;
                        } else {
                            SportShareStyleHolder.this.currentDataCount++;
                        }
                    } else if (SportShareStyleHolder.this.currentDataCount <= 3) {
                        ToastUtil.showToast(ResourceExtKt.getString(j1j.L0));
                        return;
                    } else {
                        SportShareStyleHolder.this.currentDataCount--;
                    }
                    SportShareStyleHolder.this.getFirstDataList().get(position).setSelect(z);
                    SportShareEditAdapter sportShareEditAdapter6 = SportShareStyleHolder.this.firstViewAdapter;
                    if (sportShareEditAdapter6 != null) {
                        sportShareEditAdapter6.notifyDataSetChanged();
                    }
                    callback.invoke(Integer.valueOf(SportShareStyleHolder.this.holderType), Integer.valueOf(position), Boolean.valueOf(SportShareStyleHolder.this.getFirstDataList().get(position).isSelect()));
                }
            });
        }
    }

    public final void setOnItemStringClickListener(@NotNull final Function3<? super Integer, ? super Integer, ? super Boolean, Unit> callback, final int holderType) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        SportShareEditAdapter sportShareEditAdapter = this.secondViewAdapter;
        if (sportShareEditAdapter != null) {
            sportShareEditAdapter.setOnItemClickListener(new SportShareEditAdapter.OnItemClickListener() { // from class: com.xiaomi.fitness.detail.view.SportShareStyleHolder.setOnItemStringClickListener.1
                @Override // com.xiaomi.fitness.detail.recycler.SportShareEditAdapter.OnItemClickListener
                public void onItemClick(SportRecordShareModel styleItem, int position) {
                    Intrinsics.checkNotNullParameter(styleItem, "styleItem");
                    Iterator<SportRecordShareModel> it = SportShareStyleHolder.this.getSecondDataList().iterator();
                    while (it.hasNext()) {
                        it.next().setSelect(false);
                    }
                    SportShareStyleHolder.this.getSecondDataList().get(position).setSelect(true);
                    SportShareEditAdapter sportShareEditAdapter2 = SportShareStyleHolder.this.secondViewAdapter;
                    if (sportShareEditAdapter2 != null) {
                        sportShareEditAdapter2.notifyDataSetChanged();
                    }
                    callback.invoke(Integer.valueOf(holderType), Integer.valueOf(position), Boolean.TRUE);
                }
            });
        }
    }

    public final void setSecondDataList(@NotNull List<SportRecordShareModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.secondDataList = list;
    }
}
