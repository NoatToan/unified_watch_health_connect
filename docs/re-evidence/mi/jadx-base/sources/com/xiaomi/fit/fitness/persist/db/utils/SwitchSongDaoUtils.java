package com.xiaomi.fit.fitness.persist.db.utils;

import com.google.gson.Gson;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.data.item.SwitchSongItem;
import com.xiaomi.fit.fitness.persist.db.FitnessDatabase;
import com.xiaomi.fit.fitness.persist.db.internal.SwitchSongDao;
import com.xiaomi.fit.fitness.persist.db.internal.SwitchSongEntity;
import com.xiaomi.fit.fitness.persist.server.FitnessDataRequest;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.internal.extetions.LogExtKt;
import com.xiaomi.fitness.sport_eco.SportConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\rH\u0080@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005H\u0002J\u001b\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/utils/SwitchSongDaoUtils;", "", "<init>", "()V", "TAG", "", "switchSongDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/SwitchSongDao;", "getSwitchSongDao", "()Lcom/xiaomi/fit/fitness/persist/db/internal/SwitchSongDao;", "gson", "Lcom/google/gson/Gson;", "uploadSwitchSong", "", "uploadSwitchSong$fitness_data_core_chinaProductRelease", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateOrInsertSwitchSong", SportConstants.KEY_TIMESTAMP, "", "playerId", "", "value", "buildSwitchSongJSONObj", "Lorg/json/JSONObject;", "getSwitchSongByTimeStamp", "", "Lcom/xiaomi/fit/fitness/export/data/item/SwitchSongItem;", "getSwitchSongByTimeStamp$fitness_data_core_chinaProductRelease", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSwitchSongDaoUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwitchSongDaoUtils.kt\ncom/xiaomi/fit/fitness/persist/db/utils/SwitchSongDaoUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,139:1\n1863#2,2:140\n1863#2,2:142\n37#3:144\n36#3,3:145\n*S KotlinDebug\n*F\n+ 1 SwitchSongDaoUtils.kt\ncom/xiaomi/fit/fitness/persist/db/utils/SwitchSongDaoUtils\n*L\n27#1:140,2\n44#1:142,2\n45#1:144\n45#1:145,3\n*E\n"})
public final class SwitchSongDaoUtils {

    @NotNull
    private static final String TAG = "SwitchSongDaoUtils";

    @NotNull
    public static final SwitchSongDaoUtils INSTANCE = new SwitchSongDaoUtils();

    @NotNull
    private static final Gson gson = new Gson();

    private SwitchSongDaoUtils() {
    }

