package com.huami.watch.wififtp;

import android.content.Context;
import androidx.annotation.Nullable;
import com.huami.tools.log.HMLog;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.TransportDataItem;
import com.huami.watch.transport.Transporter;
import com.huami.watch.wififtp.WatchWifiFtpUtil;
import com.unionpay.tsmservice.data.UniteAppStatus;
import java.util.Random;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* JADX INFO: loaded from: classes17.dex */
public class WatchWifiFtpUtil {
    public static final int FTP_STATE_DISABLE = 1;
    public static final int FTP_STATE_ENABLE = 2;
    public static final int FTP_STATE_UNKNOW = 3;
    public static final int KEY_MGMT = 4;
    public static final int WIFI_AP_STATE_DISABLED = 11;
    public static final int WIFI_AP_STATE_DISABLING = 10;
    public static final int WIFI_AP_STATE_ENABLED = 13;
    public static final int WIFI_AP_STATE_ENABLING = 12;
    public static final int WIFI_AP_STATE_FAILED = 14;
    private static final boolean f = true;
    private static final String g = "WatchWifiFtpUtil";
    private static WatchWifiFtpUtil h;
    private Context a;
    private WatchAPStateListener c;
    private WatchFTPListener e;
    public static String SSID = "huami-" + new Random().nextInt(999999);
    public static String PSWD = "12345678";
    private WatchAPStateListener b = new c();
    private WatchFTPListener d = new d();

    public interface WatchAPStateListener {
        void onAPEnableResult(int i, String str);

        void onAPStateChanged(int i, int i2);
    }

    public interface WatchFTPListener {
        void onFTPServerStateChanged(int i, int i2);

        void onFileDelete(String str);

        void onFileDownload(String str);

        void onFileUpload(String str);
    }

    public class a implements Transporter.DataListener {
        public a() {
        }

        @Override // com.huami.watch.transport.Transporter.DataListener
        public void onDataReceived(TransportDataItem transportDataItem) {
            String action = transportDataItem.getAction();
            if (WifiFtpTransportModule.ACTION_ON_AP_ENABLE_RESULT.equals(action)) {
                DataBundle data = transportDataItem.getData();
                WatchWifiFtpUtil.this.b.onAPEnableResult(data.getInt(WifiFtpTransportModule.KEY_RESULT_CODE_INT), data.getString(WifiFtpTransportModule.KEY_RESULT_DATA_STRING));
                return;
            }
            if (WifiFtpTransportModule.ACTION_ON_AP_STATE_CHANGED.equals(action)) {
                DataBundle data2 = transportDataItem.getData();
                data2.getInt(WifiFtpTransportModule.KEY_STATE_OLD_INT);
                WifiFtpModule.notifyWifiApStateChanged(data2.getInt(WifiFtpTransportModule.KEY_STATE_NEW_INT));
                return;
            }
            if (WifiFtpTransportModule.ACTION_FTP_ON_SERVER_STATE_CHANGED.equals(action)) {
                DataBundle data3 = transportDataItem.getData();
                data3.getInt(WifiFtpTransportModule.KEY_STATE_OLD_INT);
                WifiFtpModule.notifyFtpServerStateChanged(data3.getInt(WifiFtpTransportModule.KEY_STATE_NEW_INT), null, null);
            } else if (WifiFtpTransportModule.ACTION_FTP_ON_FILE_UPLOAD.equals(action)) {
                WatchWifiFtpUtil.this.d.onFileUpload(transportDataItem.getData().getString(WifiFtpTransportModule.KEY_FILE_PATH));
            } else if (WifiFtpTransportModule.ACTION_FTP_ON_FILE_DOWNLOAD.equals(action)) {
                WatchWifiFtpUtil.this.d.onFileDownload(transportDataItem.getData().getString(WifiFtpTransportModule.KEY_FILE_PATH));
            } else if (WifiFtpTransportModule.ACTION_FTP_ON_FILE_DELETE.equals(action)) {
                WatchWifiFtpUtil.this.d.onFileDelete(transportDataItem.getData().getString(WifiFtpTransportModule.KEY_FILE_PATH));
            }
        }
    }

    public class b implements IWifiFtpListener {
        public b() {
        }

        @Override // com.huami.watch.wififtp.IWifiFtpListener
        public void onDeviceConnected() {
        }

        @Override // com.huami.watch.wififtp.IWifiFtpListener
        public void onDeviceDisconnected() {
        }

        @Override // com.huami.watch.wififtp.IWifiFtpListener
        public void onFtpServerStateChanged(int i, String str, String str2) {
            WatchWifiFtpUtil.this.d.onFTPServerStateChanged(0, i);
        }

        @Override // com.huami.watch.wififtp.IWifiFtpListener
        public void onWifiApStateChanged(int i) {
            WatchWifiFtpUtil.this.b.onAPStateChanged(0, i);
        }
    }

    public class c implements WatchAPStateListener {
        public c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String c(Exception exc) {
            return "dispatch onAPEnableResult error: " + exc;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String d(Exception exc) {
            return "dispatch onAPStateChanged error: " + exc;
        }

        @Override // com.huami.watch.wififtp.WatchWifiFtpUtil.WatchAPStateListener
        public void onAPEnableResult(int i, String str) {
            if (WatchWifiFtpUtil.this.c != null) {
                try {
                    WatchWifiFtpUtil.this.c.onAPEnableResult(i, str);
                } catch (Exception e) {
                    HMLog.debug(WatchWifiFtpUtil.g, new Function0() { // from class: com.huami.watch.wififtp.l
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return WatchWifiFtpUtil.c.c(e);
                        }
                    });
                }
            }
        }

