package com.xiaomi.smarthome.controls;

import android.os.Handler;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.smarthome.IReadyCallback;
import com.xiaomi.smarthome.controls.AllReadyCallback;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.common.util.CommonUtil;
import com.xiaomi.smarthome.library.util.GlobalHandlerManager;
import com.xiaomi.smarthome.newui.utils.NumberUtils;
import com.xiaomi.smarthome.utils.Watcher;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001e2\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003:\u0002\u001e\u001fB\u0017\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0002\u0010\bJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0002\u0010\u0014J\u001e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0016J\u0010\u0010\u0016\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/xiaomi/smarthome/controls/AllReadyCallback;", "Lcom/xiaomi/smarthome/IReadyCallback;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lkotlin/Function1;", "", "", "autoRequest", "allCheckType", "(II)V", "debug", "handler", "Landroid/os/Handler;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/smarthome/utils/Watcher;", "runnable", "Ljava/lang/Runnable;", BroadcastsKt.SILENT_PUSHING_CANCEL, "", "invoke", "type", "(I)Ljava/lang/Boolean;", "isReadyListener", "observer", "lifeCycle", "Landroidx/lifecycle/Lifecycle;", LifecycleConstantKt.ON_DESTROY, CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", "toString", "", "Companion", "InstanceHolder", "smarthome-utils_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AllReadyCallback implements IReadyCallback, DefaultLifecycleObserver, Function1<Integer, Boolean> {
    private static final int STATUS_INIT = -3;
    private static final int STATUS_READY = 0;
    private static final int STATUS_WAIT = -2;

    @NotNull
    public static final String TAG = "AllReadyCallback";
    private final int allCheckType;
    private final int autoRequest;
    private final boolean debug;

    @Nullable
    private Handler handler;

    @Nullable
    private Watcher<Integer> listener;

    @Nullable
    private Runnable runnable;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final HashMap<Integer, InstanceHolder> allAvailable = new HashMap<>();

    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\u0007J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0002J7\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00150\u001bH\u0002¢\u0006\u0002\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u000e2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001fH\u0007J \u0010\u001d\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00042\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001fH\u0007J,\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00150\u001bH\u0002J2\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\"2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001fH\u0007J(\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001fH\u0007J\u0010\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u0004H\u0007J/\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00192\f\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(¢\u0006\u0002\u0010*R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R*\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\nj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b`\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/xiaomi/smarthome/controls/AllReadyCallback$Companion;", "", "()V", "STATUS_INIT", "", "STATUS_READY", "STATUS_WAIT", "TAG", "", "allAvailable", "Ljava/util/HashMap;", "Lcom/xiaomi/smarthome/controls/AllReadyCallback$InstanceHolder;", "Lkotlin/collections/HashMap;", "check", "Lcom/xiaomi/smarthome/controls/AllReadyCallback;", "runnable", "Ljava/lang/Runnable;", "clearReady", "", "type", "isAutoRequest", "", "autoRequest", "isDependencyReady", "deps", "", "watcher", "Lkotlin/Function1;", "(I[Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "isReady", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/smarthome/utils/Watcher;", "index", "handler", "Landroid/os/Handler;", "isReadyItem", "cta", "putInstance", "int", "creater", "Lkotlin/Function0;", "Lcom/xiaomi/smarthome/IReadyCallback;", "(I[Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V", "smarthome-utils_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isAutoRequest(int type, int autoRequest) {
            return (autoRequest == 0 || -1 == autoRequest || (autoRequest & type) != type) ? false : true;
        }

        private final void isDependencyReady(int autoRequest, Integer[] deps, final Function1<? super Integer, Boolean> watcher) {
            int i = 0;
            if (deps.length == 0) {
                watcher.invoke2(0);
                return;
            }
            final List mutableList = ArraysKt___ArraysKt.toMutableList(deps);
            int length = deps.length;
            while (i < length) {
                final int iIntValue = deps[i].intValue();
                i++;
                isReady(autoRequest, iIntValue, new Function1<Integer, Boolean>() { // from class: com.xiaomi.smarthome.controls.AllReadyCallback$Companion$isDependencyReady$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public /* bridge */ /* synthetic */ Boolean invoke2(Integer num) {
                        return invoke(num.intValue());
                    }

                    @NotNull
                    public final Boolean invoke(int i2) {
                        boolean z;
                        if (i2 == 0) {
                            List<Integer> list = mutableList;
                            int i3 = iIntValue;
                            synchronized (list) {
                                z = list.remove(Integer.valueOf(i3)) && list.isEmpty();
                            }
                            if (z) {
                                watcher.invoke2(Integer.valueOf(i2));
                            }
                        } else if (watcher.invoke2(Integer.valueOf(i2)).booleanValue()) {
                            List<Integer> list2 = mutableList;
                            synchronized (list2) {
                                list2.clear();
                                Unit unit = Unit.INSTANCE;
                            }
                        }
                        return Boolean.TRUE;
                    }
                });
            }
        }

        @JvmStatic
        @NotNull
        public final AllReadyCallback check(@Nullable Runnable runnable) {
            return check(608, runnable);
        }

        @JvmStatic
        public final void clearReady(int type) {
            InstanceHolder instanceHolder = (InstanceHolder) AllReadyCallback.allAvailable.get(Integer.valueOf(type));
            if (instanceHolder != null && instanceHolder.resetStatus()) {
                Intrinsics.stringPlus("clearReady ", Integer.valueOf(type));
                for (Map.Entry entry : AllReadyCallback.allAvailable.entrySet()) {
                    if (ArraysKt___ArraysKt.contains(((InstanceHolder) entry.getValue()).getDeps(), Integer.valueOf(type))) {
                        clearReady(((Number) entry.getKey()).intValue());
                    }
                }
            }
        }

        @JvmStatic
        @NotNull
        public final AllReadyCallback isReady(@Nullable Watcher<Integer> listener) {
            return isReady(608, listener);
        }

        @JvmStatic
        public final boolean isReadyItem(int cta) {
            InstanceHolder instanceHolder = (InstanceHolder) AllReadyCallback.allAvailable.get(Integer.valueOf(cta));
            Integer numValueOf = instanceHolder == null ? null : Integer.valueOf(instanceHolder.getStatus());
            if (numValueOf != null && numValueOf.intValue() == -3) {
                isReady(-1, cta, (Watcher<Integer>) null);
            }
            return numValueOf != null && numValueOf.intValue() == 0;
        }

        public final void putInstance(int i, @NotNull Integer[] deps, @NotNull Function0<? extends IReadyCallback> creater) {
            Intrinsics.checkNotNullParameter(deps, "deps");
            Intrinsics.checkNotNullParameter(creater, "creater");
            AllReadyCallback.allAvailable.put(Integer.valueOf(i), new InstanceHolder(creater, i, deps));
        }

        @JvmStatic
        @NotNull
        public final AllReadyCallback check(int check, @Nullable Runnable runnable) {
            AllReadyCallback allReadyCallback = new AllReadyCallback(0, check, null);
            allReadyCallback.runnable = runnable;
            int i = allReadyCallback.autoRequest;
            ArrayList<Integer> arrayListSplit = NumberUtils.split(allReadyCallback.allCheckType);
            Intrinsics.checkNotNullExpressionValue(arrayListSplit, "split(c.allCheckType)");
            Object[] array = arrayListSplit.toArray(new Integer[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            isDependencyReady(i, (Integer[]) array, allReadyCallback);
            return allReadyCallback;
        }

        @JvmStatic
        @NotNull
        public final AllReadyCallback isReady(int check, @Nullable Watcher<Integer> listener) {
            return isReady(2047, check, listener);
        }

        @JvmStatic
        @NotNull
        public final AllReadyCallback isReady(int autoRequest, int check, @Nullable Watcher<Integer> listener) {
            return isReady(autoRequest, check, null, listener);
        }

        @JvmStatic
        @NotNull
        public final AllReadyCallback isReady(int autoRequest, int check, @Nullable Handler handler, @Nullable Watcher<Integer> listener) {
            AllReadyCallback allReadyCallback = new AllReadyCallback(autoRequest, check, null);
            allReadyCallback.listener = listener;
            allReadyCallback.handler = handler;
            int i = allReadyCallback.autoRequest;
            ArrayList<Integer> arrayListSplit = NumberUtils.split(allReadyCallback.allCheckType);
            Intrinsics.checkNotNullExpressionValue(arrayListSplit, "split(c.allCheckType)");
            Object[] array = arrayListSplit.toArray(new Integer[0]);
            if (array != null) {
                isDependencyReady(i, (Integer[]) array, allReadyCallback);
                return allReadyCallback;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        private final void isReady(int autoRequest, int index, Function1<? super Integer, Boolean> runnable) {
            InstanceHolder instanceHolder = (InstanceHolder) AllReadyCallback.allAvailable.get(Integer.valueOf(index));
            if (instanceHolder == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("isReady fatal ");
                sb.append(index);
                sb.append(' ');
                sb.append(AllReadyCallback.allAvailable);
                sb.append(' ');
                sb.append(ExceptionsKt__ExceptionsKt.stackTraceToString(new Exception()));
                runnable.invoke2(0);
                return;
            }
            String string = Integer.toString(index, CharsKt__CharJVMKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
            String strStringPlus = Intrinsics.stringPlus("0x", string);
            int iCheckAndSet = instanceHolder.checkAndSet(autoRequest, runnable);
            if (iCheckAndSet == -3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("start dep index ");
                sb2.append(strStringPlus);
                sb2.append(' ');
                sb2.append(ArraysKt___ArraysKt.joinToString$default(instanceHolder.getDeps(), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1<Integer, CharSequence>() { // from class: com.xiaomi.smarthome.controls.AllReadyCallback$Companion$isReady$1
                    @NotNull
                    public final CharSequence invoke(int i) {
                        return ",";
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public /* bridge */ /* synthetic */ CharSequence invoke2(Integer num) {
                        return invoke(num.intValue());
                    }
                }, 31, (Object) null));
                sb2.append(" autoRequest ");
                sb2.append(autoRequest);
                isDependencyReady(autoRequest, instanceHolder.getDeps(), new AllReadyCallback$Companion$isReady$2(instanceHolder, strStringPlus, autoRequest, index));
                return;
            }
            if (iCheckAndSet == -2) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("wait index ");
                sb3.append(strStringPlus);
                sb3.append(' ');
                sb3.append(instanceHolder.getCallback().size());
            } else if (iCheckAndSet != 0) {
                runnable.invoke2(Integer.valueOf(iCheckAndSet));
            } else {
                runnable.invoke2(0);
            }
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\u0010\tJ\"\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\rJ\u0006\u0010\"\u001a\u00020\u000eJ\u0006\u0010#\u001a\u00020\u000eJ\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0006RZ\u0010\n\u001aB\u0012\u001c\u0012\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00060\f0\u000bj \u0012\u001c\u0012\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00060\f`\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001b¨\u0006'"}, d2 = {"Lcom/xiaomi/smarthome/controls/AllReadyCallback$InstanceHolder;", "", "creater", "Lkotlin/Function0;", "Lcom/xiaomi/smarthome/IReadyCallback;", "type", "", "deps", "", "(Lkotlin/jvm/functions/Function0;I[Ljava/lang/Integer;)V", "callback", "Ljava/util/ArrayList;", "Lkotlin/Pair;", "Lkotlin/Function1;", "", "Lkotlin/collections/ArrayList;", "getCallback", "()Ljava/util/ArrayList;", "setCallback", "(Ljava/util/ArrayList;)V", "getCreater", "()Lkotlin/jvm/functions/Function0;", "getDeps", "()[Ljava/lang/Integer;", "[Ljava/lang/Integer;", "status", "getStatus", "()I", "setStatus", "(I)V", "getType", "checkAndSet", "autoRequest", "runnable", "isAutoRequest", "resetStatus", "setReadyCallback", "", "result", "smarthome-utils_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class InstanceHolder {

        @NotNull
        private ArrayList<Pair<Function1<Integer, Boolean>, Integer>> callback;

        @NotNull
        private final Function0<IReadyCallback> creater;

        @NotNull
        private final Integer[] deps;
        private int status;
        private final int type;

        /* JADX WARN: Multi-variable type inference failed */
        public InstanceHolder(@NotNull Function0<? extends IReadyCallback> creater, int i, @NotNull Integer[] deps) {
            Intrinsics.checkNotNullParameter(creater, "creater");
            Intrinsics.checkNotNullParameter(deps, "deps");
            this.creater = creater;
            this.type = i;
            this.deps = deps;
            this.status = -3;
            this.callback = new ArrayList<>();
        }

        public final int checkAndSet(int autoRequest, @NotNull Function1<? super Integer, Boolean> runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            synchronized (this) {
                try {
                    if (getStatus() != -3 && getStatus() <= 0) {
                        if (getStatus() == -2) {
                            getCallback().add(TuplesKt.to(runnable, Integer.valueOf(autoRequest)));
                        }
                        return getStatus();
                    }
                    setStatus(-2);
                    getCallback().add(TuplesKt.to(runnable, Integer.valueOf(autoRequest)));
                    return -3;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @NotNull
        public final ArrayList<Pair<Function1<Integer, Boolean>, Integer>> getCallback() {
            return this.callback;
        }

        @NotNull
        public final Function0<IReadyCallback> getCreater() {
            return this.creater;
        }

        @NotNull
        public final Integer[] getDeps() {
            return this.deps;
        }

        public final int getStatus() {
            return this.status;
        }

        public final int getType() {
            return this.type;
        }

        public final boolean isAutoRequest() {
            ArrayList<Pair<Function1<Integer, Boolean>, Integer>> arrayList = this.callback;
            if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
                return false;
            }
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                if (AllReadyCallback.INSTANCE.isAutoRequest(getType(), ((Number) ((Pair) it.next()).getSecond()).intValue())) {
                    return true;
                }
            }
            return false;
        }

        public final boolean resetStatus() {
            boolean z;
            synchronized (this) {
                boolean z2 = getStatus() == -3;
                setStatus(-3);
                z = !z2;
            }
            return z;
        }

        public final void setCallback(@NotNull ArrayList<Pair<Function1<Integer, Boolean>, Integer>> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
            this.callback = arrayList;
        }

        public final void setReadyCallback(int result) {
            ArrayList arrayList;
            synchronized (this) {
                try {
                    if (result == 0) {
                        ArrayList<Pair<Function1<Integer, Boolean>, Integer>> callback = getCallback();
                        arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(callback, 10));
                        Iterator<T> it = callback.iterator();
                        while (it.hasNext()) {
                            arrayList.add((Function1) ((Pair) it.next()).getFirst());
                        }
                        getCallback().clear();
                    } else {
                        arrayList = new ArrayList();
                        for (IndexedValue indexedValue : CollectionsKt___CollectionsKt.reversed(CollectionsKt___CollectionsKt.withIndex(getCallback()))) {
                            int iComponent1 = indexedValue.component1();
                            Pair pair = (Pair) indexedValue.component2();
                            if (((Number) pair.getSecond()).intValue() == -1) {
                                arrayList.add(pair.getFirst());
                                getCallback().remove(iComponent1);
                            } else {
                                arrayList.add(pair.getFirst());
                            }
                        }
                    }
                    setStatus(result);
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((Function1) it2.next()).invoke2(Integer.valueOf(result));
            }
        }

        public final void setStatus(int i) {
            this.status = i;
        }
    }

    public /* synthetic */ AllReadyCallback(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2);
    }

    @JvmStatic
    @NotNull
    public static final AllReadyCallback check(int i, @Nullable Runnable runnable) {
        return INSTANCE.check(i, runnable);
    }

    @JvmStatic
    public static final void clearReady(int i) {
        INSTANCE.clearReady(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: invoke$lambda-0, reason: not valid java name */
    public static final void m838invoke$lambda0(AllReadyCallback this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Watcher<Integer> watcher = this$0.listener;
        if (watcher == null) {
            return;
        }
        watcher.accept(Integer.valueOf(i));
    }

    @JvmStatic
    @NotNull
    public static final AllReadyCallback isReady(int i, int i2, @Nullable Handler handler, @Nullable Watcher<Integer> watcher) {
        return INSTANCE.isReady(i, i2, handler, watcher);
    }

    @JvmStatic
    public static final boolean isReadyItem(int i) {
        return INSTANCE.isReadyItem(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: observer$lambda-1, reason: not valid java name */
    public static final void m839observer$lambda1(Lifecycle lifecycle, AllReadyCallback this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (lifecycle == null) {
            return;
        }
        lifecycle.addObserver(this$0);
    }

    public final void cancel() {
        this.runnable = null;
        this.listener = null;
    }

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: invoke */
    public /* bridge */ /* synthetic */ Boolean invoke2(Integer num) {
        return invoke(num.intValue());
    }

    @Override // com.xiaomi.smarthome.IReadyCallback
    public void isReadyListener(boolean autoRequest, @NotNull Watcher<Integer> runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
    }

    public final void observer(@Nullable final Lifecycle lifeCycle) {
        CommonUtil.runMainThread(new Runnable() { // from class: n61
            @Override // java.lang.Runnable
            public final void run() {
                AllReadyCallback.m839observer$lambda1(lifeCycle, this);
            }
        });
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        cancel();
    }

    @NotNull
    public String toString() {
        Watcher<Integer> watcher = this.listener;
        String string = watcher == null ? null : watcher.toString();
        return string == null ? super.toString() : string;
    }

    private AllReadyCallback(int i, int i2) {
        this.autoRequest = i;
        this.allCheckType = i2;
        this.debug = !MiJiaEnvironment.isReleaseBuildType();
    }

    @JvmStatic
    @NotNull
    public static final AllReadyCallback check(@Nullable Runnable runnable) {
        return INSTANCE.check(runnable);
    }

    @JvmStatic
    @NotNull
    public static final AllReadyCallback isReady(int i, int i2, @Nullable Watcher<Integer> watcher) {
        return INSTANCE.isReady(i, i2, watcher);
    }

    @NotNull
    public Boolean invoke(final int type) {
        if (type != 0 && this.autoRequest == 0) {
            if (this.debug) {
                StringBuilder sb = new StringBuilder();
                sb.append("accept error wait ");
                sb.append(this.runnable);
                sb.append(' ');
                sb.append(this.listener);
                sb.append(' ');
                sb.append(type);
            }
            return Boolean.FALSE;
        }
        if (this.debug) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("accept ");
            sb2.append(this.runnable);
            sb2.append(' ');
            sb2.append(this.listener);
            sb2.append(' ');
            sb2.append(type);
        }
        Handler globalHandler = GlobalHandlerManager.getInstance().getGlobalHandler();
        Intrinsics.checkNotNullExpressionValue(globalHandler, "getInstance().getGlobalHandler()");
        if (this.listener != null) {
            Handler handler = this.handler;
            if (handler == null) {
                handler = globalHandler;
            }
            CommonUtil.runOnThread(handler, new Runnable() { // from class: o61
                @Override // java.lang.Runnable
                public final void run() {
                    AllReadyCallback.m838invoke$lambda0(this.f28780a, type);
                }
            });
        }
        Runnable runnable = this.runnable;
        if (runnable != null && type == 0) {
            Handler handler2 = this.handler;
            if (handler2 != null) {
                globalHandler = handler2;
            }
            CommonUtil.runOnThread(globalHandler, runnable);
        }
        return Boolean.TRUE;
    }

    @JvmStatic
    @NotNull
    public static final AllReadyCallback isReady(int i, @Nullable Watcher<Integer> watcher) {
        return INSTANCE.isReady(i, watcher);
    }

    @JvmStatic
    @NotNull
    public static final AllReadyCallback isReady(@Nullable Watcher<Integer> watcher) {
        return INSTANCE.isReady(watcher);
    }
}
