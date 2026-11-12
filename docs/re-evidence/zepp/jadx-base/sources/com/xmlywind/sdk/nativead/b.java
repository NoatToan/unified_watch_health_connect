package com.xmlywind.sdk.nativead;

import android.content.Context;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.base.models.SigMacroCommon;
import com.xmlywind.sdk.common.models.sigdsp.pb.NativeAdSetting;
import com.xmlywind.sdk.common.models.sigdsp.pb.SingleNativeAdSetting;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes22.dex */
public class b extends com.xmlywind.sdk.base.common.f {
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private Boolean l;

    public static b c(BaseAdUnit baseAdUnit) {
        b bVar = new b();
        bVar.b(baseAdUnit);
        return bVar;
    }

    @Override // com.xmlywind.sdk.base.common.f
    public void a(Context context, com.xmlywind.sdk.common.utils.q qVar, com.xmlywind.sdk.common.utils.q qVar2, com.xmlywind.sdk.base.a aVar, BaseAdUnit baseAdUnit) {
        SigMacroCommon macroCommon = baseAdUnit.getMacroCommon();
        if (macroCommon != null) {
            macroCommon.addMarcoKey(SigMacroCommon._DOWNX_, String.valueOf(qVar.a()));
            macroCommon.addMarcoKey(SigMacroCommon._DOWNY_, String.valueOf(qVar.b()));
            macroCommon.addMarcoKey(SigMacroCommon._UPX_, String.valueOf(qVar2.a()));
            macroCommon.addMarcoKey(SigMacroCommon._UPY_, String.valueOf(qVar2.b()));
        }
        b(baseAdUnit, context, (String) null, aVar, String.format("%d,%d,%d,%d", Integer.valueOf(qVar.a()), Integer.valueOf(qVar.b()), Integer.valueOf(qVar2.a()), Integer.valueOf(qVar2.b())), true);
    }

    @Override // com.xmlywind.sdk.base.common.f
    public void b(BaseAdUnit baseAdUnit) {
        super.b(baseAdUnit);
        NativeAdSetting nativeAdSetting = baseAdUnit.getNativeAdSetting();
        SingleNativeAdSetting singleNativeSetting = baseAdUnit.getSingleNativeSetting();
        if (singleNativeSetting != null) {
            this.k = singleNativeSetting.use_na_video_component.booleanValue();
        }
        if (nativeAdSetting != null) {
            this.f = nativeAdSetting.preview_page_video_mute.intValue();
            this.g = nativeAdSetting.detail_page_video_mute.intValue();
            this.h = nativeAdSetting.impression_percent.intValue();
            this.i = nativeAdSetting.impression_time.intValue();
            this.e = nativeAdSetting.video_auto_play.intValue();
            this.j = nativeAdSetting.end_impression_time.intValue();
        }
        ArrayList arrayList = new ArrayList();
        com.xmlywind.sdk.base.common.e.a aVar = com.xmlywind.sdk.base.common.e.a.QUARTILE_EVENT;
        arrayList.add(new com.xmlywind.sdk.videoAd.e(aVar, com.xmlywind.sdk.base.common.a.AD_PLAY_QUARTER, 0.25f));
        arrayList.add(new com.xmlywind.sdk.videoAd.e(aVar, com.xmlywind.sdk.base.common.a.AD_PLAY_TWO_QUARTERS, 0.5f));
        arrayList.add(new com.xmlywind.sdk.videoAd.e(aVar, com.xmlywind.sdk.base.common.a.AD_PLAY_THREE_QUARTERS, 0.75f));
        a(arrayList);
    }

    public void c(Context context, BaseAdUnit baseAdUnit) {
        com.xmlywind.sdk.base.common.t.a(PointCategory.TEMPLATE_SHOW, (String) null, baseAdUnit);
    }

    public void d(Context context, BaseAdUnit baseAdUnit) {
        com.xmlywind.sdk.base.common.t.a(PointCategory.TEMPLATE_CLOSE, (String) null, baseAdUnit);
    }

    public boolean d() {
        return this.k;
    }

    public int e() {
        return this.e;
    }

    public void e(Context context, BaseAdUnit baseAdUnit) {
        com.xmlywind.sdk.base.common.t.b(PointCategory.FEED_CLICK, null, baseAdUnit);
        com.xmlywind.sdk.base.a.c.a(baseAdUnit, com.xmlywind.sdk.base.common.a.AD_FEED_CLICK);
    }

    public boolean f() {
        Boolean bool = this.l;
        if (bool != null) {
            return bool.booleanValue();
        }
        return this.f == 0;
    }

    public boolean g() {
        return this.g != 0;
    }

    public int h() {
        int i = this.h;
        if (i != 0) {
            return i;
        }
        return 50;
    }

    public int i() {
        int i = this.i;
        if (i != 0) {
            return i;
        }
        return 1;
    }

    public boolean j() {
        if (e() != 0) {
            return e() == 1 && com.xmlywind.sdk.common.a.n().S() == 100;
        }
        return true;
    }
}
