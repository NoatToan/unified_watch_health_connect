package com.google.android.exoplayer2.offline;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class e implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53036b;

    public /* synthetic */ e(Object obj, int i14) {
        this.f53035a = i14;
        this.f53036b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f53035a) {
            case 0:
                return ((DownloadHelper.MediaPreparer) this.f53036b).handleDownloadHelperCallbackMessage(message);
            default:
                return ((DownloadManager) this.f53036b).handleMainMessage(message);
        }
    }
}
