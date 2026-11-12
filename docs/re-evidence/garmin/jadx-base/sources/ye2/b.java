package ye2;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag;
import d53.w;
import e23.p;
import lc.u0;
import o13.m;
import o13.r;
import o13.t;
import o53.b0;
import o53.f0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import re2.l0;
import tb1.g;
import ue2.f;
import v13.e;
import v13.i;
import ya0.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lye2/b;", "Lcom/garmin/android/library/mobileauth/ui/MobileAuthBgBlurCapableFrag;", "<init>", "()V", "a", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends MobileAuthBgBlurCapableFrag {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f196826e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f196827a = m.b(new j(4));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ue2.a f196828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Button f196829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Button f196830d;

    /* JADX INFO: renamed from: ye2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "com.garmin.android.library.mobileauth.ui.agesignals.AgeSignalsErrorFrag$hideButtons$1", f = "AgeSignalsErrorFrag.kt", l = {}, m = "invokeSuspend")
    public static final class C3685b extends i implements p<b0, t13.d<? super Unit>, Object> {
        public C3685b(t13.d<? super C3685b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new C3685b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C3685b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            b bVar = b.this;
            Button button = bVar.f196829c;
            if (button == null) {
                s.m("buttonBack");
                throw null;
            }
            button.setVisibility(4);
            Button button2 = bVar.f196830d;
            if (button2 != null) {
                button2.setVisibility(4);
                return Unit.INSTANCE;
            }
            s.m("buttonTryAgain");
            throw null;
        }
    }

    static {
        new a(null);
    }

    public static final Logger logger_delegate$lambda$0() {
        l0.f152316a.getClass();
        return l0.c("AgeSignalsErrorFrag");
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag
    public final Object constructToolbarTitle$mobile_auth_release(t13.d<? super String> dVar) {
        String string = getString(R.string.account_create_account_button);
        string.getClass();
        return string;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        String string = requireArguments().getString("error_enum_name");
        string.getClass();
        this.f196828b = ue2.a.valueOf(string);
        return layoutInflater.inflate(R.layout.mobileauth_age_signals_error, viewGroup, false);
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag
    public final void onToolbarBackPressed$mobile_auth_release() {
        ((Logger) this.f196827a.getValue()).debug("onToolbarBackPressed");
        ge1.b.T(f0.w(this), null, null, new c(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x015a  */
    /* JADX WARN: Code duplicated, block: B:20:0x0172 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0174  */
    /* JADX WARN: Code duplicated, block: B:23:0x017e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0182 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0184  */
    /* JADX WARN: Code duplicated, block: B:28:0x0189  */
    /* JADX WARN: Code duplicated, block: B:30:0x018d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        o13.p pVar;
        o13.p pVar2;
        boolean zBooleanValue;
        Button button;
        Button button2;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        view2.getViewTreeObserver().addOnPreDrawListener(new d(view2, this));
        final ue2.e eVar = new ue2.e();
        ue2.a aVar = this.f196828b;
        if (aVar == null) {
            s.m("ageSignalsError");
            throw null;
        }
        final androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        String strConcat = ue2.e.e(R.string.age_signals_msg_account_creation_problem).concat("\n\n");
        switch (ue2.e.b.f170271a[aVar.ordinal()]) {
            case 1:
                pVar = new o13.p(new SpannableStringBuilder(ue2.e.e(R.string.age_signals_msg_unable_to_create_account).concat("\n\n").concat(ue2.e.e(R.string.age_signals_msg_app_does_not_support_age_range))), Boolean.FALSE);
                pVar2 = pVar;
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) pVar2.f128594a;
                zBooleanValue = ((Boolean) pVar2.f128595b).booleanValue();
                TextView textView = (TextView) view2.findViewById(R.id.age_signals_error_message);
                textView.setText(spannableStringBuilder);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                button = (Button) view2.findViewById(R.id.age_signals_error_button_back);
                this.f196829c = button;
                if (button == null) {
                    s.m("buttonBack");
                    throw null;
                }
                final int i14 = 0;
                button.setOnClickListener(new View.OnClickListener(this) { // from class: ye2.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ b f196825b;

                    {
                        this.f196825b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        int i15 = i14;
                        b bVar = this.f196825b;
                        switch (i15) {
                            case 0:
                                int i16 = b.f196826e;
                                bVar.y6();
                                bVar.getFragListener$mobile_auth_release().p1();
                                break;
                            default:
                                int i17 = b.f196826e;
                                bVar.y6();
                                bVar.getFragListener$mobile_auth_release().N8();
                                break;
                        }
                    }
                });
                button2 = (Button) view2.findViewById(R.id.age_signals_error_button_try_again);
                this.f196830d = button2;
                if (!zBooleanValue) {
                    if (button2 != null) {
                        button2.setVisibility(4);
                        return;
                    } else {
                        s.m("buttonTryAgain");
                        throw null;
                    }
                }
                if (button2 == null) {
                    s.m("buttonTryAgain");
                    throw null;
                }
                final int i15 = 1;
                button2.setOnClickListener(new View.OnClickListener(this) { // from class: ye2.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ b f196825b;

                    {
                        this.f196825b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        int i16 = i15;
                        b bVar = this.f196825b;
                        switch (i16) {
                            case 0:
                                int i17 = b.f196826e;
                                bVar.y6();
                                bVar.getFragListener$mobile_auth_release().p1();
                                break;
                            default:
                                int i18 = b.f196826e;
                                bVar.y6();
                                bVar.getFragListener$mobile_auth_release().N8();
                                break;
                        }
                    }
                });
                return;
            case 2:
                pVar2 = new o13.p(new SpannableStringBuilder(strConcat.concat(ue2.e.e(R.string.age_signals_msg_network_error))), Boolean.TRUE);
                SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) pVar2.f128594a;
                zBooleanValue = ((Boolean) pVar2.f128595b).booleanValue();
                TextView textView2 = (TextView) view2.findViewById(R.id.age_signals_error_message);
                textView2.setText(spannableStringBuilder2);
                textView2.setMovementMethod(LinkMovementMethod.getInstance());
                button = (Button) view2.findViewById(R.id.age_signals_error_button_back);
                this.f196829c = button;
                if (button == null) {
                    s.m("buttonBack");
                    throw null;
                }
                final int i16 = 0;
                button.setOnClickListener(new View.OnClickListener(this) { // from class: ye2.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ b f196825b;

                    {
                        this.f196825b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        int i17 = i16;
                        b bVar = this.f196825b;
                        switch (i17) {
                            case 0:
                                int i18 = b.f196826e;
                                bVar.y6();
                                bVar.getFragListener$mobile_auth_release().p1();
                                break;
                            default:
                                int i19 = b.f196826e;
                                bVar.y6();
                                bVar.getFragListener$mobile_auth_release().N8();
                                break;
                        }
                    }
                });
                button2 = (Button) view2.findViewById(R.id.age_signals_error_button_try_again);
                this.f196830d = button2;
                if (!zBooleanValue) {
                    if (button2 != null) {
                        button2.setVisibility(4);
                        return;
                    } else {
                        s.m("buttonTryAgain");
                        throw null;
                    }
                }
                if (button2 == null) {
                    s.m("buttonTryAgain");
                    throw null;
                }
                final int i17 = 1;
                button2.setOnClickListener(new View.OnClickListener(this) { // from class: ye2.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ b f196825b;

                    {
                        this.f196825b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        int i18 = i17;
                        b bVar = this.f196825b;
                        switch (i18) {
                            case 0:
                                int i19 = b.f196826e;
                                bVar.y6();
                                bVar.getFragListener$mobile_auth_release().p1();
                                break;
                            default:
                                int i110 = b.f196826e;
                                bVar.y6();
                                bVar.getFragListener$mobile_auth_release().N8();
                                break;
                        }
                    }
                });
                return;
            case 3:
            case 4:
            case 5:
                pVar2 = new o13.p(new SpannableStringBuilder(strConcat.concat(ue2.e.e(R.string.please_try_again_later))), Boolean.TRUE);
                SpannableStringBuilder spannableStringBuilder3 = (SpannableStringBuilder) pVar2.f128594a;
                zBooleanValue = ((Boolean) pVar2.f128595b).booleanValue();
                TextView textView3 = (TextView) view2.findViewById(R.id.age_signals_error_message);
                textView3.setText(spannableStringBuilder3);
                textView3.setMovementMethod(LinkMovementMethod.getInstance());
                button = (Button) view2.findViewById(R.id.age_signals_error_button_back);
                this.f196829c = button;
                if (button == null) {
                    s.m("buttonBack");
                    throw null;
                }
                final int i18 = 0;
                button.setOnClickListener(new View.OnClickListener(this) { // from class: ye2.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ b f196825b;

                    {
                        this.f196825b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        int i19 = i18;
                        b bVar = this.f196825b;
                        switch (i19) {
                            case 0:
                                int i110 = b.f196826e;
                                bVar.y6();
                                bVar.getFragListener$mobile_auth_release().p1();
                                break;
                            default:
                                int i111 = b.f196826e;
                                bVar.y6();
                                bVar.getFragListener$mobile_auth_release().N8();
                                break;
                        }
                    }
                });
                button2 = (Button) view2.findViewById(R.id.age_signals_error_button_try_again);
                this.f196830d = button2;
                if (!zBooleanValue) {
                    if (button2 != null) {
                        button2.setVisibility(4);
                        return;
                    } else {
                        s.m("buttonTryAgain");
                        throw null;
                    }
                }
                if (button2 == null) {
                    s.m("buttonTryAgain");
                    throw null;
                }
                final int i19 = 1;
                button2.setOnClickListener(new View.OnClickListener(this) { // from class: ye2.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ b f196825b;

                    {
                        this.f196825b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        int i110 = i19;
                        b bVar = this.f196825b;
                        switch (i110) {
                            case 0:
                                int i111 = b.f196826e;
                                bVar.y6();
                                bVar.getFragListener$mobile_auth_release().p1();
                                break;
                            default:
                                int i112 = b.f196826e;
                                bVar.y6();
                                bVar.getFragListener$mobile_auth_release().N8();
                                break;
                        }
                    }
                });
                return;
            case 6:
            case 7:
                pVar = new o13.p(ue2.e.b(new g(eVar, mVarRequireActivity, 1), strConcat, ue2.e.e(R.string.ssoApplicationName)), Boolean.TRUE);
                pVar2 = pVar;
                SpannableStringBuilder spannableStringBuilder4 = (SpannableStringBuilder) pVar2.f128594a;
                zBooleanValue = ((Boolean) pVar2.f128595b).booleanValue();
                TextView textView4 = (TextView) view2.findViewById(R.id.age_signals_error_message);
                textView4.setText(spannableStringBuilder4);
                textView4.setMovementMethod(LinkMovementMethod.getInstance());
                button = (Button) view2.findViewById(R.id.age_signals_error_button_back);
                this.f196829c = button;
                if (button == null) {
                    s.m("buttonBack");
                    throw null;
                }
                final int i110 = 0;
                button.setOnClickListener(new View.OnClickListener(this) { // from class: ye2.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ b f196825b;

                    {
                        this.f196825b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        int i111 = i110;
                        b bVar = this.f196825b;
                        switch (i111) {
                            case 0:
                                int i112 = b.f196826e;
                                bVar.y6();
                                bVar.getFragListener$mobile_auth_release().p1();
                                break;
                            default:
                                int i113 = b.f196826e;
                                bVar.y6();
                                bVar.getFragListener$mobile_auth_release().N8();
                                break;
                        }
                    }
                });
                button2 = (Button) view2.findViewById(R.id.age_signals_error_button_try_again);
                this.f196830d = button2;
                if (!zBooleanValue) {
                    if (button2 != null) {
                        button2.setVisibility(4);
                        return;
                    } else {
                        s.m("buttonTryAgain");
                        throw null;
                    }
                }
                if (button2 == null) {
                    s.m("buttonTryAgain");
                    throw null;
                }
                final int i111 = 1;
                button2.setOnClickListener(new View.OnClickListener(this) { // from class: ye2.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ b f196825b;

                    {
                        this.f196825b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        int i112 = i111;
                        b bVar = this.f196825b;
                        switch (i112) {
                            case 0:
                                int i113 = b.f196826e;
                                bVar.y6();
                                bVar.getFragListener$mobile_auth_release().p1();
                                break;
                            default:
                                int i114 = b.f196826e;
                                bVar.y6();
                                bVar.getFragListener$mobile_auth_release().N8();
                                break;
                        }
                    }
                });
                return;
            case 8:
            case 9:
            case 10:
            case 11:
                final int i24 = 0;
                pVar = new o13.p(ue2.e.b(new e23.a() { // from class: ue2.d
                    @Override // e23.a
                    public final Object invoke() {
                        int i25 = i24;
                        androidx.fragment.app.m mVar = mVarRequireActivity;
                        e eVar2 = eVar;
                        switch (i25) {
                            case 0:
                                int i26 = e.f170268c;
                                eVar2.k(mVar);
                                break;
                            default:
                                int i27 = e.f170268c;
                                eVar2.k(mVar);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, strConcat, ue2.c.PLAY_STORE.f170264a), Boolean.TRUE);
                pVar2 = pVar;
                SpannableStringBuilder spannableStringBuilder5 = (SpannableStringBuilder) pVar2.f128594a;
                zBooleanValue = ((Boolean) pVar2.f128595b).booleanValue();
                TextView textView5 = (TextView) view2.findViewById(R.id.age_signals_error_message);
                textView5.setText(spannableStringBuilder5);
                textView5.setMovementMethod(LinkMovementMethod.getInstance());
                button = (Button) view2.findViewById(R.id.age_signals_error_button_back);
                this.f196829c = button;
                if (button == null) {
                    s.m("buttonBack");
                    throw null;
                }
                final int i112 = 0;
                button.setOnClickListener(new View.OnClickListener(this) { // from class: ye2.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ b f196825b;

                    {
                        this.f196825b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        int i113 = i112;
                        b bVar = this.f196825b;
                        switch (i113) {
                            case 0:
                                int i114 = b.f196826e;
                                bVar.y6();
                                bVar.getFragListener$mobile_auth_release().p1();
                                break;
                            default:
                                int i115 = b.f196826e;
                                bVar.y6();
                                bVar.getFragListener$mobile_auth_release().N8();
                                break;
                        }
                    }
                });
                button2 = (Button) view2.findViewById(R.id.age_signals_error_button_try_again);
                this.f196830d = button2;
                if (!zBooleanValue) {
                    if (button2 != null) {
                        button2.setVisibility(4);
                        return;
                    } else {
                        s.m("buttonTryAgain");
                        throw null;
                    }
                }
                if (button2 == null) {
                    s.m("buttonTryAgain");
                    throw null;
                }
                final int i113 = 1;
                button2.setOnClickListener(new View.OnClickListener(this) { // from class: ye2.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ b f196825b;

                    {
                        this.f196825b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        int i114 = i113;
                        b bVar = this.f196825b;
                        switch (i114) {
                            case 0:
                                int i115 = b.f196826e;
                                bVar.y6();
                                bVar.getFragListener$mobile_auth_release().p1();
                                break;
                            default:
                                int i116 = b.f196826e;
                                bVar.y6();
                                bVar.getFragListener$mobile_auth_release().N8();
                                break;
                        }
                    }
                });
                return;
            case 12:
            case 13:
                pVar = new o13.p(ue2.e.b(new g(eVar, mVarRequireActivity, 2), strConcat, ue2.c.PLAY_SERVICES.f170264a), Boolean.TRUE);
                pVar2 = pVar;
                SpannableStringBuilder spannableStringBuilder6 = (SpannableStringBuilder) pVar2.f128594a;
                zBooleanValue = ((Boolean) pVar2.f128595b).booleanValue();
                TextView textView6 = (TextView) view2.findViewById(R.id.age_signals_error_message);
                textView6.setText(spannableStringBuilder6);
                textView6.setMovementMethod(LinkMovementMethod.getInstance());
                button = (Button) view2.findViewById(R.id.age_signals_error_button_back);
                this.f196829c = button;
                if (button == null) {
                    s.m("buttonBack");
                    throw null;
                }
                final int i114 = 0;
                button.setOnClickListener(new View.OnClickListener(this) { // from class: ye2.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ b f196825b;

                    {
                        this.f196825b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        int i115 = i114;
                        b bVar = this.f196825b;
                        switch (i115) {
                            case 0:
                                int i116 = b.f196826e;
                                bVar.y6();
                                bVar.getFragListener$mobile_auth_release().p1();
                                break;
                            default:
                                int i117 = b.f196826e;
                                bVar.y6();
                                bVar.getFragListener$mobile_auth_release().N8();
                                break;
                        }
                    }
                });
                button2 = (Button) view2.findViewById(R.id.age_signals_error_button_try_again);
                this.f196830d = button2;
                if (!zBooleanValue) {
                    if (button2 != null) {
                        button2.setVisibility(4);
                        return;
                    } else {
                        s.m("buttonTryAgain");
                        throw null;
                    }
                }
                if (button2 == null) {
                    s.m("buttonTryAgain");
                    throw null;
                }
                final int i115 = 1;
                button2.setOnClickListener(new View.OnClickListener(this) { // from class: ye2.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ b f196825b;

                    {
                        this.f196825b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        int i116 = i115;
                        b bVar = this.f196825b;
                        switch (i116) {
                            case 0:
                                int i117 = b.f196826e;
                                bVar.y6();
                                bVar.getFragListener$mobile_auth_release().p1();
                                break;
                            default:
                                int i118 = b.f196826e;
                                bVar.y6();
                                bVar.getFragListener$mobile_auth_release().N8();
                                break;
                        }
                    }
                });
                return;
            case 14:
                final int i25 = 1;
                e23.a aVar2 = new e23.a() { // from class: ue2.d
                    @Override // e23.a
                    public final Object invoke() {
                        int i26 = i25;
                        androidx.fragment.app.m mVar = mVarRequireActivity;
                        e eVar2 = eVar;
                        switch (i26) {
                            case 0:
                                int i27 = e.f170268c;
                                eVar2.k(mVar);
                                break;
                            default:
                                int i28 = e.f170268c;
                                eVar2.k(mVar);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                String str = ue2.c.PLAY_STORE.f170264a;
                re2.b bVar = re2.b.f152215a;
                String string = bVar.b().getString(R.string.age_signals_msg_requires_verification, ue2.e.e(R.string.ssoApplicationName), str, str);
                string.getClass();
                String strConcat2 = strConcat.concat(string);
                int iL = w.L(0, 6, strConcat2, str);
                int length = str.length() + iL;
                SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(strConcat2);
                spannableStringBuilder7.setSpan(new f(aVar2, a7.b.getColor(bVar.b(), R.color.ssoTouText)), iL, length, 33);
                pVar2 = new o13.p(spannableStringBuilder7, Boolean.TRUE);
                SpannableStringBuilder spannableStringBuilder8 = (SpannableStringBuilder) pVar2.f128594a;
                zBooleanValue = ((Boolean) pVar2.f128595b).booleanValue();
                TextView textView7 = (TextView) view2.findViewById(R.id.age_signals_error_message);
                textView7.setText(spannableStringBuilder8);
                textView7.setMovementMethod(LinkMovementMethod.getInstance());
                button = (Button) view2.findViewById(R.id.age_signals_error_button_back);
                this.f196829c = button;
                if (button == null) {
                    s.m("buttonBack");
                    throw null;
                }
                final int i116 = 0;
                button.setOnClickListener(new View.OnClickListener(this) { // from class: ye2.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ b f196825b;

                    {
                        this.f196825b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        int i117 = i116;
                        b bVar2 = this.f196825b;
                        switch (i117) {
                            case 0:
                                int i118 = b.f196826e;
                                bVar2.y6();
                                bVar2.getFragListener$mobile_auth_release().p1();
                                break;
                            default:
                                int i119 = b.f196826e;
                                bVar2.y6();
                                bVar2.getFragListener$mobile_auth_release().N8();
                                break;
                        }
                    }
                });
                button2 = (Button) view2.findViewById(R.id.age_signals_error_button_try_again);
                this.f196830d = button2;
                if (!zBooleanValue) {
                    if (button2 != null) {
                        button2.setVisibility(4);
                        return;
                    } else {
                        s.m("buttonTryAgain");
                        throw null;
                    }
                }
                if (button2 == null) {
                    s.m("buttonTryAgain");
                    throw null;
                }
                final int i117 = 1;
                button2.setOnClickListener(new View.OnClickListener(this) { // from class: ye2.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ b f196825b;

                    {
                        this.f196825b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        int i118 = i117;
                        b bVar2 = this.f196825b;
                        switch (i118) {
                            case 0:
                                int i119 = b.f196826e;
                                bVar2.y6();
                                bVar2.getFragListener$mobile_auth_release().p1();
                                break;
                            default:
                                int i1110 = b.f196826e;
                                bVar2.y6();
                                bVar2.getFragListener$mobile_auth_release().N8();
                                break;
                        }
                    }
                });
                return;
            default:
                u0.r();
                return;
        }
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag
    public final boolean shouldBlurBackgroundImage$mobile_auth_release() {
        return getMobileAuthConfig$mobile_auth_release().f177779t;
    }

    @Override // com.garmin.android.library.mobileauth.ui.MobileAuthBgBlurCapableFrag
    public final boolean useBackgroundImage$mobile_auth_release() {
        return getMobileAuthConfig$mobile_auth_release().f177778s;
    }

    public final void y6() {
        ge1.b.T(f0.w(this), null, null, new C3685b(null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lye2/b$a;", "", "<init>", "()V", "", "FRAG_EXTRA_ERROR_ENUM_NAME", "Ljava/lang/String;", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
