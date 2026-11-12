package bv2;

import a03.n0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.realtimesettings.app.baseviews.views.StyledTextView;
import java.util.Map;
import java.util.Objects;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0006\u0010\u0012¨\u0006\u0013"}, d2 = {"Lbv2/l;", "Lfw2/a;", "Landroid/content/Context;", "ctx", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Ldx2/c;", "settingsViewModel", "Lzw2/e;", "setupTransform", "", "", "", "viewAttrs", "(Landroidx/fragment/app/Fragment;Ldx2/c;Lzw2/e;Ljava/util/Map;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends fw2.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f21526g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cx2.h f21527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f21528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StyledTextView f21529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StyledTextView f21530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f21531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f21532f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 2, 0})
    @v13.e(c = "com.garmin.realtimesettings.app.baseviews.custom.FeatureSetupView$2$1", f = "FeatureSetupView.kt", l = {107, 109, 118}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public StyledTextView f21533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f21534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f21535c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ zw2.e f21536d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ l f21537e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zw2.e eVar, l lVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f21536d = eVar;
            this.f21537e = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f21536d, this.f21537e, dVar);
            aVar.f21535c = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
        
            if (r10 == r1) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
        
            if (r10 == r1) goto L24;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            StyledTextView styledTextView;
            b0 b0Var = (b0) this.f21535c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f21534b;
            zw2.e eVar = this.f21536d;
            l lVar = this.f21537e;
            if (i14 == 0) {
                r.b(obj);
                this.f21535c = b0Var;
                this.f21534b = 1;
                obj = eVar.k(this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
            } else if (i14 == 2) {
                styledTextView = this.f21533a;
                r.b(obj);
                String strValueOf = String.valueOf(((Number) obj).intValue());
                cx2.h hVar = lVar.f21527a;
                Objects.toString(b0Var);
                hVar.getClass();
                styledTextView.setText(strValueOf);
                this.f21535c = null;
                this.f21533a = null;
                this.f21534b = 3;
                obj = eVar.l(this);
            } else {
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                lVar.f21528b.setVisibility(8);
                lVar.f21527a.getClass();
            } else {
                lVar.f21528b.setVisibility(0);
                lVar.f21527a.getClass();
            }
            return Unit.INSTANCE;
            if (((Number) obj).intValue() > 0) {
                styledTextView = lVar.f21530d;
                this.f21535c = b0Var;
                this.f21533a = styledTextView;
                this.f21534b = 2;
                obj = eVar.k(this);
            } else {
                lVar.f21530d.setVisibility(8);
                lVar.f21527a.getClass();
                this.f21535c = null;
                this.f21533a = null;
                this.f21534b = 3;
                obj = eVar.l(this);
            }
            return aVar;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f21538a;

        public b(e23.l lVar) {
            lVar.getClass();
            this.f21538a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f21538a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f21538a.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.f21527a = new cx2.h("FeatureSetupView", null, 2, null);
        View.inflate(context, R.layout.rts_feature_setup_view, this);
        View viewFindViewById = findViewById(R.id.row_container_view);
        viewFindViewById.getClass();
        this.f21528b = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.feature_setup_title);
        viewFindViewById2.getClass();
        this.f21529c = (StyledTextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.feature_setup_remaining_count);
        viewFindViewById3.getClass();
        StyledTextView styledTextView = (StyledTextView) viewFindViewById3;
        this.f21530d = styledTextView;
        View viewFindViewById4 = findViewById(R.id.label_icon);
        viewFindViewById4.getClass();
        ImageView imageView = (ImageView) viewFindViewById4;
        this.f21531e = imageView;
        View viewFindViewById5 = findViewById(R.id.features_setup_spacer);
        viewFindViewById5.getClass();
        this.f21532f = viewFindViewById5;
        viewFindViewById5.setClickable(true);
        viewFindViewById5.setFocusable(false);
        Context context2 = getContext();
        context2.getClass();
        if (dw2.a.b(context2)) {
            Context context3 = getContext();
            context3.getClass();
            int iA = (int) dw2.a.a(context3, getResources().getDimensionPixelSize(R.dimen.rts_standard_small_image_size), 2.0f);
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{a7.b.getDrawable(getContext(), R.drawable.rts_badge_circle)});
            layerDrawable.setLayerSize(0, iA, iA);
            styledTextView.setBackground(layerDrawable);
            Context context4 = getContext();
            context4.getClass();
            int iA2 = (int) dw2.a.a(context4, getResources().getDimensionPixelSize(R.dimen.rts_standard_small_image_size), 1.5f);
            imageView.getLayoutParams().width = iA2;
            imageView.getLayoutParams().height = iA2;
        }
    }

    public /* synthetic */ l(Context context, AttributeSet attributeSet, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public l(Fragment fragment, dx2.c cVar, zw2.e eVar, Map<String, ? extends Object> map) {
        fragment.getClass();
        cVar.getClass();
        eVar.getClass();
        map.getClass();
        Context contextRequireContext = fragment.requireContext();
        contextRequireContext.getClass();
        this(contextRequireContext, (AttributeSet) null, 2, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
        this.f21529c.setText(eVar.f(cVar, map));
        this.f21531e.setImageDrawable(a7.b.getDrawable(getContext(), 2131233308));
        this.f21530d.setTypeface(null, 1);
        cVar.f61486c.f(fragment.getViewLifecycleOwner(), new b(new n0(this, cVar, map, eVar, 9)));
    }
}
