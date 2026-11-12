package com.xiaomi.fitness.homepage.util;

import android.app.ActivityOptions;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.health.threetarget.SportTargetFragment;
import com.xiaomi.fitness.login.NeedLoginAspect;
import com.xiaomi.fitness.login.annotation.NeedLogin;
import com.xiaomi.fitness.relative.threetarget.SportTargetRFragment;
import com.xiaomi.fitness.util.HealthUtil;
import defpackage.b4s;
import defpackage.fai;
import defpackage.iji;
import defpackage.nrd;
import defpackage.s69;
import defpackage.ytb;
import defpackage.zr3;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2#\u0010\n\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00050\u000bJ\u001c\u0010\u0010\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0007J\"\u0010\u0011\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u0013¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/homepage/util/HealthDataUtil;", "", "<init>", "()V", "cardZoom", "", "context", "Landroid/content/Context;", "zoomView", "Landroid/view/View;", "intentFunction", "Lkotlin/Function1;", "Landroid/app/ActivityOptions;", "Lkotlin/ParameterName;", "name", "activityOptions", "intentSportTarget", "intentSportRTarget", "relativeUid", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HealthDataUtil {

    @NotNull
    public static final HealthDataUtil INSTANCE;
    private static /* synthetic */ Annotation ajc$anno$0;
    private static /* synthetic */ nrd.a ajc$tjp_0;

    static {
        ajc$preClinit();
        INSTANCE = new HealthDataUtil();
    }

    private HealthDataUtil() {
    }

    private static /* synthetic */ void ajc$preClinit() {
        s69 s69Var = new s69("HealthDataUtil.kt", HealthDataUtil.class);
        ajc$tjp_0 = s69Var.h("method-execution", s69Var.g(b4s.APPLY_CHANNEL_TOKEN2_QUICK_BIND_CARD, "intentSportTarget", "com.xiaomi.fitness.homepage.util.HealthDataUtil", "android.content.Context:android.app.ActivityOptions", "context:activityOptions", "", "void"), 33);
    }

    public static final /* synthetic */ void intentSportTarget_aroundBody0(HealthDataUtil healthDataUtil, Context context, ActivityOptions activityOptions, nrd nrdVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("sport_type", 14);
        bundle.putString("did", "default_did");
        bundle.putSerializable("local_date", LocalDate.now());
        HealthUtil.INSTANCE.gotoPage(context, SportTargetFragment.class, bundle, activityOptions);
    }

    public final void cardZoom(@NotNull Context context, @NotNull View zoomView, @NotNull final Function1<? super ActivityOptions, Unit> intentFunction) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(zoomView, "zoomView");
        Intrinsics.checkNotNullParameter(intentFunction, "intentFunction");
        new zr3(context, zoomView) { // from class: com.xiaomi.fitness.homepage.util.HealthDataUtil.cardZoom.1
            @Override // defpackage.zr3
            public void onCardZoomTriggered(ActivityOptions activityOptions) {
                intentFunction.invoke(activityOptions);
            }
        }.setRadius(ExtUtilsKt.getDp(Float.valueOf(16.0f))).setTransitionBgColorRes(iji.I2);
    }

    public final void intentSportRTarget(@Nullable Context context, @Nullable ActivityOptions activityOptions, long relativeUid) {
        Bundle bundle = new Bundle();
        bundle.putInt("sport_type", 14);
        bundle.putString("did", "default_did");
        bundle.putLong("key_relative_uid", relativeUid);
        bundle.putSerializable("local_date", LocalDate.now());
        HealthUtil.INSTANCE.gotoPage(context, SportTargetRFragment.class, bundle, activityOptions);
    }

    @NeedLogin(needCompleteUserInfo = true, needLogin = false)
    public final void intentSportTarget(@Nullable Context context, @Nullable ActivityOptions activityOptions) throws Throwable {
        nrd nrdVarD = s69.d(ajc$tjp_0, this, this, context, activityOptions);
        NeedLoginAspect needLoginAspectAspectOf = NeedLoginAspect.aspectOf();
        fai faiVarC = new ytb(new Object[]{this, context, activityOptions, nrdVarD}).c(69648);
        Annotation annotation = ajc$anno$0;
        if (annotation == null) {
            annotation = HealthDataUtil.class.getDeclaredMethod("intentSportTarget", Context.class, ActivityOptions.class).getAnnotation(NeedLogin.class);
            ajc$anno$0 = annotation;
        }
        needLoginAspectAspectOf.aroundNeedLogin(faiVarC, (NeedLogin) annotation);
    }
}
