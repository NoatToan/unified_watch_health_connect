package com.huami.femalehealth.uilib.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.femalehealth.uilib.R;
import com.huami.femalehealth.uilib.ui.activity.InstructionsActivity;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¨\u0006\n"}, d2 = {"Lcom/huami/femalehealth/uilib/ui/activity/InstructionsActivity;", "Lcom/huami/femalehealth/uilib/ui/activity/FHBaseTitleActivity;", "", GoogleApiAvailabilityLight.a, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "<init>", "()V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class InstructionsActivity extends FHBaseTitleActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String a = "activityTitle";

    @NotNull
    private static final String b = "title";

    @NotNull
    private static final String c = "content";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004R\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/huami/femalehealth/uilib/ui/activity/InstructionsActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", InstructionsActivity.a, "title", "content", "", "start", "ACTIVITY_TITLE", "Ljava/lang/String;", "CONTENT", ShareConstants.TITLE, "<init>", "()V", "uilib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void start(@NotNull Context context, @NotNull String activityTitle, @NotNull String title, @NotNull String content) {
            Intent intent = new Intent(context, (Class<?>) InstructionsActivity.class);
            intent.putExtra(InstructionsActivity.a, activityTitle);
            intent.putExtra("title", title);
            intent.putExtra("content", content);
            context.startActivity(intent);
        }
    }

    private final void d() {
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) findViewById(R.id.tv_title_bar);
        rainbowTitleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: uf4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InstructionsActivity.e(this.a, view);
            }
        });
        rainbowTitleBar.setTitle(intent.getStringExtra(a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(InstructionsActivity instructionsActivity, View view) {
        instructionsActivity.finish();
    }

    @Override // com.huami.femalehealth.uilib.ui.activity.FHBaseTitleActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.femalehealth.uilib.ui.activity.FHBaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fh_activity_instructions);
        d();
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        ((TextView) findViewById(R.id.tv_instructions_activity_title)).setText(intent.getStringExtra("title"));
        ((TextView) findViewById(R.id.tv_instructions_content)).setText(intent.getStringExtra("content"));
    }
}
