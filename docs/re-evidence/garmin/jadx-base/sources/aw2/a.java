package aw2;

import a03.n0;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import d53.t;
import dx2.c;
import e23.l;
import gw2.i;
import java.util.HashMap;
import java.util.Map;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import zw2.f;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B7\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0006\u0010\u0012¨\u0006\u0013"}, d2 = {"Law2/a;", "Lfw2/a;", "Landroid/content/Context;", "ctx", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Ldx2/c;", "settingsViewModel", "", "", "", "viewAttrs", "Lzw2/f;", "transform", "(Landroidx/fragment/app/Fragment;Ldx2/c;Ljava/util/Map;Lzw2/f;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends fw2.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f13609c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f13610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f13611b;

    /* JADX INFO: renamed from: aw2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C0190a implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f13612a;

        public C0190a(l lVar) {
            lVar.getClass();
            this.f13612a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f13612a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f13612a.invoke(obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0087  */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public a(Fragment fragment, c cVar, Map<String, ? extends Object> map, f fVar) {
        HashMap map2;
        int iIntValue;
        float dimension;
        fragment.getClass();
        cVar.getClass();
        map.getClass();
        Context contextRequireContext = fragment.requireContext();
        contextRequireContext.getClass();
        this(contextRequireContext, (AttributeSet) (0 == true ? 1 : 0), 2, (j) (0 == true ? 1 : 0));
        Context context = getContext();
        context.getClass();
        Object obj = map.get(i.SPACER_OPTIONS.f79975a);
        try {
            map2 = (HashMap) (obj instanceof HashMap ? obj : null);
        } catch (ClassCastException unused) {
            map2 = null;
        }
        Integer numI = t.i(String.valueOf(map2 != null ? map2.get(i.SPACER_MULTIPLE.f79975a) : null));
        if (numI == null) {
            iIntValue = 1;
        } else {
            numI = numI.intValue() <= 0 ? null : numI;
            if (numI != null) {
                iIntValue = numI.intValue();
            } else {
                iIntValue = 1;
            }
        }
        Float fG = d53.s.g(String.valueOf(map2 != null ? map2.get(i.SPACER_BASE.f79975a) : null));
        if (fG == null) {
            dimension = context.getResources().getDimension(R.dimen.rts_spacer_view_height);
        } else {
            Float f14 = fG.floatValue() > 0.0f ? fG : null;
            if (f14 != null) {
                dimension = TypedValue.applyDimension(1, f14.floatValue(), context.getResources().getDisplayMetrics());
            } else {
                dimension = context.getResources().getDimension(R.dimen.rts_spacer_view_height);
            }
        }
        int iC = MathKt.c(iIntValue * dimension);
        d dVar = new d();
        dVar.f(this.f13610a);
        dVar.k(R.id.spacer_view).f6203e.f6226d = iC;
        dVar.b(this.f13610a);
        cVar.f61486c.f(fragment.getViewLifecycleOwner(), new C0190a(new n0(this, cVar, map, fVar, 4)));
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i14, j jVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View.inflate(context, R.layout.rts_spacer_view, this);
        View viewFindViewById = findViewById(R.id.row_container_view);
        viewFindViewById.getClass();
        this.f13610a = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.spacer_view);
        viewFindViewById2.getClass();
        this.f13611b = viewFindViewById2;
    }
}
