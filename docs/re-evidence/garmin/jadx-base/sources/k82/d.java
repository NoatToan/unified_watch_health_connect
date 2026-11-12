package k82;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.text.DecimalFormat;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lk82/d;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lk82/f;", "unitConversion", "<init>", "(Landroid/content/Context;Lk82/f;)V", "a", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final DecimalFormat f103395c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f103396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f103397b;

    static {
        new a(null);
        f103395c = new DecimalFormat("#,###,###");
    }

    public d(Context context, f fVar) {
        context.getClass();
        fVar.getClass();
        this.f103396a = context;
        this.f103397b = fVar;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk82/d$a;", "", "<init>", "()V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
