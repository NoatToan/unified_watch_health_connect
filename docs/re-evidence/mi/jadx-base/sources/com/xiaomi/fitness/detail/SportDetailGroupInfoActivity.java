package com.xiaomi.fitness.detail;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.detail.SportDetailGroupInfoActivity;
import com.xiaomi.fitness.detail.model.SportCourseInfoModel;
import com.xiaomi.fitness.detail.model.SportDivingInfoModel;
import com.xiaomi.fitness.detail.model.SportSkiingInfoModel;
import com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;
import defpackage.d1o;
import defpackage.eln;
import defpackage.fon;
import defpackage.ivi;
import defpackage.j1j;
import defpackage.no0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 V2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001VB\u0007¢\u0006\u0004\bU\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R$\u0010&\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010-\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00104\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R(\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010\u001d\u001a\u0004\b<\u0010\u001f\"\u0004\b=\u0010!R$\u0010?\u001a\u0004\u0018\u00010>8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR(\u0010F\u001a\b\u0012\u0004\u0012\u00020E0\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010\u001d\u001a\u0004\bG\u0010\u001f\"\u0004\bH\u0010!R$\u0010J\u001a\u0004\u0018\u00010I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010T\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010Q¨\u0006W"}, d2 = {"Lcom/xiaomi/fitness/detail/SportDetailGroupInfoActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/detail/viewmodel/SportRecordDetailViewModel;", "Lno0;", "", "initGroupInfoRecycler", "()V", "initGroupInfoData", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "titleView", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "getTitleView", "()Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "setTitleView", "(Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerGroupInfo", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerGroupInfo", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerGroupInfo", "(Landroidx/recyclerview/widget/RecyclerView;)V", "", "Lcom/xiaomi/fitness/detail/model/SportCourseInfoModel;", "courseInfoList", "Ljava/util/List;", "getCourseInfoList", "()Ljava/util/List;", "setCourseInfoList", "(Ljava/util/List;)V", "mDataList", "getMDataList", "setMDataList", "Lfon;", "mSportGroupInfoAdapter", "Lfon;", "getMSportGroupInfoAdapter", "()Lfon;", "setMSportGroupInfoAdapter", "(Lfon;)V", "", DailyRecordKey.sportType, "Ljava/lang/Integer;", "getSportType", "()Ljava/lang/Integer;", "setSportType", "(Ljava/lang/Integer;)V", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "mSportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "getMSportReport", "()Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "setMSportReport", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;)V", "Lcom/xiaomi/fitness/detail/model/SportDivingInfoModel;", "mDivingDataList", "getMDivingDataList", "setMDivingDataList", "Leln;", "mSportDivingInfoAdapter", "Leln;", "getMSportDivingInfoAdapter", "()Leln;", "setMSportDivingInfoAdapter", "(Leln;)V", "Lcom/xiaomi/fitness/detail/model/SportSkiingInfoModel;", "mSkiingDataList", "getMSkiingDataList", "setMSkiingDataList", "Ld1o;", "mmSkiingGroupInfoAdapter", "Ld1o;", "getMmSkiingGroupInfoAdapter", "()Ld1o;", "setMmSkiingGroupInfoAdapter", "(Ld1o;)V", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportDetailGroupInfoActivity extends BaseBindingActivity<SportRecordDetailViewModel, no0> {

    @NotNull
    public static final String TAG = "SportRecordLandScapeActivity";

    @NotNull
    private List<SportCourseInfoModel> courseInfoList = new ArrayList();

    @NotNull
    private List<SportCourseInfoModel> mDataList = new ArrayList();

    @NotNull
    private List<SportDivingInfoModel> mDivingDataList = new ArrayList();

    @NotNull
    private List<SportSkiingInfoModel> mSkiingDataList = new ArrayList();

    @Nullable
    private eln mSportDivingInfoAdapter;

    @Nullable
    private fon mSportGroupInfoAdapter;

    @Nullable
    private SportBasicReport mSportReport;

    @Nullable
    private d1o mmSkiingGroupInfoAdapter;

    @Nullable
    private RecyclerView recyclerGroupInfo;

    @Nullable
    private Integer sportType;

    @Nullable
    private DataTitleSimpleView titleView;

    private final void initGroupInfoData() {
        fon fonVar;
        fon fonVar2;
        fon fonVar3;
        fon fonVar4;
        fon fonVar5;
        fon fonVar6;
        for (SportCourseInfoModel sportCourseInfoModel : this.mDataList) {
            if (sportCourseInfoModel.getMaxPace() != null) {
                Integer maxPace = sportCourseInfoModel.getMaxPace();
                Intrinsics.checkNotNull(maxPace);
                if (maxPace.intValue() > 0 && (fonVar6 = this.mSportGroupInfoAdapter) != null) {
                    fonVar6.g = true;
                }
            }
            if (sportCourseInfoModel.getMaxHr() != null) {
                Integer maxHr = sportCourseInfoModel.getMaxHr();
                Intrinsics.checkNotNull(maxHr);
                if (maxHr.intValue() > 0 && (fonVar5 = this.mSportGroupInfoAdapter) != null) {
                    fonVar5.h = true;
                }
            }
            if (sportCourseInfoModel.getCalories() != null) {
                Integer calories = sportCourseInfoModel.getCalories();
                Intrinsics.checkNotNull(calories);
                if (calories.intValue() > 0 && (fonVar4 = this.mSportGroupInfoAdapter) != null) {
                    fonVar4.i = true;
                }
            }
            if (sportCourseInfoModel.getSwolf() != null && (fonVar3 = this.mSportGroupInfoAdapter) != null) {
                fonVar3.l = true;
            }
            if (sportCourseInfoModel.getCount() != null && (fonVar2 = this.mSportGroupInfoAdapter) != null) {
                fonVar2.f18009k = true;
            }
            if (sportCourseInfoModel.getSportState() == -1 && (fonVar = this.mSportGroupInfoAdapter) != null) {
                fonVar.m = false;
            }
        }
    }

    private final void initGroupInfoRecycler() {
        fon fonVar;
        this.recyclerGroupInfo = getMBinding().B;
        this.mDataList.addAll(this.courseInfoList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        RecyclerView recyclerView = this.recyclerGroupInfo;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        List<SportCourseInfoModel> list = this.mDataList;
        Integer num = this.sportType;
        Intrinsics.checkNotNull(num);
        this.mSportGroupInfoAdapter = new fon(this, list, num.intValue(), this.mSportReport);
        this.mSportDivingInfoAdapter = new eln(this, this.mDivingDataList, 0, Boolean.FALSE);
        SportBasicReport sportBasicReport = this.mSportReport;
        if (sportBasicReport != null && sportBasicReport.getProtoType() == 25) {
            eln elnVar = this.mSportDivingInfoAdapter;
            if (elnVar != null) {
                elnVar.h = Boolean.TRUE;
            }
            RecyclerView recyclerView2 = this.recyclerGroupInfo;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(elnVar);
                return;
            }
            return;
        }
        SportBasicReport sportBasicReport2 = this.mSportReport;
        if (sportBasicReport2 == null || sportBasicReport2.getProtoType() != 21) {
            RecyclerView recyclerView3 = this.recyclerGroupInfo;
            if (recyclerView3 != null) {
                recyclerView3.setAdapter(this.mSportGroupInfoAdapter);
            }
            initGroupInfoData();
            if (this.mDataList.size() > 0) {
                if ((this.mDataList.get(0).getSportState() == 32 || this.mDataList.get(0).getSportState() == 33) && (fonVar = this.mSportGroupInfoAdapter) != null) {
                    fonVar.m = false;
                    return;
                }
                return;
            }
            return;
        }
        Iterator<SportSkiingInfoModel> it = this.mSkiingDataList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (it.next().e != 0.0f) {
                z = true;
            }
        }
        d1o d1oVar = new d1o(this, this.mSkiingDataList, 0, Boolean.valueOf(z));
        this.mmSkiingGroupInfoAdapter = d1oVar;
        d1oVar.h = Boolean.TRUE;
        RecyclerView recyclerView4 = this.recyclerGroupInfo;
        if (recyclerView4 != null) {
            recyclerView4.setAdapter(d1oVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(SportDetailGroupInfoActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    @NotNull
    public final List<SportCourseInfoModel> getCourseInfoList() {
        return this.courseInfoList;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return ivi.c;
    }

    @NotNull
    public final List<SportCourseInfoModel> getMDataList() {
        return this.mDataList;
    }

    @NotNull
    public final List<SportDivingInfoModel> getMDivingDataList() {
        return this.mDivingDataList;
    }

    @NotNull
    public final List<SportSkiingInfoModel> getMSkiingDataList() {
        return this.mSkiingDataList;
    }

    @Nullable
    public final eln getMSportDivingInfoAdapter() {
        return this.mSportDivingInfoAdapter;
    }

    @Nullable
    public final fon getMSportGroupInfoAdapter() {
        return this.mSportGroupInfoAdapter;
    }

    @Nullable
    public final SportBasicReport getMSportReport() {
        return this.mSportReport;
    }

    @Nullable
    public final d1o getMmSkiingGroupInfoAdapter() {
        return this.mmSkiingGroupInfoAdapter;
    }

    @Nullable
    public final RecyclerView getRecyclerGroupInfo() {
        return this.recyclerGroupInfo;
    }

    @Nullable
    public final Integer getSportType() {
        return this.sportType;
    }

    @Nullable
    public final DataTitleSimpleView getTitleView() {
        return this.titleView;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return -1;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Integer num;
        super.onCreate(savedInstanceState);
        setTitle("");
        setActionBarDisplayable(false);
        if (SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndFolded()) {
            setRequestedOrientation(0);
        }
        getMBinding().A.setOnClickListener(new View.OnClickListener() { // from class: kgn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportDetailGroupInfoActivity.onCreate$lambda$0(this.f23830a, view);
            }
        });
        this.sportType = Integer.valueOf(getIntent().getIntExtra(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_RECORD_KEY, 1));
        SportBasicReport sportBasicReport = (SportBasicReport) getIntent().getSerializableExtra(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES);
        this.mSportReport = sportBasicReport;
        if (sportBasicReport == null || sportBasicReport.getProtoType() != 25) {
            SportBasicReport sportBasicReport2 = this.mSportReport;
            if (sportBasicReport2 == null || sportBasicReport2.getProtoType() != 21) {
                Serializable serializableExtra = getIntent().getSerializableExtra("sport_report");
                Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type kotlin.collections.MutableList<com.xiaomi.fitness.detail.model.SportCourseInfoModel>");
                this.mDataList = TypeIntrinsics.asMutableList(serializableExtra);
            } else {
                getMBinding().C.setText(getString(j1j.m0));
                Serializable serializableExtra2 = getIntent().getSerializableExtra("sport_report");
                Intrinsics.checkNotNull(serializableExtra2, "null cannot be cast to non-null type kotlin.collections.MutableList<com.xiaomi.fitness.detail.model.SportSkiingInfoModel>");
                this.mSkiingDataList = TypeIntrinsics.asMutableList(serializableExtra2);
            }
        } else {
            getMBinding().C.setText(getString(j1j.U3));
            Serializable serializableExtra3 = getIntent().getSerializableExtra("sport_report");
            Intrinsics.checkNotNull(serializableExtra3, "null cannot be cast to non-null type kotlin.collections.MutableList<com.xiaomi.fitness.detail.model.SportDivingInfoModel>");
            this.mDivingDataList = TypeIntrinsics.asMutableList(serializableExtra3);
        }
        Integer num2 = this.sportType;
        if ((num2 != null && num2.intValue() == 9) || ((num = this.sportType) != null && num.intValue() == 10)) {
            getMBinding().C.setText(getString(j1j.f7));
        } else {
            getMBinding().C.setText(getString(j1j.e7));
        }
        initGroupInfoRecycler();
    }

    public final void setCourseInfoList(@NotNull List<SportCourseInfoModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.courseInfoList = list;
    }

    public final void setMDataList(@NotNull List<SportCourseInfoModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mDataList = list;
    }

    public final void setMDivingDataList(@NotNull List<SportDivingInfoModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mDivingDataList = list;
    }

    public final void setMSkiingDataList(@NotNull List<SportSkiingInfoModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mSkiingDataList = list;
    }

    public final void setMSportDivingInfoAdapter(@Nullable eln elnVar) {
        this.mSportDivingInfoAdapter = elnVar;
    }

    public final void setMSportGroupInfoAdapter(@Nullable fon fonVar) {
        this.mSportGroupInfoAdapter = fonVar;
    }

    public final void setMSportReport(@Nullable SportBasicReport sportBasicReport) {
        this.mSportReport = sportBasicReport;
    }

    public final void setMmSkiingGroupInfoAdapter(@Nullable d1o d1oVar) {
        this.mmSkiingGroupInfoAdapter = d1oVar;
    }

    public final void setRecyclerGroupInfo(@Nullable RecyclerView recyclerView) {
        this.recyclerGroupInfo = recyclerView;
    }

    public final void setSportType(@Nullable Integer num) {
        this.sportType = num;
    }

    public final void setTitleView(@Nullable DataTitleSimpleView dataTitleSimpleView) {
        this.titleView = dataTitleSimpleView;
    }
}
