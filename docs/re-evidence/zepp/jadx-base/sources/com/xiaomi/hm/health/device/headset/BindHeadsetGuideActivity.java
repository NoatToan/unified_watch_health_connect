package com.xiaomi.hm.health.device.headset;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.huami.devicex.R;
import com.huami.tools.analytics.DbUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.baseui.BaseTitleBarExtKt;
import com.xiaomi.hm.health.device.headset.BindHeadsetGuideActivity;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/BindHeadsetGuideActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class BindHeadsetGuideActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/BindHeadsetGuideActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/content/Intent;", "newIntent", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Intent newIntent(@NotNull Context context) {
            return new Intent(context, (Class<?>) BindHeadsetGuideActivity.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(BindHeadsetGuideActivity bindHeadsetGuideActivity, View view) {
        bindHeadsetGuideActivity.onBackPressed();
    }

    @JvmStatic
    @NotNull
    public static final Intent newIntent(@NotNull Context context) {
        return INSTANCE.newIntent(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(BindHeadsetGuideActivity bindHeadsetGuideActivity, View view) {
        bindHeadsetGuideActivity.setResult(-1);
        bindHeadsetGuideActivity.finish();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bind_headset_guide);
        BaseTitleBarExtKt.setTitleBar(this, "", null, R.color.s38, BaseTitleActivity.STYLE.NONE);
        ((TextView) findViewById(R.id.tv_cancel)).setOnClickListener(new View.OnClickListener() { // from class: sv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BindHeadsetGuideActivity.n(this.a, view);
            }
        });
        ((TextView) findViewById(R.id.tv_next)).setOnClickListener(new View.OnClickListener() { // from class: rv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BindHeadsetGuideActivity.o(this.a, view);
            }
        });
    }
}
