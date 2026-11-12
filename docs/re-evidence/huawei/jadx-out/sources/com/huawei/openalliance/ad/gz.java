package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.ads.VideoConfiguration;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.data.AdLandingPageData;
import com.huawei.openalliance.ad.inter.data.ImageInfo;
import com.huawei.openalliance.ad.inter.data.VideoInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: loaded from: classes12.dex */
public class gz implements ha {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ArrayList<Integer> f18858c = new ArrayList<Integer>() { // from class: com.huawei.openalliance.ad.gz.1
        {
            add(3);
            add(1);
        }
    };
    private static ArrayList<Integer> d = new ArrayList<Integer>() { // from class: com.huawei.openalliance.ad.gz.2
        {
            add(12);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected AdLandingPageData f18859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ContentRecord f18860b;
    private final String e;
    private final String f;
    private hg g;
    private boolean h;
    private boolean i;
    private boolean j;
    private VideoInfo k;
    private ImageInfo l;
    private long m;
    private boolean n;
    private boolean o;
    private int p;
    private String q;
    private dn r;
    private Context s;
    private VideoConfiguration t;

    @Override // com.huawei.openalliance.ad.ha
    public VideoConfiguration n() {
        return this.t;
    }

    @Override // com.huawei.openalliance.ad.ha
    public boolean m() {
        return (k() == 3 && "1".equals(this.f18860b.af()) && "4".equals(this.f18860b.j().J())) ? false : true;
    }

    @Override // com.huawei.openalliance.ad.ha
    public boolean l() {
        int iK = k();
        if (!f18858c.contains(Integer.valueOf(iK)) || g() == null) {
            return false;
        }
        if (iK != 1) {
            return true;
        }
        return d.contains(Integer.valueOf(e()));
    }

    @Override // com.huawei.openalliance.ad.ha
    public int k() {
        return this.p;
    }

    public ImageInfo j() {
        String strC;
        dn dnVarA;
        if (this.l == null) {
            hg hgVar = this.g;
            if (hgVar != null) {
                this.l = a(hgVar.b());
            }
            ImageInfo imageInfo = this.l;
            if (imageInfo != null && imageInfo.getUrl() != null) {
                String url = this.l.getUrl();
                if (url.startsWith("http")) {
                    String strB = com.huawei.openalliance.ad.utils.bd.b(this.s, url);
                    dn dnVar = this.r;
                    strC = dnVar.c(dnVar.e(strB));
                    if (com.huawei.openalliance.ad.utils.dg.b(strC)) {
                        dnVarA = dk.a(this.s, Constants.TPLATE_CACHE);
                        this.r = dnVarA;
                        url = dnVarA.e(strB);
                        strC = dnVarA.c(url);
                    }
                } else if (dn.i(url)) {
                    strC = this.r.c(url);
                    if (!com.huawei.openalliance.ad.utils.ai.d(new File(strC))) {
                        dnVarA = dk.a(this.s, Constants.TPLATE_CACHE);
                        this.r = dnVarA;
                        strC = dnVarA.c(url);
                    }
                } else {
                    strC = null;
                }
                this.l.c(strC);
            }
        }
        return this.l;
    }

    public String i() {
        hg hgVar = this.g;
        if (hgVar != null) {
            return hgVar.f();
        }
        return null;
    }

    public int hashCode() {
        String strB = b();
        return (strB != null ? strB.hashCode() : -1) & super.hashCode();
    }

    @Override // com.huawei.openalliance.ad.ha
    public String h() {
        AdLandingPageData adLandingPageData = this.f18859a;
        if (adLandingPageData != null) {
            return adLandingPageData.f();
        }
        return null;
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
    public VideoInfo g() {
        if (this.k == null) {
            hg hgVar = this.g;
            if (hgVar != null && hgVar.a() != null) {
                VideoInfo videoInfo = new VideoInfo(this.g.a());
                this.k = videoInfo;
                videoInfo.c(this.g.k());
                this.k.e(this.g.k());
                this.k.i(TextUtils.equals(this.g.j(), "a") ? 1 : 0);
                this.k.b(this.g.j());
                int iC = this.g.c();
                hw.b("LinkedNativeAd", "obtain progress from native view %s %s", Integer.valueOf(iC), this.g.h());
                this.k.e(this.g.e());
                this.k.e(iC);
                this.k.g(this.g.h());
            }
            this.f18860b = pn.a(this.f18859a);
        }
        return this.k;
    }

    @Override // com.huawei.openalliance.ad.ha
    public String f() {
        hg hgVar = this.g;
        return hgVar != null ? hgVar.g() : String.valueOf(com.huawei.openalliance.ad.utils.as.c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof gz)) {
            return false;
        }
        if (obj.hashCode() == hashCode()) {
            return true;
        }
        String strB = b();
        if (strB != null) {
            return TextUtils.equals(strB, ((gz) obj).b());
        }
        return false;
    }

    public int e() {
        AdLandingPageData adLandingPageData = this.f18859a;
        if (adLandingPageData != null) {
            return adLandingPageData.t();
        }
        return 0;
    }

    public int d() {
        AdLandingPageData adLandingPageData = this.f18859a;
        if (adLandingPageData != null) {
            return adLandingPageData.s();
        }
        return 0;
    }

    public AdLandingPageData c() {
        return this.f18859a;
    }

    public String b() {
        AdLandingPageData adLandingPageData = this.f18859a;
        if (adLandingPageData != null) {
            return adLandingPageData.getContentId();
        }
        return null;
    }

    public ContentRecord a() {
        return this.f18860b;
    }

    public static ImageInfo a(com.huawei.openalliance.ad.beans.metadata.ImageInfo imageInfo) {
        if (imageInfo != null) {
            return new ImageInfo(imageInfo);
        }
        return null;
    }

    public gz(Context context, AdLandingPageData adLandingPageData, hg hgVar) {
        String string = UUID.randomUUID().toString();
        this.e = string;
        this.h = false;
        this.i = false;
        this.j = false;
        this.m = -1L;
        this.n = false;
        this.o = false;
        this.p = -1;
        this.f18859a = adLandingPageData;
        this.g = hgVar;
        this.r = dk.a(context, "normal");
        AdLandingPageData adLandingPageData2 = this.f18859a;
        if (adLandingPageData2 != null) {
            this.p = adLandingPageData2.getAdType();
            this.f18859a.j(string);
        }
        if (hgVar != null) {
            this.q = hgVar.f();
            this.t = hgVar.i();
        }
        this.s = context;
        this.f = null;
    }
}
