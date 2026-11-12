package com.xiaomi.hm.health.device.headset.ui.fragment;

import android.app.Dialog;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.huami.devicex.R;
import com.huami.devicex.manager.DeviceManagerApi;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.headset.help.MediaController;
import com.xiaomi.hm.health.device.headset.ui.fragment.HrReminderSheetDialogFragment;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0001%B\u0007¢\u0006\u0004\b#\u0010$J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\u0007\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J&\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u001a\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0016R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010\"\u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/ui/fragment/HrReminderSheetDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Lorg/koin/core/component/KoinComponent;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onActivityCreated", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onDestroy", "", "a", "Ljava/lang/String;", "address", "Lcom/xiaomi/hm/health/databases/model/Device;", "b", "Lcom/xiaomi/hm/health/databases/model/Device;", "device", "Lcom/xiaomi/hm/health/device/headset/help/MediaController;", "c", "Lcom/xiaomi/hm/health/device/headset/help/MediaController;", "mediaController", "Lcom/huami/devicex/manager/DeviceManagerApi;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "g", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HrReminderSheetDialogFragment extends BottomSheetDialogFragment implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String HR_REMINDER = "hr_reminder";

    @NotNull
    public static final String TAG_HR_REMINDER = "HrReminderSheetDialogFragment";

    @NotNull
    private static final String e = "address";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private String address;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Device device;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private MediaController mediaController;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/ui/fragment/HrReminderSheetDialogFragment$Companion;", "", "", "address", "Lcom/xiaomi/hm/health/device/headset/ui/fragment/HrReminderSheetDialogFragment;", "newInstance", "ADDRESS", "Ljava/lang/String;", "HR_REMINDER", "TAG_HR_REMINDER", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final HrReminderSheetDialogFragment newInstance(@NotNull String address) {
            HrReminderSheetDialogFragment hrReminderSheetDialogFragment = new HrReminderSheetDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("address", address);
            Unit unit = Unit.INSTANCE;
            hrReminderSheetDialogFragment.setArguments(bundle);
            return hrReminderSheetDialogFragment;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HrReminderSheetDialogFragment() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.headset.ui.fragment.HrReminderSheetDialogFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
    }

    private final DeviceManagerApi g() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(HrReminderSheetDialogFragment hrReminderSheetDialogFragment, DialogInterface dialogInterface) {
        MediaController mediaController = hrReminderSheetDialogFragment.mediaController;
        if (mediaController != null) {
            mediaController.stopRing();
        }
        MediaController mediaController2 = hrReminderSheetDialogFragment.mediaController;
        if (mediaController2 != null) {
            mediaController2.release();
        }
        hrReminderSheetDialogFragment.mediaController = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(HrReminderSheetDialogFragment hrReminderSheetDialogFragment, View view) {
        hrReminderSheetDialogFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(final HrReminderSheetDialogFragment hrReminderSheetDialogFragment, View view) throws IOException {
        MediaController mediaController = hrReminderSheetDialogFragment.mediaController;
        if (mediaController != null) {
            mediaController.reset();
        }
        MediaController mediaController2 = hrReminderSheetDialogFragment.mediaController;
        if (mediaController2 != null) {
            mediaController2.setDataSource(false, "hr_reminder_beep.mp3");
        }
        MediaController mediaController3 = hrReminderSheetDialogFragment.mediaController;
        if (mediaController3 == null) {
            return;
        }
        mediaController3.prepare(true, new MediaPlayer.OnPreparedListener() { // from class: u94
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                HrReminderSheetDialogFragment.k(this.a, mediaPlayer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(HrReminderSheetDialogFragment hrReminderSheetDialogFragment, MediaPlayer mediaPlayer) {
        MediaController mediaController = hrReminderSheetDialogFragment.mediaController;
        if (mediaController == null) {
            return;
        }
        mediaController.startRing();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(final HrReminderSheetDialogFragment hrReminderSheetDialogFragment, View view) throws IOException {
        MediaController mediaController = hrReminderSheetDialogFragment.mediaController;
        if (mediaController != null) {
            mediaController.reset();
        }
        MediaController mediaController2 = hrReminderSheetDialogFragment.mediaController;
        if (mediaController2 != null) {
            mediaController2.setDataSource(false, "hr_reminder_beep.mp3");
        }
        MediaController mediaController3 = hrReminderSheetDialogFragment.mediaController;
        if (mediaController3 == null) {
            return;
        }
        mediaController3.prepare(true, new MediaPlayer.OnPreparedListener() { // from class: v94
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                HrReminderSheetDialogFragment.m(this.a, mediaPlayer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(HrReminderSheetDialogFragment hrReminderSheetDialogFragment, MediaPlayer mediaPlayer) {
        MediaController mediaController = hrReminderSheetDialogFragment.mediaController;
        if (mediaController == null) {
            return;
        }
        mediaController.startRing();
    }

    @JvmStatic
    @NotNull
    public static final HrReminderSheetDialogFragment newInstance(@NotNull String str) {
        return INSTANCE.newInstance(str);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        DeviceManagerApi deviceManagerApiG = g();
        HMDeviceType hMDeviceType = HMDeviceType.HEADSET;
        String str = this.address;
        if (str == null) {
            str = "";
        }
        this.device = deviceManagerApiG.getBindDevice(hMDeviceType, str);
        if (TextUtils.isEmpty(this.address)) {
            dismiss();
        }
        this.mediaController = new MediaController(requireContext());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, R.style.CustomBottomSheetDialogTheme);
        Bundle arguments = getArguments();
        this.address = arguments == null ? null : arguments.getString("address");
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.layout_headset_hr_reminder_notification, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        MediaController mediaController = this.mediaController;
        if (mediaController != null) {
            mediaController.stopRing();
        }
        MediaController mediaController2 = this.mediaController;
        if (mediaController2 != null) {
            mediaController2.release();
        }
        this.mediaController = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: t94
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    HrReminderSheetDialogFragment.h(this.a, dialogInterface);
                }
            });
        }
        View view2 = getView();
        ((ImageButton) (view2 == null ? null : view2.findViewById(R.id.bind_headset_device_cancel))).setOnClickListener(new View.OnClickListener() { // from class: x94
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                HrReminderSheetDialogFragment.i(this.a, view3);
            }
        });
        View view3 = getView();
        ((ImageButton) (view3 == null ? null : view3.findViewById(R.id.hr_reminder_audition))).setOnClickListener(new View.OnClickListener() { // from class: y94
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) throws IOException {
                HrReminderSheetDialogFragment.j(this.a, view4);
            }
        });
        View view4 = getView();
        ((TextView) (view4 != null ? view4.findViewById(R.id.hr_reminder_audition_hint) : null)).setOnClickListener(new View.OnClickListener() { // from class: w94
            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) throws IOException {
                HrReminderSheetDialogFragment.l(this.a, view5);
            }
        });
    }
}
