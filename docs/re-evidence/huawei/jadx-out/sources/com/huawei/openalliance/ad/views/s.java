package com.huawei.openalliance.ad.views;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hms.ads.dynamic.IObjectWrapper;
import com.huawei.hms.ads.dynamic.ObjectWrapper;
import com.huawei.hms.ads.uiengine.IRemoteCreator;
import com.huawei.hms.ads.uiengine.common.IInterstitialView;
import com.huawei.hms.ads.uiengine.common.InterstitialApi;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.beans.inner.AdContentData;
import com.huawei.openalliance.ad.constant.ErrorCode;
import com.huawei.openalliance.ad.constant.InterstitialMethods;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.gr;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.lw;
import com.huawei.openalliance.ad.mh;
import com.huawei.openalliance.ad.mw;
import com.huawei.openalliance.ad.nk;
import com.huawei.openalliance.ad.pc;
import com.huawei.openalliance.ad.pf;
import com.huawei.openalliance.ad.tu;
import com.huawei.openalliance.ad.us;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.utils.dq;
import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public class s extends AutoScaleSizeRelativeLayout implements IInterstitialView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f21329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ContentRecord f21330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterstitialApi f21331c;
    private IInterstitialView d;
    private IRemoteCreator e;
    private nk f;
    private pc g;
    private PPSInterstitialView.b h;
    private com.huawei.openalliance.ad.inter.listeners.a i;
    private com.huawei.openalliance.ad.inter.data.d j;
    private int k;
    private int l;
    private String m;
    private Dialog n;
    private mh o;
    private boolean p;

    @Override // com.huawei.hms.ads.uiengine.common.IInterstitialView
    public void bindData(String str) {
    }

    @Override // com.huawei.hms.ads.uiengine.common.IInterstitialView
    public ViewGroup getContentContainer() {
        return null;
    }

    @Override // com.huawei.hms.ads.uiengine.common.IInterstitialView
    public void onBtnClick(Bundle bundle) {
    }

    @Override // com.huawei.hms.ads.uiengine.common.IInterstitialView
    public void onCallBack(String str, Bundle bundle) {
    }

    @Override // com.huawei.hms.ads.uiengine.common.IInterstitialView
    public void setIsNeedRemindData(boolean z) {
    }

    @Override // com.huawei.hms.ads.uiengine.common.IInterstitialView
    public void setProxy(InterstitialApi interstitialApi) {
    }

    public void setOnCloseListener(PPSInterstitialView.b bVar) {
        if (bVar == null) {
            return;
        }
        this.h = bVar;
    }

    public void setNonwifiDialog(Dialog dialog) {
        this.n = dialog;
    }

    public void setEventProcessor(pc pcVar) {
        this.g = pcVar;
    }

    public void setCompleted(boolean z) {
        this.p = z;
        if (z) {
            a(3, (Bundle) null);
        }
    }

    @Override // com.huawei.hms.ads.uiengine.common.IInterstitialView
    public void resumeVideoView() {
        IInterstitialView iInterstitialView = this.d;
        if (iInterstitialView != null) {
            iInterstitialView.resumeVideoView();
        }
    }

    @Override // com.huawei.hms.ads.uiengine.common.IInterstitialView
    public void pauseView() {
        IInterstitialView iInterstitialView = this.d;
        if (iInterstitialView != null) {
            iInterstitialView.pauseView();
        }
    }

    @Override // com.huawei.hms.ads.uiengine.common.IInterstitialView
    public void onAppStatusChanged(String str) {
        IInterstitialView iInterstitialView = this.d;
        if (iInterstitialView != null) {
            iInterstitialView.onAppStatusChanged(str);
        }
    }

    public Bundle i() {
        HashMap map = new HashMap();
        com.huawei.openalliance.ad.inter.data.d dVar = this.j;
        if (dVar != null) {
            map.put("appId", dVar.O());
            map.put("thirdId", this.j.N());
        }
        com.huawei.openalliance.ad.uriaction.interfaces.a aVarA = tu.a(this.f21329a, this.f21330b, map);
        if (!aVarA.a()) {
            return null;
        }
        a(7, (Bundle) null);
        gr grVar = new gr();
        grVar.b("click_destination", aVarA.c());
        a((Integer) 1);
        return grVar.a();
    }

    public Bundle h() {
        a(2, (Bundle) null);
        g();
        return i();
    }

    public Dialog getNonwifiDialog() {
        return this.n;
    }

    public void g() {
        mh mhVar = this.o;
        if (mhVar != null) {
            mhVar.e();
        }
    }

    public void f() {
        PPSInterstitialView.b bVar = this.h;
        if (bVar != null) {
            bVar.b();
        }
        nk nkVar = this.f;
        if (nkVar != null) {
            nkVar.b();
        }
        a((Integer) 3);
        g();
        a(4, (Bundle) null);
    }

    public void e() {
        setNonwifiDialog(null);
        f();
    }

    @Override // com.huawei.hms.ads.uiengine.common.IInterstitialView
    public void destroyView() {
        IInterstitialView iInterstitialView = this.d;
        if (iInterstitialView != null) {
            iInterstitialView.destroyView();
        }
    }

    public void d() {
        setNonwifiDialog(null);
        IInterstitialView iInterstitialView = this.d;
        if (iInterstitialView != null) {
            iInterstitialView.setIsNeedRemindData(false);
        }
        resumeVideoView();
    }

    public void c() {
        Dialog dialog = this.n;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.n.dismiss();
    }

    public void b() {
        dq.a(new us(this));
    }

    public void a(Integer num) {
        if (this.o == null || num == null) {
            hw.c("PPSInterstitialViewContainer", "omPresent or impSource is null.");
            return;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            this.o.a(mw.CLICK);
        } else if (iIntValue == 3 && !this.p) {
            this.o.j();
            this.o.b();
        }
    }

    public void a(com.huawei.openalliance.ad.inter.listeners.a aVar) {
        if (aVar == null) {
            return;
        }
        this.i = aVar;
    }

    public void a(com.huawei.openalliance.ad.inter.data.d dVar, int i, String str) {
        this.j = dVar;
        this.k = i;
        this.f21330b = pf.a(dVar);
        this.m = str;
        if (j()) {
            Bundle bundleM = m();
            IRemoteCreator iRemoteCreatorA = com.huawei.openalliance.ad.e.a(this.f21329a.getApplicationContext());
            this.e = iRemoteCreatorA;
            if (iRemoteCreatorA == null) {
                hw.c("PPSInterstitialViewContainer", "remoteCreator is null.");
                return;
            }
            a(iRemoteCreatorA.newInterstitialTemplateView(bundleM));
        } else {
            this.d = k();
        }
        if (this.d != null) {
            if (j()) {
                a("0");
            }
            hw.b("PPSInterstitialViewContainer", "mInterstitialView is %s", this.d.getClass().getSimpleName());
            nk nkVar = new nk(this.f21329a, this.d);
            this.f = nkVar;
            nkVar.a(this.j);
            addView((View) this.d);
            a(1, (Bundle) null);
            return;
        }
        if (j()) {
            a("1");
        }
        hw.b("PPSInterstitialViewContainer", "mInterstitialView is null, finish activity.");
        com.huawei.openalliance.ad.inter.listeners.a aVar = this.i;
        if (aVar != null) {
            aVar.a(ErrorCode.ERROR_CODE_NULL_AD_VIEW, ErrorCode.ERROR_CODE_NULL_AD_VIEW);
        }
        PPSInterstitialView.b bVar = this.h;
        if (bVar != null) {
            bVar.b();
        }
    }

    public void a(Bundle bundle) {
        IInterstitialView iInterstitialView = this.d;
        if (iInterstitialView != null) {
            iInterstitialView.onBtnClick(bundle);
        }
    }

    public void a(int i, Bundle bundle) {
        int iA;
        if (this.i == null) {
            hw.b("PPSInterstitialViewContainer", "onStatusChange listener is null.");
        }
        hw.b("PPSInterstitialViewContainer", "status is: %s.", Integer.valueOf(i));
        switch (i) {
            case 1:
                this.i.a();
                break;
            case 2:
                this.i.b();
                break;
            case 3:
                this.i.c();
                break;
            case 4:
                this.i.d();
                break;
            case 5:
                int i2 = -1;
                if (bundle != null) {
                    gr grVar = new gr(bundle);
                    int iA2 = grVar.a("error_code", -1);
                    iA = grVar.a("error_extra", -1);
                    i2 = iA2;
                } else {
                    iA = -1;
                }
                this.i.a(i2, iA);
                break;
            case 6:
            default:
                hw.b("PPSInterstitialViewContainer", "on status change, fall to default.");
                break;
            case 7:
                this.i.e();
                break;
            case 8:
                this.i.f();
                break;
        }
    }

    public void a() {
        this.i = null;
    }

    private Bundle m() {
        gr grVar = new gr();
        grVar.b("content", bk.b(AdContentData.a(this.f21329a, this.f21330b)));
        grVar.b("sdkVersion", 30484300);
        boolean zP = dk.p(this.f21329a);
        if (hw.a()) {
            hw.a("PPSInterstitialViewContainer", "emui9Dark %s", Boolean.valueOf(zP));
        }
        grVar.b(ParamConstants.Param.EMUI9_DARK_MODE, zP);
        grVar.a(ParamConstants.Param.CONTEXT, (IBinder) ObjectWrapper.wrap(this.f21329a));
        grVar.b("isMute", this.j.Z());
        grVar.b("alertSwitch", this.j.aj());
        return grVar.a();
    }

    private void l() {
        gr grVar = new gr();
        int iCn = fp.b(this.f21329a).cn();
        int iCj = fp.b(this.f21329a).cj();
        if (hw.a()) {
            hw.a("PPSInterstitialViewContainer", "iteAdCa is %s, iteAdCloseTm is %s", Integer.valueOf(iCn), Integer.valueOf(iCj));
        }
        grVar.b("ite_ad_ca", iCn);
        grVar.b("ite_ad_close_tm", iCj);
        IInterstitialView iInterstitialView = this.d;
        if (iInterstitialView != null) {
            iInterstitialView.onCallBack(InterstitialMethods.SEND_INIT_INFO, grVar.a());
        }
    }

    private IInterstitialView k() {
        int iCl = fp.b(this.f21329a).cl();
        hw.b("PPSInterstitialViewContainer", "ite is %s", Integer.valueOf(iCl));
        PPSInterstitialView pPSInterstitialView = new PPSInterstitialView(this.f21329a);
        pPSInterstitialView.setFullScreen(iCl);
        pPSInterstitialView.setOnCloseListener(this.h);
        pPSInterstitialView.addInterstitialAdStatusListener(this.i);
        pPSInterstitialView.a(this.j, this.k, this.m);
        return pPSInterstitialView;
    }

    private boolean j() {
        ContentRecord contentRecord = this.f21330b;
        return contentRecord != null && contentRecord.aQ() == 3;
    }

    private void a(String str) {
        new com.huawei.openalliance.ad.analysis.c(this.f21329a).a(str, com.huawei.openalliance.ad.e.a(), this.f21330b);
    }

    private void a(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            hw.c("PPSInterstitialViewContainer", "wrapper from uiengine is null.");
            return;
        }
        KeyEvent.Callback callback = (View) ObjectWrapper.unwrap(iObjectWrapper);
        if (callback == null) {
            hw.c("PPSInterstitialViewContainer", "template view is null.");
            return;
        }
        if (!(callback instanceof IInterstitialView)) {
            hw.b("PPSInterstitialViewContainer", "unwrap view from uiengine is %s", callback.getClass().getSimpleName());
            return;
        }
        this.d = (IInterstitialView) callback;
        l();
        com.huawei.hms.ads.uiengine.f fVar = new com.huawei.hms.ads.uiengine.f(this.f21329a, this, this.f21330b, this.j);
        this.f21331c = fVar;
        this.d.setProxy(fVar);
        this.d.bindData(bk.b(AdContentData.a(this.f21329a, this.f21330b)));
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes;
        if (attributeSet != null && (typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ViewFullScreen)) != null) {
            try {
                int integer = typedArrayObtainStyledAttributes.getInteger(R.styleable.ViewFullScreen_fullScreen, 0);
                this.l = integer;
                hw.b("PPSInterstitialViewContainer", "mFullScreen %d", Integer.valueOf(integer));
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f21329a = context;
    }

    public s(Context context) {
        super(context);
        this.l = 0;
        this.o = new lw();
        this.p = false;
        a(context, (AttributeSet) null);
    }
}
