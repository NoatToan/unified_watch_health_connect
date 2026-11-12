package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class n80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f27634a;

    public static class a extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n80 f27635a;

        public a(n80 n80Var) {
            this.f27635a = n80Var;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            m80 m80VarB = this.f27635a.b(i);
            if (m80VarB == null) {
                return null;
            }
            return m80VarB.O0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<m80> listC = this.f27635a.c(str, i);
            if (listC == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listC.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(listC.get(i2).O0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            m80 m80VarD = this.f27635a.d(i);
            if (m80VarD == null) {
                return null;
            }
            return m80VarD.O0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f27635a.f(i, i2, bundle);
        }
    }

    @RequiresApi(26)
    public static class b extends a {
        public b(n80 n80Var) {
            super(n80Var);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f27635a.a(i, m80.P0(accessibilityNodeInfo), str, bundle);
        }
    }

    public n80() {
        this.f27634a = new b(this);
    }

    public void a(int i, m80 m80Var, String str, Bundle bundle) {
    }

    public m80 b(int i) {
        return null;
    }

    public List<m80> c(String str, int i) {
        return null;
    }

    public m80 d(int i) {
        return null;
    }

    public Object e() {
        return this.f27634a;
    }

    public boolean f(int i, int i2, Bundle bundle) {
        return false;
    }

    public n80(Object obj) {
        this.f27634a = obj;
    }
}
