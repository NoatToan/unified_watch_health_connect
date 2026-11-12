package com.huawei.phoneservice.feedbackcommon.utils;

import android.app.Activity;
import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.LazyHeaders;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.huawei.phoneservice.faq.base.network.FaqCallback;
import com.huawei.phoneservice.faq.base.network.FaqWebServiceException;
import com.huawei.phoneservice.faq.base.util.BaseSdkUpdateRequest;
import com.huawei.phoneservice.faq.base.util.Sdk;
import com.huawei.phoneservice.faq.base.util.VideoCallBack;
import com.huawei.phoneservice.feedbackcommon.db.FeedbackMediaData;
import com.huawei.phoneservice.feedbackcommon.entity.FeedBackRequest;
import com.huawei.phoneservice.feedbackcommon.entity.FeedBackResponse;
import com.huawei.phoneservice.feedbackcommon.entity.FeedbackInfo;
import com.huawei.phoneservice.feedbackcommon.entity.FeedbackZipBean;
import com.huawei.phoneservice.feedbackcommon.entity.MediaEntity;
import com.huawei.phoneservice.feedbackcommon.photolibrary.MimeType;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* JADX INFO: loaded from: classes13.dex */
public final class e implements OnReadListener, IProblemManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f21904a = 4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f21905c = 512000;
    private static String d = null;
    private static int e = 50;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<SdkProblemListener> f21906b;
    private List<OnReadListener> g;

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IProblemManager
    public void zipCompressAgain(Context context, long j, ZipCompressListener zipCompressListener) {
        new p(context, j, zipCompressListener).execute(new Object[0]);
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IProblemManager
    public void zipCompress(Context context, ZipCompressListener zipCompressListener) {
        new p(context, zipCompressListener).execute(new Object[0]);
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IProblemManager
    public CancelInterface uploadZipWithCancel(Context context, String str, long j, String str2, NotifyUploadZipListener notifyUploadZipListener) {
        q qVar = new q(context, str, str2);
        qVar.e(notifyUploadZipListener);
        return qVar.a();
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IProblemManager
    public void uploadZip(Context context, String str, long j, String str2, NotifyUploadZipListener notifyUploadZipListener) {
        new q(context, str, str2).e(notifyUploadZipListener);
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IProblemManager
    public CancelInterface uploadAttachmentWithCancel(Context context, MediaEntity mediaEntity, NotifyUploadFileListener notifyUploadFileListener) {
        m mVar = new m(context, mediaEntity);
        mVar.b(notifyUploadFileListener);
        return mVar.a();
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IProblemManager
    public void uploadAttachment(Context context, MediaEntity mediaEntity, NotifyUploadFileListener notifyUploadFileListener) {
        new m(context, mediaEntity).b(notifyUploadFileListener);
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.OnReadListener
    public void unread(Throwable th, String str, int i2) {
        List<OnReadListener> list = this.g;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.g.get(size).unread(th, str, i2);
            }
        }
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IProblemManager
    public CancelInterface submitWithCancel(Context context, boolean z, List<String> list, List<FeedbackZipBean> list2, FeedbackInfo feedbackInfo, SubmitListener submitListener) {
        n nVar = new n(context, z, list, list2, feedbackInfo);
        nVar.c(submitListener);
        return nVar.a();
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IProblemManager
    public void submit(Context context, boolean z, List<String> list, List<FeedbackZipBean> list2, FeedbackInfo feedbackInfo, SubmitListener submitListener) {
        new n(context, z, list, list2, feedbackInfo).c(submitListener);
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IProblemManager
    public void setSdkListener(SdkProblemListener sdkProblemListener) {
        if (sdkProblemListener != null) {
            WeakReference<SdkProblemListener> weakReference = this.f21906b;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f21906b = new WeakReference<>(sdkProblemListener);
            return;
        }
        WeakReference<SdkProblemListener> weakReference2 = this.f21906b;
        if (weakReference2 != null) {
            weakReference2.clear();
            this.f21906b = null;
        }
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IProblemManager
    public void setRead(Context context, String str, OnReadListener onReadListener) {
        new o(context, str, this).a(onReadListener);
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IProblemManager
    public void removeReadListener(OnReadListener onReadListener) {
        List<OnReadListener> list = this.g;
        if (list != null) {
            list.remove(onReadListener);
        }
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.OnReadListener
    public void read(Throwable th, String str) {
        List<OnReadListener> list = this.g;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.g.get(size).read(th, str);
            }
        }
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IProblemManager
    public CancelInterface reUploadZipWithCancel(Context context, String str, long j, String str2, NotifyUploadZipListener notifyUploadZipListener) {
        q qVar = new q(context, str, str2);
        qVar.c(notifyUploadZipListener);
        return qVar.a();
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IProblemManager
    public void reUploadZip(Context context, String str, long j, String str2, NotifyUploadZipListener notifyUploadZipListener) {
        new q(context, str, str2).c(notifyUploadZipListener);
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IProblemManager
    public void getUnread(Context context, String str, boolean z, OnReadListener onReadListener) {
        new f(context, str, z, this).a(onReadListener);
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IProblemManager
    public void getUnread(Context context, String str, OnReadListener onReadListener) {
        getUnread(context, str, false, onReadListener);
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IProblemManager
    public void getSrCodeData(Activity activity, SdkFeedBackCallback sdkFeedBackCallback) {
        new j(activity).b(sdkFeedBackCallback);
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IProblemManager
    public String getSdkVersion() {
        return "26.4.0.3";
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IProblemManager
    public SdkProblemListener getSdkListener() {
        WeakReference<SdkProblemListener> weakReference = this.f21906b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IProblemManager
    public void getReadState(Activity activity, String str, SdkFeedBackCallback sdkFeedBackCallback) {
        if (!com.huawei.phoneservice.faq.base.util.i.a().hadAddress()) {
            sdkFeedBackCallback.setThrowableView(new FaqWebServiceException(-1, "No URL Address"));
            return;
        }
        FeedBackRequest feedBackRequest = new FeedBackRequest();
        feedBackRequest.setAccessToken(com.huawei.phoneservice.faq.base.util.i.d().getSdk("accessToken"));
        feedBackRequest.setProblemId(str);
        com.huawei.phoneservice.feedbackcommon.utils.c.f21899b.getDataFromDetail(activity, feedBackRequest, new a(FeedBackResponse.ProblemEnity.class, activity, sdkFeedBackCallback, feedBackRequest, activity));
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IProblemManager
    public void getFeedBackList(Context context, String str, int i2, String str2, int i3, OnHistoryListener onHistoryListener) {
        new k(context, str, i2, str2, i3).d(onHistoryListener);
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IProblemManager
    public void getDataFromSdk(Activity activity, String str, String str2, int i2, String str3, int i3, SdkFeedBackCallback sdkFeedBackCallback) {
        if (!com.huawei.phoneservice.faq.base.util.i.a().hadAddress()) {
            sdkFeedBackCallback.setThrowableView(new FaqWebServiceException(-1, "No URL Address"));
            return;
        }
        ArrayList arrayList = new ArrayList();
        FeedBackRequest feedBackRequest = new FeedBackRequest();
        feedBackRequest.setProblemId(str2);
        feedBackRequest.setAccessToken(f().getSdk("accessToken"));
        feedBackRequest.setStartWith(str);
        feedBackRequest.setPageSize(i2);
        feedBackRequest.setProblemSourceCode(str3);
        feedBackRequest.setOrderType(i3);
        com.huawei.phoneservice.faq.base.util.g.c("SdkProblemManager", "getDataFromSDK");
        if (TextUtils.isEmpty(str)) {
            a(feedBackRequest, activity, sdkFeedBackCallback, arrayList);
        } else {
            c(feedBackRequest, activity, sdkFeedBackCallback, arrayList);
        }
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IProblemManager
    public void downLoadFile(Activity activity, String str, VideoCallBack videoCallBack, String str2) {
        b(activity, str, str2, false, videoCallBack);
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IProblemManager
    public void deleteHistory(Context context, String str, OnDeleteHistoryListener onDeleteHistoryListener) {
        new com.huawei.phoneservice.feedbackcommon.utils.h(context, str).e(onDeleteHistoryListener);
    }

    @Override // com.huawei.phoneservice.feedbackcommon.utils.IProblemManager
    public void addReadListener(OnReadListener onReadListener) {
        if (this.g == null) {
            this.g = new ArrayList();
        }
        this.g.add(onReadListener);
    }

    public static Sdk f() {
        return com.huawei.phoneservice.faq.base.util.i.d();
    }

    public static long d() {
        return f21905c;
    }

    public static int c() {
        return e;
    }

    public static int e() {
        return f21904a;
    }

    public static IProblemManager a() {
        return g.d;
    }

    public static String b() {
        return d;
    }

    private void a(FeedBackRequest feedBackRequest, Activity activity, SdkFeedBackCallback sdkFeedBackCallback, List<FeedBackResponse.ProblemEnity> list) {
        com.huawei.phoneservice.faq.base.util.g.c("SdkProblemManager", "doRequestForParent");
        com.huawei.phoneservice.feedbackcommon.utils.c.f21899b.getDataFromDetail(activity, feedBackRequest, new i(FeedBackResponse.ProblemEnity.class, activity, list, feedBackRequest, activity, sdkFeedBackCallback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<FeedBackResponse.ProblemEnity> list, SdkFeedBackCallback sdkFeedBackCallback) {
        if (com.huawei.phoneservice.faq.base.util.d.c(list)) {
            list = new ArrayList<>();
        }
        sdkFeedBackCallback.setListView(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:44:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public void e(File file, VideoCallBack videoCallBack, Activity activity, String str, String str2) throws Throwable {
        Throwable th;
        Scanner scanner;
        FileReader fileReader;
        StringBuilder sb = new StringBuilder();
        FileReader fileReader2 = null;
        scanner = null;
        Scanner scanner2 = null;
        Scanner scanner3 = null;
        try {
            fileReader = new FileReader(file);
            try {
                scanner = new Scanner(fileReader);
                while (scanner.hasNextLine()) {
                    try {
                        sb.append(scanner.nextLine());
                    } catch (FileNotFoundException unused) {
                        scanner3 = scanner;
                        try {
                            a(videoCallBack);
                            if (scanner3 != null) {
                                scanner3.close();
                            }
                            if (fileReader != null) {
                                try {
                                    fileReader.close();
                                    return;
                                } catch (IOException e2) {
                                    com.huawei.phoneservice.faq.base.util.g.c("SdkProblemManager", e2.getMessage());
                                    return;
                                }
                            }
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            scanner = scanner3;
                            fileReader2 = fileReader;
                            fileReader = fileReader2;
                            scanner2 = scanner;
                            if (scanner2 != null) {
                                scanner2.close();
                            }
                            if (fileReader != null) {
                                try {
                                    fileReader.close();
                                } catch (IOException e3) {
                                    com.huawei.phoneservice.faq.base.util.g.c("SdkProblemManager", e3.getMessage());
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        scanner2 = scanner;
                        if (scanner2 != null) {
                            scanner2.close();
                        }
                        if (fileReader != null) {
                            fileReader.close();
                        }
                        throw th;
                    }
                }
                scanner.close();
                try {
                    fileReader.close();
                } catch (IOException e4) {
                    com.huawei.phoneservice.faq.base.util.g.c("SdkProblemManager", e4.getMessage());
                }
                try {
                    JsonElement jsonElement = JsonParser.parseString(sb.toString()).getAsJsonObject().get("responseCode");
                    if (jsonElement != null && jsonElement.getAsInt() == 401) {
                        com.huawei.phoneservice.faq.base.util.i.a().registerUpdateListener(new c(null, activity, str, str2, videoCallBack));
                        com.huawei.phoneservice.faq.base.util.i.a().onSdkErr("accessToken", f().getSdk("accessToken"));
                    } else {
                        a(videoCallBack);
                    }
                } catch (JsonParseException | ClassCastException | IllegalStateException unused2) {
                    a(videoCallBack);
                }
            } catch (FileNotFoundException unused3) {
            } catch (Throwable th4) {
                th = th4;
                if (scanner2 != null) {
                    scanner2.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }
                throw th;
            }
        } catch (FileNotFoundException unused4) {
            fileReader = null;
        } catch (Throwable th5) {
            th = th5;
            scanner = null;
            fileReader = fileReader2;
            scanner2 = scanner;
            if (scanner2 != null) {
                scanner2.close();
            }
            if (fileReader != null) {
                fileReader.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(File file, Activity activity, String str, String str2, VideoCallBack videoCallBack) {
        new Thread(new d(activity, str, str2, file, videoCallBack)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(FeedBackResponse.ProblemEnity problemEnity, SdkFeedBackCallback sdkFeedBackCallback) {
        if (problemEnity == null) {
            sdkFeedBackCallback.setListView(null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(problemEnity);
        sdkFeedBackCallback.setListView(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(FeedBackRequest feedBackRequest, Activity activity, SdkFeedBackCallback sdkFeedBackCallback, List<FeedBackResponse.ProblemEnity> list) {
        com.huawei.phoneservice.faq.base.util.g.c("SdkProblemManager", "doRequestForChild");
        com.huawei.phoneservice.feedbackcommon.utils.c.f21899b.getFeedBackList(activity, feedBackRequest, new h(FeedBackResponse.class, activity, list, sdkFeedBackCallback, feedBackRequest, activity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(VideoCallBack videoCallBack) {
        if (videoCallBack != null) {
            videoCallBack.setChangeImage(null, false);
        }
    }

    /* JADX INFO: loaded from: classes41.dex */
    class a extends FaqCallback<FeedBackResponse.ProblemEnity> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f21907a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FeedBackRequest f21908b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SdkFeedBackCallback f21909c;

        class c extends BaseSdkUpdateRequest<FeedBackRequest> {

            /* JADX INFO: renamed from: com.huawei.phoneservice.feedbackcommon.utils.e$a$c$a, reason: collision with other inner class name */
            class C0261a extends FaqCallback<FeedBackResponse.ProblemEnity> {
                @Override // com.huawei.phoneservice.faq.base.network.FaqCallback
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onResult(Throwable th, FeedBackResponse.ProblemEnity problemEnity) {
                    if (th != null) {
                        a.this.f21909c.setThrowableView(th);
                    } else {
                        a aVar = a.this;
                        e.this.d(problemEnity, aVar.f21909c);
                    }
                }

                C0261a(Class cls, Activity activity) {
                    super(cls, activity);
                }
            }

            @Override // com.huawei.phoneservice.faq.base.util.BaseSdkUpdateRequest
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onCallback(String str, String str2, String str3, FeedBackRequest feedBackRequest) {
                if ("accessToken".equals(str)) {
                    com.huawei.phoneservice.faq.base.util.i.a().unregisterUpdateListener(this);
                    feedBackRequest.setAccessToken(str3);
                    com.huawei.phoneservice.feedbackcommon.utils.c.f21899b.getDataFromDetail(a.this.f21907a, feedBackRequest, new C0261a(FeedBackResponse.ProblemEnity.class, a.this.f21907a));
                }
            }

            c(FeedBackRequest feedBackRequest) {
                super(feedBackRequest);
            }
        }

        @Override // com.huawei.phoneservice.faq.base.network.FaqCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th, FeedBackResponse.ProblemEnity problemEnity) {
            if (th == null) {
                e.this.d(problemEnity, this.f21909c);
                return;
            }
            if (!(th instanceof FaqWebServiceException) || ((FaqWebServiceException) th).errorCode != 401 || !com.huawei.phoneservice.faq.base.util.i.a().haveSdkErr("accessToken")) {
                this.f21909c.setThrowableView(th);
            } else {
                com.huawei.phoneservice.faq.base.util.i.a().registerUpdateListener(new c(this.f21908b));
                com.huawei.phoneservice.faq.base.util.i.a().onSdkErr("accessToken", e.f().getSdk("accessToken"));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class cls, Activity activity, SdkFeedBackCallback sdkFeedBackCallback, FeedBackRequest feedBackRequest, Activity activity2) {
            super(cls, activity);
            this.f21909c = sdkFeedBackCallback;
            this.f21908b = feedBackRequest;
            this.f21907a = activity2;
        }
    }

    /* JADX INFO: loaded from: classes41.dex */
    class h extends FaqCallback<FeedBackResponse> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ FeedBackRequest f21922a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f21924c;
        final /* synthetic */ SdkFeedBackCallback d;
        final /* synthetic */ Activity e;

        class a extends BaseSdkUpdateRequest<FeedBackRequest> {

            /* JADX INFO: renamed from: com.huawei.phoneservice.feedbackcommon.utils.e$h$a$e, reason: collision with other inner class name */
            class C0263e extends FaqCallback<FeedBackResponse> {
                @Override // com.huawei.phoneservice.faq.base.network.FaqCallback
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onResult(Throwable th, FeedBackResponse feedBackResponse) {
                    if (th == null) {
                        h.this.f21924c.addAll(feedBackResponse.getDataList());
                        h hVar = h.this;
                        e.this.e((List<FeedBackResponse.ProblemEnity>) hVar.f21924c, hVar.d);
                    } else if (com.huawei.phoneservice.faq.base.util.d.c(h.this.f21924c)) {
                        h.this.d.setThrowableView(th);
                    } else {
                        h hVar2 = h.this;
                        hVar2.d.setListView(hVar2.f21924c);
                    }
                }

                C0263e(Class cls, Activity activity) {
                    super(cls, activity);
                }
            }

            @Override // com.huawei.phoneservice.faq.base.util.BaseSdkUpdateRequest
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onCallback(String str, String str2, String str3, FeedBackRequest feedBackRequest) {
                if ("accessToken".equals(str)) {
                    com.huawei.phoneservice.faq.base.util.i.a().unregisterUpdateListener(this);
                    feedBackRequest.setAccessToken(str3);
                    com.huawei.phoneservice.feedbackcommon.utils.c.f21899b.getFeedBackList(h.this.e, feedBackRequest, new C0263e(FeedBackResponse.class, h.this.e));
                }
            }

            a(FeedBackRequest feedBackRequest) {
                super(feedBackRequest);
            }
        }

        @Override // com.huawei.phoneservice.faq.base.network.FaqCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th, FeedBackResponse feedBackResponse) {
            if (th == null) {
                this.f21924c.addAll(feedBackResponse.getDataList());
                e.this.e((List<FeedBackResponse.ProblemEnity>) this.f21924c, this.d);
            } else if ((th instanceof FaqWebServiceException) && ((FaqWebServiceException) th).errorCode == 401 && com.huawei.phoneservice.faq.base.util.i.a().haveSdkErr("accessToken")) {
                com.huawei.phoneservice.faq.base.util.i.a().registerUpdateListener(new a(this.f21922a));
                com.huawei.phoneservice.faq.base.util.i.a().onSdkErr("accessToken", e.f().getSdk("accessToken"));
            } else if (com.huawei.phoneservice.faq.base.util.d.c(this.f21924c)) {
                this.d.setThrowableView(th);
            } else {
                this.d.setListView(this.f21924c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Class cls, Activity activity, List list, SdkFeedBackCallback sdkFeedBackCallback, FeedBackRequest feedBackRequest, Activity activity2) {
            super(cls, activity);
            this.f21924c = list;
            this.d = sdkFeedBackCallback;
            this.f21922a = feedBackRequest;
            this.e = activity2;
        }
    }

    /* JADX INFO: loaded from: classes41.dex */
    class i extends FaqCallback<FeedBackResponse.ProblemEnity> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f21927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SdkFeedBackCallback f21928b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FeedBackRequest f21929c;
        final /* synthetic */ List d;

        class a extends BaseSdkUpdateRequest<FeedBackRequest> {

            class c extends FaqCallback<FeedBackResponse.ProblemEnity> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ FeedBackRequest f21930c;

                @Override // com.huawei.phoneservice.faq.base.network.FaqCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onResult(Throwable th, FeedBackResponse.ProblemEnity problemEnity) {
                    if (th != null) {
                        i.this.f21928b.setThrowableView(th);
                        return;
                    }
                    i iVar = i.this;
                    if (problemEnity == null) {
                        e.this.e((List<FeedBackResponse.ProblemEnity>) null, iVar.f21928b);
                        return;
                    }
                    iVar.d.add(problemEnity);
                    i iVar2 = i.this;
                    e.this.c(this.f21930c, iVar2.f21927a, iVar2.f21928b, iVar2.d);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(Class cls, Activity activity, FeedBackRequest feedBackRequest) {
                    super(cls, activity);
                    this.f21930c = feedBackRequest;
                }
            }

            @Override // com.huawei.phoneservice.faq.base.util.BaseSdkUpdateRequest
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onCallback(String str, String str2, String str3, FeedBackRequest feedBackRequest) {
                if ("accessToken".equals(str)) {
                    com.huawei.phoneservice.faq.base.util.i.a().unregisterUpdateListener(this);
                    feedBackRequest.setAccessToken(str3);
                    com.huawei.phoneservice.feedbackcommon.utils.c.f21899b.getDataFromDetail(i.this.f21927a, feedBackRequest, new c(FeedBackResponse.ProblemEnity.class, i.this.f21927a, feedBackRequest));
                }
            }

            a(FeedBackRequest feedBackRequest) {
                super(feedBackRequest);
            }
        }

        @Override // com.huawei.phoneservice.faq.base.network.FaqCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th, FeedBackResponse.ProblemEnity problemEnity) {
            if (th == null) {
                if (problemEnity == null) {
                    e.this.e((List<FeedBackResponse.ProblemEnity>) null, this.f21928b);
                    return;
                } else {
                    this.d.add(problemEnity);
                    e.this.c(this.f21929c, this.f21927a, this.f21928b, this.d);
                    return;
                }
            }
            if (!(th instanceof FaqWebServiceException) || ((FaqWebServiceException) th).errorCode != 401 || !com.huawei.phoneservice.faq.base.util.i.a().haveSdkErr("accessToken")) {
                this.f21928b.setThrowableView(th);
            } else {
                com.huawei.phoneservice.faq.base.util.i.a().registerUpdateListener(new a(this.f21929c));
                com.huawei.phoneservice.faq.base.util.i.a().onSdkErr("accessToken", e.f().getSdk("accessToken"));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Class cls, Activity activity, List list, FeedBackRequest feedBackRequest, Activity activity2, SdkFeedBackCallback sdkFeedBackCallback) {
            super(cls, activity);
            this.d = list;
            this.f21929c = feedBackRequest;
            this.f21927a = activity2;
            this.f21928b = sdkFeedBackCallback;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Activity activity, String str, String str2, boolean z, VideoCallBack videoCallBack) {
        String sdk = f().getSdk("accessToken");
        if (activity == null || TextUtils.isEmpty(sdk) || TextUtils.isEmpty(str)) {
            a(videoCallBack);
        } else {
            Glide.with(activity.getApplicationContext()).asFile().load((Object) new GlideUrl(str, new LazyHeaders.Builder().addHeader("accessToken", sdk).build())).skipMemoryCache(true).listener(new C0262e(videoCallBack)).into(new b(z, videoCallBack, activity, str, str2));
        }
    }

    /* JADX INFO: renamed from: com.huawei.phoneservice.feedbackcommon.utils.e$e, reason: collision with other inner class name */
    class C0262e implements RequestListener<File> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ VideoCallBack f21921c;

        @Override // com.bumptech.glide.request.RequestListener
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean onResourceReady(File file, Object obj, Target<File> target, DataSource dataSource, boolean z) {
            return false;
        }

        @Override // com.bumptech.glide.request.RequestListener
        public boolean onLoadFailed(GlideException glideException, Object obj, Target<File> target, boolean z) {
            e.this.a(this.f21921c);
            return false;
        }

        C0262e(VideoCallBack videoCallBack) {
            this.f21921c = videoCallBack;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Activity activity, String str, String str2, File file, VideoCallBack videoCallBack) {
        long jB;
        try {
            if (FeedbackMediaData.a(activity).b(str2) == null) {
                MediaEntity mediaEntity = new MediaEntity();
                if (MimeType.isVideoFromUrl(str)) {
                    mediaEntity.type = MimeType.getMimeType(str);
                    jB = b(file.getCanonicalPath());
                } else {
                    mediaEntity.type = MimeType.getMimeType(str);
                    jB = 0L;
                }
                mediaEntity.duration = jB;
                mediaEntity.attach = str2;
                mediaEntity.cache = file.getCanonicalPath();
                mediaEntity.path = file.getCanonicalPath();
                mediaEntity.updateTime = Long.valueOf(System.currentTimeMillis());
                mediaEntity.createTime = Long.valueOf(System.currentTimeMillis());
                mediaEntity.url = str;
                FeedbackMediaData.a(activity).d(mediaEntity);
            } else {
                FeedbackMediaData.a(activity).b(str2, file.getCanonicalPath());
                if (MimeType.isVideoFromUrl(str)) {
                    FeedbackMediaData.a(activity).d(str2, b(file.getCanonicalPath()));
                }
            }
        } catch (IOException e2) {
            com.huawei.phoneservice.faq.base.util.g.c("SdkProblemManager", e2.getMessage());
        }
        if (videoCallBack != null) {
            videoCallBack.setChangeImage(file, MimeType.isVideoFromUrl(str));
        }
    }

    class b extends SimpleTarget<File> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f21911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21912b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ VideoCallBack f21913c;
        final /* synthetic */ String d;
        final /* synthetic */ boolean e;

        @Override // com.bumptech.glide.request.target.Target
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResourceReady(File file, Transition<? super File> transition) throws Throwable {
            if (file.length() >= 100) {
                e.this.b(file, this.f21911a, this.d, this.f21912b, this.f21913c);
                return;
            }
            if (!this.e) {
                e.this.e(file, this.f21913c, this.f21911a, this.d, this.f21912b);
            } else {
                e.this.a(this.f21913c);
            }
            file.delete();
        }

        b(boolean z, VideoCallBack videoCallBack, Activity activity, String str, String str2) {
            this.e = z;
            this.f21913c = videoCallBack;
            this.f21911a = activity;
            this.d = str;
            this.f21912b = str2;
        }
    }

    class c extends BaseSdkUpdateRequest<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f21914a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f21916c;
        final /* synthetic */ String d;
        final /* synthetic */ VideoCallBack e;

        @Override // com.huawei.phoneservice.faq.base.util.BaseSdkUpdateRequest
        public void onCallback(String str, String str2, String str3, Object obj) {
            e.this.b(this.f21914a, this.f21916c, this.d, true, this.e);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Object obj, Activity activity, String str, String str2, VideoCallBack videoCallBack) {
            super(obj);
            this.f21914a = activity;
            this.f21916c = str;
            this.d = str2;
            this.e = videoCallBack;
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f21917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ VideoCallBack f21918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f21919c;
        final /* synthetic */ String d;
        final /* synthetic */ String e;

        @Override // java.lang.Runnable
        public void run() {
            Activity activity = this.f21919c;
            if (activity == null || activity.isFinishing() || this.f21919c.isDestroyed()) {
                return;
            }
            e.this.e(this.f21919c, this.d, this.e, this.f21917a, this.f21918b);
        }

        d(Activity activity, String str, String str2, File file, VideoCallBack videoCallBack) {
            this.f21919c = activity;
            this.d = str;
            this.e = str2;
            this.f21917a = file;
            this.f21918b = videoCallBack;
        }
    }

    static class g {
        private static final e d = new e(null);
    }

    private Long b(String str) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(str);
        return Long.valueOf(Long.parseLong(mediaMetadataRetriever.extractMetadata(9)));
    }

    /* synthetic */ e(b bVar) {
        this();
    }

    private e() {
    }
}
