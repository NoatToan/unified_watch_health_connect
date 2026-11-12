package com.xiaomi.hm.health.model.account;

import com.huami.account.api.HMAccountWebAPI;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0007J\u001a\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/model/account/UserInfoMapper;", "", "", "", HMAccountWebAPI.PARAM_DEFAULT_FIELDS, "encodeDefaultField", "decodeDefaultField", "<init>", "()V", "personinfo_release"}, k = 1, mv = {1, 5, 1})
public final class UserInfoMapper {

    @NotNull
    public static final UserInfoMapper INSTANCE = new UserInfoMapper();

    private UserInfoMapper() {
    }

    @JvmStatic
    @Nullable
    public static final List<String> decodeDefaultField(@Nullable String defaultFields) {
        Object objM3845constructorimpl;
        if (defaultFields == null || defaultFields.length() == 0) {
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(CollectionsKt___CollectionsKt.toList(StringsKt__StringsKt.split$default((CharSequence) defaultFields, new String[]{","}, false, 0, 6, (Object) null)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        return (List) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
    }

    @JvmStatic
    @Nullable
    public static final String encodeDefaultField(@Nullable List<String> defaultFields) {
        if (defaultFields == null) {
            return null;
        }
        return CollectionsKt___CollectionsKt.joinToString$default(defaultFields, ",", null, null, 0, null, null, 62, null);
    }
}
