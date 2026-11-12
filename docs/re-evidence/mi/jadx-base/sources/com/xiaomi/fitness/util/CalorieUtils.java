package com.xiaomi.fitness.util;

import android.net.Uri;
import androidx.core.content.FileProvider;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.service.RectifiedUriFileProviderKt;
import defpackage.c0j;
import defpackage.im9;
import defpackage.pni;
import defpackage.qxi;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\u000e\u001a\u00020\u0005J\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\r2\u0006\u0010\u000e\u001a\u00020\u0005J\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\u000e\u001a\u00020\u0005J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0005H\u0002J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0002J\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0005H\u0002J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0005H\u0002J\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0005H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0005H\u0002J\u0016\u0010\u001f\u001a\u00020 2\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\"R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/util/CalorieUtils;", "", "<init>", "()V", "sTypeBiscuit", "", "sTypeIce", "sTypeChicken", "URL_SHARE_BG_ICE_CREAM", "", "URL_SHARE_BG_CHICKEN_LEG", "URL_SHARE_BG_BISCUIT", "getNumAndSmallImageRes", "Lkotlin/Pair;", "calo", "getShareCaloConsum", "calo2things", "getFoodShareBgSrcUrl", "type", "getThingsDrawableRes", "checkFoodShareBgResourcesExist", "", "checkFileExist", "foodType", "getResultPath", "getLocalBgUri", "getUriFromFile", "Landroid/net/Uri;", "file", "Ljava/io/File;", "getDesFile", "downloadShareFoodBg", "", "downloadCompleteLiveData", "Landroidx/lifecycle/MutableLiveData;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCalorieUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalorieUtils.kt\ncom/xiaomi/fitness/util/CalorieUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,176:1\n1863#2,2:177\n*S KotlinDebug\n*F\n+ 1 CalorieUtils.kt\ncom/xiaomi/fitness/util/CalorieUtils\n*L\n110#1:177,2\n*E\n"})
public final class CalorieUtils {

    @NotNull
    public static final CalorieUtils INSTANCE = new CalorieUtils();

    @NotNull
    public static final String URL_SHARE_BG_BISCUIT = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/calorie/food/calorie_food_share_bg_biscuit.png?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=eU4hhXdGLR6W77wVgQy3KK9gKLc=";

    @NotNull
    public static final String URL_SHARE_BG_CHICKEN_LEG = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/calorie/food/calorie_food_share_bg_chicken_leg.png?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=/c2xDhFHXe2xSbiEGU8fCXWy2SQ=";

    @NotNull
    public static final String URL_SHARE_BG_ICE_CREAM = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/calorie/food/calorie_food_share_bg_ice_cream.png?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=14ncYsE42lWmkSMgtNOncaWxKJU=";
    public static final int sTypeBiscuit = 0;
    public static final int sTypeChicken = 2;
    public static final int sTypeIce = 1;

