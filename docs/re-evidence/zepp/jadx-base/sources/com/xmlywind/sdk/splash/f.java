package com.xmlywind.sdk.splash;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.base.common.k;
import com.xmlywind.sdk.base.common.n;
import com.xmlywind.sdk.base.common.r;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.common.models.sigdsp.pb.MaterialMeta;
import com.xmlywind.volley.i;
import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
class f extends r {
    public d e;
    private com.xmlywind.volley.toolbox.g.a f;
    private SplashAdBroadcastReceiver g;

    public interface a extends k.b, k.c {
        void c();

        void d();

        void e();

        void f();
    }

    public f(k.b bVar) {
        super(bVar);
    }

    public static boolean a(BaseAdUnit baseAdUnit) {
        MaterialMeta material = baseAdUnit.getMaterial();
        return (TextUtils.isEmpty(baseAdUnit.getCrid()) || (TextUtils.isEmpty(material.video_url) && TextUtils.isEmpty(material.image_src))) ? false : true;
    }

    @Override // com.xmlywind.sdk.base.common.r
    public void a(Context context, k.b bVar) {
        this.b = bVar;
        if (bVar != null) {
            bVar.a(this.c);
        }
        BaseAdUnit baseAdUnit = this.c;
        if (baseAdUnit != null) {
            File adPrivacyTemplateFile = baseAdUnit.getAdPrivacyTemplateFile();
            if (adPrivacyTemplateFile != null && !adPrivacyTemplateFile.exists()) {
                com.xmlywind.volley.toolbox.d dVar = new com.xmlywind.volley.toolbox.d();
                dVar.a = this.c.getadPrivacy().privacy_template_url;
                dVar.c = adPrivacyTemplateFile.getAbsolutePath();
                dVar.b = com.xmlywind.volley.toolbox.d.a.OTHER;
                com.xmlywind.volley.toolbox.g gVarA = n.a();
                if (gVarA != null) {
                    gVarA.a(dVar, new com.xmlywind.volley.toolbox.f.a() { // from class: com.xmlywind.sdk.splash.f.1
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
            File file = new File(this.c.getSplashFilePath());
            if (file.exists()) {
                file.setLastModified(System.currentTimeMillis());
                k.b bVar2 = this.b;
                if (bVar2 != null) {
                    bVar2.b(this.c);
                    return;
                }
                return;
            }
            com.xmlywind.volley.toolbox.g gVarA2 = n.a();
            com.xmlywind.volley.toolbox.d dVar2 = new com.xmlywind.volley.toolbox.d();
            dVar2.c = this.c.getSplashFilePath();
            dVar2.a = this.c.getSplashURL();
            dVar2.b = com.xmlywind.volley.toolbox.d.a.OTHER;
            dVar2.h = false;
            this.f = gVarA2.a(dVar2, new com.xmlywind.volley.toolbox.f.a() { // from class: com.xmlywind.sdk.splash.f.2
                @Override // com.xmlywind.volley.toolbox.f.a
                public void a(com.xmlywind.volley.toolbox.d dVar3) {
                    if (f.this.b != null) {
                        f.this.b.b(f.this.c);
                    }
                }

                @Override // com.xmlywind.volley.toolbox.f.a
                public void a(com.xmlywind.volley.toolbox.d dVar3, long j, long j2) {
                }

                @Override // com.xmlywind.volley.toolbox.f.a
                public void b(com.xmlywind.volley.toolbox.d dVar3) {
                }

                @Override // com.xmlywind.volley.toolbox.f.a
                public void c(com.xmlywind.volley.toolbox.d dVar3) {
                    if (f.this.b != null) {
                        String message = dVar3.i.getMessage();
                        i iVar = dVar3.i.a;
                        if (iVar != null) {
                            message = String.valueOf(iVar.a);
                        }
                        f.this.b.a(f.this.c, message);
                    }
                    SigmobLog.e("onErrorResponse: ", dVar3.i);
                }
            });
        }
    }

    @Override // com.xmlywind.sdk.base.common.r
    public void a(Context context, BaseAdUnit baseAdUnit, Bundle bundle) {
        if (baseAdUnit == null) {
            baseAdUnit = this.c;
        }
        this.e = (d) baseAdUnit.getAdConfig();
        super.a(context, baseAdUnit, bundle);
        if (this.b instanceof a) {
            SplashAdBroadcastReceiver splashAdBroadcastReceiver = new SplashAdBroadcastReceiver((a) this.b, this.a);
            this.g = splashAdBroadcastReceiver;
            splashAdBroadcastReceiver.a(splashAdBroadcastReceiver, context);
        }
    }

    @Override // com.xmlywind.sdk.base.common.r
    public void a(Context context, Map<String, Object> map, BaseAdUnit baseAdUnit) {
        super.a(context, map, baseAdUnit);
    }

    @Override // com.xmlywind.sdk.base.common.r
    public boolean b(BaseAdUnit baseAdUnit) {
        return a(baseAdUnit);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.xmlywind.sdk.base.common.r
    public void c(BaseAdUnit baseAdUnit) {
        super.c(baseAdUnit);
        SplashAdBroadcastReceiver splashAdBroadcastReceiver = this.g;
        if (splashAdBroadcastReceiver != null) {
            splashAdBroadcastReceiver.a(splashAdBroadcastReceiver);
            this.g = null;
        }
    }
}
