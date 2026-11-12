package com.huami.discovery.bridge.bracelet;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.Toast;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.account.HMLogoutManager;
import com.huami.device.feature.notification.statistics.NotificationEvent;
import com.huami.discovery.bridge.model.WebItem;
import com.huami.tools.log.HMLog;
import com.huami.watch.ota.UpdateUtils;
import com.xiaomi.hm.health.discovery.jsbridge.function.content.NavigateContent;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public class BraceletHandler {
    public static final int H5_ACTION_BACK_KEY = 13;
    public static final int H5_ACTION_CHECK_APP_INSTALLED = 8;
    public static final int H5_ACTION_EXIT = 7;
    public static final int H5_ACTION_INVOKE = 10;
    public static final int H5_ACTION_LOGIN = 12;
    public static final int H5_ACTION_LOGIN_INVALID = 15;
    public static final int H5_ACTION_OPEN_IN_BROWSER = 16;
    public static final int H5_ACTION_RELOGIN = 11;
    public static final int H5_ACTION_SET_BACK = 9;
    public static final int H5_ACTION_SET_RIGHT_BUTTON = 1;
    public static final int H5_ACTION_SET_STATUS_BAR_COLOR = 5;
    public static final int H5_ACTION_SET_TITLE = 3;
    public static final int H5_ACTION_SET_TITLE_BAR_BG = 4;
    public static final int H5_ACTION_SET_TITLE_BAR_VISIBLE = 2;
    public static final int H5_ACTION_SHARE = 6;
    public static final int H5_ACTION_SHARE_BUTTON = 14;
    public static final String H5_PARAM_BACK_KEY_CUSTOM = "custom";
    public static final String H5_PARAM_BACK_KEY_EXIT = "exit";
    public static final String H5_PARAM_BACK_KEY_HISTORY = "history";
    public static final String H5_PARAM_BACK_KEY_RELOAD = "reload";
    private static final String e = "BraceletHandler";
    private static final boolean f = true;
    private static final String g = "bracelet";
    private static final String h = "mifit";
    private static final String i = "cn.com.hm.health";
    private static final int j = 64;
    private static final int k = 65;
    private static final int l = 66;
    private static final int m = 67;
    private boolean a = false;
    private BraceletCallback b;
    private Context c;
    private WebItem d;

    public BraceletHandler(Context context, WebItem webItem) {
        this.c = context;
        this.d = webItem;
        HMLog.i(e, "DiscoveryItem : " + this.d, new Object[0]);
    }

    private static boolean a(String str, String str2) {
        try {
            Uri uri = Uri.parse(str);
            return uri != null && str2.equalsIgnoreCase(uri.getScheme());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private int b(Map<String, String> map) {
        String str = map.get("color");
        String str2 = map.get("opacity");
        if (TextUtils.isEmpty(str2)) {
            str2 = "10";
        }
        return Color.parseColor(UpdateUtils.CMD_FILTER + Integer.toHexString((int) ((new BigDecimal(str2).intValue() / 10.0f) * 255.0f)) + str);
    }

    private boolean c(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean checkIsH5View(String str) {
        return a(str, "mifit");
    }

    public static boolean checkIsNonHttp(String str) {
        return (a(str, "http") || a(str, "https")) ? false : true;
    }

    private void d(String str, boolean z) {
        BraceletCallback braceletCallback = this.b;
        if (braceletCallback != null) {
            braceletCallback.onCallJs("onCheckAppInstalled", str, Boolean.valueOf(z));
        }
    }

    private void e(Intent intent) {
        intent.setFlags(268435456);
        this.c.startActivity(intent);
    }

    private static int f(String str) {
        if ("set_right_button".equalsIgnoreCase(str)) {
            return 1;
        }
        if ("set_title_visible".equalsIgnoreCase(str)) {
            return 2;
        }
        if ("share".equalsIgnoreCase(str)) {
            return 6;
        }
        if ("exit".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("check_app_installed".equalsIgnoreCase(str)) {
            return 8;
        }
        if ("set_title_content".equalsIgnoreCase(str)) {
            return 3;
        }
        if ("set_title_bgd_color".equalsIgnoreCase(str)) {
            return 4;
        }
        if ("set_status_bar_color".equalsIgnoreCase(str)) {
            return 5;
        }
        if ("set_back_button".equalsIgnoreCase(str)) {
            return 9;
        }
        if ("action".equalsIgnoreCase(str)) {
            return 10;
        }
        if (NavigateContent.APP_GOTO_RELOGIN.equalsIgnoreCase(str)) {
            return 11;
        }
        if ("login".equalsIgnoreCase(str)) {
            return 12;
        }
        if ("back_key".equalsIgnoreCase(str)) {
            return 13;
        }
        if ("share_button".equalsIgnoreCase(str)) {
            return 14;
        }
        if ("invalid_login".equalsIgnoreCase(str)) {
            return 15;
        }
        return "open_in_browser".equalsIgnoreCase(str) ? 16 : -1;
    }

    public void doH5Action(int i2, String str, Map<String, String> map) {
        switch (i2) {
            case 1:
            case 13:
                break;
            case 2:
                boolean zBooleanValue = Boolean.valueOf(map.get("visible")).booleanValue();
                BraceletCallback braceletCallback = this.b;
                if (braceletCallback != null) {
                    braceletCallback.setTitleBarVisible(zBooleanValue);
                }
                break;
            case 3:
                String str2 = map.get("content");
                BraceletCallback braceletCallback2 = this.b;
                if (braceletCallback2 != null) {
                    braceletCallback2.setTitleText(str2);
                }
                break;
            case 4:
                BraceletCallback braceletCallback3 = this.b;
                if (braceletCallback3 != null) {
                    braceletCallback3.setTitleBarBackgroundColor(b(map));
                }
                break;
            case 5:
                BraceletCallback braceletCallback4 = this.b;
                if (braceletCallback4 != null) {
                    braceletCallback4.setSystemBarColor(b(map));
                }
                break;
            case 6:
                String str3 = new String(Base64.decode(map.get("data"), 0));
                BraceletCallback braceletCallback5 = this.b;
                if (braceletCallback5 != null) {
                    braceletCallback5.onWebShare(str3);
                }
                break;
            case 7:
                BraceletCallback braceletCallback6 = this.b;
                if (braceletCallback6 != null) {
                    braceletCallback6.finishActivity();
                }
                break;
            case 8:
                String str4 = map.get(NotificationEvent.KEY_PACKAGE);
                d(str4, c(this.c, str4));
                break;
            case 9:
                String str5 = map.get("url");
                HMLog.i(e, "H5 Back Url : " + str5, new Object[0]);
                BraceletCallback braceletCallback7 = this.b;
                if (braceletCallback7 != null) {
                    braceletCallback7.handleBackAction(str5, map.get("back_key"));
                }
                break;
            case 10:
                String str6 = map.get("name");
                String str7 = map.get("callback");
                BraceletCallback braceletCallback8 = this.b;
                if (braceletCallback8 != null) {
                    braceletCallback8.handleInvokeAction(str6, str7);
                }
                break;
            case 11:
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    jCurrentTimeMillis = new BigDecimal(map.get(HMLogoutManager.PARAM_LOGIN_TIME)).longValue() * 1000;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                BraceletCallback braceletCallback9 = this.b;
                if (braceletCallback9 != null) {
                    braceletCallback9.handleLoginAction(11, String.valueOf(jCurrentTimeMillis));
                }
                break;
            case 12:
                BraceletCallback braceletCallback10 = this.b;
                if (braceletCallback10 != null) {
                    braceletCallback10.handleLoginAction(12, null);
                }
                break;
            case 14:
                String str8 = new String(Base64.decode(map.get("data"), 0));
                BraceletCallback braceletCallback11 = this.b;
                if (braceletCallback11 != null) {
                    braceletCallback11.onShowFunction(str8, true);
                }
                break;
            case 15:
                String str9 = map.get(AbstractJSONTokenResponse.RESPONSE);
                BraceletCallback braceletCallback12 = this.b;
                if (braceletCallback12 != null) {
                    braceletCallback12.handleLoginAction(15, str9);
                }
                break;
            case 16:
                String str10 = map.get("url");
                HMLog.i(e, "browserUrl : " + str10, new Object[0]);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str10));
                e(intent);
                break;
            default:
                Toast.makeText(this.c, str, 0).show();
                break;
        }
    }

    public boolean handleBackPressed(boolean z) {
        BraceletCallback braceletCallback = this.b;
        return braceletCallback != null && braceletCallback.handleBackPressed(z);
    }

    public void handlerBraceletAction(String str) {
        try {
            Uri uri = Uri.parse(str);
            if (uri == null) {
                return;
            }
            String scheme = uri.getScheme();
            String host = uri.getHost();
            String path = uri.getPath();
            List<String> pathSegments = uri.getPathSegments();
            HMLog.i(e, "H5 : Scheme-" + scheme + ", Host-" + host + ", Path-" + path + ", PathSegments-" + Arrays.toString(pathSegments.toArray(new String[pathSegments.size()])), new Object[0]);
            if (pathSegments.size() == 1) {
                String str2 = pathSegments.get(0);
                int iF = f(str2);
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                HashMap map = new HashMap();
                if (queryParameterNames.size() > 0) {
                    for (String str3 : queryParameterNames) {
                        map.put(str3, uri.getQueryParameter(str3));
                    }
                }
                doH5Action(iF, str2, map);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public boolean isBraceletUrl(String str) {
        return a(str, g);
    }

    public void setBraceletCallback(BraceletCallback braceletCallback) {
        this.b = braceletCallback;
    }
}
