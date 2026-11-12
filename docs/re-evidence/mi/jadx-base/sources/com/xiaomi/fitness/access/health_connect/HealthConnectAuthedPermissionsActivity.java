package com.xiaomi.fitness.access.health_connect;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.health.connect.client.HealthConnectClient;
import androidx.health.connect.client.PermissionController;
import coil.Coil;
import coil.request.ImageRequest;
import com.xiaomi.fitness.access.health_connect.HealthConnectAuthedPermissionsActivity;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import defpackage.aui;
import defpackage.av6;
import defpackage.mzi;
import defpackage.vqi;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\f\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\tH\u0002J\b\u0010\u000e\u001a\u00020\tH\u0002J\u001c\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u0012H\u0002J\b\u0010\u0014\u001a\u00020\tH\u0014R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/access/health_connect/HealthConnectAuthedPermissionsActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "<init>", "()V", "layoutId", "", "getLayoutId", "()I", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initView", "showReadPermissions", "showWritePermissions", "buildAuthedPermissionItem", "Landroid/view/View;", "authInfo", "Lkotlin/Pair;", "", LifecycleConstantKt.ON_DESTROY, "Companion", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHealthConnectAuthedPermissionsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthConnectAuthedPermissionsActivity.kt\ncom/xiaomi/fitness/access/health_connect/HealthConnectAuthedPermissionsActivity\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,147:1\n54#2,3:148\n24#2:151\n57#2,6:152\n63#2,2:159\n57#3:158\n*S KotlinDebug\n*F\n+ 1 HealthConnectAuthedPermissionsActivity.kt\ncom/xiaomi/fitness/access/health_connect/HealthConnectAuthedPermissionsActivity\n*L\n57#1:148,3\n57#1:151\n57#1:152,6\n57#1:159,2\n57#1:158\n*E\n"})
public final class HealthConnectAuthedPermissionsActivity extends BaseActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "HealthConnectAuthedPermissionsActivity";

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/access/health_connect/HealthConnectAuthedPermissionsActivity$Companion;", "", "<init>", "()V", "TAG", "", "launch", "", "context", "Landroid/app/Activity;", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Activity context) {
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) HealthConnectAuthedPermissionsActivity.class));
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.access.health_connect.HealthConnectAuthedPermissionsActivity$showWritePermissions$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.access.health_connect.HealthConnectAuthedPermissionsActivity$showWritePermissions$1", f = "HealthConnectAuthedPermissionsActivity.kt", i = {}, l = {120, 121}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.access.health_connect.HealthConnectAuthedPermissionsActivity$showWritePermissions$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.access.health_connect.HealthConnectAuthedPermissionsActivity$showWritePermissions$1$1", f = "HealthConnectAuthedPermissionsActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nHealthConnectAuthedPermissionsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthConnectAuthedPermissionsActivity.kt\ncom/xiaomi/fitness/access/health_connect/HealthConnectAuthedPermissionsActivity$showWritePermissions$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,147:1\n1863#2,2:148\n*S KotlinDebug\n*F\n+ 1 HealthConnectAuthedPermissionsActivity.kt\ncom/xiaomi/fitness/access/health_connect/HealthConnectAuthedPermissionsActivity$showWritePermissions$1$1\n*L\n124#1:148,2\n*E\n"})
        public static final class C03761 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Set<String> $permissions;
            int label;
            final /* synthetic */ HealthConnectAuthedPermissionsActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03761(HealthConnectAuthedPermissionsActivity healthConnectAuthedPermissionsActivity, Set<String> set, Continuation<? super C03761> continuation) {
                super(2, continuation);
                this.this$0 = healthConnectAuthedPermissionsActivity;
                this.$permissions = set;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C03761(this.this$0, this.$permissions, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                LinearLayout linearLayout = (LinearLayout) this.this$0.findViewById(vqi.f);
                Set<String> set = this.$permissions;
                HealthConnectAuthedPermissionsActivity healthConnectAuthedPermissionsActivity = this.this$0;
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    Pair<String, Integer> pair = HealthConnectUtils.INSTANCE.getPERMISSION_2_DESC().get((String) it.next());
                    if (pair != null) {
                        linearLayout.addView(healthConnectAuthedPermissionsActivity.buildAuthedPermissionItem(pair));
                    }
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C03761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HealthConnectAuthedPermissionsActivity.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            PermissionController permissionController = HealthConnectClient.Companion.getOrCreate$default(HealthConnectClient.INSTANCE, HealthConnectAuthedPermissionsActivity.this, null, 2, null).getPermissionController();
            this.label = 1;
            obj = permissionController.getGrantedPermissions(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            C03761 c03761 = new C03761(HealthConnectAuthedPermissionsActivity.this, (Set) obj, null);
            this.label = 2;
            if (BuildersKt.withContext(main, c03761, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View buildAuthedPermissionItem(Pair<String, Integer> authInfo) {
        HealthConnectAuthedTypeItem healthConnectAuthedTypeItem = new HealthConnectAuthedTypeItem(this, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, ExtUtilsKt.getDp(13), 0, 0);
        healthConnectAuthedTypeItem.setLayoutParams(layoutParams);
        healthConnectAuthedTypeItem.updateItemInfo(authInfo.getSecond().intValue(), authInfo.getFirst());
        return healthConnectAuthedTypeItem;
    }

    private final void initView() {
        showReadPermissions();
        showWritePermissions();
        View viewFindViewById = findViewById(vqi.M);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById;
        UIUtils.isNightMode(this);
        Coil.imageLoader(imageView.getContext()).enqueue(new ImageRequest.Builder(imageView.getContext()).data(ResUrls.HEALTH_CONNECT_INTRO_LIGHT).target(imageView).build());
        ((TextView) findViewById(vqi.B)).setOnClickListener(new View.OnClickListener() { // from class: rpb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HealthConnectAuthedPermissionsActivity.initView$lambda$0(this.f32770a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(final HealthConnectAuthedPermissionsActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            Logger.d(TAG, "revoke!!");
            CommonDialog.c cVar = new CommonDialog.c("google fit replace");
            cVar.setDialogTitle(mzi.j);
            cVar.setDialogDescription(mzi.i);
            cVar.setNegativeText(mzi.v0);
            cVar.setPositiveText(mzi.w0);
            CommonDialog commonDialogCreate = cVar.create();
            commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.access.health_connect.HealthConnectAuthedPermissionsActivity$initView$1$1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    if (which == -2) {
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                    } else {
                        if (which != -1) {
                            return;
                        }
                        ScopeExtKt.scope$default(null, new HealthConnectAuthedPermissionsActivity$initView$1$1$onDialogClick$1(this.this$0, null), 1, null);
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                    }
                }
            });
            commonDialogCreate.showIfNeed(this$0.getSupportFragmentManager());
        } catch (Exception e) {
            Logger.e(TAG, "revoke permission exception!!", e);
        }
    }

    private final void showReadPermissions() {
    }

    private final void showWritePermissions() {
        ScopeExtKt.scope(Dispatchers.getDefault(), new AnonymousClass1(null));
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return aui.q;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Logger.i(TAG, "onDestroy!!");
    }
}
