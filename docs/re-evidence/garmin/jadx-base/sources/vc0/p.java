package vc0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lvc0/p;", "Lei2/h;", "Ldi2/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p extends ei2.h implements di2.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f177001c;

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f177001c = gt2.b.f79005a.h("DSL-PreferredActivityTextTransform");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context) {
        super(context);
        context.getClass();
    }

    @Override // di2.b
    public final String b(String str) {
        rd2.j jVar = rd2.f.a().f152045a;
        f12.l.f68084a.getClass();
        long jS4 = f12.l.a.a().s4();
        jVar.getClass();
        sd2.f fVarI = rd2.j.i(jS4, null);
        if (fVarI == null) {
            f177001c.error("Did not find device record.");
            return "";
        }
        x0 x0Var = x0.f105818a;
        String displayName = fVarI.getDisplayName();
        return String.format(str, Arrays.copyOf(new Object[]{(displayName == null || d53.w.J(displayName)) ? fVarI.getProductDisplayName() : fVarI.getDisplayName()}, 1));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvc0/p$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "Glog", "Lorg/slf4j/Logger;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
