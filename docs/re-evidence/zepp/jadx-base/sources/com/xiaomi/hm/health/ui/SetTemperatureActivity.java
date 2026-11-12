package com.xiaomi.hm.health.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.huami.tools.analytics.DbUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\u001d\u0010\u000b\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0010\u001a\u00020\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/ui/SetTemperatureActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/widget/EditText;", "x", "Lkotlin/Lazy;", "m", "()Landroid/widget/EditText;", "editText", "Landroid/widget/Button;", "y", "l", "()Landroid/widget/Button;", "done", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SetTemperatureActivity extends BaseTitleActivity {

    @Nullable
    private static Integer z;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy editText = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Lazy done = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final boolean A = GlobalConfig.get().isBuildInner();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0019\u0010\u000e\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/ui/SetTemperatureActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "start", "", "temperature", "Ljava/lang/Integer;", "getTemperature", "()Ljava/lang/Integer;", "setTemperature", "(Ljava/lang/Integer;)V", "", "canTestTemperature", "Z", "getCanTestTemperature", "()Z", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean getCanTestTemperature() {
            return SetTemperatureActivity.A;
        }

        @Nullable
        public final Integer getTemperature() {
            return SetTemperatureActivity.z;
        }

        public final void setTemperature(@Nullable Integer num) {
            SetTemperatureActivity.z = num;
        }

        @JvmStatic
        public final void start(@NotNull Context context) {
            context.startActivity(new Intent(context, (Class<?>) SetTemperatureActivity.class));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/widget/Button;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Button> {
        public a() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(SetTemperatureActivity setTemperatureActivity, View view) {
            SetTemperatureActivity.INSTANCE.setTemperature(l.toIntOrNull(setTemperatureActivity.m().getText().toString()));
            setTemperatureActivity.finish();
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Button invoke() {
            Button button = new Button(SetTemperatureActivity.this);
            final SetTemperatureActivity setTemperatureActivity = SetTemperatureActivity.this;
            button.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            button.setText("设置");
            button.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.ui.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SetTemperatureActivity.a.c(setTemperatureActivity, view);
                }
            });
            return button;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/widget/EditText;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<EditText> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EditText invoke() {
            EditText editText = new EditText(SetTemperatureActivity.this);
            editText.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            editText.setHint("输入测试温度，摄氏度");
            editText.setHintTextColor(-7829368);
            editText.setTextColor(-16777216);
            return editText;
        }
    }

    private final Button l() {
        return (Button) this.done.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditText m() {
        return (EditText) this.editText.getValue();
    }

    @JvmStatic
    public static final void start(@NotNull Context context) {
        INSTANCE.start(context);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.addView(m());
        linearLayout.addView(l());
        Unit unit = Unit.INSTANCE;
        setContentView(linearLayout);
    }
}
