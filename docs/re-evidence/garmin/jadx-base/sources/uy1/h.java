package uy1;

import am.v1;
import am.x0;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import p005kotlin.Metadata;
import ps.o1;
import ps.u0;
import u62.z;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Luy1/h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "Luy1/h$a;", "itemSelectionListener", "<init>", "(Landroid/view/View;Luy1/h$a;)V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends RecyclerView.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f173432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f173433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RelativeLayout f173434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f173435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f173436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f173437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f173438g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f173439h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f173440i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f173441j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TextView f173442k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f173443l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f173444m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f173445n;

    public interface a {
        void g(int i14);
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f173446a;

        static {
            int[] iArr = new int[x0.values().length];
            try {
                iArr[x0.f4340v2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x0.f4352y2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x0.f4356z2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x0.I1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[x0.D.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[x0.P.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[x0.I.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[x0.X.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[x0.T.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[x0.Y.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[x0.Z.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[x0.f4309n1.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[x0.f4326r2.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[x0.f4322q2.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[x0.f4333t2.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[x0.f4344w2.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[x0.f4297k1.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[x0.f4301l1.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[x0.A2.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[x0.O2.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[x0.B2.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[x0.P2.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[x0.E2.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[x0.R0.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[x0.C2.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            f173446a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(View view2, a aVar) {
        super(view2);
        view2.getClass();
        aVar.getClass();
        this.f173432a = view2;
        this.f173433b = aVar;
        View viewFindViewById = view2.findViewById(R.id.activity_type_image_layout);
        viewFindViewById.getClass();
        this.f173434c = (RelativeLayout) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.activity_type_primary_image);
        viewFindViewById2.getClass();
        this.f173435d = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.activity_type_secondary_image);
        viewFindViewById3.getClass();
        this.f173436e = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.activity_name);
        viewFindViewById4.getClass();
        this.f173437f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.activity_subheading);
        viewFindViewById5.getClass();
        this.f173438g = (TextView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.activity_description);
        viewFindViewById6.getClass();
        this.f173439h = (TextView) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.activity_first_parameter);
        viewFindViewById7.getClass();
        this.f173440i = (TextView) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.activity_second_parameter);
        viewFindViewById8.getClass();
        this.f173441j = (TextView) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.activity_third_parameter);
        viewFindViewById9.getClass();
        this.f173442k = (TextView) viewFindViewById9;
        View viewFindViewById10 = view2.findViewById(R.id.selection_image);
        viewFindViewById10.getClass();
        this.f173443l = (ImageView) viewFindViewById10;
        this.f173444m = z.b(R.string.no_value, view2);
        this.f173445n = z.b(R.string.txt_untitle, view2);
    }

    public final void d(Context context, ActivityListItemDTO activityListItemDTO, String str, o1 o1Var) {
        u0 maxGradeValue = activityListItemDTO.D1;
        if (maxGradeValue == null && o1Var != null) {
            maxGradeValue = o1Var.getMaxGradeValue();
        }
        String strE = v1.e(str, maxGradeValue);
        String string = context.getString(R.string.lbl_max_difficulty_abreviated);
        string.getClass();
        p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
        if (TextUtils.isEmpty(strE)) {
            strE = this.f173444m;
        }
        q6.f.y(new Object[]{strE, string}, 2, "%s %s", this.f173441j);
    }
}
