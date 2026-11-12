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
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B7\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0006\u0010\u0012¨\u0006\u0013"}, d2 = {"Llh2/q;", "Llh2/b;", "Landroid/content/Context;", "ctx", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Lii2/b;", "settingsViewModel", "Lei2/h;", "transform", "", "", "", "viewAttrs", "(Landroidx/fragment/app/Fragment;Lii2/b;Lei2/h;Ljava/util/Map;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class q extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f112535e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hi2.d f112536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StyledTextView f112537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f112538d;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.util.AttributeSet, kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public q(Fragment fragment, ii2.b bVar, ei2.h hVar, Map<String, ? extends Object> map) {
        mh2.g gVar;
        fragment.getClass();
        bVar.getClass();
        map.getClass();
        Context contextRequireContext = fragment.requireContext();
        contextRequireContext.getClass();
        ?? r14 = 0;
        Unit unit = null;
        r14 = 0;
        this(contextRequireContext, (AttributeSet) r14, 2, (p005kotlin.jvm.internal.j) r14);
        boolean zQ = d53.u.q(bVar.D4(map), "garminPay", false);
        StyledTextView styledTextView = this.f112537c;
        if (zQ) {
            styledTextView.setText(getContext().getString(R.string.common_conjunct_ampersand_2, getContext().getString(R.string.wallet_brand), getContext().getString(R.string.wallet_garmin_pay)));
        } else {
            styledTextView.setText(hVar != null ? hVar.k(bVar, map) : "");
        }
        if (hVar != null) {
            Object obj = map.get(mh2.i.ICON.f118617a);
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
                    this.f112538d.setVisibility(0);
                    this.f112536b.getClass();
                    this.f112538d.setImageDrawable(a7.b.getDrawable(getContext(), gVar.f118553b));
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    this.f112538d.setVisibility(8);
                }
                r14 = Unit.INSTANCE;
            }
        }
        if (r14 == 0) {
            this.f112538d.setVisibility(8);
        }
        bVar.f93793c.f(fragment.getViewLifecycleOwner(), new i(this, 1, bVar, map));
    }

    public /* synthetic */ q(Context context, AttributeSet attributeSet, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.f112536b = new hi2.d("SingleLabelView", null, 2, null);
        View.inflate(context, R.layout.dsl_single_label_view, this);
        View viewFindViewById = findViewById(R.id.title_text_view);
        viewFindViewById.getClass();
        this.f112537c = (StyledTextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.label_icon);
        viewFindViewById2.getClass();
        this.f112538d = (ImageView) viewFindViewById2;
    }
}
