package com.xiaomi.fitness.health.sleep.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.health.connect.client.records.OvulationTestRecord;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.target.Target;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.common.extensions.PermissionBuilder;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import com.xiaomi.fitness.health.sleep.utils.SleepAnimalExtKt;
import com.xiaomi.fitness.health.sleep.view.SleepAnimalShadowLayout;
import com.xiaomi.fitness.health.sleep.view.SleepShareViewModel;
import com.xiaomi.fitness.widget.view.RoundImageView;
import defpackage.c0j;
import defpackage.cv1;
import defpackage.fo0;
import defpackage.jui;
import defpackage.pni;
import defpackage.s4m;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 ?2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001?B\u0007¢\u0006\u0004\b>\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J2\u0010\u000f\u001a\u00020\u00042!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00040\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0006J\u0019\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010#R\u0016\u0010%\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010#R\u0016\u0010&\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010#R\u0016\u0010'\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010#R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010-R\u0016\u0010/\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u0010-R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u0010*R\u0016\u00107\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u0010*R\u0016\u00108\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u0010-R\u0014\u0010;\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010=\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010:¨\u0006@"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/SleepAnimalShareActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/health/sleep/view/SleepShareViewModel;", "Lfo0;", "", "initView", "()V", "initDownloadView", "initShareView", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", OvulationTestRecord.Result.POSITIVE, "callback", "checkPermission", "(Lkotlin/jvm/functions/Function1;)V", Constants.KEY_REQUEST_DATA, "initBundle", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "animalType", "I", "", "startTime", "J", "endTime", "Ls4m;", "shareComponent", "Ls4m;", "Landroid/view/View;", "downloadView", "Landroid/view/View;", "shareWxView", "shareTimeLineView", "moreView", "cardShare", "Landroid/widget/ImageView;", "cardShareBg", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "tvTimeRange", "Landroid/widget/TextView;", "tvAnimalType", "tvAnimalDesc", "Lcom/xiaomi/fitness/widget/view/RoundImageView;", "ivAnimalImage", "Lcom/xiaomi/fitness/widget/view/RoundImageView;", "Lcom/xiaomi/fitness/health/sleep/view/SleepAnimalShadowLayout;", "shadowLayout", "Lcom/xiaomi/fitness/health/sleep/view/SleepAnimalShadowLayout;", "ivShareQrcode", "ivUserAvatar", "tvUserName", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepAnimalShareActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepAnimalShareActivity.kt\ncom/xiaomi/fitness/health/sleep/ui/SleepAnimalShareActivity\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n*L\n1#1,210:1\n54#2,3:211\n24#2:214\n59#2,6:215\n54#2,3:221\n24#2:224\n59#2,4:225\n63#2,2:238\n844#3,9:229\n*S KotlinDebug\n*F\n+ 1 SleepAnimalShareActivity.kt\ncom/xiaomi/fitness/health/sleep/ui/SleepAnimalShareActivity\n*L\n98#1:211,3\n98#1:214\n98#1:215,6\n187#1:221,3\n187#1:224\n187#1:225,4\n187#1:238,2\n189#1:229,9\n*E\n"})
public final class SleepAnimalShareActivity extends Hilt_SleepAnimalShareActivity<SleepShareViewModel, fo0> {

    @NotNull
    public static final String PARAM_ANIMAL_END_TIME = "end_time";

    @NotNull
    public static final String PARAM_ANIMAL_START_TIME = "start_time";

    @NotNull
    public static final String PARAM_ANIMAL_TYPE = "animal_type";

    @NotNull
    public static final String TAG = "SleepAnimalShare";
    private int animalType;
    private View cardShare;
    private ImageView cardShareBg;
    private View downloadView;
    private long endTime;
    private RoundImageView ivAnimalImage;
    private ImageView ivShareQrcode;
    private ImageView ivUserAvatar;
    private View moreView;
    private SleepAnimalShadowLayout shadowLayout;
    private s4m shareComponent;
    private View shareTimeLineView;
    private View shareWxView;
    private long startTime;
    private TextView tvAnimalDesc;
    private TextView tvAnimalType;
    private TextView tvTimeRange;
    private TextView tvUserName;

