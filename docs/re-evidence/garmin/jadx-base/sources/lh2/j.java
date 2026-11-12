package lh2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.androiddynamicsettings.app.baseviews.views.StyledTextView;
import java.util.Locale;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B7\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0006\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Llh2/j;", "Llh2/b;", "Landroid/content/Context;", "ctx", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Lii2/b;", "settingsViewModel", "Lei2/h;", "transform", "", "", "", "viewAttrs", "(Landroidx/fragment/app/Fragment;Lii2/b;Lei2/h;Ljava/util/Map;)V", "Lcom/garmin/androiddynamicsettings/app/baseviews/views/StyledTextView;", "b", "Lcom/garmin/androiddynamicsettings/app/baseviews/views/StyledTextView;", "getHeaderActionTextView", "()Lcom/garmin/androiddynamicsettings/app/baseviews/views/StyledTextView;", "headerActionTextView", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f112504d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final StyledTextView headerActionTextView;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StyledTextView f112506c;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public j(Fragment fragment, ii2.b bVar, ei2.h hVar, Map<String, ? extends Object> map) {
        fragment.getClass();
        bVar.getClass();
        map.getClass();
        Context contextRequireContext = fragment.requireContext();
        contextRequireContext.getClass();
        String strC = null;
        this(contextRequireContext, (AttributeSet) (0 == true ? 1 : 0), 2, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
        String strK = hVar != null ? hVar.k(bVar, map) : "";
        StyledTextView styledTextView = this.f112506c;
        Locale locale = Locale.getDefault();
        locale.getClass();
        String upperCase = strK.toUpperCase(locale);
        upperCase.getClass();
        styledTextView.setText(upperCase);
        if (hVar != null) {
            hi2.i.a aVar = hi2.i.f83907a;
            Context context = bVar.f93794d;
            if (context == null) {
                p005kotlin.jvm.internal.s.m(CoreConstants.CONTEXT_SCOPE_VALUE);
                throw null;
            }
            Object obj = map.get(mh2.i.BUTTON_TITLE.f118617a);
            obj = obj instanceof String ? obj : null;
            aVar.getClass();
            strC = hi2.i.a.c(context, (String) obj, null);
        }
        if (strC == null || strC.length() == 0) {
            this.headerActionTextView.setVisibility(8);
        } else {
            StyledTextView styledTextView2 = this.headerActionTextView;
            Locale locale2 = Locale.getDefault();
            locale2.getClass();
            String upperCase2 = strC.toUpperCase(locale2);
            upperCase2.getClass();
            styledTextView2.setText(upperCase2);
            styledTextView2.setVisibility(0);
        }
        bVar.f93793c.f(fragment.getViewLifecycleOwner(), new i(this, 0, bVar, map));
    }

    public final StyledTextView getHeaderActionTextView() {
        return this.headerActionTextView;
    }

    public /* synthetic */ j(Context context, AttributeSet attributeSet, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View.inflate(context, R.layout.dsl_header_view, this);
        View viewFindViewById = findViewById(R.id.header_text_view);
        viewFindViewById.getClass();
        this.f112506c = (StyledTextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.header_action_text_view);
        viewFindViewById2.getClass();
        this.headerActionTextView = (StyledTextView) viewFindViewById2;
    }
}
