package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.xiaomi.fitness.schema.export.PushConstants;
import java.net.URLDecoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class w7r implements wfl {
    private Object mExtras;

    public static String decodeParam(String str) {
        return !TextUtils.isEmpty(str) ? URLDecoder.decode(str) : "";
    }

    public abstract String authority();

    @Override // defpackage.wfl
    public boolean canHandle(Uri uri) {
        if (PushConstants.getSSchemeWearable().equals(uri.getScheme())) {
            if (!authority().equals(uri.getAuthority())) {
                if ((authority() + ".xiaomi.com").equals(uri.getAuthority())) {
                }
            }
            return true;
        }
        return false;
    }

    public abstract void doProcess(@NotNull Context context, @NotNull Uri uri);

    public Object getExtras() {
        return this.mExtras;
    }

    public final boolean needLogin() {
        return true;
    }

    @Override // defpackage.wfl
    public final void process(Context context, Uri uri, Object obj) {
        this.mExtras = obj;
        if (context != null) {
            doProcess(context, uri);
        }
    }
}
