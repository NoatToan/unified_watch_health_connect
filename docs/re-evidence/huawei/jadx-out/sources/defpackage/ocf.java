package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hms.findnetwork.comm.request.bean.DisconnectNotifyModeValue;
import com.huawei.multisimsdk.multidevicemanager.common.AuthParam;
import com.huawei.multisimsdk.multidevicemanager.common.InProgressData;
import com.huawei.multisimsdk.multidevicemanager.model.MultiDeviceWebManager;
import com.huawei.multisimsdk.multidevicemanager.model.QueryManager;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.CreativeType;
import com.huawei.up.model.UserInfomation;
import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public class ocf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f44107a = "HandleControl";
    private static ocf d;
    private static d e;
    private Context h;
    private HandlerThread l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final HashMap<String, Integer> f44109c = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HashMap<Integer, obo> f44108b = new HashMap<>();
    private static final Object j = new Object();
    private AuthParam f = null;
    private InProgressData i = null;
    private AuthParam g = null;

    private int d(int i) {
        if (i != 101) {
            return i != 102 ? 0 : 1;
        }
        return 2;
    }

    private ocf() {
        this.l = null;
        HandlerThread handlerThread = new HandlerThread(f44107a);
        this.l = handlerThread;
        handlerThread.start();
        e = new d(this.l.getLooper());
    }

    public static ocf a() {
        ocf ocfVar;
        synchronized (j) {
            if (d == null) {
                d = new ocf();
            }
            ocfVar = d;
        }
        return ocfVar;
    }

    public d i() {
        return e;
    }

    public void c(Context context) {
        e(context, (AuthParam) null);
    }

    public void e(Context context, AuthParam authParam) {
        this.h = context;
        this.f = authParam;
    }

    public Context b() {
        return this.h;
    }

    public AuthParam c() {
        return this.f;
    }

    public void e() {
        if (e != null) {
            e = null;
        }
        HandlerThread handlerThread = this.l;
        if (handlerThread != null) {
            handlerThread.quit();
            this.l = null;
        }
        if (d != null) {
            d = null;
        }
        this.h = null;
        this.g = null;
    }

    public void d(AuthParam authParam) {
        ocq.e(f44107a, "set retry auth para");
        this.g = authParam;
    }

    class d extends Handler {
        d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ocq.e(ocf.f44107a, "msg.what = " + message.what);
            switch (message.what) {
                case 100:
                case 101:
                case 102:
                    ocf.this.h(message);
                    break;
                case 106:
                case DisconnectNotifyModeValue.DISCONNECT_NOTIFY_DEBUG /* 8888 */:
                    ocf.this.a(message);
                    break;
                case 107:
                    ocf.this.j(message);
                    break;
                case CreativeType.WINDOW_IMAGE_WITH_DOWNLOAD_BUTTON /* 113 */:
                case 117:
                    ocf ocfVar = ocf.this;
                    ocfVar.c(ocfVar.h, message);
                    break;
                case 114:
                case 124:
                    InProgressData inProgressData = message.obj instanceof InProgressData ? (InProgressData) message.obj : null;
                    QueryManager queryManager = new QueryManager(ocf.this.h, ocf.this.f, true);
                    queryManager.e(inProgressData);
                    queryManager.b();
                    break;
                case 115:
                case Constants.MAX_PRO_BOTTOM_MARGIN_PAD /* 119 */:
                case 126:
                case 8889:
                case 8890:
                    ocf.this.a(message);
                    break;
                case 125:
                    ocf.this.a(message);
                    break;
                case UserInfomation.WEIGHT_DEFAULT_ENGLISH /* 132 */:
                    ocf.this.d(message);
                    break;
                case OldToNewMotionPath.SPORT_TYPE_VOLLEYBALL /* 133 */:
                    ocf.this.c(message);
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(Message message) {
        ocq.e(f44107a, "Start invalid token handler ");
        if (message != null) {
            d(message.obj instanceof InProgressData ? (InProgressData) message.obj : null);
        }
        a(message);
    }

    private void d(InProgressData inProgressData) {
        if (inProgressData != null) {
            String primary = inProgressData.getPrimary();
            String strB = oco.b(this.h, primary, "Tag");
            if (!"".equals(strB)) {
                oco.e(this.h, strB, "authen_Token");
                oco.e(this.h, strB, "authorization");
                oco.e(this.h, strB, "Tag");
                oco.e(this.h, primary, "Tag");
            }
            oco.e(this.h, inProgressData.getPrimary(), "authen_Token");
            oco.e(this.h, inProgressData.getPrimary(), "authorization");
            ocq.e(f44107a, "Start to delete token info");
            return;
        }
        ocq.e(f44107a, "Start to delete token info failed, inProgressData is null ");
    }

    private InProgressData c(obo oboVar, int i) {
        InProgressData inProgressData = new InProgressData();
        if (oboVar != null) {
            inProgressData.setPrimary(oboVar.j());
            inProgressData.setPrimaryIDtype(oboVar.f());
            inProgressData.setSecondaryID(oboVar.g());
            inProgressData.setSecondarytype(oboVar.m());
            inProgressData.setRsn(i);
            inProgressData.setType(oboVar.k());
            inProgressData.setNikename(oboVar.h());
            inProgressData.setServiceType(oboVar.o());
            inProgressData.setDeviceid(oboVar.d());
            inProgressData.setSecondaryDeviceId(oboVar.i());
            inProgressData.setLiveIdSupported(oboVar.b());
            inProgressData.setEuiccPairing(oboVar.e());
        }
        return inProgressData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(Message message) {
        obo oboVar = message.obj instanceof obo ? (obo) message.obj : null;
        if (oboVar != null) {
            int iD = oco.d();
            if (c(oboVar, message).booleanValue()) {
                return;
            }
            f44108b.put(Integer.valueOf(iD), oboVar);
            message.obj = c(oboVar, iD);
            e(message);
        }
    }

    private void e(Message message) {
        InProgressData inProgressData = message.obj instanceof InProgressData ? (InProgressData) message.obj : null;
        if (inProgressData != null) {
            int type = inProgressData.getType();
            ocq.e(f44107a, "Handle authCallbackMethod, msg.what = " + message.what + ", type = " + type);
            if (100 == type) {
                d dVar = e;
                dVar.sendMessage(dVar.obtainMessage(CreativeType.WINDOW_IMAGE_WITH_DOWNLOAD_BUTTON, message.obj));
            } else if (101 == type) {
                d dVar2 = e;
                dVar2.sendMessage(dVar2.obtainMessage(117, message.obj));
            } else {
                d dVar3 = e;
                dVar3.sendMessage(dVar3.obtainMessage(124, message.obj));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message) {
        if (message == null) {
            ocq.e(f44107a, "Handle back data method failed, msg is null.");
            return;
        }
        Message messageA = null;
        InProgressData inProgressData = message.obj instanceof InProgressData ? (InProgressData) message.obj : null;
        if (inProgressData != null) {
            HashMap<String, Integer> map = f44109c;
            if (map.containsKey(inProgressData.getSecondaryID())) {
                map.remove(inProgressData.getSecondaryID());
            }
            int rsn = inProgressData.getRsn();
            HashMap<Integer, obo> map2 = f44108b;
            obo oboVar = map2.get(Integer.valueOf(rsn));
            if (oboVar != null) {
                if (8889 != message.what) {
                    messageA = oboVar.c();
                } else {
                    messageA = oboVar.a();
                }
            }
            if (messageA != null) {
                ocq.e(f44107a, "Message.sendToTarget() message.what= " + messageA.what);
                messageA.obj = b(message);
                oco.a(messageA);
                if (8889 != message.what) {
                    map2.remove(Integer.valueOf(rsn));
                }
                map.clear();
                return;
            }
            ocq.e(f44107a, "Message is null");
            return;
        }
        ocq.e(f44107a, "mutiProgressData is null");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    private obp b(Message message) {
        obp obpVar = new obp();
        InProgressData inProgressData = message.obj instanceof InProgressData ? (InProgressData) message.obj : null;
        if (inProgressData != null) {
            int i = message.what;
            if (i == 106) {
                obpVar.b(1);
                d(inProgressData);
                obpVar.c(1004);
            } else if (i == 107 || i == 115 || i == 119) {
                obpVar.b(1);
                obpVar.c(inProgressData.getResultcode());
            } else if (i == 125) {
                obpVar.b(0);
            } else if (i != 126) {
                switch (i) {
                    case 100:
                    case 101:
                    case 102:
                        obpVar.b(1);
                        obpVar.c(1);
                        break;
                    default:
                        switch (i) {
                            case DisconnectNotifyModeValue.DISCONNECT_NOTIFY_DEBUG /* 8888 */:
                                obpVar.b(1);
                                obpVar.c(3);
                                break;
                            case 8889:
                                obpVar.b(3);
                                break;
                            case 8890:
                                obpVar.b(0);
                                break;
                        }
                        break;
                }
            } else {
                obpVar.b(1);
                obpVar.c(inProgressData.getResultcode());
            }
            obpVar.d(d(inProgressData.getType()));
            ocq.e(f44107a, "Message - multiSimAsyncResult reasonCode = " + obpVar.e());
            obpVar.e(inProgressData.getMultiSIMServiceInfo());
            obpVar.b(inProgressData.getWebViewData());
            return obpVar;
        }
        ocq.e(f44107a, "Message - inProgressData is null ");
        return obpVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Context context, Message message) {
        InProgressData inProgressData = message.obj instanceof InProgressData ? (InProgressData) message.obj : null;
        MultiDeviceWebManager multiDeviceWebManager = new MultiDeviceWebManager(context, this.f);
        multiDeviceWebManager.b(inProgressData);
        multiDeviceWebManager.c();
    }

    private Boolean c(obo oboVar, Message message) {
        if (oboVar != null && 102 != message.what) {
            HashMap<String, Integer> map = f44109c;
            if (map.containsKey(oboVar.g())) {
                Message messageC = oboVar.c();
                if (messageC != null) {
                    ocq.e(f44107a, "Message.sendToTarget() msg.what= " + messageC.what + ", msg.ag1=" + messageC.arg1);
                    int iK = oboVar.k();
                    obp obpVar = new obp();
                    obpVar.b(2);
                    obpVar.c(99);
                    obpVar.d(d(iK));
                    messageC.obj = obpVar;
                    oco.a(messageC);
                } else {
                    ocq.e(f44107a, "Message is null ");
                }
                return true;
            }
            map.put(oboVar.g(), 1);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Message message) {
        if (message == null) {
            return;
        }
        String str = f44107a;
        ocq.e(str, "retry gba auth");
        InProgressData inProgressData = message.obj instanceof InProgressData ? (InProgressData) message.obj : null;
        if (this.g == null) {
            ocq.h(str, "not exist auth param");
            oco.c(106, inProgressData);
        } else {
            d(inProgressData);
            this.i = inProgressData;
            new ocl(this.h, this.g, e.obtainMessage(OldToNewMotionPath.SPORT_TYPE_VOLLEYBALL)).startAuthLogin();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Message message) {
        if (message == null) {
            return;
        }
        int i = message.arg1;
        String str = f44107a;
        ocq.e(str, "retry gba auth result " + i);
        InProgressData inProgressData = this.i;
        if (inProgressData == null) {
            ocq.c(str, "retry progress data is null");
        } else {
            if (i == 1000) {
                QueryManager queryManager = new QueryManager(this.h, this.f, false);
                queryManager.e(this.i);
                queryManager.b();
                return;
            }
            oco.c(106, inProgressData);
        }
    }
}
