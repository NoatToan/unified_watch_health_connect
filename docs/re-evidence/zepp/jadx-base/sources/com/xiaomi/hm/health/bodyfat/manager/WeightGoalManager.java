package com.xiaomi.hm.health.bodyfat.manager;

import android.content.Context;
import com.huami.network.base.handler.IHMHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.hmnetwork.webapi.WebResponse;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bodyfat.manager.WeightGoalManager;
import com.xiaomi.hm.health.bodyfat.model.SyncResult;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.webapi.WeightGoalApi;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.WeightGoals;
import com.xiaomi.hm.health.databases.model.WeightGoalsDao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.greenrobot.greendao.query.WhereCondition;
import org.json.JSONArray;
import org.json.JSONObject;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;
import rx.functions.Actions;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes19.dex */
public class WeightGoalManager {
    private static final String a = "Weight-WeightGoalManager";
    private static WeightGoalManager b;

    public class a extends IHMHttpResponseHandler {
        public final /* synthetic */ d a;

        public a(d dVar) {
            this.a = dVar;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            HMLog.i(WeightGoalManager.a, "sync WeightGoals is Failure !", new Object[0]);
            this.a.a(null);
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            if (!hMHttpResponseData.getSuccess()) {
                HMLog.i(WeightGoalManager.a, "sync WeightGoals is failure!", new Object[0]);
                return;
            }
            String str = new String(hMHttpResponseData.getResponseBody());
            HMLog.d(WeightGoalManager.a, "response = " + str, new Object[0]);
            WebResponse webResponse = WebResponse.parse(str);
            if (!webResponse.success()) {
                if (!webResponse.empty()) {
                    HMLog.i(WeightGoalManager.a, "sync WeightGoals is failure!", new Object[0]);
                    return;
                } else {
                    this.a.a(null);
                    HMLog.i(WeightGoalManager.a, "sync WeightGoals is success ,but data is Empty !", new Object[0]);
                    return;
                }
            }
            HMLog.i(WeightGoalManager.a, "sync WeightGoals is Success !", new Object[0]);
            List<WeightGoals> listP = WeightGoalManager.p(str);
            if (listP == null || listP.size() <= 0) {
                HMLog.d(WeightGoalManager.a, " info size is null or 0", new Object[0]);
                this.a.a(null);
                return;
            }
            HMLog.d(WeightGoalManager.a, "item size is " + listP.size(), new Object[0]);
            this.a.a(listP);
        }
    }

    public class b extends IHMHttpResponseHandler {
        public final /* synthetic */ WeightGoals a;
        public final /* synthetic */ SyncResult b;

        public b(WeightGoals weightGoals, SyncResult syncResult) {
            this.a = weightGoals;
            this.b = syncResult;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            HMLog.i(WeightGoalManager.a, "sync delete weightgoals Failure !", new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            if (!hMHttpResponseData.isSuccess()) {
                HMLog.i(WeightGoalManager.a, "sync delete weightgoals Failure !", new Object[0]);
                return;
            }
            HMLog.d(WeightGoalManager.a, "Response delete user target weight : " + new String(hMHttpResponseData.getResponseBody()), new Object[0]);
            HMLog.i(WeightGoalManager.a, "sync delete weightgoals Success !", new Object[0]);
            WeightGoalManager.this.h().delete(this.a);
            this.b.result = true;
        }
    }

    public class c extends IHMHttpResponseHandler {
        public final /* synthetic */ WeightGoals a;
        public final /* synthetic */ SyncResult b;

        public c(WeightGoals weightGoals, SyncResult syncResult) {
            this.a = weightGoals;
            this.b = syncResult;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            HMLog.d(WeightGoalManager.a, "sync TargetWeight To Server, Failure.", new Object[0]);
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            if (!hMHttpResponseData.isSuccess()) {
                HMLog.d(WeightGoalManager.a, "sync TargetWeight To Server, Failure.", new Object[0]);
                return;
            }
            byte[] responseBody = hMHttpResponseData.getResponseBody();
            if (responseBody == null) {
                HMLog.d(WeightGoalManager.a, "sync TargetWeight To Server, Failure.", new Object[0]);
                return;
            }
            HMLog.d(WeightGoalManager.a, "Response syncTargetWeightToServer: " + new String(responseBody), new Object[0]);
            this.a.setSynced(1);
            WeightGoalManager.this.h().update(this.a);
            this.b.result = true;
            HMLog.d(WeightGoalManager.a, "sync TargetWeight To Server, Success.", new Object[0]);
        }
    }

