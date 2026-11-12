package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.ca;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.AdLandingPageData;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dk;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public class SixElementsView extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f21103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Context f21104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected View f21105c;
    protected TextView d;
    protected TextView e;
    protected TextView f;
    protected TextView g;
    protected TextView h;
    protected TextView i;
    protected TextView j;
    protected TextView k;
    protected TextView l;
    protected TextView m;
    protected AdLandingPageData n;
    protected ContentRecord o;
    protected MaterialClickInfo p;
    private int q;
    private float r;
    private AppInfo s;

    enum a {
        DESC,
        PRIVACY,
        PERMISSION
    }

    public void setTitleTextVisibility(int i) {
        this.d.setVisibility(i);
    }

    public void setOrgClickInfo(MaterialClickInfo materialClickInfo) {
        this.p = materialClickInfo;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.six_elements_privacy_policy || id == R.id.endcard_six_elements_privacy_policy) {
            d();
            return;
        }
        if (id == R.id.six_elements_permission || id == R.id.endcard_six_elements_permission) {
            e();
        } else if (id == R.id.six_elements_desc || id == R.id.endcard_six_elements_desc) {
            f();
        }
    }

    public MaterialClickInfo getOrgClickInfo() {
        return this.p;
    }

    protected boolean b() {
        return this.q == 0 && as.n(this.f21104b);
    }

    protected void b(Context context, AttributeSet attributeSet) {
        String str;
        if (attributeSet == null) {
            str = "attrs is null..";
        } else {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SixElementsView);
            if (typedArrayObtainStyledAttributes != null) {
                try {
                    this.f21103a = typedArrayObtainStyledAttributes.getInt(R.styleable.SixElementsView_gravity_style, 0);
                    this.q = typedArrayObtainStyledAttributes.getInt(R.styleable.SixElementsView_support_elderly, 0);
                    this.r = typedArrayObtainStyledAttributes.getDimension(R.styleable.SixElementsView_title_text_size, this.q == 1 ? as.a(context, 16.0f) : as.c(context, 16.0f));
                    return;
                } finally {
                    typedArrayObtainStyledAttributes.recycle();
                }
            }
            str = "typedArray null..";
        }
        hw.a("SixElementsView", str);
    }

    public void a(boolean z) {
        if (b()) {
            return;
        }
        a(this.f21105c, z);
    }

    public void a(AdLandingPageData adLandingPageData) {
        String str;
        if (adLandingPageData == null) {
            str = "landingPageData is null.";
        } else {
            this.n = adLandingPageData;
            this.s = adLandingPageData.getAppInfo();
            this.o = adLandingPageData.z();
            if (this.s != null) {
                c();
                boolean zB = b();
                int iS = adLandingPageData.s();
                if (zB) {
                    setElderlyView(iS);
                    return;
                } else {
                    setNomalView(iS);
                    return;
                }
            }
            str = "appInfo is null.";
        }
        hw.c("SixElementsView", str);
    }

    protected void a(final View view, final boolean z) {
        if (view == null) {
            hw.b("SixElementsView", "rootView is null..");
        } else {
            view.postDelayed(new Runnable() { // from class: com.huawei.openalliance.ad.views.SixElementsView.1
                @Override // java.lang.Runnable
                public void run() {
                    int width = view.getWidth();
                    if (width == 0) {
                        hw.b("SixElementsView", "do not get screen width.");
                        return;
                    }
                    double d = width;
                    int i = (int) (0.35d * d);
                    hw.b("SixElementsView", "larger detail width is %d", Integer.valueOf(i));
                    int i2 = (int) (0.18d * d);
                    hw.b("SixElementsView", "small detail width is %d", Integer.valueOf(i2));
                    if (z) {
                        SixElementsView.this.f.setMaxWidth((int) (d * 0.2d));
                    } else {
                        SixElementsView.this.f.setMaxWidth(i);
                    }
                    SixElementsView.this.g.setMaxWidth(i2);
                    SixElementsView.this.h.setMaxWidth(i2);
                    SixElementsView.this.i.setMaxWidth(i2);
                    String lowerCase = dk.u(SixElementsView.this.f21104b).toLowerCase(Locale.getDefault());
                    hw.a("SixElementsView", " languageCode=%s", lowerCase);
                    if ("bo-cn".equals(lowerCase)) {
                        SixElementsView.this.f.setIncludeFontPadding(true);
                        SixElementsView.this.g.setIncludeFontPadding(true);
                        SixElementsView.this.h.setIncludeFontPadding(true);
                        SixElementsView.this.i.setIncludeFontPadding(true);
                    }
                }
            }, 200L);
        }
    }

    protected void a(Context context, AttributeSet attributeSet) {
        b(context, attributeSet);
        this.f21104b = context;
        if (b()) {
            View viewInflate = inflate(context, R.layout.six_elements_elderly_layout, this);
            this.f21105c = viewInflate;
            this.m = (TextView) viewInflate.findViewById(R.id.six_elements_splicing);
        } else {
            View viewInflate2 = inflate(context, this.f21103a == 1 ? R.layout.six_elements_center_layout : R.layout.six_elements_layout, this);
            this.f21105c = viewInflate2;
            this.f = (TextView) viewInflate2.findViewById(R.id.six_elements_version);
            TextView textView = (TextView) this.f21105c.findViewById(R.id.six_elements_desc);
            this.g = textView;
            textView.setOnClickListener(this);
            TextView textView2 = (TextView) this.f21105c.findViewById(R.id.six_elements_privacy_policy);
            this.h = textView2;
            textView2.setOnClickListener(this);
            TextView textView3 = (TextView) this.f21105c.findViewById(R.id.six_elements_permission);
            this.i = textView3;
            textView3.setOnClickListener(this);
            this.j = (TextView) this.f21105c.findViewById(R.id.version_line);
            this.k = (TextView) this.f21105c.findViewById(R.id.privacy_line);
            this.l = (TextView) this.f21105c.findViewById(R.id.permission_line);
            a(this.f21105c, false);
        }
        this.d = (TextView) this.f21105c.findViewById(R.id.six_elements_name);
        this.e = (TextView) this.f21105c.findViewById(R.id.six_elements_develop_name);
        a();
    }

    protected void a() {
        if (Float.compare(this.r, 0.0f) != 0) {
            this.d.setTextSize(0, this.r);
        }
        if (1 != this.q) {
            hw.b("SixElementsView", "supportElderly is not 0, do not adaptation.");
            return;
        }
        if (b()) {
            a(this.m, R.dimen.hiad_10_dp);
            return;
        }
        a(this.e, R.dimen.hiad_10_dp);
        a(this.f, R.dimen.hiad_10_dp);
        a(this.g, R.dimen.hiad_10_dp);
        a(this.h, R.dimen.hiad_10_dp);
        a(this.i, R.dimen.hiad_10_dp);
        a(this.j, R.dimen.hiad_10_dp);
        a(this.k, R.dimen.hiad_10_dp);
        a(this.l, R.dimen.hiad_10_dp);
    }

    private void setNomalView(int i) {
        if (i == 7) {
            hw.a("SixElementsView", "nomalView, is appPromotional hide six elements.");
            return;
        }
        this.e.setText(this.s.getDeveloperName());
        if (TextUtils.isEmpty(this.s.getVersionName())) {
            this.f.setVisibility(8);
        } else {
            this.f.setVisibility(0);
            this.f.setText(this.f21104b.getResources().getString(R.string.hiad_app_detail_version, this.s.getVersionName()));
        }
        boolean z = true;
        boolean z2 = this.f.getVisibility() == 0;
        boolean zG = g();
        this.j.setVisibility(zG & z2 ? 0 : 8);
        this.g.setVisibility(zG ? 0 : 8);
        boolean z3 = zG || z2;
        boolean zI = i();
        this.k.setVisibility(zI & z3 ? 0 : 8);
        this.h.setVisibility(zI ? 0 : 8);
        if (!zI && !z3) {
            z = false;
        }
        boolean zH = h();
        this.i.setVisibility(zH ? 0 : 8);
        this.l.setVisibility((zH && z) ? 0 : 8);
    }

    private void setElderlyView(int i) {
        boolean z;
        if (i == 7) {
            hw.a("SixElementsView", "elderlyView, is appPromotional hide six elements.");
            return;
        }
        this.e.setText(this.s.getDeveloperName());
        String string = this.f21104b.getResources().getString(R.string.hiad_app_detail_version, this.s.getVersionName());
        String string2 = this.f21104b.getResources().getString(R.string.hiad_introductory);
        String string3 = this.f21104b.getResources().getString(R.string.hiad_privacy_policy);
        String string4 = this.f21104b.getResources().getString(R.string.hiad_app_permission);
        StringBuilder sb = new StringBuilder();
        boolean z2 = true;
        if (TextUtils.isEmpty(this.s.getVersionName())) {
            z = false;
        } else {
            sb.append(string);
            z = true;
        }
        boolean zG = g();
        if (zG) {
            if (z) {
                sb.append("｜");
            }
            sb.append(string2);
            z = true;
        }
        boolean zI = i();
        if (zI) {
            if (z) {
                sb.append("｜");
            }
            sb.append(string3);
        } else {
            z2 = z;
        }
        boolean zH = h();
        if (zH) {
            if (z2) {
                sb.append("｜");
            }
            sb.append(string4);
        }
        SpannableString spannableString = new SpannableString(sb.toString());
        if (zG) {
            a(spannableString, sb.toString(), string2, a.DESC);
        }
        if (zI) {
            a(spannableString, sb.toString(), string3, a.PRIVACY);
        }
        if (zH) {
            a(spannableString, sb.toString(), string4, a.PERMISSION);
        }
        a(spannableString, sb.toString());
        this.m.setText(spannableString);
        this.m.setMovementMethod(LinkMovementMethod.getInstance());
        this.m.setHighlightColor(this.f21104b.getResources().getColor(R.color.hiad_transparent));
    }

    private boolean i() {
        AppInfo appInfo;
        AdLandingPageData adLandingPageData = this.n;
        return (adLandingPageData == null || !adLandingPageData.m() || (appInfo = this.s) == null || TextUtils.isEmpty(appInfo.getPackageName()) || TextUtils.isEmpty(this.s.getPrivacyLink())) ? false : true;
    }

    private boolean h() {
        AppInfo appInfo = this.s;
        if (appInfo != null) {
            return !TextUtils.isEmpty(appInfo.getPermissionUrl()) || this.s.w();
        }
        return false;
    }

    private boolean g() {
        AppInfo appInfo = this.s;
        return (appInfo == null || TextUtils.isEmpty(appInfo.getAppDetailUrl())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        ca.a(this.f21104b, this.n, getOrgClickInfo());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (TextUtils.isEmpty(this.s.getPermissionUrl())) {
            com.huawei.openalliance.ad.download.app.h.a(this.f21104b, this.s);
        } else {
            this.s.showPermissionPage(this.f21104b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (TextUtils.isEmpty(this.s.getPrivacyLink())) {
            hw.c("SixElementsView", "privacyUrl is empty.");
        } else {
            this.s.showPrivacyPolicy(this.f21104b);
        }
    }

    private void c(Context context, AttributeSet attributeSet) {
        a(context, attributeSet);
    }

    private void c() {
        if (com.huawei.openalliance.ad.utils.c.b(this.f21104b, this.o)) {
            this.d.setText(this.o.j() != null ? dg.e(this.o.j().e()) : "");
        } else {
            this.d.setText(!TextUtils.isEmpty(this.s.getAppName()) ? this.s.getAppName() : this.s.getAppDesc());
        }
    }

    private void a(TextView textView, int i) {
        if (textView == null) {
            return;
        }
        textView.setTextSize(0, this.f21104b.getResources().getDimensionPixelSize(i));
    }

    private void a(SpannableString spannableString, String str, String str2, final a aVar) {
        ClickableSpan clickableSpan = new ClickableSpan() { // from class: com.huawei.openalliance.ad.views.SixElementsView.3
            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(SixElementsView.this.f21104b.getResources().getColor(R.color.hiad_40_percent_black));
                textPaint.setUnderlineText(false);
            }

            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                int i = AnonymousClass4.f21112a[aVar.ordinal()];
                if (i == 1) {
                    SixElementsView.this.f();
                } else if (i == 2) {
                    SixElementsView.this.e();
                } else {
                    if (i != 3) {
                        return;
                    }
                    SixElementsView.this.d();
                }
            }
        };
        int iIndexOf = str.indexOf(str2);
        spannableString.setSpan(clickableSpan, iIndexOf, str2.length() + iIndexOf, 33);
    }

    private void a(SpannableString spannableString, String str) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 65372) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            spannableString.setSpan(new AbsoluteSizeSpan(this.f21104b.getResources().getDimensionPixelSize(R.dimen.hiad_text_10_sp)) { // from class: com.huawei.openalliance.ad.views.SixElementsView.2
                @Override // android.text.style.AbsoluteSizeSpan, android.text.style.CharacterStyle
                public void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setColor(SixElementsView.this.f21104b.getResources().getColor(R.color.hiad_20_percent_black));
                    textPaint.setUnderlineText(false);
                }
            }, ((Integer) arrayList.get(i2)).intValue(), ((Integer) arrayList.get(i2)).intValue() + 1, 33);
        }
    }

    public SixElementsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.q = 0;
        this.f21103a = 0;
        this.r = 0.0f;
        c(context, attributeSet);
    }

    /* JADX INFO: renamed from: com.huawei.openalliance.ad.views.SixElementsView$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21112a;

        static {
            int[] iArr = new int[a.values().length];
            f21112a = iArr;
            try {
                iArr[a.DESC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21112a[a.PERMISSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21112a[a.PRIVACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public SixElementsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.q = 0;
        this.f21103a = 0;
        this.r = 0.0f;
        c(context, attributeSet);
    }

    public SixElementsView(Context context) {
        super(context);
        this.q = 0;
        this.f21103a = 0;
        this.r = 0.0f;
        c(context, null);
    }
}
