package com.huami.femalehealth.logiclib.manager;

import android.util.LruCache;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.ApiErrorResponse;
import com.huami.android.vo.ApiResponse;
import com.huami.android.vo.ApiSuccessResponse;
import com.huami.femalehealth.logiclib.api.FemaleHealthWebApi;
import com.huami.femalehealth.logiclib.api.WebConst;
import com.huami.femalehealth.logiclib.api.pojo.FirstUseInfoBean;
import com.huami.femalehealth.logiclib.api.pojo.HistoryDetailBean;
import com.huami.femalehealth.logiclib.api.pojo.HistoryItemBean;
import com.huami.femalehealth.logiclib.api.pojo.Items;
import com.huami.femalehealth.logiclib.db.FemaleHealthDb;
import com.huami.femalehealth.logiclib.db.dao.HistoryItemDao;
import com.huami.femalehealth.logiclib.helper.DateHelper;
import com.huami.femalehealth.logiclib.helper.FemaleHealthScopeNames;
import com.huami.tools.log.HMLog;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.qualifier.QualifierKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b7\u00108J+\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJI\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\u0006\u0010\u0016\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0014JA\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\b\b\u0002\u0010\r\u001a\u00020\fJ\u0006\u0010\u001b\u001a\u00020\u0014J\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u000eJ\u0006\u0010\u001e\u001a\u00020\u0014J\u001c\u0010\"\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 \u0018\u00010\u000e2\u0006\u0010\u001f\u001a\u00020\u0004R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010#R\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010%R\u001d\u0010+\u001a\u00020'8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R4\u00101\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0.0-0,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R$\u00102\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010.0,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u00100R4\u00103\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0.0-0,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u00100R\u0016\u00106\u001a\u0002048B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00105¨\u00069"}, d2 = {"Lcom/huami/femalehealth/logiclib/manager/DataCacheManager;", "Lorg/koin/core/component/KoinComponent;", "", "index", "", "next", "", WebConst.QueryParam.MONTHLY_STATISTICS, "e", "(ILjava/lang/String;Ljava/lang/Long;)Ljava/lang/String;", "limit", "key", "", "canGetCache", "Lcom/huami/android/vo/ApiResponse;", "Lcom/huami/femalehealth/logiclib/api/pojo/Items;", "Lcom/huami/femalehealth/logiclib/api/pojo/HistoryItemBean;", "f", "(ILjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Z)Lcom/huami/android/vo/ApiResponse;", "b", "", "a", "setHistoryChanged", "clear", "loadHistory", "(ILjava/lang/String;Ljava/lang/Long;Z)Lcom/huami/android/vo/ApiResponse;", "loadAllHistory", "setSettingChanged", "Lcom/huami/femalehealth/logiclib/api/pojo/FirstUseInfoBean;", "getFirstUseInfo", "setMensStatusChanged", "id", "", "Lcom/huami/femalehealth/logiclib/api/pojo/HistoryDetailBean;", "loadHistoryDetail", "Ljava/lang/String;", "TAG", LogUtil.I, "MAX_CACHE_SIZE", "Lcom/huami/femalehealth/logiclib/db/dao/HistoryItemDao;", "c", "Lkotlin/Lazy;", "()Lcom/huami/femalehealth/logiclib/db/dao/HistoryItemDao;", "historyItemDao", "Lcom/huami/femalehealth/logiclib/manager/DataCacheManager$a;", "Landroid/util/LruCache;", "Lcom/huami/android/vo/ApiSuccessResponse;", GoogleApiAvailabilityLight.a, "Lcom/huami/femalehealth/logiclib/manager/DataCacheManager$a;", "historyDataSetting", "userInfoDataSetting", "mensStatusDataSetting", "Lcom/huami/femalehealth/logiclib/api/FemaleHealthWebApi;", "()Lcom/huami/femalehealth/logiclib/api/FemaleHealthWebApi;", "webApi", "<init>", "()V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final class DataCacheManager implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "HistoryDataManager";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int MAX_CACHE_SIZE = 3;

    @NotNull
    public static final DataCacheManager INSTANCE = new DataCacheManager();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final Lazy historyItemDao = LazyKt__LazyJVMKt.lazy(c.a);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static NetDataSetting<LruCache<String, ApiSuccessResponse<Items<HistoryItemBean>>>> historyDataSetting = new NetDataSetting<>(new LruCache(3));

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static NetDataSetting<ApiSuccessResponse<FirstUseInfoBean>> userInfoDataSetting = new NetDataSetting<>(null);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static NetDataSetting<LruCache<String, ApiSuccessResponse<List<HistoryDetailBean>>>> mensStatusDataSetting = new NetDataSetting<>(new LruCache(3));

    /* JADX INFO: renamed from: com.huami.femalehealth.logiclib.manager.DataCacheManager$a, reason: from toString */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0003\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\b\b\u0002\u0010\u0005\u001a\u00028\u0000HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\"\u0010\u0005\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0004\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/huami/femalehealth/logiclib/manager/DataCacheManager$a", ExifInterface.GPS_DIRECTION_TRUE, "", "a", "()Ljava/lang/Object;", "data", "Lcom/huami/femalehealth/logiclib/manager/DataCacheManager$a;", "b", "(Ljava/lang/Object;)Lcom/huami/femalehealth/logiclib/manager/DataCacheManager$a;", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/Object;", GoogleApiAvailabilityLight.a, "e", "(Ljava/lang/Object;)V", "<init>", "logiclib_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class NetDataSetting<T> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private T data;

        public NetDataSetting(T t) {
            this.data = t;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NetDataSetting c(NetDataSetting netDataSetting, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = netDataSetting.data;
            }
            return netDataSetting.b(obj);
        }

        public final T a() {
            return this.data;
        }

        @NotNull
        public final NetDataSetting<T> b(T data) {
            return new NetDataSetting<>(data);
        }

        public final T d() {
            return this.data;
        }

        public final void e(T t) {
            this.data = t;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NetDataSetting) && Intrinsics.areEqual(this.data, ((NetDataSetting) other).data);
        }

        public int hashCode() {
            T t = this.data;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        @NotNull
        public String toString() {
            return "NetDataSetting(data=" + this.data + ')';
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("findLocalHistory error = ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/femalehealth/logiclib/db/dao/HistoryItemDao;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<HistoryItemDao> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HistoryItemDao invoke() {
            return ((FemaleHealthDb) DataCacheManager.INSTANCE.getKoin().getScope(FemaleHealthScopeNames.FEMALE_HEALTH).get(Reflection.getOrCreateKotlinClass(FemaleHealthDb.class), null, null)).historyItemDao();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("requestData key = ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "";
        }
    }

    private DataCacheManager() {
    }

    private final synchronized void a() {
        c().clear();
        historyDataSetting.e(new LruCache<>(3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ApiResponse<Items<HistoryItemBean>> b(int limit, String next) {
        int i;
        int i2 = 2;
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        if (next == null) {
            i = 1;
        } else {
            try {
                i = Integer.parseInt(next);
            } catch (Exception e2) {
                HMLog.error$default(null, null, null, new b(e2), 7, null);
                return new ApiSuccessResponse(new Items(CollectionsKt__CollectionsKt.emptyList(), (String) (objArr2 == true ? 1 : 0), i2, (DefaultConstructorMarker) (objArr == true ? 1 : 0)));
            }
        }
        int i3 = (i - 1) * limit;
        List<HistoryItemBean> listFindAll = c().findAll();
        if (listFindAll.size() < i3) {
            return new ApiSuccessResponse(new Items(CollectionsKt__CollectionsKt.emptyList(), str, i2, (DefaultConstructorMarker) (objArr7 == true ? 1 : 0)));
        }
        int i4 = limit + i3;
        return listFindAll.size() < i4 ? new ApiSuccessResponse(new Items((List) listFindAll.subList(i3, listFindAll.size()), (String) (objArr6 == true ? 1 : 0), i2, (DefaultConstructorMarker) (objArr5 == true ? 1 : 0))) : new ApiSuccessResponse(new Items((List) listFindAll.subList(i3, i4), (String) (objArr4 == true ? 1 : 0), i2, (DefaultConstructorMarker) (objArr3 == true ? 1 : 0)));
    }

    private final HistoryItemDao c() {
        return (HistoryItemDao) historyItemDao.getValue();
    }

    private final FemaleHealthWebApi d() {
        return (FemaleHealthWebApi) Koin.getOrCreateScope$default(getKoin(), FemaleHealthScopeNames.FEMALE_HEALTH, QualifierKt.named(FemaleHealthScopeNames.FEMALE_HEALTH), null, 4, null).get(Reflection.getOrCreateKotlinClass(FemaleHealthWebApi.class), null, null);
    }

    private final String e(int index, String next, Long monthlyStatistics) {
        StringBuilder sb = new StringBuilder(String.valueOf(index));
        if (next != null) {
            sb.append(next);
        }
        if (monthlyStatistics != null) {
            sb.append(monthlyStatistics.longValue());
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ApiResponse<Items<HistoryItemBean>> f(int limit, String next, Long monthlyStatistics, String key, boolean canGetCache) {
        HMLog.info(TAG, new d(key));
        ApiResponse<Items<HistoryItemBean>> apiResponseLoadHistory = d().loadHistory(limit, next, monthlyStatistics);
        if (apiResponseLoadHistory instanceof ApiSuccessResponse) {
            if (limit == Integer.MAX_VALUE) {
                for (HistoryItemBean historyItemBean : ((Items) ((ApiSuccessResponse) apiResponseLoadHistory).getBody()).getItems()) {
                    DateHelper dateHelper = DateHelper.INSTANCE;
                    historyItemBean.setMenstrualPeriod(dateHelper.resetHour(historyItemBean.getMenstrualPeriod()));
                    if (historyItemBean.getMenstrualEndTime() != null) {
                        historyItemBean.setMenstrualEndTime(Long.valueOf(dateHelper.resetHour(historyItemBean.getMenstrualEndTime().longValue())));
                    }
                }
                try {
                    c().addAll(((Items) ((ApiSuccessResponse) apiResponseLoadHistory).getBody()).getItems());
                } catch (Exception e2) {
                    HMLog.error$default(TAG, null, e2, e.a, 2, null);
                }
            }
            historyDataSetting.d().put(key, apiResponseLoadHistory);
        }
        return ((apiResponseLoadHistory instanceof ApiErrorResponse) && canGetCache && monthlyStatistics == null) ? b(limit, next) : apiResponseLoadHistory;
    }

    public static /* synthetic */ ApiResponse loadAllHistory$default(DataCacheManager dataCacheManager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return dataCacheManager.loadAllHistory(z);
    }

    public static /* synthetic */ ApiResponse loadHistory$default(DataCacheManager dataCacheManager, int i, String str, Long l, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            l = null;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        return dataCacheManager.loadHistory(i, str, l, z);
    }

    public final synchronized void clear() {
        a();
        setSettingChanged();
        setMensStatusChanged();
        c().clear();
    }

    @Nullable
    public final synchronized ApiResponse<FirstUseInfoBean> getFirstUseInfo() {
        ApiSuccessResponse<FirstUseInfoBean> apiSuccessResponseD;
        if (userInfoDataSetting.d() == null) {
            apiSuccessResponseD = d().getFirstUseInfo();
            if (apiSuccessResponseD instanceof ApiSuccessResponse) {
                userInfoDataSetting.e((ApiSuccessResponse<FirstUseInfoBean>) apiSuccessResponseD);
            }
        } else {
            apiSuccessResponseD = userInfoDataSetting.d();
        }
        return apiSuccessResponseD;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final synchronized ApiResponse<Items<HistoryItemBean>> loadAllHistory(boolean canGetCache) {
        return loadHistory$default(this, Integer.MAX_VALUE, null, null, canGetCache, 4, null);
    }

    @NotNull
    public final synchronized ApiResponse<Items<HistoryItemBean>> loadHistory(int limit, @Nullable String next, @Nullable Long monthlyStatistics, boolean canGetCache) {
        String strE;
        strE = e(limit, next, monthlyStatistics);
        return historyDataSetting.d().get(strE) != null ? historyDataSetting.d().get(strE) : f(limit, next, monthlyStatistics, strE, canGetCache);
    }

    @Nullable
    public final synchronized ApiResponse<List<HistoryDetailBean>> loadHistoryDetail(@NotNull String id) {
        if (mensStatusDataSetting.d().get(id) != null) {
            return mensStatusDataSetting.d().get(id);
        }
        ApiResponse<List<HistoryDetailBean>> apiResponseLoadHistoryDetail = d().loadHistoryDetail(id);
        if (apiResponseLoadHistoryDetail instanceof ApiSuccessResponse) {
            mensStatusDataSetting.d().put(id, apiResponseLoadHistoryDetail);
        }
        return apiResponseLoadHistoryDetail;
    }

    public final synchronized void setHistoryChanged() {
        a();
        setMensStatusChanged();
    }

    public final synchronized void setMensStatusChanged() {
        mensStatusDataSetting.e(new LruCache<>(3));
    }

    public final synchronized void setSettingChanged() {
        userInfoDataSetting.e(null);
    }
}
