package vc0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lvc0/g;", "Lei2/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lsd2/f;", "deviceDatabaseRecord", "<init>", "(Landroid/content/Context;Lsd2/f;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends ei2.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sd2.f f176985c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, sd2.f fVar) {
        super(context);
        context.getClass();
        fVar.getClass();
        this.f176985c = fVar;
    }

    @Override // ei2.a
    public final int r() {
        return ((Number) ge1.b.W(t13.h.f161748a, new f((b31.a) KoinJavaComponent.get$default(b31.a.class, null, null, 6, null), this, null))).intValue();
    }

    @Override // ei2.a
    public final boolean s() {
        return r() == 0;
    }
}
