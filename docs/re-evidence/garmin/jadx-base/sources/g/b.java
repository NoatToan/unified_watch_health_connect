package g;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lg/b;", "Lg/a;", "", "Landroid/net/Uri;", "<init>", "()V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class b extends a<String, Uri> {
    @Override // g.a
    public final Intent a(Context context, String str) {
        String str2 = str;
        context.getClass();
        str2.getClass();
        Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str2);
        type.getClass();
        return type;
    }

    @Override // g.a
    public final a.C1502a<Uri> b(Context context, String str) {
        context.getClass();
        str.getClass();
        return null;
    }

    @Override // g.a
    public final Uri c(int i14, Intent intent) {
        if (i14 != -1) {
            intent = null;
        }
        if (intent != null) {
            return intent.getData();
        }
        return null;
    }
}
