package com.xiaomi.fitness.detail.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.SportReportKey;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.detail.data.BasicItemInfo;
import com.xiaomi.fitness.detail.model.SportsReportOperationalCourseData;
import com.xiaomi.fitness.detail.model.SportsReportOperationalCourseTrainSummary;
import com.xiaomi.fitness.detail.recycler.SportBasicInfoItemDecoration;
import com.xiaomi.fitness.detail.recycler.SportDetailAdapter;
import com.xiaomi.fitness.detail.view.SportShareBasicInfoView;
import com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.share.view.ShareRoutineView;
import com.xiaomi.fitness.widget.view.RoundImageView;
import defpackage.byi;
import defpackage.hoi;
import defpackage.ivi;
import defpackage.j1j;
import defpackage.mod;
import defpackage.o5o;
import defpackage.pz9;
import defpackage.rz5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010F\u001a\u00020E\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010G\u0012\b\b\u0002\u0010I\u001a\u00020\u0005¢\u0006\u0004\bJ\u0010KJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0004J5\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\"\u0010/\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001e\u0010<\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010'R\u0016\u0010=\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006L"}, d2 = {"Lcom/xiaomi/fitness/detail/view/SportShareBasicInfoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "initRecycler", "()V", "", "getChartDataList", "()I", "Lcom/xiaomi/fitness/detail/data/BasicItemInfo;", "basicInfo", "Landroid/widget/TextView;", "title", "value", "setBasicInfo", "(Lcom/xiaomi/fitness/detail/data/BasicItemInfo;Landroid/widget/TextView;Landroid/widget/TextView;)V", "chartType", "changeLineChartType", "(I)V", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "accountCoreInfo", "", "isCommonSport", "updateHeaderInfo", "(Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;Z)V", "hideHeaderInfo", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "basicReport", "", "dataList", "", "sportName", "bindData", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;Ljava/util/List;Ljava/lang/String;Z)V", "Lcom/xiaomi/fitness/detail/recycler/SportDetailAdapter;", "mDetailAdapter", "Lcom/xiaomi/fitness/detail/recycler/SportDetailAdapter;", "", "Lrz5;", "mDetailList", "Ljava/util/List;", "Lmod;", "binding", "Lmod;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerSportInfo", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "userInfoMgr", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "getUserInfoMgr", "()Lcom/xiaomi/fitness/account/user/UserInfoManager;", "setUserInfoMgr", "(Lcom/xiaomi/fitness/account/user/UserInfoManager;)V", "Lcom/xiaomi/fitness/detail/view/ShareTrackLineView;", "shareLineView", "Lcom/xiaomi/fitness/detail/view/ShareTrackLineView;", "Lcom/xiaomi/fitness/share/view/ShareRoutineView;", "routineView", "Lcom/xiaomi/fitness/share/view/ShareRoutineView;", "Lcom/xiaomi/fit/data/common/data/sport/Location;", "gpsValues", "currentLineType", "I", "Landroidx/lifecycle/ViewModelStoreOwner;", "lifeCycle", "Landroidx/lifecycle/ViewModelStoreOwner;", "Landroidx/lifecycle/LifecycleOwner;", "viewLifeCycle", "Landroidx/lifecycle/LifecycleOwner;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSportShareBasicInfoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportShareBasicInfoView.kt\ncom/xiaomi/fitness/detail/view/SportShareBasicInfoView\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,261:1\n54#2,3:262\n24#2:265\n59#2,6:266\n*S KotlinDebug\n*F\n+ 1 SportShareBasicInfoView.kt\ncom/xiaomi/fitness/detail/view/SportShareBasicInfoView\n*L\n137#1:262,3\n137#1:265\n137#1:266,6\n*E\n"})
public final class SportShareBasicInfoView extends ConstraintLayout {

    @NotNull
    private final mod binding;
    private int currentLineType;

    @Nullable
    private List<? extends Location> gpsValues;

    @NotNull
    private final ViewModelStoreOwner lifeCycle;
    private SportDetailAdapter mDetailAdapter;
    private List<rz5> mDetailList;

    @NotNull
    private RecyclerView recyclerSportInfo;

    @NotNull
    private ShareRoutineView routineView;
    private ShareTrackLineView shareLineView;

