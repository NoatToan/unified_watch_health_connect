package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;
import com.huawei.featureuserprofile.healthrecord.hicloud.HiCloudApi;
import com.huawei.featureuserprofile.healthrecord.hicloud.HiCloudCbk;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hms.framework.network.restclient.hwhttp.MediaType;
import com.huawei.hms.framework.network.restclient.hwhttp.RequestBody;
import com.huawei.hms.framework.network.restclient.hwhttp.ResponseBody;
import com.huawei.hms.framework.network.restclient.hwhttp.trans.MultipartBody;
import com.huawei.hms.network.base.common.trans.FileBinary;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.VastAttribute;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import com.huawei.ui.commonui.base.BaseActivity;
import health.compact.a.Base64;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class cvu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile cvu f31423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f31424b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HiCloudApi f31425c = (HiCloudApi) oet.d().e(HiCloudApi.class);
    private String d;
    private Context e;

    private cvu(Context context) {
        if (context == null) {
            this.e = BaseApplication.b();
        } else {
            this.e = context.getApplicationContext();
        }
        this.d = GRSManager.c(this.e).getUrl("hiCloudUrl");
    }

    public static cvu b(Context context) {
        if (f31423a == null) {
            synchronized (f31424b) {
                if (f31423a == null) {
                    f31423a = new cvu(BaseApplication.b());
                }
            }
        }
        return f31423a;
    }

    public void a(String str, HiCloudCbk<String> hiCloudCbk) {
        HashMap map = new HashMap();
        map.put("Content-Type", "multipart/related;boundary=OP8XTaXZ0UZs-Sjlefcj2OWskqXWwVQO");
        map.put("Cache-Control", "no-cache");
        map.put("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + LoginInit.getInstance(this.e).getAccountInfo(1015));
        if (CommonUtil.ao()) {
            map.put("version", "abc");
        }
        File file = new File(str);
        if (!file.exists()) {
            ReleaseLogUtil.e("R_HiCloudUtil", "uploadFileByName file not exit");
            hiCloudCbk.onFailure(-1, "file not exit, pls check it");
            return;
        }
        HashMap map2 = new HashMap();
        String strSubstring = System.currentTimeMillis() + file.getName();
        BaseActivity.isMiui();
        if (strSubstring.length() > 250) {
            strSubstring = strSubstring.substring(strSubstring.length() - 250);
        }
        map2.put(ContentResource.FILE_NAME, strSubstring);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add("applicationData");
        map2.put("parentFolder", arrayList);
        MultipartBody.Builder builder = new MultipartBody.Builder("OP8XTaXZ0UZs-Sjlefcj2OWskqXWwVQO");
        builder.setType(MediaType.parse("multipart/related"));
        RequestBody requestBodyCreate = RequestBody.create(MediaType.parse(FileBinary.HEAD_VALUE_CONTENT_TYPE_OCTET_STREAM), new File(str));
        builder.addPart(RequestBody.create(MediaType.parse("application/json"), ofe.c((Object) map2)));
        builder.addPart(requestBodyCreate);
        LogUtil.a("HiCloudUtil", "uploadFileByName req: ", ofe.c((Object) map2));
        try {
            Response<cvw> responseExecute = this.f31425c.uploadFileByName(this.d + "/upload/drive/v1/files?uploadType=multipart&fields=*", map, builder.build()).execute();
            if (responseExecute == null) {
                hiCloudCbk.onFailure(-2, "unknow exception");
                return;
            }
            if (responseExecute.isSuccessful() && responseExecute.getBody() != null) {
                String strB = responseExecute.getBody().b();
                LogUtil.a("HiCloudUtil", "uploadFileByName: ", strB);
                SharedPreferenceManager.e(this.e, "HICLOUD_DATA", strB, str, null);
                hiCloudCbk.onSuccess(strB);
                return;
            }
            c(responseExecute.getErrorBody(), hiCloudCbk);
        } catch (IOException e2) {
            hiCloudCbk.onFailure(-3, VastAttribute.ERROR);
            ReleaseLogUtil.a("R_HiCloudUtil", "uploadFileByName exception: ", ExceptionUtils.c(e2));
        }
    }

    public void b(String str, HiCloudCbk<String> hiCloudCbk) {
        ReleaseLogUtil.d("R_HiCloudUtil", "enter getFileInstream");
        String strE = SharedPreferenceManager.e(this.e, "HICLOUD_DATA", str);
        if (!TextUtils.isEmpty(strE)) {
            String strD = d(strE);
            if (!TextUtils.isEmpty(strD)) {
                hiCloudCbk.onSuccess(strD);
                return;
            }
        }
        HashMap map = new HashMap();
        map.put("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + LoginInit.getInstance(this.e).getAccountInfo(1015));
        try {
            Response<ResponseBody> responseExecute = this.f31425c.downloadFile(this.d + "/drive/v1/files/" + str + "?form=content", map).execute();
            if (responseExecute == null) {
                hiCloudCbk.onFailure(-2, "unknow exception");
            } else if (responseExecute.isSuccessful() && responseExecute.getBody() != null) {
                ReleaseLogUtil.d("R_HiCloudUtil", "getFileInstream from cloud");
                hiCloudCbk.onSuccess(e(responseExecute.getBody().getInputStream()));
            } else {
                c(responseExecute.getErrorBody(), hiCloudCbk);
            }
        } catch (IOException e2) {
            hiCloudCbk.onFailure(-3, VastAttribute.ERROR);
            ReleaseLogUtil.a("HiCloudUtil", "getFileInstream excepotion: ", ExceptionUtils.c(e2));
        }
    }

    public void d(String str, HiCloudCbk<String> hiCloudCbk) {
        ReleaseLogUtil.d("R_HiCloudUtil", "enter getFileAsImage");
        String strE = SharedPreferenceManager.e(this.e, "HICLOUD_DATA", str);
        if (!TextUtils.isEmpty(strE)) {
            String strD = d(strE);
            if (!TextUtils.isEmpty(strD)) {
                hiCloudCbk.onSuccess(strD);
                return;
            }
        }
        HashMap map = new HashMap();
        map.put("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + LoginInit.getInstance(this.e).getAccountInfo(1015));
        try {
            Response<ResponseBody> responseExecute = this.f31425c.downloadImage(this.d + "/drive/v1/thumbnails/" + str + "?form=content", map).execute();
            if (responseExecute == null) {
                hiCloudCbk.onFailure(-2, "unknow exception");
            } else if (responseExecute.isSuccessful() && responseExecute.getBody() != null) {
                hiCloudCbk.onSuccess(e(responseExecute.getBody().getInputStream()));
                ReleaseLogUtil.d("R_HiCloudUtil", "getFileAsImage success");
            } else {
                c(responseExecute.getErrorBody(), hiCloudCbk);
            }
        } catch (IOException e2) {
            hiCloudCbk.onFailure(-3, VastAttribute.ERROR);
            ReleaseLogUtil.a("R_HiCloudUtil", "getFileAsImage exception: ", ExceptionUtils.c(e2));
        }
    }

    public void e(String str, HiCloudCbk<Boolean> hiCloudCbk) {
        HashMap map = new HashMap();
        map.put("Content-Type", HealthEngineRequestManager.CONTENT_TYPE);
        map.put("Cache-Control", "no-cache");
        map.put("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + LoginInit.getInstance(this.e).getAccountInfo(1015));
        try {
            Response<String> responseExecute = this.f31425c.deleteFile(this.d + "/drive/v1/files/" + str, map).execute();
            if (responseExecute == null) {
                hiCloudCbk.onFailure(-2, "unknow exception");
                return;
            }
            if (responseExecute.isSuccessful()) {
                ReleaseLogUtil.d("R_HiCloudUtil", "deleteFileById deleteSuccess");
                hiCloudCbk.onSuccess(true);
                SharedPreferenceManager.b("HICLOUD_DATA", str);
            } else {
                ReleaseLogUtil.d("HiCloudUtil", "deleteFileById please check again");
                c(responseExecute.getErrorBody(), hiCloudCbk);
            }
        } catch (IOException e2) {
            ReleaseLogUtil.a("R_HiCloudUtil", "deleteFileById exception: ", ExceptionUtils.c(e2));
            hiCloudCbk.onFailure(0, "deleteFail");
        }
    }

    private static String d(String str) throws Throwable {
        Throwable th;
        File file = new File(str);
        if (!file.exists()) {
            return "";
        }
        if (!FileUtils.c(file, str)) {
            LogUtil.d("HiCloudUtil", "path_crossing filetoBase64 file is invalid, fileName ", str);
            return "";
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                String strE = e(fileInputStream2);
                FileUtils.a(fileInputStream2);
                return strE;
            } catch (IOException e2) {
                e = e2;
                fileInputStream = fileInputStream2;
                try {
                    ReleaseLogUtil.a("HiCloudUtil", "filetoBase64 IOException: ", ExceptionUtils.c(e));
                    FileUtils.a(fileInputStream);
                    return "";
                } catch (Throwable th2) {
                    fileInputStream2 = fileInputStream;
                    th = th2;
                    th = th;
                    fileInputStream = fileInputStream2;
                    FileUtils.a(fileInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                fileInputStream = fileInputStream2;
                FileUtils.a(fileInputStream);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (Throwable th4) {
            th = th4;
            FileUtils.a(fileInputStream);
            throw th;
        }
    }

    private static String e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            if (inputStream == null) {
                ReleaseLogUtil.a("HiCloudUtil", "inputStreamToBase64 in is null");
            } else {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                }
                byteArrayOutputStream.flush();
            }
        } catch (IOException e2) {
            ReleaseLogUtil.e("HiCloudUtil", "inputStreamToBase64 error: ", ExceptionUtils.c(e2));
        } finally {
            FileUtils.a(inputStream);
            FileUtils.a(byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        return Base64.a(byteArray, 0, byteArray.length);
    }

    private void c(byte[] bArr, HiCloudCbk hiCloudCbk) {
        String str = new String(bArr, StandardCharsets.UTF_8);
        ReleaseLogUtil.d("HiCloudUtil", "dealErrorCode errorCode: ", str);
        try {
            c cVar = (c) HiJsonUtil.d(str, c.class);
            if (cVar != null && cVar.e() != null && !njy.e(cVar.e().get("errorDetail"))) {
                List<e> list = cVar.e().get("errorDetail");
                hiCloudCbk.onFailure(Integer.parseInt(list.get(0).b()), list.get(0).d());
                return;
            }
            d dVar = (d) HiJsonUtil.d(str, d.class);
            if (dVar != null && dVar.a() != null && !njy.e(dVar.a().d())) {
                List<e> listD = dVar.a().d();
                hiCloudCbk.onFailure(Integer.parseInt(listD.get(0).b()), listD.get(0).d());
            } else {
                hiCloudCbk.onFailure(-2, "error return from HiCloud");
            }
        } catch (JsonParseException | NumberFormatException e2) {
            ReleaseLogUtil.a("HiCloudUtil", "dealErrorCode error: ", ExceptionUtils.c(e2));
            hiCloudCbk.onFailure(-2, ExceptionUtils.c(e2));
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    static class d {

        @SerializedName(VastAttribute.ERROR)
        private c e;

        private d() {
        }

        public c a() {
            return this.e;
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("description")
        private String f31426a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("code")
        private String f31427c;

        @SerializedName(VastAttribute.ERROR)
        private Map<String, List<e>> d;

        @SerializedName("errorDetail")
        private List<e> e;

        private c() {
        }

        public Map<String, List<e>> e() {
            return this.d;
        }

        public List<e> d() {
            return this.e;
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("reason")
        private String f31428a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("errorCode")
        private String f31429c;

        @SerializedName("description")
        private String e;

        private e() {
        }

        public String d() {
            return this.e;
        }

        public String b() {
            return this.f31429c;
        }
    }
}
