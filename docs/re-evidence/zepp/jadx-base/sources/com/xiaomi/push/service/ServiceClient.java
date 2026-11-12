package com.xiaomi.push.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huami.device.feature.notification.utils.PkgNameConstants;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.bb;
import com.xiaomi.push.cg;
import com.xiaomi.push.ch;
import com.xiaomi.push.ci;
import com.xiaomi.push.cl;
import com.xiaomi.push.cu;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.NameValuePair;

/* JADX INFO: loaded from: classes22.dex */
public class ServiceClient {
    private static ServiceClient g;
    private static String h;
    private static String i = cu.a(5) + Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    private static long j = 0;
    private Context a;
    private boolean c;
    private Messenger f;
    private Messenger b = null;
    private List<Message> d = new ArrayList();
    private boolean e = false;

    private ServiceClient(Context context) {
        this.c = false;
        this.a = context.getApplicationContext();
        if (l()) {
            com.xiaomi.channel.commonutils.logger.b.c("use miui push service");
            this.c = true;
        }
    }

    private Intent a() {
        if (!isMiuiPushServiceEnabled()) {
            Intent intent = new Intent(this.a, (Class<?>) XMPushService.class);
            intent.putExtra(bd.C, this.a.getPackageName());
            n();
            return intent;
        }
        Intent intent2 = new Intent();
        intent2.setPackage(PkgNameConstants.XMSF);
        intent2.setClassName(PkgNameConstants.XMSF, e());
        intent2.putExtra(bd.C, this.a.getPackageName());
        i();
        return intent2;
    }

