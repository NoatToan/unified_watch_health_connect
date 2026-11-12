package defpackage;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.th3rdwave.safeareacontext.SafeAreaViewEdges;
import com.th3rdwave.safeareacontext.SafeAreaViewMode;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes6.dex */
public class a9l extends cbe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z8l f802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f803b;
    public float[] c;
    public boolean d = false;

    public a9l() {
        int[] iArr = qwq.f31918b;
        this.f803b = new float[iArr.length];
        this.c = new float[iArr.length];
        for (int i = 0; i < qwq.f31918b.length; i++) {
            this.f803b[i] = Float.NaN;
            this.c[i] = Float.NaN;
        }
    }

    public final void a(SafeAreaViewMode safeAreaViewMode) {
        if (safeAreaViewMode == SafeAreaViewMode.PADDING) {
            super.setPadding(1, this.f803b[1]);
            super.setPadding(2, this.f803b[1]);
            super.setPadding(3, this.f803b[3]);
            super.setPadding(0, this.f803b[0]);
            return;
        }
        super.setMargin(1, this.c[1]);
        super.setMargin(2, this.c[1]);
        super.setMargin(3, this.c[3]);
        super.setMargin(0, this.c[0]);
    }

    public final void b() {
        float f;
        float f2;
        float f3;
        z8l z8lVar = this.f802a;
        if (z8lVar == null) {
            return;
        }
        SafeAreaViewMode safeAreaViewModeC = z8lVar.c();
        SafeAreaViewMode safeAreaViewMode = SafeAreaViewMode.PADDING;
        float[] fArr = safeAreaViewModeC == safeAreaViewMode ? this.f803b : this.c;
        float f4 = fArr[8];
        if (Float.isNaN(f4)) {
            f4 = 0.0f;
            f = 0.0f;
            f2 = 0.0f;
            f3 = 0.0f;
        } else {
            f = f4;
            f2 = f;
            f3 = f2;
        }
        float f5 = fArr[7];
        if (!Float.isNaN(f5)) {
            f4 = f5;
            f2 = f4;
        }
        float f6 = fArr[6];
        if (!Float.isNaN(f6)) {
            f = f6;
            f3 = f;
        }
        float f7 = fArr[1];
        if (!Float.isNaN(f7)) {
            f4 = f7;
        }
        float f8 = fArr[2];
        if (!Float.isNaN(f8)) {
            f = f8;
        }
        float f9 = fArr[3];
        if (!Float.isNaN(f9)) {
            f2 = f9;
        }
        float f10 = fArr[0];
        if (!Float.isNaN(f10)) {
            f3 = f10;
        }
        float fC = exh.c(f4);
        float fC2 = exh.c(f);
        float fC3 = exh.c(f2);
        float fC4 = exh.c(f3);
        EnumSet<SafeAreaViewEdges> enumSetA = this.f802a.a();
        f08 f08VarB = this.f802a.b();
        float f11 = enumSetA.contains(SafeAreaViewEdges.TOP) ? f08VarB.f17254a : 0.0f;
        float f12 = enumSetA.contains(SafeAreaViewEdges.RIGHT) ? f08VarB.f17255b : 0.0f;
        float f13 = enumSetA.contains(SafeAreaViewEdges.BOTTOM) ? f08VarB.c : 0.0f;
        float f14 = enumSetA.contains(SafeAreaViewEdges.LEFT) ? f08VarB.d : 0.0f;
        if (this.f802a.c() == safeAreaViewMode) {
            super.setPadding(1, f11 + fC);
            super.setPadding(2, f12 + fC2);
            super.setPadding(3, f13 + fC3);
            super.setPadding(0, f14 + fC4);
            return;
        }
        super.setMargin(1, f11 + fC);
        super.setMargin(2, f12 + fC2);
        super.setMargin(3, f13 + fC3);
        super.setMargin(0, f14 + fC4);
    }

    @Override // defpackage.pej, defpackage.oej
    public void onBeforeLayout(aig aigVar) {
        if (this.d) {
            this.d = false;
            b();
        }
    }

    @Override // defpackage.pej, defpackage.oej
    public void setLocalData(Object obj) {
        if (obj instanceof z8l) {
            z8l z8lVar = (z8l) obj;
            z8l z8lVar2 = this.f802a;
            if (z8lVar2 != null && z8lVar2.c() != z8lVar.c()) {
                a(this.f802a.c());
            }
            this.f802a = z8lVar;
            this.d = false;
            b();
        }
    }

    @Override // defpackage.cbe
    @jej(names = {"margin", "marginVertical", "marginHorizontal", "marginStart", "marginEnd", "marginTop", "marginBottom", "marginLeft", "marginRight"})
    public void setMargins(int i, Dynamic dynamic) {
        this.c[qwq.f31918b[i]] = dynamic.getType() == ReadableType.Number ? (float) dynamic.asDouble() : Float.NaN;
        super.setMargins(i, dynamic);
        this.d = true;
    }

    @Override // defpackage.cbe
    @jej(names = {"padding", "paddingVertical", "paddingHorizontal", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight"})
    public void setPaddings(int i, Dynamic dynamic) {
        this.f803b[qwq.f31918b[i]] = dynamic.getType() == ReadableType.Number ? (float) dynamic.asDouble() : Float.NaN;
        super.setPaddings(i, dynamic);
        this.d = true;
    }
}
