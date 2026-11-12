package com.xiaomi.fitness.watch.face.helper;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\tJ\u0006\u0010\u0018\u001a\u00020\tJ\u000e\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\tJ\u0006\u0010\u001e\u001a\u00020\tJ\u000e\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u0005J\u000e\u0010!\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u0005J\u0016\u0010#\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\tJ\u000e\u0010$\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0005R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR+\u0010\u0019\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000eR+\u0010%\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010\u0010\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/watch/face/helper/FacePreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "<set-?>", "", "KEY_ABTEST_PURCHASE_BUTTON", "getKEY_ABTEST_PURCHASE_BUTTON", "()Z", "setKEY_ABTEST_PURCHASE_BUTTON", "(Z)V", "KEY_ABTEST_PURCHASE_BUTTON$delegate", "Lkotlin/properties/ReadWriteProperty;", "FACE_USER_IN_WHITE_LIST", "getFACE_USER_IN_WHITE_LIST", "setFACE_USER_IN_WHITE_LIST", "FACE_USER_IN_WHITE_LIST$delegate", "updatePurchaseButton", "", "show", "showPurchaseButtonTest", "KEY_ABTEST_BULLET_SCREEN", "getKEY_ABTEST_BULLET_SCREEN", "setKEY_ABTEST_BULLET_SCREEN", "KEY_ABTEST_BULLET_SCREEN$delegate", "updateBulletScreen", "showBulletScreen", "setEnterFaceMarketTime", "did", "getEnterFaceMarketTime", "", "setFaceEntranceRedPoint", "getFaceEntranceRedPoint", "FACE_SEARCH_HISTORY", "getFACE_SEARCH_HISTORY", "setFACE_SEARCH_HISTORY", "(Ljava/lang/String;)V", "FACE_SEARCH_HISTORY$delegate", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFacePreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacePreference.kt\ncom/xiaomi/fitness/watch/face/helper/FacePreference\n+ 2 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,51:1\n135#2,6:52\n135#2,6:58\n135#2,6:64\n135#2,6:70\n*S KotlinDebug\n*F\n+ 1 FacePreference.kt\ncom/xiaomi/fitness/watch/face/helper/FacePreference\n*L\n10#1:52,6\n11#1:58,6\n21#1:64,6\n49#1:70,6\n*E\n"})
public final class FacePreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(FacePreference.class, "KEY_ABTEST_PURCHASE_BUTTON", "getKEY_ABTEST_PURCHASE_BUTTON()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FacePreference.class, "FACE_USER_IN_WHITE_LIST", "getFACE_USER_IN_WHITE_LIST()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FacePreference.class, "KEY_ABTEST_BULLET_SCREEN", "getKEY_ABTEST_BULLET_SCREEN()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(FacePreference.class, "FACE_SEARCH_HISTORY", "getFACE_SEARCH_HISTORY()Ljava/lang/String;", 0))};

    /* JADX INFO: renamed from: FACE_SEARCH_HISTORY$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty FACE_SEARCH_HISTORY;

    /* JADX INFO: renamed from: FACE_USER_IN_WHITE_LIST$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty FACE_USER_IN_WHITE_LIST;

    @NotNull
    public static final FacePreference INSTANCE;

    /* JADX INFO: renamed from: KEY_ABTEST_BULLET_SCREEN$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_ABTEST_BULLET_SCREEN;

    /* JADX INFO: renamed from: KEY_ABTEST_PURCHASE_BUTTON$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty KEY_ABTEST_PURCHASE_BUTTON;

    static {
        FacePreference facePreference = new FacePreference();
        INSTANCE = facePreference;
        Boolean bool = Boolean.FALSE;
        KEY_ABTEST_PURCHASE_BUTTON = facePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.watch.face.helper.FacePreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), bool, null, true);
        FACE_USER_IN_WHITE_LIST = facePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.watch.face.helper.FacePreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), bool, null, true);
        KEY_ABTEST_BULLET_SCREEN = facePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.watch.face.helper.FacePreference$special$$inlined$bindToPreferenceField$default$3
        }.getType(), bool, null, true);
        FACE_SEARCH_HISTORY = facePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(String.class), new TypeToken<String>() { // from class: com.xiaomi.fitness.watch.face.helper.FacePreference$special$$inlined$bindToPreferenceField$default$4
        }.getType(), "", null, true);
    }

    private FacePreference() {
    }

    private final boolean getKEY_ABTEST_BULLET_SCREEN() {
        return ((Boolean) KEY_ABTEST_BULLET_SCREEN.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    private final boolean getKEY_ABTEST_PURCHASE_BUTTON() {
        return ((Boolean) KEY_ABTEST_PURCHASE_BUTTON.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    private final void setKEY_ABTEST_BULLET_SCREEN(boolean z) {
        KEY_ABTEST_BULLET_SCREEN.setValue(this, $$delegatedProperties[2], Boolean.valueOf(z));
    }

    private final void setKEY_ABTEST_PURCHASE_BUTTON(boolean z) {
        KEY_ABTEST_PURCHASE_BUTTON.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    public final long getEnterFaceMarketTime(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return ((Number) getValue("FACE_MARKET_ENTER_TIME_" + did, 0L)).longValue();
    }

    @NotNull
    public final String getFACE_SEARCH_HISTORY() {
        return (String) FACE_SEARCH_HISTORY.getValue(this, $$delegatedProperties[3]);
    }

    public final boolean getFACE_USER_IN_WHITE_LIST() {
        return ((Boolean) FACE_USER_IN_WHITE_LIST.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    public final boolean getFaceEntranceRedPoint(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return ((Boolean) getValue("FACE_MARKET_RED_POINT_" + did, Boolean.FALSE)).booleanValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "watch_face_main";
    }

    public final void setEnterFaceMarketTime(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        putValue("FACE_MARKET_ENTER_TIME_" + did, Long.valueOf(System.currentTimeMillis() / ((long) 1000)));
        setFaceEntranceRedPoint(did, false);
    }

    public final void setFACE_SEARCH_HISTORY(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        FACE_SEARCH_HISTORY.setValue(this, $$delegatedProperties[3], str);
    }

    public final void setFACE_USER_IN_WHITE_LIST(boolean z) {
        FACE_USER_IN_WHITE_LIST.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    public final void setFaceEntranceRedPoint(@NotNull String did, boolean show) {
        Intrinsics.checkNotNullParameter(did, "did");
        putValue("FACE_MARKET_RED_POINT_" + did, Boolean.valueOf(show));
    }

    public final boolean showBulletScreen() {
        return getKEY_ABTEST_BULLET_SCREEN();
    }

    public final boolean showPurchaseButtonTest() {
        return getKEY_ABTEST_PURCHASE_BUTTON();
    }

    public final void updateBulletScreen(boolean show) {
        setKEY_ABTEST_BULLET_SCREEN(show);
    }

    public final void updatePurchaseButton(boolean show) {
        setKEY_ABTEST_PURCHASE_BUTTON(show);
    }
}
