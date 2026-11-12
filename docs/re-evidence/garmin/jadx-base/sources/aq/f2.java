package aq;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\n\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Laq/f2;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lid1/d;", "Landroidx/fragment/app/v;", "fragmentManager", "", "Lcom/garmin/android/apps/connectmobile/repcounting/model/d;", "exercisesItemList", "Laq/c2;", "eventListener", "Laq/n0$a;", "columnWidthData", "<init>", "(Landroidx/fragment/app/v;Ljava/util/List;Laq/c2;Laq/n0$a;)V", "g", "a", JWKParameterNames.RSA_EXPONENT, "c", "b", "h", "f", IntegerTokenConverter.CONVERTER_KEY, "j", "d", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f2 extends RecyclerView.h<RecyclerView.f0> implements id1.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f11937h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.fragment.app.v f11938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<com.garmin.android.apps.connectmobile.repcounting.model.d> f11939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c2 f11940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n0.a f11941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<u0> f11942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n0.d f11943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f11944g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Laq/f2$b;", "", "", "backgroundColorResId", "<init>", "(I)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f11946a;

        public b(int i14) {
            this.f11946a = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f11946a == ((b) obj).f11946a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f11946a);
        }

        public final String toString() {
            return v.e0.f(this.f11946a, "BackgroundChangePayload(backgroundColorResId=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Laq/f2$c;", "", "", "isChecked", "<init>", "(Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f11947a;

        public c(boolean z14) {
            this.f11947a = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f11947a == ((c) obj).f11947a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f11947a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("CheckStateChangePayload(isChecked=", ")", this.f11947a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Laq/f2$e;", "Landroidx/recyclerview/widget/o$b;", "", "Laq/u0;", "oldList", "newList", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends androidx.recyclerview.widget.o.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<u0> f11948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<u0> f11949b;

        public e(List<u0> list, List<u0> list2) {
            list.getClass();
            list2.getClass();
            this.f11948a = list;
            this.f11949b = list2;
        }

        @Override // androidx.recyclerview.widget.o.b
        public final boolean a(int i14, int i15) {
            return p005kotlin.jvm.internal.s.g(this.f11948a.get(i14), this.f11949b.get(i15));
        }

        @Override // androidx.recyclerview.widget.o.b
        public final boolean b(int i14, int i15) {
            return this.f11948a.get(i14).f12252a == this.f11949b.get(i15).f12252a;
        }

        @Override // androidx.recyclerview.widget.o.b
        public final Object c(int i14, int i15) {
            u0 u0Var = this.f11948a.get(i14);
            u0 u0Var2 = this.f11949b.get(i15);
            ArrayList arrayList = new ArrayList();
            boolean z14 = u0Var.f12254c;
            com.garmin.android.apps.connectmobile.repcounting.model.e eVar = u0Var.f12253b;
            boolean z15 = u0Var2.f12254c;
            com.garmin.android.apps.connectmobile.repcounting.model.e eVar2 = u0Var2.f12253b;
            if (z14 != z15) {
                arrayList.add(new c(z15));
            }
            if (!p005kotlin.jvm.internal.s.g(eVar.f41117g, eVar2.f41117g)) {
                arrayList.add(new h(eVar2.f41117g));
            }
            if (!p005kotlin.jvm.internal.s.d(eVar.D(), eVar2.D())) {
                Double D = eVar2.D();
                arrayList.add(new f(D != null ? Integer.valueOf((int) D.doubleValue()) : null));
            }
            if (!p005kotlin.jvm.internal.s.g(eVar.H(), eVar2.H())) {
                arrayList.add(new i(eVar2.H()));
            }
            if (!p005kotlin.jvm.internal.s.g(eVar.Z(), eVar2.Z())) {
                arrayList.add(new j(eVar2.Z(), eVar2));
            }
            int i16 = u0Var.f12255d;
            int i17 = u0Var2.f12255d;
            if (i16 != i17) {
                arrayList.add(new b(i17));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }

        @Override // androidx.recyclerview.widget.o.b
        /* JADX INFO: renamed from: d */
        public final int getF196150e() {
            return this.f11949b.size();
        }

        @Override // androidx.recyclerview.widget.o.b
        /* JADX INFO: renamed from: e */
        public final int getF196149d() {
            return this.f11948a.size();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Laq/f2$f;", "", "", "newDurationInSecond", "<init>", "(Ljava/lang/Integer;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f11950a;

        public f(Integer num) {
            this.f11950a = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && p005kotlin.jvm.internal.s.g(this.f11950a, ((f) obj).f11950a);
        }

        public final int hashCode() {
            Integer num = this.f11950a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return androidx.room.a0.i("DurationChangePayload(newDurationInSecond=", this.f11950a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Laq/f2$h;", "", "", "newExerciseName", "<init>", "(Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f11960a;

        public h(String str) {
            this.f11960a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && p005kotlin.jvm.internal.s.g(this.f11960a, ((h) obj).f11960a);
        }

        public final int hashCode() {
            String str = this.f11960a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return am.j.m("ExerciseNameChangePayload(newExerciseName=", this.f11960a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Laq/f2$i;", "", "", "newRepCount", "<init>", "(Ljava/lang/Long;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f11961a;

        public i(Long l14) {
            this.f11961a = l14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && p005kotlin.jvm.internal.s.g(this.f11961a, ((i) obj).f11961a);
        }

        public final int hashCode() {
            Long l14 = this.f11961a;
            if (l14 == null) {
                return 0;
            }
            return l14.hashCode();
        }

        public final String toString() {
            return "RepChangePayload(newRepCount=" + this.f11961a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Laq/f2$j;", "", "", "newWeightInGram", "Lcom/garmin/android/apps/connectmobile/repcounting/model/e;", "newSetDTO", "<init>", "(Ljava/lang/Long;Lcom/garmin/android/apps/connectmobile/repcounting/model/e;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f11962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.repcounting.model.e f11963b;

        public j(Long l14, com.garmin.android.apps.connectmobile.repcounting.model.e eVar) {
            this.f11962a = l14;
            this.f11963b = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return p005kotlin.jvm.internal.s.g(this.f11962a, jVar.f11962a) && p005kotlin.jvm.internal.s.g(this.f11963b, jVar.f11963b);
        }

        public final int hashCode() {
            Long l14 = this.f11962a;
            int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
            com.garmin.android.apps.connectmobile.repcounting.model.e eVar = this.f11963b;
            return iHashCode + (eVar != null ? eVar.hashCode() : 0);
        }

        public final String toString() {
            return "WeightChangePayload(newWeightInGram=" + this.f11962a + ", newSetDTO=" + this.f11963b + ")";
        }
    }

    static {
        new d(null);
    }

    public f2(androidx.fragment.app.v vVar, List<com.garmin.android.apps.connectmobile.repcounting.model.d> list, c2 c2Var, n0.a aVar) {
        vVar.getClass();
        c2Var.getClass();
        aVar.getClass();
        this.f11938a = vVar;
        this.f11939b = list;
        this.f11940c = c2Var;
        this.f11941d = aVar;
        ArrayList arrayList = new ArrayList();
        this.f11942e = arrayList;
        this.f11944g = new e(p13.h0.b1(arrayList), new ArrayList());
    }

    @Override // id1.d
    public final boolean f(int i14, int i15) {
        if (i14 == getItemCount() - 1 || i15 == getItemCount() - 1) {
            return false;
        }
        n0.d dVar = this.f11943f;
        if (dVar != null) {
            n0 n0Var = n0.this;
            int i16 = n0.f12063j;
            androidx.fragment.app.m activity = n0Var.getActivity();
            if (activity != null && activity.getCurrentFocus() != null) {
                Object systemService = activity.getSystemService("input_method");
                systemService.getClass();
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                View currentFocus = activity.getCurrentFocus();
                inputMethodManager.hideSoftInputFromWindow(currentFocus != null ? currentFocus.getWindowToken() : null, 2);
            }
        }
        Collections.swap(this.f11942e, i14, i15);
        notifyItemMoved(i14, i15);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f11942e.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        return i14 == getItemCount() + (-1) ? R.layout.edit_exercises_add_footer : R.layout.edit_exercises_multi_select_row_item;
    }

    @Override // id1.d
    public final void m(int i14) {
        n0.d dVar = this.f11943f;
        if (dVar != null) {
            n0 n0Var = n0.this;
            ge1.b.T(g22.f.b(n0Var), null, null, new s0(n0Var, i14, null), 3);
        }
    }

    @Override // id1.d
    public final void n() {
        n0.d dVar = this.f11943f;
        if (dVar != null) {
            n0 n0Var = n0.this;
            if (!n0Var.isAdded() || n0Var.getView() == null) {
                return;
            }
            ge1.b.T(g22.f.b(n0Var), null, null, new r0(n0Var, null), 3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14, List<Object> list) {
        f0Var.getClass();
        list.getClass();
        if (list.isEmpty()) {
            onBindViewHolder(f0Var, i14);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof List) {
                arrayList.add(obj);
            }
        }
        for (Object obj2 : p13.y.s(arrayList)) {
            boolean z14 = f0Var instanceof g;
            if (z14 && (obj2 instanceof c)) {
                ((g) f0Var).f11953b.setChecked(((c) obj2).f11947a);
            } else {
                com.garmin.android.apps.connectmobile.repcounting.model.d dVarN = null;
                dVarN = null;
                if (z14 && (obj2 instanceof b)) {
                    g gVar = (g) f0Var;
                    int i15 = ((b) obj2).f11946a;
                    Resources resources = gVar.itemView.getContext().getResources();
                    ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
                    gVar.itemView.setBackground(resources.getDrawable(i15, null));
                } else {
                    int i16 = 1;
                    if (z14 && (obj2 instanceof h)) {
                        g gVar2 = (g) f0Var;
                        t1.b(gVar2.f11954c, ((h) obj2).f11960a, u62.z.b(R.string.lbl_unknown, gVar2.itemView), R.color.gcm_text_primary, new ao1.i(i16, this, gVar2));
                    } else if (z14 && (obj2 instanceof f)) {
                        g gVar3 = (g) f0Var;
                        Integer num = ((f) obj2).f11950a;
                        Double dValueOf = num != null ? Double.valueOf(num.intValue()) : null;
                        t1.a(gVar3.f11955d, dValueOf, this.f11938a, new e2(this, 2), new a4.a(dValueOf, 7, this, gVar3));
                    } else if (z14 && (obj2 instanceof i)) {
                        g gVar4 = (g) f0Var;
                        EditText editText = gVar4.f11957f;
                        Long l14 = ((i) obj2).f11961a;
                        t1.d(editText, l14, new e2(this, 0), new a4.a(gVar4, 6, l14, this));
                        TextView textView = gVar4.f11956e;
                        textView.setText(editText.getText());
                        v22.e.q(textView);
                        v22.e.l(editText);
                    } else if (z14 && (obj2 instanceof j)) {
                        j jVar = (j) obj2;
                        com.garmin.android.apps.connectmobile.repcounting.model.e eVar = jVar.f11963b;
                        List<com.garmin.android.apps.connectmobile.repcounting.model.d> list2 = this.f11939b;
                        com.garmin.android.apps.connectmobile.repcounting.model.d dVarN2 = eVar != null ? list2 != null ? zf.b.n(eVar.f41115e, eVar.f41116f, list2) : null : null;
                        if (dVarN2 != null && list2 != null) {
                            dVarN = zf.b.n(dVarN2.f41102a, dVarN2.f41104c, list2);
                        }
                        g gVar5 = (g) f0Var;
                        Long l15 = jVar.f11962a;
                        t1.e(gVar5.f11959h, l15, dVarN2, dVarN, new e2(this, 1), new a3.e(gVar5, 10, l15, this));
                        TextView textView2 = gVar5.f11958g;
                        EditText editText2 = gVar5.f11959h;
                        textView2.setText(editText2.getText());
                        v22.e.q(textView2);
                        v22.e.l(editText2);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        if (i14 == R.layout.edit_exercises_add_footer) {
            a.f11945a.getClass();
            c2 c2Var = this.f11940c;
            c2Var.getClass();
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.edit_exercises_add_footer, viewGroup, false);
            viewInflate.setOnClickListener(new a32.b(c2Var, 5));
            return new a(viewInflate);
        }
        g.f11951i.getClass();
        n0.a aVar = this.f11941d;
        aVar.getClass();
        int i15 = aVar.f12076d;
        int i16 = aVar.f12075c;
        View viewD = androidx.room.a0.d(viewGroup, R.layout.edit_exercises_multi_select_row_item, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = viewD.findViewById(R.id.exercise_name).getLayoutParams();
        ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
        if (bVar != null) {
            ((ViewGroup.MarginLayoutParams) bVar).width = aVar.f12073a;
        }
        ViewGroup.LayoutParams layoutParams2 = viewD.findViewById(R.id.duration).getLayoutParams();
        ConstraintLayout.b bVar2 = layoutParams2 instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams2 : null;
        if (bVar2 != null) {
            ((ViewGroup.MarginLayoutParams) bVar2).width = aVar.f12074b;
        }
        ViewGroup.LayoutParams layoutParams3 = viewD.findViewById(R.id.rep_number).getLayoutParams();
        ConstraintLayout.b bVar3 = layoutParams3 instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams3 : null;
        if (bVar3 != null) {
            ((ViewGroup.MarginLayoutParams) bVar3).width = i16;
        }
        ViewGroup.LayoutParams layoutParams4 = viewD.findViewById(R.id.rep_number_text_view).getLayoutParams();
        ConstraintLayout.b bVar4 = layoutParams4 instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams4 : null;
        if (bVar4 != null) {
            ((ViewGroup.MarginLayoutParams) bVar4).width = i16;
        }
        ViewGroup.LayoutParams layoutParams5 = viewD.findViewById(R.id.weight).getLayoutParams();
        ConstraintLayout.b bVar5 = layoutParams5 instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams5 : null;
        if (bVar5 != null) {
            ((ViewGroup.MarginLayoutParams) bVar5).width = i15;
        }
        ViewGroup.LayoutParams layoutParams6 = viewD.findViewById(R.id.weight_text_view).getLayoutParams();
        ConstraintLayout.b bVar6 = layoutParams6 instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams6 : null;
        if (bVar6 != null) {
            ((ViewGroup.MarginLayoutParams) bVar6).width = i15;
        }
        return new g(viewD);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Laq/f2$a;", "Lid1/f;", "Landroid/view/View;", TtmlNode.RUBY_CONTAINER, "<init>", "(Landroid/view/View;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends id1.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0169a f11945a = new C0169a(null);

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view2) {
            super(view2);
            view2.getClass();
        }

        /* JADX INFO: renamed from: aq.f2$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Laq/f2$a$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C0169a {
            public /* synthetic */ C0169a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private C0169a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Laq/f2$g;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", TtmlNode.RUBY_CONTAINER, "<init>", "(Landroid/view/View;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class g extends RecyclerView.f0 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f11951i = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f11952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CheckBox f11953b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f11954c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f11955d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TextView f11956e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final EditText f11957f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final TextView f11958g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final EditText f11959h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.checkbox_edit_exercise_click_area);
            viewFindViewById.getClass();
            this.f11952a = viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.checkbox_edit_exercise);
            viewFindViewById2.getClass();
            this.f11953b = (CheckBox) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.exercise_name);
            viewFindViewById3.getClass();
            this.f11954c = (TextView) viewFindViewById3;
            View viewFindViewById4 = view2.findViewById(R.id.duration);
            viewFindViewById4.getClass();
            this.f11955d = (TextView) viewFindViewById4;
            View viewFindViewById5 = view2.findViewById(R.id.rep_number_text_view);
            viewFindViewById5.getClass();
            TextView textView = (TextView) viewFindViewById5;
            this.f11956e = textView;
            View viewFindViewById6 = view2.findViewById(R.id.rep_number);
            viewFindViewById6.getClass();
            this.f11957f = (EditText) viewFindViewById6;
            View viewFindViewById7 = view2.findViewById(R.id.weight_text_view);
            viewFindViewById7.getClass();
            TextView textView2 = (TextView) viewFindViewById7;
            this.f11958g = textView2;
            View viewFindViewById8 = view2.findViewById(R.id.weight);
            viewFindViewById8.getClass();
            this.f11959h = (EditText) viewFindViewById8;
            final int i14 = 0;
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: aq.g2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f2.g f11969b;

                {
                    this.f11969b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i14) {
                        case 0:
                            f2.g gVar = this.f11969b;
                            v22.e.l(gVar.f11956e);
                            EditText editText = gVar.f11957f;
                            v22.e.q(editText);
                            editText.requestFocus();
                            v22.e.t(editText);
                            break;
                        default:
                            f2.g gVar2 = this.f11969b;
                            v22.e.l(gVar2.f11958g);
                            EditText editText2 = gVar2.f11959h;
                            v22.e.q(editText2);
                            editText2.requestFocus();
                            v22.e.t(editText2);
                            break;
                    }
                }
            });
            final int i15 = 1;
            textView2.setOnClickListener(new View.OnClickListener(this) { // from class: aq.g2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f2.g f11969b;

                {
                    this.f11969b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i15) {
                        case 0:
                            f2.g gVar = this.f11969b;
                            v22.e.l(gVar.f11956e);
                            EditText editText = gVar.f11957f;
                            v22.e.q(editText);
                            editText.requestFocus();
                            v22.e.t(editText);
                            break;
                        default:
                            f2.g gVar2 = this.f11969b;
                            v22.e.l(gVar2.f11958g);
                            EditText editText2 = gVar2.f11959h;
                            v22.e.q(editText2);
                            editText2.requestFocus();
                            v22.e.t(editText2);
                            break;
                    }
                }
            });
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Laq/f2$g$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Laq/f2$d;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private d() {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        f0Var.getClass();
        if (f0Var instanceof g) {
            u0 u0Var = this.f11942e.get(i14);
            g gVar = (g) f0Var;
            EditText editText = gVar.f11957f;
            int i15 = u0Var.f12255d;
            Resources resources = gVar.itemView.getContext().getResources();
            ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
            com.garmin.android.apps.connectmobile.repcounting.model.d dVarN = null;
            gVar.itemView.setBackground(resources.getDrawable(i15, null));
            com.garmin.android.apps.connectmobile.repcounting.model.e eVar = u0Var.f12253b;
            List<com.garmin.android.apps.connectmobile.repcounting.model.d> list = this.f11939b;
            com.garmin.android.apps.connectmobile.repcounting.model.d dVarN2 = list != null ? zf.b.n(eVar.f41115e, eVar.f41116f, list) : null;
            eVar.f41117g = dVarN2 != null ? dVarN2.f41107f : null;
            gVar.f11953b.setChecked(u0Var.f12254c);
            gVar.f11952a.setOnClickListener(new a61.d0(7, this, gVar));
            t1.b(gVar.f11954c, eVar.f41117g, u62.z.b(R.string.lbl_unknown, gVar.itemView), R.color.gcm_text_primary, new ao1.i(1, this, gVar));
            Double D = eVar.D();
            t1.a(gVar.f11955d, D, this.f11938a, new e2(this, 2), new a4.a(D, 7, this, gVar));
            Long lH = eVar.H();
            t1.d(editText, lH, new e2(this, 0), new a4.a(gVar, 6, lH, this));
            TextView textView = gVar.f11956e;
            textView.setText(editText.getText());
            v22.e.q(textView);
            v22.e.l(editText);
            if (dVarN2 != null && list != null) {
                dVarN = zf.b.n(dVarN2.f41102a, dVarN2.f41104c, list);
            }
            Long lZ = eVar.Z();
            t1.e(gVar.f11959h, lZ, dVarN2, dVarN, new e2(this, 1), new a3.e(gVar, 10, lZ, this));
            TextView textView2 = gVar.f11958g;
            EditText editText2 = gVar.f11959h;
            textView2.setText(editText2.getText());
            v22.e.q(textView2);
            v22.e.l(editText2);
        }
    }
}
