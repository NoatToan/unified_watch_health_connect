package com.huami.watch.companion.wearcalling;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.provider.ContactsContract;
import android.telecom.TelecomManager;
import android.telephony.PhoneNumberUtils;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.huami.assistant.model.bean.Update;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.R;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.sync.ble.SyncBlePhoneCallHelper;
import com.huami.watch.companion.wearcalling.CallingWearHelper;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.TransportDataItem;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.AppUtil;
import com.huami.watch.util.DeviceCompatibility;
import com.huami.watch.util.Log;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class CallingWearHelper {
    public static final boolean DEBUG = true;
    public static final String TAG = "CallingWearHelper";
    private static final int j = 0;
    private static final int k = 1;
    private static final int l = 2;
    private static final int m = 3;
    private static final int n = 4;
    private static final int o = 5;
    private static final int p = 6;
    private static int q = -1;
    private static HandlerThread r;
    private Context a;
    private String b;
    private String c;
    private Transporter d;
    private Transporter.DataListener e;
    private int f = 0;
    private Handler g = new a(r.getLooper());
    private boolean h = false;
    private PhoneStateListener i = new b();

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Log.d(CallingWearHelper.TAG, "handleMessage:" + message.what, new Object[0]);
            switch (message.what) {
                case 0:
                    removeMessages(3);
                    CallingWearHelper callingWearHelper = CallingWearHelper.this;
                    callingWearHelper.z(callingWearHelper.b);
                    break;
                case 1:
                    CallingWearHelper.this.c = (String) message.obj;
                    if (TextUtils.isEmpty(CallingWearHelper.this.c)) {
                        CallingWearHelper.this.c = "";
                        CallingWearHelper callingWearHelper2 = CallingWearHelper.this;
                        callingWearHelper2.b = callingWearHelper2.a.getString(R.string.incomming_call_unknown);
                    } else {
                        CallingWearHelper callingWearHelper3 = CallingWearHelper.this;
                        callingWearHelper3.b = CallingWearHelper.x(callingWearHelper3.a, CallingWearHelper.this.c);
                    }
                    sendEmptyMessage(3);
                    break;
                case 2:
                    removeMessages(3);
                    CallingWearHelper callingWearHelper4 = CallingWearHelper.this;
                    callingWearHelper4.y(callingWearHelper4.b);
                    break;
                case 3:
                    CallingWearHelper callingWearHelper5 = CallingWearHelper.this;
                    callingWearHelper5.handleCallingToWear(callingWearHelper5.b);
                    break;
                case 4:
                    CallingWearHelper.this.K();
                    break;
                case 5:
                    CallingWearHelper.this.v();
                    break;
                case 6:
                    CallingWearHelper.this.I();
                    break;
            }
        }
    }

    public class b extends PhoneStateListener {
        public b() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i, String str) {
            super.onCallStateChanged(i, str);
            if (i == 0) {
                Log.f().d(CallingWearHelper.TAG, "用户挂断了 Before Check", new Object[0]);
                if (CallingWearHelper.this.A()) {
                    Log.f().d(CallingWearHelper.TAG, "用户挂断了After Check:", new Object[0]);
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 0;
                    messageObtain.obj = str;
                    CallingWearHelper.this.g.sendMessage(messageObtain);
                    CallingWearHelper.this.H();
                }
            } else if (i == 1) {
                Log.f().d(CallingWearHelper.TAG, "Incoming call, number is empty: " + TextUtils.isEmpty(str), new Object[0]);
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 1;
                messageObtain2.obj = str;
                CallingWearHelper.this.g.sendMessage(messageObtain2);
                CallingWearHelper.this.u();
            } else if (i != 2) {
                Log.f().d(CallingWearHelper.TAG, "unknown state： " + i, new Object[0]);
            } else {
                Log.f().d(CallingWearHelper.TAG, "用户接听了", new Object[0]);
                Message messageObtain3 = Message.obtain();
                messageObtain3.what = 2;
                messageObtain3.obj = str;
                CallingWearHelper.this.g.sendMessage(messageObtain3);
            }
            CallingWearHelper.this.J();
        }
    }

    public class c implements SyncBlePhoneCallHelper.PhoneCallListener {
        public c() {
        }

        @Override // com.huami.watch.companion.sync.ble.SyncBlePhoneCallHelper.PhoneCallListener
        public void onPhoneCallHangUp() {
            CallingWearHelper.this.g.removeMessages(5);
            CallingWearHelper.this.g.sendEmptyMessage(5);
        }

        @Override // com.huami.watch.companion.sync.ble.SyncBlePhoneCallHelper.PhoneCallListener
        public void onPhoneCallIgnore() {
            CallingWearHelper.this.g.removeMessages(4);
            CallingWearHelper.this.g.sendEmptyMessage(4);
        }
    }

    public class d implements Transporter.DataListener {
        public d() {
        }

        @Override // com.huami.watch.transport.Transporter.DataListener
        public void onDataReceived(TransportDataItem transportDataItem) {
            String action = transportDataItem.getAction();
            Log.d(CallingWearHelper.TAG, "now Phone received: " + action, new Object[0]);
            if (TextUtils.equals(action, ModulesDef.ACTION_WEAR_MUTE_PHONE)) {
                CallingWearHelper.this.g.removeMessages(4);
                CallingWearHelper.this.g.sendEmptyMessage(4);
            } else if (TextUtils.equals(action, ModulesDef.ACTION_WEAR_HANG_OFF_PHONE)) {
                CallingWearHelper.this.g.removeMessages(5);
                CallingWearHelper.this.g.sendEmptyMessage(5);
            } else if (TextUtils.equals(action, ModulesDef.ACTION_HEART_BEAT)) {
                Log.v("cltest", "HEART BEAT ON NOW", new Object[0]);
                CallingWearHelper.this.g.removeMessages(6);
                CallingWearHelper.this.g.sendEmptyMessage(6);
            }
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("calling-to-wear");
        r = handlerThread;
        handlerThread.start();
    }

    public CallingWearHelper(Context context) {
        this.a = context;
        doInit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A() {
        return this.f > 0;
    }

    private boolean B() {
        TelephonyManager telephonyManager = (TelephonyManager) this.a.getSystemService("phone");
        if (telephonyManager != null) {
            return telephonyManager.getCallState() == 1;
        }
        HMLog.info(TAG, new Function0() { // from class: wh0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CallingWearHelper.E();
            }
        });
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String C() {
        return "TelephonyManager is null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String D() {
        return "TelephonyManager is null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String E() {
        return "TelephonyManager is null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String F() {
        return "TelephonyManager is null.";
    }

    private void G(String str, DataBundle dataBundle) {
        if (TextUtils.isEmpty(str)) {
            Log.d(TAG, "Want send action null, which NOT allowed!", new Object[0]);
            str = "";
        }
        if (this.d != null) {
            Log.d(TAG, "sending to watch! ACTION: " + str, new Object[0]);
            this.d.send(str, dataBundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        int i = this.f;
        if (i > 0) {
            this.f = i - 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        if (B()) {
            G(ModulesDef.ACTION_HEART_BEAT, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        if (this.h) {
            ((AudioManager) this.a.getSystemService("audio")).setRingerMode(q);
            this.h = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        Log.d(TAG, "Silent Ringer!!", new Object[0]);
        try {
            L(this.a);
            TelephonyManager telephonyManager = (TelephonyManager) this.a.getSystemService("phone");
            if (telephonyManager == null) {
                HMLog.info(TAG, new Function0() { // from class: yh0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CallingWearHelper.F();
                    }
                });
            } else {
                PhoneUtils.getITelephony(telephonyManager).silenceRinger();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void L(Context context) {
        if (this.h) {
            return;
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        q = audioManager.getRingerMode();
        this.h = true;
        audioManager.setRingerMode(0);
        audioManager.setVibrateSetting(0, 0);
        audioManager.setVibrateSetting(1, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        this.f++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        Log.d(TAG, "End Call!!", new Object[0]);
        try {
            TelephonyManager telephonyManager = (TelephonyManager) this.a.getSystemService("phone");
            if (telephonyManager == null) {
                HMLog.info(TAG, new Function0() { // from class: xh0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CallingWearHelper.D();
                    }
                });
            } else {
                PhoneUtils.getITelephony(telephonyManager).endCall();
                J();
            }
        } catch (Throwable th) {
            Log.w(TAG, "endCall exception", th, new Object[0]);
            w();
        }
    }

    private void w() {
        try {
            if (DeviceCompatibility.isO()) {
                TelecomManager telecomManager = (TelecomManager) this.a.getSystemService("telecom");
                Method declaredMethod = TelecomManager.class.getDeclaredMethod("endCall", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(telecomManager, new Object[0]);
            }
        } catch (Exception e) {
            Log.w(TAG, "endCallInternal exception", e, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String x(Context context, String str) {
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"display_name", Update.COLUMN_DATA1}, null, null, null);
                if (cursorQuery == null) {
                    Log.d(TAG, "cursor is null!!!", new Object[0]);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return str;
                }
                Log.d(TAG, "cursor count:" + cursorQuery.getCount(), new Object[0]);
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    if (!TextUtils.isEmpty(string2) && PhoneNumberUtils.compare(string2, str)) {
                        Log.d(TAG, "find contact name success", new Object[0]);
                        cursorQuery.close();
                        return string;
                    }
                }
                cursorQuery.close();
                return str;
            } catch (Exception e) {
                Log.i(TAG, e.getMessage(), new Object[0]);
                if (0 != 0) {
                }
                return str;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(String str) {
        if (DeviceManager.getManager(this.a).isCurrentDeviceBLE()) {
            SyncBlePhoneCallHelper.sendPhoneCallEnd();
            return;
        }
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString(ModulesDef.ACTION_USER_ANSWERED, this.b);
        G(ModulesDef.ACTION_USER_ANSWERED, dataBundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(String str) {
        J();
        if (DeviceManager.getManager(this.a).isCurrentDeviceBLE()) {
            SyncBlePhoneCallHelper.sendPhoneCallEnd();
            return;
        }
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString(ModulesDef.KEY_INCOMMING_CONTACT, this.b);
        G(ModulesDef.ACTION_USER_HANG_OFF_ON_PHONE, dataBundle);
    }

    @SuppressLint({"NewApi"})
    public void doClearUp() {
        J();
        Handler handler = this.g;
        if (handler != null) {
            handler.getLooper().quitSafely();
        }
        Transporter transporter = this.d;
        if (transporter != null) {
            transporter.removeDataListener(this.e);
        }
        this.g = null;
        r = null;
        this.i = null;
        this.e = null;
        this.a = null;
        SyncBlePhoneCallHelper.getHelper().release();
    }

    public void doInit() {
        initDataListener();
        Transporter transporter = Transporter.get(this.a, ModulesDef.MODULE_CALLING_TO_WEAR);
        this.d = transporter;
        transporter.addDataListener(this.e);
        this.d.connectTransportService();
        try {
            TelephonyManager telephonyManager = (TelephonyManager) this.a.getSystemService("phone");
            if (telephonyManager == null) {
                HMLog.info(TAG, new Function0() { // from class: vh0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CallingWearHelper.C();
                    }
                });
            } else {
                telephonyManager.listen(this.i, 32);
                SyncBlePhoneCallHelper.getHelper().listener(new c());
            }
        } catch (Exception e) {
            Log.e(TAG, "TelephonyManagerListenerErr", e, new Object[0]);
        }
    }

    public void handleCallingToWear(String str) {
        if (DeviceManager.getManager(this.a).isCurrentDeviceBLE()) {
            SyncBlePhoneCallHelper.sendPhoneCall(str);
        } else {
            handleCallingToWear(str, false);
        }
    }

    public void initDataListener() {
        this.e = new d();
    }

    public void handleCallingToWear(String str, boolean z) {
        this.b = str;
        if (TextUtils.isEmpty(str)) {
            Log.d(TAG, "null contact name . ", new Object[0]);
            return;
        }
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString(ModulesDef.KEY_INCOMMING_CONTACT, this.b);
        if (z) {
            dataBundle.putString(ModulesDef.KEY_INCOMMING_TELNUM, "");
        } else {
            dataBundle.putString(ModulesDef.KEY_INCOMMING_TELNUM, this.c);
        }
        dataBundle.putInt(ModulesDef.KEY_VERSION_CODE, AppUtil.getVersionCode(this.a));
        dataBundle.putBoolean(ModulesDef.KEY_NOTIFICATION_TEST, z);
        dataBundle.putInt(ModulesDef.KEY_HEART_BEAT_BEGIN_INTERNAL, z ? 10000 : 5000);
        G(ModulesDef.ACTION_INCOMMING_CALL, dataBundle);
    }
}
