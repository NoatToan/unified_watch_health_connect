package com.garmin.android.apps.connectmobile.social;

import am.c2;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.m;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import bv.g;
import c22.b3;
import com.daasuu.bl.BubbleLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.o0;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import com.garmin.android.apps.connectmobile.tag.TaggableEditText;
import com.garmin.android.apps.connectmobile.view.view_3_0.PostCommentView;
import do1.h;
import do1.j;
import do1.k;
import do1.l;
import do1.q;
import fo1.e1;
import fo1.p0;
import fo1.s1;
import fo1.u0;
import fo1.y0;
import fw.p;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.c0;
import p13.u;
import v.e0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0007\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/b;", "Lcom/garmin/android/apps/connectmobile/o0;", "Lcom/garmin/android/apps/connectmobile/view/view_3_0/PostCommentView$b;", "Lcs1/f;", "Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/details/e$b;", "<init>", "()V", "b", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class b extends o0 implements PostCommentView.b, cs1.f, com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.b {
    public static final a T0 = new a(null);
    public BubbleLayout A;
    public boolean B;
    public boolean C;
    public PostCommentView D;
    public TextView E;
    public com.garmin.android.apps.connectmobile.social.e F;
    public Parcelable H0;
    public com.garmin.android.apps.connectmobile.tag.b I;
    public final h I0;
    public mo1.d J0;
    public InterfaceC0842b K0;
    public View L0;
    public View M0;
    public View N0;
    public boolean O0;
    public FrameLayout P;
    public boolean P0;
    public int Q0;
    public final h R0;
    public final d S0;
    public final q T;
    public fo1.o0 X;
    public final l Y;
    public final h Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public String f44514k0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f44515w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public c2 f44516x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f44517y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f44518z;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.social.b$b, reason: collision with other inner class name */
    public interface InterfaceC0842b {
        void r1(int i14);
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f44520b;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f44519a = iArr;
            int[] iArr2 = new int[c2.values().length];
            try {
                iArr2[c2.ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[c2.DAILY_SUMMARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[c2.AUTO_CHALLENGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[c2.SEGMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f44520b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/social/b$d", "Lpo1/b;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements po1.b {
        public d() {
        }

        @Override // po1.b
        public final void F() {
            TextView textView = b.this.E;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }

        @Override // pi2.b
        public final String getIdentifier() {
            String str = b.this.f44515w;
            str.getClass();
            return str;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f44522a;

        public e(e23.l lVar) {
            lVar.getClass();
            this.f44522a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f44522a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f44522a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/social/b$f", "Landroid/text/TextWatcher;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f implements TextWatcher {
        public f() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            editable.getClass();
            b.this.f7();
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
            charSequence.getClass();
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
            charSequence.getClass();
        }
    }

    public b() {
        Object obj = KoinJavaComponent.get$default(g.class, null, null, 6, null);
        obj.getClass();
        this.T = ((g) obj).a();
        this.Y = new l(0);
        this.Z = new h(this, 2);
        this.I0 = new h(this, 3);
        this.R0 = new h(this, 4);
        this.S0 = new d();
    }

    @Override // com.garmin.android.apps.connectmobile.o0
    public final int A6() {
        return 999;
    }

    @Override // com.garmin.android.apps.connectmobile.o0
    /* JADX INFO: renamed from: C6 */
    public final String getF39648t() {
        return "";
    }

    @Override // com.garmin.android.apps.connectmobile.o0
    public final String E6() {
        return "";
    }

    @Override // com.garmin.android.apps.connectmobile.o0
    public final boolean G6() {
        return false;
    }

    @Override // com.garmin.android.apps.connectmobile.o0
    public final void H6(int i14, int i15) {
        X6();
    }

    @Override // com.garmin.android.apps.connectmobile.o0
    public final void I6() {
        this.f44517y = true;
        X6();
        PostCommentView postCommentView = this.D;
        if (postCommentView != null) {
            postCommentView.k();
        }
    }

    public void T6(Editable editable) {
        ConversationCommentDTO conversationCommentDTO = new ConversationCommentDTO();
        conversationCommentDTO.f44555j = editable.toString();
        conversationCommentDTO.f44562q = cs1.h.b(editable);
        PostCommentView postCommentView = this.D;
        if (postCommentView != null) {
            postCommentView.setCommentText("");
        }
        String strV6 = V6(conversationCommentDTO);
        mo1.d dVar = this.J0;
        if (dVar != null && dVar.getUuid() != null) {
            mo1.d dVar2 = this.J0;
            dVar2.getClass();
            String uuid = dVar2.getUuid();
            uuid.getClass();
            U6(uuid, strV6, conversationCommentDTO);
            return;
        }
        if (this.J0 != null) {
            d7(strV6);
            lj0.b bVar = lj0.b.f112956j;
            bVar.getClass();
            g22.e.b(this, bVar);
            return;
        }
        if (this.f44516x == null || this.f44515w == null) {
            return;
        }
        fo1.o0 o0VarY6 = Y6();
        c2 c2Var = this.f44516x;
        c2Var.getClass();
        String str = this.f44515w;
        str.getClass();
        m.a(null, new y0(o0VarY6, c2Var, str, null), 3).f(this, new e(new ci0.b(this, 9, conversationCommentDTO, strV6)));
    }

    public final void U6(String str, String str2, ConversationCommentDTO conversationCommentDTO) {
        conversationCommentDTO.f44547b = str;
        fo1.o0 o0VarY6 = Y6();
        dh.b.L(xy2.b.K(o0VarY6, new p0(o0VarY6, str, conversationCommentDTO, null)), this, new e(new cn1.d(21, this, str2)));
    }

    public final String V6(ConversationCommentDTO conversationCommentDTO) {
        ConversationCommentDTO conversationCommentDTO2 = new ConversationCommentDTO();
        conversationCommentDTO2.f44555j = conversationCommentDTO.f44555j;
        conversationCommentDTO2.f44562q = conversationCommentDTO.f44562q;
        com.garmin.android.apps.connectmobile.social.e eVar = this.F;
        eVar.getClass();
        String strValueOf = String.valueOf(eVar.getCount());
        conversationCommentDTO2.f44560o = true;
        conversationCommentDTO2.f44546a = strValueOf;
        conversationCommentDTO2.f44549d = new Date();
        conversationCommentDTO2.f44550e = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName();
        conversationCommentDTO2.f44551f = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserFullName();
        f12.l lVar = (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
        String strZ4 = lVar.z4("PREMIUM_FRIEND");
        if (strZ4 == null) {
            strZ4 = lVar.q4();
        }
        String str = strZ4;
        conversationCommentDTO2.f44552g = str;
        conversationCommentDTO2.f44561p = new b12.b(str, null, null, null, null, 30, null);
        com.garmin.android.apps.connectmobile.social.e eVar2 = this.F;
        if (eVar2 != null) {
            eVar2.add(conversationCommentDTO2);
        }
        c7();
        com.garmin.android.apps.connectmobile.social.e eVar3 = this.F;
        if (eVar3 != null) {
            eVar3.d(strValueOf);
        }
        return strValueOf;
    }

    public void X6() {
        fo1.o0 o0VarY6 = Y6();
        Context context = getContext();
        if (context == null) {
            return;
        }
        dh.b.L(m.a(null, new u0(o0VarY6, context, this.f44517y, new e1(o0VarY6, null), null), 3), this, new e(new j(this, 1)));
    }

    public final fo1.o0 Y6() {
        fo1.o0 o0Var = this.X;
        if (o0Var != null) {
            return o0Var;
        }
        s.m("conversationViewModel");
        throw null;
    }

    public final void c7() {
        com.garmin.android.apps.connectmobile.social.e eVar = this.F;
        if (eVar != null) {
            eVar.getClass();
            int count = eVar.getCount() - 1;
            if (count < 0) {
                count = 0;
            }
            u6();
            this.f7311e.setSelection(count);
        }
    }

    public final void d7(String str) {
        int iC;
        str.getClass();
        com.garmin.android.apps.connectmobile.social.e eVar = this.F;
        if (eVar != null && (iC = eVar.c(str)) >= 0) {
            List<ConversationCommentDTO> list = eVar.f44579c;
            list.getClass();
            list.remove(iC);
            eVar.notifyDataSetChanged();
        }
        com.garmin.android.apps.connectmobile.social.e eVar2 = this.F;
        if (eVar2 != null) {
            eVar2.a(str);
        }
    }

    public final void e7(String str, ConversationCommentDTO conversationCommentDTO) {
        int iC;
        conversationCommentDTO.getClass();
        str.getClass();
        conversationCommentDTO.f44551f = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserFullName();
        f12.l lVar = (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
        String strZ4 = lVar.z4("PREMIUM_FRIEND");
        if (strZ4 == null) {
            strZ4 = lVar.q4();
        }
        String str2 = strZ4;
        conversationCommentDTO.f44552g = str2;
        conversationCommentDTO.f44561p = new b12.b(str2, null, null, null, null, 30, null);
        com.garmin.android.apps.connectmobile.social.e eVar = this.F;
        if (eVar != null && (iC = eVar.c(str)) >= 0) {
            List<ConversationCommentDTO> list = eVar.f44579c;
            list.getClass();
            list.set(iC, conversationCommentDTO);
            eVar.notifyDataSetChanged();
            com.garmin.android.apps.connectmobile.social.e eVar2 = this.F;
            if (eVar2 != null) {
                eVar2.a(str);
            }
            c7();
        }
        InterfaceC0842b interfaceC0842b = this.K0;
        if (interfaceC0842b != null) {
            int i14 = this.Q0 + 1;
            this.Q0 = i14;
            interfaceC0842b.r1(i14);
        }
    }

    public void f7() {
        this.T.b();
        BubbleLayout bubbleLayout = this.A;
        if (bubbleLayout != null) {
            bubbleLayout.setVisibility(8);
        }
        this.B = false;
    }

    @Override // com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.b
    public final void g0(boolean z14) {
        if (this.A != null) {
            boolean z15 = z14 && this.T.a();
            boolean z16 = this.B || z15;
            this.B = z15;
            BubbleLayout bubbleLayout = this.A;
            if (bubbleLayout != null) {
                v22.e.r(bubbleLayout, z16);
            }
        }
    }

    public final void g7(List<? extends ConversationCommentDTO> list) {
        int size = list != null ? list.size() : 0;
        K6(size);
        if (this.J0 == null && size > 0) {
            if ((list != null ? list.get(0) : null) != null) {
                mo1.d dVar = new mo1.d(null, 0L, null, null, false, 0, 0, null, null, null, null, null, null, 8191, null);
                this.J0 = dVar;
                dVar.s(list.get(0).f44547b);
            }
        }
        if (this.f44517y) {
            this.f44517y = false;
            com.garmin.android.apps.connectmobile.social.e eVar = this.F;
            if (eVar != null) {
                eVar.clear();
            }
        }
        if (this.F != null) {
            if (list != null) {
                if (!list.isEmpty()) {
                    c0.u(new ArrayList(list), new a61.c(new d50.b(11), 8));
                }
                com.garmin.android.apps.connectmobile.social.e eVar2 = this.F;
                if (eVar2 != null) {
                    eVar2.addAll(list);
                }
            }
            c7();
        }
    }

    public final void h7(ConversationCommentDTO conversationCommentDTO, Integer num, boolean z14) {
        if (getActivity() != null) {
            String strG = e0.g("Error ", z14 ? "liking" : "unliking", " comment ID [", conversationCommentDTO.f44546a, "].");
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "CommentsListFragment", strG);
            com.garmin.android.apps.connectmobile.social.e eVar = this.F;
            if (eVar != null) {
                String str = conversationCommentDTO.f44546a;
                str.getClass();
                eVar.a(str);
            }
            if (zy0.g.a(num)) {
                b3.c(requireActivity());
            } else {
                if (zy0.g.b(num)) {
                    return;
                }
                lj0.b bVar = lj0.b.f112956j;
                bVar.getClass();
                g22.e.b(this, bVar);
            }
        }
    }

    public void i7(View view2) {
        if (this.C) {
            BubbleLayout bubbleLayout = (BubbleLayout) view2.findViewById(R.id.tool_tip_container);
            this.A = bubbleLayout;
            if (bubbleLayout != null) {
                String string = getString(R.string.social_add_comment_tagging_hint);
                string.getClass();
                og.a.Y(bubbleLayout, string);
            }
            BubbleLayout bubbleLayout2 = this.A;
            if (bubbleLayout2 != null) {
                bubbleLayout2.setOnClickListener(new h(this, 0));
            }
            TextView textView = (TextView) view2.findViewById(R.id.comment_tooltip);
            if (textView != null) {
                textView.setText(getString(R.string.social_add_comment_tagging_hint));
            }
            PostCommentView postCommentView = this.D;
            if (postCommentView != null) {
                f fVar = new f();
                TaggableEditText taggableEditText = postCommentView.f47848c;
                if (taggableEditText != null) {
                    taggableEditText.addTextChangedListener(fVar);
                }
            }
            PostCommentView postCommentView2 = this.D;
            if (postCommentView2 != null) {
                postCommentView2.setCommentHint(getString(R.string.social_add_comment_hint));
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.view.view_3_0.PostCommentView.b
    public final void m6(Editable editable) {
        T6(editable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.K0 = (InterfaceC0842b) context;
        } catch (ClassCastException unused) {
            wr.g.u(context, " must implement OnCommentListEditedListener");
        }
    }

    @Override // com.garmin.android.apps.connectmobile.o0, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("GCM_conversation_resource_type");
            string.getClass();
            this.f44516x = c2.valueOf(string);
            this.f44515w = arguments.getString("GCM_conversation_resource_id");
            this.f44514k0 = arguments.getString("GCM_conversation_owner_display_name");
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("GCM_news_feed_item", Parcelable.class);
            } else {
                parcelable = arguments.getParcelable("GCM_news_feed_item");
                if (!(parcelable instanceof Parcelable)) {
                    parcelable = null;
                }
            }
            this.H0 = parcelable;
            this.O0 = arguments.getBoolean("GCM_conversation_allow_detail_view_navigation", true);
            this.f44518z = arguments.getBoolean("extra_disable_social", false);
            this.P0 = arguments.getBoolean("GCM_conversation_open_keyboard", false);
        }
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        x1 x1Var = new x1(mVarRequireActivity);
        t0 t0Var = s0.f105811a;
        this.I = (com.garmin.android.apps.connectmobile.tag.b) x1Var.b(t0Var.b(com.garmin.android.apps.connectmobile.tag.b.class));
        String str = this.f44514k0;
        s1 s1Var = new s1(this.f44516x, this.f44515w, null, this.H0, str != null && str.equalsIgnoreCase(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName()), false, this.P0, true);
        y1 viewModelStore = getF189591b();
        viewModelStore.getClass();
        this.X = (fo1.o0) new x1(viewModelStore, s1Var, null, 4, null).b(t0Var.b(fo1.o0.class));
        this.C = u.z(new c2[]{c2.ACTIVITY}, this.f44516x);
    }

    @Override // com.garmin.android.apps.connectmobile.o0, androidx.fragment.app.n0, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PostCommentView postCommentView;
        TaggableEditText taggableEditText;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.gcm_news_feed_add_comment, viewGroup, false);
        c2 c2Var = this.f44516x;
        int i14 = c2Var == null ? -1 : c.f44520b[c2Var.ordinal()];
        if (i14 == 1 || i14 == 2) {
            this.M0 = layoutInflater.inflate(R.layout.gcm_connections_news_feed_list_item_3_0, (ViewGroup) null, false);
            this.L0 = layoutInflater.inflate(R.layout.gcm_connections_news_feed_list_item_3_0, (ViewGroup) null, false);
        } else if (i14 == 3) {
            this.M0 = layoutInflater.inflate(R.layout.gcm3_challenges_header_layout, (ViewGroup) null, false);
            this.L0 = layoutInflater.inflate(R.layout.gcm3_challenges_header_layout, (ViewGroup) null, false);
        } else if (i14 == 4) {
            this.M0 = layoutInflater.inflate(R.layout.gcm3_segment_detail_top_section, (ViewGroup) null, false);
            this.L0 = layoutInflater.inflate(R.layout.gcm3_segment_detail_top_section, (ViewGroup) null, false);
        }
        if (this.f44516x == c2.AUTO_CHALLENGE && this.f44518z) {
            View viewInflate2 = layoutInflater.inflate(R.layout.activity_list_footer, (ViewGroup) null, false);
            this.N0 = viewInflate2;
            View viewFindViewById = viewInflate2 != null ? viewInflate2.findViewById(R.id.footer_text) : null;
            viewFindViewById.getClass();
            ((TextView) viewFindViewById).setText(R.string.social_commeting_no_longer_available_message);
        }
        ((FrameLayout) viewInflate.findViewById(R.id.empty_header_news_item)).addView(this.L0);
        if (this.O0) {
            View view2 = this.M0;
            h hVar = this.I0;
            if (view2 != null) {
                view2.setOnClickListener(hVar);
            }
            View view3 = this.L0;
            if (view3 != null) {
                view3.setOnClickListener(hVar);
            }
        }
        this.P = (FrameLayout) viewInflate.findViewById(R.id.suggestion_container);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(new z3.e(1301608981, true, new k(this, 0)));
        FrameLayout frameLayout = this.P;
        if (frameLayout != null) {
            frameLayout.addView(composeView);
        }
        PostCommentView postCommentView2 = (PostCommentView) viewInflate.findViewById(R.id.post_comment_view);
        this.D = postCommentView2;
        if (postCommentView2 != null) {
            postCommentView2.setPostCommentListener(this);
        }
        PostCommentView postCommentView3 = this.D;
        if (postCommentView3 != null) {
            postCommentView3.setSuggestionListener(this);
        }
        PostCommentView postCommentView4 = this.D;
        if (postCommentView4 != null) {
            postCommentView4.setCommentHint(getString(R.string.social_add_comment_hint));
        }
        PostCommentView postCommentView5 = this.D;
        if (postCommentView5 != null) {
            postCommentView5.setCommentContentDescription(getString(R.string.comment_placeholder));
        }
        PostCommentView postCommentView6 = this.D;
        if (postCommentView6 != null) {
            do1.m mVar = new do1.m(this);
            TaggableEditText taggableEditText2 = postCommentView6.f47848c;
            if (taggableEditText2 != null) {
                taggableEditText2.addTextChangedListener(mVar);
            }
        }
        if (this.P0 && (postCommentView = this.D) != null && (taggableEditText = postCommentView.f47848c) != null) {
            taggableEditText.requestFocus();
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.new_comment_button);
        this.E = textView;
        if (textView != null) {
            textView.setOnClickListener(new h(this, 1));
        }
        i7(viewInflate);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        po1.e eVar = po1.e.f139031a;
        d dVar = this.S0;
        dVar.getClass();
        po1.e.f139032b.remove(dVar);
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.f40568e.getClass();
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e eVarRemove = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.f40569f.remove(this);
        if (eVarRemove != null) {
            eVarRemove.f40570a = null;
            eVarRemove.f40571b.getViewTreeObserver().removeOnGlobalLayoutListener(eVarRemove);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        po1.e eVar = po1.e.f139031a;
        d dVar = this.S0;
        dVar.getClass();
        po1.e.f139032b.add(dVar);
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.a aVar = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.f40568e;
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        aVar.getClass();
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.e.a.a(mVarRequireActivity, this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        com.garmin.android.apps.connectmobile.social.e eVar = new com.garmin.android.apps.connectmobile.social.e(mVarRequireActivity, this.f44514k0, new ArrayList(), this.Z, this.R0, this.Y, this.f44518z, this.C);
        this.F = eVar;
        w6(eVar);
        g gVar = (g) KoinJavaComponent.get$default(g.class, null, null, 6, null);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        c2 c2Var = this.f44516x;
        c2Var.getClass();
        Parcelable parcelable = this.H0;
        View view2 = this.M0;
        view2.getClass();
        View view3 = this.L0;
        view3.getClass();
        gVar.d(contextRequireContext, c2Var, parcelable, view2, view3);
        M7();
    }

    @Override // com.garmin.android.apps.connectmobile.o0, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        TextView textView = this.E;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.o0, androidx.fragment.app.n0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View view3 = this.L0;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        u6();
        this.f7311e.addHeaderView(this.M0, null, false);
        if (this.f44518z) {
            PostCommentView postCommentView = this.D;
            if (postCommentView != null) {
                postCommentView.setVisibility(8);
            }
            if (this.N0 != null) {
                u6();
                this.f7311e.addFooterView(this.N0, null, false);
            }
        }
    }

    @Override // cs1.f
    public final void v3(com.garmin.android.apps.connectmobile.tag.a aVar) {
        aVar.getClass();
        if (this.C) {
            FrameLayout frameLayout = this.P;
            if (frameLayout != null) {
                v22.e.r(frameLayout, aVar instanceof com.garmin.android.apps.connectmobile.tag.a.c);
            }
            if (aVar instanceof com.garmin.android.apps.connectmobile.tag.a.C0860a) {
                g22.e.a(this, null);
            }
        }
    }

    @Override // cs1.f
    public void w3(String str) {
        com.garmin.android.apps.connectmobile.tag.b bVar;
        str.getClass();
        if (this.C && (bVar = this.I) != null) {
            bVar.x4(str, this);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "CONFIRM_DELETE_DIALOG_TAG", "", "COMMENTS_PAGE_SIZE", "I", "EXTRA_DISABLE_SOCIAL", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
