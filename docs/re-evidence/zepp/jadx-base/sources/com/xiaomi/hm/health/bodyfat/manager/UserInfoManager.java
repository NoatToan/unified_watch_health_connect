package com.xiaomi.hm.health.bodyfat.manager;

import android.content.Context;
import android.text.TextUtils;
import androidx.p008lifecycle.LiveData;
import com.huami.network.base.handler.IHMHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.hmnetwork.properties.Property;
import com.huami.network.hmnetwork.webapi.WebResponse;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.model.Birthday;
import com.xiaomi.hm.health.bodyfat.model.SyncResult;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BFKeeper;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.bodyfat.utils.Utils;
import com.xiaomi.hm.health.bodyfat.webapi.WeightUserInfoApi;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.LiveDataSupportKt;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.UserInfosDao;
import com.xiaomi.hm.health.databases.model.UserScaleInfo;
import com.xiaomi.hm.health.relation.cloud.WebAPI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.query.WhereCondition;
import org.json.JSONArray;
import org.json.JSONObject;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;
import rx.functions.Actions;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes19.dex */
public class UserInfoManager {
    private static final String a = "Weight-UserInfoManager";
    private static UserInfoManager b;

    public class a extends HMWeightUtils.SyncCallback {
        public final /* synthetic */ Context a;
        public final /* synthetic */ HMWeightUtils.SyncCallback b;

