package qv2;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.realtimesettings.app.baseviews.views.StyledButton;
import com.garmin.realtimesettings.app.baseviews.views.StyledTextView;
import com.nimbusds.jose.jwk.JWKParameterNames;
import cx2.h;
import e23.l;
import gw2.i;
import java.util.Map;
import java.util.Objects;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import zw2.g;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B5\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0004\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lqv2/a;", "Lfw2/a;", "Landroid/content/Context;", "ctx", "<init>", "(Landroid/content/Context;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Lqv2/d;", "transform", "Ldx2/c;", "settingsViewModel", "", "", "", "viewAttrs", "(Landroidx/fragment/app/Fragment;Lqv2/d;Ldx2/c;Ljava/util/Map;)V", "Lcom/garmin/realtimesettings/app/baseviews/views/StyledButton;", JWKParameterNames.RSA_EXPONENT, "Lcom/garmin/realtimesettings/app/baseviews/views/StyledButton;", "getEmptyStateAction", "()Lcom/garmin/realtimesettings/app/baseviews/views/StyledButton;", "emptyStateAction", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends fw2.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f148169f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f148170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f148171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StyledTextView f148172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StyledTextView f148173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final StyledButton emptyStateAction;

    /* JADX INFO: renamed from: qv2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C2789a implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f148175a;

        public C2789a(l lVar) {
            lVar.getClass();
            this.f148175a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f148175a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f148175a.invoke(obj);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Fragment fragment, d dVar, dx2.c cVar, Map<String, ? extends Object> map) {
        fragment.getClass();
        dVar.getClass();
        cVar.getClass();
        map.getClass();
        Context contextRequireContext = fragment.requireContext();
        contextRequireContext.getClass();
        this(contextRequireContext);
        h hVar = this.f148170a;
        Objects.toString(map.get(i.TYPE.f79975a));
        hVar.getClass();
        AppCompatImageView appCompatImageView = this.f148171b;
        g.c cVarI4 = cVar.I4(map);
        com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
        cx2.g.f(appCompatImageView, cVarI4, com.garmin.realtimesettings.app.initialization.b.f52593e, 4);
        cx2.g.g(this.f148172c, dVar.f(cVar, map));
        StyledTextView styledTextView = this.f148173d;
        c cVarF4 = dx2.c.F4(map);
        cx2.g.g(styledTextView, cVarF4 != null ? dVar.b(cVarF4.f148176a) : null);
        StyledButton styledButton = this.emptyStateAction;
        c cVarF5 = dx2.c.F4(map);
        String strB = cVarF5 != null ? dVar.b(cVarF5.f148177b) : null;
        styledButton.getClass();
        if (strB == null || strB.length() == 0) {
            styledButton.setVisibility(8);
        } else {
            styledButton.setVisibility(0);
            styledButton.setText(strB);
        }
        cVar.f61486c.f(fragment.getViewLifecycleOwner(), new C2789a(new p90.h(this, 16, cVar, map)));
    }

    public final StyledButton getEmptyStateAction() {
        return this.emptyStateAction;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context, null, 2, null);
        context.getClass();
        this.f148170a = new h("EmptyStateView", null, 2, null);
        View.inflate(context, R.layout.rts_empty_state, this);
        View viewFindViewById = findViewById(R.id.empty_state_icon);
        viewFindViewById.getClass();
        this.f148171b = (AppCompatImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.empty_state_title);
        viewFindViewById2.getClass();
        this.f148172c = (StyledTextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.empty_state_description);
        viewFindViewById3.getClass();
        this.f148173d = (StyledTextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.empty_state_action);
        viewFindViewById4.getClass();
        this.emptyStateAction = (StyledButton) viewFindViewById4;
    }
}
