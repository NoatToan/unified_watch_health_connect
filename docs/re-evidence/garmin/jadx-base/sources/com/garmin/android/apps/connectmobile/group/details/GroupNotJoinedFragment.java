package com.garmin.android.apps.connectmobile.group.details;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.lifecycle.j;
import androidx.lifecycle.n0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import fw.p;
import mm0.u;
import mm0.w;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;
import v22.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/GroupNotJoinedFragment;", "Lnm0/d;", "<init>", "()V", "a", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GroupNotJoinedFragment extends nm0.d {
    public static final /* synthetic */ int Y = 0;
    public View F;
    public Button I;
    public Button P;
    public Button T;
    public Button X;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f36168b;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f36167a = iArr;
            int[] iArr2 = new int[w.values().length];
            try {
                iArr2[w.NOT_JOINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[w.REQUEST_TO_JOIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[w.REQUEST_SENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[w.BY_INVITATION_ONLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[w.BE_INVITED.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            f36168b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class c extends q implements l<w, Unit> {
        public c(Object obj) {
            super(1, obj, GroupNotJoinedFragment.class, "notJoinedStateOnChanged", "notJoinedStateOnChanged(Lcom/garmin/android/apps/connectmobile/group/details/GroupNotJoinedState;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(w wVar) {
            w wVar2 = wVar;
            wVar2.getClass();
            GroupNotJoinedFragment groupNotJoinedFragment = (GroupNotJoinedFragment) this.receiver;
            int i14 = GroupNotJoinedFragment.Y;
            groupNotJoinedFragment.getClass();
            int i15 = b.f36168b[wVar2.ordinal()];
            Button button = groupNotJoinedFragment.I;
            int i16 = 3;
            if (i15 != 1) {
                if (i15 != 2) {
                    if (i15 != 3) {
                        int i17 = 4;
                        if (i15 != 4) {
                            if (i15 != 5) {
                                if (button == null) {
                                    s.m("joinGroupButton");
                                    throw null;
                                }
                                button.setVisibility(8);
                                Button button2 = groupNotJoinedFragment.P;
                                if (button2 == null) {
                                    s.m("requestToJoinButton");
                                    throw null;
                                }
                                button2.setVisibility(8);
                                Button button3 = groupNotJoinedFragment.T;
                                if (button3 == null) {
                                    s.m("requestSentButton");
                                    throw null;
                                }
                                button3.setVisibility(8);
                                Button button4 = groupNotJoinedFragment.X;
                                if (button4 == null) {
                                    s.m("byInvitationOnlyButton");
                                    throw null;
                                }
                                button4.setVisibility(8);
                            } else {
                                if (button == null) {
                                    s.m("joinGroupButton");
                                    throw null;
                                }
                                button.setVisibility(0);
                                Button button5 = groupNotJoinedFragment.I;
                                if (button5 == null) {
                                    s.m("joinGroupButton");
                                    throw null;
                                }
                                button5.setText(R.string.social_group_accept_invitation);
                                Button button6 = groupNotJoinedFragment.I;
                                if (button6 == null) {
                                    s.m("joinGroupButton");
                                    throw null;
                                }
                                button6.setOnClickListener(new mm0.s(groupNotJoinedFragment, i17));
                                Button button7 = groupNotJoinedFragment.P;
                                if (button7 == null) {
                                    s.m("requestToJoinButton");
                                    throw null;
                                }
                                button7.setVisibility(8);
                                Button button8 = groupNotJoinedFragment.T;
                                if (button8 == null) {
                                    s.m("requestSentButton");
                                    throw null;
                                }
                                button8.setVisibility(8);
                                Button button9 = groupNotJoinedFragment.X;
                                if (button9 == null) {
                                    s.m("byInvitationOnlyButton");
                                    throw null;
                                }
                                button9.setVisibility(8);
                            }
                        } else {
                            if (button == null) {
                                s.m("joinGroupButton");
                                throw null;
                            }
                            button.setVisibility(8);
                            Button button10 = groupNotJoinedFragment.P;
                            if (button10 == null) {
                                s.m("requestToJoinButton");
                                throw null;
                            }
                            button10.setVisibility(8);
                            Button button11 = groupNotJoinedFragment.T;
                            if (button11 == null) {
                                s.m("requestSentButton");
                                throw null;
                            }
                            button11.setVisibility(8);
                            Button button12 = groupNotJoinedFragment.X;
                            if (button12 == null) {
                                s.m("byInvitationOnlyButton");
                                throw null;
                            }
                            button12.setVisibility(0);
                        }
                    } else {
                        if (button == null) {
                            s.m("joinGroupButton");
                            throw null;
                        }
                        button.setVisibility(8);
                        Button button13 = groupNotJoinedFragment.P;
                        if (button13 == null) {
                            s.m("requestToJoinButton");
                            throw null;
                        }
                        button13.setVisibility(8);
                        Button button14 = groupNotJoinedFragment.T;
                        if (button14 == null) {
                            s.m("requestSentButton");
                            throw null;
                        }
                        button14.setVisibility(0);
                        Button button15 = groupNotJoinedFragment.X;
                        if (button15 == null) {
                            s.m("byInvitationOnlyButton");
                            throw null;
                        }
                        button15.setVisibility(8);
                    }
                } else {
                    if (button == null) {
                        s.m("joinGroupButton");
                        throw null;
                    }
                    button.setVisibility(8);
                    Button button16 = groupNotJoinedFragment.P;
                    if (button16 == null) {
                        s.m("requestToJoinButton");
                        throw null;
                    }
                    button16.setVisibility(0);
                    Button button17 = groupNotJoinedFragment.T;
                    if (button17 == null) {
                        s.m("requestSentButton");
                        throw null;
                    }
                    button17.setVisibility(8);
                    Button button18 = groupNotJoinedFragment.X;
                    if (button18 == null) {
                        s.m("byInvitationOnlyButton");
                        throw null;
                    }
                    button18.setVisibility(8);
                }
            } else {
                if (button == null) {
                    s.m("joinGroupButton");
                    throw null;
                }
                button.setText(R.string.lbl_join_group);
                Button button19 = groupNotJoinedFragment.I;
                if (button19 == null) {
                    s.m("joinGroupButton");
                    throw null;
                }
                button19.setVisibility(0);
                Button button20 = groupNotJoinedFragment.I;
                if (button20 == null) {
                    s.m("joinGroupButton");
                    throw null;
                }
                button20.setOnClickListener(new mm0.s(groupNotJoinedFragment, i16));
                Button button21 = groupNotJoinedFragment.P;
                if (button21 == null) {
                    s.m("requestToJoinButton");
                    throw null;
                }
                button21.setVisibility(8);
                Button button22 = groupNotJoinedFragment.T;
                if (button22 == null) {
                    s.m("requestSentButton");
                    throw null;
                }
                button22.setVisibility(8);
                Button button23 = groupNotJoinedFragment.X;
                if (button23 == null) {
                    s.m("byInvitationOnlyButton");
                    throw null;
                }
                button23.setVisibility(8);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f36169a;

        public d(l lVar) {
            lVar.getClass();
            this.f36169a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f36169a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f36169a.invoke(obj);
        }
    }

    static {
        new a(null);
    }

    @Override // nm0.d
    public final void M6() {
        View view2 = this.F;
        if (view2 == null) {
            s.m("rootView");
            throw null;
        }
        e.q(view2);
        g22.e.f(this);
    }

    @Override // nm0.d
    public final void T6() {
        View view2 = this.F;
        if (view2 == null) {
            s.m("rootView");
            throw null;
        }
        e.j(view2);
        g22.e.l(this);
    }

    public final void V6() {
        j jVarA4 = K6().A4(String.valueOf(K6().B4()));
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(jVarA4, viewLifecycleOwner, new d(new u(this, 2)));
    }

    public final void X6() {
        mm0.e eVarK6 = K6();
        y0 y0VarK = xy2.b.K(eVarK6, new mm0.l(eVarK6, null));
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(y0VarK, viewLifecycleOwner, new d(new u(this, 0)));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewB = com.airbnb.lottie.animation.keyframe.a.b(layoutInflater, R.layout.fragment_group_not_joined, viewGroup, false);
        this.F = viewB;
        return C6(layoutInflater, viewGroup, viewB);
    }

    @Override // nm0.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.join_group_button);
        viewFindViewById.getClass();
        Button button = (Button) viewFindViewById;
        this.I = button;
        button.setOnClickListener(new mm0.s(this, 0));
        View viewFindViewById2 = view2.findViewById(R.id.request_to_join_button);
        viewFindViewById2.getClass();
        Button button2 = (Button) viewFindViewById2;
        this.P = button2;
        button2.setOnClickListener(new mm0.s(this, 1));
        View viewFindViewById3 = view2.findViewById(R.id.request_sent_button);
        viewFindViewById3.getClass();
        Button button3 = (Button) viewFindViewById3;
        this.T = button3;
        button3.setOnClickListener(new mm0.s(this, 2));
        View viewFindViewById4 = view2.findViewById(R.id.by_invitation_only_button);
        viewFindViewById4.getClass();
        this.X = (Button) viewFindViewById4;
        y0<w> y0Var = K6().f119508d;
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(y0Var, viewLifecycleOwner, new d(new c(this)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/GroupNotJoinedFragment$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
