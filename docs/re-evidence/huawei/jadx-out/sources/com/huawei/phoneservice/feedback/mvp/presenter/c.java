package com.huawei.phoneservice.feedback.mvp.presenter;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.phoneservice.faq.base.entity.ModuleConfigRequest;
import com.huawei.phoneservice.faq.base.entity.ModuleConfigResponse;
import com.huawei.phoneservice.faq.base.network.FaqCallback;
import com.huawei.phoneservice.faq.base.network.FaqWebServiceException;
import com.huawei.phoneservice.faq.base.util.FaqHandler;
import com.huawei.phoneservice.faq.base.util.ModuleConfigUtils;
import com.huawei.phoneservice.faq.base.util.f;
import com.huawei.phoneservice.faq.base.util.g;
import com.huawei.phoneservice.faq.base.util.i;
import com.huawei.phoneservice.faq.base.util.r;
import com.huawei.phoneservice.feedback.mvp.contract.a;
import com.huawei.phoneservice.feedback.ui.ProductSuggestionActivity;
import com.huawei.phoneservice.feedbackcommon.db.FeedbackMediaData;
import com.huawei.phoneservice.feedbackcommon.entity.MediaEntity;
import com.huawei.phoneservice.feedbackcommon.network.FeedbackWebConstants;
import com.huawei.phoneservice.feedbackcommon.photolibrary.internal.entity.MediaItem;
import com.huawei.phoneservice.feedbackcommon.utils.CancelInterface;
import com.huawei.phoneservice.feedbackcommon.utils.CompressTask;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class c extends com.huawei.phoneservice.feedback.mvp.base.d<a> implements FaqHandler.CallBack {
    private LinkedList<MediaEntity> s;
    private List<com.huawei.phoneservice.feedback.entity.d> t;
    private List<String> u;
    private LinkedList<Pair<Integer, MediaEntity>> w;
    private long x;

    public void j() {
        com.huawei.phoneservice.feedbackcommon.utils.e.a().zipCompress(this.j, this);
    }

    @Override // com.huawei.phoneservice.faq.base.util.FaqHandler.CallBack
    public void handleMessage(int i, Message message) {
        if (i == 100) {
            this.q = com.huawei.phoneservice.feedbackcommon.utils.e.a().reUploadZipWithCancel(this.j, this.f21674b, ((a) this.r).c().getLogsSize(), ((a) this.r).c().getZipFileName(), this);
            return;
        }
        if (i == 3) {
            if (!com.huawei.phoneservice.faq.base.util.d.c(this.w)) {
                d(this.w.removeFirst());
                return;
            } else {
                ((a) this.r).a(false);
                ((a) this.r).c().setFilesSize(this.x);
                return;
            }
        }
        if (i == 4) {
            String str = (String) message.obj;
            this.u.add(str);
            ((a) this.r).b(str);
            int size = this.u.size();
            if (size < this.s.size()) {
                d(this.s.get(size));
                return;
            } else {
                a(this.u);
                return;
            }
        }
        if (i != 5) {
            if (i == 6) {
                this.l = 0;
                this.m = null;
                String str2 = (String) message.obj;
                ((a) this.r).a();
                ((a) this.r).a(str2);
                this.e = false;
                return;
            }
            if (i != 7) {
                return;
            }
        }
        String str3 = (String) message.obj;
        if (this.l == 0) {
            b(str3);
        } else {
            this.l = 3;
            this.m = str3;
        }
    }

    public void f() {
        Handler handler = this.i;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        CancelInterface cancelInterface = this.q;
        if (cancelInterface != null) {
            cancelInterface.isCancel(true);
        }
        ((a) this.r).a();
        this.e = false;
        this.f = true;
        if (com.huawei.phoneservice.feedbackcommon.utils.e.a().getSdkListener() != null) {
            com.huawei.phoneservice.feedbackcommon.utils.e.a().getSdkListener().onSubmitResult(-1, null, ((a) this.r).c().getProblemId(), ((a) this.r).c().getSrCode(), "");
        }
        this.l = 0;
        CancelInterface cancelInterface2 = this.q;
        if (cancelInterface2 != null) {
            cancelInterface2.isCancel(false);
        }
    }

    public void h() {
        if (this.l == 1) {
            this.l = 0;
            return;
        }
        if (this.l == 2) {
            this.l = 0;
            a(this.u);
        } else {
            if (this.l != 3 || TextUtils.isEmpty(this.m)) {
                return;
            }
            this.l = 0;
            Handler handler = this.i;
            if (handler != null) {
                handler.sendMessage(handler.obtainMessage(7, this.m));
            }
        }
    }

    public void g() {
        if (this.l == 0) {
            this.l = 1;
        }
    }

    public List<com.huawei.phoneservice.feedback.entity.d> d() {
        return this.t;
    }

    public void c() {
        LinkedList<MediaEntity> linkedList = this.s;
        if (linkedList == null) {
            this.s = new LinkedList<>();
        } else {
            linkedList.clear();
        }
        LinkedList<Pair<Integer, MediaEntity>> linkedList2 = this.w;
        if (linkedList2 == null) {
            this.w = new LinkedList<>();
        } else {
            linkedList2.clear();
        }
        this.x = 0L;
    }

    public boolean e() {
        return !this.e;
    }

    public void a(Context context, boolean z) {
        if (this.j instanceof ProductSuggestionActivity) {
            ((a) this.r).b((List<com.huawei.phoneservice.feedback.entity.d>) null);
        } else if (z || ModuleConfigUtils.isEmpty()) {
            b(context, new ModuleConfigRequest(com.huawei.phoneservice.feedbackcommon.utils.e.f().getSdk("country"), com.huawei.phoneservice.feedbackcommon.utils.e.f().getSdk("language"), r.d(), com.huawei.phoneservice.feedbackcommon.utils.e.f().getSdk("channel"), com.huawei.phoneservice.feedbackcommon.utils.e.f().getSdk(FaqConstants.FAQ_SHASN), com.huawei.phoneservice.faq.base.util.c.j(), com.huawei.phoneservice.feedbackcommon.utils.e.f().getSdk("appVersion"), com.huawei.phoneservice.feedbackcommon.utils.e.f().getSdk("model"), com.huawei.phoneservice.faq.base.util.c.c()), null);
        } else {
            b(context, (String) null);
        }
    }

    @Override // com.huawei.phoneservice.feedback.mvp.base.f
    public void b() {
        Handler handler = this.i;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.i = null;
        }
    }

    @Override // com.huawei.phoneservice.feedback.mvp.base.c
    public void a(boolean z) {
        this.o = z;
        if (com.huawei.phoneservice.faq.base.util.d.c(this.s)) {
            a(this.u);
        } else {
            d(this.s.getFirst());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0078, code lost:
    
        if (com.huawei.phoneservice.faq.base.util.d.c(r2.s) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007a, code lost:
    
        d(r2.s.getFirst());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0085, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0086, code lost:
    
        a(r2.u);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006f, code lost:
    
        if (com.huawei.phoneservice.faq.base.util.d.c(r2.s) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(Context context, boolean z) {
        ((a) this.r).e();
        this.e = true;
        this.f = false;
        this.l = 0;
        this.u.clear();
        this.d = ((a) this.r).c().getFlag();
        this.f21674b = FeedbackWebConstants.getZipFilePath(context);
        if (z) {
            if (this.d == 2) {
                File file = new File(this.f21674b + File.separator + ((a) this.r).c().getZipFileName() + ".zip");
                a(this.f21674b, file.length(), file.getName());
            }
        }
    }

    public void b(Context context, String str, String str2, String str3) {
        try {
            c(context, str, Long.valueOf(str2).longValue(), str3);
        } catch (NumberFormatException unused) {
            g.e("FeedBackPresenter", "NumberFormatException");
        }
    }

    public void c(Context context, String str, long j, String str2) {
        com.huawei.phoneservice.feedbackcommon.utils.c.f21899b.queryForHD(context, j, str2, new e(com.huawei.phoneservice.feedback.entity.b.class, (Activity) context, str, context));
    }

    public void b(Context context, String str) {
        a(context, str, new d(com.huawei.phoneservice.feedback.entity.e.class, (Activity) context));
    }

    public void b(Context context) {
        ((a) this.r).a(true);
        List<MediaItem> medias = ((a) this.r).c().getMedias();
        c();
        b(medias);
        if (!com.huawei.phoneservice.faq.base.util.d.c(this.w)) {
            d(this.w.removeFirst());
        } else {
            ((a) this.r).a(false);
            ((a) this.r).c().setFilesSize(this.x);
        }
    }

    public void b(int i, int i2) {
        this.g = i;
        this.h = i2;
    }

    @Override // com.huawei.phoneservice.feedback.mvp.base.f
    public void a() {
        this.i = new FaqHandler(this);
    }

    private void b(List<MediaItem> list) {
        long j;
        long size;
        LinkedList<Pair<Integer, MediaEntity>> linkedList;
        Pair<Integer, MediaEntity> pair;
        int size2 = list.size();
        int i = 0;
        while (i < size2) {
            MediaItem mediaItem = list.get(i);
            String filePath = mediaItem.getFilePath();
            if (TextUtils.isEmpty(filePath)) {
                list.remove(i);
                size2--;
                i--;
            } else {
                MediaEntity mediaEntityC = FeedbackMediaData.a(this.j).c(filePath);
                if (!mediaItem.isImage() || mediaItem.getSize() <= com.huawei.phoneservice.feedbackcommon.utils.e.d()) {
                    if (mediaEntityC == null) {
                        mediaEntityC = new MediaEntity(mediaItem, filePath, mediaItem.getUri());
                    }
                    mediaEntityC.cache = filePath;
                    mediaEntityC.duration = Long.valueOf(mediaItem.isVideo() ? mediaItem.getDuration() : 0L);
                    j = this.x;
                    size = mediaItem.getSize();
                } else {
                    if (mediaEntityC == null) {
                        mediaEntityC = new MediaEntity(mediaItem, filePath, mediaItem.getUri());
                        linkedList = this.w;
                        pair = new Pair<>(Integer.valueOf(i), mediaEntityC);
                    } else if (mediaEntityC.noCache()) {
                        linkedList = this.w;
                        pair = new Pair<>(Integer.valueOf(i), mediaEntityC);
                    } else {
                        File file = new File(mediaEntityC.cache);
                        if (file.exists()) {
                            j = this.x;
                            size = file.length();
                        } else {
                            linkedList = this.w;
                            pair = new Pair<>(Integer.valueOf(i), mediaEntityC);
                        }
                    }
                    linkedList.add(pair);
                    this.s.add(mediaEntityC);
                }
                this.x = j + size;
                this.s.add(mediaEntityC);
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context, String str) {
        b(context, str);
    }

    private void b(String str) {
        this.l = 0;
        this.m = null;
        ((a) this.r).a();
        ((a) this.r).c(str);
        this.e = false;
        if (com.huawei.phoneservice.feedbackcommon.utils.e.a().getSdkListener() != null) {
            com.huawei.phoneservice.feedbackcommon.utils.e.a().getSdkListener().onSubmitResult(-1, null, ((a) this.r).c().getProblemId(), ((a) this.r).c().getSrCode(), str);
        }
    }

    private void d(MediaEntity mediaEntity) {
        if (this.f) {
            return;
        }
        this.q = com.huawei.phoneservice.feedbackcommon.utils.e.a().uploadAttachmentWithCancel(this.j, mediaEntity, this);
    }

    private void d(Pair<Integer, MediaEntity> pair) {
        String strE = com.huawei.phoneservice.faq.base.util.b.e(this.j);
        Handler handler = this.i;
        if (handler != null) {
            handler.post(new CompressTask(this.j, ((MediaEntity) pair.second).path, strE, new C0258c(pair)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context, ModuleConfigRequest moduleConfigRequest, String str) {
        i.a().queryModuleList(context, moduleConfigRequest, new b(ModuleConfigResponse.class, (Activity) context, context, str));
    }

    class b extends FaqCallback<ModuleConfigResponse> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f21685a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f21687c;

        @Override // com.huawei.phoneservice.faq.base.network.FaqCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th, ModuleConfigResponse moduleConfigResponse) {
            if (th == null && moduleConfigResponse != null) {
                ModuleConfigUtils.genSdkModuleList(this.f21687c, moduleConfigResponse.getModuleList());
                c.this.d(this.f21687c, this.f21685a);
            } else if (th == null) {
                ((a) c.this.r).a(FaqConstants.FaqErrorCode.CONNECT_SERVER_ERROR);
            } else {
                ((a) c.this.r).a(FaqConstants.FaqErrorCode.CONNECT_SERVER_ERROR);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Class cls, Activity activity, Context context, String str) {
            super(cls, activity);
            this.f21687c = context;
            this.f21685a = str;
        }
    }

    /* JADX INFO: renamed from: com.huawei.phoneservice.feedback.mvp.presenter.c$c, reason: collision with other inner class name */
    class C0258c implements CompressTask.TaskCallBack {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Pair f21688c;

        @Override // com.huawei.phoneservice.feedbackcommon.utils.CompressTask.TaskCallBack
        public void compressDone(Throwable th, String str) {
            MediaEntity mediaEntity = (MediaEntity) this.f21688c.second;
            mediaEntity.cache = str;
            mediaEntity.type = "image/jpeg";
            if (c.this.s.size() > ((Integer) this.f21688c.first).intValue()) {
                c.this.s.set(((Integer) this.f21688c.first).intValue(), (MediaEntity) this.f21688c.second);
            }
            c.b(c.this, new File(str).length());
            c.this.i.sendEmptyMessage(3);
        }

        C0258c(Pair pair) {
            this.f21688c = pair;
        }
    }

    class d extends FaqCallback<com.huawei.phoneservice.feedback.entity.e> {
        @Override // com.huawei.phoneservice.faq.base.network.FaqCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th, com.huawei.phoneservice.feedback.entity.e eVar) {
            if (th != null || eVar == null) {
                ((a) c.this.r).a(FaqConstants.FaqErrorCode.CONNECT_SERVER_ERROR);
                return;
            }
            c.this.t.clear();
            List<com.huawei.phoneservice.feedback.entity.d> list = eVar.d;
            if (list != null && !list.isEmpty()) {
                c.this.t.addAll(eVar.d);
            }
            ((a) c.this.r).b(c.this.t);
        }

        d(Class cls, Activity activity) {
            super(cls, activity);
        }
    }

    class e extends FaqCallback<com.huawei.phoneservice.feedback.entity.b> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f21689c;
        final /* synthetic */ Context d;

        @Override // com.huawei.phoneservice.faq.base.network.FaqCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th, com.huawei.phoneservice.feedback.entity.b bVar) {
            if (th != null || bVar == null) {
                ((a) c.this.r).c(th instanceof FaqWebServiceException ? ((FaqWebServiceException) th).errorCode : -1);
            } else {
                c.this.b(this.d, new ModuleConfigRequest(f.d(), f.e(), r.d(), this.f21689c, com.huawei.phoneservice.feedbackcommon.utils.e.f().getSdk(FaqConstants.FAQ_SHASN), com.huawei.phoneservice.faq.base.util.c.j(), com.huawei.phoneservice.feedbackcommon.utils.e.f().getSdk("appVersion"), com.huawei.phoneservice.feedbackcommon.utils.e.f().getSdk("model"), com.huawei.phoneservice.faq.base.util.c.c()), this.f21689c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Class cls, Activity activity, String str, Context context) {
            super(cls, activity);
            this.f21689c = str;
            this.d = context;
        }
    }

    static /* synthetic */ long b(c cVar, long j) {
        long j2 = cVar.x + j;
        cVar.x = j2;
        return j2;
    }

    public c(a aVar, Context context, Activity activity) {
        super(aVar);
        this.t = new ArrayList();
        this.s = new LinkedList<>();
        this.x = 0L;
        this.w = new LinkedList<>();
        this.u = new ArrayList(com.huawei.phoneservice.feedbackcommon.utils.e.e());
        this.j = context;
        this.k = activity;
    }
}
