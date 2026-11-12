package com.garmin.android.apps.connectmobile.training.atp.create.steps;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import f12.l;
import fu1.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.m;
import o13.t;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.y;
import wt1.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/j;", "Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/b;", "Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/WheelPicker$b;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends com.garmin.android.apps.connectmobile.training.atp.create.steps.b implements WheelPicker.b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f45297p = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f45299i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public WheelPicker f45300j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Button f45301k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public r f45302l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public double f45303m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f45305o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f45298h = m.b(new au1.g(this, 0));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f45304n = "";

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/training/atp/create/steps/j$b", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "Lfu1/r;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<r> {
        public b() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            Long lValueOf = Long.valueOf(j8);
            j jVar = j.this;
            jVar.A6(lValueOf, cVar);
            if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                Button button = jVar.f45301k;
                if (button == null) {
                    s.m("nextButton");
                    throw null;
                }
                button.setEnabled(true);
                Unit unit = Unit.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r0v14 */
        /* JADX WARN: Type inference failed for: r0v15 */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r20v1 */
        /* JADX WARN: Type inference failed for: r20v2, types: [java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r20v3 */
        /* JADX WARN: Type inference failed for: r20v4 */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v2, types: [e23.a, java.lang.Object, org.koin.core.qualifier.Qualifier] */
        /* JADX WARN: Type inference failed for: r5v8 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, r rVar) {
            ?? r24;
            List<?> list;
            r rVar2 = rVar;
            eVar.getClass();
            rVar2.getClass();
            j jVar = j.this;
            jVar.f45302l = rVar2;
            List<Integer> listB = rVar2.b();
            ?? r14 = 0;
            if (listB != null) {
                ArrayList arrayList = new ArrayList(y.r(listB, 10));
                Iterator it = listB.iterator();
                ArrayList arrayList2 = arrayList;
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    l3.a aVar = l3.f23124b;
                    aVar.getClass();
                    String strB1 = l3.a.b1(((long) iIntValue) * 1000);
                    String string = jVar.getString(R.string.common_min_abbreviated_without_period);
                    string.getClass();
                    SpannableString spannableString = new SpannableString(jVar.getString(R.string.string_space_string_pattern, strB1, string));
                    spannableString.setSpan(new ForegroundColorSpan(a7.b.getColor(jVar.requireContext(), R.color.gcm_text_primary)), 0, spannableString.length(), 33);
                    SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(spannableString).append((CharSequence) new SpannableString(StringUtils.SPACE));
                    boolean zY = ((l) KoinJavaComponent.get$default(l.class, r14, r14, 6, r14)).y();
                    Context contextRequireContext = jVar.requireContext();
                    contextRequireContext.getClass();
                    double d14 = jVar.f45303m / ((double) iIntValue);
                    String string2 = jVar.getString(R.string.no_value);
                    string2.getClass();
                    SpannableString spannableString2 = new SpannableString(jVar.getString(R.string.string_space_string_pattern, aVar.J1(contextRequireContext, d14, false, zY, true, string2), u0.j(jVar.getString(R.string.lbl_pace))));
                    spannableString2.setSpan(new ForegroundColorSpan(a7.b.getColor(jVar.requireContext(), R.color.gcm_text_secondary)), 0, spannableString2.length(), 33);
                    ArrayList arrayList3 = arrayList2;
                    arrayList3.add(SpannableString.valueOf(spannableStringBuilderAppend.append((CharSequence) spannableString2)));
                    r14 = r14;
                    arrayList2 = arrayList3;
                }
                r24 = r14;
                list = arrayList2;
            } else {
                r24 = 0;
                list = j0.f134944a;
            }
            WheelPicker wheelPicker = jVar.f45300j;
            if (wheelPicker == null) {
                s.m("wheelPicker");
                throw r24;
            }
            wheelPicker.setData(list);
            int suggestedIndex = rVar2.getSuggestedIndex();
            int selectedPaceGoalTime = jVar.w6().getSelectedPaceGoalTime();
            if (jVar.y6()) {
                if (selectedPaceGoalTime > 0) {
                    List<Integer> listB2 = rVar2.b();
                    ?? ValueOf = listB2 != null ? Integer.valueOf(listB2.indexOf(Integer.valueOf(selectedPaceGoalTime))) : r24;
                    WheelPicker wheelPicker2 = jVar.f45300j;
                    if (wheelPicker2 == null) {
                        s.m("wheelPicker");
                        throw r24;
                    }
                    if (ValueOf != 0) {
                        suggestedIndex = ValueOf.intValue();
                    }
                    wheelPicker2.h(suggestedIndex, false);
                } else {
                    WheelPicker wheelPicker3 = jVar.f45300j;
                    if (wheelPicker3 == null) {
                        s.m("wheelPicker");
                        throw r24;
                    }
                    wheelPicker3.h(suggestedIndex, false);
                }
            } else if (jVar.z6()) {
                List<Integer> listB3 = rVar2.b();
                ?? ValueOf2 = listB3 != null ? Integer.valueOf(listB3.indexOf(Integer.valueOf(selectedPaceGoalTime))) : r24;
                WheelPicker wheelPicker4 = jVar.f45300j;
                if (wheelPicker4 == null) {
                    s.m("wheelPicker");
                    throw r24;
                }
                if (ValueOf2 != 0) {
                    suggestedIndex = ValueOf2.intValue();
                }
                wheelPicker4.h(suggestedIndex, false);
            }
            WheelPicker wheelPicker5 = jVar.f45300j;
            if (wheelPicker5 != null) {
                wheelPicker5.setOnItemSelectedListener(jVar);
            } else {
                s.m("wheelPicker");
                throw r24;
            }
        }
    }

    public final void E6() {
        u uVar = this.f45249b;
        if (uVar != null) {
            com.garmin.android.apps.connectmobile.training.atp.create.steps.b.C6(this, Long.valueOf(uVar.g(w6().getPlanType(), w6().getPrePlanWeeklyMileage(), w6().getPrePlanTrainingPace(), w6().getSelectedWorkoutPlanId(), this.f45305o, (b) this.f45298h.getValue())));
        } else {
            s.m("trainingService");
            throw null;
        }
    }

    @Override // yt1.e
    public final int V5() {
        if (y6()) {
            return R.string.lbl_your_time_goal;
        }
        if (z6()) {
            return R.string.lbl_edit_your_time_goal;
        }
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.create.steps.b
    public final String b5() {
        return "TimeGoalFragment";
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.create.steps.b, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        wt1.b bVar = this.f45252e;
        if (bVar != null) {
            bVar.b();
            Unit unit = Unit.INSTANCE;
        }
        au1.g gVar = new au1.g(this, 1);
        wt1.b bVar2 = this.f45252e;
        if (bVar2 != null) {
            bVar2.c(gVar);
        }
        E6();
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.create.steps.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f45305o = arguments != null ? arguments.getBoolean("EXTRAS_PERSONAL_GOAL_CHANGED", false) : false;
        Integer planType = w6().getPlanType();
        int i14 = rt1.r.FIVE_K.f154560a;
        if (planType != null && planType.intValue() == i14) {
            String string = getString(R.string.atp_msg_5k_time_goal);
            string.getClass();
            this.f45304n = string;
            this.f45303m = 5000.0d;
            return;
        }
        int i15 = rt1.r.TEN_K.f154560a;
        if (planType != null && planType.intValue() == i15) {
            String string2 = getString(R.string.atp_msg_10k_time_goal);
            string2.getClass();
            this.f45304n = string2;
            this.f45303m = 10000.0d;
            return;
        }
        int i16 = rt1.r.HALF_MARATHON.f154560a;
        if (planType != null && planType.intValue() == i16) {
            String string3 = getString(R.string.atp_msg_half_marathon_time_goal);
            string3.getClass();
            this.f45304n = string3;
            this.f45303m = 21097.5d;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.gcm4_training_create_time_goal_step, viewGroup, false);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0090  */
    /* JADX WARN: Code duplicated, block: B:20:0x009b  */
    @Override // com.garmin.android.apps.connectmobile.training.atp.create.steps.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        float dimension;
        Button button;
        WindowManager windowManager;
        Display defaultDisplay;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.training_step_header_container);
        viewFindViewById.getClass();
        this.f45299i = viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.training_step_header_info);
        viewFindViewById2.getClass();
        ((TextView) viewFindViewById2).setText(this.f45304n);
        View viewFindViewById3 = view2.findViewById(R.id.training_goal_wheel_picker);
        viewFindViewById3.getClass();
        WheelPicker wheelPicker = (WheelPicker) viewFindViewById3;
        this.f45300j = wheelPicker;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        androidx.fragment.app.m activity = getActivity();
        if (activity != null && (windowManager = activity.getWindowManager()) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        int dimension2 = (int) getResources().getDimension(R.dimen.andfont_body_1);
        int i14 = displayMetrics.densityDpi;
        if (i14 > 240) {
            if (i14 > 320) {
                dimension = getResources().getDimension(R.dimen.andfont_body_1);
            }
            wheelPicker.setItemTextSize(dimension2);
            View viewFindViewById4 = view2.findViewById(R.id.training_step_btn);
            viewFindViewById4.getClass();
            Button button2 = (Button) viewFindViewById4;
            this.f45301k = button2;
            button2.setEnabled(false);
            button = this.f45301k;
            if (button != null) {
                button.setOnClickListener(new a32.b(this, 10));
            } else {
                s.m("nextButton");
                throw null;
            }
        }
        dimension = getResources().getDimension(R.dimen.andfont_body_2);
        dimension2 = (int) dimension;
        wheelPicker.setItemTextSize(dimension2);
        View viewFindViewById5 = view2.findViewById(R.id.training_step_btn);
        viewFindViewById5.getClass();
        Button button3 = (Button) viewFindViewById5;
        this.f45301k = button3;
        button3.setEnabled(false);
        button = this.f45301k;
        if (button != null) {
            button.setOnClickListener(new a32.b(this, 10));
        } else {
            s.m("nextButton");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/j$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRAS_PERSONAL_GOAL_CHANGED", "", "DISTANCE_5K", "D", "DISTANCE_10K", "DISTANCE_HALF_MARATHON", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
