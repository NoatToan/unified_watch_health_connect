package com.xiaomi.fit.fitness.parser.schema.daily;

import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.data.AbnormalRecord;
import com.xiaomi.fit.fitness.parser.data.FitnessParseResult;
import com.xiaomi.fit.fitness.parser.data.RecordItem;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u000fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J \u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/schema/daily/AbnormalParser;", "Lcom/xiaomi/fit/fitness/parser/schema/daily/BaseDailyParser;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "parse", "Lcom/xiaomi/fit/fitness/parser/data/FitnessParseResult;", "root", "", "", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "parse$fitness_parser_release", "convertListData", "", "Lcom/xiaomi/fit/fitness/parser/data/RecordItem;", "it", "", "abnormalRecord", "Lcom/xiaomi/fit/fitness/parser/data/AbnormalRecord;", "convertRecordData", "", "key", "value", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAbnormalParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbnormalParser.kt\ncom/xiaomi/fit/fitness/parser/schema/daily/AbnormalParser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,69:1\n1863#2:70\n1863#2:71\n1864#2:74\n1864#2:75\n1863#2:76\n1864#2:79\n216#3,2:72\n216#3,2:77\n*S KotlinDebug\n*F\n+ 1 AbnormalParser.kt\ncom/xiaomi/fit/fitness/parser/schema/daily/AbnormalParser\n*L\n19#1:70\n20#1:71\n20#1:74\n19#1:75\n45#1:76\n45#1:79\n22#1:72,2\n48#1:77,2\n*E\n"})
public final class AbnormalParser extends BaseDailyParser {

    @NotNull
    private final String TAG = "AbnormalParser";

    private final List<RecordItem> convertListData(Map.Entry<String, ? extends Object> it, AbnormalRecord abnormalRecord) {
        Object value = it.getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any>>");
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((List) value).iterator();
        while (it2.hasNext()) {
            long jLongValue = 0;
            int iIntValue = 0;
            for (Map.Entry entry : ((Map) it2.next()).entrySet()) {
                String str = (String) entry.getKey();
                if (Intrinsics.areEqual(str, DailyRecordKey.abnormalTime)) {
                    Object value2 = entry.getValue();
                    Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type kotlin.Long");
                    jLongValue = ((Long) value2).longValue();
                } else if (Intrinsics.areEqual(str, DailyRecordKey.abnormalValue)) {
                    Object value3 = entry.getValue();
                    Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type kotlin.Int");
                    iIntValue = ((Integer) value3).intValue();
                }
            }
            arrayList.add(new RecordItem(jLongValue, iIntValue));
        }
        return arrayList;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void convertRecordData(String key, Object value, AbnormalRecord abnormalRecord) {
        switch (key.hashCode()) {
            case -2129294769:
                if (key.equals("startTime")) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Long");
                    abnormalRecord.setStartTime(((Long) value).longValue());
                    break;
                }
                break;
            case -1639861048:
                if (key.equals(DailyRecordKey.userSetReminderValue)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    abnormalRecord.setAbnormalSetValue(((Integer) value).intValue());
                    break;
                }
                break;
            case -1607243192:
                if (key.equals("endTime")) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Long");
                    abnormalRecord.setEndTime(((Long) value).longValue());
                    break;
                }
                break;
            case -1274276244:
                if (key.equals(DailyRecordKey.abnormalDataType)) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    abnormalRecord.setAbnormalType(((Integer) value).intValue());
                    break;
                }
                break;
            case 1291452222:
                if (key.equals("recordCount")) {
                    Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Int");
                    abnormalRecord.setRecordCount(((Integer) value).intValue());
                    break;
                }
                break;
        }
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    @Override // com.xiaomi.fit.fitness.parser.schema.daily.BaseDailyParser
    @NotNull
    public FitnessParseResult parse$fitness_parser_release(@NotNull Map<String, ? extends Object> root, @NotNull FitnessDataId dataId) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Object obj = root.get("body");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any>>>");
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            for (Map map : (List) it.next()) {
                AbnormalRecord abnormalRecord = new AbnormalRecord();
                if (map != null) {
                    for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                        if (entry.getValue() instanceof List) {
                            abnormalRecord.setRecordList(convertListData(entry, abnormalRecord));
                        } else {
                            convertRecordData(entry.getKey(), entry.getValue(), abnormalRecord);
                        }
                    }
                }
                if (map != null) {
                    arrayList.add(abnormalRecord);
                }
            }
        }
        FitnessParseResult fitnessParseResultBuild = new FitnessParseResult.Builder().abnormalRecords(arrayList).build();
        FitnessLogUtils.i(this.TAG, "result:" + fitnessParseResultBuild);
        return fitnessParseResultBuild;
    }
}
