package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.basefitnessadvice.callback.DataCallback;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.Media;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.health.sport.utils.ResultUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.jsoperation.JsUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public class gmb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Media> f35657b;
    private c e;
    private volatile boolean f;
    private long h;
    private volatile List<Media> j;
    private long m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f35656a = new Handler(Looper.getMainLooper()) { // from class: gmb.3
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (gmb.this.f || message == null) {
                return;
            }
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                gmb.this.f35656a.removeCallbacksAndMessages(null);
                gmb.this.e.onSuccess(null);
                return;
            }
            if (i == 2) {
                gmb.this.f = true;
                gmb.this.f35656a.removeCallbacksAndMessages(null);
                gmb.this.e.onFailure(message.arg1, String.valueOf(message.obj));
                return;
            }
            if (i != 3) {
                if (i == 4) {
                    gmb.this.f = true;
                    gmb.this.a();
                    gmb.this.f35656a.removeCallbacksAndMessages(null);
                    return;
                } else {
                    if (i == 5 && (message.obj instanceof Media)) {
                        gmb.this.b((Media) message.obj);
                        return;
                    }
                    return;
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - gmb.this.m;
            if (j < 0 || j > 10) {
                gmb.this.m = jCurrentTimeMillis;
                LogUtil.a("Suggestion_DownloadTask", "progress info: ", Long.valueOf(glr.b((List<Media>) gmb.this.f35657b)), ",", Long.valueOf(gmb.this.h));
                gmb.this.e.onProgress(glr.b((List<Media>) gmb.this.f35657b), gmb.this.h);
            }
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Map<String, Media> f35658c = new ConcurrentHashMap();
    private volatile Map<String, Media> d = new ConcurrentHashMap();
    private volatile Map<String, List<Media>> i = new ConcurrentHashMap();
    private AtomicInteger g = new AtomicInteger();

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        LogUtil.a("Suggestion_DownloadTask", "start clean downloading task ");
        for (String str : this.f35658c.keySet()) {
            ghw.b().cancelDownloadFile(str);
            LogUtil.a("Suggestion_DownloadTask", "clean downloading task ", str);
        }
    }

    public gmb(List<Media> list, long j, UiCallback<String> uiCallback) {
        this.f35657b = list;
        this.j = a(list);
        this.h = j;
        this.e = new c(uiCallback);
        LogUtil.a("Suggestion_DownloadTask", "construct downloadTask with pendingSize=", Integer.valueOf(this.j.size()), ", totalLength=", Long.valueOf(this.h), ", symbolicEnable=", true);
    }

    public void d() {
        for (int i = 0; i < 3 && b(); i++) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        Media mediaE = e();
        if (mediaE == null) {
            return false;
        }
        b(mediaE);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Media media) {
        if (this.f) {
            return;
        }
        if (this.e.isCanceled()) {
            this.f35656a.obtainMessage(4, -2, 0, ResultUtil.c(-2)).sendToTarget();
            return;
        }
        String url = media.getUrl();
        if (!this.d.containsKey(url) && !this.i.containsKey(url)) {
            ghw.b().downloadFile(url, media.getPath(), new a(media));
        } else {
            a(media);
            b();
        }
    }

    private Media e() {
        Media media;
        synchronized (this) {
            if (this.j.size() > 0) {
                media = this.j.get(0);
                String url = media.getUrl();
                if (this.f35658c.containsKey(url) || this.d.containsKey(url)) {
                    if (this.i.get(url) == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(media);
                        this.i.put(url, arrayList);
                    } else {
                        this.i.get(url).add(media);
                    }
                } else {
                    this.f35658c.put(url, media);
                }
                this.j.remove(media);
            } else {
                media = null;
            }
        }
        return media;
    }

    private boolean c(Media media) {
        boolean z;
        synchronized (this) {
            String url = media.getUrl();
            if (!this.d.containsKey(url)) {
                this.d.put(url, media);
            }
            this.f35658c.remove(url);
            z = this.f35658c.size() == 0 && this.j.size() == 0;
        }
        return z;
    }

    private List<Media> a(List<Media> list) {
        LinkedList linkedList = new LinkedList();
        for (Media media : list) {
            if (media != null && !media.isFinished() && !TextUtils.isEmpty(media.getUrl())) {
                linkedList.add(media);
            }
        }
        return linkedList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        try {
            Iterator<Map.Entry<String, List<Media>>> it = this.i.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, List<Media>> next = it.next();
                List<Media> value = next.getValue();
                if (CollectionUtils.a(value)) {
                    LogUtil.e("Suggestion_DownloadTask", "processPaths() URL[", next.getKey(), "] no need to copy");
                } else {
                    Media media = this.d.get(next.getKey());
                    if (media == null) {
                        LogUtil.e("Suggestion_DownloadTask", "processPaths() URL[", next.getKey(), "] have no source");
                    } else {
                        File file = new File(media.getPath());
                        if (!file.exists() || file.isDirectory()) {
                            LogUtil.e("Suggestion_DownloadTask", "processPaths() FILE[", file.getName(), "] is directory or not exist");
                        } else {
                            for (Media media2 : value) {
                                if (!media2.getPath().equals(media.getPath())) {
                                    File file2 = new File(media2.getPath());
                                    e(file, file2);
                                    d(media2, new JSONObject());
                                    xkf.c(file2.getPath(), file2.lastModified());
                                }
                            }
                            it.remove();
                        }
                    }
                }
            }
        } catch (IOException e) {
            LogUtil.e("Suggestion_DownloadTask", "CheckedUiCallback onSuccess() IOException, MSG=", e.getMessage());
        }
        return this.i.isEmpty();
    }

    private void e(File file, File file2) throws IOException {
        boolean zBu = CommonUtil.bu();
        if (Files.isSymbolicLink(file2.toPath())) {
            if (zBu) {
                ReleaseLogUtil.e("Suggestion_DownloadTask", "copySingleFile() skip by exist symbolic: ", file2.getName());
                return;
            } else {
                LogUtil.j("Suggestion_DownloadTask", "copySingleFile() skip copy: file[", file2.getAbsolutePath(), " is already symbolic by file[", file2.getCanonicalPath(), "]");
                return;
            }
        }
        a(file2);
        Files.createSymbolicLink(file2.toPath(), file.toPath(), new FileAttribute[0]);
        if (zBu) {
            ReleaseLogUtil.d("Suggestion_DownloadTask", "copySingleFile() symbolic create success, file: ", file2.getName());
        } else {
            LogUtil.a("Suggestion_DownloadTask", "copySingleFile() create symbolic file[", file2.getAbsolutePath(), "] from file[", file2.getCanonicalPath(), "] at ", Long.valueOf(file2.lastModified()));
        }
    }

    private void a(File file) throws IOException {
        if (file.isDirectory()) {
            FileUtils.d(file);
        }
        if (!file.exists() || file.delete()) {
            return;
        }
        throw new IOException(file.getName() + " delete failed!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(Media media, JSONObject jSONObject) {
        String url;
        media.setFinished(true);
        if (media.getType() == 3) {
            String strOptString = jSONObject.optString(JsUtil.DATA_LIST);
            if (!TextUtils.isEmpty(strOptString)) {
                File file = new File(strOptString);
                xkf.c(file.getPath(), file.lastModified());
            }
        }
        if (CommonUtil.bu()) {
            url = new File(media.getPath()).getName();
        } else {
            url = media.getUrl();
        }
        ReleaseLogUtil.d("Suggestion_DownloadTask", url, " download success");
        a(media);
        return c(media);
    }

    private void a(Media media) {
        media.setDownloadLength(media.getLength());
        this.f35656a.sendEmptyMessage(3);
    }

    static class c extends UiCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private UiCallback f35661b;

        c(UiCallback uiCallback) {
            if (uiCallback == null) {
                this.f35661b = new UiCallback() { // from class: gmb.c.4
                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    public void onFailure(int i, String str) {
                    }

                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    public void onSuccess(Object obj) {
                    }
                };
            } else {
                this.f35661b = uiCallback;
            }
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            if (this.f35661b.isCanceled()) {
                return;
            }
            this.f35661b.onFailure(i, str);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onSuccess(Object obj) {
            if (this.f35661b.isCanceled()) {
                return;
            }
            this.f35661b.onSuccess(obj);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onProgress(long j, long j2) {
            if (this.f35661b.isCanceled()) {
                return;
            }
            this.f35661b.onProgress(j, j2);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public boolean isCanceled() {
            return this.f35661b.isCanceled();
        }
    }

    class a extends DataCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Media f35659a;

        a(Media media) {
            this.f35659a = media;
        }

        @Override // com.huawei.basefitnessadvice.callback.DataCallback
        public void onFailure(int i, String str) {
            LogUtil.j("Suggestion_DownloadTask", "startDownload:", "errorCode=", "", Integer.valueOf(i), "   errorInfo=", LogAnonymous.c((Object) str));
            int iAddAndGet = gmb.this.g.addAndGet(1);
            if (iAddAndGet > 3 || i == -2) {
                gmb.this.f35656a.obtainMessage(2, i, 0, str).sendToTarget();
                return;
            }
            LogUtil.e("Suggestion_DownloadTask", "download error url:", this.f35659a.getUrl(), " download error retry times:", Integer.valueOf(iAddAndGet));
            this.f35659a.setDownloadLength(0L);
            gmb.this.f35656a.sendMessageDelayed(gmb.this.f35656a.obtainMessage(5, this.f35659a), 1000L);
        }

        @Override // com.huawei.basefitnessadvice.callback.DataCallback
        public void onSuccess(JSONObject jSONObject) {
            if (gmb.this.d(this.f35659a, jSONObject)) {
                if (gmb.this.c()) {
                    LogUtil.a("Suggestion_DownloadTask", this.f35659a.getUrl(), "MESSAGE_SUCCESS");
                    gmb.this.f35656a.sendEmptyMessage(1);
                    return;
                } else {
                    gmb.this.f35656a.obtainMessage(2, 200011, 0, "Copy duplicated files failed").sendToTarget();
                    return;
                }
            }
            gmb.this.b();
        }

        @Override // com.huawei.basefitnessadvice.callback.DataCallback
        public void onProgress(long j, long j2, boolean z) {
            if (gmb.this.e.isCanceled()) {
                gmb.this.f35656a.obtainMessage(4, -2, 0, ResultUtil.c(-2)).sendToTarget();
                return;
            }
            Media media = this.f35659a;
            media.setDownloadLength(Math.min(j, media.getLength()));
            gmb.this.f35656a.sendEmptyMessage(3);
        }
    }
}