    private final void checkPermission(final Function1<? super Boolean, Unit> callback) {
        if (Build.VERSION.SDK_INT >= 29 || PermissionExtKt.isPermissionGranted(this, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            callback.invoke2(Boolean.TRUE);
        } else {
            PermissionExtKt.permission(this, "android.permission.WRITE_EXTERNAL_STORAGE", getString(c0j.pq), (Function1<? super PermissionBuilder, Unit>) new Function1() { // from class: wgm
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SleepAnimalShareActivity.checkPermission$lambda$11(callback, (PermissionBuilder) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkPermission$lambda$11(final Function1 callback, PermissionBuilder permission) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(permission, "$this$permission");
        permission.granted(new Function1() { // from class: fhm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepAnimalShareActivity.checkPermission$lambda$11$lambda$9(callback, (String) obj);
            }
        });
        permission.denied(new Function1() { // from class: ghm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepAnimalShareActivity.checkPermission$lambda$11$lambda$10(callback, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkPermission$lambda$11$lambda$10(Function1 callback, String it) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(it, "it");
        callback.invoke2(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkPermission$lambda$11$lambda$9(Function1 callback, String it) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(it, "it");
        callback.invoke2(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    private final void initBundle() {
        Intent intent = getIntent();
        this.animalType = intent != null ? intent.getIntExtra(PARAM_ANIMAL_TYPE, 0) : 0;
        Intent intent2 = getIntent();
        this.startTime = intent2 != null ? intent2.getLongExtra(PARAM_ANIMAL_START_TIME, 0L) : 0L;
        Intent intent3 = getIntent();
        this.endTime = intent3 != null ? intent3.getLongExtra(PARAM_ANIMAL_END_TIME, 0L) : 0L;
    }

    private final void initDownloadView() {
        ImageView imageView = this.cardShareBg;
        TextView textView = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardShareBg");
            imageView = null;
        }
        String sleepAnimalShareBgUrl = SleepAnimalExtKt.getSleepAnimalShareBgUrl(this.animalType);
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(sleepAnimalShareBgUrl).target(imageView);
        builderTarget.bitmapConfig(Bitmap.Config.ARGB_8888);
        builderTarget.placeholder(pni.b1);
        builderTarget.error(pni.b1);
        imageLoader.enqueue(builderTarget.build());
        TextView textView2 = this.tvAnimalType;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvAnimalType");
            textView2 = null;
        }
        textView2.setText(getString(SleepAnimalExtKt.getSleepAnimalStringRes(this.animalType)));
        TextView textView3 = this.tvAnimalDesc;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvAnimalDesc");
            textView3 = null;
        }
        textView3.setText(getString(SleepAnimalExtKt.getSleepAnimalIntroductionStringRes(this.animalType)));
        SleepAnimalShadowLayout sleepAnimalShadowLayout = this.shadowLayout;
        if (sleepAnimalShadowLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shadowLayout");
            sleepAnimalShadowLayout = null;
        }
        sleepAnimalShadowLayout.updateShadowColor(getColor(SleepAnimalExtKt.getSleepAnimalShadowColor(this.animalType)));
        RoundImageView roundImageView = this.ivAnimalImage;
        if (roundImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivAnimalImage");
            roundImageView = null;
        }
        roundImageView.setMInnerStrokeColor(getColor(SleepAnimalExtKt.getSleepAnimalStrokeColor(this.animalType)));
        RoundImageView roundImageView2 = this.ivAnimalImage;
        if (roundImageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivAnimalImage");
            roundImageView2 = null;
        }
        roundImageView2.setImageResource(SleepAnimalExtKt.getSleepAnimalDrawableRes(this.animalType));
        String string = getString(c0j.m);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        TextView textView4 = this.tvTimeRange;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvTimeRange");
        } else {
            textView = textView4;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        long j = 1000;
        String str = String.format("%s-%s", Arrays.copyOf(new Object[]{TimeUtils.formatDate(string, Long.valueOf(this.startTime * j)), TimeUtils.formatDate(string, Long.valueOf(this.endTime * j))}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        textView.setText(str);
    }

    private final void initShareView() {
        View view = this.downloadView;
        View view2 = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("downloadView");
            view = null;
        }
        final String str = "";
        view.setOnClickListener(new View.OnClickListener() { // from class: vgm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                SleepAnimalShareActivity.initShareView$lambda$2(this.f36883a, str, str, view3);
            }
        });
        boolean z = !AppUtil.INSTANCE.isPlayChannel();
        View view3 = this.shareWxView;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shareWxView");
            view3 = null;
        }
        ViewExtKt.setVisible(view3, z);
        View view4 = this.shareTimeLineView;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shareTimeLineView");
            view4 = null;
        }
        ViewExtKt.setVisible(view4, z);
        if (z) {
            View view5 = this.shareWxView;
            if (view5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shareWxView");
                view5 = null;
            }
            view5.setOnClickListener(new View.OnClickListener() { // from class: zgm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view6) {
                    SleepAnimalShareActivity.initShareView$lambda$4(this.f41259a, str, str, view6);
                }
            });
            View view6 = this.shareTimeLineView;
            if (view6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shareTimeLineView");
                view6 = null;
            }
            view6.setOnClickListener(new View.OnClickListener() { // from class: ahm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view7) {
                    SleepAnimalShareActivity.initShareView$lambda$6(this.f1033a, str, str, view7);
                }
            });
        }
        View view7 = this.moreView;
        if (view7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moreView");
        } else {
            view2 = view7;
        }
        view2.setOnClickListener(new View.OnClickListener() { // from class: bhm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view8) {
                SleepAnimalShareActivity.initShareView$lambda$8(this.f4229a, view8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initShareView$lambda$2(final SleepAnimalShareActivity this$0, final String shareTitle, final String shareDesc, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(shareTitle, "$shareTitle");
        Intrinsics.checkNotNullParameter(shareDesc, "$shareDesc");
        this$0.checkPermission(new Function1() { // from class: dhm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepAnimalShareActivity.initShareView$lambda$2$lambda$1(this.f15536a, shareTitle, shareDesc, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initShareView$lambda$2$lambda$1(SleepAnimalShareActivity this$0, String shareTitle, String shareDesc, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(shareTitle, "$shareTitle");
        Intrinsics.checkNotNullParameter(shareDesc, "$shareDesc");
        if (z) {
            s4m s4mVar = this$0.shareComponent;
            View view = null;
            if (s4mVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shareComponent");
                s4mVar = null;
            }
            View view2 = this$0.cardShare;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cardShare");
            } else {
                view = view2;
            }
            s4mVar.e(shareTitle, shareDesc, view);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initShareView$lambda$4(final SleepAnimalShareActivity this$0, final String shareTitle, final String shareDesc, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(shareTitle, "$shareTitle");
        Intrinsics.checkNotNullParameter(shareDesc, "$shareDesc");
        this$0.checkPermission(new Function1() { // from class: chm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepAnimalShareActivity.initShareView$lambda$4$lambda$3(this.f5353a, shareTitle, shareDesc, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initShareView$lambda$4$lambda$3(SleepAnimalShareActivity this$0, String shareTitle, String shareDesc, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(shareTitle, "$shareTitle");
        Intrinsics.checkNotNullParameter(shareDesc, "$shareDesc");
        if (z) {
            s4m s4mVar = this$0.shareComponent;
            View view = null;
            if (s4mVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shareComponent");
                s4mVar = null;
            }
            View view2 = this$0.cardShare;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cardShare");
            } else {
                view = view2;
            }
            s4mVar.u(shareTitle, shareDesc, view);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initShareView$lambda$6(final SleepAnimalShareActivity this$0, final String shareTitle, final String shareDesc, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(shareTitle, "$shareTitle");
        Intrinsics.checkNotNullParameter(shareDesc, "$shareDesc");
        this$0.checkPermission(new Function1() { // from class: hhm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepAnimalShareActivity.initShareView$lambda$6$lambda$5(this.f20075a, shareTitle, shareDesc, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initShareView$lambda$6$lambda$5(SleepAnimalShareActivity this$0, String shareTitle, String shareDesc, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(shareTitle, "$shareTitle");
        Intrinsics.checkNotNullParameter(shareDesc, "$shareDesc");
        if (z) {
            s4m s4mVar = this$0.shareComponent;
            View view = null;
            if (s4mVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shareComponent");
                s4mVar = null;
            }
            View view2 = this$0.cardShare;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cardShare");
            } else {
                view = view2;
            }
            s4mVar.v(shareTitle, shareDesc, view);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initShareView$lambda$8(final SleepAnimalShareActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.checkPermission(new Function1() { // from class: ehm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepAnimalShareActivity.initShareView$lambda$8$lambda$7(this.f16652a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initShareView$lambda$8$lambda$7(SleepAnimalShareActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            SleepShareViewModel sleepShareViewModel = (SleepShareViewModel) this$0.getMViewModel();
            View view = this$0.cardShare;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cardShare");
                view = null;
            }
            sleepShareViewModel.shareViaMore(this$0, view);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        this.downloadView = ((fo0) getMBinding()).O;
        this.shareWxView = ((fo0) getMBinding()).R;
        this.shareTimeLineView = ((fo0) getMBinding()).Q;
        this.moreView = ((fo0) getMBinding()).P;
        this.cardShare = ((fo0) getMBinding()).A;
        this.cardShareBg = ((fo0) getMBinding()).K;
        this.tvTimeRange = ((fo0) getMBinding()).Y;
        this.tvAnimalType = ((fo0) getMBinding()).V;
        this.tvAnimalDesc = ((fo0) getMBinding()).T;
        this.ivAnimalImage = ((fo0) getMBinding()).I;
        this.shadowLayout = ((fo0) getMBinding()).S;
        this.ivShareQrcode = ((fo0) getMBinding()).L;
        this.ivUserAvatar = ((fo0) getMBinding()).N;
        this.tvUserName = ((fo0) getMBinding()).Z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void requestData() {
        ((SleepShareViewModel) getMViewModel()).getQrBitmapLiveData().observe(this, new SleepAnimalShareActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: xgm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepAnimalShareActivity.requestData$lambda$12(this.f39103a, (Bitmap) obj);
            }
        }));
        ((SleepShareViewModel) getMViewModel()).getAccountInfoLiveData().observe(this, new SleepAnimalShareActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ygm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepAnimalShareActivity.requestData$lambda$16(this.f40162a, (AccountCoreInfo) obj);
            }
        }));
        ((SleepShareViewModel) getMViewModel()).requestQRBitmap();
        ((SleepShareViewModel) getMViewModel()).requestUserInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestData$lambda$12(SleepAnimalShareActivity this$0, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bitmap != null) {
            ImageView imageView = this$0.ivShareQrcode;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivShareQrcode");
                imageView = null;
            }
            imageView.setImageBitmap(bitmap);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestData$lambda$16(final SleepAnimalShareActivity this$0, AccountCoreInfo accountCoreInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (accountCoreInfo != null) {
            ImageView imageView = this$0.ivUserAvatar;
            TextView textView = null;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ivUserAvatar");
                imageView = null;
            }
            String avatarAddress = accountCoreInfo.getAvatarAddress();
            ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(avatarAddress).target(imageView);
            builderTarget.bitmapConfig(Bitmap.Config.ARGB_8888);
            builderTarget.target(new Target(this$0) { // from class: com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity$requestData$lambda$16$lambda$15$$inlined$target$default$1
                @Override // coil.target.Target
                public void onError(@Nullable Drawable error) {
                    ImageView imageView2 = this.this$0.ivUserAvatar;
                    if (imageView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("ivUserAvatar");
                        imageView2 = null;
                    }
                    imageView2.setImageResource(pni.w);
                }

                @Override // coil.target.Target
                public void onStart(@Nullable Drawable placeholder) {
                }

                @Override // coil.target.Target
                public void onSuccess(@NotNull Drawable result) {
                    Intrinsics.checkNotNull(result, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                    Bitmap bitmap = ((BitmapDrawable) result).getBitmap();
                    ImageView imageView2 = this.this$0.ivUserAvatar;
                    if (imageView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("ivUserAvatar");
                        imageView2 = null;
                    }
                    imageView2.setImageBitmap(bitmap);
                }
            });
            builderTarget.placeholder(pni.K1);
            imageLoader.enqueue(builderTarget.build());
            TextView textView2 = this$0.tvUserName;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvUserName");
            } else {
                textView = textView2;
            }
            String userName = accountCoreInfo.getUserName();
            textView.setText((userName == null || userName.length() == 0) ? accountCoreInfo.getUserId() : accountCoreInfo.getUserName());
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.g;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return cv1.f14763a;
    }

    @Override // com.xiaomi.fitness.health.sleep.ui.Hilt_SleepAnimalShareActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActionBarDisplayable(false);
        initView();
        this.shareComponent = new s4m(this);
        initBundle();
        initShareView();
        initDownloadView();
        requestData();
    }
}
