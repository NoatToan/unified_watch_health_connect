package com.xiaomi.fitness.baseui.extension;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.k;
import androidx.p004activity.result.ActivityResult;
import androidx.p004activity.result.ActivityResultCallback;
import androidx.p004activity.result.ActivityResultLauncher;
import androidx.p004activity.result.contract.ActivityResultContracts;
import com.alibaba.android.arouter.exception.NoRouteFoundException;
import com.alibaba.android.arouter.facade.Postcard;
import com.google.gson.Gson;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import defpackage.kb;
import defpackage.nre;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a.\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u001a.\u0010\u0002\u001a\u00020\u0003*\u00020\n2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u001a8\u0010\u0002\u001a\u00020\u0003*\u00020\n2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u001a(\u0010\u0002\u001a\u00020\u0003*\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u001a(\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u001a{\u0010\u0010\u001a\u00020\u0003*\u00020\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122.\u0010\u0013\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00150\u0014\"\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010\u001c\u001aq\u0010\u001d\u001a\u00020\t*\u00020\n2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122.\u0010\u0013\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00150\u0014\"\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00152\b\b\u0002\u0010\u001f\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010!\u001a\u0089\u0001\u0010\"\u001a\u00020\u0003*\u00020\n2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122.\u0010\u0013\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00150\u0014\"\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010#\u001a&\u0010$\u001a\u00020\u0003*\u00020%2\b\b\u0001\u0010&\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010'\u001a\u00020(\u001a(\u0010)\u001a\u00020\u0003*\u00020%2\b\b\u0001\u0010&\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u00042\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0004\u001a2\u0010+\u001a\u00020\u0003*\u00020%2\b\b\u0001\u0010&\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u00042\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010,\u001a\u00020\u000e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"type", "", "startActivity", "", "Landroidx/fragment/app/Fragment;", LifecycleConstantKt.TYPE_ACTIVITY, "Ljava/lang/Class;", "block", "Lkotlin/Function1;", "Landroid/content/Intent;", "Landroid/content/Context;", "activityOptions", "Landroid/app/ActivityOptions;", "path", "", "Lcom/alibaba/android/arouter/facade/Postcard;", "startFragment", "fragment", "Lkotlin/reflect/KClass;", "args", "", "Lkotlin/Pair;", "", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", "route", AccountInteractActivity.KEY_REQUEST_CODE, "option", "(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;[Lkotlin/Pair;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Integer;Landroid/os/Bundle;)V", "intent", "fragmentClass", "fragmentArg", "flags", "(Landroid/content/Context;Lkotlin/reflect/KClass;[Lkotlin/Pair;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Integer;)Landroid/content/Intent;", "startPage", "(Landroid/content/Context;Lkotlin/reflect/KClass;[Lkotlin/Pair;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/os/Bundle;)V", "replaceFragment", "Landroidx/fragment/app/FragmentActivity;", "id", "canBack", "", "showFragment", "hideFragment", "showFragmentWithTag", "tag", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLaunchExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LaunchExtension.kt\ncom/xiaomi/fitness/baseui/extension/LaunchExtensionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,234:1\n1#2:235\n13402#3,2:236\n*S KotlinDebug\n*F\n+ 1 LaunchExtension.kt\ncom/xiaomi/fitness/baseui/extension/LaunchExtensionKt\n*L\n102#1:236,2\n*E\n"})
public final class LaunchExtensionKt {
    private static int type;

    @NotNull
    public static final Intent intent(@NotNull Context context, @Nullable KClass<?> kClass, @NotNull Pair<String, ? extends Object>[] args, @NotNull Bundle fragmentArg, @Nullable String str, @Nullable Integer num) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Class javaClass;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(fragmentArg, "fragmentArg");
        Intent intent = new Intent();
        if (kClass == null && str == null) {
            throw new IllegalArgumentException("页面跳转错误，fragment的class name 和 route 不能同时为空".toString());
        }
        if (num != null) {
            intent.setFlags(num.intValue());
        }
        for (Pair<String, ? extends Object> pair : args) {
            Object second = pair.getSecond();
            if (second != null) {
                if (second instanceof Byte) {
                    fragmentArg.putByte(pair.getFirst(), ((Number) second).byteValue());
                } else if (second instanceof Character) {
                    fragmentArg.putChar(pair.getFirst(), ((Character) second).charValue());
                } else if (second instanceof Integer) {
                    fragmentArg.putInt(pair.getFirst(), ((Number) second).intValue());
                } else if (second instanceof Short) {
                    fragmentArg.putShort(pair.getFirst(), ((Number) second).shortValue());
                } else if (second instanceof Long) {
                    fragmentArg.putLong(pair.getFirst(), ((Number) second).longValue());
                } else if (second instanceof Float) {
                    fragmentArg.putFloat(pair.getFirst(), ((Number) second).floatValue());
                } else if (second instanceof Double) {
                    fragmentArg.putDouble(pair.getFirst(), ((Number) second).doubleValue());
                } else if (second instanceof CharSequence) {
                    fragmentArg.putCharSequence(pair.getFirst(), (CharSequence) second);
                } else if (second instanceof Parcelable) {
                    fragmentArg.putParcelable(pair.getFirst(), (Parcelable) second);
                } else if (second instanceof Serializable) {
                    fragmentArg.putSerializable(pair.getFirst(), (Serializable) second);
                } else if (second instanceof String) {
                    fragmentArg.putString(pair.getFirst(), (String) second);
                } else {
                    fragmentArg.putString(pair.getFirst(), new Gson().toJson(second));
                }
            }
        }
        if (kClass != null && (javaClass = JvmClassMappingKt.getJavaClass((KClass) kClass)) != null) {
            Object objNewInstance = javaClass.getConstructor(new Class[0]).newInstance(new Object[0]);
            BaseFragment baseFragment = objNewInstance instanceof BaseFragment ? (BaseFragment) objNewInstance : null;
            if (baseFragment == null) {
                throw new NullPointerException("页面：" + kClass + " 不存在");
            }
            baseFragment.setArguments(fragmentArg);
        }
        if (str != null) {
            Postcard postcardA = kb.c().a(str);
            try {
                nre.b(postcardA);
            } catch (NoRouteFoundException e) {
                e.printStackTrace();
            }
            Object objNewInstance2 = postcardA.getDestination().getConstructor(new Class[0]).newInstance(new Object[0]);
            BaseFragment baseFragment2 = objNewInstance2 instanceof BaseFragment ? (BaseFragment) objNewInstance2 : null;
            if (baseFragment2 == null) {
                throw new NullPointerException("页面：" + postcardA.getPath() + " 未添加 @Route 注解");
            }
            baseFragment2.setArguments(fragmentArg);
        }
        return intent;
    }

    public static /* synthetic */ Intent intent$default(Context context, KClass kClass, Pair[] pairArr, Bundle bundle, String str, Integer num, int i, Object obj) {
        KClass kClass2 = (i & 1) != 0 ? null : kClass;
        if ((i & 4) != 0) {
            bundle = new Bundle();
        }
        return intent(context, kClass2, pairArr, bundle, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : num);
    }

    public static final void replaceFragment(@NotNull FragmentActivity fragmentActivity, int i, @NotNull Fragment fragment, boolean z) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        k kVarO = fragmentActivity.getSupportFragmentManager().o();
        Intrinsics.checkNotNullExpressionValue(kVarO, "beginTransaction(...)");
        kVarO.w(i, fragment);
        if (z) {
            kVarO.j(fragment.toString());
        }
        kVarO.m();
        kVarO.F(fragment);
    }

    public static /* synthetic */ void replaceFragment$default(FragmentActivity fragmentActivity, int i, Fragment fragment, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        replaceFragment(fragmentActivity, i, fragment, z);
    }

    public static final void showFragment(@NotNull FragmentActivity fragmentActivity, int i, @NotNull Fragment showFragment, @Nullable Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        Intrinsics.checkNotNullParameter(showFragment, "showFragment");
        if (Intrinsics.areEqual(showFragment, fragment)) {
            return;
        }
        k kVarO = fragmentActivity.getSupportFragmentManager().o();
        Intrinsics.checkNotNullExpressionValue(kVarO, "beginTransaction(...)");
        if (fragment != null) {
            kVarO.t(fragment);
        }
        if (showFragment.isAdded()) {
            kVarO.F(showFragment);
        } else {
            kVarO.b(i, showFragment);
        }
        kVarO.m();
    }

    public static /* synthetic */ void showFragment$default(FragmentActivity fragmentActivity, int i, Fragment fragment, Fragment fragment2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            fragment2 = null;
        }
        showFragment(fragmentActivity, i, fragment, fragment2);
    }

    public static final void showFragmentWithTag(@NotNull FragmentActivity fragmentActivity, int i, @NotNull Fragment showFragment, @Nullable Fragment fragment, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        Intrinsics.checkNotNullParameter(showFragment, "showFragment");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (Intrinsics.areEqual(showFragment, fragment)) {
            return;
        }
        k kVarO = fragmentActivity.getSupportFragmentManager().o();
        Intrinsics.checkNotNullExpressionValue(kVarO, "beginTransaction(...)");
        if (fragment != null) {
            kVarO.t(fragment);
        }
        if (showFragment.isAdded()) {
            kVarO.F(showFragment);
        } else {
            kVarO.c(i, showFragment, tag);
        }
        kVarO.m();
    }

    public static /* synthetic */ void showFragmentWithTag$default(FragmentActivity fragmentActivity, int i, Fragment fragment, Fragment fragment2, String str, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            fragment2 = null;
        }
        if ((i2 & 8) != 0) {
            str = "";
        }
        showFragmentWithTag(fragmentActivity, i, fragment, fragment2, str);
    }

    public static final void startActivity(@NotNull Fragment fragment, @NotNull Class<?> activity, @Nullable Function1<? super Intent, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = new Intent(fragment.getContext(), activity);
        if (function1 != null) {
            function1.invoke2(intent);
        }
        fragment.startActivity(intent);
    }

    public static /* synthetic */ void startActivity$default(Fragment fragment, Class cls, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        startActivity(fragment, (Class<?>) cls, (Function1<? super Intent, Unit>) function1);
    }

    public static final void startFragment(@NotNull Fragment fragment, @NotNull KClass<Fragment> fragment2, @NotNull Pair<String, ? extends Object>[] args, @NotNull Bundle bundle, @Nullable String str, @Nullable Integer num, @Nullable Bundle bundle2) {
        Intent intentIntent$default;
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(fragment2, "fragment");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        FragmentActivity activity = fragment.getActivity();
        if (activity == null || (intentIntent$default = intent$default(activity, fragment2, (Pair[]) Arrays.copyOf(args, args.length), bundle, str, null, 16, null)) == null) {
            return;
        }
        if (num == null || num.intValue() == -1) {
            fragment.startActivity(intentIntent$default, bundle2);
            return;
        }
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = fragment.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: a3e
            @Override // androidx.p004activity.result.ActivityResultCallback
            public final void a(Object obj) {
                LaunchExtensionKt.startFragment$lambda$1$lambda$0((ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        activityResultLauncherRegisterForActivityResult.launch(intentIntent$default);
    }

    public static /* synthetic */ void startFragment$default(Fragment fragment, KClass kClass, Pair[] pairArr, Bundle bundle, String str, Integer num, Bundle bundle2, int i, Object obj) {
        if ((i & 4) != 0) {
            bundle = new Bundle();
        }
        startFragment(fragment, kClass, pairArr, bundle, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : bundle2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startFragment$lambda$1$lambda$0(ActivityResult activityResult) {
    }

    public static final void startPage(@NotNull Context context, @Nullable KClass<?> kClass, @NotNull Pair<String, ? extends Object>[] args, @NotNull Bundle bundle, @Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable Bundle bundle2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intent intent = intent(context, kClass, (Pair[]) Arrays.copyOf(args, args.length), bundle, str, num2);
        if (!(context instanceof FragmentActivity)) {
            context.startActivity(intent, bundle2);
        } else if (num == null || num.intValue() == -1) {
            ((FragmentActivity) context).startActivity(intent, bundle2);
        } else {
            ((FragmentActivity) context).startActivityForResult(intent, num.intValue(), bundle2);
        }
    }

    public static /* synthetic */ void startActivity$default(Context context, Class cls, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        startActivity(context, (Class<?>) cls, (Function1<? super Intent, Unit>) function1);
    }

    public static /* synthetic */ void startActivity$default(Context context, Class cls, ActivityOptions activityOptions, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        startActivity(context, cls, activityOptions, function1);
    }

    public static final void startActivity(@NotNull Context context, @NotNull Class<?> activity, @Nullable Function1<? super Intent, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = new Intent(context, activity);
        if (function1 != null) {
            function1.invoke2(intent);
        }
        context.startActivity(intent);
    }

    public static final void startActivity(@NotNull Context context, @NotNull Class<?> activity, @Nullable ActivityOptions activityOptions, @Nullable Function1<? super Intent, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = new Intent(context, activity);
        if (function1 != null) {
            function1.invoke2(intent);
        }
        context.startActivity(intent, activityOptions != null ? activityOptions.toBundle() : null);
    }

    public static final void startActivity(@NotNull Context context, @NotNull String path, @Nullable Function1<? super Postcard, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        Postcard postcardA = kb.c().a(path);
        if (function1 != null) {
            Intrinsics.checkNotNull(postcardA);
            function1.invoke2(postcardA);
        }
        postcardA.navigation(context);
    }

    public static final void startActivity(@NotNull Fragment fragment, @NotNull String path, @Nullable Function1<? super Postcard, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        Postcard postcardA = kb.c().a(path);
        if (function1 != null) {
            Intrinsics.checkNotNull(postcardA);
            function1.invoke2(postcardA);
        }
        postcardA.navigation(fragment.getContext());
    }
}
