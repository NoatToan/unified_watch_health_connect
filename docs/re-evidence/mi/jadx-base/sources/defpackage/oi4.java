package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.os.UserHandle;

/* JADX INFO: loaded from: classes3.dex */
public class oi4 {
    public static ContentResolver a(Context context, UserHandle userHandle) {
        return context.getContentResolverForUser(userHandle);
    }
}
