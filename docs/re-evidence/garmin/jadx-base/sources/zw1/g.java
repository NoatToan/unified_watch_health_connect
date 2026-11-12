package zw1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.y0;
import ch.qos.logback.core.CoreConstants;
import com.airbnb.lottie.LottieAnimationView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0012²\u0006\u0014\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\n0\n8\nX\u008a\u0084\u0002"}, d2 = {"Lzw1/g;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "visible", "", "setSecondaryMuscleLegendVisibility", "(Z)V", "a", "kotlin.jvm.PlatformType", "showSecondaryLegend", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends LinearLayout {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f207264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f207265h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f207266i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LottieAnimationView f207267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f207268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f207269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f207270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f207271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y0<Boolean> f207272f;

    static {
        new a(null);
        f207264g = R.color.gds_data_viz_red_primary;
        f207265h = R.color.gds_data_viz_yellow_primary;
        f207266i = R.color.surface_3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        this.f207268b = new c();
        this.f207269c = a7.b.getColor(context, f207264g);
        this.f207270d = a7.b.getColor(context, f207265h);
        this.f207271e = a7.b.getColor(context, f207266i);
        this.f207272f = new y0<>();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.gcm_muscle_map, (ViewGroup) this, true);
        this.f207267a = (LottieAnimationView) viewInflate.findViewById(R.id.lottie_view);
        ((ComposeView) viewInflate.findViewById(R.id.muscle_legend_container_compose)).setContent(new z3.e(-1901622939, true, new f(this, 0)));
    }

    public final void setSecondaryMuscleLegendVisibility(boolean visible) {
        this.f207272f.j(Boolean.valueOf(visible));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzw1/g$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ g(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
