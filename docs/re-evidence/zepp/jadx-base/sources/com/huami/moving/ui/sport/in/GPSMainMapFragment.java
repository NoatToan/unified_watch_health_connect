package com.huami.moving.ui.sport.in;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.mifit.sportlib.utils.LocationChecker;
import com.huami.moving.R;
import com.huami.moving.maps.GPSSportController;
import com.huami.moving.ui.sport.in.GPSMainMapFragment;
import com.huami.moving.ui.utils.GpsUtilDelegate;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.tools.analytics.DbUtils;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000U\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\t*\u0001*\u0018\u0000 12\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b/\u00100J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J!\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0006H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0016J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0002H\u0016J\u0010\u0010\u001d\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bJ\u000e\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010%R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u001d\u0010.\u001a\u00020*8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b'\u0010-¨\u00062"}, d2 = {"Lcom/huami/moving/ui/sport/in/GPSMainMapFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/os/Bundle;", "paramBundle", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", GoogleApiAvailabilityLight.a, "", DbUtils.Const.Columns.Event.EVENT_ID, "", "sportType", "b", "(Ljava/lang/String;Ljava/lang/Integer;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "onCreateView", "onViewCreated", "onDestroyView", "onPause", "onResume", "onDestroy", "outState", "onSaveInstanceState", "Lcom/huami/moving/maps/GPSSportController;", "controller", "setController", "setSportType", "", "useAmap", "setUseAmap", "a", "Lcom/huami/moving/maps/GPSSportController;", "Lcom/huami/android/design/dialog/AlertDialogFragment;", "Lcom/huami/android/design/dialog/AlertDialogFragment;", "gpsAlertDialog", "c", "Ljava/lang/Integer;", "Z", "com/huami/moving/ui/sport/in/GPSMainMapFragment$gpsStatusReceiver$2$1", "e", "Lkotlin/Lazy;", "()Lcom/huami/moving/ui/sport/in/GPSMainMapFragment$gpsStatusReceiver$2$1;", "gpsStatusReceiver", "<init>", "()V", "Companion", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class GPSMainMapFragment extends Fragment {

    @NotNull
    private static final String f = "android.location.PROVIDERS_CHANGED";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private GPSSportController controller;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private AlertDialogFragment gpsAlertDialog;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Integer sportType = 0;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean useAmap = true;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy gpsStatusReceiver = LazyKt__LazyJVMKt.lazy(new Function0<GPSMainMapFragment$gpsStatusReceiver$2.AnonymousClass1>() { // from class: com.huami.moving.ui.sport.in.GPSMainMapFragment$gpsStatusReceiver$2
        {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.huami.moving.ui.sport.in.GPSMainMapFragment$gpsStatusReceiver$2$1] */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AnonymousClass1 invoke() {
            final GPSMainMapFragment gPSMainMapFragment = this.a;
            return new BroadcastReceiver() { // from class: com.huami.moving.ui.sport.in.GPSMainMapFragment$gpsStatusReceiver$2.1
                @Override // android.content.BroadcastReceiver
                public void onReceive(@Nullable Context context, @Nullable Intent intent) {
                    Context context2;
                    String action;
                    boolean zMatches = false;
                    if (intent != null && (action = intent.getAction()) != null) {
                        zMatches = new Regex("android.location.PROVIDERS_CHANGED").matches(action);
                    }
                    if (zMatches && (context2 = gPSMainMapFragment.getContext()) != null) {
                        GPSMainMapFragment gPSMainMapFragment2 = gPSMainMapFragment;
                        if (!LocationChecker.isGPSLocationSupported(context2)) {
                            if (gPSMainMapFragment2.gpsAlertDialog == null) {
                                gPSMainMapFragment2.gpsAlertDialog = GpsUtilDelegate.INSTANCE.genOpenGpsDialog(context2);
                            }
                            gPSMainMapFragment2.gpsAlertDialog.show(gPSMainMapFragment2.getFragmentManager());
                        } else {
                            AlertDialogFragment alertDialogFragment = gPSMainMapFragment2.gpsAlertDialog;
                            if (alertDialogFragment == null) {
                                return;
                            }
                            alertDialogFragment.dismiss();
                            gPSMainMapFragment2.gpsAlertDialog = null;
                        }
                    }
                }
            };
        }
    });

    private final void b(String eventId, Integer sportType) {
        String str;
        CountEventBuilder countEventBuilder = new CountEventBuilder(eventId);
        HashMap map = new HashMap();
        if (sportType != null && sportType.intValue() == 1) {
            str = SportAnalytics.ParamValue.SportType.OUTDOOR_RUNNING;
        } else if (sportType != null && sportType.intValue() == 8) {
            str = SportAnalytics.ParamValue.SportType.TREADMILL;
        } else if (sportType != null && sportType.intValue() == 6) {
            str = "Walking";
        } else {
            str = (sportType != null && sportType.intValue() == 9) ? SportAnalytics.ParamValue.SportType.OUTDOOR_CYCLING : "";
        }
        map.put(SportAnalytics.ParamKey.SPORTS_PAGE, str);
        countEventBuilder.putExtras(map);
        Analytics.recordEvent(countEventBuilder);
    }

    private final GPSMainMapFragment$gpsStatusReceiver$2.AnonymousClass1 c() {
        return (GPSMainMapFragment$gpsStatusReceiver$2.AnonymousClass1) this.gpsStatusReceiver.getValue();
    }

    private final void d(Bundle paramBundle, View view) {
        FragmentManager fragmentManager = Build.VERSION.SDK_INT < 21 ? getFragmentManager() : getChildFragmentManager();
        FragmentActivity activity = getActivity();
        GPSSportController gPSSportController = this.controller;
        if (gPSSportController == null) {
            return;
        }
        gPSSportController.initGPSSolution(activity == null ? null : activity.getApplicationContext(), fragmentManager, view, paramBundle, 1, this.useAmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(GPSMainMapFragment gPSMainMapFragment, View view) {
        GPSSportController gPSSportController = gPSMainMapFragment.controller;
        if (gPSSportController != null) {
            gPSSportController.startFollow();
        }
        gPSMainMapFragment.b(SportAnalytics.EVENT_RUNNING_POSITION_BTN_CLICK, gPSMainMapFragment.sportType);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(!this.useAmap ? R.layout.fragment_running_gps_main_map_google : R.layout.fragment_running_gps_main_map_gaode, (ViewGroup) null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        GPSSportController gPSSportController = this.controller;
        if (gPSSportController == null) {
            return;
        }
        gPSSportController.destroyMap();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        Context context = getContext();
        if (context != null) {
            context.unregisterReceiver(c());
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        GPSSportController gPSSportController = this.controller;
        if (gPSSportController == null) {
            return;
        }
        gPSSportController.pauseMap();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        GPSSportController gPSSportController = this.controller;
        if (gPSSportController == null) {
            return;
        }
        gPSSportController.resumeMap();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        super.onSaveInstanceState(outState);
        GPSSportController gPSSportController = this.controller;
        if (gPSSportController == null) {
            return;
        }
        gPSSportController.saveInstanceStateMap(outState);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Context context = getContext();
        if (context != null) {
            context.registerReceiver(c(), new IntentFilter(f));
        }
        view.findViewById(R.id.running_button_location).setOnClickListener(new View.OnClickListener() { // from class: xc2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                GPSMainMapFragment.e(this.a, view2);
            }
        });
        d(savedInstanceState, view);
    }

    public final void setController(@Nullable GPSSportController controller) {
        this.controller = controller;
    }

    public final void setSportType(int sportType) {
        this.sportType = Integer.valueOf(sportType);
    }

    public final void setUseAmap(boolean useAmap) {
        this.useAmap = useAmap;
    }
}
