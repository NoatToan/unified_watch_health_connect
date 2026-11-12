package com.xiaomi.fitness.medal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import androidx.fragment.app.FragmentActivity;
import com.mibi.sdk.component.params.SdkContants;
import com.miui.tsmclient.entity.CardUIInfo;
import com.xiaomi.fitness.account.api.AccountRequest;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoProfile;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.medal.MedalManagerImpl;
import com.xiaomi.fitness.medal.bean.MedalDetail;
import com.xiaomi.fitness.medal.bean.MedalDetailInfo;
import com.xiaomi.fitness.medal.export.MedalManager;
import com.xiaomi.fitness.medal.export.MedalManagerExtKt;
import com.xiaomi.fitness.medal.export.data.MedalAssistResult;
import com.xiaomi.fitness.medal.export.data.MedalEntrance;
import com.xiaomi.fitness.medal.export.data.PopMedalData;
import com.xiaomi.fitness.medal.medaldetail.MedalDetailActivity;
import com.xiaomi.fitness.medal.medallist.MedalListActivity;
import com.xiaomi.fitness.medal.preference.MedalPreference;
import com.xiaomi.fitness.medal.request.MedalRequest;
import com.xiaomi.fitness.medal.request.MedalV2Request;
import com.xiaomi.fitness.net.response.ApiException;
import defpackage.ecf;
import defpackage.h4b;
import defpackage.j0j;
import defpackage.txi;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 {2\u00020\u0001:\u0001{B\t\b\u0007¢\u0006\u0004\bz\u00104J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ=\u0010\u0012\u001a\u00020\u000e2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013JC\u0010\u0015\u001a\u00020\u000e2\u001e\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\u00142\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016JU\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJM\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00042\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\u0010H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010!\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J7\u0010&\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000e0\u00102\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000e0\u0010H\u0016¢\u0006\u0004\b&\u0010'J9\u0010(\u001a\u00020\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010#\u0012\u0004\u0012\u00020\u000e0\u00102\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000e0\u0010H\u0016¢\u0006\u0004\b(\u0010'J+\u0010+\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u000e0\u0010H\u0016¢\u0006\u0004\b+\u0010,J9\u00101\u001a\u00020\u000e2(\u00100\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-\u0012\u0004\u0012\u00020\u000e0\u0010j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-`/H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u000eH\u0016¢\u0006\u0004\b3\u00104J\u001f\u00106\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u0004H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u0002H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020:H\u0016¢\u0006\u0004\b=\u0010<J!\u0010>\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b>\u0010\"J\u0017\u0010A\u001a\u00020@2\u0006\u0010?\u001a\u00020\u0002H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010F\u001a\u00020E2\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\u00042\u0006\u0010H\u001a\u00020\u0002H\u0016¢\u0006\u0004\bI\u0010\u0006J\u0017\u0010K\u001a\u00020\u00042\u0006\u0010J\u001a\u00020\u0002H\u0016¢\u0006\u0004\bK\u0010\u0006J-\u0010P\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020L2\u0006\u0010M\u001a\u00020.2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u000e0NH\u0016¢\u0006\u0004\bP\u0010QJ\u001f\u0010R\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020L2\u0006\u0010)\u001a\u00020\u0002H\u0016¢\u0006\u0004\bR\u0010SJ/\u0010V\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020L2\u0006\u0010T\u001a\u00020\u00042\u000e\u0010U\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010NH\u0016¢\u0006\u0004\bV\u0010WJ?\u0010Z\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020L2\u0006\u0010X\u001a\u00020\u00022\u0006\u0010T\u001a\u00020\u00042\u000e\u0010U\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010N2\u0006\u0010Y\u001a\u00020\u0004H\u0016¢\u0006\u0004\bZ\u0010[J=\u0010`\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020L2\u0006\u0010\\\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u00042\u0006\u0010^\u001a\u00020\u00042\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u000e0NH\u0016¢\u0006\u0004\b`\u0010aR\"\u0010c\u001a\u00020b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010j\u001a\u00020i8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\"\u0010q\u001a\u00020p8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u0016\u0010w\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010y\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010x¨\u0006|"}, d2 = {"Lcom/xiaomi/fitness/medal/MedalManagerImpl;", "Lcom/xiaomi/fitness/medal/export/MedalManager;", "", "medalType", "", "getMedalAssistData", "(I)Ljava/lang/String;", "progressValue", "progressTarget", "progressUnit", "getProgressValueOutOfProgressTargetWithUnitStr", "(IILjava/lang/String;)Ljava/lang/String;", "Lkotlin/Function2;", "", "", "success", "Lkotlin/Function1;", "fail", "getWearMedal", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function3;", "getWearMedalDetail", "(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)V", "id", "icon", "wearMedal", "(JLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "unWearMedal", "(JLjava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "Landroid/app/Activity;", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "goToMedalListActivity", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/medal/export/data/MedalEntrance;", "Lcom/xiaomi/fitness/net/response/ApiException;", "error", "getMedalEntrance", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getMedalEntranceV4", "type", "Lcom/xiaomi/fitness/medal/export/data/MedalAssistResult;", "doMedalAssist", "(ILkotlin/jvm/functions/Function1;)V", "", "Lcom/xiaomi/fitness/medal/export/data/PopMedalData;", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "onSuccess", "requestAllTypeMedalPopupList", "(Lkotlin/jvm/functions/Function1;)V", "checkBirthday", "()V", "model", "doMedalAssistFaceDownload", "(Ljava/lang/String;Ljava/lang/String;)V", "doMedalAssistWithSp", "(I)V", "", "getKeyNfcDoorMedalUploaded", "()Z", "getKeyNfcTransitMedalUploaded", "goToMedalDetailActivity", "medalClass", "", "getMedalListImgRatio", "(I)F", "Lecf$a$a;", "medalData", "Landroid/text/SpannableString;", "getMedalSubtitle", "(Lecf$a$a;)Landroid/text/SpannableString;", "seconds", "convertSecondsToMinutesStr", "shareMethod", "getShareMethodString", "Landroidx/fragment/app/FragmentActivity;", "latestMedal", "Lkotlin/Function0;", "closeDialogCallback", "showLatestMedalPopDialog", "(Landroidx/fragment/app/FragmentActivity;Lcom/xiaomi/fitness/medal/export/data/PopMedalData;Lkotlin/jvm/functions/Function0;)V", "requestMedalList", "(Landroidx/fragment/app/FragmentActivity;I)V", "tip", "dismissCallback", "showTrainingFinishPop", "(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "iconRes", "userTip", "showTrainingPopMedal", "(Landroidx/fragment/app/FragmentActivity;ILjava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V", "title", CardUIInfo.KEY_SUBTITILE, "btnStr", "clickCallback", "showSleepInterfereMedal", "(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Lcom/xiaomi/fitness/medal/MedalHelper;", "medalHelper", "Lcom/xiaomi/fitness/medal/MedalHelper;", "getMedalHelper", "()Lcom/xiaomi/fitness/medal/MedalHelper;", "setMedalHelper", "(Lcom/xiaomi/fitness/medal/MedalHelper;)V", "Lcom/xiaomi/fitness/medal/request/MedalRequest;", "medalRequest", "Lcom/xiaomi/fitness/medal/request/MedalRequest;", "getMedalRequest", "()Lcom/xiaomi/fitness/medal/request/MedalRequest;", "setMedalRequest", "(Lcom/xiaomi/fitness/medal/request/MedalRequest;)V", "Lcom/xiaomi/fitness/medal/request/MedalV2Request;", "medalV2Request", "Lcom/xiaomi/fitness/medal/request/MedalV2Request;", "getMedalV2Request", "()Lcom/xiaomi/fitness/medal/request/MedalV2Request;", "setMedalV2Request", "(Lcom/xiaomi/fitness/medal/request/MedalV2Request;)V", "KEY_WEAR_MEDAL_URL", "Ljava/lang/String;", "KEY_WEAR_MEDAL", "<init>", "Companion", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMedalManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MedalManagerImpl.kt\ncom/xiaomi/fitness/medal/MedalManagerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,518:1\n1#2:519\n1863#3:520\n1863#3,2:521\n1864#3:523\n*S KotlinDebug\n*F\n+ 1 MedalManagerImpl.kt\ncom/xiaomi/fitness/medal/MedalManagerImpl\n*L\n141#1:520\n142#1:521,2\n141#1:523\n*E\n"})
public final class MedalManagerImpl implements MedalManager {

    @NotNull
    public static final String MEDAL_TYPE_MARATHON = "marathon";

    @NotNull
    public static final String TAG = "MedalManagerImpl";
    public MedalHelper medalHelper;
    public MedalRequest medalRequest;
    public MedalV2Request medalV2Request;

    @NotNull
    private String KEY_WEAR_MEDAL_URL = "";

    @NotNull
    private String KEY_WEAR_MEDAL = "";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkBirthday$lambda$28(MedalAssistResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doMedalAssist$lambda$27(int i, Function1 success, MedalAssistResult it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.d("doMedalAssist type = " + i, new Function1() { // from class: pff
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalManagerImpl.doMedalAssist$lambda$27$lambda$26((Throwable) obj);
            }
        });
        success.invoke2(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doMedalAssist$lambda$27$lambda$26(Throwable th) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doMedalAssistFaceDownload$lambda$29(MedalAssistResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    private final String getMedalAssistData(int medalType) {
        String strB = h4b.b(MapsKt__MapsJVMKt.mapOf(TuplesKt.to("medalType", Integer.valueOf(medalType))));
        Intrinsics.checkNotNullExpressionValue(strB, "toDataEasyJson(...)");
        return strB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getMedalEntrance$lambda$22(Function1 success, MedalEntrance it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        success.invoke2(it);
        Logger.i(TAG, "getMedalEntrance succeeded. ");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getMedalEntrance$lambda$23(Function1 error, ApiException it) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(it, "it");
        error.invoke2(it);
        Logger.i(TAG, "getMedalEntrance failed. errorCode=" + it.getErrorCode() + " errorMessage=" + it.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getMedalEntranceV4$lambda$24(Function1 success, MedalEntrance medalEntrance) {
        Intrinsics.checkNotNullParameter(success, "$success");
        success.invoke2(medalEntrance);
        Logger.i(TAG, "getMedalEntranceV4 succeeded. ");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getMedalEntranceV4$lambda$25(Function1 error, ApiException it) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(it, "it");
        error.invoke2(it);
        Logger.i(TAG, "getMedalEntranceV4 failed. errorCode=" + it.getErrorCode() + " errorMessage=" + it.getMessage());
        return Unit.INSTANCE;
    }

    private final String getProgressValueOutOfProgressTargetWithUnitStr(int progressValue, int progressTarget, String progressUnit) {
        MedalHelper.Companion companion = MedalHelper.INSTANCE;
        if (progressUnit == null) {
            progressUnit = "";
        }
        return progressValue + "/" + companion.getLocalizedProgressValueWithUnitStr(progressTarget, progressUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getWearMedal$lambda$8(final MedalManagerImpl this$0, final Function1 fail, final Function2 success, final UserInfoProfile userInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Logger.i(TAG, "getWearMedal = " + userInfo.getWear_medal());
        final UserProfile.UserWearMedal wear_medal = userInfo.getWear_medal();
        if (wear_medal == null || wear_medal.getWear_status() == 0 || wear_medal.getWear_medal_type().length() == 0) {
            this$0.getMedalV2Request().getAllMedals(new Function1() { // from class: tff
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MedalManagerImpl.getWearMedal$lambda$8$lambda$3(this.f34646a, fail, userInfo, success, (ecf) obj);
                }
            }, new Function1() { // from class: uff
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MedalManagerImpl.getWearMedal$lambda$8$lambda$4(fail, (ApiException) obj);
                }
            });
        } else if (wear_medal.getWear_status() == 1) {
            long wear_medal_id = wear_medal.getWear_medal_id();
            String wear_medal_type = wear_medal.getWear_medal_type();
            Intrinsics.checkNotNull(wear_medal_type);
            this$0.getMedalV2Request().getUserDetailMedalV2(new MedalDetailInfo(wear_medal_id, wear_medal_type), new Function1() { // from class: vff
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MedalManagerImpl.getWearMedal$lambda$8$lambda$6(this.f36845a, success, fail, wear_medal, (MedalDetail) obj);
                }
            }, new Function1() { // from class: wff
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MedalManagerImpl.getWearMedal$lambda$8$lambda$7(fail, (ApiException) obj);
                }
            });
        } else {
            this$0.KEY_WEAR_MEDAL = "-1";
            this$0.KEY_WEAR_MEDAL_URL = "";
            fail.invoke2("");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getWearMedal$lambda$8$lambda$3(final MedalManagerImpl this$0, final Function1 fail, final UserInfoProfile userInfo, final Function2 success, ecf cateList) {
        Object next;
        List<ecf.a.C0923a> list;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(userInfo, "$userInfo");
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(cateList, "cateList");
        List<ecf.a> medals = cateList.f16485a;
        Intrinsics.checkNotNullExpressionValue(medals, "medals");
        Iterator<T> it = medals.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ecf.a aVar = (ecf.a) next;
            if (aVar.c == 0 && (list = aVar.f16487a) != null && !list.isEmpty()) {
                break;
            }
        }
        ecf.a aVar2 = (ecf.a) next;
        List<ecf.a.C0923a> list2 = aVar2 != null ? aVar2.f16487a : null;
        if (list2 == null || list2.isEmpty()) {
            fail.invoke2("");
        } else {
            Intrinsics.checkNotNull(aVar2);
            final ecf.a.C0923a c0923a = aVar2.f16487a.get(0);
            if (c0923a != null) {
                Long id = c0923a.o;
                Intrinsics.checkNotNullExpressionValue(id, "id");
                long jLongValue = id.longValue();
                String icon = c0923a.c;
                Intrinsics.checkNotNullExpressionValue(icon, "icon");
                String medalType = c0923a.m;
                Intrinsics.checkNotNullExpressionValue(medalType, "medalType");
                this$0.wearMedal(jLongValue, icon, medalType, new Function2() { // from class: agf
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MedalManagerImpl.getWearMedal$lambda$8$lambda$3$lambda$1(this.f986a, c0923a, userInfo, success, ((Long) obj).longValue(), (String) obj2);
                    }
                }, new Function1() { // from class: bgf
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return MedalManagerImpl.getWearMedal$lambda$8$lambda$3$lambda$2(fail, (String) obj);
                    }
                });
            } else {
                fail.invoke2("");
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getWearMedal$lambda$8$lambda$3$lambda$1(MedalManagerImpl this$0, ecf.a.C0923a c0923a, UserInfoProfile userInfo, Function2 success, long j, String url) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(userInfo, "$userInfo");
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(url, "url");
        this$0.KEY_WEAR_MEDAL_URL = c0923a.c;
        UserProfile.UserWearMedal wear_medal = userInfo.getWear_medal();
        Intrinsics.checkNotNull(wear_medal);
        String strValueOf = String.valueOf(wear_medal.getWear_medal_id());
        this$0.KEY_WEAR_MEDAL = strValueOf;
        success.invoke(Long.valueOf(Long.parseLong(strValueOf)), this$0.KEY_WEAR_MEDAL_URL);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getWearMedal$lambda$8$lambda$3$lambda$2(Function1 fail, String it) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        fail.invoke2("");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getWearMedal$lambda$8$lambda$4(Function1 fail, ApiException it) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        fail.invoke2("");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getWearMedal$lambda$8$lambda$6(MedalManagerImpl this$0, Function2 success, Function1 fail, UserProfile.UserWearMedal userWearMedal, MedalDetail list) {
        Object next;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(list, "list");
        Iterator<T> it = list.getData().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ecf.a.C0923a c0923a = (ecf.a.C0923a) next;
            Long l = c0923a.o;
            long wear_medal_id = userWearMedal.getWear_medal_id();
            if (l != null && l.longValue() == wear_medal_id && Intrinsics.areEqual(c0923a.m, userWearMedal.getWear_medal_type())) {
                break;
            }
        }
        ecf.a.C0923a c0923a2 = (ecf.a.C0923a) next;
        if (c0923a2 != null) {
            this$0.KEY_WEAR_MEDAL_URL = c0923a2.c;
            String string = c0923a2.o.toString();
            this$0.KEY_WEAR_MEDAL = string;
            success.invoke(Long.valueOf(Long.parseLong(string)), this$0.KEY_WEAR_MEDAL_URL);
        } else {
            fail.invoke2("");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getWearMedal$lambda$8$lambda$7(Function1 fail, ApiException it) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "mMedalRequest it == " + it);
        fail.invoke2("");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getWearMedal$lambda$9(Function1 fail, ApiException it) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "getWearMedal error " + it);
        fail.invoke2("");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getWearMedalDetail$lambda$12(MedalManagerImpl this$0, Function3 success, ecf cateList) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(cateList, "cateList");
        List<ecf.a> medals = cateList.f16485a;
        Intrinsics.checkNotNullExpressionValue(medals, "medals");
        Iterator<T> it = medals.iterator();
        while (it.hasNext()) {
            List<ecf.a.C0923a> data = ((ecf.a) it.next()).f16487a;
            Intrinsics.checkNotNullExpressionValue(data, "data");
            for (ecf.a.C0923a c0923a : data) {
                if (Intrinsics.areEqual(this$0.KEY_WEAR_MEDAL, c0923a.o.toString())) {
                    Long id = c0923a.o;
                    Intrinsics.checkNotNullExpressionValue(id, "id");
                    String medalType = c0923a.m;
                    Intrinsics.checkNotNullExpressionValue(medalType, "medalType");
                    success.invoke(id, medalType, Integer.valueOf(c0923a.f16490b));
                    return Unit.INSTANCE;
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getWearMedalDetail$lambda$13(Function1 fail, ApiException it) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        fail.invoke2("");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unWearMedal$lambda$20(long j, String medalType, final MedalManagerImpl this$0, final Function1 fail, UserInfoProfile it) {
        Intrinsics.checkNotNullParameter(medalType, "$medalType");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        it.setWear_medal(new UserProfile.UserWearMedal(2, j, medalType));
        AccountRequest.setUserProfile$default(new AccountRequest(), null, AccountManagerExtKt.toUserProfile$default(it, null, 1, null), new Function1() { // from class: nff
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalManagerImpl.unWearMedal$lambda$20$lambda$18(this.f27881a, ((Boolean) obj).booleanValue());
            }
        }, new Function1() { // from class: yff
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalManagerImpl.unWearMedal$lambda$20$lambda$19(fail, (ApiException) obj);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unWearMedal$lambda$20$lambda$18(MedalManagerImpl this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "unWearMedal success");
        this$0.KEY_WEAR_MEDAL = "-1";
        this$0.KEY_WEAR_MEDAL_URL = "";
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unWearMedal$lambda$20$lambda$19(Function1 fail, ApiException it) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "unWearMedal error");
        fail.invoke2("");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unWearMedal$lambda$21(Function1 fail, ApiException it) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "getUserInfoFromWeb error " + it);
        fail.invoke2("");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit wearMedal$lambda$16(final long j, final String medalType, final MedalManagerImpl this$0, final String icon, final Function2 success, final Function1 fail, UserInfoProfile it) {
        Intrinsics.checkNotNullParameter(medalType, "$medalType");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(icon, "$icon");
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        it.setWear_medal(new UserProfile.UserWearMedal(1, j, medalType));
        AccountRequest.setUserProfile$default(new AccountRequest(), null, AccountManagerExtKt.toUserProfile$default(it, null, 1, null), new Function1() { // from class: jgf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalManagerImpl.wearMedal$lambda$16$lambda$14(j, medalType, this$0, icon, success, ((Boolean) obj).booleanValue());
            }
        }, new Function1() { // from class: kgf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalManagerImpl.wearMedal$lambda$16$lambda$15(fail, (ApiException) obj);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit wearMedal$lambda$16$lambda$14(long j, String medalType, MedalManagerImpl this$0, String icon, Function2 success, boolean z) {
        Intrinsics.checkNotNullParameter(medalType, "$medalType");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(icon, "$icon");
        Intrinsics.checkNotNullParameter(success, "$success");
        Logger.i(TAG, "wearMedal suc id = " + j + "  medalType = " + medalType);
        this$0.KEY_WEAR_MEDAL = String.valueOf(j);
        this$0.KEY_WEAR_MEDAL_URL = icon;
        success.invoke(Long.valueOf(j), this$0.KEY_WEAR_MEDAL_URL);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit wearMedal$lambda$16$lambda$15(Function1 fail, ApiException it) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "wearMedal error");
        fail.invoke2("");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit wearMedal$lambda$17(Function1 fail, ApiException it) {
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "wearMedal getUserProfile error " + it);
        fail.invoke2("");
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.medal.export.MedalManager
    public void checkBirthday() {
        getMedalHelper().checkBirthday(new Function1() { // from class: qff
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalManagerImpl.checkBirthday$lambda$28((MedalAssistResult) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.medal.export.MedalManager
    @NotNull
    public String convertSecondsToMinutesStr(int seconds) {
        int i = seconds / 60;
        return i + "'" + (seconds - (i * 60)) + "''";
    }

    @Override // com.xiaomi.fitness.medal.export.MedalManager
    public void doMedalAssist(final int type, @NotNull final Function1<? super MedalAssistResult, Unit> success) {
        Intrinsics.checkNotNullParameter(success, "success");
        MedalRequest.postClientAssist$default(getMedalRequest(), getMedalAssistData(type), new Function1() { // from class: lgf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalManagerImpl.doMedalAssist$lambda$27(type, success, (MedalAssistResult) obj);
            }
        }, null, 4, null);
    }

    @Override // com.xiaomi.fitness.medal.export.MedalManager
    public void doMedalAssistFaceDownload(@NotNull String id, @NotNull String model) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(model, "model");
        getMedalHelper().doMedalAssistFaceDownload(id, model, new Function1() { // from class: egf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalManagerImpl.doMedalAssistFaceDownload$lambda$29((MedalAssistResult) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.medal.export.MedalManager
    public void doMedalAssistWithSp(int type) {
        getMedalHelper().doMedalAssistWithSp(type);
    }

    @Override // com.xiaomi.fitness.medal.export.MedalManager
    public boolean getKeyNfcDoorMedalUploaded() {
        return MedalPreference.INSTANCE.getKEY_NFC_DOOR_MEDAL_UPLOADED();
    }

    @Override // com.xiaomi.fitness.medal.export.MedalManager
    public boolean getKeyNfcTransitMedalUploaded() {
        return MedalPreference.INSTANCE.getKEY_NFC_TRANSIT_MEDAL_UPLOADED();
    }

    @Override // com.xiaomi.fitness.medal.export.MedalManager
    public void getMedalEntrance(@NotNull final Function1<? super MedalEntrance, Unit> success, @NotNull final Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        getMedalV2Request().getMedalEntrance(new Function1() { // from class: cgf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalManagerImpl.getMedalEntrance$lambda$22(success, (MedalEntrance) obj);
            }
        }, new Function1() { // from class: dgf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalManagerImpl.getMedalEntrance$lambda$23(error, (ApiException) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.medal.export.MedalManager
    public void getMedalEntranceV4(@NotNull final Function1<? super MedalEntrance, Unit> success, @NotNull final Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        getMedalV2Request().getMedalEntranceV4(new Function1() { // from class: hgf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalManagerImpl.getMedalEntranceV4$lambda$24(success, (MedalEntrance) obj);
            }
        }, new Function1() { // from class: igf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalManagerImpl.getMedalEntranceV4$lambda$25(error, (ApiException) obj);
            }
        });
    }

    @NotNull
    public final MedalHelper getMedalHelper() {
        MedalHelper medalHelper = this.medalHelper;
        if (medalHelper != null) {
            return medalHelper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("medalHelper");
        return null;
    }

    @Override // com.xiaomi.fitness.medal.export.MedalManager
    public float getMedalListImgRatio(int medalClass) {
        if (medalClass != 1) {
            return medalClass != 3 ? 1.0f : 1.03f;
        }
        return 1.316f;
    }

    @NotNull
    public final MedalRequest getMedalRequest() {
        MedalRequest medalRequest = this.medalRequest;
        if (medalRequest != null) {
            return medalRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("medalRequest");
        return null;
    }

    @Override // com.xiaomi.fitness.medal.export.MedalManager
    @NotNull
    public SpannableString getMedalSubtitle(@NotNull ecf.a.C0923a medalData) {
        SpannableString spannableString;
        SpannableString orangeSpannableStr;
        Intrinsics.checkNotNullParameter(medalData, "medalData");
        int i = medalData.s;
        MedalHelper.Companion companion = MedalHelper.INSTANCE;
        int medalProgress = companion.getMedalProgress(medalData);
        Logger.d(MedalHelper.TAG, "getMedalSubtitle medalData=" + medalData + " medalProgress=" + medalProgress + " categoryType=" + i);
        SpannableString spannableString2 = new SpannableString(ResourceExtKt.getString(j0j.s));
        if (Intrinsics.areEqual(medalData.v, "percent")) {
            int i2 = medalData.t;
            String str = medalData.v;
            if (str == null) {
                str = "";
            }
            spannableString2 = new SpannableString(companion.getLocalizedProgressValueWithUnitStr(i2, str));
        } else if (Intrinsics.areEqual(medalData.m, MEDAL_TYPE_MARATHON) && medalData.f) {
            spannableString2 = new SpannableString(ResourceExtKt.getString(j0j.f));
        } else {
            if (medalProgress == 0 && i == 4) {
                if (medalData.f16490b == 6) {
                    spannableString2 = new SpannableString(ResourceExtKt.getString(j0j.w));
                }
                if (medalData.f16490b == 1) {
                    spannableString2 = new SpannableString(ResourceExtKt.getString(j0j.x, medalData.l));
                }
                if (Intrinsics.areEqual(medalData.m, "pace")) {
                    spannableString2 = new SpannableString(ResourceExtKt.getString(j0j.f22301r));
                }
                if (medalData.f16490b == 5) {
                    spannableString2 = new SpannableString(getProgressValueOutOfProgressTargetWithUnitStr(medalData.t, medalData.u, medalData.v));
                }
            } else if (medalProgress == 0 && i == 2) {
                if (medalData.f16490b == 2) {
                    spannableString2 = new SpannableString(ResourceExtKt.getString(j0j.s));
                }
            } else if (medalProgress == 0 && i == 3) {
                spannableString2 = new SpannableString(getProgressValueOutOfProgressTargetWithUnitStr(medalData.t, medalData.f16490b != 5 ? medalData.u : 6, medalData.v));
            } else if (medalProgress == 1 && i == 4) {
                if (Intrinsics.areEqual(medalData.m, "pace")) {
                    String strConvertSecondsToMinutesStr = MedalManagerExtKt.getInstance(MedalManager.INSTANCE).convertSecondsToMinutesStr(medalData.t);
                    orangeSpannableStr = companion.getOrangeSpannableStr(strConvertSecondsToMinutesStr, ResourceExtKt.getString(j0j.o, strConvertSecondsToMinutesStr));
                    spannableString2 = orangeSpannableStr;
                } else {
                    spannableString = new SpannableString(getProgressValueOutOfProgressTargetWithUnitStr(medalData.t, medalData.u, medalData.v));
                    spannableString2 = spannableString;
                }
            } else if (medalProgress == 1 && i == 2) {
                spannableString2 = new SpannableString(getProgressValueOutOfProgressTargetWithUnitStr(medalData.t, medalData.u, medalData.v));
            } else if (medalProgress == 1 && i == 3) {
                spannableString2 = new SpannableString(getProgressValueOutOfProgressTargetWithUnitStr(medalData.t, medalData.f16490b != 5 ? medalData.u : 6, medalData.v));
            } else if (medalProgress == 2 && i == 4) {
                if (Intrinsics.areEqual(medalData.m, "pace")) {
                    String strConvertSecondsToMinutesStr2 = MedalManagerExtKt.getInstance(MedalManager.INSTANCE).convertSecondsToMinutesStr(medalData.t);
                    orangeSpannableStr = companion.getOrangeSpannableStr(strConvertSecondsToMinutesStr2, ResourceExtKt.getString(j0j.o, strConvertSecondsToMinutesStr2));
                    spannableString2 = orangeSpannableStr;
                } else {
                    spannableString = new SpannableString(getProgressValueOutOfProgressTargetWithUnitStr(medalData.t, medalData.u, medalData.v));
                    spannableString2 = spannableString;
                }
            } else if (medalProgress == 2 && i == 2) {
                spannableString2 = new SpannableString(TimeDateUtil.getDateYYYYMMddLocalFormat(medalData.g));
            } else if (medalProgress != 2 || i != 3) {
                spannableString2 = (medalProgress == 2 && i == 1) ? new SpannableString(TimeDateUtil.getDateYYYYMMddLocalFormat(medalData.g)) : new SpannableString(ResourceExtKt.getString(j0j.s));
            } else if (medalData.t == 0) {
                String quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(txi.common_unit_time, medalData.w);
                Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                String str2 = medalData.w + quantityString;
                orangeSpannableStr = companion.getOrangeSpannableStr(str2, ResourceExtKt.getString(j0j.j, str2));
                spannableString2 = orangeSpannableStr;
            } else {
                spannableString = new SpannableString(getProgressValueOutOfProgressTargetWithUnitStr(medalData.t, medalData.f16490b != 5 ? medalData.u : 6, medalData.v));
                spannableString2 = spannableString;
            }
        }
        Logger.d(MedalHelper.TAG, "getMedalSubtitle subtitle=" + ((Object) spannableString2));
        return spannableString2;
    }

    @NotNull
    public final MedalV2Request getMedalV2Request() {
        MedalV2Request medalV2Request = this.medalV2Request;
        if (medalV2Request != null) {
            return medalV2Request;
        }
        Intrinsics.throwUninitializedPropertyAccessException("medalV2Request");
        return null;
    }

    @Override // com.xiaomi.fitness.medal.export.MedalManager
    @NotNull
    public String getShareMethodString(int shareMethod) {
        if (shareMethod == 0) {
            return "wechat";
        }
        if (shareMethod != 1) {
            return shareMethod != 2 ? "more" : "save_locally";
        }
        return "wechat_moments";
    }

    @Override // com.xiaomi.fitness.medal.export.MedalManager
    public void getWearMedal(@NotNull final Function2<? super Long, ? super String, Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        if (this.KEY_WEAR_MEDAL_URL.length() == 0 || this.KEY_WEAR_MEDAL_URL.length() == 0) {
            AccountRequest.getUserProfile$default(new AccountRequest(), null, new Function1() { // from class: rff
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MedalManagerImpl.getWearMedal$lambda$8(this.f32492a, fail, success, (UserInfoProfile) obj);
                }
            }, new Function1() { // from class: sff
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MedalManagerImpl.getWearMedal$lambda$9(fail, (ApiException) obj);
                }
            }, 1, null);
        } else if (!Intrinsics.areEqual(this.KEY_WEAR_MEDAL, "-1")) {
            success.invoke(Long.valueOf(Long.parseLong(this.KEY_WEAR_MEDAL)), this.KEY_WEAR_MEDAL_URL);
        } else {
            this.KEY_WEAR_MEDAL_URL = "";
            fail.invoke2("");
        }
    }

    @Override // com.xiaomi.fitness.medal.export.MedalManager
    public void getWearMedalDetail(@NotNull final Function3<? super Long, ? super String, ? super Integer, Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        if (this.KEY_WEAR_MEDAL.length() == 0 || Intrinsics.areEqual(this.KEY_WEAR_MEDAL, "-1")) {
            fail.invoke2("");
        } else {
            getMedalV2Request().getAllMedals(new Function1() { // from class: xff
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MedalManagerImpl.getWearMedalDetail$lambda$12(this.f39068a, success, (ecf) obj);
                }
            }, new Function1() { // from class: zff
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MedalManagerImpl.getWearMedalDetail$lambda$13(fail, (ApiException) obj);
                }
            });
        }
    }

    @Override // com.xiaomi.fitness.medal.export.MedalManager
    public void goToMedalDetailActivity(@NotNull Activity activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Logger.d(TAG, "goToMedalDetailActivity running...");
        Intent intent = new Intent();
        intent.setClass(activity, MedalDetailActivity.class);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        activity.startActivity(intent);
    }

    @Override // com.xiaomi.fitness.medal.export.MedalManager
    public void goToMedalListActivity(@NotNull Activity activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = new Intent();
        intent.setClass(activity, MedalListActivity.class);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        activity.startActivity(intent);
    }

    @Override // com.xiaomi.fitness.medal.export.MedalManager
    public void requestAllTypeMedalPopupList(@NotNull Function1<? super List<PopMedalData>, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        getMedalHelper().requestAllTypeMedalPopupList(onSuccess);
    }

    @Override // com.xiaomi.fitness.medal.export.MedalManager
    public void requestMedalList(@NotNull FragmentActivity activity, int type) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        getMedalHelper().requestMedalList(activity, type);
    }

    public final void setMedalHelper(@NotNull MedalHelper medalHelper) {
        Intrinsics.checkNotNullParameter(medalHelper, "<set-?>");
        this.medalHelper = medalHelper;
    }

    public final void setMedalRequest(@NotNull MedalRequest medalRequest) {
        Intrinsics.checkNotNullParameter(medalRequest, "<set-?>");
        this.medalRequest = medalRequest;
    }

    public final void setMedalV2Request(@NotNull MedalV2Request medalV2Request) {
        Intrinsics.checkNotNullParameter(medalV2Request, "<set-?>");
        this.medalV2Request = medalV2Request;
    }

    @Override // com.xiaomi.fitness.medal.export.MedalManager
    public void showLatestMedalPopDialog(@NotNull FragmentActivity activity, @NotNull PopMedalData latestMedal, @NotNull Function0<Unit> closeDialogCallback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(latestMedal, "latestMedal");
        Intrinsics.checkNotNullParameter(closeDialogCallback, "closeDialogCallback");
        getMedalHelper().showLatestMedalDialog(activity, latestMedal, closeDialogCallback);
    }

    @Override // com.xiaomi.fitness.medal.export.MedalManager
    public void showSleepInterfereMedal(@NotNull FragmentActivity activity, @NotNull String title, @NotNull String subTitle, @NotNull String btnStr, @NotNull Function0<Unit> clickCallback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        Intrinsics.checkNotNullParameter(btnStr, "btnStr");
        Intrinsics.checkNotNullParameter(clickCallback, "clickCallback");
        getMedalHelper().showSleepInterfereMedal(activity, title, subTitle, btnStr, clickCallback);
    }

    @Override // com.xiaomi.fitness.medal.export.MedalManager
    public void showTrainingFinishPop(@NotNull FragmentActivity activity, @NotNull String tip, @Nullable Function0<Unit> dismissCallback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(tip, "tip");
        getMedalHelper().showTrainingFinishPopDialog(activity, tip, dismissCallback);
    }

    @Override // com.xiaomi.fitness.medal.export.MedalManager
    public void showTrainingPopMedal(@NotNull FragmentActivity activity, int iconRes, @NotNull String tip, @Nullable Function0<Unit> dismissCallback, @NotNull String userTip) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(tip, "tip");
        Intrinsics.checkNotNullParameter(userTip, "userTip");
        getMedalHelper().showTrainingPopMedal(activity, iconRes, tip, dismissCallback, userTip);
    }

    @Override // com.xiaomi.fitness.medal.export.MedalManager
    public void unWearMedal(final long id, @NotNull final String medalType, @NotNull Function2<? super Long, ? super String, Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(medalType, "medalType");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        AccountRequest.getUserProfile$default(new AccountRequest(), null, new Function1() { // from class: fgf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalManagerImpl.unWearMedal$lambda$20(id, medalType, this, fail, (UserInfoProfile) obj);
            }
        }, new Function1() { // from class: ggf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalManagerImpl.unWearMedal$lambda$21(fail, (ApiException) obj);
            }
        }, 1, null);
    }

    @Override // com.xiaomi.fitness.medal.export.MedalManager
    public void wearMedal(final long id, @NotNull final String icon, @NotNull final String medalType, @NotNull final Function2<? super Long, ? super String, Unit> success, @NotNull final Function1<? super String, Unit> fail) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(medalType, "medalType");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        AccountRequest.getUserProfile$default(new AccountRequest(), null, new Function1() { // from class: mgf
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalManagerImpl.wearMedal$lambda$16(id, medalType, this, icon, success, fail, (UserInfoProfile) obj);
            }
        }, new Function1() { // from class: off
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MedalManagerImpl.wearMedal$lambda$17(fail, (ApiException) obj);
            }
        }, 1, null);
    }
}