        public a(Context context, HMWeightUtils.SyncCallback syncCallback) {
            this.a = context;
            this.b = syncCallback;
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils.SyncCallback
        public void onFailure() {
            HMWeightUtils.SyncCallback syncCallback = this.b;
            if (syncCallback != null) {
                syncCallback.onFailure();
            }
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils.SyncCallback
        public void onSuccess() {
            WeightGoalManager.getInstance().q(this.a);
            HMWeightUtils.SyncCallback syncCallback = this.b;
            if (syncCallback != null) {
                syncCallback.onSuccess();
            }
        }
    }

    public class b extends IHMHttpResponseHandler {
        public final /* synthetic */ SyncResult a;
        public final /* synthetic */ HMWeightUtils.SyncCallback b;

        public b(SyncResult syncResult, HMWeightUtils.SyncCallback syncCallback) {
            this.a = syncResult;
            this.b = syncCallback;
        }

        private void a(List<UserInfos> list) {
            boolean z;
            if (BFCallback.getInstance().isInner()) {
                return;
            }
            if (BFCallback.getHMLoginManager().isInNonContinental() && BFCallback.getHMPropertyUtil().getProperty(Property.PROPERTY_UNDER_AGE_LOCAL_DATAS_DELETED, "").contains("true")) {
                try {
                    String property = BFCallback.getHMPropertyUtil().getProperty(Property.PROPERTY_UNDER_AGE_GRANT_WEIGHT_DATA_PERMISSION, "");
                    if (list == null || list.isEmpty()) {
                        return;
                    }
                    if (TextUtils.isEmpty(property)) {
                        Iterator<UserInfos> it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (!BFCallback.getHMLoginManager().isAdult(Birthday.fromStr(it2.next().getBirthday()).getAge())) {
                                it2.remove();
                            }
                        }
                        return;
                    }
                    JSONArray jSONArray = new JSONArray(property);
                    Iterator<UserInfos> it3 = list.iterator();
                    while (it3.hasNext()) {
                        UserInfos next = it3.next();
                        if (!BFCallback.getHMLoginManager().isAdult(Birthday.fromStr(next.getBirthday()).getAge())) {
                            int i = 0;
                            while (true) {
                                if (i >= jSONArray.length()) {
                                    z = false;
                                    break;
                                }
                                JSONObject jSONObject = jSONArray.getJSONObject(i);
                                if (!TextUtils.isEmpty(jSONObject.optString(Constant.KEY_WEIGHT_UNDERAGE)) && jSONObject.optString(Constant.KEY_WEIGHT_UNDERAGE).equals(next.getUserId())) {
                                    z = true;
                                    break;
                                }
                                i++;
                            }
                            if (!z) {
                                it3.remove();
                            }
                        }
                    }
                } catch (Exception e) {
                    HMLog.i(UserInfoManager.a, "" + e.getMessage(), new Object[0]);
                }
            }
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            this.a.result = false;
            HMWeightUtils.SyncCallback syncCallback = this.b;
            if (syncCallback != null) {
                syncCallback.onFailure();
            }
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            if (!hMHttpResponseData.getSuccess() || hMHttpResponseData.getResponseBody() == null) {
                return;
            }
            String str = new String(hMHttpResponseData.getResponseBody());
            HMLog.i(UserInfoManager.a, " response = " + str, new Object[0]);
            WebResponse webResponse = WebResponse.parse(str);
            if (!webResponse.success()) {
                if (!webResponse.empty()) {
                    this.a.result = false;
                    HMWeightUtils.SyncCallback syncCallback = this.b;
                    if (syncCallback != null) {
                        syncCallback.onFailure();
                    }
                    HMLog.i(UserInfoManager.a, "Sync UserInfos To Local Failure!!", new Object[0]);
                    return;
                }
                BFKeeper.keepScaleSyncedUserInfosFromServer(true);
                this.a.result = true;
                HMWeightUtils.SyncCallback syncCallback2 = this.b;
                if (syncCallback2 != null) {
                    syncCallback2.onSuccess();
                }
                HMLog.i(UserInfoManager.a, "Sync UserInfos To Local success , data is empty!!", new Object[0]);
                return;
            }
            HMLog.i(UserInfoManager.a, "Sync UserInfos To Local Success!!", new Object[0]);
            List listE = UserInfoManager.this.E(str);
            StringBuilder sb = new StringBuilder();
            sb.append("parseInfos userSize = ");
            sb.append(listE == null ? 0 : listE.size());
            HMLog.d(UserInfoManager.a, sb.toString(), new Object[0]);
            if (listE != null) {
                Iterator it2 = listE.iterator();
                while (it2.hasNext()) {
                    ((UserInfos) it2.next()).setSynced(1);
                }
                UserInfoManager.this.F(listE);
                List<UserInfos> listC = UserInfoManager.this.C(listE);
                if (listC != null) {
                    HMLog.d(UserInfoManager.a, "----------- mergeInfo log start----------", new Object[0]);
                    for (int i = 0; i < listC.size(); i++) {
                        HMLog.d(UserInfoManager.a, "i = " + i + " , user : " + HMWeightUtils.parserUserInfos(listC.get(i)), new Object[0]);
                    }
                    HMLog.d(UserInfoManager.a, "----------- mergeInfo log end----------", new Object[0]);
                }
                a(listC);
                boolean zO = UserInfoManager.this.o(listC);
                HMLog.d(UserInfoManager.a, "insert users : " + zO, new Object[0]);
                if (zO) {
                    this.a.result = true;
                    BFKeeper.keepScaleSyncedUserInfosFromServer(true);
                    HMWeightUtils.SyncCallback syncCallback3 = this.b;
                    if (syncCallback3 != null) {
                        syncCallback3.onSuccess();
                    }
                }
            }
        }
    }

    public class c extends IHMHttpResponseHandler {
        public final /* synthetic */ SyncResult a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ UserInfos c;

        public c(SyncResult syncResult, boolean z, UserInfos userInfos) {
            this.a = syncResult;
            this.b = z;
            this.c = userInfos;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            HMLog.i(UserInfoManager.a, "Sync UserInfo To Server Failure!!", new Object[0]);
            this.a.result = false;
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            if (hMHttpResponseData.isSuccess()) {
                String str = new String(hMHttpResponseData.getResponseBody());
                HMLog.d(UserInfoManager.a, "Response : " + str, new Object[0]);
                if (WebResponse.parse(str).success()) {
                    this.a.result = true;
                    HMLog.i(UserInfoManager.a, "Result OK!!", new Object[0]);
                    if (this.b) {
                        String strD = UserInfoManager.this.D(str, this.c);
                        if (!TextUtils.isEmpty(strD)) {
                            HMLog.i(UserInfoManager.a, "url = " + strD, new Object[0]);
                            this.c.setAvatarUrl(strD);
                        }
                    }
                    this.c.setSynced(1);
                    UserInfoManager.this.J(this.c);
                }
            }
        }
    }

