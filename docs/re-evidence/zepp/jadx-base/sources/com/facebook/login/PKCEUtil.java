package com.facebook.login;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.random.Random;
import kotlin.ranges.CharRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.e;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0002H\u0007¨\u0006\t"}, d2 = {"Lcom/facebook/login/PKCEUtil;", "", "", "codeVerifier", "", "isValidCodeVerifier", "generateCodeVerifier", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class PKCEUtil {

    @NotNull
    public static final PKCEUtil INSTANCE = new PKCEUtil();

    private PKCEUtil() {
    }

    @JvmStatic
    @NotNull
    public static final String generateCodeVerifier() {
        int iRandom = e.random(new IntRange(43, 128), Random.Default);
        List listPlus = CollectionsKt___CollectionsKt.plus((Collection<? extends char>) CollectionsKt___CollectionsKt.plus((Collection<? extends char>) CollectionsKt___CollectionsKt.plus((Collection<? extends char>) CollectionsKt___CollectionsKt.plus((Collection<? extends char>) CollectionsKt___CollectionsKt.plus((Collection) CollectionsKt___CollectionsKt.plus((Iterable) new CharRange('a', 'z'), (Iterable) new CharRange('A', 'Z')), (Iterable) new CharRange('0', '9')), '-'), '.'), '_'), '~');
        ArrayList arrayList = new ArrayList(iRandom);
        for (int i = 0; i < iRandom; i++) {
            arrayList.add(Character.valueOf(((Character) CollectionsKt.random(listPlus, Random.Default)).charValue()));
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
    }

    @JvmStatic
    public static final boolean isValidCodeVerifier(@Nullable String codeVerifier) {
        if ((codeVerifier == null || codeVerifier.length() == 0) || codeVerifier.length() < 43 || codeVerifier.length() > 128) {
            return false;
        }
        return new Regex("^[-._~A-Za-z0-9]+$").matches(codeVerifier);
    }
}
