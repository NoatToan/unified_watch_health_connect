package com.garmin.android.apps.connectmobile.powercurve.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import mt0.y;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/powercurve/view/a;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "a", "gcm-power-curve_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0757a f40343c = new C0757a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public qa1.a f40344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ja1.b f40345b = (ja1.b) KoinJavaComponent.get$default(ja1.b.class, null, null, 6, null);

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.gcm_power_curve_bottom_sheet, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        Bundle arguments = getArguments();
        final long j8 = arguments != null ? arguments.getLong("ACTIVITY_ID_KEY") : 0L;
        final int i14 = 0;
        ((TextView) view2.findViewById(R.id.power_curve_bottom_view_activity)).setOnClickListener(new View.OnClickListener(this) { // from class: qa1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.powercurve.view.a f143874b;

            {
                this.f143874b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i15 = i14;
                long j14 = j8;
                com.garmin.android.apps.connectmobile.powercurve.view.a aVar = this.f143874b;
                switch (i15) {
                    case 0:
                        ja1.b bVar = aVar.f40345b;
                        Context contextRequireContext = aVar.requireContext();
                        contextRequireContext.getClass();
                        aVar.startActivity(bVar.a(contextRequireContext, j14));
                        aVar.dismiss();
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.powercurve.view.a.C0757a c0757a = com.garmin.android.apps.connectmobile.powercurve.view.a.f40343c;
                        androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(aVar.requireContext()).setTitle(R.string.power_curve_remove_activity_alert_lbl).setMessage(aVar.getResources().getString(R.string.power_curve_remove_activity_alert_description)).setPositiveButton(aVar.getResources().getText(R.string.lbl_common_remove), new jr2.e(aVar, j14, 2)).setNegativeButton(aVar.getResources().getText(R.string.lbl_cancel), new y(24)).create();
                        eVarCreate.getClass();
                        eVarCreate.show();
                        eVarCreate.e(-1).setTextColor(a7.b.getColor(aVar.requireContext(), R.color.gcm_text_danger_action));
                        eVarCreate.e(-2).setTextColor(a7.b.getColor(aVar.requireContext(), R.color.gcm_text_primary));
                        aVar.dismiss();
                        break;
                }
            }
        });
        final int i15 = 1;
        ((TextView) view2.findViewById(R.id.power_curve_bottom_remove_activity)).setOnClickListener(new View.OnClickListener(this) { // from class: qa1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.powercurve.view.a f143874b;

            {
                this.f143874b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i16 = i15;
                long j14 = j8;
                com.garmin.android.apps.connectmobile.powercurve.view.a aVar = this.f143874b;
                switch (i16) {
                    case 0:
                        ja1.b bVar = aVar.f40345b;
                        Context contextRequireContext = aVar.requireContext();
                        contextRequireContext.getClass();
                        aVar.startActivity(bVar.a(contextRequireContext, j14));
                        aVar.dismiss();
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.powercurve.view.a.C0757a c0757a = com.garmin.android.apps.connectmobile.powercurve.view.a.f40343c;
                        androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(aVar.requireContext()).setTitle(R.string.power_curve_remove_activity_alert_lbl).setMessage(aVar.getResources().getString(R.string.power_curve_remove_activity_alert_description)).setPositiveButton(aVar.getResources().getText(R.string.lbl_common_remove), new jr2.e(aVar, j14, 2)).setNegativeButton(aVar.getResources().getText(R.string.lbl_cancel), new y(24)).create();
                        eVarCreate.getClass();
                        eVarCreate.show();
                        eVarCreate.e(-1).setTextColor(a7.b.getColor(aVar.requireContext(), R.color.gcm_text_danger_action));
                        eVarCreate.e(-2).setTextColor(a7.b.getColor(aVar.requireContext(), R.color.gcm_text_primary));
                        aVar.dismiss();
                        break;
                }
            }
        });
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.powercurve.view.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/powercurve/view/a$a;", "", "<init>", "()V", "", "ACTIVITY_ID_KEY", "Ljava/lang/String;", "gcm-power-curve_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0757a {
        public /* synthetic */ C0757a(j jVar) {
            this();
        }

        private C0757a() {
        }
    }
}
