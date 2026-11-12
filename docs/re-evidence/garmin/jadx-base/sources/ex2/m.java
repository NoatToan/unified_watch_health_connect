package ex2;

import com.google.gson.JsonObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lex2/m;", "", "", "unitId", "", "partNumber", "Lc83/d;", "Lcom/google/gson/JsonObject;", "a", "(JLjava/lang/String;)Lc83/d;", "", "imageSetVersion", "b", "(I)Lc83/d;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface m {
    @i83.k({"Garmin-Client-Name: ConnectMobile"})
    @i83.f("v1/devices/{unitId}/products/{partNumber}/versions/0.0/updates")
    c83.d<JsonObject> a(@i83.s("unitId") long unitId, @i83.s("partNumber") String partNumber);

    @i83.f("v{version}/config.json")
    c83.d<JsonObject> b(@i83.s("version") int imageSetVersion);
}
