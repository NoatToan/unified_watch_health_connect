package com.huawei.ui.main.stories.health.fragment.rqpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.huawei.ui.main.R;
import defpackage.uvf;

/* JADX INFO: loaded from: classes19.dex */
public class Vo2maxLevelHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f27947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f27948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f27949c;
    private Context d;
    private String e;
    private boolean f;
    private String g;
    private String i;
    private String j;

    public Vo2maxLevelHelper(Context context) {
        this.d = context;
        a();
    }

    private void a() {
        this.i = this.d.getString(R.string.IDS_device_hagrid_body_element_content_low);
        this.j = this.d.getString(R.string.IDS_hwh_health_vo2max_level_poor);
        this.g = this.d.getString(R.string.IDS_hwh_health_vo2max_level_fair);
        this.f27948b = this.d.getString(R.string.IDS_hwh_health_vo2max_level_average);
        this.f27947a = this.d.getString(R.string.IDS_hwh_health_vo2max_level_good);
        this.f27949c = this.d.getString(R.string.IDS_hwh_health_vo2max_level_verygood);
        this.e = this.d.getString(R.string.IDS_hwh_health_vo2max_level_excellent);
    }

    private SpannableStringBuilder c() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d").append((CharSequence) this.i).append((CharSequence) "d").append((CharSequence) this.j).append((CharSequence) "d").append((CharSequence) this.g).append((CharSequence) "d").append((CharSequence) this.f27948b);
        if (this.f) {
            spannableStringBuilder.append((CharSequence) System.lineSeparator());
        }
        spannableStringBuilder.append((CharSequence) "d").append((CharSequence) this.f27947a).append((CharSequence) "d").append((CharSequence) this.f27949c).append((CharSequence) "d").append((CharSequence) this.e);
        return spannableStringBuilder;
    }

    public SpannableStringBuilder b(boolean z) {
        this.f = z;
        Drawable drawable = this.d.getDrawable(R.drawable.running_index_level_sss);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        Drawable drawable2 = this.d.getDrawable(R.drawable.running_index_level_ss);
        drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
        Drawable drawable3 = this.d.getDrawable(R.drawable.running_index_level_s);
        drawable3.setBounds(0, 0, drawable3.getMinimumWidth(), drawable3.getMinimumHeight());
        Drawable drawable4 = this.d.getDrawable(R.drawable.running_index_level_a);
        drawable4.setBounds(0, 0, drawable4.getMinimumWidth(), drawable4.getMinimumHeight());
        Drawable drawable5 = this.d.getDrawable(R.drawable.running_index_level_b);
        drawable5.setBounds(0, 0, drawable5.getMinimumWidth(), drawable5.getMinimumHeight());
        Drawable drawable6 = this.d.getDrawable(R.drawable.running_index_level_c);
        drawable6.setBounds(0, 0, drawable6.getMinimumWidth(), drawable6.getMinimumHeight());
        Drawable drawable7 = this.d.getDrawable(R.drawable.running_index_level_d);
        drawable7.setBounds(0, 0, drawable7.getMinimumWidth(), drawable7.getMinimumHeight());
        SpannableStringBuilder spannableStringBuilderC = c();
        spannableStringBuilderC.setSpan(new uvf(drawable, 0, 15), 0, 1, 1);
        int length = this.i.length();
        int i = length + 1;
        spannableStringBuilderC.setSpan(new uvf(drawable2, 30, 15), i, length + 2, 1);
        int length2 = i + this.j.length();
        int i2 = length2 + 1;
        spannableStringBuilderC.setSpan(new uvf(drawable3, 30, 15), i2, length2 + 2, 1);
        int length3 = i2 + this.g.length();
        int i3 = length3 + 1;
        spannableStringBuilderC.setSpan(new uvf(drawable4, 30, 15), i3, length3 + 2, 1);
        int length4 = i3 + this.f27948b.length() + (this.f ? 2 : 1);
        spannableStringBuilderC.setSpan(new uvf(drawable5, 30, 15), length4, length4 + 1, 1);
        int length5 = length4 + this.f27947a.length();
        int i4 = length5 + 1;
        spannableStringBuilderC.setSpan(new uvf(drawable6, 30, 15), i4, length5 + 2, 1);
        int length6 = i4 + this.f27949c.length();
        spannableStringBuilderC.setSpan(new uvf(drawable7, 30, 15), length6 + 1, length6 + 2, 1);
        return spannableStringBuilderC;
    }
}
