package u40;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.view.MultiLineImeEditText;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMSingleLineEditTextView;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lu40/o;", "Lcom/garmin/android/apps/connectmobile/f;", "<init>", "()V", "a", "b", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o extends com.garmin.android.apps.connectmobile.f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f168590m = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f168591h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.courses.model.g f168592i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.courses.model.g f168593j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public GCMComplexTwoLineButton f168594k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public GCMSingleLineEditTextView f168595l;

    public interface b {
        void a(com.garmin.android.apps.connectmobile.courses.model.g gVar);

        void b(com.garmin.android.apps.connectmobile.courses.model.g gVar);
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f168596a;

        static {
            int[] iArr = new int[com.garmin.android.apps.connectmobile.courses.model.f.values().length];
            try {
                iArr[com.garmin.android.apps.connectmobile.courses.model.f.CATEGORY_T1_CLIMB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.courses.model.f.CATEGORY_T2_CLIMB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.courses.model.f.CATEGORY_T3_CLIMB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.courses.model.f.CATEGORY_T4_CLIMB.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f168596a = iArr;
        }
    }

    public o() {
        super(R.layout.edit_course_point_bottom_sheet_content, true, false, false, 12, null);
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final boolean A6() {
        com.garmin.android.apps.connectmobile.courses.model.g gVar;
        com.garmin.android.apps.connectmobile.courses.model.g gVar2 = this.f168592i;
        return (gVar2 == null || (gVar = this.f168593j) == null || gVar2 == null || gVar2.equals(gVar)) ? false : true;
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final void C6() {
        com.garmin.android.apps.connectmobile.courses.model.g gVar = this.f168593j;
        if (gVar != null) {
            GCMSingleLineEditTextView gCMSingleLineEditTextView = this.f168595l;
            if (gCMSingleLineEditTextView == null) {
                s.m("coursePointNameEditText");
                throw null;
            }
            gCMSingleLineEditTextView.k();
            b bVar = this.f168591h;
            if (bVar != null) {
                bVar.b(gVar);
            }
            dismiss();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final void E6() {
        dismiss();
    }

    public final String F6(String str, boolean z14) {
        com.garmin.android.apps.connectmobile.courses.model.f.f32898h.getClass();
        com.garmin.android.apps.connectmobile.courses.model.f fVarA = com.garmin.android.apps.connectmobile.courses.model.f.a.a(str);
        int[] iArr = c.f168596a;
        int iOrdinal = fVarA.ordinal();
        int i14 = fVarA.f32925d;
        int i15 = fVarA.f32926e;
        int i16 = iArr[iOrdinal];
        if (i16 == 1) {
            if (z14) {
                i14 = i15;
            }
            String string = getString(i14, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            string.getClass();
            return string;
        }
        if (i16 == 2) {
            if (z14) {
                i14 = i15;
            }
            String string2 = getString(i14, "2");
            string2.getClass();
            return string2;
        }
        if (i16 == 3) {
            if (z14) {
                i14 = i15;
            }
            String string3 = getString(i14, "3");
            string3.getClass();
            return string3;
        }
        if (i16 != 4) {
            return dh.b.B(this, fVarA.a());
        }
        if (z14) {
            i14 = i15;
        }
        String string4 = getString(i14, "4");
        string4.getClass();
        return string4;
    }

    @Override // com.garmin.android.apps.connectmobile.b0
    public final void u6(View view2) {
        com.garmin.android.apps.connectmobile.courses.model.g gVar;
        String string;
        Parcelable parcelable;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("COURSE_POINT", com.garmin.android.apps.connectmobile.courses.model.g.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("COURSE_POINT");
                if (!(parcelable2 instanceof com.garmin.android.apps.connectmobile.courses.model.g)) {
                    parcelable2 = null;
                }
                parcelable = (com.garmin.android.apps.connectmobile.courses.model.g) parcelable2;
            }
            gVar = (com.garmin.android.apps.connectmobile.courses.model.g) parcelable;
        } else {
            gVar = null;
        }
        this.f168592i = gVar;
        if (gVar != null) {
            this.f168593j = new com.garmin.android.apps.connectmobile.courses.model.g(this.f168592i);
        }
        View viewFindViewById = view2.findViewById(R.id.course_point_name_edit_text);
        viewFindViewById.getClass();
        GCMSingleLineEditTextView gCMSingleLineEditTextView = (GCMSingleLineEditTextView) viewFindViewById;
        this.f168595l = gCMSingleLineEditTextView;
        MultiLineImeEditText multiLineImeEditText = gCMSingleLineEditTextView.f47811h;
        multiLineImeEditText.getClass();
        ViewGroup.LayoutParams layoutParams = multiLineImeEditText.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        final int i14 = 0;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = 0;
        }
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = 0;
        }
        multiLineImeEditText.setLayoutParams(marginLayoutParams);
        multiLineImeEditText.setTextAppearance(R.style.Text_Caption_Secondary);
        multiLineImeEditText.setTextEntryDoneListener(new n(this));
        Unit unit = Unit.INSTANCE;
        gCMSingleLineEditTextView.setNonEditingValueColor(a7.b.getColor(requireContext(), R.color.gcm_text_secondary));
        gCMSingleLineEditTextView.setEditingValueColor(a7.b.getColor(requireContext(), R.color.gcm_text_secondary));
        gCMSingleLineEditTextView.j();
        com.garmin.android.apps.connectmobile.courses.model.g gVar2 = this.f168593j;
        if (gVar2 == null || (string = gVar2.name) == null) {
            string = getString(R.string.txt_untitle);
            string.getClass();
        }
        gCMSingleLineEditTextView.i(new GCMSingleLineEditTextView.d(string, "", 15, null, new tb0.d(22, gCMSingleLineEditTextView, this), new l(this, i14), null, null, 1, true, null, null, 3272, null));
        gCMSingleLineEditTextView.setHasError(false);
        View viewFindViewById2 = view2.findViewById(R.id.course_point_type);
        viewFindViewById2.getClass();
        GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) viewFindViewById2;
        this.f168594k = gCMComplexTwoLineButton;
        com.garmin.android.apps.connectmobile.courses.model.g gVar3 = this.f168593j;
        gCMComplexTwoLineButton.setButtonBottomLeftLabel(F6(gVar3 != null ? gVar3.getCoursePointType() : null, false));
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f168594k;
        if (gCMComplexTwoLineButton2 == null) {
            s.m("coursePointTypeLayout");
            throw null;
        }
        gCMComplexTwoLineButton2.setOnClickListener(new View.OnClickListener(this) { // from class: u40.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f168588b;

            {
                this.f168588b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i14) {
                    case 0:
                        o oVar = this.f168588b;
                        GCMSingleLineEditTextView gCMSingleLineEditTextView2 = oVar.f168595l;
                        if (gCMSingleLineEditTextView2 == null) {
                            s.m("coursePointNameEditText");
                            throw null;
                        }
                        gCMSingleLineEditTextView2.k();
                        com.garmin.android.apps.connectmobile.courses.model.g gVar4 = oVar.f168593j;
                        String coursePointType = gVar4 != null ? gVar4.getCoursePointType() : null;
                        com.garmin.android.apps.connectmobile.courses.model.f.f32898h.getClass();
                        com.garmin.android.apps.connectmobile.courses.model.f fVarA = com.garmin.android.apps.connectmobile.courses.model.f.a.a(coursePointType);
                        j.f168573h.getClass();
                        j jVarA = j.a.a(fVarA, true);
                        jVarA.f168575g = new l(oVar, 1);
                        jVarA.show(oVar.getParentFragmentManager(), "");
                        return;
                    default:
                        o oVar2 = this.f168588b;
                        GCMSingleLineEditTextView gCMSingleLineEditTextView3 = oVar2.f168595l;
                        if (gCMSingleLineEditTextView3 == null) {
                            s.m("coursePointNameEditText");
                            throw null;
                        }
                        gCMSingleLineEditTextView3.k();
                        q1.b bVar = q1.f41066b;
                        String string2 = oVar2.getString(R.string.msg_course_point_confirm_delete);
                        string2.getClass();
                        n nVar = new n(oVar2);
                        bVar.getClass();
                        q1 q1VarA = q1.b.a(0, string2, R.string.lbl_yes, R.string.lbl_no, nVar);
                        v parentFragmentManager = oVar2.getParentFragmentManager();
                        parentFragmentManager.getClass();
                        q1VarA.v6(parentFragmentManager, "GCMFragTwoBttnAlertDialog");
                        return;
                }
            }
        });
        final int i15 = 1;
        view2.findViewById(R.id.tv_remove).setOnClickListener(new View.OnClickListener(this) { // from class: u40.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f168588b;

            {
                this.f168588b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i15) {
                    case 0:
                        o oVar = this.f168588b;
                        GCMSingleLineEditTextView gCMSingleLineEditTextView2 = oVar.f168595l;
                        if (gCMSingleLineEditTextView2 == null) {
                            s.m("coursePointNameEditText");
                            throw null;
                        }
                        gCMSingleLineEditTextView2.k();
                        com.garmin.android.apps.connectmobile.courses.model.g gVar4 = oVar.f168593j;
                        String coursePointType = gVar4 != null ? gVar4.getCoursePointType() : null;
                        com.garmin.android.apps.connectmobile.courses.model.f.f32898h.getClass();
                        com.garmin.android.apps.connectmobile.courses.model.f fVarA = com.garmin.android.apps.connectmobile.courses.model.f.a.a(coursePointType);
                        j.f168573h.getClass();
                        j jVarA = j.a.a(fVarA, true);
                        jVarA.f168575g = new l(oVar, 1);
                        jVarA.show(oVar.getParentFragmentManager(), "");
                        return;
                    default:
                        o oVar2 = this.f168588b;
                        GCMSingleLineEditTextView gCMSingleLineEditTextView3 = oVar2.f168595l;
                        if (gCMSingleLineEditTextView3 == null) {
                            s.m("coursePointNameEditText");
                            throw null;
                        }
                        gCMSingleLineEditTextView3.k();
                        q1.b bVar = q1.f41066b;
                        String string2 = oVar2.getString(R.string.msg_course_point_confirm_delete);
                        string2.getClass();
                        n nVar = new n(oVar2);
                        bVar.getClass();
                        q1 q1VarA = q1.b.a(0, string2, R.string.lbl_yes, R.string.lbl_no, nVar);
                        v parentFragmentManager = oVar2.getParentFragmentManager();
                        parentFragmentManager.getClass();
                        q1VarA.v6(parentFragmentManager, "GCMFragTwoBttnAlertDialog");
                        return;
                }
            }
        });
    }

    @Override // com.garmin.android.apps.connectmobile.f
    public final String z6() {
        String string = getString(R.string.lbl_edit_course_point);
        string.getClass();
        return string;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lu40/o$a;", "", "<init>", "()V", "", "EXTRA_COURSE_POINT", "Ljava/lang/String;", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
