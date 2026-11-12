package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.MedalConfigInfo;
import com.huawei.pluginachievement.manager.model.MessageObject;
import com.huawei.ui.main.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class wrd implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f52362c;
    private final IBaseResponseCallback d;
    private final List<String> e;

    public wrd(List<String> list, IBaseResponseCallback iBaseResponseCallback) {
        this.e = list;
        this.d = iBaseResponseCallback;
    }

    public void c(boolean z) {
        this.f52362c = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        List<String> listA = a(this.e);
        if (njy.e(listA)) {
            LogUtil.j("GenerateMedalMessageRunnable", "updateMessageCenter isShownAllMedals, return!");
            this.d.a(0, true);
            return;
        }
        LogUtil.a("GenerateMedalMessageRunnable", "updateMessageCenter unShownMedalIds: ", listA.toString());
        List<osf> listD = otl.b(BaseApplication.getContext()).d(9, new HashMap(0));
        if (listD == null) {
            this.d.a(0, true);
            return;
        }
        ArrayList<String> arrayListL = otl.b(BaseApplication.getContext()).l();
        for (osf osfVar : listD) {
            Iterator<String> it = listA.iterator();
            while (it.hasNext()) {
                e(it.next(), osfVar, arrayListL);
            }
        }
        this.d.a(0, true);
    }

    private List<String> a(List<String> list) {
        String strE = osa.e(BaseApplication.getContext(), "medal_release_message_shown_list");
        if (TextUtils.isEmpty(strE.trim())) {
            LogUtil.j("GenerateMedalMessageRunnable", "updateMessageCenter medalSp is isEmpty!");
            return list;
        }
        LogUtil.j("GenerateMedalMessageRunnable", "updateMessageCenter medalSp ", strE);
        List listAsList = Arrays.asList(strE.split(","));
        if (njy.e(listAsList)) {
            LogUtil.j("GenerateMedalMessageRunnable", "updateMessageCenter medalSpList isEmpty!");
            return list;
        }
        ArrayList arrayList = new ArrayList(16);
        for (String str : list) {
            if (!listAsList.contains(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    private void e(String str, osf osfVar, ArrayList<String> arrayList) {
        if (this.f52362c) {
            LogUtil.j("GenerateMedalMessageRunnable", "checkNewMedal fragment is destroyed, need stop ");
            return;
        }
        if (osfVar instanceof MedalConfigInfo) {
            MedalConfigInfo medalConfigInfo = (MedalConfigInfo) osfVar;
            if (arrayList.contains(medalConfigInfo.acquireMedalID())) {
                LogUtil.j("GenerateMedalMessageRunnable", "checkNewMedal medalConfigInfos is lighted!");
                return;
            }
            if (!pax.e(str, medalConfigInfo.getClientTypes(), medalConfigInfo.getPhoneTypes(), 0)) {
                LogUtil.j("GenerateMedalMessageRunnable", "checkNewMedal PhoneType is not match! medalId ", str, " ClientTypes ", medalConfigInfo.getClientTypes(), " PhoneTypes ", medalConfigInfo.getPhoneTypes());
                return;
            }
            if (str.equals(medalConfigInfo.acquireMedalID())) {
                String strAcquireEndTime = medalConfigInfo.acquireEndTime();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (TextUtils.isEmpty(strAcquireEndTime)) {
                    LogUtil.a("GenerateMedalMessageRunnable", "medal endTime is null.");
                    return;
                }
                try {
                    jCurrentTimeMillis = Long.parseLong(strAcquireEndTime);
                } catch (NumberFormatException unused) {
                    LogUtil.e("GenerateMedalMessageRunnable", "NumberFormatException");
                }
                if (jCurrentTimeMillis > System.currentTimeMillis()) {
                    c(medalConfigInfo);
                }
            }
        }
    }

    private void c(MedalConfigInfo medalConfigInfo) {
        if (this.f52362c) {
            LogUtil.j("GenerateMedalMessageRunnable", "saveMedalMessage fragment is destroyed, need stop ");
            return;
        }
        String strE = osa.e(BaseApplication.getContext(), "activity_medal_message_shown_list");
        String strAcquireMedalName = medalConfigInfo.acquireMedalName();
        int iAcquireActivityId = medalConfigInfo.acquireActivityId();
        if (iAcquireActivityId != 0 && strE.contains(String.valueOf(iAcquireActivityId))) {
            LogUtil.j("GenerateMedalMessageRunnable", "saveMedalMessage ", Integer.valueOf(iAcquireActivityId), strAcquireMedalName, " has shown!", strE);
            return;
        }
        String strC = c(iAcquireActivityId, strAcquireMedalName);
        Context context = BaseApplication.getContext();
        MessageObject messageObjectE = otl.b(context).e(medalConfigInfo);
        messageObjectE.setType(MessageConstant.NEW_MEDAL_TYPE);
        messageObjectE.setMsgTitle(context.getString(R.string.IDS_hw_messagecenter_medal_release_notification));
        LogUtil.a("GenerateMedalMessageRunnable", "saveMedalMessage is showing msgName =", strC, " medalId = ", medalConfigInfo.acquireMedalID(), " activityId = ", Integer.valueOf(iAcquireActivityId));
        messageObjectE.setMsgContent(qre.a(R.string.IDS_hw_messagecenter_medal_release_notification_content, strC));
        messageObjectE.setMetaData(context.getString(R.string.IDS_hw_messagecenter_medal_release_notification));
        messageObjectE.setReadFlag(0);
        if (oru.a(context).getAdapter() != null) {
            LogUtil.a("GenerateMedalMessageRunnable", "generate Medal Message");
            oru.a(context).getAdapter().generateMessage(messageObjectE);
            e(medalConfigInfo.acquireMedalID(), iAcquireActivityId, strE);
        }
    }

    private String c(int i, String str) {
        if (i != 0) {
            for (String str2 : osa.e(BaseApplication.getContext(), "activity_medal_id_shown_name").split(",")) {
                if (str2.contains(String.valueOf(i))) {
                    String[] strArrSplit = str2.split("_");
                    if (strArrSplit.length > 1) {
                        return strArrSplit[1];
                    }
                }
            }
        }
        return str;
    }

    private void e(String str, int i, String str2) {
        osa.b(BaseApplication.getContext(), "medal_release_message_shown_list", osa.e(BaseApplication.getContext(), "medal_release_message_shown_list") + "," + str);
        if (i != 0) {
            osa.b(BaseApplication.getContext(), "activity_medal_message_shown_list", str2 + "," + i);
        }
    }
}
