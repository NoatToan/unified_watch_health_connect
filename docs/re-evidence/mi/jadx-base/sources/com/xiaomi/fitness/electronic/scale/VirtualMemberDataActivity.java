package com.xiaomi.fitness.electronic.scale;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.mibi.sdk.component.params.SdkContants;
import com.miui.circulate.device.api.Column;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.electronic.scale.VirtualMemberDataActivity;
import com.xiaomi.fitness.electronic.scale.adapter.VirtualMemberAdapter;
import com.xiaomi.fitness.electronic.scale.event.ScaleEventBusIds;
import com.xiaomi.fitness.electronic.scale.export.EcoDialogHelper;
import com.xiaomi.fitness.electronic.scale.export.EcoShareDialogExtKt;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManager;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManagerExtKt;
import com.xiaomi.fitness.electronic.scale.export.PullWeightRecordCallback;
import com.xiaomi.fitness.electronic.scale.export.bean.ProxyResponse;
import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import com.xiaomi.fitness.electronic.scale.model.UserDataViewModel;
import com.xiaomi.fitness.electronic.scale.widget.VirtualMemberDayView;
import com.xiaomi.fitness.electronic.scale.widget.VirtualMemberStatisticsView;
import com.xiaomi.fitness.electronic.scale.widget.gallery.GalleryLayoutManager;
import defpackage.av1;
import defpackage.fah;
import defpackage.gui;
import defpackage.kb;
import defpackage.ld8;
import defpackage.lni;
import defpackage.q0r;
import defpackage.qal;
import defpackage.tk0;
import defpackage.uno;
import defpackage.yaa;
import defpackage.zzi;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import miuix.miuixbasewidget.widget.FilterSortView;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes8.dex */
@Route(path = "/electronic/activity/VirtualMemberData")
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\bi\u0010\bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\bJ\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\bJ\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\bJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\bJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001cH\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u001cH\u0014¢\u0006\u0004\b#\u0010\u001fJ\u0017\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u001cH\u0014¢\u0006\u0004\b%\u0010\u001fJ\u000f\u0010&\u001a\u00020\u0006H\u0014¢\u0006\u0004\b&\u0010\bJ\u001d\u0010*\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'¢\u0006\u0004\b*\u0010+J\u0019\u0010-\u001a\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b-\u0010.J\u0019\u0010/\u001a\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b/\u0010.J\u000f\u00100\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u0010\bJ)\u00104\u001a\u00020\u00062\u0006\u00101\u001a\u00020\r2\u0006\u00102\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u000103H\u0014¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\u00062\u0006\u00107\u001a\u000206H\u0007¢\u0006\u0004\b8\u00109J\u0017\u00108\u001a\u00020\u00062\u0006\u00107\u001a\u00020:H\u0007¢\u0006\u0004\b8\u0010;J\u0017\u00108\u001a\u00020\u00062\u0006\u00107\u001a\u00020<H\u0007¢\u0006\u0004\b8\u0010=J'\u0010>\u001a\u00020\u00062\u0006\u00101\u001a\u00020\r2\u0006\u00102\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u001cH\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020\u00062\u0006\u00107\u001a\u00020@H\u0007¢\u0006\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082D¢\u0006\u0006\n\u0004\bD\u0010ER\u001e\u0010H\u001a\n G*\u0004\u0018\u00010F0F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010J\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010M\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010O\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010NR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR$\u0010T\u001a\u0004\u0018\u00010S8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR$\u0010[\u001a\u0004\u0018\u00010Z8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u0016\u0010c\u001a\u0004\u0018\u00010C8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0014\u0010f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0014\u0010h\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010e¨\u0006j"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/VirtualMemberDataActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/electronic/scale/model/UserDataViewModel;", "Ltk0;", "Lfah;", "Lyaa;", "", "initView", "()V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroid/view/View;", "item", "", "position", "updateSelectedItem", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;I)V", "", "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "data", "getIndexByAccountId", "(Ljava/util/List;)I", "setFilterTab", "initTab", "refreshDateStr", "getVirtualAccount", "getWeightResultData", "initData", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "expandBundle", "(Landroid/os/Bundle;)V", "createBundleForCalendar", "()Landroid/os/Bundle;", "savedInstanceState", "onCreate", "outState", "onSaveInstanceState", LifecycleConstantKt.ON_DESTROY, "", "startTime", "endTime", "refreshStaticsTitle", "(JJ)V", "view", "onImgBackClick", "(Landroid/view/View;)V", "onImgShareClick", "onShowCalendar", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "onActivityResult", "(IILandroid/content/Intent;)V", "Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnUserAddEvent;", "event", "refreshData", "(Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnUserAddEvent;)V", "Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnUserModifyEvent;", "(Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnUserModifyEvent;)V", "Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnUserDeleteEvent;", "(Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$OnUserDeleteEvent;)V", "onFragmentResult", "(IILandroid/os/Bundle;)V", "Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$RefreshWeightResultData;", "refreshWeightResultData", "(Lcom/xiaomi/fitness/electronic/scale/event/ScaleEventBusIds$RefreshWeightResultData;)V", "", "did", "Ljava/lang/String;", "Lorg/joda/time/LocalDate;", "kotlin.jvm.PlatformType", "curDate", "Lorg/joda/time/LocalDate;", Column.ACCOUNT_ID, "Ljava/lang/Long;", "", "showCalendar", "Z", "isSelectTop", "Lcom/xiaomi/fitness/electronic/scale/adapter/VirtualMemberAdapter;", "mVirtualMemberAdapter", "Lcom/xiaomi/fitness/electronic/scale/adapter/VirtualMemberAdapter;", "Lcom/xiaomi/fitness/electronic/scale/widget/VirtualMemberDayView;", "virtualMemberDayView", "Lcom/xiaomi/fitness/electronic/scale/widget/VirtualMemberDayView;", "getVirtualMemberDayView", "()Lcom/xiaomi/fitness/electronic/scale/widget/VirtualMemberDayView;", "setVirtualMemberDayView", "(Lcom/xiaomi/fitness/electronic/scale/widget/VirtualMemberDayView;)V", "Lcom/xiaomi/fitness/electronic/scale/widget/VirtualMemberStatisticsView;", "virtualMemberStatisticsView", "Lcom/xiaomi/fitness/electronic/scale/widget/VirtualMemberStatisticsView;", "getVirtualMemberStatisticsView", "()Lcom/xiaomi/fitness/electronic/scale/widget/VirtualMemberStatisticsView;", "setVirtualMemberStatisticsView", "(Lcom/xiaomi/fitness/electronic/scale/widget/VirtualMemberStatisticsView;)V", "getClassName", "()Ljava/lang/String;", "className", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nVirtualMemberDataActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VirtualMemberDataActivity.kt\ncom/xiaomi/fitness/electronic/scale/VirtualMemberDataActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,429:1\n1872#2,3:430\n*S KotlinDebug\n*F\n+ 1 VirtualMemberDataActivity.kt\ncom/xiaomi/fitness/electronic/scale/VirtualMemberDataActivity\n*L\n234#1:430,3\n*E\n"})
public final class VirtualMemberDataActivity extends Hilt_VirtualMemberDataActivity<UserDataViewModel, tk0> implements fah, yaa {
    private boolean isSelectTop;

