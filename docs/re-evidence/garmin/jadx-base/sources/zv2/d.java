package zv2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.realtimesettings.app.baseviews.views.StyledTextView;
import e23.l;
import java.util.Map;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import zw2.h;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B?\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B5\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u0010\u0010\u0014¨\u0006\u0015"}, d2 = {"Lzv2/d;", "Lfw2/a;", "Lax2/a;", "Lvw2/b;", "Landroid/content/Context;", "ctx", "Lzw2/h;", "transform", "Ldx2/c;", "settingsViewModel", "", "", "", "viewAttributeMap", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Lzw2/h;Ldx2/c;Ljava/util/Map;Landroid/util/AttributeSet;)V", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;Ldx2/c;Lzw2/h;Ljava/util/Map;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d extends fw2.a implements ax2.a, vw2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f207187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dx2.c f207188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, Object> f207189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cx2.h f207190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AppCompatImageView f207191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final StyledTextView f207192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f207193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConstraintLayout f207194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ProgressBar f207195i;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f207196a;

        static {
            int[] iArr = new int[gw2.d.values().length];
            try {
                iArr[gw2.d.CUSTOM_ALERT_VOLUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gw2.d.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gw2.d.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[gw2.d.DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[gw2.d.IN_PROGRESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[gw2.d.PREFERRED_ACTIVITY_DEVICE_SELECTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f207196a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f207197a;

        public b(l lVar) {
            lVar.getClass();
            this.f207197a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f207197a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f207197a.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, h hVar, dx2.c cVar, Map<String, ? extends Object> map, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        hVar.getClass();
        cVar.getClass();
        map.getClass();
        this.f207187a = hVar;
        this.f207188b = cVar;
        this.f207189c = map;
        this.f207190d = new cx2.h("SingleLabelViewWithAccessory", null, 2, null);
        View.inflate(context, R.layout.rts_single_label_view_with_accessory, this);
        View viewFindViewById = findViewById(R.id.row_container_view);
        viewFindViewById.getClass();
        this.f207194h = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.single_label_accessory_label_icon);
        viewFindViewById2.getClass();
        this.f207191e = (AppCompatImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.single_label_accessory_title_text_view);
        viewFindViewById3.getClass();
        this.f207192f = (StyledTextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.single_label_accessory_icon);
        viewFindViewById4.getClass();
        this.f207193g = (ImageView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.single_label_accessory_progress_bar);
        viewFindViewById5.getClass();
        this.f207195i = (ProgressBar) viewFindViewById5;
    }

    @Override // vw2.b
    public final void a() {
        this.f207187a.j();
    }

    @Override // vw2.b
    public final void b(String str) {
        this.f207190d.getClass();
    }

    @Override // ax2.a
    public final void c(gw2.d dVar) {
        dVar.getClass();
        dVar.toString();
        this.f207190d.getClass();
        k(dVar);
    }

    public final void k(gw2.d dVar) {
        String str;
        ConstraintLayout constraintLayout = this.f207194h;
        constraintLayout.setEnabled(true);
        int i14 = a.f207196a[dVar.ordinal()];
        ProgressBar progressBar = this.f207195i;
        dx2.c cVar = this.f207188b;
        ImageView imageView = this.f207193g;
        switch (i14) {
            case 1:
                h hVar = this.f207187a;
                zw2.a aVar = hVar instanceof zw2.a ? (zw2.a) hVar : null;
                if (aVar != null) {
                    cv2.b bVarX4 = cVar.x4(this.f207189c);
                    if (bVarX4 == null || (str = bVarX4.f55913a) == null) {
                        this.f207190d.getClass();
                    } else {
                        aVar.n(str);
                    }
                }
                progressBar.setVisibility(8);
                imageView.setVisibility(0);
                imageView.setImageDrawable(a7.b.getDrawable(getContext(), 2131233309));
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
                imageView.setImageDrawable(a7.b.getDrawable(getContext(), 2131233313));
                imageView.setContentDescription(getContext().getString(R.string.selected));
                cVar.f61486c.j(cVar.f61484a.f154867g);
                break;
            default:
                u0.r();
                break;
        }
    }

    public /* synthetic */ d(Context context, h hVar, dx2.c cVar, Map map, AttributeSet attributeSet, int i14, j jVar) {
        this(context, hVar, cVar, map, (i14 & 16) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(Fragment fragment, dx2.c cVar, h hVar, Map<String, ? extends Object> map) {
        fragment.getClass();
        cVar.getClass();
        hVar.getClass();
        map.getClass();
        Context contextRequireContext = fragment.requireContext();
        contextRequireContext.getClass();
        this(contextRequireContext, hVar, cVar, map, null, 16, null);
        hVar.i(this);
        cVar.f61486c.f(fragment.getViewLifecycleOwner(), new b(new wv0.h(this, hVar, cVar, map, 15)));
    }
}