    @NotNull
    private UserInfoManager userInfoMgr;

    @NotNull
    private final LifecycleOwner viewLifeCycle;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportShareBasicInfoView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindData$lambda$2(SportShareBasicInfoView this$0, String timeStr, SportsReportOperationalCourseData sportsReportOperationalCourseData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(timeStr, "$timeStr");
        if (sportsReportOperationalCourseData != null) {
            SportsReportOperationalCourseTrainSummary trainSummary = sportsReportOperationalCourseData.getTrainSummary();
            Integer numValueOf = trainSummary != null ? Integer.valueOf(trainSummary.getTrainTimes()) : null;
            String name = sportsReportOperationalCourseData.getCourseInfo().getName();
            if (!TextUtils.isEmpty(name)) {
                if (numValueOf == null || numValueOf.intValue() <= 0) {
                    this$0.binding.H.setText(name);
                } else {
                    String quantityString = this$0.getResources().getQuantityString(byi.course_record_times, numValueOf.intValue(), numValueOf);
                    Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                    String string = ResourceExtKt.getString(j1j.course_record_summary, name, quantityString);
                    TextView textView = this$0.binding.H;
                    if (string != null && string.length() != 0) {
                        timeStr = timeStr + " " + string;
                    }
                    textView.setText(timeStr);
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final int getChartDataList() {
        List<SportRecordItem> listI;
        List<Location> listB = o5o.e().b();
        if (listB != null && (!listB.isEmpty())) {
            return 0;
        }
        List<SportRecordItem> listG = o5o.e().g();
        if (listG != null && (!listG.isEmpty())) {
            return 1;
        }
        List<SportRecordItem> listF = o5o.e().f();
        if ((listF != null && (!listF.isEmpty())) || ((listI = o5o.e().i()) != null && (!listI.isEmpty()))) {
            return 3;
        }
        List<SportRecordItem> listH = o5o.e().h();
        if (listH != null && (!listH.isEmpty())) {
            return 2;
        }
        List<SportRecordItem> listD = o5o.e().d();
        return (listD == null || !(listD.isEmpty() ^ true)) ? 1 : 4;
    }

    private final void initRecycler() {
        this.mDetailList = new ArrayList();
        this.recyclerSportInfo.setLayoutManager(new GridLayoutManager(getContext(), 3));
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        List<rz5> list = this.mDetailList;
        ShareTrackLineView shareTrackLineView = null;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDetailList");
            list = null;
        }
        this.mDetailAdapter = new SportDetailAdapter(context, list, ivi.X0, 3);
        if (pz9.a(getContext())) {
            SportDetailAdapter sportDetailAdapter = this.mDetailAdapter;
            if (sportDetailAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDetailAdapter");
                sportDetailAdapter = null;
            }
            sportDetailAdapter.setItemPosition(1);
        } else {
            SportDetailAdapter sportDetailAdapter2 = this.mDetailAdapter;
            if (sportDetailAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDetailAdapter");
                sportDetailAdapter2 = null;
            }
            sportDetailAdapter2.setItemPosition(0);
        }
        SportBasicInfoItemDecoration sportBasicInfoItemDecoration = new SportBasicInfoItemDecoration();
        sportBasicInfoItemDecoration.setPaddingHeightSize(2.0f);
        this.recyclerSportInfo.addItemDecoration(sportBasicInfoItemDecoration);
        RecyclerView recyclerView = this.recyclerSportInfo;
        SportDetailAdapter sportDetailAdapter3 = this.mDetailAdapter;
        if (sportDetailAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDetailAdapter");
            sportDetailAdapter3 = null;
        }
        recyclerView.setAdapter(sportDetailAdapter3);
        ShareTrackLineView shareTrackLineView2 = this.shareLineView;
        if (shareTrackLineView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shareLineView");
        } else {
            shareTrackLineView = shareTrackLineView2;
        }
        shareTrackLineView.setData(getChartDataList());
    }

    private final void setBasicInfo(BasicItemInfo basicInfo, TextView title, TextView value) {
        title.setVisibility(0);
        value.setVisibility(0);
        value.setText(basicInfo.getData());
    }

    public final void bindData(@NotNull SportBasicReport basicReport, @NotNull List<BasicItemInfo> dataList, @Nullable String sportName, boolean isCommonSport) {
        String string;
        Integer correctedDistance;
        Intrinsics.checkNotNullParameter(basicReport, "basicReport");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        SportRecordDetailViewModel sportRecordDetailViewModel = (SportRecordDetailViewModel) new ViewModelProvider(this.lifeCycle).get(SportRecordDetailViewModel.class);
        this.binding.I.setVisibility((basicReport.getCorrectedDistance() == null || (correctedDistance = basicReport.getCorrectedDistance()) == null || correctedDistance.intValue() <= 0) ? 8 : 0);
        final String dateYYYYMMddLocalFormat = TimeDateUtil.getDateYYYYMMddLocalFormat(basicReport.getStartTime() * ((long) 1000));
        this.binding.H.setText((sportName == null || sportName.length() == 0) ? dateYYYYMMddLocalFormat : dateYYYYMMddLocalFormat + " " + sportName);
        SportReportKey sportReportKey = FitnessPersistKey.INSTANCE.getSportReportKey(basicReport.getSportType());
        SportDetailAdapter sportDetailAdapter = null;
        if (sportReportKey != null) {
            String sid = basicReport.getSid();
            if (sid == null) {
                sid = "";
            }
            String key = sportReportKey.getKey();
            long startTime = basicReport.getStartTime();
            long endTime = basicReport.getEndTime();
            Long cloudCourseId = basicReport.getCloudCourseId();
            sportRecordDetailViewModel.getReportInfoFromNet(sid, key, startTime, endTime, cloudCourseId != null ? cloudCourseId.toString() : null, basicReport.getCloudCourseSource());
        }
        sportRecordDetailViewModel.getSportsReportOperationalCourseInfo().observe(this.viewLifeCycle, new SportShareBasicInfoView$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: l0o
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportShareBasicInfoView.bindData$lambda$2(this.f24488a, dateYYYYMMddLocalFormat, (SportsReportOperationalCourseData) obj);
            }
        }));
        List<Location> listB = o5o.e().b();
        this.gpsValues = listB;
        List<Location> list = listB;
        if (list != null && !list.isEmpty() && this.routineView.getPath() == null) {
            Path path = new Path();
            List<? extends Location> list2 = this.gpsValues;
            Intrinsics.checkNotNull(list2);
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                List<? extends Location> list3 = this.gpsValues;
                Intrinsics.checkNotNull(list3);
                Location location = list3.get(i);
                if (i == 0) {
                    path.moveTo((float) location.longitude, (float) location.latitude);
                } else {
                    path.lineTo((float) location.longitude, (float) location.latitude);
                }
            }
            this.routineView.setPath(path);
            ShareTrackLineView shareTrackLineView = this.shareLineView;
            if (shareTrackLineView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shareLineView");
                shareTrackLineView = null;
            }
            shareTrackLineView.setVisibility(8);
            this.routineView.setVisibility(0);
        } else if (this.routineView.getPath() == null) {
            ShareTrackLineView shareTrackLineView2 = this.shareLineView;
            if (shareTrackLineView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shareLineView");
                shareTrackLineView2 = null;
            }
            shareTrackLineView2.setVisibility(0);
            this.routineView.setVisibility(8);
        }
        if (!dataList.isEmpty()) {
            BasicItemInfo basicItemInfo = dataList.get(0);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (AppUtil.getTxtFontSize(context) >= 1.25f) {
                this.binding.C.setTextSize(40.0f);
            }
            this.binding.C.setText(basicItemInfo.getData());
            this.binding.J.setText(basicItemInfo.getUnit());
            TextView mainValueDesTV = this.binding.B;
            Intrinsics.checkNotNullExpressionValue(mainValueDesTV, "mainValueDesTV");
            ViewExtKt.gone(mainValueDesTV);
            List<BasicItemInfo> listSubList = dataList.subList(1, dataList.size());
            List<rz5> list4 = this.mDetailList;
            if (list4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDetailList");
                list4 = null;
            }
            if (list4.size() > 0) {
                List<rz5> list5 = this.mDetailList;
                if (list5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDetailList");
                    list5 = null;
                }
                list5.clear();
            }
            for (BasicItemInfo basicItemInfo2 : listSubList) {
                rz5 rz5Var = new rz5();
                String pluralTitle = basicItemInfo2.getPluralTitle();
                if (pluralTitle == null || pluralTitle.length() == 0) {
                    string = getContext().getString(basicItemInfo2.getTitle());
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                } else {
                    string = basicItemInfo2.getPluralTitle();
                }
                rz5Var.f33082b = string;
                rz5Var.c = basicItemInfo2.getUnit();
                rz5Var.d = basicItemInfo2.getData();
                int index = basicItemInfo2.getIndex();
                BasicItemInfo.Companion companion = BasicItemInfo.INSTANCE;
                if (index == companion.getSPORT_DATA_INFO_PACE()) {
                    rz5Var.g(1);
                } else if (index == companion.getSPORT_INFO_POSTURE()) {
                    rz5Var.g(2);
                } else {
                    rz5Var.g(0);
                }
                List<rz5> list6 = this.mDetailList;
                if (list6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDetailList");
                    list6 = null;
                }
                list6.add(rz5Var);
            }
            SportDetailAdapter sportDetailAdapter2 = this.mDetailAdapter;
            if (sportDetailAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDetailAdapter");
            } else {
                sportDetailAdapter = sportDetailAdapter2;
            }
            sportDetailAdapter.notifyDataSetChanged();
        }
    }

    public final void changeLineChartType(int chartType) {
        this.currentLineType = chartType;
        ShareTrackLineView shareTrackLineView = null;
        if (chartType == 0) {
            ShareTrackLineView shareTrackLineView2 = this.shareLineView;
            if (shareTrackLineView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shareLineView");
            } else {
                shareTrackLineView = shareTrackLineView2;
            }
            shareTrackLineView.setVisibility(8);
            this.routineView.setVisibility(0);
            return;
        }
        ShareTrackLineView shareTrackLineView3 = this.shareLineView;
        if (shareTrackLineView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shareLineView");
            shareTrackLineView3 = null;
        }
        shareTrackLineView3.setData(chartType);
        ShareTrackLineView shareTrackLineView4 = this.shareLineView;
        if (shareTrackLineView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shareLineView");
        } else {
            shareTrackLineView = shareTrackLineView4;
        }
        shareTrackLineView.setVisibility(0);
        this.routineView.setVisibility(8);
    }

    @NotNull
    public final UserInfoManager getUserInfoMgr() {
        return this.userInfoMgr;
    }

    public final void hideHeaderInfo() {
        this.binding.D.setVisibility(8);
        this.binding.A.setVisibility(8);
        this.binding.H.setVisibility(8);
    }

    public final void setUserInfoMgr(@NotNull UserInfoManager userInfoManager) {
        Intrinsics.checkNotNullParameter(userInfoManager, "<set-?>");
        this.userInfoMgr = userInfoManager;
    }

    public final void updateHeaderInfo(@Nullable AccountCoreInfo accountCoreInfo, boolean isCommonSport) {
        RoundImageView header = this.binding.A;
        Intrinsics.checkNotNullExpressionValue(header, "header");
        String avatarAddress = accountCoreInfo != null ? accountCoreInfo.getAvatarAddress() : null;
        ImageLoader imageLoader = Coil.imageLoader(header.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(header.getContext()).data(avatarAddress).target(header);
        builderTarget.allowHardware(false);
        builderTarget.bitmapConfig(Bitmap.Config.ARGB_8888);
        builderTarget.placeholder(hoi.o);
        builderTarget.error(hoi.o);
        imageLoader.enqueue(builderTarget.build());
        this.binding.D.setText(accountCoreInfo != null ? accountCoreInfo.getUserName() : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportShareBasicInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SportShareBasicInfoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public SportShareBasicInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.userInfoMgr = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE);
        this.currentLineType = 1;
        this.lifeCycle = (ViewModelStoreOwner) context;
        this.viewLifeCycle = (LifecycleOwner) context;
        mod modVarA0 = mod.A0(LayoutInflater.from(context), this, true);
        this.binding = modVarA0;
        this.recyclerSportInfo = modVarA0.E;
        this.shareLineView = modVarA0.G;
        this.routineView = modVarA0.F;
        initRecycler();
    }
}
