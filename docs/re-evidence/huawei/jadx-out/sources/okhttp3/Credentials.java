package okhttp3;

import com.huawei.hms.network.embedded.y;
import com.huawei.watchface.videoedit.gles.Constant;
import defpackage.zcp;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import ohos.ace.adapter.capability.web.WebDataBaseColumns;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lokhttp3/Credentials;", "", "()V", Constant.BASIC, "", WebDataBaseColumns.EntryColumns.COLUMN_NAME_USERNAME, WebDataBaseColumns.EntryColumns.COLUMN_NAME_USERPASS, "charset", "Ljava/nio/charset/Charset;", y.b.j}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Credentials {
    public static final Credentials INSTANCE = new Credentials();

    private Credentials() {
    }

    public static /* synthetic */ String basic$default(String str, String str2, Charset charset, int i, Object obj) {
        if ((i & 4) != 0) {
            charset = StandardCharsets.ISO_8859_1;
            zcp.b((Object) charset, "");
        }
        return basic(str, str2, charset);
    }

    @JvmStatic
    public static final String basic(String username, String password, Charset charset) {
        zcp.c(username, "");
        zcp.c(password, "");
        zcp.c(charset, "");
        return "Basic " + ByteString.INSTANCE.encodeString(username + ':' + password, charset).base64();
    }

    @JvmStatic
    public static final String basic(String str, String str2) {
        zcp.c(str, "");
        zcp.c(str2, "");
        return basic$default(str, str2, null, 4, null);
    }
}
