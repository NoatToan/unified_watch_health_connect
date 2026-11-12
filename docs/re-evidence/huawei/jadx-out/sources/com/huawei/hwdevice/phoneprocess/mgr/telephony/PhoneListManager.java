package com.huawei.hwdevice.phoneprocess.mgr.telephony;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.SQLException;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.provider.ContactsContract;
import android.telephony.CallerInfoHW;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.huawei.android.util.NoExtAPIException;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.datatypes.MsgImage;
import com.huawei.hwcommonmodel.datatypes.MsgText;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwdevicemgr.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import defpackage.ecu;
import defpackage.lsa;
import defpackage.ltd;
import defpackage.ncl;
import defpackage.ncp;
import defpackage.ndj;
import defpackage.nfc;
import defpackage.xjt;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class PhoneListManager extends PhoneStateListener {
    private Context j;
    private lsa k;
    private TelephonyManager m;
    private boolean o;
    private ncl p;
    private volatile long q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Uri f17530b = Uri.parse("content://com.android.contacts.app/yellow_page_data");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Uri f17529a = Uri.parse("content://com.android.contacts.app/number_mark");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f17531c = {"name", "number"};
    private static final String[] e = {"android.permission.READ_PHONE_STATE"};
    private static ThreadPoolManager f = ThreadPoolManager.b(5, 5, "PhoneListManager");
    private static boolean h = false;
    private static boolean g = false;
    public static final Map<String, Long> d = new ConcurrentHashMap(0);
    private boolean n = false;
    private boolean l = false;
    private BroadcastReceiver i = new BroadcastReceiver() { // from class: com.huawei.hwdevice.phoneprocess.mgr.telephony.PhoneListManager.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            LogUtil.a("PhoneListManager", "mid ware onReceive: action: ", action);
            if (action == null || !TextUtils.equals(action, "midware_phone_flag")) {
                return;
            }
            PhoneListManager.this.l = intent.getBooleanExtra("phone_flag", false);
            ReleaseLogUtil.d("Notify_PhoneListManager", "mBroadcastReceiver mIsPhoneForbidden: ", Boolean.valueOf(PhoneListManager.this.l));
        }
    };
    private PhoneStateListener r = new PhoneStateListener() { // from class: com.huawei.hwdevice.phoneprocess.mgr.telephony.PhoneListManager.3
        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i, String str) {
            super.onCallStateChanged(i, str);
            ReleaseLogUtil.d("Notify_PhoneListManager", "PhoneStateListener onCallStateChanged state: ", Integer.valueOf(i), ",incomingNumber: ", ncp.e(str));
            PhoneListManager.this.i();
            PhoneListManager.this.e(String.valueOf(i), str);
            if (PhoneListManager.this.p.d()) {
                if (PhoneListManager.this.o && i == 0) {
                    PhoneListManager.this.o = false;
                }
                if (i == 2) {
                    PhoneListManager.this.b(str);
                }
                if (i == 1) {
                    PhoneListManager.this.h(str);
                    return;
                }
                if (i == 2) {
                    PhoneListManager.this.b(13);
                    return;
                } else if (i == 0) {
                    PhoneListManager.this.b(12);
                    return;
                } else {
                    LogUtil.j("PhoneListManager", "PhoneStateListener onCallStateChanged else");
                    return;
                }
            }
            LogUtil.j("PhoneListManager", "PhoneStateListener onCallStateChanged push notification failed: DEVICE_CAPABILITY_INCAPABLE!");
        }
    };
    private final BroadcastReceiver s = new BroadcastReceiver() { // from class: com.huawei.hwdevice.phoneprocess.mgr.telephony.PhoneListManager.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null && "android.intent.action.PHONE_STATE".equals(intent.getAction())) {
                String stringExtra = intent.getStringExtra("state");
                String stringExtra2 = intent.getStringExtra("incoming_number");
                ReleaseLogUtil.d("Notify_PhoneListManager", "BroadcastReceiver onReceive state: ", stringExtra, ",incomingNumber: ", ncp.e(stringExtra2));
                PhoneListManager.this.i();
                PhoneListManager.this.e(stringExtra, stringExtra2);
                if (PhoneListManager.this.p.d()) {
                    if (PhoneListManager.this.o && TelephonyManager.EXTRA_STATE_IDLE.equals(stringExtra)) {
                        PhoneListManager.this.o = false;
                    }
                    if (TelephonyManager.EXTRA_STATE_OFFHOOK.equals(stringExtra)) {
                        PhoneListManager.this.b(stringExtra2);
                    }
                    if (TelephonyManager.EXTRA_STATE_RINGING.equals(stringExtra)) {
                        PhoneListManager.this.h(stringExtra2);
                        return;
                    }
                    if (TelephonyManager.EXTRA_STATE_OFFHOOK.equals(stringExtra)) {
                        PhoneListManager.this.b(13);
                        return;
                    } else if (TelephonyManager.EXTRA_STATE_IDLE.equals(stringExtra)) {
                        PhoneListManager.this.b(12);
                        return;
                    } else {
                        LogUtil.j("PhoneListManager", "BroadcastReceiver onReceive else");
                        return;
                    }
                }
                ReleaseLogUtil.e("Notify_PhoneListManager", "BroadcastReceiver onReceive push notification failed: DEVICE_CAPABILITY_INCAPABLE");
            }
        }
    };
    private final BroadcastReceiver t = new BroadcastReceiver() { // from class: com.huawei.hwdevice.phoneprocess.mgr.telephony.PhoneListManager.4
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                ReleaseLogUtil.e("Notify_PhoneListManager", "mOutCallReceiver intent is null");
                return;
            }
            if ("android.intent.action.NEW_OUTGOING_CALL".equals(intent.getAction())) {
                if (!PhoneListManager.this.p.e()) {
                    ReleaseLogUtil.e("Notify_PhoneListManager", "mOutCallReceiver not support outgoing call");
                    return;
                }
                final String resultData = getResultData();
                try {
                    if (TextUtils.isEmpty(resultData)) {
                        ReleaseLogUtil.d("Notify_PhoneListManager", "mOutCallReceiver getResultData get phoneNumber fail");
                        resultData = intent.getStringExtra("android.intent.extra.PHONE_NUMBER");
                    }
                } catch (Exception unused) {
                    LogUtil.e("PhoneListManager", "mOutCallReceiver get phone number exception");
                    xjt.ae("mOutCallReceiver get phone number exception");
                }
                ReleaseLogUtil.d("Notify_PhoneListManager", "mOutCallReceiver outPhone: ", ncp.e(resultData));
                if (TextUtils.isEmpty(resultData)) {
                    return;
                }
                PhoneListManager.f.execute(new Runnable() { // from class: com.huawei.hwdevice.phoneprocess.mgr.telephony.PhoneListManager.4.1
                    @Override // java.lang.Runnable
                    public void run() throws Throwable {
                        PhoneListManager.this.d(resultData);
                    }
                });
                return;
            }
            ReleaseLogUtil.e("Notify_PhoneListManager", "mOutCallReceiver action not equals");
        }
    };

    public PhoneListManager(Context context) {
        if (context == null) {
            return;
        }
        this.j = context;
        try {
            if (context.getSystemService("phone") instanceof TelephonyManager) {
                this.m = (TelephonyManager) context.getSystemService("phone");
            }
            this.p = ncl.d(context);
        } catch (Exception unused) {
            LogUtil.e("PhoneListManager", "Exception getSystemService");
            xjt.ae("Exception getSystemService");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        f.execute(new Runnable() { // from class: com.huawei.hwdevice.phoneprocess.mgr.telephony.PhoneListManager.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ReleaseLogUtil.d("Notify_PhoneListManager", "print ReadCallLog Permission is ", Boolean.valueOf(ltd.e().e(PhoneListManager.this.j, "android.permission.READ_CALL_LOG")));
                } catch (Exception unused) {
                    LogUtil.e("PhoneListManager", "print ReadCallLog Permission Exception");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, String str2) {
        Long lRemove;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (TextUtils.equals(str, "1") || TextUtils.equals(str, "RINGING")) {
            Map<String, Long> map = d;
            if (map.containsKey(str2)) {
                return;
            }
            map.put(str2, Long.valueOf(SystemClock.elapsedRealtime()));
            return;
        }
        if ((TextUtils.equals(str, "0") || TextUtils.equals(str, "IDLE")) && (lRemove = d.remove(str2)) != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - lRemove.longValue();
            if (jElapsedRealtime < 1000) {
                LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(2);
                linkedHashMap.put("callDelayTime", String.valueOf(jElapsedRealtime));
                linkedHashMap.put("callDelaySystemInfo", ndj.a());
                OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_MESSAGE_PUSH_85070006.value(), linkedHashMap);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) throws Throwable {
        String strE;
        String str2;
        if (this.o) {
            LogUtil.j("PhoneListManager", "doOutgoingCall mIsOutgoing");
            return;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null && defaultAdapter.getState() == 10) {
            LogUtil.j("PhoneListManager", "doOutgoingCall switch not on not need start service");
            return;
        }
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "PhoneListManager");
        if (deviceList == null || deviceList.isEmpty()) {
            LogUtil.j("PhoneListManager", "doOutgoingCall have no device so do not start PhoneService");
            return;
        }
        this.o = true;
        String strJ = j(str);
        if (strJ == null || !strJ.equals(str)) {
            strE = null;
            str2 = null;
        } else {
            String strD = d(this.j, str);
            str2 = strD;
            strE = TextUtils.isEmpty(strD) ? e(this.j, str) : null;
        }
        e(str, strJ, strE, str2, true);
    }

    public void d() {
        if (this.n) {
            return;
        }
        try {
            LogUtil.a("PhoneListManager", "register READ_PHONE_STATE");
            this.n = true;
            if (!e()) {
                LogUtil.a("PhoneListManager", "register READ_PHONE_STATE listen enter");
                this.m.listen(this.r, 32);
            }
            BroadcastManagerUtil.c(this.j, this.s, new IntentFilter("android.intent.action.PHONE_STATE"), LocalBroadcast.f36595c, null);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("midware_phone_flag");
            BroadcastManagerUtil.c(this.j, this.i, intentFilter, LocalBroadcast.f36595c, null);
            BroadcastManagerUtil.c(this.j, this.t, new IntentFilter("android.intent.action.NEW_OUTGOING_CALL"), LocalBroadcast.f36595c, null);
        } catch (Exception unused) {
            LogUtil.e("PhoneListManager", "Exception registerReceiver");
            xjt.ae("Exception registerReceiver");
        }
    }

    private boolean e() {
        return Build.VERSION.SDK_INT >= 33 && !PermissionUtil.b(this.j, new String[]{"android.permission.READ_PHONE_STATE"});
    }

    public void c() {
        if (this.n) {
            try {
                this.n = false;
                ReleaseLogUtil.d("Notify_PhoneListManager", "unregister()");
                if (!e()) {
                    this.m.listen(this.r, 0);
                }
                BroadcastReceiver broadcastReceiver = this.s;
                if (broadcastReceiver != null) {
                    this.j.unregisterReceiver(broadcastReceiver);
                }
                BroadcastReceiver broadcastReceiver2 = this.i;
                if (broadcastReceiver2 != null) {
                    this.j.unregisterReceiver(broadcastReceiver2);
                }
                BroadcastReceiver broadcastReceiver3 = this.t;
                if (broadcastReceiver3 != null) {
                    this.j.unregisterReceiver(broadcastReceiver3);
                }
            } catch (Exception unused) {
                LogUtil.e("PhoneListManager", "Exception unregisterReceiver");
                xjt.ae("Exception unregisterReceiver");
            }
        }
    }

    public void b() {
        try {
            LogUtil.a("PhoneListManager", "refreshRegister()");
            if (!e()) {
                this.m.listen(this.r, 0);
                this.m.listen(this.r, 32);
            }
            this.n = true;
        } catch (Exception unused) {
            LogUtil.e("PhoneListManager", "Exception refreshRegister");
            xjt.ae("Exception refreshRegister");
        }
    }

    private void f(final String str) {
        f.execute(new Runnable() { // from class: com.huawei.hwdevice.phoneprocess.mgr.telephony.PhoneListManager.10
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                PhoneListManager.this.e(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) throws Throwable {
        String strJ;
        String str2;
        String strE;
        String str3;
        if (nfc.i() && nfc.d()) {
            nfc.c(str);
        }
        if (this.l) {
            ReleaseLogUtil.d("Notify_PhoneListManager", "doPhoneRing mIsPhoneForbidden is true, so return");
            return;
        }
        if (h) {
            ReleaseLogUtil.d("Notify_PhoneListManager", "doPhoneRing mIsPhoneRing is true, so return");
            return;
        }
        h = true;
        g = false;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null && defaultAdapter.getState() == 10) {
            ReleaseLogUtil.e("Notify_PhoneListManager", "switch not on, not need start service!");
            return;
        }
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "PhoneListManager");
        if (deviceList == null || deviceList.isEmpty()) {
            ReleaseLogUtil.e("Notify_PhoneListManager", "have no device so do not start PhoneService.");
            return;
        }
        ReleaseLogUtil.e("Notify_PhoneListManager", "doPhoneRing incomingNumber is ", ncp.e(str), ", currentThread is ", Long.valueOf(Thread.currentThread().getId()));
        if (!TextUtils.isEmpty(str)) {
            strJ = j(str);
            if (strJ != null && strJ.equals(str)) {
                String strD = d(this.j, str);
                str2 = strJ;
                str3 = strD;
                strE = TextUtils.isEmpty(strD) ? e(this.j, str) : null;
            }
            e(str, str2, strE, str3, false);
        }
        strJ = str;
        str2 = strJ;
        strE = null;
        str3 = null;
        e(str, str2, strE, str3, false);
    }

    private void e(String str, String str2, String str3, String str4, boolean z) {
        LogUtil.a("PhoneListManager", "handleLinkLayer DeviceProtocol is ", Integer.valueOf(this.p.b()));
        if (this.p.b() == -1) {
            this.p.e(str);
            return;
        }
        this.k = b(str2, str4, str3, str);
        ReleaseLogUtil.d("Notify_PhoneListManager", "handleLinkLayer start NotifySendData to send command");
        if (z) {
            this.k.c(50);
        }
        DeviceCommand deviceCommandD = this.p.d(this.k.e(), true, (List<MsgImage>) this.k.a(), (List<MsgText>) this.k.c(), (String) null);
        if ((this.k.e() == 1 || this.k.e() == 50) && ncp.f() && !CommonUtil.bg()) {
            deviceCommandD = this.p.b(deviceCommandD);
        }
        if (h || z) {
            this.p.b(deviceCommandD, 3);
        } else {
            ReleaseLogUtil.d("Notify_PhoneListManager", "handleLinkLayer not start NotifySendData to send command");
        }
    }

    private lsa b(String str, String str2, String str3, String str4) {
        LogUtil.a("PhoneListManager", "wrapCallStateMsgData(): incomingNumber(): ", ncp.e(str4), " yellowPage: ", Boolean.valueOf(TextUtils.isEmpty(str2)), " markStr: ", Boolean.valueOf(TextUtils.isEmpty(str3)));
        ArrayList arrayList = new ArrayList(16);
        MsgText msgText = new MsgText();
        msgText.setTextType(1);
        msgText.setTextContent(str);
        if (!TextUtils.isEmpty(str2)) {
            MsgText msgText2 = new MsgText();
            msgText2.setTextType(5);
            msgText2.setTextContent(str2);
            arrayList.add(msgText2);
        }
        if (!TextUtils.isEmpty(str3)) {
            MsgText msgText3 = new MsgText();
            msgText3.setTextType(6);
            msgText3.setTextContent(str3);
            arrayList.add(msgText3);
        }
        arrayList.add(msgText);
        if (!TextUtils.isEmpty(str4)) {
            MsgText msgText4 = new MsgText();
            msgText4.setTextType(7);
            msgText4.setTextContent(str4);
            arrayList.add(msgText4);
        }
        return new lsa(1, new ArrayList(16), arrayList, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        ReleaseLogUtil.d("Notify_PhoneListManager", "doPhoneIdleOrOffHook mIsPhoneForbidden: ", Boolean.valueOf(this.l), " mIsPhoneRing: ", Boolean.valueOf(h));
        this.q = System.currentTimeMillis();
        if (this.l) {
            return;
        }
        if (this.p.g()) {
            LogUtil.a("PhoneListManager", "doPhoneIdleOrOffHook msgType:", Integer.valueOf(i), " mIsOffHook:", Boolean.valueOf(g));
            if (h) {
                h = false;
                if (i == 13) {
                    g = true;
                }
                e(i);
                return;
            }
            if (g && i == 12) {
                g = false;
                e(i);
                return;
            }
            return;
        }
        if (h) {
            h = false;
            e(12);
        }
    }

    private void e(int i) {
        ArrayList arrayList = new ArrayList(16);
        MsgText msgText = new MsgText();
        msgText.setTextType(1);
        msgText.setTextContent("");
        arrayList.add(msgText);
        LogUtil.a("PhoneListManager", "sendIdleOrOffHookCommand DeviceProtocol is ", Integer.valueOf(this.p.b()));
        if (this.p.b() == -1) {
            this.p.f();
            return;
        }
        this.p.b(this.p.d(i, false, (List<MsgImage>) null, (List<MsgText>) arrayList, (String) null), 3);
        lsa lsaVar = this.k;
        if (lsaVar == null || lsaVar.b()) {
            return;
        }
        this.k.c(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("PhoneListManager", "clearSubscriptionIdMapOnOffHook incomingNumber is empty");
        } else if (nfc.i()) {
            nfc.d(str);
        }
    }

    private String j(String str) {
        return CommonUtil.bg() ? a(str) : c(str);
    }

    private String c(String str) {
        String string;
        boolean zE = ltd.e().e(this.j, "android.permission.READ_CONTACTS");
        ReleaseLogUtil.d("Notify_PhoneListManager", "getContactDisplayNameByNumber hasPermission: ", Boolean.valueOf(zE), " number: ", ncp.e(str));
        if (zE) {
            try {
                Cursor cursorQuery = this.j.getContentResolver().query(Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(str)), new String[]{"_id", "display_name"}, null, null, null);
                if (cursorQuery == null || cursorQuery.getCount() <= 0) {
                    string = str;
                } else {
                    cursorQuery.moveToNext();
                    string = cursorQuery.getString(cursorQuery.getColumnIndex("display_name"));
                }
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Exception unused) {
                        LogUtil.e("PhoneListManager", "getContactDisplayNameByNumber Exception");
                        xjt.ae("getContactDisplayNameByNumber Exception");
                    }
                }
            } catch (Exception unused2) {
                string = str;
            }
        } else {
            string = str;
        }
        ReleaseLogUtil.d("Notify_PhoneListManager", "getContactDisplayNameByNumber name is equals number:", Boolean.valueOf(TextUtils.equals(str, string)));
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x006b  */
    private String a(String str) {
        String string;
        boolean zE = ltd.e().e(this.j, "android.permission.READ_CONTACTS");
        ReleaseLogUtil.d("Notify_PhoneListManager", "getContactDisplayNameByNumberHw hasPermission: ", Boolean.valueOf(zE), " number: ", ncp.e(str));
        if (!zE) {
            return str;
        }
        try {
            Cursor cursorQuery = this.j.getContentResolver().query(g(str), new String[]{"_id", "display_name"}, null, null, null);
            if (cursorQuery == null || cursorQuery.getCount() <= 0) {
                string = str;
            } else {
                int iB = b(cursorQuery, str);
                ReleaseLogUtil.d("Notify_PhoneListManager", "getContactDisplayNameByNumberHw contactLookup cursor index:  ", Integer.valueOf(iB));
                if (iB >= 0) {
                    cursorQuery.moveToPosition(iB);
                    string = cursorQuery.getString(cursorQuery.getColumnIndex("display_name"));
                } else {
                    string = str;
                }
            }
            if (cursorQuery != null) {
                try {
                    cursorQuery.close();
                } catch (Exception unused) {
                    LogUtil.e("PhoneListManager", "getContactDisplayNameByNumberHw Exception");
                    xjt.ae("getContactDisplayNameByNumberHw Exception");
                }
            }
        } catch (Exception unused2) {
            string = str;
        }
        ReleaseLogUtil.d("Notify_PhoneListManager", "getContactDisplayNameByNumberHw name is equals number:", Boolean.valueOf(TextUtils.equals(str, string)));
        return string;
    }

    private Uri g(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("PhoneListManager", "getContactHwUri number is empty");
            return Uri.EMPTY;
        }
        String strI = i(str);
        Uri.Builder builderBuildUpon = ContactsContract.PhoneLookup.ENTERPRISE_CONTENT_FILTER_URI.buildUpon();
        builderBuildUpon.appendPath(strI);
        builderBuildUpon.appendQueryParameter("sip", "false");
        return builderBuildUpon.build();
    }

    private String i(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 7) {
            LogUtil.e("PhoneListManager", "getLastSevenNumber number is empty or length less than ", 7);
            return str;
        }
        return str.substring(str.length() - 7);
    }

    private static int b(Cursor cursor, String str) {
        if (cursor != null) {
            try {
                if (cursor.getCount() != 0 && !TextUtils.isEmpty(str)) {
                    CallerInfoHW callerInfoHW = CallerInfoHW.getInstance();
                    if (callerInfoHW != null) {
                        return callerInfoHW.getCallerIndex(cursor, str);
                    }
                    return -1;
                }
            } catch (Exception unused) {
                LogUtil.j("PhoneListManager", "getCallerIndex Exception");
                xjt.s("getCallerIndex Exception");
            } catch (NoClassDefFoundError unused2) {
                LogUtil.j("PhoneListManager", "getCallerIndex NoClassDefFoundError");
                xjt.s("getCallerIndex NoClassDefFoundError");
            } catch (NoExtAPIException unused3) {
                LogUtil.j("PhoneListManager", "getCallerIndex NoExtAPIException");
                xjt.s("getCallerIndex NoExtAPIException");
            }
        }
        LogUtil.e("PhoneListManager", "getCallerInfoHW cursor is null or cursor count is 0 or number is empty");
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(final String str) {
        if (!TextUtils.isEmpty(str)) {
            f(str);
        } else if (h) {
            ReleaseLogUtil.e("Notify_PhoneListManager", "ringingIncoming phone was ringing, return");
        } else {
            LogUtil.a("PhoneListManager", "ringingIncoming has no number");
            f.execute(new Runnable() { // from class: com.huawei.hwdevice.phoneprocess.mgr.telephony.PhoneListManager.8
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    try {
                        Thread.sleep(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
                        LogUtil.a("PhoneListManager", "ringingIncoming mOffHookTime is: ", Long.valueOf(PhoneListManager.this.q));
                        if (System.currentTimeMillis() - PhoneListManager.this.q <= 6000) {
                            LogUtil.j("PhoneListManager", "ringingIncoming less than 6000 millis");
                        } else {
                            LogUtil.a("PhoneListManager", "ringingIncoming more than 6000 millis");
                            PhoneListManager.this.e(str);
                        }
                    } catch (InterruptedException unused) {
                        LogUtil.e("PhoneListManager", "ringingIncoming InterruptedException");
                        xjt.ae("ringingIncoming InterruptedException");
                    }
                }
            });
        }
    }

    private static String d(Context context, String str) throws Throwable {
        String str2;
        Throwable th;
        Cursor cursorQuery;
        boolean zCo = CommonUtil.co();
        LogUtil.a("PhoneListManager", "getYellowPagesCursor isUpEmui40: ", Boolean.valueOf(zCo), ",number: ", ncp.e(str));
        Cursor cursor = null;
        string = null;
        string = null;
        String string = null;
        if (!zCo) {
            return null;
        }
        try {
            try {
                cursorQuery = context.getContentResolver().query(f17530b, f17531c, "PHONE_NUMBERS_EQUAL(number,?)", new String[]{str}, null);
                try {
                    if (cursorQuery == null) {
                        LogUtil.j("PhoneListManager", "getYellowPagesCursor cursor is null");
                    } else if (!cursorQuery.moveToFirst()) {
                        LogUtil.j("PhoneListManager", "getYellowPagesCursor cursor.moveToFirst is null");
                    } else {
                        string = cursorQuery.getString(0);
                        LogUtil.a("PhoneListManager", "getYellowPagesCursor numbers: ", ncp.e(cursorQuery.getString(1)), " name is empty: ", Boolean.valueOf(!TextUtils.isEmpty(string)));
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return string;
                } catch (Exception unused) {
                    String str3 = string;
                    cursor = cursorQuery;
                    str2 = str3;
                    LogUtil.e("PhoneListManager", "getYellowPagesCursor Exception cursor");
                    if (CommonUtil.ap()) {
                        xjt.ae("getYellowPagesCursor Exception cursor");
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    return str2;
                } catch (Throwable th2) {
                    th = th2;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                cursorQuery = null;
            }
        } catch (Exception unused2) {
            str2 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0108  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fb, code lost:
    
        if (r5 != null) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String e(Context context, String str) throws Throwable {
        String str2;
        String str3;
        String str4;
        Cursor cursorQuery;
        boolean zCn = CommonUtil.cn();
        LogUtil.a("PhoneListManager", "getNumberMark isUpEmui51: ", Boolean.valueOf(zCn), ",number: ", ncp.e(str));
        Cursor cursor = null;
        strE = null;
        strE = null;
        strE = null;
        strE = null;
        strE = null;
        strE = null;
        strE = null;
        strE = null;
        String strE = null;
        cursor = null;
        cursor = null;
        cursor = null;
        if (zCn) {
            try {
                try {
                    cursorQuery = context.getContentResolver().query(f17529a.buildUpon().appendQueryParameter("number", Uri.encode(str)).appendQueryParameter("call_type", Uri.encode("16")).build(), null, null, null, null);
                    try {
                        if (cursorQuery == null) {
                            LogUtil.j("PhoneListManager", "getNumberMark cursor is null");
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        } else {
                            if (cursorQuery.moveToFirst()) {
                                try {
                                    strE = e(context, cursorQuery);
                                } catch (CursorIndexOutOfBoundsException unused) {
                                    str4 = strE;
                                    cursor = cursorQuery;
                                    LogUtil.e("PhoneListManager", "getNumberMark cursorIndexOutOfBoundsException");
                                    xjt.ae("getNumberMark cursorIndexOutOfBoundsException");
                                    str2 = str4;
                                    if (cursor == null) {
                                        return str2;
                                    }
                                    cursor.close();
                                    return str2;
                                } catch (SQLException unused2) {
                                    str3 = strE;
                                    cursor = cursorQuery;
                                    LogUtil.e("PhoneListManager", "getNumberMark sqlException");
                                    xjt.ae("getNumberMark sqlException");
                                    if (cursor != null) {
                                        str2 = str3;
                                        cursor.close();
                                        return str2;
                                    }
                                    return str3;
                                } catch (SecurityException unused3) {
                                    str3 = strE;
                                    cursor = cursorQuery;
                                    LogUtil.e("PhoneListManager", "getNumberMark securityException");
                                    xjt.ae("getNumberMark securityException");
                                } catch (Exception e2) {
                                    e = e2;
                                    str2 = strE;
                                    cursor = cursorQuery;
                                    LogUtil.e("PhoneListManager", "getNumberMark exception error: ", ExceptionUtils.c(e));
                                    if (CommonUtil.ap()) {
                                        xjt.ae("getNumberMark exception error: " + ExceptionUtils.c(e));
                                    }
                                    if (cursor == null) {
                                        return str2;
                                    }
                                    cursor.close();
                                    return str2;
                                } catch (Throwable th) {
                                    th = th;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    throw th;
                                }
                            }
                            LogUtil.a("PhoneListManager", "getNumberMark numberMark: ", strE);
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return strE;
                        }
                    } catch (CursorIndexOutOfBoundsException unused4) {
                    } catch (SQLException unused5) {
                    } catch (SecurityException unused6) {
                    } catch (Exception e3) {
                        e = e3;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursorQuery = null;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            } catch (CursorIndexOutOfBoundsException unused7) {
                str4 = null;
            } catch (SQLException unused8) {
                str3 = null;
            } catch (SecurityException unused9) {
                str3 = null;
            } catch (Exception e4) {
                e = e4;
                str2 = null;
            } catch (Throwable th4) {
                th = th4;
                cursorQuery = null;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a3  */
    private String e(Context context, Cursor cursor) {
        String string;
        String string2 = cursor.getString(0);
        String string3 = cursor.getString(1);
        String string4 = cursor.getString(2);
        if ("others".equals(string3)) {
            string = string4;
        } else if ("fraud".equals(string3)) {
            string = context.getResources().getString(R.string.number_mark_fraud);
        } else if ("crank".equals(string3)) {
            string = context.getResources().getString(R.string.number_mark_crank);
        } else if ("express".equals(string3)) {
            string = context.getResources().getString(R.string.number_mark_express);
        } else if ("house agent".equals(string3)) {
            string = context.getResources().getString(R.string.number_mark_house_agent);
        } else if ("promote sales".equals(string3)) {
            string = context.getResources().getString(R.string.number_mark_promote_sales);
        } else if ("taxi".equals(string3)) {
            string = context.getResources().getString(R.string.number_mark_taxi);
        } else if ("satelite".equals(string3)) {
            string = context.getResources().getString(R.string.contacts_str_filter_Maritime_Satellite_calls);
        } else {
            string = string4;
        }
        ReleaseLogUtil.d("Notify_PhoneListManager", "getNumberMark classify: ", string3, " phoneNum: ", ncp.e(string2), " phoneName: ", Boolean.valueOf(TextUtils.isEmpty(string4)));
        return string;
    }
}
