package com.xiaomi.fitness.devicesettings.bluttooth.widget;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.ViewModelCreator;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetSelectDialog;
import com.xiaomi.fitness.devicesettings.utils.ImageLoadUtil;
import com.xiaomi.fitness.devicesettings.utils.UtilsKt;
import com.xiaomi.fitness.devicesettings.utils.WatchType;
import defpackage.cji;
import defpackage.eih;
import defpackage.en6;
import defpackage.eui;
import defpackage.gn6;
import defpackage.ikr;
import defpackage.jni;
import defpackage.l2j;
import defpackage.qyi;
import defpackage.sk5;
import defpackage.wzi;
import defpackage.zqi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 =2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002>=B\u0007¢\u0006\u0004\b<\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0019\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u0006R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001b\u00107\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0016\u0010;\u001a\u0004\u0018\u0001088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006?"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetSelectDialog;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Lcom/xiaomi/fitness/baseui/view/ViewModelCreator;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetManagerV2ViewModel;", "", "initData", "()V", "initView", "initViewPager", "", "widgetId", "checkBtnWidgetConfirm", "(I)V", "position", "selectDots", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", LifecycleConstantKt.ON_START, "Landroidx/viewpager/widget/ViewPager;", "mViewPager", "Landroidx/viewpager/widget/ViewPager;", "mLLDots", "Landroid/view/ViewGroup;", "", "Landroid/widget/ImageView;", "dotViews", "Ljava/util/List;", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "Lgn6;", "mBinding", "Lgn6;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetV3NativeBuiltinGroup;", "mNativeBuiltinGroup", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetV3NativeBuiltinGroup;", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/NativeBuiltinWrapper;", "mAlreadyHaveWidget", "Ljava/util/ArrayList;", "currentPageIndex", "I", "mViewModel$delegate", "Lkotlin/Lazy;", "getMViewModel", "()Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetManagerV2ViewModel;", "mViewModel", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "viewModelFactory", "<init>", "Companion", "WidgetViewPagerAdapter", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nWidgetSelectDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WidgetSelectDialog.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetSelectDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,336:1\n774#2:337\n865#2,2:338\n1755#2,3:341\n1#3:340\n*S KotlinDebug\n*F\n+ 1 WidgetSelectDialog.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetSelectDialog\n*L\n112#1:337\n112#1:338,2\n222#1:341,3\n*E\n"})
public final class WidgetSelectDialog extends BottomSheetDialogFragment implements ViewModelCreator<WidgetManagerV2ViewModel> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "WidgetSelectDialog";

    @NotNull
    private static final String WIDGET_GROUP_TAG = "widget_group_tag";
    private int currentPageIndex;
    private gn6 mBinding;
    private Context mContext;
    private ViewGroup mLLDots;
    private WidgetV3NativeBuiltinGroup mNativeBuiltinGroup;
    private ViewPager mViewPager;

    @NotNull
    private List<? extends ImageView> dotViews = new ArrayList();

    @NotNull
    private ArrayList<NativeBuiltinWrapper> mAlreadyHaveWidget = new ArrayList<>();

    /* JADX INFO: renamed from: mViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: qjr
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WidgetSelectDialog.mViewModel_delegate$lambda$0(this.f31579a);
        }
    });

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetSelectDialog$Companion;", "", "<init>", "()V", "TAG", "", "WIDGET_GROUP_TAG", "startDialog", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void startDialog(@NotNull FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            new WidgetSelectDialog().show(fragmentManager, WidgetSelectDialog.WIDGET_GROUP_TAG);
        }
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020)¢\u0006\u0004\b+\u0010,J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010$R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetSelectDialog$WidgetViewPagerAdapter;", "Leih;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/NativeBuiltinWrapper;", "nb", "Landroid/view/View;", "createPageLayout", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/NativeBuiltinWrapper;)Landroid/view/View;", "", "initWatchSize", "()V", "", "getCount", "()I", "view", "", "view2", "", "isViewFromObject", "(Landroid/view/View;Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "position", "instantiateItem", "(Landroid/view/ViewGroup;I)Ljava/lang/Object;", "object", "destroyItem", "(Landroid/view/ViewGroup;ILjava/lang/Object;)V", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/util/ArrayList;", "mViewList", "Ljava/util/ArrayList;", "mWatchWidth", "I", "mWatchHeight", "", "mWatchRadius", "F", "", "nativeBuiltinList", "<init>", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/widget/WidgetSelectDialog;Landroid/content/Context;Ljava/util/List;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class WidgetViewPagerAdapter extends eih {

        @NotNull
        private final Context context;

        @NotNull
        private ArrayList<View> mViewList;
        private int mWatchHeight;
        private float mWatchRadius;
        private int mWatchWidth;
        final /* synthetic */ WidgetSelectDialog this$0;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[WatchType.values().length];
                try {
                    iArr[WatchType.TYPE_SQUARE_WATCH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[WatchType.TYPE_ROUND_WATCH.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[WatchType.TYPE_SQUARE_BAND.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[WatchType.TYPE_ROUND_BAND.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public WidgetViewPagerAdapter(@NotNull WidgetSelectDialog widgetSelectDialog, @NotNull Context context, List<NativeBuiltinWrapper> nativeBuiltinList) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(nativeBuiltinList, "nativeBuiltinList");
            this.this$0 = widgetSelectDialog;
            this.context = context;
            this.mViewList = new ArrayList<>();
            UIUtils uIUtils = UIUtils.INSTANCE;
            this.mWatchWidth = uIUtils.dip2px(context, 127.0f);
            this.mWatchHeight = uIUtils.dip2px(context, 88.0f);
            this.mWatchRadius = uIUtils.dip2px(context, 14.67f);
            initWatchSize();
            if (nativeBuiltinList.size() == 1) {
                this.mViewList.add(createPageLayout(nativeBuiltinList.get(0)));
                return;
            }
            this.mViewList.add(createPageLayout(nativeBuiltinList.get(nativeBuiltinList.size() - 1)));
            Iterator<NativeBuiltinWrapper> it = nativeBuiltinList.iterator();
            while (it.hasNext()) {
                this.mViewList.add(createPageLayout(it.next()));
            }
            this.mViewList.add(createPageLayout(nativeBuiltinList.get(0)));
        }

        private final View createPageLayout(NativeBuiltinWrapper nb) {
            Context context = null;
            ViewDataBinding viewDataBindingJ = sk5.j(LayoutInflater.from(this.context), eui.g2, null, false);
            Intrinsics.checkNotNullExpressionValue(viewDataBindingJ, "inflate(...)");
            final en6 en6Var = (en6) viewDataBindingJ;
            en6Var.B.getLayoutParams().width = this.mWatchWidth;
            en6Var.B.getLayoutParams().height = this.mWatchHeight;
            en6Var.A.setRadius(this.mWatchRadius);
            en6Var.A.setCardElevation(0.0f);
            Logger.i(WidgetSelectDialog.TAG, "网络获取小部件图片：{id = " + nb.getId() + ", appId = " + nb.getAppId() + ", type = " + nb.getType() + ", name = " + nb.getName() + "}");
            Context context2 = this.this$0.mContext;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            } else {
                context = context2;
            }
            ikr.e(context, nb.getId(), new ImageLoadUtil.Callback() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetSelectDialog$WidgetViewPagerAdapter$createPageLayout$1
                @Override // com.xiaomi.fitness.devicesettings.utils.ImageLoadUtil.Callback
                public void onFailure(Drawable errorDrawable) {
                    en6Var.B.setBackgroundColor(ExtUtilsKt.getColor(cji.c));
                }

                @Override // com.xiaomi.fitness.devicesettings.utils.ImageLoadUtil.Callback
                public void onReady(Bitmap resource) {
                    Intrinsics.checkNotNullParameter(resource, "resource");
                    en6Var.B.setImageBitmap(resource);
                }
            });
            View root = en6Var.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            return root;
        }

        private final void initWatchSize() {
            int i = WhenMappings.$EnumSwitchMapping$0[UtilsKt.getWatchShape().ordinal()];
            if (i == 1) {
                UIUtils uIUtils = UIUtils.INSTANCE;
                this.mWatchWidth = uIUtils.dip2px(this.context, 208.0f);
                this.mWatchHeight = uIUtils.dip2px(this.context, 100.0f);
                this.mWatchRadius = uIUtils.dip2px(this.context, 18.0f);
                return;
            }
            if (i == 2) {
                UIUtils uIUtils2 = UIUtils.INSTANCE;
                this.mWatchWidth = uIUtils2.dip2px(this.context, 207.0f);
                this.mWatchHeight = uIUtils2.dip2px(this.context, 144.0f);
                this.mWatchRadius = uIUtils2.dip2px(this.context, 24.0f);
                return;
            }
            if (i == 3) {
                UIUtils uIUtils3 = UIUtils.INSTANCE;
                this.mWatchWidth = uIUtils3.dip2px(this.context, 196.0f);
                this.mWatchHeight = uIUtils3.dip2px(this.context, 126.0f);
                this.mWatchRadius = uIUtils3.dip2px(this.context, 21.6f);
                return;
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            UIUtils uIUtils4 = UIUtils.INSTANCE;
            this.mWatchWidth = uIUtils4.dip2px(this.context, 98.0f);
            this.mWatchHeight = uIUtils4.dip2px(this.context, 240.0f);
            this.mWatchRadius = uIUtils4.dip2px(this.context, 92.31f);
        }

        @Override // defpackage.eih
        public void destroyItem(@NotNull ViewGroup container, int position, @NotNull Object object) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(object, "object");
            container.removeView(this.mViewList.get(position));
        }

        @NotNull
        public final Context getContext() {
            return this.context;
        }

        @Override // defpackage.eih
        public int getCount() {
            return this.mViewList.size();
        }

        @Override // defpackage.eih
        @NotNull
        public Object instantiateItem(@NotNull ViewGroup container, int position) {
            Intrinsics.checkNotNullParameter(container, "container");
            container.addView(this.mViewList.get(position));
            View view = this.mViewList.get(position);
            Intrinsics.checkNotNullExpressionValue(view, "get(...)");
            return view;
        }

        @Override // defpackage.eih
        public boolean isViewFromObject(@NotNull View view, @NotNull Object view2) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(view2, "view2");
            return Intrinsics.areEqual(view, view2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkBtnWidgetConfirm(int widgetId) {
        ArrayList<NativeBuiltinWrapper> arrayList = this.mAlreadyHaveWidget;
        boolean z = false;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                if (((NativeBuiltinWrapper) it.next()).getId() == widgetId) {
                    z = true;
                    break;
                }
            }
        }
        gn6 gn6Var = this.mBinding;
        gn6 gn6Var2 = null;
        if (gn6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            gn6Var = null;
        }
        gn6Var.A.setEnabled(!z);
        gn6 gn6Var3 = this.mBinding;
        if (gn6Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            gn6Var2 = gn6Var3;
        }
        gn6Var2.A.setText(z ? wzi.U9 : wzi.T9);
    }

    private final WidgetManagerV2ViewModel getMViewModel() {
        return (WidgetManagerV2ViewModel) this.mViewModel.getValue();
    }

    private final void initData() {
        this.mNativeBuiltinGroup = getMViewModel().getSelectNativeBuiltinGroup();
        List<NativeBuiltinWrapper> value = getMViewModel().getWidgetList().getValue();
        if (value != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : value) {
                int appId = ((NativeBuiltinWrapper) obj).getAppId();
                WidgetV3NativeBuiltinGroup widgetV3NativeBuiltinGroup = this.mNativeBuiltinGroup;
                if (widgetV3NativeBuiltinGroup == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mNativeBuiltinGroup");
                    widgetV3NativeBuiltinGroup = null;
                }
                if (appId == widgetV3NativeBuiltinGroup.getId()) {
                    arrayList.add(obj);
                }
            }
            this.mAlreadyHaveWidget.addAll(arrayList);
        }
    }

    private final void initView() {
        gn6 gn6Var = this.mBinding;
        gn6 gn6Var2 = null;
        if (gn6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            gn6Var = null;
        }
        this.mViewPager = gn6Var.E;
        gn6 gn6Var3 = this.mBinding;
        if (gn6Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            gn6Var3 = null;
        }
        this.mLLDots = gn6Var3.B;
        initViewPager();
        gn6 gn6Var4 = this.mBinding;
        if (gn6Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            gn6Var4 = null;
        }
        gn6Var4.F.A.setOnClickListener(new View.OnClickListener() { // from class: ojr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WidgetSelectDialog.initView$lambda$4(this.f29232a, view);
            }
        });
        gn6 gn6Var5 = this.mBinding;
        if (gn6Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            gn6Var5 = null;
        }
        TextView textView = gn6Var5.F.C;
        WidgetV3NativeBuiltinGroup widgetV3NativeBuiltinGroup = this.mNativeBuiltinGroup;
        if (widgetV3NativeBuiltinGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNativeBuiltinGroup");
            widgetV3NativeBuiltinGroup = null;
        }
        textView.setText(widgetV3NativeBuiltinGroup.getName());
        gn6 gn6Var6 = this.mBinding;
        if (gn6Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            gn6Var2 = gn6Var6;
        }
        gn6Var2.A.setOnClickListener(new View.OnClickListener() { // from class: pjr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WidgetSelectDialog.initView$lambda$5(this.f30474a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$4(WidgetSelectDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$5(WidgetSelectDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WidgetV3NativeBuiltinGroup widgetV3NativeBuiltinGroup = this$0.mNativeBuiltinGroup;
        if (widgetV3NativeBuiltinGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNativeBuiltinGroup");
            widgetV3NativeBuiltinGroup = null;
        }
        if (!this$0.getMViewModel().addWidget(widgetV3NativeBuiltinGroup.getBuiltinWidgets().get(this$0.currentPageIndex))) {
            int maxWidgetNum = this$0.getMViewModel().getMaxWidgetNum();
            String quantityString = this$0.getResources().getQuantityString(qyi.A, maxWidgetNum, Integer.valueOf(maxWidgetNum));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            new CommonDialog.c("WidgetAddFalse").setDialogDescriptionString(new DialogParams.DialogDescriptionString(quantityString)).setPositiveText(wzi.R9).setCancelable(true).setCanceledOnTouchOutside(true).create().showIfNeed(this$0.getParentFragmentManager());
        }
        this$0.dismiss();
    }

    @SuppressLint({"RestrictedApi"})
    private final void initViewPager() {
        WidgetV3NativeBuiltinGroup widgetV3NativeBuiltinGroup = this.mNativeBuiltinGroup;
        if (widgetV3NativeBuiltinGroup == null) {
            return;
        }
        gn6 gn6Var = null;
        if (widgetV3NativeBuiltinGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNativeBuiltinGroup");
            widgetV3NativeBuiltinGroup = null;
        }
        final int size = widgetV3NativeBuiltinGroup.getBuiltinWidgets().size();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(10, 10);
        layoutParams.setMargins(6, 0, 0, 0);
        for (int i = 0; i < size; i++) {
            Context context = this.mContext;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
                context = null;
            }
            ImageView imageView = new ImageView(context);
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(jni.W);
            imageView.setSelected(false);
            ViewGroup viewGroup = this.mLLDots;
            if (viewGroup == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLLDots");
                viewGroup = null;
            }
            viewGroup.addView(imageView);
            ListExtKt.add(this.dotViews, imageView);
        }
        this.dotViews.get(0).setSelected(true);
        WidgetV3NativeBuiltinGroup widgetV3NativeBuiltinGroup2 = this.mNativeBuiltinGroup;
        if (widgetV3NativeBuiltinGroup2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNativeBuiltinGroup");
            widgetV3NativeBuiltinGroup2 = null;
        }
        checkBtnWidgetConfirm(widgetV3NativeBuiltinGroup2.getBuiltinWidgets().get(0).getId());
        ViewPager viewPager = this.mViewPager;
        if (viewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
            viewPager = null;
        }
        Context context2 = this.mContext;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context2 = null;
        }
        WidgetV3NativeBuiltinGroup widgetV3NativeBuiltinGroup3 = this.mNativeBuiltinGroup;
        if (widgetV3NativeBuiltinGroup3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNativeBuiltinGroup");
            widgetV3NativeBuiltinGroup3 = null;
        }
        viewPager.setAdapter(new WidgetViewPagerAdapter(this, context2, widgetV3NativeBuiltinGroup3.getBuiltinWidgets()));
        ViewPager viewPager2 = this.mViewPager;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
            viewPager2 = null;
        }
        viewPager2.addOnPageChangeListener(new ViewPager.i() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.widget.WidgetSelectDialog.initViewPager.1
            @Override // androidx.viewpager.widget.ViewPager.i
            public void onPageScrollStateChanged(int position) {
            }

            @Override // androidx.viewpager.widget.ViewPager.i
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                int i2 = size;
                if (i2 != 1 && positionOffset == 0.0f) {
                    ViewPager viewPager3 = null;
                    if (position == 0) {
                        ViewPager viewPager4 = this.mViewPager;
                        if (viewPager4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
                        } else {
                            viewPager3 = viewPager4;
                        }
                        viewPager3.L(size, false);
                        return;
                    }
                    if (position == i2 + 1) {
                        ViewPager viewPager5 = this.mViewPager;
                        if (viewPager5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
                        } else {
                            viewPager3 = viewPager5;
                        }
                        viewPager3.L(1, false);
                    }
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.i
            public void onPageSelected(int position) {
                if (size == 1) {
                    this.selectDots(0);
                    return;
                }
                int i2 = position - 1;
                this.selectDots(i2);
                if (1 > position || position > size) {
                    return;
                }
                WidgetV3NativeBuiltinGroup widgetV3NativeBuiltinGroup4 = this.mNativeBuiltinGroup;
                gn6 gn6Var2 = null;
                if (widgetV3NativeBuiltinGroup4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mNativeBuiltinGroup");
                    widgetV3NativeBuiltinGroup4 = null;
                }
                NativeBuiltinWrapper nativeBuiltinWrapper = widgetV3NativeBuiltinGroup4.getBuiltinWidgets().get(i2);
                gn6 gn6Var3 = this.mBinding;
                if (gn6Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                } else {
                    gn6Var2 = gn6Var3;
                }
                gn6Var2.D.setText(nativeBuiltinWrapper.getName());
                this.checkBtnWidgetConfirm(nativeBuiltinWrapper.getId());
            }
        });
        ViewPager viewPager3 = this.mViewPager;
        if (viewPager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
            viewPager3 = null;
        }
        viewPager3.setCurrentItem(size == 1 ? 0 : 1);
        if (size == 1) {
            WidgetV3NativeBuiltinGroup widgetV3NativeBuiltinGroup4 = this.mNativeBuiltinGroup;
            if (widgetV3NativeBuiltinGroup4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mNativeBuiltinGroup");
                widgetV3NativeBuiltinGroup4 = null;
            }
            NativeBuiltinWrapper nativeBuiltinWrapper = widgetV3NativeBuiltinGroup4.getBuiltinWidgets().get(0);
            gn6 gn6Var2 = this.mBinding;
            if (gn6Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                gn6Var = gn6Var2;
            }
            gn6Var.D.setText(nativeBuiltinWrapper.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WidgetManagerV2ViewModel mViewModel_delegate$lambda$0(WidgetSelectDialog this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (WidgetManagerV2ViewModel) this$0.initViewModel((ViewModelStoreOwner) this$0.requireActivity(), Reflection.getOrCreateKotlinClass(WidgetManagerV2ViewModel.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void selectDots(int position) {
        if (position < 0 || position >= this.dotViews.size()) {
            return;
        }
        int size = this.dotViews.size();
        int i = 0;
        while (i < size) {
            this.dotViews.get(i).setSelected(position == i);
            i++;
        }
        this.currentPageIndex = position;
    }

    @Override // com.xiaomi.fitness.baseui.view.ViewModelCreator
    @Nullable
    public ViewModelProvider.Factory getViewModelFactory() {
        return requireActivity().getDefaultViewModelProviderFactory();
    }

    @Override // com.xiaomi.fitness.baseui.view.ViewModelCreator
    public /* bridge */ /* synthetic */ AbsViewModel initViewModel(ViewModelStoreOwner viewModelStoreOwner, KClass kClass) {
        return initViewModel(viewModelStoreOwner, (KClass<WidgetManagerV2ViewModel>) kClass);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, l2j.f24570a);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.mContext = requireContext();
        this.mBinding = (gn6) sk5.j(inflater, eui.h2, container, false);
        initData();
        initView();
        gn6 gn6Var = this.mBinding;
        if (gn6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            gn6Var = null;
        }
        return gn6Var.getRoot();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        gn6 gn6Var = null;
        FrameLayout frameLayout = dialog != null ? (FrameLayout) dialog.findViewById(zqi.f1) : null;
        if (frameLayout != null) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            UIUtils uIUtils = UIUtils.INSTANCE;
            Context context = this.mContext;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
                context = null;
            }
            int screenHeight = uIUtils.getScreenHeight(context);
            Context context2 = this.mContext;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
                context2 = null;
            }
            layoutParams.height = screenHeight - uIUtils.dip2px(context2, 52.0f);
            gn6 gn6Var2 = this.mBinding;
            if (gn6Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            } else {
                gn6Var = gn6Var2;
            }
            gn6Var.C.getLayoutParams().height = frameLayout.getLayoutParams().height;
            BottomSheetBehavior bottomSheetBehaviorB = BottomSheetBehavior.B(frameLayout);
            Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorB, "from(...)");
            bottomSheetBehaviorB.W(3000);
            bottomSheetBehaviorB.setState(3);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.ViewModelCreator
    @NotNull
    public WidgetManagerV2ViewModel initViewModel(@Nullable ViewModelStoreOwner viewModelStoreOwner, @Nullable KClass<WidgetManagerV2ViewModel> kClass) {
        return (WidgetManagerV2ViewModel) ViewModelCreator.DefaultImpls.initViewModel(this, viewModelStoreOwner, kClass);
    }
}
