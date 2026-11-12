package com.huawei.ui.homehealth.devicearkui;

import androidx.fragment.app.FragmentActivity;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.ui.homehealth.devicearkui.delegate.DeviceViewDelegate;
import defpackage.dru;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes17.dex */
public enum DeviceDelegateEnum {
    DeviceDisplayDelegate(new DeviceViewDelegateCreate() { // from class: rxa
        @Override // com.huawei.ui.homehealth.devicearkui.DeviceDelegateEnum.DeviceViewDelegateCreate
        public final DeviceViewDelegate create(FragmentActivity fragmentActivity) {
            return new rxl(fragmentActivity);
        }
    }),
    DeviceListDelegate(new DeviceViewDelegateCreate() { // from class: rxb
        @Override // com.huawei.ui.homehealth.devicearkui.DeviceDelegateEnum.DeviceViewDelegateCreate
        public final DeviceViewDelegate create(FragmentActivity fragmentActivity) {
            return new ryd(fragmentActivity);
        }
    }),
    DeviceTipDelegate(new DeviceViewDelegateCreate() { // from class: rxe
        @Override // com.huawei.ui.homehealth.devicearkui.DeviceDelegateEnum.DeviceViewDelegateCreate
        public final DeviceViewDelegate create(FragmentActivity fragmentActivity) {
            return new ryk(fragmentActivity);
        }
    }),
    DeviceMyWatchDelegate(new DeviceViewDelegateCreate() { // from class: rxc
        @Override // com.huawei.ui.homehealth.devicearkui.DeviceDelegateEnum.DeviceViewDelegateCreate
        public final DeviceViewDelegate create(FragmentActivity fragmentActivity) {
            return new ryg(fragmentActivity);
        }
    }),
    DeviceWatchFaceDelegate(new DeviceViewDelegateCreate() { // from class: rxd
        @Override // com.huawei.ui.homehealth.devicearkui.DeviceDelegateEnum.DeviceViewDelegateCreate
        public final DeviceViewDelegate create(FragmentActivity fragmentActivity) {
            return new rys(fragmentActivity);
        }
    }),
    DeviceFunctionalDelegate(new DeviceViewDelegateCreate() { // from class: rxj
        @Override // com.huawei.ui.homehealth.devicearkui.DeviceDelegateEnum.DeviceViewDelegateCreate
        public final DeviceViewDelegate create(FragmentActivity fragmentActivity) {
            return new ryc(fragmentActivity);
        }
    }),
    DeviceFeatureDelegate(new DeviceViewDelegateCreate() { // from class: rxg
        @Override // com.huawei.ui.homehealth.devicearkui.DeviceDelegateEnum.DeviceViewDelegateCreate
        public final DeviceViewDelegate create(FragmentActivity fragmentActivity) {
            return new rxz(fragmentActivity);
        }
    }),
    MacaFunctionalDelegate(new DeviceViewDelegateCreate() { // from class: rxf
        @Override // com.huawei.ui.homehealth.devicearkui.DeviceDelegateEnum.DeviceViewDelegateCreate
        public final DeviceViewDelegate create(FragmentActivity fragmentActivity) {
            return new ryv(fragmentActivity);
        }
    }),
    BoltFunctionalDelegate(new DeviceViewDelegateCreate() { // from class: rxi
        @Override // com.huawei.ui.homehealth.devicearkui.DeviceDelegateEnum.DeviceViewDelegateCreate
        public final DeviceViewDelegate create(FragmentActivity fragmentActivity) {
            return new rxn(fragmentActivity);
        }
    });

    private static final ArrayList<IDeviceViewKind> deviceViewKinds = new ArrayList<IDeviceViewKind>() { // from class: com.huawei.ui.homehealth.devicearkui.DeviceDelegateEnum.2
        {
            add(DeviceDelegateEnum.macaDeviceView());
            add(DeviceDelegateEnum.boltDeviceView());
            add(DeviceDelegateEnum.watchDeviceView());
            add(DeviceDelegateEnum.emptyDeviceView());
        }
    };
    private final DeviceViewDelegateCreate delegateCreate;

    public interface DeviceViewDelegateCreate {
        DeviceViewDelegate create(FragmentActivity fragmentActivity);
    }

    public interface IDeviceViewKind {
        ArrayList<DeviceDelegateEnum> getDeviceView(boolean z);

