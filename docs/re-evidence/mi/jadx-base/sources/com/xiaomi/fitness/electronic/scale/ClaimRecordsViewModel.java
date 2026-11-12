package com.xiaomi.fitness.electronic.scale;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fit.data.common.data.annotation.SportDataTypeKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.electronic.scale.ClaimRecordsViewModel;
import com.xiaomi.fitness.electronic.scale.data.ClaimRecord;
import com.xiaomi.fitness.electronic.scale.data.DeleteByDidAndCreateTimeBean;
import com.xiaomi.fitness.electronic.scale.export.bean.ProxyResponse;
import com.xiaomi.fitness.electronic.scale.export.bean.ScaleData;
import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import com.xiaomi.fitness.electronic.scale.manager.ClaimRecordHelper;
import com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel;
import com.xiaomi.fitness.electronic.scale.request.ScaleRequest;
import com.xiaomi.fitness.net.response.ApiException;
import defpackage.bu7;
import defpackage.f4b;
import defpackage.qal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001OB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u0006\u00102\u001a\u00020/J$\u00103\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f05\u0018\u0001042\u0006\u00106\u001a\u00020\u0005H\u0002J\u0014\u00107\u001a\u00020/2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$J\u0014\u00108\u001a\u00020/2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$J\u000e\u00109\u001a\u00020/2\u0006\u0010:\u001a\u00020;J\u0014\u0010<\u001a\u00020/2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020%0$J-\u0010>\u001a\u00020/2\u0006\u0010:\u001a\u00020;2\u0016\u0010=\u001a\u0012\u0012\u0004\u0012\u00020%0@j\b\u0012\u0004\u0012\u00020%`?H\u0002¢\u0006\u0002\u0010AJ$\u0010B\u001a\u00020/2\u0006\u0010:\u001a\u00020;2\u0006\u0010C\u001a\u00020\f2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020/0EJ\u001c\u0010F\u001a\u00020/2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020H0$2\u0006\u0010I\u001a\u00020JJ\u0016\u0010K\u001a\u00020/2\u0006\u0010:\u001a\u00020;2\u0006\u0010L\u001a\u00020MJ\u000e\u0010N\u001a\u00020/2\u0006\u0010:\u001a\u00020;R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\tR\u000e\u0010\u001b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R&\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010 \"\u0004\b'\u0010\"R&\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010 \"\u0004\b*\u0010\"R&\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010 \"\u0004\b-\u0010\"¨\u0006P"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/ClaimRecordsViewModel;", "Lcom/xiaomi/fitness/electronic/scale/model/ElectronicScaleBaseViewModel;", "<init>", "()V", "virtualUserCount", "", "getVirtualUserCount", "()I", "setVirtualUserCount", "(I)V", "mapVirtualAccount", "", "", "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "getMapVirtualAccount", "()Ljava/util/Map;", "setMapVirtualAccount", "(Ljava/util/Map;)V", "scaleRequest", "Lcom/xiaomi/fitness/electronic/scale/request/ScaleRequest;", "getScaleRequest", "()Lcom/xiaomi/fitness/electronic/scale/request/ScaleRequest;", "setScaleRequest", "(Lcom/xiaomi/fitness/electronic/scale/request/ScaleRequest;)V", "page", "getPage", "setPage", SportDataTypeKt.DIMEN_TOTAL, "hasNext", "Landroidx/lifecycle/MutableLiveData;", "", "getHasNext", "()Landroidx/lifecycle/MutableLiveData;", "setHasNext", "(Landroidx/lifecycle/MutableLiveData;)V", "mClaimRecords", "", "Lcom/xiaomi/fitness/electronic/scale/data/ClaimRecord;", "getMClaimRecords", "setMClaimRecords", "mWeekClaimRecords", "getMWeekClaimRecords", "setMWeekClaimRecords", "mMoreClaimRecords", "getMMoreClaimRecords", "setMMoreClaimRecords", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "loadMoreData", "getWeekStartAndEnd", "", "Lkotlin/Pair;", "week", "getWeekData", "getMoreData", "getClaimedRecords", "did", "", "removeClaimedRecords", "list", "addWithDb", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "(Ljava/lang/String;Ljava/util/ArrayList;)V", "deleteClaimedRecordInDb", "createTime", "callBack", "Lkotlin/Function0;", "deleteByDidAndCreateTime", "delList", "Lcom/xiaomi/fitness/electronic/scale/data/DeleteByDidAndCreateTimeBean;", "onDelListener", "Lcom/xiaomi/fitness/electronic/scale/ClaimRecordsViewModel$OnDeleteByDidAndCreateTimeListener;", "getAllVirtualAccount", "onVirtualAccountListener", "Lcom/xiaomi/fitness/electronic/scale/model/ElectronicScaleBaseViewModel$OnVirtualAccountListener;", "initVirtualAccount", "OnDeleteByDidAndCreateTimeListener", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nClaimRecordsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClaimRecordsViewModel.kt\ncom/xiaomi/fitness/electronic/scale/ClaimRecordsViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,230:1\n1062#2:231\n1863#2,2:232\n1863#2,2:234\n*S KotlinDebug\n*F\n+ 1 ClaimRecordsViewModel.kt\ncom/xiaomi/fitness/electronic/scale/ClaimRecordsViewModel\n*L\n149#1:231\n195#1:232,2\n216#1:234,2\n*E\n"})
public final class ClaimRecordsViewModel extends ElectronicScaleBaseViewModel {
    public ScaleRequest scaleRequest;
    private int total;
    private int virtualUserCount;

    @NotNull
    private Map<Long, VirtualAccount> mapVirtualAccount = new LinkedHashMap();
    private int page = 1;

    @NotNull
    private MutableLiveData<Boolean> hasNext = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<List<ClaimRecord>> mClaimRecords = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<List<ClaimRecord>> mWeekClaimRecords = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<List<ClaimRecord>> mMoreClaimRecords = new MutableLiveData<>();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/ClaimRecordsViewModel$OnDeleteByDidAndCreateTimeListener;", "", "onSuccess", "", "onError", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnDeleteByDidAndCreateTimeListener {
        void onError();

        void onSuccess();
    }

    private final void addWithDb(String did, final ArrayList<ClaimRecord> list) {
        ClaimRecordHelper.INSTANCE.queryByDid(did, new Function1() { // from class: oz3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ClaimRecordsViewModel.addWithDb$lambda$3(list, this, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addWithDb$lambda$3(ArrayList list, ClaimRecordsViewModel this$0, List it) {
        Intrinsics.checkNotNullParameter(list, "$list");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        list.addAll(it);
        List<ClaimRecord> listSortedWith = CollectionsKt___CollectionsKt.sortedWith(list, new Comparator() { // from class: com.xiaomi.fitness.electronic.scale.ClaimRecordsViewModel$addWithDb$lambda$3$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((ClaimRecord) t2).getCreateTime()), Long.valueOf(((ClaimRecord) t).getCreateTime()));
            }
        });
        if (listSortedWith.size() > 60) {
            listSortedWith = listSortedWith.subList(0, 60);
        }
        this$0.mClaimRecords.setValue(listSortedWith);
        this$0.hasNext.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteByDidAndCreateTime$lambda$5(OnDeleteByDidAndCreateTimeListener onDelListener, ScaleData it) {
        Intrinsics.checkNotNullParameter(onDelListener, "$onDelListener");
        Intrinsics.checkNotNullParameter(it, "it");
        JSONObject jSONObject = new JSONObject(it.getResp());
        jSONObject.optInt("code");
        jSONObject.optString("message");
        jSONObject.optString("data");
        qal.c("deleteByDidAndCreateTime result is " + jSONObject);
        onDelListener.onSuccess();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteByDidAndCreateTime$lambda$6(OnDeleteByDidAndCreateTimeListener onDelListener, ApiException it) {
        Intrinsics.checkNotNullParameter(onDelListener, "$onDelListener");
        Intrinsics.checkNotNullParameter(it, "it");
        onDelListener.onError();
        qal.c("getClaimedRecords it " + it.getErrorCode() + "  " + it.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteClaimedRecordInDb$lambda$4(String did, long j, Function0 callBack) {
        Intrinsics.checkNotNullParameter(did, "$did");
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        qal.c("deleteClaimedRecordInDb success did : " + did + "  createTime : " + j);
        callBack.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAllVirtualAccount$lambda$8(ClaimRecordsViewModel this$0, ElectronicScaleBaseViewModel.OnVirtualAccountListener onVirtualAccountListener, ProxyResponse it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(onVirtualAccountListener, "$onVirtualAccountListener");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(ElectronicScaleBaseViewModel.TAG, "getAllVirtualAccount it " + f4b.c(it));
        List<VirtualAccount> list = (List) it.getResult();
        if (list != null) {
            for (VirtualAccount virtualAccount : list) {
                this$0.mapVirtualAccount.put(Long.valueOf(Long.parseLong(String.valueOf(virtualAccount.getAccountId()).subSequence(0, 12).toString())), virtualAccount);
                onVirtualAccountListener.onVirtualAccount(virtualAccount);
            }
        }
        List list2 = (List) it.getResult();
        Integer numValueOf = list2 != null ? Integer.valueOf(list2.size()) : null;
        Intrinsics.checkNotNull(numValueOf);
        int iIntValue = numValueOf.intValue();
        this$0.virtualUserCount = iIntValue;
        Logger.i(ElectronicScaleBaseViewModel.TAG, "getAllVirtualAccount virtualUserCount " + iIntValue);
        onVirtualAccountListener.onFinishVirtualAccount();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAllVirtualAccount$lambda$9(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(ElectronicScaleBaseViewModel.TAG, "initVirtualAccount it " + it.getErrorCode() + "  " + it.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getClaimedRecords$lambda$0(ClaimRecordsViewModel this$0, String did, ScaleData it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(did, "$did");
        Intrinsics.checkNotNullParameter(it, "it");
        JSONObject jSONObject = new JSONObject(it.getResp());
        jSONObject.optInt("code");
        jSONObject.optString("message");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
        ArrayList<ClaimRecord> arrayList = new ArrayList<>();
        if (jSONArrayOptJSONArray != null) {
            List listB = bu7.b(jSONArrayOptJSONArray.toString(), ClaimRecord.class);
            Intrinsics.checkNotNull(listB, "null cannot be cast to non-null type java.util.ArrayList<com.xiaomi.fitness.electronic.scale.data.ClaimRecord>");
            arrayList = (ArrayList) listB;
        }
        qal.c("getClaimedRecords data " + jSONArrayOptJSONArray);
        this$0.addWithDb(did, arrayList);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getClaimedRecords$lambda$1(ClaimRecordsViewModel this$0, String did, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(did, "$did");
        Intrinsics.checkNotNullParameter(it, "it");
        qal.c("getClaimedRecords it " + it.getErrorCode() + "  " + it.getMessage());
        this$0.addWithDb(did, new ArrayList<>());
        return Unit.INSTANCE;
    }

    private final List<Pair<Long, Long>> getWeekStartAndEnd(int week) {
        ArrayList arrayList = new ArrayList();
        LocalDate localDateWithMinimumValue = new LocalDate(new DateTime().plusWeeks(week)).dayOfWeek().withMinimumValue();
        Date date = localDateWithMinimumValue.toDate();
        Intrinsics.checkNotNullExpressionValue(date, "toDate(...)");
        Date date2 = localDateWithMinimumValue.plusDays(7).toDate();
        Intrinsics.checkNotNullExpressionValue(date2, "toDate(...)");
        arrayList.add(new Pair(Long.valueOf(date.getTime()), Long.valueOf(date2.getTime())));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initVirtualAccount$lambda$11(ClaimRecordsViewModel this$0, ProxyResponse it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        List<VirtualAccount> list = (List) it.getResult();
        if (list != null) {
            for (VirtualAccount virtualAccount : list) {
                this$0.mapVirtualAccount.put(Long.valueOf(virtualAccount.getAccountId()), virtualAccount);
            }
        }
        List list2 = (List) it.getResult();
        Integer numValueOf = list2 != null ? Integer.valueOf(list2.size()) : null;
        Intrinsics.checkNotNull(numValueOf);
        int iIntValue = numValueOf.intValue();
        this$0.virtualUserCount = iIntValue;
        Logger.i(ElectronicScaleBaseViewModel.TAG, "initVirtualAccount virtualUserCount " + iIntValue);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initVirtualAccount$lambda$12(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(ElectronicScaleBaseViewModel.TAG, "initVirtualAccount it " + it.getErrorCode() + "  " + it.getMessage());
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.electronic.scale.model.ElectronicScaleBaseViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void deleteByDidAndCreateTime(@NotNull List<DeleteByDidAndCreateTimeBean> delList, @NotNull final OnDeleteByDidAndCreateTimeListener onDelListener) throws JSONException {
        Intrinsics.checkNotNullParameter(delList, "delList");
        Intrinsics.checkNotNullParameter(onDelListener, "onDelListener");
        getScaleRequest().deleteByDidAndCreateTimeParamsList(ViewModelKt.getViewModelScope(this), delList, new Function1() { // from class: jz3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ClaimRecordsViewModel.deleteByDidAndCreateTime$lambda$5(onDelListener, (ScaleData) obj);
            }
        }, new Function1() { // from class: kz3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ClaimRecordsViewModel.deleteByDidAndCreateTime$lambda$6(onDelListener, (ApiException) obj);
            }
        });
    }

    public final void deleteClaimedRecordInDb(@NotNull final String did, final long createTime, @NotNull final Function0<Unit> callBack) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        ClaimRecordHelper.INSTANCE.deleteClaimRecord(did, createTime, new Function0() { // from class: lz3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClaimRecordsViewModel.deleteClaimedRecordInDb$lambda$4(did, createTime, callBack);
            }
        });
    }

    public final void getAllVirtualAccount(@NotNull String did, @NotNull final ElectronicScaleBaseViewModel.OnVirtualAccountListener onVirtualAccountListener) throws JSONException {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(onVirtualAccountListener, "onVirtualAccountListener");
        new ScaleRequest().getVirtualAccount(ViewModelKt.getViewModelScope(this), Long.parseLong(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId()), did, new Function1() { // from class: mz3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ClaimRecordsViewModel.getAllVirtualAccount$lambda$8(this.f27362a, onVirtualAccountListener, (ProxyResponse) obj);
            }
        }, new Function1() { // from class: nz3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ClaimRecordsViewModel.getAllVirtualAccount$lambda$9((ApiException) obj);
            }
        });
    }

    public final void getClaimedRecords(@NotNull final String did) throws JSONException {
        Intrinsics.checkNotNullParameter(did, "did");
        getScaleRequest().getClaimedRecords(ViewModelKt.getViewModelScope(this), did, new Function1() { // from class: pz3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ClaimRecordsViewModel.getClaimedRecords$lambda$0(this.f30925a, did, (ScaleData) obj);
            }
        }, new Function1() { // from class: qz3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ClaimRecordsViewModel.getClaimedRecords$lambda$1(this.f32005a, did, (ApiException) obj);
            }
        });
    }

    @NotNull
    public final MutableLiveData<Boolean> getHasNext() {
        return this.hasNext;
    }

    @NotNull
    public final MutableLiveData<List<ClaimRecord>> getMClaimRecords() {
        return this.mClaimRecords;
    }

    @NotNull
    public final MutableLiveData<List<ClaimRecord>> getMMoreClaimRecords() {
        return this.mMoreClaimRecords;
    }

    @NotNull
    public final MutableLiveData<List<ClaimRecord>> getMWeekClaimRecords() {
        return this.mWeekClaimRecords;
    }

    @NotNull
    public final Map<Long, VirtualAccount> getMapVirtualAccount() {
        return this.mapVirtualAccount;
    }

    public final void getMoreData(@NotNull List<ClaimRecord> mClaimRecords) {
        Intrinsics.checkNotNullParameter(mClaimRecords, "mClaimRecords");
        List<Pair<Long, Long>> weekStartAndEnd = getWeekStartAndEnd(0);
        List<Pair<Long, Long>> list = weekStartAndEnd;
        if (list == null || list.isEmpty() || !(!mClaimRecords.isEmpty())) {
            this.mMoreClaimRecords.setValue(mClaimRecords);
        } else {
            ArrayList arrayList = new ArrayList();
            long jLongValue = weekStartAndEnd.get(0).getFirst().longValue();
            long jLongValue2 = ((Number) ((Pair) CollectionsKt___CollectionsKt.last((List) weekStartAndEnd)).getSecond()).longValue();
            qal.c("startTime===== it " + jLongValue);
            qal.c("endTime===== it " + jLongValue2);
            for (ClaimRecord claimRecord : mClaimRecords) {
                long j = 1 + jLongValue;
                long createTime = claimRecord.getCreateTime();
                if (j > createTime || createTime >= jLongValue2) {
                    arrayList.add(claimRecord);
                }
            }
            this.mMoreClaimRecords.setValue(arrayList);
            qal.c("getMoreData()" + f4b.c(arrayList));
        }
        this.hasNext.setValue(Boolean.FALSE);
    }

    public final int getPage() {
        return this.page;
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

    public final int getVirtualUserCount() {
        return this.virtualUserCount;
    }

    public final void getWeekData(@NotNull List<ClaimRecord> mClaimRecords) {
        Intrinsics.checkNotNullParameter(mClaimRecords, "mClaimRecords");
        List<Pair<Long, Long>> weekStartAndEnd = getWeekStartAndEnd(0);
        List<Pair<Long, Long>> list = weekStartAndEnd;
        if (list == null || list.isEmpty() || !(!mClaimRecords.isEmpty())) {
            this.mWeekClaimRecords.setValue(new ArrayList());
        } else {
            ArrayList arrayList = new ArrayList();
            long jLongValue = weekStartAndEnd.get(0).getFirst().longValue();
            long jLongValue2 = ((Number) ((Pair) CollectionsKt___CollectionsKt.last((List) weekStartAndEnd)).getSecond()).longValue();
            for (ClaimRecord claimRecord : mClaimRecords) {
                long j = 1 + jLongValue;
                long createTime = claimRecord.getCreateTime();
                if (j <= createTime && createTime < jLongValue2) {
                    arrayList.add(claimRecord);
                }
            }
            this.mWeekClaimRecords.setValue(arrayList);
            qal.c("getWeekData()" + f4b.c(arrayList));
        }
        this.hasNext.setValue(Boolean.FALSE);
    }

    public final void initVirtualAccount(@NotNull String did) throws JSONException {
        Intrinsics.checkNotNullParameter(did, "did");
        new ScaleRequest().getVirtualAccount(ViewModelKt.getViewModelScope(this), Long.parseLong(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId()), did, new Function1() { // from class: hz3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ClaimRecordsViewModel.initVirtualAccount$lambda$11(this.f20613a, (ProxyResponse) obj);
            }
        }, new Function1() { // from class: iz3
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ClaimRecordsViewModel.initVirtualAccount$lambda$12((ApiException) obj);
            }
        });
    }

    public final void loadMoreData() {
        this.hasNext.setValue(Boolean.FALSE);
    }

    public final void removeClaimedRecords(@NotNull List<ClaimRecord> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = ListExtKt.toArrayList(this.mClaimRecords.getValue());
        if (arrayList != null) {
            arrayList.removeAll(list);
        }
        this.mClaimRecords.setValue(arrayList);
    }

    public final void setHasNext(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.hasNext = mutableLiveData;
    }

    public final void setMClaimRecords(@NotNull MutableLiveData<List<ClaimRecord>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mClaimRecords = mutableLiveData;
    }

    public final void setMMoreClaimRecords(@NotNull MutableLiveData<List<ClaimRecord>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mMoreClaimRecords = mutableLiveData;
    }

    public final void setMWeekClaimRecords(@NotNull MutableLiveData<List<ClaimRecord>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mWeekClaimRecords = mutableLiveData;
    }

    public final void setMapVirtualAccount(@NotNull Map<Long, VirtualAccount> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.mapVirtualAccount = map;
    }

    public final void setPage(int i) {
        this.page = i;
    }

    public final void setScaleRequest(@NotNull ScaleRequest scaleRequest) {
        Intrinsics.checkNotNullParameter(scaleRequest, "<set-?>");
        this.scaleRequest = scaleRequest;
    }

    public final void setVirtualUserCount(int i) {
        this.virtualUserCount = i;
    }
}
