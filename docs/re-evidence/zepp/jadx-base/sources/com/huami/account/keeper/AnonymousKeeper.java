package com.huami.account.keeper;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.utils.persistence.kvkit.KvKit;
import com.huami.utils.persistence.kvkit.KvPersistence;
import com.xiaomi.hm.health.keeper.HMKeeperConstant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0002J\u0006\u0010\r\u001a\u00020\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\u001d\u0010\u001b\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/huami/account/keeper/AnonymousKeeper;", "", "", "uid", "", "setHashPromptBindPhone", "", "hasPromptBindPhone", "", "a", "setHasPromptCompleteUserInfo", AnonymousKeeper.KEY_HAS_PROMPT_COMPLETE_USER_INFO, "b", "getStartupAgreeTypes", "typesString", "setStartupAgreeTypes", "Ljava/lang/String;", "KEEPER_NAME", "STARTUP_AGREE_TYPES", "c", "KEY_HAS_PROMPT_BIND_PHONE_UID", GoogleApiAvailabilityLight.a, "KEY_HAS_PROMPT_COMPLETE_USER_INFO", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "e", "Lkotlin/Lazy;", "()Lcom/huami/utils/persistence/kvkit/KvPersistence;", HMKeeperConstant.KEEP_XML, "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class AnonymousKeeper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String KEEPER_NAME = "AnonymousKeeper";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String STARTUP_AGREE_TYPES = "startup_agree_types";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String KEY_HAS_PROMPT_BIND_PHONE_UID = "hasPromptBindPhoneUid";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String KEY_HAS_PROMPT_COMPLETE_USER_INFO = "hasPromptCompleteUserInfo";

    @NotNull
    public static final AnonymousKeeper INSTANCE = new AnonymousKeeper();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final Lazy keeper = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/utils/persistence/kvkit/KvPersistence;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<KvPersistence> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KvPersistence invoke() {
            return KvKit.getKvPersistence(AnonymousKeeper.KEEPER_NAME, true);
        }
    }

    private AnonymousKeeper() {
    }

    private final List<String> a() {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(CollectionsKt___CollectionsKt.toMutableList((Collection) StringsKt__StringsKt.split$default((CharSequence) c().getValue(KEY_HAS_PROMPT_BIND_PHONE_UID, ""), new String[]{","}, false, 0, 6, (Object) null)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        ArrayList arrayList = new ArrayList();
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = arrayList;
        }
        return (List) objM3845constructorimpl;
    }

    private final List<String> b() {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(CollectionsKt___CollectionsKt.toMutableList((Collection) StringsKt__StringsKt.split$default((CharSequence) c().getValue(KEY_HAS_PROMPT_COMPLETE_USER_INFO, ""), new String[]{","}, false, 0, 6, (Object) null)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        ArrayList arrayList = new ArrayList();
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = arrayList;
        }
        return (List) objM3845constructorimpl;
    }

    private final KvPersistence c() {
        return (KvPersistence) keeper.getValue();
    }

    @JvmStatic
    public static final boolean hasPromptBindPhone(@NotNull String uid) {
        return INSTANCE.a().contains(uid);
    }

    @JvmStatic
    public static final boolean hasPromptCompleteUserInfo(@NotNull String uid) {
        return INSTANCE.b().contains(uid);
    }

    @JvmStatic
    public static final void setHasPromptCompleteUserInfo(@NotNull String uid) {
        AnonymousKeeper anonymousKeeper = INSTANCE;
        List<String> listB = anonymousKeeper.b();
        if (!listB.contains(uid)) {
            listB.add(uid);
        }
        anonymousKeeper.c().setValue(KEY_HAS_PROMPT_COMPLETE_USER_INFO, CollectionsKt___CollectionsKt.joinToString$default(listB, ",", null, null, 0, null, null, 62, null));
    }

    @JvmStatic
    public static final void setHashPromptBindPhone(@NotNull String uid) {
        AnonymousKeeper anonymousKeeper = INSTANCE;
        List<String> listA = anonymousKeeper.a();
        if (!listA.contains(uid)) {
            listA.add(uid);
        }
        anonymousKeeper.c().setValue(KEY_HAS_PROMPT_BIND_PHONE_UID, CollectionsKt___CollectionsKt.joinToString$default(listA, ",", null, null, 0, null, null, 62, null));
    }

    @NotNull
    public final String getStartupAgreeTypes() {
        return (String) c().getValue(STARTUP_AGREE_TYPES, "");
    }

    public final void setStartupAgreeTypes(@Nullable String typesString) {
        c().setValue(STARTUP_AGREE_TYPES, typesString);
    }
}