        boolean isKind(dru druVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IDeviceViewKind macaDeviceView() {
        return new IDeviceViewKind() { // from class: com.huawei.ui.homehealth.devicearkui.DeviceDelegateEnum.3
            @Override // com.huawei.ui.homehealth.devicearkui.DeviceDelegateEnum.IDeviceViewKind
            public boolean isKind(dru druVar) {
                DeviceInfo deviceInfoA = druVar.a();
                return deviceInfoA != null && 275 == deviceInfoA.getProductType();
            }

            @Override // com.huawei.ui.homehealth.devicearkui.DeviceDelegateEnum.IDeviceViewKind
            public ArrayList<DeviceDelegateEnum> getDeviceView(boolean z) {
                ArrayList<DeviceDelegateEnum> arrayList = new ArrayList<>();
                arrayList.add(DeviceDelegateEnum.DeviceDisplayDelegate);
                if (!z) {
                    arrayList.add(DeviceDelegateEnum.DeviceListDelegate);
                }
                arrayList.add(DeviceDelegateEnum.MacaFunctionalDelegate);
                return arrayList;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IDeviceViewKind boltDeviceView() {
        return new IDeviceViewKind() { // from class: com.huawei.ui.homehealth.devicearkui.DeviceDelegateEnum.5
            @Override // com.huawei.ui.homehealth.devicearkui.DeviceDelegateEnum.IDeviceViewKind
            public boolean isKind(dru druVar) {
                DeviceInfo deviceInfoA = druVar.a();
                return deviceInfoA != null && deviceInfoA.getProductType() == 75;
            }

            @Override // com.huawei.ui.homehealth.devicearkui.DeviceDelegateEnum.IDeviceViewKind
            public ArrayList<DeviceDelegateEnum> getDeviceView(boolean z) {
                ArrayList<DeviceDelegateEnum> arrayList = new ArrayList<>();
                arrayList.add(DeviceDelegateEnum.DeviceDisplayDelegate);
                if (!z) {
                    arrayList.add(DeviceDelegateEnum.DeviceListDelegate);
                }
                arrayList.add(DeviceDelegateEnum.BoltFunctionalDelegate);
                return arrayList;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IDeviceViewKind watchDeviceView() {
        return new IDeviceViewKind() { // from class: com.huawei.ui.homehealth.devicearkui.DeviceDelegateEnum.4
            @Override // com.huawei.ui.homehealth.devicearkui.DeviceDelegateEnum.IDeviceViewKind
            public boolean isKind(dru druVar) {
                return druVar.a() != null;
            }

            @Override // com.huawei.ui.homehealth.devicearkui.DeviceDelegateEnum.IDeviceViewKind
            public ArrayList<DeviceDelegateEnum> getDeviceView(boolean z) {
                ArrayList<DeviceDelegateEnum> arrayList = new ArrayList<>();
                arrayList.add(DeviceDelegateEnum.DeviceDisplayDelegate);
                if (!z) {
                    arrayList.add(DeviceDelegateEnum.DeviceListDelegate);
                }
                arrayList.add(DeviceDelegateEnum.DeviceTipDelegate);
                arrayList.add(DeviceDelegateEnum.DeviceMyWatchDelegate);
                arrayList.add(DeviceDelegateEnum.DeviceWatchFaceDelegate);
                arrayList.add(DeviceDelegateEnum.DeviceFunctionalDelegate);
                arrayList.add(DeviceDelegateEnum.DeviceFeatureDelegate);
                return arrayList;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IDeviceViewKind emptyDeviceView() {
        return new IDeviceViewKind() { // from class: com.huawei.ui.homehealth.devicearkui.DeviceDelegateEnum.1
            @Override // com.huawei.ui.homehealth.devicearkui.DeviceDelegateEnum.IDeviceViewKind
            public boolean isKind(dru druVar) {
                return druVar.a() == null && druVar.d() == null;
            }

            @Override // com.huawei.ui.homehealth.devicearkui.DeviceDelegateEnum.IDeviceViewKind
            public ArrayList<DeviceDelegateEnum> getDeviceView(boolean z) {
                ArrayList<DeviceDelegateEnum> arrayList = new ArrayList<>();
                arrayList.add(DeviceDelegateEnum.DeviceDisplayDelegate);
                if (!z) {
                    arrayList.add(DeviceDelegateEnum.DeviceListDelegate);
                }
                return arrayList;
            }
        };
    }

    public static IDeviceViewKind getShowDeviceViewKind(dru druVar) {
        if (druVar == null) {
            return emptyDeviceView();
        }
        for (IDeviceViewKind iDeviceViewKind : deviceViewKinds) {
            if (iDeviceViewKind.isKind(druVar)) {
                return iDeviceViewKind;
            }
        }
        return emptyDeviceView();
    }

    DeviceDelegateEnum(DeviceViewDelegateCreate deviceViewDelegateCreate) {
        this.delegateCreate = deviceViewDelegateCreate;
    }

    public DeviceViewDelegate create(FragmentActivity fragmentActivity) {
        return this.delegateCreate.create(fragmentActivity);
    }
}
