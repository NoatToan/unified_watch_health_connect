package com.huami.health.afppg.utils;

import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0006\"\u001d\u0010\f\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "Ljava/lang/Class;", "clazz", "jsonConvert", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "", "toJson", "Lcom/google/gson/Gson;", "a", "Lkotlin/Lazy;", "()Lcom/google/gson/Gson;", "gson", "afppg-core_release"}, k = 2, mv = {1, 5, 1})
public final class GsonConvertorKt {

    @NotNull
    private static final Lazy a = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/google/gson/Gson;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Gson> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Gson invoke() {
            return new Gson();
        }
    }

    private static final Gson a() {
        return (Gson) a.getValue();
    }

    @Nullable
    public static final <T> T jsonConvert(@NotNull String str, @NotNull Class<T> cls) {
        T t;
        try {
            Result.Companion companion = Result.Companion;
            t = (T) Result.m3845constructorimpl(a().fromJson(str, (Class) cls));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            t = (T) Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3850isFailureimpl(t)) {
            return null;
        }
        return t;
    }

    @NotNull
    public static final String toJson(@NotNull Object obj) {
        return a().toJson(obj);
    }
}
