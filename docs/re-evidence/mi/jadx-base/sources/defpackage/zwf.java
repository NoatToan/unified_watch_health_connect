package defpackage;

import android.text.TextUtils;
import cn.miao.health.bean.HeartInfo;
import cn.miao.health.bean.ManualInputInfo;
import cn.miao.health.bean.SleepInfo;
import com.miui.tsmclient.model.mitsm.h;
import com.xiaomi.accountsdk.account.ServerErrorCode;
import com.xiaomi.fitness.access.misport.MiSportImportUtilKt;

/* JADX INFO: loaded from: classes.dex */
public class zwf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41747a = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41748b = "用户信息传入有误";
    public final int c = 10009;
    public final String d = "年龄、性别、运动消耗、身高和体重为必填参数";
    public final int e = 10010;
    public final String f = "年龄、性别、时长、身高和体重为必填参数";
    public final int g = MiSportImportUtilKt.REQUEST_CODE;
    public final String h = "身高传入范围为[20,250](cm)";
    public final int i = 10012;
    public final String j = "体重传入范围为[20,250](kg)";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f41749k = 10013;
    public final String l = "性别传入有误，1为男性，2为女性";
    public final int m = h.v;
    public final String n = "时长传入范围为(0,1440]分钟";
    public final int o = 10015;
    public final String p = "步数传入范围为[0,999999]";
    public final int q = ServerErrorCode.ERROR_LACK_OF_PARAM;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f41750r = "年龄、性别、时长、体重为必填参数";
    public final int s = ServerErrorCode.ERROR_ILLEGAL_PARAM;
    public final String t = "时长为必填参数";
    public final int u = 10018;
    public final String v = "蹬踏次数传入范围为[0,999999]";
    public final int w = 10020;
    public final String x = "年龄、性别、身高、体重和称重时间为必填参数";
    public final int y = 10030;
    public final String z = "年龄、心率、测量时间为必填参数";
    public final int A = 10031;
    public final String B = "年龄传入范围为[14,150]";
    public final int C = 10032;
    public final String D = "心率传入范围为(0,300)";
    public final int E = 10040;
    public final String F = "传入睡眠对象不能为空,年龄不能为空";
    public final int G = 10041;
    public final String H = "传入的就寝时间需要在起床时间之前";
    public final int I = 10042;
    public final String J = "%1$s传入范围为(0,1440)且小于(1440-%2$s)";
    public final String K = "%1$s传入范围为[0,%2$d)";
    public final String L = "入睡时长";
    public final String M = "睡眠时长";
    public final String N = "夜间清醒时间";
    public final String O = "深度睡眠时间";
    public final String P = "浅度睡眠时间";
    public final int Q = 10050;
    public final String R = "高压、低压、测量时间为必填参数";
    public final int S = 10060;
    public final String T = "开始时间、结束时间、经期时长为必填参数";
    public final int U = 10061;
    public final String V = "传入的开始时间需要在结束时间之前";
    public final int W = 10070;
    public final String X = "单日站立时间、产生时间为必填参数";
    public final int Y = 10071;
    public final String Z = "单日站立时间为24位0、1字符,例:010000000000000000000000";
    public final int a0 = h.C;
    public final String b0 = "时间字符串格式有误，请参考yyyy/MM/dd HH:mm:ss";
    public final int c0 = 10090;
    public final String d0 = "运动方式，时长，性别为必填参数";
    public final int e0 = 10091;
    public final String f0 = "次数，跳绳时间为毕传参数";

    public void a(HeartInfo heartInfo, ywf ywfVar) {
        if (ywfVar == null) {
            return;
        }
        if (!ju3.b(heartInfo)) {
            ywfVar.onError(10030, "年龄、心率、测量时间为必填参数");
            return;
        }
        if (!ju3.j(heartInfo.getUserId())) {
            ywfVar.onError(1000, "用户信息传入有误");
            return;
        }
        if (!ju3.a(heartInfo.getAge().intValue())) {
            ywfVar.onError(10031, "年龄传入范围为[14,150]");
            return;
        }
        if (!ju3.c(heartInfo.getHeartRate().intValue()) || ((heartInfo.getHeartRateMin() != null && !ju3.c(heartInfo.getHeartRateMin().intValue())) || ((heartInfo.getHeartRateMax() != null && !ju3.c(heartInfo.getHeartRateMax().intValue())) || (heartInfo.getHeartRateResting() != null && !ju3.c(heartInfo.getHeartRateResting().intValue()))))) {
            ywfVar.onError(10032, "心率传入范围为(0,300)");
        } else if (ju3.i(heartInfo.getMeasureTime())) {
            ywfVar.onResponse(q91.a(heartInfo));
        } else {
            ywfVar.onError(h.C, "时间字符串格式有误，请参考yyyy/MM/dd HH:mm:ss");
        }
    }

    public void b(ManualInputInfo manualInputInfo, ywf ywfVar) {
        if (ywfVar == null) {
            return;
        }
        if (!ju3.d(manualInputInfo)) {
            ywfVar.onError(10090, "运动方式，时长，性别为必填参数");
            return;
        }
        if (!ju3.j(manualInputInfo.getUserId())) {
            ywfVar.onError(1000, "用户信息传入有误");
            return;
        }
        try {
            ywfVar.onResponse(q91.b(manualInputInfo));
        } catch (Exception e) {
            ywfVar.onError(10091, e.getMessage());
        }
    }

    public void c(SleepInfo sleepInfo, ywf ywfVar) {
        int i;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        if (ywfVar == null) {
            return;
        }
        int iIntValue4 = 0;
        if (sleepInfo != null) {
            int iIntValue5 = sleepInfo.getFallAsleepDuration() != null ? sleepInfo.getFallAsleepDuration().intValue() : 0;
            iIntValue4 = sleepInfo.getSleepDuration() != null ? sleepInfo.getSleepDuration().intValue() : 0;
            iIntValue = sleepInfo.getWakingDuration() != null ? sleepInfo.getWakingDuration().intValue() : -1;
            iIntValue2 = sleepInfo.getDeepSleepDuration() != null ? sleepInfo.getDeepSleepDuration().intValue() : -1;
            iIntValue3 = sleepInfo.getLightSleepDuration() != null ? sleepInfo.getLightSleepDuration().intValue() : -1;
            int i2 = iIntValue5;
            i = iIntValue4;
            iIntValue4 = i2;
        } else {
            i = 0;
            iIntValue = -1;
            iIntValue2 = -1;
            iIntValue3 = -1;
        }
        if (!ju3.h(sleepInfo)) {
            ywfVar.onError(10040, "传入睡眠对象不能为空,年龄不能为空");
            return;
        }
        if (!ju3.j(sleepInfo.getUserId())) {
            ywfVar.onError(1000, "用户信息传入有误");
            return;
        }
        if (!ju3.a(sleepInfo.getAge().intValue())) {
            ywfVar.onError(10031, "年龄传入范围为[14,150]");
            return;
        }
        if ((!TextUtils.isEmpty(sleepInfo.getBedTime()) && !ju3.i(sleepInfo.getBedTime())) || (!TextUtils.isEmpty(sleepInfo.getWakeupTime()) && !ju3.i(sleepInfo.getWakeupTime()))) {
            ywfVar.onError(h.C, "时间字符串格式有误，请参考yyyy/MM/dd HH:mm:ss");
            return;
        }
        if (ju3.i(sleepInfo.getBedTime()) && ju3.i(sleepInfo.getWakeupTime()) && !sp5.a(sleepInfo.getBedTime()).before(sp5.a(sleepInfo.getWakeupTime()))) {
            ywfVar.onError(10041, "传入的就寝时间需要在起床时间之前");
            return;
        }
        if (iIntValue4 != 0 && (!ju3.e(iIntValue4) || !ju3.g(iIntValue4, 1440, i))) {
            ywfVar.onError(10042, String.format("%1$s传入范围为(0,1440)且小于(1440-%2$s)", "入睡时长", "睡眠时长"));
            return;
        }
        if (i != 0 && (!ju3.e(i) || !ju3.g(i, 1440, iIntValue4))) {
            ywfVar.onError(10042, String.format("%1$s传入范围为(0,1440)且小于(1440-%2$s)", "睡眠时长", "入睡时长"));
            return;
        }
        if (iIntValue != -1) {
            int i3 = i != 0 ? i : 1440;
            if (!ju3.f(iIntValue, i3)) {
                ywfVar.onError(10042, String.format("%1$s传入范围为[0,%2$d)", "夜间清醒时间", Integer.valueOf(i3)));
                return;
            }
        }
        if (iIntValue2 != -1) {
            int i4 = i != 0 ? i : 1440;
            if (!ju3.f(iIntValue2, i4)) {
                ywfVar.onError(10042, String.format("%1$s传入范围为[0,%2$d)", "深度睡眠时间", Integer.valueOf(i4)));
                return;
            }
        }
        if (iIntValue3 != -1) {
            if (i == 0) {
                i = 1440;
            }
            if (!ju3.f(iIntValue3, i)) {
                ywfVar.onError(10042, String.format("%1$s传入范围为[0,%2$d)", "浅度睡眠时间", Integer.valueOf(i)));
                return;
            }
        }
        ywfVar.onResponse(q91.c(sleepInfo));
    }
}
