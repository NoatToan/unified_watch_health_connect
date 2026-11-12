package com.xiaomi.fitness.baseui.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import com.miui.tsmclient.entity.CardUIInfo;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import defpackage.gsi;
import defpackage.n1j;
import defpackage.w08;
import defpackage.wc0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import miuix.appcompat.app.AppCompatActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u0000 S2\u00020\u0001:\u0001SJ\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\tJ\u0019\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\tJ\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJQ\u0010 \u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001c2\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001cH\u0016¢\u0006\u0004\b \u0010!J_\u0010 \u001a\u00020\u00072\u0006\u0010#\u001a\u00020\"2\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001c2\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001c2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b \u0010&J9\u0010,\u001a\u0004\u0018\u00010\u001d2\b\b\u0003\u0010'\u001a\u00020\u00052\b\b\u0001\u0010(\u001a\u00020\u00052\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\n2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-JA\u00101\u001a\u0004\u0018\u00010\u001d2\b\b\u0003\u0010'\u001a\u00020\u00052\b\b\u0001\u0010.\u001a\u00020\u00052\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\n2\u0006\u00100\u001a\u00020/2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b1\u00102J9\u00103\u001a\u0004\u0018\u00010\u001d2\b\b\u0003\u0010'\u001a\u00020\u00052\b\b\u0001\u0010(\u001a\u00020\u00052\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\n2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b3\u0010-J\u0019\u00103\u001a\u00020\u00072\b\u00104\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b3\u00105J\u0017\u0010,\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u001dH\u0016¢\u0006\u0004\b,\u00105J%\u00106\u001a\u00020\u00072\b\b\u0001\u0010(\u001a\u00020\u00052\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b6\u00107JC\u0010>\u001a\u00020\u00072\u0006\u00109\u001a\u0002082\b\u0010;\u001a\u0004\u0018\u00010:2\u0006\u0010<\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00052\b\u0010.\u001a\u0004\u0018\u00010\n2\u0006\u0010=\u001a\u00020\u0005H\u0016¢\u0006\u0004\b>\u0010?J#\u0010B\u001a\u0004\u0018\u00010\u001d2\b\u0010A\u001a\u0004\u0018\u00010@2\u0006\u0010<\u001a\u00020\u0005H\u0016¢\u0006\u0004\bB\u0010CJ\u001f\u0010F\u001a\u00020\u00072\u0006\u00109\u001a\u0002082\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\u00072\u0006\u0010H\u001a\u00020\u0005H\u0016¢\u0006\u0004\bI\u0010\tJ\u0019\u0010K\u001a\u00020\u00072\b\b\u0001\u0010J\u001a\u00020\u0005H\u0016¢\u0006\u0004\bK\u0010\tJ\u0017\u0010K\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u001dH\u0016¢\u0006\u0004\bK\u00105J\u001f\u0010K\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u001d2\u0006\u0010M\u001a\u00020LH\u0016¢\u0006\u0004\bK\u0010NJ\u000f\u0010O\u001a\u00020\u0007H\u0016¢\u0006\u0004\bO\u0010\u001bJ\u000f\u0010P\u001a\u00020\u0007H\u0016¢\u0006\u0004\bP\u0010\u001bJ\u0019\u0010R\u001a\u00020\u00072\b\b\u0001\u0010Q\u001a\u00020\u0005H\u0016¢\u0006\u0004\bR\u0010\t¨\u0006T"}, d2 = {"Lcom/xiaomi/fitness/baseui/view/IActionBar;", "", "Lwc0;", "getMiuiActionBar", "()Lwc0;", "", "titleResId", "", "setTitle", "(I)V", "", "title", "(Ljava/lang/String;)V", "subTitleResId", "setSubtitle", CardUIInfo.KEY_SUBTITILE, "", "display", "setActionBarDisplayable", "(Z)V", "extendState", "setActionBarExpandState", "resizeable", "setActionBarResizeable", "isActionBarBigTitleMode", "()Z", "setActionBarNormalTitleMode", "()V", "Lkotlin/Function1;", "Landroid/view/View;", "startClick", "endClick", "applyEditModeActionBar", "(IILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroid/os/Bundle;", "args", "cancelBtnContentDescOut", "saveBtnContentDescOut", "(Landroid/os/Bundle;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;)V", "viewId", "drawableId", "contentDesc", "Landroid/view/View$OnClickListener;", "clickListener", "setEndView", "(IILjava/lang/String;Landroid/view/View$OnClickListener;)Landroid/view/View;", "text", "", "textsize", "setEndTextView", "(IILjava/lang/String;FLandroid/view/View$OnClickListener;)Landroid/view/View;", "setStartView", "customView", "(Landroid/view/View;)V", "setStartViewRes", "(ILjava/lang/String;)V", "Landroid/app/Activity;", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/view/ActionMode;", "mode", "btnResId", "contentDescStrId", "setActionModeButton", "(Landroid/app/Activity;Landroid/view/ActionMode;IILjava/lang/String;I)V", "Landroid/view/Window;", "window", "getActionModeButton", "(Landroid/view/Window;I)Landroid/view/View;", "Landroid/view/ActionMode$Callback;", "callback", "startActionMode", "(Landroid/app/Activity;Landroid/view/ActionMode$Callback;)V", "option", "displayOptions", "layoutId", "setCustomView", "Landroidx/appcompat/app/ActionBar$LayoutParams;", "layoutParams", "(Landroid/view/View;Landroidx/appcompat/app/ActionBar$LayoutParams;)V", "hideBack", "showBack", "colorRes", "setTitleBackground", "Companion", "ui_release"}, k = 1, mv = {2, 0, 0})
public interface IActionBar {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String KEY_CANCEL_BTN_CONTETN_DESC = "cancel_btn_cd";

