package defpackage;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.hwcalendarmgr.calendardb.CalendarDbBean;
import com.huawei.hwdevice.phoneprocess.mgr.hwcalendarmgr.calendardb.SimpleCalendarBean;
import com.huawei.hwdevice.phoneprocess.mgr.hwcalendarmgr.calendardb.SmartSimpleCalendarBean;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.wearengine.sensor.DataResult;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes11.dex */
public class mrc {
    public static List<SimpleCalendarBean> d(String str, List<SimpleCalendarBean> list, boolean z) {
        List<SimpleCalendarBean> listB = b(str, list, z);
        listB.addAll(e(str, list, z));
        LogUtil.a("CalendarCompareUtils", "calendarCompare: ", Integer.valueOf(listB.size()));
        return listB;
    }

    public static Map<String, String> e(String str, List<CalendarDbBean> list) {
        LogUtil.a("CalendarCompareUtils", "Enter exDateCompare");
        HashMap map = new HashMap();
        if (mtz.b(str) || list == null) {
            LogUtil.e("CalendarCompareUtils", "invalid params in exDateCompare");
            return map;
        }
        List<CalendarDbBean> listA = mra.a(str);
        List<String> listC = c(listA);
        List<String> listC2 = c(list);
        HashMap map2 = new HashMap(listA.size());
        for (CalendarDbBean calendarDbBean : listA) {
            map2.put(calendarDbBean.getEventUuid(), calendarDbBean);
        }
        if (listC.removeAll(listC2)) {
            LogUtil.a("CalendarCompareUtils", "calculate: deletedRidList or updateContactRidList is empty.");
        }
        mrb mrbVarE = mrb.e(BaseApplication.getContext());
        for (String str2 : listC) {
            mrbVarE.c(str2, str);
            CalendarDbBean calendarDbBean2 = (CalendarDbBean) map2.get(str2);
            if (calendarDbBean2 != null) {
                long dtstart = calendarDbBean2.getDtstart();
                long dtend = calendarDbBean2.getDtend();
                int allDay = calendarDbBean2.getAllDay();
                if (dtend != 0) {
                    String calendarFeature = calendarDbBean2.getCalendarFeature();
                    String strB = b(dtstart, allDay);
                    LogUtil.a("CalendarCompareUtils", "convert timeStamp to exDate: ", strB);
                    String eventId = calendarDbBean2.getEventId();
                    String str3 = "," + strB;
                    if (map.get(eventId) == null) {
                        map.put(eventId, mtz.b(calendarFeature) ? str3.substring(1) : calendarFeature + str3);
                    } else {
                        map.put(eventId, ((String) map.get(eventId)) + str3);
                    }
                }
            }
        }
        mrbVarE.a(a(list, map), str);
        return map;
    }

