package com.xiaomi.hm.health.mainpage;

import android.content.DialogInterface;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.UserLegalInfoManager;
import com.huami.account.event.EventRegionUpdate;
import com.huami.account.ui.areas.SelectAreaHelper;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.mainpage.CCPAManager;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xmlywind.sdk.common.mta.PointCategory;
import de.greenrobot.event.EventBus;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\fB\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/mainpage/CCPAManager;", "", "", GoogleApiAvailabilityLight.a, "f", "Landroidx/appcompat/app/AppCompatActivity;", "activity", PointCategory.INIT, "release", "Lcom/huami/account/event/EventRegionUpdate;", "event", "onEventMainThread", "a", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class CCPAManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private AppCompatActivity activity;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/mainpage/CCPAManager$Companion;", "", "Lcom/xiaomi/hm/health/mainpage/CCPAManager;", "getInstance", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final CCPAManager getInstance() {
            return a.a.a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"com/xiaomi/hm/health/mainpage/CCPAManager$a", "", "Lcom/xiaomi/hm/health/mainpage/CCPAManager;", "b", "Lcom/xiaomi/hm/health/mainpage/CCPAManager;", "a", "()Lcom/xiaomi/hm/health/mainpage/CCPAManager;", "holder", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        @NotNull
        public static final a a = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private static final CCPAManager holder = new CCPAManager(null);

        private a() {
        }

        @NotNull
        public final CCPAManager a() {
            return holder;
        }
    }

    private CCPAManager() {
    }

    public /* synthetic */ CCPAManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final void d() {
        UserLegalInfoManager.getUserStatusForCCPA(new UserLegalInfoManager.OnCcpaStatusGetListener() { // from class: xg0
            @Override // com.huami.account.UserLegalInfoManager.OnCcpaStatusGetListener
            public final void onGet(Boolean bool) {
                CCPAManager.e(this.a, bool);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(CCPAManager cCPAManager, Boolean bool) {
        if (bool != null) {
            return;
        }
        if (HMPersonInfo.getInstance().getUserInfo().getAge() >= 13) {
            cCPAManager.f();
        }
    }

    private final void f() {
        AppCompatActivity appCompatActivity = this.activity;
        if (appCompatActivity == null) {
            return;
        }
        new AlertDialogFragment.Builder(appCompatActivity).setCancelable(false).setTitle(R.string.account_ccpa_selling_info_title).setMessage(R.string.account_ccpa_selling_info_desc).setPositiveButton(R.string.account_ccpa_selling_info_agree, new DialogInterface.OnClickListener() { // from class: vg0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                CCPAManager.g(dialogInterface, i);
            }
        }).setNegativeButton(R.string.account_ccpa_selling_info_refuse, new DialogInterface.OnClickListener() { // from class: wg0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                CCPAManager.h(dialogInterface, i);
            }
        }).show(appCompatActivity.getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(DialogInterface dialogInterface, int i) {
        UserLegalInfoManager.setUserStatusCCPA(Boolean.TRUE);
        dialogInterface.dismiss();
    }

    @JvmStatic
    @NotNull
    public static final CCPAManager getInstance() {
        return INSTANCE.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(DialogInterface dialogInterface, int i) {
        UserLegalInfoManager.setUserStatusCCPA(Boolean.FALSE);
        dialogInterface.dismiss();
    }

    public final void init(@NotNull AppCompatActivity activity) {
        this.activity = activity;
        if (EventBus.getDefault().isRegistered(this)) {
            return;
        }
        EventBus.getDefault().register(this);
    }

    public final void onEventMainThread(@NotNull EventRegionUpdate event) {
        if (SelectAreaHelper.isUsCalifornia(event.getCountryCode(), event.getStateCode())) {
            d();
        }
    }

    public final void release() {
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this);
        }
        this.activity = null;
    }
}
