package com.huawei.ui.commonui.subheader;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.content.ContextCompat;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.uikit.phone.hwsubheader.widget.HwSubHeader;
import defpackage.lrd;
import defpackage.qqf;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes16.dex */
public class HealthSubHeader extends HwSubHeader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Guideline f23897a;
    private ViewStub aa;
    private String ac;
    private ViewStub ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f23898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f23899c;
    private LinearLayout d;
    private TextView e;
    private boolean f;
    private Context g;
    private TextView h;
    private ImageView i;
    private TextView j;
    private boolean k;
    private boolean l;
    private TextView m;
    private ConstraintLayout n;
    private LinearLayout o;
    private ImageView p;
    private LinearLayout q;
    private View r;
    private int s;
    private View t;
    private View u;
    private LinearLayout v;
    private ViewStub w;
    private View x;
    private ViewStub y;

    public HealthSubHeader(Context context) {
        this(context, null);
    }

    public HealthSubHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HealthSubHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.s = 0;
        this.f = false;
        this.l = true;
        this.k = false;
        this.g = context;
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.sub_title);
        if (typedArrayObtainStyledAttributes != null) {
            try {
                this.s = typedArrayObtainStyledAttributes.getInteger(R.styleable.sub_title_styleType, 0);
                this.ac = typedArrayObtainStyledAttributes.getString(R.styleable.sub_title_subHeaderText);
                this.f23899c = typedArrayObtainStyledAttributes.getString(R.styleable.sub_title_subHeaderAction);
                this.f = typedArrayObtainStyledAttributes.getBoolean(R.styleable.sub_title_splitter, false);
                this.l = typedArrayObtainStyledAttributes.getBoolean(R.styleable.sub_title_useOnlyLayout, true);
                this.k = typedArrayObtainStyledAttributes.getBoolean(R.styleable.sub_title_textAllCaps, false);
                typedArrayObtainStyledAttributes.recycle();
            } catch (IndexOutOfBoundsException unused) {
                LogUtil.e("HealthSubHeader", "get attribute index error");
            }
        }
        if (this.l) {
            g();
        }
    }

    private void g() {
        View viewInflate = ((LayoutInflater) this.g.getSystemService("layout_inflater")).inflate(R.layout.health_common_sub_header, this);
        this.v = (LinearLayout) viewInflate.findViewById(R.id.health_subheader_content);
        this.ad = (ViewStub) viewInflate.findViewById(R.id.headlth_subheader_list);
        this.y = (ViewStub) viewInflate.findViewById(R.id.headlth_subheader_grid);
        this.aa = (ViewStub) viewInflate.findViewById(R.id.headlth_subheader_list_action);
        this.w = (ViewStub) viewInflate.findViewById(R.id.headlth_subheader_grid_action);
        View viewFindViewById = viewInflate.findViewById(R.id.headlth_subheader_splitter);
        this.r = viewFindViewById;
        if (this.f) {
            viewFindViewById.setVisibility(0);
        } else {
            viewFindViewById.setVisibility(8);
        }
        switch (this.s) {
            case 0:
                f();
                break;
            case 1:
                j();
                break;
            case 2:
                d();
                break;
            case 3:
                b();
                break;
            case 4:
                c();
                break;
            case 5:
                a();
                break;
            case 6:
                c(viewInflate);
                break;
        }
    }

    public void setSplitterVisible(int i) {
        this.r.setVisibility(i);
    }

    private void f() {
        this.u = this.aa.inflate();
        this.ad.setVisibility(8);
        this.y.setVisibility(8);
        this.w.setVisibility(8);
        this.aa.setVisibility(0);
        d(this.u);
        LinearLayout linearLayout = this.q;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    private void j() {
        this.t = this.ad.inflate();
        this.ad.setVisibility(0);
        this.y.setVisibility(8);
        this.w.setVisibility(8);
        this.aa.setVisibility(8);
        a(this.t);
        ConstraintLayout constraintLayout = this.n;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
    }

    private void d() {
        this.u = this.w.inflate();
        this.ad.setVisibility(8);
        this.y.setVisibility(8);
        this.w.setVisibility(0);
        this.aa.setVisibility(8);
        d(this.u);
        LinearLayout linearLayout = this.q;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    private void b() {
        this.t = this.y.inflate();
        this.ad.setVisibility(8);
        this.y.setVisibility(0);
        this.w.setVisibility(8);
        this.aa.setVisibility(8);
        a(this.t);
        ConstraintLayout constraintLayout = this.n;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
    }

    private void c() {
        this.u = this.aa.inflate();
        this.ad.setVisibility(8);
        this.y.setVisibility(8);
        this.w.setVisibility(8);
        this.aa.setVisibility(0);
        d(this.u);
    }

    private void a() {
        this.u = this.w.inflate();
        this.ad.setVisibility(8);
        this.y.setVisibility(8);
        this.w.setVisibility(0);
        this.aa.setVisibility(8);
        d(this.u);
    }

    private void c(View view) {
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.headlth_subheader_description_action);
        this.x = viewStub.inflate();
        viewStub.setVisibility(0);
        d(this.x);
    }

    private void a(View view) {
        this.h = (TextView) view.findViewById(R.id.hwsubheader_title_left);
        this.n = (ConstraintLayout) view.findViewById(R.id.hwsubheader_more_container);
        this.m = (TextView) view.findViewById(R.id.hwsubheader_more_text);
        this.p = (ImageView) view.findViewById(R.id.hwsubheader_more_arrow);
        this.f23897a = (Guideline) view.findViewById(R.id.hwsubheader_guide_horizontal);
        lrd.c(this.p, 1);
        lrd.b(this.p, qre.i(R.string.accessibility_more));
        TextView textView = this.h;
        if (textView != null) {
            textView.setText(this.ac);
            this.h.setAllCaps(this.k);
        } else {
            LogUtil.a("HealthSubHeader", "mHeaderTitle is null.");
        }
        TextView textView2 = this.m;
        if (textView2 != null) {
            textView2.setText(R.string.IDS_user_profile_more_new);
            this.m.setAllCaps(this.k);
            if (LanguageUtil.ba(this.g)) {
                TextView textView3 = this.m;
                textView3.setCompoundDrawablesWithIntrinsicBounds(qqz.e(this.g, textView3.getCompoundDrawables()[2]), (Drawable) null, (Drawable) null, (Drawable) null);
            }
            if (qrs.ac()) {
                this.m.setTextSize(1, 20.0f);
            }
        }
        b(view);
    }

    private void b(View view) {
        this.d = (LinearLayout) view.findViewById(R.id.close_layout);
        this.f23898b = (ImageView) view.findViewById(R.id.hwsubheader_close_btn);
        this.i = (ImageView) view.findViewById(R.id.hwsubheader_info_btn);
    }

    private void d(View view) {
        this.h = (TextView) view.findViewById(R.id.hwsubheader_title_left);
        this.j = (TextView) view.findViewById(R.id.hwsubheader_title_description);
        this.q = (LinearLayout) view.findViewById(R.id.hwsubheader_action_right_container);
        this.e = (TextView) view.findViewById(R.id.hwsubheader_action_right);
        this.o = (LinearLayout) view.findViewById(R.id.hwsubheader_layout_background);
        TextView textView = this.h;
        if (textView != null) {
            textView.setText(this.ac);
            this.h.setAllCaps(this.k);
        }
        TextView textView2 = this.j;
        if (textView2 != null) {
            textView2.setText(this.ac);
            this.h.setAllCaps(this.k);
        }
        TextView textView3 = this.e;
        if (textView3 != null && this.f23899c != null) {
            textView3.setTextColor(getResources().getColor(R.color.common_colorAccent));
            this.e.setText(this.f23899c);
            this.e.setAllCaps(this.k);
            return;
        }
        LogUtil.a("HealthSubHeader", "mActionTextView is null.");
    }

    public void setMoreViewClickListener(View.OnClickListener onClickListener) {
        int i;
        ConstraintLayout constraintLayout = this.n;
        if (constraintLayout == null || onClickListener == null || (i = this.s) == 2 || i == 0) {
            return;
        }
        constraintLayout.setOnClickListener(onClickListener);
    }

    public void setActionViewClickListener(View.OnClickListener onClickListener) {
        TextView textView = this.e;
        if (textView == null || onClickListener == null) {
            return;
        }
        textView.setOnClickListener(onClickListener);
    }

    public TextView getActionView() {
        return this.e;
    }

    public LinearLayout getActionViewContainner() {
        return this.q;
    }

    public LinearLayout getParentLayout() {
        return this.o;
    }

    public void setHeadTitleText(String str) {
        TextView textView = this.h;
        if (textView == null || str == null) {
            return;
        }
        textView.setText(str);
    }

    public void setHeadTitleText(SpannableString spannableString) {
        TextView textView = this.h;
        if (textView == null || spannableString == null) {
            return;
        }
        textView.setText(spannableString);
    }

    public void setHeadTitleForEnglish() {
        TextView textView = this.h;
        if (textView != null) {
            textView.setAllCaps(false);
        }
    }

    public void setHeaderDescriptionText(String str) {
        TextView textView = this.j;
        if (textView == null || str == null) {
            return;
        }
        textView.setText(str);
    }

    public void setHeadTitleTextColor(int i) {
        TextView textView = this.h;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setHeadTitleTypeface(Typeface typeface, int i) {
        TextView textView = this.h;
        if (textView == null || typeface == null) {
            return;
        }
        textView.setTypeface(typeface, i);
    }

    public void setSubHeaderTitleScaleTextSize(float f) {
        TextView textView = this.h;
        if (textView != null) {
            textView.setTextSize(0, textView.getTextSize() * f);
        }
    }

    public void setSubHeaderTitleTextSize(int i, float f) {
        TextView textView = this.h;
        if (textView == null || f <= 0.0f) {
            return;
        }
        textView.setTextSize(i, f);
    }

    public void setHeadTitleMaxLine(int i) {
        TextView textView = this.h;
        if (textView != null) {
            textView.setMaxLines(i);
            this.h.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    public void setGuideLine() {
        LogUtil.a("HealthSubHeader", "guideLine," + this.f23897a);
        Guideline guideline = this.f23897a;
        if (guideline != null) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) guideline.getLayoutParams();
            layoutParams.guidePercent = 0.99f;
            this.f23897a.setLayoutParams(layoutParams);
        }
    }

    public void setMoreText(String str) {
        int i = this.s;
        if (i != 1 && i != 3) {
            LogUtil.a("HealthSubHeader", "mStyleType != STYLE_LIST_MORE && mStyleType != STYLE_GRID_MORE");
            return;
        }
        TextView textView = this.m;
        if (textView == null || str == null) {
            return;
        }
        textView.setText(str);
    }

    public void setMoreTextMaxLines(int i) {
        int i2 = this.s;
        if (i2 != 1 && i2 != 3) {
            LogUtil.a("HealthSubHeader", "mStyleType != STYLE_LIST_MORE && mStyleType != STYLE_GRID_MORE");
            return;
        }
        TextView textView = this.m;
        if (textView == null || i <= 0) {
            return;
        }
        textView.setMaxLines(i);
        ConstraintLayout constraintLayout = this.n;
        if (constraintLayout != null) {
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            layoutParams.height = -2;
            this.n.setLayoutParams(layoutParams);
        }
    }

    public void setMoreTextAlignment(int i) {
        int i2 = this.s;
        if (i2 != 1 && i2 != 3) {
            LogUtil.a("HealthSubHeader", "mStyleType != STYLE_LIST_MORE && mStyleType != STYLE_GRID_MORE");
            return;
        }
        TextView textView = this.m;
        if (textView != null) {
            textView.setTextAlignment(i);
        }
    }

    public void setMoreTextColor(int i) {
        int i2 = this.s;
        if (i2 != 1 && i2 != 3) {
            LogUtil.a("HealthSubHeader", "mStyleType != STYLE_LIST_MORE && mStyleType != STYLE_GRID_MORE");
            return;
        }
        TextView textView = this.m;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setMoreTextVisibility(int i) {
        int i2 = this.s;
        if (i2 != 1 && i2 != 3) {
            LogUtil.a("HealthSubHeader", "mStyleType != STYLE_LIST_MORE && mStyleType != STYLE_GRID_MORE");
            return;
        }
        TextView textView = this.m;
        if (textView != null) {
            textView.setVisibility(i);
        }
    }

    @Deprecated
    public void setRightDrawable(int i) {
        int i2 = this.s;
        if (i2 != 1 && i2 != 3) {
            LogUtil.a("HealthSubHeader", "current subHeader type is invalid");
            return;
        }
        if (this.p.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.p.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            this.p.setLayoutParams(layoutParams);
            if (ContextCompat.getDrawable(this.g, i) != null) {
                this.p.setImageDrawable(qqf.c(ContextCompat.getDrawable(this.g, i), ContextCompat.getColor(this.g, R.color.colorPrimary)));
            }
        }
    }

    public void setRightDrawable(int i, CharSequence charSequence) {
        int i2 = this.s;
        if (i2 != 1 && i2 != 3) {
            ReleaseLogUtil.d("HealthSubHeader", "setRightDrawable mStyleType ", Integer.valueOf(i2));
            return;
        }
        ImageView imageView = this.p;
        if (imageView == null) {
            ReleaseLogUtil.d("HealthSubHeader", "setRightDrawable mRightArray is null");
            return;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (!(layoutParams instanceof ConstraintLayout.LayoutParams)) {
            ReleaseLogUtil.d("HealthSubHeader", "setRightDrawable layoutParams ", layoutParams);
            return;
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.width = -2;
        layoutParams2.height = -2;
        this.p.setLayoutParams(layoutParams2);
        Drawable drawableC = qre.c(i);
        if (drawableC == null) {
            ReleaseLogUtil.d("HealthSubHeader", "setRightDrawable drawable is null");
            return;
        }
        this.p.setImageDrawable(qqf.c(drawableC, qre.e(R.color.colorPrimary)));
        if (TextUtils.isEmpty(charSequence)) {
            ReleaseLogUtil.d("HealthSubHeader", "setRightDrawable contentDescription ", charSequence);
        } else {
            lrd.b(this.p, charSequence);
        }
    }

    public void setRightArrayVisibility(int i) {
        int i2 = this.s;
        if (i2 != 1 && i2 != 3) {
            LogUtil.a("HealthSubHeader", "current subHeader type is invalid");
            return;
        }
        ImageView imageView = this.p;
        if (imageView != null) {
            imageView.setVisibility(i);
        }
    }

    public void setSplitterVisibility(int i) {
        View view = this.r;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    public void setHeadActionText(String str) {
        TextView textView = this.e;
        if (textView == null || str == null) {
            return;
        }
        textView.setText(str);
    }

    public void setPaddingStartEnd(float f, float f2) {
        Context context = this.g;
        if (context == null) {
            return;
        }
        View view = this.u;
        if (view != null) {
            view.setPadding(qrs.d(context, f), this.u.getPaddingTop(), qrs.d(this.g, f2), this.u.getPaddingBottom());
        }
        View view2 = this.t;
        if (view2 != null) {
            view2.setPadding(qrs.d(this.g, f), this.t.getPaddingTop(), qrs.d(this.g, f2), this.t.getPaddingBottom());
        }
    }

    public void setMarginStartEnd(float f, float f2) {
        if (this.g == null) {
            return;
        }
        if (this.u != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(qrs.d(this.g, f), 0, qrs.d(this.g, f2), 0);
            this.u.setLayoutParams(layoutParams);
        }
        if (this.t != null) {
            ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-2, -2);
            layoutParams2.setMargins(qrs.d(this.g, f), 0, qrs.d(this.g, f2), 0);
            this.t.setLayoutParams(layoutParams2);
        }
    }

    public void setSubHeaderSafeRegion() {
        LinearLayout linearLayout = this.v;
        if (linearLayout == null) {
            return;
        }
        BaseActivity.setViewSafeRegion(false, linearLayout);
    }

    public void setMoreLayoutVisibility(int i) {
        ConstraintLayout constraintLayout = this.n;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(i);
        }
    }

    public void setSubHeaderBackgroundColor(int i) {
        LinearLayout linearLayout = this.v;
        if (linearLayout == null) {
            LogUtil.j("HealthSubHeader", "setSubHeaderBackgroundColor mSubHeaderContent is null");
            return;
        }
        int childCount = linearLayout.getChildCount();
        if (childCount < 1) {
            LogUtil.j("HealthSubHeader", "setSubHeaderBackgroundColor childCount is zero");
            return;
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.v.getChildAt(i2);
            if (childAt == null) {
                LogUtil.j("HealthSubHeader", "setSubHeaderBackgroundColor child is null");
            } else {
                childAt.setBackgroundColor(i);
            }
        }
    }

    public void setCloseBtnVisibility(int i) {
        ImageView imageView = this.f23898b;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(i);
        i();
    }

    public void setInfoBtnVisibility(int i) {
        ImageView imageView = this.i;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(i);
        i();
    }

    private void i() {
        if (this.f23898b.getVisibility() == 0 || this.i.getVisibility() == 0) {
            this.d.setVisibility(0);
            setMoreLayoutVisibility(8);
        }
        if (this.f23898b.getVisibility() == 8 && this.i.getVisibility() == 8) {
            this.d.setVisibility(8);
        }
    }

    private void b(ImageView imageView, int i, CharSequence charSequence) {
        if (imageView == null) {
            ReleaseLogUtil.d("HealthSubHeader", "setImageResource imageView is null");
            return;
        }
        imageView.setImageResource(i);
        if (TextUtils.isEmpty(charSequence)) {
            ReleaseLogUtil.d("HealthSubHeader", "setImageResource contentDescription ", charSequence);
        } else {
            lrd.b(imageView, charSequence);
        }
    }

    public void setCloseBtnSrc(int i, CharSequence charSequence) {
        b(this.f23898b, i, charSequence);
    }

    public void setInfoBtnSrc(int i, CharSequence charSequence) {
        b(this.i, i, charSequence);
    }

    public void setCloseBtnClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.f23898b;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }

    public void setInfoBtnClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }
}
