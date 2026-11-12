package com.huami.femalehealth.logiclib.helper.ext;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u000f\"\u0016\u0010\u0003\u001a\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0016\u0010\u0005\u001a\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u0016\u0010\u0007\u001a\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0002\"\u0017\u0010\n\u001a\u00020\u0000*\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u0017\u0010\f\u001a\u00020\u0000*\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t\"\u0017\u0010\u000e\u001a\u00020\u0000*\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\r\u0010\t¨\u0006\u000f"}, d2 = {"Lkotlinx/serialization/json/Json;", "a", "Lkotlinx/serialization/json/Json;", "noStrictJsonObject", "b", "nonEncodeDefaultObject", "c", "trueEncodeDefaultObject", "getNonStrictInstance", "(Lkotlinx/serialization/json/Json;)Lkotlinx/serialization/json/Json;", "nonStrictInstance", "getTrueEncodeDefault", "trueEncodeDefault", "getNonEncodeDefault", "nonEncodeDefault", "logiclib_release"}, k = 2, mv = {1, 5, 1})
public final class SerializationKtxKt {

    @NotNull
    private static final Json a = JsonKt.Json$default(null, a.a, 1, null);

    @NotNull
    private static final Json b = JsonKt.Json$default(null, b.a, 1, null);

    @NotNull
    private static final Json c = JsonKt.Json$default(null, c.a, 1, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lkotlinx/serialization/json/JsonBuilder;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<JsonBuilder, Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final void a(@NotNull JsonBuilder jsonBuilder) {
            jsonBuilder.setLenient(true);
            jsonBuilder.setIgnoreUnknownKeys(true);
            jsonBuilder.setAllowSpecialFloatingPointValues(true);
            jsonBuilder.setUseArrayPolymorphism(true);
            jsonBuilder.setEncodeDefaults(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
            a(jsonBuilder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lkotlinx/serialization/json/JsonBuilder;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<JsonBuilder, Unit> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final void a(@NotNull JsonBuilder jsonBuilder) {
            jsonBuilder.setEncodeDefaults(false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
            a(jsonBuilder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lkotlinx/serialization/json/JsonBuilder;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<JsonBuilder, Unit> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        public final void a(@NotNull JsonBuilder jsonBuilder) {
            jsonBuilder.setEncodeDefaults(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
            a(jsonBuilder);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Json getNonEncodeDefault(@NotNull Json json) {
        return b;
    }

    @NotNull
    public static final Json getNonStrictInstance(@NotNull Json json) {
        return a;
    }

    @NotNull
    public static final Json getTrueEncodeDefault(@NotNull Json json) {
        return c;
    }
}
