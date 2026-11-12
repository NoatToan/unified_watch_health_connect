package com.xmlywind.sdk.mraid;

import android.content.Context;
import android.text.TextUtils;
import com.xmlywind.sdk.base.common.r;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.common.models.sigdsp.pb.MaterialMeta;
import com.xmlywind.wire.okio.ByteString;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class d extends r {
    public d(com.xmlywind.sdk.base.common.k.b bVar) {
        super(bVar);
    }

    public static boolean a(MaterialMeta materialMeta) {
        ByteString byteString;
        return materialMeta.creative_type.intValue() == com.xmlywind.sdk.base.common.j.CreativeTypeMRAID.a() && (!TextUtils.isEmpty(materialMeta.html_url) || ((byteString = materialMeta.html_snippet) != null && byteString.size() > 10));
    }

    public static boolean d(BaseAdUnit baseAdUnit) {
        return (baseAdUnit.getMaterial() == null || TextUtils.isEmpty(baseAdUnit.getCrid())) ? false : true;
    }

    @Override // com.xmlywind.sdk.base.common.r
    public void a(Context context, com.xmlywind.sdk.base.common.k.b bVar) {
        this.b = bVar;
        if (bVar != null) {
            bVar.a(this.c);
        }
    }

    @Override // com.xmlywind.sdk.base.common.r
    public void a(Context context, Map<String, Object> map, BaseAdUnit baseAdUnit) {
        super.a(context, map, baseAdUnit);
    }

    @Override // com.xmlywind.sdk.base.common.r
    public boolean b(BaseAdUnit baseAdUnit) {
        return d(baseAdUnit);
    }

    @Override // com.xmlywind.sdk.base.common.r
    public void c(BaseAdUnit baseAdUnit) {
        super.c(baseAdUnit);
    }
}
