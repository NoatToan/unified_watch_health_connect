package com.xiaomi.hm.health.healthdata.ui.detail.stress;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentTransaction;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.lib.view.image.CircleImageView;
import com.huami.stress.domain.model.SingleStress;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.StatusBarUtil;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.share.HMShareManager;
import com.huami.widget.share.PreShareListener;
import com.huami.widget.share.ShareContent;
import com.huami.widget.share.SharePanel;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.healthdata.ui.detail.stress.SingleStressShareActivity;
import com.xiaomi.hm.health.healthdata.utils.stress.StressDataHelper;
import com.xiaomi.hm.health.manager.AvatarManager;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import com.xiaomi.hm.health.utils.Utils;
import java.io.Serializable;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0002\u0016\u0011B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/detail/stress/SingleStressShareActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/huami/widget/share/PreShareListener;", "", "f", "Lcom/huami/stress/domain/model/SingleStress;", "stress", "i", "Lcom/huami/widget/share/ShareContent;", "e", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "shareType", "onPreShare", "Lcom/huami/widget/share/SharePanel;", "a", "Lcom/huami/widget/share/SharePanel;", "sharePanel", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SingleStressShareActivity extends AppCompatActivity implements PreShareListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String b = "extra_stress";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SharePanel sharePanel = new SharePanel();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/detail/stress/SingleStressShareActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/stress/domain/model/SingleStress;", "stress", "", "navigate", "", "EXTRA_STRESS", "Ljava/lang/String;", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void navigate(@NotNull Context context, @NotNull SingleStress stress) {
            Intent intent = new Intent(context, (Class<?>) SingleStressShareActivity.class);
            intent.putExtra(SingleStressShareActivity.b, stress);
            Unit unit = Unit.INSTANCE;
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, d2 = {"com/xiaomi/hm/health/healthdata/ui/detail/stress/SingleStressShareActivity$a", "Lcom/huami/widget/share/HMShareManager$ShareResultListener;", "", "shareType", "", "onComplete", "errorCode", "", "errorMsg", "onError", "onCancel", "onClicked", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a implements HMShareManager.ShareResultListener {
        @Override // com.huami.widget.share.HMShareManager.ShareResultListener
        public void onCancel(int shareType) {
        }

        @Override // com.huami.widget.share.HMShareManager.ShareResultListener
        public void onClicked(int shareType) {
        }

        @Override // com.huami.widget.share.HMShareManager.ShareResultListener
        public void onComplete(int shareType) {
        }

        @Override // com.huami.widget.share.HMShareManager.ShareResultListener
        public void onError(int shareType, int errorCode, @NotNull String errorMsg) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ ShareContent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ShareContent shareContent) {
            super(0);
            this.a = shareContent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "bitmapUrl = " + this.a.bitmapUrl;
        }
    }

    private final ShareContent e() {
        ShareContent shareContent = new ShareContent();
        shareContent.title = getString(R.string.app_name);
        shareContent.bitmapUrl = Utils.captureViewShare((ConstraintLayout) findViewById(com.xiaomi.hm.health.R.id.content_layout), this);
        HMLog.info("Share Stress", new b(shareContent));
        return shareContent;
    }

    private final void f() {
        this.sharePanel.setShareResultListener(new a());
        Bundle bundle = new Bundle();
        bundle.putBoolean("share_type", true);
        this.sharePanel.setArguments(bundle);
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.add(R.id.share_panel_container, this.sharePanel);
        this.sharePanel.setShareListener(this);
        fragmentTransactionBeginTransaction.commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(SingleStressShareActivity singleStressShareActivity, View view) {
        singleStressShareActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(SingleStressShareActivity singleStressShareActivity) {
        singleStressShareActivity.sharePanel.onSharePrepared(singleStressShareActivity.e());
    }

    private final void i(SingleStress stress) {
        HMUserInfo userInfo = HMPersonInfo.getInstance().getUserInfo();
        AvatarManager.updateAvatarUI(this, (CircleImageView) findViewById(com.xiaomi.hm.health.R.id.user_avatar), userInfo.getAvatarPath(), userInfo.getAvatar(), userInfo.getNickname());
        ((TypefaceTextView) findViewById(com.xiaomi.hm.health.R.id.user_name)).setText(userInfo.getNickname());
        ((TypefaceTextView) findViewById(com.xiaomi.hm.health.R.id.date_tv)).setText(TimeUtils.formatDateTime_y_12(this, new Date(stress.getTimestamp())));
        ((TypefaceTextView) findViewById(com.xiaomi.hm.health.R.id.stress_value)).setText(String.valueOf(stress.getValue()));
        ((TypefaceTextView) findViewById(com.xiaomi.hm.health.R.id.level_str)).setText(StressDataHelper.INSTANCE.getStressLevelStr(this, stress.getValue()));
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_stress_share);
        StatusBarUtil.setStatusColor(this, true, !RainbowUtils.isDarkMode(this), 0);
        ((Button) findViewById(com.xiaomi.hm.health.R.id.back_button)).setOnClickListener(new View.OnClickListener() { // from class: jv6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SingleStressShareActivity.g(this.a, view);
            }
        });
        f();
        Serializable serializableExtra = getIntent().getSerializableExtra(b);
        if (serializableExtra == null) {
            return;
        }
        i((SingleStress) serializableExtra);
    }

    @Override // com.huami.widget.share.PreShareListener
    public void onPreShare(int shareType) {
        runOnUiThread(new Runnable() { // from class: kv6
            @Override // java.lang.Runnable
            public final void run() {
                SingleStressShareActivity.h(this.a);
            }
        });
    }
}
