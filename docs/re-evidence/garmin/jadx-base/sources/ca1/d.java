package ca1;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.lifecycle.s0;
import androidx.lifecycle.z0;
import c32.k;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.view.MultiLineImeEditText;
import com.garmin.android.apps.connectmobile.view.view_3_0.StyledInlineSingleTextFieldViewDark;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import e23.l;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lca1/d;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "a", "b", "c", "gcm-photo_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f26580m = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public StyledInlineSingleTextFieldViewDark f26581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MultiLineImeEditText f26582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f26583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f26584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f26585e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f26586f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f26587g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AppCompatButton f26588h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f26589i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ea1.a f26590j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f26591k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f26592l;

    public interface b {
        s0<v2<da1.b>> A7(ea1.a aVar, String str);

        default void w1() {
        }
    }

    public interface c {
        b M2();
    }

    /* JADX INFO: renamed from: ca1.d$d, reason: collision with other inner class name */
    public static final /* synthetic */ class C0406d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26593a;

        static {
            int[] iArr = new int[ea1.c.values().length];
            try {
                iArr[ea1.c.FLAGGED_FOR_REVIEW_BY_HUMAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ea1.c.FLAGGED_FOR_SECOND_REVIEW_BY_HUMAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f26593a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f26594a;

        public e(l lVar) {
            lVar.getClass();
            this.f26594a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f26594a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f26594a.invoke(obj);
        }
    }

    @Override // androidx.fragment.app.i
    public final int getTheme() {
        return R.style.GCM_BottomSheetDialog;
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        a7.e activity = getActivity();
        c cVar = activity instanceof c ? (c) activity : null;
        if (cVar != null) {
            this.f26592l = cVar.M2();
            return;
        }
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.p(a2Var, "ReportThisImageFragment", "The activity that is associated with this fragment should implement ReportThisImageDelegateProvider.");
        dismiss();
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, i.m, androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        return new BottomSheetDialog(requireContext(), R.style.GCM_BottomSheetDialog);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.report_this_image, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.textview_please_specify);
        viewFindViewById.getClass();
        StyledInlineSingleTextFieldViewDark styledInlineSingleTextFieldViewDark = (StyledInlineSingleTextFieldViewDark) viewFindViewById;
        this.f26581a = styledInlineSingleTextFieldViewDark;
        View viewFindViewById2 = styledInlineSingleTextFieldViewDark.findViewById(R.id.inline_text_field_edit_text);
        viewFindViewById2.getClass();
        this.f26582b = (MultiLineImeEditText) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.lbl_please_specify);
        viewFindViewById3.getClass();
        this.f26583c = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.nudity_sexual_activity_chip);
        viewFindViewById4.getClass();
        this.f26584d = (TextView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.spam_chip);
        viewFindViewById5.getClass();
        this.f26585e = (TextView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.copyright_violation_chip);
        viewFindViewById6.getClass();
        this.f26586f = (TextView) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.other_chip);
        viewFindViewById7.getClass();
        this.f26587g = (TextView) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.fragment_send_button);
        viewFindViewById8.getClass();
        this.f26588h = (AppCompatButton) viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.menu_icon_help);
        viewFindViewById9.getClass();
        this.f26589i = (ImageView) viewFindViewById9;
        MultiLineImeEditText multiLineImeEditText = this.f26582b;
        if (multiLineImeEditText == null) {
            s.m("multiLineImeEditText");
            throw null;
        }
        multiLineImeEditText.setVisibility(8);
        StyledInlineSingleTextFieldViewDark styledInlineSingleTextFieldViewDark2 = this.f26581a;
        if (styledInlineSingleTextFieldViewDark2 == null) {
            s.m("reportImageTextField");
            throw null;
        }
        styledInlineSingleTextFieldViewDark2.setVisibility(8);
        TextView textView = this.f26583c;
        if (textView == null) {
            s.m("textFieldHeader");
            throw null;
        }
        textView.setVisibility(8);
        TextView textView2 = this.f26584d;
        if (textView2 == null) {
            s.m("sexualActivityChip");
            throw null;
        }
        textView2.setText(view2.getContext().getString(R.string.nudity_or_sexual_activity));
        TextView textView3 = this.f26585e;
        if (textView3 == null) {
            s.m("spamChip");
            throw null;
        }
        textView3.setText(view2.getContext().getString(R.string.lbl_spam));
        TextView textView4 = this.f26586f;
        if (textView4 == null) {
            s.m("copyrightViolationChip");
            throw null;
        }
        textView4.setText(view2.getContext().getString(R.string.copyright_violation));
        TextView textView5 = this.f26587g;
        if (textView5 == null) {
            s.m("otherChip");
            throw null;
        }
        textView5.setText(view2.getContext().getString(R.string.lbl_other));
        View viewFindViewById10 = view2.findViewById(R.id.report_image_type_first_row);
        viewFindViewById10.getClass();
        LinearLayout linearLayout = (LinearLayout) viewFindViewById10;
        View viewFindViewById11 = view2.findViewById(R.id.report_image_type_second_row);
        viewFindViewById11.getClass();
        LinearLayout linearLayout2 = (LinearLayout) viewFindViewById11;
        Context context = view2.getContext();
        context.getClass();
        if (c22.b.a(context) >= 1.3f) {
            linearLayout.setOrientation(1);
            linearLayout2.setOrientation(1);
        }
        TextView textView6 = this.f26584d;
        if (textView6 == null) {
            s.m("sexualActivityChip");
            throw null;
        }
        final int i14 = 1;
        textView6.setOnClickListener(new View.OnClickListener(this) { // from class: ca1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f26576b;

            {
                this.f26576b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                s0<v2<da1.b>> s0VarA7;
                int i15 = i14;
                d dVar = this.f26576b;
                switch (i15) {
                    case 0:
                        d.a aVar = d.f26580m;
                        dVar.dismiss();
                        return;
                    case 1:
                        d.a aVar2 = d.f26580m;
                        dVar.f26590j = ea1.a.SEXUAL;
                        TextView textView7 = dVar.f26584d;
                        if (textView7 == null) {
                            s.m("sexualActivityChip");
                            throw null;
                        }
                        textView7.setSelected(true);
                        TextView textView8 = dVar.f26585e;
                        if (textView8 == null) {
                            s.m("spamChip");
                            throw null;
                        }
                        textView8.setSelected(false);
                        TextView textView9 = dVar.f26586f;
                        if (textView9 == null) {
                            s.m("copyrightViolationChip");
                            throw null;
                        }
                        textView9.setSelected(false);
                        TextView textView10 = dVar.f26587g;
                        if (textView10 == null) {
                            s.m("otherChip");
                            throw null;
                        }
                        textView10.setSelected(false);
                        AppCompatButton appCompatButton = dVar.f26588h;
                        if (appCompatButton == null) {
                            s.m("sendButton");
                            throw null;
                        }
                        appCompatButton.setEnabled(true);
                        dVar.u6(false);
                        return;
                    case 2:
                        d.a aVar3 = d.f26580m;
                        dVar.f26590j = ea1.a.SPAM;
                        TextView textView11 = dVar.f26584d;
                        if (textView11 == null) {
                            s.m("sexualActivityChip");
                            throw null;
                        }
                        textView11.setSelected(false);
                        TextView textView12 = dVar.f26585e;
                        if (textView12 == null) {
                            s.m("spamChip");
                            throw null;
                        }
                        textView12.setSelected(true);
                        TextView textView13 = dVar.f26586f;
                        if (textView13 == null) {
                            s.m("copyrightViolationChip");
                            throw null;
                        }
                        textView13.setSelected(false);
                        TextView textView14 = dVar.f26587g;
                        if (textView14 == null) {
                            s.m("otherChip");
                            throw null;
                        }
                        textView14.setSelected(false);
                        AppCompatButton appCompatButton2 = dVar.f26588h;
                        if (appCompatButton2 == null) {
                            s.m("sendButton");
                            throw null;
                        }
                        appCompatButton2.setEnabled(true);
                        dVar.u6(false);
                        return;
                    case 3:
                        d.a aVar4 = d.f26580m;
                        dVar.f26590j = ea1.a.COPYRIGHT;
                        TextView textView15 = dVar.f26584d;
                        if (textView15 == null) {
                            s.m("sexualActivityChip");
                            throw null;
                        }
                        textView15.setSelected(false);
                        TextView textView16 = dVar.f26585e;
                        if (textView16 == null) {
                            s.m("spamChip");
                            throw null;
                        }
                        textView16.setSelected(false);
                        TextView textView17 = dVar.f26586f;
                        if (textView17 == null) {
                            s.m("copyrightViolationChip");
                            throw null;
                        }
                        textView17.setSelected(true);
                        TextView textView18 = dVar.f26587g;
                        if (textView18 == null) {
                            s.m("otherChip");
                            throw null;
                        }
                        textView18.setSelected(false);
                        AppCompatButton appCompatButton3 = dVar.f26588h;
                        if (appCompatButton3 == null) {
                            s.m("sendButton");
                            throw null;
                        }
                        appCompatButton3.setEnabled(true);
                        dVar.u6(false);
                        return;
                    case 4:
                        d.a aVar5 = d.f26580m;
                        dVar.f26590j = ea1.a.OTHER;
                        TextView textView19 = dVar.f26584d;
                        if (textView19 == null) {
                            s.m("sexualActivityChip");
                            throw null;
                        }
                        textView19.setSelected(false);
                        TextView textView20 = dVar.f26585e;
                        if (textView20 == null) {
                            s.m("spamChip");
                            throw null;
                        }
                        textView20.setSelected(false);
                        TextView textView21 = dVar.f26586f;
                        if (textView21 == null) {
                            s.m("copyrightViolationChip");
                            throw null;
                        }
                        textView21.setSelected(false);
                        TextView textView22 = dVar.f26587g;
                        if (textView22 == null) {
                            s.m("otherChip");
                            throw null;
                        }
                        textView22.setSelected(true);
                        AppCompatButton appCompatButton4 = dVar.f26588h;
                        if (appCompatButton4 == null) {
                            s.m("sendButton");
                            throw null;
                        }
                        appCompatButton4.setEnabled(g22.n.d(dVar.f26591k));
                        dVar.u6(true);
                        return;
                    case 5:
                        ea1.a aVar6 = dVar.f26590j;
                        if (aVar6 != null) {
                            if (aVar6 == ea1.a.OTHER) {
                                MultiLineImeEditText multiLineImeEditText2 = dVar.f26582b;
                                if (multiLineImeEditText2 == null) {
                                    s.m("multiLineImeEditText");
                                    throw null;
                                }
                                dVar.f26591k = String.valueOf(multiLineImeEditText2.getText());
                            }
                            d.b bVar = dVar.f26592l;
                            if (bVar == null || (s0VarA7 = bVar.A7(aVar6, dVar.f26591k)) == null) {
                                return;
                            }
                            s0VarA7.f(dVar, new d.e(new b(dVar, 1)));
                            return;
                        }
                        return;
                    default:
                        d.a aVar7 = d.f26580m;
                        dVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.garmin.com/privacy/connect/")));
                        return;
                }
            }
        });
        TextView textView7 = this.f26585e;
        if (textView7 == null) {
            s.m("spamChip");
            throw null;
        }
        final int i15 = 2;
        textView7.setOnClickListener(new View.OnClickListener(this) { // from class: ca1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f26576b;

            {
                this.f26576b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                s0<v2<da1.b>> s0VarA7;
                int i16 = i15;
                d dVar = this.f26576b;
                switch (i16) {
                    case 0:
                        d.a aVar = d.f26580m;
                        dVar.dismiss();
                        return;
                    case 1:
                        d.a aVar2 = d.f26580m;
                        dVar.f26590j = ea1.a.SEXUAL;
                        TextView textView8 = dVar.f26584d;
                        if (textView8 == null) {
                            s.m("sexualActivityChip");
                            throw null;
                        }
                        textView8.setSelected(true);
                        TextView textView9 = dVar.f26585e;
                        if (textView9 == null) {
                            s.m("spamChip");
                            throw null;
                        }
                        textView9.setSelected(false);
                        TextView textView10 = dVar.f26586f;
                        if (textView10 == null) {
                            s.m("copyrightViolationChip");
                            throw null;
                        }
                        textView10.setSelected(false);
                        TextView textView11 = dVar.f26587g;
                        if (textView11 == null) {
                            s.m("otherChip");
                            throw null;
                        }
                        textView11.setSelected(false);
                        AppCompatButton appCompatButton = dVar.f26588h;
                        if (appCompatButton == null) {
                            s.m("sendButton");
                            throw null;
                        }
                        appCompatButton.setEnabled(true);
                        dVar.u6(false);
                        return;
                    case 2:
                        d.a aVar3 = d.f26580m;
                        dVar.f26590j = ea1.a.SPAM;
                        TextView textView12 = dVar.f26584d;
                        if (textView12 == null) {
                            s.m("sexualActivityChip");
                            throw null;
                        }
                        textView12.setSelected(false);
                        TextView textView13 = dVar.f26585e;
                        if (textView13 == null) {
                            s.m("spamChip");
                            throw null;
                        }
                        textView13.setSelected(true);
                        TextView textView14 = dVar.f26586f;
                        if (textView14 == null) {
                            s.m("copyrightViolationChip");
                            throw null;
                        }
                        textView14.setSelected(false);
                        TextView textView15 = dVar.f26587g;
                        if (textView15 == null) {
                            s.m("otherChip");
                            throw null;
                        }
                        textView15.setSelected(false);
                        AppCompatButton appCompatButton2 = dVar.f26588h;
                        if (appCompatButton2 == null) {
                            s.m("sendButton");
                            throw null;
                        }
                        appCompatButton2.setEnabled(true);
                        dVar.u6(false);
                        return;
                    case 3:
                        d.a aVar4 = d.f26580m;
                        dVar.f26590j = ea1.a.COPYRIGHT;
                        TextView textView16 = dVar.f26584d;
                        if (textView16 == null) {
                            s.m("sexualActivityChip");
                            throw null;
                        }
                        textView16.setSelected(false);
                        TextView textView17 = dVar.f26585e;
                        if (textView17 == null) {
                            s.m("spamChip");
                            throw null;
                        }
                        textView17.setSelected(false);
                        TextView textView18 = dVar.f26586f;
                        if (textView18 == null) {
                            s.m("copyrightViolationChip");
                            throw null;
                        }
                        textView18.setSelected(true);
                        TextView textView19 = dVar.f26587g;
                        if (textView19 == null) {
                            s.m("otherChip");
                            throw null;
                        }
                        textView19.setSelected(false);
                        AppCompatButton appCompatButton3 = dVar.f26588h;
                        if (appCompatButton3 == null) {
                            s.m("sendButton");
                            throw null;
                        }
                        appCompatButton3.setEnabled(true);
                        dVar.u6(false);
                        return;
                    case 4:
                        d.a aVar5 = d.f26580m;
                        dVar.f26590j = ea1.a.OTHER;
                        TextView textView110 = dVar.f26584d;
                        if (textView110 == null) {
                            s.m("sexualActivityChip");
                            throw null;
                        }
                        textView110.setSelected(false);
                        TextView textView20 = dVar.f26585e;
                        if (textView20 == null) {
                            s.m("spamChip");
                            throw null;
                        }
                        textView20.setSelected(false);
                        TextView textView21 = dVar.f26586f;
                        if (textView21 == null) {
                            s.m("copyrightViolationChip");
                            throw null;
                        }
                        textView21.setSelected(false);
                        TextView textView22 = dVar.f26587g;
                        if (textView22 == null) {
                            s.m("otherChip");
                            throw null;
                        }
                        textView22.setSelected(true);
                        AppCompatButton appCompatButton4 = dVar.f26588h;
                        if (appCompatButton4 == null) {
                            s.m("sendButton");
                            throw null;
                        }
                        appCompatButton4.setEnabled(g22.n.d(dVar.f26591k));
                        dVar.u6(true);
                        return;
                    case 5:
                        ea1.a aVar6 = dVar.f26590j;
                        if (aVar6 != null) {
                            if (aVar6 == ea1.a.OTHER) {
                                MultiLineImeEditText multiLineImeEditText2 = dVar.f26582b;
                                if (multiLineImeEditText2 == null) {
                                    s.m("multiLineImeEditText");
                                    throw null;
                                }
                                dVar.f26591k = String.valueOf(multiLineImeEditText2.getText());
                            }
                            d.b bVar = dVar.f26592l;
                            if (bVar == null || (s0VarA7 = bVar.A7(aVar6, dVar.f26591k)) == null) {
                                return;
                            }
                            s0VarA7.f(dVar, new d.e(new b(dVar, 1)));
                            return;
                        }
                        return;
                    default:
                        d.a aVar7 = d.f26580m;
                        dVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.garmin.com/privacy/connect/")));
                        return;
                }
            }
        });
        TextView textView8 = this.f26586f;
        if (textView8 == null) {
            s.m("copyrightViolationChip");
            throw null;
        }
        final int i16 = 3;
        textView8.setOnClickListener(new View.OnClickListener(this) { // from class: ca1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f26576b;

            {
                this.f26576b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                s0<v2<da1.b>> s0VarA7;
                int i17 = i16;
                d dVar = this.f26576b;
                switch (i17) {
                    case 0:
                        d.a aVar = d.f26580m;
                        dVar.dismiss();
                        return;
                    case 1:
                        d.a aVar2 = d.f26580m;
                        dVar.f26590j = ea1.a.SEXUAL;
                        TextView textView9 = dVar.f26584d;
                        if (textView9 == null) {
                            s.m("sexualActivityChip");
                            throw null;
                        }
                        textView9.setSelected(true);
                        TextView textView10 = dVar.f26585e;
                        if (textView10 == null) {
                            s.m("spamChip");
                            throw null;
                        }
                        textView10.setSelected(false);
                        TextView textView11 = dVar.f26586f;
                        if (textView11 == null) {
                            s.m("copyrightViolationChip");
                            throw null;
                        }
                        textView11.setSelected(false);
                        TextView textView12 = dVar.f26587g;
                        if (textView12 == null) {
                            s.m("otherChip");
                            throw null;
                        }
                        textView12.setSelected(false);
                        AppCompatButton appCompatButton = dVar.f26588h;
                        if (appCompatButton == null) {
                            s.m("sendButton");
                            throw null;
                        }
                        appCompatButton.setEnabled(true);
                        dVar.u6(false);
                        return;
                    case 2:
                        d.a aVar3 = d.f26580m;
                        dVar.f26590j = ea1.a.SPAM;
                        TextView textView13 = dVar.f26584d;
                        if (textView13 == null) {
                            s.m("sexualActivityChip");
                            throw null;
                        }
                        textView13.setSelected(false);
                        TextView textView14 = dVar.f26585e;
                        if (textView14 == null) {
                            s.m("spamChip");
                            throw null;
                        }
                        textView14.setSelected(true);
                        TextView textView15 = dVar.f26586f;
                        if (textView15 == null) {
                            s.m("copyrightViolationChip");
                            throw null;
                        }
                        textView15.setSelected(false);
                        TextView textView16 = dVar.f26587g;
                        if (textView16 == null) {
                            s.m("otherChip");
                            throw null;
                        }
                        textView16.setSelected(false);
                        AppCompatButton appCompatButton2 = dVar.f26588h;
                        if (appCompatButton2 == null) {
                            s.m("sendButton");
                            throw null;
                        }
                        appCompatButton2.setEnabled(true);
                        dVar.u6(false);
                        return;
                    case 3:
                        d.a aVar4 = d.f26580m;
                        dVar.f26590j = ea1.a.COPYRIGHT;
                        TextView textView17 = dVar.f26584d;
                        if (textView17 == null) {
                            s.m("sexualActivityChip");
                            throw null;
                        }
                        textView17.setSelected(false);
                        TextView textView18 = dVar.f26585e;
                        if (textView18 == null) {
                            s.m("spamChip");
                            throw null;
                        }
                        textView18.setSelected(false);
                        TextView textView19 = dVar.f26586f;
                        if (textView19 == null) {
                            s.m("copyrightViolationChip");
                            throw null;
                        }
                        textView19.setSelected(true);
                        TextView textView110 = dVar.f26587g;
                        if (textView110 == null) {
                            s.m("otherChip");
                            throw null;
                        }
                        textView110.setSelected(false);
                        AppCompatButton appCompatButton3 = dVar.f26588h;
                        if (appCompatButton3 == null) {
                            s.m("sendButton");
                            throw null;
                        }
                        appCompatButton3.setEnabled(true);
                        dVar.u6(false);
                        return;
                    case 4:
                        d.a aVar5 = d.f26580m;
                        dVar.f26590j = ea1.a.OTHER;
                        TextView textView111 = dVar.f26584d;
                        if (textView111 == null) {
                            s.m("sexualActivityChip");
                            throw null;
                        }
                        textView111.setSelected(false);
                        TextView textView20 = dVar.f26585e;
                        if (textView20 == null) {
                            s.m("spamChip");
                            throw null;
                        }
                        textView20.setSelected(false);
                        TextView textView21 = dVar.f26586f;
                        if (textView21 == null) {
                            s.m("copyrightViolationChip");
                            throw null;
                        }
                        textView21.setSelected(false);
                        TextView textView22 = dVar.f26587g;
                        if (textView22 == null) {
                            s.m("otherChip");
                            throw null;
                        }
                        textView22.setSelected(true);
                        AppCompatButton appCompatButton4 = dVar.f26588h;
                        if (appCompatButton4 == null) {
                            s.m("sendButton");
                            throw null;
                        }
                        appCompatButton4.setEnabled(g22.n.d(dVar.f26591k));
                        dVar.u6(true);
                        return;
                    case 5:
                        ea1.a aVar6 = dVar.f26590j;
                        if (aVar6 != null) {
                            if (aVar6 == ea1.a.OTHER) {
                                MultiLineImeEditText multiLineImeEditText2 = dVar.f26582b;
                                if (multiLineImeEditText2 == null) {
                                    s.m("multiLineImeEditText");
                                    throw null;
                                }
                                dVar.f26591k = String.valueOf(multiLineImeEditText2.getText());
                            }
                            d.b bVar = dVar.f26592l;
                            if (bVar == null || (s0VarA7 = bVar.A7(aVar6, dVar.f26591k)) == null) {
                                return;
                            }
                            s0VarA7.f(dVar, new d.e(new b(dVar, 1)));
                            return;
                        }
                        return;
                    default:
                        d.a aVar7 = d.f26580m;
                        dVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.garmin.com/privacy/connect/")));
                        return;
                }
            }
        });
        TextView textView9 = this.f26587g;
        if (textView9 == null) {
            s.m("otherChip");
            throw null;
        }
        final int i17 = 4;
        textView9.setOnClickListener(new View.OnClickListener(this) { // from class: ca1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f26576b;

            {
                this.f26576b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                s0<v2<da1.b>> s0VarA7;
                int i18 = i17;
                d dVar = this.f26576b;
                switch (i18) {
                    case 0:
                        d.a aVar = d.f26580m;
                        dVar.dismiss();
                        return;
                    case 1:
                        d.a aVar2 = d.f26580m;
                        dVar.f26590j = ea1.a.SEXUAL;
                        TextView textView10 = dVar.f26584d;
                        if (textView10 == null) {
                            s.m("sexualActivityChip");
                            throw null;
                        }
                        textView10.setSelected(true);
                        TextView textView11 = dVar.f26585e;
                        if (textView11 == null) {
                            s.m("spamChip");
                            throw null;
                        }
                        textView11.setSelected(false);
                        TextView textView12 = dVar.f26586f;
                        if (textView12 == null) {
                            s.m("copyrightViolationChip");
                            throw null;
                        }
                        textView12.setSelected(false);
                        TextView textView13 = dVar.f26587g;
                        if (textView13 == null) {
                            s.m("otherChip");
                            throw null;
                        }
                        textView13.setSelected(false);
                        AppCompatButton appCompatButton = dVar.f26588h;
                        if (appCompatButton == null) {
                            s.m("sendButton");
                            throw null;
                        }
                        appCompatButton.setEnabled(true);
                        dVar.u6(false);
                        return;
                    case 2:
                        d.a aVar3 = d.f26580m;
                        dVar.f26590j = ea1.a.SPAM;
                        TextView textView14 = dVar.f26584d;
                        if (textView14 == null) {
                            s.m("sexualActivityChip");
                            throw null;
                        }
                        textView14.setSelected(false);
                        TextView textView15 = dVar.f26585e;
                        if (textView15 == null) {
                            s.m("spamChip");
                            throw null;
                        }
                        textView15.setSelected(true);
                        TextView textView16 = dVar.f26586f;
                        if (textView16 == null) {
                            s.m("copyrightViolationChip");
                            throw null;
                        }
                        textView16.setSelected(false);
                        TextView textView17 = dVar.f26587g;
                        if (textView17 == null) {
                            s.m("otherChip");
                            throw null;
                        }
                        textView17.setSelected(false);
                        AppCompatButton appCompatButton2 = dVar.f26588h;
                        if (appCompatButton2 == null) {
                            s.m("sendButton");
                            throw null;
                        }
                        appCompatButton2.setEnabled(true);
                        dVar.u6(false);
                        return;
                    case 3:
                        d.a aVar4 = d.f26580m;
                        dVar.f26590j = ea1.a.COPYRIGHT;
                        TextView textView18 = dVar.f26584d;
                        if (textView18 == null) {
                            s.m("sexualActivityChip");
                            throw null;
                        }
                        textView18.setSelected(false);
                        TextView textView19 = dVar.f26585e;
                        if (textView19 == null) {
                            s.m("spamChip");
                            throw null;
                        }
                        textView19.setSelected(false);
                        TextView textView110 = dVar.f26586f;
                        if (textView110 == null) {
                            s.m("copyrightViolationChip");
                            throw null;
                        }
                        textView110.setSelected(true);
                        TextView textView111 = dVar.f26587g;
                        if (textView111 == null) {
                            s.m("otherChip");
                            throw null;
                        }
                        textView111.setSelected(false);
                        AppCompatButton appCompatButton3 = dVar.f26588h;
                        if (appCompatButton3 == null) {
                            s.m("sendButton");
                            throw null;
                        }
                        appCompatButton3.setEnabled(true);
                        dVar.u6(false);
                        return;
                    case 4:
                        d.a aVar5 = d.f26580m;
                        dVar.f26590j = ea1.a.OTHER;
                        TextView textView112 = dVar.f26584d;
                        if (textView112 == null) {
                            s.m("sexualActivityChip");
                            throw null;
                        }
                        textView112.setSelected(false);
                        TextView textView20 = dVar.f26585e;
                        if (textView20 == null) {
                            s.m("spamChip");
                            throw null;
                        }
                        textView20.setSelected(false);
                        TextView textView21 = dVar.f26586f;
                        if (textView21 == null) {
                            s.m("copyrightViolationChip");
                            throw null;
                        }
                        textView21.setSelected(false);
                        TextView textView22 = dVar.f26587g;
                        if (textView22 == null) {
                            s.m("otherChip");
                            throw null;
                        }
                        textView22.setSelected(true);
                        AppCompatButton appCompatButton4 = dVar.f26588h;
                        if (appCompatButton4 == null) {
                            s.m("sendButton");
                            throw null;
                        }
                        appCompatButton4.setEnabled(g22.n.d(dVar.f26591k));
                        dVar.u6(true);
                        return;
                    case 5:
                        ea1.a aVar6 = dVar.f26590j;
                        if (aVar6 != null) {
                            if (aVar6 == ea1.a.OTHER) {
                                MultiLineImeEditText multiLineImeEditText2 = dVar.f26582b;
                                if (multiLineImeEditText2 == null) {
                                    s.m("multiLineImeEditText");
                                    throw null;
                                }
                                dVar.f26591k = String.valueOf(multiLineImeEditText2.getText());
                            }
                            d.b bVar = dVar.f26592l;
                            if (bVar == null || (s0VarA7 = bVar.A7(aVar6, dVar.f26591k)) == null) {
                                return;
                            }
                            s0VarA7.f(dVar, new d.e(new b(dVar, 1)));
                            return;
                        }
                        return;
                    default:
                        d.a aVar7 = d.f26580m;
                        dVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.garmin.com/privacy/connect/")));
                        return;
                }
            }
        });
        MultiLineImeEditText multiLineImeEditText2 = this.f26582b;
        if (multiLineImeEditText2 == null) {
            s.m("multiLineImeEditText");
            throw null;
        }
        multiLineImeEditText2.setTextEntryDoneListener(new ca1.c(this));
        MultiLineImeEditText multiLineImeEditText3 = this.f26582b;
        if (multiLineImeEditText3 == null) {
            s.m("multiLineImeEditText");
            throw null;
        }
        multiLineImeEditText3.setTextUpdatedListener(new ca1.c(this));
        AppCompatButton appCompatButton = this.f26588h;
        if (appCompatButton == null) {
            s.m("sendButton");
            throw null;
        }
        final int i18 = 5;
        appCompatButton.setOnClickListener(new View.OnClickListener(this) { // from class: ca1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f26576b;

            {
                this.f26576b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                s0<v2<da1.b>> s0VarA7;
                int i19 = i18;
                d dVar = this.f26576b;
                switch (i19) {
                    case 0:
                        d.a aVar = d.f26580m;
                        dVar.dismiss();
                        return;
                    case 1:
                        d.a aVar2 = d.f26580m;
                        dVar.f26590j = ea1.a.SEXUAL;
                        TextView textView10 = dVar.f26584d;
                        if (textView10 == null) {
                            s.m("sexualActivityChip");
                            throw null;
                        }
                        textView10.setSelected(true);
                        TextView textView11 = dVar.f26585e;
                        if (textView11 == null) {
                            s.m("spamChip");
                            throw null;
                        }
                        textView11.setSelected(false);
                        TextView textView12 = dVar.f26586f;
                        if (textView12 == null) {
                            s.m("copyrightViolationChip");
                            throw null;
                        }
                        textView12.setSelected(false);
                        TextView textView13 = dVar.f26587g;
                        if (textView13 == null) {
                            s.m("otherChip");
                            throw null;
                        }
                        textView13.setSelected(false);
                        AppCompatButton appCompatButton2 = dVar.f26588h;
                        if (appCompatButton2 == null) {
                            s.m("sendButton");
                            throw null;
                        }
                        appCompatButton2.setEnabled(true);
                        dVar.u6(false);
                        return;
                    case 2:
                        d.a aVar3 = d.f26580m;
                        dVar.f26590j = ea1.a.SPAM;
                        TextView textView14 = dVar.f26584d;
                        if (textView14 == null) {
                            s.m("sexualActivityChip");
                            throw null;
                        }
                        textView14.setSelected(false);
                        TextView textView15 = dVar.f26585e;
                        if (textView15 == null) {
                            s.m("spamChip");
                            throw null;
                        }
                        textView15.setSelected(true);
                        TextView textView16 = dVar.f26586f;
                        if (textView16 == null) {
                            s.m("copyrightViolationChip");
                            throw null;
                        }
                        textView16.setSelected(false);
                        TextView textView17 = dVar.f26587g;
                        if (textView17 == null) {
                            s.m("otherChip");
                            throw null;
                        }
                        textView17.setSelected(false);
                        AppCompatButton appCompatButton3 = dVar.f26588h;
                        if (appCompatButton3 == null) {
                            s.m("sendButton");
                            throw null;
                        }
                        appCompatButton3.setEnabled(true);
                        dVar.u6(false);
                        return;
                    case 3:
                        d.a aVar4 = d.f26580m;
                        dVar.f26590j = ea1.a.COPYRIGHT;
                        TextView textView18 = dVar.f26584d;
                        if (textView18 == null) {
                            s.m("sexualActivityChip");
                            throw null;
                        }
                        textView18.setSelected(false);
                        TextView textView19 = dVar.f26585e;
                        if (textView19 == null) {
                            s.m("spamChip");
                            throw null;
                        }
                        textView19.setSelected(false);
                        TextView textView110 = dVar.f26586f;
                        if (textView110 == null) {
                            s.m("copyrightViolationChip");
                            throw null;
                        }
                        textView110.setSelected(true);
                        TextView textView111 = dVar.f26587g;
                        if (textView111 == null) {
                            s.m("otherChip");
                            throw null;
                        }
                        textView111.setSelected(false);
                        AppCompatButton appCompatButton4 = dVar.f26588h;
                        if (appCompatButton4 == null) {
                            s.m("sendButton");
                            throw null;
                        }
                        appCompatButton4.setEnabled(true);
                        dVar.u6(false);
                        return;
                    case 4:
                        d.a aVar5 = d.f26580m;
                        dVar.f26590j = ea1.a.OTHER;
                        TextView textView112 = dVar.f26584d;
                        if (textView112 == null) {
                            s.m("sexualActivityChip");
                            throw null;
                        }
                        textView112.setSelected(false);
                        TextView textView20 = dVar.f26585e;
                        if (textView20 == null) {
                            s.m("spamChip");
                            throw null;
                        }
                        textView20.setSelected(false);
                        TextView textView21 = dVar.f26586f;
                        if (textView21 == null) {
                            s.m("copyrightViolationChip");
                            throw null;
                        }
                        textView21.setSelected(false);
                        TextView textView22 = dVar.f26587g;
                        if (textView22 == null) {
                            s.m("otherChip");
                            throw null;
                        }
                        textView22.setSelected(true);
                        AppCompatButton appCompatButton5 = dVar.f26588h;
                        if (appCompatButton5 == null) {
                            s.m("sendButton");
                            throw null;
                        }
                        appCompatButton5.setEnabled(g22.n.d(dVar.f26591k));
                        dVar.u6(true);
                        return;
                    case 5:
                        ea1.a aVar6 = dVar.f26590j;
                        if (aVar6 != null) {
                            if (aVar6 == ea1.a.OTHER) {
                                MultiLineImeEditText multiLineImeEditText4 = dVar.f26582b;
                                if (multiLineImeEditText4 == null) {
                                    s.m("multiLineImeEditText");
                                    throw null;
                                }
                                dVar.f26591k = String.valueOf(multiLineImeEditText4.getText());
                            }
                            d.b bVar = dVar.f26592l;
                            if (bVar == null || (s0VarA7 = bVar.A7(aVar6, dVar.f26591k)) == null) {
                                return;
                            }
                            s0VarA7.f(dVar, new d.e(new b(dVar, 1)));
                            return;
                        }
                        return;
                    default:
                        d.a aVar7 = d.f26580m;
                        dVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.garmin.com/privacy/connect/")));
                        return;
                }
            }
        });
        ImageView imageView = this.f26589i;
        if (imageView == null) {
            s.m("iconHelp");
            throw null;
        }
        final int i19 = 6;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: ca1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f26576b;

            {
                this.f26576b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                s0<v2<da1.b>> s0VarA7;
                int i110 = i19;
                d dVar = this.f26576b;
                switch (i110) {
                    case 0:
                        d.a aVar = d.f26580m;
                        dVar.dismiss();
                        return;
                    case 1:
                        d.a aVar2 = d.f26580m;
                        dVar.f26590j = ea1.a.SEXUAL;
                        TextView textView10 = dVar.f26584d;
                        if (textView10 == null) {
                            s.m("sexualActivityChip");
                            throw null;
                        }
                        textView10.setSelected(true);
                        TextView textView11 = dVar.f26585e;
                        if (textView11 == null) {
                            s.m("spamChip");
                            throw null;
                        }
                        textView11.setSelected(false);
                        TextView textView12 = dVar.f26586f;
                        if (textView12 == null) {
                            s.m("copyrightViolationChip");
                            throw null;
                        }
                        textView12.setSelected(false);
                        TextView textView13 = dVar.f26587g;
                        if (textView13 == null) {
                            s.m("otherChip");
                            throw null;
                        }
                        textView13.setSelected(false);
                        AppCompatButton appCompatButton2 = dVar.f26588h;
                        if (appCompatButton2 == null) {
                            s.m("sendButton");
                            throw null;
                        }
                        appCompatButton2.setEnabled(true);
                        dVar.u6(false);
                        return;
                    case 2:
                        d.a aVar3 = d.f26580m;
                        dVar.f26590j = ea1.a.SPAM;
                        TextView textView14 = dVar.f26584d;
                        if (textView14 == null) {
                            s.m("sexualActivityChip");
                            throw null;
                        }
                        textView14.setSelected(false);
                        TextView textView15 = dVar.f26585e;
                        if (textView15 == null) {
                            s.m("spamChip");
                            throw null;
                        }
                        textView15.setSelected(true);
                        TextView textView16 = dVar.f26586f;
                        if (textView16 == null) {
                            s.m("copyrightViolationChip");
                            throw null;
                        }
                        textView16.setSelected(false);
                        TextView textView17 = dVar.f26587g;
                        if (textView17 == null) {
                            s.m("otherChip");
                            throw null;
                        }
                        textView17.setSelected(false);
                        AppCompatButton appCompatButton3 = dVar.f26588h;
                        if (appCompatButton3 == null) {
                            s.m("sendButton");
                            throw null;
                        }
                        appCompatButton3.setEnabled(true);
                        dVar.u6(false);
                        return;
                    case 3:
                        d.a aVar4 = d.f26580m;
                        dVar.f26590j = ea1.a.COPYRIGHT;
                        TextView textView18 = dVar.f26584d;
                        if (textView18 == null) {
                            s.m("sexualActivityChip");
                            throw null;
                        }
                        textView18.setSelected(false);
                        TextView textView19 = dVar.f26585e;
                        if (textView19 == null) {
                            s.m("spamChip");
                            throw null;
                        }
                        textView19.setSelected(false);
                        TextView textView110 = dVar.f26586f;
                        if (textView110 == null) {
                            s.m("copyrightViolationChip");
                            throw null;
                        }
                        textView110.setSelected(true);
                        TextView textView111 = dVar.f26587g;
                        if (textView111 == null) {
                            s.m("otherChip");
                            throw null;
                        }
                        textView111.setSelected(false);
                        AppCompatButton appCompatButton4 = dVar.f26588h;
                        if (appCompatButton4 == null) {
                            s.m("sendButton");
                            throw null;
                        }
                        appCompatButton4.setEnabled(true);
                        dVar.u6(false);
                        return;
                    case 4:
                        d.a aVar5 = d.f26580m;
                        dVar.f26590j = ea1.a.OTHER;
                        TextView textView112 = dVar.f26584d;
                        if (textView112 == null) {
                            s.m("sexualActivityChip");
                            throw null;
                        }
                        textView112.setSelected(false);
                        TextView textView20 = dVar.f26585e;
                        if (textView20 == null) {
                            s.m("spamChip");
                            throw null;
                        }
                        textView20.setSelected(false);
                        TextView textView21 = dVar.f26586f;
                        if (textView21 == null) {
                            s.m("copyrightViolationChip");
                            throw null;
                        }
                        textView21.setSelected(false);
                        TextView textView22 = dVar.f26587g;
                        if (textView22 == null) {
                            s.m("otherChip");
                            throw null;
                        }
                        textView22.setSelected(true);
                        AppCompatButton appCompatButton5 = dVar.f26588h;
                        if (appCompatButton5 == null) {
                            s.m("sendButton");
                            throw null;
                        }
                        appCompatButton5.setEnabled(g22.n.d(dVar.f26591k));
                        dVar.u6(true);
                        return;
                    case 5:
                        ea1.a aVar6 = dVar.f26590j;
                        if (aVar6 != null) {
                            if (aVar6 == ea1.a.OTHER) {
                                MultiLineImeEditText multiLineImeEditText4 = dVar.f26582b;
                                if (multiLineImeEditText4 == null) {
                                    s.m("multiLineImeEditText");
                                    throw null;
                                }
                                dVar.f26591k = String.valueOf(multiLineImeEditText4.getText());
                            }
                            d.b bVar = dVar.f26592l;
                            if (bVar == null || (s0VarA7 = bVar.A7(aVar6, dVar.f26591k)) == null) {
                                return;
                            }
                            s0VarA7.f(dVar, new d.e(new b(dVar, 1)));
                            return;
                        }
                        return;
                    default:
                        d.a aVar7 = d.f26580m;
                        dVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.garmin.com/privacy/connect/")));
                        return;
                }
            }
        });
        StyledInlineSingleTextFieldViewDark styledInlineSingleTextFieldViewDark3 = this.f26581a;
        if (styledInlineSingleTextFieldViewDark3 == null) {
            s.m("reportImageTextField");
            throw null;
        }
        String str = this.f26591k;
        if (str == null) {
            str = "";
        }
        styledInlineSingleTextFieldViewDark3.i(new h32.e.d(str, "", 300, null, new k(this, 14), new ca1.b(this, 0), null, null, 147457, false, null, null, 3784, null));
        StyledInlineSingleTextFieldViewDark styledInlineSingleTextFieldViewDark4 = this.f26581a;
        if (styledInlineSingleTextFieldViewDark4 == null) {
            s.m("reportImageTextField");
            throw null;
        }
        styledInlineSingleTextFieldViewDark4.invalidate();
        final int i24 = 0;
        ((ImageView) view2.findViewById(R.id.modal_close_button)).setOnClickListener(new View.OnClickListener(this) { // from class: ca1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f26576b;

            {
                this.f26576b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                s0<v2<da1.b>> s0VarA7;
                int i110 = i24;
                d dVar = this.f26576b;
                switch (i110) {
                    case 0:
                        d.a aVar = d.f26580m;
                        dVar.dismiss();
                        return;
                    case 1:
                        d.a aVar2 = d.f26580m;
                        dVar.f26590j = ea1.a.SEXUAL;
                        TextView textView10 = dVar.f26584d;
                        if (textView10 == null) {
                            s.m("sexualActivityChip");
                            throw null;
                        }
                        textView10.setSelected(true);
                        TextView textView11 = dVar.f26585e;
                        if (textView11 == null) {
                            s.m("spamChip");
                            throw null;
                        }
                        textView11.setSelected(false);
                        TextView textView12 = dVar.f26586f;
                        if (textView12 == null) {
                            s.m("copyrightViolationChip");
                            throw null;
                        }
                        textView12.setSelected(false);
                        TextView textView13 = dVar.f26587g;
                        if (textView13 == null) {
                            s.m("otherChip");
                            throw null;
                        }
                        textView13.setSelected(false);
                        AppCompatButton appCompatButton2 = dVar.f26588h;
                        if (appCompatButton2 == null) {
                            s.m("sendButton");
                            throw null;
                        }
                        appCompatButton2.setEnabled(true);
                        dVar.u6(false);
                        return;
                    case 2:
                        d.a aVar3 = d.f26580m;
                        dVar.f26590j = ea1.a.SPAM;
                        TextView textView14 = dVar.f26584d;
                        if (textView14 == null) {
                            s.m("sexualActivityChip");
                            throw null;
                        }
                        textView14.setSelected(false);
                        TextView textView15 = dVar.f26585e;
                        if (textView15 == null) {
                            s.m("spamChip");
                            throw null;
                        }
                        textView15.setSelected(true);
                        TextView textView16 = dVar.f26586f;
                        if (textView16 == null) {
                            s.m("copyrightViolationChip");
                            throw null;
                        }
                        textView16.setSelected(false);
                        TextView textView17 = dVar.f26587g;
                        if (textView17 == null) {
                            s.m("otherChip");
                            throw null;
                        }
                        textView17.setSelected(false);
                        AppCompatButton appCompatButton3 = dVar.f26588h;
                        if (appCompatButton3 == null) {
                            s.m("sendButton");
                            throw null;
                        }
                        appCompatButton3.setEnabled(true);
                        dVar.u6(false);
                        return;
                    case 3:
                        d.a aVar4 = d.f26580m;
                        dVar.f26590j = ea1.a.COPYRIGHT;
                        TextView textView18 = dVar.f26584d;
                        if (textView18 == null) {
                            s.m("sexualActivityChip");
                            throw null;
                        }
                        textView18.setSelected(false);
                        TextView textView19 = dVar.f26585e;
                        if (textView19 == null) {
                            s.m("spamChip");
                            throw null;
                        }
                        textView19.setSelected(false);
                        TextView textView110 = dVar.f26586f;
                        if (textView110 == null) {
                            s.m("copyrightViolationChip");
                            throw null;
                        }
                        textView110.setSelected(true);
                        TextView textView111 = dVar.f26587g;
                        if (textView111 == null) {
                            s.m("otherChip");
                            throw null;
                        }
                        textView111.setSelected(false);
                        AppCompatButton appCompatButton4 = dVar.f26588h;
                        if (appCompatButton4 == null) {
                            s.m("sendButton");
                            throw null;
                        }
                        appCompatButton4.setEnabled(true);
                        dVar.u6(false);
                        return;
                    case 4:
                        d.a aVar5 = d.f26580m;
                        dVar.f26590j = ea1.a.OTHER;
                        TextView textView112 = dVar.f26584d;
                        if (textView112 == null) {
                            s.m("sexualActivityChip");
                            throw null;
                        }
                        textView112.setSelected(false);
                        TextView textView20 = dVar.f26585e;
                        if (textView20 == null) {
                            s.m("spamChip");
                            throw null;
                        }
                        textView20.setSelected(false);
                        TextView textView21 = dVar.f26586f;
                        if (textView21 == null) {
                            s.m("copyrightViolationChip");
                            throw null;
                        }
                        textView21.setSelected(false);
                        TextView textView22 = dVar.f26587g;
                        if (textView22 == null) {
                            s.m("otherChip");
                            throw null;
                        }
                        textView22.setSelected(true);
                        AppCompatButton appCompatButton5 = dVar.f26588h;
                        if (appCompatButton5 == null) {
                            s.m("sendButton");
                            throw null;
                        }
                        appCompatButton5.setEnabled(g22.n.d(dVar.f26591k));
                        dVar.u6(true);
                        return;
                    case 5:
                        ea1.a aVar6 = dVar.f26590j;
                        if (aVar6 != null) {
                            if (aVar6 == ea1.a.OTHER) {
                                MultiLineImeEditText multiLineImeEditText4 = dVar.f26582b;
                                if (multiLineImeEditText4 == null) {
                                    s.m("multiLineImeEditText");
                                    throw null;
                                }
                                dVar.f26591k = String.valueOf(multiLineImeEditText4.getText());
                            }
                            d.b bVar = dVar.f26592l;
                            if (bVar == null || (s0VarA7 = bVar.A7(aVar6, dVar.f26591k)) == null) {
                                return;
                            }
                            s0VarA7.f(dVar, new d.e(new b(dVar, 1)));
                            return;
                        }
                        return;
                    default:
                        d.a aVar7 = d.f26580m;
                        dVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.garmin.com/privacy/connect/")));
                        return;
                }
            }
        });
    }

    public final void u6(boolean z14) {
        MultiLineImeEditText multiLineImeEditText = this.f26582b;
        if (multiLineImeEditText == null) {
            s.m("multiLineImeEditText");
            throw null;
        }
        multiLineImeEditText.setVisibility(z14 ? 0 : 8);
        StyledInlineSingleTextFieldViewDark styledInlineSingleTextFieldViewDark = this.f26581a;
        if (styledInlineSingleTextFieldViewDark == null) {
            s.m("reportImageTextField");
            throw null;
        }
        styledInlineSingleTextFieldViewDark.setVisibility(z14 ? 0 : 8);
        TextView textView = this.f26583c;
        if (textView != null) {
            textView.setVisibility(z14 ? 0 : 8);
        } else {
            s.m("textFieldHeader");
            throw null;
        }
    }

    public final void v6(String str, String str2, da1.b bVar) {
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(requireContext(), R.style.Theme_Gcm_Dialog);
        aVar.setTitle(str);
        aVar.setMessage(str2);
        aVar.setCancelable(false);
        aVar.setPositiveButton(R.string.lbl_ok, new ag0.d(8, this, bVar));
        aVar.show();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lca1/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "PRIVACY_LINK", "gcm-photo_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static d a(Activity activity) {
            if ((activity instanceof c ? (c) activity : null) != null) {
                return new d();
            }
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.p(a2Var, "ReportThisImageFragment", "The activity that is associated with this fragment should implement ReportThisImageDelegateProvider.");
            return null;
        }

        private a() {
        }
    }
}
