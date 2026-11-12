package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.share.ShareConfig;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.impl.AchieveCallback;
import com.huawei.pluginachievement.manager.model.MedalConfigInfo;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import com.huawei.pluginachievement.manager.model.MedalInfoDesc;
import com.huawei.pluginachievement.manager.model.MedalLocation;
import com.huawei.pluginachievement.manager.model.NewMedalTabDataBean;
import com.huawei.profile.profile.ProfileExtendConstants;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.main.stories.nps.interactors.mode.TypeParams;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.ToLongFunction;

/* JADX INFO: loaded from: classes13.dex */
public class ozd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f45006a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static NewMedalTabDataBean f45007b = null;
    private static boolean d = true;

    public static void b(final AchieveCallback achieveCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: ozd.4
            @Override // java.lang.Runnable
            public void run() {
                long j;
                otl otlVarB = otl.b(BaseApplication.getContext());
                Map<String, String> mapS = otlVarB.s();
                mapS.put("countryCode", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010));
                otlVarB.b(mapS);
                HashMap map = new HashMap(5);
                List<osf> listD = otlVarB.d(8, map);
                List<osf> listD2 = otlVarB.d(9, map);
                LogUtil.j("PLGACHIEVE_AchieveMedalInitData", "getInitData configInfo getAllData");
                if (listD == null || listD2 == null || listD2.isEmpty()) {
                    return;
                }
                ArrayList arrayList = new ArrayList(5);
                ArrayList arrayList2 = new ArrayList(5);
                ArrayList arrayList3 = new ArrayList(5);
                HashMap map2 = new HashMap(5);
                ArrayList<String> arrayListC = ozd.c(listD2);
                List listA = ozd.a(listD2);
                LogUtil.a("PLGACHIEVE_AchieveMedalInitData", "historyPerfectMonthMedalList -> " + listA);
                for (osf osfVar : listD) {
                    if (osfVar instanceof MedalLocation) {
                        MedalLocation medalLocation = (MedalLocation) osfVar;
                        if (!arrayListC.contains(medalLocation.acquireMedalID()) && !listA.contains(medalLocation.acquireMedalID())) {
                            LogUtil.d("PLGACHIEVE_AchieveMedalInitData", medalLocation.toString());
                            if (medalLocation.acquireGainedCount() > 0) {
                                try {
                                    j = Long.parseLong(medalLocation.acquireMedalGainedTime());
                                } catch (NumberFormatException unused) {
                                    LogUtil.e("PLGACHIEVE_AchieveMedalInitData", "getData() NumberFormatException");
                                    j = 0;
                                }
                                arrayList2.add(medalLocation.acquireMedalID());
                                map2.put(medalLocation.acquireMedalID(), Long.valueOf(j));
                            } else {
                                arrayList3.add(medalLocation.acquireMedalID());
                            }
                            arrayList.add(medalLocation);
                        }
                    }
                }
                ozd.a(listD2, arrayList, ozb.a(arrayList2, map2), arrayList3, achieveCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<String> a(List<osf> list) {
        ArrayList arrayList = new ArrayList(5);
        if (CollectionUtils.a(list)) {
            LogUtil.j("PLGACHIEVE_AchieveMedalInitData", "getHistoryPerfectMonthMedal: medalConfigInfoList is empty");
            return arrayList;
        }
        HashMap map = new HashMap(5);
        for (osf osfVar : list) {
            if (osfVar instanceof MedalConfigInfo) {
                MedalConfigInfo medalConfigInfo = (MedalConfigInfo) osfVar;
                if (pax.o(medalConfigInfo.acquireMedalType())) {
                    ((List) map.computeIfAbsent(medalConfigInfo.acquireMedalType(), new Function() { // from class: oza
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ozd.b((String) obj);
                        }
                    })).add(new Pair(medalConfigInfo.acquireMedalID(), Long.valueOf(qrs.f(medalConfigInfo.acquireTakeEffectTime()))));
                }
            }
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            List list2 = (List) ((Map.Entry) it.next()).getValue();
            if (list2.size() > 1) {
                list2.sort(Comparator.comparingLong(new ToLongFunction() { // from class: oze
                    @Override // java.util.function.ToLongFunction
                    public final long applyAsLong(Object obj) {
                        return ((Long) ((Pair) obj).second).longValue();
                    }
                }));
                for (int i = 0; i < list2.size() && i != list2.size() - 1; i++) {
                    arrayList.add((String) ((Pair) list2.get(i)).first);
                }
            }
        }
        return arrayList;
    }

    static /* synthetic */ List b(String str) {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(List<osf> list, List<MedalLocation> list2, ArrayList<String> arrayList, ArrayList<String> arrayList2, AchieveCallback achieveCallback) {
        ArrayList arrayList3 = new ArrayList(5);
        ArrayList<String> arrayListC = c(list);
        ArrayList arrayList4 = new ArrayList(5);
        for (osf osfVar : list) {
            if (osfVar instanceof MedalConfigInfo) {
                MedalConfigInfo medalConfigInfo = (MedalConfigInfo) osfVar;
                String strAcquireMedalType = medalConfigInfo.acquireMedalType();
                if (strAcquireMedalType != null && strAcquireMedalType.length() >= 3) {
                    arrayList4.add(medalConfigInfo.acquireMedalID());
                }
                if (!arrayListC.contains(medalConfigInfo.acquireMedalID()) && strAcquireMedalType != null) {
                    arrayList3.add(medalConfigInfo);
                }
            }
        }
        ozw ozwVarA = ozb.a(list2);
        Map<String, ArrayList<String>> mapD = ozwVarA.d();
        HashMap map = new HashMap(5);
        HashMap map2 = new HashMap(5);
        ArrayList<MedalInfoDesc> arrayListD = d(list2, arrayList, arrayList3);
        ArrayList<String> arrayListE = ozb.e(arrayList2, (ArrayList<String>) arrayList4, list2);
        map.put(BaseApplication.getContext().getResources().getString(R.string.IDS_plugin_achievement_tab_have_gained_medals), arrayListD);
        map2.put(BaseApplication.getContext().getResources().getString(R.string.IDS_plugin_achievement_tab_not_gained_medals), b(d(list2, arrayListE, arrayList3)));
        if (mapD != null) {
            for (Map.Entry<String, ArrayList<String>> entry : mapD.entrySet()) {
                ArrayList<MedalInfoDesc> arrayListD2 = d(list2, entry.getValue(), arrayList3);
                map.put(entry.getKey(), arrayListD2);
                c(map2, arrayListD2);
            }
        }
        d(achieveCallback, arrayListD, ozwVarA, map, map2);
    }

    private static void d(AchieveCallback achieveCallback, ArrayList<MedalInfoDesc> arrayList, ozw ozwVar, Map<String, ArrayList<MedalInfoDesc>> map, Map<String, ArrayList<MedalInfoDesc>> map2) {
        List<String> listE = ozwVar.e();
        if (listE != null) {
            NewMedalTabDataBean newMedalTabDataBean = new NewMedalTabDataBean();
            f45007b = newMedalTabDataBean;
            newMedalTabDataBean.setMedalInfoDesc(arrayList);
            f45007b.setTabNewList(listE);
            f45007b.setFirstTabRelationship(ozwVar.c());
            f45007b.setSecondTabRelationship(map);
            f45007b.setSecondTabRelationshipForSport(map2);
            if (achieveCallback == null) {
                LogUtil.j("PLGACHIEVE_AchieveMedalInitData", "onMedalTabDataCallback: achieveCallback is null");
            } else {
                achieveCallback.onResponse(0, f45007b);
            }
        }
    }

    private static ArrayList<MedalInfoDesc> b(ArrayList<MedalInfoDesc> arrayList) {
        ArrayList<MedalInfoDesc> arrayList2 = new ArrayList<>(10);
        for (MedalInfoDesc medalInfoDesc : arrayList) {
            if (medalInfoDesc.acquireMedalType() != null && medalInfoDesc.acquireMedalType().length() < 3) {
                arrayList2.add(medalInfoDesc);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:89:0x0117  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 int, still in use, count: 6, list:
      (r2v0 int) from 0x0022: IF  (r2v0 int) != (2065 int)  -> B:11:0x0024 A[HIDDEN]
      (r2v0 int) from 0x0026: IF  (r2v0 int) != (2066 int)  -> B:13:0x0028 A[HIDDEN]
      (r2v0 int) from 0x002a: IF  (r2v0 int) != (2068 int)  -> B:15:0x002c A[HIDDEN]
      (r2v0 int) from 0x002c: SWITCH (r2v0 int)
     case 65: goto B:76:0x00f0
     case 66: goto B:72:0x00e5
     case 67: goto B:68:0x00da
     case 68: goto B:64:0x00cf
     default: goto B:16:0x002f A[RegionRef:SW:15]
      (r2v0 int) from 0x0032: SWITCH (r2v0 int)
     case 2099: goto B:48:0x009c
     case 2100: goto B:44:0x008e
     case 2101: goto B:40:0x0080
     default: goto B:18:0x0035 A[RegionRef:SW:17]
      (r2v0 int) from 0x0035: SWITCH (r2v0 int)
     case 2126: goto B:36:0x0072
     case 2127: goto B:32:0x0064
     case 2128: goto B:28:0x0056
     case 2129: goto B:24:0x0048
     case 2130: goto B:20:0x003a
     default: goto B:89:0x0117 A[RegionRef:SW:18]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static void c(Map<String, ArrayList<MedalInfoDesc>> map, ArrayList<MedalInfoDesc> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        byte b2 = 0;
        String strAcquireMedalType = arrayList.get(0).acquireMedalType();
        if (strAcquireMedalType == null) {
            return;
        }
        strAcquireMedalType.hashCode();
        if (iHashCode != 2065) {
            if (iHashCode != 2066) {
                if (iHashCode != 2068) {
                    switch (iHashCode) {
                        case 65:
                            if (!strAcquireMedalType.equals("A")) {
                                b2 = -1;
                            }
                            break;
                        case 66:
                            if (!strAcquireMedalType.equals("B")) {
                                b2 = -1;
                            } else {
                                b2 = 1;
                            }
                            break;
                        case 67:
                            if (!strAcquireMedalType.equals(TypeParams.SEARCH_CODE)) {
                                b2 = -1;
                            } else {
                                b2 = 2;
                            }
                            break;
                        case 68:
                            if (!strAcquireMedalType.equals("D")) {
                                b2 = -1;
                            } else {
                                b2 = 3;
                            }
                            break;
                        default:
                            switch (strAcquireMedalType) {
                                case "B1":
                                    b2 = 7;
                                    break;
                                case "B2":
                                    b2 = 8;
                                    break;
                                case "B3":
                                    b2 = 9;
                                    break;
                                default:
                                    switch (strAcquireMedalType) {
                                        case ShareConfig.MSG_SHARE_FAIL_TOAST /* 2099 */:
                                            if (!strAcquireMedalType.equals("B5")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 10;
                                            }
                                            break;
                                        case 2100:
                                            if (!strAcquireMedalType.equals("B6")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 11;
                                            }
                                            break;
                                        case 2101:
                                            if (!strAcquireMedalType.equals("B7")) {
                                                b2 = -1;
                                            } else {
                                                b2 = 12;
                                            }
                                            break;
                                        default:
                                            switch (strAcquireMedalType) {
                                                case 2126:
                                                    if (!strAcquireMedalType.equals("C1")) {
                                                        b2 = -1;
                                                    } else {
                                                        b2 = 13;
                                                    }
                                                    break;
                                                case 2127:
                                                    if (!strAcquireMedalType.equals("C2")) {
                                                        b2 = -1;
                                                    } else {
                                                        b2 = 14;
                                                    }
                                                    break;
                                                case 2128:
                                                    if (!strAcquireMedalType.equals("C3")) {
                                                        b2 = -1;
                                                    } else {
                                                        b2 = 15;
                                                    }
                                                    break;
                                                case 2129:
                                                    if (!strAcquireMedalType.equals("C4")) {
                                                        b2 = -1;
                                                    } else {
                                                        b2 = 16;
                                                    }
                                                    break;
                                                case 2130:
                                                    if (!strAcquireMedalType.equals("C5")) {
                                                        b2 = -1;
                                                    } else {
                                                        b2 = 17;
                                                    }
                                                    break;
                                                default:
                                                    b2 = -1;
                                                    break;
                                            }
                                            break;
                                    }
                            }
                            break;
                    }
                } else if (strAcquireMedalType.equals("A5")) {
                    b2 = 6;
                } else {
                    b2 = -1;
                }
            } else if (strAcquireMedalType.equals("A3")) {
                b2 = 5;
            } else {
                b2 = -1;
            }
        } else if (strAcquireMedalType.equals("A2")) {
            b2 = 4;
        } else {
            b2 = -1;
        }
        switch (b2) {
            case 0:
            case 7:
            case 13:
                map.put(String.valueOf(258), arrayList);
                map.put(String.valueOf(264), arrayList);
                break;
            case 1:
            case 2:
            case 3:
            case 8:
                map.put(String.valueOf(257), arrayList);
                map.put(String.valueOf(282), arrayList);
                break;
            case 4:
            case 9:
            case 14:
                map.put(String.valueOf(259), arrayList);
                break;
            case 5:
            case 11:
            case 16:
                map.put(String.valueOf(262), arrayList);
                break;
            case 6:
            case 12:
            case 17:
                map.put(String.valueOf(283), arrayList);
                break;
            case 10:
            case 15:
                map.put(String.valueOf(10001), arrayList);
                break;
        }
    }

    private static ArrayList<MedalInfoDesc> d(List<MedalLocation> list, ArrayList<String> arrayList, List<MedalConfigInfo> list2) {
        LogUtil.a("PLGACHIEVE_AchieveMedalInitData", "enter getMedalInfoByConfig list= ", arrayList == null ? Constants.NULL : arrayList.toString());
        ArrayList<MedalInfoDesc> arrayList2 = new ArrayList<>(5);
        if (arrayList == null) {
            LogUtil.j("PLGACHIEVE_AchieveMedalInitData", "the list is null");
            return arrayList2;
        }
        c(list, arrayList, list2, arrayList2);
        LogUtil.d("PLGACHIEVE_AchieveMedalInitData", "medalInfoDesc size = ", Integer.valueOf(arrayList2.size()));
        return arrayList2;
    }

    private static void c(List<MedalLocation> list, ArrayList<String> arrayList, List<MedalConfigInfo> list2, ArrayList<MedalInfoDesc> arrayList2) {
        String strA;
        int iAcquireEventStatus;
        String phoneTypes;
        String strAcquireEndTime;
        String clientTypes;
        String strE = osa.e(BaseApplication.getContext(), "_medalPngStatusDownload");
        int i = 0;
        for (String str : arrayList) {
            MedalInfoDesc medalInfoDesc = new MedalInfoDesc(str);
            for (MedalLocation medalLocation : list) {
                if (str.equals(medalLocation.acquireMedalID())) {
                    String strAcquireMedalGainedTime = medalLocation.acquireMedalGainedTime();
                    int iAcquireGainedCount = medalLocation.acquireGainedCount();
                    medalInfoDesc.saveGainCount(iAcquireGainedCount);
                    medalInfoDesc.saveGainTime(strAcquireMedalGainedTime);
                    i = iAcquireGainedCount;
                    break;
                }
            }
            Iterator<MedalConfigInfo> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    strA = null;
                    iAcquireEventStatus = 0;
                    phoneTypes = null;
                    strAcquireEndTime = null;
                    clientTypes = null;
                    break;
                }
                MedalConfigInfo next = it.next();
                if (str.equals(next.acquireMedalID())) {
                    strA = a(next, i, medalInfoDesc);
                    iAcquireEventStatus = next.acquireEventStatus();
                    strAcquireEndTime = next.acquireEndTime();
                    clientTypes = next.getClientTypes();
                    phoneTypes = next.getPhoneTypes();
                    break;
                }
            }
            if (pax.k(strA) && TextUtils.isEmpty(strAcquireEndTime) && d) {
                LogUtil.d("PLGACHIEVE_AchieveMedalInitData", "enter dealActivityMedal");
                d = false;
                otl.b(BaseApplication.getContext()).c();
            }
            if (pax.d(strAcquireEndTime, i) && oun.a(strA, str, BaseApplication.getContext(), strE) && e(iAcquireEventStatus, str) && pax.e(str, clientTypes, phoneTypes, i)) {
                arrayList2.add(medalInfoDesc);
            }
        }
    }

    private static boolean e(int i, String str) {
        if (i < 3) {
            return true;
        }
        LogUtil.a("PLGACHIEVE_AchieveMedalInitData", "Medal Is ExceptionStatus");
        MedalConfigInfo medalConfigInfo = new MedalConfigInfo();
        medalConfigInfo.saveMedalID(str);
        medalConfigInfo.saveIsNewConfig(0);
        medalConfigInfo.saveEventStatus(0);
        otl.b(BaseApplication.getContext()).a((osf) medalConfigInfo);
        oun.c(str, BaseApplication.getContext());
        return false;
    }

    private static String a(MedalConfigInfo medalConfigInfo, int i, MedalInfoDesc medalInfoDesc) {
        String strAcquireGrayPromotionName;
        String strAcquireGrayPromotionUrl;
        String strAcquireMedalName = medalConfigInfo.acquireMedalName();
        String strAcquireLightDescription = medalConfigInfo.acquireLightDescription();
        String strAcquireGrayDescription = medalConfigInfo.acquireGrayDescription();
        String strAcquireMessage = medalConfigInfo.acquireMessage();
        String strAcquireMedalType = medalConfigInfo.acquireMedalType();
        String strE = osv.e(strAcquireMedalType, String.valueOf(medalConfigInfo.acquireMedalLevel()));
        if (i > 0) {
            strAcquireGrayPromotionName = medalConfigInfo.acquireLightPromotionName();
            strAcquireGrayPromotionUrl = medalConfigInfo.acquireLightPromotionUrl();
        } else {
            strAcquireGrayPromotionName = medalConfigInfo.acquireGrayPromotionName();
            strAcquireGrayPromotionUrl = medalConfigInfo.acquireGrayPromotionUrl();
        }
        medalInfoDesc.saveText(strAcquireMedalName);
        medalInfoDesc.saveLightDescription(strAcquireLightDescription);
        medalInfoDesc.saveGrayDescription(strAcquireGrayDescription);
        medalInfoDesc.saveMessage(strAcquireMessage);
        int iAcquireReachStatus = medalConfigInfo.acquireReachStatus();
        medalInfoDesc.saveIsNewConfig(medalConfigInfo.acquireIsNewConfig());
        medalInfoDesc.saveReachStatus(iAcquireReachStatus);
        medalInfoDesc.saveMedalTypeLevel(strE);
        medalInfoDesc.savePromotionName(strAcquireGrayPromotionName);
        medalInfoDesc.savePromotionURL(strAcquireGrayPromotionUrl);
        medalInfoDesc.saveMedalType(strAcquireMedalType);
        medalInfoDesc.saveMedalLabel(medalConfigInfo.acquireMedalLabel());
        return strAcquireMedalType;
    }

    public static ArrayList<String> c(List<osf> list) {
        ArrayList<String> arrayList = new ArrayList<>(5);
        if (list == null || list.isEmpty()) {
            LogUtil.a("PLGACHIEVE_AchieveMedalInitData", "getOperationList configInfo isEmpty");
            return arrayList;
        }
        boolean zD = pax.d();
        boolean zIsSupportOperationAccount = VersionControlUtil.isSupportOperationAccount();
        if (!zD && zIsSupportOperationAccount) {
            LogUtil.a("PLGACHIEVE_AchieveMedalInitData", "getOperationList isOperation true");
            return arrayList;
        }
        for (osf osfVar : list) {
            if (osfVar instanceof MedalConfigInfo) {
                MedalConfigInfo medalConfigInfo = (MedalConfigInfo) osfVar;
                String strAcquireMedalType = medalConfigInfo.acquireMedalType();
                if (!zIsSupportOperationAccount && pax.m(strAcquireMedalType)) {
                    arrayList.add(medalConfigInfo.acquireMedalID());
                } else if (zD && MedalConstants.ACTION_MEDAL_TYPE.equals(strAcquireMedalType)) {
                    arrayList.add(medalConfigInfo.acquireMedalID());
                }
            }
        }
        return arrayList;
    }

    public static boolean e() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - f45006a < ProfileExtendConstants.TIME_OUT) {
            return true;
        }
        f45006a = jElapsedRealtime;
        return false;
    }

    public static NewMedalTabDataBean a() {
        return f45007b;
    }

    public static void e(NewMedalTabDataBean newMedalTabDataBean) {
        f45007b = newMedalTabDataBean;
    }
}