    private final JSONObject buildSwitchSongJSONObj(int playerId, String value) {
        try {
            Logger.i(TAG, "insertSwitchSong-build:" + value);
            JSONObject jSONObject = new JSONObject(value);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("songName", jSONObject.optString("songName"));
            jSONObject2.put("shareUrl", jSONObject.optString("shareUrl"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("playerDataList");
            if (jSONArrayOptJSONArray == null) {
                return jSONObject2;
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (playerId == jSONObjectOptJSONObject.optInt("playerId")) {
                    jSONObject2.put("name", jSONObjectOptJSONObject.optString("name"));
                    jSONObject2.put("aliasName", jSONObjectOptJSONObject.optString("alias"));
                    jSONObject2.put("color", jSONObjectOptJSONObject.optJSONArray("color"));
                    jSONObject2.put("starNum", jSONObjectOptJSONObject.optInt("starNum"));
                    jSONObject2.put("score", jSONObjectOptJSONObject.optInt("score"));
                    jSONObject2.put("calories", jSONObjectOptJSONObject.optString("calories"));
                    return jSONObject2;
                }
            }
            return jSONObject2;
        } catch (Exception e) {
            FitnessLogUtils.e(TAG, "parse song record exception", e);
            return null;
        }
    }

    private final SwitchSongDao getSwitchSongDao() {
        return FitnessDatabase.INSTANCE.getInstance().switchSongDao();
    }

    @NotNull
    public final List<SwitchSongItem> getSwitchSongByTimeStamp$fitness_data_core_chinaProductRelease(long timeStamp) {
        ArrayList arrayList = new ArrayList();
        SwitchSongEntity entityByTimeStamp = getSwitchSongDao().getEntityByTimeStamp(timeStamp);
        try {
            JSONArray jSONArray = new JSONArray(entityByTimeStamp != null ? entityByTimeStamp.getValue() : null);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(gson.fromJson(jSONArray.get(i).toString(), SwitchSongItem.class));
            }
        } catch (Exception e) {
            FitnessLogUtils.e(TAG, "getSwitchSongByTimeStamp exception", e);
        }
        return arrayList;
    }

    public final void updateOrInsertSwitchSong(long timeStamp, int playerId, @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        SwitchSongEntity entityByTimeStamp = getSwitchSongDao().getEntityByTimeStamp(timeStamp);
        if (entityByTimeStamp == null) {
            try {
                JSONObject jSONObjectBuildSwitchSongJSONObj = buildSwitchSongJSONObj(playerId, value);
                if (jSONObjectBuildSwitchSongJSONObj != null) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObjectBuildSwitchSongJSONObj);
                    Logger.d(TAG, "insertSwitchSong-insert:" + jSONArray);
                    String string = jSONArray.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    INSTANCE.getSwitchSongDao().insert(new SwitchSongEntity(timeStamp, string, 0, null, 12, null));
                } else {
                    FitnessLogUtils.w(TAG, "can not insert song with fail decoding");
                    Unit unit = Unit.INSTANCE;
                }
                return;
            } catch (Exception e) {
                FitnessLogUtils.e(TAG, "insert switch song exception", e);
                Unit unit2 = Unit.INSTANCE;
                return;
            }
        }
        try {
            JSONArray jSONArray2 = new JSONArray(entityByTimeStamp.getValue());
            JSONObject jSONObjectBuildSwitchSongJSONObj2 = buildSwitchSongJSONObj(playerId, value);
            if (jSONObjectBuildSwitchSongJSONObj2 != null) {
                jSONArray2.put(jSONObjectBuildSwitchSongJSONObj2);
            }
            entityByTimeStamp.setValue(jSONArray2.toString());
            FitnessLogUtils.d(TAG, "record-dance-song:" + timeStamp + " - " + entityByTimeStamp.getTime() + "-" + entityByTimeStamp.getValue() + "-" + entityByTimeStamp.isUpload());
            getSwitchSongDao().update(entityByTimeStamp);
        } catch (Exception e2) {
            FitnessLogUtils.e(TAG, "update switch song exception", e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object uploadSwitchSong$fitness_data_core_chinaProductRelease(@NotNull Continuation<? super Unit> continuation) throws JSONException {
        SwitchSongDaoUtils$uploadSwitchSong$1 switchSongDaoUtils$uploadSwitchSong$1;
        List<SwitchSongEntity> list;
        Exception e;
        SwitchSongDaoUtils switchSongDaoUtils;
        boolean zBooleanValue;
        if (continuation instanceof SwitchSongDaoUtils$uploadSwitchSong$1) {
            switchSongDaoUtils$uploadSwitchSong$1 = (SwitchSongDaoUtils$uploadSwitchSong$1) continuation;
            int i = switchSongDaoUtils$uploadSwitchSong$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                switchSongDaoUtils$uploadSwitchSong$1.label = i - Integer.MIN_VALUE;
            } else {
                switchSongDaoUtils$uploadSwitchSong$1 = new SwitchSongDaoUtils$uploadSwitchSong$1(this, continuation);
            }
        } else {
            switchSongDaoUtils$uploadSwitchSong$1 = new SwitchSongDaoUtils$uploadSwitchSong$1(this, continuation);
        }
        Object obj = switchSongDaoUtils$uploadSwitchSong$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = switchSongDaoUtils$uploadSwitchSong$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            List<SwitchSongEntity> notUploadEntities = getSwitchSongDao().getNotUploadEntities();
            List<SwitchSongEntity> list2 = notUploadEntities;
            if (list2 == null || list2.isEmpty()) {
                LogExtKt.logi(TAG, "empty not upload switch songs!!");
            } else {
                JSONArray jSONArray = new JSONArray();
                for (SwitchSongEntity switchSongEntity : notUploadEntities) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("time", switchSongEntity.getTime());
                    jSONObject.put("value", switchSongEntity.getValue());
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("data", jSONArray);
                try {
                    FitnessDataRequest companion = FitnessDataRequest.INSTANCE.getInstance();
                    String string = jSONObject2.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    switchSongDaoUtils$uploadSwitchSong$1.L$0 = this;
                    switchSongDaoUtils$uploadSwitchSong$1.L$1 = notUploadEntities;
                    switchSongDaoUtils$uploadSwitchSong$1.label = 1;
                    Object objUploadSwitchSongData = companion.uploadSwitchSongData(string, switchSongDaoUtils$uploadSwitchSong$1);
                    if (objUploadSwitchSongData == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list = notUploadEntities;
                    obj = objUploadSwitchSongData;
                    switchSongDaoUtils = this;
                } catch (Exception e2) {
                    list = notUploadEntities;
                    e = e2;
                    switchSongDaoUtils = this;
                    Logger.e(TAG, "uploadSwitchSongException", e);
                    zBooleanValue = false;
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        list = (List) switchSongDaoUtils$uploadSwitchSong$1.L$1;
        switchSongDaoUtils = (SwitchSongDaoUtils) switchSongDaoUtils$uploadSwitchSong$1.L$0;
        try {
            ResultKt.throwOnFailure(obj);
        } catch (Exception e3) {
            e = e3;
            Logger.e(TAG, "uploadSwitchSongException", e);
            zBooleanValue = false;
        }
        zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((SwitchSongEntity) it.next()).setUpload(1);
            }
            SwitchSongDao switchSongDao = switchSongDaoUtils.getSwitchSongDao();
            SwitchSongEntity[] switchSongEntityArr = (SwitchSongEntity[]) list.toArray(new SwitchSongEntity[0]);
            switchSongDao.update((SwitchSongEntity[]) Arrays.copyOf(switchSongEntityArr, switchSongEntityArr.length));
        } else {
            LogExtKt.logi(TAG, "upload switch song error!!");
        }
        return Unit.INSTANCE;
    }
}
