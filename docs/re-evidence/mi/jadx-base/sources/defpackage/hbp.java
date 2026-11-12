package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.xiaomi.fitness.access.StravaAccessActivity;
import com.xiaomi.fitness.access.util.ThirdPartAccessConstants;
import com.xiaomi.fitness.common.log.Logger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class hbp extends y0c {
    public final void a(Context context, Uri uri) {
        String queryParameter = uri.getQueryParameter("code");
        Intent intent = new Intent();
        intent.putExtra("extra_key_code", queryParameter);
        intent.setClass(context, StravaAccessActivity.class);
        intent.setFlags(67108864);
        intent.addFlags(536870912);
        context.startActivity(intent);
    }

    @Override // defpackage.y0c
    @NotNull
    public String authority() {
        return null;
    }

    @Override // defpackage.y0c, defpackage.wfl
    public boolean canHandle(Uri uri) {
        return ThirdPartAccessConstants.STRAVA_SCHEME.equals(uri.getScheme());
    }

    @Override // defpackage.y0c
    public void doProcess(Context context, Uri uri) {
        Logger.i("ThirdPartAccessHandler", "path=" + uri.getPath());
        String scheme = uri.getScheme();
        scheme.hashCode();
        if (scheme.equals(ThirdPartAccessConstants.STRAVA_SCHEME)) {
            a(context, uri);
            return;
        }
        Logger.i("ThirdPartAccessHandler", "Unknown schema to process:" + uri.getScheme());
    }
}
