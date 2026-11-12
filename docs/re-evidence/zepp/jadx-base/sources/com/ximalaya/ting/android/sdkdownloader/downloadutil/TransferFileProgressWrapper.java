package com.ximalaya.ting.android.sdkdownloader.downloadutil;

import com.ximalaya.ting.android.opensdk.model.track.Track;
import com.ximalaya.ting.android.sdkdownloader.XmDownloadManager;
import com.ximalaya.ting.android.sdkdownloader.exception.TransferSavePathException;
import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes22.dex */
public class TransferFileProgressWrapper implements ITransferFileProgress {
    private SoftReference<ITransferFileProgress> a;

    public class a implements Runnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Track c;

        public a(int i, int i2, Track track) {
            this.a = i;
            this.b = i2;
            this.c = track;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ITransferFileProgress iTransferFileProgress = (ITransferFileProgress) TransferFileProgressWrapper.this.a.get();
                if (iTransferFileProgress != null) {
                    iTransferFileProgress.progress(this.a, this.b, this.c);
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
                ITransferFileProgress iTransferFileProgress = (ITransferFileProgress) TransferFileProgressWrapper.this.a.get();
                if (iTransferFileProgress != null) {
                    iTransferFileProgress.begin();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ITransferFileProgress iTransferFileProgress = (ITransferFileProgress) TransferFileProgressWrapper.this.a.get();
                if (iTransferFileProgress != null) {
                    iTransferFileProgress.success();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public class d implements Runnable {
        public final /* synthetic */ TransferSavePathException a;

        public d(TransferSavePathException transferSavePathException) {
            this.a = transferSavePathException;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ITransferFileProgress iTransferFileProgress = (ITransferFileProgress) TransferFileProgressWrapper.this.a.get();
                if (iTransferFileProgress != null) {
                    iTransferFileProgress.fail(this.a);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public TransferFileProgressWrapper(ITransferFileProgress iTransferFileProgress) {
        this.a = new SoftReference<>(iTransferFileProgress);
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDoSomethingProgress
    public void begin() {
        if (this.a != null) {
            XmDownloadManager.getInstance().task().autoPost(new b());
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.ITransferFileProgress
    public void progress(int i, int i2, Track track) {
        if (this.a != null) {
            XmDownloadManager.getInstance().task().autoPost(new a(i, i2, track));
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDoSomethingProgress
    public void success() {
        if (this.a != null) {
            XmDownloadManager.getInstance().task().autoPost(new c());
        }
    }

    @Override // com.ximalaya.ting.android.sdkdownloader.downloadutil.IDoSomethingProgress
    public void fail(TransferSavePathException transferSavePathException) {
        if (this.a != null) {
            XmDownloadManager.getInstance().task().autoPost(new d(transferSavePathException));
        }
    }
}
