package k40;

import com.google.android.gms.maps.model.UrlTileProvider;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk40/g;", "Lcom/google/android/gms/maps/model/UrlTileProvider;", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends UrlTileProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f102843a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str) {
        super(256, 256);
        this.f102843a = str;
    }

    @Override // com.google.android.gms.maps.model.UrlTileProvider
    public final URL getTileUrl(int i14, int i15, int i16) {
        if (i16 <= 8) {
            return null;
        }
        try {
            String str = this.f102843a + "/%d/%d/%d.png";
            x0 x0Var = x0.f105818a;
            return new URL(String.format(Locale.US, str, Arrays.copyOf(new Object[]{Integer.valueOf(i16), Integer.valueOf(i14), Integer.valueOf(i15)}, 3)));
        } catch (MalformedURLException unused) {
            return null;
        }
    }
}