        @Override // com.huami.watch.wififtp.WatchWifiFtpUtil.WatchAPStateListener
        public void onAPStateChanged(int i, int i2) {
            if (WatchWifiFtpUtil.this.c != null) {
                try {
                    WatchWifiFtpUtil.this.c.onAPStateChanged(i, i2);
                } catch (Exception e) {
                    HMLog.debug(WatchWifiFtpUtil.g, new Function0() { // from class: com.huami.watch.wififtp.m
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return WatchWifiFtpUtil.c.d(e);
                        }
                    });
                }
            }
        }
    }

    public class d implements WatchFTPListener {
        public d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String e(Exception exc) {
            return "dispatch onFTPServerStateChanged error: " + exc;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String f(Exception exc) {
            return "dispatch onFileDelete error: " + exc;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String g(Exception exc) {
            return "dispatch onFileDownload error: " + exc;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String h(Exception exc) {
            return "dispatch onFileUpload error: " + exc;
        }

        @Override // com.huami.watch.wififtp.WatchWifiFtpUtil.WatchFTPListener
        public void onFTPServerStateChanged(int i, int i2) {
            if (WatchWifiFtpUtil.this.e != null) {
                try {
                    WatchWifiFtpUtil.this.e.onFTPServerStateChanged(i, i2);
                } catch (Exception e) {
                    HMLog.debug(WatchWifiFtpUtil.g, new Function0() { // from class: com.huami.watch.wififtp.p
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return WatchWifiFtpUtil.d.e(e);
                        }
                    });
                }
            }
        }

        @Override // com.huami.watch.wififtp.WatchWifiFtpUtil.WatchFTPListener
        public void onFileDelete(String str) {
            if (WatchWifiFtpUtil.this.e != null) {
                try {
                    WatchWifiFtpUtil.this.e.onFileDelete(str);
                } catch (Exception e) {
                    HMLog.debug(WatchWifiFtpUtil.g, new Function0() { // from class: com.huami.watch.wififtp.n
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return WatchWifiFtpUtil.d.f(e);
                        }
                    });
                }
            }
        }

        @Override // com.huami.watch.wififtp.WatchWifiFtpUtil.WatchFTPListener
        public void onFileDownload(String str) {
            if (WatchWifiFtpUtil.this.e != null) {
                try {
                    WatchWifiFtpUtil.this.e.onFileDownload(str);
                } catch (Exception e) {
                    HMLog.debug(WatchWifiFtpUtil.g, new Function0() { // from class: com.huami.watch.wififtp.o
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return WatchWifiFtpUtil.d.g(e);
                        }
                    });
                }
            }
        }

        @Override // com.huami.watch.wififtp.WatchWifiFtpUtil.WatchFTPListener
        public void onFileUpload(String str) {
            if (WatchWifiFtpUtil.this.e != null) {
                try {
                    WatchWifiFtpUtil.this.e.onFileUpload(str);
                } catch (Exception e) {
                    HMLog.debug(WatchWifiFtpUtil.g, new Function0() { // from class: com.huami.watch.wififtp.q
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return WatchWifiFtpUtil.d.h(e);
                        }
                    });
                }
            }
        }
    }

    private WatchWifiFtpUtil(Context context) {
        this.a = context;
        WifiFtpModule.setClassicTransporterDataListener(new a());
        WifiFtpModule.init(context);
        WifiFtpModule.addListener(new b());
    }

    private static String f(int i, int i2) {
        Random random = new Random(i);
        StringBuffer stringBuffer = new StringBuffer();
        char[] cArr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', JsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int i3 = 0;
        while (i3 < i2) {
            int iAbs = Math.abs(random.nextInt(62));
            if (iAbs >= 0 && iAbs < 62) {
                stringBuffer.append(cArr[iAbs]);
                i3++;
            }
        }
        return stringBuffer.toString();
    }

    private static int g() {
        double dRandom = Math.random() * 100000.0d;
        if (dRandom >= 100000.0d) {
            dRandom = 99999.0d;
        }
        return (int) Math.ceil(dRandom);
    }

    public static WatchWifiFtpUtil get() {
        return h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h(String str, int i, String str2) {
        return "enableWifiAP SSID:" + str + " keyMgmt:" + i + " PSWD:" + str2;
    }

    private void i() {
        WifiFtpModule.release();
    }

    public static void init(Context context) {
        if (h == null) {
            h = new WatchWifiFtpUtil(context);
        }
    }

    public static void release() {
        WatchWifiFtpUtil watchWifiFtpUtil = h;
        if (watchWifiFtpUtil != null) {
            watchWifiFtpUtil.i();
        }
    }

    public static void updatePassWord() {
        int iRandom = 999999 - ((int) (Math.random() * 900000.0d));
        SSID = "huami-" + iRandom;
        PSWD = iRandom + UniteAppStatus.ILLEGAL;
    }

    public void disableWifiAP() {
        WifiFtpModule.sendDisableWifiAP();
    }

    public void enableWifiAP(final String str, final int i, final String str2) {
        HMLog.debug(g, new Function0() { // from class: rl8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WatchWifiFtpUtil.h(str, i, str2);
            }
        });
        WifiFtpModule.sendEnableWifiAP(str, str2, i);
    }

    @Nullable
    public String getDeviceAddress(Context context) {
        return WifiFtpModule.getDeviceAddress(context);
    }

    public void setWatchAPStateListener(WatchAPStateListener watchAPStateListener) {
        this.c = watchAPStateListener;
    }

    public void setWatchFTPListener(WatchFTPListener watchFTPListener) {
        this.e = watchFTPListener;
    }

    public void startWatchService() {
        WifiFtpModule.sendStartService();
    }
}
