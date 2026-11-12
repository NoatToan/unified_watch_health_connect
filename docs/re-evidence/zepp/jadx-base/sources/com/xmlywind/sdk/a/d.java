package com.xmlywind.sdk.a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huami.ad.Constants;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.base.common.AdActivity;
import com.xmlywind.sdk.base.common.k;
import com.xmlywind.sdk.base.common.n;
import com.xmlywind.sdk.base.common.r;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.common.models.sigdsp.pb.MaterialMeta;
import com.xmlywind.sdk.common.utils.i;
import com.xmlywind.sdk.videoAd.BaseAdActivity;
import com.xmlywind.volley.toolbox.f;
import com.xmlywind.volley.toolbox.g;
import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
class d extends r {
    public File e;
    private g.a f;

    public d(k.b bVar) {
        super(bVar);
    }

    public File a() {
        return this.e;
    }

    @Override // com.xmlywind.sdk.base.common.r
    public void a(Context context, k.b bVar) {
        this.b = bVar;
        if (bVar != null) {
            bVar.a(this.c);
        }
        BaseAdUnit baseAdUnit = this.c;
        if (baseAdUnit != null) {
            MaterialMeta material = baseAdUnit.getMaterial();
            g gVarC = n.c();
            if (gVarC != null) {
                final String strA = com.xmlywind.sdk.common.utils.k.a(material.image_src);
                com.xmlywind.volley.toolbox.d dVar = new com.xmlywind.volley.toolbox.d();
                dVar.a = material.image_src;
                dVar.b = com.xmlywind.volley.toolbox.d.a.PICTURE;
                dVar.c = com.xmlywind.sdk.common.utils.d.a() + File.separator + strA + ".temp";
                this.f = gVarC.a(dVar, new f.a() { // from class: com.xmlywind.sdk.a.d.1
                    @Override // com.xmlywind.volley.toolbox.f.a
                    public void a(com.xmlywind.volley.toolbox.d dVar2) {
                        File file;
                        File file2 = new File(dVar2.c);
                        if (file2.exists()) {
                            if (i.a(dVar2.c).equals(Constants.GIF_PATH)) {
                                file = new File(com.xmlywind.sdk.common.utils.d.a() + File.separator + strA + ".gif");
                            } else {
                                file = new File(com.xmlywind.sdk.common.utils.d.a() + File.separator + strA + ".jpg");
                            }
                            if (file.exists()) {
                                file.delete();
                            }
                            file2.renameTo(file);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append(com.xmlywind.sdk.common.utils.d.a());
                            String str = File.separator;
                            sb.append(str);
                            sb.append(strA);
                            sb.append(".gif");
                            file = new File(sb.toString());
                            File file3 = new File(com.xmlywind.sdk.common.utils.d.a() + str + strA + ".jpg");
                            if (!file.exists()) {
                                file = file3.exists() ? file3 : null;
                            }
                        }
                        d dVar3 = d.this;
                        dVar3.e = file;
                        if (dVar3.b != null) {
                            d.this.b.b(d.this.c);
                        }
                    }

                    @Override // com.xmlywind.volley.toolbox.f.a
                    public void a(com.xmlywind.volley.toolbox.d dVar2, long j, long j2) {
                    }

                    @Override // com.xmlywind.volley.toolbox.f.a
                    public void b(com.xmlywind.volley.toolbox.d dVar2) {
                    }

                    @Override // com.xmlywind.volley.toolbox.f.a
                    public void c(com.xmlywind.volley.toolbox.d dVar2) {
                        if (d.this.b != null) {
                            String message = dVar2.i.getMessage();
                            com.xmlywind.volley.i iVar = dVar2.i.a;
                            if (iVar != null) {
                                message = String.valueOf(iVar.a);
                            }
                            d.this.b.a(d.this.c, message);
                        }
                        SigmobLog.e("onErrorResponse: ", dVar2.i);
                    }
                });
            }
        }
    }

    @Override // com.xmlywind.sdk.base.common.r
    public void a(Context context, BaseAdUnit baseAdUnit, Bundle bundle) {
        if (baseAdUnit == null) {
            baseAdUnit = this.c;
        }
        super.a(context, baseAdUnit, bundle);
        BaseAdActivity.a(context, AdActivity.class, this.a);
    }

    @Override // com.xmlywind.sdk.base.common.r
    public void a(Context context, Map<String, Object> map, BaseAdUnit baseAdUnit) {
        super.a(context, map, baseAdUnit);
    }

    @Override // com.xmlywind.sdk.base.common.r
    public boolean b(BaseAdUnit baseAdUnit) {
        if (baseAdUnit.getMaterial() != null) {
            MaterialMeta material = baseAdUnit.getMaterial();
            if (!TextUtils.isEmpty(baseAdUnit.getCrid()) && !TextUtils.isEmpty(material.image_src)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.xmlywind.sdk.base.common.r
    public void c(BaseAdUnit baseAdUnit) {
        super.c(baseAdUnit);
        g.a aVar = this.f;
        if (aVar != null) {
            aVar.g();
            this.f = null;
        }
    }
}
