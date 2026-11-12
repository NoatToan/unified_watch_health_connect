package y4;

import am.j;
import b5.z;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ly4/d;", "", "Lb5/z;", TtmlNode.ATTR_ID, "", "uptimeMillis", "Ln4/c;", ModelSourceWrapper.POSITION, "", "pressed", "", "pressure", "previousUptimeMillis", "previousPosition", "previousPressed", "<init>", "(JJJZFJJZLkotlin/jvm/internal/j;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f194382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f194383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f194384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f194385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f194386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f194387f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f194388g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f194389h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f194390i;

    private d(long j8, long j14, long j15, boolean z14, float f14, long j16, long j17, boolean z15) {
        this.f194382a = j8;
        this.f194383b = j14;
        this.f194384c = j15;
        this.f194385d = z14;
        this.f194386e = f14;
        this.f194387f = j16;
        this.f194388g = j17;
        this.f194389h = z15;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("IndirectPointerInputChange(id=");
        sb3.append((Object) z.c(this.f194382a));
        sb3.append(", uptimeMillis=");
        sb3.append(this.f194383b);
        sb3.append(", position=");
        sb3.append((Object) n4.c.l(this.f194384c));
        sb3.append(", pressed=");
        sb3.append(this.f194385d);
        sb3.append(", pressure=");
        sb3.append(this.f194386e);
        sb3.append(", previousUptimeMillis=");
        sb3.append(this.f194387f);
        sb3.append(", previousPosition=");
        sb3.append((Object) n4.c.l(this.f194388g));
        sb3.append(", previousPressed=");
        sb3.append(this.f194389h);
        sb3.append(", isConsumed=");
        return j.t(sb3, this.f194390i, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public /* synthetic */ d(long j8, long j14, long j15, boolean z14, float f14, long j16, long j17, boolean z15, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, j15, z14, f14, j16, j17, z15);
    }
}
