package defpackage;

import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ImageSpan;
import android.text.style.TypefaceSpan;
import com.huawei.uikit.hwsubtab.R;
import com.huawei.uikit.hwsubtab.widget.HwSubTabListener;
import com.huawei.uikit.hwsubtab.widget.HwSubTabWidget;

/* JADX INFO: loaded from: classes20.dex */
public class xfz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HwSubTabListener f52856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f52857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CharSequence f52858c;
    private HwSubTabWidget d;
    private int e;
    private int g;

    public xfz(HwSubTabWidget hwSubTabWidget) {
        this(hwSubTabWidget, "");
    }

    private SpannableString c(CharSequence charSequence, CharSequence charSequence2) {
        SpannableString spannableString = new SpannableString(((Object) charSequence) + " " + ((Object) charSequence2));
        spannableString.setSpan(new ImageSpan(this.d.getContext(), R.drawable.hwsubtab_imagespan), charSequence.length(), charSequence.length() + 1, 33);
        spannableString.setSpan(new AbsoluteSizeSpan(this.d.getSubTitleTextSize()), charSequence.length(), spannableString.length(), 33);
        spannableString.setSpan(new TypefaceSpan(this.d.getContext().getString(R.string.emui_text_font_family_regular)), charSequence.length(), spannableString.length(), 33);
        return spannableString;
    }

    public void b(int i) {
        this.e = i;
    }

    public int c() {
        return this.e;
    }

    public xfz c(HwSubTabListener hwSubTabListener) {
        this.f52856a = hwSubTabListener;
        return this;
    }

    public HwSubTabListener d() {
        return this.f52856a;
    }

    public xfz e(Object obj) {
        this.f52857b = obj;
        return this;
    }

    public CharSequence f() {
        return this.f52858c;
    }

    public Object g() {
        return this.f52857b;
    }

    public void h() {
        this.d.a(this);
        this.d.c(this);
    }

    public int i() {
        return this.g;
    }

    public xfz(HwSubTabWidget hwSubTabWidget, CharSequence charSequence) {
        this(hwSubTabWidget, charSequence, null);
    }

    public xfz(HwSubTabWidget hwSubTabWidget, CharSequence charSequence, HwSubTabListener hwSubTabListener) {
        this(hwSubTabWidget, charSequence, hwSubTabListener, null);
    }

    public xfz(HwSubTabWidget hwSubTabWidget, CharSequence charSequence, HwSubTabListener hwSubTabListener, Object obj) {
        this(hwSubTabWidget, charSequence, "", hwSubTabListener, obj);
    }

    public xfz a(CharSequence charSequence) {
        this.f52858c = charSequence;
        int i = this.e;
        if (i >= 0) {
            this.d.e(i);
        }
        return this;
    }

    public xfz(HwSubTabWidget hwSubTabWidget, CharSequence charSequence, CharSequence charSequence2, HwSubTabListener hwSubTabListener, Object obj) {
        this.e = -1;
        this.g = -1;
        this.d = hwSubTabWidget;
        this.f52856a = hwSubTabListener;
        this.f52857b = obj;
        if (charSequence2 != null && !charSequence2.equals("")) {
            this.f52858c = c(charSequence, charSequence2);
        } else {
            this.f52858c = charSequence;
        }
    }
}