    @NotNull
    public static final String KEY_CANCEL_BTN_DRAWABLE_RES_ID = "cancel_btn_res_id";

    @NotNull
    public static final String KEY_SAVE_BTN_DRAWABLE_RES_ID = "save_btn_res_id";

    @NotNull
    public static final String KEY_SAVE_CONTETN_DESC = "save_btn_cd";

    @NotNull
    public static final String KEY_SUB_TITLE = "key_sub_title";

    @NotNull
    public static final String KEY_TITLE = "key_title";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/baseui/view/IActionBar$Companion;", "", "<init>", "()V", "KEY_TITLE", "", "KEY_SUB_TITLE", "KEY_CANCEL_BTN_CONTETN_DESC", "KEY_SAVE_CONTETN_DESC", "KEY_CANCEL_BTN_DRAWABLE_RES_ID", "KEY_SAVE_BTN_DRAWABLE_RES_ID", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String KEY_CANCEL_BTN_CONTETN_DESC = "cancel_btn_cd";

        @NotNull
        public static final String KEY_CANCEL_BTN_DRAWABLE_RES_ID = "cancel_btn_res_id";

        @NotNull
        public static final String KEY_SAVE_BTN_DRAWABLE_RES_ID = "save_btn_res_id";

        @NotNull
        public static final String KEY_SAVE_CONTETN_DESC = "save_btn_cd";

        @NotNull
        public static final String KEY_SUB_TITLE = "key_sub_title";