    private static String b(long j, int i) {
        Date date = new Date(j);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(DataResult.UTC));
        String str = simpleDateFormat.format(date);
        if (i == 1) {
            str.replace(str.substring(9, 15), "000000");
        }
        return str;
    }

    private static List<CalendarDbBean> a(List<CalendarDbBean> list, Map<String, String> map) {
        LogUtil.a("Enter updateInstanceExDate", new Object[0]);
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() != 0) {
            for (CalendarDbBean calendarDbBean : list) {
                String str = map.get(calendarDbBean.getEventId());
                if (!mtz.b(str)) {
                    calendarDbBean.setCalendarFeature(str);
                }
                arrayList.add(calendarDbBean);
            }
        }
        return arrayList;
    }

    private static List<SimpleCalendarBean> b(String str, List<SimpleCalendarBean> list, boolean z) {
        SimpleCalendarBean simpleCalendarBean;
        ArrayList arrayList = new ArrayList();
        List<CalendarDbBean> listA = mra.a(str);
        List<String> listC = c(listA);
        List<String> listB = b(list, z);
        HashMap map = new HashMap(listA.size());
        for (CalendarDbBean calendarDbBean : listA) {
            map.put(calendarDbBean.getEventUuid(), calendarDbBean);
        }
        if (listC.removeAll(listB)) {
            LogUtil.a("CalendarCompareUtils", "calculate: deletedRidList or updateContactRidList is empty.");
        }
        Iterator<String> it = listC.iterator();
        while (it.hasNext()) {
            CalendarDbBean calendarDbBean2 = (CalendarDbBean) map.get(it.next());
            if (calendarDbBean2 != null) {
                if (z) {
                    simpleCalendarBean = new SmartSimpleCalendarBean();
                    simpleCalendarBean.setEventUuid(calendarDbBean2.getEventId());
                } else {
                    simpleCalendarBean = new SimpleCalendarBean();
                    simpleCalendarBean.setEventUuid(calendarDbBean2.getEventUuid());
                    simpleCalendarBean.setDtstart(calendarDbBean2.getDtstart());
                }
                simpleCalendarBean.setEventId(calendarDbBean2.getEventId());
                simpleCalendarBean.setOperation(2);
                arrayList.add(simpleCalendarBean);
            }
        }
        LogUtil.a("CalendarCompareUtils", "getDeletedCalendarList size: ", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    private static List<SimpleCalendarBean> e(String str, List<SimpleCalendarBean> list, boolean z) {
        SmartSimpleCalendarBean smartSimpleCalendarBean;
        ArrayList arrayList = new ArrayList();
        List<CalendarDbBean> listA = mra.a(str);
        List<String> listC = c(listA);
        List<String> listB = b(list, z);
        HashMap map = new HashMap(list.size());
        for (SimpleCalendarBean simpleCalendarBean : list) {
            map.put(simpleCalendarBean.getEventUuid(), simpleCalendarBean);
        }
        if (listB.removeAll(listC)) {
            LogUtil.a("CalendarCompareUtils", "calculate: deletedRidList or updateContactRidList is empty.");
        }
        if (z) {
            for (String str2 : listB) {
                if ((map.get(str2) instanceof SmartSimpleCalendarBean) && (smartSimpleCalendarBean = (SmartSimpleCalendarBean) map.get(str2)) != null) {
                    smartSimpleCalendarBean.setOperation(1);
                    arrayList.add(smartSimpleCalendarBean);
                }
            }
        } else {
            Iterator<String> it = listB.iterator();
            while (it.hasNext()) {
                SimpleCalendarBean simpleCalendarBean2 = (SimpleCalendarBean) map.get(it.next());
                if (simpleCalendarBean2 != null) {
                    simpleCalendarBean2.setOperation(1);
                    arrayList.add(simpleCalendarBean2);
                }
            }
        }
        LogUtil.a("CalendarCompareUtils", "getUpdatedCalendarList size: ", Integer.valueOf(arrayList.size()));
        b(listA, list, arrayList, map);
        return arrayList;
    }

    private static void b(List<CalendarDbBean> list, List<SimpleCalendarBean> list2, List<SimpleCalendarBean> list3, Map<String, SimpleCalendarBean> map) {
        HashMap map2 = new HashMap(list2.size());
        for (CalendarDbBean calendarDbBean : list) {
            map2.put(calendarDbBean.getEventUuid(), calendarDbBean);
        }
        for (CalendarDbBean calendarDbBean2 : a(list2)) {
            CalendarDbBean calendarDbBean3 = (CalendarDbBean) map2.get(calendarDbBean2.getEventUuid());
            if (calendarDbBean3 == null) {
                LogUtil.a("CalendarCompareUtils", "calculateUpdatedContacts: cachedSimpleContactBean is null.");
            } else if (!calendarDbBean2.getCalendarFeature().equals(calendarDbBean3.getCalendarFeature())) {
                SimpleCalendarBean simpleCalendarBean = map.get(calendarDbBean2.getEventUuid());
                if (simpleCalendarBean != null) {
                    simpleCalendarBean.setOperation(3);
                    list3.add(simpleCalendarBean);
                }
            } else {
                LogUtil.a("CalendarCompareUtils", "calculateUpdatedContacts: the rawContactFeature is same to cache's rawContactFeature ");
            }
        }
        LogUtil.a("CalendarCompareUtils", "getModifyCalendarList size: ", Integer.valueOf(list3.size()));
    }

    private static List<String> c(List<CalendarDbBean> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("CalendarCompareUtils", "getCachedUidList: cache list is null or empty.");
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<CalendarDbBean> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getEventUuid());
        }
        return arrayList;
    }

    private static List<String> b(List<SimpleCalendarBean> list, boolean z) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("CalendarCompareUtils", "getCachedUidList: cache list is null or empty.");
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (SimpleCalendarBean simpleCalendarBean : list) {
            if (z) {
                arrayList.add(((SmartSimpleCalendarBean) simpleCalendarBean).getEventId());
            } else {
                arrayList.add(simpleCalendarBean.getEventUuid());
            }
        }
        return arrayList;
    }

    private static List<CalendarDbBean> a(List<SimpleCalendarBean> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (SimpleCalendarBean simpleCalendarBean : list) {
            if (simpleCalendarBean instanceof SmartSimpleCalendarBean) {
                SmartSimpleCalendarBean smartSimpleCalendarBean = (SmartSimpleCalendarBean) simpleCalendarBean;
                arrayList.add(new CalendarDbBean(smartSimpleCalendarBean.getEventId(), smartSimpleCalendarBean.getOperation(), smartSimpleCalendarBean.getEventId(), smartSimpleCalendarBean.getDtstart(), smartSimpleCalendarBean.getDtend(), smartSimpleCalendarBean.getAllDay(), mrd.d(smartSimpleCalendarBean)));
            } else {
                arrayList.add(new CalendarDbBean(simpleCalendarBean.getEventUuid(), simpleCalendarBean.getOperation(), simpleCalendarBean.getEventId(), simpleCalendarBean.getDtstart(), simpleCalendarBean.getDtend(), simpleCalendarBean.getAllDay(), mrd.c(simpleCalendarBean)));
            }
        }
        return arrayList;
    }
}
