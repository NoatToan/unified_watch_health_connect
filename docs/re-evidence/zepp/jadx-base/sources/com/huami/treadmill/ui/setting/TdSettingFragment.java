package com.huami.treadmill.ui.setting;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.treadmill.R;
import com.huami.treadmill.ext.ViewExtKt;
import com.huami.treadmill.util.AudioManagerHelper;
import com.huami.treadmill.util.BlurBitmapUtil;
import com.huami.treadmill.util.LightHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fJ\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/huami/treadmill/ui/setting/TdSettingFragment;", "Landroidx/fragment/app/DialogFragment;", "", "b", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onResume", "Landroidx/fragment/app/FragmentManager;", "supportFragmentManager", "showSettingFragment", "onDestroy", "a", "Lcom/huami/treadmill/ui/setting/TdSettingFragment;", "fragment", "Landroid/content/BroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "mReceiver", "", "c", "Ljava/lang/String;", "VOLUME_CHANGED_ACTION", "<init>", "()V", "Companion", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class TdSettingFragment extends DialogFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String d = TdSettingFragment.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private TdSettingFragment fragment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private BroadcastReceiver mReceiver;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/huami/treadmill/ui/setting/TdSettingFragment$Companion;", "", "Lcom/huami/treadmill/ui/setting/TdSettingFragment;", "newInstance", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final TdSettingFragment newInstance() {
            TdSettingFragment tdSettingFragment = new TdSettingFragment();
            tdSettingFragment.fragment = tdSettingFragment;
            return tdSettingFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<View, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            TdSettingFragment.this.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<View, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            TdSettingFragment.this.dismiss();
        }
    }

    private final void b() {
        this.mReceiver = new BroadcastReceiver() { // from class: com.huami.treadmill.ui.setting.TdSettingFragment$registerReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(@NotNull Context context, @NotNull Intent intent) {
                String action = intent.getAction();
                if ((action == null ? null : Boolean.valueOf(action.equals(this.a.VOLUME_CHANGED_ACTION))).booleanValue()) {
                    View view = this.a.getView();
                    ((SeekBar) (view != null ? view.findViewById(R.id.broadcast_volume_controller) : null)).setProgress(AudioManagerHelper.INSTANCE.getInstance(context).get100CurrentVolume());
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(this.VOLUME_CHANGED_ACTION);
        requireActivity().registerReceiver(this.mReceiver, intentFilter);
    }

    @JvmStatic
    @NotNull
    public static final TdSettingFragment newInstance() {
        return INSTANCE.newInstance();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.td_fragment_setting, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.mReceiver != null) {
            requireActivity().unregisterReceiver(this.mReceiver);
            this.mReceiver = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        Window window = requireDialog().getWindow();
        WindowManager.LayoutParams attributes = window == null ? null : window.getAttributes();
        if (attributes != null) {
            attributes.width = -1;
        }
        if (attributes != null) {
            attributes.height = -1;
        }
        Window window2 = requireDialog().getWindow();
        if (window2 != null) {
            window2.setAttributes(attributes);
        }
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        FragmentActivity activity = getActivity();
        FrameLayout frameLayout = activity == null ? null : (FrameLayout) activity.findViewById(R.id.content);
        if (frameLayout != null) {
            frameLayout.setDrawingCacheEnabled(true);
            frameLayout.buildDrawingCache();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(frameLayout.getDrawingCache());
            frameLayout.setDrawingCacheEnabled(false);
            Bitmap bitmapBlurBitmap = BlurBitmapUtil.INSTANCE.blurBitmap(getContext(), bitmapCreateBitmap);
            View view2 = getView();
            ((LinearLayout) (view2 == null ? null : view2.findViewById(R.id.container))).setBackground(new BitmapDrawable(getResources(), bitmapBlurBitmap));
        }
        View view3 = getView();
        ViewExtKt.smartClick$default(view3 == null ? null : view3.findViewById(R.id.container), 0L, new a(), 1, null);
        View view4 = getView();
        ((SeekBar) (view4 == null ? null : view4.findViewById(R.id.broadcast_volume_controller))).setMax(100);
        Context context = getContext();
        if (context != null) {
            View view5 = getView();
            ((SeekBar) (view5 == null ? null : view5.findViewById(R.id.broadcast_volume_controller))).setProgress(AudioManagerHelper.INSTANCE.getInstance(context).get100CurrentVolume());
        }
        View view6 = getView();
        ((SeekBar) (view6 == null ? null : view6.findViewById(R.id.broadcast_volume_controller))).setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.huami.treadmill.ui.setting.TdSettingFragment.onViewCreated.4
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(@Nullable SeekBar seekBar, int progress, boolean fromUser) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(@Nullable SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(@Nullable SeekBar seekBar) {
                Log.i(TdSettingFragment.d, seekBar == null ? null : Integer.valueOf(seekBar.getProgress()).toString());
                Context context2 = TdSettingFragment.this.getContext();
                if (context2 == null) {
                    return;
                }
                AudioManagerHelper.INSTANCE.getInstance(context2).setAudioType(3).setVoice100(seekBar == null ? 0 : seekBar.getProgress());
            }
        });
        View view7 = getView();
        ((SeekBar) (view7 == null ? null : view7.findViewById(R.id.light_controller))).setMax(100);
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            View view8 = getView();
            ((SeekBar) (view8 == null ? null : view8.findViewById(R.id.light_controller))).setProgress(LightHelper.INSTANCE.getInstance().getAppLight100(activity2));
        }
        View view9 = getView();
        ((SeekBar) (view9 == null ? null : view9.findViewById(R.id.light_controller))).setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.huami.treadmill.ui.setting.TdSettingFragment.onViewCreated.6
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(@Nullable SeekBar seekBar, int progress, boolean fromUser) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(@Nullable SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(@Nullable SeekBar seekBar) {
                FragmentActivity activity3 = TdSettingFragment.this.getActivity();
                if (activity3 == null) {
                    return;
                }
                LightHelper.INSTANCE.getInstance().setAppLight100(activity3, seekBar == null ? 0 : seekBar.getProgress());
            }
        });
        View view10 = getView();
        ((ConstraintLayout) (view10 == null ? null : view10.findViewById(R.id.bg_music_group))).setVisibility(8);
        View view11 = getView();
        ViewExtKt.smartClick$default(view11 != null ? view11.findViewById(R.id.td_unsave_btn) : null, 0L, new b(), 1, null);
        b();
    }

    public final void showSettingFragment(@NotNull FragmentManager supportFragmentManager) {
        if (this.fragment == null) {
            this.fragment = INSTANCE.newInstance();
        }
        TdSettingFragment tdSettingFragment = this.fragment;
        if (tdSettingFragment != null) {
            tdSettingFragment.setStyle(0, R.style.Dialog_FullScreen);
        }
        TdSettingFragment tdSettingFragment2 = this.fragment;
        if (tdSettingFragment2 == null) {
            return;
        }
        tdSettingFragment2.show(supportFragmentManager, d);
    }
}
