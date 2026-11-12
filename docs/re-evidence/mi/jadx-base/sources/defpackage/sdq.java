package defpackage;

import android.net.Uri;
import com.miui.tsmclient.util.Constants;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class sdq<Data> implements d7g<Uri, Data> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<String> f33542b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", Constants.URI_SCHEME)));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d7g<e0b, Data> f33543a;

    public static class a implements e7g<Uri, InputStream> {
        @Override // defpackage.e7g
        public void c() {
        }

        @Override // defpackage.e7g
        public d7g<Uri, InputStream> d(iag iagVar) {
            return new sdq(iagVar.d(e0b.class, InputStream.class));
        }
    }

    public sdq(d7g<e0b, Data> d7gVar) {
        this.f33543a = d7gVar;
    }

    @Override // defpackage.d7g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d7g.a<Data> b(Uri uri, int i, int i2, cch cchVar) {
        return this.f33543a.b(new e0b(uri.toString()), i, i2, cchVar);
    }

    @Override // defpackage.d7g
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return f33542b.contains(uri.getScheme());
    }
}
