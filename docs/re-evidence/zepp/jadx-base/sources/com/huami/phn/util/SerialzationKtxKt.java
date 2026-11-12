package com.huami.phn.util;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u000b\"\u0016\u0010\u0003\u001a\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0016\u0010\u0005\u001a\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u0017\u0010\b\u001a\u00020\u0000*\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0017\u0010\n\u001a\u00020\u0000*\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\u000b"}, d2 = {"Lkotlinx/serialization/json/Json;", "a", "Lkotlinx/serialization/json/Json;", "noStrictJsonObject", "b", "enableEncodeDefaultsObject", "getNonStrictInstance", "(Lkotlinx/serialization/json/Json;)Lkotlinx/serialization/json/Json;", "nonStrictInstance", "getEnableEncodeDefaults", "enableEncodeDefaults", "phn_coach_release"}, k = 2, mv = {1, 5, 1})
public final class SerialzationKtxKt {

    @NotNull
    private static final Json a = JsonKt.Json$default(null, b.a, 1, null);

    @NotNull
    private static final Json b = JsonKt.Json$default(null, a.a, 1, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lkotlinx/serialization/json/JsonBuilder;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<JsonBuilder, Unit> {
        public static final a a = new a();

        public a() {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lkotlinx/serialization/json/JsonBuilder;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<JsonBuilder, Unit> {
        public static final b a = new b();

        public b() {
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

    @NotNull
    public static final Json getEnableEncodeDefaults(@NotNull Json json) {
        return b;
    }

    @NotNull
    public static final Json getNonStrictInstance(@NotNull Json json) {
        return a;
    }
}
