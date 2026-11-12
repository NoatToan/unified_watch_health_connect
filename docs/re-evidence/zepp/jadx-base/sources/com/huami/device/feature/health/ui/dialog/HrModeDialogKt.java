package com.huami.device.feature.health.ui.dialog;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.device.feature.health.device.HealthFunc;
import com.huami.device.feature.health.res.AppResKt;
import com.huami.device.feature.health.settings.HrModeSetting;
import com.huami.device.feature.health.settings.device.SetToDevice;
import com.huami.device.feature.health.ui.dialog.HrModeDialogKt;
import com.huami.device.feature.health.util.HrModeExtKt;
import com.huami.tools.analytics.DbUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.d;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a(\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002\u001a\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¨\u0006\u000e"}, d2 = {"Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "showHrModeDialog", "", "mode", "Lcom/huami/device/feature/health/settings/HrModeSetting;", "hrModeSetting", GoogleApiAvailabilityLight.a, "Ljava/lang/Runnable;", "runnable", "c", "health-ui_release"}, k = 2, mv = {1, 5, 1})
public final class HrModeDialogKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.ui.dialog.HrModeDialogKt$setToDevice$1", f = "HrModeDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Runnable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Runnable runnable, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = runnable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.b.run();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.ui.dialog.HrModeDialogKt$showHrBatteryDialog$1$1$1", f = "HrModeDialog.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HrModeSetting b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HrModeSetting hrModeSetting, int i, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = hrModeSetting;
            this.c = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SetToDevice<Integer> setToDevice = this.b.getSetToDevice();
                if (setToDevice != null) {
                    Integer numBoxInt = Boxing.boxInt(this.c);
                    this.a = 1;
                    obj = setToDevice.set(numBoxInt, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.huami.device.feature.health.ui.dialog.HrModeDialogKt$showHrModeDialog$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/huami/device/feature/health/ui/dialog/HrModeDialogKt$showHrModeDialog$1", "Landroid/content/DialogInterface$OnClickListener;", "Landroid/content/DialogInterface;", "dialog", "", "position", "", "onClick", "health-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class AnonymousClass1 implements DialogInterface.OnClickListener {
        public final /* synthetic */ List<Integer> a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ FragmentManager d;
        public final /* synthetic */ HrModeSetting e;

        /* JADX INFO: renamed from: com.huami.device.feature.health.ui.dialog.HrModeDialogKt$showHrModeDialog$1$a */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.device.feature.health.ui.dialog.HrModeDialogKt$showHrModeDialog$1$onClick$1$1", f = "HrModeDialog.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ HrModeSetting b;
            public final /* synthetic */ int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HrModeSetting hrModeSetting, int i, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = hrModeSetting;
                this.c = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SetToDevice<Integer> setToDevice = this.b.getSetToDevice();
                    if (setToDevice != null) {
                        Integer numBoxInt = Boxing.boxInt(this.c);
                        this.a = 1;
                        obj = setToDevice.set(numBoxInt, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
        }

        public AnonymousClass1(List<Integer> list, int i, Context context, FragmentManager fragmentManager, HrModeSetting hrModeSetting) {
            this.a = list;
            this.b = i;
            this.c = context;
            this.d = fragmentManager;
            this.e = hrModeSetting;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(HrModeSetting hrModeSetting, int i) throws InterruptedException {
            d.b(null, new a(hrModeSetting, i, null), 1, null);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(@Nullable DialogInterface dialog, int position) {
            final int iIntValue = this.a.get(position).intValue();
            if (this.a.get(position).intValue() == this.b) {
                return;
            }
            if (iIntValue != 0) {
                HrModeDialogKt.d(iIntValue, this.c, this.d, this.e);
            } else {
                final HrModeSetting hrModeSetting = this.e;
                HrModeDialogKt.c(new Runnable() { // from class: p94
                    @Override // java.lang.Runnable
                    public final void run() throws InterruptedException {
                        HrModeDialogKt.AnonymousClass1.b(hrModeSetting, iIntValue);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Runnable runnable) {
        e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new a(runnable, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final int i, Context context, FragmentManager fragmentManager, final HrModeSetting hrModeSetting) {
        new AlertDialogFragment.Builder(context).setMessage(AppResKt.getHealthStr().getHrBatteryTips()).setNegativeButton(AppResKt.getHealthStr().getBtnCancel(), (DialogInterface.OnClickListener) null).setPositiveButton(AppResKt.getHealthStr().getBtnYes(), new DialogInterface.OnClickListener() { // from class: n94
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                HrModeDialogKt.e(hrModeSetting, i, dialogInterface, i2);
            }
        }).setCancelable(true).show(fragmentManager, "hr battery dialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final HrModeSetting hrModeSetting, final int i, DialogInterface dialogInterface, int i2) {
        c(new Runnable() { // from class: o94
            @Override // java.lang.Runnable
            public final void run() throws InterruptedException {
                HrModeDialogKt.f(hrModeSetting, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(HrModeSetting hrModeSetting, int i) throws InterruptedException {
        d.b(null, new b(hrModeSetting, i, null), 1, null);
    }

    public static final void showHrModeDialog(@NotNull Context context, @NotNull FragmentManager fragmentManager) {
        HrModeSetting service = HealthFunc.HR_MODE.INSTANCE.getService();
        if (service == null) {
            return;
        }
        int iIntValue = service.getData().intValue();
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{2, 1, 0});
        int iIndexOf = listListOf.indexOf(Integer.valueOf(iIntValue));
        AlertDialogFragment.ChoiceItems choiceItems = new AlertDialogFragment.ChoiceItems();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listListOf, 10));
        Iterator it2 = listListOf.iterator();
        while (it2.hasNext()) {
            arrayList.add(HrModeExtKt.getHrDetectModelResId$default(((Number) it2.next()).intValue(), 0, 2, null));
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        AlertDialogFragment.ChoiceItems items = choiceItems.setItems((String[]) array);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listListOf, 10));
        Iterator it3 = listListOf.iterator();
        while (it3.hasNext()) {
            arrayList2.add(HrModeExtKt.getNormalDetectModelSummaryRes(((Number) it3.next()).intValue()));
        }
        Object[] array2 = arrayList2.toArray(new String[0]);
        Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
        new AlertDialogFragment.Builder(context).setTitle(AppResKt.getHealthStr().getHrBatteryTips()).setSingleChoiceItems(items.setItemsSummaries((String[]) array2).setItemChoice(iIndexOf), new AnonymousClass1(listListOf, iIntValue, context, fragmentManager, service)).setCancelable(false).show(fragmentManager, "hr mode select");
    }
}
