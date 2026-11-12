package kotlin;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Li5/i;", "Li5/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityManager f91204a;

    static {
        new a(null);
    }

    public i(Context context) {
        Object systemService = context.getSystemService("accessibility");
        systemService.getClass();
        this.f91204a = (AccessibilityManager) systemService;
    }

    @Override // kotlin.h
    public final long a(long j8, boolean z14) {
        if (j8 >= 2147483647L) {
            return j8;
        }
        int i14 = z14 ? 7 : 3;
        int i15 = Build.VERSION.SDK_INT;
        AccessibilityManager accessibilityManager = this.f91204a;
        if (i15 >= 29) {
            z0.f91667a.getClass();
            int iA = z0.a(accessibilityManager, (int) j8, i14);
            if (iA != Integer.MAX_VALUE) {
                return iA;
            }
        } else if (!z14 || !accessibilityManager.isTouchExplorationEnabled()) {
            return j8;
        }
        return Long.MAX_VALUE;
    }

    @p005kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Li5/i$a;", "", "<init>", "()V", "", "FlagContentIcons", "I", "FlagContentText", "FlagContentControls", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