    public class d extends IHMHttpResponseHandler {
        public final /* synthetic */ SyncResult a;
        public final /* synthetic */ List b;

        public d(SyncResult syncResult, List list) {
            this.a = syncResult;
            this.b = list;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            HMLog.i(UserInfoManager.a, "Sync Deleted UserInfos To Server Failure onError...... !!", new Object[0]);
            this.a.result = false;
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            if (!hMHttpResponseData.isSuccess()) {
                HMLog.i(UserInfoManager.a, "Sync Deleted UserInfos To Server Failure!!", new Object[0]);
                this.a.result = false;
                return;
            }
            byte[] responseBody = hMHttpResponseData.getResponseBody();
            if (responseBody == null) {
                HMLog.i(UserInfoManager.a, "Sync Deleted UserInfos To Server Failure, responseBody = null ", new Object[0]);
                this.a.result = false;
                return;
            }
            String str = new String(responseBody);
            HMLog.d(UserInfoManager.a, "Response : " + str, new Object[0]);
            WebResponse webResponse = WebResponse.parse(str);
            if (webResponse.success()) {
                HMLog.i(UserInfoManager.a, "Sync Deleted UserInfos To Server Success!!", new Object[0]);
                this.a.result = true;
                UserInfoManager.this.q(this.b);
            } else {
                HMLog.i(UserInfoManager.a, "Sync Deleted UserInfos To Server Failure,code = " + webResponse.code, new Object[0]);
                this.a.result = false;
            }
        }
    }

