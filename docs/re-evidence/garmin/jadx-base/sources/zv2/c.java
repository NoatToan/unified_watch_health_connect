package zv2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.realtimesettings.app.baseviews.views.StyledTextView;
import com.nimbusds.jose.jwk.JWKParameterNames;
import cx2.h;
import e23.l;
import gw2.i;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import zw2.f;
import zw2.g;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0013B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0006\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001f\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b¨\u0006 "}, d2 = {"Lzv2/c;", "Lfw2/a;", "Landroid/content/Context;", "ctx", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Ldx2/c;", "settingsViewModel", "Lzv2/b;", "transform", "", "", "", "viewAttrs", "(Landroidx/fragment/app/Fragment;Ldx2/c;Lzv2/b;Ljava/util/Map;)V", "a", "Landroid/content/Context;", "getCtx", "()Landroid/content/Context;", "Landroidx/appcompat/widget/AppCompatImageView;", "d", "Landroidx/appcompat/widget/AppCompatImageView;", "getLeftIconImageView", "()Landroidx/appcompat/widget/AppCompatImageView;", "leftIconImageView", JWKParameterNames.RSA_EXPONENT, "getIconImageView", "iconImageView", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c extends fw2.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h f207179g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Context ctx;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f207181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StyledTextView f207182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final AppCompatImageView leftIconImageView;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final AppCompatImageView iconImageView;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AppCompatImageView f207185f;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f207186a;

        public b(l lVar) {
            lVar.getClass();
            this.f207186a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f207186a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f207186a.invoke(obj);
        }
    }

    static {
        new a(null);
        f207179g = new h("SingleLabelView", null, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.ctx = context;
        View.inflate(context, R.layout.rts_single_label_view, this);
        View viewFindViewById = findViewById(R.id.row_container_view);
        viewFindViewById.getClass();
        this.f207181b = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.title_text_view);
        viewFindViewById2.getClass();
        this.f207182c = (StyledTextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.left_icon);
        viewFindViewById3.getClass();
        AppCompatImageView appCompatImageView = (AppCompatImageView) viewFindViewById3;
        this.leftIconImageView = appCompatImageView;
        View viewFindViewById4 = findViewById(R.id.label_icon);
        viewFindViewById4.getClass();
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) viewFindViewById4;
        this.iconImageView = appCompatImageView2;
        View viewFindViewById5 = findViewById(R.id.right_icon);
        viewFindViewById5.getClass();
        AppCompatImageView appCompatImageView3 = (AppCompatImageView) viewFindViewById5;
        this.f207185f = appCompatImageView3;
        if (dw2.a.b(context)) {
            float dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.rts_standard_small_image_size);
            appCompatImageView3.getLayoutParams().height = (int) dw2.a.a(context, dimensionPixelSize, 1.5f);
            appCompatImageView3.getLayoutParams().width = (int) dw2.a.a(context, dimensionPixelSize, 1.5f);
            appCompatImageView2.getLayoutParams().height = (int) dw2.a.a(context, dimensionPixelSize, 1.5f);
            appCompatImageView2.getLayoutParams().width = (int) dw2.a.a(context, dimensionPixelSize, 1.5f);
            appCompatImageView.getLayoutParams().height = (int) dw2.a.a(context, dimensionPixelSize, 1.5f);
            appCompatImageView.getLayoutParams().width = (int) dw2.a.a(context, dimensionPixelSize, 1.5f);
        }
    }

    public final Context getCtx() {
        return this.ctx;
    }

    public final AppCompatImageView getIconImageView() {
        return this.iconImageView;
    }

    public final AppCompatImageView getLeftIconImageView() {
        return this.leftIconImageView;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzv2/c$a;", "", "<init>", "()V", "Lcx2/h;", "logger", "Lcx2/h;", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ c(Context context, AttributeSet attributeSet, int i14, j jVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Fragment fragment, dx2.c cVar, zv2.b bVar, Map<String, ? extends Object> map) {
        String str;
        String str2;
        Long l14;
        fragment.getClass();
        cVar.getClass();
        bVar.getClass();
        map.getClass();
        Context contextRequireContext = fragment.requireContext();
        contextRequireContext.getClass();
        Long l15 = null;
        this(contextRequireContext, (AttributeSet) (0 == true ? 1 : 0), 2, (j) (0 == true ? 1 : 0));
        AppCompatImageView appCompatImageView = this.leftIconImageView;
        g.c cVarD = f.d(cVar, map);
        com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
        u53.d dVar = com.garmin.realtimesettings.app.initialization.b.f52593e;
        cx2.g.f(appCompatImageView, cVarD, dVar, 4);
        cx2.g.f(this.iconImageView, cVar.I4(map), dVar, 4);
        Object obj = map.get(i.ICON_SET.f79975a);
        try {
            str = (String) (obj instanceof String ? obj : null);
        } catch (ClassCastException unused) {
            str = null;
        }
        str = str == null ? "BASE" : str;
        Object obj2 = map.get(i.RIGHT_DRAWABLE.f79975a);
        try {
            str2 = (String) (obj2 instanceof String ? obj2 : null);
        } catch (ClassCastException unused2) {
            str2 = null;
        }
        Object obj3 = map.get(i.LIGHT_COLOR.f79975a);
        try {
            l14 = (Long) (obj3 instanceof Long ? obj3 : null);
        } catch (ClassCastException unused3) {
            l14 = null;
        }
        Object obj4 = map.get(i.DARK_COLOR.f79975a);
        try {
            l15 = (Long) (obj4 instanceof Long ? obj4 : null);
        } catch (ClassCastException unused4) {
        }
        g.c cVar2 = new g.c(str, str2, l14, l15);
        AppCompatImageView appCompatImageView2 = this.f207185f;
        com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
        cx2.g.f(appCompatImageView2, cVar2, com.garmin.realtimesettings.app.initialization.b.f52593e, 4);
        cVar.f61486c.f(fragment.getViewLifecycleOwner(), new b(new wv0.h(this, bVar, cVar, map, 14)));
    }
}
