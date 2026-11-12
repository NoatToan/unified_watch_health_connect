package bi2;

import android.content.Context;
import android.view.View;
import android.widget.NumberPicker;
import ch.qos.logback.core.CoreConstants;
import com.garmin.androiddynamicsettings.app.baseviews.views.StyledTextView;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lbi2/m0;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lei2/h;", "transform", "Lii2/b;", "viewModel", "", "", "viewAttributes", "<init>", "(Landroid/content/Context;Lei2/h;Lii2/b;Ljava/util/Map;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ei2.h f18214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ii2.b f18215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, ? extends Object> f18216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hi2.d f18217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f18218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public NumberPicker f18219g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public StyledTextView f18220h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f18221i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public NumberPicker f18222j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public StyledTextView f18223k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f18224l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public NumberPicker f18225m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public StyledTextView f18226n;

    public m0(Context context, ei2.h hVar, ii2.b bVar, Map<String, ? extends Object> map) {
        context.getClass();
        hVar.getClass();
        bVar.getClass();
        map.getClass();
        this.f18213a = context;
        this.f18214b = hVar;
        this.f18215c = bVar;
        this.f18216d = map;
        this.f18217e = new hi2.d("TotalBottomTimePicker", hi2.e.BOTTOM_TIME.f83902a);
    }

    public final void a(int i14, NumberPicker numberPicker, StyledTextView styledTextView) {
        ge1.b.T(o53.f0.w((androidx.lifecycle.n0) this.f18213a), null, null, new l0(this, i14, numberPicker, styledTextView, null), 3);
    }
}
