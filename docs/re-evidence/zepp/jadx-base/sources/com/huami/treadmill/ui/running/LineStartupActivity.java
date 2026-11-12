package com.huami.treadmill.ui.running;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import androidx.p008lifecycle.Observer;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.treadmill.R;
import com.huami.treadmill.data.BoltSportCommand;
import com.huami.treadmill.data.ErrorStatus;
import com.huami.treadmill.data.Items;
import com.huami.treadmill.data.TdLineDetail;
import com.huami.treadmill.eventbus.SportCommandEvent;
import com.huami.treadmill.ext.AppCompatActivityExtKt;
import com.huami.treadmill.ext.ViewExtKt;
import com.huami.treadmill.proxy.ProxyTreadmill;
import com.huami.treadmill.ui.component.HorizontalAvatar;
import com.huami.treadmill.ui.running.LineStartupActivity;
import com.huami.treadmill.ui.setting.ErrorFragment;
import com.huami.treadmill.ui.setting.TdSettingFragment;
import com.huami.treadmill.util.SportDataHelper;
import com.huami.view.basetitle.BaseFragmentActivity;
import com.huami.widget.typeface.TypefaceTextView;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ\b\u0010\f\u001a\u00020\u0002H\u0014R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/huami/treadmill/ui/running/LineStartupActivity;", "Lcom/huami/view/basetitle/BaseFragmentActivity;", "", "initView", "e", GoogleApiAvailabilityLight.a, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/huami/treadmill/eventbus/SportCommandEvent;", "commandEvent", "onEventMainThread", "onDestroy", "Lcom/huami/treadmill/ui/running/LineStartupViewModel;", "a", "Lcom/huami/treadmill/ui/running/LineStartupViewModel;", "viewModel", "", "b", "J", "mLineId", "c", "mLineTime", "mLineNext", "", "F", "mLineDistance", "", "f", "Ljava/lang/String;", "mLineName", "<init>", "()V", "Companion", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class LineStartupActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String STARTUP_LINE_DISTANCE = "line_distance";

    @NotNull
    public static final String STARTUP_LINE_ID = "line_id";

    @NotNull
    public static final String STARTUP_LINE_NAME = "line_name";

    @NotNull
    public static final String STARTUP_LINE_TIME = "line_time";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private LineStartupViewModel viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long mLineId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private long mLineTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private long mLineNext;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private float mLineDistance;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private String mLineName = "";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tR\u0016\u0010\r\u001a\u00020\t8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\t8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/huami/treadmill/ui/running/LineStartupActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "id", "time", "", "distance", "", "name", "", "startMe", "STARTUP_LINE_DISTANCE", "Ljava/lang/String;", "STARTUP_LINE_ID", "STARTUP_LINE_NAME", "STARTUP_LINE_TIME", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void startMe(@NotNull Context context, long id, long time, float distance, @NotNull String name) {
            Intent intent = new Intent(context, (Class<?>) LineStartupActivity.class);
            intent.setFlags(268435456);
            intent.putExtra("line_id", id);
            intent.putExtra("line_time", time);
            intent.putExtra("line_distance", distance);
            intent.putExtra("line_name", name);
            context.startActivity(intent);
        }
    }

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
            TdSettingFragment.INSTANCE.newInstance().showSettingFragment(LineStartupActivity.this.getSupportFragmentManager());
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
            LineStartupActivity.this.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<View, Unit> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            LineStartupViewModel lineStartupViewModel = LineStartupActivity.this.viewModel;
            Objects.requireNonNull(lineStartupViewModel);
            lineStartupViewModel.getLineDetail(LineStartupActivity.this.mLineId, LineStartupActivity.this.mLineTime, LineStartupActivity.this.mLineNext);
        }
    }

    private final void d() {
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
        ((ImageView) findViewById(R.id.line_startup_breath)).startAnimation(animationSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        ViewExtKt.smartClick$default((ImageView) findViewById(R.id.td_line_startup_setting_btn), 0L, new a(), 1, null);
        ViewExtKt.smartClick$default((ImageView) findViewById(R.id.td_line_startup_back_btn), 0L, new b(), 1, null);
        ViewExtKt.smartClick$default(findViewById(R.id.startup_ad_friend_refresh), 0L, new c(), 1, null);
        ProxyTreadmill.INSTANCE.getInstance().setErrorStatusListener(new Function1<ErrorStatus, Unit>() { // from class: com.huami.treadmill.ui.running.LineStartupActivity$initClick$4
            {
                super(1);
            }

            public final void a(@NotNull ErrorStatus errorStatus) {
                if (errorStatus != ErrorStatus.NONE) {
                    ErrorFragment errorFragmentNewInstance = ErrorFragment.INSTANCE.newInstance();
                    FragmentManager supportFragmentManager = this.a.getSupportFragmentManager();
                    int iOrdinal = errorStatus.ordinal();
                    final LineStartupActivity lineStartupActivity = this.a;
                    errorFragmentNewInstance.showErrorFragment(supportFragmentManager, iOrdinal, new ErrorFragment.ErrorListener() { // from class: com.huami.treadmill.ui.running.LineStartupActivity$initClick$4.1
                        @Override // com.huami.treadmill.ui.setting.ErrorFragment.ErrorListener
                        public void onFinish() {
                            lineStartupActivity.e();
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(LineStartupActivity lineStartupActivity, Items items) {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        ((TypefaceTextView) lineStartupActivity.findViewById(R.id.startup_ad_friend_tx)).setText(lineStartupActivity.getApplicationContext().getResources().getQuantityString(R.plurals.td_line_startup_friend_upload, items.getItems().size(), Integer.valueOf(items.getItems().size())));
        Iterator it2 = items.getItems().iterator();
        while (it2.hasNext()) {
            arrayList.add(((TdLineDetail) it2.next()).getLineDetailAvatar());
        }
        String next = items.getNext();
        if (next != null && next.length() != 0) {
            z = false;
        }
        if (!z) {
            lineStartupActivity.mLineNext = Long.parseLong(items.getNext());
        }
        ((HorizontalAvatar) lineStartupActivity.findViewById(R.id.horizontal_avatar)).addAvatas(arrayList);
        if (items.getItems().size() >= 8) {
            lineStartupActivity.findViewById(R.id.startup_ad_friend_refresh).setVisibility(0);
        }
    }

    private final void initView() {
        TypefaceTextView typefaceTextView = (TypefaceTextView) findViewById(R.id.startup_ad_tx);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        typefaceTextView.setText(String.format(Locale.getDefault(), getString(R.string.td_line_startup_ad), Arrays.copyOf(new Object[]{this.mLineName}, 1)));
        findViewById(R.id.startup_ad_friend_refresh).setVisibility(8);
        LineStartupViewModel lineStartupViewModel = this.viewModel;
        Objects.requireNonNull(lineStartupViewModel);
        lineStartupViewModel.getLineDetail().observe(this, new Observer() { // from class: lo4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                LineStartupActivity.f(this.a, (Items) obj);
            }
        });
        LineStartupViewModel lineStartupViewModel2 = this.viewModel;
        Objects.requireNonNull(lineStartupViewModel2);
        lineStartupViewModel2.getLineDetail(this.mLineId, this.mLineTime, this.mLineNext);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_startup);
        this.viewModel = (LineStartupViewModel) AppCompatActivityExtKt.obtainViewModel(this, LineStartupViewModel.class);
        EventBus.getDefault().register(this);
        SportDataHelper.INSTANCE.getInstance().registerSportData();
        this.mLineId = getIntent().getLongExtra("line_id", 0L);
        this.mLineTime = getIntent().getLongExtra("line_time", 0L);
        this.mLineDistance = getIntent().getFloatExtra("line_distance", 0.0f);
        this.mLineName = getIntent().getStringExtra("line_name");
        e();
        d();
        initView();
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
            LineRunningActivity.INSTANCE.startMe(getApplicationContext(), false, this.mLineId, this.mLineTime, this.mLineNext, this.mLineDistance, this.mLineName);
            finish();
        }
    }
}
