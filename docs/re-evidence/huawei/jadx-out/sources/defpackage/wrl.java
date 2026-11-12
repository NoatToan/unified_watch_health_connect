package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.media3.common.C;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.health.utils.functionsetcard.FunctionSetBeanHelper;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.health.pluginhealthzone.FamilyHealthZoneApi;
import com.huawei.health.pluginhealthzone.UserInfoCallback;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.healthzone.model.FeedsPostReq;
import com.huawei.ui.main.stories.userprofile.activity.interfaces.PersonalCenterUiApi;
import com.huawei.ui.main.stories.userprofile.card.familycard.beans.FamilyHealthCardInfo;
import com.huawei.utils.FoundationCommonUtil;
import health.compact.a.CommonUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class wrl extends wrc {
    private c f;
    private boolean g;
    private FamilyHealthCardInfo h;
    private ConcurrentHashMap<Long, vof> i;
    private vom k;
    private boolean l;
    private long m;
    private String n;
    private int o;
    private int t;

    public wrl(Context context, PersonalCenterUiApi personalCenterUiApi) {
        super(context, personalCenterUiApi);
        this.o = 4;
        this.g = false;
        this.f = new c();
        this.i = new ConcurrentHashMap<>(3);
        this.h = new FamilyHealthCardInfo();
        this.l = false;
        this.t = 0;
        j();
    }

    @Override // defpackage.wrc, com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public String getCardName() {
        return "MyFamilyHealthCardData";
    }

    private boolean e(List<vnx> list, String str) {
        if (njy.e(list) || TextUtils.isEmpty(str)) {
            return false;
        }
        Iterator<vnx> it = list.iterator();
        while (it.hasNext()) {
            vnv vnvVarB = it.next().b();
            if (vnvVarB != null && "01A".equals(vnvVarB.c()) && str.equals(vnvVarB.e())) {
                return true;
            }
        }
        return false;
    }

    private void j() {
        if (CommonUtil.cl()) {
            LogUtil.j("MyFamilyHealthCardData", "getCommonUsedDevices test version");
            return;
        }
        FamilyHealthZoneApi familyHealthZoneApi = (FamilyHealthZoneApi) Services.d("PluginHealthZone", FamilyHealthZoneApi.class);
        if (familyHealthZoneApi == null) {
            LogUtil.j("MyFamilyHealthCardData", "healthZoneApi is null");
        } else {
            familyHealthZoneApi.getCommonUsedDevices(new IBaseResponseCallback() { // from class: wrn
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f52377c.e(i, obj);
                }
            });
        }
    }

    /* synthetic */ void e(int i, Object obj) {
        if (i != 0) {
            LogUtil.j("MyFamilyHealthCardData", "getCommonUsedDevices failed, errorCode:", Integer.valueOf(i));
            return;
        }
        if (obj instanceof JSONObject) {
            List<vnx> listB = vov.b((JSONObject) obj, "resultData", vnx.class);
            LogUtil.a("MyFamilyHealthCardData", "getCommonUsedDevices list", listB);
            String androidId = FoundationCommonUtil.getAndroidId(this.f52360b);
            if (e(listB, androidId)) {
                return;
            }
            LogUtil.a("MyFamilyHealthCardData", "getCommonUsedDevices currentPhone does not exist");
            gqb gqbVar = new gqb(androidId, "SET", LoginInit.getInstance(this.f52360b).getDeviceId());
            ArrayList arrayList = new ArrayList();
            arrayList.add(gqbVar);
            c(arrayList);
        }
    }

    private void c(List<gqb> list) {
        if (CommonUtil.cl()) {
            LogUtil.j("MyFamilyHealthCardData", "setCommonUsedDevices test version");
            return;
        }
        LogUtil.a("MyFamilyHealthCardData", "setCommonUsedDevices settings:", list);
        FamilyHealthZoneApi familyHealthZoneApi = (FamilyHealthZoneApi) Services.d("PluginHealthZone", FamilyHealthZoneApi.class);
        if (familyHealthZoneApi == null) {
            LogUtil.j("MyFamilyHealthCardData", "healthZoneApi is null");
        } else {
            familyHealthZoneApi.setCommonUsedDevices(list, new IBaseResponseCallback() { // from class: wrm
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    wrl.c(i, obj);
                }
            });
        }
    }

    static /* synthetic */ void c(int i, Object obj) {
        if (i == 0) {
            LogUtil.a("MyFamilyHealthCardData", "setCommonUsedDevices successed.");
        } else {
            LogUtil.j("MyFamilyHealthCardData", "setCommonUsedDevices failed, errorCode:", Integer.valueOf(i));
        }
    }

    @Override // defpackage.wrc
    protected void d() {
        super.d();
        if (this.d) {
            this.f.sendEmptyMessage(4);
        } else {
            c();
            ThreadPoolManager.c().execute(new Runnable() { // from class: wro
                @Override // java.lang.Runnable
                public final void run() {
                    this.f52378b.b();
                }
            });
        }
    }

    /* synthetic */ void b() {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        d(countDownLatch);
        b(countDownLatch);
        try {
            LogUtil.a("MyFamilyHealthCardData", "initData is ", Boolean.valueOf(countDownLatch.await(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException unused) {
            LogUtil.e("MyFamilyHealthCardData", "initData interrupted");
        }
        g();
        h();
    }

    @Override // defpackage.wrc, com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void refreshCardData() {
        d();
    }

    private void d(final CountDownLatch countDownLatch) {
        voq.d(new ICloudOperationResult<vol>() { // from class: wrl.2
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void operationResult(vol volVar, String str, boolean z) {
                LogUtil.d("MyFamilyHealthCardData", "memberInfoDataRsp ", Boolean.valueOf(z));
                if (volVar == null) {
                    LogUtil.j("MyFamilyHealthCardData", "memberInfoDataRsp is null");
                    countDownLatch.countDown();
                    return;
                }
                if (!z) {
                    String strC = voy.c(wrl.this.f52360b);
                    if (!TextUtils.isEmpty(strC) && !strC.equals(LoginInit.getInstance(wrl.this.f52360b).getAccountInfo(1011))) {
                        voy.d(wrl.this.f52360b, new ArrayList(10), "key_health_zone_member_info_list");
                        voy.b(wrl.this.f52360b);
                    }
                } else {
                    List<voo> listC = volVar.c();
                    if (listC == null) {
                        listC = new ArrayList<>(10);
                        LogUtil.j("MyFamilyHealthCardData", "memberInfoList is empty");
                    }
                    LogUtil.a("MyFamilyHealthCardData", "memberInfoList: ", listC);
                    if (!voy.a(wrl.this.f52360b, listC, "key_health_zone_member_info_list")) {
                        LogUtil.d("MyFamilyHealthCardData", "cloud data has been updated ");
                        voy.d(wrl.this.f52360b, listC, "key_health_zone_member_info_list");
                        voy.b(wrl.this.f52360b);
                    }
                }
                countDownLatch.countDown();
            }
        });
    }

    private void d(FeedsPostReq feedsPostReq, final CountDownLatch countDownLatch) {
        if (System.currentTimeMillis() - this.m < 2000) {
            LogUtil.j("MyFamilyHealthCardData", "getFeedsPostData request too often");
            countDownLatch.countDown();
        } else {
            this.m = System.currentTimeMillis();
            voq.e(feedsPostReq, new ICloudOperationResult<vnw>() { // from class: wrl.4
                @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void operationResult(vnw vnwVar, String str, boolean z) {
                    if (vnwVar == null) {
                        LogUtil.j("MyFamilyHealthCardData", "feedsPostRsp is null");
                        countDownLatch.countDown();
                        return;
                    }
                    if (z) {
                        LogUtil.d("MyFamilyHealthCardData", "feedsPostRsp is Success");
                        List<vny> listA = vnwVar.a();
                        if (listA == null) {
                            listA = new ArrayList<>(10);
                            LogUtil.j("MyFamilyHealthCardData", "allFeedsPostDataList is empty");
                        }
                        List listA2 = wrl.this.a(listA);
                        if (listA2.size() <= 0) {
                            wrl.this.g = false;
                        } else {
                            LogUtil.a("MyFamilyHealthCardData", "cloud data has been updated ");
                            String strB = voy.b(wrl.this.f52360b, "key_health_zone_post_data");
                            wrl.this.n = ((vny) listA2.get(0)).e();
                            LogUtil.a("MyFamilyHealthCardData", "lastPostId  = ", strB, "  newPostId  = ", wrl.this.n);
                            if (strB == null || strB.equals(wrl.this.n)) {
                                wrl.this.g = false;
                            } else {
                                wrl.this.g = true;
                            }
                            countDownLatch.countDown();
                            return;
                        }
                    } else {
                        LogUtil.j("MyFamilyHealthCardData", "feeds post callback is failed, errorCode = ", vnwVar.getResultCode());
                    }
                    countDownLatch.countDown();
                }
            });
        }
    }

    private void a(final CountDownLatch countDownLatch) {
        voq.a(new ICloudOperationResult<voi>() { // from class: wrl.3
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void operationResult(voi voiVar, String str, boolean z) {
                if (voiVar == null) {
                    LogUtil.j("MyFamilyHealthCardData", "latestPostIdRsp is null");
                    countDownLatch.countDown();
                    return;
                }
                if (z) {
                    LogUtil.a("MyFamilyHealthCardData", "LatestPostId LatestPostIdRsp is Success");
                    List<vom> listA = voiVar.a();
                    if (listA == null) {
                        listA = new ArrayList<>(10);
                        LogUtil.j("MyFamilyHealthCardData", "LatestPostDataList is empty");
                    }
                    if (listA.size() > 0) {
                        wrl.this.k = listA.get(0);
                        if (wrl.this.k != null) {
                            ReleaseLogUtil.c("MyFamilyHealthCardData", "cloud data has been updated,mMemberPostId is ： ", wrl.this.k.d());
                        }
                    }
                } else {
                    LogUtil.j("MyFamilyHealthCardData", "callback is failed, errorCode = ", voiVar.getResultCode());
                }
                countDownLatch.countDown();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<vny> a(List<vny> list) {
        ArrayList arrayList = new ArrayList();
        for (vny vnyVar : list) {
            if (vnyVar != null && vnyVar.b() == 0) {
                arrayList.add(vnyVar);
            }
        }
        return arrayList;
    }

    private void h() {
        if (this.f == null) {
            LogUtil.j("MyFamilyHealthCardData", "mFamilyHealthHandler is null");
            return;
        }
        this.i.clear();
        this.t = 0;
        List<voh> listC = voy.c(this.f52360b, "key_health_zone_member_info_list");
        ArrayList arrayList = new ArrayList();
        Iterator<voh> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().d()));
        }
        Map<String, Integer> mapE = voy.e(arrayList);
        boolean z = arrayList.contains(MessageConstant.CERTIFICATE) || arrayList.contains("10");
        if (njy.b(listC)) {
            if (voy.d(listC, mapE) && !voy.a()) {
                f();
                return;
            }
            for (voh vohVar : listC) {
                LogUtil.d("MyFamilyHealthCardData", "status = ", Integer.valueOf(vohVar.d()));
                if (vohVar.d() != 40 && vohVar.d() != 4000 && vohVar.d() != 30 && (!z || MessageConstant.CERTIFICATE.equals(String.valueOf(vohVar.d())) || "10".equals(String.valueOf(vohVar.d())))) {
                    a(vohVar.b(), 1);
                }
            }
            return;
        }
        if (njy.e(listC) && !voy.a()) {
            f();
            return;
        }
        this.f.sendEmptyMessage(1);
        this.h.setImageMap(new LinkedHashMap());
        wrk.b(this.h);
        this.f.sendEmptyMessage(4);
    }

    private void f() {
        try {
            a(Long.parseLong(LoginInit.getInstance(this.f52360b).getAccountInfo(1011)), 1);
        } catch (NumberFormatException unused) {
            LogUtil.e("MyFamilyHealthCardData", "NumberFormatException");
        }
    }

    private void g() {
        if (this.f == null) {
            LogUtil.j("MyFamilyHealthCardData", "mFamilyHealthHandler is null");
            return;
        }
        List<voh> listC = voy.c(this.f52360b, "key_health_zone_member_info_list");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (voh vohVar : listC) {
            String strValueOf = String.valueOf(vohVar.d());
            arrayList.add(strValueOf);
            if (b(vohVar)) {
                arrayList2.add(strValueOf);
            }
        }
        LogUtil.a("MyFamilyHealthCardData", "statusList: ", arrayList, ", validNewMemberStatusList: ", arrayList2);
        c(arrayList, arrayList2, listC);
        this.h.setShowType(this.o);
        this.f.sendEmptyMessage(2);
        this.f.sendEmptyMessage(3);
    }

    private void c(List<String> list, List<String> list2, List<voh> list3) {
        this.o = -1;
        this.l = false;
        if (list2.contains(MessageConstant.CERTIFICATE) || list2.contains("10")) {
            LogUtil.a("MyFamilyHealthCardData", "refresh card for new member invitation");
            this.o = 0;
            this.l = true;
            return;
        }
        if (b(this.k)) {
            this.o = 7;
            this.l = true;
            return;
        }
        if (this.g) {
            this.o = 2;
            this.l = true;
            return;
        }
        Map<String, Integer> mapE = voy.e(list);
        if (list3.size() >= 1 && !voy.d(list3, mapE)) {
            this.o = 4;
            this.l = false;
        } else {
            if (list3.size() == 0 || voy.d(list3, mapE)) {
                if (!voy.a()) {
                    this.o = 5;
                } else {
                    this.o = 6;
                }
                this.l = false;
                return;
            }
            LogUtil.j("MyFamilyHealthCardData", "show default");
        }
    }

    private boolean b(voh vohVar) {
        JSONObject jSONObjectB = FunctionSetBeanHelper.e().b();
        if (jSONObjectB == null) {
            return true;
        }
        long jOptLong = jSONObjectB.optLong("enterTime", 0L);
        return jOptLong == 0 || jOptLong <= vohVar.e();
    }

    private void b(CountDownLatch countDownLatch) {
        FeedsPostReq feedsPostReq = new FeedsPostReq();
        feedsPostReq.setDataCursor("");
        feedsPostReq.setPageDirection(0);
        feedsPostReq.setPostLimit(15);
        feedsPostReq.setTmpLang(1);
        a(countDownLatch);
        d(feedsPostReq, countDownLatch);
        boolean z = this.g;
        LogUtil.a("MyFamilyHealthCardData", "newPOST ", Boolean.valueOf(z), "newAbnormalPost ", this.k);
    }

    private void a(long j, int i) {
        if (i == 1) {
            this.i.put(Long.valueOf(j), new vof());
        }
        c(j, i);
    }

    private void c(final long j, final int i) {
        ((FamilyHealthZoneApi) Services.b("PluginHealthZone", FamilyHealthZoneApi.class)).requestFindUserInfo(2, String.valueOf(j), new UserInfoCallback<gqd.c>() { // from class: wrl.1
            @Override // com.huawei.health.pluginhealthzone.UserInfoCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void infoCallback(gqd.c cVar) {
                String strD;
                int i2 = i;
                if (i2 == 1) {
                    if (cVar == null || TextUtils.isEmpty(cVar.c())) {
                        strD = voy.d(wrl.this.f52360b, j);
                    } else {
                        strD = cVar.c();
                    }
                    wrl.this.a(j, strD, i);
                    return;
                }
                if (i2 != 2) {
                    LogUtil.j("MyFamilyHealthCardData", "getUserImageAndNicknameFromSocial infoCallback defult");
                } else if (cVar != null) {
                    wrl.this.a(i2);
                } else {
                    LogUtil.j("MyFamilyHealthCardData", "getWaitUser result is null");
                }
            }

            @Override // com.huawei.health.pluginhealthzone.UserInfoCallback
            public void errorCallback(int i2) {
                LogUtil.j("MyFamilyHealthCardData", "getUserImageAndNicknameFromSocial errorCallback errorCode:", Integer.valueOf(i2));
                int i3 = i;
                if (i3 == 1) {
                    wrl.this.a(j, voy.d(wrl.this.f52360b, j), i);
                } else if (i3 == 2) {
                    wrl.this.a(i3);
                } else {
                    LogUtil.j("MyFamilyHealthCardData", "getUserImageAndNicknameFromSocial errorCallback defult");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j, String str, int i) {
        c cVar;
        this.t++;
        vof vofVar = this.i.get(Long.valueOf(j));
        if (vofVar == null) {
            LogUtil.j("MyFamilyHealthCardData", "updateFollowedImage localHealthZoneImage is null");
            vofVar = new vof();
        }
        vofVar.a(j);
        vofVar.b(str);
        voy.b(this.f52360b, vofVar);
        if (this.t != this.i.size() || (cVar = this.f) == null) {
            return;
        }
        cVar.sendEmptyMessage(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        c cVar = this.f;
        if (cVar != null) {
            cVar.sendEmptyMessage(i);
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void onDestroy() {
        super.onDestroy();
        m();
        LogUtil.d("MyFamilyHealthCardData", "onDestroy");
        this.j = null;
        this.i.clear();
    }

    private void c() {
        LogUtil.d("MyFamilyHealthCardData", "apply card cache");
        this.h = wrk.d();
        this.f.sendEmptyMessage(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (this.d) {
            LogUtil.j("MyFamilyHealthCardData", "saveFamilyHealthCardCache is browser");
            return;
        }
        this.h.setImageMap(this.i);
        this.h.setShowType(this.o);
        wrk.b(this.h);
    }

    static class c extends Handler {
        private WeakReference<wrl> d;

        private c(wrl wrlVar) {
            this.d = new WeakReference<>(wrlVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            final wrl wrlVar = this.d.get();
            if (wrlVar != null) {
                if (wrlVar.j == null) {
                    LogUtil.j("MyFamilyHealthCardData", "mFamilyHealthCardData.mViewHolder is null");
                    return;
                }
                LogUtil.a("MyFamilyHealthCardData", "FamilyHealthHandler msg  == ", Integer.valueOf(message.what));
                boolean z = true;
                if (message.what == 1) {
                    if (!wrlVar.d) {
                        wrlVar.h.setImageMap(wrlVar.i);
                        wrk.b(wrlVar.h);
                        return;
                    } else {
                        LogUtil.j("MyFamilyHealthCardData", "cardData.mFamilyHealthCardInfo is browser");
                        return;
                    }
                }
                if (message.what == 3) {
                    wrlVar.b(wrlVar.l, 9);
                } else if (message.what == 2) {
                    String string = wrlVar.f52360b.getString(wrlVar.d(wrlVar.o));
                    if (string.equals(wrlVar.f52359a.b())) {
                        return;
                    }
                    wrlVar.f52359a.a(string);
                    wrlVar.j.a(wrlVar.f52359a);
                } else if (message.what == 4) {
                    wrlVar.f52359a.a(wrlVar.f52360b.getString(wrlVar.d(wrlVar.d ? 5 : wrlVar.h.getShowType())));
                    if (!wrlVar.d && !wrlVar.f52359a.n()) {
                        z = false;
                    }
                    wrlVar.b(z, 9);
                    wrlVar.j.a(wrlVar.f52359a);
                }
                ThreadPoolManager.c().b("MyFamilyHealthCardData", new Runnable() { // from class: wrl.c.5
                    @Override // java.lang.Runnable
                    public void run() {
                        wrlVar.m();
                    }
                });
                return;
            }
            LogUtil.j("MyFamilyHealthCardData", "cardData is null");
        }
    }

    @Override // defpackage.wrc
    protected void a() {
        if (this.f52359a != null) {
            return;
        }
        this.f52359a = new wre();
        this.f52359a.a(5);
        this.f52359a.b(R.mipmap.img_me_family);
        this.f52359a.d(R.string.IDS_hwh_family_health_zone);
        this.f52359a.a(this.f52360b.getString(d(5)));
        this.f52359a.a(qji.b(new View.OnClickListener() { // from class: wrp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52379a.e(view);
            }
        }, (BaseActivity) this.f52360b, true, ""));
    }

    /* synthetic */ void e(View view) {
        if (qrs.c(500)) {
            LogUtil.a("MyFamilyHealthCardData", "click too fast");
            return;
        }
        if (b(this.k)) {
            voy.b(this.f52360b, qqt.a(this.k, vom.class), "key_health_zone_abnormal_post_data");
        }
        if (this.g) {
            voy.b(this.f52360b, this.n, "key_health_zone_post_data");
            this.g = false;
        }
        LogUtil.a("MyFamilyHealthCardData", "FamilyHealth card clicked");
        i();
    }

    private boolean b(vom vomVar) {
        vom vomVar2;
        if (vomVar == null) {
            LogUtil.j("MyFamilyHealthCardData", "memberPostId is null");
            return false;
        }
        try {
            vomVar2 = (vom) HiJsonUtil.d(voy.b(this.f52360b, "key_health_zone_abnormal_post_data"), vom.class);
        } catch (JsonSyntaxException unused) {
            LogUtil.j("MyFamilyHealthCardData", "MemberPostId fromJson is jsonSyntaxException");
            vomVar2 = null;
        }
        if (vomVar2 == null) {
            LogUtil.j("MyFamilyHealthCardData", "lastMemberPostId is null");
        } else {
            ReleaseLogUtil.c("MyFamilyHealthCardData", "lastAbnormalPostId  = ", vomVar2.d(), "  newAbnormalPostId  = ", vomVar.d());
        }
        return (vomVar2 == null && !TextUtils.isEmpty(vomVar.d())) || !(vomVar2 == null || TextUtils.equals(vomVar2.d(), vomVar.d()));
    }

    private void i() {
        LogUtil.a("MyFamilyHealthCardData", "gotoFamilyHealth enter");
        e();
        ((FamilyHealthZoneApi) Services.d("PluginHealthZone", FamilyHealthZoneApi.class)).gotoFamilyHealth(this.f52360b, nio.a("sIsFirstHealth"));
    }

    void e() {
        HashMap map = new HashMap(1);
        FamilyHealthCardInfo familyHealthCardInfoD = wrk.d();
        if (familyHealthCardInfoD == null) {
            LogUtil.j("MyFamilyHealthCardData", "familyHeathCardinfo is null");
            return;
        }
        map.put("click", 1);
        map.put("type", String.valueOf(familyHealthCardInfoD.getShowType()));
        lmf.d().c(this.f52360b, AnalyticsValue.HEALTH_FAMILY_ZONE_2119070.value(), map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d(int i) {
        LogUtil.a("MyFamilyHealthCardData", "getHealthCardDesc descType = ", Integer.valueOf(i));
        if (i == 0) {
            return R.string.IDS_health_new_members;
        }
        if (i == 2) {
            return R.string.IDS_health_banner_new_developments;
        }
        if (i == 4) {
            return R.string.IDS_health_banner_guard_family;
        }
        if (i == 5) {
            return R.string.IDS_health_invite_members;
        }
        if (i == 6) {
            return R.string.IDS_health_banner_features;
        }
        if (i == 7) {
            return R.string.IDS_health_banner_new_abnormal_notices;
        }
        LogUtil.j("MyFamilyHealthCardData", "getHealthCardDesc default");
        return R.string.IDS_health_banner_features;
    }
}
