package n7;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.g1;
import androidx.core.view.l1;
import androidx.core.view.m1;
import androidx.core.view.s0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import mt0.b2;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f123984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<c> f123985b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c7.e f123986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c7.e f123987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f123988e;

    public class a extends View {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f123989a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, ViewGroup viewGroup) {
            super(context);
            this.f123989a = viewGroup;
        }

        @Override // android.view.View
        public final void onConfigurationChanged(Configuration configuration) {
            Drawable background = this.f123989a.getBackground();
            int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
            f fVar = f.this;
            if (fVar.f123988e != color) {
                fVar.f123988e = color;
                for (int size = fVar.f123985b.size() - 1; size >= 0; size--) {
                    fVar.f123985b.get(size).d(color);
                }
            }
        }
    }

    public class b extends l1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap<l1, Integer> f123991a;

        public b(int i14) {
            super(i14);
            this.f123991a = new HashMap<>();
        }

        @Override // androidx.core.view.l1.b
        public final void onEnd(l1 l1Var) {
            if ((l1Var.f6472a.d() & 519) != 0) {
                this.f123991a.remove(l1Var);
                f fVar = f.this;
                for (int size = fVar.f123985b.size() - 1; size >= 0; size--) {
                    fVar.f123985b.get(size).onAnimationEnd();
                }
            }
        }

        @Override // androidx.core.view.l1.b
        public final void onPrepare(l1 l1Var) {
            if ((l1Var.f6472a.d() & 519) != 0) {
                f fVar = f.this;
                for (int size = fVar.f123985b.size() - 1; size >= 0; size--) {
                    fVar.f123985b.get(size).a();
                }
            }
        }

        @Override // androidx.core.view.l1.b
        public final m1 onProgress(m1 m1Var, List<l1> list) {
            RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
            int i14 = 0;
            for (int size = list.size() - 1; size >= 0; size--) {
                l1 l1Var = list.get(size);
                Integer num = this.f123991a.get(l1Var);
                if (num != null) {
                    int iIntValue = num.intValue();
                    float fA = l1Var.f6472a.a();
                    if ((iIntValue & 1) != 0) {
                        rectF.left = fA;
                    }
                    if ((iIntValue & 2) != 0) {
                        rectF.top = fA;
                    }
                    if ((iIntValue & 4) != 0) {
                        rectF.right = fA;
                    }
                    if ((iIntValue & 8) != 0) {
                        rectF.bottom = fA;
                    }
                    i14 |= iIntValue;
                }
            }
            f fVar = f.this;
            fVar.getClass();
            ArrayList<c> arrayList = fVar.f123985b;
            c7.e eVarB = c7.e.b(m1Var.f6508a.i(519), m1Var.f6508a.i(64));
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                arrayList.get(size2).c(i14, eVarB, rectF);
            }
            return m1Var;
        }

        @Override // androidx.core.view.l1.b
        public final l1.a onStart(l1 l1Var, l1.a aVar) {
            if ((l1Var.f6472a.d() & 519) != 0) {
                c7.e eVar = aVar.f6474b;
                c7.e eVar2 = aVar.f6473a;
                int i14 = eVar.f25190a != eVar2.f25190a ? 1 : 0;
                if (eVar.f25191b != eVar2.f25191b) {
                    i14 |= 2;
                }
                if (eVar.f25192c != eVar2.f25192c) {
                    i14 |= 4;
                }
                if (eVar.f25193d != eVar2.f25193d) {
                    i14 |= 8;
                }
                this.f123991a.put(l1Var, Integer.valueOf(i14));
            }
            return aVar;
        }
    }

    public interface c {
        void a();

        void b(c7.e eVar, c7.e eVar2);

        void c(int i14, c7.e eVar, RectF rectF);

        void d(int i14);

        void onAnimationEnd();
    }

    public f(ViewGroup viewGroup) {
        View childAt;
        c7.e eVar = c7.e.f25189e;
        this.f123986c = eVar;
        this.f123987d = eVar;
        Drawable background = viewGroup.getBackground();
        this.f123988e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        a aVar = new a(viewGroup.getContext(), viewGroup);
        this.f123984a = aVar;
        aVar.setVisibility(8);
        aVar.setWillNotDraw(true);
        b2 b2Var = new b2(this, 6);
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        s0.d.c(aVar, b2Var);
        s0.t(aVar, new b(0));
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                childAt = null;
                break;
            }
            childAt = viewGroup.getChildAt(childCount);
            if (childAt.isAttachedToWindow() != viewGroup.isAttachedToWindow()) {
                break;
            } else {
                childCount--;
            }
        }
        if (childAt == null) {
            viewGroup.addView(aVar, 0);
        } else {
            childAt.addOnAttachStateChangeListener(new g(viewGroup, aVar, 0));
        }
    }
}
