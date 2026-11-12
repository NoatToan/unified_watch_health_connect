package com.xiaomi.fitness.account.api.bean;

import android.text.TextUtils;
import androidx.room.ColumnInfo;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.mi.fitness.netproxy.NetProxyComponentKt;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fitness.account.goal.GoalPreference;
import com.xiaomi.fitness.account.user.DallyGoalItem;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sync.model.EventRecurrence;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\bD\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b%\b\u0086\b\u0018\u0000 «\u00012\u00020\u0001:\b«\u0001¬\u0001\u00ad\u0001®\u0001B\u0097\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\f\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\f\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\b\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b#\u0010$J\u0006\u0010j\u001a\u00020kJ\u0006\u0010l\u001a\u00020kJ\u0006\u0010m\u001a\u00020kJ\u0006\u0010n\u001a\u00020kJ\u0006\u0010o\u001a\u00020\fJ\u0006\u0010p\u001a\u00020\fJ\u0006\u0010q\u001a\u00020\u0003J\u0006\u0010r\u001a\u00020\bJ\u0006\u0010s\u001a\u00020\bJ\u0006\u0010t\u001a\u00020\fJ\u0006\u0010u\u001a\u00020\u0003J\u000e\u0010v\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019J\u0010\u0010w\u001a\u00020\u00032\u0006\u0010x\u001a\u00020\fH\u0002J\u0006\u0010y\u001a\u00020zJ\u0013\u0010{\u001a\u00020z2\b\u0010|\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0010\u0010}\u001a\u00020z2\b\u0010|\u001a\u0004\u0018\u00010\u0001J\u001c\u0010~\u001a\u00020z2\b\u0010x\u001a\u0004\u0018\u00010\u00012\b\u0010\u007f\u001a\u0004\u0018\u00010\u0001H\u0002J\t\u0010\u0080\u0001\u001a\u00020\fH\u0016J\r\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019J\u0018\u0010\u0082\u0001\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\u0007\u0010\u0083\u0001\u001a\u00020\u0000J!\u0010\u0084\u0001\u001a\u00020k2\u0007\u0010\u0083\u0001\u001a\u00020\u00002\u0006\u0010x\u001a\u00020\f2\u0007\u0010\u0085\u0001\u001a\u00020\fJ\u0019\u0010\u0086\u0001\u001a\u00020k2\u0007\u0010\u0083\u0001\u001a\u00020\u00002\u0007\u0010\u0087\u0001\u001a\u00020\fJ\u0019\u0010\u0088\u0001\u001a\u00020k2\u0007\u0010\u0083\u0001\u001a\u00020\u00002\u0007\u0010\u0087\u0001\u001a\u00020\fJ\u001b\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u008a\u00012\u000f\u0010\u008b\u0001\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019J!\u0010\u008c\u0001\u001a\u00020\f2\u0007\u0010\u008d\u0001\u001a\u00020\u00032\u000f\u0010\u008e\u0001\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019J!\u0010\u008f\u0001\u001a\u00020z2\u0007\u0010\u008d\u0001\u001a\u00020\u00032\u000f\u0010\u008e\u0001\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019J\t\u0010\u0090\u0001\u001a\u00020\u0003H\u0016J\t\u0010\u0091\u0001\u001a\u00020\fH\u0002J\n\u0010\u0092\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0096\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020\bHÆ\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0099\u0001\u001a\u00020\fHÆ\u0003J\n\u0010\u009a\u0001\u001a\u00020\fHÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020\fHÆ\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\n\u0010\u009d\u0001\u001a\u00020\fHÆ\u0003J\n\u0010\u009e\u0001\u001a\u00020\fHÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\fHÆ\u0003J\n\u0010 \u0001\u001a\u00020\fHÆ\u0003J\f\u0010¡\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010¢\u0001\u001a\u00020\fHÆ\u0003J\n\u0010£\u0001\u001a\u00020\fHÆ\u0003J\u0012\u0010¤\u0001\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019HÆ\u0003J\n\u0010¥\u0001\u001a\u00020\fHÆ\u0003J\f\u0010¦\u0001\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\n\u0010§\u0001\u001a\u00020\bHÆ\u0003J\u0012\u0010¨\u0001\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010 HÆ\u0003J\f\u0010©\u0001\u001a\u0004\u0018\u00010\"HÆ\u0003J\u009a\u0002\u0010ª\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\f2\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\b\b\u0002\u0010\u001b\u001a\u00020\f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\b2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"HÆ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010&\"\u0004\b*\u0010(R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00100\"\u0004\b4\u00102R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010&\"\u0004\b6\u0010(R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001e\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u00108\"\u0004\b<\u0010:R\u001e\u0010\u000e\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u00108\"\u0004\b>\u0010:R \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001e\u0010\u0011\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u00108\"\u0004\bD\u0010:R\u001e\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u00108\"\u0004\bF\u0010:R\u001e\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u00108\"\u0004\bH\u0010:R\u001a\u0010\u0014\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u00108\"\u0004\bJ\u0010:R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010&\"\u0004\bL\u0010(R\u001a\u0010\u0016\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u00108\"\u0004\bN\u0010:R\u001a\u0010\u0017\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u00108\"\u0004\bP\u0010:R&\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001e\u0010\u001b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u00108\"\u0004\bV\u0010:R \u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u001e\u0010\u001e\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u00100\"\u0004\b\\\u00102R\"\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010R\"\u0004\b^\u0010TR \u0010!\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001a\u0010c\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u00108\"\u0004\be\u0010:R\u0011\u0010f\u001a\u00020g¢\u0006\b\n\u0000\u001a\u0004\bh\u0010i¨\u0006¯\u0001"}, d2 = {"Lcom/xiaomi/fitness/account/api/bean/UserProfile;", "", "name", "", "icon", "sex", MedicalIdSPContract.PREF_BIRTHDAY, "height", "", "weight", "region", "vo2Max", "", "maxHrm", "minHrm", "recordMaxHrm", "Lcom/xiaomi/fitness/account/api/bean/UserProfile$RecordMaxHrm;", "dailyCalGoal", "dailyStepGoal", "dailySleepGoal", "zone_offset", "zone_name", "dailyStandTimesGoal", "dailyMhsGoal", "regularGoalList", "", "Lcom/xiaomi/fitness/account/user/DallyGoalItem;", "specialMark", "initialWeight", "Lcom/xiaomi/fitness/account/api/bean/UserProfile$InitialWeight;", "maximalMet", "dids", "", "wear_medal", "Lcom/xiaomi/fitness/account/api/bean/UserProfile$UserWearMedal;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFLjava/lang/String;IIILcom/xiaomi/fitness/account/api/bean/UserProfile$RecordMaxHrm;IIIILjava/lang/String;IILjava/util/List;ILcom/xiaomi/fitness/account/api/bean/UserProfile$InitialWeight;FLjava/util/List;Lcom/xiaomi/fitness/account/api/bean/UserProfile$UserWearMedal;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getIcon", "setIcon", "getSex", "setSex", "getBirth", "setBirth", "getHeight", "()F", "setHeight", "(F)V", "getWeight", "setWeight", "getRegion", "setRegion", "getVo2Max", "()I", "setVo2Max", "(I)V", "getMaxHrm", "setMaxHrm", "getMinHrm", "setMinHrm", "getRecordMaxHrm", "()Lcom/xiaomi/fitness/account/api/bean/UserProfile$RecordMaxHrm;", "setRecordMaxHrm", "(Lcom/xiaomi/fitness/account/api/bean/UserProfile$RecordMaxHrm;)V", "getDailyCalGoal", "setDailyCalGoal", "getDailyStepGoal", "setDailyStepGoal", "getDailySleepGoal", "setDailySleepGoal", "getZone_offset", "setZone_offset", "getZone_name", "setZone_name", "getDailyStandTimesGoal", "setDailyStandTimesGoal", "getDailyMhsGoal", "setDailyMhsGoal", "getRegularGoalList", "()Ljava/util/List;", "setRegularGoalList", "(Ljava/util/List;)V", "getSpecialMark", "setSpecialMark", "getInitialWeight", "()Lcom/xiaomi/fitness/account/api/bean/UserProfile$InitialWeight;", "setInitialWeight", "(Lcom/xiaomi/fitness/account/api/bean/UserProfile$InitialWeight;)V", "getMaximalMet", "setMaximalMet", "getDids", "setDids", "getWear_medal", "()Lcom/xiaomi/fitness/account/api/bean/UserProfile$UserWearMedal;", "setWear_medal", "(Lcom/xiaomi/fitness/account/api/bean/UserProfile$UserWearMedal;)V", "DEFAULT_DAILY_CAL_GOAL", "getDEFAULT_DAILY_CAL_GOAL", "setDEFAULT_DAILY_CAL_GOAL", "DEFAULT_TARGET", "", "getDEFAULT_TARGET", "()[I", "initDailyCalGoal", "", "initDailyStepGoal", "initDailyStandTimesGoal", "initDailyHmsGoal", "getMaxHrOrDefault", "computeAutoMaxHr", "getSexOrDefault", "getWeightOrDefault", "getHeightOrDefault", "getAge", "getBirthOrDefault", "getTargetListOrDefault", "getTwoString", "value", "isCompleted", "", "equals", "other", "regularGoalChange", "compareObject", "pValue", "hashCode", "getDefaultAPPGoal", "getDefaultGoal", "newProfile", "setGoalConfig", "index", "setDefaultGoalConfig", "support", "setDefaultGoalMhsConfig", "getGoalJsonArray", "Lcom/google/gson/JsonArray;", "dallyGoalItems", "getGoalValue", "type", FitnessPersistKey.Rainbow, "containsKey", "toString", "getDefaultCalore", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "Companion", "RecordMaxHrm", "UserWearMedal", "InitialWeight", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUserProfile.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserProfile.kt\ncom/xiaomi/fitness/account/api/bean/UserProfile\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,796:1\n1#2:797\n*E\n"})
public final /* data */ class UserProfile {

    @NotNull
    public static final String BIRTH_DATE_FORMAT = "yyyy-MM-dd";

    @NotNull
    public static final String CALORIE_GOAL_FIELD = "2";
    public static final int DEFAULT_AGE = 25;
    public static final long DEFAULT_BIRTH_DATE = 631123200000L;
    public static final int DEFAULT_DAILY_HMS_GOAL = 30;
    public static final int DEFAULT_DAILY_STAND_TIMES_GOAL = 12;
    public static final int DEFAULT_DAILY_STEP_GOAL = 6000;
    public static final int DEFAULT_GOAL_SIZE = 3;
    public static final float DEFAULT_HEIGHT = 170.0f;
    public static final float DEFAULT_WEIGHT = 60.0f;

    @NotNull
    public static final String FEMALE = "female";

    @NotNull
    public static final String MALE = "male";

    @NotNull
    public static final String MHS_GOAL_FIELD = "4";

    @NotNull
    public static final String MODE_AUTO = "auto";

    @NotNull
    public static final String MODE_PHONE = "phone";

    @NotNull
    public static final String STAND_TIMES_GOAL_FIELD = "3";

    @NotNull
    public static final String STEP_GOAL_FIELD = "1";
    public static final int SUPPORT_GOAL_CALORIE = 2;
    public static final int SUPPORT_GOAL_MHS = 4;
    public static final int SUPPORT_GOAL_STAND_TIMES = 3;
    public static final int SUPPORT_GOAL_STEP = 1;

    @NotNull
    private static final String TAG = "UserProfile";
    private int DEFAULT_DAILY_CAL_GOAL;

    @NotNull
    private final int[] DEFAULT_TARGET;

    @Nullable
    private String birth;

    @SerializedName("daily_cal_goal")
    private int dailyCalGoal;
    private int dailyMhsGoal;

    @SerializedName("daily_sleep_goal")
    private int dailySleepGoal;
    private int dailyStandTimesGoal;

    @SerializedName("daily_step_goal")
    private int dailyStepGoal;

    @Nullable
    private List<String> dids;
    private float height;

    @Nullable
    private String icon;

    @SerializedName("initial_weight")
    @Nullable
    private InitialWeight initialWeight;

    @SerializedName("max_hrm")
    private int maxHrm;

    @SerializedName("maximal_met")
    private float maximalMet;

    @SerializedName("min_hrm")
    private int minHrm;

    @NotNull
    private String name;

    @SerializedName("record_max_hrm")
    @Nullable
    private RecordMaxHrm recordMaxHrm;

    @Nullable
    private String region;

    @SerializedName("regular_goal_list")
    @ColumnInfo(name = "regular_goal_list")
    @Nullable
    private List<DallyGoalItem> regularGoalList;

    @Nullable
    private String sex;

    @SerializedName("special_mark")
    private int specialMark;

    @SerializedName(FitnessPersistKey.Vo2Max)
    private int vo2Max;

    @SerializedName("wear_medal")
    @Nullable
    private UserWearMedal wear_medal;
    private float weight;

    @Nullable
    private String zone_name;
    private int zone_offset;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/account/api/bean/UserProfile$InitialWeight;", "", "weight", "", "timestamp", "", "<init>", "(FJ)V", "getWeight", "()F", "setWeight", "(F)V", "getTimestamp", "()J", "setTimestamp", "(J)V", "equals", "", "other", "hashCode", "", "component1", "component2", "copy", "toString", "", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitialWeight {
        private long timestamp;
        private float weight;

        public InitialWeight() {
            this(0.0f, 0L, 3, null);
        }

        public static /* synthetic */ InitialWeight copy$default(InitialWeight initialWeight, float f, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                f = initialWeight.weight;
            }
            if ((i & 2) != 0) {
                j = initialWeight.timestamp;
            }
            return initialWeight.copy(f, j);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getWeight() {
            return this.weight;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        @NotNull
        public final InitialWeight copy(float weight, long timestamp) {
            return new InitialWeight(weight, timestamp);
        }

        public boolean equals(@Nullable Object other) {
            if (other == this) {
                return true;
            }
            if (other == null || !Intrinsics.areEqual(InitialWeight.class, other.getClass())) {
                return false;
            }
            InitialWeight initialWeight = (InitialWeight) other;
            return initialWeight.weight == this.weight && initialWeight.timestamp == this.timestamp;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final float getWeight() {
            return this.weight;
        }

        public int hashCode() {
            return super.hashCode();
        }

        public final void setTimestamp(long j) {
            this.timestamp = j;
        }

        public final void setWeight(float f) {
            this.weight = f;
        }

        @NotNull
        public String toString() {
            return "InitialWeight(weight=" + this.weight + ", timestamp=" + this.timestamp + ")";
        }

        public InitialWeight(float f, long j) {
            this.weight = f;
            this.timestamp = j;
        }

        public /* synthetic */ InitialWeight(float f, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0L : j);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J)\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/account/api/bean/UserProfile$RecordMaxHrm;", "", "hrm", "", "source", "", "autoHrm", "<init>", "(ILjava/lang/String;I)V", "getHrm", "()I", "setHrm", "(I)V", "getSource", "()Ljava/lang/String;", "setSource", "(Ljava/lang/String;)V", "getAutoHrm", "setAutoHrm", "equals", "", "other", "hashCode", "component1", "component2", "component3", "copy", "toString", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RecordMaxHrm {

        @SerializedName("auto_hrm")
        private int autoHrm;
        private int hrm;

        @Nullable
        private String source;

        public RecordMaxHrm() {
            this(0, null, 0, 7, null);
        }

        public static /* synthetic */ RecordMaxHrm copy$default(RecordMaxHrm recordMaxHrm, int i, String str, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = recordMaxHrm.hrm;
            }
            if ((i3 & 2) != 0) {
                str = recordMaxHrm.source;
            }
            if ((i3 & 4) != 0) {
                i2 = recordMaxHrm.autoHrm;
            }
            return recordMaxHrm.copy(i, str, i2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getHrm() {
            return this.hrm;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getAutoHrm() {
            return this.autoHrm;
        }

        @NotNull
        public final RecordMaxHrm copy(int hrm, @Nullable String source, int autoHrm) {
            return new RecordMaxHrm(hrm, source, autoHrm);
        }

        public boolean equals(@Nullable Object other) {
            if (other == this) {
                return true;
            }
            return other != null && Intrinsics.areEqual(RecordMaxHrm.class, other.getClass()) && ((RecordMaxHrm) other).hrm == this.hrm;
        }

        public final int getAutoHrm() {
            return this.autoHrm;
        }

        public final int getHrm() {
            return this.hrm;
        }

        @Nullable
        public final String getSource() {
            return this.source;
        }

        public int hashCode() {
            return super.hashCode();
        }

        public final void setAutoHrm(int i) {
            this.autoHrm = i;
        }

        public final void setHrm(int i) {
            this.hrm = i;
        }

        public final void setSource(@Nullable String str) {
            this.source = str;
        }

        @NotNull
        public String toString() {
            return "RecordMaxHrm(hrm=" + this.hrm + ", source=" + this.source + ", autoHrm=" + this.autoHrm + ")";
        }

        public RecordMaxHrm(int i, @Nullable String str, int i2) {
            this.hrm = i;
            this.source = str;
            this.autoHrm = i2;
        }

        public /* synthetic */ RecordMaxHrm(int i, String str, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? "auto" : str, (i3 & 4) != 0 ? 0 : i2);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u0003H\u0016J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J'\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/account/api/bean/UserProfile$UserWearMedal;", "", "wear_status", "", "wear_medal_id", "", "wear_medal_type", "", "<init>", "(IJLjava/lang/String;)V", "getWear_status", "()I", "setWear_status", "(I)V", "getWear_medal_id", "()J", "setWear_medal_id", "(J)V", "getWear_medal_type", "()Ljava/lang/String;", "setWear_medal_type", "(Ljava/lang/String;)V", "equals", "", "other", "hashCode", "component1", "component2", "component3", "copy", "toString", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UserWearMedal {

        @SerializedName("wear_medal_id")
        private long wear_medal_id;

        @SerializedName("wear_medal_type")
        @NotNull
        private String wear_medal_type;

        @SerializedName("wear_status")
        private int wear_status;

        public UserWearMedal() {
            this(0, 0L, null, 7, null);
        }

        public static /* synthetic */ UserWearMedal copy$default(UserWearMedal userWearMedal, int i, long j, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = userWearMedal.wear_status;
            }
            if ((i2 & 2) != 0) {
                j = userWearMedal.wear_medal_id;
            }
            if ((i2 & 4) != 0) {
                str = userWearMedal.wear_medal_type;
            }
            return userWearMedal.copy(i, j, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getWear_status() {
            return this.wear_status;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getWear_medal_id() {
            return this.wear_medal_id;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getWear_medal_type() {
            return this.wear_medal_type;
        }

        @NotNull
        public final UserWearMedal copy(int wear_status, long wear_medal_id, @NotNull String wear_medal_type) {
            Intrinsics.checkNotNullParameter(wear_medal_type, "wear_medal_type");
            return new UserWearMedal(wear_status, wear_medal_id, wear_medal_type);
        }

        public boolean equals(@Nullable Object other) {
            if (other == this) {
                return true;
            }
            return other != null && Intrinsics.areEqual(UserWearMedal.class, other.getClass()) && ((UserWearMedal) other).wear_status == this.wear_status;
        }

        public final long getWear_medal_id() {
            return this.wear_medal_id;
        }

        @NotNull
        public final String getWear_medal_type() {
            return this.wear_medal_type;
        }

        public final int getWear_status() {
            return this.wear_status;
        }

        public int hashCode() {
            return super.hashCode();
        }

        public final void setWear_medal_id(long j) {
            this.wear_medal_id = j;
        }

        public final void setWear_medal_type(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.wear_medal_type = str;
        }

        public final void setWear_status(int i) {
            this.wear_status = i;
        }

        @NotNull
        public String toString() {
            return "UserWearMedal(wear_status=" + this.wear_status + ", wear_medal_id=" + this.wear_medal_id + ", wear_medal_type=" + this.wear_medal_type + ")";
        }

        public UserWearMedal(int i, long j, @NotNull String wear_medal_type) {
            Intrinsics.checkNotNullParameter(wear_medal_type, "wear_medal_type");
            this.wear_status = i;
            this.wear_medal_id = j;
            this.wear_medal_type = wear_medal_type;
        }

        public /* synthetic */ UserWearMedal(int i, long j, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? "" : str);
        }
    }

    public UserProfile() {
        this(null, null, null, null, 0.0f, 0.0f, null, 0, 0, 0, null, 0, 0, 0, 0, null, 0, 0, null, 0, null, 0.0f, null, null, 16777215, null);
    }

    private final boolean compareObject(Object value, Object pValue) {
        if (value == null) {
            return pValue == null;
        }
        return Intrinsics.areEqual(value, pValue);
    }

    private final int getDefaultCalore() {
        int iRound = Math.round((((getWeightOrDefault() * 8) * 45) / 60) / 100.0f) * 100;
        Logger.d(TAG, "getWeightOrDefault() is " + getWeightOrDefault() + " calore is " + iRound);
        return iRound;
    }

    private final String getTwoString(int value) {
        if (value > 9) {
            return String.valueOf(value);
        }
        return "0" + value;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getMinHrm() {
        return this.minHrm;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final RecordMaxHrm getRecordMaxHrm() {
        return this.recordMaxHrm;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getDailyCalGoal() {
        return this.dailyCalGoal;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getDailyStepGoal() {
        return this.dailyStepGoal;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getDailySleepGoal() {
        return this.dailySleepGoal;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getZone_offset() {
        return this.zone_offset;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getZone_name() {
        return this.zone_name;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getDailyStandTimesGoal() {
        return this.dailyStandTimesGoal;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getDailyMhsGoal() {
        return this.dailyMhsGoal;
    }

    @Nullable
    public final List<DallyGoalItem> component19() {
        return this.regularGoalList;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final int getSpecialMark() {
        return this.specialMark;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final InitialWeight getInitialWeight() {
        return this.initialWeight;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final float getMaximalMet() {
        return this.maximalMet;
    }

    @Nullable
    public final List<String> component23() {
        return this.dids;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final UserWearMedal getWear_medal() {
        return this.wear_medal;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSex() {
        return this.sex;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBirth() {
        return this.birth;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getVo2Max() {
        return this.vo2Max;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getMaxHrm() {
        return this.maxHrm;
    }

    public final int computeAutoMaxHr() {
        return 220 - getAge();
    }

    public final boolean containsKey(@NotNull String type, @Nullable List<DallyGoalItem> goal) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (goal != null) {
            int size = goal.size();
            for (int i = 0; i < size; i++) {
                if (goal.get(i).getField() == Integer.parseInt(type)) {
                    return true;
                }
            }
        }
        return false;
    }

    @NotNull
    public final UserProfile copy(@NotNull String name, @Nullable String icon, @Nullable String sex, @Nullable String birth, float height, float weight, @Nullable String region, int vo2Max, int maxHrm, int minHrm, @Nullable RecordMaxHrm recordMaxHrm, int dailyCalGoal, int dailyStepGoal, int dailySleepGoal, int zone_offset, @Nullable String zone_name, int dailyStandTimesGoal, int dailyMhsGoal, @Nullable List<DallyGoalItem> regularGoalList, int specialMark, @Nullable InitialWeight initialWeight, float maximalMet, @Nullable List<String> dids, @Nullable UserWearMedal wear_medal) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new UserProfile(name, icon, sex, birth, height, weight, region, vo2Max, maxHrm, minHrm, recordMaxHrm, dailyCalGoal, dailyStepGoal, dailySleepGoal, zone_offset, zone_name, dailyStandTimesGoal, dailyMhsGoal, regularGoalList, specialMark, initialWeight, maximalMet, dids, wear_medal);
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (other != null && Intrinsics.areEqual(UserProfile.class, other.getClass())) {
            UserProfile userProfile = (UserProfile) other;
            if (compareObject(this.sex, userProfile.sex) && compareObject(this.birth, userProfile.birth) && this.weight == userProfile.weight && this.height == userProfile.height && compareObject(this.region, userProfile.region) && this.vo2Max == userProfile.vo2Max && this.maxHrm == userProfile.maxHrm && this.minHrm == userProfile.minHrm && this.dailySleepGoal == userProfile.dailySleepGoal && this.maximalMet == userProfile.maximalMet) {
                InitialWeight initialWeight = this.initialWeight;
                if (initialWeight == null) {
                    return userProfile.initialWeight != null;
                }
                if (compareObject(initialWeight, userProfile.initialWeight)) {
                    return compareObject(this.recordMaxHrm, userProfile.recordMaxHrm);
                }
                return false;
            }
        }
        return false;
    }

    public final int getAge() {
        try {
            Calendar calendar = Calendar.getInstance();
            String birthOrDefault = getBirthOrDefault();
            if (birthOrDefault != null && birthOrDefault.length() != 0) {
                Date date = new SimpleDateFormat("yyyy-MM-dd").parse(birthOrDefault);
                if (calendar.before(Long.valueOf(date.getTime()))) {
                    return 0;
                }
                calendar.setTime(new Date());
                int i = calendar.get(1);
                int i2 = calendar.get(2);
                int i3 = calendar.get(5);
                calendar.setTime(new Date(date.getTime()));
                int i4 = calendar.get(1);
                int i5 = calendar.get(2);
                int i6 = calendar.get(5);
                int i7 = i - i4;
                if (i2 < i5 || (i2 == i5 && i3 < i6)) {
                    i7--;
                }
                return i7;
            }
            return 25;
        } catch (Exception unused) {
            return 25;
        }
    }

    @Nullable
    public final String getBirth() {
        return this.birth;
    }

    @NotNull
    public final String getBirthOrDefault() {
        String str = this.birth;
        if (str != null && str.length() != 0) {
            String str2 = this.birth;
            Intrinsics.checkNotNull(str2);
            return str2;
        }
        Calendar calendar = Calendar.getInstance();
        int i = Calendar.getInstance().get(1) - 30;
        calendar.set(1, i);
        int i2 = calendar.get(2);
        return i + "-" + getTwoString(i2 != 0 ? i2 : 1) + "-" + getTwoString(28);
    }

    public final int getDEFAULT_DAILY_CAL_GOAL() {
        return this.DEFAULT_DAILY_CAL_GOAL;
    }

    @NotNull
    public final int[] getDEFAULT_TARGET() {
        return this.DEFAULT_TARGET;
    }

    public final int getDailyCalGoal() {
        return this.dailyCalGoal;
    }

    public final int getDailyMhsGoal() {
        return this.dailyMhsGoal;
    }

    public final int getDailySleepGoal() {
        return this.dailySleepGoal;
    }

    public final int getDailyStandTimesGoal() {
        return this.dailyStandTimesGoal;
    }

    public final int getDailyStepGoal() {
        return this.dailyStepGoal;
    }

    @NotNull
    public final List<DallyGoalItem> getDefaultAPPGoal() {
        ArrayList arrayList = new ArrayList();
        String str = this.name;
        if (str == null || str.length() == 0) {
            GoalPreference goalPreference = GoalPreference.INSTANCE;
            arrayList.add(new DallyGoalItem(2, goalPreference.getNotLoginCalorieGoal()));
            arrayList.add(new DallyGoalItem(1, goalPreference.getNotLoginStepGoal()));
            if (goalPreference.getNotLoginMhsGoal() > 0) {
                arrayList.add(new DallyGoalItem(4, goalPreference.getNotLoginMhsGoal()));
            } else {
                arrayList.add(new DallyGoalItem(3, goalPreference.getNotLoginStandTimeGoal()));
            }
        } else {
            arrayList.add(new DallyGoalItem(2, this.DEFAULT_DAILY_CAL_GOAL));
            arrayList.add(new DallyGoalItem(1, 6000));
            arrayList.add(new DallyGoalItem(4, 30));
        }
        Logger.i(TAG, "getDefaultAPPGoal is " + arrayList);
        return arrayList;
    }

    @Nullable
    public final List<DallyGoalItem> getDefaultGoal(@NotNull UserProfile newProfile) {
        Intrinsics.checkNotNullParameter(newProfile, "newProfile");
        ArrayList arrayList = new ArrayList();
        try {
            int goalValue = containsKey("2", newProfile.regularGoalList) ? getGoalValue("2", newProfile.regularGoalList) : this.DEFAULT_TARGET[1];
            newProfile.dailyCalGoal = goalValue;
            arrayList.add(new DallyGoalItem(2, goalValue));
            int goalValue2 = containsKey("1", newProfile.regularGoalList) ? getGoalValue("1", newProfile.regularGoalList) : this.DEFAULT_TARGET[0];
            newProfile.dailyStepGoal = goalValue2;
            arrayList.add(new DallyGoalItem(1, goalValue2));
            if (containsKey("3", newProfile.regularGoalList)) {
                int goalValue3 = containsKey("3", newProfile.regularGoalList) ? getGoalValue("3", newProfile.regularGoalList) : this.DEFAULT_TARGET[2];
                newProfile.dailyStandTimesGoal = goalValue3;
                arrayList.add(new DallyGoalItem(3, goalValue3));
            } else {
                int goalValue4 = containsKey("4", newProfile.regularGoalList) ? getGoalValue("4", newProfile.regularGoalList) : this.DEFAULT_TARGET[3];
                newProfile.dailyMhsGoal = goalValue4;
                arrayList.add(new DallyGoalItem(4, goalValue4));
            }
            this.zone_name = TimeZone.getDefault().getID();
            this.zone_offset = TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 1000;
            Logger.i(" Goal manager jsonGoalList:" + newProfile.regularGoalList + ", regularGoalListArray is " + arrayList, new Object[0]);
            return arrayList;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Nullable
    public final List<String> getDids() {
        return this.dids;
    }

    @Nullable
    public final JsonArray getGoalJsonArray(@Nullable List<DallyGoalItem> dallyGoalItems) {
        JsonArray jsonArray = new JsonArray();
        if (dallyGoalItems != null) {
            JsonObject jsonObject = new JsonObject();
            JsonObject jsonObject2 = new JsonObject();
            JsonObject jsonObject3 = new JsonObject();
            for (DallyGoalItem dallyGoalItem : dallyGoalItems) {
                if (2 == dallyGoalItem.getField()) {
                    jsonObject.addProperty("field", Integer.valueOf(dallyGoalItem.getField()));
                    if (dallyGoalItems.get(0).getTarget() == 0) {
                        jsonObject.addProperty("target", Integer.valueOf(this.DEFAULT_TARGET[0]));
                    } else {
                        jsonObject.addProperty("target", Integer.valueOf(dallyGoalItem.getTarget()));
                    }
                }
                if (1 == dallyGoalItem.getField()) {
                    jsonObject2.addProperty("field", Integer.valueOf(dallyGoalItem.getField()));
                    if (dallyGoalItem.getTarget() == 0) {
                        jsonObject2.addProperty("target", Integer.valueOf(this.DEFAULT_TARGET[1]));
                    } else {
                        jsonObject2.addProperty("target", Integer.valueOf(dallyGoalItem.getTarget()));
                    }
                }
                if (3 == dallyGoalItem.getField()) {
                    jsonObject3.addProperty("field", Integer.valueOf(dallyGoalItem.getField()));
                    if (dallyGoalItem.getTarget() == 0) {
                        jsonObject3.addProperty("target", Integer.valueOf(this.DEFAULT_TARGET[2]));
                    } else {
                        jsonObject3.addProperty("target", Integer.valueOf(dallyGoalItem.getTarget()));
                    }
                } else if (4 == dallyGoalItem.getField()) {
                    jsonObject3.addProperty("field", Integer.valueOf(dallyGoalItem.getField()));
                    if (dallyGoalItem.getTarget() == 0) {
                        jsonObject3.addProperty("target", Integer.valueOf(this.DEFAULT_TARGET[3]));
                    } else {
                        jsonObject3.addProperty("target", Integer.valueOf(dallyGoalItem.getTarget()));
                    }
                }
            }
            jsonArray.add(jsonObject);
            jsonArray.add(jsonObject2);
            jsonArray.add(jsonObject3);
            Logger.i("UserProfile Goal manager jsonArray toString is " + jsonArray, new Object[0]);
        }
        return jsonArray;
    }

    public final int getGoalValue(@NotNull String type, @Nullable List<DallyGoalItem> goal) {
        Intrinsics.checkNotNullParameter(type, "type");
        Logger.d(TAG, "getGoalValue11");
        if (goal != null) {
            Logger.d(TAG, "it ----  + " + goal + "  ++" + type);
            int size = goal.size();
            for (int i = 0; i < size; i++) {
                Logger.d(TAG, "i == " + i + " dallyGoalItem " + goal.get(i) + " + " + goal.get(i).getField() + " + " + goal.get(i).getTarget());
                if (goal.get(i).getField() == Integer.parseInt(type)) {
                    Logger.d(TAG, "type -- " + Integer.parseInt(type) + "dallyGoalItem " + goal.get(i) + " + " + goal.get(i).getField() + " + " + goal.get(i).getTarget());
                    return goal.get(i).getTarget();
                }
            }
        }
        return this.DEFAULT_TARGET[Integer.parseInt(type) - 1];
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getHeightOrDefault() {
        float f = this.height;
        if (f == 0.0f) {
            return 170.0f;
        }
        return f;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final InitialWeight getInitialWeight() {
        return this.initialWeight;
    }

    public final int getMaxHrOrDefault() {
        RecordMaxHrm recordMaxHrm = this.recordMaxHrm;
        int hrm = recordMaxHrm != null ? recordMaxHrm.getHrm() : 0;
        if (hrm != 0) {
            return hrm;
        }
        int iComputeAutoMaxHr = computeAutoMaxHr();
        Logger.i(TAG, "default maxHr = " + iComputeAutoMaxHr);
        return iComputeAutoMaxHr;
    }

    public final int getMaxHrm() {
        return this.maxHrm;
    }

    public final float getMaximalMet() {
        return this.maximalMet;
    }

    public final int getMinHrm() {
        return this.minHrm;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final RecordMaxHrm getRecordMaxHrm() {
        return this.recordMaxHrm;
    }

    @Nullable
    public final String getRegion() {
        return this.region;
    }

    @Nullable
    public final List<DallyGoalItem> getRegularGoalList() {
        return this.regularGoalList;
    }

    @Nullable
    public final String getSex() {
        return this.sex;
    }

    @NotNull
    public final String getSexOrDefault() {
        String str = this.sex;
        if (str == null || str.length() == 0) {
            return "male";
        }
        String str2 = this.sex;
        Intrinsics.checkNotNull(str2);
        return str2;
    }

    public final int getSpecialMark() {
        return this.specialMark;
    }

    @Nullable
    public final List<DallyGoalItem> getTargetListOrDefault() {
        List<DallyGoalItem> list = this.regularGoalList;
        if (list == null || list.isEmpty()) {
            return getDefaultAPPGoal();
        }
        Logger.i(TAG, "getRainbowItemGoalMap: src goalList = " + this.regularGoalList);
        return this.regularGoalList;
    }

    public final int getVo2Max() {
        return this.vo2Max;
    }

    @Nullable
    public final UserWearMedal getWear_medal() {
        return this.wear_medal;
    }

    public final float getWeight() {
        return this.weight;
    }

    public final float getWeightOrDefault() {
        float f = this.weight;
        if (f == 0.0f) {
            return 60.0f;
        }
        return f;
    }

    @Nullable
    public final String getZone_name() {
        return this.zone_name;
    }

    public final int getZone_offset() {
        return this.zone_offset;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public final void initDailyCalGoal() {
        this.dailyCalGoal = this.DEFAULT_DAILY_CAL_GOAL;
    }

    public final void initDailyHmsGoal() {
        this.dailyMhsGoal = 30;
    }

    public final void initDailyStandTimesGoal() {
        this.dailyStandTimesGoal = 12;
    }

    public final void initDailyStepGoal() {
        this.dailyStepGoal = 6000;
    }

    public final boolean isCompleted() {
        return !TextUtils.isEmpty(this.birth) && !TextUtils.isEmpty(this.sex) && this.height > 0.0f && this.weight > 0.0f;
    }

    public final boolean regularGoalChange(@Nullable Object other) {
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.xiaomi.fitness.account.api.bean.UserProfile");
        UserProfile userProfile = (UserProfile) other;
        Logger.d(TAG, this.regularGoalList + " === " + userProfile.regularGoalList);
        if (compareObject(this.regularGoalList, userProfile.regularGoalList)) {
            Logger.d(TAG, "goal change");
            return false;
        }
        Logger.d(TAG, "goal not change");
        return true;
    }

    public final void setBirth(@Nullable String str) {
        this.birth = str;
    }

    public final void setDEFAULT_DAILY_CAL_GOAL(int i) {
        this.DEFAULT_DAILY_CAL_GOAL = i;
    }

    public final void setDailyCalGoal(int i) {
        this.dailyCalGoal = i;
    }

    public final void setDailyMhsGoal(int i) {
        this.dailyMhsGoal = i;
    }

    public final void setDailySleepGoal(int i) {
        this.dailySleepGoal = i;
    }

    public final void setDailyStandTimesGoal(int i) {
        this.dailyStandTimesGoal = i;
    }

    public final void setDailyStepGoal(int i) {
        this.dailyStepGoal = i;
    }

    public final void setDefaultGoalConfig(@NotNull UserProfile newProfile, int support) {
        List<DallyGoalItem> list;
        DallyGoalItem dallyGoalItem;
        Intrinsics.checkNotNullParameter(newProfile, "newProfile");
        try {
            ArrayList arrayList = new ArrayList();
            Logger.d("UserProfile setDefaultGoalConfig Goal manager jsonGoalist is " + arrayList, new Object[0]);
            newProfile.dailyCalGoal = this.DEFAULT_DAILY_CAL_GOAL;
            arrayList.add(new DallyGoalItem(2, this.dailyCalGoal));
            newProfile.dailyStepGoal = 6000;
            arrayList.add(new DallyGoalItem(1, 6000));
            List<DallyGoalItem> list2 = newProfile.regularGoalList;
            Integer numValueOf = list2 != null ? Integer.valueOf(list2.size()) : null;
            if (support == Integer.parseInt("3")) {
                newProfile.dailyStandTimesGoal = 12;
                arrayList.add(new DallyGoalItem(3, 12));
            } else if (support == Integer.parseInt("4") || newProfile.regularGoalList == null || numValueOf == null || numValueOf.intValue() < 3 || (list = newProfile.regularGoalList) == null || (dallyGoalItem = list.get(2)) == null || dallyGoalItem.getField() != Integer.parseInt("3")) {
                newProfile.dailyMhsGoal = 30;
                arrayList.add(new DallyGoalItem(4, 30));
            } else {
                newProfile.dailyStandTimesGoal = 12;
                arrayList.add(new DallyGoalItem(3, 12));
            }
            newProfile.regularGoalList = arrayList;
            this.zone_name = TimeZone.getDefault().getID();
            this.zone_offset = TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 1000;
            Logger.i("UserProfile setDefaultGoalConfig Goal manager setThirdTarget , zone_name = " + this.zone_name + ", newProfile = " + newProfile + ", regularGoalList == " + arrayList, new Object[0]);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void setDefaultGoalMhsConfig(@NotNull UserProfile newProfile, int support) {
        List<DallyGoalItem> list;
        DallyGoalItem dallyGoalItem;
        Intrinsics.checkNotNullParameter(newProfile, "newProfile");
        try {
            ArrayList arrayList = new ArrayList();
            Logger.d("UserProfile setDefaultGoalConfig Goal manager jsonGoalist is " + arrayList, new Object[0]);
            List<DallyGoalItem> list2 = newProfile.regularGoalList;
            Integer numValueOf = list2 != null ? Integer.valueOf(list2.size()) : null;
            arrayList.add(new DallyGoalItem(2, newProfile.dailyCalGoal));
            arrayList.add(new DallyGoalItem(1, newProfile.dailyStepGoal));
            if (support == Integer.parseInt("3")) {
                newProfile.dailyStandTimesGoal = 12;
                arrayList.add(new DallyGoalItem(3, 12));
            } else if (support == Integer.parseInt("4") || newProfile.regularGoalList == null || numValueOf == null || numValueOf.intValue() < 3 || (list = newProfile.regularGoalList) == null || (dallyGoalItem = list.get(2)) == null || dallyGoalItem.getField() != Integer.parseInt("3")) {
                newProfile.dailyMhsGoal = 30;
                arrayList.add(new DallyGoalItem(4, 30));
            } else {
                newProfile.dailyStandTimesGoal = 12;
                arrayList.add(new DallyGoalItem(3, 12));
            }
            newProfile.regularGoalList = arrayList;
            this.zone_name = TimeZone.getDefault().getID();
            this.zone_offset = TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 1000;
            Logger.i("UserProfile setDefaultGoalConfig Goal manager setThirdTarget , zone_name = " + this.zone_name + ", newProfile = " + newProfile + ", regularGoalList == " + arrayList, new Object[0]);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void setDids(@Nullable List<String> list) {
        this.dids = list;
    }

    public final void setGoalConfig(@NotNull UserProfile newProfile, int value, int index) {
        List<DallyGoalItem> list;
        DallyGoalItem dallyGoalItem;
        Intrinsics.checkNotNullParameter(newProfile, "newProfile");
        try {
            ArrayList arrayList = new ArrayList();
            Logger.d("UserProfile Goal manager jsonGoalist is " + arrayList, new Object[0]);
            int goalValue = index == Integer.parseInt("2") ? value : getGoalValue("2", newProfile.regularGoalList);
            newProfile.dailyCalGoal = goalValue;
            arrayList.add(new DallyGoalItem(2, goalValue));
            int goalValue2 = index == Integer.parseInt("1") ? value : getGoalValue("1", newProfile.regularGoalList);
            newProfile.dailyStepGoal = goalValue2;
            arrayList.add(new DallyGoalItem(1, goalValue2));
            List<DallyGoalItem> list2 = newProfile.regularGoalList;
            Integer numValueOf = list2 != null ? Integer.valueOf(list2.size()) : null;
            if (index == Integer.parseInt("3")) {
                if (index != Integer.parseInt("3")) {
                    value = getGoalValue("3", newProfile.regularGoalList);
                }
                newProfile.dailyStandTimesGoal = value;
                arrayList.add(new DallyGoalItem(3, value));
            } else if (index == Integer.parseInt("4")) {
                if (index != Integer.parseInt("4")) {
                    value = getGoalValue("4", newProfile.regularGoalList);
                }
                newProfile.dailyMhsGoal = value;
                arrayList.add(new DallyGoalItem(4, value));
            } else if (newProfile.regularGoalList == null || numValueOf == null || numValueOf.intValue() < 3 || (list = newProfile.regularGoalList) == null || (dallyGoalItem = list.get(2)) == null || dallyGoalItem.getField() != Integer.parseInt("3")) {
                if (index != Integer.parseInt("4")) {
                    value = getGoalValue("4", newProfile.regularGoalList);
                }
                newProfile.dailyMhsGoal = value;
                arrayList.add(new DallyGoalItem(4, value));
            } else {
                if (index != Integer.parseInt("3")) {
                    value = getGoalValue("3", newProfile.regularGoalList);
                }
                newProfile.dailyStandTimesGoal = value;
                arrayList.add(new DallyGoalItem(3, value));
            }
            newProfile.regularGoalList = arrayList;
            this.zone_name = TimeZone.getDefault().getID();
            this.zone_offset = TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 1000;
            Logger.i("UserProfile Goal manager setThirdTarget , zone_name = " + this.zone_name + ", newProfile = " + newProfile + ", regularGoalList == " + arrayList, new Object[0]);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void setHeight(float f) {
        this.height = f;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setInitialWeight(@Nullable InitialWeight initialWeight) {
        this.initialWeight = initialWeight;
    }

    public final void setMaxHrm(int i) {
        this.maxHrm = i;
    }

    public final void setMaximalMet(float f) {
        this.maximalMet = f;
    }

    public final void setMinHrm(int i) {
        this.minHrm = i;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setRecordMaxHrm(@Nullable RecordMaxHrm recordMaxHrm) {
        this.recordMaxHrm = recordMaxHrm;
    }

    public final void setRegion(@Nullable String str) {
        this.region = str;
    }

    public final void setRegularGoalList(@Nullable List<DallyGoalItem> list) {
        this.regularGoalList = list;
    }

    public final void setSex(@Nullable String str) {
        this.sex = str;
    }

    public final void setSpecialMark(int i) {
        this.specialMark = i;
    }

    public final void setVo2Max(int i) {
        this.vo2Max = i;
    }

    public final void setWear_medal(@Nullable UserWearMedal userWearMedal) {
        this.wear_medal = userWearMedal;
    }

    public final void setWeight(float f) {
        this.weight = f;
    }

    public final void setZone_name(@Nullable String str) {
        this.zone_name = str;
    }

    public final void setZone_offset(int i) {
        this.zone_offset = i;
    }

    @NotNull
    public String toString() {
        return "UserProfile(icon=" + this.icon + ", sex=" + this.sex + ", birth=" + this.birth + ", height=" + this.height + ", weight=" + this.weight + ", region=" + this.region + ", vo2Max=" + this.vo2Max + ", maxHrm=" + this.maxHrm + ", minHrm=" + this.minHrm + ", recordMaxHrm=" + this.recordMaxHrm + ", dailyCalGoal=" + this.dailyCalGoal + ", dailyStepGoal=" + this.dailyStepGoal + ", dailySleepGoal=" + this.dailySleepGoal + ", zone_offset=" + this.zone_offset + ", zone_name=" + this.zone_name + ", dailyStandTimesGoal=" + this.dailyStandTimesGoal + ", dailyMhsGoal=" + this.dailyMhsGoal + ", regularGoalList=" + this.regularGoalList + ", specialMark=" + this.specialMark + ", initialWeight=" + this.initialWeight + ", maximalMet=" + this.maximalMet + ", dids=" + this.dids;
    }

    public UserProfile(@NotNull String name, @Nullable String str, @Nullable String str2, @Nullable String str3, float f, float f2, @Nullable String str4, int i, int i2, int i3, @Nullable RecordMaxHrm recordMaxHrm, int i4, int i5, int i6, int i7, @Nullable String str5, int i8, int i9, @Nullable List<DallyGoalItem> list, int i10, @Nullable InitialWeight initialWeight, float f3, @Nullable List<String> list2, @Nullable UserWearMedal userWearMedal) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.icon = str;
        this.sex = str2;
        this.birth = str3;
        this.height = f;
        this.weight = f2;
        this.region = str4;
        this.vo2Max = i;
        this.maxHrm = i2;
        this.minHrm = i3;
        this.recordMaxHrm = recordMaxHrm;
        this.dailyCalGoal = i4;
        this.dailyStepGoal = i5;
        this.dailySleepGoal = i6;
        this.zone_offset = i7;
        this.zone_name = str5;
        this.dailyStandTimesGoal = i8;
        this.dailyMhsGoal = i9;
        this.regularGoalList = list;
        this.specialMark = i10;
        this.initialWeight = initialWeight;
        this.maximalMet = f3;
        this.dids = list2;
        this.wear_medal = userWearMedal;
        int defaultCalore = getDefaultCalore();
        this.DEFAULT_DAILY_CAL_GOAL = defaultCalore;
        this.DEFAULT_TARGET = new int[]{6000, defaultCalore, 12, 30};
    }

    public /* synthetic */ UserProfile(String str, String str2, String str3, String str4, float f, float f2, String str5, int i, int i2, int i3, RecordMaxHrm recordMaxHrm, int i4, int i5, int i6, int i7, String str6, int i8, int i9, List list, int i10, InitialWeight initialWeight, float f3, List list2, UserWearMedal userWearMedal, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? 0.0f : f, (i11 & 32) != 0 ? 0.0f : f2, (i11 & 64) != 0 ? null : str5, (i11 & 128) != 0 ? 0 : i, (i11 & 256) != 0 ? 0 : i2, (i11 & 512) != 0 ? 0 : i3, (i11 & 1024) != 0 ? null : recordMaxHrm, (i11 & 2048) != 0 ? 0 : i4, (i11 & 4096) != 0 ? 0 : i5, (i11 & 8192) != 0 ? 0 : i6, (i11 & 16384) != 0 ? 0 : i7, (i11 & 32768) != 0 ? null : str6, (i11 & 65536) != 0 ? 0 : i8, (i11 & 131072) != 0 ? 0 : i9, (i11 & 262144) != 0 ? null : list, (i11 & 524288) != 0 ? 0 : i10, (i11 & EventRecurrence.TH) != 0 ? null : initialWeight, (i11 & 2097152) != 0 ? 0.0f : f3, (i11 & 4194304) != 0 ? null : list2, (i11 & NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY) != 0 ? null : userWearMedal);
    }
}
