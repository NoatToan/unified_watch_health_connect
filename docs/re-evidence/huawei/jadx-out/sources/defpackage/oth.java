package defpackage;

import android.content.Context;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginachievement.impl.AchieveObserver;
import com.huawei.pluginachievement.impl.AchieveObserverExpansion;
import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;
import com.huawei.pluginachievement.manager.model.UserAchieveWrapper;
import health.compact.a.CommonUtil;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class oth {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f44693c = new Object();
    private static volatile oth e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile List<AchieveObserver> f44694a = new ArrayList(8);
    private otk d;

    private oth(Context context) {
        this.d = otk.d(context);
    }

    public static oth b(Context context) {
        if (e == null) {
            synchronized (oth.class) {
                if (e == null) {
                    e = new oth(BaseApplication.getContext());
                }
            }
        }
        return e;
    }

    public boolean d(osf osfVar) {
        if (osfVar == null) {
            return false;
        }
        if (!Utils.h()) {
            osfVar.setHuid("1");
        }
        if (CommonUtil.ca()) {
            osfVar.setHuid(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
        }
        LogUtil.d("PLGACHIEVE_AchieveProvider", "insertData() : params =", Integer.valueOf(osfVar.acquireDataType()));
        IAchieveDBMgr iAchieveDBMgrE = this.d.e(osfVar.acquireDataType());
        return (iAchieveDBMgrE == null || iAchieveDBMgrE.insert(osfVar) == -1) ? false : true;
    }

    public boolean c(osf osfVar) {
        if (osfVar == null) {
            LogUtil.j("PLGACHIEVE_AchieveProvider", "deleteData achieveData is null");
            return false;
        }
        IAchieveDBMgr iAchieveDBMgrE = this.d.e(osfVar.acquireDataType());
        if (iAchieveDBMgrE == null) {
            return false;
        }
        if (!Utils.h()) {
            osfVar.setHuid("1");
        }
        return iAchieveDBMgrE.delete(osfVar) != -1;
    }

    public osf c(int i, Map<String, String> map) {
        IAchieveDBMgr iAchieveDBMgrE = this.d.e(i);
        if (iAchieveDBMgrE == null || map == null || map.isEmpty()) {
            return null;
        }
        return iAchieveDBMgrE.query(map);
    }

    public List<osf> d(int i, Map<String, String> map) {
        IAchieveDBMgr iAchieveDBMgrE = this.d.e(i);
        if (iAchieveDBMgrE == null || map == null || map.size() == 0) {
            return Collections.EMPTY_LIST;
        }
        return iAchieveDBMgrE.queryAll(map);
    }

    public boolean e(osf osfVar) {
        IAchieveDBMgr iAchieveDBMgrE;
        if (osfVar == null || (iAchieveDBMgrE = this.d.e(osfVar.acquireDataType())) == null) {
            return false;
        }
        if (!Utils.h()) {
            osfVar.setHuid("1");
        }
        return iAchieveDBMgrE.update(osfVar) != -1;
    }

    public void c(AchieveObserver achieveObserver) {
        synchronized (f44693c) {
            if (achieveObserver != null) {
                if (this.f44694a != null) {
                    LogUtil.a("PLGACHIEVE_AchieveProvider", "addObserver ", Boolean.valueOf(!this.f44694a.contains(achieveObserver)));
                    if (!this.f44694a.contains(achieveObserver)) {
                        e(achieveObserver);
                    }
                    LogUtil.a("PLGACHIEVE_AchieveProvider", "addObserver list ", this.f44694a.toString());
                    return;
                }
            }
            LogUtil.e("PLGACHIEVE_AchieveProvider", "achieveObserver or mObserverList is null ", Boolean.valueOf(this.f44694a == null));
        }
    }

    private void e(AchieveObserver achieveObserver) {
        if (achieveObserver == null || this.f44694a == null) {
            return;
        }
        String name = achieveObserver.getClass().getName();
        if (!name.contains("AchieveServiceObserver")) {
            this.f44694a.add(achieveObserver);
            return;
        }
        String string = this.f44694a.toString();
        LogUtil.a("PLGACHIEVE_AchieveProvider", "addObserver ", Boolean.valueOf(!this.f44694a.contains(achieveObserver)), name);
        if (string.contains(name)) {
            return;
        }
        this.f44694a.add(achieveObserver);
    }

    public void d(AchieveObserver achieveObserver) {
        synchronized (f44693c) {
            if (this.f44694a == null) {
                LogUtil.e("PLGACHIEVE_AchieveProvider", "mObserverList is null!");
            } else {
                this.f44694a.remove(achieveObserver);
            }
        }
    }

    public void d() {
        synchronized (f44693c) {
            if (this.f44694a != null && !this.f44694a.isEmpty()) {
                LogUtil.a("PLGACHIEVE_AchieveProvider", "removeAllObserver mObserverList= ", this.f44694a);
                for (AchieveObserver achieveObserver : new ArrayList(this.f44694a)) {
                    if (achieveObserver != null) {
                        this.f44694a.remove(achieveObserver);
                    }
                }
                return;
            }
            LogUtil.e("PLGACHIEVE_AchieveProvider", "notifyAllObserver, mObserverList is null! ");
        }
    }

    public void d(int i, UserAchieveWrapper userAchieveWrapper) {
        b(i, userAchieveWrapper, false);
    }

    public void b(int i, UserAchieveWrapper userAchieveWrapper) {
        b(i, userAchieveWrapper, true);
    }

    private void b(int i, UserAchieveWrapper userAchieveWrapper, boolean z) {
        ArrayList<AchieveObserver> arrayList = new ArrayList(8);
        synchronized (f44693c) {
            if (njy.e(this.f44694a)) {
                LogUtil.j("PLGACHIEVE_AchieveProvider", "notifyAllObserver, mObserverList is null! ");
                return;
            }
            arrayList.addAll(this.f44694a);
            LogUtil.a("PLGACHIEVE_AchieveProvider", "notifyAllObserver observerList= ", arrayList);
            for (AchieveObserver achieveObserver : arrayList) {
                if (achieveObserver != null) {
                    if (!z) {
                        achieveObserver.onDataChanged(i, userAchieveWrapper);
                    } else if (achieveObserver instanceof AchieveObserverExpansion) {
                        ((AchieveObserverExpansion) achieveObserver).onCloudDataCallback(i, userAchieveWrapper);
                    }
                }
            }
        }
    }
}
