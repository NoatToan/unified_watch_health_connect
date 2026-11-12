package com.permissionx.guolindev.dialog;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.ani;
import defpackage.jzi;
import defpackage.m3j;
import defpackage.qsh;
import defpackage.rsh;
import defpackage.ybj;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010&\u001a\u00020%\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u001d\u001a\u00020\u0013\u0012\u0006\u0010\u001f\u001a\u00020\u0013\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020!¢\u0006\u0004\b'\u0010(J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0016\u0010\tR\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0016\u0010 \u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#¨\u0006)"}, d2 = {"Lcom/permissionx/guolindev/dialog/DefaultDialog;", "Lybj;", "", "setupText", "()V", "buildPermissionsLayout", "setupWindow", "", "isDarkTheme", "()Z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "getPositiveButton", "()Landroid/view/View;", "getNegativeButton", "", "", "getPermissionsToRequest", "()Ljava/util/List;", "isPermissionLayoutEmpty$permissionx_release", "isPermissionLayoutEmpty", "Lqsh;", "binding", "Lqsh;", "permissions", "Ljava/util/List;", "message", "Ljava/lang/String;", "positiveText", "negativeText", "", "lightColor", "I", "darkColor", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "permissionx_release"}, k = 1, mv = {1, 4, 2})
public final class DefaultDialog extends ybj {
    private qsh binding;
    private final int darkColor;
    private final int lightColor;
    private final String message;
    private final String negativeText;
    private final List<String> permissions;
    private final String positiveText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultDialog(@NotNull Context context, @NotNull List<String> permissions, @NotNull String message, @NotNull String positiveText, @Nullable String str, int i, int i2) {
        super(context, m3j.f25715a);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(positiveText, "positiveText");
        this.permissions = permissions;
        this.message = message;
        this.positiveText = positiveText;
        this.negativeText = str;
        this.lightColor = i;
        this.darkColor = i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:42:0x0123  */
    private final void buildPermissionsLayout() {
        String str;
        HashSet hashSet = new HashSet();
        int i = Build.VERSION.SDK_INT;
        for (String str2 : this.permissions) {
            if (i < 29) {
                try {
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "context");
                    str = context.getPackageManager().getPermissionInfo(str2, 0).group;
                } catch (PackageManager.NameNotFoundException e) {
                    e.printStackTrace();
                    str = null;
                }
            } else if (i == 29) {
                str = PermissionMapKt.getPermissionMapOnQ().get(str2);
            } else {
                str = i == 30 ? PermissionMapKt.getPermissionMapOnR().get(str2) : PermissionMapKt.getPermissionMapOnR().get(str2);
            }
            if ((PermissionMapKt.getAllSpecialPermissions().contains(str2) && !hashSet.contains(str2)) || (str != null && !hashSet.contains(str))) {
                LayoutInflater layoutInflater = getLayoutInflater();
                qsh qshVar = this.binding;
                if (qshVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                }
                rsh rshVarC = rsh.c(layoutInflater, qshVar.e, false);
                Intrinsics.checkNotNullExpressionValue(rshVarC, "PermissionxPermissionIte…permissionsLayout, false)");
                switch (str2) {
                    case "android.permission.WRITE_SETTINGS":
                        TextView textView = rshVarC.c;
                        Intrinsics.checkNotNullExpressionValue(textView, "itemBinding.permissionText");
                        textView.setText(getContext().getString(jzi.d));
                        rshVarC.f32858b.setImageResource(ani.c);
                        break;
                    case "android.permission.MANAGE_EXTERNAL_STORAGE":
                        TextView textView2 = rshVarC.c;
                        Intrinsics.checkNotNullExpressionValue(textView2, "itemBinding.permissionText");
                        textView2.setText(getContext().getString(jzi.f23267b));
                        rshVarC.f32858b.setImageResource(ani.d);
                        break;
                    case "android.permission.SYSTEM_ALERT_WINDOW":
                        TextView textView3 = rshVarC.c;
                        Intrinsics.checkNotNullExpressionValue(textView3, "itemBinding.permissionText");
                        textView3.setText(getContext().getString(jzi.c));
                        rshVarC.f32858b.setImageResource(ani.f3286a);
                        break;
                    case "android.permission.ACCESS_BACKGROUND_LOCATION":
                        TextView textView4 = rshVarC.c;
                        Intrinsics.checkNotNullExpressionValue(textView4, "itemBinding.permissionText");
                        textView4.setText(getContext().getString(jzi.f23266a));
                        rshVarC.f32858b.setImageResource(ani.f3287b);
                        break;
                    default:
                        TextView textView5 = rshVarC.c;
                        Intrinsics.checkNotNullExpressionValue(textView5, "itemBinding.permissionText");
                        Context context2 = getContext();
                        Context context3 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "context");
                        PackageManager packageManager = context3.getPackageManager();
                        Intrinsics.checkNotNull(str);
                        textView5.setText(context2.getString(packageManager.getPermissionGroupInfo(str, 0).labelRes));
                        ImageView imageView = rshVarC.f32858b;
                        Context context4 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "context");
                        imageView.setImageResource(context4.getPackageManager().getPermissionGroupInfo(str, 0).icon);
                        break;
                }
                if (isDarkTheme()) {
                    int i2 = this.darkColor;
                    if (i2 != -1) {
                        rshVarC.f32858b.setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
                    }
                } else {
                    int i3 = this.lightColor;
                    if (i3 != -1) {
                        rshVarC.f32858b.setColorFilter(i3, PorterDuff.Mode.SRC_ATOP);
                    }
                }
                qsh qshVar2 = this.binding;
                if (qshVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                }
                qshVar2.e.addView(rshVarC.getRoot());
                if (str != null) {
                    str2 = str;
                }
                hashSet.add(str2);
            }
        }
    }

    private final boolean isDarkTheme() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        return (resources.getConfiguration().uiMode & 48) == 32;
    }

    private final void setupText() {
        qsh qshVar = this.binding;
        if (qshVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        TextView textView = qshVar.f31804b;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.messageText");
        textView.setText(this.message);
        qsh qshVar2 = this.binding;
        if (qshVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        Button button = qshVar2.f;
        Intrinsics.checkNotNullExpressionValue(button, "binding.positiveBtn");
        button.setText(this.positiveText);
        if (this.negativeText != null) {
            qsh qshVar3 = this.binding;
            if (qshVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            LinearLayout linearLayout = qshVar3.d;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.negativeLayout");
            linearLayout.setVisibility(0);
            qsh qshVar4 = this.binding;
            if (qshVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            Button button2 = qshVar4.c;
            Intrinsics.checkNotNullExpressionValue(button2, "binding.negativeBtn");
            button2.setText(this.negativeText);
        } else {
            qsh qshVar5 = this.binding;
            if (qshVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            LinearLayout linearLayout2 = qshVar5.d;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.negativeLayout");
            linearLayout2.setVisibility(8);
        }
        if (isDarkTheme()) {
            if (this.darkColor != -1) {
                qsh qshVar6 = this.binding;
                if (qshVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                }
                qshVar6.f.setTextColor(this.darkColor);
                qsh qshVar7 = this.binding;
                if (qshVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                }
                qshVar7.c.setTextColor(this.darkColor);
                return;
            }
            return;
        }
        if (this.lightColor != -1) {
            qsh qshVar8 = this.binding;
            if (qshVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            qshVar8.f.setTextColor(this.lightColor);
            qsh qshVar9 = this.binding;
            if (qshVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            qshVar9.c.setTextColor(this.lightColor);
        }
    }

    private final void setupWindow() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        int i = resources.getDisplayMetrics().widthPixels;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        Resources resources2 = context2.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "context.resources");
        if (i < resources2.getDisplayMetrics().heightPixels) {
            Window it = getWindow();
            if (it != null) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                WindowManager.LayoutParams attributes = it.getAttributes();
                it.setGravity(17);
                attributes.width = (int) (((double) i) * 0.86d);
                it.setAttributes(attributes);
                return;
            }
            return;
        }
        Window it2 = getWindow();
        if (it2 != null) {
            Intrinsics.checkNotNullExpressionValue(it2, "it");
            WindowManager.LayoutParams attributes2 = it2.getAttributes();
            it2.setGravity(17);
            attributes2.width = (int) (((double) i) * 0.6d);
            it2.setAttributes(attributes2);
        }
    }

    @Override // defpackage.ybj
    @Nullable
    public View getNegativeButton() {
        if (this.negativeText == null) {
            return null;
        }
        qsh qshVar = this.binding;
        if (qshVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        return qshVar.c;
    }

    @Override // defpackage.ybj
    @NotNull
    public List<String> getPermissionsToRequest() {
        return this.permissions;
    }

    @Override // defpackage.ybj
    @NotNull
    public View getPositiveButton() {
        qsh qshVar = this.binding;
        if (qshVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        Button button = qshVar.f;
        Intrinsics.checkNotNullExpressionValue(button, "binding.positiveBtn");
        return button;
    }

    public final boolean isPermissionLayoutEmpty$permissionx_release() {
        qsh qshVar = this.binding;
        if (qshVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        LinearLayout linearLayout = qshVar.e;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.permissionsLayout");
        return linearLayout.getChildCount() == 0;
    }

    @Override // android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        qsh qshVarC = qsh.c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(qshVarC, "PermissionxDefaultDialog…g.inflate(layoutInflater)");
        this.binding = qshVarC;
        if (qshVarC == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        setContentView(qshVarC.getRoot());
        setupText();
        buildPermissionsLayout();
        setupWindow();
    }
}
