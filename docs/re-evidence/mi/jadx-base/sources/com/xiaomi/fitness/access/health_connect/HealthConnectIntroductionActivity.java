package com.xiaomi.fitness.access.health_connect;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.health.connect.client.PermissionController;
import androidx.p004activity.result.ActivityResultCallback;
import androidx.p004activity.result.ActivityResultLauncher;
import coil.Coil;
import coil.request.ImageRequest;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.access.health_connect.HealthConnectIntroductionActivity;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.UIUtils;
import defpackage.aui;
import defpackage.vqi;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J4\u0010\u0010\u001a\u00020\r2\u001a\u0010\u0011\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00122\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0014H\u0002J\b\u0010\u0015\u001a\u00020\rH\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/access/health_connect/HealthConnectIntroductionActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "<init>", "()V", "layoutId", "", "getLayoutId", "()I", "requestPermissionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "registerResultCallback", "granted", "Lkotlin/Function1;", "denied", "Lkotlin/Function0;", "initView", "Companion", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHealthConnectIntroductionActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthConnectIntroductionActivity.kt\ncom/xiaomi/fitness/access/health_connect/HealthConnectIntroductionActivity\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,97:1\n54#2,3:98\n24#2:101\n57#2,6:102\n63#2,2:109\n57#3:108\n*S KotlinDebug\n*F\n+ 1 HealthConnectIntroductionActivity.kt\ncom/xiaomi/fitness/access/health_connect/HealthConnectIntroductionActivity\n*L\n67#1:98,3\n67#1:101\n67#1:102,6\n67#1:109,2\n67#1:108\n*E\n"})
public final class HealthConnectIntroductionActivity extends BaseActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "HealthConnectIntroductionActivity";

    @Nullable
    private ActivityResultLauncher<Set<String>> requestPermissionLauncher;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/access/health_connect/HealthConnectIntroductionActivity$Companion;", "", "<init>", "()V", "TAG", "", "launch", "", "context", "Landroid/content/Context;", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@Nullable Context context) {
            if (context != null) {
                Intent intent = new Intent(context, (Class<?>) HealthConnectIntroductionActivity.class);
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
            }
        }
    }

    private final void initView() {
        ImageView imageView = (ImageView) findViewById(vqi.M);
        if (imageView != null) {
            UIUtils.isNightMode(this);
            Coil.imageLoader(imageView.getContext()).enqueue(new ImageRequest.Builder(imageView.getContext()).data(ResUrls.HEALTH_CONNECT_INTRO_LIGHT).target(imageView).build());
        }
        ((TextView) findViewById(vqi.f37137r)).setOnClickListener(new View.OnClickListener() { // from class: nrb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HealthConnectIntroductionActivity.initView$lambda$3(this.f28286a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3(HealthConnectIntroductionActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            ActivityResultLauncher<Set<String>> activityResultLauncher = this$0.requestPermissionLauncher;
            if (activityResultLauncher != null) {
                activityResultLauncher.launch(HealthConnectUtils.INSTANCE.getPERMISSIONS());
            }
        } catch (Exception e) {
            Logger.e(TAG, "request permission exception!!", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(HealthConnectIntroductionActivity this$0, Set it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "user allow permission!!");
        FitnessDataExtKt.getHealthConnectApi().startSyncDataToHealthConnect();
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1() {
        Logger.i(TAG, "user denied permission!!");
        return Unit.INSTANCE;
    }

    private final void registerResultCallback(final Function1<? super Set<String>, Unit> granted, final Function0<Unit> denied) {
        this.requestPermissionLauncher = registerForActivityResult(PermissionController.Companion.createRequestPermissionResultContract$default(PermissionController.INSTANCE, null, 1, null), new ActivityResultCallback() { // from class: orb
            @Override // androidx.p004activity.result.ActivityResultCallback
            public final void a(Object obj) {
                HealthConnectIntroductionActivity.registerResultCallback$lambda$2(granted, denied, (Set) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerResultCallback$lambda$2(Function1 function1, Function0 function0, Set grantedPermissions) {
        Intrinsics.checkNotNullParameter(grantedPermissions, "grantedPermissions");
        if (!grantedPermissions.isEmpty()) {
            if (function1 != null) {
                function1.invoke2(grantedPermissions);
            }
        } else if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return aui.f3461r;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        registerResultCallback(new Function1() { // from class: lrb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthConnectIntroductionActivity.onCreate$lambda$0(this.f25372a, (Set) obj);
            }
        }, new Function0() { // from class: mrb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HealthConnectIntroductionActivity.onCreate$lambda$1();
            }
        });
        initView();
    }
}