        @NotNull
        public static final String KEY_TITLE = "key_title";

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void applyEditModeActionBar(@NotNull IActionBar iActionBar, int i, int i2, @Nullable Function1<? super View, Unit> function1, @Nullable Function1<? super View, Unit> function2) {
            Bundle bundle = new Bundle();
            bundle.putInt("key_title", i);
            bundle.putInt("key_sub_title", i2);
            applyEditModeActionBar$default(iActionBar, bundle, function1, function2, null, null, 24, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void applyEditModeActionBar$default(IActionBar iActionBar, int i, int i2, Function1 function1, Function1 function2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyEditModeActionBar");
            }
            if ((i3 & 2) != 0) {
                i2 = 0;
            }
            if ((i3 & 4) != 0) {
                function1 = null;
            }
            if ((i3 & 8) != 0) {
                function2 = null;
            }
            iActionBar.applyEditModeActionBar(i, i2, function1, function2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void applyEditModeActionBar$lambda$3$lambda$2(Function1 it, View v) {
            Intrinsics.checkNotNullParameter(it, "$it");
            Intrinsics.checkNotNullParameter(v, "v");
            it.invoke(v);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void applyEditModeActionBar$lambda$5$lambda$4(Function1 it, View v) {
            Intrinsics.checkNotNullParameter(it, "$it");
            Intrinsics.checkNotNullParameter(v, "v");
            it.invoke(v);
        }

        public static void displayOptions(@NotNull IActionBar iActionBar, int i) {
            wc0 miuiActionBar = iActionBar.getMiuiActionBar();
            if (miuiActionBar != null) {
                miuiActionBar.setDisplayOptions(i);
            }
        }

        @Nullable
        public static View getActionModeButton(@NotNull IActionBar iActionBar, @Nullable Window window, int i) {
            View decorView;
            if (window == null || (decorView = window.getDecorView()) == null) {
                return null;
            }
            return decorView.findViewById(i);
        }

        public static void hideBack(@NotNull IActionBar iActionBar) {
            wc0 miuiActionBar = iActionBar.getMiuiActionBar();
            if (miuiActionBar != null) {
                miuiActionBar.setDisplayHomeAsUpEnabled(false);
                miuiActionBar.setDisplayShowHomeEnabled(false);
            }
        }

        public static boolean isActionBarBigTitleMode(@NotNull IActionBar iActionBar) {
            wc0 miuiActionBar = iActionBar.getMiuiActionBar();
            return miuiActionBar != null && miuiActionBar.isShowing() && miuiActionBar.getExpandState() == 1;
        }

        public static void setActionBarDisplayable(@NotNull IActionBar iActionBar, boolean z) {
            if (z) {
                wc0 miuiActionBar = iActionBar.getMiuiActionBar();
                if (miuiActionBar != null) {
                    miuiActionBar.show();
                    return;
                }
                return;
            }
            wc0 miuiActionBar2 = iActionBar.getMiuiActionBar();
            if (miuiActionBar2 != null) {
                miuiActionBar2.hide();
            }
        }

        public static void setActionBarExpandState(@NotNull IActionBar iActionBar, int i) {
            wc0 miuiActionBar = iActionBar.getMiuiActionBar();
            if (miuiActionBar != null) {
                miuiActionBar.setExpandState(i);
            }
        }

        public static void setActionBarNormalTitleMode(@NotNull IActionBar iActionBar) {
            wc0 miuiActionBar = iActionBar.getMiuiActionBar();
            if (miuiActionBar != null) {
                if (!miuiActionBar.isShowing()) {
                    miuiActionBar.show();
                }
                iActionBar.setActionBarExpandState(0);
                iActionBar.setActionBarResizeable(false);
            }
        }

        public static void setActionBarResizeable(@NotNull IActionBar iActionBar, boolean z) {
            wc0 miuiActionBar = iActionBar.getMiuiActionBar();
            if (miuiActionBar != null) {
                miuiActionBar.setResizable(z);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void setActionModeButton(@NotNull IActionBar iActionBar, @NotNull Activity activity, @Nullable ActionMode actionMode, int i, int i2, @Nullable String str, int i3) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (actionMode != 0) {
                if (i == 16908313 || i == 16908314) {
                    ((w08) actionMode).b(i, str, i2);
                    View actionModeButton = iActionBar.getActionModeButton(activity.getWindow(), i);
                    if (actionModeButton != null) {
                        try {
                            actionModeButton.setContentDescription(activity.getString(i3));
                        } catch (Exception unused) {
                            actionModeButton.setContentDescription(str);
                        }
                    }
                }
            }
        }

        public static void setCustomView(@NotNull IActionBar iActionBar, int i) {
            iActionBar.displayOptions(16);
            wc0 miuiActionBar = iActionBar.getMiuiActionBar();
            if (miuiActionBar != null) {
                miuiActionBar.setCustomView(i);
            }
        }

        @Nullable
        public static View setEndTextView(@NotNull IActionBar iActionBar, int i, int i2, @Nullable String str, float f, @NotNull View.OnClickListener clickListener) {
            Intrinsics.checkNotNullParameter(clickListener, "clickListener");
            wc0 miuiActionBar = iActionBar.getMiuiActionBar();
            if (miuiActionBar == null) {
                return null;
            }
            TextView textView = new TextView(miuiActionBar.getThemedContext());
            textView.setId(i);
            textView.setContentDescription(str);
            textView.setOnClickListener(clickListener);
            textView.setText(i2);
            textView.setTextSize(f);
            miuiActionBar.setEndView(textView);
            return textView;
        }

        public static /* synthetic */ View setEndTextView$default(IActionBar iActionBar, int i, int i2, String str, float f, View.OnClickListener onClickListener, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setEndTextView");
            }
            if ((i3 & 1) != 0) {
                i = -1;
            }
            int i4 = i;
            if ((i3 & 4) != 0) {
                str = null;
            }
            return iActionBar.setEndTextView(i4, i2, str, f, onClickListener);
        }

        @Nullable
        public static View setEndView(@NotNull IActionBar iActionBar, int i, int i2, @Nullable String str, @NotNull View.OnClickListener clickListener) {
            Intrinsics.checkNotNullParameter(clickListener, "clickListener");
            wc0 miuiActionBar = iActionBar.getMiuiActionBar();
            if (miuiActionBar == null) {
                return null;
            }
            TextView textView = new TextView(miuiActionBar.getThemedContext());
            textView.setId(i);
            textView.setBackgroundResource(i2);
            textView.setContentDescription(str);
            textView.setOnClickListener(clickListener);
            miuiActionBar.setEndView(textView);
            return textView;
        }

        public static /* synthetic */ View setEndView$default(IActionBar iActionBar, int i, int i2, String str, View.OnClickListener onClickListener, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setEndView");
            }
            if ((i3 & 1) != 0) {
                i = -1;
            }
            if ((i3 & 4) != 0) {
                str = null;
            }
            return iActionBar.setEndView(i, i2, str, onClickListener);
        }

        @Nullable
        public static View setStartView(@NotNull IActionBar iActionBar, int i, int i2, @Nullable String str, @NotNull View.OnClickListener clickListener) {
            Intrinsics.checkNotNullParameter(clickListener, "clickListener");
            wc0 miuiActionBar = iActionBar.getMiuiActionBar();
            if (miuiActionBar == null) {
                return null;
            }
            TextView textView = new TextView(miuiActionBar.getThemedContext());
            textView.setId(i);
            textView.setBackgroundResource(i2);
            textView.setContentDescription(str);
            textView.setOnClickListener(clickListener);
            miuiActionBar.setStartView(textView);
            return textView;
        }

        public static /* synthetic */ View setStartView$default(IActionBar iActionBar, int i, int i2, String str, View.OnClickListener onClickListener, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setStartView");
            }
            if ((i3 & 1) != 0) {
                i = -1;
            }
            if ((i3 & 4) != 0) {
                str = null;
            }
            return iActionBar.setStartView(i, i2, str, onClickListener);
        }

        public static void setStartViewRes(@NotNull IActionBar iActionBar, int i, @Nullable String str) {
            View startView;
            wc0 miuiActionBar = iActionBar.getMiuiActionBar();
            if (miuiActionBar == null || (startView = miuiActionBar.getStartView()) == null) {
                return;
            }
            startView.setBackgroundResource(i);
            startView.setContentDescription(str);
        }

        public static /* synthetic */ void setStartViewRes$default(IActionBar iActionBar, int i, String str, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setStartViewRes");
            }
            if ((i2 & 2) != 0) {
                str = null;
            }
            iActionBar.setStartViewRes(i, str);
        }

        public static void setSubtitle(@NotNull IActionBar iActionBar, int i) {
            wc0 miuiActionBar = iActionBar.getMiuiActionBar();
            if (miuiActionBar != null) {
                miuiActionBar.setSubtitle(i);
            }
        }

        public static void setTitle(@NotNull IActionBar iActionBar, int i) {
            wc0 miuiActionBar = iActionBar.getMiuiActionBar();
            if (miuiActionBar != null) {
                miuiActionBar.setTitle(i);
            }
        }

        public static void setTitleBackground(@NotNull IActionBar iActionBar, int i) {
            wc0 miuiActionBar = iActionBar.getMiuiActionBar();
            if (miuiActionBar != null) {
                miuiActionBar.setBackgroundDrawable(new ColorDrawable(ExtUtilsKt.getColor(i)));
            }
        }

        public static void showBack(@NotNull IActionBar iActionBar) {
            wc0 miuiActionBar = iActionBar.getMiuiActionBar();
            if (miuiActionBar != null) {
                miuiActionBar.setDisplayHomeAsUpEnabled(true);
                miuiActionBar.setDisplayShowHomeEnabled(true);
            }
        }

        public static void startActionMode(@NotNull IActionBar iActionBar, @NotNull Activity activity, @NotNull ActionMode.Callback callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (activity instanceof AppCompatActivity) {
                ((AppCompatActivity) activity).startActionMode(callback);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void applyEditModeActionBar$default(IActionBar iActionBar, Bundle bundle, Function1 function1, Function1 function2, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyEditModeActionBar");
            }
            iActionBar.applyEditModeActionBar(bundle, (i & 2) != 0 ? null : function1, (i & 4) != 0 ? null : function2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2);
        }

        public static void setSubtitle(@NotNull IActionBar iActionBar, @Nullable String str) {
            wc0 miuiActionBar = iActionBar.getMiuiActionBar();
            if (miuiActionBar != null) {
                miuiActionBar.setSubtitle(str);
            }
        }

        public static void setTitle(@NotNull IActionBar iActionBar, @Nullable String str) {
            wc0 miuiActionBar = iActionBar.getMiuiActionBar();
            if (miuiActionBar != null) {
                miuiActionBar.setTitle(str);
            }
        }

        public static void setCustomView(@NotNull IActionBar iActionBar, @NotNull View customView) {
            Intrinsics.checkNotNullParameter(customView, "customView");
            iActionBar.displayOptions(16);
            wc0 miuiActionBar = iActionBar.getMiuiActionBar();
            if (miuiActionBar != null) {
                miuiActionBar.setCustomView(customView);
            }
        }

        public static void applyEditModeActionBar(@NotNull IActionBar iActionBar, @NotNull Bundle args, @Nullable final Function1<? super View, Unit> function1, @Nullable final Function1<? super View, Unit> function2, @Nullable String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(args, "args");
            wc0 miuiActionBar = iActionBar.getMiuiActionBar();
            if (miuiActionBar == null) {
                return;
            }
            Context themedContext = miuiActionBar.getThemedContext();
            miuiActionBar.setDisplayOptions(8);
            Button button = new Button(themedContext);
            Button button2 = new Button(themedContext);
            button.setId(gsi.t0);
            button2.setId(gsi.s0);
            int i = args.getInt("key_title", 0);
            int i2 = args.getInt("key_sub_title", 0);
            int i3 = args.getInt("cancel_btn_res_id", 0);
            int i4 = args.getInt("save_btn_res_id", 0);
            int i5 = args.getInt("cancel_btn_cd", 0);
            int i6 = args.getInt("save_btn_cd", 0);
            if (i3 != 0) {
                button.setBackgroundResource(i3);
            }
            if (i4 != 0) {
                button2.setBackgroundResource(i4);
            }
            Resources resources = themedContext.getResources();
            if (str == null) {
                if (i5 == 0) {
                    i3 = n1j.G;
                }
                str = resources.getString(i3);
                Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
            }
            if (str2 == null) {
                if (i6 == 0) {
                    i6 = n1j.Q;
                }
                str2 = resources.getString(i6);
                Intrinsics.checkNotNullExpressionValue(str2, "getString(...)");
            }
            button.setContentDescription(str);
            button2.setContentDescription(str2);
            if (i != 0) {
                miuiActionBar.setTitle(i);
            }
            if (i2 != 0) {
                miuiActionBar.setSubtitle(i2);
            }
            miuiActionBar.setStartView(button);
            miuiActionBar.setEndView(button2);
            if (function1 != null) {
                button.setOnClickListener(new View.OnClickListener() { // from class: uoc
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        IActionBar.DefaultImpls.applyEditModeActionBar$lambda$3$lambda$2(function1, view);
                    }
                });
            }
            if (function2 != null) {
                button2.setOnClickListener(new View.OnClickListener() { // from class: voc
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        IActionBar.DefaultImpls.applyEditModeActionBar$lambda$5$lambda$4(function2, view);
                    }
                });
            }
        }

