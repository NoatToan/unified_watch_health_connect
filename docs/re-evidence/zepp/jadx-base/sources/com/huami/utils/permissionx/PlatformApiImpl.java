package com.huami.utils.permissionx;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.view.result.ActivityResultRegistry;
import androidx.view.result.contract.ActivityResultContracts;
import com.huami.device.feature.notification.statistics.NotificationEvent;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\"\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\f\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0016J\u001b\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0011H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lcom/huami/utils/permissionx/PlatformApiImpl;", "Lcom/huami/utils/permissionx/PlatformApi;", "Landroid/app/Activity;", "hostActivity", "", PointCategory.PERMISSION, "", "isGranted", "", "permissions", "", "isAllGranted", "shouldShowRationale", "requestPermission", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestMultiplePermission", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "navigationAppDetailsSetting", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Landroid/app/Activity;", "activity", "Landroidx/activity/result/ActivityResultRegistry;", "b", "Landroidx/activity/result/ActivityResultRegistry;", "registry", "<init>", "(Landroid/app/Activity;Landroidx/activity/result/ActivityResultRegistry;)V", "permissionx_release"}, k = 1, mv = {1, 5, 1})
public final class PlatformApiImpl implements PlatformApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Activity activity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ActivityResultRegistry registry;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.utils.permissionx.PlatformApiImpl", f = "PlatformApi.kt", i = {}, l = {79}, m = "requestMultiplePermission", n = {}, s = {})
    public static final class a extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return PlatformApiImpl.this.requestMultiplePermission(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.utils.permissionx.PlatformApiImpl", f = "PlatformApi.kt", i = {}, l = {70}, m = "requestPermission", n = {}, s = {})
    public static final class b extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return PlatformApiImpl.this.requestPermission(null, this);
        }
    }

    public PlatformApiImpl(@NotNull Activity activity, @NotNull ActivityResultRegistry activityResultRegistry) {
        this.activity = activity;
        this.registry = activityResultRegistry;
    }

    @Override // com.huami.utils.permissionx.PlatformApi
    @NotNull
    /* JADX INFO: renamed from: hostActivity, reason: from getter */
    public Activity getActivity() {
        return this.activity;
    }

    @Override // com.huami.utils.permissionx.PlatformApi
    @NotNull
    public Map<String, Boolean> isAllGranted(@NotNull List<String> permissions) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(e.coerceAtLeast(q.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(permissions, 10)), 16));
        for (Object obj : permissions) {
            linkedHashMap.put(obj, Boolean.valueOf(isGranted((String) obj)));
        }
        return linkedHashMap;
    }

    @Override // com.huami.utils.permissionx.PlatformApi
    public boolean isGranted(@NotNull String permission) {
        return ContextCompat.checkSelfPermission(getActivity(), permission) == 0;
    }

    @Override // com.huami.utils.permissionx.PlatformApi
    @Nullable
    public Object navigationAppDetailsSetting(@NotNull Continuation<? super Unit> continuation) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts(NotificationEvent.KEY_PACKAGE, getActivity().getPackageName(), null));
        Object objLaunch = new ActivityResultLauncher(this.registry, new ActivityResultContracts.StartActivityForResult()).launch(intent, continuation);
        return objLaunch == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objLaunch : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.utils.permissionx.PlatformApi
    @Nullable
    public Object requestMultiplePermission(@NotNull List<String> list, @NotNull Continuation<? super Map<String, Boolean>> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objLaunch = aVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objLaunch);
            ActivityResultLauncher activityResultLauncher = new ActivityResultLauncher(this.registry, new ActivityResultContracts.RequestMultiplePermissions());
            Object[] array = list.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            aVar.c = 1;
            objLaunch = activityResultLauncher.launch(array, aVar);
            if (objLaunch == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objLaunch);
        }
        return objLaunch;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.utils.permissionx.PlatformApi
    @Nullable
    public Object requestPermission(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.c = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objLaunch = bVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = bVar.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objLaunch);
            ActivityResultLauncher activityResultLauncher = new ActivityResultLauncher(this.registry, new ActivityResultContracts.RequestPermission());
            bVar.c = 1;
            objLaunch = activityResultLauncher.launch(str, bVar);
            if (objLaunch == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objLaunch);
        }
        return objLaunch;
    }

    @Override // com.huami.utils.permissionx.PlatformApi
    public boolean shouldShowRationale(@NotNull String permission) {
        return ActivityCompat.shouldShowRequestPermissionRationale(this.activity, permission);
    }

    @Override // com.huami.utils.permissionx.PlatformApi
    public boolean shouldShowRationale(@NotNull List<String> permissions) {
        Iterator<String> it2 = permissions.iterator();
        while (it2.hasNext()) {
            if (shouldShowRationale(it2.next())) {
                return true;
            }
        }
        return false;
    }
}
