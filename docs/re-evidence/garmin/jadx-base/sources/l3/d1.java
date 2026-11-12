package l3;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import java.util.List;
import p005kotlin.Metadata;
import p3.x3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\tB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Ll3/d1;", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "Lp3/x3;", "", "listenToTouchExplorationState", "listenToSwitchAccessState", "listenToVoiceAccessState", "<init>", "(ZZZ)V", "a", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d1 implements AccessibilityManager.AccessibilityStateChangeListener, x3<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f109212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f109213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p3.c2 f109214c = p3.p0.n(Boolean.FALSE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f109215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f109216e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll3/d1$a;", "", "<init>", "()V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        static {
            new a();
        }

        private a() {
        }

        public static final void a(AccessibilityManager accessibilityManager, AccessibilityManager$AccessibilityServicesStateChangeListener accessibilityManager$AccessibilityServicesStateChangeListener) {
            accessibilityManager.addAccessibilityServicesStateChangeListener(accessibilityManager$AccessibilityServicesStateChangeListener);
        }

        public static final void b(AccessibilityManager accessibilityManager, AccessibilityManager$AccessibilityServicesStateChangeListener accessibilityManager$AccessibilityServicesStateChangeListener) {
            accessibilityManager.removeAccessibilityServicesStateChangeListener(accessibilityManager$AccessibilityServicesStateChangeListener);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"l3/d1$b", "Landroid/view/accessibility/AccessibilityManager$AccessibilityServicesStateChangeListener;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements AccessibilityManager$AccessibilityServicesStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p3.c2 f109217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p3.c2 f109218b;

        public b() {
            Boolean bool = Boolean.FALSE;
            this.f109217a = p3.p0.n(bool);
            this.f109218b = p3.p0.n(bool);
        }

        public final void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager) {
            d1.this.getClass();
            this.f109217a.setValue(Boolean.valueOf(d1.a(accessibilityManager)));
            d1.this.getClass();
            this.f109218b.setValue(Boolean.valueOf(d1.c(accessibilityManager)));
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"l3/d1$c", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p3.c2 f109220a = p3.p0.n(Boolean.FALSE);

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public final void onTouchExplorationStateChanged(boolean z14) {
            this.f109220a.setValue(Boolean.valueOf(z14));
        }
    }

    public d1(boolean z14, boolean z15, boolean z16) {
        this.f109212a = z15;
        this.f109213b = z16;
        b bVar = null;
        this.f109215d = z14 ? new c() : null;
        if ((z15 || z16) && Build.VERSION.SDK_INT >= 33) {
            bVar = new b();
        }
        this.f109216e = bVar;
    }

    public static boolean a(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i14 = 0; i14 < size; i14++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i14).getSettingsActivityName();
            if (settingsActivityName != null && d53.w.z(settingsActivityName, "SwitchAccess", true)) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i14 = 0; i14 < size; i14++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i14).getSettingsActivityName();
            if (settingsActivityName != null && d53.w.z(settingsActivityName, "VoiceAccess", true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p3.x3
    /* JADX INFO: renamed from: getValue */
    public final Boolean getF182175a() {
        boolean z14;
        if (((Boolean) this.f109214c.getF182175a()).booleanValue()) {
            z14 = true;
            c cVar = this.f109215d;
            if (cVar == null || !((Boolean) cVar.f109220a.getF182175a()).booleanValue()) {
                boolean z15 = this.f109212a;
                b bVar = this.f109216e;
                if ((!z15 || bVar == null || !((Boolean) bVar.f109217a.getF182175a()).booleanValue()) && (!this.f109213b || bVar == null || !((Boolean) bVar.f109218b.getF182175a()).booleanValue())) {
                    z14 = false;
                }
            }
        } else {
            z14 = false;
        }
        return Boolean.valueOf(z14);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z14) {
        this.f109214c.setValue(Boolean.valueOf(z14));
    }
}
