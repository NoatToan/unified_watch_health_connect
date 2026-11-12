package bi2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.protobuf.DescriptorProtos;
import java.util.Arrays;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lbi2/h0;", "Lbi2/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lei2/h;", "transform", "Lii2/b;", "settingsViewModel", "", "", "", "attributeMap", "<init>", "(Landroid/content/Context;Lei2/h;Lii2/b;Ljava/util/Map;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h0 extends f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final hi2.d f18166o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f18167p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f18168q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f18169r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Context context, ei2.h hVar, ii2.b bVar, Map<String, ? extends Object> map) {
        super(context, hVar, bVar, map);
        context.getClass();
        hVar.getClass();
        bVar.getClass();
        map.getClass();
        this.f18166o = new hi2.d("StepsGoalDialog", hi2.e.FLOORS_CLIMBED.f83902a);
        this.f18167p = 1;
        this.f18168q = DescriptorProtos.Edition.EDITION_99999_TEST_ONLY_VALUE;
        this.f18169r = 7000;
    }

    @Override // bi2.f
    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF18169r() {
        return this.f18169r;
    }

    @Override // bi2.f
    /* JADX INFO: renamed from: b, reason: from getter */
    public final hi2.d getF18166o() {
        return this.f18166o;
    }

    @Override // bi2.f
    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getF18168q() {
        return this.f18168q;
    }

    @Override // bi2.f
    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getF18167p() {
        return this.f18167p;
    }

    @Override // bi2.f
    public final String h() {
        x0 x0Var = x0.f105818a;
        Context context = this.f18136a;
        String string = context.getString(R.string.settings_popup_error_message_format);
        string.getClass();
        return String.format(string, Arrays.copyOf(new Object[]{context.getString(R.string.lbl_goal), String.valueOf(this.f18167p - 1), String.valueOf(this.f18168q + 1)}, 3));
    }

    @Override // bi2.f
    public final void j() {
        this.f18142g.setText(this.f18136a.getString(R.string.txt_title_daily_steps));
    }

    @Override // bi2.f
    public final void k() {
        this.f18143h.setVisibility(0);
    }
}
