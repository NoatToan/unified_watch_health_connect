package com.huawei.ui.main.stories.health.fragment.rqpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.huawei.haf.application.BaseApplication;
import com.huawei.ui.main.R;
import defpackage.qre;
import defpackage.uvf;
import defpackage.wka;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class RqRunningHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f27941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f27942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27943c;
    private int d;
    private Context e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String l;
    private String m;
    private String[] n;
    private int o = 1;

    public RqRunningHelper(Context context) {
        this.e = context;
        b();
        this.f27941a = 15;
        if (this.f27943c) {
            this.d = 30;
            return;
        }
        this.d = 65;
        if (!LanguageUtil.ba(this.e) || LanguageUtil.br(this.e) || LanguageUtil.x(this.e)) {
            return;
        }
        this.f27941a = 65;
        this.d = 15;
    }

    private void b() {
        this.f = this.e.getString(R.string.IDS_data_running_index_level_d);
        this.j = this.e.getString(R.string.IDS_data_running_index_level_c);
        this.h = this.e.getString(R.string.IDS_data_running_index_level_b);
        this.i = this.e.getString(R.string.IDS_data_running_index_level_a);
        this.g = this.e.getString(R.string.IDS_data_running_index_level_s);
        this.m = this.e.getString(R.string.IDS_data_running_index_level_ss);
        String string = this.e.getString(R.string.IDS_data_running_index_level_sss);
        this.l = string;
        this.n = new String[]{this.f, this.j, this.h, this.i, this.g, this.m, string};
        this.f27943c = LanguageUtil.f(BaseApplication.b());
    }

    private SpannableStringBuilder c() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (LanguageUtil.br(this.e) || LanguageUtil.x(this.e) || LanguageUtil.bs(this.e)) {
            spannableStringBuilder.append((CharSequence) this.n[0]).append((CharSequence) "d").append((CharSequence) this.n[1]).append((CharSequence) "d").append((CharSequence) this.n[2]).append((CharSequence) "d").append((CharSequence) this.n[3]).append((CharSequence) "d").append((CharSequence) this.n[4]);
            if (this.f27942b) {
                spannableStringBuilder.append((CharSequence) System.lineSeparator());
            }
            spannableStringBuilder.append((CharSequence) "d").append((CharSequence) this.n[5]).append((CharSequence) "d").append((CharSequence) this.n[6]).append((CharSequence) "d");
            return spannableStringBuilder;
        }
        spannableStringBuilder.append((CharSequence) "d").append((CharSequence) this.n[0]).append((CharSequence) "d").append((CharSequence) this.n[1]).append((CharSequence) "d").append((CharSequence) this.n[2]).append((CharSequence) "d").append((CharSequence) this.n[3]).append((CharSequence) "d").append((CharSequence) this.n[4]);
        if (this.f27942b) {
            spannableStringBuilder.append((CharSequence) System.lineSeparator());
        }
        spannableStringBuilder.append((CharSequence) "d").append((CharSequence) this.n[5]).append((CharSequence) "d").append((CharSequence) this.n[6]);
        return spannableStringBuilder;
    }

    public SpannableStringBuilder e(boolean z) {
        this.f27942b = z;
        ArrayList arrayList = new ArrayList();
        boolean zE = wka.e();
        Drawable drawableC = qre.c(zE ? R.drawable.running_index_level_sss : R.drawable.running_index_level_d);
        drawableC.setBounds(0, 0, drawableC.getMinimumWidth(), drawableC.getMinimumHeight());
        arrayList.add(drawableC);
        Drawable drawableC2 = qre.c(zE ? R.drawable.running_index_level_ss : R.drawable.running_index_level_c);
        drawableC2.setBounds(0, 0, drawableC2.getMinimumWidth(), drawableC2.getMinimumHeight());
        arrayList.add(drawableC2);
        Drawable drawableC3 = qre.c(zE ? R.drawable.running_index_level_s : R.drawable.running_index_level_b);
        drawableC3.setBounds(0, 0, drawableC3.getMinimumWidth(), drawableC3.getMinimumHeight());
        arrayList.add(drawableC3);
        Drawable drawableC4 = qre.c(R.drawable.running_index_level_a);
        drawableC4.setBounds(0, 0, drawableC4.getMinimumWidth(), drawableC4.getMinimumHeight());
        arrayList.add(drawableC4);
        Drawable drawableC5 = qre.c(zE ? R.drawable.running_index_level_b : R.drawable.running_index_level_s);
        drawableC5.setBounds(0, 0, drawableC5.getMinimumWidth(), drawableC5.getMinimumHeight());
        arrayList.add(drawableC5);
        Drawable drawableC6 = qre.c(zE ? R.drawable.running_index_level_c : R.drawable.running_index_level_ss);
        drawableC6.setBounds(0, 0, drawableC6.getMinimumWidth(), drawableC6.getMinimumHeight());
        arrayList.add(drawableC6);
        Drawable drawableC7 = qre.c(zE ? R.drawable.running_index_level_d_new : R.drawable.running_index_level_sss);
        drawableC7.setBounds(0, 0, drawableC7.getMinimumWidth(), drawableC7.getMinimumHeight());
        arrayList.add(drawableC7);
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (LanguageUtil.br(this.e) || LanguageUtil.x(this.e) || LanguageUtil.bs(this.e)) {
            this.o = 33;
            this.n = new String[]{this.l, this.m, this.g, this.i, this.h, this.j, this.f};
            arrayList2.clear();
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList2.add((Drawable) arrayList.get(size));
            }
        }
        SpannableStringBuilder spannableStringBuilderC = c();
        if (LanguageUtil.br(this.e) || LanguageUtil.x(this.e) || LanguageUtil.bs(this.e)) {
            c(arrayList2, spannableStringBuilderC);
            return spannableStringBuilderC;
        }
        b(arrayList2, spannableStringBuilderC);
        return spannableStringBuilderC;
    }

    private void b(List<Drawable> list, SpannableStringBuilder spannableStringBuilder) {
        if (LanguageUtil.ba(this.e)) {
            spannableStringBuilder.setSpan(new uvf(list.get(0), this.d, 0), 0, 1, this.o);
        } else {
            spannableStringBuilder.setSpan(new uvf(list.get(0), 0, this.f27941a), 0, 1, this.o);
        }
        int length = this.n[0].length();
        int i = length + 1;
        spannableStringBuilder.setSpan(new uvf(list.get(1), this.d, this.f27941a), i, length + 2, this.o);
        int length2 = i + this.n[1].length();
        int i2 = length2 + 1;
        spannableStringBuilder.setSpan(new uvf(list.get(2), this.d, this.f27941a), i2, length2 + 2, this.o);
        int length3 = i2 + this.n[2].length();
        int i3 = length3 + 1;
        spannableStringBuilder.setSpan(new uvf(list.get(3), this.d, this.f27941a), i3, length3 + 2, this.o);
        int length4 = i3 + this.n[3].length();
        int i4 = length4 + 1;
        spannableStringBuilder.setSpan(new uvf(list.get(4), this.d, this.f27941a), i4, length4 + 2, this.o);
        int length5 = i4 + this.n[4].length() + (this.f27942b ? 2 : 1);
        spannableStringBuilder.setSpan(new uvf(list.get(5), this.d, this.f27941a), length5, length5 + 1, this.o);
        int length6 = length5 + this.n[5].length();
        spannableStringBuilder.setSpan(new uvf(list.get(6), this.d, this.f27941a), length6 + 1, length6 + 2, this.o);
    }

    private void c(List<Drawable> list, SpannableStringBuilder spannableStringBuilder) {
        int length = this.n[0].length();
        spannableStringBuilder.setSpan(new uvf(list.get(0), this.d, this.f27941a), length, length + 1, this.o);
        int length2 = length + this.n[1].length();
        int i = length2 + 1;
        spannableStringBuilder.setSpan(new uvf(list.get(1), this.d, this.f27941a), i, length2 + 2, this.o);
        int length3 = i + this.n[2].length();
        int i2 = length3 + 1;
        spannableStringBuilder.setSpan(new uvf(list.get(2), this.d, this.f27941a), i2, length3 + 2, this.o);
        int length4 = i2 + this.n[3].length();
        int i3 = length4 + 1;
        spannableStringBuilder.setSpan(new uvf(list.get(3), this.d, this.f27941a), i3, length4 + 2, this.o);
        int length5 = i3 + this.n[4].length();
        int i4 = length5 + 1;
        spannableStringBuilder.setSpan(new uvf(list.get(4), this.d, this.f27941a), i4, length5 + 2, this.o);
        int length6 = i4 + this.n[5].length() + (this.f27942b ? 2 : 1);
        spannableStringBuilder.setSpan(new uvf(list.get(5), this.d, this.f27941a), length6, length6 + 1, this.o);
        int length7 = length6 + this.n[6].length();
        int i5 = length7 + 1;
        if (LanguageUtil.bs(this.e)) {
            Drawable drawable = list.get(6);
            int i6 = this.d;
            spannableStringBuilder.setSpan(new uvf(drawable, i6, i6), i5, length7 + 2, this.o);
        } else {
            Drawable drawable2 = list.get(6);
            int i7 = this.f27941a;
            spannableStringBuilder.setSpan(new uvf(drawable2, i7, i7), i5, length7 + 2, this.o);
        }
    }
}