    private Message b(Intent intent) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 17;
        messageObtain.obj = intent;
        return messageObtain;
    }

    private String e() {
        try {
            return this.a.getPackageManager().getPackageInfo(PkgNameConstants.XMSF, 4).versionCode >= 106 ? "com.xiaomi.push.service.XMPushService" : "com.xiaomi.xmsf.push.service.XMPushService";
        } catch (Exception unused) {
            return "com.xiaomi.xmsf.push.service.XMPushService";
        }
    }

    private String f(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        int i2 = 1;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append(":");
            sb.append(entry.getValue());
            if (i2 < map.size()) {
                sb.append(",");
            }
            i2++;
        }
        return sb.toString();
    }

    public static ServiceClient getInstance(Context context) {
        if (g == null) {
            g = new ServiceClient(context);
        }
        return g;
    }

    public static String getSession() {
        return h;
    }

    private Map<String, String> h(List<NameValuePair> list) {
        HashMap map = new HashMap();
        if (list != null && list.size() > 0) {
            for (NameValuePair nameValuePair : list) {
                if (nameValuePair != null) {
                    map.put(nameValuePair.getName(), nameValuePair.getValue());
                }
            }
        }
        return map;
    }

    private void i() {
        this.a.getPackageManager().setComponentEnabledSetting(new ComponentName(this.a, (Class<?>) XMPushService.class), 2, 1);
    }

    private synchronized void j(Intent intent) {
        if (this.e) {
            Message messageB = b(intent);
            if (this.d.size() >= 50) {
                this.d.remove(0);
            }
            this.d.add(messageB);
            return;
        }
        if (this.f == null) {
            this.a.bindService(intent, new f0(this), 1);
            this.e = true;
            this.d.clear();
            this.d.add(b(intent));
        } else {
            try {
                this.f.send(b(intent));
            } catch (RemoteException unused) {
                this.f = null;
                this.e = false;
            }
        }
    }

    private void k(Intent intent, String str, String str2, String str3, String str4, String str5, boolean z, Map<String, String> map, Map<String, String> map2) {
        intent.putExtra(bd.r, str);
        intent.putExtra(bd.u, str2);
        intent.putExtra(bd.w, str3);
        intent.putExtra(bd.y, str5);
        intent.putExtra(bd.x, str4);
        intent.putExtra(bd.z, z);
        intent.putExtra(bd.G, h);
        intent.putExtra(bd.K, this.b);
        if (map != null && map.size() > 0) {
            String strF = f(map);
            if (!TextUtils.isEmpty(strF)) {
                intent.putExtra(bd.A, strF);
            }
        }
        if (map2 == null || map2.size() <= 0) {
            return;
        }
        String strF2 = f(map2);
        if (TextUtils.isEmpty(strF2)) {
            return;
        }
        intent.putExtra(bd.B, strF2);
    }

    private boolean l() {
        if (com.xiaomi.push.j.e) {
            return false;
        }
        try {
            PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(PkgNameConstants.XMSF, 4);
            return packageInfo != null && packageInfo.versionCode >= 104;
        } catch (Exception unused) {
            return false;
        }
    }

    private void n() {
        this.a.getPackageManager().setComponentEnabledSetting(new ComponentName(this.a, (Class<?>) XMPushService.class), 1, 1);
    }

    public static void setSession(String str) {
        h = str;
    }

    public boolean batchSendMessage(ci[] ciVarArr, boolean z) {
        if (!com.xiaomi.push.y.m3842a(this.a)) {
            return false;
        }
        Intent intentA = a();
        int length = ciVarArr.length;
        Bundle[] bundleArr = new Bundle[length];
        for (int i2 = 0; i2 < ciVarArr.length; i2++) {
            String strA = bb.a();
            if (!TextUtils.isEmpty(strA)) {
                cg cgVar = new cg(com.tencent.connect.common.Constants.PARAM_PLATFORM_ID, null, null, null);
                cg cgVar2 = new cg("sent", null, null, null);
                cgVar2.m3637a(strA);
                cgVar.a(cgVar2);
                ciVarArr[i2].a(cgVar);
            }
            com.xiaomi.channel.commonutils.logger.b.c("SEND:" + ciVarArr[i2].mo3639a());
            bundleArr[i2] = ciVarArr[i2].a();
        }
        if (length <= 0) {
            return false;
        }
        intentA.setAction(bd.g);
        intentA.putExtra(bd.G, h);
        intentA.putExtra("ext_packets", bundleArr);
        intentA.putExtra("ext_encrypt", z);
        return startServiceSafely(intentA);
    }

    public void checkAlive() {
        Intent intentA = a();
        intentA.setAction("com.xiaomi.push.check_alive");
        startServiceSafely(intentA);
    }

    public boolean closeChannel() {
        Intent intentA = a();
        intentA.setAction(bd.i);
        return startServiceSafely(intentA);
    }

    public boolean closeChannel(String str) {
        Intent intentA = a();
        intentA.setAction(bd.i);
        intentA.putExtra(bd.u, str);
        return startServiceSafely(intentA);
    }

    public boolean closeChannel(String str, String str2) {
        Intent intentA = a();
        intentA.setAction(bd.i);
        intentA.putExtra(bd.u, str);
        intentA.putExtra(bd.r, str2);
        return startServiceSafely(intentA);
    }

    @Deprecated
    public boolean forceReconnection(String str, String str2, String str3, String str4, String str5, boolean z, List<NameValuePair> list, List<NameValuePair> list2) {
        return forceReconnection(str, str2, str3, str4, str5, z, h(list), h(list2));
    }

    public boolean forceReconnection(String str, String str2, String str3, String str4, String str5, boolean z, Map<String, String> map, Map<String, String> map2) {
        Intent intentA = a();
        intentA.setAction(bd.j);
        k(intentA, str, str2, str3, str4, str5, z, map, map2);
        return startServiceSafely(intentA);
    }

    public boolean isMiuiPushServiceEnabled() {
        return this.c;
    }

    public int openChannel(String str, String str2, String str3, String str4, String str5, Map<String, String> map, Map<String, String> map2, boolean z) {
        Intent intentA = a();
        intentA.setAction(bd.d);
        k(intentA, str, str2, str3, str4, str5, z, map, map2);
        startServiceSafely(intentA);
        return 0;
    }

    @Deprecated
    public int openChannel(String str, String str2, String str3, String str4, String str5, boolean z, List<NameValuePair> list, List<NameValuePair> list2) {
        return openChannel(str, str2, str3, str4, str5, h(list), h(list2), z);
    }

    @Deprecated
    public void resetConnection(String str, String str2, String str3, String str4, String str5, boolean z, List<NameValuePair> list, List<NameValuePair> list2) {
        resetConnection(str, str2, str3, str4, str5, z, h(list), h(list2));
    }

    public void resetConnection(String str, String str2, String str3, String str4, String str5, boolean z, Map<String, String> map, Map<String, String> map2) {
        Intent intentA = a();
        intentA.setAction(bd.k);
        k(intentA, str, str2, str3, str4, str5, z, map, map2);
        startServiceSafely(intentA);
    }

    public boolean sendIQ(ch chVar) {
        if (!com.xiaomi.push.y.m3842a(this.a)) {
            return false;
        }
        Intent intentA = a();
        Bundle bundleA = chVar.a();
        if (bundleA == null) {
            return false;
        }
        com.xiaomi.channel.commonutils.logger.b.c("SEND:" + chVar.mo3639a());
        intentA.setAction(bd.f);
        intentA.putExtra(bd.G, h);
        intentA.putExtra("ext_packet", bundleA);
        return startServiceSafely(intentA);
    }

    public boolean sendMessage(ci ciVar, boolean z) {
        if (!com.xiaomi.push.y.m3842a(this.a)) {
            return false;
        }
        Intent intentA = a();
        String strA = bb.a();
        if (!TextUtils.isEmpty(strA)) {
            cg cgVar = new cg(com.tencent.connect.common.Constants.PARAM_PLATFORM_ID, null, null, null);
            cg cgVar2 = new cg("sent", null, null, null);
            cgVar2.m3637a(strA);
            cgVar.a(cgVar2);
            ciVar.a(cgVar);
        }
        Bundle bundleA = ciVar.a();
        if (bundleA == null) {
            return false;
        }
        com.xiaomi.channel.commonutils.logger.b.c("SEND:" + ciVar.mo3639a());
        intentA.setAction(bd.e);
        intentA.putExtra(bd.G, h);
        intentA.putExtra("ext_packet", bundleA);
        intentA.putExtra("ext_encrypt", z);
        return startServiceSafely(intentA);
    }

    public boolean sendMessage(byte[] bArr, String str, String str2) {
        String strSubstring;
        if (!com.xiaomi.push.y.m3842a(this.a) || bArr == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("Failed to send message: message|userId|chid may be empty, or the network is unavailable.");
            return false;
        }
        Intent intentA = a();
        intentA.setAction(bd.e);
        intentA.putExtra(bd.G, h);
        intentA.putExtra("ext_raw_packet", bArr);
        int iIndexOf = str.indexOf("@");
        String strSubstring2 = null;
        String strSubstring3 = iIndexOf != -1 ? str.substring(0, iIndexOf) : null;
        int iLastIndexOf = str.lastIndexOf(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
        if (iLastIndexOf != -1) {
            strSubstring2 = str.substring(iIndexOf + 1, iLastIndexOf);
            strSubstring = str.substring(iLastIndexOf + 1);
        } else {
            strSubstring = null;
        }
        intentA.putExtra(bd.r, strSubstring3);
        intentA.putExtra(bd.s, strSubstring2);
        intentA.putExtra(bd.t, strSubstring);
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        long j2 = j;
        j = 1 + j2;
        sb.append(j2);
        String string = sb.toString();
        intentA.putExtra("ext_pkt_id", string);
        intentA.putExtra("ext_chid", str2);
        com.xiaomi.channel.commonutils.logger.b.e("SEND: chid=" + str2 + ", packetId=" + string);
        return startServiceSafely(intentA);
    }

    public boolean sendPresence(cl clVar) {
        if (!com.xiaomi.push.y.m3842a(this.a)) {
            return false;
        }
        Intent intentA = a();
        Bundle bundleA = clVar.a();
        if (bundleA == null) {
            return false;
        }
        com.xiaomi.channel.commonutils.logger.b.c("SEND:" + clVar.mo3639a());
        intentA.setAction(bd.h);
        intentA.putExtra(bd.G, h);
        intentA.putExtra("ext_packet", bundleA);
        return startServiceSafely(intentA);
    }

    public void setMessenger(Messenger messenger) {
        this.b = messenger;
    }

    public boolean startServiceSafely(Intent intent) {
        try {
            if (com.xiaomi.channel.commonutils.android.f.m3426a() || Build.VERSION.SDK_INT < 26) {
                this.a.startService(intent);
                return true;
            }
            j(intent);
            return true;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            return false;
        }
    }

    @Deprecated
    public void updateChannelInfo(String str, List<NameValuePair> list, List<NameValuePair> list2) {
        updateChannelInfo(str, h(list), h(list2));
    }

    public void updateChannelInfo(String str, Map<String, String> map, Map<String, String> map2) {
        Intent intentA = a();
        intentA.setAction(bd.l);
        if (map != null) {
            String strF = f(map);
            if (!TextUtils.isEmpty(strF)) {
                intentA.putExtra(bd.A, strF);
            }
        }
        if (map2 != null) {
            String strF2 = f(map2);
            if (!TextUtils.isEmpty(strF2)) {
                intentA.putExtra(bd.B, strF2);
            }
        }
        intentA.putExtra(bd.u, str);
        startServiceSafely(intentA);
    }
}
