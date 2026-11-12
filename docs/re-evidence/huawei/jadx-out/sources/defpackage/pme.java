package defpackage;

import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.socialshare.model.socialsharebean.ShareDataInfo;
import com.huawei.hms.common.internal.constant.AuthInternalPickerConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import com.huawei.openalliance.ad.constant.VastAttribute;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginsocialshare.cloud.bean.ContinuesSportCallback;
import com.huawei.pluginsocialshare.cloud.bean.ShareDataCallBack;
import com.huawei.pluginsocialshare.cloud.bean.SportShareDataCallBack;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes15.dex */
public class pme {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f45653a;
    private pmn d;
    private pmc e;

    private pme() {
        this.e = pmc.a();
        this.d = pmn.e();
    }

    static class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final pme f45659c = new pme();
    }

    public static final pme a() {
        return c.f45659c;
    }

    public void d(int i, final ShareDataCallBack shareDataCallBack) {
        this.f45653a = i;
        final pkw pkwVar = new pkw();
        pkwVar.b(Integer.valueOf(i));
        ThreadPoolManager.c().execute(new Runnable() { // from class: pmq
            @Override // java.lang.Runnable
            public final void run() {
                this.d.b(pkwVar, shareDataCallBack);
            }
        });
    }

    /* synthetic */ void b(pkw pkwVar, final ShareDataCallBack shareDataCallBack) {
        pkl.c(pkwVar, new ResultCallback<pkt>() { // from class: pme.2
            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
            }

            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(pkt pktVar) {
                if (pktVar.getResultCode().equals(0)) {
                    pme.this.c(pktVar, pme.this.d(pktVar), shareDataCallBack);
                } else {
                    shareDataCallBack.onFailure(pktVar.getResultCode().intValue(), "server return error.");
                }
            }
        });
    }

    public void e(final int i, final SportShareDataCallBack sportShareDataCallBack) {
        this.f45653a = i;
        ThreadPoolManager.c().execute(new Runnable() { // from class: pml
            @Override // java.lang.Runnable
            public final void run() {
                this.f45671c.d(i, sportShareDataCallBack);
            }
        });
    }

    /* synthetic */ void d(int i, final SportShareDataCallBack sportShareDataCallBack) {
        pkl.c(e(i), new ResultCallback<pku>() { // from class: pme.5
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(pku pkuVar) {
                if (pkuVar.getResultCode().equals(0)) {
                    pme.this.d(pkuVar, pme.this.e(pkuVar), sportShareDataCallBack);
                } else {
                    sportShareDataCallBack.onFailure(pkuVar.getResultCode().intValue(), "server return error.");
                }
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                sportShareDataCallBack.onFailure(-1, "throwable return error.");
            }
        });
    }

    private pkv e(int i) {
        pkv pkvVar = new pkv();
        pkvVar.b(Integer.valueOf(i));
        pkvVar.d("/share/v2/getShareBackgroundImageList");
        pkvVar.e("6");
        pkvVar.e((Integer) 1000);
        return pkvVar;
    }

    public void a(String str, int i, final ContinuesSportCallback continuesSportCallback) {
        this.f45653a = i;
        final HashMap map = new HashMap();
        map.put(BleConstants.SPORT_TYPE, String.valueOf(i));
        map.put(ParsedFieldTag.RECORD_DAY, str);
        map.put("timeZone", TimeZone.getDefault().getDisplayName(false, 0));
        ThreadPoolManager.c().execute(new Runnable() { // from class: pmj
            @Override // java.lang.Runnable
            public final void run() {
                this.f45665a.a(map, continuesSportCallback);
            }
        });
    }

    /* synthetic */ void a(Map map, final ContinuesSportCallback continuesSportCallback) {
        pkl.c(map, new ResultCallback<pkp>() { // from class: pme.4
            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
            }

            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(pkp pkpVar) {
                if (pkpVar.getResultCode().equals(0)) {
                    continuesSportCallback.onSuccess(0, new gyb(pkpVar.d(), pkpVar.e()));
                } else {
                    continuesSportCallback.onFailure(pkpVar.getResultCode().intValue(), "server return error.");
                }
            }
        });
    }

    public void b(int i, final SportShareDataCallBack sportShareDataCallBack) {
        this.f45653a = i;
        final pkx pkxVar = new pkx();
        pkxVar.c(Integer.valueOf(i));
        pkxVar.c("/share/v2/getShareStickerList");
        pkxVar.a("6");
        ThreadPoolManager.c().execute(new Runnable() { // from class: pmp
            @Override // java.lang.Runnable
            public final void run() {
                this.d.d(pkxVar, sportShareDataCallBack);
            }
        });
    }

    /* synthetic */ void d(pkx pkxVar, final SportShareDataCallBack sportShareDataCallBack) {
        pkl.a(pkxVar, new ResultCallback<plb>() { // from class: pme.1
            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
            }

            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(plb plbVar) {
                if (plbVar.getResultCode().equals(0)) {
                    pme.this.d(plbVar, pme.this.e(plbVar), sportShareDataCallBack);
                } else {
                    sportShareDataCallBack.onFailure(plbVar.getResultCode().intValue(), "server return error.");
                }
            }
        });
    }

    private static void e(gyg gygVar) {
        for (ShareDataInfo shareDataInfo : gygVar.e()) {
            if (shareDataInfo instanceof gya) {
                gya gyaVar = (gya) shareDataInfo;
                gyaVar.setType(1);
                gyaVar.setUrl(gyaVar.d());
                gyaVar.setImageSize(gyaVar.a());
                gyaVar.setPath(pld.f45585a + File.separator + a(shareDataInfo.getUrl()));
            }
        }
        for (ShareDataInfo shareDataInfo2 : gygVar.b()) {
            shareDataInfo2.setType(2);
            shareDataInfo2.setPath(pld.f45587c + File.separator + a(shareDataInfo2.getUrl()));
        }
        c(gygVar.d());
        for (ShareDataInfo shareDataInfo3 : gygVar.c()) {
            shareDataInfo3.setType(4);
            shareDataInfo3.setPath(pld.s + File.separator + a(shareDataInfo3.getUrl()));
        }
    }

    private static void a(gyf gyfVar) {
        for (ShareDataInfo shareDataInfo : gyfVar.e()) {
            if (shareDataInfo instanceof gye) {
                gye gyeVar = (gye) shareDataInfo;
                gyeVar.setType(2);
                gyeVar.setPath(pld.m + File.separator + a(shareDataInfo.getUrl()));
                gyeVar.c(pld.p + File.separator + a(gyeVar.a()));
            }
        }
    }

    private static void b(gyf gyfVar) {
        for (ShareDataInfo shareDataInfo : gyfVar.c()) {
            if (shareDataInfo instanceof gyi) {
                gyi gyiVar = (gyi) shareDataInfo;
                gyiVar.setType(4);
                gyiVar.setPath(pld.l + File.separator + a(shareDataInfo.getUrl()));
            }
        }
    }

    private static void c(List<ShareDataInfo> list) {
        for (ShareDataInfo shareDataInfo : list) {
            if (shareDataInfo instanceof gyj) {
                gyj gyjVar = (gyj) shareDataInfo;
                gyjVar.setType(3);
                String strC = gyjVar.c();
                int iD = gyjVar.d();
                gyjVar.e(gyjVar.getUrl());
                gyjVar.d(gyjVar.getImageSize());
                gyjVar.setUrl(strC);
                gyjVar.setImageSize(iD);
                if (StringUtils.j(gyjVar.c())) {
                    gyjVar.a(pld.v + File.separator + a(gyjVar.c()));
                }
                gyjVar.setPath(pld.v + File.separator + a(gyjVar.getUrl()));
            }
        }
    }

    private static String a(String str) {
        if (StringUtils.g(str)) {
            return "";
        }
        String[] strArrSplit = str.split("\\?")[0].split("/");
        if (strArrSplit.length <= 0) {
            return "";
        }
        return strArrSplit[strArrSplit.length - 1];
    }

    public void e(final int i, ShareDataCallBack shareDataCallBack) {
        try {
            List list = (List) ThreadPoolManager.c().submit(new Callable() { // from class: pmh
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return pkl.c(i, true);
                }
            }).get(3L, TimeUnit.SECONDS);
            gyg gygVar = new gyg();
            if (list != null) {
                gygVar.b().addAll(list);
                shareDataCallBack.onSuccess(0, gygVar);
            } else {
                shareDataCallBack.onFailure(0, AuthInternalPickerConstant.UNKOWN_ERROR);
                LogUtil.e("TAG_ShareDataManager", "getThemeList unknow error");
            }
        } catch (InterruptedException e) {
            e = e;
            shareDataCallBack.onFailure(0, VastAttribute.ERROR);
            LogUtil.e("TAG_ShareDataManager", "getThemeList error :", e.getMessage());
        } catch (ExecutionException e2) {
            e = e2;
            shareDataCallBack.onFailure(0, VastAttribute.ERROR);
            LogUtil.e("TAG_ShareDataManager", "getThemeList error :", e.getMessage());
        } catch (TimeoutException e3) {
            shareDataCallBack.onFailure(0, "timeout error");
            ReleaseLogUtil.a("TAG_ShareDataManager", "getThemeList error :", e3.getMessage());
        }
    }

    public void c(final int i, final ShareDataCallBack shareDataCallBack) {
        this.f45653a = i;
        Callable callable = new Callable() { // from class: pmi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return pkl.c(i, false);
            }
        };
        final pkw pkwVar = new pkw();
        pkwVar.b(Integer.valueOf(i));
        final Future futureSubmit = ThreadPoolManager.c().submit(callable);
        ThreadPoolManager.c().submit(new Callable() { // from class: pmk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f45667a.a(pkwVar, futureSubmit, shareDataCallBack);
            }
        });
    }

    /* synthetic */ Object a(pkw pkwVar, final Future future, final ShareDataCallBack shareDataCallBack) throws Exception {
        pkl.c(pkwVar, new ResultCallback<pkt>() { // from class: pme.3
            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
            }

            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(pkt pktVar) {
                if (pktVar.getResultCode().equals(0)) {
                    gyg gygVarD = pme.this.d(pktVar);
                    try {
                        List list = (List) future.get();
                        if (list != null) {
                            gygVarD.b().addAll(list);
                        }
                        pme.this.c(pktVar, gygVarD, shareDataCallBack);
                        return;
                    } catch (InterruptedException | ExecutionException e) {
                        shareDataCallBack.onFailure(0, VastAttribute.ERROR);
                        LogUtil.e("TAG_ShareDataManager", "getThemeAndHealthList error :", e.getMessage());
                        return;
                    }
                }
                shareDataCallBack.onFailure(pktVar.getResultCode().intValue(), "server return error.");
            }
        });
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(pkt pktVar, gyg gygVar, ShareDataCallBack shareDataCallBack) {
        shareDataCallBack.onSuccess(pktVar.getResultCode().intValue(), gygVar);
        c(2, gygVar);
        c(1, gygVar);
        c(3, gygVar);
        c(4, gygVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(pku pkuVar, gyf gyfVar, SportShareDataCallBack sportShareDataCallBack) {
        LogUtil.a("TAG_ShareDataManager", "handleSportBgResource getTotalCount :", Integer.valueOf(pkuVar.d()));
        sportShareDataCallBack.onSuccess(pkuVar.getResultCode().intValue(), pkuVar.d(), gyfVar);
        b(2, gyfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(plb plbVar, gyf gyfVar, SportShareDataCallBack sportShareDataCallBack) {
        LogUtil.a("TAG_ShareDataManager", "handleSportStickerResource getTotalCount :", Integer.valueOf(plbVar.a()));
        sportShareDataCallBack.onSuccess(plbVar.getResultCode().intValue(), plbVar.a(), gyfVar);
        b(4, gyfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public gyg d(pkt pktVar) {
        gyg gygVar = new gyg();
        gygVar.b(pktVar.b());
        gygVar.c(pktVar.d());
        gygVar.d(pktVar.e());
        gygVar.e(pktVar.a());
        e(gygVar);
        return gygVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public gyf e(pku pkuVar) {
        gyf gyfVar = new gyf();
        gyfVar.a(pkuVar.b());
        a(gyfVar);
        return gyfVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public gyf e(plb plbVar) {
        gyf gyfVar = new gyf();
        gyfVar.e(plbVar.d());
        b(gyfVar);
        return gyfVar;
    }

    public List<ShareDataInfo> d(int i, gyg gygVar) {
        List<ShareDataInfo> listC = gygVar.c(i);
        ArrayList arrayList = new ArrayList();
        for (ShareDataInfo shareDataInfo : listC) {
            if (!(shareDataInfo instanceof plg)) {
                if (e(i, shareDataInfo)) {
                    arrayList.add(shareDataInfo);
                } else {
                    pmc.a().c(this.f45653a, shareDataInfo, shareDataInfo.getType());
                }
            }
        }
        LogUtil.a("TAG_ShareDataManager", "download resource resourceType = ", Integer.valueOf(i), " downloadList.size() = ", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    private void c(int i, gyg gygVar) {
        pmv pmvVarC = this.e.c(this.f45653a);
        if (pmvVarC == null) {
            return;
        }
        List<ShareDataInfo> listC = gygVar.c(i);
        for (ShareDataInfo shareDataInfo : this.e.e(pmvVarC.e(i), i).values()) {
            if (!listC.contains(shareDataInfo)) {
                shareDataInfo.setSportTypes(a(this.f45653a, shareDataInfo.getSportTypes()));
                LogUtil.a("TAG_ShareDataManager", "need delete resource:", shareDataInfo.getPath());
                this.e.b(this.f45653a, shareDataInfo, i);
            }
        }
    }

    public List<ShareDataInfo> c(int i, gyf gyfVar) {
        List<ShareDataInfo> listC = gyfVar.c(i);
        ArrayList arrayList = new ArrayList();
        for (ShareDataInfo shareDataInfo : listC) {
            if (c(i, shareDataInfo)) {
                arrayList.add(shareDataInfo);
            } else {
                pmn.e().e(this.f45653a, shareDataInfo, shareDataInfo.getType());
            }
        }
        LogUtil.a("TAG_ShareDataManager", "getSportDownload download resource resourceType = ", Integer.valueOf(i), " downloadList.size() = ", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    private void b(int i, gyf gyfVar) {
        pmv pmvVarF = this.d.f(this.f45653a);
        if (pmvVarF == null) {
            return;
        }
        List<ShareDataInfo> listC = gyfVar.c(i);
        for (ShareDataInfo shareDataInfo : this.d.c(pmvVarF.e(i), i).values()) {
            if (!listC.contains(shareDataInfo)) {
                shareDataInfo.setSportTypes(a(this.f45653a, shareDataInfo.getSportTypes()));
                LogUtil.a("TAG_ShareDataManager", "need delete resource:", shareDataInfo.getPath());
                this.d.c(this.f45653a, shareDataInfo, i);
            }
        }
    }

    private String a(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            return sb.toString();
        }
        String[] strArrSplit = str.split(",");
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            if (CommonUtil.j(strArrSplit[i2].trim()) != i) {
                if (i2 == strArrSplit.length - 1) {
                    sb.append(strArrSplit[i2]);
                } else {
                    sb.append(strArrSplit[i2]);
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    private boolean e(int i, ShareDataInfo shareDataInfo) {
        ShareDataInfo shareDataInfoA = this.e.a(i, shareDataInfo.getId());
        if (shareDataInfoA == null) {
            LogUtil.e("TAG_ShareDataManager", "local not exist.need download resource:", shareDataInfo.getPath());
            return true;
        }
        if (shareDataInfoA.getModifyTime() >= shareDataInfo.getModifyTime()) {
            return false;
        }
        LogUtil.a("TAG_ShareDataManager", "modify time update.need download resource:", shareDataInfo.getPath());
        return true;
    }

    private boolean c(int i, ShareDataInfo shareDataInfo) {
        ShareDataInfo shareDataInfoE = this.d.e(i, shareDataInfo.getId());
        if (shareDataInfoE == null) {
            LogUtil.e("TAG_ShareDataManager", "local not exist.need download resource:", shareDataInfo.getPath());
            return true;
        }
        if (shareDataInfoE.getModifyTime() >= shareDataInfo.getModifyTime()) {
            return false;
        }
        LogUtil.a("TAG_ShareDataManager", "modify time update.need download resource:", shareDataInfo.getPath());
        return true;
    }
}
