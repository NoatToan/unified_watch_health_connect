package vv2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.realtimesettings.app.baseviews.views.StyledTextView;
import cx2.h;
import e23.l;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import zw2.g;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0013B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0006\u0010\u0012¨\u0006\u0014"}, d2 = {"Lvv2/e;", "Lfw2/a;", "Landroid/content/Context;", "ctx", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Lvv2/d;", "transform", "Ldx2/c;", "settingsViewModel", "", "", "", "viewAttrs", "(Landroidx/fragment/app/Fragment;Lvv2/d;Ldx2/c;Ljava/util/Map;)V", "a", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e extends fw2.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f180551f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StyledTextView f180552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StyledTextView f180553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f180554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f180555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AppCompatImageView f180556e;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f180557a;

        public b(l lVar) {
            lVar.getClass();
            this.f180557a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f180557a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f180557a.invoke(obj);
        }
    }

    static {
        new a(null);
        f180551f = new h("MultiSelectionItemView", null, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View.inflate(context, R.layout.rts_selection_item_view, this);
        View viewFindViewById = findViewById(R.id.row_container_view);
        viewFindViewById.getClass();
        this.f180555d = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.selected_title_text_view);
        viewFindViewById2.getClass();
        this.f180552a = (StyledTextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.selected_subtitle_text_view);
        viewFindViewById3.getClass();
        this.f180553b = (StyledTextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.selected_option_image_view);
        viewFindViewById4.getClass();
        this.f180554c = (ImageView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.label_icon);
        viewFindViewById5.getClass();
        this.f180556e = (AppCompatImageView) viewFindViewById5;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvv2/e$a;", "", "<init>", "()V", "Lcx2/h;", "logger", "Lcx2/h;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ e(Context context, AttributeSet attributeSet, int i14, j jVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public e(Fragment fragment, d dVar, dx2.c cVar, Map<String, ? extends Object> map) {
        fragment.getClass();
        dVar.getClass();
        cVar.getClass();
        map.getClass();
        Context contextRequireContext = fragment.requireContext();
        contextRequireContext.getClass();
        this(contextRequireContext, (AttributeSet) null, 2, (j) (0 == true ? 1 : 0));
        AppCompatImageView appCompatImageView = this.f180556e;
        g.c cVarI4 = cVar.I4(map);
        com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
        cx2.g.f(appCompatImageView, cVarI4, com.garmin.realtimesettings.app.initialization.b.f52593e, 4);
        cVar.f61486c.f(fragment.getViewLifecycleOwner(), new b(new t42.l(this, cVar, map, dVar, 14)));
    }
}
