package com.xiaomi.fitness.share.report;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.SportReportKey;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.detail.data.BasicItemInfo;
import com.xiaomi.fitness.detail.model.SportsReportOperationalCourseData;
import com.xiaomi.fitness.detail.model.SportsReportOperationalCourseTrainSummary;
import com.xiaomi.fitness.detail.util.SportDetailUtil;
import com.xiaomi.fitness.detail.view.SportShareEditView;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.share.report.EditSportReportCustomShareActivity;
import com.xiaomi.fitness.share.report.adapter.BottomWindowAdapter;
import com.xiaomi.fitness.share.report.holder.EditCustomTabLayoutHolder;
import com.xiaomi.fitness.share.report.viewmodel.SportReportShareViewModel;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.byi;
import defpackage.dki;
import defpackage.gpp;
import defpackage.ivi;
import defpackage.j1j;
import defpackage.nuf;
import defpackage.o5o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 A2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001AB\u0007¢\u0006\u0004\b@\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0006J\u0019\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u0006R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010%\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001c\u00104\u001a\b\u0012\u0004\u0012\u0002030\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u00106\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00105R\u001a\u00108\u001a\b\u0012\u0004\u0012\u0002070\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00105R\u0016\u00109\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010=\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010<¨\u0006B"}, d2 = {"Lcom/xiaomi/fitness/share/report/EditSportReportCustomShareActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/share/report/viewmodel/SportReportShareViewModel;", "Lgpp;", "", "setUpBasicUi", "()V", "handleBackAction", "initEditViewTabListener", "", "position", "getTabPosition", "(I)I", "initEditViewDataListener", "initEditViewData", "", "getChartDataList", "()Ljava/util/List;", "listenOnBottomWindowIndicator", "initCustomTabLayoutHolder", "initParams", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "sportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "Lcom/google/android/material/tabs/TabLayout;", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "getTabLayout", "()Lcom/google/android/material/tabs/TabLayout;", "setTabLayout", "(Lcom/google/android/material/tabs/TabLayout;)V", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "getViewPager", "()Landroidx/viewpager2/widget/ViewPager2;", "setViewPager", "(Landroidx/viewpager2/widget/ViewPager2;)V", "bgPosition", "I", "Lcom/xiaomi/fitness/detail/view/SportShareEditView;", "editView", "Lcom/xiaomi/fitness/detail/view/SportShareEditView;", "Lcom/xiaomi/fitness/share/report/holder/EditCustomTabLayoutHolder;", "editCustomTabLayoutHolder", "Lcom/xiaomi/fitness/share/report/holder/EditCustomTabLayoutHolder;", "Lcom/xiaomi/fitness/detail/data/BasicItemInfo;", "sportAllDataList", "Ljava/util/List;", "chartDataList", "", "sportShareSloganList", "timeStr", "Ljava/lang/String;", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nEditSportReportCustomShareActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditSportReportCustomShareActivity.kt\ncom/xiaomi/fitness/share/report/EditSportReportCustomShareActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,533:1\n1#2:534\n*E\n"})
public final class EditSportReportCustomShareActivity extends Hilt_EditSportReportCustomShareActivity<SportReportShareViewModel, gpp> {

    @NotNull
    public static final String TAG = "EditSportReportCustomShareActivity";
    public static final int editBackgroundType = 0;
    public static final int editDataType = 1;
    public static final int editSloganType = 3;
    public static final int editStickerType = 2;
    private int bgPosition;

    @Nullable
    private EditCustomTabLayoutHolder editCustomTabLayoutHolder;
    private SportShareEditView editView;

    @Nullable
    private SportBasicReport sportReport;
    public TabLayout tabLayout;
    public ViewPager2 viewPager;

    @NotNull
    private List<BasicItemInfo> sportAllDataList = new ArrayList();

    @NotNull
    private List<Integer> chartDataList = new ArrayList();

    @NotNull
    private final List<String> sportShareSloganList = SportReportShareExtKt.getSloganList();

    @NotNull
    private String timeStr = "";

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ SportReportShareViewModel access$getMViewModel(EditSportReportCustomShareActivity editSportReportCustomShareActivity) {
        return (SportReportShareViewModel) editSportReportCustomShareActivity.getMViewModel();
    }

    private final List<Integer> getChartDataList() {
        List<SportRecordItem> listI;
        ArrayList arrayList = new ArrayList();
        List<Location> listB = o5o.e().b();
        if (listB != null && (!listB.isEmpty())) {
            ListExtKt.add(arrayList, 0);
        }
        List<SportRecordItem> listG = o5o.e().g();
        if (listG != null && (!listG.isEmpty())) {
            ListExtKt.add(arrayList, 1);
        }
        List<SportRecordItem> listF = o5o.e().f();
        if ((listF != null && (!listF.isEmpty())) || ((listI = o5o.e().i()) != null && (!listI.isEmpty()))) {
            ListExtKt.add(arrayList, 3);
        }
        List<SportRecordItem> listH = o5o.e().h();
        if (listH != null && (!listH.isEmpty())) {
            ListExtKt.add(arrayList, 2);
        }
        List<SportRecordItem> listD = o5o.e().d();
        if (listD != null && (!listD.isEmpty())) {
            ListExtKt.add(arrayList, 4);
        }
        return arrayList;
    }

