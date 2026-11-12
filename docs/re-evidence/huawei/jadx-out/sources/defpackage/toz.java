package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homewear21.home.WearHomeOldActivity;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes18.dex */
public class toz extends Handler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference<WearHomeOldActivity> f49471b;

    public toz(WearHomeOldActivity wearHomeOldActivity) {
        this.f49471b = new WeakReference<>(wearHomeOldActivity);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message == null) {
            LogUtil.j("WearHomeHandler", "message is null.");
            return;
        }
        super.handleMessage(message);
        WearHomeOldActivity wearHomeOldActivity = this.f49471b.get();
        LogUtil.a("WearHomeHandler", "handleMessage, handler: ", this, ", activity: ", wearHomeOldActivity);
        if (wearHomeOldActivity == null) {
            LogUtil.j("WearHomeHandler", "activity is null");
            return;
        }
        int i = message.what;
        if (i == 24) {
            if (wearHomeOldActivity.y != null) {
                wearHomeOldActivity.y.i();
                return;
            }
            return;
        }
        if (i != 1011) {
            switch (i) {
                case 1001:
                    if (wearHomeOldActivity.y != null) {
                        wearHomeOldActivity.y.e();
                    }
                    break;
                case 1002:
                    if (wearHomeOldActivity.y != null) {
                        wearHomeOldActivity.y.a();
                    }
                    break;
                case 1003:
                    if (wearHomeOldActivity.y != null) {
                        wearHomeOldActivity.y.d(message);
                    }
                    break;
                default:
                    b(message, wearHomeOldActivity);
                    break;
            }
            return;
        }
        if (message.obj instanceof DeviceInfo) {
            wearHomeOldActivity.a((DeviceInfo) message.obj);
            if (wearHomeOldActivity.y != null) {
                wearHomeOldActivity.y.d((DeviceInfo) message.obj);
            }
            if (wearHomeOldActivity.s != null) {
                wearHomeOldActivity.s.a((DeviceInfo) message.obj);
            }
        }
    }

    private void b(Message message, WearHomeOldActivity wearHomeOldActivity) {
        int i = message.what;
        if (i == 1021) {
            LogUtil.a("WearHomeHandler", "upload log overtimes");
            if (wearHomeOldActivity.r != null) {
                wearHomeOldActivity.r.g();
                return;
            }
            return;
        }
        if (i == 1023) {
            d(message, wearHomeOldActivity);
            return;
        }
        if (i == 1026) {
            if (wearHomeOldActivity.r != null) {
                wearHomeOldActivity.r.b(message);
                return;
            }
            return;
        }
        if (i == 1033) {
            LogUtil.a("WearHomeHandler", "upload log DEVICE_GOTO_FEEDBACK");
            if (wearHomeOldActivity.r != null) {
                wearHomeOldActivity.r.c();
                return;
            }
            return;
        }
        if (i != 1041) {
            switch (i) {
                case 1004:
                    if (wearHomeOldActivity.y != null) {
                        wearHomeOldActivity.y.c();
                    }
                    break;
                case 1005:
                    if (wearHomeOldActivity.y != null) {
                        wearHomeOldActivity.y.e(message);
                    }
                    break;
                case 1006:
                    if (wearHomeOldActivity.y != null) {
                        wearHomeOldActivity.y.d();
                    }
                    break;
                default:
                    a(message, wearHomeOldActivity);
                    break;
            }
            return;
        }
        if (wearHomeOldActivity.r != null) {
            wearHomeOldActivity.r.b();
        }
    }

    private void d(Message message, WearHomeOldActivity wearHomeOldActivity) {
        Bundle data = message.getData();
        if (data != null) {
            int i = data.getInt("bugTypeId");
            String string = data.getString("fileLogId");
            String string2 = data.getString("dtsNumber");
            if (wearHomeOldActivity.r == null || TextUtils.isEmpty(string2)) {
                return;
            }
            wearHomeOldActivity.r.d(i, string2, string);
        }
    }

    private void a(Message message, WearHomeOldActivity wearHomeOldActivity) {
        int i = message.what;
        LogUtil.a("WearHomeHandler", "processOtherHandler what:", Integer.valueOf(i));
        if (i == 8) {
            if (wearHomeOldActivity.r != null) {
                LogUtil.a("WearHomeHandler", "handlerRestoreFactorySuccess");
                wearHomeOldActivity.r.d();
                return;
            }
            return;
        }
        if (i == 1022) {
            if (wearHomeOldActivity.r != null) {
                wearHomeOldActivity.r.j();
                return;
            }
            return;
        }
        if (i == 1024) {
            if (!(message.obj instanceof String) || wearHomeOldActivity.r == null) {
                return;
            }
            wearHomeOldActivity.r.b((String) message.obj);
            return;
        }
        if (i == 10) {
            wearHomeOldActivity.r.a(false);
            wearHomeOldActivity.r.a();
            return;
        }
        if (i == 11) {
            if (wearHomeOldActivity.r != null) {
                LogUtil.a("WearHomeHandler", "destroyLoadingDialog");
                if (message.obj instanceof Boolean) {
                    if (((Boolean) message.obj).booleanValue()) {
                        return;
                    }
                    LogUtil.a("WearHomeHandler", "destroyLoadingDialog false");
                    wearHomeOldActivity.r.a(false);
                    LogUtil.a("WearHomeHandler", "destroyLoadingDialog handlerRestoreFactorySuccess");
                    return;
                }
                wearHomeOldActivity.r.a(true);
                return;
            }
            return;
        }
        c(message, wearHomeOldActivity);
    }

    private void c(Message message, WearHomeOldActivity wearHomeOldActivity) {
        int i = message.what;
        LogUtil.a("WearHomeHandler", "handleAnotherHandler what:", Integer.valueOf(i));
        switch (i) {
            case 1034:
                if (wearHomeOldActivity.s != null) {
                    wearHomeOldActivity.s.h();
                }
                break;
            case 1035:
                if (wearHomeOldActivity.x != null) {
                    wearHomeOldActivity.x.d();
                }
                break;
            case 1036:
                if (wearHomeOldActivity.w != null) {
                    wearHomeOldActivity.w.b();
                }
                break;
            case 1037:
                if (wearHomeOldActivity.x != null) {
                    wearHomeOldActivity.x.e();
                }
                break;
            case 1038:
                if (wearHomeOldActivity.w != null) {
                    wearHomeOldActivity.w.d();
                }
                break;
            case 1039:
                wearHomeOldActivity.a();
                break;
            default:
                switch (i) {
                    case 300005:
                        if (wearHomeOldActivity.v != null) {
                            wearHomeOldActivity.v.setVisibility(8);
                        }
                        break;
                    case 300006:
                        if (wearHomeOldActivity.v != null && wearHomeOldActivity.s != null) {
                            wearHomeOldActivity.s.e();
                            wearHomeOldActivity.a(1);
                            break;
                        }
                        break;
                    default:
                        e(message, wearHomeOldActivity);
                        break;
                }
                break;
        }
    }

    private void e(Message message, WearHomeOldActivity wearHomeOldActivity) {
        int i = message.what;
        LogUtil.a("WearHomeHandler", "handleAnotherHandlerTwo what:", Integer.valueOf(i));
        if (i == 1040) {
            if (wearHomeOldActivity.p != null) {
                wearHomeOldActivity.p.d(((Integer) message.obj).intValue());
                return;
            }
            return;
        }
        LogUtil.j("WearHomeHandler", "handleAnotherHandlerTwo default what:", Integer.valueOf(i));
    }
}
