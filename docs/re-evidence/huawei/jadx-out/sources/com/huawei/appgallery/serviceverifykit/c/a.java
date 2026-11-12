package com.huawei.appgallery.serviceverifykit.c;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.media3.extractor.ts.PsExtractor;
import com.huawei.appgallery.serviceverifykit.api.ServiceVerifyKit;
import defpackage.biw;
import defpackage.biz;
import defpackage.bja;
import defpackage.bjd;
import defpackage.bjf;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f5258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f5259b;
    private String e;
    private int g;
    private ServiceVerifyKit.Builder.ComponentType k;
    private Intent m;
    private String n;
    private String o;
    private Context q;
    private String r;
    private String y;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, String[]> f5260c = new HashMap();
    private Map<String, Integer> d = new HashMap();
    private Map<String, String> h = new HashMap();
    private List<String> i = new ArrayList();
    private List<ServiceVerifyKit.e> f = new ArrayList();
    private int j = 0;
    private int l = 0;
    private int p = 0;
    private int s = 0;
    private int t = 0;

    public boolean b(String str, String str2) {
        String[] strArr;
        if (this.f5260c.containsKey(str) && (strArr = this.f5260c.get(str)) != null) {
            for (String str3 : strArr) {
                if (str2.equals(str3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void c(String str, String str2, String str3, Map<String, String[]> map, Map<String, Integer> map2, int i, List<String> list, List<ServiceVerifyKit.e> list2, int i2, String str4, String str5, Intent intent, ServiceVerifyKit.Builder.ComponentType componentType, Map<String, String> map3, String str6) {
        this.f5258a = str;
        this.e = str2;
        this.f5259b = str3;
        this.f5260c = map;
        this.d = map2;
        this.g = i;
        this.i = list;
        this.f = list2;
        this.j = i2;
        this.n = str4;
        this.o = str5;
        this.m = intent;
        this.k = componentType;
        this.h = map3;
        this.y = str6;
    }

    public List<biw> d() {
        PackageManager packageManager = this.q.getPackageManager();
        List<ResolveInfo> listD = d(packageManager);
        if (listD.size() == 0) {
            return null;
        }
        this.r = TextUtils.isEmpty(this.o) ? Build.MANUFACTURER : e(this.o);
        return a(listD, packageManager, this.g | PsExtractor.AUDIO_STREAM);
    }

    private boolean b(Bundle bundle, String str, String str2, String str3, String str4) {
        bjf bjfVar;
        String str5;
        StringBuilder sb;
        if (bundle.containsKey(str3) && bundle.containsKey(str4)) {
            if (TextUtils.isEmpty(this.y)) {
                sb = new StringBuilder();
            } else {
                sb = new StringBuilder();
                sb.append(this.y);
                sb.append("&");
            }
            sb.append(str);
            sb.append("&");
            sb.append(str2);
            if (c(sb.toString(), bundle.getString(str3), bundle.getString(str4))) {
                return true;
            }
            bjfVar = bjf.e;
            str5 = "checkSinger failed";
        } else {
            bjfVar = bjf.e;
            str5 = "skip package " + str + " for no signer or no certChain";
        }
        bjfVar.a("MatchAppFinder", str5);
        return false;
    }

    private boolean c(String str, String str2, String str3) {
        bjf bjfVar;
        String str4;
        byte[] bytes;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            bjfVar = bjf.e;
            str4 = "args is invalid";
        } else {
            List<X509Certificate> listC = bjd.c(str3);
            if (listC.size() == 0) {
                bjfVar = bjf.e;
                str4 = "certChain is empty";
            } else if (bjd.d(bjd.d(this.q), listC)) {
                X509Certificate x509Certificate = listC.get(0);
                if (!bjd.d(x509Certificate, this.e)) {
                    bjfVar = bjf.e;
                    str4 = "CN is invalid";
                } else if (bjd.e(x509Certificate, this.f5259b)) {
                    try {
                        bytes = str.getBytes("UTF-8");
                    } catch (UnsupportedEncodingException e) {
                        bjf.e.a("MatchAppFinder", "checkCertChain UnsupportedEncodingException:", e);
                        bytes = null;
                    }
                    if (bjd.c(x509Certificate, bytes, bja.c(str2))) {
                        return true;
                    }
                    bjfVar = bjf.e;
                    str4 = "signature is invalid";
                } else {
                    bjfVar = bjf.e;
                    str4 = "OU is invalid";
                }
            } else {
                bjfVar = bjf.e;
                str4 = "failed to verify cert chain";
            }
        }
        bjfVar.a("MatchAppFinder", str4);
        return false;
    }

    private boolean e(Bundle bundle, String str, String str2, int i) {
        for (Map.Entry<String, String> entry : this.h.entrySet()) {
            if (bundle.containsKey(entry.getKey()) || bundle.containsKey(entry.getValue())) {
                if (b(bundle, str2, str, entry.getKey(), entry.getValue())) {
                    this.p = 0;
                    this.l = i;
                    return true;
                }
                bjf.e.a("MatchAppFinder", "checkSinger failed, packageName is " + str2);
            }
        }
        if (!b(str2, str)) {
            return false;
        }
        this.p = 1;
        this.l = this.d.get(str2).intValue();
        bjf.e.c("MatchAppFinder", "Legacy is success, packageName is " + str2);
        return true;
    }

    private List<biw> a(List<ResolveInfo> list, PackageManager packageManager, int i) {
        bjf bjfVar;
        StringBuilder sb;
        String str;
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : list) {
            String strA = a(resolveInfo);
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(strA, i);
                if (packageInfo.applicationInfo == null) {
                    bjfVar = bjf.e;
                    sb = new StringBuilder("skip package ");
                    sb.append(strA);
                    str = " for ApplicationInfo is null";
                } else {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length <= 0) {
                        bjfVar = bjf.e;
                        sb = new StringBuilder("skip package ");
                        sb.append(strA);
                        str = " for no sign";
                    } else {
                        byte[] byteArray = signatureArr[0].toByteArray();
                        if (byteArray.length == 0) {
                            bjfVar = bjf.e;
                            sb = new StringBuilder("skip package ");
                            sb.append(strA);
                            str = " for sign is empty";
                        } else {
                            try {
                                biw biwVarC = c(packageInfo, biz.c(MessageDigest.getInstance("SHA-256").digest(byteArray), true), strA, resolveInfo.priority);
                                if (biwVarC != null) {
                                    arrayList.add(biwVarC);
                                }
                            } catch (NoSuchAlgorithmException unused) {
                                bjfVar = bjf.e;
                                sb = new StringBuilder("skip package ");
                                sb.append(strA);
                                str = " for AlgorithmException";
                                sb.append(str);
                                bjfVar.a("MatchAppFinder", sb.toString());
                            }
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                bjfVar = bjf.e;
                sb = new StringBuilder("skip package ");
                sb.append(strA);
                str = " for PackageInfo is null with NameNotFoundException";
            } catch (Exception unused3) {
                bjfVar = bjf.e;
                sb = new StringBuilder("skip package ");
                sb.append(strA);
                str = " for PackageInfo is null with Exception";
            }
            sb.append(str);
            bjfVar.a("MatchAppFinder", sb.toString());
        }
        return arrayList;
    }

    private List<ResolveInfo> d(PackageManager packageManager) {
        ServiceVerifyKit.Builder.ComponentType componentType = this.k;
        if (componentType == null) {
            return packageManager.queryIntentServices(new Intent(this.f5258a), this.g);
        }
        if (componentType == ServiceVerifyKit.Builder.ComponentType.ACTIVITY) {
            return packageManager.queryIntentActivities(this.m, this.g);
        }
        return componentType == ServiceVerifyKit.Builder.ComponentType.BROADCAST ? packageManager.queryBroadcastReceivers(this.m, this.g) : packageManager.queryIntentServices(this.m, this.g);
    }

    private static String e(String str) {
        bjf bjfVar;
        String str2;
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (ClassNotFoundException unused) {
            bjfVar = bjf.e;
            str2 = "getSystemProperties ClassNotFoundException";
            bjfVar.a("MatchAppFinder", str2);
            return "";
        } catch (Exception unused2) {
            bjfVar = bjf.e;
            str2 = "getSystemProperties Exception while getting system property";
            bjfVar.a("MatchAppFinder", str2);
            return "";
        }
    }

    private String a(ResolveInfo resolveInfo) {
        ServiceVerifyKit.Builder.ComponentType componentType = this.k;
        return ((componentType == ServiceVerifyKit.Builder.ComponentType.ACTIVITY || componentType == ServiceVerifyKit.Builder.ComponentType.BROADCAST) ? resolveInfo.activityInfo.applicationInfo : resolveInfo.serviceInfo.applicationInfo).packageName;
    }

    private biw c(PackageInfo packageInfo, String str, String str2, int i) {
        Bundle bundle = packageInfo.applicationInfo.metaData;
        if (bundle == null) {
            return null;
        }
        int iD = d(bundle, this.r);
        if (!e(bundle, str, str2, i)) {
            return null;
        }
        if (!this.i.isEmpty()) {
            this.s = d(str2, this.i);
        }
        if (!this.f.isEmpty()) {
            this.t = e(bundle, this.j, this.f);
            bjf.e.c("MatchAppFinder", "match conditions success, packageName is " + str2 + " condition type is " + this.j + " condition number is " + this.t);
        }
        return new biw(str2, d(bundle, this.l), this.p, iD, this.s, this.t);
    }

    private int d(String str, List<String> list) {
        Iterator<String> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().equals(str)) {
                i = 1;
            }
        }
        return i;
    }

    private int d(Bundle bundle, String str) {
        if (!bundle.containsKey(this.n)) {
            return 0;
        }
        if (!bundle.getString(this.n).equalsIgnoreCase(str)) {
            return -1;
        }
        bjf.e.c("MatchAppFinder", "matchProp is 1, MetaDataKey is " + str);
        return 1;
    }

    private int e(Bundle bundle, int i, List<ServiceVerifyKit.e> list) {
        int i2 = 0;
        for (ServiceVerifyKit.e eVar : list) {
            if (i == 1) {
                if (!bundle.containsKey(eVar.a()) || !bundle.get(eVar.a()).toString().equals(eVar.d())) {
                    return 0;
                }
                i2 = 1;
            } else if (i != 2) {
                bjf.e.a("MatchAppFinder", "error input preferred package name");
            } else if (bundle.containsKey(eVar.a()) && bundle.get(eVar.a()).toString().equals(eVar.d())) {
                i2++;
            }
        }
        return i2;
    }

    private int d(Bundle bundle, int i) {
        if (!bundle.containsKey("ag.application.base_priority")) {
            return i + 1000;
        }
        try {
            return i + bundle.getInt("ag.application.base_priority");
        } catch (Exception unused) {
            bjf.e.a("MatchAppFinder", "skip package " + bundle.getString("ag.application.base_priority") + " is not number");
            return i + 1000;
        }
    }

    public a(Context context) {
        this.q = context;
    }
}
