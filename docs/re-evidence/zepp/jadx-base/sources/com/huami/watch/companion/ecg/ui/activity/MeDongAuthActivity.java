package com.huami.watch.companion.ecg.ui.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.EcgDataRepo;
import com.huami.passport.AccountManager;
import com.huami.watch.companion.account.UserInfo;
import com.huami.watch.companion.account.UserInfoManager;
import com.huami.watch.companion.ecg.R;
import com.huami.watch.companion.ecg.analytics.EcgAnalyticsManagerKt;
import com.huami.watch.companion.ecg.ui.activity.MeDongAuthActivity;
import com.huami.watch.companion.util.UserAvatar;
import com.huami.watch.util.Box;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0003J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fR+\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/huami/watch/companion/ecg/ui/activity/MeDongAuthActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", "e", "initView", "", "loginBy", "", GoogleApiAvailabilityLight.a, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "toMeDong", "", "<set-?>", "a", "Lkotlin/properties/ReadWriteProperty;", "getMEcgId", "()J", "setMEcgId", "(J)V", "mEcgId", "<init>", "()V", "Companion", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
public final class MeDongAuthActivity extends AppCompatActivity {

    @NotNull
    public static final String ARGS_ECG = "ecgId";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty mEcgId = Delegates.INSTANCE.notNull();
    public static final /* synthetic */ KProperty<Object>[] b = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(MeDongAuthActivity.class, "mEcgId", "getMEcgId()J", 0))};

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @StringRes
    private final int d(String loginBy) {
        switch (loginBy.hashCode()) {
            case -1240244679:
                if (loginBy.equals("google")) {
                    return R.string.user_login_by_google;
                }
                break;
            case -791770330:
                if (loginBy.equals("wechat")) {
                    return R.string.user_login_by_wechat;
                }
                break;
            case -759499589:
                if (loginBy.equals("xiaomi")) {
                    return R.string.user_login_by_mi;
                }
                break;
            case -433231361:
                if (loginBy.equals("huami_phone")) {
                    return R.string.user_login_by_huami_phone;
                }
                break;
            case 3321844:
                if (loginBy.equals("line")) {
                    return R.string.user_login_by_line;
                }
                break;
            case 99628432:
                if (loginBy.equals("huami")) {
                    return R.string.user_login_by_huami;
                }
                break;
            case 497130182:
                if (loginBy.equals("facebook")) {
                    return R.string.user_login_by_facebook;
                }
                break;
        }
        return R.string.user_login_by_unkown;
    }

    private final void e() {
        setMEcgId(getIntent().getLongExtra(ARGS_ECG, 0L));
        initView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(CompoundButton compoundButton, boolean z) {
        Box.setToMedongNoAuth(z);
    }

    private final long getMEcgId() {
        return ((Number) this.mEcgId.getValue(this, b[0])).longValue();
    }

    private final void initView() {
        int i = R.id.no_auth_check;
        ((CheckBox) findViewById(i)).setChecked(Box.getToMedongNoAuth());
        ((CheckBox) findViewById(i)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: nv4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                MeDongAuthActivity.f(compoundButton, z);
            }
        });
        UserInfo userInfo = UserInfoManager.get();
        UserAvatar.loadTo(this, userInfo, (ImageView) findViewById(R.id.avatar));
        ((TextView) findViewById(R.id.username)).setText(userInfo.getNickname());
        ((TextView) findViewById(R.id.login_by)).setText(d(AccountManager.getDefault(this).getProvider()));
    }

    private final void setMEcgId(long j) {
        this.mEcgId.setValue(this, b[0], Long.valueOf(j));
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medong_auth);
        e();
    }

    public final void toMeDong(@NotNull View view) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("fitness://huami.com/ecg/detail?id=" + getMEcgId() + "&user=" + ((Object) AccountManager.getDefault(this).getCurrentUid())));
        intent.addCategory("android.intent.category.DEFAULT");
        startActivity(intent);
        finish();
        EcgAnalyticsManagerKt.goMdHealthC(EcgDataRepo.getEcg$default(new EcgDataRepo(), getMEcgId(), null, 2, null));
    }
}
