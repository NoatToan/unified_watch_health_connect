package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.schema.export.PushConstants;
import java.net.URLDecoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class y0c implements wfl {
    private Object mExtras;

    static String decodeParam(String str) {
        return !TextUtils.isEmpty(str) ? URLDecoder.decode(str) : "";
    }

    public abstract String authority();

    @Override // defpackage.wfl
    public boolean canHandle(Uri uri) {
        if (PushConstants.getSSchemeMihealth().equals(uri.getScheme())) {
            if (!authority().equals(uri.getAuthority())) {
                if ((authority() + ".xiaomi.com").equals(uri.getAuthority())) {
                }
            }
            return true;
        }
        return false;
    }

    public abstract void doProcess(@NotNull Context context, @NotNull Uri uri);

    public Integer getBackStackBaseTab(Uri uri) {
        return -1;
    }

    public Object getExtras() {
        return this.mExtras;
    }

    public final boolean needLogin() {
        return true;
    }

    @Override // defpackage.wfl
    public final void process(Context context, Uri uri, Object obj) {
        this.mExtras = obj;
        showMainActivityBaseTabIfNeed(context, getBackStackBaseTab(uri));
        if (context != null) {
            doProcess(context, uri);
        }
    }

    public void showMainActivityBaseTabIfNeed(Context context, Integer num) {
        if (num.intValue() != -1) {
            Bundle bundle = new Bundle();
            bundle.putInt("key_tab", num.intValue());
            MainExtKt.showMainActivity(context, null, bundle);
        }
    }
}
