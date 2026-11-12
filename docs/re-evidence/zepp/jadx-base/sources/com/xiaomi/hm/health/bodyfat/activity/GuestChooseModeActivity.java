package com.xiaomi.hm.health.bodyfat.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.view.basetitle.StatusBarUtil;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.activity.GuestChooseModeActivity;
import com.xiaomi.hm.health.bodyfat.utils.BFTitleStyleKt;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/activity/GuestChooseModeActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "initTitle", "initView", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class GuestChooseModeActivity extends BaseTitleActivity {
    private final void initTitle() {
        getRightTitle().setVisibility(8);
        getLeftText().setVisibility(8);
    }

    private final void initView() {
        ((TextView) findViewById(R.id.btn_weight)).setOnClickListener(new View.OnClickListener() { // from class: di2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuestChooseModeActivity.n(this.a, view);
            }
        });
        ((TextView) findViewById(R.id.btn_balance)).setOnClickListener(new View.OnClickListener() { // from class: ci2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuestChooseModeActivity.o(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(GuestChooseModeActivity guestChooseModeActivity, View view) {
        AddGuestActivity.INSTANCE.startMe(guestChooseModeActivity, 2);
        guestChooseModeActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(GuestChooseModeActivity guestChooseModeActivity, View view) {
        ConnectScaleActivity.Companion companion = ConnectScaleActivity.INSTANCE;
        companion.launch(guestChooseModeActivity, companion.getTYPE_GUEST_BALANCE());
        guestChooseModeActivity.finish();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        BFTitleStyleKt.setDefaultTheme(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest_choose_mode);
        StatusBarUtil.setStatusColor(this, true, !RainbowUtils.isDarkMode(this), 0);
        initView();
        initTitle();
    }
}
