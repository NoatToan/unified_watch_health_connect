package lh2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import fi2.z;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0006\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001b\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001c"}, d2 = {"Llh2/o;", "Llh2/b;", "Landroid/content/Context;", "ctx", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Lii2/b;", "settingsViewModel", "Lfi2/z;", "transform", "", "", "", "viewAttrs", "(Landroidx/fragment/app/Fragment;Lii2/b;Lfi2/z;Ljava/util/Map;)V", "Landroidx/appcompat/widget/SwitchCompat;", "d", "Landroidx/appcompat/widget/SwitchCompat;", "getAcclimationSwitchView", "()Landroidx/appcompat/widget/SwitchCompat;", "acclimationSwitchView", "f", "getSleepTrackingSwitchView", "sleepTrackingSwitchView", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class o extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f112525g = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hi2.d f112526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Group f112527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final SwitchCompat acclimationSwitchView;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Group f112529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final SwitchCompat sleepTrackingSwitchView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.f112526b = new hi2.d("PulseOxView", null, 2, null);
        View.inflate(context, R.layout.dsl_pulse_ox, this);
        View viewFindViewById = findViewById(R.id.acclimation_group);
        viewFindViewById.getClass();
        this.f112527c = (Group) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.acclimation_switch_view);
        viewFindViewById2.getClass();
        this.acclimationSwitchView = (SwitchCompat) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.sleep_tracking_group);
        viewFindViewById3.getClass();
        this.f112529e = (Group) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.sleep_tracking_switch_view);
        viewFindViewById4.getClass();
        this.sleepTrackingSwitchView = (SwitchCompat) viewFindViewById4;
    }

    public final SwitchCompat getAcclimationSwitchView() {
        return this.acclimationSwitchView;
    }

    public final SwitchCompat getSleepTrackingSwitchView() {
        return this.sleepTrackingSwitchView;
    }

    public /* synthetic */ o(Context context, AttributeSet attributeSet, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public o(Fragment fragment, ii2.b bVar, z zVar, Map<String, ? extends Object> map) {
        fragment.getClass();
        bVar.getClass();
        zVar.getClass();
        map.getClass();
        Context contextRequireContext = fragment.requireContext();
        contextRequireContext.getClass();
        this(contextRequireContext, (AttributeSet) null, 2, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
        this.f112526b.getClass();
        bVar.f93793c.f(fragment.getViewLifecycleOwner(), new hc0.e(zVar, bVar, map, this, 3));
    }
}
