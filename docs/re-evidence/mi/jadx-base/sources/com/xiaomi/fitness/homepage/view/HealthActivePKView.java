package com.xiaomi.fitness.homepage.view;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.target.Target;
import com.xiaomi.fitness.active.pk.export.ActivePkPageExtKt;
import com.xiaomi.fitness.active.pk.export.IPkExport;
import com.xiaomi.fitness.active.pk.export.entity.EntranceModel;
import com.xiaomi.fitness.active.pk.export.entity.EntrancePkRecordInfo;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.homepage.util.HealthDataUtil;
import com.xiaomi.fitness.homepage.view.HealthActivePKView;
import com.xiaomi.fitness.widget.view.RoundImageView;
import defpackage.eri;
import defpackage.ili;
import defpackage.jui;
import defpackage.pni;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0016\u001a\u00020\u0017H\u0014J\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aJ\u001c\u0010\u001b\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\rH\u0002J\u0012\u0010\u001f\u001a\u00020\u00172\b\u0010 \u001a\u0004\u0018\u00010!H\u0014R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/homepage/view/HealthActivePKView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "container", "myAvatarView", "Lcom/xiaomi/fitness/widget/view/RoundImageView;", "leftOppoView", "myLeadingCrown", "Landroidx/appcompat/widget/AppCompatImageView;", "leftOppoLeadingCrown", "players", "getPlayers", "()Landroid/widget/RelativeLayout;", "setPlayers", "(Landroid/widget/RelativeLayout;)V", "pkCount", "", "onFinishInflate", "", "bindData", "result", "Lcom/xiaomi/fitness/active/pk/export/entity/EntranceModel;", "loadWebUri", "iconLink", "", "imgView", "onConfigurationChanged", StandardComponentEvent.KEY_NEW_CONFIG, "Landroid/content/res/Configuration;", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHealthActivePKView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthActivePKView.kt\ncom/xiaomi/fitness/homepage/view/HealthActivePKView\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n*L\n1#1,122:1\n54#2,3:123\n24#2:126\n59#2,4:127\n63#2,2:140\n844#3,9:131\n*S KotlinDebug\n*F\n+ 1 HealthActivePKView.kt\ncom/xiaomi/fitness/homepage/view/HealthActivePKView\n*L\n93#1:123,3\n93#1:126\n93#1:127,4\n93#1:140,2\n95#1:131,9\n*E\n"})
public final class HealthActivePKView extends RelativeLayout {

    @NotNull
    public static final String TAG = "HealthActivePKView";

    @Nullable
    private RelativeLayout container;

    @Nullable
    private AppCompatImageView leftOppoLeadingCrown;

    @Nullable
    private RoundImageView leftOppoView;

    @Nullable
    private RoundImageView myAvatarView;

    @Nullable
    private AppCompatImageView myLeadingCrown;
    private int pkCount;

    @Nullable
    private RelativeLayout players;

