package defpackage;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.common.security.SecurityUtils;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hms.framework.network.restclient.hwhttp.MediaType;
import com.huawei.hms.framework.network.restclient.hwhttp.RequestBody;
import com.huawei.hwcloudmodel.contentcenter.ContentCenterApi;
import com.huawei.hwcloudmodel.contentcenter.UploadProgressListener;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes37.dex */
public class lok {
    public List<lpf> e(List<String> list, int i, int i2, UploadProgressListener uploadProgressListener) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (d(it.next(), uploadProgressListener)) {
                return Collections.EMPTY_LIST;
            }
        }
        return b(list, i, i2, uploadProgressListener);
    }

    private boolean d(String str, UploadProgressListener uploadProgressListener) {
        File file = new File(str);
        if (!FileUtils.a(file)) {
            LogUtil.e("MomentsPublishManager", "filePath illegal");
            uploadProgressListener.onError(1, "filePath illegal");
            return true;
        }
        if (e(file.getName())) {
            return false;
        }
        LogUtil.e("MomentsPublishManager", "filename invalid");
        uploadProgressListener.onError(1, "filename invalid");
        return true;
    }

    private boolean e(String str) {
        return str.replace(".", "").matches("[a-zA-Z0-9]+");
    }

    private List<lpf> b(List<String> list, int i, int i2, UploadProgressListener uploadProgressListener) {
        ArrayList arrayList = new ArrayList();
        lpe lpeVarC = c(list, i, i2);
        LogUtil.a("MomentsPublishManager", "file extract done req is : ", lpeVarC);
        lpg lpgVarD = lqo.b(BaseApplication.b()).d(lpeVarC);
        if (lpgVarD == null) {
            LogUtil.e("MomentsPublishManager", "UploadFileInfoRsp null");
            uploadProgressListener.onError(2, "UploadFileInfoRsp null");
            return Collections.EMPTY_LIST;
        }
        List<lpa> listC = lpgVarD.c();
        if (d(list, uploadProgressListener, listC)) {
            return Collections.EMPTY_LIST;
        }
        float size = 0.0f;
        for (int i3 = 0; i3 < listC.size(); i3++) {
            lpa lpaVar = listC.get(i3);
            LogUtil.d("MomentsPublishManager", "fileId:", lpaVar.b(), " filename:", lpaVar.c(), " headers:", lpaVar.e(), " method:", lpaVar.d(), " url:", lpaVar.a());
            lpf.e eVar = new lpf.e();
            if (lpaVar.c().contains(".webp")) {
                eVar.c(lpaVar.b());
                eVar.a(list.get(i3));
            }
            if (lpaVar.c().contains(".mp4")) {
                eVar.d(lpaVar.b());
                eVar.e(list.get(i3));
            }
            arrayList.add(eVar.e());
            if (TextUtils.isEmpty(lpaVar.d()) || TextUtils.isEmpty(lpaVar.a()) || lpaVar.e() == null) {
                LogUtil.e("MomentsPublishManager", "fileUploadInfo param null");
                uploadProgressListener.onError(2, "fileUploadInfo param null");
                return Collections.EMPTY_LIST;
            }
            if (b(lpaVar, list.get(i3))) {
                size += 1.0f / listC.size();
                LogUtil.a("MomentsPublishManager", "uploadFile progress:", Float.valueOf(size));
                uploadProgressListener.onProgress(Math.min(size, 1.0f));
            } else {
                uploadProgressListener.onError(3, "upload file fail at index:" + i3);
                return Collections.EMPTY_LIST;
            }
        }
        d(uploadProgressListener, size);
        return arrayList;
    }

    private lpe c(List<String> list, int i, int i2) {
        lpe lpeVar = new lpe();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b(it.next(), i, i2));
        }
        lpeVar.b(arrayList);
        return lpeVar;
    }

    private boolean d(List<String> list, UploadProgressListener uploadProgressListener, List<lpa> list2) {
        if (njy.e(list2)) {
            LogUtil.e("MomentsPublishManager", "empty fileUploadInfos");
            uploadProgressListener.onError(2, "empty fileUploadInfos");
            return true;
        }
        if (list2.size() == list.size()) {
            return false;
        }
        LogUtil.e("MomentsPublishManager", "fileUploadInfos size error");
        uploadProgressListener.onError(2, "fileUploadInfos size error");
        return true;
    }

    private void d(UploadProgressListener uploadProgressListener, float f) {
        if (f < 1.0f) {
            uploadProgressListener.onProgress(1.0f);
        }
    }

    private boolean b(lpa lpaVar, String str) {
        lov lovVar = new lov();
        lovVar.b(lpaVar.e());
        lovVar.c(lpaVar.d());
        lovVar.d(lpaVar.a());
        return a(lovVar, str);
    }

    private boolean a(lov lovVar, String str) {
        Response<String> responseExecute;
        String strA = lovVar.a();
        if (strA == null) {
            LogUtil.e("MomentsPublishManager", " uploadMethod null");
            return false;
        }
        String upperCase = strA.toUpperCase(Locale.ENGLISH);
        if (!ProfileRequestConstants.PUT_TYPE.equals(upperCase) && !"POST".equals(upperCase)) {
            LogUtil.j("MomentsPublishManager", "support put | post only now");
            return false;
        }
        HashMap map = new HashMap();
        for (String str2 : lovVar.c().keySet()) {
            map.put(str2, lovVar.c().get(str2).getAsString());
        }
        LogUtil.d("MomentsPublishManager", "uploadFile Headers:", map);
        if (!map.containsKey("Content-Type")) {
            LogUtil.j("MomentsPublishManager", "content-type not in headers");
            return false;
        }
        LogUtil.d("MomentsPublishManager", "partFilePath:", str, " partFileSize:", Long.valueOf(new File(str).length()));
        RequestBody requestBodyCreate = RequestBody.create(MediaType.parse((String) map.get("Content-Type")), new File(str));
        ContentCenterApi contentCenterApi = (ContentCenterApi) oet.d().e(ContentCenterApi.class);
        if (contentCenterApi == null) {
            LogUtil.e("MomentsPublishManager", "upload to ContentCenter api null");
            return false;
        }
        try {
            LogUtil.d("MomentsPublishManager", "requestBody content-length:", Long.valueOf(requestBodyCreate.contentLength()));
            if (ProfileRequestConstants.PUT_TYPE.equals(upperCase)) {
                responseExecute = contentCenterApi.putToContentCenter(lovVar.d(), map, requestBodyCreate).execute();
            } else {
                responseExecute = contentCenterApi.postToContentCenter(lovVar.d(), map, requestBodyCreate).execute();
            }
            if (responseExecute == null) {
                LogUtil.e("MomentsPublishManager", "upload to ContentCenter rsp null");
                return false;
            }
            if (responseExecute.isSuccessful()) {
                LogUtil.a("MomentsPublishManager", "upload success");
                return true;
            }
            LogUtil.e("MomentsPublishManager", "upload fail:", Integer.valueOf(responseExecute.getCode()), responseExecute.getErrorBody());
            return false;
        } catch (IOException e) {
            LogUtil.j("MomentsPublishManager", "upload exception:", e.getMessage());
        }
    }

    private lot b(String str, int i, int i2) {
        File file = new File(str);
        lot lotVar = new lot();
        lotVar.b(i);
        lotVar.d(1);
        lotVar.a(file.getName());
        lotVar.e((int) file.length());
        lotVar.d(SecurityUtils.d(file));
        lotVar.c(i2);
        return lotVar;
    }
}
