package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.openalliance.ad.beans.metadata.ApkInfo;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.constant.ClickDestination;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.inter.data.FeedbackInfo;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.inter.data.VideoInfo;
import com.huawei.openalliance.ad.uriaction.interfaces.HandleUrlCallBack;
import com.huawei.openalliance.ad.views.interfaces.IPPSNativeView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class nm extends jr<IPPSNativeView> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f19749c = "nm";
    private Context d;
    private com.huawei.openalliance.ad.inter.data.e e;
    private HandleUrlCallBack f;

    public void c(List<FeedbackInfo> list) {
        this.f19384b.b(list);
    }

    public void c(String str) {
        if (this.f19383a == null) {
            return;
        }
        this.f19383a.b(str);
        this.f19384b.a(this.f19383a);
    }

    public void b(List<FeedbackInfo> list) {
        this.f19384b.c(list);
    }

    public void b(String str) {
        if (this.f19383a == null) {
            return;
        }
        this.f19383a.C(str);
        this.f19384b.a(this.f19383a);
    }

    public void b() {
        this.f19384b.p();
    }

    public boolean a(MaterialClickInfo materialClickInfo, Integer num, String str, boolean z, HashMap<String, String> map) {
        com.huawei.openalliance.ad.inter.data.e eVar = this.e;
        if (eVar == null) {
            return false;
        }
        eVar.f(true);
        String str2 = f19749c;
        hw.a(str2, "begin to deal click");
        Map<String, String> mapAp = this.e.ap();
        a(map);
        com.huawei.openalliance.ad.uriaction.interfaces.a aVarA = tu.a(this.d, this.f19383a, mapAp);
        aVarA.a(this.f);
        if (!z) {
            a(ClickDestination.LAUNCH_EASTER_EGG, materialClickInfo, num, str);
            return true;
        }
        if (!com.huawei.openalliance.ad.utils.dk.b(this.d)) {
            boolean zA = a(aVarA, materialClickInfo, num.intValue(), str);
            aVarA.a(zA);
            return zA;
        }
        hw.b(str2, "screenLocked onAdClick");
        com.huawei.hms.ads.inner.a.a(this.d, new a(this, aVarA, materialClickInfo, num.intValue(), str));
        aVarA.a(true);
        return true;
    }

    public boolean a(MaterialClickInfo materialClickInfo, Integer num, String str, String str2, HashMap<String, String> map) {
        com.huawei.openalliance.ad.inter.data.e eVar = this.e;
        if (eVar == null) {
            return false;
        }
        eVar.f(true);
        hw.a(f19749c, "begin to deal click with destination");
        a(map);
        a(str2, materialClickInfo, num, str);
        return true;
    }

    public void a(List<String> list) {
        this.f19384b.a(0, 0, list);
    }

    public void a(Long l, Integer num, Integer num2, String str) {
        String strF = f();
        com.huawei.openalliance.ad.inter.data.e eVar = this.e;
        if (eVar != null) {
            hw.a(f19749c, "slotId: %s, contentId: %s, slot pos: %s", eVar.getSlotId(), this.e.getContentId(), strF);
        }
        com.huawei.openalliance.ad.processor.eventbeans.a.C0229a c0229a = new com.huawei.openalliance.ad.processor.eventbeans.a.C0229a();
        c0229a.a(l).a(num).b(num2).a(com.huawei.openalliance.ad.utils.b.a(d())).d(strF).c(str).e(g());
        this.f19384b.a(c0229a.a());
    }

    public void a(HandleUrlCallBack handleUrlCallBack) {
        this.f = handleUrlCallBack;
    }

    public void a(com.huawei.openalliance.ad.inter.data.e eVar) {
        this.e = eVar;
        this.f19383a = pl.a(eVar);
        Context context = this.d;
        this.f19384b = new pc(context, new sz(context, eVar == null ? 3 : eVar.e()), this.f19383a);
        if (eVar == null || eVar.ai() == null || eVar.ai().intValue() != 3) {
            return;
        }
        de.a().a(eVar.getUniqueId(), this.f19383a);
    }

    public void a(VideoInfo videoInfo) {
        com.huawei.openalliance.ad.inter.data.e eVar = this.e;
        if (eVar == null) {
            return;
        }
        eVar.a(videoInfo);
    }

    public void a(long j, int i) {
        this.f19384b.a(j, i);
    }

    public void a() {
        this.f19384b.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(com.huawei.openalliance.ad.uriaction.interfaces.a aVar, MaterialClickInfo materialClickInfo, int i, String str) {
        boolean zA = aVar.a();
        if (zA) {
            a(aVar.c(), materialClickInfo, Integer.valueOf(i), str);
        }
        return zA;
    }

    private void a(HashMap<String, String> map) {
        MetaData metaDataJ;
        if (map == null || (metaDataJ = this.f19383a.j()) == null) {
            return;
        }
        ApkInfo apkInfoS = metaDataJ.s();
        if (apkInfoS != null) {
            String strF = com.huawei.openalliance.ad.utils.dg.f(map.get(Constants.BF_DOWNLOAD_TXT));
            if (!TextUtils.isEmpty(strF)) {
                apkInfoS.t(strF);
            }
            String strF2 = com.huawei.openalliance.ad.utils.dg.f(map.get(Constants.AF_DOWNLOAD_TXT));
            if (!TextUtils.isEmpty(strF2)) {
                apkInfoS.u(strF2);
            }
        }
        this.f19383a.b(com.huawei.openalliance.ad.utils.bk.b(metaDataJ));
    }

    static class a implements OnSuccessListener<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<nm> f19750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.huawei.openalliance.ad.uriaction.interfaces.a f19751b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final MaterialClickInfo f19752c;
        private final int d;
        private final String e;

        @Override // com.huawei.hmf.tasks.OnSuccessListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Boolean bool) {
            hw.b(nm.f19749c, "onSuccess ret: %s.", bool);
            nm nmVar = this.f19750a.get();
            if (nmVar != null) {
                hw.b(nm.f19749c, "presenter doActionReport");
                nmVar.a(this.f19751b, this.f19752c, this.d, this.e);
            } else {
                hw.c(nm.f19749c, "presenter is null");
            }
        }

        public a(nm nmVar, com.huawei.openalliance.ad.uriaction.interfaces.a aVar, MaterialClickInfo materialClickInfo, int i, String str) {
            this.f19750a = new WeakReference<>(nmVar);
            this.f19751b = aVar;
            this.f19752c = materialClickInfo;
            this.d = i;
            this.e = str;
        }
    }

    private void a(String str, MaterialClickInfo materialClickInfo, Integer num, String str2) {
        com.huawei.openalliance.ad.processor.eventbeans.b.a aVar = new com.huawei.openalliance.ad.processor.eventbeans.b.a();
        aVar.b(str).a(Integer.valueOf(num != null ? num.intValue() : 7)).a(materialClickInfo).d(com.huawei.openalliance.ad.utils.b.a(d())).e(str2);
        this.f19384b.a(aVar.a());
    }

    public nm(Context context, IPPSNativeView iPPSNativeView) {
        this.d = context;
        a(iPPSNativeView);
        this.f19384b = new pc(context, new sz(context, 3));
    }
}
