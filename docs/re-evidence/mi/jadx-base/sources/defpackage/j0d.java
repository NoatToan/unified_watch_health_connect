package defpackage;

import android.text.TextUtils;
import com.xiaomi.smarthome.bluetooth.Response;

/* JADX INFO: loaded from: classes6.dex */
public abstract class j0d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22290a;

    public class a implements Response.FirmwareUpgradeResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Response.FirmwareUpgradeResponse f22291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f22292b;

        public a(Response.FirmwareUpgradeResponse firmwareUpgradeResponse, String str) {
            this.f22291a = firmwareUpgradeResponse;
            this.f22292b = str;
        }

        @Override // com.xiaomi.smarthome.bluetooth.Response.ProgressResponse
        public void onProgress(int i) {
            this.f22291a.onProgress(i);
        }

        @Override // com.xiaomi.smarthome.bluetooth.Response.FirmwareUpgradeResponse
        public void onResponse(int i, String str, String str2) {
            if (i == 0 && !TextUtils.isEmpty(str)) {
                this.f22291a.onResponse(i, str, str2);
                j0d.this.f22290a = 0;
                return;
            }
            j0d j0dVar = j0d.this;
            int i2 = j0dVar.f22290a;
            if (i2 == 2) {
                this.f22291a.onResponse(i, str, str2);
                j0d.this.f22290a = 0;
            } else {
                j0dVar.f22290a = i2 + 1;
                j0dVar.a(this.f22292b, this.f22291a);
            }
        }
    }

    public void a(String str, Response.FirmwareUpgradeResponse firmwareUpgradeResponse) {
        tq2.g(str, new a(firmwareUpgradeResponse, str));
    }
}
