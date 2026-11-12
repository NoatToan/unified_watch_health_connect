package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.huawei.haf.bundle.InstallSessionState;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class baf implements InstallSessionState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f881c;
    private final List<String> d;
    private final List<String> e;
    private final PendingIntent f;
    private final List<Intent> g;
    private final int i;
    private final long j;

    private baf(Bundle bundle) {
        this.f879a = bundle.getInt("session_id");
        this.i = bundle.getInt("status");
        this.f881c = bundle.getInt("error_code");
        this.f880b = bundle.getLong("bytes_downloaded");
        this.j = bundle.getLong("total_bytes_to_download");
        this.d = bundle.getStringArrayList("module_names");
        this.e = bundle.getStringArrayList("download_module_names");
        this.f = (PendingIntent) bundle.getParcelable("user_confirmation_intent");
        this.g = bundle.getParcelableArrayList("split_file_intents");
    }

    private baf(int i, int i2, baf bafVar) {
        this.f879a = bafVar.f879a;
        this.i = i;
        this.f881c = i2;
        this.f880b = bafVar.f880b;
        this.j = bafVar.j;
        this.d = bafVar.d;
        this.e = bafVar.e;
        this.f = bafVar.f;
        this.g = bafVar.g;
    }

    final baf b(int i) {
        return b(i, errorCode());
    }

    final baf b(int i, int i2) {
        return new baf(i, i2, this);
    }

    static baf a(Bundle bundle) {
        return new baf(bundle);
    }

    @Override // com.huawei.haf.bundle.InstallSessionState
    public int sessionId() {
        return this.f879a;
    }

    @Override // com.huawei.haf.bundle.InstallSessionState
    public int status() {
        return this.i;
    }

    @Override // com.huawei.haf.bundle.InstallSessionState
    public int errorCode() {
        return this.f881c;
    }

    @Override // com.huawei.haf.bundle.InstallSessionState
    public long bytesDownloaded() {
        return this.f880b;
    }

    @Override // com.huawei.haf.bundle.InstallSessionState
    public long totalBytesToDownload() {
        return this.j;
    }

    @Override // com.huawei.haf.bundle.InstallSessionState
    public List<String> moduleNames() {
        return this.d;
    }

    @Override // com.huawei.haf.bundle.InstallSessionState
    public List<String> downloadModuleNames() {
        return this.e;
    }

    @Override // com.huawei.haf.bundle.InstallSessionState
    public final PendingIntent resolutionIntent() {
        return this.f;
    }

    final List<Intent> c() {
        return this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("InstallSessionState{taskId=");
        sb.append(this.f879a);
        sb.append(", status=");
        sb.append(this.i);
        sb.append(", errorCode=");
        sb.append(this.f881c);
        sb.append(", bytes=");
        sb.append(this.f880b);
        sb.append(", totalBytes=");
        sb.append(this.j);
        sb.append(", moduleNames=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
