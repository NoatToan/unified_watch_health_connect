package com.huami.moving.ui.view.dialog;

import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.moving.R;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.moving.ui.view.dialog.SportVideoAfterSaveShareDialog;
import com.huami.tools.analytics.DbUtils;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u001c\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0002J&\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0018\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\u0018\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007¨\u0006 "}, d2 = {"Lcom/huami/moving/ui/view/dialog/SportVideoAfterSaveShareDialog;", "Landroidx/appcompat/app/AppCompatDialogFragment;", "", "initView", "e", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "packageName", "", "f", "pkg", "cls", hl.k, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onActivityCreated", "Landroidx/fragment/app/FragmentManager;", "manager", "tag", "showAllowingStateLoss", "<init>", "()V", "Companion", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class SportVideoAfterSaveShareDialog extends AppCompatDialogFragment {

    @NotNull
    private static final String a = "com.tencent.mm";

    @NotNull
    private static final String b = "com.sina.weibo";

    @NotNull
    private static final String c = "com.sina.weibog3";

    @NotNull
    private static final String d = "com.tencent.mobileqq";

    @NotNull
    private static final String e = "com.tencent.mm.ui.LauncherUI";

    @NotNull
    private static final String f = "com.sina.weibo.SplashActivity";

    @NotNull
    private static final String g = "com.tencent.mobileqq.activity.SplashActivity";

    private final void e() {
        Dialog dialog = getDialog();
        Window window = dialog == null ? null : dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (Build.VERSION.SDK_INT >= 19) {
                attributes.flags |= 67108864;
            }
            window.setAttributes(attributes);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null) {
            return;
        }
        dialog2.setCanceledOnTouchOutside(false);
    }

    private final boolean f(Context context, String packageName) {
        if (packageName == null) {
            return false;
        }
        if (packageName.length() == 0) {
            return false;
        }
        PackageInfo packageInfo = null;
        if (context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageInfo = packageManager.getPackageInfo(packageName, 0);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return packageInfo != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(SportVideoAfterSaveShareDialog sportVideoAfterSaveShareDialog, View view) {
        sportVideoAfterSaveShareDialog.k("com.tencent.mm", e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(SportVideoAfterSaveShareDialog sportVideoAfterSaveShareDialog, View view) {
        sportVideoAfterSaveShareDialog.k("com.sina.weibo", f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(SportVideoAfterSaveShareDialog sportVideoAfterSaveShareDialog, View view) {
        sportVideoAfterSaveShareDialog.k("com.tencent.mobileqq", g);
    }

    private final void initView() {
        View view = getView();
        View viewFindViewById = view == null ? null : view.findViewById(R.id.tv_share_wechat);
        if (!(!f(getContext(), "com.tencent.mm"))) {
            viewFindViewById = null;
        }
        ImageView imageView = (ImageView) viewFindViewById;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.running_track_video_wechat_grey);
            imageView.setEnabled(false);
        }
        View view2 = getView();
        View viewFindViewById2 = view2 == null ? null : view2.findViewById(R.id.tv_share_weibo);
        if (!(!f(getContext(), "com.sina.weibo"))) {
            viewFindViewById2 = null;
        }
        ImageView imageView2 = (ImageView) viewFindViewById2;
        if (imageView2 != null) {
            imageView2.setImageResource(R.drawable.running_track_video_weibo_grey);
            imageView2.setEnabled(false);
        }
        View view3 = getView();
        View viewFindViewById3 = view3 == null ? null : view3.findViewById(R.id.tv_share_qq);
        ImageView imageView3 = (ImageView) (f(getContext(), "com.tencent.mobileqq") ^ true ? viewFindViewById3 : null);
        if (imageView3 == null) {
            return;
        }
        imageView3.setImageResource(R.drawable.running_track_video_qq_grey);
        imageView3.setEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(SportVideoAfterSaveShareDialog sportVideoAfterSaveShareDialog, View view) {
        sportVideoAfterSaveShareDialog.dismiss();
    }

    private final void k(String pkg, String cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iHashCode = cls.hashCode();
        if (iHashCode != 430486676) {
            if (iHashCode != 435777311) {
                if (iHashCode == 1617560950 && cls.equals(e)) {
                    linkedHashMap.put("tp", "wechat");
                }
            } else if (cls.equals(g)) {
                linkedHashMap.put("tp", "qq");
            }
        } else if (cls.equals(f)) {
            linkedHashMap.put("tp", "wechat");
        }
        linkedHashMap.put("pos", SportAnalytics.ParamValue.TrackVideo.SAVE_SUCCESS);
        Analytics.recordEvent(new CountEventBuilder(SportAnalytics.SHARE_ROUTE_VIDEO_TO_THIRD_PLATFORM_C).putExtras(linkedHashMap).setAnonymous(false));
        ComponentName componentName = new ComponentName(pkg, cls);
        Intent intent = new Intent();
        intent.setComponent(componentName);
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.addFlags(268435456);
        startActivity(intent);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        View view = getView();
        ((ImageView) (view == null ? null : view.findViewById(R.id.tv_share_wechat))).setOnClickListener(new View.OnClickListener() { // from class: fe7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SportVideoAfterSaveShareDialog.g(this.a, view2);
            }
        });
        View view2 = getView();
        ((ImageView) (view2 == null ? null : view2.findViewById(R.id.tv_share_weibo))).setOnClickListener(new View.OnClickListener() { // from class: ge7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                SportVideoAfterSaveShareDialog.h(this.a, view3);
            }
        });
        View view3 = getView();
        ((ImageView) (view3 == null ? null : view3.findViewById(R.id.tv_share_qq))).setOnClickListener(new View.OnClickListener() { // from class: de7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                SportVideoAfterSaveShareDialog.i(this.a, view4);
            }
        });
        View view4 = getView();
        ((ImageView) (view4 != null ? view4.findViewById(R.id.iv_video_share_close) : null)).setOnClickListener(new View.OnClickListener() { // from class: ee7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                SportVideoAfterSaveShareDialog.j(this.a, view5);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog_sport_after_save_share, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        e();
        initView();
    }

    public final void showAllowingStateLoss(@NotNull FragmentManager manager, @Nullable String tag) {
        try {
            Field declaredField = DialogFragment.class.getDeclaredField("mDismissed");
            declaredField.setAccessible(true);
            declaredField.setBoolean(this, false);
            Field declaredField2 = DialogFragment.class.getDeclaredField("mShownByMe");
            declaredField2.setAccessible(true);
            declaredField2.setBoolean(this, true);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (isAdded() || manager.findFragmentByTag(tag) != null) {
            return;
        }
        FragmentTransaction fragmentTransactionBeginTransaction = manager.beginTransaction();
        fragmentTransactionBeginTransaction.add(this, tag);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }
}
