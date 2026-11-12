package defpackage;

import com.google.gson.Gson;
import com.huami.algo.healthcare.HealthCare;
import com.huami.algo.healthcare.Spo2Info;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.fitness.parser.sport.track.parser.ParserHelper;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.Spo2Data;
import com.xiaomi.hm.health.bt.sdk.DailyData;
import com.xiaomi.hm.health.bt.sdk.DailyDataResult;
import com.xiaomi.hm.health.bt.sdk.spo2.OriginOsaEvent;
import com.xiaomi.hm.health.bt.sdk.spo2.OriginOsaProcess;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import com.xiaomi.onetrack.OneTrack;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a5\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\r\u001aC\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\b\u0010\u0014\u001aE\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0014\u001aI\u0010\b\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u001c\u001a%\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\b\u0010\u001f\u001a%\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u0017\u0010\u001f\u001aE\u0010\b\u001a\u00020\"2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010#\u001a-\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b\b\u0010'\u001a\u001d\u0010\u0017\u001a\u00020\u000f*\u00020\u00022\b\b\u0002\u0010)\u001a\u00020(H\u0000¢\u0006\u0004\b\u0017\u0010*\u001a\u0013\u0010\b\u001a\u00020\u0002*\u00020\u000fH\u0000¢\u0006\u0004\b\b\u0010+\u001a\u001f\u0010\b\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u00022\b\b\u0002\u0010-\u001a\u00020(¢\u0006\u0004\b\b\u0010*\u001a\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\b\u00100¨\u00061"}, d2 = {"Lne;", "hmMiLiProDevice", "", "startTime", "endTime", "", OneTrack.Param.TZ, "uid", PluginDeviceInfo.FMODEL, "(Lne;JJIJ)I", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2Data;", "source", "(Ljava/util/List;JJ)Ljava/util/List;", "osaEventData", "", "sn", "deviceSource", "deviceId", "Lcom/xiaomi/hm/health/bt/sdk/spo2/OriginOsaEvent;", "(Ljava/util/List;JLjava/lang/String;ILjava/lang/String;)Ljava/util/List;", "osaData", "Lcom/xiaomi/hm/health/bt/sdk/spo2/OriginOsaProcess;", PluginDeviceInfo.FDESC, "Lg4s;", "deviceInfo", "osaProcessesSource", "osaEventsSource", "(Lg4s;Ljava/util/List;Ljava/util/List;JJJ)I", "Ljava/util/Calendar;", "startTimeCalendar", "(Lne;Ljava/util/Calendar;)Ljava/util/List;", "Lcom/xiaomi/hm/health/bt/sdk/DailyDataResult;", "result", "", "(Lne;Ljava/util/List;Ljava/util/List;Lcom/xiaomi/hm/health/bt/sdk/DailyDataResult;J)V", "startCalendar", "", "type", "(Lne;Ljava/util/Calendar;B)Ljava/util/List;", "Ljava/util/TimeZone;", "timeZone", "(JLjava/util/TimeZone;)Ljava/lang/String;", "(Ljava/lang/String;)J", "timestamp", "timezone", DialWidgetType.DATE, "format", "(Ljava/lang/String;Ljava/lang/String;)J", "btData_wearRelease"}, k = 2, mv = {1, 7, 1})
public final class ln {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Gson f25229a = new Gson();

    @Metadata(bv = {}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"ln$a", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2Data;", "result", "", PluginDeviceInfo.FMODEL, "", "onFinish", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
    public static final class a extends HMCallback<List<? extends Spo2Data>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<List<Spo2Data>> f25230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f25231b;

        public a(Ref.ObjectRef<List<Spo2Data>> objectRef, CountDownLatch countDownLatch) {
            this.f25230a = objectRef;
            this.f25231b = countDownLatch;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onFinish(@Nullable List<? extends Spo2Data> result) {
            super.onFinish(result);
            this.f25230a.element = result;
            this.f25231b.countDown();
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean result) {
            super.onFinish(result);
            this.f25231b.countDown();
        }
    }

    public static final int a(@NotNull ne hmMiLiProDevice, long j, long j2, int i, long j3) {
        Intrinsics.checkNotNullParameter(hmMiLiProDevice, "hmMiLiProDevice");
        t5t.d("OdiDataUtil", "getSleepBreathScore start");
        g4s g4sVarO = hmMiLiProDevice.O();
        if (g4sVarO == null) {
            t5t.d("OdiDataUtil", "deviceInfo is null");
            return -1;
        }
        String sn = g4sVarO.a();
        int iB = g4sVarO.I().b();
        String deviceId = g4sVarO.G();
        Calendar startCalendar = njs.h(j, i);
        Intrinsics.checkNotNullExpressionValue(startCalendar, "startCalendar");
        List<Spo2Data> listA = a(hmMiLiProDevice, startCalendar, HMProSyncDataBaseProfile.DATA_SPO2_OSA);
        t5t.d("OdiDataUtil", "osaData sync");
        if (listA == null) {
            t5t.d("OdiDataUtil", "osaData is null");
            return -1;
        }
        List<Spo2Data> listA2 = a(hmMiLiProDevice, startCalendar, HMProSyncDataBaseProfile.DATA_SPO2_OSA_EVENT);
        t5t.d("OdiDataUtil", "osaEventData sync");
        if (listA2 == null) {
            t5t.d("OdiDataUtil", "osaEventData is null");
            return -1;
        }
        List<Spo2Data> listA3 = a(listA, j, j2);
        List<Spo2Data> listA4 = a(listA2, j, j2);
        Intrinsics.checkNotNullExpressionValue(sn, "sn");
        Intrinsics.checkNotNullExpressionValue(deviceId, "deviceId");
        List<OriginOsaProcess> listB = b(listA3, j3, sn, iB, deviceId);
        if (listB == null) {
            return -1;
        }
        List<OriginOsaEvent> listA5 = a(listA4, j3, sn, iB, deviceId);
        Spo2Info spo2Info = new Spo2Info();
        spo2Info.sleepStartTimeStamp = (int) (j / 1000);
        spo2Info.sleepStopTimeStamp = (int) (j2 / 1000);
        Gson gson = f25229a;
        spo2Info.osaProcessesJsonString = gson.toJson(listB);
        spo2Info.osaEventsJsonString = gson.toJson(listA5);
        t5t.d("OdiDataUtil", "HealthCare start");
        new HealthCare(250).calculateSpo2ValidInfo(spo2Info);
        t5t.d("OdiDataUtil", "HealthCare end");
        return spo2Info.sleepBreathingScore;
    }

    public static final List<OriginOsaProcess> b(List<? extends Spo2Data> list, long j, String str, int i, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Spo2Data spo2Data : list) {
            if (spo2Data instanceof et) {
                String strValueOf = String.valueOf(j);
                long timeStamp = spo2Data.getTimeStamp();
                et etVar = (et) spo2Data;
                int f15904a = etVar.getF15904a();
                byte f15905b = etVar.getF15905b();
                byte[] e = etVar.getE();
                ArrayList arrayList2 = new ArrayList(e.length);
                for (byte b2 : e) {
                    arrayList2.add(Integer.valueOf(b2));
                }
                byte[] f = etVar.getF();
                ArrayList arrayList3 = new ArrayList(f.length);
                for (byte b3 : f) {
                    arrayList3.add(Integer.valueOf(b3));
                }
                byte[] g = etVar.getG();
                ArrayList arrayList4 = new ArrayList(g.length);
                for (byte b4 : g) {
                    arrayList4.add(Integer.valueOf(b4));
                }
                byte[] h = etVar.getH();
                ArrayList arrayList5 = new ArrayList(h.length);
                for (byte b5 : h) {
                    arrayList5.add(Integer.valueOf(b5));
                }
                arrayList.add(new OriginOsaProcess(strValueOf, timeStamp, f15904a, f15905b, null, i, str2, str, arrayList2, arrayList3, arrayList4, arrayList5, null, false, 12304, null));
            } else if (spo2Data instanceof dt) {
                String strValueOf2 = String.valueOf(j);
                long timeStamp2 = spo2Data.getTimeStamp();
                dt dtVar = (dt) spo2Data;
                arrayList.add(new OriginOsaProcess(strValueOf2, timeStamp2, dtVar.getF15904a(), dtVar.getF15905b(), null, i, str2, str, null, null, null, null, null, false, 16144, null));
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        t5t.d("OdiDataUtil", "osaProcesses is empty");
        return null;
    }

    public static final List<Spo2Data> a(List<? extends Spo2Data> list, long j, long j2) {
        ArrayList arrayList = new ArrayList();
        for (Spo2Data spo2Data : list) {
            if (spo2Data.getTimeStamp() <= j2 / 1000 && spo2Data.getTimeStamp() >= j / 1000) {
                arrayList.add(spo2Data);
            }
        }
        return arrayList;
    }

    public static final List<OriginOsaEvent> a(List<? extends Spo2Data> list, long j, String str, int i, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Spo2Data spo2Data : list) {
            if (spo2Data instanceof ft) {
                String strValueOf = String.valueOf(j);
                long timeStamp = spo2Data.getTimeStamp();
                ft ftVar = (ft) spo2Data;
                byte[] c = ftVar.getC();
                ArrayList arrayList2 = new ArrayList(c.length);
                for (byte b2 : c) {
                    arrayList2.add(Integer.valueOf(b2));
                }
                byte[] d = ftVar.getD();
                ArrayList arrayList3 = new ArrayList(d.length);
                for (byte b3 : d) {
                    arrayList3.add(Integer.valueOf(b3));
                }
                arrayList.add(new OriginOsaEvent(strValueOf, timeStamp, arrayList2, arrayList3, ftVar.getF18170b(), null, i, str2, str, null, false, 1568, null));
            } else if (spo2Data instanceof gt) {
                arrayList.add(new OriginOsaEvent(String.valueOf(j), spo2Data.getTimeStamp(), null, null, 0, null, i, str2, str, null, false, 1596, null));
            }
        }
        return arrayList;
    }

    @Nullable
    public static final List<Spo2Data> b(@NotNull ne hmMiLiProDevice, @NotNull Calendar startTimeCalendar) {
        Intrinsics.checkNotNullParameter(hmMiLiProDevice, "hmMiLiProDevice");
        Intrinsics.checkNotNullParameter(startTimeCalendar, "startTimeCalendar");
        Object objClone = startTimeCalendar.clone();
        Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type java.util.Calendar");
        return a(hmMiLiProDevice, (Calendar) objClone, HMProSyncDataBaseProfile.DATA_SPO2_OSA_EVENT);
    }

    @NotNull
    public static final String b(long j, @NotNull TimeZone timeZone) {
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        return a(j, timeZone);
    }

    public static final int a(@NotNull g4s deviceInfo, @NotNull List<? extends Spo2Data> osaProcessesSource, @NotNull List<? extends Spo2Data> osaEventsSource, long j, long j2, long j3) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(osaProcessesSource, "osaProcessesSource");
        Intrinsics.checkNotNullParameter(osaEventsSource, "osaEventsSource");
        t5t.d("OdiDataUtil", "getSleepBreathScoreOneDay start");
        String sn = deviceInfo.a();
        int iB = deviceInfo.I().b();
        String deviceId = deviceInfo.G();
        List<Spo2Data> listA = a(osaProcessesSource, j, j2);
        List<Spo2Data> listA2 = a(osaEventsSource, j, j2);
        Intrinsics.checkNotNullExpressionValue(sn, "sn");
        Intrinsics.checkNotNullExpressionValue(deviceId, "deviceId");
        List<OriginOsaProcess> listB = b(listA, j3, sn, iB, deviceId);
        if (listB == null) {
            return -1;
        }
        List<OriginOsaEvent> listA3 = a(listA2, j3, sn, iB, deviceId);
        Spo2Info spo2Info = new Spo2Info();
        spo2Info.sleepStartTimeStamp = (int) (j / 1000);
        spo2Info.sleepStopTimeStamp = (int) (j2 / 1000);
        Gson gson = f25229a;
        spo2Info.osaProcessesJsonString = gson.toJson(listB);
        spo2Info.osaEventsJsonString = gson.toJson(listA3);
        t5t.d("OdiDataUtil", "HealthCare start");
        new HealthCare(250).calculateSpo2ValidInfo(spo2Info);
        t5t.d("OdiDataUtil", "HealthCare end");
        return spo2Info.sleepBreathingScore;
    }

    @Nullable
    public static final List<Spo2Data> a(@NotNull ne hmMiLiProDevice, @NotNull Calendar startTimeCalendar) {
        Intrinsics.checkNotNullParameter(hmMiLiProDevice, "hmMiLiProDevice");
        Intrinsics.checkNotNullParameter(startTimeCalendar, "startTimeCalendar");
        Object objClone = startTimeCalendar.clone();
        Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type java.util.Calendar");
        return a(hmMiLiProDevice, (Calendar) objClone, HMProSyncDataBaseProfile.DATA_SPO2_OSA);
    }

    public static final void a(@NotNull ne hmMiLiProDevice, @Nullable List<? extends Spo2Data> list, @Nullable List<? extends Spo2Data> list2, @NotNull DailyDataResult result, long j) {
        Iterator it;
        String str;
        ArrayList arrayList;
        String str2 = "metadata";
        Intrinsics.checkNotNullParameter(hmMiLiProDevice, "hmMiLiProDevice");
        Intrinsics.checkNotNullParameter(result, "result");
        if (list != null && list2 != null) {
            List<DailyData> list3 = result.getList();
            if (list3 != null) {
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    DailyData dailyData = (DailyData) it2.next();
                    try {
                        JSONObject jSONObject = new JSONObject(dailyData.getData());
                        JSONArray jSONArray = jSONObject.getJSONArray(str2);
                        if (jSONArray.length() == 1) {
                            Object obj = jSONArray.get(0);
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                            JSONObject jSONObject2 = (JSONObject) obj;
                            JSONObject jSONObject3 = new JSONObject(jSONObject2.getString("summary"));
                            JSONObject jSONObject4 = jSONObject3.getJSONObject(SleepInfo.KEY_SLEEP_INFO);
                            long j2 = jSONObject4.getLong("st") * 1000;
                            long j3 = 1000 * jSONObject4.getLong("ed");
                            g4s g4sVarO = hmMiLiProDevice.O();
                            Intrinsics.checkNotNullExpressionValue(g4sVarO, "hmMiLiProDevice.deviceInfo");
                            it = it2;
                            arrayList = arrayList2;
                            String str3 = str2;
                            try {
                                int iA = a(g4sVarO, list, list2, j2, j3, j);
                                if (iA != -1) {
                                    jSONObject4.put("sbs", iA);
                                }
                                jSONObject3.put(SleepInfo.KEY_SLEEP_INFO, jSONObject4);
                                jSONObject2.put("summary", jSONObject3.toString());
                                jSONArray.put(0, jSONObject2);
                                str = str3;
                                try {
                                    jSONObject.put(str, jSONArray);
                                    dailyData.setData(jSONObject.toString());
                                } catch (Exception unused) {
                                }
                            } catch (Exception unused2) {
                                str = str3;
                            }
                        } else {
                            it = it2;
                            str = str2;
                            arrayList = arrayList2;
                        }
                    } catch (Exception unused3) {
                    }
                    arrayList2 = arrayList;
                    arrayList2.add(Unit.INSTANCE);
                    str2 = str;
                    it2 = it;
                }
                return;
            }
            return;
        }
        t5t.d("OdiDataUtil", "osaData or osaEventData is Null");
        result.setError(100);
    }

    @Nullable
    public static final List<Spo2Data> a(@NotNull ne hmMiLiProDevice, @NotNull Calendar startCalendar, byte b2) {
        Intrinsics.checkNotNullParameter(hmMiLiProDevice, "hmMiLiProDevice");
        Intrinsics.checkNotNullParameter(startCalendar, "startCalendar");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        hmMiLiProDevice.L2(startCalendar, b2, new a(objectRef, countDownLatch));
        try {
            countDownLatch.await();
        } catch (Exception e) {
            t5t.m("OdiDataUtil", "latch await exception:" + e.getMessage());
        }
        return (List) objectRef.element;
    }

    public static final long a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return a(str, ParserHelper.DATA_FORMAT4);
    }

    @NotNull
    public static final String a(long j, @NotNull TimeZone timezone) {
        Object objM886constructorimpl;
        Intrinsics.checkNotNullParameter(timezone, "timezone");
        try {
            Result.Companion companion = Result.Companion;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ParserHelper.DATA_FORMAT4);
            simpleDateFormat.setTimeZone(timezone);
            objM886constructorimpl = Result.m886constructorimpl(simpleDateFormat.format(Long.valueOf(j)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m892isFailureimpl(objM886constructorimpl)) {
            objM886constructorimpl = "";
        }
        return (String) objM886constructorimpl;
    }

    public static final long a(String str, String str2) {
        Object objM886constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            Date date = new SimpleDateFormat(str2, Locale.getDefault()).parse(str);
            objM886constructorimpl = Result.m886constructorimpl(Long.valueOf(date != null ? date.getTime() : 0L));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
        if (thM889exceptionOrNullimpl != null) {
            le.c("OdiDataUtil", "dateToMillisecond error " + thM889exceptionOrNullimpl.getMessage(), new Object[0]);
        }
        if (Result.m892isFailureimpl(objM886constructorimpl)) {
            objM886constructorimpl = 0L;
        }
        return ((Number) objM886constructorimpl).longValue();
    }
}
