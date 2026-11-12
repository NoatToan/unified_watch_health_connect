package bw2;

import a03.n0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.realtimesettings.app.baseviews.views.StyledTextView;
import e23.l;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0006\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lbw2/h;", "Lfw2/a;", "Landroid/content/Context;", "ctx", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Lbw2/i;", "transform", "Ldx2/c;", "settingsViewModel", "", "", "", "viewAttrs", "(Landroidx/fragment/app/Fragment;Lbw2/i;Ldx2/c;Ljava/util/Map;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", "b", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getRowContainerView", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "rowContainerView", "Landroidx/appcompat/widget/SwitchCompat;", "f", "Landroidx/appcompat/widget/SwitchCompat;", "getSwitchView", "()Landroidx/appcompat/widget/SwitchCompat;", "switchView", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h extends fw2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cx2.h f21594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final ConstraintLayout rowContainerView;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppCompatImageView f21596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StyledTextView f21597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final StyledTextView f21598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final SwitchCompat switchView;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f21600a;

        public a(l lVar) {
            lVar.getClass();
            this.f21600a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f21600a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f21600a.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.f21594a = new cx2.h("SwitchView", null, 2, null);
        View.inflate(context, R.layout.rts_switch_view_with_label, this);
        View viewFindViewById = findViewById(R.id.row_container_view);
        viewFindViewById.getClass();
        this.rowContainerView = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.switch_view_icon);
        viewFindViewById2.getClass();
        this.f21596c = (AppCompatImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.switch_view_title_text);
        viewFindViewById3.getClass();
        this.f21597d = (StyledTextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.switch_view_subtitle_text);
        viewFindViewById4.getClass();
        this.f21598e = (StyledTextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.switch_view);
        viewFindViewById5.getClass();
        this.switchView = (SwitchCompat) viewFindViewById5;
    }

    public final ConstraintLayout getRowContainerView() {
        return this.rowContainerView;
    }

    public final SwitchCompat getSwitchView() {
        return this.switchView;
    }

    public final void k(i iVar, dx2.c cVar, Map<String, ? extends Object> map) {
        Boolean boolY4 = cVar.Y4(map);
        boolean z14 = Boolean.parseBoolean(String.valueOf(boolY4 != null ? boolY4.booleanValue() : false));
        SwitchCompat switchCompat = this.switchView;
        boolean zIsChecked = switchCompat.isChecked();
        cx2.h hVar = this.f21594a;
        if (zIsChecked == z14) {
            hVar.getClass();
        } else {
            hVar.getClass();
            switchCompat.setChecked(z14);
        }
    }

    public /* synthetic */ h(Context context, AttributeSet attributeSet, int i14, j jVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public h(Fragment fragment, i iVar, dx2.c cVar, Map<String, ? extends Object> map) {
        fragment.getClass();
        iVar.getClass();
        cVar.getClass();
        map.getClass();
        Context contextRequireContext = fragment.requireContext();
        contextRequireContext.getClass();
        this(contextRequireContext, (AttributeSet) null, 2, (j) (0 == true ? 1 : 0));
        k(iVar, cVar, map);
        cVar.f61486c.f(fragment.getViewLifecycleOwner(), new a(new n0(this, iVar, cVar, map, 10)));
    }
}
