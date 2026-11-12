package x1;

import ch.qos.logback.core.CoreConstants;
import com.garmin.android.gncs.settings.GNCSOptOutSettingsFragment;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import o13.z;
import o4.d0;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lx1/e;", "", "Lo4/d0;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, GNCSOptOutSettingsFragment.EXTRA_TEXT_COLOR, "iconColor", GNCSOptOutSettingsFragment.EXTRA_DISABLED_TEXT_COLOR, "disabledIconColor", "<init>", "(JJJJJLkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f188337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f188338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f188339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f188340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f188341e;

    private e(long j8, long j14, long j15, long j16, long j17) {
        this.f188337a = j8;
        this.f188338b = j14;
        this.f188339c = j15;
        this.f188340d = j16;
        this.f188341e = j17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return d0.d(this.f188337a, eVar.f188337a) && d0.d(this.f188338b, eVar.f188338b) && d0.d(this.f188339c, eVar.f188339c) && d0.d(this.f188340d, eVar.f188340d) && d0.d(this.f188341e, eVar.f188341e);
    }

    public final int hashCode() {
        d0.a aVar = d0.f128823b;
        z.a aVar2 = z.f128618b;
        return Long.hashCode(this.f188341e) + q6.f.e(q6.f.e(q6.f.e(Long.hashCode(this.f188337a) * 31, 31, this.f188338b), 31, this.f188339c), 31, this.f188340d);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ContextMenuColors(backgroundColor=");
        q2.m(this.f188337a, ", textColor=", sb3);
        q2.m(this.f188338b, ", iconColor=", sb3);
        q2.m(this.f188339c, ", disabledTextColor=", sb3);
        q2.m(this.f188340d, ", disabledIconColor=", sb3);
        sb3.append((Object) d0.j(this.f188341e));
        sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb3.toString();
    }

    public /* synthetic */ e(long j8, long j14, long j15, long j16, long j17, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, j15, j16, j17);
    }
}
