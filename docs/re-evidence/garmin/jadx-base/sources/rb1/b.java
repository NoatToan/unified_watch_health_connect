package rb1;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.ThreeValueSelector;
import db1.m;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lrb1/b;", "Lrb1/e;", "Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/ThreeValueSelector$b;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends rb1.e implements ThreeValueSelector.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ThreeValueSelector f151588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1 f151589c = new w1(s0.f105811a.b(g.class), new c(this), new e(this), new d(null, this));

    /* JADX INFO: renamed from: rb1.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C2853b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f151590a;

        static {
            int[] iArr = new int[eb1.d.values().length];
            try {
                iArr[eb1.d.PREFER_NOT_SAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[eb1.d.EXPERIENCED_LOSS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f151590a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f151591a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f151591a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f151591a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f151592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f151593b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f151592a = aVar;
            this.f151593b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f151592a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f151593b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f151594a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f151594a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f151594a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    static {
        new a(null);
    }

    @Override // com.garmin.android.apps.connectmobile.pregnancytracking.ui.ThreeValueSelector.b
    public final void V1(Object obj) {
        if (obj instanceof eb1.d) {
            ((g) this.f151589c.getValue()).f151621b = (eb1.d) obj;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_pregnancy_result, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        int i14;
        m mVar;
        db1.b numOfBabies;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.pregnancy_result_selector);
        viewFindViewById.getClass();
        this.f151588b = (ThreeValueSelector) viewFindViewById;
        Context context = getContext();
        if (context != null) {
            w1 w1Var = this.f151589c;
            eb1.d dVar = ((g) w1Var.getValue()).f151621b;
            eb1.d dVar2 = eb1.d.HAD_BABY;
            String strA = dVar2.a(context);
            if (((g) w1Var.getValue()).f151621b == dVar2 && (mVar = ((g) w1Var.getValue()).f151620a) != null && (numOfBabies = mVar.getNumOfBabies()) != null && numOfBabies != db1.b.SINGLE) {
                strA = getString(R.string.pregnancy_had_my_babies);
                strA.getClass();
            }
            ThreeValueSelector threeValueSelector = this.f151588b;
            if (threeValueSelector == null) {
                s.m("mResultSelector");
                throw null;
            }
            TextView textView = threeValueSelector.f40439b;
            if (textView == null) {
                s.m("mOptionOneText");
                throw null;
            }
            textView.setText(strA);
            View view3 = threeValueSelector.f40438a;
            if (view3 == null) {
                s.m("mOptionOne");
                throw null;
            }
            view3.setTag(dVar2);
            ThreeValueSelector threeValueSelector2 = this.f151588b;
            if (threeValueSelector2 == null) {
                s.m("mResultSelector");
                throw null;
            }
            eb1.d dVar3 = eb1.d.EXPERIENCED_LOSS;
            String strA2 = dVar3.a(context);
            TextView textView2 = threeValueSelector2.f40442e;
            if (textView2 == null) {
                s.m("mOptionTwoText");
                throw null;
            }
            textView2.setText(strA2);
            View view4 = threeValueSelector2.f40441d;
            if (view4 == null) {
                s.m("mOptionTwo");
                throw null;
            }
            view4.setTag(dVar3);
            ThreeValueSelector threeValueSelector3 = this.f151588b;
            if (threeValueSelector3 == null) {
                s.m("mResultSelector");
                throw null;
            }
            eb1.d dVar4 = eb1.d.PREFER_NOT_SAY;
            String strA3 = dVar4.a(context);
            TextView textView3 = threeValueSelector3.f40445h;
            if (textView3 == null) {
                s.m("mOptionThreeText");
                throw null;
            }
            textView3.setText(strA3);
            View view5 = threeValueSelector3.f40444g;
            if (view5 == null) {
                s.m("mOptionThree");
                throw null;
            }
            view5.setTag(dVar4);
            int i15 = C2853b.f151590a[dVar.ordinal()];
            int i16 = 0;
            int i17 = 8;
            if (i15 == 1) {
                i14 = 0;
                i16 = 8;
            } else if (i15 != 2) {
                i14 = 8;
            } else {
                i14 = 8;
                i17 = 0;
                i16 = 8;
            }
            ThreeValueSelector threeValueSelector4 = this.f151588b;
            if (threeValueSelector4 == null) {
                s.m("mResultSelector");
                throw null;
            }
            ImageView imageView = threeValueSelector4.f40440c;
            if (imageView == null) {
                s.m("mOptionOneCheckImage");
                throw null;
            }
            imageView.setVisibility(i16);
            ImageView imageView2 = threeValueSelector4.f40443f;
            if (imageView2 == null) {
                s.m("mOptionTwoCheckImage");
                throw null;
            }
            imageView2.setVisibility(i17);
            ImageView imageView3 = threeValueSelector4.f40446i;
            if (imageView3 == null) {
                s.m("mOptionThreeCheckImage");
                throw null;
            }
            imageView3.setVisibility(i14);
            ThreeValueSelector threeValueSelector5 = this.f151588b;
            if (threeValueSelector5 != null) {
                threeValueSelector5.setOptionSelectedListener(this);
            } else {
                s.m("mResultSelector");
                throw null;
            }
        }
    }

    @Override // rb1.e
    public final db1.c u6() {
        return new db1.c(R.string.pregnancy_stop_tracking, 0, 8, 0, 0, 24, null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lrb1/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
