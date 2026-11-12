package ky2;

import c83.d;
import com.google.common.net.HttpHeaders;
import i83.i;
import i83.o;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes13.dex */
public interface a {
    @o("v1/updates")
    d<ResponseBody> a(@i(HttpHeaders.ACCEPT) String str, @i("Garmin-Client-Name") String str2, @i("Garmin-Client-Version") String str3, @i("Garmin-Client-Platform") String str4, @i("Garmin-Client-Platform-Version") String str5, @i("Garmin-Client-Platform-Version-Revision") String str6, @i83.a RequestBody requestBody);
}
