package o2;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import org.koin.core.instance.InstanceFactory;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.j0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lo2/d;", "", "", "Lo2/b;", "components", "<init>", "(Ljava/util/List;)V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f128623b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f128624c = new d(j0.f134944a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<b> f128625a;

    /* JADX WARN: Multi-variable type inference failed */
    public d(List<? extends b> list) {
        this.f128625a = list;
    }

    public final String toString() {
        return c.c(CoreConstants.RIGHT_PARENTHESIS_CHAR, "TextContextMenuData(components=", i6.b.b(this.f128625a, InstanceFactory.ERROR_SEPARATOR, null, 56));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo2/d$a;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
