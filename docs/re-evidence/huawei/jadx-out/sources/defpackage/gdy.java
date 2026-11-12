package defpackage;

import android.os.Bundle;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import com.google.gson.annotations.SerializedName;
import com.huawei.haf.common.os.FileUtils;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: loaded from: classes7.dex */
public class gdy implements Serializable {
    private static final long serialVersionUID = 2010112020200105L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("description")
    private String f34959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("duration")
    private long f34960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("date")
    private String f34961c;

    @SerializedName("category")
    private String d;

    @SerializedName("deeplink")
    private String e;

    @SerializedName("lastPosition")
    private long f;

    @SerializedName("iconUrl")
    private String g;

    @SerializedName("mediaId")
    private String h;

    @SerializedName("mediaUrl")
    private String i;

    @SerializedName("minibarDeeplink")
    private String j;

    @SerializedName("title")
    private String m;

    @SerializedName("subtitle")
    private String o;

    public String o() {
        return this.m;
    }

    public void j(String str) {
        this.m = str;
    }

    public String h() {
        return this.h;
    }

    public void f(String str) {
        this.h = str;
    }

    public String k() {
        return this.o;
    }

    public void h(String str) {
        this.o = str;
    }

    public String b() {
        return this.f34959a;
    }

    public void e(String str) {
        this.f34959a = str;
    }

    public String i() {
        return this.i;
    }

    public void g(String str) {
        this.i = str;
    }

    public String g() {
        return this.g;
    }

    public void b(String str) {
        this.g = str;
    }

    public String d() {
        return this.f34961c;
    }

    public void d(String str) {
        this.f34961c = str;
    }

    public long a() {
        return this.f34960b;
    }

    public void e(long j) {
        this.f34960b = j;
    }

    public long f() {
        return this.f;
    }

    public void a(long j) {
        this.f = j;
    }

    public void c(String str) {
        this.e = str;
    }

    public String e() {
        return this.e;
    }

    public String j() {
        return this.j;
    }

    public void i(String str) {
        this.j = str;
    }

    public void a(String str) {
        this.d = str;
    }

    public String c() {
        return this.d;
    }

    public int hashCode() {
        return this.h.hashCode();
    }

    public boolean equals(Object obj) {
        String str;
        if (!(obj instanceof gdy) || (str = this.h) == null || this.i == null) {
            return false;
        }
        gdy gdyVar = (gdy) obj;
        return str.equals(gdyVar.h()) && this.i.equals(gdyVar.i());
    }

    public String toString() {
        return "{\"title\":\"" + this.m + "\",\"mediaId\":\"" + this.h + "\",\"subtitle\":\"" + this.o + "\",\"description\":\"" + this.f34959a + "\",\"duration\":" + this.f34960b + ",\"mediaUrl\":\"" + this.i + "\",\"iconUrl\":\"" + this.g + "\",\"date\":\"" + this.f34961c + "\",\"lastPosition\":\"" + this.f + "\",\"deeplink\":\"" + this.e + "\",\"minibarDeeplink\":\"" + this.j + "\",\"category\":\"" + this.d + "\"}";
    }

    public MediaItem n() {
        String strK;
        Bundle bundle = new Bundle();
        String str = this.i;
        if (str != null) {
            strK = str.startsWith("/") ? k(this.i) : this.i;
        } else {
            LogUtil.b("AudioItem", "mediaId:", h(), " mediaUrl is null");
            strK = "";
        }
        bundle.putString("title", o());
        bundle.putString("mediaId", h());
        bundle.putString("subtitle", k());
        bundle.putString("description", b());
        bundle.putLong("duration", a());
        bundle.putString("mediaUrl", strK);
        bundle.putString("iconUrl", g());
        bundle.putString("date", d());
        bundle.putString("deeplink", e());
        bundle.putString("minibarDeeplink", j());
        bundle.putString("category", c());
        return new MediaItem.Builder().setUri(strK).setMediaId(h()).setMediaMetadata(new MediaMetadata.Builder().setExtras(bundle).build()).build();
    }

    private String k(String str) {
        int iIndexOf = str.indexOf("?");
        if (iIndexOf == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iIndexOf);
        File file = new File(strSubstring);
        if (!file.exists()) {
            try {
                FileUtils.e(new File(str), file);
                return strSubstring;
            } catch (IOException e) {
                ReleaseLogUtil.b("AudioItem", e);
            }
        }
        return strSubstring;
    }

    public static gdy d(MediaItem mediaItem, final long j) {
        final gdy gdyVar = new gdy();
        Optional.ofNullable(mediaItem).map(new Function() { // from class: geb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((MediaItem) obj).mediaMetadata;
            }
        }).map(new Function() { // from class: gee
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((MediaMetadata) obj).extras;
            }
        }).ifPresent(new Consumer() { // from class: ged
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                gdy.d(this.f34965b, j, (Bundle) obj);
            }
        });
        return gdyVar;
    }

    static /* synthetic */ void d(gdy gdyVar, long j, Bundle bundle) {
        gdyVar.j(bundle.getString("title"));
        gdyVar.f(bundle.getString("mediaId"));
        gdyVar.h(bundle.getString("subtitle"));
        gdyVar.e(bundle.getString("description"));
        gdyVar.e(bundle.getLong("duration"));
        gdyVar.g(bundle.getString("mediaUrl"));
        gdyVar.b(bundle.getString("iconUrl"));
        gdyVar.d(bundle.getString("date"));
        gdyVar.a(j);
        gdyVar.c(bundle.getString("deeplink"));
        gdyVar.i(bundle.getString("minibarDeeplink"));
        gdyVar.a(bundle.getString("category"));
    }
}
