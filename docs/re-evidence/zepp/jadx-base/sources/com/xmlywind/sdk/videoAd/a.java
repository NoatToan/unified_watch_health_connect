package com.xmlywind.sdk.videoAd;

import android.content.Context;
import com.xmlywind.sdk.base.common.j;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.common.SDKConfig;
import com.xmlywind.sdk.common.models.sigdsp.pb.MaterialMeta;
import com.xmlywind.sdk.common.models.sigdsp.pb.RvAdSetting;
import com.xmlywind.sdk.common.models.ssp.pb.DialogSetting;
import com.xmlywind.sdk.common.utils.m;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class a extends com.xmlywind.sdk.base.common.f implements Serializable {
    public static final long serialVersionUID = 2;
    private int n;
    private int q;
    public int f = 3;
    public int g = 4;
    public float h = 1.0f;
    public int i = -1000;
    public int j = 100;
    public boolean k = false;
    private int m = -1;
    private boolean o = true;
    private d p = null;
    private final List<e> l = new ArrayList();
    public boolean e = false;

    private a() {
    }

    public static a c(BaseAdUnit baseAdUnit) {
        a aVar = new a();
        aVar.a(baseAdUnit.getVideoPath());
        aVar.c(baseAdUnit.getAd_type() == 1);
        aVar.g(baseAdUnit.getMaterial().video_reciprocal_millisecond.intValue());
        aVar.b(baseAdUnit.getMaterial().creative_type.intValue() != j.CreativeTypeVideo_transparent_html.a());
        RvAdSetting rvAdSetting = baseAdUnit.getRvAdSetting();
        DialogSetting closeDialogSetting = SDKConfig.sharedInstance().getCloseDialogSetting();
        aVar.a(closeDialogSetting != null ? new d(closeDialogSetting.title, closeDialogSetting.body_text, closeDialogSetting.cancel_button_text, closeDialogSetting.close_button_text) : new d(com.xmlywind.sdk.base.b.j(), com.xmlywind.sdk.base.b.i(), com.xmlywind.sdk.base.b.l(), com.xmlywind.sdk.base.b.k()));
        if (rvAdSetting != null) {
            aVar.a(rvAdSetting.enable_exit_on_video_close.booleanValue());
            aVar.h(rvAdSetting.skip_percent.intValue());
            aVar.j(rvAdSetting.skip_seconds.intValue());
            aVar.c(rvAdSetting.endcard_close_position.intValue());
            aVar.d(rvAdSetting.video_close_position.intValue());
            aVar.e(rvAdSetting.mute_postion.intValue());
            aVar.a(rvAdSetting.finished.floatValue());
            aVar.f(rvAdSetting.if_mute.intValue());
            aVar.b(rvAdSetting.end_time.intValue());
        }
        return aVar;
    }

    private void c(boolean z) {
        this.e = z;
    }

    public static g d(BaseAdUnit baseAdUnit) {
        if (baseAdUnit == null) {
            return null;
        }
        MaterialMeta material = baseAdUnit.getMaterial();
        return new g(768, 1024, material.interaction_type.intValue(), material.landing_page, material.deeplink_url, new com.xmlywind.sdk.base.views.b(baseAdUnit.resourcePath(), baseAdUnit.getCreativeResourceType(), material.click_type.intValue() == 2 ? com.xmlywind.sdk.base.views.b.a.IMAGE : com.xmlywind.sdk.base.views.b.a.JAVASCRIPT, 720, 1024));
    }

    public int a(int i) {
        int i2 = this.q;
        return (i2 == 0 || i2 * 1000 > i) ? i : i2 * 1000;
    }

    public void a(float f) {
        this.h = f;
    }

    public void a(Context context, int i) {
        m.a.a(context, "context cannot be null");
    }

    public void a(Context context, int i, int i2, BaseAdUnit baseAdUnit) {
        m.a.a(context, "context cannot be null");
    }

    @Override // com.xmlywind.sdk.base.common.f
    public void a(Context context, int i, BaseAdUnit baseAdUnit) {
        m.a.a(context, "context cannot be null");
    }

    public void a(d dVar) {
        this.p = dVar;
    }

    public void a(boolean z) {
        this.o = z;
    }

    @Override // com.xmlywind.sdk.base.common.f
    public String b() {
        return this.b;
    }

    public void b(int i) {
        this.q = i;
    }

    public void b(Context context, int i) {
        m.a.a(context, "context cannot be null");
    }

    public void b(Context context, int i, int i2, BaseAdUnit baseAdUnit) {
        m.a.a(context, "context cannot be null");
    }

    @Override // com.xmlywind.sdk.base.common.f
    public void b(Context context, int i, BaseAdUnit baseAdUnit) {
        m.a.a(context, "context cannot be null");
    }

    public void b(boolean z) {
        this.k = z;
    }

    public void c(int i) {
        if (i <= 0 || i >= 5) {
            return;
        }
        this.f = i;
    }

    public void c(Context context, int i, int i2, BaseAdUnit baseAdUnit) {
        m.a.a(context, "context cannot be null");
    }

    public int d() {
        return this.q;
    }

    public void d(int i) {
        if (i <= 0 || i >= 5) {
            return;
        }
        this.d = i;
    }

    public void e(int i) {
        if (i <= 0 || i >= 5) {
            return;
        }
        this.g = i;
    }

    public boolean e() {
        return this.o;
    }

    public int f() {
        return this.f;
    }

    public void f(int i) {
        this.n = i;
    }

    public int g() {
        return this.d;
    }

    public void g(int i) {
        if (i != 0) {
            this.i = i;
        }
    }

    public int h() {
        return this.g;
    }

    public void h(int i) {
        if (i < 0) {
            i = 0;
        } else if (i > 100) {
            this.j = 100;
            return;
        }
        this.j = i;
    }

    public float i() {
        return this.h;
    }

    public int i(int i) {
        return (int) (i * (this.j / 100.0f));
    }

    public int j() {
        return this.n;
    }

    public void j(int i) {
        this.m = i;
    }

    public int k() {
        return this.i;
    }

    public d l() {
        return this.p;
    }

    public int m() {
        return this.j;
    }

    public int n() {
        return this.m;
    }
}
