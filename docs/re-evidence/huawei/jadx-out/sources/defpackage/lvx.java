package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.callback.BluetoothDataReceiveCallback;
import com.huawei.datatype.Contact;
import com.huawei.datatype.DeviceCommand;
import com.huawei.datatype.PhoneNumber;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lvx extends HwBaseManager implements BluetoothDataReceiveCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static lvx f40941b;
    private int f;
    private e h;
    private IBaseResponseCallback j;
    private mhs l;
    private lvb o;
    private static final String e = String.valueOf(true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f40942c = new Object();
    private static final Object d = new Object();
    private static String g = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static List<IBaseResponseCallback> f40940a = new ArrayList(1);
    private static int i = 10;

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public boolean onDataMigrate() {
        return true;
    }

    private lvx(Context context) {
        super(context);
        this.f = 0;
        this.j = new IBaseResponseCallback() { // from class: lvx.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                if (obj == null) {
                    obj = "appendToExistData onResult object is null";
                }
                LogUtil.a("HwAddressBookManager", "onResultIntent object:", obj);
            }
        };
        mhs mhsVarA = mhs.a();
        this.l = mhsVarA;
        if (mhsVarA == null) {
            LogUtil.j("HwAddressBookManager", "mHwSwitchSettingManager is null");
        }
        lvb lvbVarE = lvb.e();
        this.o = lvbVarE;
        if (lvbVarE == null) {
            LogUtil.j("HwAddressBookManager", "mHwDeviceConfigManager is null");
        } else {
            lvbVarE.d(3, this);
        }
        this.h = new e(BaseApplication.getContext().getMainLooper());
    }

    public static lvx d() {
        lvx lvxVar;
        synchronized (f40942c) {
            if (f40941b == null) {
                f40941b = new lvx(BaseApplication.getContext());
            }
            lvxVar = f40941b;
        }
        return lvxVar;
    }

    @Override // com.huawei.callback.BluetoothDataReceiveCallback
    public void onDataReceived(int i2, DeviceInfo deviceInfo, byte[] bArr) {
        LogUtil.a("HwAddressBookManager", "onResultIntent object:", bArr != null ? bArr : "appendToExistData onResult object is null");
        if (bArr == null || bArr.length <= 1) {
            LogUtil.j("HwAddressBookManager", "onDataReceived dataInfos is null or dataInfos length less than 1");
        } else {
            b(bArr);
        }
    }

    static class e extends Handler {
        WeakReference<lvx> d;

        private e(lvx lvxVar, Looper looper) {
            super(looper);
            this.d = new WeakReference<>(lvxVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            lvx lvxVar = this.d.get();
            if (lvxVar == null) {
                LogUtil.j("HwAddressBookManager", "handleMessage, hwAddressBookManager is null");
                return;
            }
            LogUtil.a("HwAddressBookManager", "handleMessage message:", Integer.valueOf(message.what));
            if (message.what == 1) {
                lvxVar.c();
            } else {
                LogUtil.j("HwAddressBookManager", "unknown message type");
            }
        }
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 3;
    }

    public static String e() {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        g = accountInfo;
        if (accountInfo == null) {
            g = "";
        }
        return g;
    }

    private List<ByteBuffer> b(List<Contact> list) {
        ByteBuffer byteBufferB;
        ArrayList arrayList = new ArrayList(5);
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 >= list.size()) {
                byteBufferB = ByteBuffer.allocate(5);
                byteBufferB.put((byte) -126);
                byteBufferB.put((byte) 3);
                byteBufferB.put((byte) 3);
                byteBufferB.put((byte) 1);
                byteBufferB.put((byte) (i2 + 1));
            } else {
                byteBufferB = b(i2, list);
            }
            this.f += byteBufferB.array().length;
            arrayList.add(byteBufferB);
        }
        return arrayList;
    }

    private ByteBuffer b(int i2, List<Contact> list) {
        String strA = eeq.a(list.get(i2).getName());
        if (strA.length() > 60) {
            strA = strA.substring(0, 60);
        }
        int length = strA.length() / 2;
        List<PhoneNumber> phoneNumbers = list.get(i2).getPhoneNumbers();
        int iA = a(phoneNumbers);
        int length2 = length + 7 + iA + 2;
        String strA2 = eeq.a(list.get(i2).getNote());
        if (strA2.length() > 60) {
            strA2 = strA2.substring(0, 60);
        }
        if (strA2.length() != 0) {
            length2 += (strA2.length() / 2) + 2;
        }
        if (!"-1".equals(list.get(i2).getIconIndex())) {
            length2 += 3;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
        byteBufferAllocate.put((byte) -126);
        byteBufferAllocate.put(eeq.c(eeq.b(length2 - 2)));
        byteBufferAllocate.put((byte) 3);
        byteBufferAllocate.put(eeq.c(eeq.d(1)));
        int i3 = i2 + 1;
        byteBufferAllocate.put(eeq.c(eeq.d(i3)));
        list.get(i2).setIndex(i3);
        byteBufferAllocate.put((byte) 4);
        byteBufferAllocate.put(eeq.c(eeq.d(strA.length() / 2)));
        byteBufferAllocate.put(eeq.c(strA));
        byteBufferAllocate.put((byte) -123);
        byteBufferAllocate.put(eeq.c(eeq.b(iA)));
        c(phoneNumbers, byteBufferAllocate);
        if (strA2.length() != 0) {
            byteBufferAllocate.put((byte) 9);
            byteBufferAllocate.put(eeq.c(eeq.d(strA2.length() / 2)));
            byteBufferAllocate.put(eeq.c(strA2));
        }
        if (!"-1".equals(list.get(i2).getIconIndex())) {
            byteBufferAllocate.put((byte) -127);
            byteBufferAllocate.put((byte) 1);
            byteBufferAllocate.put((byte) 0);
        }
        return byteBufferAllocate;
    }

    private void c(List<PhoneNumber> list, ByteBuffer byteBuffer) {
        for (PhoneNumber phoneNumber : list) {
            String strA = eeq.a(phoneNumber.getPhoneNumber() != null ? phoneNumber.getPhoneNumber().replaceAll(Constants.LINK, "") : "");
            if (strA.length() > 40) {
                strA = strA.substring(0, 40);
            }
            String strA2 = eeq.a(phoneNumber.getPhoneTag());
            byteBuffer.put((byte) -122);
            byteBuffer.put(eeq.c(eeq.b((strA2.length() / 2) + 2 + (strA.length() / 2) + 2)));
            byteBuffer.put((byte) 7);
            byteBuffer.put(eeq.c(eeq.d(strA2.length() / 2)));
            byteBuffer.put(eeq.c(strA2));
            byteBuffer.put((byte) 8);
            byteBuffer.put(eeq.c(eeq.d(strA.length() / 2)));
            byteBuffer.put(eeq.c(strA));
        }
    }

    private int a(List<PhoneNumber> list) {
        int i2 = 0;
        int length = 0;
        int length2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            String strA = eeq.a(list.get(i3).getPhoneTag());
            String strA2 = eeq.a(list.get(i3).getPhoneNumber() != null ? list.get(i3).getPhoneNumber().replaceAll(Constants.LINK, "") : "");
            if (strA2.length() > 40) {
                strA2 = strA2.substring(0, 40);
            }
            length += (strA.length() / 2) + 2;
            length2 += (strA2.length() / 2) + 2;
            i2 += 2;
        }
        return i2 + length + length2;
    }

    public void c(List<Contact> list, IBaseResponseCallback iBaseResponseCallback, boolean z) {
        String json;
        if (list == null) {
            ReleaseLogUtil.e("DEVMGR_HwAddressBookManager", "setContact contacts is null");
            xjt.a("setContact: contacts is null");
            return;
        }
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.e("DEVMGR_HwAddressBookManager", "setContact responseCallback is null");
            xjt.a("setContact: responseCallback is null");
            return;
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(3);
        deviceCommand.setCommandID(1);
        this.f = 0;
        ReleaseLogUtil.d("DEVMGR_HwAddressBookManager", "setContact() sMaxContactNum :", Integer.valueOf(i));
        List<ByteBuffer> listB = b(list);
        byte[] bArrC = eeq.c(eeq.b(this.f));
        int length = this.f + bArrC.length + 1;
        this.f = length;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.put((byte) -127);
        byteBufferAllocate.put(bArrC);
        Iterator<ByteBuffer> it = listB.iterator();
        while (it.hasNext()) {
            byteBufferAllocate.put(it.next().array());
        }
        deviceCommand.setDataLen(byteBufferAllocate.array().length);
        deviceCommand.setDataContent(byteBufferAllocate.array());
        this.o.c(deviceCommand);
        if (list.size() == 0) {
            json = "";
        } else {
            if (i < list.size()) {
                int i2 = i;
                if (i2 - 1 > 0) {
                    list = list.subList(0, i2);
                }
            }
            LogUtil.a("HwAddressBookManager", "setContact() gsonContacts :", list);
            json = new Gson().toJson(list);
        }
        int iC = c(json);
        ReleaseLogUtil.d("DEVMGR_HwAddressBookManager", "setContact() response :", Integer.valueOf(iC));
        c(iC, z, iBaseResponseCallback);
    }

    private void c(int i2, boolean z, IBaseResponseCallback iBaseResponseCallback) {
        if (z) {
            synchronized (f()) {
                f40940a.add(iBaseResponseCallback);
            }
        } else if (i2 != -1) {
            iBaseResponseCallback.a(0, 100000);
        } else {
            iBaseResponseCallback.a(-1, 103001);
        }
    }

    public void d(IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.e("DEVMGR_HwAddressBookManager", "contactStorageUpdate callback is null");
            xjt.a("contactStorageUpdate: callback is null");
            return;
        }
        String strH = h();
        if ("encrypto".equals(strH)) {
            LogUtil.a("HwAddressBookManager", "contactStorageUpdate no need update");
            iBaseResponseCallback.a(0, null);
        } else {
            if (e.equals(strH)) {
                LogUtil.a("HwAddressBookManager", "contactStorageUpdate not crypto, need update");
                c(getSharedPreference(e()));
                g();
                this.l.setSwitchSettingToLocal("NOT_HAVE_ADDRESS_BOOK_ON_HIHEALTH_FLAG", "encrypto", 10000);
                iBaseResponseCallback.a(0, null);
                return;
            }
            a(iBaseResponseCallback);
        }
    }

    private void a(final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("HwAddressBookManager", "contactStorageUpdate save in hihealth, need update");
        this.l.getSwitchSetting("custom.address_book", new IBaseResponseCallback() { // from class: lvx.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                ReleaseLogUtil.d("DEVMGR_HwAddressBookManager", "COMMAND_ID_CONTACT_NUM_GET getAddressBook err_code :", Integer.valueOf(i2));
                List arrayList = new ArrayList(16);
                if (i2 == 0 && (obj instanceof String)) {
                    try {
                        arrayList = (List) new Gson().fromJson((String) obj, new TypeToken<List<Contact>>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwaddressbookmgr.HwAddressBookManager$2$1
                        }.getType());
                    } catch (JsonSyntaxException unused) {
                        LogUtil.e("HwAddressBookManager", "getAddressBook JsonSyntaxException");
                        xjt.a("getSwitchSetting: JsonSyntaxException");
                        lvx.this.c();
                        iBaseResponseCallback.a(0, null);
                        return;
                    }
                }
                if (arrayList != null && arrayList.size() != 0) {
                    lvx.this.d((List<Contact>) arrayList);
                } else {
                    ReleaseLogUtil.e("DEVMGR_HwAddressBookManager", "getAddressBook contactList is null");
                    lvx.this.l.setSwitchSettingToLocal("NOT_HAVE_ADDRESS_BOOK_ON_HIHEALTH_FLAG", "encrypto", 10000);
                }
                iBaseResponseCallback.a(0, null);
            }
        });
    }

    private String h() {
        String switchSettingFromLocal = this.l.getSwitchSettingFromLocal("NOT_HAVE_ADDRESS_BOOK_ON_HIHEALTH_FLAG", 10000);
        ReleaseLogUtil.d("DEVMGR_HwAddressBookManager", "notHavAddressBookOnHiHealth :", switchSettingFromLocal);
        return switchSettingFromLocal;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<Contact> list) {
        LogUtil.a("HwAddressBookManager", "saveContactAndSendMessage contactList :", list);
        c(new Gson().toJson(list));
        this.h.sendEmptyMessage(1);
    }

    public List<Contact> a() {
        synchronized (d) {
            if (StringUtils.j(e())) {
                List<Contact> listM = m();
                if (!listM.isEmpty()) {
                    ReleaseLogUtil.d("DEVMGR_HwAddressBookManager", "getContact normal cloud size is:", Integer.valueOf(listM.size()));
                    return listM;
                }
                String sharedPreference = getSharedPreference("ADDRESS_BOOK_ENCRYPTO0");
                if (StringUtils.j(sharedPreference)) {
                    ReleaseLogUtil.d("DEVMGR_HwAddressBookManager", "getContact cloud no result, transfer info.noCloudResult length:", Integer.valueOf(sharedPreference.length()));
                    c(sharedPreference);
                    deleteSharedPreference("ADDRESS_BOOK_ENCRYPTO0");
                } else {
                    ReleaseLogUtil.e("DEVMGR_HwAddressBookManager", "getContact noCloudResult is null");
                }
            } else {
                ReleaseLogUtil.e("DEVMGR_HwAddressBookManager", "getContact userId is null.");
            }
            return m();
        }
    }

    private List<Contact> m() {
        String sharedPreference = getSharedPreference("ADDRESS_BOOK_ENCRYPTO" + e());
        if (StringUtils.j(sharedPreference)) {
            try {
                return (List) new Gson().fromJson(sharedPreference, new TypeToken<List<Contact>>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwaddressbookmgr.HwAddressBookManager$3
                }.getType());
            } catch (JsonSyntaxException unused) {
                ReleaseLogUtil.a("DEVMGR_HwAddressBookManager", "handleContact JsonSyntaxException");
                xjt.a("handleContact: JsonSyntaxException");
                return new ArrayList(5);
            }
        }
        ReleaseLogUtil.e("DEVMGR_HwAddressBookManager", "handleContact encryptId is empty");
        return new ArrayList(5);
    }

    public int b() {
        return i;
    }

    private int g() {
        int iDeleteSharedPreference;
        synchronized (this) {
            LogUtil.a("HwAddressBookManager", "deleteNoEncryptContact()");
            iDeleteSharedPreference = deleteSharedPreference(e());
        }
        return iDeleteSharedPreference;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.l.setSwitchSetting("custom.address_book", new Gson().toJson((JsonElement) null), new IBaseResponseCallback() { // from class: lvx.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                lvx.this.l.setSwitchSettingToLocal("NOT_HAVE_ADDRESS_BOOK_ON_HIHEALTH_FLAG", "encrypto", 10000);
            }
        });
    }

    private int c(String str) {
        int sharedPreference;
        synchronized (this) {
            LogUtil.a("HwAddressBookManager", "saveContact() enter");
            sharedPreference = setSharedPreference("ADDRESS_BOOK_ENCRYPTO" + e(), str, new StorageParams(2));
        }
        return sharedPreference;
    }

    private void i() {
        if (this.o == null) {
            ReleaseLogUtil.e("DEVMGR_HwAddressBookManager", "getContactNumber mHwDeviceConfigManager is null");
            xjt.a("getContactNumber: mHwDeviceConfigManager is null");
            return;
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(3);
        deviceCommand.setCommandID(2);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.put((byte) 2);
        byteBufferAllocate.put((byte) 0);
        deviceCommand.setDataLen(byteBufferAllocate.array().length);
        deviceCommand.setDataContent(byteBufferAllocate.array());
        ReleaseLogUtil.d("DEVMGR_HwAddressBookManager", "getContactNumber send command");
        this.o.c(deviceCommand);
    }

    private void b(byte[] bArr) {
        LogUtil.a("HwAddressBookManager", "getResult() :", eeq.e(bArr));
        byte b2 = bArr[1];
        if (b2 != 1) {
            if (b2 == 2) {
                if (bArr.length <= 2) {
                    ReleaseLogUtil.e("DEVMGR_HwAddressBookManager", "getContact num data is error");
                    return;
                } else {
                    a(bArr);
                    return;
                }
            }
            LogUtil.j("HwAddressBookManager", "getResult not switch");
            return;
        }
        int iD = d(bArr);
        int i2 = iD == 100000 ? 0 : -1;
        ReleaseLogUtil.d("DEVMGR_HwAddressBookManager", "contact set errorCode:", Integer.valueOf(i2));
        synchronized (f()) {
            if (f40940a.size() != 0) {
                f40940a.get(0).a(i2, Integer.valueOf(iD));
                f40940a.remove(0);
            }
        }
    }

    private void a(byte[] bArr) {
        if (bArr[2] != 127) {
            String strE = eeq.e(bArr);
            try {
                if (strE.length() >= 10) {
                    i = Integer.parseInt(strE.substring(8, 10), 16);
                }
            } catch (NumberFormatException unused) {
                ReleaseLogUtil.a("DEVMGR_HwAddressBookManager", "sMaxContactNum NumberFormatException");
                xjt.a("getContactMaxNum: sMaxContactNum NumberFormatException");
            }
            ReleaseLogUtil.d("DEVMGR_HwAddressBookManager", "getResult(): sMaxContactNum :", Integer.valueOf(i));
            d(new IBaseResponseCallback() { // from class: lvx.1
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    List<Contact> listA = lvx.this.a();
                    lvx lvxVar = lvx.this;
                    lvxVar.c(listA, lvxVar.j, true);
                }
            });
            return;
        }
        ReleaseLogUtil.e("DEVMGR_HwAddressBookManager", "getContact num data return errorCode");
        xjt.a("getContactMaxNum: return errorCode");
    }

    private int d(byte[] bArr) {
        String strE = eeq.e(bArr);
        try {
            if (strE.length() > 8) {
                return Integer.parseInt(strE.substring(8, strE.length()), 16);
            }
            return 0;
        } catch (NumberFormatException unused) {
            LogUtil.e("HwAddressBookManager", "messageHex.substring(COMMAND_TYPE_ERROR_START, messageHex.length()) NumberFormatException");
            return 0;
        }
    }

    private static List<IBaseResponseCallback> f() {
        List<IBaseResponseCallback> list;
        synchronized (lvx.class) {
            list = f40940a;
        }
        return list;
    }

    public void c(DeviceInfo deviceInfo) {
        a(deviceInfo);
    }

    private void a(DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("DEVMGR_HwAddressBookManager", "autoSendCommand");
        if (d(deviceInfo)) {
            i();
        }
    }

    private boolean d(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            ReleaseLogUtil.d("DEVMGR_HwAddressBookManager", "isContacts deviceInfo is null");
            return false;
        }
        Map<String, DeviceCapability> mapD = lvb.e().d(1, deviceInfo.getDeviceIdentify(), "HwAddressBookManager");
        if (mapD == null || mapD.isEmpty()) {
            ReleaseLogUtil.d("DEVMGR_HwAddressBookManager", "isContacts deviceCapabilityhMap is null or empty");
            return false;
        }
        DeviceCapability deviceCapability = mapD.get(deviceInfo.getDeviceIdentify());
        if (deviceCapability != null && deviceCapability.isContacts()) {
            return true;
        }
        ReleaseLogUtil.d("DEVMGR_HwAddressBookManager", "isContacts device not support contacts");
        return false;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public void onDestroy() {
        super.onDestroy();
        j();
        synchronized (f()) {
            f40940a.clear();
        }
        LogUtil.a("HwAddressBookManager", "onDestroy() finish");
    }

    private static void j() {
        synchronized (f40942c) {
            f40941b = null;
        }
    }
}
