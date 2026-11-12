package com.xmlywind.sdk.nativead;

import android.content.Context;
import android.os.Bundle;
import com.xmlywind.sdk.base.common.AdActivity;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.common.models.sigdsp.pb.MaterialMeta;
import com.xmlywind.sdk.videoAd.BaseAdActivity;
import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class c extends com.xmlywind.sdk.base.common.r {
    private NativeAdBroadcastReceiver e;

    public interface a extends com.xmlywind.sdk.base.common.k.b, com.xmlywind.sdk.base.common.k.c {
        void c();

        void d();

        void e();
    }

    public c(com.xmlywind.sdk.base.common.k.b bVar) {
        super(bVar);
    }

    private static boolean a(MaterialMeta materialMeta) {
        return true;
    }

    @Override // com.xmlywind.sdk.base.common.r
    public void a(Context context, com.xmlywind.sdk.base.common.k.b bVar) {
        File adPrivacyTemplateFile = this.c.getAdPrivacyTemplateFile();
        if (adPrivacyTemplateFile == null || adPrivacyTemplateFile.exists()) {
            return;
        }
        com.xmlywind.volley.toolbox.d dVar = new com.xmlywind.volley.toolbox.d();
        dVar.a = this.c.getadPrivacy().privacy_template_url;
        dVar.c = adPrivacyTemplateFile.getAbsolutePath();
        dVar.b = com.xmlywind.volley.toolbox.d.a.OTHER;
        com.xmlywind.volley.toolbox.g gVarA = com.xmlywind.sdk.base.common.n.a();
        if (gVarA != null) {
            gVarA.a(dVar, new com.xmlywind.volley.toolbox.f.a() { // from class: com.xmlywind.sdk.nativead.c.1
                @Override // com.xmlywind.volley.toolbox.f.a
                public void a(com.xmlywind.volley.toolbox.d dVar2) {
                }

                @Override // com.xmlywind.volley.toolbox.f.a
                public void a(com.xmlywind.volley.toolbox.d dVar2, long j, long j2) {
                }

                @Override // com.xmlywind.volley.toolbox.f.a
                public void b(com.xmlywind.volley.toolbox.d dVar2) {
                }

                @Override // com.xmlywind.volley.toolbox.f.a
                public void c(com.xmlywind.volley.toolbox.d dVar2) {
                }
            });
        }
    }

    @Override // com.xmlywind.sdk.base.common.r
    public void a(Context context, BaseAdUnit baseAdUnit, Bundle bundle) {
        super.a(context, baseAdUnit, bundle);
        BaseAdActivity.a(context, AdActivity.class, this.a, bundle, "LandNative");
    }

    @Override // com.xmlywind.sdk.base.common.r
    public void a(Context context, Map<String, Object> map, BaseAdUnit baseAdUnit) {
        super.a(context, map, baseAdUnit);
        if (this.e == null && (this.b instanceof a)) {
            NativeAdBroadcastReceiver nativeAdBroadcastReceiver = new NativeAdBroadcastReceiver((a) this.b, this.a);
            this.e = nativeAdBroadcastReceiver;
            nativeAdBroadcastReceiver.a(nativeAdBroadcastReceiver, context);
        }
    }

    @Override // com.xmlywind.sdk.base.common.r
    public boolean b(BaseAdUnit baseAdUnit) {
        if (baseAdUnit.getMaterial() != null) {
            return a(baseAdUnit.getMaterial());
        }
        return false;
    }

    @Override // com.xmlywind.sdk.base.common.r
    public void c(BaseAdUnit baseAdUnit) {
        super.c(baseAdUnit);
    }
}
