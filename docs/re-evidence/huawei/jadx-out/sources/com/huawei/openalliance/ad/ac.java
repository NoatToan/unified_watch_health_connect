package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.activity.ComplianceActivity;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class ac extends ab {
    private ContentRecord d;
    private int[] e;
    private int[] f;

    static class a implements com.huawei.openalliance.ad.activity.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f18105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RemoteCallResultCallback<String> f18106b;

        @Override // com.huawei.openalliance.ad.activity.d
        public void b() {
            hw.b("JsbStartComplianceActivity", "onActivityFinish");
            j.a(this.f18106b, this.f18105a, 1000, 5002, false);
            ComplianceActivity.l();
        }

        @Override // com.huawei.openalliance.ad.activity.d
        public void a() {
            hw.b("JsbStartComplianceActivity", "onActivityShow");
            j.a(this.f18106b, this.f18105a, 1000, 5001, false);
        }

        public a(RemoteCallResultCallback<String> remoteCallResultCallback, String str) {
            this.f18106b = remoteCallResultCallback;
            this.f18105a = str;
        }
    }

    public boolean d(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            if (hw.a()) {
                hw.a("JsbStartComplianceActivity", "parseParam: %s", str);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                ContentRecord contentRecordB = b(context, str);
                this.d = contentRecordB;
                if (contentRecordB != null && !com.huawei.openalliance.ad.utils.bm.a(contentRecordB.aU())) {
                    int iOptInt = jSONObject.optInt("anchorViewX", -1);
                    int iOptInt2 = jSONObject.optInt("anchorViewY", -1);
                    if (-1 != iOptInt && -1 != iOptInt2) {
                        int iOptInt3 = jSONObject.optInt("anchorWidth", -1);
                        int iOptInt4 = jSONObject.optInt("anchorHeight", -1);
                        if (-1 != iOptInt3 && -1 != iOptInt4) {
                            int[] iArr = this.e;
                            iArr[0] = iOptInt;
                            iArr[1] = iOptInt2;
                            int[] iArr2 = this.f;
                            iArr2[0] = iOptInt3;
                            iArr2[1] = iOptInt4;
                            if (hw.a()) {
                                hw.a("JsbStartComplianceActivity", "parse param complete, anchor loc (%s, %s), anchor size (%s, %s)", Integer.valueOf(iOptInt), Integer.valueOf(iOptInt2), Integer.valueOf(iOptInt3), Integer.valueOf(iOptInt4));
                            }
                            return true;
                        }
                        hw.c("JsbStartComplianceActivity", "invalid anchor size");
                        return false;
                    }
                    hw.c("JsbStartComplianceActivity", "invalid anchor loc");
                    return false;
                }
                hw.c("JsbStartComplianceActivity", "content is null or compliance is null.");
                return false;
            } catch (Throwable th) {
                hw.c("JsbStartComplianceActivity", "parse param ex: %s", th.getClass().getSimpleName());
            }
        }
        return false;
    }

    @Override // com.huawei.openalliance.ad.j, com.huawei.openalliance.ad.g
    public void a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        try {
            if (d(context, str)) {
                ComplianceActivity.a(new a(remoteCallResultCallback, this.f19295a));
                ComplianceActivity.a(context, this.e, this.f, this.d, true);
            }
        } catch (Throwable th) {
            hw.c("JsbStartComplianceActivity", "execute ex: %s", th.getClass().getSimpleName());
        }
    }

    public ac() {
        super("pps.advertiserinfo.show");
        this.e = new int[2];
        this.f = new int[2];
    }
}
