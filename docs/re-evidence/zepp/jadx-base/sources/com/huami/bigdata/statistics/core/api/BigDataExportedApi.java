package com.huami.bigdata.statistics.core.api;

import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import com.huami.bigdata.statistics.core.entity.ExportEntity;
import com.huami.http.ConverterKt;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitKtxKt;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0017B%\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002J5\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/huami/bigdata/statistics/core/api/BigDataExportedApi;", "Lcom/huami/bigdata/statistics/core/api/IBigDataExportedApi;", "Lcom/huami/http/HttpKit;", "", "", "a", ExifInterface.GPS_DIRECTION_TRUE, "exportKey", "date", "Ljava/lang/Class;", "clazz", "getData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "Ljava/lang/String;", "userId", "b", "appName", "", "c", "Z", "isFriend", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Companion", "core_release"}, k = 1, mv = {1, 5, 1})
public final class BigDataExportedApi implements IBigDataExportedApi, HttpKit {

    @NotNull
    private static final String d = "BigDataExportedApi";

    @NotNull
    private static final String e = "yyyy-MM-dd";

    @NotNull
    private static final String f = "Asia/Shanghai";
    private static final int g = 1000;

    @NotNull
    private static final String h = "users/%s/bigDataExported/%s?exportTime=%d";

    @NotNull
    private static final String i = "friend/common/datas/%s/blosData?sub=%s&exportKey=%s&exportTime=%d";

    @NotNull
    private static final String j = "originalAppName";

    @NotNull
    private static final String k = "WEEK";

    @NotNull
    private static final String l = "MONTH";

    @NotNull
    private static final String m = "YEAR";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final String appName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isFriend;

    public BigDataExportedApi(@NotNull String str, @Nullable String str2, boolean z) {
        this.userId = str;
        this.appName = str2;
        this.isFriend = z;
    }

    private final long a(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(f));
        return simpleDateFormat.parse(str).getTime() / ((long) 1000);
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // com.huami.bigdata.statistics.core.api.IBigDataExportedApi
    @Nullable
    public <T> T getData(@NotNull String exportKey, @NotNull String date, @NotNull Class<T> clazz) throws Exception {
        String str;
        long jA = a(date);
        boolean z = true;
        if (this.isFriend) {
            String str2 = k;
            if (!StringsKt__StringsKt.contains$default((CharSequence) exportKey, (CharSequence) k, false, 2, (Object) null)) {
                if (StringsKt__StringsKt.contains$default((CharSequence) exportKey, (CharSequence) l, false, 2, (Object) null)) {
                    str2 = l;
                } else {
                    if (!StringsKt__StringsKt.contains$default((CharSequence) exportKey, (CharSequence) m, false, 2, (Object) null)) {
                        throw new Exception("exportKey invalid " + exportKey);
                    }
                    str2 = m;
                }
            }
            str = String.format(i, Arrays.copyOf(new Object[]{this.userId, str2, exportKey, Long.valueOf(jA), this.appName}, 5));
        } else {
            str = String.format(h, Arrays.copyOf(new Object[]{this.userId, exportKey, Long.valueOf(jA), this.appName}, 4));
        }
        String str3 = str;
        HashMap map = new HashMap();
        String str4 = this.appName;
        if (str4 != null) {
            map.put(j, str4);
        }
        Unit unit = Unit.INSTANCE;
        Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, str3, map, null, 4, null);
        String strString = responseHttpGet$default.body().string();
        ConverterKt.checkToken(responseHttpGet$default, strString);
        if (strString != null && strString.length() != 0) {
            z = false;
        }
        if (z) {
            return null;
        }
        Gson gson = new Gson();
        return (T) gson.fromJson(((ExportEntity) gson.fromJson(strString, (Class) ExportEntity.class)).getDetails(), (Class) clazz);
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }

    public /* synthetic */ BigDataExportedApi(String str, String str2, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? false : z);
    }
}
