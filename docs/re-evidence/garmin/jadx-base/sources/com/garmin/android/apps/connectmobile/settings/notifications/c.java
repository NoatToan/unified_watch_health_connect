package com.garmin.android.apps.connectmobile.settings.notifications;

import aj1.d;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/notifications/c;", "Landroidx/fragment/app/Fragment;", "Laj1/d;", "<init>", "()V", "b", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends Fragment implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f43626b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f43627a;

    public interface b {
        void F0();

        void U3();

        void h0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f43627a = (b) context;
        } catch (ClassCastException e4) {
            a2 a2Var = a2.SETTINGS;
            String strN = fb1.c.n("exception : ", e4.getMessage());
            i2.f36769a.getClass();
            i2.a.f(a2Var, "NotificationsSettingsFragment", strN);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.notification_settings, viewGroup, false);
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) viewInflate.findViewById(R.id.notifications_push);
        GCMComplexOneLineButton gCMComplexOneLineButton2 = (GCMComplexOneLineButton) viewInflate.findViewById(R.id.notifications_email);
        GCMComplexOneLineButton gCMComplexOneLineButton3 = (GCMComplexOneLineButton) viewInflate.findViewById(R.id.notifications_app);
        final int i14 = 0;
        gCMComplexOneLineButton.setOnClickListener(new View.OnClickListener(this) { // from class: aj1.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.notifications.c f3443b;

            {
                this.f3443b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        com.garmin.android.apps.connectmobile.settings.notifications.c.b bVar = this.f3443b.f43627a;
                        if (bVar != null) {
                            bVar.F0();
                        }
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.settings.notifications.c.b bVar2 = this.f3443b.f43627a;
                        if (bVar2 != null) {
                            bVar2.U3();
                        }
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.settings.notifications.c.b bVar3 = this.f3443b.f43627a;
                        if (bVar3 != null) {
                            bVar3.h0();
                        }
                        break;
                }
            }
        });
        final int i15 = 1;
        gCMComplexOneLineButton2.setOnClickListener(new View.OnClickListener(this) { // from class: aj1.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.notifications.c f3443b;

            {
                this.f3443b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.settings.notifications.c.b bVar = this.f3443b.f43627a;
                        if (bVar != null) {
                            bVar.F0();
                        }
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.settings.notifications.c.b bVar2 = this.f3443b.f43627a;
                        if (bVar2 != null) {
                            bVar2.U3();
                        }
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.settings.notifications.c.b bVar3 = this.f3443b.f43627a;
                        if (bVar3 != null) {
                            bVar3.h0();
                        }
                        break;
                }
            }
        });
        final int i16 = 2;
        gCMComplexOneLineButton3.setOnClickListener(new View.OnClickListener(this) { // from class: aj1.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.notifications.c f3443b;

            {
                this.f3443b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.settings.notifications.c.b bVar = this.f3443b.f43627a;
                        if (bVar != null) {
                            bVar.F0();
                        }
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.settings.notifications.c.b bVar2 = this.f3443b.f43627a;
                        if (bVar2 != null) {
                            bVar2.U3();
                        }
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.settings.notifications.c.b bVar3 = this.f3443b.f43627a;
                        if (bVar3 != null) {
                            bVar3.h0();
                        }
                        break;
                }
            }
        });
        return viewInflate;
    }

    @Override // aj1.d
    public final String v1() {
        String string = getString(R.string.device_screen_notifications);
        string.getClass();
        return string;
    }

    @Override // aj1.d
    public final String x3() {
        return "NotificationsSettingsFragment";
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/notifications/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
