package g;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lg/j;", "Lg/a;", "Landroid/net/Uri;", "", "<init>", "()V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class j extends a<Uri, Boolean> {
    @Override // g.a
    public final Intent a(Context context, Uri uri) {
        Uri uri2 = uri;
        context.getClass();
        uri2.getClass();
        Intent intentPutExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uri2);
        intentPutExtra.getClass();
        return intentPutExtra;
    }

    @Override // g.a
    public final a.C1502a<Boolean> b(Context context, Uri uri) {
        context.getClass();
        uri.getClass();
        return null;
    }

    @Override // g.a
    public final Boolean c(int i14, Intent intent) {
        return Boolean.valueOf(i14 == -1);
    }
}
