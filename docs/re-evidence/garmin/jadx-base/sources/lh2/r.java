package lh2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.androiddynamicsettings.app.baseviews.views.StyledTextView;
import d53.w;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB5\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0004\b\f\u0010\u0014¨\u0006\u0015"}, d2 = {"Llh2/r;", "Llh2/b;", "Ldi2/a;", "Lzh2/b;", "Landroid/content/Context;", "ctx", "Lei2/j;", "transform", "Lii2/b;", "settingsViewModel", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Lei2/j;Lii2/b;Landroid/util/AttributeSet;)V", "Landroidx/fragment/app/Fragment;", "fragment", "", "", "", "viewAttributeMap", "(Landroidx/fragment/app/Fragment;Lii2/b;Lei2/j;Ljava/util/Map;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class r extends b implements di2.a, zh2.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f112539j = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ei2.j f112540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ii2.b f112541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hi2.d f112542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final StyledTextView f112543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f112544f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f112545g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConstraintLayout f112546h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ProgressBar f112547i;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112548a;

        static {
            int[] iArr = new int[mh2.j.values().length];
            try {
                iArr[mh2.j.CUSTOM_ALERT_VOLUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mh2.j.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[mh2.j.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[mh2.j.DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[mh2.j.IN_PROGRESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[mh2.j.PREFERRED_ACTIVITY_DEVICE_SELECTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f112548a = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public r(Fragment fragment, ii2.b bVar, ei2.j jVar, Map<String, ? extends Object> map) {
        mh2.g gVar;
        fragment.getClass();
        bVar.getClass();
        jVar.getClass();
        map.getClass();
        Context contextRequireContext = fragment.requireContext();
        contextRequireContext.getClass();
        this(contextRequireContext, jVar, bVar, null, 8, null);
        this.f112543e.setText(jVar.k(bVar, map));
        Object obj = map.get(mh2.i.ICON.f118617a);
        Unit unit = null;
        String string = obj != null ? obj.toString() : null;
        bVar.f93792b.getClass();
        if (string != null) {
            mh2.g[] gVarArrValues = mh2.g.values();
            int length = gVarArrValues.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    gVar = null;
                    break;
                }
                gVar = gVarArrValues[i14];
                if (p005kotlin.jvm.internal.s.g(gVar.f118552a, string)) {
                    break;
                } else {
                    i14++;
                }
            }
            if (gVar != null) {
                this.f112544f.setVisibility(0);
                this.f112542d.getClass();
                this.f112544f.setImageDrawable(a7.b.getDrawable(getContext(), gVar.f118553b));
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                this.f112544f.setVisibility(8);
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.f112544f.setVisibility(8);
        }
        j(jVar.r(this));
        jVar.o(this);
        bVar.f93793c.f(fragment.getViewLifecycleOwner(), new i(this, 2, bVar, map));
    }

    @Override // zh2.b
    public final void a() {
        this.f112540b.p();
    }

    @Override // zh2.b
    public final void b(String str) {
        this.f112542d.getClass();
    }

    @Override // di2.a
    public final void d(String str) {
        if (w.J(str)) {
            return;
        }
        this.f112543e.setText(str);
    }

    @Override // di2.a
    public final void e(mh2.j jVar) {
        jVar.getClass();
        jVar.toString();
        this.f112542d.getClass();
        j(jVar);
    }

    public final void j(mh2.j jVar) {
        ConstraintLayout constraintLayout = this.f112546h;
        constraintLayout.setEnabled(true);
        int i14 = a.f112548a[jVar.ordinal()];
        ProgressBar progressBar = this.f112547i;
        ImageView imageView = this.f112545g;
        switch (i14) {
            case 1:
                progressBar.setVisibility(8);
                imageView.setVisibility(0);
                imageView.setImageDrawable(a7.b.getDrawable(getContext(), 2131232741));
                break;
            case 2:
            case 3:
                imageView.setVisibility(8);
                progressBar.setVisibility(8);
                break;
            case 4:
                constraintLayout.setEnabled(false);
                constraintLayout.setAlpha(0.5f);
                imageView.setVisibility(8);
                progressBar.setVisibility(8);
                break;
            case 5:
                imageView.setVisibility(8);
                progressBar.setVisibility(0);
                break;
            case 6:
                progressBar.setVisibility(8);
                imageView.setVisibility(0);
                constraintLayout.setEnabled(false);
                constraintLayout.setAlpha(0.5f);
                imageView.setImageDrawable(a7.b.getDrawable(getContext(), 2131233223));
                imageView.setContentDescription(getContext().getString(R.string.selected));
                ii2.b bVar = this.f112541c;
                bVar.f93792b.getClass();
                bVar.f93793c.j(bVar.f93791a.f126168h);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, ei2.j jVar, ii2.b bVar, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        jVar.getClass();
        bVar.getClass();
        this.f112540b = jVar;
        this.f112541c = bVar;
        this.f112542d = new hi2.d("SingleLabelViewWithAccessory", null, 2, null);
        View.inflate(context, R.layout.dsl_single_label_view_with_accessory, this);
        View viewFindViewById = findViewById(R.id.row_container_view);
        viewFindViewById.getClass();
        this.f112546h = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.single_label_accessory_title_text_view);
        viewFindViewById2.getClass();
        this.f112543e = (StyledTextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.label_icon);
        viewFindViewById3.getClass();
        this.f112544f = (ImageView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.single_label_accessory_icon);
        viewFindViewById4.getClass();
        this.f112545g = (ImageView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.single_label_accessory_progress_bar);
        viewFindViewById5.getClass();
        this.f112547i = (ProgressBar) viewFindViewById5;
    }

    public /* synthetic */ r(Context context, ei2.j jVar, ii2.b bVar, AttributeSet attributeSet, int i14, p005kotlin.jvm.internal.j jVar2) {
        this(context, jVar, bVar, (i14 & 8) != 0 ? null : attributeSet);
    }
}
