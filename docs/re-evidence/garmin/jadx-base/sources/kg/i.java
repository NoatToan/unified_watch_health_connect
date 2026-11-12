package kg;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes7.dex */
public class i implements ig.a {
    @Override // ig.a
    public final String a(Context context) {
        if (context != null) {
            gh.c.a(context).getClass();
            if (gh.c.f77409b) {
                gh.c.a(context).getClass();
                if (gh.c.f77409b) {
                    String str = gh.c.f77415h;
                    if (str != null) {
                        return str;
                    }
                    gh.c.b(0, null);
                    if (gh.c.f77410c == null) {
                        Context context2 = gh.c.f77408a;
                        gh.c.f77410c = new gh.d(gh.c.f77416i, 0, null);
                        context2.getContentResolver().registerContentObserver(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), true, gh.c.f77410c);
                    }
                    return gh.c.f77415h;
                }
            }
        }
        return null;
    }
}
