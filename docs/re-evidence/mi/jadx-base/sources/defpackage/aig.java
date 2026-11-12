package defpackage;

import android.util.SparseBooleanArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.uimanager.NativeKind;
import com.facebook.react.uimanager.e;
import com.facebook.react.views.view.ReactViewManager;

/* JADX INFO: loaded from: classes4.dex */
public class aig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f1057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m2m f1058b;
    public final SparseBooleanArray c = new SparseBooleanArray();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final oej f1059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f1060b;

        public a(oej oejVar, int i) {
            this.f1059a = oejVar;
            this.f1060b = i;
        }
    }

    public aig(e eVar, m2m m2mVar) {
        this.f1057a = eVar;
        this.f1058b = m2mVar;
    }

    public static void j(oej oejVar) {
        oejVar.removeAllNativeChildren();
    }

    public static boolean n(yej yejVar) {
        if (yejVar == null) {
            return true;
        }
        if (yejVar.f("collapsable") && !yejVar.a("collapsable", true)) {
            return false;
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = yejVar.f40101a.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            if (!qwq.a(yejVar.f40101a, readableMapKeySetIteratorKeySetIterator.nextKey())) {
                return false;
            }
        }
        return true;
    }

    public final void a(oej oejVar, oej oejVar2, int i) {
        sk1.a(oejVar2.getNativeKind() != NativeKind.PARENT);
        for (int i2 = 0; i2 < oejVar2.getChildCount(); i2++) {
            oej childAt = oejVar2.getChildAt(i2);
            sk1.a(childAt.getNativeParent() == null);
            int nativeChildCount = oejVar.getNativeChildCount();
            if (childAt.getNativeKind() == NativeKind.NONE) {
                d(oejVar, childAt, i);
            } else {
                b(oejVar, childAt, i);
            }
            i += oejVar.getNativeChildCount() - nativeChildCount;
        }
    }

    public final void b(oej oejVar, oej oejVar2, int i) {
        oejVar.addNativeChildAt(oejVar2, i);
        this.f1057a.B(oejVar.getReactTag(), null, new asq[]{new asq(oejVar2.getReactTag(), i)}, null, null);
        if (oejVar2.getNativeKind() != NativeKind.PARENT) {
            a(oejVar, oejVar2, i + 1);
        }
    }

    public final void c(oej oejVar, oej oejVar2, int i) {
        int nativeOffsetForChild = oejVar.getNativeOffsetForChild(oejVar.getChildAt(i));
        if (oejVar.getNativeKind() != NativeKind.PARENT) {
            a aVarS = s(oejVar, nativeOffsetForChild);
            if (aVarS == null) {
                return;
            }
            oej oejVar3 = aVarS.f1059a;
            nativeOffsetForChild = aVarS.f1060b;
            oejVar = oejVar3;
        }
        if (oejVar2.getNativeKind() != NativeKind.NONE) {
            b(oejVar, oejVar2, nativeOffsetForChild);
        } else {
            d(oejVar, oejVar2, nativeOffsetForChild);
        }
    }

    public final void d(oej oejVar, oej oejVar2, int i) {
        a(oejVar, oejVar2, i);
    }

    public final void e(oej oejVar) {
        int reactTag = oejVar.getReactTag();
        if (this.c.get(reactTag)) {
            return;
        }
        this.c.put(reactTag, true);
        int screenX = oejVar.getScreenX();
        int screenY = oejVar.getScreenY();
        for (oej parent = oejVar.getParent(); parent != null && parent.getNativeKind() != NativeKind.PARENT; parent = parent.getParent()) {
            if (!parent.isVirtual()) {
                screenX += Math.round(parent.getLayoutX());
                screenY += Math.round(parent.getLayoutY());
            }
        }
        f(oejVar, screenX, screenY);
    }

    public final void f(oej oejVar, int i, int i2) {
        if (oejVar.getNativeKind() != NativeKind.NONE && oejVar.getNativeParent() != null) {
            this.f1057a.L(oejVar.getLayoutParent().getReactTag(), oejVar.getReactTag(), i, i2, oejVar.getScreenWidth(), oejVar.getScreenHeight());
            return;
        }
        for (int i3 = 0; i3 < oejVar.getChildCount(); i3++) {
            oej childAt = oejVar.getChildAt(i3);
            int reactTag = childAt.getReactTag();
            if (!this.c.get(reactTag)) {
                this.c.put(reactTag, true);
                f(childAt, childAt.getScreenX() + i, childAt.getScreenY() + i2);
            }
        }
    }

    public void g(oej oejVar, g9p g9pVar, yej yejVar) {
        oejVar.setIsLayoutOnly(oejVar.getViewClass().equals(ReactViewManager.REACT_CLASS) && n(yejVar));
        if (oejVar.getNativeKind() != NativeKind.NONE) {
            this.f1057a.w(g9pVar, oejVar.getReactTag(), oejVar.getViewClass(), yejVar);
        }
    }

    public void h(oej oejVar) {
        if (oejVar.isLayoutOnly()) {
            r(oejVar, null);
        }
    }

    public void i(oej oejVar, int[] iArr, int[] iArr2, asq[] asqVarArr, int[] iArr3, int[] iArr4) {
        boolean z;
        for (int i : iArr2) {
            int i2 = 0;
            while (true) {
                if (i2 >= iArr3.length) {
                    z = false;
                    break;
                } else {
                    if (iArr3[i2] == i) {
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            q(this.f1058b.c(i), z);
        }
        for (asq asqVar : asqVarArr) {
            c(oejVar, this.f1058b.c(asqVar.f3422a), asqVar.f3423b);
        }
    }

    public void k(oej oejVar, ReadableArray readableArray) {
        for (int i = 0; i < readableArray.size(); i++) {
            c(oejVar, this.f1058b.c(readableArray.getInt(i)), i);
        }
    }

    public void l(oej oejVar) {
        e(oejVar);
    }

    public void m(oej oejVar, String str, yej yejVar) {
        if (oejVar.isLayoutOnly() && !n(yejVar)) {
            r(oejVar, yejVar);
        } else {
            if (oejVar.isLayoutOnly()) {
                return;
            }
            this.f1057a.M(oejVar.getReactTag(), str, yejVar);
        }
    }

    public void o() {
        this.c.clear();
    }

    public void p(oej oejVar) {
        this.c.clear();
    }

    public final void q(oej oejVar, boolean z) {
        if (oejVar.getNativeKind() != NativeKind.PARENT) {
            for (int childCount = oejVar.getChildCount() - 1; childCount >= 0; childCount--) {
                q(oejVar.getChildAt(childCount), z);
            }
        }
        oej nativeParent = oejVar.getNativeParent();
        if (nativeParent != null) {
            int iIndexOfNativeChild = nativeParent.indexOfNativeChild(oejVar);
            nativeParent.removeNativeChildAt(iIndexOfNativeChild);
            this.f1057a.B(nativeParent.getReactTag(), new int[]{iIndexOfNativeChild}, null, z ? new int[]{oejVar.getReactTag()} : null, z ? new int[]{iIndexOfNativeChild} : null);
        }
    }

    public final void r(oej oejVar, yej yejVar) {
        oej parent = oejVar.getParent();
        if (parent == null) {
            oejVar.setIsLayoutOnly(false);
            return;
        }
        int iIndexOf = parent.indexOf(oejVar);
        parent.removeChildAt(iIndexOf);
        q(oejVar, false);
        oejVar.setIsLayoutOnly(false);
        this.f1057a.w(oejVar.getThemedContext(), oejVar.getReactTag(), oejVar.getViewClass(), yejVar);
        parent.addChildAt(oejVar, iIndexOf);
        c(parent, oejVar, iIndexOf);
        for (int i = 0; i < oejVar.getChildCount(); i++) {
            c(oejVar, oejVar.getChildAt(i), i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Transitioning LayoutOnlyView - tag: ");
        sb.append(oejVar.getReactTag());
        sb.append(" - rootTag: ");
        sb.append(oejVar.getRootTag());
        sb.append(" - hasProps: ");
        sb.append(yejVar != null);
        sb.append(" - tagsWithLayout.size: ");
        sb.append(this.c.size());
        sk1.a(this.c.size() == 0);
        e(oejVar);
        for (int i2 = 0; i2 < oejVar.getChildCount(); i2++) {
            e(oejVar.getChildAt(i2));
        }
        this.c.clear();
    }

    public final a s(oej oejVar, int i) {
        while (oejVar.getNativeKind() != NativeKind.PARENT) {
            oej parent = oejVar.getParent();
            if (parent == null) {
                return null;
            }
            i = i + (oejVar.getNativeKind() == NativeKind.LEAF ? 1 : 0) + parent.getNativeOffsetForChild(oejVar);
            oejVar = parent;
        }
        return new a(oejVar, i);
    }
}
