package com.huawei.phoneservice.feedbackcommon.utils;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.restclient.hwhttp.Callback;
import com.huawei.hms.framework.network.restclient.hwhttp.Response;
import com.huawei.hms.framework.network.restclient.hwhttp.Submit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.phoneservice.feedbackcommon.entity.FeedbackZipBean;
import com.huawei.phoneservice.feedbackcommon.entity.ad;
import com.huawei.phoneservice.feedbackcommon.entity.s;
import com.huawei.phoneservice.feedbackcommon.entity.t;
import com.huawei.phoneservice.feedbackcommon.entity.u;
import com.huawei.phoneservice.feedbackcommon.entity.y;
import com.huawei.phoneservice.feedbackcommon.network.FeedbackWebConstants;
import com.huawei.wisesecurity.ucs.credential.Credential;
import com.huawei.wisesecurity.ucs.credential.CredentialClient;
import com.huawei.wisesecurity.ucs.credential.crypto.signer.CredentialSigner;
import defpackage.yqe;
import defpackage.yqj;
import defpackage.yqk;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class q extends com.huawei.phoneservice.feedbackcommon.utils.d {
    private String j;
    private String k;
    private WeakReference<NotifyUploadZipListener> o;
    private String p;
    private String q;
    private long r;
    private Credential w;
    private CredentialClient x;
    private String h = "";
    private String i = "";
    private int m = 0;
    private long l = 0;
    private int n = 0;
    private int s = 0;
    private boolean t = false;
    private boolean v = false;
    private boolean u = false;
    private boolean y = false;

    public void e(NotifyUploadZipListener notifyUploadZipListener) {
        if (notifyUploadZipListener != null) {
            this.o = new WeakReference<>(notifyUploadZipListener);
        }
        String sdk = com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_LOG_SERVER_SECRET_KEY);
        if (!TextUtils.isEmpty(sdk)) {
            this.t = false;
            c(sdk);
            return;
        }
        this.t = true;
        String strE = yqk.e("ucs_entity_key", "", this.e);
        if (!TextUtils.isEmpty(strE)) {
            try {
                CredentialClient credentialClientBuild = new CredentialClient.Builder().context(this.e).serCountry(com.huawei.phoneservice.faq.base.util.i.d().getSdk("country")).build();
                this.x = credentialClientBuild;
                if (credentialClientBuild != null) {
                    Credential credentialGenCredentialFromString = credentialClientBuild.genCredentialFromString(strE);
                    this.w = credentialGenCredentialFromString;
                    if (credentialGenCredentialFromString != null) {
                        if (System.currentTimeMillis() + 3600000 > this.w.getExpireTime()) {
                            c(1, (File) null, 0);
                            return;
                        } else {
                            c();
                            return;
                        }
                    }
                }
                b(false);
                return;
            } catch (yqj unused) {
            }
        }
        c(1, (File) null, 0);
    }

    public void c(NotifyUploadZipListener notifyUploadZipListener) {
        if (notifyUploadZipListener != null) {
            this.o = new WeakReference<>(notifyUploadZipListener);
        }
        b();
    }

    private void j() {
        String strC;
        String sdk = com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_SHASN);
        String sdk2 = com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_LOG_SERVER_APPID);
        u uVar = new u(sdk, this.j);
        String str = new SimpleDateFormat(FeedbackWebConstants.TIME_FORMATS, Locale.US).format(new Date());
        uVar.a(this.k);
        uVar.c(str);
        String strMapToString = ZipUtil.mapToString(new Gson().toJson(uVar));
        try {
            strC = l.c(FeedbackWebConstants.NOTIFY_UPLOAD_SUCC + sdk2, strMapToString, this.h);
        } catch (UnsupportedEncodingException e2) {
            com.huawei.phoneservice.faq.base.util.g.c("UploadZipTask", e2.getMessage());
            strC = "";
        }
        Map<String, String> commonHeaderParameter = ZipUtil.getCommonHeaderParameter(strC);
        e("notifyUploadSuccess", "0", "start");
        Submit notifyUploadSucc = com.huawei.phoneservice.feedbackcommon.utils.c.f21899b.getNotifyUploadSucc(this.e, commonHeaderParameter, strMapToString, sdk2, this.i, new j());
        WeakReference<Submit> weakReference = this.f21900a;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f21900a = new WeakReference<>(notifyUploadSucc);
    }

    static /* synthetic */ int g(q qVar) {
        int i2 = qVar.s;
        qVar.s = i2 + 1;
        return i2;
    }

    private void b() {
        String sdk = com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_SHASN);
        String sdk2 = com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_LOG_SERVER_APPID);
        File file = new File(this.p);
        com.huawei.phoneservice.feedbackcommon.entity.d dVar = new com.huawei.phoneservice.feedbackcommon.entity.d(sdk, this.j);
        dVar.a(0);
        dVar.b(this.q);
        dVar.a(com.huawei.phoneservice.feedbackcommon.utils.encrypt.d.d(this.e));
        long j2 = this.l;
        if (j2 <= 0) {
            j2 = 33554432;
        }
        dVar.b(j2);
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            b(false);
            return;
        }
        this.m = fileArrListFiles.length;
        this.r = 0L;
        for (File file2 : fileArrListFiles) {
            ad adVar = new ad();
            adVar.a(ZipUtil.fileSha256(file2));
            adVar.d(file2.length());
            arrayList.add(adVar);
            this.r += file2.length();
        }
        String strC = "";
        e("getUploadInfo", "zipFileSize:" + this.r, "");
        dVar.a(this.r);
        dVar.e(fileArrListFiles.length);
        dVar.a(arrayList);
        String strMapToString = ZipUtil.mapToString(new Gson().toJson(dVar));
        try {
            strC = l.c(FeedbackWebConstants.UPLOAD_INFO + sdk2, strMapToString, this.h);
        } catch (UnsupportedEncodingException e2) {
            com.huawei.phoneservice.faq.base.util.g.c("UploadZipTask", e2.getMessage());
        }
        Map<String, String> commonHeaderParameter = ZipUtil.getCommonHeaderParameter(strC);
        WeakReference<Submit> weakReference = this.f21900a;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f21900a = new WeakReference<>(c(sdk2, file, strMapToString, commonHeaderParameter));
    }

    static /* synthetic */ int d(q qVar) {
        int i2 = qVar.n;
        qVar.n = i2 + 1;
        return i2;
    }

    private NotifyUploadZipListener e() {
        WeakReference<NotifyUploadZipListener> weakReference = this.o;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        File file = new File(this.p);
        com.huawei.phoneservice.feedbackcommon.entity.l lVar = new com.huawei.phoneservice.feedbackcommon.entity.l();
        lVar.c(this.q);
        long j2 = this.l;
        if (j2 <= 0) {
            j2 = 33554432;
        }
        lVar.a(j2);
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            b(false);
            return;
        }
        this.m = fileArrListFiles.length;
        this.r = 0L;
        for (File file2 : fileArrListFiles) {
            ad adVar = new ad();
            adVar.a(ZipUtil.fileSha256(file2));
            adVar.d(file2.length());
            arrayList.add(adVar);
            this.r += file2.length();
        }
        e("getFeedbackUploadInfo", "zipFileSize:" + this.r, "");
        lVar.b(this.r);
        lVar.c(fileArrListFiles.length);
        lVar.a(arrayList);
        String json = new Gson().toJson(lVar);
        this.f21900a = new WeakReference<>(com.huawei.phoneservice.feedbackcommon.utils.c.f21899b.getFeedbackUploadInfo(this.e, d("POST", FeedbackWebConstants.FEEDBACK_UPLOAD_INFO, json), json, new b(file)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, String str2, String str3) {
        com.huawei.phoneservice.faq.base.util.g.a("UploadZipTask", "Request Error in " + str + " resCode is " + str2 + " reason is " + str3);
        com.huawei.phoneservice.faq.base.tracker.c.e(str2, str3, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(File file, int i2) {
        String strC;
        String sdk = com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_SHASN);
        String sdk2 = com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_LOG_SERVER_APPID);
        t tVar = new t(sdk, this.j);
        tVar.e(this.k);
        String strMapToString = ZipUtil.mapToString(new Gson().toJson(tVar));
        try {
            strC = l.c(FeedbackWebConstants.NEW_UPLOAD_INFO + sdk2, strMapToString, this.h);
        } catch (UnsupportedEncodingException e2) {
            com.huawei.phoneservice.faq.base.util.g.c("UploadZipTask", e2.getMessage());
            strC = "";
        }
        Map<String, String> commonHeaderParameter = ZipUtil.getCommonHeaderParameter(strC);
        WeakReference<Submit> weakReference = this.f21900a;
        if (weakReference != null) {
            weakReference.clear();
        }
        Submit newUploadInfo = com.huawei.phoneservice.feedbackcommon.utils.c.f21899b.getNewUploadInfo(this.e, commonHeaderParameter, strMapToString, sdk2, this.i);
        c(file, i2, newUploadInfo);
        this.f21900a = new WeakReference<>(newUploadInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Response response) throws IOException {
        String strC;
        String strValueOf = "400";
        try {
            s sVar = (s) new Gson().fromJson(StringUtils.byte2Str(response.getBody().bytes()), s.class);
            if (sVar == null || sVar.d() != 0) {
                if (sVar != null) {
                    strValueOf = String.valueOf(sVar.d());
                    strC = sVar.c();
                } else {
                    strC = "failure";
                }
                e("getServerDomain", strValueOf, strC);
                b(false);
                return;
            }
            e("getServerDomain", "200", "success");
            this.h = sVar.e();
            this.i = "https://" + sVar.a();
            b();
        } catch (JsonSyntaxException unused) {
            e("getServerDomain", "400", "JsonSyntaxException");
            b(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        com.huawei.phoneservice.feedbackcommon.entity.o oVar = new com.huawei.phoneservice.feedbackcommon.entity.o();
        oVar.b(new SimpleDateFormat(FeedbackWebConstants.TIME_FORMATS, Locale.US).format(new Date()));
        oVar.d(this.k);
        String json = new Gson().toJson(oVar);
        Map<String, String> mapD = d("POST", FeedbackWebConstants.FEEDBACK_NOTIFY_SUCCESS, json);
        e("notifyUploadSuccess", "0", "start");
        Submit submitFeedbackNotifySuccess = com.huawei.phoneservice.feedbackcommon.utils.c.f21899b.feedbackNotifySuccess(this.e, mapD, json, new g());
        WeakReference<Submit> weakReference = this.f21900a;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f21900a = new WeakReference<>(submitFeedbackNotifySuccess);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        NotifyUploadZipListener notifyUploadZipListenerE = e();
        if (notifyUploadZipListenerE != null) {
            notifyUploadZipListenerE.notifyUpload(this.f, z);
        }
    }

    private void d(String str, Map<String, String> map, File file, int i2, String str2, String str3, int i3) {
        WeakReference<Submit> weakReference = this.f21900a;
        if (weakReference != null) {
            weakReference.clear();
        }
        Submit fileUploadToService = com.huawei.phoneservice.feedbackcommon.utils.c.f21899b.getFileUploadToService(this.e, str, map, file, str2, str3);
        d dVar = new d(file, str, i2, i3);
        e("uploadFile", "0", "start");
        if (fileUploadToService != null) {
            fileUploadToService.enqueue(dVar);
            this.f21900a = new WeakReference<>(fileUploadToService);
        }
    }

    private void c(String str) {
        String strC;
        String sdk = com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_SHASN);
        String sdk2 = com.huawei.phoneservice.faq.base.util.i.d().getSdk(FaqConstants.FAQ_LOG_SERVER_APPID);
        this.j = com.huawei.phoneservice.faq.base.util.i.d().getSdk("country");
        String strMapToString = ZipUtil.mapToString(new Gson().toJson(new com.huawei.phoneservice.feedbackcommon.entity.a(sdk, this.j)));
        try {
            strC = l.c(FeedbackWebConstants.SERVER_DOMAIN + sdk2, strMapToString, str);
        } catch (UnsupportedEncodingException e2) {
            com.huawei.phoneservice.faq.base.util.g.c("UploadZipTask", e2.getMessage());
            strC = "";
        }
        Map<String, String> commonHeaderParameter = ZipUtil.getCommonHeaderParameter(strC);
        WeakReference<Submit> weakReference = this.f21900a;
        if (weakReference != null) {
            weakReference.clear();
        }
        e("getServerDomain", "0", "start");
        this.f21900a = new WeakReference<>(com.huawei.phoneservice.feedbackcommon.utils.c.f21899b.getServerDomain(this.e, commonHeaderParameter, strMapToString, sdk2, new e()));
    }

    private void c(File file, int i2, Submit submit) {
        if (submit == null) {
            return;
        }
        submit.enqueue(new i(file, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(File file, int i2) {
        com.huawei.phoneservice.feedbackcommon.entity.g gVar = new com.huawei.phoneservice.feedbackcommon.entity.g();
        gVar.d(this.k);
        String json = new Gson().toJson(gVar);
        Map<String, String> mapD = d("POST", FeedbackWebConstants.FEEDBACK_NEW_UPLOAD_INFO, json);
        WeakReference<Submit> weakReference = this.f21900a;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f21900a = new WeakReference<>(com.huawei.phoneservice.feedbackcommon.utils.c.f21899b.getFeedbackNewUploadInfo(this.e, mapD, json, new h(file, i2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.huawei.phoneservice.feedbackcommon.entity.q qVar, File file, int i2) {
        this.k = qVar.e();
        HashMap map = new HashMap(16);
        for (int i3 = 0; i3 < qVar.b().size(); i3++) {
            try {
                for (Map.Entry<String, String> entry : qVar.b().get(i3).c().entrySet()) {
                    if (entry.getKey() != null && entry.getValue() != null) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                }
                d(qVar.b().get(i3).b(), map, file, i2, qVar.b().get(i3).a(), qVar.b().get(i3).c().get("Content-Type"), 1);
            } catch (NumberFormatException e2) {
                com.huawei.phoneservice.faq.base.util.g.c("UploadZipTask", e2.getMessage());
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(com.huawei.phoneservice.feedbackcommon.entity.m mVar, File file) {
        if (mVar == null) {
            b((com.huawei.phoneservice.feedbackcommon.entity.j) null);
            return;
        }
        String strC = mVar.c();
        com.huawei.phoneservice.feedbackcommon.entity.j jVarB = mVar.b();
        if (!"200".equals(strC) || jVarB == null) {
            if (!"tsms.auth.token.expired.60006".equals(strC) && !"tsms.ak.restore.failed.60009".equals(strC) && !"tsms.critical.exipred.60010".equals(strC)) {
                b((com.huawei.phoneservice.feedbackcommon.entity.j) null);
                return;
            } else if (this.v) {
                b((com.huawei.phoneservice.feedbackcommon.entity.j) null);
                this.v = false;
                return;
            } else {
                c(1, (File) null, 0);
                this.v = true;
                return;
            }
        }
        if (jVarB.c() == 0) {
            e("getUploadInfo", "200", "success");
            this.k = jVarB.e();
            c(jVarB, jVarB.d().size(), file);
            return;
        }
        if (jVarB.c() == 200002) {
            try {
                int i2 = Integer.parseInt(jVarB.b().a());
                if (this.m <= i2) {
                    c(jVarB, jVarB.d().size(), file);
                    return;
                }
                this.l = ((long) Math.ceil(this.r / ((double) i2))) + 1048576;
                ZipUtil.deleteFile(new File(FeedbackWebConstants.getZipFilePath(this.e)));
                d(this.l);
                return;
            } catch (Exception unused) {
            }
        }
        b(jVarB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(com.huawei.phoneservice.feedbackcommon.entity.n nVar) {
        if (nVar == null) {
            e("notifyUploadSuccess", "400", "failure");
        } else {
            String strA = nVar.a();
            y yVarB = nVar.b();
            if ("200".equals(strA) && yVarB != null) {
                if (yVarB.a() == 0) {
                    this.d = true;
                    e("notifyUploadSuccess", "200", "success");
                } else {
                    e("notifyUploadSuccess", nVar.a(), nVar.d());
                }
            }
            if ("tsms.auth.token.expired.60006".equals(strA) || "tsms.ak.restore.failed.60009".equals(strA) || "tsms.critical.exipred.60010".equals(strA)) {
                if (!this.u) {
                    c(3, (File) null, 0);
                    this.u = true;
                    return;
                } else {
                    e("notifyUploadSuccess", nVar.a(), nVar.d());
                    this.u = false;
                }
            }
        }
        b(this.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(com.huawei.phoneservice.feedbackcommon.entity.h hVar, File file, int i2, Submit submit) {
        if (hVar == null) {
            e("getNewUploadInfo", "400", "failure");
            b(false);
            return;
        }
        String strD = hVar.d();
        com.huawei.phoneservice.feedbackcommon.entity.q qVarB = hVar.b();
        if ("200".equals(strD) && qVarB != null) {
            if (qVarB.c() == 0) {
                b(qVarB, file, i2);
                return;
            }
            e("getNewUploadInfo", String.valueOf(qVarB.c()), qVarB.a());
            int i3 = this.s + 1;
            this.s = i3;
            if (this.n + i3 > i2) {
                WeakReference<Submit> weakReference = this.f21900a;
                if (weakReference != null && weakReference.get() != null && submit.equals(this.f21900a.get())) {
                    this.f21900a.get().cancel();
                    this.f21900a.clear();
                }
                b(false);
                return;
            }
        }
        if (!"tsms.auth.token.expired.60006".equals(strD) && !"tsms.ak.restore.failed.60009".equals(strD) && !"tsms.critical.exipred.60010".equals(strD)) {
            b((com.huawei.phoneservice.feedbackcommon.entity.j) null);
        } else if (this.y) {
            b((com.huawei.phoneservice.feedbackcommon.entity.j) null);
            this.y = false;
        } else {
            c(2, file, i2);
            this.y = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(com.huawei.phoneservice.feedbackcommon.entity.j jVar, int i2, File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || i2 != fileArrListFiles.length) {
            b(false);
            return;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            HashMap map = new HashMap(16);
            for (Map.Entry<String, String> entry : jVar.d().get(i3).c().entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    map.put(entry.getKey(), entry.getValue());
                }
            }
            d(jVar.d().get(i3).b(), map, fileArrListFiles[i3], i2, jVar.d().get(i3).a(), jVar.d().get(i3).c().get("Content-Type"), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.huawei.phoneservice.feedbackcommon.entity.j jVar) {
        if (jVar != null) {
            e("getUploadInfo", String.valueOf(jVar.c()), jVar.a());
        } else {
            e("getUploadInfo", "400", "failure");
        }
        b(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Submit submit, int i2) {
        int i3 = this.s + 1;
        this.s = i3;
        if (this.n + i3 > i2) {
            WeakReference<Submit> weakReference = this.f21900a;
            if (weakReference != null && weakReference.get() != null && submit.equals(this.f21900a.get())) {
                this.f21900a.get().cancel();
                this.f21900a.clear();
            }
            b(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Response response) throws IOException {
        boolean z;
        String strD;
        String strValueOf = "400";
        try {
            y yVar = (y) new Gson().fromJson(StringUtils.byte2Str(response.getBody().bytes()), y.class);
            if (yVar == null || yVar.a() != 0) {
                if (yVar != null) {
                    strValueOf = String.valueOf(yVar.a());
                    strD = yVar.d();
                } else {
                    strD = "failure";
                }
                e("notifyUploadSuccess", strValueOf, strD);
            } else {
                this.d = true;
                e("notifyUploadSuccess", "200", "success");
            }
            z = this.d;
        } catch (JsonSyntaxException unused) {
            e("notifyUploadSuccess", "400", "JsonSyntaxException");
            z = false;
        }
        b(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(long j2) {
        NotifyUploadZipListener notifyUploadZipListenerE = e();
        if (notifyUploadZipListenerE != null) {
            notifyUploadZipListenerE.notifyUploadAgain(j2);
        }
    }

    private void c(int i2, File file, int i3) {
        new Thread(new c(i2, file, i3)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i2, Submit submit) {
        int i3 = this.n;
        if (i3 == i2) {
            e("uploadFile", "200", "success");
            if (this.t) {
                d();
                return;
            } else {
                j();
                return;
            }
        }
        if (this.s + i3 > i2) {
            WeakReference<Submit> weakReference = this.f21900a;
            if (weakReference != null && weakReference.get() != null && this.f21900a.get().equals(submit)) {
                this.f21900a.get().cancel();
                this.f21900a.clear();
            }
            e("uploadFile", "400", "failure");
            b(false);
        }
    }

    private Map<String, String> d(String str, String str2, String str3) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str3) && this.w != null && this.x != null) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                String sdk = com.huawei.phoneservice.faq.base.util.i.d().getSdk("channel");
                String strSignBase64 = new CredentialSigner.Builder().withCredential(this.w).withCredentialClient(this.x).build().getSignHandler().from((str + '&' + str2 + Constants.PARAM_SERVER_SPLIT + str3 + "&appid=" + sdk + "&timestamp=" + jCurrentTimeMillis).getBytes(StandardCharsets.UTF_8)).signBase64();
                StringBuilder sb = new StringBuilder("CLOUDSOA-HMAC-SHA256 appid=");
                sb.append(sdk);
                sb.append(", timestamp=");
                sb.append(jCurrentTimeMillis);
                sb.append(", signature=\"");
                sb.append(strSignBase64);
                sb.append('\"');
                map.put("Authorization", sb.toString());
                String accessKey = this.w.getAccessKey();
                if (accessKey != null) {
                    map.put("X-UCS-AK", accessKey);
                }
                if (sdk != null) {
                    map.put("channelId", sdk);
                }
                String sdkVersion = com.huawei.phoneservice.faq.base.util.i.d().getSdkVersion();
                if (sdkVersion != null) {
                    map.put("sdkVersion", sdkVersion);
                    return map;
                }
            } catch (yqe | yqj e2) {
                com.huawei.phoneservice.faq.base.util.g.c("UploadZipTask", e2.getMessage());
            }
        }
        return map;
    }

    class a implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f21969a;

        @Override // com.huawei.hms.framework.network.restclient.hwhttp.Callback
        public void onResponse(Submit submit, Response response) throws IOException {
            try {
                com.huawei.phoneservice.feedbackcommon.entity.j jVar = (com.huawei.phoneservice.feedbackcommon.entity.j) new Gson().fromJson(StringUtils.byte2Str(response.getBody().bytes()), com.huawei.phoneservice.feedbackcommon.entity.j.class);
                if (jVar != null && jVar.c() == 0) {
                    q.this.e("getUploadInfo", "200", "success");
                    q.this.k = jVar.e();
                    q.this.c(jVar, jVar.d().size(), this.f21969a);
                    return;
                }
                if (jVar != null && jVar.c() == 200002) {
                    try {
                        int i = Integer.parseInt(jVar.b().a());
                        if (q.this.m <= i) {
                            q.this.c(jVar, jVar.d().size(), this.f21969a);
                            return;
                        }
                        q qVar = q.this;
                        qVar.l = ((long) Math.ceil(qVar.r / ((double) i))) + 1048576;
                        ZipUtil.deleteFile(new File(FeedbackWebConstants.getZipFilePath(q.this.e)));
                        q qVar2 = q.this;
                        qVar2.d(qVar2.l);
                        return;
                    } catch (Exception unused) {
                    }
                }
                q.this.b(jVar);
            } catch (JsonSyntaxException unused2) {
                q.this.e("getUploadInfo", "400", "JsonSyntaxException");
                q.this.b(false);
            }
        }

        @Override // com.huawei.hms.framework.network.restclient.hwhttp.Callback
        public void onFailure(Submit submit, Throwable th) {
            q.this.e("getUploadInfo", "400", "failure");
            q.this.b(false);
        }

        a(File file) {
            this.f21969a = file;
        }
    }

    class b implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f21970a;

        @Override // com.huawei.hms.framework.network.restclient.hwhttp.Callback
        public void onResponse(Submit submit, Response response) throws IOException {
            try {
                q.this.e((com.huawei.phoneservice.feedbackcommon.entity.m) new Gson().fromJson(StringUtils.byte2Str(response.getBody().bytes()), com.huawei.phoneservice.feedbackcommon.entity.m.class), this.f21970a);
            } catch (JsonSyntaxException unused) {
                q.this.e("getUploadInfo", "400", "JsonSyntaxException");
                q.this.b(false);
            }
        }

        @Override // com.huawei.hms.framework.network.restclient.hwhttp.Callback
        public void onFailure(Submit submit, Throwable th) {
            q.this.e("getUploadInfo", "400", "failure");
            q.this.b(false);
        }

        b(File file) {
            this.f21970a = file;
        }
    }

    class d implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f21973a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f21974b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21975c;
        final /* synthetic */ File d;

        @Override // com.huawei.hms.framework.network.restclient.hwhttp.Callback
        public void onResponse(Submit submit, Response response) throws IOException {
            int code = response == null ? 0 : response.getCode();
            if (200 == code) {
                q.this.f.add(new FeedbackZipBean(this.d.getName(), this.f21973a));
                q.d(q.this);
                q.this.e(this.f21975c, submit);
                return;
            }
            int i = this.f21974b;
            if (i == 0) {
                q.g(q.this);
                q.this.a(this.d, this.f21975c);
            } else if (1 == i) {
                q.g(q.this);
            }
            q.this.e(this.f21975c, submit);
            StringBuilder sb = new StringBuilder(" uploadFile ");
            sb.append(code);
            sb.append(" ");
            sb.append(response == null ? "" : response.getMessage());
            com.huawei.phoneservice.faq.base.util.g.a("UploadZipTask", sb.toString());
            q.this.e("uploadFile", "failure", String.valueOf(code));
        }

        @Override // com.huawei.hms.framework.network.restclient.hwhttp.Callback
        public void onFailure(Submit submit, Throwable th) {
            q.this.e("uploadFile", "failure", th == null ? "" : th.getMessage());
            int i = this.f21974b;
            if (i == 0) {
                q.g(q.this);
                if (q.this.t) {
                    q.this.e(this.d, this.f21975c);
                } else {
                    q.this.a(this.d, this.f21975c);
                }
            } else if (1 == i) {
                q.g(q.this);
            }
            q.this.e(this.f21975c, submit);
        }

        d(File file, String str, int i, int i2) {
            this.d = file;
            this.f21973a = str;
            this.f21975c = i;
            this.f21974b = i2;
        }
    }

    class e implements Callback {
        @Override // com.huawei.hms.framework.network.restclient.hwhttp.Callback
        public void onResponse(Submit submit, Response response) throws IOException {
            q.this.c(response);
        }

        @Override // com.huawei.hms.framework.network.restclient.hwhttp.Callback
        public void onFailure(Submit submit, Throwable th) {
            q.this.e("getServerDomain", "400", "failure");
            q.this.b(false);
        }

        e() {
        }
    }

    class g implements Callback {
        @Override // com.huawei.hms.framework.network.restclient.hwhttp.Callback
        public void onResponse(Submit submit, Response response) throws IOException {
            try {
                q.this.c((com.huawei.phoneservice.feedbackcommon.entity.n) new Gson().fromJson(StringUtils.byte2Str(response.getBody().bytes()), com.huawei.phoneservice.feedbackcommon.entity.n.class));
            } catch (JsonSyntaxException unused) {
                q.this.b(false);
                q.this.e("notifyUploadSuccess", "400", "JsonSyntaxException");
            }
        }

        @Override // com.huawei.hms.framework.network.restclient.hwhttp.Callback
        public void onFailure(Submit submit, Throwable th) {
            q.this.b(false);
            q.this.e("notifyUploadSuccess", "400", "failure");
        }

        g() {
        }
    }

    class h implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f21977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f21978b;

        @Override // com.huawei.hms.framework.network.restclient.hwhttp.Callback
        public void onResponse(Submit submit, Response response) throws IOException {
            try {
                q.this.e((com.huawei.phoneservice.feedbackcommon.entity.h) new Gson().fromJson(StringUtils.byte2Str(response.getBody().bytes()), com.huawei.phoneservice.feedbackcommon.entity.h.class), this.f21977a, this.f21978b, submit);
            } catch (JsonSyntaxException unused) {
                q.this.e("getNewUploadInfo", "400", "JsonSyntaxException");
                q.this.b(false);
            }
        }

        @Override // com.huawei.hms.framework.network.restclient.hwhttp.Callback
        public void onFailure(Submit submit, Throwable th) {
            q.this.a(submit, this.f21978b);
        }

        h(File file, int i) {
            this.f21977a = file;
            this.f21978b = i;
        }
    }

    class i implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f21980a;
        final /* synthetic */ File d;

        @Override // com.huawei.hms.framework.network.restclient.hwhttp.Callback
        public void onResponse(Submit submit, Response response) throws IOException {
            try {
                com.huawei.phoneservice.feedbackcommon.entity.q qVar = (com.huawei.phoneservice.feedbackcommon.entity.q) new Gson().fromJson(StringUtils.byte2Str(response.getBody().bytes()), com.huawei.phoneservice.feedbackcommon.entity.q.class);
                if (qVar != null && qVar.c() == 0) {
                    q.this.b(qVar, this.d, this.f21980a);
                    return;
                }
                if (qVar != null) {
                    q.this.e("getNewUploadInfo", String.valueOf(qVar.c()), qVar.a());
                }
                q.this.a(submit, this.f21980a);
            } catch (JsonSyntaxException unused) {
                q.this.e("getNewUploadInfo", "400", "JsonSyntaxException");
                q.this.b(false);
            }
        }

        @Override // com.huawei.hms.framework.network.restclient.hwhttp.Callback
        public void onFailure(Submit submit, Throwable th) {
            q.this.a(submit, this.f21980a);
        }

        i(File file, int i) {
            this.d = file;
            this.f21980a = i;
        }
    }

    class j implements Callback {
        @Override // com.huawei.hms.framework.network.restclient.hwhttp.Callback
        public void onResponse(Submit submit, Response response) throws IOException {
            q.this.e(response);
        }

        @Override // com.huawei.hms.framework.network.restclient.hwhttp.Callback
        public void onFailure(Submit submit, Throwable th) {
            q qVar = q.this;
            qVar.b(qVar.d);
            q.this.e("notifyUploadSuccess", "400", "failure");
        }

        j() {
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f21971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f21972b;
        final /* synthetic */ int e;

        @Override // java.lang.Runnable
        public void run() {
            try {
                q.this.x = new CredentialClient.Builder().context(q.this.e).serCountry(com.huawei.phoneservice.faq.base.util.i.d().getSdk("country")).build();
                if (q.this.x != null) {
                    q qVar = q.this;
                    qVar.w = qVar.x.applyCredential("com.huawei.wisesupport.feedback");
                    if (q.this.w != null) {
                        yqk.b("ucs_entity_key", q.this.w.toString(), q.this.e);
                        int i = this.f21971a;
                        if (i == 2) {
                            q.this.e(this.f21972b, this.e);
                            return;
                        } else if (i != 3) {
                            q.this.c();
                            return;
                        } else {
                            q.this.d();
                            return;
                        }
                    }
                }
                q.this.b(false);
            } catch (yqj e) {
                q.this.b(false);
                com.huawei.phoneservice.faq.base.util.g.c("UploadZipTask", e.getMessage());
            }
        }

        c(int i, File file, int i2) {
            this.f21971a = i;
            this.f21972b = file;
            this.e = i2;
        }
    }

    private Submit c(String str, File file, String str2, Map<String, String> map) {
        e("getUploadInfo", "0", "start");
        return com.huawei.phoneservice.feedbackcommon.utils.c.f21899b.getUploadInfo(this.e, map, str2, str, this.i, new a(file));
    }

    public q(Context context, String str, String str2) {
        this.e = context;
        this.p = str;
        this.q = str2;
    }
}
