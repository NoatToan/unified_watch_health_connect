package com.huami.health.statisticdata.webapi;

import com.huami.health.statisticdata.constants.DistributionTypeEnum;
import com.huami.health.statisticdata.model.StatisticDataModel;
import com.huami.http.ConverterKt;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitKtxKt;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.g;
import kotlin.collections.r;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002JI\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/huami/health/statisticdata/webapi/StatisticDataWebApiImpl;", "Lcom/huami/health/statisticdata/webapi/StatisticDataWebApi;", "Lcom/huami/http/HttpKit;", "", "userId", "Lcom/huami/health/statisticdata/constants/DistributionTypeEnum;", StatisticDataWebApiImpl.d, "a", "", StatisticDataWebApiImpl.e, "gender", "version", StatisticDataWebApiImpl.f, "", "Lcom/huami/health/statisticdata/model/StatisticDataModel;", "synStatisticDataFromServer", "(Lcom/huami/health/statisticdata/constants/DistributionTypeEnum;Ljava/lang/String;IIILjava/lang/Integer;)Ljava/util/List;", "<init>", "()V", "Companion", "statisticdata_release"}, k = 1, mv = {1, 4, 0})
public final class StatisticDataWebApiImpl implements StatisticDataWebApi, HttpKit {
    private static final String a = "StatisticDataWebApiImpl";
    private static final String b = "friend/common/datas";
    private static final String c = "userId";
    private static final String d = "distributionType";
    private static final String e = "ageGroup";
    private static final String f = "timeGroup";
    private static final String g = "gender";
    private static final String h = "location";
    private static final String i = "version";
    private static final String j = "categoryCount";
    private static final String k = "itemType";
    private static final String l = "needUpdate";
    private static final String m = "itemValues";
    private static final String n = "cy";
    private static final String o = "cnt";
    private static final String p = "sub";
    private static final String q = "DIST";

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 0})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DistributionTypeEnum.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[DistributionTypeEnum.BODY_HEIGHT.ordinal()] = 1;
            iArr[DistributionTypeEnum.BODY_WEIGHT.ordinal()] = 2;
            iArr[DistributionTypeEnum.SLEEP_SCORE_V2.ordinal()] = 3;
            iArr[DistributionTypeEnum.SLEEP_DEEP_DURATION.ordinal()] = 4;
            iArr[DistributionTypeEnum.SLEEP_START.ordinal()] = 5;
            iArr[DistributionTypeEnum.ACTIVITY_STEP_TTL.ordinal()] = 6;
            iArr[DistributionTypeEnum.ACTIVITY_TIME.ordinal()] = 7;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "invoke", "()Ljava/lang/String;", "com/huami/health/statisticdata/webapi/StatisticDataWebApiImpl$synStatisticDataFromServer$2$1", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;
        public final /* synthetic */ DistributionTypeEnum b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th, DistributionTypeEnum distributionTypeEnum, int i) {
            super(0);
            this.a = th;
            this.b = distributionTypeEnum;
            this.c = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return " Sync " + this.b + " (version=" + this.c + ") statistic data parse error ! Exceptions is : " + this.a;
        }
    }

    private final String a(String userId, DistributionTypeEnum distributionType) {
        String str = "bodydev";
        switch (WhenMappings.$EnumSwitchMapping$0[distributionType.ordinal()]) {
            case 1:
            case 2:
                break;
            case 3:
            case 4:
            case 5:
                str = "sleepData";
                break;
            case 6:
                str = "stepData";
                break;
            case 7:
                str = "activitytime";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return "friend/common/datas/" + userId + '/' + str;
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }

    @Override // com.huami.health.statisticdata.webapi.StatisticDataWebApi
    @Nullable
    public List<StatisticDataModel> synStatisticDataFromServer(@NotNull DistributionTypeEnum distributionType, @NotNull String userId, int ageGroup, int gender, int version, @Nullable Integer timeGroup) {
        Object objM3845constructorimpl;
        int i2 = 0;
        Map mapMutableMapOf = r.mutableMapOf(TuplesKt.to(d, distributionType.getTypeName()), TuplesKt.to(e, String.valueOf(ageGroup)), TuplesKt.to("gender", String.valueOf(gender)), TuplesKt.to("version", String.valueOf(version)), TuplesKt.to("sub", q));
        if (timeGroup != null) {
            mapMutableMapOf.put(f, String.valueOf(timeGroup.intValue()));
        }
        String strA = a(userId, distributionType);
        try {
            Result.Companion companion = Result.Companion;
            JSONObject jSONObject = new JSONObject(ConverterKt.responseToJsonStr(HttpKitKtxKt.httpGet$default(this, strA, mapMutableMapOf, null, 4, null)));
            if (!jSONObject.getBoolean(l)) {
                return null;
            }
            int i3 = jSONObject.getInt(e);
            Integer numValueOf = jSONObject.has(f) ? Integer.valueOf(jSONObject.getInt(f)) : null;
            int i4 = jSONObject.getInt("gender");
            String string = jSONObject.getString("location");
            int i5 = jSONObject.getInt(j);
            String string2 = jSONObject.getString(k);
            int i6 = jSONObject.getInt("version");
            JSONArray jSONArray = jSONObject.getJSONArray(m);
            ArrayList arrayList = new ArrayList();
            for (int length = jSONArray.length(); i2 < length; length = length) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                ArrayList arrayList2 = arrayList;
                arrayList2.add(new StatisticDataModel(i6, i3, numValueOf, string2, i4, (float) jSONObject2.getDouble(n), jSONObject2.getInt("cnt"), string, i5));
                i2++;
                arrayList = arrayList2;
            }
            ArrayList arrayList3 = arrayList;
            if (arrayList3.size() > 1) {
                g.sortWith(arrayList3, new Comparator<T>() { // from class: com.huami.health.statisticdata.webapi.StatisticDataWebApiImpl$$special$$inlined$sortBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt__ComparisonsKt.compareValues(Float.valueOf(((StatisticDataModel) t).getCategory()), Float.valueOf(((StatisticDataModel) t2).getCategory()));
                    }
                });
            }
            objM3845constructorimpl = Result.m3845constructorimpl(arrayList3);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.error$default(a, null, null, new a(thM3848exceptionOrNullimpl, distributionType, version), 6, null);
        }
        return (List) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
    }
}
