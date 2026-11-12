package com.xiaomi.hm.health.reminder;

import android.text.TextUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.model.HMReminderInfo;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes21.dex */
public class ReminderUtils {
    private static final String a = "ReminderUtils";
    private static final int b = 0;
    private static final int c = 8;
    private static final int d = 9;
    private static final int e = 10;

    private static short a(int i) {
        if (i == 1) {
            return (short) 32;
        }
        if (i == 2) {
            return (short) 64;
        }
        if (i == 3) {
            return (short) 128;
        }
        if (i == 4) {
            return (short) 256;
        }
        if (i == 5) {
            return (short) 512;
        }
        if (i == 6) {
            return (short) 1024;
        }
        return i == 7 ? (short) 2048 : (short) -1;
    }

    public static ArrayList<HMReminderInfo> createReminders(ArrayList<ReminderExt> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            return null;
        }
        ArrayList<HMReminderInfo> arrayList2 = new ArrayList<>();
        for (ReminderExt reminderExt : arrayList) {
            HMReminderInfo hMReminderInfo = new HMReminderInfo();
            int i = reminderExt.b;
            if (i < 0 || i > 3) {
                HMLog.i(a, "return as invalid from:" + i, new Object[0]);
            } else {
                hMReminderInfo.setFrom(i);
                int i2 = reminderExt.a;
                if (i2 < 0 || i2 > 63) {
                    HMLog.i(a, "return as invalid id:" + i2, new Object[0]);
                } else {
                    hMReminderInfo.setId(i2);
                    int op = reminderExt.getOp();
                    if (op == 0) {
                        hMReminderInfo.setEnable(false);
                    } else if (op == 1) {
                        hMReminderInfo.setEnable(true);
                    } else if (op == 2) {
                        hMReminderInfo.setDelete(true);
                    } else {
                        HMLog.i(a, "return as invalid op:" + op, new Object[0]);
                    }
                    hMReminderInfo.setStartTime(getReminderCalendar(reminderExt.getStartDate()));
                    hMReminderInfo.setStopTime(getReminderCalendar(reminderExt.getStopDate()));
                    hMReminderInfo.setVibrateType(reminderExt.getVibrateType());
                    String loop = reminderExt.getLoop();
                    if (!TextUtils.isEmpty(loop)) {
                        String[] strArrSplit = loop.split(",");
                        if (strArrSplit == null || strArrSplit.length <= 0) {
                            HMLog.i(a, "return as invalid loop:" + loop, new Object[0]);
                        } else if (strArrSplit.length == 1) {
                            int i3 = Integer.parseInt(strArrSplit[0]);
                            if (i3 == 0) {
                                hMReminderInfo.addFlag(HMReminderInfo.FLAG_DAY);
                            } else if (i3 == 8) {
                                hMReminderInfo.addFlag((short) 4096);
                            } else if (i3 == 9) {
                                hMReminderInfo.addFlag(HMReminderInfo.FLAG_YEAR);
                            } else if (i3 == 10) {
                                hMReminderInfo.removeFlag(HMReminderInfo.FLAG_LOOP);
                                hMReminderInfo.setStopTime(null);
                            } else {
                                short sA = a(i3);
                                if (sA != -1) {
                                    hMReminderInfo.addFlag(sA);
                                } else {
                                    HMLog.i(a, "return as invalid loopType:" + i3, new Object[0]);
                                }
                            }
                        } else {
                            for (String str : strArrSplit) {
                                int i4 = Integer.parseInt(str);
                                short sA2 = a(i4);
                                if (sA2 == -1) {
                                    HMLog.i(a, "return as invalid loopType:" + i4, new Object[0]);
                                } else {
                                    hMReminderInfo.addFlag(sA2);
                                }
                            }
                        }
                    }
                    hMReminderInfo.setRemindStr(reminderExt.getTitle(), reminderExt.getBody());
                    HMLog.d(a, "HMReminderInfo:" + hMReminderInfo, new Object[0]);
                    arrayList2.add(hMReminderInfo);
                }
            }
        }
        return arrayList2;
    }

    public static Calendar getReminderCalendar(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(str);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return calendar;
        } catch (Exception e2) {
            HMLog.i(a, "getCalendar exception:" + e2.getMessage(), new Object[0]);
            return null;
        }
    }

    public static boolean isExpired(ReminderExt reminderExt) {
        String startDate;
        Calendar reminderCalendar;
        String stopDate = reminderExt.getStopDate();
        Calendar reminderCalendar2 = getReminderCalendar(stopDate);
        if (reminderCalendar2 != null && reminderCalendar2.before(Calendar.getInstance())) {
            HMLog.i(a, "invalid stop date:" + stopDate, new Object[0]);
            return true;
        }
        String loop = reminderExt.getLoop();
        if (TextUtils.isEmpty(loop) || !loop.equals(String.valueOf(10)) || (reminderCalendar = getReminderCalendar((startDate = reminderExt.getStartDate()))) == null || !reminderCalendar.before(Calendar.getInstance())) {
            return false;
        }
        HMLog.i(a, "invalid start date:" + startDate + ",loop:" + loop, new Object[0]);
        return true;
    }
}
