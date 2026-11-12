package defpackage;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class wta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap<Uri, byte[]> f38335a;

    public class a extends LinkedHashMap<Uri, byte[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f38336a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wta wtaVar, int i, float f, boolean z, int i2) {
            super(i, f, z);
            this.f38336a = i2;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
            return size() > this.f38336a;
        }
    }

    public wta(int i) {
        this.f38335a = new a(this, i + 1, 1.0f, false, i);
    }

    public byte[] a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return this.f38335a.get(uri);
    }

    public byte[] b(Uri uri, byte[] bArr) {
        return this.f38335a.put((Uri) rk1.e(uri), (byte[]) rk1.e(bArr));
    }

    public byte[] c(Uri uri) {
        return this.f38335a.remove(rk1.e(uri));
    }
}
