package defpackage;

import android.content.Context;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hms.network.embedded.k;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.views.coresleep.CoreSleepTotalData;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes19.dex */
public class uje {
    private Context e = BaseApplication.getContext();

    public HiAggregateOption e(long j, int i) {
        long j2;
        long j3;
        long j4;
        LogUtil.a("SleepInteractorHelper", "getBaseTimeHiOption， startTime: ", Long.valueOf(j));
        if (i != 7) {
            if (i == 30) {
                j2 = (j - (((long) (i - 30)) * k.b.m)) * 1000;
                j4 = 2505600;
            } else {
                LogUtil.j("SleepInteractorHelper", "dayNum: ", Integer.valueOf(i));
                j2 = 0;
                j3 = 0;
            }
            LogUtil.a("SleepInteractorHelper", "optionEndTime: ", Long.valueOf(j3), " optionStartTime:", Long.valueOf(j2));
            return b(j2, j3);
        }
        j2 = (j - (((long) (i - 7)) * k.b.m)) * 1000;
        j4 = 518400;
        j3 = (j + j4) * 1000;
        LogUtil.a("SleepInteractorHelper", "optionEndTime: ", Long.valueOf(j3), " optionStartTime:", Long.valueOf(j2));
        return b(j2, j3);
    }

    private HiAggregateOption b(long j, long j2) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(j);
        hiAggregateOption.setEndTime(j2);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setConstantsKey(new String[]{"core_sleep_fall_key", "core_sleep_wake_up_key"});
        hiAggregateOption.setType(new int[]{44201, 44202});
        hiAggregateOption.setGroupUnitSize(1);
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setReadType(0);
        return hiAggregateOption;
    }

    public String h(int i) {
        Context context = BaseApplication.getContext();
        if (i == 3008) {
            return context.getResources().getString(R.string.IDS_sleep_advice_3008, context.getResources().getQuantityString(R.plurals.IDS_details_sleep_latency_times, 3, 3));
        }
        if (i == 3012) {
            return context.getResources().getString(R.string.IDS_sleep_advice_3012, g(4));
        }
        if (i == 4018) {
            return context.getResources().getString(R.string.IDS_sleep_advice_4018, g(14));
        }
        if (i == 4022) {
            return context.getResources().getString(R.string.IDS_sleep_advice_4022, g(4));
        }
        if (i == 5008) {
            return context.getResources().getString(R.string.IDS_sleep_advice_5008, context.getResources().getQuantityString(R.plurals.IDS_hw_map_time_unit_value_minutes, 30, 30));
        }
        String string = context.getResources().getString(uix.b(i));
        return (LanguageUtil.c(BaseApplication.getContext()) && (i == 2002 || i == 2008 || i == 2010 || i == 4026)) ? c(string) : string;
    }

    public static String c(String str) {
        Matcher matcher = Pattern.compile("\\d+", 2).matcher(str);
        String strReplace = str;
        while (matcher.find()) {
            String strGroup = matcher.group();
            int iN = CommonUtil.n(BaseApplication.getContext(), strGroup);
            if (iN == 0) {
                return str;
            }
            strReplace = strReplace.replace(strGroup, UnitUtil.e(iN, 1, 0));
        }
        return strReplace;
    }

    private String y(int i, CoreSleepTotalData coreSleepTotalData) {
        if (c(coreSleepTotalData)) {
            return "";
        }
        return this.e.getResources().getString(uix.b(i), d(coreSleepTotalData.getResultInfoArr().getCurr().getDays().getOverSleep()), g(10));
    }

    private String x(int i, CoreSleepTotalData coreSleepTotalData) {
        if (c(coreSleepTotalData) || e(coreSleepTotalData)) {
            return "";
        }
        return b(i, coreSleepTotalData.getResultInfoArr().getCurr().getDays().getLackSleep(), coreSleepTotalData.getResultInfoArr().getLast().getDays().getLackSleep());
    }

    private String r(int i, CoreSleepTotalData coreSleepTotalData) {
        if (b(coreSleepTotalData) || d(coreSleepTotalData)) {
            return "";
        }
        return c(i, coreSleepTotalData.getResultInfoArr().getCurr(), coreSleepTotalData.getResultInfoArr().getLast());
    }

    private String w(int i, CoreSleepTotalData coreSleepTotalData) {
        if (c(coreSleepTotalData)) {
            return "";
        }
        return this.e.getResources().getString(uix.b(i), d(coreSleepTotalData.getResultInfoArr().getCurr().getDays().getLackSleep()));
    }

    public String j(int i, CoreSleepTotalData coreSleepTotalData) {
        switch (i % 100) {
            case 1:
            case 2:
                return y(i, coreSleepTotalData);
            case 3:
            case 4:
            case 5:
            case 6:
                return x(i, coreSleepTotalData);
            case 7:
            case 8:
                return r(i, coreSleepTotalData);
            case 9:
                return w(i, coreSleepTotalData);
            case 10:
                if (c(coreSleepTotalData)) {
                    return "";
                }
                CoreSleepTotalData.ResultInfoArrBean.CurrBean curr = coreSleepTotalData.getResultInfoArr().getCurr();
                return c(i, curr.getDays().getLackSleep(), curr.getDays().getIrregularFallSleep());
            case 11:
                if (c(coreSleepTotalData)) {
                    return "";
                }
                CoreSleepTotalData.ResultInfoArrBean.CurrBean curr2 = coreSleepTotalData.getResultInfoArr().getCurr();
                return a(i, curr2.getDays().getLackSleep(), curr2.getDays().getIrregularWakeUp());
            case 12:
                return (c(coreSleepTotalData) || b(coreSleepTotalData)) ? "" : e(i, coreSleepTotalData.getResultInfoArr().getCurr());
            case 13:
                return (c(coreSleepTotalData) || b(coreSleepTotalData)) ? "" : a(i, coreSleepTotalData.getResultInfoArr().getCurr());
            default:
                return this.e.getResources().getString(uix.b(i));
        }
    }

    private String b(int i, int i2, int i3) {
        return this.e.getResources().getString(uix.b(i), d(i2), d(i3));
    }

    private String a(int i, int i2, int i3) {
        return this.e.getResources().getString(uix.b(i), d(i2), d(i3));
    }

    private String c(int i, int i2, int i3) {
        return this.e.getResources().getString(uix.b(i), d(i2), d(i3));
    }

    private String c(int i, CoreSleepTotalData.ResultInfoArrBean.CurrBean currBean, CoreSleepTotalData.ResultInfoArrBean.LastBean lastBean) {
        return this.e.getResources().getString(uix.b(i), d(currBean.getDays().getLackSleep()), c(Math.abs(currBean.getMean().getAllSleepTime() - lastBean.getMean().getAllSleepTime())));
    }

    private String e(int i, CoreSleepTotalData.ResultInfoArrBean.CurrBean currBean) {
        return this.e.getResources().getString(uix.b(i), d(currBean.getDays().getLackSleep()), d(currBean.getDays().getLateFallSleep()), Integer.valueOf(currBean.getMean().getFallSleepTime() / 60));
    }

    private String a(int i, CoreSleepTotalData.ResultInfoArrBean.CurrBean currBean) {
        if (i == 12213) {
            return this.e.getResources().getString(uix.b(i), d(currBean.getDays().getLowAllSleepLateFallSleep()), Integer.valueOf(currBean.getMean().getFallSleepTime() / 60));
        }
        return this.e.getResources().getString(uix.b(i), d(currBean.getDays().getLowAllSleepLateFallSleep()), UnitUtil.e(0.0d, 1, 0));
    }

    private String q(int i, CoreSleepTotalData coreSleepTotalData) {
        if (b(coreSleepTotalData)) {
            return "";
        }
        int wakeUpTime = coreSleepTotalData.getResultInfoArr().getCurr().getMean().getWakeUpTime();
        return this.e.getResources().getString(uix.b(i), wud.r(wakeUpTime / 60) + ":" + wud.r(wakeUpTime % 60));
    }

    public String i(int i, CoreSleepTotalData coreSleepTotalData) {
        switch (i % 100) {
            case 1:
            case 2:
            case 3:
            case 4:
                if (c(coreSleepTotalData) || e(coreSleepTotalData)) {
                    return "";
                }
                CoreSleepTotalData.ResultInfoArrBean.CurrBean curr = coreSleepTotalData.getResultInfoArr().getCurr();
                return this.e.getResources().getString(uix.b(i), d(curr.getDays().getEarlyWakeUp()), d(Math.abs(curr.getDays().getEarlyWakeUp() - coreSleepTotalData.getResultInfoArr().getLast().getDays().getEarlyWakeUp())));
            case 5:
            case 6:
                return k(i, coreSleepTotalData);
            case 7:
                return q(i, coreSleepTotalData);
            case 8:
            case 9:
            case 10:
                if (c(coreSleepTotalData) || e(coreSleepTotalData)) {
                    return "";
                }
                CoreSleepTotalData.ResultInfoArrBean.CurrBean curr2 = coreSleepTotalData.getResultInfoArr().getCurr();
                return this.e.getResources().getString(uix.b(i), d(curr2.getDays().getEasyAwake()), d(Math.abs(curr2.getDays().getEasyAwake() - coreSleepTotalData.getResultInfoArr().getLast().getDays().getEasyAwake())));
            case 11:
                if (b(coreSleepTotalData)) {
                    return "";
                }
                return this.e.getResources().getString(uix.b(i), b(coreSleepTotalData.getResultInfoArr().getCurr().getMean().getAwakeCnt()));
            default:
                return this.e.getResources().getString(uix.b(i));
        }
    }

    private String k(int i, CoreSleepTotalData coreSleepTotalData) {
        if (b(coreSleepTotalData) || d(coreSleepTotalData)) {
            return "";
        }
        CoreSleepTotalData.ResultInfoArrBean.CurrBean curr = coreSleepTotalData.getResultInfoArr().getCurr();
        CoreSleepTotalData.ResultInfoArrBean.LastBean last = coreSleepTotalData.getResultInfoArr().getLast();
        int wakeUpTime = curr.getMean().getWakeUpTime();
        int iAbs = Math.abs(wakeUpTime - last.getMean().getWakeUpTime());
        return this.e.getResources().getString(uix.b(i), wud.r(wakeUpTime / 60) + ":" + wud.r(wakeUpTime % 60), c(iAbs));
    }

    public String d(int i, CoreSleepTotalData coreSleepTotalData) {
        int i2 = i % 100;
        if (i2 == 1) {
            return this.e.getResources().getString(uix.b(i));
        }
        if (i2 == 2) {
            if (b(coreSleepTotalData) || d(coreSleepTotalData)) {
                return "";
            }
            CoreSleepTotalData.ResultInfoArrBean.CurrBean curr = coreSleepTotalData.getResultInfoArr().getCurr();
            CoreSleepTotalData.ResultInfoArrBean.LastBean last = coreSleepTotalData.getResultInfoArr().getLast();
            return this.e.getResources().getString(uix.b(i), f(curr.getMean().getScore() - last.getMean().getScore()));
        }
        if (i2 == 3) {
            if (c(coreSleepTotalData)) {
                return "";
            }
            return this.e.getResources().getString(uix.b(i), d(coreSleepTotalData.getResultInfoArr().getCurr().getDays().getUpperScore()), f(90));
        }
        if (i2 == 4) {
            if (c(coreSleepTotalData) || e(coreSleepTotalData)) {
                return "";
            }
            CoreSleepTotalData.ResultInfoArrBean.CurrBean curr2 = coreSleepTotalData.getResultInfoArr().getCurr();
            CoreSleepTotalData.ResultInfoArrBean.LastBean last2 = coreSleepTotalData.getResultInfoArr().getLast();
            return this.e.getResources().getString(uix.b(i), d(curr2.getDays().getUpperScore()), f(90), d(last2.getDays().getUpperScore()));
        }
        return this.e.getResources().getString(uix.b(i));
    }

    private String t(int i, CoreSleepTotalData coreSleepTotalData) {
        if (c(coreSleepTotalData)) {
            return "";
        }
        return this.e.getResources().getString(uix.b(i), d(coreSleepTotalData.getResultInfoArr().getCurr().getDays().getLowSteadySleep()), d(coreSleepTotalData.getResultInfoArr().getCurr().getDays().getIrregularFallSleep()));
    }

    private String s(int i, CoreSleepTotalData coreSleepTotalData) {
        if (c(coreSleepTotalData)) {
            return "";
        }
        return this.e.getResources().getString(uix.b(i), d(coreSleepTotalData.getResultInfoArr().getCurr().getDays().getLowDeepSleep()), d(coreSleepTotalData.getResultInfoArr().getCurr().getDays().getIrregularFallSleep()));
    }

    public String h(int i, CoreSleepTotalData coreSleepTotalData) {
        switch (i % 100) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                if (c(coreSleepTotalData) || e(coreSleepTotalData)) {
                    return "";
                }
                return this.e.getResources().getString(uix.b(i), d(coreSleepTotalData.getResultInfoArr().getCurr().getDays().getLowDeepSleep()), d(coreSleepTotalData.getResultInfoArr().getLast().getDays().getLowDeepSleep()));
            case 7:
            case 8:
                return n(i, coreSleepTotalData);
            case 9:
                if (c(coreSleepTotalData)) {
                    return "";
                }
                return this.e.getResources().getString(uix.b(i), d(coreSleepTotalData.getResultInfoArr().getCurr().getDays().getLowDeepSleep()));
            case 10:
                return s(i, coreSleepTotalData);
            case 11:
                if (c(coreSleepTotalData)) {
                    return "";
                }
                CoreSleepTotalData.ResultInfoArrBean.CurrBean curr = coreSleepTotalData.getResultInfoArr().getCurr();
                return this.e.getResources().getString(uix.b(i), d(curr.getDays().getLowDeepSleep()), d(curr.getDays().getIrregularWakeUp()));
            case 12:
                return l(i, coreSleepTotalData);
            default:
                return this.e.getResources().getString(uix.b(i));
        }
    }

    public String e(int i, CoreSleepTotalData coreSleepTotalData) {
        switch (i % 100) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                if (c(coreSleepTotalData) || e(coreSleepTotalData)) {
                    return "";
                }
                return this.e.getResources().getString(uix.b(i), d(coreSleepTotalData.getResultInfoArr().getCurr().getDays().getLowSteadySleep()), d(coreSleepTotalData.getResultInfoArr().getLast().getDays().getLowSteadySleep()));
            case 7:
            case 8:
                return o(i, coreSleepTotalData);
            case 9:
                if (c(coreSleepTotalData)) {
                    return "";
                }
                return this.e.getResources().getString(uix.b(i), d(coreSleepTotalData.getResultInfoArr().getCurr().getDays().getLowSteadySleep()));
            case 10:
                return t(i, coreSleepTotalData);
            case 11:
                if (c(coreSleepTotalData)) {
                    return "";
                }
                CoreSleepTotalData.ResultInfoArrBean.CurrBean curr = coreSleepTotalData.getResultInfoArr().getCurr();
                return this.e.getResources().getString(uix.b(i), d(curr.getDays().getLowSteadySleep()), d(curr.getDays().getIrregularWakeUp()));
            case 12:
                return p(i, coreSleepTotalData);
            default:
                return this.e.getResources().getString(uix.b(i));
        }
    }

    private String o(int i, CoreSleepTotalData coreSleepTotalData) {
        if (b(coreSleepTotalData) || d(coreSleepTotalData) || c(coreSleepTotalData)) {
            return "";
        }
        CoreSleepTotalData.ResultInfoArrBean.CurrBean curr = coreSleepTotalData.getResultInfoArr().getCurr();
        return this.e.getResources().getString(uix.b(i), d(curr.getDays().getLowSteadySleep()), UnitUtil.e(Math.abs(curr.getMean().getSteadySleepScale() - coreSleepTotalData.getResultInfoArr().getLast().getMean().getSteadySleepScale()), 2, 0));
    }

    private String n(int i, CoreSleepTotalData coreSleepTotalData) {
        if (b(coreSleepTotalData) || d(coreSleepTotalData) || c(coreSleepTotalData)) {
            return "";
        }
        CoreSleepTotalData.ResultInfoArrBean.CurrBean curr = coreSleepTotalData.getResultInfoArr().getCurr();
        return this.e.getResources().getString(uix.b(i), d(curr.getDays().getLowDeepSleep()), UnitUtil.e(Math.abs(curr.getMean().getDeepSleepScale() - coreSleepTotalData.getResultInfoArr().getLast().getMean().getDeepSleepScale()), 2, 0));
    }

    private String l(int i, CoreSleepTotalData coreSleepTotalData) {
        if (c(coreSleepTotalData) || b(coreSleepTotalData)) {
            return "";
        }
        CoreSleepTotalData.ResultInfoArrBean.CurrBean curr = coreSleepTotalData.getResultInfoArr().getCurr();
        return this.e.getResources().getString(uix.b(i), d(curr.getDays().getLateFallSleep()), UnitUtil.e(curr.getMean().getFallSleepTime() / 60, 1, 0));
    }

    private String p(int i, CoreSleepTotalData coreSleepTotalData) {
        if (c(coreSleepTotalData) || b(coreSleepTotalData)) {
            return "";
        }
        CoreSleepTotalData.ResultInfoArrBean.CurrBean curr = coreSleepTotalData.getResultInfoArr().getCurr();
        int fallSleepTime = curr.getMean().getFallSleepTime() / 60;
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, fallSleepTime);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return this.e.getResources().getString(uix.b(i), d(curr.getDays().getLateFallSleep()), UnitUtil.e(calendar, 1));
    }

    public String c(int i, CoreSleepTotalData coreSleepTotalData) {
        switch (i % 100) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                if (c(coreSleepTotalData) || e(coreSleepTotalData)) {
                    return "";
                }
                return this.e.getResources().getString(uix.b(i), d(coreSleepTotalData.getResultInfoArr().getCurr().getDays().getLowBreathQuality()), d(coreSleepTotalData.getResultInfoArr().getLast().getDays().getLowBreathQuality()));
            case 6:
            case 7:
                if (c(coreSleepTotalData) || b(coreSleepTotalData) || d(coreSleepTotalData)) {
                    return "";
                }
                CoreSleepTotalData.ResultInfoArrBean.CurrBean curr = coreSleepTotalData.getResultInfoArr().getCurr();
                return this.e.getResources().getString(uix.b(i), d(curr.getDays().getLowBreathQuality()), f(Math.abs(curr.getMean().getBreathQuality() - coreSleepTotalData.getResultInfoArr().getLast().getMean().getBreathQuality())));
            case 8:
                if (c(coreSleepTotalData)) {
                    return "";
                }
                return this.e.getResources().getString(uix.b(i), d(coreSleepTotalData.getResultInfoArr().getCurr().getDays().getLowBreathQuality()));
            default:
                return this.e.getResources().getString(uix.b(i));
        }
    }

    public String b(int i, CoreSleepTotalData coreSleepTotalData) {
        switch (i % 100) {
            case 1:
            case 2:
                if (c(coreSleepTotalData)) {
                    return "";
                }
                return this.e.getResources().getString(uix.b(i), d(coreSleepTotalData.getResultInfoArr().getCurr().getDays().getOverREMSleep()));
            case 3:
            case 4:
                if (c(coreSleepTotalData) || e(coreSleepTotalData)) {
                    return "";
                }
                return this.e.getResources().getString(uix.b(i), d(coreSleepTotalData.getResultInfoArr().getCurr().getDays().getOverREMSleep()), d(coreSleepTotalData.getResultInfoArr().getLast().getDays().getOverREMSleep()));
            case 5:
            case 6:
                if (c(coreSleepTotalData)) {
                    return "";
                }
                return this.e.getResources().getString(uix.b(i), d(coreSleepTotalData.getResultInfoArr().getCurr().getDays().getLowREMSleep()));
            case 7:
                if (c(coreSleepTotalData) || b(coreSleepTotalData)) {
                    return "";
                }
                CoreSleepTotalData.ResultInfoArrBean.CurrBean curr = coreSleepTotalData.getResultInfoArr().getCurr();
                return this.e.getResources().getString(uix.b(i), d(curr.getDays().getOverREMLateFallSleep()), Integer.valueOf(curr.getMean().getFallSleepTime() / 60));
            default:
                return this.e.getResources().getString(uix.b(i));
        }
    }

    public String a(int i, CoreSleepTotalData coreSleepTotalData) {
        CoreSleepTotalData.ResultInfoArrBean.CurrBean.MinBean min;
        CoreSleepTotalData.ResultInfoArrBean.CurrBean.MaxBean max = null;
        CoreSleepTotalData.ResultInfoArrBean.CurrBean curr = coreSleepTotalData.getResultInfoArr() != null ? coreSleepTotalData.getResultInfoArr().getCurr() : null;
        if (curr != null) {
            max = curr.getMax();
            min = curr.getMin();
        } else {
            min = null;
        }
        switch (i % 100) {
            case 1:
                return (max == null || min == null) ? "" : this.e.getResources().getString(uix.b(i), b(max.getAllSleepTime(), this.e), b(min.getAllSleepTime(), this.e));
            case 2:
            case 3:
                if (max == null || min == null) {
                    return "";
                }
                if (max.getDeepSleepScale() - min.getDeepSleepScale() < 5) {
                    return this.e.getResources().getString(R.string.IDS_details_sleep_content_4_no_harvard);
                }
                return this.e.getResources().getString(uix.b(i), UnitUtil.e(max.getDeepSleepScale(), 2, 0), UnitUtil.e(min.getDeepSleepScale(), 2, 0));
            case 4:
                return (max == null || min == null) ? "" : this.e.getResources().getString(uix.b(i), UnitUtil.e(max.getREMScale(), 2, 0), UnitUtil.e(min.getREMScale(), 2, 0));
            case 5:
            case 6:
                if (max == null || min == null) {
                    return "";
                }
                return this.e.getResources().getString(uix.b(i), Integer.valueOf(max.getBreathQuality()), Integer.valueOf(min.getBreathQuality()));
            default:
                return this.e.getResources().getString(uix.b(i));
        }
    }

    public String c(int i, CoreSleepTotalData coreSleepTotalData, int i2, int i3) {
        switch (i % 100) {
            case 1:
                return g(i, coreSleepTotalData);
            case 2:
                return e(i, coreSleepTotalData, i2);
            case 3:
                return m(i, coreSleepTotalData);
            case 4:
                return f(i, coreSleepTotalData);
            case 5:
            case 6:
            case 7:
                if (b(coreSleepTotalData)) {
                    return "";
                }
                return this.e.getResources().getString(uix.b(i), UnitUtil.e(coreSleepTotalData.getResultInfoArr().getCurr().getMean().getDeepSleepScale(), 2, 0));
            case 8:
            case 9:
            case 10:
                return this.e.getResources().getString(uix.b(i), b(i2, this.e));
            case 11:
            case 12:
                return this.e.getResources().getString(uix.b(i), f(i3));
            case 13:
            case 14:
                if (b(coreSleepTotalData)) {
                    return "";
                }
                return this.e.getResources().getString(uix.b(i), UnitUtil.e(coreSleepTotalData.getResultInfoArr().getCurr().getMean().getREMScale(), 2, 0));
            case 15:
                return this.e.getResources().getString(uix.b(i), f(i3), b(i2, this.e));
            default:
                return this.e.getResources().getString(uix.b(i));
        }
    }

    private String f(int i, CoreSleepTotalData coreSleepTotalData) {
        if (b(coreSleepTotalData) || d(coreSleepTotalData)) {
            return "";
        }
        CoreSleepTotalData.ResultInfoArrBean.CurrBean curr = coreSleepTotalData.getResultInfoArr().getCurr();
        return this.e.getResources().getString(uix.b(i), f(curr.getMean().getScore() - coreSleepTotalData.getResultInfoArr().getLast().getMean().getScore()), UnitUtil.e(curr.getMean().getREMScale(), 2, 0));
    }

    private String m(int i, CoreSleepTotalData coreSleepTotalData) {
        if (b(coreSleepTotalData) || d(coreSleepTotalData)) {
            return "";
        }
        CoreSleepTotalData.ResultInfoArrBean.CurrBean curr = coreSleepTotalData.getResultInfoArr().getCurr();
        CoreSleepTotalData.ResultInfoArrBean.LastBean last = coreSleepTotalData.getResultInfoArr().getLast();
        return this.e.getResources().getString(uix.b(i), f(curr.getMean().getScore() - last.getMean().getScore()));
    }

    private String e(int i, CoreSleepTotalData coreSleepTotalData, int i2) {
        if (b(coreSleepTotalData) || d(coreSleepTotalData)) {
            return "";
        }
        CoreSleepTotalData.ResultInfoArrBean.CurrBean curr = coreSleepTotalData.getResultInfoArr().getCurr();
        CoreSleepTotalData.ResultInfoArrBean.LastBean last = coreSleepTotalData.getResultInfoArr().getLast();
        return this.e.getResources().getString(uix.b(i), f(curr.getMean().getScore() - last.getMean().getScore()), b(i2, this.e));
    }

    private String g(int i, CoreSleepTotalData coreSleepTotalData) {
        if (b(coreSleepTotalData) || d(coreSleepTotalData)) {
            return "";
        }
        CoreSleepTotalData.ResultInfoArrBean.CurrBean curr = coreSleepTotalData.getResultInfoArr().getCurr();
        return this.e.getResources().getString(uix.b(i), f(curr.getMean().getScore() - coreSleepTotalData.getResultInfoArr().getLast().getMean().getScore()), UnitUtil.e(curr.getMean().getDeepSleepScale(), 2, 0));
    }

    private String g(int i) {
        return BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_hour_string, i, UnitUtil.e(i, 1, 0));
    }

    public String c(int i) {
        return BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_hw_map_time_unit_value_minutes, i, Integer.valueOf(i));
    }

    public String d(int i) {
        return String.format(BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_health_weight_day_local, i), UnitUtil.e(i, 1, 0));
    }

    public String b(int i) {
        return BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_details_sleep_latency_times, i, UnitUtil.e(i, 1, 0));
    }

    private String f(int i) {
        return BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_sleep_advice_title_score_string, i, UnitUtil.e(i, 1, 0));
    }

    private String b(int i, Context context) {
        return String.format(context.getResources().getString(R.string.IDS_h_min_unit), UnitUtil.e(i / 60, 1, 0), UnitUtil.e(i % 60, 1, 0));
    }

    public static Map<String, Integer> e(List<uig> list) {
        uig uigVar;
        if (list == null) {
            return new HashMap(16);
        }
        ArrayList arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList(16);
        HashMap map = new HashMap(16);
        int i = 0;
        while (i < arrayList.size() && (uigVar = (uig) arrayList.get(i)) != null) {
            if (map.get("core_sleep_start_time_key") == null && uigVar.e() != 69 && uigVar.e() != 67) {
                map.put("core_sleep_start_time_key", Integer.valueOf(uigVar.b()));
            }
            if (i == arrayList.size() - 1) {
                if (arrayList.size() == 1) {
                    map.put("core_sleep_end_time_key", Integer.valueOf(uigVar.c()));
                }
                if (map.get("core_sleep_start_time_key") != null && map.get("core_sleep_end_time_key") != null) {
                    arrayList2.add(map);
                }
            }
            int i2 = i + 1;
            if (arrayList.size() <= i2) {
                break;
            }
            uig uigVar2 = (uig) arrayList.get(i2);
            if (uigVar2 != null) {
                if (uigVar2.b() - uigVar.c() > 30 && uigVar.e() != 69) {
                    map.put("core_sleep_end_time_key", Integer.valueOf(uigVar.c()));
                    if (map.get("core_sleep_start_time_key") != null && map.get("core_sleep_end_time_key") != null) {
                        arrayList2.add(map);
                        map = new HashMap(16);
                    }
                } else if (uigVar2.e() != 69) {
                    map.put("core_sleep_end_time_key", Integer.valueOf(uigVar2.c()));
                } else {
                    LogUtil.j("SleepInteractorHelper", "getSleepSegmentedMaps takeHistogramHeight = 69, i = ", Integer.valueOf(i));
                }
            }
            i = i2;
        }
        return c(arrayList2);
    }

    private static Map<String, Integer> c(List<Map<String, Integer>> list) {
        HashMap map = new HashMap(16);
        if (njy.e(list)) {
            return null;
        }
        Map<String, Integer> map2 = list.get(0);
        for (Map<String, Integer> map3 : list) {
            if (map3.get("core_sleep_end_time_key").intValue() - map3.get("core_sleep_start_time_key").intValue() > map2.get("core_sleep_end_time_key").intValue() - map2.get("core_sleep_start_time_key").intValue()) {
                map2 = map3;
            }
        }
        map.put("core_sleep_start_time_key", map2.get("core_sleep_start_time_key"));
        map.put("core_sleep_end_time_key", map2.get("core_sleep_end_time_key"));
        return map;
    }

    private boolean b(CoreSleepTotalData coreSleepTotalData) {
        return coreSleepTotalData == null || coreSleepTotalData.getResultInfoArr() == null || coreSleepTotalData.getResultInfoArr().getCurr() == null || coreSleepTotalData.getResultInfoArr().getCurr().getMean() == null;
    }

    private boolean c(CoreSleepTotalData coreSleepTotalData) {
        return coreSleepTotalData == null || coreSleepTotalData.getResultInfoArr() == null || coreSleepTotalData.getResultInfoArr().getCurr() == null || coreSleepTotalData.getResultInfoArr().getCurr().getDays() == null;
    }

    private boolean e(CoreSleepTotalData coreSleepTotalData) {
        return coreSleepTotalData == null || coreSleepTotalData.getResultInfoArr() == null || coreSleepTotalData.getResultInfoArr().getLast() == null || coreSleepTotalData.getResultInfoArr().getLast().getDays() == null;
    }

    private boolean d(CoreSleepTotalData coreSleepTotalData) {
        return coreSleepTotalData == null || coreSleepTotalData.getResultInfoArr() == null || coreSleepTotalData.getResultInfoArr().getLast() == null || coreSleepTotalData.getResultInfoArr().getLast().getMean() == null;
    }

    public static int e(int i) {
        if (i >= 0 && i < 240) {
            return 20;
        }
        if (i >= 240 && i < 288) {
            return a(0, new double[]{20.0d, i, 240.0d, 40.0d, 20.0d, 288.0d, 240.0d});
        }
        if (i >= 288 && i < 336) {
            return a(0, new double[]{40.0d, i, 288.0d, 60.0d, 40.0d, 336.0d, 288.0d});
        }
        if (i >= 336 && i < 384) {
            return a(0, new double[]{60.0d, i, 336.0d, 70.0d, 60.0d, 384.0d, 336.0d});
        }
        if (i >= 384 && i < 432) {
            return a(0, new double[]{70.0d, i, 384.0d, 80.0d, 70.0d, 432.0d, 384.0d});
        }
        if (i >= 432 && i < 480) {
            return a(0, new double[]{80.0d, i, 432.0d, 90.0d, 80.0d, 480.0d, 432.0d});
        }
        if (i >= 480 && i < 504) {
            return a(0, new double[]{90.0d, i, 480.0d, 100.0d, 90.0d, 504.0d, 480.0d});
        }
        if (i >= 504 && i < 516) {
            return a(0, new double[]{100.0d, i, 504.0d, 90.0d, 100.0d, 516.0d, 504.0d});
        }
        if (i >= 516 && i < 528) {
            return a(0, new double[]{90.0d, i, 516.0d, 80.0d, 90.0d, 528.0d, 516.0d});
        }
        if (i < 528 || i >= 570) {
            return (i < 570 || i >= 600) ? a(0, new double[]{60.0d, i, 600.0d, 40.0d, 60.0d, 1440.0d, 600.0d}) : a(0, new double[]{70.0d, i, 570.0d, 60.0d, 70.0d, 600.0d, 570.0d});
        }
        return a(0, new double[]{80.0d, i, 528.0d, 70.0d, 80.0d, 570.0d, 528.0d});
    }

    public static int d(float f) {
        if (f >= 0.0f && f < 0.5f) {
            return 20;
        }
        if (f >= 0.5f && f < 0.6f) {
            return a(1, new double[]{f, 0.5d, 40.0d, 20.0d, 0.6000000238418579d, 0.5d, 20.0d});
        }
        if (f >= 0.6f && f < 0.8f) {
            return a(1, new double[]{f, 0.6000000238418579d, 60.0d, 40.0d, 0.800000011920929d, 0.6000000238418579d, 40.0d});
        }
        if (f >= 0.8f && f < 0.85f) {
            return a(1, new double[]{f, 0.800000011920929d, 70.0d, 60.0d, 0.8500000238418579d, 0.800000011920929d, 60.0d});
        }
        if (f >= 0.85f && f < 0.9f) {
            return a(1, new double[]{f, 0.8500000238418579d, 80.0d, 70.0d, 0.8999999761581421d, 0.8500000238418579d, 70.0d});
        }
        if (f >= 0.9f && f < 0.95f) {
            return a(1, new double[]{f, 0.8999999761581421d, 90.0d, 80.0d, 0.949999988079071d, 0.8999999761581421d, 80.0d});
        }
        if (f >= 0.95f) {
            return a(1, new double[]{f, 0.949999988079071d, 100.0d, 90.0d, 1.0d, 0.949999988079071d, 90.0d});
        }
        LogUtil.a("SleepInteractorHelper", "effieiceny wrong !");
        return 100;
    }

    public static int a(int i) {
        if (i < 0) {
            return 0;
        }
        if (i >= 0 && i < 10) {
            return a(0, new double[]{100.0d, i, 0.0d, 90.0d, 100.0d, 10.0d, 0.0d});
        }
        if (i >= 10 && i < 20) {
            return a(0, new double[]{90.0d, i, 10.0d, 80.0d, 90.0d, 20.0d, 10.0d});
        }
        if (i >= 20 && i < 30) {
            return a(0, new double[]{80.0d, i, 20.0d, 70.0d, 80.0d, 30.0d, 20.0d});
        }
        if (i >= 30 && i < 60) {
            return a(0, new double[]{70.0d, i, 30.0d, 60.0d, 70.0d, 60.0d, 30.0d});
        }
        if (i < 60 || i >= 120) {
            return 40;
        }
        return a(0, new double[]{60.0d, i, 60.0d, 40.0d, 60.0d, 120.0d, 60.0d});
    }

    private static int a(int i, double[] dArr) {
        double d;
        if (i == 0) {
            d = dArr[0] + (((dArr[1] - dArr[2]) * (dArr[3] - dArr[4])) / (dArr[5] - dArr[6]));
        } else {
            if (i != 1) {
                return 0;
            }
            d = (((dArr[0] - dArr[1]) * (dArr[2] - dArr[3])) / (dArr[4] - dArr[5])) + dArr[6];
        }
        return (int) d;
    }
}
