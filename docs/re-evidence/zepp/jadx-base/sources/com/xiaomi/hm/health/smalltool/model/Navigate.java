package com.xiaomi.hm.health.smalltool.model;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.util.Log;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u001bB1\b\u0016\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\r\u0012\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019B%\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u001aJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u001a\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0016\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bR$\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/smalltool/model/Navigate;", "Lcom/xiaomi/hm/health/smalltool/model/INavigate;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "navi", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "device", "", "a", "to", "Landroid/content/Intent;", "intent", "Lkotlin/Pair;", "Lcom/xiaomi/hm/health/smalltool/model/IFilter;", "Lkotlin/Pair;", "naviPair", "b", "Ljava/lang/Object;", "", "", "c", "[Ljava/lang/String;", "tag", "<init>", "(Lkotlin/Pair;[Ljava/lang/String;)V", "(Ljava/lang/Object;[Ljava/lang/String;)V", "SmartWatch", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class Navigate implements INavigate {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Pair<? extends IFilter, ? extends Object> naviPair;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Object navi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String[] tag;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\u0010\u0010\u0011B#\b\u0016\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0004\b\u0010\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R$\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR*\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/smalltool/model/Navigate$SmartWatch;", "Lcom/xiaomi/hm/health/smalltool/model/INavigate;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "to", "Lkotlin/Function1;", "Lcom/huami/watch/companion/device/Device;", "a", "Lkotlin/jvm/functions/Function1;", "navigate1", "Lkotlin/Function2;", "b", "Lkotlin/jvm/functions/Function2;", "navigate2", "filter", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "(Lkotlin/jvm/functions/Function2;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class SmartWatch implements INavigate {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private Function1<? super Device, Boolean> navigate1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private Function2<? super Context, ? super Device, Boolean> navigate2;

        public SmartWatch(@NotNull Function1<? super Device, Boolean> function1) {
            this.navigate1 = function1;
        }

        @Override // com.xiaomi.hm.health.smalltool.model.INavigate
        public boolean to(@NotNull Context context, @Nullable HMDeviceSource hMDeviceSource) {
            return INavigate.DefaultImpls.to(this, context, hMDeviceSource);
        }

        @Override // com.xiaomi.hm.health.smalltool.model.INavigate
        public boolean to(@NotNull Context context) {
            boolean zBooleanValue;
            Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
            if (currentDevice == null) {
                return false;
            }
            Function1<? super Device, Boolean> function1 = this.navigate1;
            Boolean boolValueOf = function1 == null ? null : Boolean.valueOf(function1.invoke(currentDevice).booleanValue());
            if (boolValueOf == null) {
                Function2<? super Context, ? super Device, Boolean> function2 = this.navigate2;
                if (function2 == null) {
                    return false;
                }
                zBooleanValue = function2.invoke(context, currentDevice).booleanValue();
            } else {
                zBooleanValue = boolValueOf.booleanValue();
            }
            return zBooleanValue;
        }

        public SmartWatch(@NotNull Function2<? super Context, ? super Device, Boolean> function2) {
            this.navigate2 = function2;
        }
    }

    public Navigate(@NotNull Pair<? extends IFilter, ? extends Object> pair, @NotNull String... strArr) {
        this.naviPair = pair;
        this.tag = strArr;
    }

    private final boolean a(Context context, Object navi, HMDeviceSource device) {
        boolean zBooleanValue = false;
        if (navi instanceof String) {
            if (TextUtils.isEmpty((CharSequence) navi)) {
                return false;
            }
            return to(context, new Intent((String) navi));
        }
        if (navi instanceof Class) {
            return to(context, new Intent(context, (Class<?>) navi));
        }
        if (navi instanceof Intent) {
            return to(context, (Intent) navi);
        }
        if (navi instanceof INavigate) {
            return ((INavigate) navi).to(context, device);
        }
        try {
            return ((Boolean) ((Function0) ((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(navi, 1)).invoke(context)).invoke()).booleanValue();
        } catch (Exception unused) {
            try {
                try {
                    try {
                        return ((Boolean) ((Function0) ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(navi, 2)).invoke(context, device)).invoke()).booleanValue();
                    } catch (Exception e) {
                        e.printStackTrace();
                        return zBooleanValue;
                    }
                } catch (Exception unused2) {
                    zBooleanValue = ((Boolean) ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(navi, 2)).invoke(context, device)).booleanValue();
                    return zBooleanValue;
                }
            } catch (Exception unused3) {
                return ((Boolean) ((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(navi, 1)).invoke(context)).booleanValue();
            }
        }
    }

    @Override // com.xiaomi.hm.health.smalltool.model.INavigate
    public boolean to(@NotNull Context context) {
        return INavigate.DefaultImpls.to(this, context);
    }

    @Override // com.xiaomi.hm.health.smalltool.model.INavigate
    public boolean to(@NotNull Context context, @Nullable HMDeviceSource device) {
        String str;
        Pair<? extends IFilter, ? extends Object> pair = this.naviPair;
        Object second = null;
        if (pair != null) {
            Log.d("SmallTool-Config", "Navigate: " + pair, new Object[0]);
            IFilter first = pair.getFirst();
            boolean zMatch = first.match(context, device);
            Log.d("SmallTool-Config", "Filter: [" + device + "] " + (zMatch ? "is" : "is NOT") + " [" + first + "]", new Object[0]);
            if (zMatch) {
                second = pair.getSecond();
            }
        }
        if (second == null) {
            second = this.navi;
        }
        if (second == null) {
            return false;
        }
        String[] strArr = this.tag;
        if (!(strArr.length == 0)) {
            str = ", " + strArr[0];
        } else {
            str = "";
        }
        Log.d("SmallTool-Config", "Navigate To: " + second + str, new Object[0]);
        try {
            return a(context, second, device);
        } catch (Exception e) {
            Log.w("SmallTool-Config", "NavigateToErr: " + second, e, new Object[0]);
            return false;
        }
    }

    public Navigate(@NotNull Object obj, @NotNull String... strArr) {
        this.navi = obj;
        this.tag = strArr;
    }

    public final boolean to(@NotNull Context context, @NotNull Intent intent) throws ActivityNotFoundException {
        context.startActivity(intent);
        return true;
    }
}
