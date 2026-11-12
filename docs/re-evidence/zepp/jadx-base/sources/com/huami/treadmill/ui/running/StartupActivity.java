package com.huami.treadmill.ui.running;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.treadmill.R;
import com.huami.treadmill.data.BoltSportCommand;
import com.huami.treadmill.data.ErrorStatus;
import com.huami.treadmill.eventbus.SportCommandEvent;
import com.huami.treadmill.ext.AppCompatActivityExtKt;
import com.huami.treadmill.ext.ViewExtKt;
import com.huami.treadmill.proxy.ProxyTreadmill;
import com.huami.treadmill.ui.setting.ErrorFragment;
import com.huami.treadmill.ui.setting.TdSettingFragment;
import com.huami.treadmill.util.SportDataHelper;
import com.huami.view.basetitle.BaseFragmentActivity;
import de.greenrobot.event.EventBus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0014R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/huami/treadmill/ui/running/StartupActivity;", "Lcom/huami/view/basetitle/BaseFragmentActivity;", "", GoogleApiAvailabilityLight.a, "c", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/huami/treadmill/eventbus/SportCommandEvent;", "commandEvent", "onEventMainThread", "onDestroy", "Lcom/huami/treadmill/ui/running/StartupViewModel;", "a", "Lcom/huami/treadmill/ui/running/StartupViewModel;", "viewModel", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class StartupActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private StartupViewModel viewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BoltSportCommand.values().length];
            iArr[BoltSportCommand.START.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
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
            TdSettingFragment.INSTANCE.newInstance().showSettingFragment(StartupActivity.this.getSupportFragmentManager());
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
            StartupActivity.this.finish();
        }
    }

    private final void c() {
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setRepeatMode(1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.1f, 1.5f);
        alphaAnimation.setRepeatCount(-1);
        alphaAnimation.setDuration(1500L);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.5f, 0.1f);
        alphaAnimation2.setRepeatCount(-1);
        alphaAnimation2.setDuration(1500L);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(alphaAnimation2);
        ((ImageView) findViewById(R.id.startup_breath)).startAnimation(animationSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        ViewExtKt.smartClick$default((ImageView) findViewById(R.id.td_startup_setting_btn), 0L, new a(), 1, null);
        ViewExtKt.smartClick$default((ImageView) findViewById(R.id.td_startup_back_btn), 0L, new b(), 1, null);
        ProxyTreadmill.INSTANCE.getInstance().setErrorStatusListener(new Function1<ErrorStatus, Unit>() { // from class: com.huami.treadmill.ui.running.StartupActivity$initClick$3
            {
                super(1);
            }

            public final void a(@NotNull ErrorStatus errorStatus) {
                if (errorStatus != ErrorStatus.NONE) {
                    ErrorFragment errorFragmentNewInstance = ErrorFragment.INSTANCE.newInstance();
                    FragmentManager supportFragmentManager = this.a.getSupportFragmentManager();
                    int iOrdinal = errorStatus.ordinal();
                    final StartupActivity startupActivity = this.a;
                    errorFragmentNewInstance.showErrorFragment(supportFragmentManager, iOrdinal, new ErrorFragment.ErrorListener() { // from class: com.huami.treadmill.ui.running.StartupActivity$initClick$3.1
                        @Override // com.huami.treadmill.ui.setting.ErrorFragment.ErrorListener
                        public void onFinish() {
                            startupActivity.d();
                        }
                    });
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ErrorStatus errorStatus) {
                a(errorStatus);
                return Unit.INSTANCE;
            }
        });
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);
        this.viewModel = (StartupViewModel) AppCompatActivityExtKt.obtainViewModel(this, StartupViewModel.class);
        EventBus.getDefault().register(this);
        SportDataHelper.INSTANCE.getInstance().registerSportData();
        d();
        c();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
        super.onDestroy();
    }

    public final void onEventMainThread(@NotNull SportCommandEvent commandEvent) {
        if (WhenMappings.$EnumSwitchMapping$0[commandEvent.getCommand().ordinal()] == 1) {
            RunningActivity.INSTANCE.startMe(getApplicationContext(), false);
            finish();
        }
    }
}
