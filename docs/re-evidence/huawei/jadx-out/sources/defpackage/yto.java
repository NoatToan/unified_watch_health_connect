package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.zhangyue.iReader.sdk.scheme.ISchemeListener;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class yto {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f53866a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f53867b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Context f53868c = null;
    private static int d = 0;
    private static String e = null;
    private static int h = -1;
    private static boolean i = false;
    private static String j;

    private static String a(String str) {
        return str.replace("{host}", ytv.a(f53868c).a("SCHEME_SUPPORT_PACKAGE", "")).replace("{from}", f53866a).replace("{traceid}", j);
    }

    private static String b(String str) {
        return (!"com.huawei.hwireader".contains(str.toLowerCase()) || d(str, "schemeVersion") >= 220) ? str : "";
    }

    public static void a(final String str, final ISchemeListener iSchemeListener) {
        if (!i) {
            throw new RuntimeException("Call SchemeManager.init() first!");
        }
        try {
            if (str.contains("{from}")) {
                str = a(str);
            }
            Intent intent = new Intent();
            intent.setData(Uri.parse(str));
            intent.addFlags(268468224);
            intent.setClassName("com.huawei.hwireader", "com.zhangyue.iReader.online.ui.ActivityOutsideWeb");
            f53868c.startActivity(intent);
            if (iSchemeListener != null) {
                iSchemeListener.onSuccess(200);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            int i2 = d;
            if (i2 > 0) {
                iSchemeListener.onError(402, "url error.");
            } else {
                d = i2 + 1;
                a(f53868c, e, "", j, new ISchemeListener() { // from class: yto.5
                    @Override // com.zhangyue.iReader.sdk.scheme.ISchemeListener
                    public void onSuccess(Object obj) {
                        yto.a(str, iSchemeListener);
                    }

                    @Override // com.zhangyue.iReader.sdk.scheme.ISchemeListener
                    public void onError(int i3, String str2) {
                        ISchemeListener iSchemeListener2 = iSchemeListener;
                        if (iSchemeListener2 != null) {
                            iSchemeListener2.onError(i3, str2);
                        }
                    }
                });
            }
        }
    }

    public static void b(ISchemeListener iSchemeListener) {
        c("channel_ch_earclub", iSchemeListener);
    }

    public static void c(String str, final ISchemeListener iSchemeListener) {
        if (iSchemeListener == null) {
            return;
        }
        b(str, new com.zhangyue.iReader.sdk.scheme.a() { // from class: yto.1
            @Override // com.zhangyue.iReader.sdk.scheme.a
            public void a(String str2) {
                yto.a(str2, iSchemeListener);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0049  */
    /* JADX WARN: Code duplicated, block: B:13:0x005b  */
    /* JADX WARN: Code duplicated, block: B:15:0x0065  */
    /* JADX WARN: Code duplicated, block: B:17:0x006f  */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    public static void a(Context context, String str, String str2, String str3, ISchemeListener iSchemeListener) {
        String strB;
        String str4;
        i = true;
        f53868c = context;
        f53866a = context.getPackageName();
        e = str;
        f53867b = str2;
        j = str3;
        if (!TextUtils.isEmpty(str)) {
            str4 = TextUtils.isEmpty(str2) ? "appSecret not valid" : "appId not valid";
            strB = b(b());
            ytr.b("supportPkgName:" + strB);
            if (!TextUtils.isEmpty(strB)) {
                ytv.a(context).e("SCHEME_SUPPORT_PACKAGE", null);
                if (iSchemeListener != null) {
                    iSchemeListener.onError(400, "There is no application support uri scheme.");
                    return;
                }
                return;
            }
            h = d(strB, "schemeVersion");
            ytv.a(context).e("SCHEME_SUPPORT_PACKAGE", strB);
            if (iSchemeListener != null) {
                iSchemeListener.onSuccess(200);
            }
        }
        iSchemeListener.onError(401, str4);
        strB = b(b());
        ytr.b("supportPkgName:" + strB);
        if (!TextUtils.isEmpty(strB)) {
            ytv.a(context).e("SCHEME_SUPPORT_PACKAGE", null);
            if (iSchemeListener != null) {
                iSchemeListener.onError(400, "There is no application support uri scheme.");
                return;
            }
            return;
        }
        h = d(strB, "schemeVersion");
        ytv.a(context).e("SCHEME_SUPPORT_PACKAGE", strB);
        if (iSchemeListener != null) {
            iSchemeListener.onSuccess(200);
        }
    }

    private static String b() {
        String[] strArrSplit = "com.huawei.hwireader,com.chaozh.iReaderFree.scheme, com.chaozh.iReaderFree15, com.chaozh.iReaderFree".split(",");
        if (strArrSplit == null || strArrSplit.length == 0) {
            return null;
        }
        List<ResolveInfo> listQueryIntentActivities = f53868c.getPackageManager().queryIntentActivities(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("zhangyueireader://")), 0);
        int length = strArrSplit.length;
        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
        boolean z = false;
        while (it.hasNext()) {
            String str = it.next().activityInfo.packageName;
            for (int i2 = 0; i2 < length; i2++) {
                if (str.equals(strArrSplit[i2])) {
                    z = true;
                    length = i2;
                    break;
                }
            }
            if (length == 0) {
                break;
            }
        }
        return z ? strArrSplit[length] : "";
    }

    static class a extends AsyncTask<Void, Integer, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f53870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.zhangyue.iReader.sdk.scheme.a f53871b;
        private String e;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            ytr.b("result:" + str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getInt("code") == 0) {
                    String string = jSONObject.getJSONObject(TtmlNode.TAG_BODY).getString("url");
                    ytr.b("url:" + string);
                    if (TextUtils.isEmpty(string)) {
                        return;
                    }
                    ytv.a(yto.f53868c).e(this.f53870a, string);
                    com.zhangyue.iReader.sdk.scheme.a aVar = this.f53871b;
                    if (aVar != null) {
                        aVar.a(string);
                    }
                }
            } catch (JSONException e) {
                ytr.d("parse result error:" + e.getMessage());
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public String doInBackground(Void... voidArr) {
            return ytu.b(this.e);
        }

        public a(String str, String str2, com.zhangyue.iReader.sdk.scheme.a aVar) {
            this.f53870a = str;
            this.f53871b = aVar;
            this.e = str2;
        }
    }

    private static int d(String str, String str2) {
        try {
            Bundle bundle = f53868c.getPackageManager().getApplicationInfo(str, 128).metaData;
            if (bundle == null || !bundle.containsKey(str2)) {
                return -1;
            }
            return bundle.getInt(str2);
        } catch (PackageManager.NameNotFoundException e2) {
            ytr.d("getAppMetaIntData error:" + e2.getMessage());
            return -1;
        }
    }

    private static void b(String str, com.zhangyue.iReader.sdk.scheme.a aVar) {
        if (!i) {
            throw new RuntimeException("Call SchemeManager.init() first!");
        }
        String str2 = "";
        String strA = ytv.a(f53868c).a(str, "");
        String strA2 = ytv.a(f53868c).a("SCHEME_SUPPORT_PACKAGE", "");
        boolean z = true;
        if (TextUtils.isEmpty(strA)) {
            str2 = strA;
        } else {
            String host = Uri.parse(strA).getHost();
            if (TextUtils.isEmpty(strA2) || strA2.equalsIgnoreCase(host)) {
                aVar.a(strA);
                str2 = strA;
                z = false;
            } else {
                ytv.a(f53868c).e(str, "");
            }
        }
        if (TextUtils.isEmpty(str2) && yts.f53879a.containsKey(str)) {
            aVar.a(yts.f53879a.get(str));
            z = false;
        }
        String strReplace = "https://api.zhangyue.com/third/pageid?package={package}&appId={appid}&from={from}&traceid={traceid}&schemeVersion={schemeVersion}&closeback={closeback}&backfrom={backfrom}".replace("{package}", strA2).replace("{appid}", e).replace("{traceid}", j).replace("{from}", f53866a).replace("{schemeVersion}", String.valueOf(h)).replace("{closeback}", "false").replace("{backfrom}", "false");
        String str3 = strReplace + "&sign=" + ytu.d(strReplace, f53867b);
        if (!z) {
            aVar = null;
        }
        new a(str, str3, aVar).execute(new Void[0]);
    }
}
