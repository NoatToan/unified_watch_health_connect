package lh2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.androiddynamicsettings.app.baseviews.views.StyledTextView;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0006\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Llh2/t;", "Llh2/b;", "Landroid/content/Context;", "ctx", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Lei2/h;", "transform", "Lii2/b;", "settingsViewModel", "", "", "", "viewAttrs", "(Landroidx/fragment/app/Fragment;Lei2/h;Lii2/b;Ljava/util/Map;)V", "Landroidx/appcompat/widget/SwitchCompat;", "d", "Landroidx/appcompat/widget/SwitchCompat;", "getSwitchView", "()Landroidx/appcompat/widget/SwitchCompat;", "switchView", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class t extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f112552e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hi2.d f112553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StyledTextView f112554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final SwitchCompat switchView;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public t(Fragment fragment, ei2.h hVar, ii2.b bVar, Map<String, ? extends Object> map) {
        fragment.getClass();
        hVar.getClass();
        bVar.getClass();
        map.getClass();
        Context contextRequireContext = fragment.requireContext();
        contextRequireContext.getClass();
        this(contextRequireContext, (AttributeSet) null, 2, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
        boolean z14 = Boolean.parseBoolean(hVar.f(bVar, map));
        SwitchCompat switchCompat = this.switchView;
        boolean zIsChecked = switchCompat.isChecked();
        hi2.d dVar = this.f112553b;
        if (zIsChecked != z14) {
            dVar.getClass();
            switchCompat.setChecked(z14);
        } else {
            dVar.getClass();
        }
        this.f112554c.setText(hVar.k(bVar, map));
        setOnClickListener(new ew2.c(hVar, bVar, (Map) map, (Object) this, 12));
        bVar.f93793c.f(fragment.getViewLifecycleOwner(), new hc0.e(this, bVar, map, hVar, 5));
    }

    public final SwitchCompat getSwitchView() {
        return this.switchView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.f112553b = new hi2.d("SwitchView", hi2.e.SWITCH.f83902a);
        View.inflate(context, R.layout.dsl_switch_view_with_label, this);
        View viewFindViewById = findViewById(R.id.switchViewTitleText);
        viewFindViewById.getClass();
        this.f112554c = (StyledTextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.switch_view);
        viewFindViewById2.getClass();
        this.switchView = (SwitchCompat) viewFindViewById2;
    }

    public /* synthetic */ t(Context context, AttributeSet attributeSet, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet);
    }
}
