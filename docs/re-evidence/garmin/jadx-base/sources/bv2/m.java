package bv2;

import a61.d0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.realtimesettings.app.baseviews.views.StyledTextView;
import java.util.Map;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB5\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\f\u0010\u0012¨\u0006\u0013"}, d2 = {"Lbv2/m;", "Lfw2/a;", "Lax2/a;", "Lvw2/b;", "Landroidx/fragment/app/Fragment;", "fragment", "Lzw2/h;", "transform", "Ldx2/c;", "settingsViewModel", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroidx/fragment/app/Fragment;Lzw2/h;Ldx2/c;Landroid/util/AttributeSet;)V", "", "", "", "viewAttributeMap", "(Landroidx/fragment/app/Fragment;Ldx2/c;Lzw2/h;Ljava/util/Map;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends fw2.a implements ax2.a, vw2.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f21539j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zw2.h f21540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dx2.c f21541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cx2.h f21542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f21543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final StyledTextView f21544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f21545f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ProgressBar f21546g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final StyledTextView f21547h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final StyledTextView f21548i;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 2, 0})
    @v13.e(c = "com.garmin.realtimesettings.app.baseviews.custom.PreferredActivityTrackerView$1", f = "PreferredActivityTrackerView.kt", l = {91}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public StyledTextView f21549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f21550b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ zw2.h f21552d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zw2.h hVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f21552d = hVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return m.this.new a(this.f21552d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            StyledTextView styledTextView;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f21550b;
            m mVar = m.this;
            if (i14 == 0) {
                r.b(obj);
                StyledTextView styledTextView2 = mVar.f21547h;
                this.f21549a = styledTextView2;
                this.f21550b = 1;
                this.f21552d.getClass();
                if ("" == aVar) {
                    return aVar;
                }
                styledTextView = styledTextView2;
                obj = "";
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                styledTextView = this.f21549a;
                r.b(obj);
            }
            if (((String) obj).length() == 0) {
                mVar.f21547h.setVisibility(8);
            }
            styledTextView.setText((CharSequence) obj);
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21553a;

        static {
            int[] iArr = new int[gw2.d.values().length];
            try {
                iArr[gw2.d.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gw2.d.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gw2.d.DISABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[gw2.d.IN_PROGRESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[gw2.d.PREFERRED_ACTIVITY_DEVICE_SELECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f21553a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f21554a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f21554a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f21554a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f21554a.invoke(obj);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public m(Fragment fragment, zw2.h hVar, dx2.c cVar, AttributeSet attributeSet) {
        fragment.getClass();
        hVar.getClass();
        cVar.getClass();
        Context contextRequireContext = fragment.requireContext();
        contextRequireContext.getClass();
        super(contextRequireContext, attributeSet);
        this.f21540a = hVar;
        this.f21541b = cVar;
        this.f21542c = new cx2.h("PreferredActivityTrackerView", null, 2, null);
        View.inflate(fragment.requireContext(), R.layout.rts_preferred_activity_tracker, this);
        View viewFindViewById = findViewById(R.id.row_container_view);
        viewFindViewById.getClass();
        this.f21543d = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.single_label_accessory_title_text_view);
        viewFindViewById2.getClass();
        this.f21544e = (StyledTextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.single_label_accessory_icon);
        viewFindViewById3.getClass();
        this.f21545f = (ImageView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.single_label_accessory_progress_bar);
        viewFindViewById4.getClass();
        this.f21546g = (ProgressBar) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.help_text_view);
        viewFindViewById5.getClass();
        this.f21547h = (StyledTextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.help_text_view_hyperlink);
        viewFindViewById6.getClass();
        this.f21548i = (StyledTextView) viewFindViewById6;
    }

    @Override // vw2.b
    public final void a() {
        this.f21540a.j();
    }

    @Override // vw2.b
    public final void b(String str) {
        this.f21542c.getClass();
    }

    @Override // ax2.a
    public final void c(gw2.d dVar) {
        dVar.getClass();
        dVar.toString();
        this.f21542c.getClass();
        k(dVar);
    }

    public final void k(gw2.d dVar) {
        ConstraintLayout constraintLayout = this.f21543d;
        constraintLayout.setEnabled(true);
        int i14 = b.f21553a[dVar.ordinal()];
        ProgressBar progressBar = this.f21546g;
        ImageView imageView = this.f21545f;
        if (i14 == 1 || i14 == 2) {
            imageView.setVisibility(8);
            progressBar.setVisibility(8);
            return;
        }
        if (i14 == 3) {
            constraintLayout.setEnabled(false);
            constraintLayout.setAlpha(0.5f);
            imageView.setVisibility(8);
            progressBar.setVisibility(8);
            return;
        }
        if (i14 == 4) {
            imageView.setVisibility(8);
            progressBar.setVisibility(0);
        } else {
            if (i14 != 5) {
                return;
            }
            progressBar.setVisibility(8);
            imageView.setVisibility(0);
            constraintLayout.setEnabled(false);
            constraintLayout.setAlpha(0.5f);
            constraintLayout.setOnClickListener(null);
            imageView.setImageDrawable(a7.b.getDrawable(getContext(), 2131233313));
            dx2.c cVar = this.f21541b;
            cVar.f61486c.j(cVar.f61484a.f154867g);
        }
    }

    public /* synthetic */ m(Fragment fragment, zw2.h hVar, dx2.c cVar, AttributeSet attributeSet, int i14, p005kotlin.jvm.internal.j jVar) {
        this(fragment, hVar, cVar, (i14 & 8) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(Fragment fragment, dx2.c cVar, zw2.h hVar, Map<String, ? extends Object> map) {
        this(fragment, hVar, cVar, null, 8, null);
        fragment.getClass();
        cVar.getClass();
        hVar.getClass();
        map.getClass();
        this.f21544e.setText(hVar.f(cVar, map));
        this.f21547h.setText("");
        x53.c cVar2 = s0.f129406a;
        ge1.b.T(c0.a(u53.o.f168762a), null, null, new a(hVar, null), 3);
        k(hVar.k(this));
        hVar.i(this);
        cVar.f61486c.f(fragment.getViewLifecycleOwner(), new c(new a4.a(this, 21, cVar, map)));
        this.f21548i.setOnClickListener(new d0(20, fragment, this));
    }
}
