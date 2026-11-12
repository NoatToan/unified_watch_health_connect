package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public class fst {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f34502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Drawable f34503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f34504c;
    private View.OnClickListener d;
    private String e;
    private String g;
    private ftm i;

    public fst(String str, String str2, Drawable drawable, ftm ftmVar, String str3, View.OnClickListener onClickListener) {
        this.g = str;
        this.e = str2;
        this.f34503b = drawable;
        this.i = ftmVar;
        this.f34504c = str3;
        this.d = onClickListener;
    }

    public fst(String str, String str2, ftm ftmVar, String str3, View.OnClickListener onClickListener, String str4) {
        this.g = str;
        this.e = str2;
        this.i = ftmVar;
        this.f34504c = str3;
        this.d = onClickListener;
        this.f34502a = str4;
    }

    public String a() {
        return this.f34502a;
    }

    public String b() {
        return this.g;
    }

    public String d() {
        return this.e;
    }

    public ftm i() {
        return this.i;
    }

    public String e() {
        return this.f34504c;
    }

    public View.OnClickListener c() {
        return this.d;
    }

    public String toString() {
        return "Section16_9Card_01_BannerItem{mTitle='" + this.g + "', mDesc='" + this.e + "', mTopRightStatus=" + this.i + ", mBottomRightText='" + this.f34504c + "', mOnClickListener=" + this.d + '}';
    }
}
