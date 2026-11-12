package fs;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import p005kotlin.Metadata;
import p3.a2;
import p3.c2;
import p3.p0;
import p3.z1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lfs/f;", "", "", TtmlNode.ATTR_ID, "", "Lfs/g;", "urlsModels", "Lfs/b;", NotificationConstants.KEY_DATA_MIME_TYPE, "Ln4/c;", "initialOffset", "", "initialUrlSelected", "", "initialScale", "initialRotation", "<init>", "(Ljava/lang/String;Ljava/util/List;Lfs/b;JIFFLkotlin/jvm/internal/j;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<g> f73387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f73388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a2 f73389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c2 f73390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z1 f73391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z1 f73392g;

    private f(String str, List<g> list, b bVar, long j8, int i14, float f14, float f15) {
        str.getClass();
        list.getClass();
        this.f73386a = str;
        this.f73387b = list;
        this.f73388c = bVar;
        this.f73389d = new a2(i14);
        this.f73390e = p0.n(n4.c.a(j8));
        this.f73391f = new z1(f14);
        this.f73392g = new z1(f15);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a() {
        return ((n4.c) this.f73390e.getF182175a()).f123544a;
    }

    public /* synthetic */ f(String str, List list, b bVar, long j8, int i14, float f14, float f15, p005kotlin.jvm.internal.j jVar) {
        this(str, list, bVar, j8, i14, f14, f15);
    }
}
