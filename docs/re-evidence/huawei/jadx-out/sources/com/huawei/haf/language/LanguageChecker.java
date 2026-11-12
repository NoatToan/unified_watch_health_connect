package com.huawei.haf.language;

import com.huawei.haf.download.DownloadPluginCallback;
import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class LanguageChecker {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f5957c = System.getProperty("line.separator");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, String> f5958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f5959b;
    private Map<String, String> d;
    private final LanguagePackage e;
    private Map<String, String> f;

    class CheckDownloadPluginCallback implements DownloadPluginCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final DownloadPluginCallback f5960b;
        final /* synthetic */ LanguageChecker d;
        private final boolean e;

        @Override // com.huawei.haf.download.DownloadPluginCallback
        public boolean onDownloadPluginResult(int i, String str, int i2) {
            if (this.e != this.d.f5959b) {
                return false;
            }
            String strC = this.d.e.c(str, null);
            if (i2 == 0) {
                File fileC = this.d.e.c(str);
                if (fileC != null) {
                    this.d.f.put(str, fileC.getName());
                } else {
                    this.d.f5958a.put(str, strC);
                }
            } else {
                this.d.d.put(str, strC);
            }
            this.f5960b.onDownloadPluginResult(i, str, i2);
            return true;
        }

        @Override // com.huawei.haf.download.DownloadPluginCallback
        public void startDownloadProgress(int i) {
            if (this.e != this.d.f5959b) {
                return;
            }
            this.f5960b.startDownloadProgress(i);
        }

        @Override // com.huawei.haf.download.DownloadPluginCallback
        public void showDownloadProgress(int i, int i2, int i3) {
            if (this.e != this.d.f5959b) {
                return;
            }
            this.f5960b.showDownloadProgress(i, i2, i3);
        }

        @Override // com.huawei.haf.download.DownloadPluginCallback
        public void onDownloadResult(int i, int i2) {
            if (this.e != this.d.f5959b) {
                return;
            }
            this.f5960b.onDownloadResult(i, i2);
        }
    }
}
