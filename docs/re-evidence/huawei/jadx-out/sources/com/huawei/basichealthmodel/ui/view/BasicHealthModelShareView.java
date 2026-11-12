package com.huawei.basichealthmodel.ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.TypefaceSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.basichealthmodel.R;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.socialshare.api.SocialShareCenterApi;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.cbg;
import defpackage.cgo;
import defpackage.qqf;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.Utils;
import health.compact.a.utils.StringUtils;

/* JADX INFO: loaded from: classes23.dex */
public class BasicHealthModelShareView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected LinearLayout f5361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected HealthTextView f5362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Resources f5363c;
    protected final Context d;
    protected TextView e;
    protected HealthTextView f;
    protected FrameLayout g;
    protected ImageView h;
    protected HealthTextView i;
    protected ConstraintLayout j;
    protected HealthTextView m;

    public BasicHealthModelShareView(Context context) {
        super(context);
        Context contextB = BaseApplication.b();
        this.d = contextB;
        this.f5363c = contextB.getResources();
        b(context);
    }

    public BasicHealthModelShareView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context contextB = BaseApplication.b();
        this.d = contextB;
        this.f5363c = contextB.getResources();
        b(context);
    }

    public BasicHealthModelShareView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context contextB = BaseApplication.b();
        this.d = contextB;
        this.f5363c = contextB.getResources();
        b(context);
    }

    private void b(Context context) {
        View viewInflate = View.inflate(context, R.layout.health_model_share_layout, this);
        this.f5361a = (LinearLayout) viewInflate.findViewById(R.id.health_model_share_ll);
        this.g = (FrameLayout) viewInflate.findViewById(R.id.health_model_task_share_bg);
        this.j = (ConstraintLayout) findViewById(R.id.health_model_share_bg);
        this.h = (ImageView) findViewById(R.id.health_model_share_head_icon);
        this.m = (HealthTextView) findViewById(R.id.health_model_share_user_name);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.health_model_share_date);
        this.f = healthTextView;
        cbg.d(healthTextView, com.huawei.ui.commonui.R.dimen.health_common_10dp, 1.2f);
        HealthTextView healthTextView2 = (HealthTextView) findViewById(R.id.health_model_share_join);
        this.f5362b = healthTextView2;
        cbg.d(healthTextView2, com.huawei.ui.commonui.R.dimen.health_common_14dp, 1.2f);
        this.i = (HealthTextView) findViewById(R.id.health_model_share_people);
        this.e = (TextView) findViewById(R.id.health_model_share_benefit);
        c();
    }

    private void c() {
        LoginInit loginInit = LoginInit.getInstance(this.d);
        Bitmap bitmapA = qqf.a(this.d, loginInit.getHeadImagePath());
        if (bitmapA == null) {
            this.h.setImageResource(com.huawei.ui.commonui.R.mipmap.ic_personal_head);
        } else {
            this.h.setImageBitmap(bitmapA);
        }
        this.h.setVisibility(Utils.h() ? 0 : 8);
        String accountInfo = loginInit.getAccountInfo(1002);
        if (!TextUtils.isEmpty(accountInfo)) {
            if (LanguageUtil.ba(this.d) && (StringUtils.b(accountInfo) || StringUtils.d(accountInfo))) {
                this.m.setTextDirection(3);
            }
            this.m.setText(accountInfo);
        } else {
            this.m.setText(R.string.IDS_share_nick_default_name);
        }
        this.f.setText(cgo.d(String.valueOf(DateFormatUtil.a(System.currentTimeMillis())), 4));
        b();
    }

    private void b() {
        ((SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class)).updateShareUserView("HL_BasicHealthModelShareView", this.h, this.m, this.f);
    }

    public void e() {
        b();
        Bitmap bitmapC = qqf.c(this.f5361a);
        if (bitmapC == null) {
            LogUtil.j("HL_BasicHealthModelShareView", "shareReport bitmap is null");
        } else if (bitmapC.isRecycled()) {
            LogUtil.j("HL_BasicHealthModelShareView", "shareReport bitmap is recycled");
        } else {
            cgo.b(getContext(), bitmapC, 1);
        }
    }

    public void setBackground(Bitmap bitmap) {
        this.g.setBackground(new BitmapDrawable(this.f5363c, b(bitmap)));
    }

    protected Bitmap b(Bitmap bitmap) {
        int width = this.f5361a.getWidth();
        int height = this.f5361a.getHeight();
        Bitmap bitmapC = qqf.c(bitmap, width, height);
        int iMin = Math.min(width, bitmapC.getWidth());
        return qqf.c(bitmapC, iMin, Math.min(height, (iMin * height) / width), 3);
    }

    protected CharSequence e(String str, String str2, String str3) {
        return a(str, str2, str3, true);
    }

    protected CharSequence a(String str, String str2, String str3, boolean z) {
        SpannableString spannableString = new SpannableString(str);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && str.contains(str2) && str.contains(str3)) {
            int iIndexOf = str.indexOf(str3);
            int length = str3.length() + iIndexOf;
            spannableString.setSpan(new AbsoluteSizeSpan(40, true), iIndexOf, length, 17);
            spannableString.setSpan(new TypefaceSpan(this.f5363c.getString(com.huawei.ui.commonui.R.string.textFontFamilyRegular)), iIndexOf, length, 17);
            if (z) {
                int iIndexOf2 = str.indexOf(str2);
                spannableString.setSpan(new AbsoluteSizeSpan(20, true), iIndexOf2, str2.length() + iIndexOf2, 17);
            }
        }
        return spannableString;
    }
}
