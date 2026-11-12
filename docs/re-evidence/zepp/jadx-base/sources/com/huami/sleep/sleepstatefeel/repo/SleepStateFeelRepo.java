package com.huami.sleep.sleepstatefeel.repo;

import android.text.TextUtils;
import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.Transformations;
import com.huami.sleep.R;
import com.huami.sleep.datasource.IManualDataSource;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.model.DataConstant;
import com.huami.sleep.model.SleepManualData;
import com.huami.sleep.sleepstatefeel.vo.MonthSleepStateFeelInfo;
import com.huami.sleep.sleepstatefeel.vo.MonthSleepStateFeelVo;
import com.huami.sleep.sleepstatefeel.vo.WeekSleepStateFeelVo;
import com.huami.sleep.util.PercentageCalculateUtil;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.dataprocess.SportDay;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.j;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ;\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00020\tj\b\u0012\u0004\u0012\u00020\u0002`\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ \u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J2\u0010\u0010\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\n0\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J(\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J(\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lcom/huami/sleep/sleepstatefeel/repo/SleepStateFeelRepo;", "Lcom/huami/sleep/sleepstatefeel/repo/ISleepStateFeelRepo;", "", "userId", "date", "feeling", "", "saveSelectFeeling", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "states", "saveSelectState", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/LiveData;", "getDaySleepFeelingData", "getDaySleepStateData", "startDate", "endDate", "Lcom/huami/sleep/sleepstatefeel/vo/WeekSleepStateFeelVo;", "getWeekStateFeelLiveData", "Lcom/huami/sleep/sleepstatefeel/vo/MonthSleepStateFeelVo;", "getMYStateFeelData", "Lcom/huami/sleep/datasource/IManualDataSource;", "a", "Lcom/huami/sleep/datasource/IManualDataSource;", ParamKey.dataSource, "b", "Ljava/lang/String;", "mTag", "<init>", "(Lcom/huami/sleep/datasource/IManualDataSource;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepStateFeelRepo implements ISleepStateFeelRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IManualDataSource dataSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String mTag = "SleepStateFeelRepo";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ List<SleepManualData> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, List<SleepManualData> list) {
            super(0);
            this.a = i;
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            int i = this.a;
            return i + " " + this.b.get(i).getSummary();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ List<SleepManualData> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i, List<SleepManualData> list) {
            super(0);
            this.a = i;
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            int i = this.a;
            return i + " " + this.b.get(i).getSummary();
        }
    }

    public SleepStateFeelRepo(@NotNull IManualDataSource iManualDataSource) {
        this.dataSource = iManualDataSource;
    }

    @Override // com.huami.sleep.sleepstatefeel.repo.ISleepStateFeelRepo
    @NotNull
    public LiveData<String> getDaySleepFeelingData(@NotNull String userId, @NotNull String date) {
        return Transformations.map(this.dataSource.getManualData(userId, date, date), new Function<List<? extends SleepManualData>, String>() { // from class: com.huami.sleep.sleepstatefeel.repo.SleepStateFeelRepo$getDaySleepFeelingData$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final String apply(List<? extends SleepManualData> list) {
                SleepManualData sleepManualData;
                String summary;
                String strOptString = "0";
                List<? extends SleepManualData> list2 = list;
                if (list2 == null || (sleepManualData = (SleepManualData) CollectionsKt.getOrNull(list2, 0)) == null || (summary = sleepManualData.getSummary()) == null) {
                    return null;
                }
                try {
                    strOptString = new JSONObject(summary).optString("sf", "0");
                } catch (Exception unused) {
                }
                return strOptString;
            }
        });
    }

    @Override // com.huami.sleep.sleepstatefeel.repo.ISleepStateFeelRepo
    @NotNull
    public LiveData<ArrayList<String>> getDaySleepStateData(@NotNull String userId, @NotNull String date) {
        return Transformations.map(this.dataSource.getManualData(userId, date, date), new Function<List<? extends SleepManualData>, ArrayList<String>>() { // from class: com.huami.sleep.sleepstatefeel.repo.SleepStateFeelRepo$getDaySleepStateData$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final ArrayList<String> apply(List<? extends SleepManualData> list) {
                String summary;
                JSONArray jSONArrayOptJSONArray;
                List<? extends SleepManualData> list2 = list;
                if (list2 == null) {
                    return null;
                }
                int i = 0;
                SleepManualData sleepManualData = (SleepManualData) CollectionsKt.getOrNull(list2, 0);
                if (sleepManualData == null || (summary = sleepManualData.getSummary()) == null) {
                    return null;
                }
                try {
                    JSONObject jSONObject = new JSONObject(summary);
                    if (jSONObject.has(DataConstant.KEY_SLEEP_STATE) && (jSONArrayOptJSONArray = jSONObject.optJSONArray(DataConstant.KEY_SLEEP_STATE)) != null) {
                        ArrayList<String> arrayList = new ArrayList<>();
                        int length = jSONArrayOptJSONArray.length();
                        if (length > 0) {
                            while (true) {
                                int i2 = i + 1;
                                arrayList.add(jSONArrayOptJSONArray.getString(i));
                                if (i2 >= length) {
                                    break;
                                }
                                i = i2;
                            }
                        }
                        return arrayList;
                    }
                    return null;
                } catch (Exception e) {
                    HMLog.error$default(this.a.mTag, null, null, new SleepStateFeelRepo.a(e), 6, null);
                    return null;
                }
            }
        });
    }

    @Override // com.huami.sleep.sleepstatefeel.repo.ISleepStateFeelRepo
    @NotNull
    public LiveData<MonthSleepStateFeelVo> getMYStateFeelData(@NotNull String userId, @NotNull final String startDate, @NotNull final String endDate) {
        return Transformations.map(this.dataSource.getManualData(userId, startDate, endDate), new Function<List<? extends SleepManualData>, MonthSleepStateFeelVo>() { // from class: com.huami.sleep.sleepstatefeel.repo.SleepStateFeelRepo$getMYStateFeelData$$inlined$map$1
            /* JADX WARN: Code duplicated, block: B:101:0x01ca A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:53:0x0111 A[LOOP:0: B:8:0x004a->B:53:0x0111, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:57:0x0133  */
            /* JADX WARN: Code duplicated, block: B:59:0x0145  */
            /* JADX WARN: Code duplicated, block: B:62:0x014f  */
            /* JADX WARN: Code duplicated, block: B:65:0x017a  */
            /* JADX WARN: Code duplicated, block: B:68:0x01a1  */
            /* JADX WARN: Code duplicated, block: B:72:0x01b6 A[LOOP:4: B:69:0x01a2->B:72:0x01b6, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:76:0x01d2  */
            /* JADX WARN: Code duplicated, block: B:78:0x01e5  */
            /* JADX WARN: Code duplicated, block: B:83:0x0219  */
            /* JADX WARN: Code duplicated, block: B:90:0x010f A[EDGE_INSN: B:90:0x010f->B:52:0x010f BREAK  A[LOOP:0: B:8:0x004a->B:53:0x0111], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:96:0x0175 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:97:0x01b8 A[EDGE_INSN: B:97:0x01b8->B:73:0x01b8 BREAK  A[LOOP:4: B:69:0x01a2->B:72:0x01b6], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:98:0x01ef A[SYNTHETIC] */
            @Override // androidx.arch.core.util.Function
            public final MonthSleepStateFeelVo apply(List<? extends SleepManualData> list) {
                ArrayList<MonthSleepStateFeelInfo> feelInfo;
                ArrayList<Integer> arrayList;
                int i;
                int[] iArrCalculatePercentages;
                int length;
                ArrayList<MonthSleepStateFeelInfo> stateInfo;
                Integer num;
                int iIntValue;
                int i2;
                int i3;
                Integer numValueOf;
                int iIntValue2;
                ArrayList<String> arrayList2;
                JSONArray jSONArrayOptJSONArray;
                List<? extends SleepManualData> list2 = list;
                MonthSleepStateFeelVo monthSleepStateFeelVo = new MonthSleepStateFeelVo(new ArrayList(), new ArrayList());
                if (list2 == null) {
                    return null;
                }
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                int i4 = 1;
                int iOffsetDay = SportDay.fromString(endDate).offsetDay(SportDay.fromString(startDate)) + 1;
                int size = iOffsetDay - list2.size();
                int size2 = list2.size() - 1;
                int i5 = 0;
                if (size2 >= 0) {
                    int i6 = size;
                    int i7 = 0;
                    while (true) {
                        int i8 = i7 + 1;
                        try {
                            JSONObject jSONObject = new JSONObject(list2.get(i7).getSummary());
                            HMLog.info(this.mTag, new SleepStateFeelRepo.b(i7, list2));
                            String strOptString = jSONObject.optString("sf", "0");
                            Integer num2 = (Integer) map.get(strOptString);
                            if (num2 == null) {
                                num2 = 0;
                            }
                            map.put(strOptString, Integer.valueOf(num2.intValue() + i4));
                            if (!jSONObject.has(DataConstant.KEY_SLEEP_STATE) || (jSONArrayOptJSONArray = jSONObject.optJSONArray(DataConstant.KEY_SLEEP_STATE)) == null) {
                                arrayList2 = null;
                            } else {
                                arrayList2 = new ArrayList();
                                int length2 = jSONArrayOptJSONArray.length();
                                if (length2 > 0) {
                                    int i9 = 0;
                                    while (true) {
                                        int i10 = i9 + 1;
                                        arrayList2.add(jSONArrayOptJSONArray.getString(i9));
                                        if (i10 >= length2) {
                                            break;
                                        }
                                        i9 = i10;
                                    }
                                }
                            }
                            if (arrayList2 == null || arrayList2.isEmpty()) {
                                i6++;
                            } else if (arrayList2 != null) {
                                for (String str : arrayList2) {
                                    Integer num3 = (Integer) map2.get(str);
                                    if (num3 == null) {
                                        num3 = 0;
                                    }
                                    try {
                                        map2.put(str, Integer.valueOf(num3.intValue() + 1));
                                    } catch (Exception e) {
                                        e = e;
                                        HMLog.error$default(this.mTag, null, null, new SleepStateFeelRepo.c(e), 6, null);
                                        if (i8 > size2) {
                                            break;
                                            size = i6;
                                            feelInfo = monthSleepStateFeelVo.getFeelInfo();
                                            arrayList = new ArrayList<>();
                                            i = iOffsetDay;
                                            for (Map.Entry<String, Integer> entry : SleepStateFeelProvider.INSTANCE.getMFeelSort().entrySet()) {
                                                numValueOf = (Integer) map.get(entry.getKey());
                                                if (numValueOf == null) {
                                                    numValueOf = Integer.valueOf(i5);
                                                }
                                                iIntValue2 = numValueOf.intValue();
                                                if (iIntValue2 > 0) {
                                                    feelInfo.add(new MonthSleepStateFeelInfo(KoinExtKt.getAppContext().getString(SleepStateFeelProvider.INSTANCE.getDesc(entry.getKey(), DataConstant.TYPE_SLEEP_FEEL)), 0, iIntValue2));
                                                    arrayList.add(Integer.valueOf(iIntValue2));
                                                }
                                                i -= iIntValue2;
                                                i5 = 0;
                                            }
                                            if (i > 0) {
                                                feelInfo.add(new MonthSleepStateFeelInfo(KoinExtKt.getAppContext().getString(R.string.sleep_no_record), 0, i));
                                                arrayList.add(Integer.valueOf(i));
                                            }
                                            iArrCalculatePercentages = PercentageCalculateUtil.INSTANCE.calculatePercentages(arrayList, 1000);
                                            length = iArrCalculatePercentages.length - 1;
                                            if (length >= 0) {
                                                i2 = 0;
                                                while (true) {
                                                    i3 = i2 + 1;
                                                    monthSleepStateFeelVo.getFeelInfo().get(i2).setRatio(iArrCalculatePercentages[i2]);
                                                    if (i3 > length) {
                                                        break;
                                                    }
                                                    i2 = i3;
                                                }
                                            }
                                            stateInfo = monthSleepStateFeelVo.getStateInfo();
                                            for (Map.Entry<String, Integer> entry2 : SleepStateFeelProvider.INSTANCE.getMStateSort().entrySet()) {
                                                num = (Integer) map2.get(entry2.getKey());
                                                if (num == null) {
                                                    num = 0;
                                                }
                                                iIntValue = num.intValue();
                                                if (iIntValue > 0) {
                                                    stateInfo.add(new MonthSleepStateFeelInfo(KoinExtKt.getAppContext().getString(SleepStateFeelProvider.INSTANCE.getDesc(entry2.getKey(), DataConstant.TYPE_SLEEP_STATE)), c.roundToInt((iIntValue * 1000.0f) / iOffsetDay), iIntValue));
                                                }
                                            }
                                            if (size > 0) {
                                                stateInfo.add(new MonthSleepStateFeelInfo(KoinExtKt.getAppContext().getString(R.string.sleep_no_record), c.roundToInt((size * 1000.0f) / iOffsetDay), size));
                                            }
                                            map.clear();
                                            map2.clear();
                                            return monthSleepStateFeelVo;
                                        }
                                        i7 = i8;
                                        i4 = 1;
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                        }
                        if (i8 > size2) {
                            break;
                        }
                        i7 = i8;
                        i4 = 1;
                    }
                    size = i6;
                }
                feelInfo = monthSleepStateFeelVo.getFeelInfo();
                arrayList = new ArrayList<>();
                i = iOffsetDay;
                while (r5.hasNext()) {
                    numValueOf = (Integer) map.get(entry.getKey());
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i5);
                    }
                    iIntValue2 = numValueOf.intValue();
                    if (iIntValue2 > 0) {
                        feelInfo.add(new MonthSleepStateFeelInfo(KoinExtKt.getAppContext().getString(SleepStateFeelProvider.INSTANCE.getDesc(entry.getKey(), DataConstant.TYPE_SLEEP_FEEL)), 0, iIntValue2));
                        arrayList.add(Integer.valueOf(iIntValue2));
                    }
                    i -= iIntValue2;
                    i5 = 0;
                }
                if (i > 0) {
                    feelInfo.add(new MonthSleepStateFeelInfo(KoinExtKt.getAppContext().getString(R.string.sleep_no_record), 0, i));
                    arrayList.add(Integer.valueOf(i));
                }
                iArrCalculatePercentages = PercentageCalculateUtil.INSTANCE.calculatePercentages(arrayList, 1000);
                length = iArrCalculatePercentages.length - 1;
                if (length >= 0) {
                    i2 = 0;
                    while (true) {
                        i3 = i2 + 1;
                        monthSleepStateFeelVo.getFeelInfo().get(i2).setRatio(iArrCalculatePercentages[i2]);
                        if (i3 > length) {
                            break;
                            break;
                        }
                        i2 = i3;
                    }
                }
                stateInfo = monthSleepStateFeelVo.getStateInfo();
                while (r3.hasNext()) {
                    num = (Integer) map2.get(entry2.getKey());
                    if (num == null) {
                        num = 0;
                    }
                    iIntValue = num.intValue();
                    if (iIntValue > 0) {
                        stateInfo.add(new MonthSleepStateFeelInfo(KoinExtKt.getAppContext().getString(SleepStateFeelProvider.INSTANCE.getDesc(entry2.getKey(), DataConstant.TYPE_SLEEP_STATE)), c.roundToInt((iIntValue * 1000.0f) / iOffsetDay), iIntValue));
                    }
                }
                if (size > 0) {
                    stateInfo.add(new MonthSleepStateFeelInfo(KoinExtKt.getAppContext().getString(R.string.sleep_no_record), c.roundToInt((size * 1000.0f) / iOffsetDay), size));
                }
                map.clear();
                map2.clear();
                return monthSleepStateFeelVo;
            }
        });
    }

    @Override // com.huami.sleep.sleepstatefeel.repo.ISleepStateFeelRepo
    @NotNull
    public LiveData<WeekSleepStateFeelVo> getWeekStateFeelLiveData(@NotNull String userId, @NotNull final String startDate, @NotNull final String endDate) {
        return Transformations.map(this.dataSource.getManualData(userId, startDate, endDate), new Function<List<? extends SleepManualData>, WeekSleepStateFeelVo>() { // from class: com.huami.sleep.sleepstatefeel.repo.SleepStateFeelRepo$getWeekStateFeelLiveData$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final WeekSleepStateFeelVo apply(List<? extends SleepManualData> list) {
                int size;
                String strOptString;
                ArrayList arrayList;
                ArrayList<Integer> arrayList2;
                List<? extends SleepManualData> list2 = list;
                WeekSleepStateFeelVo weekSleepStateFeelVo = new WeekSleepStateFeelVo(new ArrayList(), new ArrayList());
                SportDay sportDayFromString = SportDay.fromString(endDate);
                for (SportDay sportDayFromString2 = SportDay.fromString(startDate); sportDayFromString2.before(sportDayFromString); sportDayFromString2 = sportDayFromString2.getNextDay()) {
                    weekSleepStateFeelVo.getFeelInfo().add(null);
                    weekSleepStateFeelVo.getStateInfo().add(null);
                }
                weekSleepStateFeelVo.getFeelInfo().add(null);
                weekSleepStateFeelVo.getStateInfo().add(null);
                SportDay sportDayFromString3 = SportDay.fromString(startDate);
                if (list2 != null && (size = list2.size() - 1) >= 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        int iOffsetDay = SportDay.fromString(list2.get(i).getDate()).offsetDay(sportDayFromString3);
                        try {
                            JSONObject jSONObject = new JSONObject(list2.get(i).getSummary());
                            HMLog.info(this.mTag, new SleepStateFeelRepo.d(i, list2));
                            strOptString = jSONObject.optString("sf", "0");
                        } catch (Exception unused) {
                            strOptString = "0";
                        }
                        try {
                            JSONArray jSONArray = new JSONObject(list2.get(i).getSummary()).getJSONArray(DataConstant.KEY_SLEEP_STATE);
                            arrayList = new ArrayList();
                            int length = jSONArray.length();
                            if (length > 0) {
                                int i3 = 0;
                                while (true) {
                                    int i4 = i3 + 1;
                                    arrayList.add(jSONArray.getString(i3));
                                    if (i4 >= length) {
                                        break;
                                    }
                                    i3 = i4;
                                }
                            }
                        } catch (Exception unused2) {
                            arrayList = new ArrayList();
                        }
                        if (!TextUtils.isEmpty(strOptString) && !Intrinsics.areEqual(strOptString, "0")) {
                            if (weekSleepStateFeelVo.getFeelInfo().get(iOffsetDay) == null) {
                                weekSleepStateFeelVo.getFeelInfo().set(iOffsetDay, new ArrayList<>());
                            }
                            Integer num = SleepStateFeelProvider.INSTANCE.getMFeelSort().get(strOptString);
                            if (num != null) {
                                weekSleepStateFeelVo.getFeelInfo().get(iOffsetDay).add(Integer.valueOf(num.intValue()));
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            if (weekSleepStateFeelVo.getStateInfo().get(iOffsetDay) == null) {
                                weekSleepStateFeelVo.getStateInfo().set(iOffsetDay, new ArrayList<>());
                            }
                            for (Map.Entry<String, Integer> entry : SleepStateFeelProvider.INSTANCE.getMStateSort().entrySet()) {
                                if (arrayList.contains(entry.getKey()) && (arrayList2 = weekSleepStateFeelVo.getStateInfo().get(iOffsetDay)) != null) {
                                    arrayList2.add(entry.getValue());
                                }
                            }
                            ArrayList<Integer> arrayList3 = weekSleepStateFeelVo.getStateInfo().get(iOffsetDay);
                            if (arrayList3 != null) {
                                j.reverse(arrayList3);
                            }
                        }
                        if (i2 > size) {
                            break;
                        }
                        i = i2;
                    }
                }
                return weekSleepStateFeelVo;
            }
        });
    }

    @Override // com.huami.sleep.sleepstatefeel.repo.ISleepStateFeelRepo
    @Nullable
    public Object saveSelectFeeling(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super Unit> continuation) {
        Object objSaveSelectFeeling = this.dataSource.saveSelectFeeling(str, str2, str3, continuation);
        return objSaveSelectFeeling == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objSaveSelectFeeling : Unit.INSTANCE;
    }

    @Override // com.huami.sleep.sleepstatefeel.repo.ISleepStateFeelRepo
    @Nullable
    public Object saveSelectState(@NotNull String str, @NotNull String str2, @NotNull ArrayList<String> arrayList, @NotNull Continuation<? super Unit> continuation) {
        Object objSaveSelectState = this.dataSource.saveSelectState(str, str2, arrayList, continuation);
        return objSaveSelectState == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objSaveSelectState : Unit.INSTANCE;
    }
}
