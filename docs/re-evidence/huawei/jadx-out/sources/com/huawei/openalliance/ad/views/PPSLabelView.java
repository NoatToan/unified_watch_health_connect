package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.beans.metadata.AdSource;
import com.huawei.openalliance.ad.ca;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.dk;
import com.huawei.openalliance.ad.dn;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.js;
import com.huawei.openalliance.ad.sn;
import com.huawei.openalliance.ad.ue;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bd;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dq;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public class PPSLabelView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected ContentRecord f20902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Integer f20903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f20904c;
    protected boolean d;
    protected boolean e;
    protected WeakReference<js> f;
    private b g;
    private boolean h;
    private boolean i;
    private Drawable j;
    private View.OnClickListener k;

    @Override // android.view.View
    public void setVisibility(int i) {
        if (!this.e) {
            i = 8;
        }
        super.setVisibility(i);
    }

    protected void setTextWhenImgLoadFail(String str) {
        String defaultAdSign = getDefaultAdSign();
        if (TextUtils.isEmpty(str)) {
            str = defaultAdSign;
        }
        if (TextUtils.isEmpty(str) && !this.h) {
            setVisibility(8);
        }
        setText(str);
        setClick(new SpannableStringBuilder(getText()));
    }

    public void setTextForAppDetailView(AdSource adSource) {
        if (adSource == null) {
            hw.b("PPSLabelView", "setTextWithDspInfo, use default adSign");
            return;
        }
        this.h = false;
        this.i = true;
        b(adSource, "");
    }

    public void setDataAndRefreshUi(ContentRecord contentRecord) {
        if (contentRecord == null) {
            return;
        }
        this.f20902a = contentRecord;
        if (contentRecord.j() != null) {
            this.e = "2".equalsIgnoreCase(contentRecord.j().u());
        }
        if (this.e) {
            return;
        }
        setVisibility(8);
    }

    protected void setClick(SpannableStringBuilder spannableStringBuilder) {
        if (!this.d && !this.f20904c) {
            setText(spannableStringBuilder);
            return;
        }
        spannableStringBuilder.append(" ");
        setText(a(new SpannableString(spannableStringBuilder)));
        setOnClickListener(this.k);
    }

    protected boolean c() {
        b bVar = this.g;
        if (bVar == null) {
            return false;
        }
        return bVar.b();
    }

    protected void b(AdSource adSource, String str) {
        SpannableStringBuilder spannableStringBuilder;
        if (adSource == null) {
            return;
        }
        String strE = dg.e(adSource.a()) == null ? "" : dg.e(adSource.a());
        if (str == null) {
            str = "";
        }
        String str2 = strE + str;
        String strB = adSource.b();
        if (TextUtils.isEmpty(strE) && TextUtils.isEmpty(strB)) {
            hw.b("PPSLabelView", "displayTextWithDspInfo, use default adSign");
            spannableStringBuilder = new SpannableStringBuilder(getText());
        } else if (TextUtils.isEmpty(strE) || !TextUtils.isEmpty(strB)) {
            a(str2, strB);
            return;
        } else {
            hw.b("PPSLabelView", "displayTextWithDspInfo, use dspNameWithAdSign");
            spannableStringBuilder = new SpannableStringBuilder(str2);
        }
        setClick(spannableStringBuilder);
    }

    protected void b() {
        b bVar = this.g;
        if (bVar != null) {
            bVar.a();
        }
    }

    public boolean a() {
        return this.e;
    }

    public void a(String str, String str2, String str3) {
        SpannableStringBuilder spannableStringBuilder;
        if (this.e) {
            if ((TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || TextUtils.isEmpty(str3)) {
                hw.b("PPSLabelView", "dspInfo all empty or logo2Text is empty");
                hw.b("PPSLabelView", "setTextWithDspInfo, use default adSign");
                spannableStringBuilder = new SpannableStringBuilder(getText());
            } else {
                if (str == null) {
                    str = "";
                }
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = str + str3;
                if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str2)) {
                    hw.b("PPSLabelView", "setTextWithDspInfo, use default adSign");
                    spannableStringBuilder = new SpannableStringBuilder(getText());
                } else if (TextUtils.isEmpty(str4) || !TextUtils.isEmpty(str2)) {
                    a(str4, str2);
                    return;
                } else {
                    hw.b("PPSLabelView", "setTextWithDspInfo, use dspNameWithAdSign");
                    setText(str4);
                    spannableStringBuilder = new SpannableStringBuilder(getText());
                }
            }
            setClick(spannableStringBuilder);
        }
    }

    protected void a(String str, String str2) {
        if (this.e) {
            hw.b("PPSLabelView", "loadAndSetDspInfo, start");
            dn dnVarA = dk.a(getContext(), "normal");
            String strC = dnVarA.c(dnVarA.e(str2));
            if (!this.i) {
                if (TextUtils.isEmpty(str) || !TextUtils.isEmpty(strC)) {
                    a(str, this.j);
                    bd.a(getContext(), strC, new a(this, str));
                    return;
                } else {
                    hw.b("PPSLabelView", "displayTextWithDspInfo, use dspNameWithAdSign");
                    setTextWhenImgLoadFail(str);
                    return;
                }
            }
            a(str, this.j);
            if (!TextUtils.isEmpty(strC)) {
                bd.a(getContext(), strC, new a(this, str));
                return;
            }
            sn snVar = new sn();
            snVar.b(false);
            snVar.c(true);
            snVar.d(str2);
            bd.a(getContext(), snVar, new a(this, str));
        }
    }

    protected void a(String str, Drawable drawable) {
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
            String defaultAdSign = getDefaultAdSign();
            if (TextUtils.isEmpty(str)) {
                str = defaultAdSign;
            }
            boolean zIsEmpty = TextUtils.isEmpty(str);
            spannableStringBuilder.append((CharSequence) str);
            ImageSpan imageSpanA = a(drawable, !zIsEmpty);
            if (imageSpanA != null) {
                spannableStringBuilder.setSpan(imageSpanA, 0, 1, 33);
            }
            setClick(spannableStringBuilder);
        } catch (Throwable unused) {
            hw.c("PPSLabelView", "setTextWhenImgLoaded error");
        }
    }

    public void a(js jsVar, ContentRecord contentRecord, boolean z) {
        this.f20902a = contentRecord;
        this.d = z;
        this.f = new WeakReference<>(jsVar);
    }

    public void a(AdSource adSource, String str) {
        if (this.e) {
            if (adSource != null && !TextUtils.isEmpty(str)) {
                b(adSource, str);
            } else {
                hw.b("PPSLabelView", "setTextWithDspInfo, use default adSign");
                setClick(new SpannableStringBuilder(getText()));
            }
        }
    }

    protected ImageSpan a(Drawable drawable, boolean z) {
        Bitmap bitmapA = bd.a(drawable);
        if (bitmapA == null) {
            hw.b("PPSLabelView", "originImage bitmap is null");
            return null;
        }
        float textSize = getTextSize();
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(bitmapA, Math.round(textSize), Math.round(textSize), false));
        bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), bitmapDrawable.getIntrinsicHeight());
        return new c(bitmapDrawable, 2, 0, z ? as.a(getContext(), 4.0f) : 0);
    }

    private String getDefaultAdSign() {
        return this.h ? getResources().getString(R.string.hiad_ad_label_new) : "";
    }

    private ImageSpan getClickImageSpanRight() {
        try {
            Drawable drawable = getResources().getDrawable(R.drawable.hiad_chevron_right);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            if (!com.huawei.openalliance.ad.utils.dk.c()) {
                return new c(drawable, 2, as.a(getContext(), 4.0f), 0);
            }
            return new c(getContext(), bd.b(drawable), 2, as.a(getContext(), 4.0f), 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    private boolean a(PPSLinkedView pPSLinkedView, boolean z, Integer num, RelativeLayout.LayoutParams layoutParams, ue ueVar) {
        aj ajVarN = pPSLinkedView.n();
        if (ajVarN == null) {
            hw.c("PPSLabelView", "linked splash container is null");
            return false;
        }
        ueVar.a(z, num, pPSLinkedView.m());
        ajVarN.addView(ueVar, layoutParams);
        ueVar.setScreenHeight(ajVarN.getMeasuredHeight());
        ueVar.setScreenWidth(ajVarN.getMeasuredWidth());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(js jsVar) {
        return (jsVar instanceof PPSSplashView) || (jsVar instanceof PPSLinkedView);
    }

    private void a(RelativeLayout relativeLayout, int[] iArr) {
        if (com.huawei.openalliance.ad.utils.dk.b(com.huawei.openalliance.ad.utils.dk.d(relativeLayout))) {
            int iY = com.huawei.openalliance.ad.utils.dk.y(getContext());
            hw.b("PPSLabelView", "drag H: %s", Integer.valueOf(iY));
            iArr[1] = iArr[1] - iY;
        } else if (relativeLayout instanceof PPSInterstitialView) {
            int iA = cc.a(getContext()).a(this);
            hw.b("PPSLabelView", "notch H: %s", Integer.valueOf(iA));
            if (com.huawei.openalliance.ad.utils.dk.l(getContext())) {
                iArr[1] = iArr[1] - iA;
            } else {
                iArr[0] = iArr[0] - iA;
            }
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<ue> f20914a;

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b() {
            ue ueVar;
            WeakReference<ue> weakReference = this.f20914a;
            if (weakReference == null || (ueVar = weakReference.get()) == null) {
                return false;
            }
            return ueVar.j();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            ue ueVar;
            WeakReference<ue> weakReference = this.f20914a;
            if (weakReference == null || (ueVar = weakReference.get()) == null) {
                return;
            }
            ueVar.i();
        }

        private b(ue ueVar) {
            this.f20914a = new WeakReference<>(ueVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(RelativeLayout relativeLayout, ContentRecord contentRecord, boolean z, Integer num, int[] iArr, int[] iArr2, int i) {
        if (relativeLayout == null || contentRecord == null) {
            return;
        }
        if (!as.a(iArr, 2) || !as.a(iArr2, 2)) {
            hw.c("PPSLabelView", "anchor is invalid.");
            return;
        }
        if (hw.a()) {
            hw.a("PPSLabelView", "addTransparencyDialog, loc: %s, %s", Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
            hw.a("PPSLabelView", "addTransparencyDialog, size: %s, %s", Integer.valueOf(iArr2[0]), Integer.valueOf(iArr2[1]));
        }
        a(relativeLayout, iArr);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        ue ueVar = new ue(relativeLayout.getContext(), iArr, iArr2, i);
        this.g = new b(ueVar);
        if (relativeLayout instanceof PPSSplashView) {
            ueVar.a(z, num, ((PPSSplashView) relativeLayout).getAdMediator());
        }
        if (!(relativeLayout instanceof PPSLinkedView)) {
            hw.a("PPSLabelView", "addTransparencyDialog, adview: %s, %s", Integer.valueOf(relativeLayout.getMeasuredHeight()), Integer.valueOf(relativeLayout.getMeasuredWidth()));
            relativeLayout.addView(ueVar, layoutParams);
            ueVar.setScreenHeight(relativeLayout.getMeasuredHeight());
            ueVar.setScreenWidth(relativeLayout.getMeasuredWidth());
            ueVar.h();
        } else if (!a((PPSLinkedView) relativeLayout, z, num, layoutParams, ueVar)) {
            return;
        }
        ueVar.setAdContent(contentRecord);
    }

    static class a implements bd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<PPSLabelView> f20909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f20910b;

        @Override // com.huawei.openalliance.ad.utils.bd.a
        public void a(final Drawable drawable) {
            hw.b("PPSLabelView", "start - dspLogo load onSuccess");
            if (drawable != null) {
                dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSLabelView.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        PPSLabelView pPSLabelView = (PPSLabelView) a.this.f20909a.get();
                        if (pPSLabelView != null) {
                            pPSLabelView.a(a.this.f20910b, drawable);
                        }
                    }
                });
            }
        }

        @Override // com.huawei.openalliance.ad.utils.bd.a
        public void a() {
            hw.b("PPSLabelView", "start - dspLogo load failed");
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSLabelView.a.2
                @Override // java.lang.Runnable
                public void run() {
                    PPSLabelView pPSLabelView = (PPSLabelView) a.this.f20909a.get();
                    if (pPSLabelView != null) {
                        pPSLabelView.setTextWhenImgLoadFail(a.this.f20910b);
                    }
                }
            });
        }

        a(PPSLabelView pPSLabelView, String str) {
            this.f20909a = new WeakReference<>(pPSLabelView);
            this.f20910b = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(RelativeLayout relativeLayout, ContentRecord contentRecord, boolean z, Integer num, int[] iArr, int[] iArr2) {
        a(relativeLayout, contentRecord, z, num, iArr, iArr2, -1);
    }

    private void a(Context context) {
        try {
            this.j = context.getResources().getDrawable(R.drawable.hiad_default_dsp_logo);
        } catch (Throwable unused) {
            hw.c("PPSLabelView", "init error");
        }
    }

    private SpannableStringBuilder a(SpannableString spannableString) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannableString);
        ImageSpan clickImageSpanRight = getClickImageSpanRight();
        if (clickImageSpanRight != null) {
            spannableStringBuilder.setSpan(clickImageSpanRight, spannableString.length() - 1, spannableString.length(), 33);
        }
        return spannableStringBuilder;
    }

    public PPSLabelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20904c = false;
        this.d = false;
        this.e = true;
        this.h = true;
        this.i = false;
        this.k = new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.PPSLabelView.1
            @Override // android.view.View.OnClickListener
            public void onClick(final View view) {
                if (PPSLabelView.this.f != null) {
                    final js jsVar = PPSLabelView.this.f.get();
                    if (jsVar == null) {
                        hw.c("PPSLabelView", "adView is null");
                        return;
                    }
                    final int[] iArrB = com.huawei.openalliance.ad.utils.dk.b(view);
                    final int[] iArrC = com.huawei.openalliance.ad.utils.dk.c(view);
                    if (as.a(iArrB, 2) && as.a(iArrC, 2)) {
                        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSLabelView.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (PPSLabelView.this.a(jsVar)) {
                                    PPSLabelView.this.a((RelativeLayout) jsVar, PPSLabelView.this.f20902a, PPSLabelView.this.f20904c, PPSLabelView.this.f20903b, iArrB, iArrC, 1);
                                    return;
                                }
                                js jsVar2 = jsVar;
                                if ((jsVar2 instanceof PPSRewardView) || (jsVar2 instanceof PPSInterstitialView)) {
                                    PPSLabelView.this.a((RelativeLayout) jsVar, PPSLabelView.this.f20902a, PPSLabelView.this.f20904c, PPSLabelView.this.f20903b, iArrB, iArrC);
                                } else {
                                    ca.a(PPSLabelView.this.getContext(), view, PPSLabelView.this.f20902a);
                                }
                            }
                        });
                    }
                }
            }
        };
        a(context);
    }

    public PPSLabelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20904c = false;
        this.d = false;
        this.e = true;
        this.h = true;
        this.i = false;
        this.k = new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.PPSLabelView.1
            @Override // android.view.View.OnClickListener
            public void onClick(final View view) {
                if (PPSLabelView.this.f != null) {
                    final js jsVar = PPSLabelView.this.f.get();
                    if (jsVar == null) {
                        hw.c("PPSLabelView", "adView is null");
                        return;
                    }
                    final int[] iArrB = com.huawei.openalliance.ad.utils.dk.b(view);
                    final int[] iArrC = com.huawei.openalliance.ad.utils.dk.c(view);
                    if (as.a(iArrB, 2) && as.a(iArrC, 2)) {
                        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSLabelView.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (PPSLabelView.this.a(jsVar)) {
                                    PPSLabelView.this.a((RelativeLayout) jsVar, PPSLabelView.this.f20902a, PPSLabelView.this.f20904c, PPSLabelView.this.f20903b, iArrB, iArrC, 1);
                                    return;
                                }
                                js jsVar2 = jsVar;
                                if ((jsVar2 instanceof PPSRewardView) || (jsVar2 instanceof PPSInterstitialView)) {
                                    PPSLabelView.this.a((RelativeLayout) jsVar, PPSLabelView.this.f20902a, PPSLabelView.this.f20904c, PPSLabelView.this.f20903b, iArrB, iArrC);
                                } else {
                                    ca.a(PPSLabelView.this.getContext(), view, PPSLabelView.this.f20902a);
                                }
                            }
                        });
                    }
                }
            }
        };
        a(context);
    }

    public PPSLabelView(Context context) {
        super(context);
        this.f20904c = false;
        this.d = false;
        this.e = true;
        this.h = true;
        this.i = false;
        this.k = new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.PPSLabelView.1
            @Override // android.view.View.OnClickListener
            public void onClick(final View view) {
                if (PPSLabelView.this.f != null) {
                    final js jsVar = PPSLabelView.this.f.get();
                    if (jsVar == null) {
                        hw.c("PPSLabelView", "adView is null");
                        return;
                    }
                    final int[] iArrB = com.huawei.openalliance.ad.utils.dk.b(view);
                    final int[] iArrC = com.huawei.openalliance.ad.utils.dk.c(view);
                    if (as.a(iArrB, 2) && as.a(iArrC, 2)) {
                        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSLabelView.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (PPSLabelView.this.a(jsVar)) {
                                    PPSLabelView.this.a((RelativeLayout) jsVar, PPSLabelView.this.f20902a, PPSLabelView.this.f20904c, PPSLabelView.this.f20903b, iArrB, iArrC, 1);
                                    return;
                                }
                                js jsVar2 = jsVar;
                                if ((jsVar2 instanceof PPSRewardView) || (jsVar2 instanceof PPSInterstitialView)) {
                                    PPSLabelView.this.a((RelativeLayout) jsVar, PPSLabelView.this.f20902a, PPSLabelView.this.f20904c, PPSLabelView.this.f20903b, iArrB, iArrC);
                                } else {
                                    ca.a(PPSLabelView.this.getContext(), view, PPSLabelView.this.f20902a);
                                }
                            }
                        });
                    }
                }
            }
        };
        a(context);
    }
}
