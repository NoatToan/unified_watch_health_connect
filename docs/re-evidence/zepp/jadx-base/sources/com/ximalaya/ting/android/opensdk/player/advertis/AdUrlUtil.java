package com.ximalaya.ting.android.opensdk.player.advertis;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest;
import com.ximalaya.ting.android.opensdk.httputil.BaseCall;
import com.ximalaya.ting.android.opensdk.httputil.XimalayaException;
import com.ximalaya.ting.android.opensdk.util.Logger;
import com.ximalaya.ting.android.opensdk.util.SharedPreferencesUtil;
import com.ximalaya.ting.android.player.MD5;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Request;

/* JADX INFO: loaded from: classes22.dex */
public class AdUrlUtil {
    private static final String FIRST_OPEN_TIME = "ad_first_open_time";
    public static final int NETWORK_TYPE_MOBILE = 0;
    public static final int NETWORK_TYPE_NONE = -1;
    public static final int NETWORK_TYPE_WIFI = 1;
    private static volatile AdUrlUtil mInstance;
    private Context mContext;
    public final Pattern pattern1 = Pattern.compile("\\{\\w*\\}");
    public final Pattern pattern2 = Pattern.compile("\\[\\w*\\]");
    public final Pattern pattern3 = Pattern.compile("__\\w*__");
    private Map<String, String> adFields = new ConcurrentHashMap();

    public interface Callback {
        void execute(String str);
    }

    private AdUrlUtil(Context context) {
        if (context != null) {
            this.mContext = context.getApplicationContext();
            init();
        }
    }

    private String getFirstInTime() {
        SharedPreferencesUtil sharedPreferencesUtil = SharedPreferencesUtil.getInstance(this.mContext);
        String string = sharedPreferencesUtil.getString(FIRST_OPEN_TIME);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String str = new SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault()).format(new Date());
        sharedPreferencesUtil.saveString(FIRST_OPEN_TIME, str);
        return str;
    }

    public static AdUrlUtil getInstance(Context context) {
        if (mInstance == null) {
            synchronized (AdUrlUtil.class) {
                if (mInstance == null) {
                    mInstance = new AdUrlUtil(context);
                }
            }
        }
        return mInstance;
    }

    private static int getNetType(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null) {
            return -1;
        }
        NetworkInfo activeNetworkInfo = null;
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Exception unused) {
            connectivityManager = null;
        }
        if (connectivityManager == null) {
            return -1;
        }
        try {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Exception unused2) {
        }
        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
            return -1;
        }
        return activeNetworkInfo.getType() == 1 ? 1 : 0;
    }

    private void initShowTime() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = new SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault()).format(new Date(jCurrentTimeMillis));
        this.adFields.put("TS", "" + jCurrentTimeMillis);
        this.adFields.put("timestamp", "" + jCurrentTimeMillis);
        this.adFields.put("clicktime", "" + jCurrentTimeMillis);
        this.adFields.put("CLICKTIME", str);
    }

    private String replaceParameter(String str, Pattern pattern, int i) {
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group();
            if (strGroup != null) {
                if (strGroup.length() > i && i < strGroup.length() - i) {
                    String upperCase = strGroup.substring(i, strGroup.length() - i).toUpperCase();
                    String str2 = this.adFields.get(upperCase);
                    if (!TextUtils.isEmpty(str2)) {
                        strGroup = str2;
                    } else if ("IMEI".equals(upperCase)) {
                        strGroup = "";
                    }
                }
                matcher.appendReplacement(stringBuffer, strGroup);
            }
        }
        return matcher.appendTail(stringBuffer).toString();
    }

    public String changeParams(String str) {
        try {
            Uri uri = Uri.parse(str);
            if (uri == null) {
                return str;
            }
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (queryParameterNames == null || queryParameterNames.size() <= 0) {
                return replaceRequestStr(str, false, false);
            }
            Uri.Builder builderBuildUpon = Uri.parse(replaceRequestStr(uri.buildUpon().clearQuery().build().toString(), false, false)).buildUpon();
            for (String str2 : queryParameterNames) {
                builderBuildUpon.appendQueryParameter(str2, replaceRequestStr(uri.getQueryParameter(str2), false, false));
            }
            return builderBuildUpon.build().toString();
        } catch (Exception e) {
            Logger.e(e);
            return null;
        }
    }

    public String getApplicationName() {
        PackageManager packageManager;
        ApplicationInfo applicationInfo = null;
        try {
            packageManager = this.mContext.getPackageManager();
            try {
                applicationInfo = packageManager.getApplicationInfo(this.mContext.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            packageManager = null;
        }
        return (String) packageManager.getApplicationLabel(applicationInfo);
    }

    public void init() {
        this.adFields.put("OS", "0");
        Context context = this.mContext;
        if (context == null) {
            return;
        }
        try {
            this.adFields.put("IMEI", MD5.md5(OpenSdkUtils.getIMEIAndNotDefual(context)));
        } catch (Exception e) {
            this.adFields.put("IMEI", "");
            e.printStackTrace();
        }
        String localMacAddress = null;
        try {
            localMacAddress = OpenSdkUtils.getLocalMacAddress(this.mContext);
        } catch (XimalayaException e2) {
            e2.printStackTrace();
        }
        if (!TextUtils.isEmpty(localMacAddress)) {
            this.adFields.put("MAC1", MD5.md5(localMacAddress));
            this.adFields.put("MAC", MD5.md5(localMacAddress.replaceAll(":", "")));
        }
        this.adFields.put("ANDROIDID", MD5.md5(OpenSdkUtils.getAndroidId(this.mContext)));
        this.adFields.put("ANDROIDID1", OpenSdkUtils.getAndroidId(this.mContext));
        try {
            Map<String, String> map = this.adFields;
            CommonRequest.getInstanse();
            map.put("UA", CommonRequest.getUserAgent());
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        this.adFields.put("OSVS", CommonRequest.getInstanse().getSdkVersion());
        this.adFields.put("TERM", Build.MODEL);
        this.adFields.put("APPID", "0");
        try {
            String strEncode = URLEncoder.encode(getApplicationName(), "UTF-8");
            this.adFields.put("APPNAME", strEncode);
            this.adFields.put("APP", strEncode);
            this.adFields.put("ANAME", strEncode);
        } catch (UnsupportedEncodingException e4) {
            e4.printStackTrace();
        }
        this.adFields.put("FIRSTOPENTIME", getFirstInTime());
    }

    public String replaceRequestStr(String str, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (z) {
            try {
                str = URLDecoder.decode(str, "utf-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        String strReplace = replaceParameter(replaceParameter(replaceParameter(str, this.pattern1, 1), this.pattern2, 1), this.pattern3, 2).replace(" ", "");
        if (!z2) {
            return strReplace;
        }
        try {
            return URLEncoder.encode(strReplace, "utf-8");
        } catch (UnsupportedEncodingException e3) {
            e3.printStackTrace();
            return strReplace;
        } catch (Exception e4) {
            e4.printStackTrace();
            return strReplace;
        }
    }

    public void thirdAdStatRequest(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        initShowTime();
        BaseCall.getInstanse().doAsync(new Request.Builder().url(replaceRequestStr(str, false, false)).build(), null);
    }
}
