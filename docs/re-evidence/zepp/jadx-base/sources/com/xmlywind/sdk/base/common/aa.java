package com.xmlywind.sdk.base.common;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.common.models.SigmobError;
import com.xmlywind.sdk.common.models.sigdsp.pb.MaterialMeta;
import com.xmlywind.wire.okio.ByteString;

/* JADX INFO: loaded from: classes22.dex */
public abstract class aa extends com.xmlywind.sdk.mraid.d implements d.b {
    public aa(k.b bVar) {
        super(bVar);
    }

    private static boolean b(MaterialMeta materialMeta) {
        return (materialMeta.creative_type.intValue() != j.CreativeTypeVideo_Tar.a() || TextUtils.isEmpty(materialMeta.endcard_md5) || TextUtils.isEmpty(materialMeta.endcard_url) || TextUtils.isEmpty(materialMeta.video_url)) ? false : true;
    }

    private static boolean c(MaterialMeta materialMeta) {
        ByteString byteString;
        return (materialMeta.creative_type.intValue() == j.CreativeTypeVideo_Html_Snippet.a() || materialMeta.creative_type.intValue() == j.CreativeTypeVideo_transparent_html.a()) && (byteString = materialMeta.html_snippet) != null && byteString.size() > 10 && !TextUtils.isEmpty(materialMeta.video_url);
    }

    private static boolean d(MaterialMeta materialMeta) {
        return (materialMeta.creative_type.intValue() != j.CreativeTypeVideo_EndCardURL.a() || TextUtils.isEmpty(materialMeta.html_url) || TextUtils.isEmpty(materialMeta.video_url)) ? false : true;
    }

    @Override // com.xmlywind.sdk.mraid.d, com.xmlywind.sdk.base.common.r
    public void a(Context context, k.b bVar) {
        super.a(context, bVar);
        d.f().a(this.c, this);
    }

    @Override // com.xmlywind.sdk.base.common.r
    public void a(Context context, BaseAdUnit baseAdUnit, Bundle bundle) {
        d.a(baseAdUnit);
        super.a(context, baseAdUnit, bundle);
    }

    @Override // com.xmlywind.sdk.base.common.d.b
    public void a(BaseAdUnit baseAdUnit) {
        k.b bVar = this.b;
        if (bVar != null) {
            bVar.b(baseAdUnit);
        }
    }

    @Override // com.xmlywind.sdk.base.common.d.b
    public void a(BaseAdUnit baseAdUnit, SigmobError sigmobError, String str) {
        k.b bVar = this.b;
        if (bVar != null) {
            bVar.a(baseAdUnit, str);
        }
    }

    @Override // com.xmlywind.sdk.mraid.d, com.xmlywind.sdk.base.common.r
    public boolean b(BaseAdUnit baseAdUnit) {
        boolean zA;
        boolean zB = super.b(baseAdUnit);
        MaterialMeta material = baseAdUnit.getMaterial();
        if (baseAdUnit.getCreativeType() == j.CreativeTypeMRAID.a()) {
            zA = com.xmlywind.sdk.mraid.d.a(material);
        } else {
            zA = b(material) || c(material) || d(material);
        }
        return zB && zA;
    }

    @Override // com.xmlywind.sdk.mraid.d, com.xmlywind.sdk.base.common.r
    public void c(BaseAdUnit baseAdUnit) {
        d.c(baseAdUnit);
        super.c(baseAdUnit);
    }
}