    @Nullable
    private VirtualMemberDayView virtualMemberDayView;

    @Nullable
    private VirtualMemberStatisticsView virtualMemberStatisticsView;

    @NotNull
    private final String did = "";
    private LocalDate curDate = LocalDate.now();

    @Nullable
    private Long accountId = 0L;
    private boolean showCalendar = true;

    @NotNull
    private final VirtualMemberAdapter mVirtualMemberAdapter = new VirtualMemberAdapter(null, 1, null == true ? 1 : 0);

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ tk0 access$getMBinding(VirtualMemberDataActivity virtualMemberDataActivity) {
        return (tk0) virtualMemberDataActivity.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ UserDataViewModel access$getMViewModel(VirtualMemberDataActivity virtualMemberDataActivity) {
        return (UserDataViewModel) virtualMemberDataActivity.getMViewModel();
    }

    private final Bundle createBundleForCalendar() {
        Bundle bundle = new Bundle();
        bundle.putString("intentFragment", getClassName());
        bundle.putInt("position", 0);
        bundle.putSerializable("local_date", this.curDate);
        bundle.putBoolean("from_activity", true);
        bundle.putBoolean("switch_day_week_month", this.showCalendar);
        return bundle;
    }

    private final void expandBundle(Bundle bundle) {
        bundle.putBoolean("switch_day_week_month", false);
        bundle.putBoolean("only_day", true);
    }

    private final String getClassName() {
        return VirtualMemberDataActivity.class.getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getIndexByAccountId(List<VirtualAccount> data) {
        qal.c("getIndexByAccountId() accountId :" + this.accountId);
        if (this.accountId == null) {
            return 0;
        }
        int i = 0;
        for (Object obj : data) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            long accountId = ((VirtualAccount) obj).getAccountId();
            Long l = this.accountId;
            Intrinsics.checkNotNull(l);
            if (accountId == l.longValue()) {
                return i;
            }
            i = i2;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void getVirtualAccount() {
        ((UserDataViewModel) getMViewModel()).getVirtualAccount(((UserDataViewModel) getMViewModel()).getUserId(), this.did, new Function1() { // from class: qzq
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return VirtualMemberDataActivity.getVirtualAccount$lambda$8(this.f32036a, (ProxyResponse) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getVirtualAccount$lambda$8(VirtualMemberDataActivity this$0, ProxyResponse it) {
        List list;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getCode() == 0 && (list = (List) it.getResult()) != null) {
            qal.c("getVirtualAccount()" + list.size());
            AnyExtKt.main$default(null, new VirtualMemberDataActivity$getVirtualAccount$1$1$1(list, this$0, null), 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void getWeightResultData() {
        ((UserDataViewModel) getMViewModel()).updateDate(this.curDate.getYear(), this.curDate.getMonthOfYear(), this.curDate.getDayOfMonth());
        refreshDateStr();
        VirtualAccount virtualAccount = ((UserDataViewModel) getMViewModel()).getVirtualAccount();
        if (virtualAccount != null) {
            VirtualMemberDayView virtualMemberDayView = this.virtualMemberDayView;
            Intrinsics.checkNotNull(virtualMemberDayView);
            virtualMemberDayView.refreshWeightData(virtualAccount, ((UserDataViewModel) getMViewModel()).getMillis());
            VirtualMemberStatisticsView virtualMemberStatisticsView = this.virtualMemberStatisticsView;
            Intrinsics.checkNotNull(virtualMemberStatisticsView);
            virtualMemberStatisticsView.refreshWeightData(virtualAccount);
        }
    }

    private final void initData() {
        getVirtualAccount();
        ElectronicScaleManagerExtKt.getInstance(ElectronicScaleManager.INSTANCE).pullRecord(true, new SoftReference<>(new PullWeightRecordCallback() { // from class: com.xiaomi.fitness.electronic.scale.VirtualMemberDataActivity.initData.1
            @Override // com.xiaomi.fitness.electronic.scale.export.PullWeightRecordCallback
            public void onPullWeightRecordSuccess(long startTime, long endTime) {
                long j = 1000;
                String dateYYYYMMDDLocalFormat = TimeDateUtil.getDateYYYYMMDDLocalFormat(startTime / j);
                String dateYYYYMMDDLocalFormat2 = TimeDateUtil.getDateYYYYMMDDLocalFormat(endTime / j);
                String dateYYYYMMDDLocalFormat3 = TimeDateUtil.getDateYYYYMMDDLocalFormat(VirtualMemberDataActivity.access$getMViewModel(VirtualMemberDataActivity.this).getMillis() / j);
                Logger.i("VirtualMemberDataActivity initData() startTime : " + startTime + " , startDate : " + dateYYYYMMDDLocalFormat, new Object[0]);
                Logger.i("VirtualMemberDataActivity initData() endTime : " + endTime + " , endDate : " + dateYYYYMMDDLocalFormat2, new Object[0]);
                Logger.i("VirtualMemberDataActivity initData() curTime : " + VirtualMemberDataActivity.access$getMViewModel(VirtualMemberDataActivity.this).getMillis() + " , curDate : " + dateYYYYMMDDLocalFormat3, new Object[0]);
                if (Intrinsics.areEqual(dateYYYYMMDDLocalFormat, dateYYYYMMDDLocalFormat3) || Intrinsics.areEqual(dateYYYYMMDDLocalFormat2, dateYYYYMMDDLocalFormat3)) {
                    VirtualMemberDayView virtualMemberDayView = VirtualMemberDataActivity.this.getVirtualMemberDayView();
                    Intrinsics.checkNotNull(virtualMemberDayView);
                    if (!virtualMemberDayView.getIsSelectedItem()) {
                        Logger.i("VirtualMemberDataActivity initData() virtualMemberDayView refreshWeightData", new Object[0]);
                        VirtualAccount virtualAccount = VirtualMemberDataActivity.access$getMViewModel(VirtualMemberDataActivity.this).getVirtualAccount();
                        if (virtualAccount != null) {
                            VirtualMemberDataActivity virtualMemberDataActivity = VirtualMemberDataActivity.this;
                            VirtualMemberDayView virtualMemberDayView2 = virtualMemberDataActivity.getVirtualMemberDayView();
                            Intrinsics.checkNotNull(virtualMemberDayView2);
                            virtualMemberDayView2.refreshWeightData(virtualAccount, VirtualMemberDataActivity.access$getMViewModel(virtualMemberDataActivity).getMillis());
                        }
                    }
                }
                VirtualMemberStatisticsView virtualMemberStatisticsView = VirtualMemberDataActivity.this.getVirtualMemberStatisticsView();
                Intrinsics.checkNotNull(virtualMemberStatisticsView);
                if (virtualMemberStatisticsView.getIsSelectedItem()) {
                    return;
                }
                VirtualMemberStatisticsView virtualMemberStatisticsView2 = VirtualMemberDataActivity.this.getVirtualMemberStatisticsView();
                Intrinsics.checkNotNull(virtualMemberStatisticsView2);
                if (virtualMemberStatisticsView2.canUpdate()) {
                    Logger.i("VirtualMemberDataActivity initData() virtualMemberStatisticsView refreshWeightData", new Object[0]);
                    VirtualAccount virtualAccount2 = VirtualMemberDataActivity.access$getMViewModel(VirtualMemberDataActivity.this).getVirtualAccount();
                    if (virtualAccount2 != null) {
                        VirtualMemberStatisticsView virtualMemberStatisticsView3 = VirtualMemberDataActivity.this.getVirtualMemberStatisticsView();
                        Intrinsics.checkNotNull(virtualMemberStatisticsView3);
                        virtualMemberStatisticsView3.refreshWeightData(virtualAccount2);
                    }
                }
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initTab() {
        final UserDataViewModel userDataViewModel = (UserDataViewModel) getMViewModel();
        userDataViewModel.setTabList();
        int size = userDataViewModel.getMTabTitles().size();
        for (final int i = 0; i < size; i++) {
            FilterSortView.TabView tabViewK = ((tk0) getMBinding()).B.k(userDataViewModel.getMTabTitles().get(i));
            userDataViewModel.getTabViewMap().put(Integer.valueOf(i), tabViewK);
            tabViewK.setOnClickListener(new View.OnClickListener() { // from class: pzq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VirtualMemberDataActivity.initTab$lambda$6$lambda$5(userDataViewModel, i, this, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initTab$lambda$6$lambda$5(UserDataViewModel this_with, int i, VirtualMemberDataActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this_with.setMPosition(i);
        if (i == 0) {
            ((tk0) this$0.getMBinding()).H.setCurrentItem(0);
        } else {
            if (i != 1) {
                return;
            }
            ((tk0) this$0.getMBinding()).H.setCurrentItem(1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        setActionBarDisplayable(false);
        final tk0 tk0Var = (tk0) getMBinding();
        tk0Var.G.setShareImgVisible(8);
        ((tk0) getMBinding()).G.bindData(getResources().getString(zzi.A));
        ((tk0) getMBinding()).G.setTitleClickable(true);
        tk0Var.G.setOnTitleBarClickListener(this);
        VirtualMemberDayView virtualMemberDayView = new VirtualMemberDayView(this);
        this.virtualMemberDayView = virtualMemberDayView;
        virtualMemberDayView.setIsSelectedTop(this.isSelectTop);
        VirtualMemberStatisticsView virtualMemberStatisticsView = new VirtualMemberStatisticsView(this);
        this.virtualMemberStatisticsView = virtualMemberStatisticsView;
        Intrinsics.checkNotNull(virtualMemberStatisticsView);
        virtualMemberStatisticsView.setDataChangeListener(new VirtualMemberStatisticsView.DataChangeListener() { // from class: com.xiaomi.fitness.electronic.scale.VirtualMemberDataActivity$initView$1$1
            @Override // com.xiaomi.fitness.electronic.scale.widget.VirtualMemberStatisticsView.DataChangeListener
            public void onTimeChange(long start, long end) {
                this.this$0.refreshStaticsTitle(start, end);
            }
        });
        ArrayList arrayList = new ArrayList();
        VirtualMemberDayView virtualMemberDayView2 = this.virtualMemberDayView;
        Intrinsics.checkNotNull(virtualMemberDayView2);
        arrayList.add(virtualMemberDayView2);
        VirtualMemberStatisticsView virtualMemberStatisticsView2 = this.virtualMemberStatisticsView;
        Intrinsics.checkNotNull(virtualMemberStatisticsView2);
        arrayList.add(virtualMemberStatisticsView2);
        tk0Var.H.setAdapter(new q0r(arrayList));
        tk0Var.H.setCanSwipe(false);
        tk0Var.H.addOnPageChangeListener(new ViewPager.i() { // from class: com.xiaomi.fitness.electronic.scale.VirtualMemberDataActivity$initView$1$2
            @Override // androidx.viewpager.widget.ViewPager.i
            public void onPageScrollStateChanged(int state) {
            }

            @Override // androidx.viewpager.widget.ViewPager.i
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override // androidx.viewpager.widget.ViewPager.i
            public void onPageSelected(int position) {
                VirtualMemberDataActivity.access$getMViewModel(this.this$0).setMPosition(position);
                this.this$0.refreshDateStr();
                this.this$0.setFilterTab();
            }
        });
        initTab();
        setFilterTab();
        tk0Var.H.setCurrentItem(0);
        GalleryLayoutManager galleryLayoutManager = new GalleryLayoutManager(0);
        galleryLayoutManager.o(tk0Var.E, 0);
        tk0Var.E.setAdapter(this.mVirtualMemberAdapter);
        int i = tk0Var.E.getContext().getResources().getDisplayMetrics().widthPixels;
        ViewGroup.LayoutParams layoutParams = tk0Var.E.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ConstraintLayout.LayoutParams) layoutParams).setMargins((-DisplayUtil.dip2px(50.0f)) - (i / 2), 0, 0, 0);
        galleryLayoutManager.setOnItemSelectedListener(new GalleryLayoutManager.d() { // from class: rzq
            @Override // com.xiaomi.fitness.electronic.scale.widget.gallery.GalleryLayoutManager.d
            public final void a(RecyclerView recyclerView, View view, int i2) {
                VirtualMemberDataActivity.initView$lambda$2$lambda$0(this.f33118a, recyclerView, view, i2);
            }
        });
        this.mVirtualMemberAdapter.setOnItemClickListener(new VirtualMemberAdapter.OnItemClickListener() { // from class: com.xiaomi.fitness.electronic.scale.VirtualMemberDataActivity$initView$1$4
            @Override // com.xiaomi.fitness.electronic.scale.adapter.VirtualMemberAdapter.OnItemClickListener
            public void onClick(VirtualAccount user, int i2) {
                Intrinsics.checkNotNullParameter(user, "user");
                VirtualMemberDataActivity.access$getMViewModel(this.this$0).setVirtualAccount(user);
                VirtualAccount virtualAccount = VirtualMemberDataActivity.access$getMViewModel(this.this$0).getVirtualAccount();
                qal.c("onClick() accountId is " + (virtualAccount != null ? Long.valueOf(virtualAccount.getAccountId()) : null));
                tk0Var.E.smoothScrollToPosition(i2);
                VirtualMemberDataActivity virtualMemberDataActivity = this.this$0;
                VirtualAccount virtualAccount2 = VirtualMemberDataActivity.access$getMViewModel(virtualMemberDataActivity).getVirtualAccount();
                virtualMemberDataActivity.accountId = virtualAccount2 != null ? Long.valueOf(virtualAccount2.getAccountId()) : null;
            }
        });
        tk0Var.D.setOnClickListener(new View.OnClickListener() { // from class: szq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirtualMemberDataActivity.initView$lambda$2$lambda$1(this.f34137a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initView$lambda$2$lambda$0(VirtualMemberDataActivity this$0, RecyclerView recyclerView, View view, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((UserDataViewModel) this$0.getMViewModel()).setVirtualAccount(this$0.mVirtualMemberAdapter.getUsers().get(i));
        VirtualAccount virtualAccount = ((UserDataViewModel) this$0.getMViewModel()).getVirtualAccount();
        qal.c("onItemSelected() accountId is " + (virtualAccount != null ? Long.valueOf(virtualAccount.getAccountId()) : null));
        this$0.getWeightResultData();
        Intrinsics.checkNotNull(recyclerView);
        Intrinsics.checkNotNull(view);
        this$0.updateSelectedItem(recyclerView, view, i);
        VirtualAccount virtualAccount2 = ((UserDataViewModel) this$0.getMViewModel()).getVirtualAccount();
        this$0.accountId = virtualAccount2 != null ? Long.valueOf(virtualAccount2.getAccountId()) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2$lambda$1(VirtualMemberDataActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) UserManageActivity.class);
        intent.putExtra("did", this$0.did);
        this$0.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:9:0x0071  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void refreshDateStr() {
        if (((UserDataViewModel) getMViewModel()).getMPosition() == 0) {
            String dateYYYYMMddLocalFormat = TimeDateUtil.getDateYYYYMMddLocalFormat(((UserDataViewModel) getMViewModel()).getMillis());
            qal.c("refreshDateStr() " + dateYYYYMMddLocalFormat);
            String string = getResources().getString(zzi.A);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ((tk0) getMBinding()).G.bindData(string, dateYYYYMMddLocalFormat);
            ((tk0) getMBinding()).G.setTitleClickable(true);
            return;
        }
        VirtualMemberStatisticsView virtualMemberStatisticsView = this.virtualMemberStatisticsView;
        Intrinsics.checkNotNull(virtualMemberStatisticsView);
        if (virtualMemberStatisticsView.getStartTime() == 0) {
            VirtualMemberStatisticsView virtualMemberStatisticsView2 = this.virtualMemberStatisticsView;
            Intrinsics.checkNotNull(virtualMemberStatisticsView2);
            if (virtualMemberStatisticsView2.getEndTime() != 0) {
                VirtualMemberStatisticsView virtualMemberStatisticsView3 = this.virtualMemberStatisticsView;
                Intrinsics.checkNotNull(virtualMemberStatisticsView3);
                long startTime = virtualMemberStatisticsView3.getStartTime();
                VirtualMemberStatisticsView virtualMemberStatisticsView4 = this.virtualMemberStatisticsView;
                Intrinsics.checkNotNull(virtualMemberStatisticsView4);
                refreshStaticsTitle(startTime, virtualMemberStatisticsView4.getEndTime());
            }
        } else {
            VirtualMemberStatisticsView virtualMemberStatisticsView5 = this.virtualMemberStatisticsView;
            Intrinsics.checkNotNull(virtualMemberStatisticsView5);
            long startTime2 = virtualMemberStatisticsView5.getStartTime();
            VirtualMemberStatisticsView virtualMemberStatisticsView6 = this.virtualMemberStatisticsView;
            Intrinsics.checkNotNull(virtualMemberStatisticsView6);
            refreshStaticsTitle(startTime2, virtualMemberStatisticsView6.getEndTime());
        }
        ((tk0) getMBinding()).G.setTitleClickable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setFilterTab() {
        FilterSortView.TabView tabView;
        UserDataViewModel userDataViewModel = (UserDataViewModel) getMViewModel();
        if (userDataViewModel.getMPosition() >= userDataViewModel.getTabViewMap().size() || (tabView = userDataViewModel.getTabViewMap().get(Integer.valueOf(userDataViewModel.getMPosition()))) == null) {
            return;
        }
        ((tk0) getMBinding()).B.setFilteredTab(tabView);
    }

    private final void updateSelectedItem(RecyclerView recyclerView, View item, int position) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (position == i) {
                RecyclerView.d0 childViewHolder = recyclerView.getChildViewHolder(item);
                Intrinsics.checkNotNull(childViewHolder, "null cannot be cast to non-null type com.xiaomi.fitness.electronic.scale.adapter.VirtualMemberAdapter.ViewHolder");
                VirtualMemberAdapter.ViewHolder viewHolder = (VirtualMemberAdapter.ViewHolder) childViewHolder;
                Object tag = viewHolder.getIcon().getTag();
                Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Boolean");
                if (((Boolean) tag).booleanValue()) {
                    viewHolder.getIcon().setImageResource(lni.C);
                }
            } else {
                RecyclerView.d0 childViewHolder2 = recyclerView.getChildViewHolder(recyclerView.getChildAt(i));
                Intrinsics.checkNotNull(childViewHolder2, "null cannot be cast to non-null type com.xiaomi.fitness.electronic.scale.adapter.VirtualMemberAdapter.ViewHolder");
                VirtualMemberAdapter.ViewHolder viewHolder2 = (VirtualMemberAdapter.ViewHolder) childViewHolder2;
                Object tag2 = viewHolder2.getIcon().getTag();
                Intrinsics.checkNotNull(tag2, "null cannot be cast to non-null type kotlin.Boolean");
                if (((Boolean) tag2).booleanValue()) {
                    viewHolder2.getIcon().setImageResource(lni.B);
                }
            }
        }
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return gui.v;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return av1.f3479a;
    }

    @Nullable
    public final VirtualMemberDayView getVirtualMemberDayView() {
        return this.virtualMemberDayView;
    }

    @Nullable
    public final VirtualMemberStatisticsView getVirtualMemberStatisticsView() {
        return this.virtualMemberStatisticsView;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data == null) {
            qal.c("onActivityResult(),mSelectDate data is null");
        }
        Serializable serializableExtra = data != null ? data.getSerializableExtra("calendar_date") : null;
        LocalDate localDate = serializableExtra instanceof LocalDate ? (LocalDate) serializableExtra : null;
        if (resultCode != -1 || localDate == null) {
            return;
        }
        qal.c("onActivityResult(),mSelectDate" + localDate.getYear());
        this.curDate = localDate;
        getWeightResultData();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.electronic.scale.Hilt_VirtualMemberDataActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActionBarDisplayable(false);
        if (savedInstanceState != null) {
            this.curDate = (LocalDate) savedInstanceState.getSerializable("local_date");
            this.accountId = Long.valueOf(savedInstanceState.getLong("account_id", 0L));
            this.isSelectTop = savedInstanceState.getBoolean(VirtualMemberDataActivityKt.BUNDLE_PARAMS_SELECT_TOP, false);
            qal.c("recreate BUNDLE_PARAMS_LOCAL_DATE is===== " + this.curDate.getYear() + "," + this.curDate.getMonthOfYear() + "," + this.curDate.getDayOfMonth());
        } else if (getIntent() != null) {
            Bundle extras = getIntent().getExtras();
            this.curDate = (LocalDate) (extras != null ? extras.getSerializable("local_date") : null);
            this.accountId = extras != null ? Long.valueOf(extras.getLong("account_id", 0L)) : null;
            this.isSelectTop = extras != null && extras.getBoolean(VirtualMemberDataActivityKt.BUNDLE_PARAMS_SELECT_TOP);
            if (Intrinsics.areEqual(extras != null ? Boolean.valueOf(extras.getBoolean("showNoBodyFatErrorDialog", false)) : null, Boolean.TRUE)) {
                EcoDialogHelper ecoShareDialogExtKt = EcoShareDialogExtKt.getInstance(EcoDialogHelper.INSTANCE);
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.view.BaseActivity");
                ecoShareDialogExtKt.showWeightErrorDialog(this, 1);
            }
            qal.c("BUNDLE_PARAMS_LOCAL_DATE is===== " + this.curDate.getYear() + "," + this.curDate.getMonthOfYear() + "," + this.curDate.getDayOfMonth());
        }
        ((UserDataViewModel) getMViewModel()).updateDate(this.curDate.getYear(), this.curDate.getMonthOfYear(), this.curDate.getDayOfMonth());
        initView();
        initData();
        if (ld8.c().j(this)) {
            return;
        }
        ld8.c().p(this);
    }

    @Override // com.xiaomi.fitness.electronic.scale.Hilt_VirtualMemberDataActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (ld8.c().j(this)) {
            ld8.c().r(this);
        }
    }

    @Override // defpackage.yaa
    public void onFragmentResult(int requestCode, int resultCode, @NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
        VirtualMemberStatisticsView virtualMemberStatisticsView = this.virtualMemberStatisticsView;
        if (virtualMemberStatisticsView != null) {
            virtualMemberStatisticsView.onFragmentResult(requestCode, resultCode, data);
        }
    }

    @Override // defpackage.fah
    public void onImgBackClick(@Nullable View view) {
        finish();
    }

    @Override // defpackage.fah
    public void onImgShareClick(@Nullable View view) {
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putSerializable("local_date", this.curDate);
        Long l = this.accountId;
        Intrinsics.checkNotNull(l);
        outState.putLong("account_id", l.longValue());
    }

    @Override // defpackage.fah
    public void onShowCalendar() {
        Bundle bundleCreateBundleForCalendar = createBundleForCalendar();
        expandBundle(bundleCreateBundleForCalendar);
        kb.c().a("/common/calendar/CalendarActivity").with(bundleCreateBundleForCalendar).navigation(this, 10010);
    }

    @uno(threadMode = ThreadMode.MAIN)
    public final void refreshData(@NotNull ScaleEventBusIds.OnUserAddEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        getVirtualAccount();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void refreshStaticsTitle(long startTime, long endTime) {
        if (((UserDataViewModel) getMViewModel()).getMPosition() == 0) {
            return;
        }
        String string = getResources().getString(zzi.A);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s-%s", Arrays.copyOf(new Object[]{TimeDateUtil.getDateYYYYMMddLocalFormat(startTime), TimeDateUtil.getDateYYYYMMddLocalFormat(endTime)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        qal.c("refreshDateStr() " + str);
        ((tk0) getMBinding()).G.bindData(string, str);
    }

    @uno(threadMode = ThreadMode.MAIN)
    public final void refreshWeightResultData(@NotNull ScaleEventBusIds.RefreshWeightResultData event) {
        Intrinsics.checkNotNullParameter(event, "event");
        getWeightResultData();
    }

    public final void setVirtualMemberDayView(@Nullable VirtualMemberDayView virtualMemberDayView) {
        this.virtualMemberDayView = virtualMemberDayView;
    }

    public final void setVirtualMemberStatisticsView(@Nullable VirtualMemberStatisticsView virtualMemberStatisticsView) {
        this.virtualMemberStatisticsView = virtualMemberStatisticsView;
    }

    @uno(threadMode = ThreadMode.MAIN)
    public final void refreshData(@NotNull ScaleEventBusIds.OnUserModifyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        getVirtualAccount();
    }

    @uno(threadMode = ThreadMode.MAIN)
    public final void refreshData(@NotNull ScaleEventBusIds.OnUserDeleteEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        getVirtualAccount();
    }
}
