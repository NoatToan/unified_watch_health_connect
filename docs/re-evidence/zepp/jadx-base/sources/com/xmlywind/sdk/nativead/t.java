package com.xmlywind.sdk.nativead;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.base.models.SigImage;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class t implements s {
    private final String a;
    private final String b;
    private final String c;
    private final List<SigImage> d;
    private final int e;
    private final q f;

    public t(Context context, BaseAdUnit baseAdUnit) {
        this.a = baseAdUnit.getTitle();
        this.b = baseAdUnit.getDesc();
        this.c = baseAdUnit.getIconUrl();
        this.d = baseAdUnit.getImageUrlList();
        this.e = baseAdUnit.getNativeAd().type.intValue();
        q qVar = new q();
        this.f = qVar;
        qVar.a(context, baseAdUnit, this);
    }

    @Override // com.xmlywind.sdk.nativead.s
    public k a(Activity activity) {
        q qVar = this.f;
        if (qVar != null) {
            return qVar.a(activity);
        }
        return null;
    }

    @Override // com.xmlywind.sdk.nativead.s
    public String a() {
        q qVar = this.f;
        return qVar != null ? qVar.w() : "";
    }

    @Override // com.xmlywind.sdk.nativead.s
    public void a(ViewGroup viewGroup, g gVar) {
        q qVar = this.f;
        if (qVar != null) {
            qVar.a(viewGroup, gVar);
        }
    }

    @Override // com.xmlywind.sdk.nativead.s
    public void a(ViewGroup viewGroup, List<View> list, n nVar) {
        q qVar = this.f;
        if (qVar != null) {
            qVar.a(viewGroup, list, nVar);
        }
    }

    @Override // com.xmlywind.sdk.nativead.s
    public void a(List<ImageView> list, int i) {
        q qVar = this.f;
        if (qVar != null) {
            qVar.a(list, i);
        }
    }

    @Override // com.xmlywind.sdk.nativead.s
    public Bitmap b() {
        return this.f.x();
    }

    @Override // com.xmlywind.sdk.nativead.s
    public String c() {
        return this.a;
    }

    @Override // com.xmlywind.sdk.nativead.s
    public String d() {
        return this.b;
    }

    @Override // com.xmlywind.sdk.nativead.s
    public String e() {
        return this.c;
    }

    @Override // com.xmlywind.sdk.nativead.s
    public List<SigImage> f() {
        return this.d;
    }

    @Override // com.xmlywind.sdk.nativead.s
    public int g() {
        return this.e;
    }

    @Override // com.xmlywind.sdk.nativead.s
    public void h() {
        q qVar = this.f;
        if (qVar != null) {
            qVar.t();
        }
    }

    @Override // com.xmlywind.sdk.nativead.s
    public void i() {
        q qVar = this.f;
        if (qVar != null) {
            qVar.y();
        }
    }

    @Override // com.xmlywind.sdk.nativead.s
    public void j() {
        q qVar = this.f;
        if (qVar != null) {
            qVar.z();
        }
    }

    @Override // com.xmlywind.sdk.nativead.s
    public void k() {
        q qVar = this.f;
        if (qVar != null) {
            qVar.B();
        }
    }

    @Override // com.xmlywind.sdk.nativead.s
    public void l() {
        q qVar = this.f;
        if (qVar != null) {
            qVar.C();
        }
    }
}
