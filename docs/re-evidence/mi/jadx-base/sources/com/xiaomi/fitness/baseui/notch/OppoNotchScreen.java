package com.xiaomi.fitness.baseui.notch;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007H\u0016J\u001a\u0010\t\u001a\u00020\n2\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007H\u0017J$\u0010\u000b\u001a\u00020\n2\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/baseui/notch/OppoNotchScreen;", "Lcom/xiaomi/fitness/baseui/notch/INotchScreen;", "<init>", "()V", "hasNotch", "", "activityWeakReference", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "setDisplayInNotch", "", "getNotchRect", "callback", "Lcom/xiaomi/fitness/baseui/notch/INotchScreen$NotchSizeCallback;", "Companion", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@TargetApi(26)
@SourceDebugExtension({"SMAP\nOppoNotchScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OppoNotchScreen.kt\ncom/xiaomi/fitness/baseui/notch/OppoNotchScreen\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,107:1\n37#2:108\n36#2,3:109\n37#2:112\n36#2,3:113\n37#2:116\n36#2,3:117\n*S KotlinDebug\n*F\n+ 1 OppoNotchScreen.kt\ncom/xiaomi/fitness/baseui/notch/OppoNotchScreen\n*L\n43#1:108\n43#1:109,3\n45#1:112\n45#1:113,3\n47#1:116\n47#1:117,3\n*E\n"})
public final class OppoNotchScreen implements INotchScreen {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/baseui/notch/OppoNotchScreen$Companion;", "", "<init>", "()V", "screenValue", "", "getScreenValue", "()Ljava/lang/String;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getScreenValue() {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                Object objInvoke = cls.getMethod("get", String.class).invoke(cls.newInstance(), "ro.oppo.screen.heteromorphism");
                Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.String");
                return (String) objInvoke;
            } catch (Throwable unused) {
                return "";
            }
        }
    }

    @Override // com.xiaomi.fitness.baseui.notch.INotchScreen
    public void getNotchRect(@Nullable WeakReference<Activity> activityWeakReference, @Nullable INotchScreen.NotchSizeCallback callback) {
        Activity activity;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        if (activityWeakReference == null || (activity = activityWeakReference.get()) == null) {
            return;
        }
        try {
            String screenValue = INSTANCE.getScreenValue();
            if (TextUtils.isEmpty(screenValue)) {
                return;
            }
            String[] strArr = (String[]) new Regex(":").split(screenValue, 0).toArray(new String[0]);
            String[] strArr2 = (String[]) new Regex(",").split(strArr[0], 0).toArray(new String[0]);
            String[] strArr3 = (String[]) new Regex(",").split(strArr[1], 0).toArray(new String[0]);
            if (ScreenUtil.INSTANCE.isPortrait(activity)) {
                iIntValue = Integer.valueOf(strArr2[0]).intValue();
                iIntValue2 = Integer.valueOf(strArr2[1]).intValue();
                iIntValue3 = Integer.valueOf(strArr3[0]).intValue();
                iIntValue4 = Integer.valueOf(strArr3[1]).intValue();
            } else {
                iIntValue = Integer.valueOf(strArr2[1]).intValue();
                iIntValue2 = Integer.valueOf(strArr2[0]).intValue();
                iIntValue3 = Integer.valueOf(strArr3[1]).intValue();
                iIntValue4 = Integer.valueOf(strArr3[0]).intValue();
            }
            Rect rect = new Rect(iIntValue, iIntValue2, iIntValue3, iIntValue4);
            ArrayList arrayList = new ArrayList();
            arrayList.add(rect);
            if (callback != null) {
                callback.onResult(arrayList);
            }
        } catch (Throwable unused) {
            if (callback != null) {
                callback.onResult(null);
            }
        }
    }

    @Override // com.xiaomi.fitness.baseui.notch.INotchScreen
    public boolean hasNotch(@Nullable WeakReference<Activity> activityWeakReference) {
        Activity activity;
        if (activityWeakReference != null && (activity = activityWeakReference.get()) != null) {
            try {
                return activity.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.xiaomi.fitness.baseui.notch.INotchScreen
    @Deprecated(message = "")
    public void setDisplayInNotch(@Nullable WeakReference<Activity> activityWeakReference) {
    }
}
