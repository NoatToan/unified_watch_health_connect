package aq0;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import d53.w;
import dj.k;
import hj.i;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import mj.h;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import pj.d;
import ui.l;
import wi.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001&B×\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0001\u0010\u0015\u001a\u00020\r\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0001\u0010\u0018\u001a\u00020\r\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u001a\u0012\u0006\u0010\u001c\u001a\u00020\r\u0012\u0006\u0010\u001d\u001a\u00020\r\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010\"\u001a\u00020 \u0012\b\u0010#\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b$\u0010%¨\u0006'"}, d2 = {"Laq0/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/app/Activity;", "activity", "Landroidx/fragment/app/m;", "fragmentActivity", "Landroidx/fragment/app/Fragment;", "supportFragment", "", "imageUrl", "fallbackImageUrl", "", "imageResId", "", "imageBytes", "Landroid/net/Uri;", "imageUri", "Ljava/io/File;", "imageFile", "placeholderResId", "Landroid/graphics/drawable/Drawable;", "placeholderDrawable", "errorImageResId", "errorImageDrawable", "", "transformations", "imageWidth", "imageHeight", "Lzp0/b;", "imageLoadListener", "", "dontAnimate", "centerCrop", "cacheAvailability", "<init>", "(Landroid/content/Context;Landroid/app/Activity;Landroidx/fragment/app/m;Landroidx/fragment/app/Fragment;Ljava/lang/String;Ljava/lang/String;I[BLandroid/net/Uri;Ljava/io/File;ILandroid/graphics/drawable/Drawable;ILandroid/graphics/drawable/Drawable;Ljava/util/List;IILzp0/b;ZZLjava/lang/String;)V", "a", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Logger f12319v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f12321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f12322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Fragment f12323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f12324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f12325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f12326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f12327h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Uri f12328i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final File f12329j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f12330k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Drawable f12331l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f12332m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Drawable f12333n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List<String> f12334o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f12335p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f12336q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final zp0.b f12337r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f12338s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f12339t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f12340u;

    static {
        new C0170a(null);
        f12319v = gt2.c.b(a2.IMAGE_LOADER.f28756a);
    }

    public a(Context context, Activity activity, m mVar, Fragment fragment, String str, String str2, int i14, byte[] bArr, Uri uri, File file, int i15, Drawable drawable, int i16, Drawable drawable2, List<String> list, int i17, int i18, zp0.b bVar, boolean z14, boolean z15, String str3) {
        this.f12320a = context;
        this.f12321b = activity;
        this.f12322c = mVar;
        this.f12323d = fragment;
        this.f12324e = str;
        this.f12325f = str2;
        this.f12326g = i14;
        this.f12327h = bArr;
        this.f12328i = uri;
        this.f12329j = file;
        this.f12330k = i15;
        this.f12331l = drawable;
        this.f12332m = i16;
        this.f12333n = drawable2;
        this.f12334o = list;
        this.f12335p = i17;
        this.f12336q = i18;
        this.f12337r = bVar;
        this.f12338s = z14;
        this.f12339t = z15;
        this.f12340u = str3;
    }

    @SuppressLint({"CheckResult"})
    public final h a() {
        ArrayList arrayList;
        int i14;
        h hVar = new h();
        if (this.f12329j != null) {
            hVar.q(new d(Long.valueOf(System.currentTimeMillis())));
            hVar.d(j.f185365b);
        } else {
            hVar.d(j.f185364a);
        }
        String str = this.f12340u;
        if (str != null) {
            if (str.equals("cache_availability_today")) {
                Calendar calendar = Calendar.getInstance();
                hVar.q(new d(Integer.valueOf(calendar.get(1) + (calendar.get(6) * 10))));
            } else if (str.equals("cache_availability_this_week")) {
                Calendar calendar2 = Calendar.getInstance();
                hVar.q(new d(Integer.valueOf(calendar2.get(1) + (calendar2.get(3) * 10))));
            }
        }
        int i15 = this.f12330k;
        if (i15 > 0) {
            hVar.k(i15);
        } else {
            Drawable drawable = this.f12331l;
            if (drawable != null) {
                hVar.l(drawable);
            }
        }
        int i16 = this.f12332m;
        if (i16 > 0) {
            hVar.e(i16);
        } else {
            Drawable drawable2 = this.f12333n;
            if (drawable2 != null) {
                hVar.f(drawable2);
            }
        }
        List<String> list = this.f12334o;
        if (list == null || list.size() <= 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (s.g(it.next(), "circle_mask")) {
                    arrayList.add(new k());
                }
            }
        }
        if (arrayList != null) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                hVar.w((l) it3.next(), true);
            }
        }
        int i17 = this.f12335p;
        if (i17 > 0 && (i14 = this.f12336q) > 0) {
            hVar.j(i17, i14);
        }
        if (this.f12338s) {
            hVar.p(i.f83959b, Boolean.TRUE);
        }
        if (this.f12339t) {
            hVar.u(dj.l.f59839c, new dj.i());
        }
        return hVar;
    }

    public final com.bumptech.glide.k b() {
        Fragment fragment = this.f12323d;
        if (fragment != null) {
            return com.bumptech.glide.b.c(fragment.getContext()).d(fragment);
        }
        Activity activity = this.f12321b;
        if (activity != null) {
            return com.bumptech.glide.b.e(activity.getApplicationContext());
        }
        m mVar = this.f12322c;
        if (mVar != null) {
            return com.bumptech.glide.b.c(mVar).e(mVar);
        }
        Context context = this.f12320a;
        if (context != null) {
            return com.bumptech.glide.b.c(context).c(context);
        }
        f12319v.error("Context, Activity or Fragment not set (all null) !!! FIX ME developer");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000d  */
    public final com.bumptech.glide.j<Drawable> c(com.bumptech.glide.k kVar) {
        com.bumptech.glide.j<Drawable> jVarL;
        com.bumptech.glide.j<Drawable> jVarL2;
        String str = this.f12324e;
        if (str == null) {
            Uri uri = this.f12328i;
            if (uri == null) {
                File file = this.f12329j;
                if (file == null) {
                    byte[] bArr = this.f12327h;
                    if (bArr == null) {
                        int i14 = this.f12326g;
                        if (i14 == 0) {
                            f12319v.error("Image source not set or null !!!");
                            if (kVar != null) {
                                jVarL = kVar.l("");
                            } else {
                                jVarL = null;
                            }
                        } else if (kVar != null) {
                            Integer numValueOf = Integer.valueOf(i14);
                            com.bumptech.glide.j jVarD = kVar.d(Drawable.class);
                            com.bumptech.glide.j jVarJ = jVarD.J(numValueOf);
                            Context context = jVarD.f28503y;
                            jVarL = (com.bumptech.glide.j) jVarJ.t(context.getTheme()).q(pj.a.c(context));
                        } else {
                            jVarL = null;
                        }
                    } else if (kVar != null) {
                        jVarL = kVar.d(Drawable.class).I(bArr);
                    } else {
                        jVarL = null;
                    }
                } else if (kVar != null) {
                    jVarL = kVar.d(Drawable.class).J(file);
                } else {
                    jVarL = null;
                }
            } else if (kVar != null) {
                jVarL = kVar.d(Drawable.class).H(uri);
            } else {
                jVarL = null;
            }
        } else if (kVar != null) {
            jVarL = kVar.l(str);
        } else {
            jVarL = null;
        }
        String str2 = this.f12325f;
        if (str2 != null && (!w.J(str2)) && jVarL != null) {
            jVarL.C((kVar == null || (jVarL2 = kVar.l(str2)) == null) ? null : jVarL2.a(a()));
        }
        if (jVarL != null) {
            return jVarL.a(a());
        }
        return null;
    }

    /* JADX INFO: renamed from: aq0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Laq0/a$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0170a {
        public /* synthetic */ C0170a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0170a() {
        }
    }
}
