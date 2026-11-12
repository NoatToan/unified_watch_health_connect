package com.huawei.ui.main.stories.health.fragment.rqpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.huawei.ui.main.R;
import defpackage.uvf;

/* JADX INFO: loaded from: classes19.dex */
public class StateIndexDayHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f27944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f27945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f27946c;
    private String d;
    private String e;
    private String f;
    private String h;

    public StateIndexDayHelper(Context context) {
        this.f27946c = context;
        b();
    }

    private void b() {
        this.f = this.f27946c.getString(R.string.IDS_data_index_very_pool);
        this.e = this.f27946c.getString(R.string.IDS_data_index_pool);
        this.d = this.f27946c.getString(R.string.IDS_data_index_normal);
        this.h = this.f27946c.getString(R.string.IDS_data_index_well);
        this.f27944a = this.f27946c.getString(R.string.IDS_data_index_very_well);
    }

    private SpannableStringBuilder e() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d").append((CharSequence) this.f).append((CharSequence) "d").append((CharSequence) this.e).append((CharSequence) "d").append((CharSequence) this.d);
        if (this.f27945b) {
            spannableStringBuilder.append((CharSequence) System.lineSeparator());
        }
        spannableStringBuilder.append((CharSequence) "d").append((CharSequence) this.h).append((CharSequence) "d").append((CharSequence) this.f27944a);
        return spannableStringBuilder;
    }

    public SpannableStringBuilder b(boolean z) {
        this.f27945b = z;
        Drawable drawable = this.f27946c.getDrawable(R.drawable.running_index_level_sss);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        Drawable drawable2 = this.f27946c.getDrawable(R.drawable.running_index_level_ss);
        drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
        Drawable drawable3 = this.f27946c.getDrawable(R.drawable.running_index_level_a);
        drawable3.setBounds(0, 0, drawable3.getMinimumWidth(), drawable3.getMinimumHeight());
        Drawable drawable4 = this.f27946c.getDrawable(R.drawable.running_index_level_b);
        drawable4.setBounds(0, 0, drawable4.getMinimumWidth(), drawable4.getMinimumHeight());
        Drawable drawable5 = this.f27946c.getDrawable(R.drawable.running_index_level_d);
        drawable5.setBounds(0, 0, drawable5.getMinimumWidth(), drawable5.getMinimumHeight());
        SpannableStringBuilder spannableStringBuilderE = e();
        spannableStringBuilderE.setSpan(new uvf(drawable, 0, 15), 0, 1, 1);
        int length = this.f.length();
        int i = length + 1;
        spannableStringBuilderE.setSpan(new uvf(drawable2, 70, 15), i, length + 2, 1);
        int length2 = i + this.e.length();
        int i2 = length2 + 1;
        spannableStringBuilderE.setSpan(new uvf(drawable3, 70, 15), i2, length2 + 2, 1);
        int length3 = i2 + this.d.length() + (this.f27945b ? 2 : 1);
        spannableStringBuilderE.setSpan(new uvf(drawable4, 70, 15), length3, length3 + 1, 1);
        int length4 = length3 + this.h.length();
        spannableStringBuilderE.setSpan(new uvf(drawable5, 70, 15), length4 + 1, length4 + 2, 1);
        this.f27944a.length();
        return spannableStringBuilderE;
    }
}
