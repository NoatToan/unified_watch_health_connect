package com.xiaomi.fitness.habit.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import coil.Coil;
import coil.request.ImageRequest;
import com.xiaomi.fitness.common.extensions.PermissionBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.habit.ui.HabitShareActivity;
import com.xiaomi.fitness.habit.utils.UtilsKt;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import defpackage.b0j;
import defpackage.ceb;
import defpackage.gv5;
import defpackage.iui;
import defpackage.nni;
import defpackage.pxi;
import defpackage.s4m;
import defpackage.xhq;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001%B\u0007¢\u0006\u0004\b#\u0010$J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0016R\u0014\u0010\"\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0016¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/habit/ui/HabitShareActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/habit/ui/HabitShareViewModel;", "Lceb;", "", "bindView", "(Lceb;)V", "Landroid/graphics/Bitmap;", DeviceTagInterface.CUSTOM_TAG_TYPE, "bindDataToView", "(Landroid/graphics/Bitmap;)V", "", HabitShareActivity.KEY_BIG_ICON, "Ljava/lang/String;", "getBigIcon", "()Ljava/lang/String;", "setBigIcon", "(Ljava/lang/String;)V", "", HabitShareActivity.KEY_CONTINUESPUNCH, "I", "getContinuesPunch", "()I", "setContinuesPunch", "(I)V", HabitShareActivity.KEY_HABIT_NAME, "getHabitName", "setHabitName", "Ls4m;", "shareComponent", "Ls4m;", "getViewModelId", "viewModelId", "getLayoutId", "layoutId", "<init>", "()V", "Companion", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nHabitShareActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HabitShareActivity.kt\ncom/xiaomi/fitness/habit/ui/HabitShareActivity\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,109:1\n54#2,3:110\n24#2:113\n57#2,6:114\n63#2,2:121\n57#3:120\n*S KotlinDebug\n*F\n+ 1 HabitShareActivity.kt\ncom/xiaomi/fitness/habit/ui/HabitShareActivity\n*L\n49#1:110,3\n49#1:113\n49#1:114,6\n49#1:121,2\n49#1:120\n*E\n"})
public final class HabitShareActivity extends Hilt_HabitShareActivity<HabitShareViewModel, ceb> {

    @NotNull
    public static final String KEY_BIG_ICON = "bigIcon";

    @NotNull
    public static final String KEY_CONTINUESPUNCH = "continuesPunch";

    @NotNull
    public static final String KEY_HABIT_NAME = "habitName";

    @Nullable
    private String bigIcon;
    private int continuesPunch;

    @Nullable
    private String habitName;

