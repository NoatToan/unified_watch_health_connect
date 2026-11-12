package vi;

import android.content.ContentResolver;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f178424f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f178425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f178426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi.b f178427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ContentResolver f178428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<ImageHeaderParser> f178429e;

    public e(List<ImageHeaderParser> list, a aVar, d dVar, xi.b bVar, ContentResolver contentResolver) {
        this.f178425a = aVar;
        this.f178426b = dVar;
        this.f178427c = bVar;
        this.f178428d = contentResolver;
        this.f178429e = list;
    }

    public e(List<ImageHeaderParser> list, d dVar, xi.b bVar, ContentResolver contentResolver) {
        this(list, f178424f, dVar, bVar, contentResolver);
    }
}
