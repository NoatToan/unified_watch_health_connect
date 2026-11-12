package com.huami.treadmill.ext;

import androidx.annotation.IdRes;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelProviders;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.treadmill.ViewModelFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001a\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u001a\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007\u001a-\u0010\u000f\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\n\u001a\u00020\u00032\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0002\b\r\u001a)\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\u0011*\u00020\u0010*\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001a&\u0010\u0018\u001a\u00020\u0005*\u00020\u00162\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0002\b\rH\u0082\b\"\u0016\u0010\u0019\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0016\u0010\u001b\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a\"\u0016\u0010\u001c\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, d2 = {"Landroidx/appcompat/app/AppCompatActivity;", "Landroidx/fragment/app/Fragment;", "fragment", "", "frameId", "", "replaceFragmentInActivity", "", "tag", "addFragmentToActivity", "toolbarId", "Lkotlin/Function1;", "Landroidx/appcompat/app/ActionBar;", "Lkotlin/ExtensionFunctionType;", "action", "setupActionBar", "Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "viewModelClass", "obtainViewModel", "(Landroidx/appcompat/app/AppCompatActivity;Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "Landroidx/fragment/app/FragmentManager;", "Landroidx/fragment/app/FragmentTransaction;", "a", "ADD_EDIT_RESULT_OK", LogUtil.I, "DELETE_RESULT_OK", "EDIT_RESULT_OK", "treadmill_release"}, k = 2, mv = {1, 5, 1})
public final class AppCompatActivityExtKt {
    public static final int ADD_EDIT_RESULT_OK = 2;
    public static final int DELETE_RESULT_OK = 3;
    public static final int EDIT_RESULT_OK = 4;

    private static final void a(FragmentManager fragmentManager, Function1<? super FragmentTransaction, Unit> function1) {
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        function1.invoke(fragmentTransactionBeginTransaction);
        fragmentTransactionBeginTransaction.commit();
    }

    public static final void addFragmentToActivity(@NotNull AppCompatActivity appCompatActivity, @NotNull Fragment fragment, @NotNull String str) {
        FragmentTransaction fragmentTransactionBeginTransaction = appCompatActivity.getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.add(fragment, str);
        fragmentTransactionBeginTransaction.commit();
    }

    @NotNull
    public static final <T extends ViewModel> T obtainViewModel(@NotNull AppCompatActivity appCompatActivity, @NotNull Class<T> cls) {
        return (T) ViewModelProviders.of(appCompatActivity, ViewModelFactory.INSTANCE.getInstance(appCompatActivity.getApplication())).get(cls);
    }

    public static final void replaceFragmentInActivity(@NotNull AppCompatActivity appCompatActivity, @NotNull Fragment fragment, int i) {
        FragmentTransaction fragmentTransactionBeginTransaction = appCompatActivity.getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.replace(i, fragment);
        fragmentTransactionBeginTransaction.commit();
    }

    public static final void setupActionBar(@NotNull AppCompatActivity appCompatActivity, @IdRes int i, @NotNull Function1<? super ActionBar, Unit> function1) {
        appCompatActivity.setSupportActionBar((Toolbar) appCompatActivity.findViewById(i));
        ActionBar supportActionBar = appCompatActivity.getSupportActionBar();
        if (supportActionBar == null) {
            return;
        }
        function1.invoke(supportActionBar);
    }
}
