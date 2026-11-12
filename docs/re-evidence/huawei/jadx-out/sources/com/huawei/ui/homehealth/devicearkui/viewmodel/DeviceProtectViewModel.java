package com.huawei.ui.homehealth.devicearkui.viewmodel;

import android.text.TextUtils;
import androidx.lifecycle.ViewModel;
import com.huawei.callback.DeviceConnectStateListener;
import com.huawei.callback.DeviceDeleteListener;
import com.huawei.callback.DeviceListUpdateListener;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.outofprocess.mgr.device.CloudDeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.homehealth.devicearkui.viewmodel.DeviceProtectViewModel;
import defpackage.dru;
import defpackage.efl;
import defpackage.lut;
import defpackage.njy;
import defpackage.rdp;
import defpackage.rtk;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes17.dex */
public class DeviceProtectViewModel extends ViewModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set<Integer> f25388c = new HashSet(Arrays.asList(75, 10, 12, 11));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DeviceDeleteListener f25389a;
    private DeviceConnectStateListener e;
    private DeviceListUpdateListener j;
    private final Set<DeviceUpdateCallback> g = Collections.synchronizedSet(new LinkedHashSet());
    private final CopyOnWriteArraySet<DeviceListUpdateCallback> h = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<DeviceConnectStateCallback> f25390b = Collections.synchronizedSet(new LinkedHashSet());
    private final Set<DeviceDeleteListener> d = Collections.synchronizedSet(new LinkedHashSet());

    public interface DeviceConnectStateCallback {
        void onDeviceConnectChanger(dru druVar, int i);
    }

    public interface DeviceListUpdateCallback {
        void onDeviceListUpdate(List<dru> list);
    }

    public interface DeviceUpdateCallback {
        void onTopDeviceUpdate(dru druVar);
    }

    public void a() {
    }

    public void c() {
    }

    public DeviceProtectViewModel() {
        i();
        b();
        j();
    }

    /* JADX INFO: renamed from: com.huawei.ui.homehealth.devicearkui.viewmodel.DeviceProtectViewModel$4, reason: invalid class name */
    public class AnonymousClass4 implements DeviceListUpdateListener {
        AnonymousClass4() {
        }

        @Override // com.huawei.callback.DeviceListUpdateListener
        public void onDeviceListUpdate(List<DeviceInfo> list, List<CloudDeviceInfo> list2) {
            List<dru> listE = e(list, list2);
            lut.a().d(njy.b(listE));
            if (Utils.h() && LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
                LogUtil.a("DeviceProtectViewModel", "registerDeviceListUpdate onDeviceListUpdate isBrowseMode");
                listE = new ArrayList<>();
            }
            DeviceProtectViewModel.this.c(listE);
            DeviceProtectViewModel.this.a(listE);
        }

        private List<dru> e(List<DeviceInfo> list, List<CloudDeviceInfo> list2) {
            final ArrayList arrayList = new ArrayList();
            final ArrayList arrayList2 = new ArrayList();
            final ArrayList arrayList3 = new ArrayList();
            list.forEach(new Consumer() { // from class: sft
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    DeviceProtectViewModel.AnonymousClass4.c(arrayList2, arrayList, arrayList3, (DeviceInfo) obj);
                }
            });
            list2.forEach(new Consumer() { // from class: sfs
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    DeviceProtectViewModel.AnonymousClass4.c(arrayList3, (CloudDeviceInfo) obj);
                }
            });
            final ArrayList<dru> arrayListC = rtk.c();
            arrayList3.addAll(arrayListC);
            arrayList3.addAll((List) efl.b().stream().filter(new Predicate<dru>() { // from class: com.huawei.ui.homehealth.devicearkui.viewmodel.DeviceProtectViewModel.4.1
                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public boolean test(dru druVar) {
                    if (druVar.d() == null) {
                        return false;
                    }
                    String asString = druVar.d().getAsString("mac");
                    if (TextUtils.isEmpty(asString)) {
                        return false;
                    }
                    for (dru druVar2 : arrayListC) {
                        if (druVar2.d() != null && asString.equals(druVar2.d().getAsString("mac"))) {
                            return false;
                        }
                    }
                    return true;
                }
            }).collect(Collectors.toList()));
            Collections.sort(arrayList);
            Collections.sort(arrayList2);
            Collections.sort(arrayList3);
            arrayList3.addAll(0, arrayList2);
            arrayList3.addAll(0, arrayList);
            return arrayList3;
        }

        public static /* synthetic */ void c(List list, List list2, List list3, DeviceInfo deviceInfo) {
            dru druVar = new dru();
            druVar.e(deviceInfo);
            druVar.d(deviceInfo.getLastConnectedTime());
            if (deviceInfo.getDeviceConnectState() == 2) {
                if (rdp.d(deviceInfo.getProductType())) {
                    list.add(druVar);
                    return;
                } else {
                    list2.add(druVar);
                    return;
                }
            }
            list3.add(druVar);
        }

        public static /* synthetic */ void c(List list, CloudDeviceInfo cloudDeviceInfo) {
            dru druVar = new dru();
            druVar.e(cloudDeviceInfo);
            druVar.d(cloudDeviceInfo.getLastConnectedTime());
            list.add(druVar);
        }
    }

    private void i() {
        this.j = new AnonymousClass4();
        lut.a().a(this.j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final List<dru> list) {
        this.h.forEach(new Consumer<DeviceListUpdateCallback>() { // from class: com.huawei.ui.homehealth.devicearkui.viewmodel.DeviceProtectViewModel.5
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void accept(DeviceListUpdateCallback deviceListUpdateCallback) {
                deviceListUpdateCallback.onDeviceListUpdate(list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<dru> list) {
        final dru druVarE = e(list);
        this.g.forEach(new Consumer<DeviceUpdateCallback>() { // from class: com.huawei.ui.homehealth.devicearkui.viewmodel.DeviceProtectViewModel.3
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void accept(DeviceUpdateCallback deviceUpdateCallback) {
                deviceUpdateCallback.onTopDeviceUpdate(druVarE);
            }
        });
    }

    private static dru e(List<dru> list) {
        for (dru druVar : list) {
            if (druVar.a() != null) {
                if (lut.a().b(druVar.a())) {
                    return druVar;
                }
            }
        }
        return null;
    }

    private void b() {
        this.e = new DeviceConnectStateListener() { // from class: com.huawei.ui.homehealth.devicearkui.viewmodel.DeviceProtectViewModel.2
            @Override // com.huawei.callback.DeviceConnectStateListener
            public void onDeviceConnectChange(final DeviceInfo deviceInfo, final int i) {
                DeviceProtectViewModel.this.f25390b.forEach(new Consumer<DeviceConnectStateCallback>() { // from class: com.huawei.ui.homehealth.devicearkui.viewmodel.DeviceProtectViewModel.2.3
                    @Override // java.util.function.Consumer
                    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                    public void accept(DeviceConnectStateCallback deviceConnectStateCallback) {
                        dru druVar = new dru();
                        druVar.e(deviceInfo);
                        deviceConnectStateCallback.onDeviceConnectChanger(druVar, i);
                    }
                });
            }
        };
        lut.a().d(this.e);
    }

    /* JADX INFO: renamed from: com.huawei.ui.homehealth.devicearkui.viewmodel.DeviceProtectViewModel$1, reason: invalid class name */
    public class AnonymousClass1 implements DeviceDeleteListener {
        AnonymousClass1() {
        }

        @Override // com.huawei.callback.DeviceDeleteListener
        public void onDeviceDelete(final DeviceInfo deviceInfo) {
            DeviceProtectViewModel.this.d.forEach(new Consumer() { // from class: sfu
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((DeviceDeleteListener) obj).onDeviceDelete(deviceInfo);
                }
            });
        }
    }

    private void j() {
        this.f25389a = new AnonymousClass1();
        lut.a().d(this.f25389a);
    }

    public void c(DeviceUpdateCallback deviceUpdateCallback) {
        this.g.add(deviceUpdateCallback);
    }

    public void e(DeviceListUpdateCallback deviceListUpdateCallback) {
        this.h.add(deviceListUpdateCallback);
    }

    public void d(DeviceListUpdateCallback deviceListUpdateCallback) {
        this.h.remove(deviceListUpdateCallback);
    }

    public void a(DeviceConnectStateCallback deviceConnectStateCallback) {
        this.f25390b.add(deviceConnectStateCallback);
    }

    public void e() {
        lut.a().d(this.j);
    }

    public void d() {
        lut.a().g();
    }

    public void d(DeviceDeleteListener deviceDeleteListener) {
        this.d.add(deviceDeleteListener);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        lut.a().c(this.j);
        lut.a().b(this.e);
        lut.a().c(this.f25389a);
    }
}
