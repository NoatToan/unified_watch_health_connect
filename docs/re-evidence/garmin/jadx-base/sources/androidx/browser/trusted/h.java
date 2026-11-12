package androidx.browser.trusted;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f5324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Uri> f5325b;

    public h(Intent intent, List<Uri> list) {
        this.f5324a = intent;
        this.f5325b = list;
    }

    public final void a(Context context) {
        Iterator<Uri> it = this.f5325b.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            Intent intent = this.f5324a;
            if (!zHasNext) {
                a7.b.startActivity(context, intent, null);
                return;
            } else {
                context.grantUriPermission(intent.getPackage(), it.next(), 1);
            }
        }
    }
}
