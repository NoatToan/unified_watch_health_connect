package com.ximalaya.ting.android.sdkdownloader.downloadutil;

import com.ximalaya.ting.android.sdkdownloader.XmDownloadManager;
import com.ximalaya.ting.android.sdkdownloader.exception.BaseRuntimeException;

/* JADX INFO: loaded from: classes22.dex */
public class DoSomethingProgressWrapper<T extends BaseRuntimeException> implements IDoSomethingProgress<T> {
    private IDoSomethingProgress a;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                IDoSomethingProgress iDoSomethingProgress = DoSomethingProgressWrapper.this.a;
                if (iDoSomethingProgress != null) {
                    iDoSomethingProgress.begin();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                IDoSomethingProgress iDoSomethingProgress = DoSomethingProgressWrapper.this.a;
                if (iDoSomethingProgress != null) {
                    iDoSomethingProgress.success();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ BaseRuntimeException a;

        public c(BaseRuntimeException baseRuntimeException) {
            this.a = baseRuntimeException;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                IDoSomethingProgress iDoSomethingProgress = DoSomethingProgressWrapper.this.a;
                if (iDoSomethingProgress != 0) {
                    iDoSomethingProgress.fail(this.a);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public DoSomethingProgressWrapper(IDoSomethingProgress iDoSomethingProgress) {
        this.a = iDoSomethingProgress;
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDoSomethingProgress
    public void begin() {
        if (this.a != null) {
            XmDownloadManager.getInstance().task().autoPost(new a());
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDoSomethingProgress
    public void fail(T t) {
        if (this.a != null) {
            XmDownloadManager.getInstance().task().autoPost(new c(t));
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDoSomethingProgress
    public void success() {
        if (this.a != null) {
            XmDownloadManager.getInstance().task().autoPost(new b());
        }
    }
}
