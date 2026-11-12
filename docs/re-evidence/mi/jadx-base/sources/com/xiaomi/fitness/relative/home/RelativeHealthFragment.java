package com.xiaomi.fitness.relative.home;

import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.data.CloudDataResult;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.homepage.util.HealthDataTypeUtils;
import com.xiaomi.fitness.relative.RelativeUtil;
import com.xiaomi.fitness.relative.export.IRelativeCareAccessApi;
import com.xiaomi.fitness.relative.export.RelativeCareAccessExtKt;
import com.xiaomi.fitness.relative.home.RelativeHealthFragment;
import com.xiaomi.fitness.service.ServiceConnector;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.view.DataEmptyView;
import defpackage.av6;
import defpackage.c0j;
import defpackage.jui;
import defpackage.km5;
import defpackage.pz9;
import defpackage.w4n;
import defpackage.waa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import miuix.springback.view.SpringBackLayout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000½\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0007*\u0001Y\b\u0007\u0018\u0000 ^2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001^B\t\b\u0007¢\u0006\u0004\b]\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0007J\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0007J%\u0010\u0014\u001a\u00020\u00052\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0007J\u000f\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0007J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001c\u0010\u0007J!\u0010 \u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b \u0010!J)\u0010&\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J)\u0010,\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0005H\u0016¢\u0006\u0004\b.\u0010\u0007J\u000f\u0010/\u001a\u00020\u0005H\u0016¢\u0006\u0004\b/\u0010\u0007J\u000f\u00100\u001a\u00020\u0005H\u0016¢\u0006\u0004\b0\u0010\u0007R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020D0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR \u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020D0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\"\u0010M\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bM\u0010O\"\u0004\bP\u0010QR\u0016\u0010S\u001a\u00020R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010V\u001a\u00020U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010X\u001a\u00020U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010WR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010\\\u001a\u00020R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010T¨\u0006_"}, d2 = {"Lcom/xiaomi/fitness/relative/home/RelativeHealthFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/relative/home/RelativeViewModel;", "Lwaa;", "Lcom/xiaomi/fitness/relative/home/a$b;", "", "initBundle", "()V", "initTitleView", "initDataItemCard", "getAndDrawHomeData", "", "errorCode", "bindEmptyText", "(I)V", "initDataSortMap", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "", "dataMap", "startDrawWithFitnessData", "(Ljava/util/Map;)V", "setLayoutManager", "initResource", "position", "Landroid/os/Bundle;", "createBundle", "(I)Landroid/os/Bundle;", "listenToConnectionStatus", "Landroid/view/View;", "view", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/app/ActivityOptions;", "activityOptions", "", "hasAbnormalRecord", "onGoPage", "(ILandroid/app/ActivityOptions;Z)V", LifecycleConstantKt.ON_START, LifecycleConstantKt.ON_STOP, LifecycleConstantKt.ON_DESTROY, "Landroidx/recyclerview/widget/RecyclerView;", "recycler", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/view/DataEmptyView;", "emptyView", "Lcom/xiaomi/fitness/view/DataEmptyView;", "Lcom/xiaomi/fitness/relative/home/RelativeDataHeaderView;", "dataHeaderView", "Lcom/xiaomi/fitness/relative/home/RelativeDataHeaderView;", "Lcom/xiaomi/fitness/relative/home/RelativeHomeHeaderView;", "dataEmptyHeaderView", "Lcom/xiaomi/fitness/relative/home/RelativeHomeHeaderView;", "Lcom/xiaomi/fitness/relative/home/RelativeHealthTitleView;", "healthTitleView", "Lcom/xiaomi/fitness/relative/home/RelativeHealthTitleView;", "Lcom/xiaomi/fitness/relative/home/a;", "mAdapter", "Lcom/xiaomi/fitness/relative/home/a;", "", "Lkm5;", "mDataList", "Ljava/util/List;", "", "mDataModelMap", "Ljava/util/Map;", "Lmiuix/springback/view/SpringBackLayout;", "swipeContainer", "Lmiuix/springback/view/SpringBackLayout;", "isFemale", "Z", "()Z", "setFemale", "(Z)V", "", "relativeUid", "J", "", "origin", "Ljava/lang/String;", "relativeNode", "com/xiaomi/fitness/relative/home/RelativeHealthFragment$serviceConnectionListener$1", "serviceConnectionListener", "Lcom/xiaomi/fitness/relative/home/RelativeHealthFragment$serviceConnectionListener$1;", "startMills", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class RelativeHealthFragment extends Hilt_RelativeHealthFragment<RelativeViewModel, waa> implements a.b {

    @NotNull
    public static final String CONST_ACCOUNT = "account";

    @NotNull
    public static final String KEY_ORIGIN = "origin";

    @NotNull
    private static final String TAG = "RelativeHealthFragment";

    @Nullable
    private RelativeHomeHeaderView dataEmptyHeaderView;

    @Nullable
    private RelativeDataHeaderView dataHeaderView;

    @Nullable
    private DataEmptyView emptyView;

    @Nullable
    private RelativeHealthTitleView healthTitleView;
    private boolean isFemale;

    @Nullable
    private a mAdapter;

    @NotNull
    private final List<km5> mDataList;

    @NotNull
    private final Map<Integer, km5> mDataModelMap;

    @NotNull
    private String origin;

    @Nullable
    private RecyclerView recycler;

    @NotNull
    private String relativeNode;
    private long relativeUid;

    @NotNull
    private final RelativeHealthFragment$serviceConnectionListener$1 serviceConnectionListener;
    private long startMills;

    @Nullable
    private SpringBackLayout swipeContainer;

    /* JADX WARN: Type inference failed for: r0v8, types: [com.xiaomi.fitness.relative.home.RelativeHealthFragment$serviceConnectionListener$1] */
    public RelativeHealthFragment() {
        super(jui.E0, 0, true);
        this.mDataList = new ArrayList();
        this.mDataModelMap = new LinkedHashMap();
        this.isFemale = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).isFemale();
        this.relativeUid = -1L;
        this.origin = "";
        this.relativeNode = "";
        this.serviceConnectionListener = new ServiceConnection() { // from class: com.xiaomi.fitness.relative.home.RelativeHealthFragment$serviceConnectionListener$1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName name, IBinder service) {
                Logger.i("RelativeHealthFragment", "onServiceConnected() called with: name = " + name + ", service = " + service);
                RelativeHealthFragment.access$getMViewModel(this.this$0).getConnectionStatusLiveData().postValue(Boolean.TRUE);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName name) {
                this.this$0.hideLoading();
                FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                ToastExtKt.toastShort(fragmentActivityRequireActivity, c0j.mq);
            }
        };
        this.startMills = System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ RelativeViewModel access$getMViewModel(RelativeHealthFragment relativeHealthFragment) {
        return (RelativeViewModel) relativeHealthFragment.getMViewModel();
    }

    private final void bindEmptyText(int errorCode) {
        String string;
        if (errorCode == -4002004 || errorCode == 606 || errorCode == 0) {
            string = getString(c0j.H4);
        } else {
            string = errorCode != 1 ? getString(c0j.kq) : getString(c0j.common_network_error_retry_later);
        }
        Intrinsics.checkNotNull(string);
        DataEmptyView dataEmptyView = this.emptyView;
        if (dataEmptyView != null) {
            dataEmptyView.d(string);
        }
    }

    private final Bundle createBundle(int position) {
        Bundle bundle = new Bundle();
        a aVar = this.mAdapter;
        Intrinsics.checkNotNull(aVar);
        km5 itemAsPosition = aVar.getItemAsPosition(position);
        if (itemAsPosition != null) {
            if (!TextUtils.isEmpty(itemAsPosition.d)) {
                bundle.putString("did", itemAsPosition.d);
            }
            bundle.putLong("key_relative_uid", this.relativeUid);
            bundle.putSerializable("local_date", TimeDateUtil.timestampToLocalDate(itemAsPosition.f23978a));
        }
        a aVar2 = this.mAdapter;
        Intrinsics.checkNotNull(aVar2);
        bundle.putInt("sport_type", aVar2.getItemType(position));
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void getAndDrawHomeData() {
        if (isInvalid()) {
            return;
        }
        ((RelativeViewModel) getMViewModel()).getRelativeDataList(this.relativeUid).observe(getViewLifecycleOwner(), new RelativeHealthFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: thk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RelativeHealthFragment.getAndDrawHomeData$lambda$8(this.f34710a, (CloudDataResult) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAndDrawHomeData$lambda$8(final RelativeHealthFragment this$0, CloudDataResult cloudDataResult) {
        RelativeDataHeaderView relativeDataHeaderView;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Map<HomeDataType, ? extends Object> map = (Map) cloudDataResult.getData();
        if (map == null || map.isEmpty()) {
            DataEmptyView dataEmptyView = this$0.emptyView;
            if (dataEmptyView != null) {
                dataEmptyView.setVisibility(0);
            }
            if (cloudDataResult.isNotRelatives()) {
                DataEmptyView dataEmptyView2 = this$0.emptyView;
                if (dataEmptyView2 != null) {
                    dataEmptyView2.d(this$0.getString(c0j.G4));
                }
                CommonDialog commonDialogCreate = new CommonDialog.c("relativeData").setPositiveText(c0j.e).setDialogDescription(c0j.G4).setCanceledOnBackPressed(false).setCancelable(false).setCanceledOnTouchOutside(false).create();
                commonDialogCreate.showIfNeed(this$0.getChildFragmentManager());
                commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.relative.home.RelativeHealthFragment$getAndDrawHomeData$1$1
                    @Override // defpackage.av6
                    public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                        Intrinsics.checkNotNullParameter(dialogName, "dialogName");
                        Intrinsics.checkNotNullParameter(dialog, "dialog");
                        super.onDialogClick(dialogName, dialog, which);
                        if (which == -1) {
                            this.this$0.finish();
                        }
                    }
                });
            }
            this$0.bindEmptyText(cloudDataResult.getErrorCode());
            SpringBackLayout springBackLayout = this$0.swipeContainer;
            if (springBackLayout != null) {
                springBackLayout.setVisibility(8);
            }
            RelativeHomeHeaderView relativeHomeHeaderView = this$0.dataEmptyHeaderView;
            if (relativeHomeHeaderView != null) {
                relativeHomeHeaderView.setVisibility(0);
            }
        } else {
            SpringBackLayout springBackLayout2 = this$0.swipeContainer;
            if (springBackLayout2 != null) {
                springBackLayout2.setVisibility(0);
            }
            DataEmptyView dataEmptyView3 = this$0.emptyView;
            if (dataEmptyView3 != null) {
                dataEmptyView3.setVisibility(8);
            }
            RelativeHomeHeaderView relativeHomeHeaderView2 = this$0.dataEmptyHeaderView;
            if (relativeHomeHeaderView2 != null) {
                relativeHomeHeaderView2.setVisibility(8);
            }
            this$0.startDrawWithFitnessData(map);
            DailyBasicReport dailyBasicReport = (DailyBasicReport) map.get(HomeDataType.RAINBOW);
            Logger.i(TAG, "RainbowReport, mDailyGoalReport = " + dailyBasicReport);
            if (dailyBasicReport != null && (dailyBasicReport instanceof DailyGoalReport) && (relativeDataHeaderView = this$0.dataHeaderView) != null) {
                relativeDataHeaderView.bindGoalReport((DailyGoalReport) dailyBasicReport, this$0.relativeUid);
            }
        }
        return Unit.INSTANCE;
    }

    private final void initBundle() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.relativeUid = arguments.getLong("key_relative_uid");
            this.relativeNode = String.valueOf(arguments.getString("key_relative_note"));
        }
    }

    private final void initDataItemCard() {
        this.mDataList.clear();
        initDataSortMap();
    }

    private final void initDataSortMap() {
        this.mDataModelMap.clear();
        ArrayList arrayList = new ArrayList();
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(16);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(15);
        arrayList.add(10000);
        arrayList.add(13);
        long todayZeroTimeInSec = FitnessDateUtils.getTodayZeroTimeInSec();
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            int iIntValue = ((Number) it.next()).intValue();
            km5 km5VarCreateDefaultDataModel = HealthUtil.INSTANCE.createDefaultDataModel(todayZeroTimeInSec, iIntValue, i);
            this.mDataModelMap.put(Integer.valueOf(iIntValue), km5VarCreateDefaultDataModel);
            i = i2;
        }
    }

    private final void initResource() {
        setLayoutManager();
        a aVar = new a(getMActivity(), this.mDataList);
        this.mAdapter = aVar;
        Intrinsics.checkNotNull(aVar);
        aVar.setOnGoPageClickListener(this);
        RecyclerView recyclerView = this.recycler;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.setAdapter(this.mAdapter);
        w4n w4nVar = new w4n();
        RecyclerView recyclerView2 = this.recycler;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.addItemDecoration(w4nVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initTitleView() {
        String string = getString(c0j.rq, this.relativeNode);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        RelativeHealthTitleView relativeHealthTitleView = this.healthTitleView;
        if (relativeHealthTitleView != null) {
            NestedScrollView scrollView = ((waa) getMBinding()).E;
            Intrinsics.checkNotNullExpressionValue(scrollView, "scrollView");
            relativeHealthTitleView.bindData(scrollView, string);
        }
        RelativeHealthTitleView relativeHealthTitleView2 = this.healthTitleView;
        if (relativeHealthTitleView2 != null) {
            relativeHealthTitleView2.setOnFuncMoreClick(new Function1() { // from class: nhk
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return RelativeHealthFragment.initTitleView$lambda$2(this.f27941a, (View) obj);
                }
            });
        }
        RelativeHealthTitleView relativeHealthTitleView3 = this.healthTitleView;
        if (relativeHealthTitleView3 != null) {
            relativeHealthTitleView3.setOnFuncBackClick(new Function1() { // from class: ohk
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return RelativeHealthFragment.initTitleView$lambda$3(this.f29183a, (View) obj);
                }
            });
        }
        RelativeDataHeaderView relativeDataHeaderView = this.dataHeaderView;
        if (relativeDataHeaderView != null) {
            relativeDataHeaderView.bindTitleData(string, new Function0() { // from class: phk
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RelativeHealthFragment.initTitleView$lambda$4(this.f30400a);
                }
            }, new Function0() { // from class: qhk
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RelativeHealthFragment.initTitleView$lambda$5(this.f31527a);
                }
            });
        }
        RelativeHomeHeaderView relativeHomeHeaderView = this.dataEmptyHeaderView;
        if (relativeHomeHeaderView != null) {
            relativeHomeHeaderView.bindData(string, new Function0() { // from class: rhk
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RelativeHealthFragment.initTitleView$lambda$6(this.f32551a);
                }
            }, new Function0() { // from class: shk
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RelativeHealthFragment.initTitleView$lambda$7(this.f33650a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initTitleView$lambda$2(RelativeHealthFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        IRelativeCareAccessApi instance = RelativeCareAccessExtKt.getINSTANCE(IRelativeCareAccessApi.INSTANCE);
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        instance.goToRelativeDataSettingPage(fragmentActivityRequireActivity, this$0.relativeUid, this$0.relativeNode);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initTitleView$lambda$3(RelativeHealthFragment this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initTitleView$lambda$4(RelativeHealthFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IRelativeCareAccessApi instance = RelativeCareAccessExtKt.getINSTANCE(IRelativeCareAccessApi.INSTANCE);
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        instance.goToRelativeDataSettingPage(fragmentActivityRequireActivity, this$0.relativeUid, this$0.relativeNode);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initTitleView$lambda$5(RelativeHealthFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initTitleView$lambda$6(RelativeHealthFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IRelativeCareAccessApi instance = RelativeCareAccessExtKt.getINSTANCE(IRelativeCareAccessApi.INSTANCE);
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        instance.goToRelativeDataSettingPage(fragmentActivityRequireActivity, this$0.relativeUid, this$0.relativeNode);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initTitleView$lambda$7(RelativeHealthFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
        return Unit.INSTANCE;
    }

    private final void listenToConnectionStatus() {
        ServiceConnector.addServiceConnectListener$default(ServiceConnector.INSTANCE.getInstance(), this.serviceConnectionListener, 0, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(RelativeHealthFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            this$0.getAndDrawHomeData();
            this$0.hideLoading();
        } else {
            PageState.DefaultImpls.showLoading$default(this$0, c0j.s, false, 2, null);
        }
        return Unit.INSTANCE;
    }

    private final void setLayoutManager() {
        final int i;
        if (pz9.a(getMActivity())) {
            i = 3;
        } else {
            Context context = getContext();
            i = (context == null || !UIUtils.INSTANCE.isTabletAndLandscape(context)) ? 2 : 4;
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getMActivity(), i);
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.relative.home.RelativeHealthFragment.setLayoutManager.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                a aVar = RelativeHealthFragment.this.mAdapter;
                Intrinsics.checkNotNull(aVar);
                if (!aVar.isHeaderView(position)) {
                    a aVar2 = RelativeHealthFragment.this.mAdapter;
                    Intrinsics.checkNotNull(aVar2);
                    if (!aVar2.isBottomView(position)) {
                        a aVar3 = RelativeHealthFragment.this.mAdapter;
                        Intrinsics.checkNotNull(aVar3);
                        km5 itemAsPosition = aVar3.getItemAsPosition(position);
                        int i2 = itemAsPosition != null ? itemAsPosition.g : 1;
                        if (itemAsPosition.f23979b == 19) {
                            Context context2 = RelativeHealthFragment.this.getContext();
                            i2 = (context2 == null || !UIUtils.INSTANCE.isTabletAndLandscape(context2)) ? 2 : 4;
                        }
                        int i3 = i;
                        return i2 > i3 ? i3 : i2;
                    }
                }
                return i;
            }
        });
        RecyclerView recyclerView = this.recycler;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(gridLayoutManager);
        }
    }

    private final void startDrawWithFitnessData(Map<HomeDataType, ? extends Object> dataMap) {
        if (dataMap == null || dataMap.isEmpty()) {
            return;
        }
        this.mDataList.clear();
        for (Map.Entry<Integer, km5> entry : this.mDataModelMap.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            km5 value = entry.getValue();
            Object obj = dataMap.get(HealthDataTypeUtils.INSTANCE.convertToHomeDataType(iIntValue));
            if (obj != null && (obj instanceof DailyBasicReport)) {
                Logger.i(TAG, "startDrawWithFitnessData obj=" + obj);
                DailyBasicReport dailyBasicReport = (DailyBasicReport) obj;
                value.f23978a = dailyBasicReport.getTime();
                value.d = dailyBasicReport.getSid();
                value.h = dailyBasicReport;
                if (value.e >= 0) {
                    this.mDataList.add(value);
                }
            }
        }
        RecyclerView recyclerView = this.recycler;
        if (recyclerView != null) {
            recyclerView.setVisibility(this.mDataList.isEmpty() ? 8 : 0);
        }
        CollectionsKt__MutableCollectionsJVMKt.sort(this.mDataList);
        a aVar = this.mAdapter;
        Intrinsics.checkNotNull(aVar);
        aVar.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: isFemale, reason: from getter */
    public final boolean getIsFemale() {
        return this.isFemale;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String stringExtra = (requestCode != 1 || data == null) ? null : data.getStringExtra("ket_request_set_node");
        if (stringExtra != null) {
            this.relativeNode = stringExtra;
            if (stringExtra.length() == 0) {
                this.relativeNode = String.valueOf(this.relativeUid);
            }
            String string = getString(c0j.rq, this.relativeNode);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            RelativeHealthTitleView relativeHealthTitleView = this.healthTitleView;
            if (relativeHealthTitleView != null) {
                NestedScrollView scrollView = ((waa) getMBinding()).E;
                Intrinsics.checkNotNullExpressionValue(scrollView, "scrollView");
                relativeHealthTitleView.bindData(scrollView, string);
            }
            RelativeDataHeaderView relativeDataHeaderView = this.dataHeaderView;
            if (relativeDataHeaderView != null) {
                relativeDataHeaderView.setTitle(string);
            }
        }
        Logger.i("onActivityResult requestCode:" + requestCode + "resultCode:" + resultCode + "data" + data, new Object[0]);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (Intrinsics.areEqual(this.origin, "account")) {
            ServiceConnector.removeServiceConnectListener$default(ServiceConnector.INSTANCE.getInstance(), this.serviceConnectionListener, 0, 2, null);
        }
    }

    @Override // com.xiaomi.fitness.relative.home.a.b
    public /* bridge */ /* synthetic */ void onGoPage(int i, ActivityOptions activityOptions, Boolean bool) {
        onGoPage(i, activityOptions, bool.booleanValue());
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.startMills = System.currentTimeMillis();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.startMills) / ((long) 1000);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        Logger.d(TAG, "onStop: relatives_data_list_page, " + jCurrentTimeMillis);
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        Pair[] pairArr = new Pair[4];
        pairArr[0] = TuplesKt.to("name", "relatives_data_list_page");
        pairArr[1] = TuplesKt.to("duration_sec", Long.valueOf(jCurrentTimeMillis));
        pairArr[2] = TuplesKt.to("device_model", (wearableDeviceModel != null ? DeviceModelExtKt.getModel(wearableDeviceModel) : null) != null ? DeviceModelExtKt.getModel(wearableDeviceModel) : "none");
        pairArr[3] = TuplesKt.to("user_id", MD5Util.MD5(String.valueOf(this.relativeUid)));
        oneTrackExtKt.reportData("c_pa_v3", MapsKt__MapsKt.mapOf(pairArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        String string;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        initBundle();
        this.recycler = ((waa) getMBinding()).D;
        this.dataHeaderView = ((waa) getMBinding()).B;
        this.dataEmptyHeaderView = ((waa) getMBinding()).A;
        this.swipeContainer = ((waa) getMBinding()).F;
        this.healthTitleView = ((waa) getMBinding()).G;
        this.emptyView = ((waa) getMBinding()).C;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("origin")) == null) {
            string = "";
        }
        this.origin = string;
        if (Intrinsics.areEqual(string, "account")) {
            listenToConnectionStatus();
        }
        initResource();
        initTitleView();
        initDataItemCard();
        if (Intrinsics.areEqual(this.origin, "account")) {
            ((RelativeViewModel) getMViewModel()).getConnectionStatusLiveData().observe(getViewLifecycleOwner(), new RelativeHealthFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: uhk
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return RelativeHealthFragment.onViewCreated$lambda$0(this.f35765a, (Boolean) obj);
                }
            }));
        } else {
            getAndDrawHomeData();
        }
        UIUtils uIUtils = UIUtils.INSTANCE;
        Window window = requireActivity().getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        uIUtils.setNavigationBarTranslucent(window);
    }

    public final void setFemale(boolean z) {
        this.isFemale = z;
    }

    public void onGoPage(int position, @Nullable ActivityOptions activityOptions, boolean hasAbnormalRecord) {
        if (position == -1) {
            return;
        }
        Bundle bundleCreateBundle = createBundle(position);
        a aVar = this.mAdapter;
        Intrinsics.checkNotNull(aVar);
        int itemType = aVar.getItemType(position);
        RelativeUtil relativeUtil = RelativeUtil.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        relativeUtil.goDataPage(fragmentActivityRequireActivity, getContext(), itemType, bundleCreateBundle, activityOptions);
        relativeUtil.relativeTrackReport(itemType, String.valueOf(this.relativeUid), hasAbnormalRecord);
    }
}
