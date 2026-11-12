package bi2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.Arrays;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lbi2/s;", "Lbi2/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lei2/h;", "transform", "Lii2/b;", "settingsViewModel", "", "", "", "attributeMap", "<init>", "(Landroid/content/Context;Lei2/h;Lii2/b;Ljava/util/Map;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class s extends f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final hi2.d f18254o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f18255p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f18256q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f18257r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, ei2.h hVar, ii2.b bVar, Map<String, ? extends Object> map) {
        super(context, hVar, bVar, map);
        context.getClass();
        hVar.getClass();
        bVar.getClass();
        map.getClass();
        this.f18254o = new hi2.d("FloorsClimbedGoalsDialog", hi2.e.FLOORS_CLIMBED.f83902a);
        this.f18255p = 999;
        this.f18256q = 10;
        this.f18257r = true;
    }

    @Override // bi2.f
    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF18256q() {
        return this.f18256q;
    }

    @Override // bi2.f
    /* JADX INFO: renamed from: b, reason: from getter */
    public final hi2.d getF18254o() {
        return this.f18254o;
    }

    @Override // bi2.f
    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getF18255p() {
        return this.f18255p;
    }

    @Override // bi2.f
    /* JADX INFO: renamed from: d */
    public final int getF18295p() {
        return 0;
    }

    @Override // bi2.f
    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getF18257r() {
        return this.f18257r;
    }

    @Override // bi2.f
    public final String h() {
        x0 x0Var = x0.f105818a;
        Context context = this.f18136a;
        String string = context.getString(R.string.settings_popup_error_message_format);
        string.getClass();
        return String.format(string, Arrays.copyOf(new Object[]{context.getString(R.string.lbl_goal), String.valueOf(0), String.valueOf(this.f18255p)}, 3));
    }

    @Override // bi2.f
    public final void j() {
        this.f18142g.setText(this.f18136a.getString(R.string.user_settings_daily_floors_climbed));
    }

    @Override // bi2.f
    public final void k() {
        this.f18143h.setVisibility(0);
    }
}
