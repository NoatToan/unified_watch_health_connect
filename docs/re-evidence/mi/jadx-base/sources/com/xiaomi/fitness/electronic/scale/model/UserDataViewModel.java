package com.xiaomi.fitness.electronic.scale.model;

import android.os.Bundle;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.electronic.scale.export.bean.ProxyResponse;
import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import com.xiaomi.fitness.electronic.scale.model.UserDataViewModel;
import com.xiaomi.fitness.electronic.scale.request.ScaleRequest;
import com.xiaomi.fitness.electronic.scale.util.DateUtil;
import com.xiaomi.fitness.net.response.ApiException;
import defpackage.qal;
import defpackage.zzi;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import miuix.miuixbasewidget.widget.FilterSortView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001e\u0010&\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001bJ\u0006\u0010'\u001a\u00020(J\u001e\u0010'\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u001bJ\u0006\u0010+\u001a\u00020\u000fJ6\u0010\u0016\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020(2\u001e\u0010.\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150100\u0012\u0004\u0012\u00020\u00050/J\u0006\u0010A\u001a\u00020\u0005R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\u001a\u0010#\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR&\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020403X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u00109\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001d\"\u0004\b;\u0010\u001fR \u0010<\u001a\b\u0012\u0004\u0012\u00020(01X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/model/UserDataViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "scaleRequest", "Lcom/xiaomi/fitness/electronic/scale/request/ScaleRequest;", "getScaleRequest", "()Lcom/xiaomi/fitness/electronic/scale/request/ScaleRequest;", "setScaleRequest", "(Lcom/xiaomi/fitness/electronic/scale/request/ScaleRequest;)V", "userId", "", "getUserId", "()J", "userId$delegate", "Lkotlin/Lazy;", "virtualAccount", "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "getVirtualAccount", "()Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "setVirtualAccount", "(Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;)V", "year", "", "getYear", "()I", "setYear", "(I)V", "monthOfYear", "getMonthOfYear", "setMonthOfYear", "dayOfMonth", "getDayOfMonth", "setDayOfMonth", "updateDate", "getDateStr", "", "month", "day", "getMillis", "uid", "did", "callBack", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/electronic/scale/export/bean/ProxyResponse;", "", "tabViewMap", "", "Lmiuix/miuixbasewidget/widget/FilterSortView$TabView;", "getTabViewMap", "()Ljava/util/Map;", "setTabViewMap", "(Ljava/util/Map;)V", "mPosition", "getMPosition", "setMPosition", "mTabTitles", "getMTabTitles", "()Ljava/util/List;", "setMTabTitles", "(Ljava/util/List;)V", "setTabList", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserDataViewModel extends AbsViewModel {
    private int dayOfMonth;
    private int mPosition;
    private int monthOfYear;
    public ScaleRequest scaleRequest;

    @Nullable
    private VirtualAccount virtualAccount;
    private int year;

    /* JADX INFO: renamed from: userId$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy userId = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: kfq
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Long.valueOf(UserDataViewModel.userId_delegate$lambda$0());
        }
    });

    @NotNull
    private Map<Integer, FilterSortView.TabView> tabViewMap = new LinkedHashMap();

    @NotNull
    private List<String> mTabTitles = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getVirtualAccount$lambda$1(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        qal.c("getVirtualAccount it " + it.getErrorCode() + "  " + it.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long userId_delegate$lambda$0() {
        return Long.parseLong(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId());
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @NotNull
    public final String getDateStr() {
        return getDateStr(this.year, this.monthOfYear, this.dayOfMonth);
    }

    public final int getDayOfMonth() {
        return this.dayOfMonth;
    }

    public final int getMPosition() {
        return this.mPosition;
    }

    @NotNull
    public final List<String> getMTabTitles() {
        return this.mTabTitles;
    }

    public final long getMillis() {
        return DateUtil.INSTANCE.getZeroMills(new LocalDate(this.year, this.monthOfYear, this.dayOfMonth));
    }

    public final int getMonthOfYear() {
        return this.monthOfYear;
    }

    @NotNull
    public final ScaleRequest getScaleRequest() {
        ScaleRequest scaleRequest = this.scaleRequest;
        if (scaleRequest != null) {
            return scaleRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("scaleRequest");
        return null;
    }

    @NotNull
    public final Map<Integer, FilterSortView.TabView> getTabViewMap() {
        return this.tabViewMap;
    }

    public final long getUserId() {
        return ((Number) this.userId.getValue()).longValue();
    }

    @Nullable
    public final VirtualAccount getVirtualAccount() {
        return this.virtualAccount;
    }

    public final int getYear() {
        return this.year;
    }

    public final void setDayOfMonth(int i) {
        this.dayOfMonth = i;
    }

    public final void setMPosition(int i) {
        this.mPosition = i;
    }

    public final void setMTabTitles(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mTabTitles = list;
    }

    public final void setMonthOfYear(int i) {
        this.monthOfYear = i;
    }

    public final void setScaleRequest(@NotNull ScaleRequest scaleRequest) {
        Intrinsics.checkNotNullParameter(scaleRequest, "<set-?>");
        this.scaleRequest = scaleRequest;
    }

    public final void setTabList() {
        ArrayList arrayList = new ArrayList();
        this.mTabTitles = arrayList;
        ListExtKt.add(arrayList, ResourceExtKt.getString(zzi.i5));
        ListExtKt.add(this.mTabTitles, ResourceExtKt.getString(zzi.j5));
    }

    public final void setTabViewMap(@NotNull Map<Integer, FilterSortView.TabView> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.tabViewMap = map;
    }

    public final void setVirtualAccount(@Nullable VirtualAccount virtualAccount) {
        this.virtualAccount = virtualAccount;
    }

    public final void setYear(int i) {
        this.year = i;
    }

    public final void updateDate(int year, int monthOfYear, int dayOfMonth) {
        this.year = year;
        this.monthOfYear = monthOfYear;
        this.dayOfMonth = dayOfMonth;
    }

    @NotNull
    public final String getDateStr(int year, int month, int day) {
        DateUtil dateUtil = DateUtil.INSTANCE;
        return dateUtil.getDateToString(dateUtil.getZeroMills(new LocalDate(year, month, day)), "yyyyMMdd");
    }

    public final void getVirtualAccount(long uid, @NotNull String did, @NotNull Function1<? super ProxyResponse<List<VirtualAccount>>, Unit> callBack) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        getScaleRequest().getVirtualAccount(ViewModelKt.getViewModelScope(this), uid, did, callBack, new Function1() { // from class: jfq
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserDataViewModel.getVirtualAccount$lambda$1((ApiException) obj);
            }
        });
    }
}
