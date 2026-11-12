package ro1;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lro1/b0;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "b", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b0 extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f153913b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f153914a;

    public interface b {
        void O2();

        void o5();
    }

    @Override // androidx.fragment.app.i
    public final int getTheme() {
        return 2132149233;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f153914a = (b) context;
        } catch (ClassCastException unused) {
            wr.g.u(context, " must implement ShareDialogFragmentListener");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.airbnb.lottie.animation.keyframe.a.b(layoutInflater, R.layout.share_activity_bottom_sheet, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.share_activity_detail);
        viewFindViewById.getClass();
        final int i14 = 0;
        v22.e.n(viewFindViewById, new e23.l(this) { // from class: ro1.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b0 f153904b;

            {
                this.f153904b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i15 = i14;
                b0 b0Var = this.f153904b;
                View view3 = (View) obj;
                switch (i15) {
                    case 0:
                        b0.a aVar = b0.f153913b;
                        view3.getClass();
                        b0.b bVar = b0Var.f153914a;
                        if (bVar != null) {
                            bVar.o5();
                        }
                        b0Var.dismiss();
                        break;
                    default:
                        b0.a aVar2 = b0.f153913b;
                        view3.getClass();
                        b0.b bVar2 = b0Var.f153914a;
                        if (bVar2 != null) {
                            bVar2.O2();
                        }
                        b0Var.dismiss();
                        break;
                }
                return Unit.INSTANCE;
            }
        });
        TextView textView = (TextView) view2.findViewById(R.id.share_web_link);
        if (s3.b()) {
            textView.getClass();
            textView.setVisibility(8);
        } else {
            textView.getClass();
            final int i15 = 1;
            v22.e.n(textView, new e23.l(this) { // from class: ro1.a0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b0 f153904b;

                {
                    this.f153904b = this;
                }

                @Override // e23.l
                public final Object invoke(Object obj) {
                    int i16 = i15;
                    b0 b0Var = this.f153904b;
                    View view3 = (View) obj;
                    switch (i16) {
                        case 0:
                            b0.a aVar = b0.f153913b;
                            view3.getClass();
                            b0.b bVar = b0Var.f153914a;
                            if (bVar != null) {
                                bVar.o5();
                            }
                            b0Var.dismiss();
                            break;
                        default:
                            b0.a aVar2 = b0.f153913b;
                            view3.getClass();
                            b0.b bVar2 = b0Var.f153914a;
                            if (bVar2 != null) {
                                bVar2.O2();
                            }
                            b0Var.dismiss();
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lro1/b0$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
