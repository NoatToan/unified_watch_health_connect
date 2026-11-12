package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.gson.Gson;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.sportservice.download.listener.AudioResDownloadInterface;
import com.huawei.health.sportservice.download.listener.ResDownloadCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class hav implements AudioResDownloadInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f36330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private hbl f36331b;
    private hbl d;
    private hbh e;
    private String h;
    private String i;
    private CourseApi j;
    private ResDownloadCallback k;
    private hbh l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private haz f36332c = new haz();
    private HashMap<String, Boolean> o = new HashMap<>();
    private int m = 0;
    private int f = 0;
    private boolean g = true;
    private List<String> n = new ArrayList();

    @Override // com.huawei.health.sportservice.download.listener.AudioResDownloadInterface
    public void downAudioResource(Context context, String str, String str2, String str3, ResDownloadCallback resDownloadCallback) {
        this.k = resDownloadCallback;
        c(context, str, str2, str3);
    }

    public void c(final Context context, final String str, String str2, final String str3) {
        this.i = str3;
        d(str, str2, str3);
        LogUtil.a("AudioResourceDownloadUtil", "mBusinessResourceDataKey= ", this.h, "mBaseResourceDataKey= ", this.f36330a);
        ThreadPoolManager.c().execute(new Runnable() { // from class: hay
            @Override // java.lang.Runnable
            public final void run() {
                this.e.b(str, context, str3);
            }
        });
    }

    /* synthetic */ void b(String str, Context context, final String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(d(str));
        hbe.e().b(context, arrayList, new UiCallback<List<hbh>>() { // from class: hav.4
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str3) {
                LogUtil.j("AudioResourceDownloadUtil", "onFailure errorCode ", Integer.valueOf(i), " errorInfo= ", str3);
                hav.this.o.put("commonAudioDownloadState", false);
                hav.this.o.put("audioBusinessCompleteDownloadState", false);
                hav.this.k.onQueryCloudResult(hav.this.o, hav.this.g, 0L);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(List<hbh> list) {
                long jC;
                LogUtil.a("AudioResourceDownloadUtil", "onSuccess = ", str2);
                hav havVar = hav.this;
                havVar.l = havVar.d(list, havVar.f36330a, "Common");
                hav havVar2 = hav.this;
                havVar2.e = havVar2.d(list, havVar2.h, str2);
                if (hav.this.e != null) {
                    jC = hav.this.e.c();
                    hav.this.o.put("audioBusinessCompleteDownloadState", true);
                } else {
                    hav.this.o.put("audioBusinessCompleteDownloadState", false);
                    jC = 0;
                }
                if (hav.this.e != null && hav.this.l != null) {
                    jC += (long) hav.this.l.c();
                    hav.this.o.put("commonAudioDownloadState", true);
                } else {
                    hav.this.o.put("commonAudioDownloadState", false);
                }
                hav.this.k.onQueryCloudResult(hav.this.o, hav.this.g, jC);
            }
        });
    }

    private hbj d(String str) {
        hbj hbjVar = new hbj();
        hbjVar.d(str);
        ArrayList arrayList = new ArrayList();
        int i = CommonUtil.bu() ? 1004 : 4;
        for (int i2 = CommonUtil.bu() ? 1001 : 1; i2 <= i; i2++) {
            arrayList.add(Integer.valueOf(i2));
        }
        hbjVar.d(arrayList);
        LogUtil.a("AudioResourceDownloadUtil", "requestInfo: == ", new Gson().toJson(hbjVar));
        return hbjVar;
    }

    @Override // com.huawei.health.sportservice.download.listener.AudioResDownloadInterface
    public void startDownload() {
        this.f36331b = new hbl(this.l);
        hbh hbhVar = this.l;
        if (hbhVar != null) {
            String strE = e("Common", hbhVar, hbhVar.a());
            this.m += 2;
            a(strE, "commonAudioDownloadState", this.l.a(), this.f36331b, 0);
            hbh hbhVar2 = this.l;
            a(e("Common", hbhVar2, hbhVar2.d()), "Common_Json", this.l.d(), this.f36331b, 1);
        } else {
            LogUtil.a("AudioResourceDownloadUtil", "mVoiceBroadcastInfo = null");
        }
        this.d = new hbl(this.e);
        hbh hbhVar3 = this.e;
        if (hbhVar3 != null) {
            String strE2 = e(this.i, hbhVar3, hbhVar3.a());
            this.m += 2;
            a(strE2, "audioBusinessCompleteDownloadState", this.e.a(), this.d, 0);
            String str = this.i;
            hbh hbhVar4 = this.e;
            a(e(str, hbhVar4, hbhVar4.d()), "Business_json", this.e.d(), this.d, 1);
        } else {
            LogUtil.a("AudioResourceDownloadUtil", "mBusinessInfo = null");
        }
        if (this.e == null && this.l == null) {
            this.k.onInstallSuccess("audioBusinessCompleteDownloadState");
        }
    }

    private void a(final String str, final String str2, String str3, final hbl hblVar, final int i) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("AudioResourceDownloadUtil", "filePath is null");
            b();
        } else {
            CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
            this.j = courseApi;
            courseApi.downloadFile(str3, str, new UiCallback() { // from class: hav.2
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i2, String str4) {
                    LogUtil.j("AudioResourceDownloadUtil", "downloadFile onFailure= ", Integer.valueOf(i2), " errorInfo= ", str4);
                    hav.this.k.onDownloadFail(i2, str4);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onSuccess(Object obj) throws Throwable {
                    LogUtil.j("AudioResourceDownloadUtil", "downloadFile onSuccess ", str2);
                    hav.this.k.onCompleteDownload(str2);
                    hav.this.e(str, str2, hblVar, i);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onProgress(long j, long j2) {
                    super.onProgress(j, j2);
                    hav.this.k.onProgress((int) ((j * 100) / j2), str2);
                }
            }, true);
        }
    }

    public View.OnClickListener d() {
        return new View.OnClickListener() { // from class: hba
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.e(view);
            }
        };
    }

    /* synthetic */ void e(View view) {
        if (this.j != null) {
            LogUtil.a("AudioResourceDownloadUtil", "cancel download");
            hbh hbhVar = this.l;
            if (hbhVar != null) {
                this.j.cancelDownloadCourseMediaFiles(hbhVar.a());
                this.j.cancelDownloadCourseMediaFiles(this.l.d());
            }
            hbh hbhVar2 = this.e;
            if (hbhVar2 != null) {
                this.j.cancelDownloadCourseMediaFiles(hbhVar2.a());
                this.j.cancelDownloadCourseMediaFiles(this.e.d());
                return;
            }
            return;
        }
        LogUtil.j("AudioResourceDownloadUtil", "mCourseApi is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, String str2, hbl hblVar, int i) throws Throwable {
        String str3 = ".zip";
        String strSubstring = null;
        if (str.contains(".zip")) {
            this.n.add(str);
        } else {
            str3 = null;
        }
        if (str.contains(".json")) {
            this.f++;
            hblVar.b(str);
            LogUtil.a("AudioResourceDownloadUtil", "json download success");
            e(str2);
            return;
        }
        if (str3 == null) {
            LogUtil.j("AudioResourceDownloadUtil", "fileFormat is null");
            b();
            return;
        }
        int iLastIndexOf = str.lastIndexOf(str3);
        if (iLastIndexOf > 0 && iLastIndexOf < str.length()) {
            strSubstring = str.substring(0, iLastIndexOf);
        }
        if (TextUtils.isEmpty(strSubstring)) {
            LogUtil.j("AudioResourceDownloadUtil", "downloadFile: unZipFile isEmpty");
            strSubstring = "";
        }
        if (pil.e(str, strSubstring) > -1) {
            this.f++;
            this.k.onCompleteDownload(str2);
            LogUtil.a("AudioResourceDownloadUtil", "downloadFile: unzip success ", this.h);
            if (i == 0) {
                hblVar.e(strSubstring);
            }
            e(str2);
            return;
        }
        b();
        LogUtil.j("AudioResourceDownloadUtil", "downloadFile: unZipFile error");
    }

    private String e(String str, hbh hbhVar, String str2) {
        String strD = fdy.d(str, hbhVar.b() + "_" + hbhVar.i(), str2);
        LogUtil.j("AudioResourceDownloadUtil", "filePath= ", strD);
        return strD;
    }

    private void e(String str) throws Throwable {
        int iB;
        int iC;
        LogUtil.a("AudioResourceDownloadUtil", "mCurrentDownloadSuccessTimes = ", Integer.valueOf(this.f), " mTotalDownloads= ", Integer.valueOf(this.m));
        if (this.f < this.m) {
            return;
        }
        if (this.l == null) {
            iB = this.f36332c.c(this.f36330a);
            iC = this.f36332c.d(this.f36330a);
        } else {
            iB = this.f36331b.b();
            iC = this.f36331b.c();
        }
        b(this.d, this.f36331b, str, iB, iC);
    }

    private void b(hbl hblVar, hbl hblVar2, String str, int i, int i2) throws Throwable {
        if (hblVar2 == null || hblVar == null) {
            LogUtil.j("AudioResourceDownloadUtil", "baseFileInfo == null || businessResourceInfo == null");
            return;
        }
        String strE = hblVar.e();
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j("AudioResourceDownloadUtil", "businessResourcePath is null");
            return;
        }
        if (!new File(strE).exists()) {
            LogUtil.j("AudioResourceDownloadUtil", "businessResourcePath file not exists");
            b();
            return;
        }
        String strE2 = phw.e(new File(strE + File.separator + "scenario.json"));
        if (TextUtils.isEmpty(strE2)) {
            LogUtil.j("AudioResourceDownloadUtil", "scenarioInfo is null");
            b();
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(strE2);
            if (!jSONObject.has("supportService")) {
                LogUtil.j("AudioResourceDownloadUtil", "BUSINESS_RESOURCE_SUPPORT_SERVICE_KEY is not exists");
                b();
                return;
            }
            String string = jSONObject.getString("supportService");
            LogUtil.a("AudioResourceDownloadUtil", "supportVersion = ", string);
            int iE = hbd.e(string, "\\.", 0);
            int iE2 = hbd.e(string, "\\.", 1);
            LogUtil.a("AudioResourceDownloadUtil", "supportServiceVersion = ", Integer.valueOf(iE), " And= ", Integer.valueOf(iE2));
            if (iE > i) {
                LogUtil.j("AudioResourceDownloadUtil", "fail! baseFileInfo ServiceVersion = ", Integer.valueOf(i));
                b();
                return;
            }
            LogUtil.a("AudioResourceDownloadUtil", " baseFileInfo ServiceVersion = ", Integer.valueOf(i), " res ServiceVersion", Integer.valueOf(i2));
            if (iE > 0 && iE >= i && iE2 >= i2) {
                e();
                if (this.l == null) {
                    b(hblVar, this.h);
                } else {
                    b(hblVar, this.h);
                    b(hblVar2, this.f36330a);
                }
                this.k.onInstallSuccess(str);
                a();
                LogUtil.a("AudioResourceDownloadUtil", "save");
                if (a("duyin.dat")) {
                    b("duyin.dat");
                    b("duyin_es.dat");
                    b("duyin_pl.dat");
                    b("i18n.dat");
                    return;
                }
                return;
            }
            b();
            LogUtil.j("AudioResourceDownloadUtil", "version nonmatching");
        } catch (JSONException e) {
            LogUtil.j("AudioResourceDownloadUtil", "JSONException: ", LogAnonymous.b(e));
            b();
        }
    }

    private void e() {
        hbh hbhVar = this.l;
        if (hbhVar == null) {
            hbhVar = this.e;
        }
        String strI = hbhVar.i();
        String strE = pqj.e();
        pqj.b().b(strE, strI);
        LogUtil.a("AudioResourceDownloadUtil", "saveSpeaker is ", strI);
        d(strE, strI, this.i);
    }

    private void d(String str, String str2, String str3) {
        this.h = hbd.e(str, str2, str3);
        this.f36330a = hbd.e(str, str2, "Common");
    }

    private void a() {
        for (String str : this.n) {
            if (!TextUtils.isEmpty(str)) {
                LogUtil.a("AudioResourceDownloadUtil", "delete result is ", Boolean.valueOf(FileUtils.j(new File(str))));
            }
        }
    }

    private void b(hbl hblVar, String str) {
        this.f36332c.e(str, hblVar.e());
        LogUtil.d("AudioResourceDownloadUtil", "mBusinessResourceDataKey=", str, " path=", hblVar.d());
        if (hblVar.d() != null) {
            this.f36332c.d(str, hblVar.d());
        } else {
            LogUtil.j("AudioResourceDownloadUtil", "json file path is null", str);
        }
        this.f36332c.b(str, hblVar.b());
        this.f36332c.a(str, hblVar.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public hbh d(List<hbh> list, String str, String str2) {
        int iC = this.f36332c.c(str);
        int iD = this.f36332c.d(str);
        if (iC > 0 || iD > 0) {
            this.g = false;
        }
        LogUtil.a("AudioResourceDownloadUtil", "localServiceVersion = ", Integer.valueOf(iC), " localResourceVersion= ", Integer.valueOf(iD));
        int i = CommonUtil.bu() ? 1004 : 4;
        int i2 = CommonUtil.bu() ? 1000 : 0;
        hbh hbhVar = null;
        for (hbh hbhVar2 : list) {
            LogUtil.a("AudioResourceDownloadUtil", "voiceBroadcastInfo.getModuleName() = ", hbhVar2.e());
            int iE = hbd.e(hbhVar2.g(), "\\.", 0);
            if (iE <= i && iE >= i2 && hbhVar2.e().equals(str2)) {
                hbhVar = hbhVar2;
            }
        }
        if (hbhVar == null) {
            return null;
        }
        int iE2 = hbd.e(hbhVar.g(), "\\.", 0);
        int iE3 = hbd.e(hbhVar.g(), "\\.", 1);
        LogUtil.a("AudioResourceDownloadUtil", "cloudServiceVersion = ", Integer.valueOf(iE2), " cloudResourceVersion= ", Integer.valueOf(iE3));
        if (iE2 > i || iE3 < i2) {
            LogUtil.j("AudioResourceDownloadUtil", "current version not supported ", Integer.valueOf(i), "localAudioServiceMinVersion");
            return null;
        }
        if (iE2 <= iC && (iE2 != iC || iE3 <= iD)) {
            return null;
        }
        return hbhVar;
    }

    private boolean a(String str) {
        try {
            for (String str2 : BaseApplication.getContext().getAssets().list("")) {
                if (str2.equals(str.trim())) {
                    return true;
                }
            }
            return false;
        } catch (IOException unused) {
            LogUtil.j("AudioResourceDownloadUtil", "IOException fileName = ", str);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:? A[SYNTHETIC] */
    private void b(String str) throws Throwable {
        FileOutputStream fileOutputStream;
        InputStream inputStream = null;
        FileOutputStream fileOutputStream2 = null;
        FileOutputStream fileOutputStream3 = null;
        inputStream = null;
        try {
            File file = new File(BaseApplication.getContext().getFilesDir().getAbsolutePath() + File.separator + str);
            if (!CommonUtil.e(file)) {
                LogUtil.e("AudioResourceDownloadUtil", "file path not valid");
                return;
            }
            if (file.exists()) {
                LogUtil.a("AudioResourceDownloadUtil", "file exists", str);
                return;
            }
            InputStream inputStreamOpen = BaseApplication.getContext().getAssets().open(str);
            try {
                FileOutputStream fileOutputStream4 = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStreamOpen.read(bArr);
                        if (i == -1) {
                            break;
                        } else {
                            fileOutputStream4.write(bArr, 0, i);
                        }
                    }
                    fileOutputStream4.flush();
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (IOException unused) {
                            LogUtil.j("AudioResourceDownloadUtil", "inputStream close IOException");
                        }
                    }
                    try {
                        fileOutputStream4.close();
                    } catch (IOException unused2) {
                        LogUtil.j("AudioResourceDownloadUtil", "fileOutputStream close IOException");
                    }
                } catch (IOException unused3) {
                    fileOutputStream2 = fileOutputStream4;
                    fileOutputStream = fileOutputStream2;
                    inputStream = inputStreamOpen;
                    try {
                        LogUtil.j("AudioResourceDownloadUtil", "write IOException", str);
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused4) {
                                LogUtil.j("AudioResourceDownloadUtil", "inputStream close IOException");
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused5) {
                                LogUtil.j("AudioResourceDownloadUtil", "fileOutputStream close IOException");
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused6) {
                                LogUtil.j("AudioResourceDownloadUtil", "inputStream close IOException");
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                                throw th;
                            } catch (IOException unused7) {
                                LogUtil.j("AudioResourceDownloadUtil", "fileOutputStream close IOException");
                                throw th;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream3 = fileOutputStream4;
                    fileOutputStream = fileOutputStream3;
                    inputStream = inputStreamOpen;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                        throw th;
                    }
                    throw th;
                }
            } catch (IOException unused8) {
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException unused9) {
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    private void b() {
        this.k.onDownloadFail(-1, BaseApplication.getContext().getString(R.string.IDS_update_download_failed));
    }
}
