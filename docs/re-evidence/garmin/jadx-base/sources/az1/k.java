package az1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.n0;
import b.s;
import b.u;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.TrainingInitiativeEventActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Laz1/k;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends Fragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f13778c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zy1.b f13779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f13780b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"az1/k$b", "Lb/s;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends s {
        public b() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            m activity = k.this.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    public k() {
        super(R.layout.event_db_genesis);
        this.f13780b = new b();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        Object context = getContext();
        this.f13779a = context instanceof zy1.b ? (zy1.b) context : null;
        u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f13780b, viewLifecycleOwner);
        final int i14 = 0;
        ((AppCompatButton) view2.findViewById(R.id.btn_find_event)).setOnClickListener(new View.OnClickListener(this) { // from class: az1.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f13777b;

            {
                this.f13777b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i14) {
                    case 0:
                        k kVar = this.f13777b;
                        zy1.b bVar = kVar.f13779a;
                        if (bVar != null) {
                            TrainingInitiativeEventActivity.a aVar = TrainingInitiativeEventActivity.f45718o;
                            Context contextRequireContext = kVar.requireContext();
                            contextRequireContext.getClass();
                            int iOrdinal = zf0.a.FIND_EVENT_WO_TYPE_SELECTION.ordinal();
                            aVar.getClass();
                            Intent intentA = TrainingInitiativeEventActivity.a.a(iOrdinal, contextRequireContext);
                            intentA.putExtra("navigating_from_event_dashboard", true);
                            bVar.N7(intentA);
                        }
                        break;
                    default:
                        k kVar2 = this.f13777b;
                        zy1.b bVar2 = kVar2.f13779a;
                        if (bVar2 != null) {
                            TrainingInitiativeEventActivity.a aVar2 = TrainingInitiativeEventActivity.f45718o;
                            Context contextRequireContext2 = kVar2.requireContext();
                            contextRequireContext2.getClass();
                            int iOrdinal2 = zf0.a.CREATE_EVENT.ordinal();
                            aVar2.getClass();
                            Intent intentA2 = TrainingInitiativeEventActivity.a.a(iOrdinal2, contextRequireContext2);
                            intentA2.putExtra("navigating_from_event_dashboard", true);
                            bVar2.N7(intentA2);
                        }
                        break;
                }
            }
        });
        final int i15 = 1;
        ((AppCompatButton) view2.findViewById(R.id.btn_create_event)).setOnClickListener(new View.OnClickListener(this) { // from class: az1.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f13777b;

            {
                this.f13777b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i15) {
                    case 0:
                        k kVar = this.f13777b;
                        zy1.b bVar = kVar.f13779a;
                        if (bVar != null) {
                            TrainingInitiativeEventActivity.a aVar = TrainingInitiativeEventActivity.f45718o;
                            Context contextRequireContext = kVar.requireContext();
                            contextRequireContext.getClass();
                            int iOrdinal = zf0.a.FIND_EVENT_WO_TYPE_SELECTION.ordinal();
                            aVar.getClass();
                            Intent intentA = TrainingInitiativeEventActivity.a.a(iOrdinal, contextRequireContext);
                            intentA.putExtra("navigating_from_event_dashboard", true);
                            bVar.N7(intentA);
                        }
                        break;
                    default:
                        k kVar2 = this.f13777b;
                        zy1.b bVar2 = kVar2.f13779a;
                        if (bVar2 != null) {
                            TrainingInitiativeEventActivity.a aVar2 = TrainingInitiativeEventActivity.f45718o;
                            Context contextRequireContext2 = kVar2.requireContext();
                            contextRequireContext2.getClass();
                            int iOrdinal2 = zf0.a.CREATE_EVENT.ordinal();
                            aVar2.getClass();
                            Intent intentA2 = TrainingInitiativeEventActivity.a.a(iOrdinal2, contextRequireContext2);
                            intentA2.putExtra("navigating_from_event_dashboard", true);
                            bVar2.N7(intentA2);
                        }
                        break;
                }
            }
        });
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Laz1/k$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