    private final int getTabPosition(int position) {
        if (position == 0) {
            return 3;
        }
        if (position != 1) {
            if (position == 2 || position == 3) {
                return 1;
            }
            if (position != 4) {
                return position != 5 ? 0 : 3;
            }
        }
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void handleBackAction() {
        Integer value = ((SportReportShareViewModel) getMViewModel()).getEditModeLiveData().getValue();
        Logger.i(TAG, "handleBackAction curtEditMode=" + value);
        if (value != null && value.intValue() == 0) {
            super.lambda$onCreate$0();
        } else if (value != null && value.intValue() == 1) {
            ((SportReportShareViewModel) getMViewModel()).getEditModeLiveData().setValue(0);
        } else {
            super.lambda$onCreate$0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initCustomTabLayoutHolder() {
        gpp gppVar = (gpp) getMBinding();
        SportReportShareViewModel sportReportShareViewModel = (SportReportShareViewModel) getMViewModel();
        ImageView tabBg = ((gpp) getMBinding()).G;
        Intrinsics.checkNotNullExpressionValue(tabBg, "tabBg");
        TabLayout tabLayout = getTabLayout();
        ViewPager2 viewPager = getViewPager();
        SportBasicReport sportBasicReport = this.sportReport;
        Intrinsics.checkNotNull(sportBasicReport);
        Integer value = ((SportReportShareViewModel) getMViewModel()).getBgSelectedPositionLiveData().getValue();
        int iIntValue = value != null ? value.intValue() : 1;
        TextView previewTv = ((gpp) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(previewTv, "previewTv");
        SportShareEditView sportRecordEditView = ((gpp) getMBinding()).F;
        Intrinsics.checkNotNullExpressionValue(sportRecordEditView, "sportRecordEditView");
        RecyclerView bottomWindowRecycler = ((gpp) getMBinding()).C;
        Intrinsics.checkNotNullExpressionValue(bottomWindowRecycler, "bottomWindowRecycler");
        View sharePanel = ((gpp) getMBinding()).E;
        Intrinsics.checkNotNullExpressionValue(sharePanel, "sharePanel");
        SportShareEditView sportShareEditView = this.editView;
        if (sportShareEditView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editView");
            sportShareEditView = null;
        }
        TextView confirmTextView = sportShareEditView.getConfirmTextView();
        ConstraintLayout viewPagerContainer = ((gpp) getMBinding()).J;
        Intrinsics.checkNotNullExpressionValue(viewPagerContainer, "viewPagerContainer");
        EditCustomTabLayoutHolder editCustomTabLayoutHolder = new EditCustomTabLayoutHolder(this, gppVar, sportReportShareViewModel, tabBg, tabLayout, viewPager, sportBasicReport, iIntValue, previewTv, sportRecordEditView, bottomWindowRecycler, sharePanel, confirmTextView, viewPagerContainer);
        this.editCustomTabLayoutHolder = editCustomTabLayoutHolder;
        editCustomTabLayoutHolder.initHolder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initEditViewData() {
        SportDetailUtil sportDetailUtil = SportDetailUtil.INSTANCE;
        SportBasicReport sportBasicReport = this.sportReport;
        Intrinsics.checkNotNull(sportBasicReport);
        SportBasicReport sportBasicReport2 = this.sportReport;
        Intrinsics.checkNotNull(sportBasicReport2);
        this.sportAllDataList = sportDetailUtil.initBasicList(sportBasicReport, sportBasicReport2.getSportType(), true);
        if (((SportReportShareViewModel) getMViewModel()).getSportShowDataList().isEmpty()) {
            SportBasicReport sportBasicReport3 = this.sportReport;
            Intrinsics.checkNotNull(sportBasicReport3);
            SportBasicReport sportBasicReport4 = this.sportReport;
            Intrinsics.checkNotNull(sportBasicReport4);
            List<BasicItemInfo> listInitBasicList = sportDetailUtil.initBasicList(sportBasicReport3, sportBasicReport4.getSportType(), true);
            SportReportShareViewModel sportReportShareViewModel = (SportReportShareViewModel) getMViewModel();
            if (listInitBasicList.size() > 3) {
                listInitBasicList = listInitBasicList.subList(0, 3);
            }
            sportReportShareViewModel.setSportShowDataList(listInitBasicList);
        }
        if (((SportReportShareViewModel) getMViewModel()).getSloganDataModelInfo() == null) {
            ((SportReportShareViewModel) getMViewModel()).setSloganDataModelInfo(this.sportAllDataList.get(0));
        }
        this.chartDataList = getChartDataList();
        Integer currentEditBgPosition = ((SportReportShareViewModel) getMViewModel()).getCurrentEditBgPosition();
        SportShareEditView sportShareEditView = null;
        if (currentEditBgPosition != null) {
            int iIntValue = currentEditBgPosition.intValue();
            SportShareEditView sportShareEditView2 = this.editView;
            if (sportShareEditView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("editView");
                sportShareEditView2 = null;
            }
            sportShareEditView2.setEditType(1, iIntValue);
        }
        SportShareEditView sportShareEditView3 = this.editView;
        if (sportShareEditView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editView");
            sportShareEditView3 = null;
        }
        sportShareEditView3.setEditPanelDataTabIsSelectedLiveData(((SportReportShareViewModel) getMViewModel()).getEditPanelDataTabIsSelected());
        SportShareEditView sportShareEditView4 = this.editView;
        if (sportShareEditView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editView");
            sportShareEditView4 = null;
        }
        sportShareEditView4.setSelectedBgPosition(((SportReportShareViewModel) getMViewModel()).getBgSelectedPositionLiveData());
        SportShareEditView sportShareEditView5 = this.editView;
        if (sportShareEditView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editView");
            sportShareEditView5 = null;
        }
        sportShareEditView5.setBackgroundViewList();
        SportShareEditView sportShareEditView6 = this.editView;
        if (sportShareEditView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editView");
            sportShareEditView6 = null;
        }
        SportBasicReport sportBasicReport5 = this.sportReport;
        Intrinsics.checkNotNull(sportBasicReport5);
        sportShareEditView6.setDataViewList(sportBasicReport5, this.sportAllDataList, this.chartDataList, ((SportReportShareViewModel) getMViewModel()).getSportShowDataList());
        SportShareEditView sportShareEditView7 = this.editView;
        if (sportShareEditView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editView");
            sportShareEditView7 = null;
        }
        SportBasicReport sportBasicReport6 = this.sportReport;
        Intrinsics.checkNotNull(sportBasicReport6);
        sportShareEditView7.setSloganList(sportBasicReport6, this.sportAllDataList, ((SportReportShareViewModel) getMViewModel()).getSloganTxtIndex(), ((SportReportShareViewModel) getMViewModel()).getSloganDataIndex());
        SportShareEditView sportShareEditView8 = this.editView;
        if (sportShareEditView8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editView");
        } else {
            sportShareEditView = sportShareEditView8;
        }
        SportBasicReport sportBasicReport7 = this.sportReport;
        Intrinsics.checkNotNull(sportBasicReport7);
        sportShareEditView.setWatermarkList(sportBasicReport7, ((SportReportShareViewModel) getMViewModel()).getCurrentStickerViewPosition());
    }

    private final void initEditViewDataListener() {
        SportShareEditView sportShareEditView = this.editView;
        if (sportShareEditView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editView");
            sportShareEditView = null;
        }
        sportShareEditView.setOnBackgroundItemClickCallback(new Function3() { // from class: n28
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return EditSportReportCustomShareActivity.initEditViewDataListener$lambda$3(this.f27469a, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Boolean) obj3).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initEditViewDataListener$lambda$3(EditSportReportCustomShareActivity this$0, int i, int i2, boolean z) {
        EditCustomTabLayoutHolder editCustomTabLayoutHolder;
        EditCustomTabLayoutHolder editCustomTabLayoutHolder2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        switch (i) {
            case 1:
                if (i2 > 0) {
                    ((SportReportShareViewModel) this$0.getMViewModel()).setCurrentEditBgPosition(Integer.valueOf(i2 - 1));
                }
                EditCustomTabLayoutHolder editCustomTabLayoutHolder3 = this$0.editCustomTabLayoutHolder;
                if (editCustomTabLayoutHolder3 != null) {
                    editCustomTabLayoutHolder3.refreshRectangleBg(i2);
                }
                break;
            case 2:
                if (i2 > 0) {
                    ((SportReportShareViewModel) this$0.getMViewModel()).setCurrentEditBgPosition(Integer.valueOf(i2 - 1));
                }
                EditCustomTabLayoutHolder editCustomTabLayoutHolder4 = this$0.editCustomTabLayoutHolder;
                if (editCustomTabLayoutHolder4 != null) {
                    editCustomTabLayoutHolder4.refreshSquareBg(i2);
                }
                break;
            case 3:
                if (z) {
                    ListExtKt.add(((SportReportShareViewModel) this$0.getMViewModel()).getSportShowDataList(), this$0.sportAllDataList.get(i2));
                } else {
                    int iIndexOf = ((SportReportShareViewModel) this$0.getMViewModel()).getSportShowDataList().indexOf(this$0.sportAllDataList.get(i2));
                    if (((SportReportShareViewModel) this$0.getMViewModel()).getSportShowDataList().size() > 1 && iIndexOf >= 0 && iIndexOf < ((SportReportShareViewModel) this$0.getMViewModel()).getSportShowDataList().size()) {
                        ListExtKt.remove(((SportReportShareViewModel) this$0.getMViewModel()).getSportShowDataList(), iIndexOf);
                    }
                }
                Logger.i(TAG, "sportShowDataList=" + ((SportReportShareViewModel) this$0.getMViewModel()).getSportShowDataList() + " typeId=" + i + " choicePosition=" + i2 + " isSelected=" + z);
                EditCustomTabLayoutHolder editCustomTabLayoutHolder5 = this$0.editCustomTabLayoutHolder;
                if (editCustomTabLayoutHolder5 != null) {
                    editCustomTabLayoutHolder5.showDataList(((SportReportShareViewModel) this$0.getMViewModel()).getSportShowDataList());
                }
                break;
            case 4:
                ((SportReportShareViewModel) this$0.getMViewModel()).setCurrentStickerViewPosition(i2);
                if (this$0.getTabLayout().getSelectedTabPosition() != 0) {
                    EditCustomTabLayoutHolder editCustomTabLayoutHolder6 = this$0.editCustomTabLayoutHolder;
                    if (editCustomTabLayoutHolder6 != null) {
                        editCustomTabLayoutHolder6.setStickerView(((SportReportShareViewModel) this$0.getMViewModel()).getCurrentStickerViewPosition());
                    }
                } else {
                    EditCustomTabLayoutHolder editCustomTabLayoutHolder7 = this$0.editCustomTabLayoutHolder;
                    if (editCustomTabLayoutHolder7 != null) {
                        editCustomTabLayoutHolder7.setStickerView(((SportReportShareViewModel) this$0.getMViewModel()).getCurrentStickerViewPosition());
                    }
                }
                break;
            case 5:
                ((SportReportShareViewModel) this$0.getMViewModel()).setSloganTxtIndex(i2);
                ((SportReportShareViewModel) this$0.getMViewModel()).setSlogValueTxt(this$0.sportShareSloganList.get(i2));
                EditCustomTabLayoutHolder editCustomTabLayoutHolder8 = this$0.editCustomTabLayoutHolder;
                if (editCustomTabLayoutHolder8 != null) {
                    editCustomTabLayoutHolder8.updateSloganTxt(((SportReportShareViewModel) this$0.getMViewModel()).getSlogValueTxt());
                }
                break;
            case 6:
                ((SportReportShareViewModel) this$0.getMViewModel()).setChartDataPosition(i2);
                EditCustomTabLayoutHolder editCustomTabLayoutHolder9 = this$0.editCustomTabLayoutHolder;
                if (editCustomTabLayoutHolder9 != null) {
                    editCustomTabLayoutHolder9.changeLineChartType(this$0.chartDataList.get(((SportReportShareViewModel) this$0.getMViewModel()).getChartDataPosition()).intValue());
                }
                break;
            case 7:
                ((SportReportShareViewModel) this$0.getMViewModel()).setSloganDataIndex(i2);
                ((SportReportShareViewModel) this$0.getMViewModel()).setSloganDataModelInfo(this$0.sportAllDataList.get(i2));
                if (((SportReportShareViewModel) this$0.getMViewModel()).getSloganDataModelInfo() != null && (editCustomTabLayoutHolder = this$0.editCustomTabLayoutHolder) != null) {
                    BasicItemInfo sloganDataModelInfo = ((SportReportShareViewModel) this$0.getMViewModel()).getSloganDataModelInfo();
                    Intrinsics.checkNotNull(sloganDataModelInfo);
                    editCustomTabLayoutHolder.updateSportTxt(sloganDataModelInfo);
                }
                break;
            case 8:
                if (((SportReportShareViewModel) this$0.getMViewModel()).getSportShowDataList().size() > 1) {
                    ListExtKt.remove(((SportReportShareViewModel) this$0.getMViewModel()).getSportShowDataList(), 1);
                }
                ListExtKt.add(((SportReportShareViewModel) this$0.getMViewModel()).getSportShowDataList(), this$0.sportAllDataList.get(i2));
                int size = this$0.chartDataList.size();
                int chartDataPosition = ((SportReportShareViewModel) this$0.getMViewModel()).getChartDataPosition();
                int iIntValue = (chartDataPosition < 0 || chartDataPosition >= size) ? 0 : this$0.chartDataList.get(((SportReportShareViewModel) this$0.getMViewModel()).getChartDataPosition()).intValue();
                Integer currentEditType = ((SportReportShareViewModel) this$0.getMViewModel()).getCurrentEditType();
                if (currentEditType != null && currentEditType.intValue() == 1 && (editCustomTabLayoutHolder2 = this$0.editCustomTabLayoutHolder) != null) {
                    editCustomTabLayoutHolder2.showWhiteBottomTab(true, ((SportReportShareViewModel) this$0.getMViewModel()).getSportShowDataList(), iIntValue);
                }
                break;
        }
        Logger.i("BackgroundItemClickCallback choicePosition " + i2 + "  typeId  " + i, new Object[0]);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initEditViewTabListener() {
        SportShareEditView sportShareEditView = this.editView;
        SportShareEditView sportShareEditView2 = null;
        if (sportShareEditView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editView");
            sportShareEditView = null;
        }
        sportShareEditView.setTabLayoutCallBack(new SportShareEditView.OnTabLayoutClickListener() { // from class: com.xiaomi.fitness.share.report.EditSportReportCustomShareActivity.initEditViewTabListener.1
            @Override // com.xiaomi.fitness.detail.view.SportShareEditView.OnTabLayoutClickListener
            public void onTabLayoutClick(int position) {
                EditCustomTabLayoutHolder editCustomTabLayoutHolder;
                if (position == 0) {
                    EditSportReportCustomShareActivity.access$getMViewModel(EditSportReportCustomShareActivity.this).setCurrentEditType(0);
                    return;
                }
                if (position == 1) {
                    EditSportReportCustomShareActivity.access$getMViewModel(EditSportReportCustomShareActivity.this).setCurrentEditType(1);
                    EditCustomTabLayoutHolder editCustomTabLayoutHolder2 = EditSportReportCustomShareActivity.this.editCustomTabLayoutHolder;
                    if (editCustomTabLayoutHolder2 != null) {
                        editCustomTabLayoutHolder2.showDataList(EditSportReportCustomShareActivity.access$getMViewModel(EditSportReportCustomShareActivity.this).getSportShowDataList());
                    }
                    int size = EditSportReportCustomShareActivity.this.chartDataList.size();
                    int chartDataPosition = EditSportReportCustomShareActivity.access$getMViewModel(EditSportReportCustomShareActivity.this).getChartDataPosition();
                    if (chartDataPosition < 0 || chartDataPosition >= size || (editCustomTabLayoutHolder = EditSportReportCustomShareActivity.this.editCustomTabLayoutHolder) == null) {
                        return;
                    }
                    editCustomTabLayoutHolder.changeLineChartType(((Number) EditSportReportCustomShareActivity.this.chartDataList.get(EditSportReportCustomShareActivity.access$getMViewModel(EditSportReportCustomShareActivity.this).getChartDataPosition())).intValue());
                    return;
                }
                if (position == 2) {
                    EditSportReportCustomShareActivity.access$getMViewModel(EditSportReportCustomShareActivity.this).setCurrentEditType(2);
                    if (EditSportReportCustomShareActivity.this.getTabLayout().getSelectedTabPosition() == 0) {
                        EditCustomTabLayoutHolder editCustomTabLayoutHolder3 = EditSportReportCustomShareActivity.this.editCustomTabLayoutHolder;
                        if (editCustomTabLayoutHolder3 != null) {
                            editCustomTabLayoutHolder3.setStickerView(EditSportReportCustomShareActivity.access$getMViewModel(EditSportReportCustomShareActivity.this).getCurrentStickerViewPosition());
                            return;
                        }
                        return;
                    }
                    EditCustomTabLayoutHolder editCustomTabLayoutHolder4 = EditSportReportCustomShareActivity.this.editCustomTabLayoutHolder;
                    if (editCustomTabLayoutHolder4 != null) {
                        editCustomTabLayoutHolder4.setStickerView(EditSportReportCustomShareActivity.access$getMViewModel(EditSportReportCustomShareActivity.this).getCurrentStickerViewPosition());
                        return;
                    }
                    return;
                }
                if (position != 3) {
                    return;
                }
                EditSportReportCustomShareActivity.access$getMViewModel(EditSportReportCustomShareActivity.this).setCurrentEditType(3);
                if (EditSportReportCustomShareActivity.access$getMViewModel(EditSportReportCustomShareActivity.this).getSloganDataModelInfo() != null) {
                    SportBasicReport sportBasicReport = EditSportReportCustomShareActivity.this.sportReport;
                    if ((sportBasicReport != null ? Long.valueOf(sportBasicReport.getTimeStamp()) : null) != null) {
                        EditSportReportCustomShareActivity editSportReportCustomShareActivity = EditSportReportCustomShareActivity.this;
                        SportBasicReport sportBasicReport2 = editSportReportCustomShareActivity.sportReport;
                        Long lValueOf = sportBasicReport2 != null ? Long.valueOf(sportBasicReport2.getTimeStamp()) : null;
                        Intrinsics.checkNotNull(lValueOf);
                        editSportReportCustomShareActivity.timeStr = TimeDateUtil.getDateYYYYMMDDLocalFormat(lValueOf.longValue());
                        EditCustomTabLayoutHolder editCustomTabLayoutHolder5 = EditSportReportCustomShareActivity.this.editCustomTabLayoutHolder;
                        if (editCustomTabLayoutHolder5 != null) {
                            String slogValueTxt = EditSportReportCustomShareActivity.access$getMViewModel(EditSportReportCustomShareActivity.this).getSlogValueTxt();
                            String str = EditSportReportCustomShareActivity.this.timeStr;
                            BasicItemInfo sloganDataModelInfo = EditSportReportCustomShareActivity.access$getMViewModel(EditSportReportCustomShareActivity.this).getSloganDataModelInfo();
                            Intrinsics.checkNotNull(sloganDataModelInfo);
                            editCustomTabLayoutHolder5.showSloganView(slogValueTxt, str, sloganDataModelInfo);
                        }
                    }
                }
            }
        });
        SportShareEditView sportShareEditView3 = this.editView;
        if (sportShareEditView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editView");
        } else {
            sportShareEditView2 = sportShareEditView3;
        }
        Integer currentEditType = ((SportReportShareViewModel) getMViewModel()).getCurrentEditType();
        sportShareEditView2.setChoiceTab(currentEditType != null ? currentEditType.intValue() : 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initParams() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }
        Serializable serializable = extras.getSerializable("sport_report");
        Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.xiaomi.fit.data.common.data.sport.SportBasicReport");
        SportBasicReport sportBasicReport = (SportBasicReport) serializable;
        this.sportReport = sportBasicReport;
        Logger.i(TAG, "initParams sportReport=" + sportBasicReport);
        this.bgPosition = extras.getInt(SportRecordBundleKey.BUNDLE_PARAM_REPORT_SHARE_CUSTOMIZED_BG_INDEX);
        ((SportReportShareViewModel) getMViewModel()).getEditRatioTypeIsSquareLiveData().setValue(Boolean.valueOf(this.bgPosition == 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void listenOnBottomWindowIndicator() {
        ((SportReportShareViewModel) getMViewModel()).getEditPanelDataTabIsSelected().observe(this, new EditSportReportCustomShareActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: o28
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EditSportReportCustomShareActivity.listenOnBottomWindowIndicator$lambda$5(this.f28664a, (Boolean) obj);
            }
        }));
        ((SportReportShareViewModel) getMViewModel()).getEditRatioTypeIsSquareLiveData().observe(this, new EditSportReportCustomShareActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: p28
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EditSportReportCustomShareActivity.listenOnBottomWindowIndicator$lambda$8(this.f29930a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit listenOnBottomWindowIndicator$lambda$5(EditSportReportCustomShareActivity this$0, Boolean bool) {
        EditCustomTabLayoutHolder editCustomTabLayoutHolder;
        Integer value;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int iIntValue = 0;
        boolean z = bool.booleanValue() && (value = ((SportReportShareViewModel) this$0.getMViewModel()).getSquareBottomWindowPatternSelectedPosition().getValue()) != null && value.intValue() == 0 && this$0.getTabLayout().getSelectedTabPosition() == 1;
        SportShareEditView sportShareEditView = null;
        if (z && (!((SportReportShareViewModel) this$0.getMViewModel()).getSportShowDataList().isEmpty())) {
            ((SportReportShareViewModel) this$0.getMViewModel()).setSportShowDataList(((SportReportShareViewModel) this$0.getMViewModel()).getSportShowDataList().subList(0, 2));
        } else if (((SportReportShareViewModel) this$0.getMViewModel()).getSportShowDataList().size() == 2) {
            if (this$0.sportAllDataList.indexOf(((SportReportShareViewModel) this$0.getMViewModel()).getSportShowDataList().get(1)) > 1) {
                ListExtKt.add(((SportReportShareViewModel) this$0.getMViewModel()).getSportShowDataList(), 1, this$0.sportAllDataList.get(1));
            } else if (this$0.sportAllDataList.size() > 2) {
                ListExtKt.add(((SportReportShareViewModel) this$0.getMViewModel()).getSportShowDataList(), this$0.sportAllDataList.get(2));
            }
            SportShareEditView sportShareEditView2 = this$0.editView;
            if (sportShareEditView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("editView");
                sportShareEditView2 = null;
            }
            SportBasicReport sportBasicReport = this$0.sportReport;
            Intrinsics.checkNotNull(sportBasicReport);
            sportShareEditView2.setDataViewList(sportBasicReport, this$0.sportAllDataList, this$0.chartDataList, ((SportReportShareViewModel) this$0.getMViewModel()).getSportShowDataList());
        }
        int i = z ? 8 : 3;
        int iIndexOf = this$0.sportAllDataList.indexOf(((SportReportShareViewModel) this$0.getMViewModel()).getSportShowDataList().get(1));
        SportShareEditView sportShareEditView3 = this$0.editView;
        if (sportShareEditView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editView");
        } else {
            sportShareEditView = sportShareEditView3;
        }
        sportShareEditView.setDataEditType(i, iIndexOf);
        int size = this$0.chartDataList.size();
        int chartDataPosition = ((SportReportShareViewModel) this$0.getMViewModel()).getChartDataPosition();
        if (chartDataPosition >= 0 && chartDataPosition < size) {
            iIntValue = this$0.chartDataList.get(((SportReportShareViewModel) this$0.getMViewModel()).getChartDataPosition()).intValue();
        }
        Integer currentEditType = ((SportReportShareViewModel) this$0.getMViewModel()).getCurrentEditType();
        if (currentEditType != null && currentEditType.intValue() == 1 && (editCustomTabLayoutHolder = this$0.editCustomTabLayoutHolder) != null) {
            editCustomTabLayoutHolder.showWhiteBottomTab(z, ((SportReportShareViewModel) this$0.getMViewModel()).getSportShowDataList(), iIntValue);
        }
        if (bool.booleanValue() && Intrinsics.areEqual(((SportReportShareViewModel) this$0.getMViewModel()).getEditRatioTypeIsSquareLiveData().getValue(), Boolean.TRUE)) {
            RecyclerView bottomWindowRecycler = ((gpp) this$0.getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(bottomWindowRecycler, "bottomWindowRecycler");
            ViewExtKt.visible(bottomWindowRecycler);
        } else {
            RecyclerView bottomWindowRecycler2 = ((gpp) this$0.getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(bottomWindowRecycler2, "bottomWindowRecycler");
            ViewExtKt.gone(bottomWindowRecycler2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit listenOnBottomWindowIndicator$lambda$8(EditSportReportCustomShareActivity this$0, Boolean bool) {
        EditCustomTabLayoutHolder editCustomTabLayoutHolder;
        Integer value;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Boolean value2 = ((SportReportShareViewModel) this$0.getMViewModel()).getEditPanelDataTabIsSelected().getValue();
        Boolean bool2 = Boolean.TRUE;
        int iIntValue = 0;
        boolean z = Intrinsics.areEqual(value2, bool2) && (value = ((SportReportShareViewModel) this$0.getMViewModel()).getSquareBottomWindowPatternSelectedPosition().getValue()) != null && value.intValue() == 0 && this$0.getTabLayout().getSelectedTabPosition() == 1;
        SportShareEditView sportShareEditView = null;
        if (z) {
            ((SportReportShareViewModel) this$0.getMViewModel()).setSportShowDataList(((SportReportShareViewModel) this$0.getMViewModel()).getSportShowDataList().subList(0, 2));
        } else if (((SportReportShareViewModel) this$0.getMViewModel()).getSportShowDataList().size() == 2) {
            if (this$0.sportAllDataList.indexOf(((SportReportShareViewModel) this$0.getMViewModel()).getSportShowDataList().get(1)) > 1) {
                ListExtKt.add(((SportReportShareViewModel) this$0.getMViewModel()).getSportShowDataList(), 1, this$0.sportAllDataList.get(1));
            } else if (this$0.sportAllDataList.size() > 2) {
                ListExtKt.add(((SportReportShareViewModel) this$0.getMViewModel()).getSportShowDataList(), this$0.sportAllDataList.get(2));
            }
            SportShareEditView sportShareEditView2 = this$0.editView;
            if (sportShareEditView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("editView");
                sportShareEditView2 = null;
            }
            SportBasicReport sportBasicReport = this$0.sportReport;
            Intrinsics.checkNotNull(sportBasicReport);
            sportShareEditView2.setDataViewList(sportBasicReport, this$0.sportAllDataList, this$0.chartDataList, ((SportReportShareViewModel) this$0.getMViewModel()).getSportShowDataList());
            EditCustomTabLayoutHolder editCustomTabLayoutHolder2 = this$0.editCustomTabLayoutHolder;
            if (editCustomTabLayoutHolder2 != null) {
                editCustomTabLayoutHolder2.showDataList(((SportReportShareViewModel) this$0.getMViewModel()).getSportShowDataList());
            }
        }
        int i = z ? 8 : 3;
        int iIndexOf = this$0.sportAllDataList.indexOf(((SportReportShareViewModel) this$0.getMViewModel()).getSportShowDataList().get(1));
        SportShareEditView sportShareEditView3 = this$0.editView;
        if (sportShareEditView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("editView");
            sportShareEditView3 = null;
        }
        sportShareEditView3.setDataEditType(i, iIndexOf);
        if (bool.booleanValue()) {
            Integer currentEditBgPosition = ((SportReportShareViewModel) this$0.getMViewModel()).getCurrentEditBgPosition();
            if (currentEditBgPosition != null) {
                int iIntValue2 = currentEditBgPosition.intValue();
                SportShareEditView sportShareEditView4 = this$0.editView;
                if (sportShareEditView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("editView");
                } else {
                    sportShareEditView = sportShareEditView4;
                }
                sportShareEditView.setEditType(2, iIntValue2);
            }
        } else {
            Integer currentEditBgPosition2 = ((SportReportShareViewModel) this$0.getMViewModel()).getCurrentEditBgPosition();
            if (currentEditBgPosition2 != null) {
                int iIntValue3 = currentEditBgPosition2.intValue();
                SportShareEditView sportShareEditView5 = this$0.editView;
                if (sportShareEditView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("editView");
                } else {
                    sportShareEditView = sportShareEditView5;
                }
                sportShareEditView.setEditType(1, iIntValue3);
            }
        }
        int size = this$0.chartDataList.size();
        int chartDataPosition = ((SportReportShareViewModel) this$0.getMViewModel()).getChartDataPosition();
        if (chartDataPosition >= 0 && chartDataPosition < size) {
            iIntValue = this$0.chartDataList.get(((SportReportShareViewModel) this$0.getMViewModel()).getChartDataPosition()).intValue();
        }
        Integer currentEditType = ((SportReportShareViewModel) this$0.getMViewModel()).getCurrentEditType();
        if (currentEditType != null && currentEditType.intValue() == 1 && (editCustomTabLayoutHolder = this$0.editCustomTabLayoutHolder) != null) {
            editCustomTabLayoutHolder.showWhiteBottomTab(z, ((SportReportShareViewModel) this$0.getMViewModel()).getSportShowDataList(), iIntValue);
        }
        if (bool.booleanValue() && Intrinsics.areEqual(((SportReportShareViewModel) this$0.getMViewModel()).getEditPanelDataTabIsSelected().getValue(), bool2)) {
            RecyclerView bottomWindowRecycler = ((gpp) this$0.getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(bottomWindowRecycler, "bottomWindowRecycler");
            ViewExtKt.visible(bottomWindowRecycler);
        } else {
            RecyclerView bottomWindowRecycler2 = ((gpp) this$0.getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(bottomWindowRecycler2, "bottomWindowRecycler");
            ViewExtKt.gone(bottomWindowRecycler2);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setUpBasicUi() {
        setActionBarDisplayable(false);
        setTabLayout(((gpp) getMBinding()).H);
        setViewPager(((gpp) getMBinding()).I);
        this.editView = ((gpp) getMBinding()).F;
        UIUtils uIUtils = UIUtils.INSTANCE;
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        uIUtils.setLightStatusBar(window, false);
        listenOnBottomWindowIndicator();
        ((SportReportShareViewModel) getMViewModel()).m242getUserInfoLiveData();
        ((SportReportShareViewModel) getMViewModel()).getUserInfoLiveData().observe(this, new EditSportReportCustomShareActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: q28
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EditSportReportCustomShareActivity.setUpBasicUi$lambda$0(this.f31013a, (AccountCoreInfo) obj);
            }
        }));
        FitnessPersistKey fitnessPersistKey = FitnessPersistKey.INSTANCE;
        SportBasicReport sportBasicReport = this.sportReport;
        SportReportKey sportReportKey = fitnessPersistKey.getSportReportKey(sportBasicReport != null ? sportBasicReport.getSportType() : 0);
        if (sportReportKey != null && this.sportReport != null) {
            SportReportShareViewModel sportReportShareViewModel = (SportReportShareViewModel) getMViewModel();
            SportBasicReport sportBasicReport2 = this.sportReport;
            Intrinsics.checkNotNull(sportBasicReport2);
            String sid = sportBasicReport2.getSid();
            if (sid == null) {
                sid = "";
            }
            String str = sid;
            String key = sportReportKey.getKey();
            SportBasicReport sportBasicReport3 = this.sportReport;
            Intrinsics.checkNotNull(sportBasicReport3);
            long startTime = sportBasicReport3.getStartTime();
            SportBasicReport sportBasicReport4 = this.sportReport;
            Intrinsics.checkNotNull(sportBasicReport4);
            long endTime = sportBasicReport4.getEndTime();
            SportBasicReport sportBasicReport5 = this.sportReport;
            Intrinsics.checkNotNull(sportBasicReport5);
            Long cloudCourseId = sportBasicReport5.getCloudCourseId();
            String string = cloudCourseId != null ? cloudCourseId.toString() : null;
            SportBasicReport sportBasicReport6 = this.sportReport;
            Intrinsics.checkNotNull(sportBasicReport6);
            sportReportShareViewModel.getReportInfoFromNet(str, key, startTime, endTime, string, sportBasicReport6.getCloudCourseSource());
            ((SportReportShareViewModel) getMViewModel()).getSportsReportOperationalCourseInfo().observe(this, new EditSportReportCustomShareActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: r28
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return EditSportReportCustomShareActivity.setUpBasicUi$lambda$1(this.f32105a, (SportsReportOperationalCourseData) obj);
                }
            }));
        }
        ((SportReportShareViewModel) getMViewModel()).getBgSelectedPositionLiveData().setValue(Integer.valueOf(this.bgPosition));
        if (((SportReportShareViewModel) getMViewModel()).getCurrentEditType() == null) {
            ((SportReportShareViewModel) getMViewModel()).setCurrentEditType(Integer.valueOf(getTabPosition(this.bgPosition)));
        }
        if (((SportReportShareViewModel) getMViewModel()).getCurrentEditBgPosition() == null) {
            ((SportReportShareViewModel) getMViewModel()).setCurrentEditBgPosition(Integer.valueOf(SportReportShareExtKt.getIndexByPosition(this.bgPosition)));
        }
        SportBasicReport sportBasicReport7 = this.sportReport;
        Intrinsics.checkNotNull(sportBasicReport7);
        BottomWindowAdapter bottomWindowAdapter = new BottomWindowAdapter(sportBasicReport7, this);
        bottomWindowAdapter.setSquarePatternSelectedPosition(((SportReportShareViewModel) getMViewModel()).getSquareBottomWindowPatternSelectedPosition());
        bottomWindowAdapter.setOnItemClickListener(new BottomWindowAdapter.OnItemClickListener() { // from class: com.xiaomi.fitness.share.report.EditSportReportCustomShareActivity.setUpBasicUi.3
            @Override // com.xiaomi.fitness.share.report.adapter.BottomWindowAdapter.OnItemClickListener
            public void onItemClick(int position) {
                EditCustomTabLayoutHolder editCustomTabLayoutHolder;
                EditSportReportCustomShareActivity.access$getMViewModel(EditSportReportCustomShareActivity.this).getSquareBottomWindowPatternSelectedPosition().setValue(Integer.valueOf(position));
                SportShareEditView sportShareEditView = null;
                if (position == 0 && (!EditSportReportCustomShareActivity.access$getMViewModel(EditSportReportCustomShareActivity.this).getSportShowDataList().isEmpty())) {
                    EditSportReportCustomShareActivity.access$getMViewModel(EditSportReportCustomShareActivity.this).setSportShowDataList(EditSportReportCustomShareActivity.access$getMViewModel(EditSportReportCustomShareActivity.this).getSportShowDataList().subList(0, 2));
                } else if (EditSportReportCustomShareActivity.access$getMViewModel(EditSportReportCustomShareActivity.this).getSportShowDataList().size() == 2) {
                    if (EditSportReportCustomShareActivity.this.sportAllDataList.indexOf(EditSportReportCustomShareActivity.access$getMViewModel(EditSportReportCustomShareActivity.this).getSportShowDataList().get(1)) > 1) {
                        ListExtKt.add(EditSportReportCustomShareActivity.access$getMViewModel(EditSportReportCustomShareActivity.this).getSportShowDataList(), 1, EditSportReportCustomShareActivity.this.sportAllDataList.get(1));
                    } else if (EditSportReportCustomShareActivity.this.sportAllDataList.size() > 2) {
                        ListExtKt.add(EditSportReportCustomShareActivity.access$getMViewModel(EditSportReportCustomShareActivity.this).getSportShowDataList(), EditSportReportCustomShareActivity.this.sportAllDataList.get(2));
                    }
                    SportShareEditView sportShareEditView2 = EditSportReportCustomShareActivity.this.editView;
                    if (sportShareEditView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("editView");
                        sportShareEditView2 = null;
                    }
                    SportBasicReport sportBasicReport8 = EditSportReportCustomShareActivity.this.sportReport;
                    Intrinsics.checkNotNull(sportBasicReport8);
                    sportShareEditView2.setDataViewList(sportBasicReport8, EditSportReportCustomShareActivity.this.sportAllDataList, EditSportReportCustomShareActivity.this.chartDataList, EditSportReportCustomShareActivity.access$getMViewModel(EditSportReportCustomShareActivity.this).getSportShowDataList());
                }
                int i = position == 0 ? 8 : 3;
                int iIndexOf = EditSportReportCustomShareActivity.this.sportAllDataList.indexOf(EditSportReportCustomShareActivity.access$getMViewModel(EditSportReportCustomShareActivity.this).getSportShowDataList().get(1));
                SportShareEditView sportShareEditView3 = EditSportReportCustomShareActivity.this.editView;
                if (sportShareEditView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("editView");
                } else {
                    sportShareEditView = sportShareEditView3;
                }
                sportShareEditView.setDataEditType(i, iIndexOf);
                int size = EditSportReportCustomShareActivity.this.chartDataList.size();
                int chartDataPosition = EditSportReportCustomShareActivity.access$getMViewModel(EditSportReportCustomShareActivity.this).getChartDataPosition();
                int iIntValue = (chartDataPosition < 0 || chartDataPosition >= size) ? 0 : ((Number) EditSportReportCustomShareActivity.this.chartDataList.get(EditSportReportCustomShareActivity.access$getMViewModel(EditSportReportCustomShareActivity.this).getChartDataPosition())).intValue();
                Integer currentEditType = EditSportReportCustomShareActivity.access$getMViewModel(EditSportReportCustomShareActivity.this).getCurrentEditType();
                if (currentEditType == null || currentEditType.intValue() != 1 || (editCustomTabLayoutHolder = EditSportReportCustomShareActivity.this.editCustomTabLayoutHolder) == null) {
                    return;
                }
                editCustomTabLayoutHolder.showWhiteBottomTab(position == 0, EditSportReportCustomShareActivity.access$getMViewModel(EditSportReportCustomShareActivity.this).getSportShowDataList(), iIntValue);
            }
        });
        ((gpp) getMBinding()).C.setAdapter(bottomWindowAdapter);
        nuf.f(((gpp) getMBinding()).B);
        uIUtils.setNavigationBarColor(this, dki.h);
        ViewExtKt.clickWithTrigger$default(((gpp) getMBinding()).B, 0L, new Function1() { // from class: s28
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return EditSportReportCustomShareActivity.setUpBasicUi$lambda$2(this.f33202a, (ImageView) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setUpBasicUi$lambda$0(EditSportReportCustomShareActivity this$0, AccountCoreInfo accountCoreInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EditCustomTabLayoutHolder editCustomTabLayoutHolder = this$0.editCustomTabLayoutHolder;
        if (editCustomTabLayoutHolder != null) {
            editCustomTabLayoutHolder.setDataViewUserInfo(accountCoreInfo, true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setUpBasicUi$lambda$1(EditSportReportCustomShareActivity this$0, SportsReportOperationalCourseData sportsReportOperationalCourseData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (sportsReportOperationalCourseData != null) {
            SportsReportOperationalCourseTrainSummary trainSummary = sportsReportOperationalCourseData.getTrainSummary();
            Integer numValueOf = trainSummary != null ? Integer.valueOf(trainSummary.getTrainTimes()) : null;
            String name = sportsReportOperationalCourseData.getCourseInfo().getName();
            if (!TextUtils.isEmpty(name)) {
                if (numValueOf == null || numValueOf.intValue() <= 0) {
                    EditCustomTabLayoutHolder editCustomTabLayoutHolder = this$0.editCustomTabLayoutHolder;
                    if (editCustomTabLayoutHolder != null) {
                        editCustomTabLayoutHolder.updateSportName(name);
                    }
                } else {
                    String quantityString = ResourceExtKt.getQuantityString(AppUtil.getApp(), byi.course_record_times, numValueOf.intValue(), numValueOf);
                    EditCustomTabLayoutHolder editCustomTabLayoutHolder2 = this$0.editCustomTabLayoutHolder;
                    if (editCustomTabLayoutHolder2 != null) {
                        String string = this$0.getString(j1j.course_record_summary, name, quantityString);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        editCustomTabLayoutHolder2.updateSportName(string);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setUpBasicUi$lambda$2(EditSportReportCustomShareActivity this$0, ImageView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.handleBackAction();
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return ivi.W1;
    }

    @NotNull
    public final TabLayout getTabLayout() {
        TabLayout tabLayout = this.tabLayout;
        if (tabLayout != null) {
            return tabLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tabLayout");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @NotNull
    public final ViewPager2 getViewPager() {
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            return viewPager2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        handleBackAction();
    }

    @Override // com.xiaomi.fitness.share.report.Hilt_EditSportReportCustomShareActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initParams();
        if (this.sportReport == null) {
            return;
        }
        setUpBasicUi();
        initCustomTabLayoutHolder();
        initEditViewData();
        initEditViewDataListener();
        initEditViewTabListener();
    }

    public final void setTabLayout(@NotNull TabLayout tabLayout) {
        Intrinsics.checkNotNullParameter(tabLayout, "<set-?>");
        this.tabLayout = tabLayout;
    }

    public final void setViewPager(@NotNull ViewPager2 viewPager2) {
        Intrinsics.checkNotNullParameter(viewPager2, "<set-?>");
        this.viewPager = viewPager2;
    }
}
