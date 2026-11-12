package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.upstream.d;

/* JADX INFO: loaded from: classes2.dex */
public class vlf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pt5 f37005a = new pt5();

    public static k a(String str, Context context) {
        Uri uri = Uri.parse(str);
        wlq.j0(uri);
        return new HlsMediaSource.Factory(new d(context, wlq.h0(context, "Exo2"), new pt5())).b(uri);
    }
}