    public interface d {
        void a(List<WeightGoals> list);
    }

    private void g(final WeightGoals weightGoals) {
        Observable.unsafeCreate(new Observable.OnSubscribe() { // from class: es8
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.l(weightGoals, (Subscriber) obj);
            }
        }).subscribeOn(Schedulers.io()).subscribe(Actions.empty(), new Action1() { // from class: fs8
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                WeightGoalManager.n((Throwable) obj);
            }
        });
    }

    public static WeightGoalManager getInstance() {
        if (b == null) {
            b = new WeightGoalManager();
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WeightGoalsDao h() {
        return HMDaoManager.getInstance().getWeightGoalsDao();
    }

    private List<WeightGoals> i(long j, int i) {
        return h().queryBuilder().where(WeightGoalsDao.Properties.FUID.eq(Long.valueOf(j)), WeightGoalsDao.Properties.Synced.eq(Integer.valueOf(i))).list();
    }

    private List<WeightGoals> j(int i) {
        return h().queryBuilder().where(WeightGoalsDao.Properties.Synced.eq(Integer.valueOf(i)), new WhereCondition[0]).list();
    }

    private void k(Context context, long j, String str, String str2, d dVar) {
        if (j == Long.valueOf(BFCallback.getHMPersonInfo().getUserid()).longValue()) {
            j = -1;
        }
        WeightGoalApi.getUserWeightGoalList(String.valueOf(BFCallback.getHMLoginManager().getValidUid()), j, 1, str, str2, new a(dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(WeightGoals weightGoals, Subscriber subscriber) {
        r(weightGoals);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String m(Throwable th) {
        return "请求云端删除目标数据接口处理失败:  " + th.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(final Throwable th) {
        HMLog.warn(a, new Function0() { // from class: ds8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WeightGoalManager.m(th);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(List list) {
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                WeightGoals weightGoals = (WeightGoals) it2.next();
                weightGoals.setSynced(1);
                h().insert(weightGoals);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<WeightGoals> p(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONObject("data").getJSONArray("list");
            for (int i = 0; i < jSONArray.length(); i++) {
                WeightGoals toWeightGoal = HMWeightUtils.parseToWeightGoal(jSONArray.getJSONObject(i));
                HMLog.d(a, "parse after  weightGoals = " + HMWeightUtils.toStringWeightGoals(toWeightGoal), new Object[0]);
                arrayList.add(toWeightGoal);
            }
        } catch (Exception unused) {
            HMLog.d(a, "parse error", new Object[0]);
        }
        return arrayList;
    }

    private boolean r(WeightGoals weightGoals) {
        HMLog.d(a, " syncNeedDeleWeightGoalToServer", new Object[0]);
        long jLongValue = weightGoals.getFUID().longValue();
        long jLongValue2 = weightGoals.getDateTime().longValue();
        SyncResult syncResult = new SyncResult();
        WeightGoalApi.deleteUserWeightGoal(String.valueOf(BFCallback.getHMLoginManager().getValidUid()), String.valueOf(jLongValue), 1, jLongValue2, new b(weightGoals, syncResult));
        return syncResult.result;
    }

    private boolean s(WeightGoals weightGoals) {
        HMLog.d(a, "sync TargetWeight To Server ", new Object[0]);
        SyncResult syncResult = new SyncResult();
        WeightGoalApi.uploadUserWeightGoal(String.valueOf(BFCallback.getHMLoginManager().getValidUid()), String.valueOf(weightGoals.getFUID()), 1, weightGoals.getCurrentVal().floatValue(), weightGoals.getGoal().floatValue(), weightGoals.getHeight().intValue(), weightGoals.getDateTime().longValue(), new c(weightGoals, syncResult));
        return syncResult.result;
    }

    public void cleanAllInfosLocal() {
        HMLog.w(a, "Delete All Infos!!", new Object[0]);
        h().deleteAll();
    }

    public void deleteUserWeightGoalInLocal(long j) {
        HMLog.d(a, "deleteUserWeightGoalInLocal fuid = " + j, new Object[0]);
        List<WeightGoals> list = h().queryBuilder().where(WeightGoalsDao.Properties.FUID.eq(Long.valueOf(j)), new WhereCondition[0]).orderDesc(WeightGoalsDao.Properties.DateTime).list();
        if (list == null || list.size() == 0) {
            HMLog.d(a, "nothing goal found in fuid = " + j, new Object[0]);
            return;
        }
        HMLog.d(a, "need delete weightGoals size = " + list.size(), new Object[0]);
        try {
            list.get(0).setSynced(-1);
            h().update(list.get(0));
            g(list.get(0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<WeightGoals> getAllGoals() {
        return h().queryBuilder().list();
    }

    public WeightGoals getWeightGoalByUserId(long j) {
        if (String.valueOf(j).equals(BFCallback.getHMPersonInfo().getUserid())) {
            j = -1;
        }
        List<WeightGoals> list = h().queryBuilder().where(WeightGoalsDao.Properties.FUID.eq(Long.valueOf(j)), new WhereCondition[0]).orderDesc(WeightGoalsDao.Properties.DateTime).list();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public boolean isAchieveGoal(long j, float f) {
        WeightGoals weightGoalByUserId = getWeightGoalByUserId(j);
        if (weightGoalByUserId == null) {
            return false;
        }
        if (weightGoalByUserId.getCurrentVal().floatValue() < weightGoalByUserId.getGoal().floatValue()) {
            return f >= weightGoalByUserId.getGoal().floatValue();
        }
        return f <= weightGoalByUserId.getGoal().floatValue();
    }

    public boolean isUserFirstTimeToSetWeightGoal(long j) {
        List<WeightGoals> list = h().queryBuilder().where(WeightGoalsDao.Properties.FUID.eq(Long.valueOf(j)), WeightGoalsDao.Properties.Synced.notEq(-1)).list();
        if (list == null || list.size() == 0) {
            HMLog.d(a, "the user fuid is first time to set weight goal", new Object[0]);
            return true;
        }
        HMLog.d(a, " the user fuid is not first time to set weight goal and the size is " + list.size(), new Object[0]);
        return false;
    }

    public void q(Context context) {
        Iterator<UserInfos> it2 = UserInfoManager.getManager().getAllInfos().iterator();
        while (it2.hasNext()) {
            k(context, Long.valueOf(it2.next().getUserId()).longValue(), "", "", new d() { // from class: com.xiaomi.hm.health.bodyfat.manager.a
                @Override // com.xiaomi.hm.health.bodyfat.manager.WeightGoalManager.d
                public final void a(List list) {
                    this.a.o(list);
                }
            });
        }
    }

    public void syncDeleteToServer(long j) {
        String str;
        List<WeightGoals> listI = i(j, -1);
        if (listI == null) {
            str = "needdelelist is empty ";
        } else {
            str = " need delete " + listI.size() + " weight goal";
        }
        HMLog.d(a, str, new Object[0]);
        if (listI != null) {
            Iterator<WeightGoals> it2 = listI.iterator();
            while (it2.hasNext()) {
                r(it2.next());
            }
        }
    }

    public boolean syncLocalToServer() {
        String str;
        String str2;
        HMLog.i(a, "start sync weightGoals local to Server !", new Object[0]);
        List<WeightGoals> listJ = j(0);
        if (listJ == null) {
            str = "WeightGoals needUpdateList is empty ";
        } else {
            str = "WeightGoals need update " + listJ.size() + " weight goal";
        }
        HMLog.d(a, str, new Object[0]);
        boolean zR = true;
        if (listJ != null) {
            Iterator<WeightGoals> it2 = listJ.iterator();
            while (it2.hasNext()) {
                zR &= s(it2.next());
            }
        }
        List<WeightGoals> listJ2 = j(-1);
        if (listJ2 == null) {
            str2 = "WeightGoals needDeleList is empty ";
        } else {
            str2 = "WeightGoals need delete " + listJ2.size() + " weight goal";
        }
        HMLog.d(a, str2, new Object[0]);
        if (listJ2 != null) {
            Iterator<WeightGoals> it3 = listJ2.iterator();
            while (it3.hasNext()) {
                zR &= r(it3.next());
            }
        }
        return zR;
    }

    public void syncSyncToServer(long j) {
        String str;
        List<WeightGoals> listI = i(j, 0);
        if (listI == null) {
            str = "needUpdateList is empty ";
        } else {
            str = " need update " + listI.size() + " weight goal";
        }
        HMLog.d(a, str, new Object[0]);
        if (listI != null) {
            Iterator<WeightGoals> it2 = listI.iterator();
            while (it2.hasNext()) {
                s(it2.next());
            }
        }
    }
}
