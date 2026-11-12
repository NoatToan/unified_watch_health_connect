package com.huami.assistant.ui.v2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.p010navigation.Activity;
import androidx.p010navigation.NavController;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.assistant.R;
import com.huami.assistant.ui.v2.usecase.ScheduleSettingChangeUseCase;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014R\u001d\u0010\f\u001a\u00020\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/huami/assistant/ui/v2/ScheduleActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onDestroy", "Lcom/huami/assistant/ui/v2/usecase/ScheduleSettingChangeUseCase;", "a", "Lkotlin/Lazy;", "c", "()Lcom/huami/assistant/ui/v2/usecase/ScheduleSettingChangeUseCase;", "scheduleSettingChangeUseCase", "<init>", "()V", "Companion", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class ScheduleActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String KEY_SCHEDULE_TITLE = "key_schedule_title";
    private static int b;
    private static int c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy scheduleSettingChangeUseCase = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u0016\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/huami/assistant/ui/v2/ScheduleActivity$Companion;", "", "", "LIST_POSITION", LogUtil.I, "getLIST_POSITION", "()I", "setLIST_POSITION", "(I)V", "LIST_OFFSET", "getLIST_OFFSET", "setLIST_OFFSET", "", "KEY_SCHEDULE_TITLE", "Ljava/lang/String;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getLIST_OFFSET() {
            return ScheduleActivity.c;
        }

        public final int getLIST_POSITION() {
            return ScheduleActivity.b;
        }

        public final void setLIST_OFFSET(int i) {
            ScheduleActivity.c = i;
        }

        public final void setLIST_POSITION(int i) {
            ScheduleActivity.b = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/assistant/ui/v2/usecase/ScheduleSettingChangeUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ScheduleSettingChangeUseCase> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ScheduleSettingChangeUseCase invoke() {
            return new ScheduleSettingChangeUseCase(ScheduleActivity.this);
        }
    }

    private final ScheduleSettingChangeUseCase c() {
        return (ScheduleSettingChangeUseCase) this.scheduleSettingChangeUseCase.getValue();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_host);
        int intExtra = getIntent().getIntExtra(KEY_SCHEDULE_TITLE, R.string.schedule);
        NavController navControllerFindNavController = Activity.findNavController(this, R.id.nav_host);
        int i = R.navigation.nav_assistant_v2;
        Bundle bundle = new Bundle();
        bundle.putString(KEY_SCHEDULE_TITLE, getString(intExtra));
        Unit unit = Unit.INSTANCE;
        navControllerFindNavController.setGraph(i, bundle);
        b = 0;
        c = 0;
        c().execute();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        c().unRegisterCallBack();
        super.onDestroy();
    }
}
