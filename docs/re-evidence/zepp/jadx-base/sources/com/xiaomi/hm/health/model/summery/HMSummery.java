package com.xiaomi.hm.health.model.summery;

import android.text.TextUtils;
import com.facebook.appevents.UserDataStore;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.dataprocess.StageSleep;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.utils.Utils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class HMSummery extends Summery {
    public String date;
    public Sleep nap;
    public Pai pai;
    public Sleep sleep;
    public Steps steps;
    public int v = 0;
    public int active = 0;
    public int goal = 10000;
    public int mStatus = 0;

    @Deprecated
    public int rhrDeprecated = 0;

    public class a extends TypeToken<List<StageSleep>> {
    }

    private static Pai a(JSONObject paiStr) {
        try {
            double dOptDouble = paiStr.optDouble(Constant.PAI_KEY_LOW_ZONE_PAI);
            double dOptDouble2 = paiStr.optDouble(Constant.PAI_KEY_MEDIUM_ZONE_PAI);
            double dOptDouble3 = paiStr.optDouble(Constant.PAI_KEY_HIGH_ZONE_PAI);
            int i = (int) dOptDouble;
            int i2 = (int) dOptDouble2;
            int i3 = (int) dOptDouble3;
            int iOptDouble = (int) paiStr.optDouble(Constant.PAI_KEY_DAILY_PAI);
            int iOptDouble2 = (int) paiStr.optDouble("tp");
            int i4 = iOptDouble - ((i + i2) + i3);
            if (i4 == 1) {
                double d = dOptDouble - ((double) i);
                double d2 = dOptDouble2 - ((double) i2);
                double d3 = dOptDouble3 - ((double) i3);
                if (d > d2 && d > d3) {
                    i++;
                } else if (d2 > d && d2 > d3) {
                    i2++;
                } else if (d3 > d && d3 > d2) {
                    i3++;
                }
            } else if (i4 > 1) {
                double d4 = dOptDouble - ((double) i);
                double d5 = dOptDouble2 - ((double) i2);
                double d6 = dOptDouble3 - ((double) i3);
                if (d4 < d5 && d4 < d6) {
                    i2++;
                } else if (d5 < d4 && d5 < d6) {
                    i++;
                } else if (d6 < d4 && d6 < d5) {
                    i++;
                    i2++;
                }
                i3++;
            }
            return new Pai(i, i2, i3, paiStr.optInt(Constant.PAI_KEY_LOW_ZONE_MINUTES), paiStr.optInt(Constant.PAI_KEY_MEDIUM_ZONE_MINUTES), paiStr.optInt(Constant.PAI_KEY_HIGH_ZONE_MINUTES), iOptDouble, iOptDouble2, paiStr.optString(Constant.PAI_KEY_ACTIVITY_SCORES), paiStr.optString("nas"), paiStr.optInt(Constant.PAI_KEY_MAX_HR), paiStr.optInt(Constant.PAI_KEY_RHR), paiStr.optInt(Constant.PAI_KEY_GENDER), paiStr.optInt(Constant.PAI_KEY_LHR), paiStr.optInt(Constant.PAI_KEY_MHR), paiStr.optInt(Constant.PAI_KEY_HHR));
        } catch (Exception unused) {
            return null;
        }
    }

    public static Sleep parse2Nap(JSONArray oddStageStr) {
        List<StageSleep> list = (List) new Gson().fromJson(oddStageStr.toString(), new a().getType());
        if (list == null || list.size() <= 0) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (StageSleep stageSleep : list) {
            int i5 = stageSleep.mode;
            if (i5 == 5) {
                i3 += (stageSleep.stop - stageSleep.start) + 1;
            } else if (i5 == 4) {
                i += (stageSleep.stop - stageSleep.start) + 1;
            } else if (i5 == 7) {
                i2 += (stageSleep.stop - stageSleep.start) + 1;
            } else if (i5 == 8) {
                i4 += (stageSleep.stop - stageSleep.start) + 1;
            }
        }
        return new Sleep(i, ((StageSleep) list.get(0)).start, i2, i3, ((StageSleep) list.get(list.size() - 1)).stop, 0, 0, 0, i4, 0, 0);
    }

    public static HMSummery parseDBSummery(HMSummery summery, String sum) {
        if (TextUtils.isEmpty(sum) || summery == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(sum);
            int iOptInt = jSONObject.optInt(StatEvent.EventParams.TYPE_CARD_GOAL);
            summery.goal = iOptInt;
            if (iOptInt <= 0) {
                summery.goal = Utils.getGoalStepsCount();
            }
            summery.v = jSONObject.optInt("v");
            summery.active = jSONObject.optInt(AppMeasurementSdk.ConditionalUserProperty.ACTIVE);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(StepsInfo.KEY_STEP_INFO);
            if (jSONObjectOptJSONObject != null) {
                summery.steps = new Steps(jSONObjectOptJSONObject.optInt(StepsInfo.KEY_STEP_RUN_TIME), (!HMDeviceConfig.isSurpportNewCalories() || jSONObjectOptJSONObject.optInt(StepsInfo.KEY_NEW_CALORIES) <= jSONObjectOptJSONObject.optInt("cal")) ? jSONObjectOptJSONObject.optInt("cal") : jSONObjectOptJSONObject.optInt(StepsInfo.KEY_NEW_CALORIES), jSONObjectOptJSONObject.optInt(StepsInfo.KEY_STEP_RUN_DISTANCE), jSONObjectOptJSONObject.optInt(StepsInfo.KEY_STEP_WALK_TIME), jSONObjectOptJSONObject.optInt("ttl"), jSONObjectOptJSONObject.optInt(StepsInfo.KEY_STEP_RUN_CALORIES), jSONObjectOptJSONObject.optInt("dis"), summery.active);
            }
            summery.rhrDeprecated = jSONObject.optInt("rhr");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("slp");
            if (jSONObjectOptJSONObject2 != null) {
                long jOptLong = jSONObjectOptJSONObject2.optLong(UserDataStore.STATE);
                long jOptLong2 = jSONObjectOptJSONObject2.optLong("ed");
                if (jOptLong == 0 || jOptLong2 == 0) {
                    if (jOptLong == 0) {
                        jOptLong = jOptLong2;
                    }
                    if (jOptLong2 == 0) {
                        jOptLong2 = jOptLong;
                    }
                }
                summery.sleep = new Sleep(jSONObjectOptJSONObject2.optInt("lt"), jOptLong * 1000, jSONObjectOptJSONObject2.optInt(StepsInfo.KEY_STEP_WALK_TIME), jSONObjectOptJSONObject2.optInt(Constant.PAI_KEY_DAILY_PAI), jOptLong2 * 1000, jSONObjectOptJSONObject2.optInt("rhr") > 0 ? jSONObjectOptJSONObject2.optInt("rhr") : summery.rhrDeprecated, jSONObjectOptJSONObject2.optInt("is"), jSONObjectOptJSONObject2.optInt("lb"), jSONObjectOptJSONObject2.optInt("dt"), jSONObjectOptJSONObject2.optInt("ss"), jSONObjectOptJSONObject2.optInt("wc"));
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("odd_stage");
                if (jSONArrayOptJSONArray != null) {
                    summery.nap = parse2Nap(jSONArrayOptJSONArray);
                }
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("pai");
            if (jSONObjectOptJSONObject3 != null) {
                summery.pai = a(jSONObjectOptJSONObject3);
            }
        } catch (Exception e) {
            summery.mStatus = 0;
            HMLog.d("parseDBSummery error", "" + summery.date + ";" + summery.goal + "\n summary = " + sum, new Object[0]);
            e.printStackTrace();
        }
        return summery;
    }

    public static HMSummery parseUsrSummery(HMSummery summery, String sum, String usrSum) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        try {
            if (!TextUtils.isEmpty(sum)) {
                JSONObject jSONObject = new JSONObject(sum);
                int iOptInt = jSONObject.optInt(StatEvent.EventParams.TYPE_CARD_GOAL);
                summery.goal = iOptInt;
                if (iOptInt <= 0) {
                    summery.goal = Utils.getGoalStepsCount();
                }
                summery.v = jSONObject.optInt("v");
                summery.active = jSONObject.optInt(AppMeasurementSdk.ConditionalUserProperty.ACTIVE);
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(StepsInfo.KEY_STEP_INFO);
                if (jSONObjectOptJSONObject2 != null) {
                    summery.steps = new Steps(jSONObjectOptJSONObject2.optInt(StepsInfo.KEY_STEP_RUN_TIME), (!HMDeviceConfig.isSurpportNewCalories() || jSONObjectOptJSONObject2.optInt(StepsInfo.KEY_NEW_CALORIES) <= jSONObjectOptJSONObject2.optInt("cal")) ? jSONObjectOptJSONObject2.optInt("cal") : jSONObjectOptJSONObject2.optInt(StepsInfo.KEY_NEW_CALORIES), jSONObjectOptJSONObject2.optInt(StepsInfo.KEY_STEP_RUN_DISTANCE), jSONObjectOptJSONObject2.optInt(StepsInfo.KEY_STEP_WALK_TIME), jSONObjectOptJSONObject2.optInt("ttl"), jSONObjectOptJSONObject2.optInt(StepsInfo.KEY_STEP_RUN_CALORIES), jSONObjectOptJSONObject2.optInt("dis"), summery.active);
                }
                JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("pai");
                if (jSONObjectOptJSONObject3 != null) {
                    summery.pai = a(jSONObjectOptJSONObject3);
                }
            }
            if (!TextUtils.isEmpty(usrSum)) {
                JSONObject jSONObject2 = new JSONObject(usrSum);
                summery.sleep = new Sleep(jSONObject2.optInt("lt"), jSONObject2.optLong(UserDataStore.STATE) * 1000, jSONObject2.optInt(StepsInfo.KEY_STEP_WALK_TIME), jSONObject2.optInt(Constant.PAI_KEY_DAILY_PAI), jSONObject2.optLong("ed") * 1000, jSONObject2.optInt("rhr"), jSONObject2.optInt("is"), jSONObject2.optInt("lb"), jSONObject2.optInt("dt"), jSONObject2.optInt("ss"), jSONObject2.optInt("wc"));
            }
            if (!TextUtils.isEmpty(sum) && (jSONObjectOptJSONObject = new JSONObject(sum).optJSONObject("slp")) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("odd_stage")) != null) {
                summery.nap = parse2Nap(jSONArrayOptJSONArray);
            }
        } catch (Exception e) {
            summery.mStatus = 0;
            HMLog.d("parseDBSummery error", "" + summery.date + ";" + summery.goal + "\n summary = " + sum, new Object[0]);
            e.printStackTrace();
        }
        return summery;
    }

    public static HMSummery updateUsrSlp(HMSummery summery, String usrSum) {
        if (TextUtils.isEmpty(usrSum) || summery == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(usrSum);
            summery.sleep = new Sleep(jSONObject.optInt("lt"), jSONObject.optLong(UserDataStore.STATE) * 1000, jSONObject.optInt(StepsInfo.KEY_STEP_WALK_TIME), jSONObject.optInt(Constant.PAI_KEY_DAILY_PAI), jSONObject.optLong("ed") * 1000, jSONObject.optInt("rhr"), jSONObject.optInt("is"), jSONObject.optInt("lb"), jSONObject.optInt("dt"), jSONObject.optInt("ss"), jSONObject.optInt("wc"));
        } catch (Exception e) {
            summery.mStatus = 0;
            HMLog.d("parseUsrSlpSummery error", "" + summery.date + ";" + summery.goal + "\n summary = " + usrSum, new Object[0]);
            e.printStackTrace();
        }
        return summery;
    }

    public void copy(HMSummery summery) {
        this.date = summery.date;
        this.v = summery.v;
        this.goal = summery.goal;
        this.active = summery.active;
        this.sleep = summery.sleep;
        this.steps = summery.steps;
        this.nap = summery.nap;
        this.pai = summery.pai;
        this.mStatus = summery.mStatus;
    }

    public String toString() {
        Sleep sleep = this.sleep;
        String string = sleep != null ? sleep.toString() : "null";
        Steps steps = this.steps;
        String string2 = steps != null ? steps.toString() : "null";
        Pai pai = this.pai;
        return "date = " + this.date + "goal = " + this.goal + "\nsleep = " + string + "\nsteps = " + string2 + " \n active = " + this.active + " \n pai = " + (pai != null ? pai.toString() : "null");
    }
}
