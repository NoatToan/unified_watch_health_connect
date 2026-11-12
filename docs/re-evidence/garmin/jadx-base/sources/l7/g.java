package l7;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f110588a;

    public static class a extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f110589a;

        public a(g gVar) {
            this.f110589a = gVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i14) {
            f fVarB = this.f110589a.b(i14);
            if (fVarB == null) {
                return null;
            }
            return fVarB.f110563a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i14) {
            this.f110589a.getClass();
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo findFocus(int i14) {
            f fVarC = this.f110589a.c(i14);
            if (fVarC == null) {
                return null;
            }
            return fVarC.f110563a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final boolean performAction(int i14, int i15, Bundle bundle) {
            return this.f110589a.d(i14, i15, bundle);
        }
    }

    public static class b extends a {
        public b(g gVar) {
            super(gVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final void addExtraDataToAccessibilityNodeInfo(int i14, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f110589a.a(i14, f.v(accessibilityNodeInfo), str, bundle);
        }
    }

    public g() {
        this.f110588a = new b(this);
    }

    public void a(int i14, f fVar, String str, Bundle bundle) {
    }

    public f b(int i14) {
        return null;
    }

    public f c(int i14) {
        return null;
    }

    public boolean d(int i14, int i15, Bundle bundle) {
        return false;
    }

    public g(Object obj) {
        this.f110588a = obj;
    }
}
