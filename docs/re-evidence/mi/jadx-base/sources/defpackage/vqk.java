package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class vqk implements tqk<Uri, Drawable> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final wbh<Resources.Theme> f37138b = wbh.e("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f37139a;

    public vqk(Context context) {
        this.f37139a = context.getApplicationContext();
    }

    @Override // defpackage.tqk
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public kqk<Drawable> b(Uri uri, int i, int i2, cch cchVar) {
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            Context contextD = d(uri, authority);
            int iG = g(contextD, uri);
            Resources.Theme theme = ((String) a6i.d(authority)).equals(this.f37139a.getPackageName()) ? (Resources.Theme) cchVar.c(f37138b) : null;
            return cwg.c(theme == null ? l47.b(this.f37139a, contextD, iG) : l47.a(this.f37139a, iG, theme));
        }
        throw new IllegalStateException("Package name for " + uri + " is null or empty");
    }

    public final Context d(Uri uri, String str) {
        if (str.equals(this.f37139a.getPackageName())) {
            return this.f37139a;
        }
        try {
            return this.f37139a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            if (str.contains(this.f37139a.getPackageName())) {
                return this.f37139a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e);
        }
    }

    public final int e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e);
        }
    }

    public final int f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, PluginPackageConstant.RN_DIR_A);
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    public final int g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // defpackage.tqk
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri, cch cchVar) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }
}
