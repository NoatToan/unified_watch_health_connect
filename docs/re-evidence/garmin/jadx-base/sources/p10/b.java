package p10;

import c83.a0;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import i83.o;
import i83.s;
import o53.i0;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JM\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lp10/b;", "", "", "locale", RemoteConfigConstants.RequestFieldKey.APP_ID, "internalVersionNumber", "partNumber", "Lokhttp3/RequestBody;", "userInput", "Lo53/i0;", "Lc83/a0;", "Lokhttp3/ResponseBody;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;)Lo53/i0;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface b {
    @o("{locale}/appSettings2/{appId}/versions/{internalVersionNumber}/devices/{partNumber}/binary")
    i0<a0<ResponseBody>> a(@s("locale") String locale, @s(RemoteConfigConstants.RequestFieldKey.APP_ID) String appId, @s("internalVersionNumber") String internalVersionNumber, @s("partNumber") String partNumber, @i83.a RequestBody userInput);
}