    /* JADX INFO: renamed from: com.xiaomi.fitness.util.CalorieUtils$downloadShareFoodBg$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.util.CalorieUtils$downloadShareFoodBg$1", f = "CalorieUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nCalorieUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalorieUtils.kt\ncom/xiaomi/fitness/util/CalorieUtils$downloadShareFoodBg$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,176:1\n1863#2,2:177\n*S KotlinDebug\n*F\n+ 1 CalorieUtils.kt\ncom/xiaomi/fitness/util/CalorieUtils$downloadShareFoodBg$1\n*L\n157#1:177,2\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableLiveData<Boolean> $downloadCompleteLiveData;
        final /* synthetic */ List<Integer> $foodTypeList;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<Integer> list, MutableLiveData<Boolean> mutableLiveData, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$foodTypeList = list;
            this.$downloadCompleteLiveData = mutableLiveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$foodTypeList, this.$downloadCompleteLiveData, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                Iterator<T> it = this.$foodTypeList.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    CalorieUtils calorieUtils = CalorieUtils.INSTANCE;
                    File desFile = calorieUtils.getDesFile(iIntValue);
                    if (!desFile.exists()) {
                        InputStream inputStreamOpenStream = new URL(calorieUtils.getFoodShareBgSrcUrl(iIntValue)).openStream();
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(desFile);
                            try {
                                Intrinsics.checkNotNull(inputStreamOpenStream);
                                ByteStreamsKt.copyTo$default(inputStreamOpenStream, fileOutputStream, 0, 2, null);
                                Unit unit = Unit.INSTANCE;
                                CloseableKt.closeFinally(fileOutputStream, null);
                                CloseableKt.closeFinally(inputStreamOpenStream, null);
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    CloseableKt.closeFinally(fileOutputStream, th);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                CloseableKt.closeFinally(inputStreamOpenStream, th3);
                                throw th4;
                            }
                        }
                    }
                }
                this.$downloadCompleteLiveData.postValue(Boxing.boxBoolean(true));
                Logger.d("downloadShareByByFoodType success", new Object[0]);
            } catch (Exception e) {
                Logger.e("downloadShareByByFoodType e=" + e, new Object[0]);
                this.$downloadCompleteLiveData.postValue(null);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private CalorieUtils() {
    }

    private final boolean checkFileExist(int foodType) {
        return new File(getResultPath(foodType)).exists();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getDesFile(int foodType) {
        String resultPath = getResultPath(foodType);
        File file = new File(resultPath);
        if (file.exists()) {
            file.delete();
        }
        return new File(resultPath);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getFoodShareBgSrcUrl(int type) {
        if (type == 0) {
            return URL_SHARE_BG_BISCUIT;
        }
        if (type != 1) {
            return type != 2 ? URL_SHARE_BG_BISCUIT : URL_SHARE_BG_CHICKEN_LEG;
        }
        return URL_SHARE_BG_ICE_CREAM;
    }

    private final String getLocalBgUri(int foodType) {
        String string = getUriFromFile(new File(getResultPath(foodType))).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private final String getResultPath(int foodType) {
        File externalFilesDir = ApplicationExtKt.getApplication().getExternalFilesDir(RectifiedUriFileProviderKt.NAME_DOWNLOAD);
        return (externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null) + File.separator + "calorie_food_" + foodType + ".png";
    }

    private final int getThingsDrawableRes(int type) {
        if (type != 1) {
            return type != 2 ? pni.k0 : pni.l0;
        }
        return pni.m0;
    }

    private final Uri getUriFromFile(File file) {
        Uri uriForFile = FileProvider.getUriForFile(ApplicationExtKt.getApplication(), im9.B(), file);
        Intrinsics.checkNotNull(uriForFile);
        return uriForFile;
    }

    @NotNull
    public final Pair<Integer, Integer> calo2things(int calo) {
        if (calo >= 0 && calo < 32) {
            return new Pair<>(0, 0);
        }
        if (32 > calo || calo >= 192) {
            return (192 > calo || calo >= 400) ? new Pair<>(Integer.valueOf(calo / 300), 2) : new Pair<>(Integer.valueOf(calo / 64), 1);
        }
        return new Pair<>(Integer.valueOf(calo / 32), 0);
    }

    public final boolean checkFoodShareBgResourcesExist() {
        Iterator it = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{0, 2, 1}).iterator();
        while (true) {
            boolean z = true;
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (!z || !INSTANCE.checkFileExist(iIntValue)) {
                    z = false;
                }
            }
            return z;
        }
    }

    public final void downloadShareFoodBg(@NotNull MutableLiveData<Boolean> downloadCompleteLiveData) {
        Intrinsics.checkNotNullParameter(downloadCompleteLiveData, "downloadCompleteLiveData");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new AnonymousClass1(CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{0, 2, 1}), downloadCompleteLiveData, null), 3, null);
    }

    @NotNull
    public final Pair<String, Integer> getNumAndSmallImageRes(int calo) {
        Pair<Integer, Integer> pairCalo2things = calo2things(calo);
        return new Pair<>("x" + pairCalo2things.component1().intValue(), Integer.valueOf(getThingsDrawableRes(pairCalo2things.component2().intValue())));
    }

    @NotNull
    public final Pair<String, String> getShareCaloConsum(int calo) {
        Pair<Integer, Integer> pairCalo2things = calo2things(calo);
        int iIntValue = pairCalo2things.component1().intValue();
        int iIntValue2 = pairCalo2things.component2().intValue();
        if (iIntValue2 != 0) {
            return iIntValue2 != 1 ? new Pair<>(ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), qxi.l, iIntValue, Integer.valueOf(iIntValue)), getLocalBgUri(iIntValue2)) : new Pair<>(ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), qxi.m, iIntValue, Integer.valueOf(iIntValue)), getLocalBgUri(iIntValue2));
        }
        return iIntValue == 0 ? new Pair<>(ApplicationExtKt.getApplication().getString(c0j.y4), getLocalBgUri(iIntValue2)) : new Pair<>(ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), qxi.f31940k, iIntValue, Integer.valueOf(iIntValue)), getLocalBgUri(iIntValue2));
    }
}
