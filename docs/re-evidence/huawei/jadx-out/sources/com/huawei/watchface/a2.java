package com.huawei.watchface;

import android.text.TextUtils;
import com.huawei.watchface.api.ResponseListener;
import com.huawei.watchface.mvp.model.datatype.FileCreateResponse;
import com.huawei.watchface.mvp.model.datatype.MaterialFileInfo;
import com.huawei.watchface.mvp.model.datatype.MaterialFileUploadInfo;
import com.huawei.watchface.mvp.model.datatype.WiseContentHeaders;
import com.huawei.watchface.utils.FileHelper;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.callback.OperateWatchFaceCallback;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes20.dex */
public class a2 {
    public static a2 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f30049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f30050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public OperateWatchFaceCallback f30051c;

    public class a implements ResponseListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30052a;

        public a(String str) {
            this.f30052a = str;
        }

        @Override // com.huawei.watchface.api.ResponseListener
        public void onError() {
            OperateWatchFaceCallback operateWatchFaceCallback = a2.this.f30051c;
            if (operateWatchFaceCallback == null) {
                HwLog.i("HwSearchImageManager", "sendUploadImage mOperateWatchFaceCallback is null");
            } else {
                operateWatchFaceCallback.transmitUploadImageResult(201, this.f30052a);
            }
        }

        @Override // com.huawei.watchface.api.ResponseListener
        public void onResponse(Integer num) {
            if (a2.this.f30051c == null) {
                HwLog.i("HwSearchImageManager", "sendUploadImage mOperateWatchFaceCallback is null");
                return;
            }
            HwLog.i("HwSearchImageManager", "sendUploadImage onResponse is " + num);
            a2.this.f30051c.transmitUploadImageResult(num.intValue(), this.f30052a);
        }
    }

    public static a2 b() {
        if (d == null) {
            synchronized (a2.class) {
                if (d == null) {
                    d = new a2();
                }
            }
        }
        return d;
    }

    public void a(OperateWatchFaceCallback operateWatchFaceCallback) {
        this.f30051c = operateWatchFaceCallback;
    }

    public void c(String str) {
        if (this.f30051c == null) {
            HwLog.i("HwSearchImageManager", "transmitSearchToImgCutResult mOperateWatchFaceCallback is null");
        } else {
            if (TextUtils.isEmpty(str)) {
                this.f30051c.transmitSelectImageFailed();
                return;
            }
            this.f30049a = str;
            this.f30051c.transmitSearchToImgCut();
            e();
        }
    }

    public final String d() {
        return UUID.randomUUID().toString();
    }

    public final void e() {
        t0 t0Var = new t0(c());
        FileCreateResponse fileCreateResponseB = t0Var.b(t0Var.g());
        if (fileCreateResponseB == null) {
            HwLog.i("HwSearchImageManager", "fileCreateResponse is null");
            this.f30051c.transmitUploadImageResult(201, null);
            return;
        }
        if (fileCreateResponseB.getResultCode() != 0) {
            HwLog.e("HwSearchImageManager", "fileCreate response is failed result code is :" + fileCreateResponseB.getResultCode());
            this.f30051c.transmitUploadImageResult(fileCreateResponseB.getResultCode(), null);
            return;
        }
        HwLog.i("HwSearchImageManager", "fileCreate is successful");
        MaterialFileUploadInfo materialFileUploadInfo = fileCreateResponseB.getMaterialFileUploadInfo().get(0);
        a(materialFileUploadInfo.getUploadInfo().getUrl(), a(materialFileUploadInfo.getUploadInfo().getHeaders()), FileHelper.f(this.f30049a), materialFileUploadInfo.getFileId());
    }

    public String a() {
        return TextUtils.isEmpty(this.f30049a) ? "" : s.b(this.f30049a);
    }

    public final void a(String str, LinkedHashMap linkedHashMap, File file, String str2) {
        new m2(str, linkedHashMap, file, new a(str2));
    }

    public final LinkedHashMap a(WiseContentHeaders wiseContentHeaders) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            linkedHashMap.put("x-amz-content-sha256", wiseContentHeaders.getSha256Value().toLowerCase(Locale.ENGLISH));
            linkedHashMap.put("Authorization", wiseContentHeaders.getAuthorization());
            linkedHashMap.put("x-amz-date", wiseContentHeaders.getRequestTime());
            linkedHashMap.put("Host", wiseContentHeaders.getHost());
            linkedHashMap.put("Content-Type", wiseContentHeaders.getContentType());
            return linkedHashMap;
        } catch (Exception e) {
            HwLog.i("HwSearchImageManager", "Upload headers error " + HwLog.printException(e));
            return linkedHashMap;
        }
    }

    public void b(String str) {
        OperateWatchFaceCallback operateWatchFaceCallback = this.f30051c;
        if (operateWatchFaceCallback == null) {
            HwLog.i("HwSearchImageManager", "transmitOperationType mOperateWatchFaceCallback is null");
        } else {
            operateWatchFaceCallback.transmitOperationScene(str);
        }
    }

    public final List c() throws Throwable {
        ArrayList arrayList = new ArrayList();
        try {
            MaterialFileInfo materialFileInfo = new MaterialFileInfo();
            File fileF = FileHelper.f(this.f30049a);
            if (fileF == null) {
                HwLog.e("HwSearchImageManager", "getMaterialInfo bitmapFile is null");
                return arrayList;
            }
            String name = fileF.getName();
            String path = fileF.getPath();
            materialFileInfo.setFileName(name);
            materialFileInfo.setIndex("1");
            materialFileInfo.setAppContentId(d());
            materialFileInfo.setFileSha256(FileHelper.sha256File(path).toLowerCase(Locale.ENGLISH));
            materialFileInfo.setContentType(100);
            byte[] bArrB = FileHelper.b(fileF);
            materialFileInfo.setFileSize(bArrB == null ? 0 : bArrB.length);
            arrayList.add(materialFileInfo);
            return arrayList;
        } catch (Exception e) {
            HwLog.i("HwSearchImageManager", "fileCreate error " + HwLog.printException(e));
            return arrayList;
        }
    }

    public void a(String str) {
        HwLog.i("HwSearchImageManager", "choosePicToH5Search routIndex:" + str);
        this.f30050b = str;
        OperateWatchFaceCallback operateWatchFaceCallback = this.f30051c;
        if (operateWatchFaceCallback != null) {
            operateWatchFaceCallback.chooseToClip(4, false);
        }
    }

    public void a(boolean z, boolean z2) {
        HwLog.i("HwSearchImageManager", "cancelSearchImage isGoBack:" + z2);
        OperateWatchFaceCallback operateWatchFaceCallback = this.f30051c;
        if (operateWatchFaceCallback != null) {
            operateWatchFaceCallback.cancelSearchImage(z, z2);
        }
        l2.a();
    }
}
