package i7;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f91937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f91938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f91939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f91940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f91941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f91942f;

    public l(String str, String str2) {
        this.f91937a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f91938b = 0;
        this.f91939c = 400;
        this.f91940d = false;
        this.f91941e = str2;
        this.f91942f = 0;
    }

    public l(Uri uri, int i14, int i15, boolean z14, String str, int i16) {
        uri.getClass();
        this.f91937a = uri;
        this.f91938b = i14;
        this.f91939c = i15;
        this.f91940d = z14;
        this.f91941e = str;
        this.f91942f = i16;
    }

    @Deprecated
    public l(Uri uri, int i14, int i15, boolean z14, int i16) {
        this(uri, i14, i15, z14, null, i16);
    }
}