    @Nullable
    private s4m shareComponent;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$0(HabitShareActivity this$0, Bitmap it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.bindDataToView(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$7(final HabitShareActivity this$0, final ceb this_bindView, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        if (Build.VERSION.SDK_INT >= 29 || PermissionExtKt.isPermissionGranted(this$0, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            s4m s4mVar = this$0.shareComponent;
            if (s4mVar != null) {
                s4mVar.n(this$0.habitName, "", this_bindView.F);
                return;
            }
            return;
        }
        final Function0 function0 = new Function0() { // from class: kib
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HabitShareActivity.bindView$lambda$7$lambda$4(this.f23873a, this_bindView);
            }
        };
        if (PermissionExtKt.supportMiuiPermissionEnable()) {
            function0.invoke();
            return;
        }
        String string = this$0.getString(b0j.K);
        String string2 = this$0.getString(b0j.J);
        int i = b0j.common_allow;
        FragmentManager supportFragmentManager = this$0.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        UtilsKt.showMsgDialog(string, string2, i, supportFragmentManager, b0j.common_reject, (Function1<? super DialogInterface, Unit>) new Function1() { // from class: lib
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HabitShareActivity.bindView$lambda$7$lambda$5(function0, (DialogInterface) obj);
            }
        }, (Function1<? super DialogInterface, Unit>) new Function1() { // from class: mib
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HabitShareActivity.bindView$lambda$7$lambda$6((DialogInterface) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$7$lambda$4(final HabitShareActivity this$0, final ceb this_bindView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        PermissionExtKt.permission(this$0, "android.permission.WRITE_EXTERNAL_STORAGE", this$0.getString(b0j.U), (Function1<? super PermissionBuilder, Unit>) new Function1() { // from class: nib
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HabitShareActivity.bindView$lambda$7$lambda$4$lambda$3(this.f27958a, this_bindView, (PermissionBuilder) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$7$lambda$4$lambda$3(final HabitShareActivity this$0, final ceb this_bindView, PermissionBuilder permission) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        Intrinsics.checkNotNullParameter(permission, "$this$permission");
        permission.granted(new Function1() { // from class: iib
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HabitShareActivity.bindView$lambda$7$lambda$4$lambda$3$lambda$1(this.f21168a, this_bindView, (String) obj);
            }
        });
        permission.denied(new Function1() { // from class: jib
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HabitShareActivity.bindView$lambda$7$lambda$4$lambda$3$lambda$2((String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$7$lambda$4$lambda$3$lambda$1(HabitShareActivity this$0, ceb this_bindView, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        Intrinsics.checkNotNullParameter(it, "it");
        s4m s4mVar = this$0.shareComponent;
        if (s4mVar != null) {
            s4mVar.n(this$0.habitName, "", this_bindView.F);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$7$lambda$4$lambda$3$lambda$2(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$7$lambda$5(Function0 requestPermission, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(requestPermission, "$requestPermission");
        requestPermission.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$7$lambda$6(DialogInterface dialogInterface) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void bindDataToView(@Nullable Bitmap t) {
        ((ceb) getMBinding()).J.setImageBitmap(t);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull final ceb cebVar) {
        String stringExtra;
        Intrinsics.checkNotNullParameter(cebVar, "<this>");
        String stringExtra2 = getIntent().getStringExtra(KEY_BIG_ICON);
        String str = "";
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.bigIcon = stringExtra2;
        Intent intent = getIntent();
        this.continuesPunch = intent != null ? intent.getIntExtra(KEY_CONTINUESPUNCH, 0) : 0;
        Intent intent2 = getIntent();
        if (intent2 != null && (stringExtra = intent2.getStringExtra(KEY_HABIT_NAME)) != null) {
            str = stringExtra;
        }
        this.habitName = str;
        this.shareComponent = new s4m(this);
        ImageView bigIconView = ((ceb) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(bigIconView, "bigIconView");
        Coil.imageLoader(bigIconView.getContext()).enqueue(new ImageRequest.Builder(bigIconView.getContext()).data(this.bigIcon).target(bigIconView).build());
        cebVar.C.setText(String.valueOf(this.continuesPunch));
        cebVar.D.setText(getResources().getString(b0j.s, this.habitName));
        String strA = xhq.c.a();
        if (strA != null) {
            cebVar.E.setText(gv5.CONNECT_VALUE_STR + strA);
        }
        cebVar.A.setText(getResources().getString(b0j.O, getResources().getString(b0j.f3654a)));
        HabitShareViewModel habitShareViewModel = (HabitShareViewModel) getMViewModel();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        habitShareViewModel.createQRBitmap(resources, new Function1() { // from class: oib
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HabitShareActivity.bindView$lambda$0(this.f29196a, (Bitmap) obj);
            }
        });
        View viewInflate = LayoutInflater.from(this).inflate(iui.p, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewInflate;
        imageView.setImageResource(nni.h);
        imageView.setContentDescription(getString(b0j.N));
        setEndView(imageView);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: pib
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HabitShareActivity.bindView$lambda$7(this.f30412a, cebVar, view);
            }
        });
        cebVar.G.setText(getResources().getQuantityText(pxi.c, this.continuesPunch));
    }

    @Nullable
    public final String getBigIcon() {
        return this.bigIcon;
    }

    public final int getContinuesPunch() {
        return this.continuesPunch;
    }

    @Nullable
    public final String getHabitName() {
        return this.habitName;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return iui.c;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    public final void setBigIcon(@Nullable String str) {
        this.bigIcon = str;
    }

    public final void setContinuesPunch(int i) {
        this.continuesPunch = i;
    }

    public final void setHabitName(@Nullable String str) {
        this.habitName = str;
    }
}
