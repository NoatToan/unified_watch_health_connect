package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface nl8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nl8 f28034a = new nl8() { // from class: ml8
        @Override // defpackage.nl8
        public final il8[] c() {
            return nl8.a();
        }
    };

    static /* synthetic */ il8[] a() {
        return new il8[0];
    }

    default il8[] b(Uri uri, Map<String, List<String>> map) {
        return c();
    }

    il8[] c();
}
