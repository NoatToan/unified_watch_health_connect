package lh2;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0006\u0010\u0010¨\u0006\u0011"}, d2 = {"Llh2/s;", "Llh2/b;", "Landroid/content/Context;", "ctx", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Lii2/b;", "settingsViewModel", "", "", "", "viewAttrs", "(Landroidx/fragment/app/Fragment;Lii2/b;Ljava/util/Map;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class s extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f112549d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f112550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f112551c;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public s(Fragment fragment, ii2.b bVar, Map<String, ? extends Object> map) {
        float dimension;
        fragment.getClass();
        bVar.getClass();
        map.getClass();
        Context contextRequireContext = fragment.requireContext();
        contextRequireContext.getClass();
        this(contextRequireContext, null, 2, 0 == true ? 1 : 0);
        hi2.a.C1658a c1658a = hi2.a.f83879a;
        String strValueOf = String.valueOf(map.get(mh2.i.HEIGHT.f118617a));
        c1658a.getClass();
        int iH = hi2.a.C1658a.h(strValueOf);
        Context context = bVar.f93794d;
        if (iH >= 0) {
            float f14 = iH;
            if (context == null) {
                p005kotlin.jvm.internal.s.m(CoreConstants.CONTEXT_SCOPE_VALUE);
                throw null;
            }
            dimension = TypedValue.applyDimension(1, f14, context.getResources().getDisplayMetrics());
        } else {
            if (context == null) {
                p005kotlin.jvm.internal.s.m(CoreConstants.CONTEXT_SCOPE_VALUE);
                throw null;
            }
            dimension = context.getResources().getDimension(R.dimen.layout_space_padding);
        }
        int i14 = (int) dimension;
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.f(this.f112550b);
        dVar.k(R.id.spacer_view).f6203e.f6226d = i14;
        dVar.b(this.f112550b);
        bVar.f93793c.f(fragment.getViewLifecycleOwner(), new i(this, 3, bVar, map));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View.inflate(context, R.layout.dsl_spacer_view, this);
        View viewFindViewById = findViewById(R.id.row_container_view);
        viewFindViewById.getClass();
        this.f112550b = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.spacer_view);
        viewFindViewById2.getClass();
        this.f112551c = viewFindViewById2;
    }

    public /* synthetic */ s(Context context, AttributeSet attributeSet, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet);
    }
}
