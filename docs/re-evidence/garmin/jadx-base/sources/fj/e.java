package fj;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;
import ui.g;
import ui.h;
import ui.j;
import wi.u;

/* JADX INFO: loaded from: classes7.dex */
public class e implements j<Uri, Drawable> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g<Resources.Theme> f71824b = g.c("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f71825a;

    public e(Context context) {
        this.f71825a = context.getApplicationContext();
    }

    @Override // ui.j
    public final /* bridge */ /* synthetic */ u<Drawable> a(Uri uri, int i14, int i15, h hVar) {
        return c(uri, hVar);
    }

    @Override // ui.j
    public final boolean b(Uri uri, h hVar) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    public final u c(Uri uri, h hVar) {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            kg.f.o("Package name for ", uri, " is null or empty");
            return null;
        }
        Context context = this.f71825a;
        if (authority.equals(context.getPackageName())) {
            contextCreatePackageContext = context;
        } else {
            try {
                contextCreatePackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e4) {
                if (!authority.contains(context.getPackageName())) {
                    n23.j.w(am.j.j(uri, "Failed to obtain context or unrecognized Uri format for: "), e4);
                    return null;
                }
                contextCreatePackageContext = context;
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (identifier == 0) {
                vb.h.s(am.j.j(uri, "Failed to find resource id for: "));
                return null;
            }
        } else {
            if (pathSegments.size() != 1) {
                vb.h.s(am.j.j(uri, "Unrecognized Uri format: "));
                return null;
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e14) {
                n23.j.w(am.j.j(uri, "Unrecognized Uri format: "), e14);
                return null;
            }
        }
        Resources.Theme theme = authority.equals(context.getPackageName()) ? (Resources.Theme) hVar.c(f71824b) : null;
        return d.c(theme == null ? b.a(context, contextCreatePackageContext, identifier, null) : b.a(context, context, identifier, theme));
    }
}
