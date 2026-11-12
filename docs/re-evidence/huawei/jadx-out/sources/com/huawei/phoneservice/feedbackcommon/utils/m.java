package com.huawei.phoneservice.feedbackcommon.utils;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.httpclient.Submit;
import com.huawei.phoneservice.faq.base.network.FaqNewCallback;
import com.huawei.phoneservice.faq.base.network.FaqWebServiceException;
import com.huawei.phoneservice.faq.base.util.BaseSdkUpdateRequest;
import com.huawei.phoneservice.feedbackcommon.db.FeedbackMediaData;
import com.huawei.phoneservice.feedbackcommon.entity.MediaEntity;
import com.huawei.phoneservice.feedbackcommon.entity.z;
import java.io.File;
import java.lang.ref.WeakReference;
import java.net.ConnectException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes13.dex */
public class m extends com.huawei.phoneservice.feedbackcommon.utils.d {
    private Context h;
    private MediaEntity i;
    private WeakReference<NotifyUploadFileListener> j;

    public void b(NotifyUploadFileListener notifyUploadFileListener) {
        boolean z;
        if (notifyUploadFileListener != null) {
            this.j = new WeakReference<>(notifyUploadFileListener);
        }
        if (com.huawei.phoneservice.faq.base.util.k.b(this.i.cache)) {
            return;
        }
        File file = new File(this.i.cache);
        if (file.canRead()) {
            z = false;
        } else {
            String str = this.i.cache;
            z = true;
            file = com.huawei.phoneservice.feedbackcommon.utils.a.c(this.h, Uri.parse(this.i.strUri), str.substring(str.lastIndexOf("/") + 1));
        }
        a(this.i, file, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(MediaEntity mediaEntity) {
        Submit<ResponseBody> submitUploadFile = c.f21899b.uploadFile(this.h, new File(mediaEntity.cache), mediaEntity.type, e.f().getSdk("accessToken"), new a(z.class, null, mediaEntity));
        if (submitUploadFile == null) {
            return;
        }
        WeakReference<Submit<ResponseBody>> weakReference = this.f21901b;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f21901b = new WeakReference<>(submitUploadFile);
    }

    private NotifyUploadFileListener e() {
        WeakReference<NotifyUploadFileListener> weakReference = this.j;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, File file) {
        if (z && file.exists()) {
            file.delete();
        }
    }

    private void a(MediaEntity mediaEntity, File file, boolean z) {
        Submit<ResponseBody> submitUploadFile = c.f21899b.uploadFile(this.h, file, mediaEntity.type, e.f().getSdk("accessToken"), new d(z.class, null, mediaEntity, z, file));
        WeakReference<Submit<ResponseBody>> weakReference = this.f21901b;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f21901b = new WeakReference<>(submitUploadFile);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(MediaEntity mediaEntity) {
        b bVar = new b(mediaEntity);
        WeakReference<BaseSdkUpdateRequest> weakReference = this.f21902c;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f21902c = new WeakReference<>(bVar);
        com.huawei.phoneservice.faq.base.util.i.a().registerUpdateListener(bVar);
        com.huawei.phoneservice.faq.base.util.i.a().onSdkErr("accessToken", e.f().getSdk("accessToken"));
    }

    class a extends FaqNewCallback<z> {
        final /* synthetic */ MediaEntity e;

        @Override // com.huawei.phoneservice.faq.base.network.FaqNewCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th, z zVar) {
            if (th != null || zVar == null) {
                if ((th instanceof SocketTimeoutException) || (th instanceof ConnectException)) {
                    m.this.c(5, 1, null);
                    return;
                } else {
                    m.this.c(5, 3, null);
                    return;
                }
            }
            String strC = zVar.c();
            MediaEntity mediaEntity = this.e;
            mediaEntity.attach = strC;
            mediaEntity.updateTime = Long.valueOf(System.currentTimeMillis());
            FeedbackMediaData.a(m.this.h).d(this.e);
            m.this.c(4, -1, strC);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class cls, Activity activity, MediaEntity mediaEntity) {
            super(cls, activity);
            this.e = mediaEntity;
        }
    }

    class b extends BaseSdkUpdateRequest<MediaEntity> {
        @Override // com.huawei.phoneservice.faq.base.util.BaseSdkUpdateRequest
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onCallback(String str, String str2, String str3, MediaEntity mediaEntity) {
            if ("accessToken".equals(str)) {
                com.huawei.phoneservice.faq.base.util.i.a().unregisterUpdateListener(this);
                WeakReference<BaseSdkUpdateRequest> weakReference = m.this.f21902c;
                if (weakReference != null) {
                    weakReference.clear();
                    m.this.f21902c = null;
                }
                m.this.b(mediaEntity);
            }
        }

        b(MediaEntity mediaEntity) {
            super(mediaEntity);
        }
    }

    class d extends FaqNewCallback<z> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f21955b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MediaEntity f21956c;
        final /* synthetic */ File e;

        @Override // com.huawei.phoneservice.faq.base.network.FaqNewCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(Throwable th, z zVar) {
            m mVar;
            int i;
            if (th != null || zVar == null) {
                boolean z = th instanceof FaqWebServiceException;
                if (z && ((FaqWebServiceException) th).errorCode == 401 && com.huawei.phoneservice.faq.base.util.i.a().haveSdkErr("accessToken")) {
                    m.this.d(this.f21956c);
                } else {
                    if ((th instanceof SocketTimeoutException) || (th instanceof ConnectException)) {
                        mVar = m.this;
                        i = 1;
                    } else if (z && ((FaqWebServiceException) th).errorCode == 408) {
                        mVar = m.this;
                        i = 2;
                    } else {
                        mVar = m.this;
                        if (mVar.f21901b != null) {
                            i = 3;
                        }
                    }
                    mVar.c(5, i, null);
                }
            } else {
                String strC = zVar.c();
                MediaEntity mediaEntity = this.f21956c;
                mediaEntity.attach = strC;
                mediaEntity.updateTime = Long.valueOf(System.currentTimeMillis());
                FeedbackMediaData.a(m.this.h).d(this.f21956c);
                m.this.c(4, -1, strC);
            }
            m.this.a(this.f21955b, this.e);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Class cls, Activity activity, MediaEntity mediaEntity, boolean z, File file) {
            super(cls, activity);
            this.f21956c = mediaEntity;
            this.f21955b = z;
            this.e = file;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, int i2, String str) {
        NotifyUploadFileListener notifyUploadFileListenerE = e();
        if (notifyUploadFileListenerE != null) {
            notifyUploadFileListenerE.uploadNotify(i, i2, str);
        }
    }

    public m(Context context, MediaEntity mediaEntity) {
        this.i = mediaEntity;
        this.h = context;
    }
}
