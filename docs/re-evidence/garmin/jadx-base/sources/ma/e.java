package ma;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f117478a;

    public class a extends LinkedHashMap<Uri, byte[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f117479a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, int i14, float f14, boolean z14, int i15) {
            super(i14, f14, z14);
            this.f117479a = i15;
        }

        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
            return size() > this.f117479a;
        }
    }

    public e(int i14) {
        this.f117478a = new a(this, i14 + 1, 1.0f, false, i14);
    }
}
