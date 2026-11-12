package defpackage;

import android.text.TextUtils;
import com.xiaomi.yrn.env.entity.YRNBundleInfo;
import com.xiaomi.yrn.env.trace.YRNTraceEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class izr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dwr f22262b;
    public final lyr d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22261a = "YRN_YRNV3_SDK";
    public final ConcurrentHashMap<String, Long> c = new ConcurrentHashMap<>();

    public izr(dwr dwrVar, lyr lyrVar) {
        sk1.c(dwrVar);
        sk1.c(lyrVar);
        this.f22262b = dwrVar;
        this.d = lyrVar;
    }

    public static /* synthetic */ void l(our ourVar) {
        if (ourVar == null || ourVar.b() == null) {
            return;
        }
        YRNBundleInfo yRNBundleInfoB = ourVar.b();
        xxr.b(yRNBundleInfoB.getAppName(), yRNBundleInfoB.getModule());
    }

    public final HashMap<String, u1d<Boolean>> d(List<String> list) {
        zxr.a("YRN_YRNV3_SDK", "YRNUpdateStrategy.createRecycleLoadCallbackMap:" + list);
        HashMap<String, u1d<Boolean>> map = new HashMap<>();
        if (list != null && list.size() > 0) {
            for (final String str : list) {
                map.put(str, new u1d() { // from class: fzr
                    @Override // defpackage.u1d
                    public final void onResult(Object obj) {
                        this.f18407a.k(str, (Boolean) obj);
                    }
                });
            }
        }
        return map;
    }

    public void e(fwr fwrVar, our ourVar) {
        if (ourVar == null) {
            if (fwrVar != null) {
                fwrVar.a();
                q(fwrVar);
                return;
            }
            return;
        }
        ourVar.a();
        q(ourVar);
        if (fwrVar != this.f22262b.A()) {
            zxr.a("YRN_YRNV3_SDK", "YRNUpdateStrategy.decrementModuleCount: commonInstanceInfo");
            q(fwrVar);
        }
    }

    public synchronized void f(jxr jxrVar, YRNBundleInfo yRNBundleInfo) {
        try {
            zxr.a("YRN_YRNV3_SDK", "YRNUpdateStrategy.doUpdateStrategyFromNet:");
            if (jxrVar != null && yRNBundleInfo != null && !TextUtils.isEmpty(yRNBundleInfo.getModule()) && (jxrVar.b() == null || !TextUtils.equals(jxrVar.b().getMd5(), yRNBundleInfo.getMd5()))) {
                if (g(yRNBundleInfo)) {
                    int updateStrategy = yRNBundleInfo.getUpdateStrategy();
                    if (updateStrategy != 1) {
                        ezr.c().f(YRNTraceEvent.newEvent(yRNBundleInfo.getAppName(), 33, updateStrategy == 2 ? "开始静默更新" : "开始实时更新", null, yRNBundleInfo));
                    }
                    if (jxrVar instanceof fwr) {
                        if (updateStrategy == 2) {
                            jxrVar.f(true);
                            p((fwr) jxrVar);
                        } else if (updateStrategy == 3) {
                            jxrVar.f(true);
                            p((fwr) jxrVar);
                            i(yRNBundleInfo);
                        }
                    } else if (jxrVar instanceof our) {
                        our ourVar = (our) jxrVar;
                        if (ourVar.i() != null && ourVar.i().hasInstanceCreated() && ourVar.b() != null && !TextUtils.equals(ourVar.b().getMd5(), yRNBundleInfo.getMd5())) {
                            if (updateStrategy == 2) {
                                jxrVar.f(true);
                                if (jxrVar.c() <= 0) {
                                    q(jxrVar);
                                }
                            } else if (updateStrategy == 3) {
                                jxrVar.f(true);
                                if (jxrVar.c() > 0) {
                                    h(yRNBundleInfo);
                                } else {
                                    q(jxrVar);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean g(YRNBundleInfo yRNBundleInfo) {
        if (yRNBundleInfo == null) {
            return false;
        }
        String appName = yRNBundleInfo.getAppName();
        String module = yRNBundleInfo.getModule();
        if (yur.b(this.c.get(module), 300000L)) {
            this.c.put(module, Long.valueOf(System.currentTimeMillis()));
            return true;
        }
        ezr.c().f(YRNTraceEvent.newEvent(appName, -23, "Cool Down No Update Strategy!", null, module));
        return false;
    }

    public final void h(YRNBundleInfo yRNBundleInfo) {
        zxr.a("YRN_YRNV3_SDK", "YRNUpdateStrategy.forceUpdateBusinessInstanceWithBundleInfo:");
        ezr.c().f(YRNTraceEvent.newEvent(yRNBundleInfo.getAppName(), 33, "强制更新业务通道", null, yRNBundleInfo));
        this.f22262b.u(yRNBundleInfo, new u1d() { // from class: hzr
            @Override // defpackage.u1d
            public final void onResult(Object obj) {
                izr.l((our) obj);
            }
        });
    }

    public final void i(YRNBundleInfo yRNBundleInfo) {
        zxr.a("YRN_YRNV3_SDK", "YRNUpdateStrategy.forceUpdateCommonInstanceWithBundleInfo:");
        ezr.c().f(YRNTraceEvent.newEvent(yRNBundleInfo.getAppName(), 33, "强制更新主通道", null, yRNBundleInfo));
        final List<String> listN = this.f22262b.A() != null ? this.f22262b.A().n() : null;
        this.f22262b.w(yRNBundleInfo, new u1d() { // from class: gzr
            @Override // defpackage.u1d
            public final void onResult(Object obj) {
                this.f19511a.m(listN, (fwr) obj);
            }
        });
    }

    public void j(jxr jxrVar) {
        if (jxrVar != null) {
            jxrVar.d();
        }
    }

    public final /* synthetic */ void k(String str, Boolean bool) {
        if (!bool.booleanValue() || this.f22262b.C() == null) {
            return;
        }
        xxr.b(this.f22262b.C().j(), str);
    }

    public final /* synthetic */ void m(List list, fwr fwrVar) {
        if (fwrVar != null) {
            this.f22262b.Y();
            this.d.a(d(list));
        }
    }

    public void n(Exception exc) {
        dwr dwrVar = this.f22262b;
        if (dwrVar == null) {
            return;
        }
        if (dwrVar.C() != null) {
            ezr.c().f(YRNTraceEvent.newEvent(this.f22262b.C().j(), 1100, "meetInstanceErrorNeedReload", null, exc != null ? exc.toString() : ""));
        }
        fwr fwrVarA = this.f22262b.A();
        if (fwrVarA != null && fwrVarA.n() != null && fwrVarA.n().size() > 0) {
            fwrVarA.f(true);
            p(fwrVarA);
            i(fwrVarA.b());
            return;
        }
        this.f22262b.X();
        ArrayList arrayList = new ArrayList();
        if (this.f22262b.C() != null && this.f22262b.C().p() != null) {
            arrayList.add(this.f22262b.C().p().getCommonModuleName());
            if (this.f22262b.C().p().getPreLoadBundle() != null) {
                arrayList.addAll(this.f22262b.C().p().getPreLoadBundle());
            }
        }
        lyr lyrVar = this.d;
        if (lyrVar != null) {
            lyrVar.a(d(arrayList));
        }
    }

    public final void o(our ourVar) {
        zxr.a("YRN_YRNV3_SDK", "YRNUpdateStrategy.removeBizInstanceInfo:");
        if (ourVar == null || ourVar.b() == null || TextUtils.isEmpty(ourVar.b().getModule())) {
            return;
        }
        String module = ourVar.b().getModule();
        fwr fwrVarA = this.f22262b.A();
        if (fwrVarA == null || ourVar != fwrVarA.j(module)) {
            return;
        }
        fwrVarA.s(module);
        this.f22262b.j(module);
    }

    public final void p(fwr fwrVar) {
        zxr.a("YRN_YRNV3_SDK", "YRNUpdateStrategy.tryUnloadCommonInstance:");
        if (fwrVar == null) {
            return;
        }
        if (fwrVar.c() <= 0) {
            q(fwrVar);
            return;
        }
        if (fwrVar.n() == null || fwrVar.n().size() <= 0) {
            return;
        }
        Iterator<String> it = fwrVar.n().iterator();
        while (it.hasNext()) {
            our ourVarJ = fwrVar.j(it.next());
            if (ourVarJ != null) {
                ourVarJ.f(true);
                q(ourVarJ);
            }
        }
    }

    public final void q(jxr jxrVar) {
        zxr.a("YRN_YRNV3_SDK", "YRNUpdateStrategy.unloadInstanceIfNeeded:");
        if (jxrVar == null || jxrVar.c() > 0 || this.f22262b == null || jxrVar.b() == null || this.f22262b.R(jxrVar.b().getModule())) {
            return;
        }
        YRNBundleInfo yRNBundleInfoB = jxrVar.b();
        if (jxrVar instanceof fwr) {
            fwr fwrVar = (fwr) jxrVar;
            if (fwrVar.e()) {
                fwrVar.i();
                return;
            }
            return;
        }
        if (jxrVar instanceof our) {
            our ourVar = (our) jxrVar;
            if (ourVar.e() || !(yRNBundleInfoB == null || yRNBundleInfoB.isResidentMemory())) {
                ourVar.h();
                o(ourVar);
                q(this.f22262b.A());
            }
        }
    }
}
