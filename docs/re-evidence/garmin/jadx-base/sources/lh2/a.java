package lh2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.androiddynamicsettings.app.baseviews.views.StyledTextView;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0006\u0010\u0012¨\u0006\u0013"}, d2 = {"Llh2/a;", "Llh2/b;", "Landroid/content/Context;", "ctx", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Lii2/b;", "settingsViewModel", "Lei2/a;", "transform", "", "", "", "viewAttrs", "(Landroidx/fragment/app/Fragment;Lii2/b;Lei2/a;Ljava/util/Map;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f112449f = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hi2.d f112450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StyledTextView f112451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StyledTextView f112452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f112453e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.f112450b = new hi2.d("BadgeView", null, 2, null);
        View.inflate(context, R.layout.dsl_badge_view, this);
        View viewFindViewById = findViewById(R.id.row_container_view);
        viewFindViewById.getClass();
        View viewFindViewById2 = findViewById(R.id.badge_title_text);
        viewFindViewById2.getClass();
        this.f112451c = (StyledTextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.badge_number);
        viewFindViewById3.getClass();
        this.f112452d = (StyledTextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.label_icon);
        viewFindViewById4.getClass();
        this.f112453e = (ImageView) viewFindViewById4;
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public a(Fragment fragment, ii2.b bVar, ei2.a aVar, Map<String, ? extends Object> map) {
        fragment.getClass();
        bVar.getClass();
        aVar.getClass();
        map.getClass();
        Context contextRequireContext = fragment.requireContext();
        contextRequireContext.getClass();
        this(contextRequireContext, (AttributeSet) null, 2, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
        this.f112451c.setText(aVar.k(bVar, map));
        this.f112453e.setImageDrawable(a7.b.getDrawable(getContext(), 2131232678));
        bVar.f93793c.f(fragment.getViewLifecycleOwner(), new hc0.e(this, bVar, map, aVar, 1));
    }
}
