package com.xiaomi.fitness.userinfo.preference;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import com.xiaomi.fitness.cache.sp.TypeToken;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u001c\u001a\u00020\u000eJ\u000e\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u000eJ\u0006\u0010\u001f\u001a\u00020\u000bJ\u000e\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\u000bJ\u001a\u0010\"\u001a\u00020\f2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nJ\u001a\u0010$\u001a\u00020\f2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R+\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/userinfo/preference/GuidePreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "guidefinishListener", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lkotlin/Function1;", "", "", "<set-?>", "", "GUIDE_PAGE_INDEX", "getGUIDE_PAGE_INDEX", "()I", "setGUIDE_PAGE_INDEX", "(I)V", "GUIDE_PAGE_INDEX$delegate", "Lkotlin/properties/ReadWriteProperty;", "SHOW_GUIDE_PAGE_FINISH", "getSHOW_GUIDE_PAGE_FINISH", "()Z", "setSHOW_GUIDE_PAGE_FINISH", "(Z)V", "SHOW_GUIDE_PAGE_FINISH$delegate", "getPageIndex", "setPageIndex", "index", "getShowGuidePageFinish", "setShowGuidePageFinish", "finished", "addGuideFinishListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeGuideFinishListener", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGuidePreference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuidePreference.kt\ncom/xiaomi/fitness/userinfo/preference/GuidePreference\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 PreferenceSupport.kt\ncom/xiaomi/fitness/cache/sp/PreferenceSupport\n*L\n1#1,43:1\n1863#2,2:44\n135#3,6:46\n135#3,6:52\n*S KotlinDebug\n*F\n+ 1 GuidePreference.kt\ncom/xiaomi/fitness/userinfo/preference/GuidePreference\n*L\n31#1:44,2\n13#1:46,6\n15#1:52,6\n*E\n"})
public final class GuidePreference extends PreferenceSupport {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(GuidePreference.class, "GUIDE_PAGE_INDEX", "getGUIDE_PAGE_INDEX()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(GuidePreference.class, "SHOW_GUIDE_PAGE_FINISH", "getSHOW_GUIDE_PAGE_FINISH()Z", 0))};

    /* JADX INFO: renamed from: GUIDE_PAGE_INDEX$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty GUIDE_PAGE_INDEX;

    @NotNull
    public static final GuidePreference INSTANCE;

    /* JADX INFO: renamed from: SHOW_GUIDE_PAGE_FINISH$delegate, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty SHOW_GUIDE_PAGE_FINISH;

    @NotNull
    private static final CopyOnWriteArraySet<Function1<Boolean, Unit>> guidefinishListener;

    static {
        GuidePreference guidePreference = new GuidePreference();
        INSTANCE = guidePreference;
        guidefinishListener = new CopyOnWriteArraySet<>();
        GUIDE_PAGE_INDEX = guidePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Integer.class), new TypeToken<Integer>() { // from class: com.xiaomi.fitness.userinfo.preference.GuidePreference$special$$inlined$bindToPreferenceField$default$1
        }.getType(), -1, null, true);
        SHOW_GUIDE_PAGE_FINISH = guidePreference.bindToPreferenceField(Reflection.getOrCreateKotlinClass(Boolean.class), new TypeToken<Boolean>() { // from class: com.xiaomi.fitness.userinfo.preference.GuidePreference$special$$inlined$bindToPreferenceField$default$2
        }.getType(), Boolean.FALSE, null, true);
    }

    private GuidePreference() {
    }

    private final int getGUIDE_PAGE_INDEX() {
        return ((Number) GUIDE_PAGE_INDEX.getValue(this, $$delegatedProperties[0])).intValue();
    }

    private final boolean getSHOW_GUIDE_PAGE_FINISH() {
        return ((Boolean) SHOW_GUIDE_PAGE_FINISH.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    private final void setGUIDE_PAGE_INDEX(int i) {
        GUIDE_PAGE_INDEX.setValue(this, $$delegatedProperties[0], Integer.valueOf(i));
    }

    private final void setSHOW_GUIDE_PAGE_FINISH(boolean z) {
        SHOW_GUIDE_PAGE_FINISH.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    public final void addGuideFinishListener(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        CopyOnWriteArraySet<Function1<Boolean, Unit>> copyOnWriteArraySet = guidefinishListener;
        if (copyOnWriteArraySet.contains(listener)) {
            return;
        }
        copyOnWriteArraySet.add(listener);
    }

    public final int getPageIndex() {
        return getGUIDE_PAGE_INDEX();
    }

    public final boolean getShowGuidePageFinish() {
        return getSHOW_GUIDE_PAGE_FINISH();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "app_pref_start";
    }

    public final void removeGuideFinishListener(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        guidefinishListener.remove(listener);
    }

    public final void setPageIndex(int index) {
        setGUIDE_PAGE_INDEX(index);
    }

    public final void setShowGuidePageFinish(boolean finished) {
        setSHOW_GUIDE_PAGE_FINISH(finished);
        Iterator<T> it = guidefinishListener.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke2(Boolean.valueOf(finished));
        }
    }
}