    public HealthActivePKView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(jui.j4, this);
    }

    private final void loadWebUri(String iconLink, final AppCompatImageView imgView) {
        if (imgView == null) {
            return;
        }
        if (iconLink == null || StringsKt__StringsKt.isBlank(iconLink)) {
            imgView.setImageResource(pni.Y1);
            return;
        }
        Uri uri = Uri.parse(iconLink);
        ImageLoader imageLoader = Coil.imageLoader(imgView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imgView.getContext()).data(uri).target(imgView);
        builderTarget.bitmapConfig(Bitmap.Config.ARGB_8888);
        builderTarget.target(new Target() { // from class: com.xiaomi.fitness.homepage.view.HealthActivePKView$loadWebUri$lambda$3$$inlined$target$default$1
            @Override // coil.target.Target
            public void onError(@Nullable Drawable error) {
                imgView.setImageResource(pni.Y1);
            }

            @Override // coil.target.Target
            public void onStart(@Nullable Drawable placeholder) {
            }

            @Override // coil.target.Target
            public void onSuccess(@NotNull Drawable result) {
                Intrinsics.checkNotNull(result, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                imgView.setImageBitmap(((BitmapDrawable) result).getBitmap());
            }
        });
        imageLoader.enqueue(builderTarget.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFinishInflate$lambda$0(HealthActivePKView this$0, ActivityOptions activityOptions) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IPkExport instance = ActivePkPageExtKt.getINSTANCE(IPkExport.INSTANCE);
        int i = this$0.pkCount;
        Context context = this$0.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        instance.goToPKActivity(i, context, null);
        return Unit.INSTANCE;
    }

    public final int bindData(@NotNull EntranceModel result) {
        Intrinsics.checkNotNullParameter(result, "result");
        Logger.d(TAG, "initPkEntrance result=" + result);
        EntrancePkRecordInfo pkRecordInfo = result.getPkRecordInfo();
        this.pkCount = result.getPkCount();
        if (pkRecordInfo == null) {
            RelativeLayout relativeLayout = this.players;
            if (relativeLayout != null) {
                ViewExtKt.gone(relativeLayout);
            }
        } else {
            RelativeLayout relativeLayout2 = this.players;
            if (relativeLayout2 != null) {
                ViewExtKt.visible(relativeLayout2);
            }
            Integer oppoTotalScore = pkRecordInfo.getOppoTotalScore();
            int iIntValue = oppoTotalScore != null ? oppoTotalScore.intValue() : 0;
            Integer myTotalScore = pkRecordInfo.getMyTotalScore();
            int iIntValue2 = myTotalScore != null ? myTotalScore.intValue() : 0;
            loadWebUri(pkRecordInfo.getMyIcon(), this.myAvatarView);
            loadWebUri(pkRecordInfo.getOppoIcon(), this.leftOppoView);
            if (!pkRecordInfo.getShowCrownEnable() || iIntValue == iIntValue2) {
                AppCompatImageView appCompatImageView = this.leftOppoLeadingCrown;
                if (appCompatImageView != null) {
                    ViewExtKt.gone(appCompatImageView);
                }
                AppCompatImageView appCompatImageView2 = this.myLeadingCrown;
                if (appCompatImageView2 != null) {
                    ViewExtKt.gone(appCompatImageView2);
                }
            } else if (iIntValue > iIntValue2) {
                AppCompatImageView appCompatImageView3 = this.leftOppoLeadingCrown;
                if (appCompatImageView3 != null) {
                    ViewExtKt.visible(appCompatImageView3);
                }
                AppCompatImageView appCompatImageView4 = this.myLeadingCrown;
                if (appCompatImageView4 != null) {
                    ViewExtKt.gone(appCompatImageView4);
                }
            } else if (iIntValue < iIntValue2) {
                AppCompatImageView appCompatImageView5 = this.leftOppoLeadingCrown;
                if (appCompatImageView5 != null) {
                    ViewExtKt.gone(appCompatImageView5);
                }
                AppCompatImageView appCompatImageView6 = this.myLeadingCrown;
                if (appCompatImageView6 != null) {
                    ViewExtKt.visible(appCompatImageView6);
                }
            }
        }
        return this.pkCount;
    }

    @Nullable
    public final RelativeLayout getPlayers() {
        return this.players;
    }

    @Override // android.view.View
    public void onConfigurationChanged(@Nullable Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        int dimen = (int) ViewExtKt.getDimen(this, ili.j);
        RelativeLayout relativeLayout = this.container;
        if (relativeLayout != null) {
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(dimen, marginLayoutParams.topMargin, dimen, marginLayoutParams.bottomMargin);
            marginLayoutParams.setMarginStart(dimen);
            marginLayoutParams.setMarginEnd(dimen);
            relativeLayout.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.container = (RelativeLayout) findViewById(eri.V1);
        this.players = (RelativeLayout) findViewById(eri.Rc);
        this.myAvatarView = (RoundImageView) findViewById(eri.Zb);
        this.leftOppoView = (RoundImageView) findViewById(eri.ka);
        this.myLeadingCrown = (AppCompatImageView) findViewById(eri.ac);
        this.leftOppoLeadingCrown = (AppCompatImageView) findViewById(eri.qc);
        HealthDataUtil healthDataUtil = HealthDataUtil.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RelativeLayout relativeLayout = this.container;
        Intrinsics.checkNotNull(relativeLayout);
        healthDataUtil.cardZoom(context, relativeLayout, new Function1() { // from class: onb
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HealthActivePKView.onFinishInflate$lambda$0(this.f29316a, (ActivityOptions) obj);
            }
        });
    }

    public final void setPlayers(@Nullable RelativeLayout relativeLayout) {
        this.players = relativeLayout;
    }
}
