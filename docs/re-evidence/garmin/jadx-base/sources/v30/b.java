package v30;

import am.x0;
import android.content.Context;
import android.icu.text.MessageFormat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import f12.l;
import gg1.o0;
import i3.e5;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Locale;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import s70.b0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lv30/b;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "<init>", "()V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f175390a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b0 f175391b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lv30/b$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Lv30/b;Landroid/view/View;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ int f175392i = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f175393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o0 f175394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f175395c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f175396d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TextView f175397e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final TextView f175398f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final TextView f175399g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final MessageFormat f175400h;

        /* JADX INFO: renamed from: v30.b$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3266a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f175401a;

            static {
                int[] iArr = new int[com.garmin.android.apps.connectmobile.courses.model.b.values().length];
                try {
                    iArr[com.garmin.android.apps.connectmobile.courses.model.b.NONE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[com.garmin.android.apps.connectmobile.courses.model.b.FIRST_CATEGORY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.garmin.android.apps.connectmobile.courses.model.b.SECOND_CATEGORY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[com.garmin.android.apps.connectmobile.courses.model.b.THIRD_CATEGORY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[com.garmin.android.apps.connectmobile.courses.model.b.FOURTH_CATEGORY.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[com.garmin.android.apps.connectmobile.courses.model.b.HORS_CATEGORY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f175401a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, View view2) {
            super(view2);
            view2.getClass();
            this.f175393a = view2.getContext();
            this.f175394b = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).g();
            this.f175395c = (TextView) view2.findViewById(R.id.climb_difficulty_tv);
            this.f175396d = (TextView) view2.findViewById(R.id.climb_avg_grade_tv);
            this.f175397e = (TextView) view2.findViewById(R.id.climb_distance_tv);
            this.f175398f = (TextView) view2.findViewById(R.id.climb_ascent_tv);
            this.f175399g = (TextView) view2.findViewById(R.id.climb_pavement_tv);
            this.f175400h = new MessageFormat("{0,ordinal}", Locale.getDefault());
            view2.setOnClickListener(new u12.e(15, this, bVar));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f175390a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        String string;
        String string2;
        f0Var.getClass();
        if (i14 == -1) {
            return;
        }
        a aVar = (a) f0Var;
        ClimbDTO climbDTO = (ClimbDTO) this.f175390a.get(i14);
        TextView textView = aVar.f175399g;
        TextView textView2 = aVar.f175398f;
        TextView textView3 = aVar.f175397e;
        TextView textView4 = aVar.f175396d;
        climbDTO.getClass();
        TextView textView5 = aVar.f175395c;
        com.garmin.android.apps.connectmobile.courses.model.b category = climbDTO.getCategory();
        Context context = aVar.f175393a;
        int[] iArr = a.C3266a.f175401a;
        String string3 = "";
        switch (iArr[category.ordinal()]) {
            case 1:
                String string4 = context.getString(R.string.lbl_easy_category);
                string4.getClass();
                string = string4;
                break;
            case 2:
                string = context.getString(R.string.lbl_category_number, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                string.getClass();
                break;
            case 3:
                string = context.getString(R.string.lbl_category_number, "2");
                string.getClass();
                break;
            case 4:
                string = context.getString(R.string.lbl_category_number, "3");
                string.getClass();
                break;
            case 5:
                string = context.getString(R.string.lbl_category_number, "4");
                string.getClass();
                break;
            case 6:
                string = context.getString(R.string.lbl_abbreviated_hors_category);
                string.getClass();
                break;
            default:
                string = "";
                break;
        }
        textView5.setText(string);
        String string5 = context.getString(R.string.grade_percent, l3.f23126d.format(climbDTO.getAvgGrade()));
        string5.getClass();
        textView4.setText(string5);
        double distance = climbDTO.getDistance();
        l3.a aVar2 = l3.f23124b;
        Context context2 = aVar.f175393a;
        m3 m3VarB = ar.b.b(x0.f4312o, null);
        m3VarB.getClass();
        DecimalFormat decimalFormat = l3.f23125c;
        aVar2.getClass();
        textView3.setText(l3.a.P(context2, distance, m3VarB, decimalFormat, true, null));
        textView2.setText(l3.a.a0(aVar.f175393a, climbDTO.getElevationGain(), aVar.f175394b, true, false));
        Double pavedPercentage = climbDTO.getPavedPercentage();
        if (pavedPercentage == null) {
            string2 = "";
        } else {
            String string6 = context.getString(R.string.lbl_value_percent, l3.f23126d.format(100.0d - pavedPercentage.doubleValue()));
            String string7 = context.getString(R.string.unpaved);
            string7.getClass();
            String lowerCase = string7.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            string2 = context.getString(R.string.string_space_string_pattern, string6, lowerCase);
            string2.getClass();
        }
        textView.setText(string2);
        String string8 = context.getString(R.string.climb_index, aVar.f175400h.format(new Integer[]{Integer.valueOf(i14 + 1)}));
        string8.getClass();
        switch (iArr[climbDTO.getCategory().ordinal()]) {
            case 1:
                string3 = context.getString(R.string.lbl_easy_category);
                string3.getClass();
                break;
            case 2:
                string3 = context.getString(R.string.lbl_category_number, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                string3.getClass();
                break;
            case 3:
                string3 = context.getString(R.string.lbl_category_number, "2");
                string3.getClass();
                break;
            case 4:
                string3 = context.getString(R.string.lbl_category_number, "3");
                string3.getClass();
                break;
            case 5:
                string3 = context.getString(R.string.lbl_category_number, "4");
                string3.getClass();
                break;
            case 6:
                string3 = context.getString(R.string.lbl_hors_category);
                string3.getClass();
                break;
        }
        String string9 = context.getString(R.string.difficulty_value, string3);
        string9.getClass();
        CharSequence text = textView4.getText();
        String string10 = context.getString(R.string.length_value, textView3.getText());
        string10.getClass();
        String string11 = context.getString(R.string.num_ascent, textView2.getText());
        string11.getClass();
        CharSequence text2 = textView.getText();
        View view2 = aVar.itemView;
        view2.getClass();
        String str = string8 + ", " + string9 + ", " + ((Object) text) + ", " + string10 + ", " + string11 + ", " + ((Object) text2) + ".";
        String string12 = context.getString(R.string.view_climb_details_action);
        string12.getClass();
        v22.e.e(view2, str, string12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        View viewE = e5.e(viewGroup, R.layout.climb_item, viewGroup, false);
        viewE.getClass();
        return new a(this, viewE);
    }
}