    private UserInfoManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String A(Throwable th) {
        return "请求云端更新家庭成员信息接口处理失败:  " + th.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void B(final Throwable th) {
        HMLog.warn(a, new Function0() { // from class: h68
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UserInfoManager.A(th);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<UserInfos> C(List<UserInfos> list) {
        HMLog.d(a, "Merge UserInfos From Server!!", new Object[0]);
        List<UserInfos> allInfos = getAllInfos();
        if (allInfos != null && allInfos.size() > 0 && list != null && list.size() > 0) {
            for (int i = 0; i < allInfos.size(); i++) {
                UserInfos userInfos = allInfos.get(i);
                for (int i2 = 0; i2 < list.size(); i2++) {
                    UserInfos userInfos2 = list.get(i2);
                    if (userInfos.getUserId().equals(userInfos2.getUserId())) {
                        list.remove(userInfos2);
                        break;
                    }
                }
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String D(String str, UserInfos userInfos) {
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("data");
            if (jSONObject.getLong("fuid") == Long.parseLong(userInfos.getUserId())) {
                return jSONObject.getString(WebAPI.PARAM_SHARE_INVITE_AVATAR);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<UserInfos> E(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("data");
            ArrayList arrayList = new ArrayList(jSONObject.getInt("total"));
            JSONArray jSONArray = jSONObject.getJSONArray("list");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                UserInfos userInfos = new UserInfos();
                userInfos.setUserId(jSONObject2.getString("fuid"));
                userInfos.setHeight(Integer.valueOf(jSONObject2.getInt("height")));
                userInfos.setGender(Integer.valueOf(jSONObject2.optInt("gender")));
                userInfos.setBirthday(jSONObject2.optString("brithday"));
                userInfos.setName(jSONObject2.getString("nickname"));
                userInfos.setAvatarUrl(jSONObject2.optString(WebAPI.PARAM_SHARE_INVITE_AVATAR));
                userInfos.setWeight(Float.valueOf(Float.parseFloat(jSONObject2.optString("weight", "0"))));
                userInfos.setTargetWeight(Float.valueOf(Float.parseFloat(jSONObject2.optString("targetweight", "0"))));
                userInfos.setAvatarIdOfScale(jSONObject2.optInt(ParamKey.scale_avatar_id));
                userInfos.setMeasureMode(jSONObject2.optInt(ParamKey.measure_mode));
                if (Long.valueOf(userInfos.getUserId()).longValue() == 0) {
                    HMLog.d(a, "Sync UserInfo Id Unknown : " + HMWeightUtils.parserUserInfos(userInfos), new Object[0]);
                } else {
                    arrayList.add(userInfos);
                }
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(List<UserInfos> list) {
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            UserInfos userInfos = list.get(size);
            if (BFCallback.getHMPersonInfo().getUserid().equals(userInfos.getUserId())) {
                list.remove(size);
            } else {
                arrayList.add(new UserScaleInfo(userInfos.getUserId(), userInfos.getAvatarIdOfScale(), userInfos.getMeasureMode()));
                HMLog.v(a, "更新秤体头像和身体分析模式--" + userInfos.getName() + "--avatarId=" + userInfos.getAvatarIdOfScale() + "--mode=" + userInfos.getMeasureMode(), new Object[0]);
                if (HMWeightUtils.isSelf(userInfos.getUserId())) {
                    list.remove(size);
                }
            }
        }
        UserScaleInfoRepository.INSTANCE.getInstance().addUserScaleInfos(arrayList);
    }

    private boolean G(List<UserInfos> list) {
        HMLog.d(a, "start Sync Deleted UserInfos To Server!!", new Object[0]);
        if (list == null || list.isEmpty()) {
            return true;
        }
        SyncResult syncResult = new SyncResult();
        WeightUserInfoApi.syncDeletedUserInfosToServer(L(list), new d(syncResult, list));
        return syncResult.result;
    }

    private boolean H(HMWeightUtils.SyncCallback syncCallback) {
        HMLog.d(a, "Sync UserInfos To Local!!", new Object[0]);
        SyncResult syncResult = new SyncResult();
        WeightUserInfoApi.syncUserInfosToLocal(-1, true, new b(syncResult, syncCallback));
        return syncResult.result;
    }

    private boolean I(List<UserInfos> list) {
        HMLog.d(a, "Sync UserInfos To Server!!", new Object[0]);
        Iterator<UserInfos> it2 = list.iterator();
        boolean z = true;
        while (it2.hasNext()) {
            if (!syncInfoToServer(it2.next())) {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(UserInfos userInfos) {
        updateInfo(userInfos, false);
    }

    private void K(final UserInfos userInfos) {
        Observable.unsafeCreate(new Observable.OnSubscribe() { // from class: j68
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.z(userInfos, (Subscriber) obj);
            }
        }).subscribeOn(Schedulers.io()).subscribe(Actions.empty(), new Action1() { // from class: l68
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                UserInfoManager.B((Throwable) obj);
            }
        });
    }

    private String L(List<UserInfos> list) {
        String string;
        try {
            JSONArray jSONArray = new JSONArray();
            for (UserInfos userInfos : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("fuid", userInfos.getUserId());
                jSONArray.put(jSONObject);
            }
            string = jSONArray.toString();
        } catch (Exception e) {
            e.printStackTrace();
            string = "";
        }
        HMLog.d(a, "Sync Deleted UserInfos : " + string, new Object[0]);
        return string;
    }

    public static UserInfoManager getManager() {
        if (b == null) {
            b = new UserInfoManager();
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o(List<UserInfos> list) {
        try {
            s().insertInTx(list);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            HMLog.i(a, e.toString(), new Object[0]);
            return false;
        }
    }

    private void p(final UserInfos userInfos) {
        Observable.unsafeCreate(new Observable.OnSubscribe() { // from class: k68
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.w(userInfos, (Subscriber) obj);
            }
        }).subscribeOn(Schedulers.io()).subscribe(Actions.empty(), new Action1() { // from class: m68
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                UserInfoManager.y((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(List<UserInfos> list) {
        s().deleteInTx(list);
    }

    private List<UserInfos> r(boolean z) {
        List<UserInfos> list = s().queryBuilder().list();
        if (!z) {
            QueryBuilder<UserInfos> queryBuilder = s().queryBuilder();
            WhereCondition whereConditionGt = UserInfosDao.Properties.Synced.gt(-1);
            org.greenrobot.greendao.Property property = UserInfosDao.Properties.UserId;
            list = queryBuilder.where(whereConditionGt, property.notEq(0L), property.notEq(-3L)).orderAsc(property).list();
        }
        HMLog.d(a, "Get All Infos : " + list.size(), new Object[0]);
        return list;
    }

    private UserInfosDao s() {
        return HMDaoManager.getInstance().getUserInfosDao();
    }

    private List<UserInfos> t() {
        List<UserInfos> list = s().queryBuilder().where(UserInfosDao.Properties.Synced.eq(-1), UserInfosDao.Properties.UserId.notEq(Long.valueOf(Long.valueOf(BFCallback.getHMPersonInfo().getUserid()).longValue()))).list();
        HMLog.d(a, "Get Infos Deleted : " + list.size(), new Object[0]);
        Iterator<UserInfos> it2 = list.iterator();
        while (it2.hasNext()) {
            HMLog.d(a, "Deleted : " + HMWeightUtils.parserUserInfos(it2.next()), new Object[0]);
        }
        return list;
    }

    private List<UserInfos> u() {
        return s().queryBuilder().where(UserInfosDao.Properties.Synced.eq(0), UserInfosDao.Properties.UserId.notEq(-3L)).list();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String v(Exception exc) {
        return "cleanAllInfosLocal exception " + exc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(UserInfos userInfos, Subscriber subscriber) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(userInfos);
        G(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String x(Throwable th) {
        return "请求云端删除家庭成员接口处理失败:  " + th.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void y(final Throwable th) {
        HMLog.warn(a, new Function0() { // from class: i68
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UserInfoManager.x(th);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(UserInfos userInfos, Subscriber subscriber) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(userInfos);
        I(arrayList);
    }

    public boolean addInfo(UserInfos userInfos) {
        userInfos.setSynced(0);
        long jInsertOrReplace = s().insertOrReplace(userInfos);
        K(userInfos);
        return jInsertOrReplace >= 0;
    }

    public void cleanAllInfosLocal() {
        try {
            if (BFCallback.getHMPersonInfo().getUserid() == null) {
                return;
            }
            HMLog.i(a, "Delete All Infos not include currentUser !!", new Object[0]);
            long j = Long.parseLong(BFCallback.getHMPersonInfo().getUserid());
            QueryBuilder<UserInfos> queryBuilder = s().queryBuilder();
            org.greenrobot.greendao.Property property = UserInfosDao.Properties.UserId;
            queryBuilder.where(property.notEq(Long.valueOf(j)), new WhereCondition[0]).buildDelete().executeDeleteWithoutDetachingEntities();
            UserInfos userInfosUnique = s().queryBuilder().where(property.eq(Long.valueOf(j)), new WhereCondition[0]).unique();
            if (userInfosUnique == null) {
                return;
            }
            HMLog.d(a, "currentUser name = " + userInfosUnique.getName(), new Object[0]);
            userInfosUnique.setDownloaded(Boolean.FALSE);
            s().update(userInfosUnique);
        } catch (Exception e) {
            HMLog.error(a, new Function0() { // from class: g68
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UserInfoManager.v(e);
                }
            });
        }
    }

    public void deleteInfoMark(UserInfos userInfos) {
        HMLog.d(a, "Delete Info Mark : " + HMWeightUtils.parserUserInfos(userInfos), new Object[0]);
        userInfos.setSynced(-1);
        J(userInfos);
        p(userInfos);
    }

    public List<UserInfos> getAllInfos() {
        return r(false);
    }

    public int getAllInfosCount() {
        return s().queryBuilder().where(UserInfosDao.Properties.Synced.gt(-1), UserInfosDao.Properties.UserId.notEq(-3L)).list().size();
    }

    public List<UserInfos> getAllInfosNotWithSelf() {
        long jLongValue = Long.valueOf(BFCallback.getHMPersonInfo().getUserid()).longValue();
        QueryBuilder<UserInfos> queryBuilder = s().queryBuilder();
        WhereCondition whereConditionGt = UserInfosDao.Properties.Synced.gt(-1);
        org.greenrobot.greendao.Property property = UserInfosDao.Properties.UserId;
        return queryBuilder.where(whereConditionGt, property.notEq(0L), property.isNotNull(), property.notEq(Long.valueOf(jLongValue)), property.notEq(-3L)).orderAsc(property).list();
    }

    public LiveData<List<UserInfos>> getAllUserInfos() {
        return LiveDataSupportKt.queryByLiveData(new String[]{"USER_INFOS"}, new Function0() { // from class: f68
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.a.getAllInfos();
            }
        });
    }

    public UserInfos getGuest() {
        return getInfo(-3L);
    }

    public UserInfos getInfo(long j) {
        if (j == -1) {
            j = Utils.INSTANCE.toLongValue(BFCallback.getHMPersonInfo().getUserid(), 0L);
        }
        return s().queryBuilder().where(UserInfosDao.Properties.UserId.eq(Long.valueOf(j)), UserInfosDao.Properties.Synced.gt(-1)).unique();
    }

    public UserInfos getSelf() {
        return getInfo(Utils.INSTANCE.toLongValue(BFCallback.getHMPersonInfo().getUserid(), 0L));
    }

    public void setGuest(UserInfos userInfos) {
        if (userInfos != null) {
            userInfos.setUserId(String.valueOf(-3L));
            userInfos.setSynced(1);
            s().insertOrReplace(userInfos);
        }
    }

    public boolean syncInfoToServer(UserInfos userInfos) {
        HMLog.d(a, "Sync UserInfo To Server!!", new Object[0]);
        if (userInfos == null) {
            HMLog.d(a, "user == null", new Object[0]);
            return true;
        }
        if (Long.valueOf(userInfos.getUserId()).longValue() == 0) {
            HMLog.d(a, "user.uid == userinfo.useridunknown", new Object[0]);
            return true;
        }
        SyncResult syncResult = new SyncResult();
        boolean z = TextUtils.isEmpty(userInfos.getAvatarUrl()) && userInfos.getAvatarPath() != null;
        WeightUserInfoApi.syncUserInfoToServer(userInfos, z, new c(syncResult, z, userInfos));
        HMLog.d(a, "return result.result " + syncResult.result, new Object[0]);
        return syncResult.result;
    }

    public boolean syncInfosNeedSyncAndDeletedWithServer() {
        List<UserInfos> listU = u();
        StringBuilder sb = new StringBuilder();
        sb.append("Need Sync UserInfos to Server 1 ,size = ");
        sb.append(listU == null ? 0 : listU.size());
        HMLog.i(a, sb.toString(), new Object[0]);
        boolean zI = true;
        if (listU != null && !listU.isEmpty()) {
            zI = I(listU);
        }
        List<UserInfos> listT = t();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Need Delete UserInfos to Server 2 ,size =");
        sb2.append(listT == null ? 0 : listT.size());
        HMLog.i(a, sb2.toString(), new Object[0]);
        return (listT == null || listT.isEmpty()) ? zI : zI & G(listT);
    }

    public boolean syncInfosWithServer(Context context, HMWeightUtils.SyncCallback syncCallback) {
        boolean z = !BFKeeper.readScaleSyncedUserInfosFromServer();
        HMLog.d(a, "Sync userInfos from server, needSyncFlag = " + z, new Object[0]);
        if (z) {
            return H(new a(context, syncCallback));
        }
        if (syncCallback != null) {
            syncCallback.onSuccess();
        }
        return true;
    }

    public void updateInfo(UserInfos userInfos, boolean z) {
        if (Long.valueOf(userInfos.getUserId()).longValue() != 0) {
            if (z && userInfos.getSynced().intValue() == 1) {
                userInfos.setSynced(0);
            }
            s().update(userInfos);
        }
    }
}
