package com.garmin.android.apps.connectmobile.segments.presentation;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import c22.q0;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.i2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/presentation/i;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends Fragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f41451c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public bo1.c f41452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41453b = -1;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f41452a = (bo1.c) context;
        } catch (ClassCastException unused) {
            i2.a.c(i2.f36769a, "StravaMarketingBannerFragment", "Activity must implement TipsListener and StravaBannerConsentListener");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.containsKey("BANNER_MODE")) {
            return;
        }
        this.f41453b = arguments.getInt("BANNER_MODE");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return this.f41453b == 1 ? layoutInflater.inflate(R.layout.gcm3_strava_connect_now_banner, viewGroup, false) : layoutInflater.inflate(R.layout.gcm3_strava_go_premium_banner, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        if (this.f41453b == 1) {
            ImageView imageView = (ImageView) view2.findViewById(R.id.close_btn);
            final int i14 = 0;
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: cg1.d0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.segments.presentation.i f27141b;

                {
                    this.f27141b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    int i15 = i14;
                    com.garmin.android.apps.connectmobile.segments.presentation.i iVar = this.f27141b;
                    switch (i15) {
                        case 0:
                            bo1.c cVar = iVar.f41452a;
                            cVar.getClass();
                            cVar.w4("STRAVA_MARKETING_TIP");
                            break;
                        case 1:
                            com.garmin.android.apps.connectmobile.segments.presentation.i.a aVar = com.garmin.android.apps.connectmobile.segments.presentation.i.f41451c;
                            if (!s3.b()) {
                                ((ag1.a) KoinJavaComponent.get$default(ag1.a.class, null, null, 6, null)).k(iVar.getContext());
                                bo1.c cVar2 = iVar.f41452a;
                                cVar2.getClass();
                                cVar2.w4("STRAVA_MARKETING_TIP");
                            } else {
                                androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(iVar.requireContext());
                                hk1.v vVar = hk1.v.f84200f;
                                aVar2.setTitle(iVar.getString(R.string.lbl_unable_to_connect_to_app, vVar.f84204a)).setMessage(iVar.getString(R.string.msg_unable_to_connect_to_app, vVar.f84204a)).setPositiveButton(R.string.lbl_ok, new ag0.e(27)).setCancelable(false).create().show();
                            }
                            break;
                        default:
                            com.garmin.android.apps.connectmobile.segments.presentation.i.a aVar3 = com.garmin.android.apps.connectmobile.segments.presentation.i.f41451c;
                            PackageManager packageManager = iVar.requireActivity().getPackageManager();
                            hb2.g.a aVar4 = hb2.g.a.STRAVA;
                            if (packageManager.getLaunchIntentForPackage(aVar4.f82804a) == null) {
                                q0.a aVar5 = q0.f23203a;
                                String str = aVar4.f82804a;
                                str.getClass();
                                Context contextRequireContext = iVar.requireContext();
                                contextRequireContext.getClass();
                                aVar5.getClass();
                                q0.a.b(contextRequireContext, str);
                            } else {
                                iVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("strava://athlete/segments/starred")));
                            }
                            break;
                    }
                }
            });
            imageView.setContentDescription(getString(R.string.lbl_close));
            final int i15 = 1;
            ((TextView) view2.findViewById(R.id.connect_button)).setOnClickListener(new View.OnClickListener(this) { // from class: cg1.d0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.segments.presentation.i f27141b;

                {
                    this.f27141b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    int i16 = i15;
                    com.garmin.android.apps.connectmobile.segments.presentation.i iVar = this.f27141b;
                    switch (i16) {
                        case 0:
                            bo1.c cVar = iVar.f41452a;
                            cVar.getClass();
                            cVar.w4("STRAVA_MARKETING_TIP");
                            break;
                        case 1:
                            com.garmin.android.apps.connectmobile.segments.presentation.i.a aVar = com.garmin.android.apps.connectmobile.segments.presentation.i.f41451c;
                            if (!s3.b()) {
                                ((ag1.a) KoinJavaComponent.get$default(ag1.a.class, null, null, 6, null)).k(iVar.getContext());
                                bo1.c cVar2 = iVar.f41452a;
                                cVar2.getClass();
                                cVar2.w4("STRAVA_MARKETING_TIP");
                            } else {
                                androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(iVar.requireContext());
                                hk1.v vVar = hk1.v.f84200f;
                                aVar2.setTitle(iVar.getString(R.string.lbl_unable_to_connect_to_app, vVar.f84204a)).setMessage(iVar.getString(R.string.msg_unable_to_connect_to_app, vVar.f84204a)).setPositiveButton(R.string.lbl_ok, new ag0.e(27)).setCancelable(false).create().show();
                            }
                            break;
                        default:
                            com.garmin.android.apps.connectmobile.segments.presentation.i.a aVar3 = com.garmin.android.apps.connectmobile.segments.presentation.i.f41451c;
                            PackageManager packageManager = iVar.requireActivity().getPackageManager();
                            hb2.g.a aVar4 = hb2.g.a.STRAVA;
                            if (packageManager.getLaunchIntentForPackage(aVar4.f82804a) == null) {
                                q0.a aVar5 = q0.f23203a;
                                String str = aVar4.f82804a;
                                str.getClass();
                                Context contextRequireContext = iVar.requireContext();
                                contextRequireContext.getClass();
                                aVar5.getClass();
                                q0.a.b(contextRequireContext, str);
                            } else {
                                iVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("strava://athlete/segments/starred")));
                            }
                            break;
                    }
                }
            });
            return;
        }
        final int i16 = 2;
        view2.findViewById(R.id.go_premium).setOnClickListener(new View.OnClickListener(this) { // from class: cg1.d0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.segments.presentation.i f27141b;

            {
                this.f27141b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i17 = i16;
                com.garmin.android.apps.connectmobile.segments.presentation.i iVar = this.f27141b;
                switch (i17) {
                    case 0:
                        bo1.c cVar = iVar.f41452a;
                        cVar.getClass();
                        cVar.w4("STRAVA_MARKETING_TIP");
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.segments.presentation.i.a aVar = com.garmin.android.apps.connectmobile.segments.presentation.i.f41451c;
                        if (!s3.b()) {
                            ((ag1.a) KoinJavaComponent.get$default(ag1.a.class, null, null, 6, null)).k(iVar.getContext());
                            bo1.c cVar2 = iVar.f41452a;
                            cVar2.getClass();
                            cVar2.w4("STRAVA_MARKETING_TIP");
                        } else {
                            androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(iVar.requireContext());
                            hk1.v vVar = hk1.v.f84200f;
                            aVar2.setTitle(iVar.getString(R.string.lbl_unable_to_connect_to_app, vVar.f84204a)).setMessage(iVar.getString(R.string.msg_unable_to_connect_to_app, vVar.f84204a)).setPositiveButton(R.string.lbl_ok, new ag0.e(27)).setCancelable(false).create().show();
                        }
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.segments.presentation.i.a aVar3 = com.garmin.android.apps.connectmobile.segments.presentation.i.f41451c;
                        PackageManager packageManager = iVar.requireActivity().getPackageManager();
                        hb2.g.a aVar4 = hb2.g.a.STRAVA;
                        if (packageManager.getLaunchIntentForPackage(aVar4.f82804a) == null) {
                            q0.a aVar5 = q0.f23203a;
                            String str = aVar4.f82804a;
                            str.getClass();
                            Context contextRequireContext = iVar.requireContext();
                            contextRequireContext.getClass();
                            aVar5.getClass();
                            q0.a.b(contextRequireContext, str);
                        } else {
                            iVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("strava://athlete/segments/starred")));
                        }
                        break;
                }
            }
        });
        TextView textView = (TextView) view2.findViewById(R.id.text2_view);
        String string = getString(R.string.strava_beacon_marketing_msg);
        string.getClass();
        textView.setContentDescription(oi0.d.a(view2.getContext(), string, new cg1.e(10)));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/presentation/i$a;", "", "<init>", "()V", "", "MODE_STRAVA_CONNECT_NOW_BANNER", "I", "MODE_STRAVA_PREMIUM_UPPER_BANNER", "", "TAG", "Ljava/lang/String;", "BANNER_MODE", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static i a(int i14) {
            i iVar = new i();
            Bundle bundle = new Bundle();
            bundle.putInt("BANNER_MODE", i14);
            iVar.setArguments(bundle);
            return iVar;
        }

        private a() {
        }
    }
}
