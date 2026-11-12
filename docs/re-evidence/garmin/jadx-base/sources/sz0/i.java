package sz0;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import p005kotlin.Metadata;
import zb0.u0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lsz0/i;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public UserLevelImageView f161404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f161405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f161406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f161407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Button f161408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Button f161409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f161410g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f161411h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public j f161412i;

    static {
        new a(null);
    }

    public i() {
        super(R.layout.notifications_detail);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        Object objRequireContext = requireContext();
        j jVar = objRequireContext instanceof j ? (j) objRequireContext : null;
        if (jVar != null) {
            this.f161412i = jVar;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        com.garmin.android.apps.connectmobile.smartscale.model.b bVar;
        b12.b bVar2;
        String string;
        Parcelable parcelable;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.profile_image);
        viewFindViewById.getClass();
        this.f161404a = (UserLevelImageView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.invitation_text);
        viewFindViewById2.getClass();
        this.f161405b = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.device_image);
        viewFindViewById3.getClass();
        this.f161406c = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.device_name);
        viewFindViewById4.getClass();
        this.f161407d = (TextView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.get_started_button);
        viewFindViewById5.getClass();
        this.f161408e = (Button) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.decline_button);
        viewFindViewById6.getClass();
        this.f161409f = (Button) viewFindViewById6;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("GCM_extra_device_invite", com.garmin.android.apps.connectmobile.smartscale.model.b.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("GCM_extra_device_invite");
                if (!(parcelable2 instanceof com.garmin.android.apps.connectmobile.smartscale.model.b)) {
                    parcelable2 = null;
                }
                parcelable = (com.garmin.android.apps.connectmobile.smartscale.model.b) parcelable2;
            }
            bVar = (com.garmin.android.apps.connectmobile.smartscale.model.b) parcelable;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            String invitorName = bVar.getInvitorName();
            if (invitorName == null) {
                invitorName = getString(R.string.no_value);
                invitorName.getClass();
            }
            this.f161411h = invitorName;
            this.f161410g = bVar.getPartNumberPartial();
        }
        String str = this.f161411h;
        if (str != null) {
            TextView textView = this.f161405b;
            if (textView == null) {
                p005kotlin.jvm.internal.s.m("invitationText");
                throw null;
            }
            textView.setText(getString(R.string.lbl_use_device_invitation, str));
        }
        String str2 = this.f161410g;
        if (str2 != null) {
            TextView textView2 = this.f161407d;
            if (textView2 == null) {
                p005kotlin.jvm.internal.s.m("deviceName");
                throw null;
            }
            if (u0.n(str2, u0.H0)) {
                string = getString(R.string.index_smart_scale);
            } else if (u0.n(this.f161410g, u0.P5)) {
                string = getString(R.string.index_s2_tm_smart_scale);
            } else {
                string = u0.n(this.f161410g, u0.S5) ? getString(R.string.index_bpm) : "";
            }
            textView2.setText(string);
        }
        if (this.f161412i != null) {
            Button button = this.f161408e;
            if (button == null) {
                p005kotlin.jvm.internal.s.m("getStartedButton");
                throw null;
            }
            final int i14 = 0;
            button.setOnClickListener(new View.OnClickListener(this) { // from class: sz0.h

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i f161402b;

                {
                    this.f161402b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i14) {
                        case 0:
                            i iVar = this.f161402b;
                            j jVar = iVar.f161412i;
                            if (jVar == null) {
                                p005kotlin.jvm.internal.s.m("notificationAcceptOrDeclineListener");
                                throw null;
                            }
                            Bundle bundleRequireArguments = iVar.requireArguments();
                            bundleRequireArguments.getClass();
                            jVar.a1(bundleRequireArguments);
                            return;
                        default:
                            i iVar2 = this.f161402b;
                            j jVar2 = iVar2.f161412i;
                            if (jVar2 == null) {
                                p005kotlin.jvm.internal.s.m("notificationAcceptOrDeclineListener");
                                throw null;
                            }
                            Bundle bundleRequireArguments2 = iVar2.requireArguments();
                            bundleRequireArguments2.getClass();
                            jVar2.x8(bundleRequireArguments2);
                            return;
                    }
                }
            });
            Button button2 = this.f161409f;
            if (button2 == null) {
                p005kotlin.jvm.internal.s.m("declineButton");
                throw null;
            }
            final int i15 = 1;
            button2.setOnClickListener(new View.OnClickListener(this) { // from class: sz0.h

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i f161402b;

                {
                    this.f161402b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i15) {
                        case 0:
                            i iVar = this.f161402b;
                            j jVar = iVar.f161412i;
                            if (jVar == null) {
                                p005kotlin.jvm.internal.s.m("notificationAcceptOrDeclineListener");
                                throw null;
                            }
                            Bundle bundleRequireArguments = iVar.requireArguments();
                            bundleRequireArguments.getClass();
                            jVar.a1(bundleRequireArguments);
                            return;
                        default:
                            i iVar2 = this.f161402b;
                            j jVar2 = iVar2.f161412i;
                            if (jVar2 == null) {
                                p005kotlin.jvm.internal.s.m("notificationAcceptOrDeclineListener");
                                throw null;
                            }
                            Bundle bundleRequireArguments2 = iVar2.requireArguments();
                            bundleRequireArguments2.getClass();
                            jVar2.x8(bundleRequireArguments2);
                            return;
                    }
                }
            });
        }
        UserLevelImageView userLevelImageView = this.f161404a;
        if (userLevelImageView == null) {
            p005kotlin.jvm.internal.s.m("invitorProfileImage");
            throw null;
        }
        if (bVar == null || (bVar2 = bVar.f44443p) == null) {
            bVar2 = b12.b.f14386g;
        }
        userLevelImageView.setProfileImageData(bVar2);
        zp0.c.a aVar = zp0.c.f206560v;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        aVar.getClass();
        zp0.c cVar = new zp0.c(contextRequireContext);
        cVar.f206565e = bVar != null ? bVar.getProductImageUrl() : null;
        cVar.f206578r = "cache_availability_today";
        cVar.f206570j = 2131231969;
        ImageView imageView = this.f161406c;
        if (imageView != null) {
            cVar.h(imageView);
        } else {
            p005kotlin.jvm.internal.s.m("deviceImage");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsz0/i$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
