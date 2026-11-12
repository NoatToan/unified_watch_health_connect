package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.huawei.hms.network.embedded.j;
import com.huawei.hms.support.picker.common.AccountPickerUtil;
import com.huawei.hwidauth.g.f;
import com.huawei.operation.utils.Constants;
import com.huawei.secure.android.common.intent.SafeBundle;
import com.huawei.secure.android.common.webview.SafeWebView;
import com.huawei.secure.android.common.webview.UriUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class noo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static noo f43370a;
    private Context e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f43372c = "";
    private boolean d = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<nno> f43371b = new ArrayList<>();

    noo(Context context) {
        this.e = context;
    }

    public static noo c(Context context) {
        if (f43370a == null) {
            f43370a = new noo(context.getApplicationContext());
        }
        return f43370a;
    }

    public boolean d() {
        return !non.c(this.f43371b).booleanValue();
    }

    public boolean a() {
        return nor.e(this.e.getFilesDir().getAbsolutePath() + "/configuration.xml");
    }

    public void b() {
        synchronized (this) {
            nox.b(j.h, "Enter saveConfigurationTimestamp", true);
            nnv.a(this.e).a("configurationLastUpdate", System.currentTimeMillis());
        }
    }

    public void c(XmlPullParser xmlPullParser, final String str) throws XmlPullParserException, IOException {
        synchronized (this) {
            nox.a(j.h, "saveConfigurationFromServer.", true);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            nnw.c().execute(new Runnable() { // from class: noo.5
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    nor.d(noo.this.e.getFilesDir().getAbsolutePath() + "/", "configuration.xml", nom.d(str));
                }
            });
            d(xmlPullParser);
        }
    }

    public String c() {
        String str;
        synchronized (this) {
            if (non.c(this.f43371b).booleanValue()) {
                this.f43372c = "";
                a((f.a) null);
            }
            nox.b(j.h, "getConfigurationTimeStampFromServer Timestamp:" + this.f43372c, false);
            str = this.f43372c;
        }
        return str;
    }

    public void e() {
        if (f()) {
            nox.b(j.h, "over one day, then update configuration.xml from server.", true);
            nnr.d().execute(new Runnable() { // from class: noo.1
                @Override // java.lang.Runnable
                public void run() {
                    noo.this.b((f.a) null);
                }
            });
        }
    }

    public void a(final f.a aVar) {
        nnr.d().execute(new Runnable() { // from class: noo.2
            @Override // java.lang.Runnable
            public void run() {
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                nnw.c().execute(new Runnable() { // from class: noo.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            String strH = noo.this.h();
                            if (!TextUtils.isEmpty(strH)) {
                                noo.this.d(nnn.c(strH.getBytes("UTF-8")));
                                countDownLatch.countDown();
                            } else {
                                nox.a(j.h, "getConfigurationData readConfigurationFile is failed.", true);
                                countDownLatch.countDown();
                            }
                        } catch (Exception e) {
                            nox.a(j.h, "Exception:" + e.getClass().getSimpleName(), true);
                        }
                    }
                });
                try {
                    boolean zAwait = countDownLatch.await(3L, TimeUnit.SECONDS);
                    nox.b(j.h, "getConfigurationData awaitValue:" + zAwait, true);
                    if (zAwait && aVar != null && !non.c(noo.this.f43371b).booleanValue()) {
                        noo.this.c(aVar);
                        return;
                    }
                    f.a aVar2 = aVar;
                    if (aVar2 != null) {
                        noo.this.c(aVar2, 2015, "read file timeout or config data list empty.");
                    }
                } catch (InterruptedException unused) {
                    nox.a(j.h, "getConfigurationData InterruptedException.", true);
                    f.a aVar3 = aVar;
                    if (aVar3 != null) {
                        noo.this.c(aVar3, 2015, "read file exception.");
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final f.a aVar) {
        new Handler(this.e.getMainLooper()).post(new Runnable() { // from class: noo.4
            @Override // java.lang.Runnable
            public void run() {
                aVar.a(new SafeBundle());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final f.a aVar, final int i, final String str) {
        new Handler(this.e.getMainLooper()).post(new Runnable() { // from class: noo.3
            @Override // java.lang.Runnable
            public void run() {
                aVar.a(i, str);
            }
        });
    }

    public void b(final f.a aVar) {
        String strQ = noc.o().q();
        if (TextUtils.isEmpty(strQ)) {
            nox.a(j.h, "getResourceUrl is null.", true);
            if (aVar != null) {
                aVar.a(2015, "getResourceUrl is null.");
                return;
            }
            return;
        }
        nmx nmxVar = new nmx("Default", "", c(), this.e);
        new noa(nmxVar, this.e, strQ + nmxVar.c(), new f.a() { // from class: noo.8
            @Override // com.huawei.hwidauth.g.f.a
            public void a(SafeBundle safeBundle) {
                f.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(safeBundle);
                }
            }

            @Override // com.huawei.hwidauth.g.f.a
            public void a(int i, String str) {
                f.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(i, str);
                }
            }
        }).a();
    }

    private boolean f() {
        if (AccountPickerUtil.isPhoneStillInLockMode(this.e)) {
            return false;
        }
        if (a()) {
            return Math.abs(System.currentTimeMillis() - nnv.a(this.e).c("configurationLastUpdate", 0L)) > (((long) npd.b().nextInt(1000)) * 3600) + 86400000;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0161 A[PHI: r7
      0x0161: PHI (r7v2 java.lang.String[]) = (r7v0 java.lang.String[]), (r7v5 java.lang.String[]) binds: [B:49:0x013c, B:41:0x00f4] A[DONT_GENERATE, DONT_INLINE]] */
    public boolean c(String str, String str2, SafeWebView safeWebView) {
        boolean zIsUrlHostInWhitelist;
        synchronized (this) {
            String strC = c("sceneOfJS");
            String strC2 = c("webviewWhiteListForJS");
            boolean z = TextUtils.isEmpty(strC2) || strC2.equals("Default") || strC2.equals(Constants.LOG_ERROR);
            boolean z2 = TextUtils.isEmpty(strC) || strC.equals("Default") || strC.equals(Constants.LOG_ERROR);
            boolean zA = c(this.e).a();
            String[] whitelistNotMatchSubDomain = new String[0];
            if (z || z2 || !zA) {
                nox.b(j.h, "sceneOfJS is: " + strC + ", webviewAllowListForJS is: " + strC2, true);
                if (safeWebView != null) {
                    whitelistNotMatchSubDomain = safeWebView.getWhitelistNotMatchSubDomain();
                    if (whitelistNotMatchSubDomain == null) {
                        nox.b(j.h, str + " get allowlist failed, match result: false", true);
                        return false;
                    }
                    zIsUrlHostInWhitelist = UriUtil.isUrlHostInWhitelist(str2, whitelistNotMatchSubDomain);
                } else {
                    zIsUrlHostInWhitelist = false;
                }
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(strC);
                    JSONObject jSONObject2 = new JSONObject(strC2);
                    JSONArray jSONArray = jSONObject.getJSONArray(str);
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONArray jSONArray2 = jSONObject2.getJSONArray((String) jSONArray.get(i));
                        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                            arrayList.add((String) jSONArray2.get(i2));
                        }
                    }
                    whitelistNotMatchSubDomain = (String[]) arrayList.toArray(new String[arrayList.size()]);
                    if (whitelistNotMatchSubDomain == null || whitelistNotMatchSubDomain.length == 0) {
                        nox.b(j.h, str + " second allowlist is null, match by first allowlist.", true);
                        if (safeWebView != null) {
                            whitelistNotMatchSubDomain = safeWebView.getWhitelistNotMatchSubDomain();
                            zIsUrlHostInWhitelist = UriUtil.isUrlHostInWhitelist(str2, whitelistNotMatchSubDomain);
                        } else {
                            zIsUrlHostInWhitelist = false;
                        }
                    } else {
                        List listAsList = Arrays.asList(str2.split("//")[1].split("/"));
                        zIsUrlHostInWhitelist = UriUtil.isUrlHostAndPathInWhitelist(((String) listAsList.get(0)) + "/" + ((String) listAsList.get(1)), whitelistNotMatchSubDomain);
                    }
                } catch (Exception e) {
                    nox.a(j.h, "Exception:" + e.getClass().getSimpleName(), true);
                    return false;
                }
            }
            nox.b(j.h, "allowlist size: " + whitelistNotMatchSubDomain.length, true);
            nox.b(j.h, "allowlist: " + Arrays.toString(whitelistNotMatchSubDomain), false);
            nox.b(j.h, str + " allowlist match result: " + zIsUrlHostInWhitelist, true);
            return zIsUrlHostInWhitelist;
        }
    }

    public String c(String str) {
        synchronized (this) {
            if (non.c(this.f43371b).booleanValue()) {
                this.f43372c = "";
                nox.a(j.h, "mConfigDataList is empty.", true);
                return Constants.LOG_ERROR;
            }
            String strD = d(str);
            return TextUtils.isEmpty(strD) ? Constants.LOG_ERROR : strD;
        }
    }

    private String d(String str) {
        if (non.c(this.f43371b).booleanValue() || TextUtils.isEmpty(str)) {
            return "";
        }
        for (nno nnoVar : this.f43371b) {
            if (nnoVar != null && "Default".equalsIgnoreCase(nnoVar.c())) {
                for (nnp nnpVar : nnoVar.b()) {
                    if (nnpVar != null && str.equalsIgnoreCase(nnpVar.a())) {
                        return nnpVar.c();
                    }
                }
            }
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (1 != eventType) {
            String name = xmlPullParser.getName();
            if (eventType == 2) {
                if ("dataVer".equals(name)) {
                    this.f43372c = xmlPullParser.nextText();
                    nox.b(j.h, "Response mResponseTimestamp = " + this.f43372c, true);
                } else if ("Country".equals(name)) {
                    a(xmlPullParser.getAttributeValue(null, "name"));
                } else if ("Config".equals(name)) {
                    if (nnh.b(xmlPullParser.getAttributeValue(null, "size")) > 0) {
                        this.d = true;
                    }
                } else if (this.d) {
                    if (non.c(this.f43371b).booleanValue()) {
                        nox.a(j.h, "arrConfigData is empty", true);
                    } else {
                        this.f43371b.get(0).b(new nnp(xmlPullParser.getName(), xmlPullParser.nextText()));
                    }
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String h() throws IOException {
        return nor.d(this.e.getFilesDir().getCanonicalPath() + "/configuration.xml");
    }

    private void a(String str) {
        if (TextUtils.isEmpty(str)) {
            nox.b(j.h, "countryCode is empty", true);
        } else {
            g();
            this.f43371b.add(new nno(str));
        }
    }

    private void g() {
        if (non.e(this.f43371b).booleanValue()) {
            for (int i = 0; i < this.f43371b.size(); i++) {
                nno nnoVar = this.f43371b.get(i);
                if (nnoVar != null) {
                    nnoVar.d();
                }
            }
        }
        ArrayList<nno> arrayList = this.f43371b;
        if (arrayList != null) {
            arrayList.clear();
        }
    }
}
