package fg2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfg2/b;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f71405a;

    public b(Context context) {
        context.getClass();
        this.f71405a = context;
    }

    public final ag2.d a(int i14) {
        String strE;
        try {
            InputStream inputStreamOpenRawResource = this.f71405a.getResources().openRawResource(i14);
            inputStreamOpenRawResource.getClass();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, d53.c.f57666b), 8192);
            try {
                strE = lg.d.E(bufferedReader);
                bufferedReader.close();
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    jg.b.l(bufferedReader, th3);
                    throw th4;
                }
            }
        } catch (Exception unused) {
            strE = "";
        }
        if (strE.length() <= 0) {
            return new ag2.d(null, null, null);
        }
        Object objFromJson = new Gson().fromJson(strE, (Class<Object>) ag2.d.class);
        objFromJson.getClass();
        return (ag2.d) objFromJson;
    }
}
