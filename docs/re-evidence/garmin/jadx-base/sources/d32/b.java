package d32;

import android.content.Context;
import androidx.appcompat.app.e;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ld32/b;", "Landroidx/appcompat/app/e$a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class b extends e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f57388a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile b f57389b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        context.getClass();
    }

    @Override // androidx.appcompat.app.e.a
    public final e create() {
        synchronized (c.class) {
            c.f57390a.getClass();
            c.f57391b = true;
            Unit unit = Unit.INSTANCE;
        }
        e eVarCreate = super.create();
        eVarCreate.getClass();
        eVarCreate.setOnDismissListener(new d32.a(0));
        return eVarCreate;
    }

    @Override // androidx.appcompat.app.e.a
    public final e show() {
        synchronized (c.class) {
            c.f57390a.getClass();
            if (c.f57391b) {
                return null;
            }
            Unit unit = Unit.INSTANCE;
            return super.show();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ld32/b$a;", "", "<init>", "()V", "Ld32/b;", "mInstance", "Ld32/b;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
