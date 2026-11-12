package com.huami.lib.v2;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.permission.R;
import com.huami.utils.easypermission.EasyPermissions;
import com.huami.utils.easypermission.manager.PermissionManagerActivity;
import com.huami.utils.permissionx.business.AppSettingsRationaleWithCode;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.e;
import kotlin.collections.q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u000e¢\u0006\u0004\b\u0015\u0010\u0016B\u0019\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\u0007H\u0016J1\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR(\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/huami/lib/v2/SportAppSettingsRationale;", "Lcom/huami/utils/permissionx/business/AppSettingsRationaleWithCode;", "Landroid/app/Activity;", "activity", "", "updateShowAppSettingRationale", "", "", "permissions", "code", "", "shouldShowAppSettingRationale", "showAppSettingRationale", "(Landroid/app/Activity;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "a", "Ljava/util/Map;", "messageMap", "b", "Z", "<init>", "(Ljava/util/Map;)V", "messageResId", PointCategory.PERMISSION, "(ILjava/lang/String;)V", "zeppPermission_release"}, k = 1, mv = {1, 5, 1})
public final class SportAppSettingsRationale implements AppSettingsRationaleWithCode {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Map<Integer, List<String>> messageMap;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean shouldShowAppSettingRationale;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a implements View.OnClickListener {
        public final /* synthetic */ Activity a;

        public a(Activity activity) {
            this.a = activity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.startActivity(new Intent(this.a, (Class<?>) PermissionManagerActivity.class));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b implements DialogInterface.OnClickListener {
        public final /* synthetic */ Continuation<Boolean> a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Continuation<? super Boolean> continuation) {
            this.a = continuation;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            Continuation<Boolean> continuation = this.a;
            Boolean bool = Boolean.TRUE;
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(Result.m3845constructorimpl(bool));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c implements DialogInterface.OnClickListener {
        public final /* synthetic */ Continuation<Boolean> a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Continuation<? super Boolean> continuation) {
            this.a = continuation;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            Continuation<Boolean> continuation = this.a;
            Boolean bool = Boolean.FALSE;
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(Result.m3845constructorimpl(bool));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0010&\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n"}, d2 = {"", "", "", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<Map.Entry<? extends Integer, ? extends List<? extends String>>, CharSequence> {
        public final /* synthetic */ Activity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Activity activity) {
            super(1);
            this.a = activity;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@NotNull Map.Entry<Integer, ? extends List<String>> entry) {
            return this.a.getString(entry.getKey().intValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SportAppSettingsRationale(@NotNull Map<Integer, ? extends List<String>> map) {
        this.messageMap = map;
        this.shouldShowAppSettingRationale = true;
    }

    @Override // com.huami.utils.permissionx.business.AppSettingsRationaleWithCode
    public boolean shouldShowAppSettingRationale(@NotNull Activity activity, @NotNull List<String> permissions, @NotNull String code) {
        if (!permissions.contains("android.permission.ACCESS_COARSE_LOCATION") || this.shouldShowAppSettingRationale) {
            return AppSettingsRationaleWithCode.DefaultImpls.shouldShowAppSettingRationale(this, activity, permissions, code);
        }
        updateShowAppSettingRationale(activity);
        return false;
    }

    @Override // com.huami.utils.permissionx.business.AppSettingsRationaleWithCode
    @Nullable
    public Object showAppSettingRationale(@NotNull Activity activity, @NotNull List<String> list, @NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        if (!(activity instanceof FragmentActivity)) {
            throw new IllegalStateException("在展示 " + list + " 权限的自定义说明 Dialog 发现错误。\n请在 FragmentActivity 中调用请求权限的方法，否则无法弹框。");
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!EasyPermissions.hasPermissions(activity, (String) obj)) {
                arrayList.add(obj);
            }
        }
        Set<Map.Entry<Integer, List<String>>> setEntrySet = this.messageMap.entrySet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : setEntrySet) {
            if (CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList).removeAll((Collection) ((Map.Entry) obj2).getValue())) {
                arrayList2.add(obj2);
            }
        }
        new AlertDialogFragment.Builder(activity).setMessage(CollectionsKt___CollectionsKt.joinToString$default(arrayList2, "\n", null, null, 0, null, new d(activity), 30, null)).setMessageGravity(17).setLink(activity.getString(R.string.easypermission_permission_link_detail), new a(activity)).setPositiveButton(activity.getString(R.string.easypermission_permission_go_to_setting), new b(safeContinuation)).setNegativeButton(activity.getString(R.string.easypermission_permission_dialog_cancel), new c(safeContinuation)).show(((FragmentActivity) activity).getSupportFragmentManager()).setGravity(17);
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public final void updateShowAppSettingRationale(@NotNull Activity activity) {
        this.shouldShowAppSettingRationale = Build.VERSION.SDK_INT < 31 || ZeppPermissionManagerKt.hasPermission(activity, "android.permission.ACCESS_COARSE_LOCATION");
    }

    public SportAppSettingsRationale(int i, @NotNull String str) {
        this(q.mapOf(TuplesKt.to(Integer.valueOf(i), e.listOf(str))));
    }
}
