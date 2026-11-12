package va1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lva1/l;", "Lva1/b;", "<init>", "()V", "a", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends va1.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f176631b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f176632a = new w1(s0.f105811a.b(ua1.c.class), new b(this), new d(this), new c(null, this));

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class b extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f176633a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f176633a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f176633a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f176634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f176635b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e23.a aVar, Fragment fragment) {
            super(0);
            this.f176634a = aVar;
            this.f176635b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f176634a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f176635b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f176636a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f176636a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f176636a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    static {
        new a(null);
    }

    @Override // va1.b
    public final int V5() {
        return R.string.power_guide_title_select_gender;
    }

    @Override // va1.b
    public final String b5() {
        return "SelectGenderFrag";
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.power_guide_select_gender_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        final int i14 = 0;
        view2.findViewById(R.id.female_btn).setOnClickListener(new View.OnClickListener(this) { // from class: va1.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f176630b;

            {
                this.f176630b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i15 = i14;
                l lVar = this.f176630b;
                switch (i15) {
                    case 0:
                        int i16 = l.f176631b;
                        ua1.c cVar = (ua1.c) lVar.f176632a.getValue();
                        String string = lVar.getString(R.string.user_gender_value_female);
                        string.getClass();
                        cVar.B4(string);
                        break;
                    case 1:
                        int i17 = l.f176631b;
                        ua1.c cVar2 = (ua1.c) lVar.f176632a.getValue();
                        String string2 = lVar.getString(R.string.user_gender_value_male);
                        string2.getClass();
                        cVar2.B4(string2);
                        break;
                    default:
                        int i18 = l.f176631b;
                        ua1.c cVar3 = (ua1.c) lVar.f176632a.getValue();
                        String string3 = lVar.getString(R.string.user_gender_value_male);
                        string3.getClass();
                        sa1.g gVarD = cVar3.f169615k.d();
                        if (gVarD == null || gVarD == sa1.g.CUSTOM) {
                            o oVar = o.SELECT_ABILITY;
                            y0<o> y0Var = cVar3.f169611g;
                            y0Var.m(oVar);
                            y0Var.m(null);
                        } else {
                            cVar3.A4(gVarD, string3);
                        }
                        break;
                }
            }
        });
        final int i15 = 1;
        view2.findViewById(R.id.male_btn).setOnClickListener(new View.OnClickListener(this) { // from class: va1.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f176630b;

            {
                this.f176630b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i16 = i15;
                l lVar = this.f176630b;
                switch (i16) {
                    case 0:
                        int i17 = l.f176631b;
                        ua1.c cVar = (ua1.c) lVar.f176632a.getValue();
                        String string = lVar.getString(R.string.user_gender_value_female);
                        string.getClass();
                        cVar.B4(string);
                        break;
                    case 1:
                        int i18 = l.f176631b;
                        ua1.c cVar2 = (ua1.c) lVar.f176632a.getValue();
                        String string2 = lVar.getString(R.string.user_gender_value_male);
                        string2.getClass();
                        cVar2.B4(string2);
                        break;
                    default:
                        int i19 = l.f176631b;
                        ua1.c cVar3 = (ua1.c) lVar.f176632a.getValue();
                        String string3 = lVar.getString(R.string.user_gender_value_male);
                        string3.getClass();
                        sa1.g gVarD = cVar3.f169615k.d();
                        if (gVarD == null || gVarD == sa1.g.CUSTOM) {
                            o oVar = o.SELECT_ABILITY;
                            y0<o> y0Var = cVar3.f169611g;
                            y0Var.m(oVar);
                            y0Var.m(null);
                        } else {
                            cVar3.A4(gVarD, string3);
                        }
                        break;
                }
            }
        });
        final int i16 = 2;
        view2.findViewById(R.id.skip_btn).setOnClickListener(new View.OnClickListener(this) { // from class: va1.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f176630b;

            {
                this.f176630b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i17 = i16;
                l lVar = this.f176630b;
                switch (i17) {
                    case 0:
                        int i18 = l.f176631b;
                        ua1.c cVar = (ua1.c) lVar.f176632a.getValue();
                        String string = lVar.getString(R.string.user_gender_value_female);
                        string.getClass();
                        cVar.B4(string);
                        break;
                    case 1:
                        int i19 = l.f176631b;
                        ua1.c cVar2 = (ua1.c) lVar.f176632a.getValue();
                        String string2 = lVar.getString(R.string.user_gender_value_male);
                        string2.getClass();
                        cVar2.B4(string2);
                        break;
                    default:
                        int i110 = l.f176631b;
                        ua1.c cVar3 = (ua1.c) lVar.f176632a.getValue();
                        String string3 = lVar.getString(R.string.user_gender_value_male);
                        string3.getClass();
                        sa1.g gVarD = cVar3.f169615k.d();
                        if (gVarD == null || gVarD == sa1.g.CUSTOM) {
                            o oVar = o.SELECT_ABILITY;
                            y0<o> y0Var = cVar3.f169611g;
                            y0Var.m(oVar);
                            y0Var.m(null);
                        } else {
                            cVar3.A4(gVarD, string3);
                        }
                        break;
                }
            }
        });
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lva1/l$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