        public static void setCustomView(@NotNull IActionBar iActionBar, @NotNull View customView, @NotNull ActionBar.LayoutParams layoutParams) {
            Intrinsics.checkNotNullParameter(customView, "customView");
            Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
            iActionBar.displayOptions(16);
            wc0 miuiActionBar = iActionBar.getMiuiActionBar();
            if (miuiActionBar != null) {
                miuiActionBar.setCustomView(customView, layoutParams);
            }
        }

        public static void setEndView(@NotNull IActionBar iActionBar, @NotNull View customView) {
            Intrinsics.checkNotNullParameter(customView, "customView");
            wc0 miuiActionBar = iActionBar.getMiuiActionBar();
            if (miuiActionBar != null) {
                miuiActionBar.setEndView(customView);
            }
        }

        public static void setStartView(@NotNull IActionBar iActionBar, @Nullable View view) {
            wc0 miuiActionBar = iActionBar.getMiuiActionBar();
            if (miuiActionBar != null) {
                miuiActionBar.setStartView(view);
            }
        }
    }

    void applyEditModeActionBar(int titleResId, int subTitleResId, @Nullable Function1<? super View, Unit> startClick, @Nullable Function1<? super View, Unit> endClick);

    void applyEditModeActionBar(@NotNull Bundle args, @Nullable Function1<? super View, Unit> startClick, @Nullable Function1<? super View, Unit> endClick, @Nullable String cancelBtnContentDescOut, @Nullable String saveBtnContentDescOut);

    void displayOptions(int option);

    @Nullable
    View getActionModeButton(@Nullable Window window, int btnResId);

    @Nullable
    wc0 getMiuiActionBar();

    void hideBack();

    boolean isActionBarBigTitleMode();

    void setActionBarDisplayable(boolean display);

    void setActionBarExpandState(int extendState);

    void setActionBarNormalTitleMode();

    void setActionBarResizeable(boolean resizeable);

    void setActionModeButton(@NotNull Activity activity, @Nullable ActionMode mode, int btnResId, int drawableId, @Nullable String text, int contentDescStrId);

    void setCustomView(int layoutId);

    void setCustomView(@NotNull View customView);

    void setCustomView(@NotNull View customView, @NotNull ActionBar.LayoutParams layoutParams);

    @Nullable
    View setEndTextView(int viewId, int text, @Nullable String contentDesc, float textsize, @NotNull View.OnClickListener clickListener);

    @Nullable
    View setEndView(int viewId, int drawableId, @Nullable String contentDesc, @NotNull View.OnClickListener clickListener);

    void setEndView(@NotNull View customView);

    @Nullable
    View setStartView(int viewId, int drawableId, @Nullable String contentDesc, @NotNull View.OnClickListener clickListener);

    void setStartView(@Nullable View customView);

    void setStartViewRes(int drawableId, @Nullable String contentDesc);

    void setSubtitle(int subTitleResId);

    void setSubtitle(@Nullable String subTitle);

    void setTitle(int titleResId);

    void setTitle(@Nullable String title);

    void setTitleBackground(int colorRes);

    void showBack();

    void startActionMode(@NotNull Activity activity, @NotNull ActionMode.Callback callback);
}
