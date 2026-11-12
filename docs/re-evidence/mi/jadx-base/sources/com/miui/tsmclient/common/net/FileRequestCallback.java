package com.miui.tsmclient.common.net;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public interface FileRequestCallback extends RequestCallback<File> {
    void onProgress(int i);
}
