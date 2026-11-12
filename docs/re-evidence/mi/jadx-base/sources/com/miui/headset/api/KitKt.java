package com.miui.headset.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\u001a\"\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u0086\bø\u0001\u0000\u001a\"\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u0086\bø\u0001\u0000\u001a\"\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u0086\bø\u0001\u0000\u001a\"\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u0010H\u0086\bø\u0001\u0000\u001a)\u0010\u0016\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n*\u0002H\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0017\u001a\u001e\u0010\u0016\u001a\u00020\u0001*\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u0086\bø\u0001\u0000\u001a7\u0010\u0018\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n*\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00010\u001bH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a0\u0010\u0018\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u001d2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00010\u001bH\u0086\bø\u0001\u0000\u001a)\u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\n*\u0002H\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u001e\u001a)\u0010\u0011\u001a\u00020\r\"\u0004\b\u0000\u0010\n*\u0002H\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u001e\u001a)\u0010\u0012\u001a\u00020\r\"\u0004\b\u0000\u0010\n*\u0002H\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u001e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0012\u0010\u0002\u001a\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0016\u0010\u0005\u001a\u00020\u0001*\u00020\u00068Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u001c\u0010\t\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n*\u0002H\n8Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000b\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, d2 = {"LOG_TAG", "", "currentThreadName", "getCurrentThreadName", "()Ljava/lang/String;", "simpleClassName", "", "getSimpleClassName", "(Ljava/lang/Object;)Ljava/lang/String;", "simpleHashCode", "T", "getSimpleHashCode", "mlog", "", "tag", "message", "Lkotlin/Function0;", "mloge", "mlogw", "runSafeCatching", "exceptionTag", "block", "formatLogMessage", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/String;", "mapToContentToString", "", "map", "Lkotlin/Function1;", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)V", "api_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Kit.kt\ncom/miui/headset/api/KitKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,223:1\n27#1:237\n24#1:238\n27#1:239\n30#1:240\n27#1:241\n24#1:242\n30#1:243\n27#1:244\n24#1:245\n30#1:246\n27#1:247\n24#1:248\n33#1:249\n27#1:250\n33#1:251\n27#1:252\n33#1:253\n27#1:254\n57#1:255\n33#1:256\n27#1:257\n58#1:258\n1#2:224\n11335#3:225\n11670#3,3:226\n37#4,2:229\n37#4,2:235\n1549#5:231\n1620#5,3:232\n*S KotlinDebug\n*F\n+ 1 Kit.kt\ncom/miui/headset/api/KitKt\n*L\n30#1:237\n30#1:238\n33#1:239\n37#1:240\n37#1:241\n37#1:242\n41#1:243\n41#1:244\n41#1:245\n45#1:246\n45#1:247\n45#1:248\n49#1:249\n49#1:250\n53#1:251\n53#1:252\n57#1:253\n57#1:254\n65#1:255\n65#1:256\n65#1:257\n65#1:258\n18#1:225\n18#1:226,3\n18#1:229,2\n21#1:235,2\n21#1:231\n21#1:232,3\n*E\n"})
public final class KitKt {

    @NotNull
    public static final String LOG_TAG = "HS:";

    @NotNull
    public static final <T> String formatLogMessage(T t, @NotNull Function0<? extends Object> message) {
        String simpleName;
        Intrinsics.checkNotNullParameter(message, "message");
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
        if (t != null) {
            simpleName = t.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "this::class.java.simpleName");
        } else {
            simpleName = null;
        }
        sb.append(simpleName);
        sb.append(' ');
        sb.append(message.invoke());
        return sb.toString();
    }

    @NotNull
    public static final String getCurrentThreadName() {
        return AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST;
    }

    @NotNull
    public static final String getSimpleClassName(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        String simpleName = obj.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "this::class.java.simpleName");
        return simpleName;
    }

    @NotNull
    public static final <T> String getSimpleHashCode(T t) {
        String hexString = Integer.toHexString(t != null ? t.hashCode() : 0);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(\n        thi…{ this xor this shr 16 })");
        return hexString;
    }

    @NotNull
    public static final <T> String mapToContentToString(@NotNull Collection<? extends T> collection, @NotNull Function1<? super T, String> map) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        Collection<? extends T> collection2 = collection;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(map.invoke2(it.next()));
        }
        String string = Arrays.toString(arrayList.toArray(new String[0]));
        Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
        return string;
    }

    public static final <T> void mlog(T t, @NotNull Function0<? extends Object> message) {
        String simpleName;
        Intrinsics.checkNotNullParameter(message, "message");
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
        if (t != null) {
            simpleName = t.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "this::class.java.simpleName");
        } else {
            simpleName = null;
        }
        sb.append(simpleName);
        sb.append(' ');
        sb.append(message.invoke());
    }

    public static final <T> void mloge(T t, @NotNull Function0<? extends Object> message) {
        String simpleName;
        Intrinsics.checkNotNullParameter(message, "message");
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
        if (t != null) {
            simpleName = t.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "this::class.java.simpleName");
        } else {
            simpleName = null;
        }
        sb.append(simpleName);
        sb.append(' ');
        sb.append(message.invoke());
    }

    public static final <T> void mlogw(T t, @NotNull Function0<? extends Object> message) {
        String simpleName;
        Intrinsics.checkNotNullParameter(message, "message");
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
        if (t != null) {
            simpleName = t.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "this::class.java.simpleName");
        } else {
            simpleName = null;
        }
        sb.append(simpleName);
        sb.append(' ');
        sb.append(message.invoke());
    }

    public static final void runSafeCatching(@NotNull String exceptionTag, @NotNull Function0<Unit> block) {
        Object objM886constructorimpl;
        Intrinsics.checkNotNullParameter(exceptionTag, "exceptionTag");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            Result.Companion companion = Result.Companion;
            block.invoke();
            objM886constructorimpl = Result.m886constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
        if (thM889exceptionOrNullimpl != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
            sb.append(exceptionTag);
            sb.append(' ');
            sb.append((Object) thM889exceptionOrNullimpl.toString());
            thM889exceptionOrNullimpl.printStackTrace();
        }
    }

    @NotNull
    public static final String formatLogMessage(@NotNull String str, @NotNull Function0<? extends Object> message) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
        sb.append(str);
        sb.append(' ');
        sb.append(message.invoke());
        return sb.toString();
    }

    public static final void mlog(@NotNull String tag, @NotNull Function0<? extends Object> message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
        sb.append(tag);
        sb.append(' ');
        sb.append(message.invoke());
    }

    public static final void mloge(@NotNull String tag, @NotNull Function0<? extends Object> message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
        sb.append(tag);
        sb.append(' ');
        sb.append(message.invoke());
    }

    public static final void mlogw(@NotNull String tag, @NotNull Function0<? extends Object> message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_LIST + Thread.currentThread().getName() + AbstractJsonLexerKt.END_LIST);
        sb.append(tag);
        sb.append(' ');
        sb.append(message.invoke());
    }

    @NotNull
    public static final <T> String mapToContentToString(@NotNull T[] tArr, @NotNull Function1<? super T, String> map) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t : tArr) {
            arrayList.add(map.invoke2(t));
        }
        String string = Arrays.toString(arrayList.toArray(new String[0]));
        Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
        return string;
    }
}
