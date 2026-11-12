package com.huami.assistant.ui.v2;

import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelLazy;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import com.huami.assistant.R;
import com.huami.assistant.ui.v2.MifitScheduleActivity;
import com.huami.assistant.ui.v2.viewmodel.SettingViewModel;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.lib.rainbow.widget.SwitchCompat;
import com.huami.tools.log.HMLog;
import com.huami.watch.util.AndroidPermissions;
import com.tbruyelle.rxpermissions2.RxPermissions;
import io.reactivex.functions.Consumer;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014R\u001d\u0010\u000f\u001a\u00020\u00058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/huami/assistant/ui/v2/MifitScheduleActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", "initTitle", "initView", "Lcom/huami/assistant/ui/v2/viewmodel/SettingViewModel;", "settingViewModel", "m", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "a", "Lkotlin/Lazy;", "h", "()Lcom/huami/assistant/ui/v2/viewmodel/SettingViewModel;", "viewModel", "<init>", "()V", "Companion", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class MifitScheduleActivity extends AppCompatActivity {

    @NotNull
    private static final String b = "MifitScheduleActivity";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(SettingViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.assistant.ui.v2.MifitScheduleActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelStore getA() {
            return this.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.AndroidViewModelFactory>() { // from class: com.huami.assistant.ui.v2.MifitScheduleActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelProvider.AndroidViewModelFactory getA() {
            Application application = this.getApplication();
            if (application != null) {
                return ViewModelProvider.AndroidViewModelFactory.getInstance(application);
            }
            throw new IllegalArgumentException("ViewModel can be accessed only when Activity is attached");
        }
    });

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Boolean bool) {
            super(0);
            this.a = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "request read_calendar permission result:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "request read_calendar error";
        }
    }

    private final SettingViewModel h() {
        return (SettingViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(MifitScheduleActivity mifitScheduleActivity, View view) {
        mifitScheduleActivity.onBackPressed();
    }

    private final void initTitle() {
        ((RainbowTitleBar) findViewById(R.id.action_bar)).setNavigationOnClickListener(new View.OnClickListener() { // from class: a55
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MifitScheduleActivity.i(this.a, view);
            }
        });
    }

    private final void initView() {
        ((SwitchCompat) findViewById(R.id.sw_sync_calendar)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: b55
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                MifitScheduleActivity.j(this.a, compoundButton, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(final MifitScheduleActivity mifitScheduleActivity, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            if (z) {
                new RxPermissions(mifitScheduleActivity).request("android.permission.READ_CALENDAR").subscribe(new Consumer() { // from class: d55
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        MifitScheduleActivity.k(this.a, (Boolean) obj);
                    }
                }, new Consumer() { // from class: e55
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        MifitScheduleActivity.l((Throwable) obj);
                    }
                });
            } else {
                mifitScheduleActivity.h().updateSyncSystemCalendarSwitch(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(MifitScheduleActivity mifitScheduleActivity, Boolean bool) {
        HMLog.info(b, new a(bool));
        mifitScheduleActivity.h().updateSyncSystemCalendarSwitch(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(Throwable th) {
        HMLog.error(b, "", th, b.a);
    }

    private final void m(SettingViewModel settingViewModel) {
        settingViewModel.getSyncSystemCalendarSwitch().observe(this, new Observer() { // from class: c55
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                MifitScheduleActivity.n(this.a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(MifitScheduleActivity mifitScheduleActivity, Boolean bool) {
        if (bool == null) {
            return;
        }
        bool.booleanValue();
        ((SwitchCompat) mifitScheduleActivity.findViewById(R.id.sw_sync_calendar)).setChecked(bool.booleanValue() && AndroidPermissions.checkGranted(mifitScheduleActivity, "android.permission.READ_CALENDAR"));
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mifit_schedule);
        initTitle();
        m(h());
        initView();
    }
}
