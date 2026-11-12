package n5;

import android.content.res.Resources;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.extension.compose.style.standard.StandardStyleConfigurationState;
import ds.e0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Ln5/b;", "", "<init>", "()V", "b", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<C2320b, WeakReference<a>> f123713a = new HashMap<>();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln5/b$a;", "", "Lu4/d;", "imageVector", "", "configFlags", "<init>", "(Lu4/d;I)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u4.d f123714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f123715b;

        public a(u4.d dVar, int i14) {
            this.f123714a = dVar;
            this.f123715b = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.g(this.f123714a, aVar.f123714a) && this.f123715b == aVar.f123715b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f123715b) + (this.f123714a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("ImageVectorEntry(imageVector=");
            sb3.append(this.f123714a);
            sb3.append(", configFlags=");
            return e0.j(sb3, this.f123715b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    /* JADX INFO: renamed from: n5.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ln5/b$b;", "", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", StandardStyleConfigurationState.CONFIG_THEME, "", TtmlNode.ATTR_ID, "<init>", "(Landroid/content/res/Resources$Theme;I)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class C2320b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources.Theme f123716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f123717b;

        public C2320b(Resources.Theme theme, int i14) {
            this.f123716a = theme;
            this.f123717b = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2320b)) {
                return false;
            }
            C2320b c2320b = (C2320b) obj;
            return s.g(this.f123716a, c2320b.f123716a) && this.f123717b == c2320b.f123717b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f123717b) + (this.f123716a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("Key(theme=");
            sb3.append(this.f123716a);
            sb3.append(", id=");
            return e0.j(sb3, this.f123717b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }
}
