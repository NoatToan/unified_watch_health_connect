package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hihealth.data.type.HiSubscribeType;
import com.huawei.hwlogsmodel.LogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class vci {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f50930c = new Object();
    private static volatile vci e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f50931a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile List<HiSubscribeListener> f50932b;
    private volatile List<Integer> d;

    public static vci d() {
        if (e == null) {
            synchronized (f50930c) {
                if (e == null) {
                    e = new vci();
                }
            }
        }
        return e;
    }

    public void a() {
        synchronized (f50930c) {
            LogUtil.a("BloodSugarSubscribeCenter", "close");
            this.f50931a = false;
        }
    }

    public void d(HiSubscribeListener hiSubscribeListener) {
        synchronized (f50930c) {
            LogUtil.a("BloodSugarSubscribeCenter", "unSubscribe");
            if (this.f50932b == null) {
                LogUtil.a("BloodSugarSubscribeCenter", "mListenerList == null");
                return;
            }
            this.f50932b.remove(hiSubscribeListener);
            if (this.f50932b.isEmpty() && this.d != null) {
                LogUtil.a("BloodSugarSubscribeCenter", "execute unSubscribeHiHealthData");
                HiHealthNativeApi.a(BaseApplication.b()).unSubscribeHiHealthData(this.d, new HiUnSubscribeListener() { // from class: vch
                    @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                    public final void onResult(boolean z) {
                        LogUtil.a("BloodSugarSubscribeCenter", "unSubscribeHiHealthData=", Boolean.valueOf(z));
                    }
                });
                this.f50932b = null;
                this.d = null;
                e = null;
            }
        }
    }

    public void b(HiSubscribeListener hiSubscribeListener) {
        LogUtil.a("BloodSugarSubscribeCenter", "subscribe");
        synchronized (f50930c) {
            LogUtil.a("BloodSugarSubscribeCenter", "execute subscribe");
            if (this.f50932b == null) {
                this.f50932b = new ArrayList(0);
            }
            if (this.d == null) {
                LogUtil.a("BloodSugarSubscribeCenter", "execute subscribe mSuccessList");
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(Integer.valueOf(HiSubscribeType.f12260b));
                arrayList.add(Integer.valueOf(HiSubscribeType.e));
                HiHealthNativeApi.a(BaseApplication.b()).subscribeHiHealthData(arrayList, new e(this));
            }
            this.f50932b.add(hiSubscribeListener);
        }
    }

    static class e implements HiSubscribeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<vci> f50933a;

        e(vci vciVar) {
            this.f50933a = new WeakReference<>(vciVar);
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            vci vciVar = this.f50933a.get();
            if (vciVar == null) {
                LogUtil.j("BloodSugarSubscribeCenter", "subscribeCenter is null");
                return;
            }
            LogUtil.a("BloodSugarSubscribeCenter", "subscribe onResult");
            synchronized (vci.f50930c) {
                if (njy.b(list)) {
                    LogUtil.a("BloodSugarSubscribeCenter", "successList=", list.toString());
                    vciVar.d = list;
                }
                if (list2 != null) {
                    LogUtil.a("BloodSugarSubscribeCenter", "failList=", list2.toString());
                }
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            vci vciVar = this.f50933a.get();
            if (vciVar != null) {
                synchronized (vci.f50930c) {
                    LogUtil.a("BloodSugarSubscribeCenter", "onChange, type=", Integer.valueOf(i), ", changeKey=", str, ", isOpen=", Boolean.valueOf(vciVar.f50931a));
                    if (vciVar.f50931a || !ArkUIXConstants.DELETE.equals(str)) {
                        if (vciVar.f50931a && vciVar.f50932b != null) {
                            LogUtil.a("BloodSugarSubscribeCenter", "for onChange");
                            Iterator it = vciVar.f50932b.iterator();
                            while (it.hasNext()) {
                                ((HiSubscribeListener) it.next()).onChange(i, hiHealthClient, str, hiHealthData, j);
                            }
                        }
                        return;
                    }
                    LogUtil.a("BloodSugarSubscribeCenter", "set mIsOpen = true");
                    vciVar.f50931a = true;
                    return;
                }
            }
            LogUtil.j("BloodSugarSubscribeCenter", "subscribeCenter is null");
        }
    }
}
